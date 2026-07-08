package com.ss.android.ugc.ur.socialavatar;

import X.C0HDF;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes7.dex */
public interface SocialAvatarManagementAPI {
    public static final C0HDF LIZ = C0HDF.LIZ;

    @InterfaceC1501170pAR("tiktok/v1/social_avatar/delete")
    Object deleteSocialAvatar(InterfaceC1364105Vn<? super SocialAvatarDeleteResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("tiktok/v1/social_avatar/results")
    Object querySocialAvatarResponse(InterfaceC1364105Vn<? super SocialAvatarResultResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("tiktok/v1/social_avatar/quota")
    Object socialAvatarQuota(InterfaceC1364105Vn<? super SocialAvatarQuotaResponse> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("tiktok/v1/social_avatar/status/update")
    Object socialAvatarStatusUpdate(@InterfaceC1501050pAF("ur_update_status") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
