package com.ss.android.ugc.aweme.interest.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class InterestUpdateData {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("interest_list")
    public final List<InterestId> interestList;

    @C09CT("select_duration")
    public final int selectDuration;

    @C09CT("select_interest_type")
    public final int selectInterestType;

    @C09CT("special_type")
    public final int specialType;

    public InterestUpdateData(List<InterestId> list, int i, int i2, int i3) {
        this.interestList = list;
        this.selectDuration = i;
        this.selectInterestType = i2;
        this.specialType = i3;
    }
}
