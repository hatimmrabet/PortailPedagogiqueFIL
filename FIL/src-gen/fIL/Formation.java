/**
 */
package fIL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Formation#getName <em>Name</em>}</li>
 *   <li>{@link fIL.Formation#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link fIL.Formation#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link fIL.Formation#getS1 <em>S1</em>}</li>
 *   <li>{@link fIL.Formation#getS2 <em>S2</em>}</li>
 *   <li>{@link fIL.Formation#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link fIL.Formation#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link fIL.Formation#getDocuments <em>Documents</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getFormation()
 * @model
 * @generated
 */
public interface Formation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fIL.FILPackage#getFormation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fIL.Formation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudo</em>' attribute.
	 * @see #setPseudo(String)
	 * @see fIL.FILPackage#getFormation_Pseudo()
	 * @model
	 * @generated
	 */
	String getPseudo();

	/**
	 * Sets the value of the '{@link fIL.Formation#getPseudo <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo</em>' attribute.
	 * @see #getPseudo()
	 * @generated
	 */
	void setPseudo(String value);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference.
	 * @see #setPresentation(Presentation)
	 * @see fIL.FILPackage#getFormation_Presentation()
	 * @model containment="true"
	 * @generated
	 */
	Presentation getPresentation();

	/**
	 * Sets the value of the '{@link fIL.Formation#getPresentation <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' containment reference.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(Presentation value);

	/**
	 * Returns the value of the '<em><b>S1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S1</em>' containment reference.
	 * @see #setS1(S1)
	 * @see fIL.FILPackage#getFormation_S1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	S1 getS1();

	/**
	 * Sets the value of the '{@link fIL.Formation#getS1 <em>S1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S1</em>' containment reference.
	 * @see #getS1()
	 * @generated
	 */
	void setS1(S1 value);

	/**
	 * Returns the value of the '<em><b>S2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S2</em>' containment reference.
	 * @see #setS2(S2)
	 * @see fIL.FILPackage#getFormation_S2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	S2 getS2();

	/**
	 * Sets the value of the '{@link fIL.Formation#getS2 <em>S2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S2</em>' containment reference.
	 * @see #getS2()
	 * @generated
	 */
	void setS2(S2 value);

	/**
	 * Returns the value of the '<em><b>Responsables</b></em>' reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsables</em>' reference list.
	 * @see fIL.FILPackage#getFormation_Responsables()
	 * @model
	 * @generated
	 */
	EList<Intervenant> getResponsables();

	/**
	 * Returns the value of the '<em><b>Enseignants</b></em>' reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignants</em>' reference list.
	 * @see fIL.FILPackage#getFormation_Enseignants()
	 * @model
	 * @generated
	 */
	EList<Intervenant> getEnseignants();

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see fIL.FILPackage#getFormation_Documents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Document> getDocuments();

} // Formation
