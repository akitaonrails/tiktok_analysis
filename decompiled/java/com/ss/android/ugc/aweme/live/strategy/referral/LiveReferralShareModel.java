package com.ss.android.ugc.aweme.live.strategy.referral;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveReferralShareModel extends ShareModel {
    public static final int $stable = 8;
    public final String shareLink;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveReferralShareModel) && Intrinsics.LJFF(this.shareLink, ((LiveReferralShareModel) obj).shareLink);
    }

    public final int hashCode() {
        return this.shareLink.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveReferralShareModel(shareLink=");
        sbLIZ.append(this.shareLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveReferralShareModel(String str) {
        super(str);
        this.shareLink = str;
    }
}
