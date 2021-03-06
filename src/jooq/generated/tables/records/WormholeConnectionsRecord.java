/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WormholeConnectionsRecord extends org.jooq.impl.TableRecordImpl<jooq.generated.tables.records.WormholeConnectionsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.sql.Timestamp> {

	private static final long serialVersionUID = 154588554;

	/**
	 * Setter for <code>cs4720cem6at.wormhole_connections.wormhole_id1</code>.
	 */
	public void setWormholeId1(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cs4720cem6at.wormhole_connections.wormhole_id1</code>.
	 */
	public java.lang.Integer getWormholeId1() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>cs4720cem6at.wormhole_connections.wormhole_id2</code>.
	 */
	public void setWormholeId2(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cs4720cem6at.wormhole_connections.wormhole_id2</code>.
	 */
	public java.lang.Integer getWormholeId2() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>cs4720cem6at.wormhole_connections.init_time</code>.
	 */
	public void setInitTime(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cs4720cem6at.wormhole_connections.init_time</code>.
	 */
	public java.sql.Timestamp getInitTime() {
		return (java.sql.Timestamp) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return jooq.generated.tables.WormholeConnections.WORMHOLE_CONNECTIONS.WORMHOLE_ID1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return jooq.generated.tables.WormholeConnections.WORMHOLE_CONNECTIONS.WORMHOLE_ID2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return jooq.generated.tables.WormholeConnections.WORMHOLE_CONNECTIONS.INIT_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getWormholeId1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getWormholeId2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getInitTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WormholeConnectionsRecord value1(java.lang.Integer value) {
		setWormholeId1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WormholeConnectionsRecord value2(java.lang.Integer value) {
		setWormholeId2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WormholeConnectionsRecord value3(java.sql.Timestamp value) {
		setInitTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WormholeConnectionsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.sql.Timestamp value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached WormholeConnectionsRecord
	 */
	public WormholeConnectionsRecord() {
		super(jooq.generated.tables.WormholeConnections.WORMHOLE_CONNECTIONS);
	}

	/**
	 * Create a detached, initialised WormholeConnectionsRecord
	 */
	public WormholeConnectionsRecord(java.lang.Integer wormholeId1, java.lang.Integer wormholeId2, java.sql.Timestamp initTime) {
		super(jooq.generated.tables.WormholeConnections.WORMHOLE_CONNECTIONS);

		setValue(0, wormholeId1);
		setValue(1, wormholeId2);
		setValue(2, initTime);
	}
}
