package com.ss.ugc.android.editor.base.viewmodel;

import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class TextContent {
    public final List<Double> bounding_box;
    public final double duration;
    public final int index;
    public final float start_time;
    public final String value;

    public TextContent() {
        this(0, "", 0.0f, 0.0d, C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)));
    }

    public TextContent(int i, String str, float f, double d, List<Double> list) {
        this.index = i;
        this.value = str;
        this.start_time = f;
        this.duration = d;
        this.bounding_box = list;
    }
}
