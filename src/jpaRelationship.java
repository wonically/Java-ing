public class jpaRelationship {
    /*
@OneToOne
    Rule: @JoinColumn is used in the owned class (class with FK), owning class with PK doesn't need it.
    In fact in 1-1 relationship, the PK-FK position only matters in perspectives, not reflectively demonstrate any relational deduction.

    for example: class Person & class Address, with FK in Person

        in Person:
    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

        in Address:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy "address", cascade = CascadeType.All) -> cascade = simultaneously edit from both tables (syncing)
    private Person person;

@OneToMany
    Rule: @OneToMany is used in PK class, to make it bidirectional (access from N to 1), add an optional @ManyToOne in the owned class.
    Vice versa, when @ManyToOne is used, @OneToMany is optional.

    for example: class Person & class Address (one person has many addresses)

        in Person:
    @OneToMany(mappedBy "person")
    private Address address;

        in Address:
    @ManyToOne
    @JoinColumn(name = "address_id", referenceColumnName = "id") -> use if you want to set a name for the joined column
    private Person person;

@ManyToMany
- There are 2 cases:
If the joined table has no attribute -> use @ManyToMany.
If the joined table has attribute(s) -> create new @Embeddable composite key and 2 @ManyToOne relationship, or create a new normal Entity and assign 2 @OneToMany relationship.

1. @ManyToMany
    Rule: @ManyToMany is used in both classes, with no distinction in mappedBy position. Optionally use @JoinTable to declare name.

    for example: class Person & class Address

        in Person:
    @ManyToMany
    @JoinTable(
        name = "course_like",
        joinColumns = @JoinColumn(name = "person_id"),
        inverseJoinColumns = @JoinColumn(name = "address_id")) -> optional
    private Address address;

        in Address:
    @ManyToMany(mappedBy "person")
    private Person person;

2. Composite key (2 PKs are part of the join table PK)
    Rule: Composite key has to be @Embeddable, implements Serializable, hashcode(), and equals().
    New Entity contains composite key and the keys of the 2 classes.

    for example: class Person & class Address.

    @Embeddable
    class PersonAddressKey implements Serializable {
        @Column(name = "person_id")
        Long person_id;

        @Column(name = "address_id")
        Long address_id;

        //remeber to implement hashcode() and equals()
    }

    class PersonAddress {
        @EmbeddedId
        PersonAddressKey id;

        @ManyToOne
        @MapsId("personId")
        Person person;

        same for address;

        the additional attributes;
    }
    Then use @OneToMany(mappedBy...)
    PersonAddress personAddress; in Person & Address

3. Join table entity (2 PKs are attributes in join entity)
    Rule: create a new PersonAddress entity with 2 FKs.
     */
}
