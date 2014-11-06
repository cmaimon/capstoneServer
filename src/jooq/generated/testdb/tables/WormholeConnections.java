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
public class WormholeConnections extends org.jooq.impl.TableImpl<jooq.generated.testdb.tables.records.WormholeConnectionsRecord> {

	private static final long serialVersionUID = -1671173327;

	/**
	 * The singleton instance of <code>cs4720kmw8sf.wormhole_connections</code>
	 */
	public static final jooq.generated.testdb.tables.WormholeConnections WORMHOLE_CONNECTIONS = new jooq.generated.testdb.tables.WormholeConnections();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.generated.testdb.tables.records.WormholeConnectionsRecord> getRecordType() {
		return jooq.generated.testdb.tables.records.WormholeConnectionsRecord.class;
	}

	/**
	 * The column <code>cs4720kmw8sf.wormhole_connections.wormhole_id1</code>.
	 */
	public final org.jooq.TableField<jooq.generated.testdb.tables.records.WormholeConnectionsRecord, java.lang.Integer> WORMHOLE_ID1 = createField("wormhole_id1", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>cs4720kmw8sf.wormhole_connections.wormhole_id2</code>.
	 */
	public final org.jooq.TableField<jooq.generated.testdb.tables.records.WormholeConnectionsRecord, java.lang.Integer> WORMHOLE_ID2 = createField("wormhole_id2", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>cs4720kmw8sf.wormhole_connections.init_time</code>.
	 */
	public final org.jooq.TableField<jooq.generated.testdb.tables.records.WormholeConnectionsRecord, java.sql.Timestamp> INIT_TIME = createField("init_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>cs4720kmw8sf.wormhole_connections</code> table reference
	 */
	public WormholeConnections() {
		this("wormhole_connections", null);
	}

	/**
	 * Create an aliased <code>cs4720kmw8sf.wormhole_connections</code> table reference
	 */
	public WormholeConnections(java.lang.String alias) {
		this(alias, jooq.generated.testdb.tables.WormholeConnections.WORMHOLE_CONNECTIONS);
	}

	private WormholeConnections(java.lang.String alias, org.jooq.Table<jooq.generated.testdb.tables.records.WormholeConnectionsRecord> aliased) {
		this(alias, aliased, null);
	}

	private WormholeConnections(java.lang.String alias, org.jooq.Table<jooq.generated.testdb.tables.records.WormholeConnectionsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.generated.testdb.Cs4720kmw8sf.CS4720KMW8SF, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<jooq.generated.testdb.tables.records.WormholeConnectionsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<jooq.generated.testdb.tables.records.WormholeConnectionsRecord, ?>>asList(jooq.generated.testdb.Keys.WORMHOLE_CONNECTIONS_IBFK_1, jooq.generated.testdb.Keys.WORMHOLE_CONNECTIONS_IBFK_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.generated.testdb.tables.WormholeConnections as(java.lang.String alias) {
		return new jooq.generated.testdb.tables.WormholeConnections(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.generated.testdb.tables.WormholeConnections rename(java.lang.String name) {
		return new jooq.generated.testdb.tables.WormholeConnections(name, null);
	}
}
