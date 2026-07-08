package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySettingsAgreementRecord {

    @C09CT("extra")
    public final PopupExtra popupExtra;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingsAgreementRecord)) {
            return false;
        }
        PrivacySettingsAgreementRecord privacySettingsAgreementRecord = (PrivacySettingsAgreementRecord) obj;
        return this.status == privacySettingsAgreementRecord.status && Intrinsics.LJFF(this.popupExtra, privacySettingsAgreementRecord.popupExtra);
    }

    public PrivacySettingsAgreementRecord(int i, PopupExtra popupExtra) {
        this.status = i;
        this.popupExtra = popupExtra;
    }
}
