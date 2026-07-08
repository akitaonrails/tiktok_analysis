package com.ss.android.ugc.aweme.commercialize.service;

import X.C726730Sf1;
import X.InterfaceC1399350mWD;
import X.InterfaceC987330bnf;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ad.feed.ad4ad.Ad4adBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.ad.feed.bottombar.BottomBannerUnderWaterTrigger;
import com.ss.android.ugc.aweme.ad.feed.liveshopping.AdAnoleSlotBottomBannerTrigger;

/* JADX INFO: loaded from: classes12.dex */
public interface ICommercializeFeedService {
    Ad4adBottomBarAssemTrigger LIZ();

    InterfaceC987330bnf LIZIZ(Context context, ViewGroup viewGroup);

    BottomBannerUnderWaterTrigger LIZJ();

    void LIZLLL(String str, boolean z);

    AdAnoleSlotBottomBannerTrigger LJ();

    C726730Sf1 LJFF(Activity activity, Fragment fragment, InterfaceC1399350mWD interfaceC1399350mWD);

    AdFeeDeductionBottomBarAssemTrigger LJI();
}
