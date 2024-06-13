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
     */
}
