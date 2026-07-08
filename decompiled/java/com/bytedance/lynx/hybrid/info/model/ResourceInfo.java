package com.bytedance.lynx.hybrid.info.model;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class ResourceInfo {

    @C09CT("access_key")
    public final String access_key;

    @C09CT("bundle")
    public final String bundle;

    @C09CT("channel_name")
    public final String channel_name;

    @C09CT("is_mainframe")
    public final boolean is_mainframe;

    @C09CT("req_header")
    public final Map<String, String> req_header;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("source")
    public final int source;

    @C09CT("type")
    public final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ResourceInfo() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this(0, objArr, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr2, 255, 0 == true ? 1 : 0);
    }

    public ResourceInfo(int i, int i2, Map<String, String> map, String str, String str2, String str3, String str4, boolean z) {
        this.source = i;
        this.type = i2;
        this.req_header = map;
        this.access_key = str;
        this.channel_name = str2;
        this.bundle = str3;
        this.scene = str4;
        this.is_mainframe = z;
    }

    public /* synthetic */ ResourceInfo(int i, int i2, Map map, String str, String str2, String str3, String str4, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) == 0 ? i2 : -1, (i3 & 4) != 0 ? C2097608Jq.LJ() : map, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) == 0 ? str4 : null, (i3 & 128) != 0 ? false : z);
    }
}
