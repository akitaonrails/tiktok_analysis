package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ParagraphLayout {

    @C09CT("content_align_x")
    public int contentAlignX;

    @C09CT("height")
    public SizeSpec height;

    @C09CT("row_align")
    public int rowAlign;

    @C09CT("shrink")
    public ShrinkSpec shrink;

    @C09CT("start_new_row")
    public boolean startNewRow;

    @C09CT("width")
    public SizeSpec width;

    @C09CT("wrap_mode")
    public int wrapMode;

    public static final class ShrinkSpec {

        @C09CT("enable")
        public boolean enable;

        @C09CT("min_font_size")
        public int minFontSize;
    }
}
