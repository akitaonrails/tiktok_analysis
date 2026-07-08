package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EffectUserUseRequest {

    @C09CT("aid")
    public long aid;

    @C09CT("expiration_time")
    public long expirationTime;

    @C09CT("type")
    public int type;

    @C09CT("access_key")
    public String accessKey = "";

    @C09CT("sdk_version")
    public String sdkVersion = "";

    @C09CT("channel")
    public String channel = "";

    @C09CT("panel")
    public String panel = "";

    @C09CT("region")
    public String region = "";

    @C09CT("effect_ids")
    public List<String> effectIds = new ArrayList();
}
