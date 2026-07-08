package com.ss.android.ugc.profile.business.ur.editprofile.pronouns.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileEditPronounsParams {

    @C09CT("max_num")
    public final Integer maxPronounsNum;

    @C09CT("pronouns_list")
    public final List<String> pronounsList;

    public ProfileEditPronounsParams() {
        this(null, null, 3, null);
    }

    public ProfileEditPronounsParams(Integer num, List<String> list) {
        this.maxPronounsNum = num;
        this.pronounsList = list;
    }

    public ProfileEditPronounsParams(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 4 : num, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
