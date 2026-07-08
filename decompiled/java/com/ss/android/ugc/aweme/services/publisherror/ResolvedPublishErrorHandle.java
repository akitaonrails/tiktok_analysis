package com.ss.android.ugc.aweme.services.publisherror;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ResolvedPublishErrorHandle {
    public final String btnAction;
    public final String btnText;
    public final PublishErrorHandleBtnType btnType;
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedPublishErrorHandle)) {
            return false;
        }
        ResolvedPublishErrorHandle resolvedPublishErrorHandle = (ResolvedPublishErrorHandle) obj;
        return Intrinsics.LJFF(this.title, resolvedPublishErrorHandle.title) && Intrinsics.LJFF(this.btnText, resolvedPublishErrorHandle.btnText) && this.btnType == resolvedPublishErrorHandle.btnType && Intrinsics.LJFF(this.btnAction, resolvedPublishErrorHandle.btnAction);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.btnText.hashCode()) * 31) + this.btnType.hashCode()) * 31;
        String str = this.btnAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolvedPublishErrorHandle(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", btnText=");
        sbLIZ.append(this.btnText);
        sbLIZ.append(", btnType=");
        sbLIZ.append(this.btnType);
        sbLIZ.append(", btnAction=");
        sbLIZ.append(this.btnAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ResolvedPublishErrorHandle(String str, String str2, PublishErrorHandleBtnType publishErrorHandleBtnType, String str3) {
        this.title = str;
        this.btnText = str2;
        this.btnType = publishErrorHandleBtnType;
        this.btnAction = str3;
    }
}
