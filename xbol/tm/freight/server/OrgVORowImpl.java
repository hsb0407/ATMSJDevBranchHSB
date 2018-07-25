package xxgam.oracle.apps.xbol.tm.freight.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrgVORowImpl extends OAViewRowImpl
{

  public static final int ORG = 0;
  public static final int ORGNAME = 1;
  public static final int ORGID = 2;

  /**This is the default constructor (do not remove)
   */
  public OrgVORowImpl()
  {
  }

  /**Gets the attribute value for the calculated attribute Org
   */
  public String getOrg()
  {
    return (String) getAttributeInternal(ORG);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute Org
   */
  public void setOrg(String value)
  {
    setAttributeInternal(ORG, value);
  }

  /**getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, 
                                         AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
    {
    case ORG:
      return getOrg();
    case ORGNAME:
      return getOrgName();
    case ORGID:
      return getOrgId();
    default:
      return super.getAttrInvokeAccessor(index, attrDef);
    }
  }

  /**setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, 
                                       AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
    {
    case ORGNAME:
      setOrgName((String)value);
      return;
    case ORGID:
      setOrgId((Number)value);
      return;
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }

  /**Gets the attribute value for the calculated attribute OrgId
   */
  public Number getOrgId()
  {
    return (Number) getAttributeInternal(ORGID);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute OrgId
   */
  public void setOrgId(Number value)
  {
    setAttributeInternal(ORGID, value);
  }

  /**Gets the attribute value for the calculated attribute OrgName
   */
  public String getOrgName()
  {
    return (String) getAttributeInternal(ORGNAME);
  }

  /**Sets <code>value</code> as the attribute value for the calculated attribute OrgName
   */
  public void setOrgName(String value)
  {
    setAttributeInternal(ORGNAME, value);
  }
}
