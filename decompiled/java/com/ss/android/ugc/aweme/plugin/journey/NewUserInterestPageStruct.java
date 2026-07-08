package com.ss.android.ugc.aweme.plugin.journey;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class NewUserInterestPageStruct {

    @C09CT("config_source")
    public final String configSource;

    @C09CT("interest_list")
    public final List<NewUserInterestStruct> interest_list;

    @C09CT("show_interest_icon")
    public final Boolean showInterestIcon;

    public NewUserInterestPageStruct(List<NewUserInterestStruct> list, Boolean bool, String str, boolean z) {
        this.interest_list = list;
        this.showInterestIcon = bool;
        this.configSource = str;
    }
}
