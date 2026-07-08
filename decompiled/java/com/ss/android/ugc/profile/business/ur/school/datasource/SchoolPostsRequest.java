package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.C1DC8;
import X.EnumC1605030rrx;
import X.EnumC992980bwm;

/* JADX INFO: loaded from: classes25.dex */
public final class SchoolPostsRequest {

    @C09CT("count")
    public final int count;

    @C09CT("enter_from")
    public final int enterFrom;

    @C09CT("insert_aweme_id")
    public final String insertAwemeId;

    @C09CT("non_personalized")
    public final boolean nonPersonalized;

    @C09CT("pull_type")
    public final int pullType;

    @C09CT("real_time_client_info")
    public final C1DC8 realTimeClientInfo;

    @C09CT("school_info")
    public final SchoolInfoStruct schoolInfo;

    public SchoolPostsRequest() {
        this(10, null, false, EnumC992980bwm.DEFAULT.getValue(), EnumC1605030rrx.DEFAULT.getValue(), null, null);
    }

    public SchoolPostsRequest(int i, String str, boolean z, int i2, int i3, SchoolInfoStruct schoolInfoStruct, C1DC8 c1dc8) {
        this.count = i;
        this.insertAwemeId = str;
        this.nonPersonalized = z;
        this.enterFrom = i2;
        this.pullType = i3;
        this.schoolInfo = schoolInfoStruct;
        this.realTimeClientInfo = c1dc8;
    }
}
