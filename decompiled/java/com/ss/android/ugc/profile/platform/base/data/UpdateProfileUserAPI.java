package com.ss.android.ugc.profile.platform.base.data;

import X.C11NZ;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2177008fw;

/* JADX INFO: loaded from: classes20.dex */
public interface UpdateProfileUserAPI {
    @InterfaceC1501160pAQ("/aweme/v1/user/")
    C11NZ<ProfileUser> getLegacyInfo(@InterfaceC1501120pAM("scene_id") String str, @InterfaceC1501120pAM("uid") String str2);

    @InterfaceC1501160pAQ("/tiktok/user/profile/other/v1")
    C11NZ<ProfileUser> getOtherUserInfo(@InterfaceC1501120pAM("scene_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM("user_id") String str3, @InterfaceC1501120pAM("teen_sec_user_id") String str4, @InterfaceC1501120pAM("from") int i, @InterfaceC1501120pAM("profile_optimize_exp") int i2, @InterfaceC1501120pAM("header_simplify_exp") int i3, @InterfaceC1501120pAM("left_align_exp") int i4, @InterfaceC1501120pAM("profile_bg_in_allow_list") int i5, @InterfaceC1501120pAM("profile_bg_enable_consumption_group") int i6, @InterfaceC2177008fw Object obj);

    @InterfaceC1501160pAQ("/tiktok/user/profile/self/v1")
    C11NZ<ProfileUser> getSelfUserInfo(@InterfaceC1501120pAM("scene_id") String str, @InterfaceC1501120pAM("from") int i, @InterfaceC1501120pAM("profile_optimize_exp") int i2, @InterfaceC1501120pAM("header_simplify_exp") int i3, @InterfaceC1501120pAM("left_align_exp") int i4, @InterfaceC1501120pAM("feature_center_exp") int i5, @InterfaceC1501120pAM("profile_bg_in_allow_list") int i6, @InterfaceC1501120pAM("page_width") int i7, @InterfaceC2177008fw Object obj);
}
