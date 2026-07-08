package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class FrameItemCropInfo implements Serializable {

    @C09CT("bottomLeft")
    public CorpPointF leftBottom;

    @C09CT("topLeft")
    public CorpPointF leftTop;

    @C09CT("bottomRight")
    public CorpPointF rightBottom;

    @C09CT("topRight")
    public CorpPointF rightTop;

    public FrameItemCropInfo() {
        this(new CorpPointF(0.0f, 0.0f), new CorpPointF(0.0f, 1.0f), new CorpPointF(1.0f, 0.0f), new CorpPointF(1.0f, 1.0f));
    }

    public final void setLeftBottom(CorpPointF corpPointF) {
        this.leftBottom = corpPointF;
    }

    public final void setLeftTop(CorpPointF corpPointF) {
        this.leftTop = corpPointF;
    }

    public final void setRightBottom(CorpPointF corpPointF) {
        this.rightBottom = corpPointF;
    }

    public final void setRightTop(CorpPointF corpPointF) {
        this.rightTop = corpPointF;
    }

    public FrameItemCropInfo(CorpPointF corpPointF, CorpPointF corpPointF2, CorpPointF corpPointF3, CorpPointF corpPointF4) {
        this.leftTop = corpPointF;
        this.leftBottom = corpPointF2;
        this.rightTop = corpPointF3;
        this.rightBottom = corpPointF4;
    }
}
