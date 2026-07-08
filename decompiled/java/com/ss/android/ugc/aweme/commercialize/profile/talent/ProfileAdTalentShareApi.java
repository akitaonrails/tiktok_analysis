package com.ss.android.ugc.aweme.commercialize.profile.talent;

import X.C1057590dcz;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.commercialize.profile.talent.model.ProfileTalentShareAdResult;

/* JADX INFO: loaded from: classes17.dex */
public interface ProfileAdTalentShareApi {
    public static final C1057590dcz LIZ = C1057590dcz.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/commerce/profile/ad/")
    ListenableFuture<ProfileTalentShareAdResult> getTalentProfileAd(@InterfaceC1501070pAH("sec_uid") String str, @InterfaceC1501070pAH("item_ids") String str2, @InterfaceC1501070pAH("index") int i, @InterfaceC1501070pAH("source") int i2, @InterfaceC1501070pAH("last_ad_show_gap") Integer num);
}
