
package org.example.businessschemas;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.example.businessschemas package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.businessschemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RevHexType }
     * 
     */
    public RevHexType createRevHexType() {
        return new RevHexType();
    }

    /**
     * Create an instance of {@link CommitEntityType }
     * 
     */
    public CommitEntityType createCommitEntityType() {
        return new CommitEntityType();
    }

    /**
     * Create an instance of {@link FullCommitEntityType }
     * 
     */
    public FullCommitEntityType createFullCommitEntityType() {
        return new FullCommitEntityType();
    }

    /**
     * Create an instance of {@link RevType }
     * 
     */
    public RevType createRevType() {
        return new RevType();
    }

    /**
     * Create an instance of {@link CommitFaultType }
     * 
     */
    public CommitFaultType createCommitFaultType() {
        return new CommitFaultType();
    }

    /**
     * Create an instance of {@link MultiCommitEntityType }
     * 
     */
    public MultiCommitEntityType createMultiCommitEntityType() {
        return new MultiCommitEntityType();
    }

}
