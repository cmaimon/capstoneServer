/**
 * This class is generated by jOOQ
 */
package jooq.generated.testdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Bases extends org.jooq.impl.TableImpl<jooq.generated.testdb.tables.records.BasesRecord> {

	private static final long serialVersionUID = -201249077;

	/**
	 * The singleton instance of <code>cs4720kmw8sf.bases</code>
	 */
	public static final jooq.generated.testdb.tables.Bases BASES = new jooq.generated.testdb.tables.Bases();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.generated.testdb.tables.records.BasesRecord> getRecordType() {
		return jooq.generated.testdb.tables.records.BasesRecord.class;
	}

	/**
	 * The column <code>cs4720kmw8sf.bases.base_id</code>.
	 */
	public final org.jooq.TableField<jooq.generated.testdb.tables.records.BasesRecord, java.lang.Integer> BASE_ID = createField("base_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>cs4720kmw8sf.bases.username</code>.
	 */
	public final org.jooq.TableField<jooq.generated.testdb.tables.records.BasesRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cs4720kmw8sf.bases.prod_rate</code>.
	 */
	public final org.jooq.TableField<jooq.generated.testdb.tables.records.BasesRecord, java.lang.Integer> PROD_RATE = createField("prod_rate", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>cs4720kmw8sf.bases.num_units</code>.
	 */
	public final org.jooq.TableField<jooq.generated.testdb.tables.records.BasesRecord, java.lang.Integer> NUM_UNITS = createField("num_units", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>cs4720kmw8sf.bases.is_home</code>.
	 */
	public final org.jooq.TableField<jooq.generated.testdb.tables.records.BasesRecord, java.lang.Integer> IS_HOME = createField("is_home", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>cs4720kmw8sf.bases</code> table reference
	 */
	public Bases() {
		this("bases", null);
	}

	/**
	 * Create an aliased <code>cs4720kmw8sf.bases</code> table reference
	 */
	public Bases(java.lang.String alias) {
		this(alias, jooq.generated.testdb.tables.Bases.BASES);
	}

	private Bases(java.lang.String alias, org.jooq.Table<jooq.generated.testdb.tables.records.BasesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Bases(java.lang.String alias, org.jooq.Table<jooq.generated.testdb.tables.records.BasesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.generated.testdb.Cs4720kmw8sf.CS4720KMW8SF, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<jooq.generated.testdb.tables.records.BasesRecord, java.lang.Integer> getIdentity() {
		return jooq.generated.testdb.Keys.IDENTITY_BASES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.generated.testdb.tables.records.BasesRecord> getPrimaryKey() {
		return jooq.generated.testdb.Keys.KEY_BASES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.generated.testdb.tables.records.BasesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.generated.testdb.tables.records.BasesRecord>>asList(jooq.generated.testdb.Keys.KEY_BASES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<jooq.generated.testdb.tables.records.BasesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<jooq.generated.testdb.tables.records.BasesRecord, ?>>asList(jooq.generated.testdb.Keys.BASES_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.generated.testdb.tables.Bases as(java.lang.String alias) {
		return new jooq.generated.testdb.tables.Bases(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.generated.testdb.tables.Bases rename(java.lang.String name) {
		return new jooq.generated.testdb.tables.Bases(name, null);
	}
}