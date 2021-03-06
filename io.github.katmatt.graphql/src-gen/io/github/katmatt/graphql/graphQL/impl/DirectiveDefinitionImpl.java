/**
 * generated by Xtext 2.23.0
 */
package io.github.katmatt.graphql.graphQL.impl;

import io.github.katmatt.graphql.graphQL.DirectiveDefinition;
import io.github.katmatt.graphql.graphQL.DirectiveLocation;
import io.github.katmatt.graphql.graphQL.GraphQLPackage;
import io.github.katmatt.graphql.graphQL.InputValueDefinition;
import io.github.katmatt.graphql.graphQL.StringValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directive Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.DirectiveDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.DirectiveDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.DirectiveDefinitionImpl#getArgumentsDefinition <em>Arguments Definition</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.DirectiveDefinitionImpl#isRepeatable <em>Repeatable</em>}</li>
 *   <li>{@link io.github.katmatt.graphql.graphQL.impl.DirectiveDefinitionImpl#getDirectiveLocations <em>Directive Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectiveDefinitionImpl extends MinimalEObjectImpl.Container implements DirectiveDefinition
{
  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected StringValue description;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgumentsDefinition() <em>Arguments Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentsDefinition()
   * @generated
   * @ordered
   */
  protected EList<InputValueDefinition> argumentsDefinition;

  /**
   * The default value of the '{@link #isRepeatable() <em>Repeatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRepeatable()
   * @generated
   * @ordered
   */
  protected static final boolean REPEATABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRepeatable() <em>Repeatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRepeatable()
   * @generated
   * @ordered
   */
  protected boolean repeatable = REPEATABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDirectiveLocations() <em>Directive Locations</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectiveLocations()
   * @generated
   * @ordered
   */
  protected EList<DirectiveLocation> directiveLocations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectiveDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GraphQLPackage.Literals.DIRECTIVE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringValue getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(StringValue newDescription, NotificationChain msgs)
  {
    StringValue oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphQLPackage.DIRECTIVE_DEFINITION__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(StringValue newDescription)
  {
    if (newDescription != description)
    {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphQLPackage.DIRECTIVE_DEFINITION__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphQLPackage.DIRECTIVE_DEFINITION__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.DIRECTIVE_DEFINITION__DESCRIPTION, newDescription, newDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.DIRECTIVE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InputValueDefinition> getArgumentsDefinition()
  {
    if (argumentsDefinition == null)
    {
      argumentsDefinition = new EObjectContainmentEList<InputValueDefinition>(InputValueDefinition.class, this, GraphQLPackage.DIRECTIVE_DEFINITION__ARGUMENTS_DEFINITION);
    }
    return argumentsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isRepeatable()
  {
    return repeatable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRepeatable(boolean newRepeatable)
  {
    boolean oldRepeatable = repeatable;
    repeatable = newRepeatable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphQLPackage.DIRECTIVE_DEFINITION__REPEATABLE, oldRepeatable, repeatable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DirectiveLocation> getDirectiveLocations()
  {
    if (directiveLocations == null)
    {
      directiveLocations = new EDataTypeEList<DirectiveLocation>(DirectiveLocation.class, this, GraphQLPackage.DIRECTIVE_DEFINITION__DIRECTIVE_LOCATIONS);
    }
    return directiveLocations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GraphQLPackage.DIRECTIVE_DEFINITION__DESCRIPTION:
        return basicSetDescription(null, msgs);
      case GraphQLPackage.DIRECTIVE_DEFINITION__ARGUMENTS_DEFINITION:
        return ((InternalEList<?>)getArgumentsDefinition()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GraphQLPackage.DIRECTIVE_DEFINITION__DESCRIPTION:
        return getDescription();
      case GraphQLPackage.DIRECTIVE_DEFINITION__NAME:
        return getName();
      case GraphQLPackage.DIRECTIVE_DEFINITION__ARGUMENTS_DEFINITION:
        return getArgumentsDefinition();
      case GraphQLPackage.DIRECTIVE_DEFINITION__REPEATABLE:
        return isRepeatable();
      case GraphQLPackage.DIRECTIVE_DEFINITION__DIRECTIVE_LOCATIONS:
        return getDirectiveLocations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraphQLPackage.DIRECTIVE_DEFINITION__DESCRIPTION:
        setDescription((StringValue)newValue);
        return;
      case GraphQLPackage.DIRECTIVE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case GraphQLPackage.DIRECTIVE_DEFINITION__ARGUMENTS_DEFINITION:
        getArgumentsDefinition().clear();
        getArgumentsDefinition().addAll((Collection<? extends InputValueDefinition>)newValue);
        return;
      case GraphQLPackage.DIRECTIVE_DEFINITION__REPEATABLE:
        setRepeatable((Boolean)newValue);
        return;
      case GraphQLPackage.DIRECTIVE_DEFINITION__DIRECTIVE_LOCATIONS:
        getDirectiveLocations().clear();
        getDirectiveLocations().addAll((Collection<? extends DirectiveLocation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GraphQLPackage.DIRECTIVE_DEFINITION__DESCRIPTION:
        setDescription((StringValue)null);
        return;
      case GraphQLPackage.DIRECTIVE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GraphQLPackage.DIRECTIVE_DEFINITION__ARGUMENTS_DEFINITION:
        getArgumentsDefinition().clear();
        return;
      case GraphQLPackage.DIRECTIVE_DEFINITION__REPEATABLE:
        setRepeatable(REPEATABLE_EDEFAULT);
        return;
      case GraphQLPackage.DIRECTIVE_DEFINITION__DIRECTIVE_LOCATIONS:
        getDirectiveLocations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GraphQLPackage.DIRECTIVE_DEFINITION__DESCRIPTION:
        return description != null;
      case GraphQLPackage.DIRECTIVE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GraphQLPackage.DIRECTIVE_DEFINITION__ARGUMENTS_DEFINITION:
        return argumentsDefinition != null && !argumentsDefinition.isEmpty();
      case GraphQLPackage.DIRECTIVE_DEFINITION__REPEATABLE:
        return repeatable != REPEATABLE_EDEFAULT;
      case GraphQLPackage.DIRECTIVE_DEFINITION__DIRECTIVE_LOCATIONS:
        return directiveLocations != null && !directiveLocations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", repeatable: ");
    result.append(repeatable);
    result.append(", directiveLocations: ");
    result.append(directiveLocations);
    result.append(')');
    return result.toString();
  }

} //DirectiveDefinitionImpl
