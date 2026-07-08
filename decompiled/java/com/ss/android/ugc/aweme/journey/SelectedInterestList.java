package com.ss.android.ugc.aweme.journey;

import X.C09CT;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SelectedInterestList {

    @C09CT("interest_list")
    public final List<NewUserInterestStruct> interest_list;

    @C09CT("select_duration")
    public final Integer select_duration;

    @C09CT("select_interest_type")
    public final Integer select_interest_type;

    @C09CT("special_type")
    public final Integer special_type;

    public SelectedInterestList(List<NewUserInterestStruct> list, Integer num, Integer num2, Integer num3) {
        this.interest_list = list;
        this.special_type = num;
        this.select_duration = num2;
        this.select_interest_type = num3;
    }
}
