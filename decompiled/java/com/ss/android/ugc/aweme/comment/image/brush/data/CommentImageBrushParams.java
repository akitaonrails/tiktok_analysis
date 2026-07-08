package com.ss.android.ugc.aweme.comment.image.brush.data;

import X.C08G0;
import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class CommentImageBrushParams {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("base_resolution")
    public int baseResolution;

    @C09CT("brush_color")
    public final List<Float> brushColor;

    @C09CT("brush_hardness")
    public final float brushHardness;

    @C09CT("brush_size")
    public final float brushSize;

    @C09CT("canvas_height")
    public int canvasHeight;

    @C09CT("canvas_width")
    public int canvasWidth;

    public CommentImageBrushParams() {
        this(0, 0, C08G0.LIZ("#0BE09B"), 0.046464648f, 1.0f, 0);
    }

    public CommentImageBrushParams(int i, int i2, List<Float> list, float f, float f2, int i3) {
        this.canvasWidth = i;
        this.canvasHeight = i2;
        this.brushColor = list;
        this.brushSize = f;
        this.brushHardness = f2;
        this.baseResolution = i3;
    }
}
