package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GuidelinePopupData {

    @C09CT("popup_content")
    public final GuidelinePopupContent content;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GuidelinePopupData) && Intrinsics.LJFF(this.content, ((GuidelinePopupData) obj).content);
    }

    public int hashCode() {
        GuidelinePopupContent guidelinePopupContent = this.content;
        if (guidelinePopupContent == null) {
            return 0;
        }
        return guidelinePopupContent.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuidelinePopupData(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GuidelinePopupData(GuidelinePopupContent guidelinePopupContent) {
        this.content = guidelinePopupContent;
    }
}
