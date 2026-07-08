package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C1245950iWn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes20.dex */
public interface SchoolFriendsAPI {
    public static final C1245950iWn LIZ = C1245950iWn.LIZ;

    @InterfaceC1501160pAQ("/tiktok/user/relation/school/friends/v1")
    Object getSchoolFriends(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("count") Integer num, @InterfaceC1501120pAM("page_token") String str, @InterfaceC1501120pAM("rec_impr_users") String str2, @InterfaceC1501120pAM("rec_impr_since") Long l, @InterfaceC1501120pAM("graduate_year_min") Integer num2, @InterfaceC1501120pAM("graduate_year_max") Integer num3, @InterfaceC1501120pAM("is_popular") Boolean bool, @InterfaceC1501120pAM("is_connection") Boolean bool2, @InterfaceC1501120pAM("video_cover") Integer num4, InterfaceC1364105Vn<? super SchoolFriendsResponse> interfaceC1364105Vn);
}
