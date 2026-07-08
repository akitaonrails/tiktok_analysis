package com.ss.android.ugc.profile.business.ci.viewer.api;

import X.C11NZ;
import X.C2209208l8;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileViewerApiService implements IProfileViewerApi {
    public static final ProfileViewerApiService LIZIZ = new ProfileViewerApiService();
    public final /* synthetic */ IProfileViewerApi LIZ = (IProfileViewerApi) C2209208l8.LIZIZ.create(IProfileViewerApi.class);

    @Override // com.ss.android.ugc.profile.business.ci.viewer.api.IProfileViewerApi
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/user/profile/view_record/get/v1")
    public C11NZ<ProfileViewerResponse> fetchViewerList(@InterfaceC1501100pAK("from") Integer num, @InterfaceC1501100pAK("count") Integer num2, @InterfaceC1501100pAK("cursor") String str) {
        return this.LIZ.fetchViewerList(num, num2, str);
    }

    @Override // com.ss.android.ugc.profile.business.ci.viewer.api.IProfileViewerApi
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/user/profile/view_record/add/v1")
    public C11NZ<BaseResponse> reportView(@InterfaceC1501100pAK("user_id") String str, @InterfaceC1501100pAK("sec_user_id") String str2, @InterfaceC1501100pAK(Scene.SCENE_SERVICE) String str3) {
        return this.LIZ.reportView(str, str2, str3);
    }
}
