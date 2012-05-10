/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.1-SNAPSHOT"},
                            comments = "This class is generated by jOOQ")
public class Count1 extends org.jooq.impl.AbstractRoutine<java.lang.Long> {

	private static final long serialVersionUID = -772102665;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item ("any", any) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> _1 = createParameter("_1", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("\"any\""));

	/**
	 * Create a new routine call instance
	 */
	public Count1() {
		super("count", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter to the routine
	 */
	public void set__1(java.lang.Object value) {
		setValue(_1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Object> field) {
		setField(_1, field);
	}
}
