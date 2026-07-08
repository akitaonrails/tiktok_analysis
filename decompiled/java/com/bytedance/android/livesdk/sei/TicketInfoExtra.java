package com.bytedance.android.livesdk.sei;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class TicketInfoExtra {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("ext")
    public Object extra;

    @C09CT("id_to_info_m")
    public Map<String, TicketInfo> map;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("score_type")
    public int scoreType;

    public TicketInfoExtra() {
        this("", null, 0, null);
    }

    public TicketInfoExtra(String str, Map<String, TicketInfo> map, int i, Object obj) {
        this.scene = str;
        this.map = map;
        this.scoreType = i;
        this.extra = obj;
    }
}
