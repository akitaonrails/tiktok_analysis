package com.ss.android.ugc.aweme.setting.verification;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class VerificationResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("cert_status")
    public MtCertStatusEnum mtCertStatusEnum;

    @C09CT("certing_action")
    public MtCertingActionEnum mtCertingActionEnum;

    public final boolean isCerted() {
        return this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED && this.mtCertingActionEnum == MtCertingActionEnum.CA_EMPTY;
    }

    public final boolean isCertedAgain() {
        return this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED && this.mtCertingActionEnum == MtCertingActionEnum.CA_CERTING;
    }

    public final boolean isCerting() {
        MtCertStatusEnum mtCertStatusEnum = this.mtCertStatusEnum;
        if (mtCertStatusEnum != MtCertStatusEnum.CS_CERTING) {
            return mtCertStatusEnum == MtCertStatusEnum.CS_EMPTY && this.mtCertingActionEnum == MtCertingActionEnum.CA_CERTING;
        }
        return true;
    }

    public final boolean isEmpty() {
        MtCertStatusEnum mtCertStatusEnum = this.mtCertStatusEnum;
        return (mtCertStatusEnum == MtCertStatusEnum.CS_EMPTY && this.mtCertingActionEnum == MtCertingActionEnum.CA_EMPTY) || mtCertStatusEnum == MtCertStatusEnum.CS_DENIED;
    }

    public final boolean isUpdating() {
        return this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED && this.mtCertingActionEnum == MtCertingActionEnum.CA_UPDATING;
    }

    public final boolean shouldShowChangeMobileDialog() {
        MtCertingActionEnum mtCertingActionEnum;
        MtCertStatusEnum mtCertStatusEnum = this.mtCertStatusEnum;
        return mtCertStatusEnum == MtCertStatusEnum.CS_CERTED || mtCertStatusEnum == MtCertStatusEnum.CS_CERTING || (mtCertingActionEnum = this.mtCertingActionEnum) == MtCertingActionEnum.CA_CERTING || mtCertingActionEnum == MtCertingActionEnum.CA_UPDATING;
    }

    public final boolean shouldShowProfileUpdatingToast() {
        MtCertingActionEnum mtCertingActionEnum;
        return this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTING || (mtCertingActionEnum = this.mtCertingActionEnum) == MtCertingActionEnum.CA_CERTING || mtCertingActionEnum == MtCertingActionEnum.CA_UPDATING;
    }

    public final MtCertStatusEnum getMtCertStatusEnum() {
        return this.mtCertStatusEnum;
    }

    public final MtCertingActionEnum getMtCertingActionEnum() {
        return this.mtCertingActionEnum;
    }

    public final void setMtCertStatusEnum(MtCertStatusEnum mtCertStatusEnum) {
        this.mtCertStatusEnum = mtCertStatusEnum;
    }

    public final void setMtCertingActionEnum(MtCertingActionEnum mtCertingActionEnum) {
        this.mtCertingActionEnum = mtCertingActionEnum;
    }
}
