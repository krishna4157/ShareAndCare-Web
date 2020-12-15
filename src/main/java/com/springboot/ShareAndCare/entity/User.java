package com.springboot.ShareAndCare.entity;

	import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

	import lombok.Data;
	import lombok.NoArgsConstructor;

	/**
	 * The persistent class for the ENTITY database table.
	 * 
	 */
	
	@NoArgsConstructor
	@Data
	public class User {
			
//		@Column(name="FIRST_NAME")
		private String firstName;
		
//		@Column(name="LAST_NAME")
		private String lastName;
		
//		@Column(name="GENDER")
		private String gender;
		
//		@Column(name="PHONE_NO")
		private String phoneNo;
		
//		@Column(name="DOB")
//		private Date dob;
		
//		@Transient
		private String dateOfBirth;
		
//		@Convert(converter = EnrollStatusConverter.class)
//		private EnrollStatus enrollStatus;
		
//		@Convert(converter = SubjectStatusConverter.class)
//		private SubjectStatus status;
		
//		@Column(name="EMAIL")
		private String email;

//		@Column(name="LANGUAGE_ID")
//		private String languageId;

//		@Column(name="FULL_NAME")
		private String fullName;
		
	    @JsonFormat(pattern="yyyy-MM-dd")
//		@Column(name="CONSENTED_ON")
		private Date consentedOn;
		
//		@Column(name="ORIGINATING_TIMEZONE")
//		private String originatingTimezone;
		
//		@Column(name="IS_REGISTERED")
		private boolean isRegistered;
		
//		@Column(name="LOCALE")
		private String locale;
		
//		@Column(name="CURRENT_CONSENT_VERSION_ID")
		private String currentConsentVersionId;
		
//		@Column(name="NEXT_CONSENT_VERSION_ID")
		private String nextConsentVersionId;
		
//		@Column(name="LAST_CONSENTED_IRB_VERSION")
		private String lastConsentedIrbVersion;
		
//		@Column(name="MIDDLE_NAME")
		private String middleName;
		
//		@Column(name="USER_NAME")
		private String userName;
		
//		@Column(name="LOGIN_PASSWORD")
		private String loginPassword;
		
//		@Column(name="NO_OF_ATTEMPTS")
		private Integer noOfAttempts;
		
//		@Column(name="IS_ACCOUNT_NON_LOCKED")
		private Boolean isAccountNonLocked;
		
//		@Column(name="LAR_FIRST_NAME")
		private String larFirstName;
		
//		@Column(name="LAR_LAST_NAME")
		private String larLastName;
		
//		@Column(name="LAR_EMAIL")
//		private String larEmail;

//		@Column(name = "LAR_USER_NAME")
//		private String larUserName;
		
//		@Column(name="LAR_PASSWORD")
//		private String larPassword;
		
//		@Column(name="WITNESS_FIRST_NAME")
//		private String witnessFirstName;
		
//		@Column(name="WITNESS_LAST_NAME")
//		private String witnessLastName;
		
//		@Column(name="WITNESS_EMAIL")
//		private String witnessEmail;
		
//		@Column(name = "WITNESS_USER_NAME")
//		private String witnessUserName;
		
//		@Column(name="WITNESS_PASSWORD")
//		private String witnessPassword;
		
//		@Column(name="LAR_AS_WITNESS")
//		private boolean larAsWitness;
		
//		@Transient
//		String consentedOnString;
		
//		@Override
//		public boolean equals(Object o) {
//			if (o == this) return true;
//			if (!(o instanceof Subject)) return false;
//			User other = (User) o;
//			if (!other.canEqual((Object) this)) return false;
//			if (!this.getId().equals(other.getId())) return false;
//			return true;
//		}

	}
