package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class TextHighlight implements Serializable {

    @C09CT("end")
    public Integer endIndex;

    @C09CT("start")
    public Integer startIndex;

    public final void setEndIndex(Integer num) {
        this.endIndex = num;
    }

    public final void setStartIndex(Integer num) {
        this.startIndex = num;
    }

    public TextHighlight(Integer num, Integer num2) {
        this.startIndex = num;
        this.endIndex = num2;
    }
}
