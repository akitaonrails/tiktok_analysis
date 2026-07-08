package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class Insets {
    public static final TypeAdapter ADAPTER;

    @C09CT("bottom")
    public int bottom;

    @C09CT("left")
    public int left;

    @C09CT("right")
    public int right;

    @C09CT("top")
    public int top;

    static {
        NormalGson.singleton();
        ADAPTER = new Insets_OptTypeAdapter();
    }

    public Insets() {
        this(0, 0, 0, 0);
    }

    public Insets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }
}
