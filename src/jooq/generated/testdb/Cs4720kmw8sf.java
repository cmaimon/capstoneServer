/**
 * This class is generated by jOOQ
 */
package jooq.generated.testdb;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cs4720kmw8sf extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -721112607;

	/**
	 * The singleton instance of <code>cs4720kmw8sf</code>
	 */
	public static final Cs4720kmw8sf CS4720KMW8SF = new Cs4720kmw8sf();

	/**
	 * No further instances allowed
	 */
	private Cs4720kmw8sf() {
		super("cs4720kmw8sf");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			jooq.generated.testdb.tables.Attacks.ATTACKS,
			jooq.generated.testdb.tables.Bases.BASES,
			jooq.generated.testdb.tables.Portals.PORTALS,
			jooq.generated.testdb.tables.Reinforcements.REINFORCEMENTS,
			jooq.generated.testdb.tables.Users.USERS,
			jooq.generated.testdb.tables.Vessels.VESSELS,
			jooq.generated.testdb.tables.Wormholes.WORMHOLES,
			jooq.generated.testdb.tables.WormholeConnections.WORMHOLE_CONNECTIONS);
	}
}