package com.ss.android.ugc.aweme.ad.feed;

import X.AbstractC1038410d83;
import X.C1022820ciu;
import X.C2184171Adz;
import X.C726730Sf1;
import X.C786410Ut5;
import X.InterfaceC1399350mWD;
import X.InterfaceC987330bnf;
import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.ad.feed.ad4ad.Ad4adBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.ad.feed.bottombar.BottomBannerUnderWaterTrigger;
import com.ss.android.ugc.aweme.ad.feed.liveshopping.AdAnoleSlotBottomBannerTrigger;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class CommercializeFeedServiceImpl implements ICommercializeFeedService {
    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final Ad4adBottomBarAssemTrigger LIZ() {
        return new Ad4adBottomBarAssemTrigger();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final BottomBannerUnderWaterTrigger LIZJ() {
        return new BottomBannerUnderWaterTrigger();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final AdAnoleSlotBottomBannerTrigger LJ() {
        return new AdAnoleSlotBottomBannerTrigger();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final AdFeeDeductionBottomBarAssemTrigger LJI() {
        return new AdFeeDeductionBottomBarAssemTrigger();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final InterfaceC987330bnf LIZIZ(Context context, ViewGroup viewGroup) {
        return (InterfaceC987330bnf) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b_h, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final void LIZLLL(String str, boolean z) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        if (JSONObjectProtectorUtils.getInt(jSONObject, "CostType") == 3) {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "CreativeId");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "LogExtra");
            if (z) {
                str2 = "ad_message_show";
            } else {
                str2 = "ad_message_click";
            }
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("message_ad", str2, string, string2, null);
            c1022820ciuLJ.LIZJ("countdown_push", "refer");
            c1022820ciuLJ.LIZIZ("2", "message_type");
            c1022820ciuLJ.LJII();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Sf1] */
    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService
    public final C726730Sf1 LJFF(Activity activity, Fragment fragment, final InterfaceC1399350mWD interfaceC1399350mWD) {
        return new AbstractC1038410d83(activity, fragment) { // from class: X.0Sf1
            @Override // X.InterfaceC1399350mWD
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return interfaceC1399350mWD.onKeyDown(i, keyEvent);
            }
        };
    }
}
