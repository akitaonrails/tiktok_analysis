package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C040I;
import X.C1605040rry;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes25.dex */
public interface SchoolPostsAPI {
    public static final C1605040rry LIZ = C1605040rry.LIZ;

    @InterfaceC1501170pAR("/tiktok/user/relation/school/posts/v1")
    Object getSchoolPosts(@C040I SchoolPostsRequest schoolPostsRequest, InterfaceC1364105Vn<? super SchoolPostsResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/user/relation/school/posts/related/v1")
    Object getSchoolPostsRelated(@C040I SchoolPostsRelatedRequest schoolPostsRelatedRequest, InterfaceC1364105Vn<? super SchoolPostsRelatedResponse> interfaceC1364105Vn);
}
