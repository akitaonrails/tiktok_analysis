package tikcast.api.fans;

import X.C09CT;
import webcast.fans_platform.ModelSchema;
import webcast.fans_platform.Namespace;

/* JADX INFO: loaded from: classes.dex */
public final class ValidateModelRequest {

    @C09CT("is_sandbox")
    public boolean isSandbox;

    @C09CT("namespace")
    public Namespace namespace;

    @C09CT("primary_id")
    public long primaryId;

    @C09CT("schema")
    public ModelSchema schema;

    @C09CT("business_id")
    public String businessId = "";

    @C09CT("env")
    public String env = "";

    @C09CT("primary_id_str")
    public String primaryIdStr = "";
}
