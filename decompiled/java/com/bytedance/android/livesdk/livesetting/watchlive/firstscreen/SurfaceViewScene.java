package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class SurfaceViewScene {
    public static final TypeAdapter ADAPTER = new SurfaceViewScene_OptTypeAdapter(NormalGson.singleton());

    @C09CT("forbidden_entrance")
    public String forbidden_entrance;

    @C09CT("inner_draw")
    public boolean inner_draw;

    @C09CT("inner_jump")
    public boolean inner_jump;

    @C09CT("outside_normal_click")
    public boolean outside_normal_click;

    @C09CT("outside_with_feed")
    public boolean outside_with_feed;

    public SurfaceViewScene() {
        this(false, false, false, false, "");
    }

    public SurfaceViewScene(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.outside_with_feed = z;
        this.outside_normal_click = z2;
        this.inner_draw = z3;
        this.inner_jump = z4;
        this.forbidden_entrance = str;
    }
}
