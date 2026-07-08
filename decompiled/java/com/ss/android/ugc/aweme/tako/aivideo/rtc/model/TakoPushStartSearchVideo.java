package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoPushStartSearchVideo {

    @C09CT("loading_disclaimer_text")
    public final String loadingDisclaimerText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoPushStartSearchVideo) && Intrinsics.LJFF(this.loadingDisclaimerText, ((TakoPushStartSearchVideo) obj).loadingDisclaimerText);
    }

    public final int hashCode() {
        return this.loadingDisclaimerText.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPushStartSearchVideo(loadingDisclaimerText=");
        sbLIZ.append(this.loadingDisclaimerText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoPushStartSearchVideo() {
        this("");
    }

    public TakoPushStartSearchVideo(String str) {
        this.loadingDisclaimerText = str;
    }
}
