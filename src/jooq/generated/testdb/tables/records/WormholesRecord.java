/**
 * This class is generated by jOOQ
 */
package jooq.generated.testdb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WormholesRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.generated.testdb.tables.records.WormholesRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1341505450;

	/**
	 * Setter for <code>cs4720kmw8sf.wormholes.wormhole_id</code>.
	 */
	public void setWormholeId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cs4720kmw8sf.wormholes.wormhole_id</code>.
	 */
	public java.lang.Integer getWormholeId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>cs4720kmw8sf.wormholes.base_id</code>.
	 */
	public void setBaseId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cs4720kmw8sf.wormholes.base_id</code>.
	 */
	public java.lang.Integer getBaseId() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return jooq.generated.testdb.tables.Wormholes.WORMHOLES.WORMHOLE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return jooq.generated.testdb.tables.Wormholes.WORMHOLES.BASE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getWormholeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBaseId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WormholesRecord value1(java.lang.Integer value) {
		setWormholeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WormholesRecord value2(java.lang.Integer value) {
		setBaseId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WormholesRecord values(java.lang.Integer value1, java.lang.Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WormholesRecord
	 */
	public WormholesRecord() {
		super(jooq.generated.testdb.tables.Wormholes.WORMHOLES);
	}

	/**
	 * Create a detached, initialised WormholesRecord
	 */
	public WormholesRecord(java.lang.Integer wormholeId, java.lang.Integer baseId) {
		super(jooq.generated.testdb.tables.Wormholes.WORMHOLES);

		setValue(0, wormholeId);
		setValue(1, baseId);
	}
}