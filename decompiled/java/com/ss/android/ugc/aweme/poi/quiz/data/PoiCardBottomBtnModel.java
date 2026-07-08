package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCardBottomBtnModel implements Serializable {

    @C09CT("finish_text")
    public final String finishText;

    @C09CT("initial_text")
    public final String initialText;

    public PoiCardBottomBtnModel() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiCardBottomBtnModel)) {
            return false;
        }
        PoiCardBottomBtnModel poiCardBottomBtnModel = (PoiCardBottomBtnModel) obj;
        return Intrinsics.LJFF(this.initialText, poiCardBottomBtnModel.initialText) && Intrinsics.LJFF(this.finishText, poiCardBottomBtnModel.finishText);
    }

    public int hashCode() {
        String str = this.initialText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.finishText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public PoiCardBottomBtnModel(String str, String str2) {
        this.initialText = str;
        this.finishText = str2;
    }
}
