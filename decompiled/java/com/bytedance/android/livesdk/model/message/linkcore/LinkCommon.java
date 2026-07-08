package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LinkCommon {

    @C09CT("app_id")
    public long appId;

    @C09CT("centerized_idc")
    public String centerizedIdc;

    @C09CT("extra")
    public Map<String, String> extraMap;

    @C09CT("linker_session_id")
    public String linkerSessionId;

    @C09CT("linkmic_arch_version")
    public int linkmicArchVersion;

    @C09CT("live_id")
    public long live_id;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("source")
    public String source;

    public LinkCommon() {
        this(0, 0L, 0L, null, "", "", 0, "");
    }

    public LinkCommon(int i, long j, long j2, Map<String, String> map, String str, String str2, int i2, String str3) {
        this.scene = i;
        this.appId = j;
        this.live_id = j2;
        this.extraMap = map;
        this.source = str;
        this.centerizedIdc = str2;
        this.linkmicArchVersion = i2;
        this.linkerSessionId = str3;
    }
}
