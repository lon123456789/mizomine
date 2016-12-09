package input;

/**
 * Created by imrihecht on 12/9/16.
 */
public interface IMizoRelationParser {
    long getTypeId();

    String getTypeName();

    long getRelationId();

    long getVertexId();

    long getOtherVertexId();

    String readPropertyValue();

    void skipPropertyValue();

    String readPropertyName();

    boolean valueHasRemaining();

    boolean isSystemType();

    boolean isKnownType();

    boolean isProperty();

    boolean isOutEdge();

    boolean isInEdge();
}
