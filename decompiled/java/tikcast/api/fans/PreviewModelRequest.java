package tikcast.api.fans;

import X.C09CT;
import webcast.fans_platform.ModelSchema;
import webcast.fans_platform.Namespace;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewModelRequest {

    @C09CT("business_id")
    public String businessId = "";

    @C09CT("env")
    public String env = "";

    @C09CT("namespace")
    public Namespace namespace;

    @C09CT("primary_id")
    public long primaryId;

    @C09CT("schema")
    public ModelSchema schema;
}
