package com.ss.android.ugc.aweme.commercialize.profile.impl.ad;

import X.C05XV;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes17.dex */
public interface CommerceProfileAdApi {
    public static final C05XV LIZ = C05XV.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/ad/profile_page/")
    Object getAdAweme(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH("aweme_list") String str3, @InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("showed_groups_before_ad") int i2, @InterfaceC1501070pAH("recent_items") String str4, @InterfaceC1501070pAH("slide_direction") int i3, @InterfaceC1501070pAH("gaid") String str5, @InterfaceC1501070pAH("cmpl_enc") String str6, @InterfaceC1501070pAH("ad_personality_mode") Integer num, @InterfaceC1501070pAH("survey_keys") String str7, InterfaceC1364105Vn<? super CommerceProfileAdResponse> interfaceC1364105Vn);
}
