package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdTopContainerInfoStruct implements Serializable {

    @C09CT("container_url")
    public final String containerUrl;

    @C09CT("element_sequence")
    public final List<Integer> elementSequence;

    @C09CT("height")
    public final int height;

    @C09CT("show_seconds")
    public final int showSeconds;

    public AdTopContainerInfoStruct() {
        this("", 0, 0, null);
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

    public AdTopContainerInfoStruct(String str, int i, int i2, List<Integer> list) {
        this.containerUrl = str;
        this.showSeconds = i;
        this.height = i2;
        this.elementSequence = list;
    }
}
