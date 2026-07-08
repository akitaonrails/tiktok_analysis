package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AwemePlayFunModel implements Serializable {

    @C09CT("angle")
    public final int angle;

    @C09CT("end_duration")
    public final float endDuration;

    @C09CT("image_info")
    public final UrlModel imageInfo;

    @C09CT("position_x")
    public final float positionX;

    @C09CT("position_y")
    public final float positionY;

    @C09CT("show_duration")
    public final float showDuration;

    @C09CT("show_time")
    public final float showTime;

    @C09CT("start_duration")
    public final float startDuration;

    @C09CT("tips")
    public final String tips;

    @C09CT("translation_fields")
    public final List<String> translationFields;

    public AwemePlayFunModel(List<String> list, UrlModel urlModel, String str, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.translationFields = list;
        this.imageInfo = urlModel;
        this.tips = str;
        this.startDuration = f;
        this.endDuration = f2;
        this.showDuration = f3;
        this.showTime = f4;
        this.positionX = f5;
        this.positionY = f6;
        this.angle = i;
    }
}
