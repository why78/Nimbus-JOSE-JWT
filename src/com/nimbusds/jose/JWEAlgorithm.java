package com.nimbusds.jose;


/**
 * JSON Web Encryption (JWE) algorithm name, with optional implementation 
 * requirement. This class is immutable.
 *
 * @author Vladimir Dzhuvinov
 * @version $version$ (2012-09-19)
 */
public final class JWEAlgorithm extends Algorithm {


	/**
	 * RSAES-PKCS1-V1_5 (RFC 3447) (required).
	 */
	public static final JWEAlgorithm RSA1_5 = new JWEAlgorithm("RSA1_5", Requirement.REQUIRED);
	
	
	/**
	 * RSAES using Optimal Assymetric Encryption Padding (OAEP) (RFC 3447),
	 * with the default parameters specified by RFC 3447 in section A.2.1.
	 */
	public static final JWEAlgorithm RSA_OAEP = new JWEAlgorithm("RSA-OAEP", Requirement.RECOMMENDED);
	
	
	/**
	 * Advanced Encryption Standard (AES) Key Wrap Algorithm (RFC 3394) 
	 * using 256 bit keys.
	 */
	public static final JWEAlgorithm A128KW = new JWEAlgorithm("A128KW", Requirement.RECOMMENDED);
	
	
	/**
	 * Advanced Encryption Standard (AES) Key Wrap Algorithm (RFC 3394) 
	 * using 256 bit keys.
	 */
	public static final JWEAlgorithm A256KW = new JWEAlgorithm("A256KW", Requirement.RECOMMENDED);
	
	
	/**
	 * Direct use of a shared symmetric key as the Content Master Key (CMK)
	 * for the block encryption step (rather than using the symmetric key to
	 * wrap the CMK).
	 */
	public static final JWEAlgorithm DIR = new JWEAlgorithm("dir", Requirement.RECOMMENDED);
	
	
	/**
	 * Elliptic Curve Diffie-Hellman Ephemeral Statis (RFC 6090) key 
	 * agreement using the Concat KDF, as defined in section 5.8.1 of
	 * NIST.800-56A, where the Digest Method is SHA-256 and all OtherInfo
	 * parameters the empty bit string, with the agreed-upon key being used
	 * directly as the Content Master Key (CMK) (rather than being used to
	 * wrap the CMK).
	 */
	public static final JWEAlgorithm ECDH_ES = new JWEAlgorithm("ECDH-ES", Requirement.RECOMMENDED);
	
	
	/**
	 * Elliptic Curve Diffie-Hellman Ephemeral Static key agreement per
	 * "ECDH-ES", but where the agreed-upon key is used to wrap the Content
	 * Master Key (CMK) with the "A128KW" function (rather than being used
	 * directly as the CMK).
	 */
	public static final JWEAlgorithm ECDH_ES_A128KW = new JWEAlgorithm("ECDH-ES+A128KW", Requirement.RECOMMENDED);
	
	
	/**
	 * Elliptic Curve Diffie-Hellman Ephemeral Static key agreement per
	 * "ECDH-ES", but where the agreed-upon key is used to wrap the Content
	 * Master Key (CMK) with the "A256KW" function (rather than being used
	 * directly as the CMK).
	 */
	public static final JWEAlgorithm ECDH_ES_A256KW = new JWEAlgorithm("ECDH-ES+A256KW", Requirement.RECOMMENDED);
	
	

	/**
	 * Creates a new JSON Web Encryption (JWE) algorithm.
	 *
	 * @param name The algorithm name. Must not be {@code null}.
	 * @param req  The implementation requirement, {@code null} if not 
	 *             known.
	 */
	public JWEAlgorithm(final String name, final Requirement req) {
	
		super(name, req);
	}
	
	
	/**
	 * Creates a new JSON Web Encryption (JWE) algorithm.
	 *
	 * @param name The algorithm name. Must not be {@code null}.
	 */
	public JWEAlgorithm(final String name) {
	
		super(name, null);
	}
	
	
	@Override
	public boolean equals(final Object object) {
	
		return object instanceof JWEAlgorithm && this.toString().equals(object.toString());
	}
}