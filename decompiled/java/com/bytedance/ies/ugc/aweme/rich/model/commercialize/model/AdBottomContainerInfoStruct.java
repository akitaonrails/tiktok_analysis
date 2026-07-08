package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdBottomContainerInfoStruct implements Serializable {

    @C09CT("animation_info")
    public final AnimationInfoStruct animationInfo;

    @C09CT("change_color_seconds")
    public final int changeColorSeconds;

    @C09CT("container_url")
    public final String containerUrl;

    @C09CT("element_sequence")
    public final List<Integer> elementSequence;

    @C09CT("height")
    public final int height;

    @C09CT("show_seconds")
    public final int showSeconds;

    public AdBottomContainerInfoStruct() {
        this("", 0, 0, null, 0, null);
    }

    public final AnimationInfoStruct getAnimationInfo() {
        return this.animationInfo;
    }

    public final int getChangeColorSeconds() {
        return this.changeColorSeconds;
    }

    public final String getContainerUrl() {
        return this.containerUrl;
    }

    public final List<Integer> getElementSequence() {
        return this.elementSequence;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public AdBottomContainerInfoStruct(String str, int i, int i2, List<Integer> list, int i3, AnimationInfoStruct animationInfoStruct) {
        this.containerUrl = str;
        this.showSeconds = i;
        this.height = i2;
        this.elementSequence = list;
        this.changeColorSeconds = i3;
        this.animationInfo = animationInfoStruct;
    }
}
