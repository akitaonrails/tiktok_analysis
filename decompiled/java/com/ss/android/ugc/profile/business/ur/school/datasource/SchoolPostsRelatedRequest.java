package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.C1DC8;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SchoolPostsRelatedRequest {

    @C09CT("non_personalized")
    public final Boolean nonPersonalized;

    @C09CT("real_time_client_info")
    public final C1DC8 realTimeClientInfo;

    @C09CT("relate_aweme_info")
    public final List<RelatedAwemeInfo> relateAwemeInfo;

    @C09CT("school_info")
    public final SchoolInfoStruct schoolInfo;

    public SchoolPostsRelatedRequest(List<RelatedAwemeInfo> list, Boolean bool, SchoolInfoStruct schoolInfoStruct, C1DC8 c1dc8) {
        this.relateAwemeInfo = list;
        this.nonPersonalized = bool;
        this.schoolInfo = schoolInfoStruct;
        this.realTimeClientInfo = c1dc8;
    }
}
