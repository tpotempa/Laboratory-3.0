package pl.edu.pwsztar.universityrecruitment;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class UniversityCandidate implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "UNIVERSITYCANDIDATE_ID_GENERATOR")
   @javax.persistence.SequenceGenerator(sequenceName = "UNIVERSITYCANDIDATE_ID_SEQ", name = "UNIVERSITYCANDIDATE_ID_GENERATOR")
   private java.lang.Long id;

   private java.lang.String firstName;

   private java.lang.String lastName;

   private java.lang.Integer examResult;

   private java.lang.Boolean admission = Boolean.FALSE;

   private java.lang.String fieldOfStudy;

   private java.lang.Boolean olympicFinalist;

   private java.lang.String qualificationType;

   public UniversityCandidate()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(java.lang.String firstName)
   {
      this.firstName = firstName;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.lang.Integer getExamResult()
   {
      return this.examResult;
   }

   public void setExamResult(java.lang.Integer examResult)
   {
      this.examResult = examResult;
   }

   public java.lang.Boolean getAdmission()
   {
      return this.admission;
   }

   public void setAdmission(java.lang.Boolean admission)
   {
      this.admission = admission;
   }

   public java.lang.String getFieldOfStudy()
   {
      return this.fieldOfStudy;
   }

   public void setFieldOfStudy(java.lang.String fieldOfStudy)
   {
      this.fieldOfStudy = fieldOfStudy;
   }

   public java.lang.Boolean getOlympicFinalist()
   {
      return this.olympicFinalist;
   }

   public void setOlympicFinalist(java.lang.Boolean olympicFinalist)
   {
      this.olympicFinalist = olympicFinalist;
   }

   public java.lang.String getQualificationType()
   {
      return this.qualificationType;
   }

   public void setQualificationType(java.lang.String qualificationType)
   {
      this.qualificationType = qualificationType;
   }

   public UniversityCandidate(java.lang.Long id, java.lang.String firstName,
         java.lang.String lastName, java.lang.Integer examResult,
         java.lang.Boolean admission, java.lang.String fieldOfStudy,
         java.lang.Boolean olympicFinalist, java.lang.String qualificationType)
   {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.examResult = examResult;
      this.admission = admission;
      this.fieldOfStudy = fieldOfStudy;
      this.olympicFinalist = olympicFinalist;
      this.qualificationType = qualificationType;
   }

}