package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C1007350cJx;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes17.dex */
public interface SchoolGroupsAPI {
    public static final C1007350cJx LIZ = C1007350cJx.LIZ;

    @InterfaceC1501160pAQ("/tiktok/user/relation/school/groups/v1")
    Object getSchoolGroups(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("school_id") String str, @InterfaceC1501120pAM("page_token") String str2, @InterfaceC1501120pAM("count") Integer num, @InterfaceC1501120pAM("last_view_time") Long l, InterfaceC1364105Vn<? super SchoolGroupsResponse> interfaceC1364105Vn);
}
