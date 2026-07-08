package com.ss.android.ugc.aweme.donation;

import X.C1390920mIc;
import X.C255860A0y;
import X.C786410Ut5;
import X.DialogC848910XRx;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;
import com.ss.android.ugc.aweme.donation.detail.DonationInterceptor;

/* JADX INFO: loaded from: classes29.dex */
public final class DonationServiceImpl implements IDonationService {
    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final DonationInterceptor LIZJ() {
        return new DonationInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final DialogC848910XRx LIZIZ(Context context) {
        return new DialogC848910XRx(context);
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final TuxSheet LIZ(Context context, int i, String str, String str2, String str3, Bundle bundle) {
        bundle.putInt("ngo_id", i);
        C786410Ut5.LJJJI("organization_id", str, bundle);
        C786410Ut5.LJJJI("organization_type", str2, bundle);
        C786410Ut5.LJJJI("sticker_id", str3, bundle);
        bundle.putInt("item_type", 4);
        if (C255860A0y.LIZ()) {
            if (context != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://donation/pannel");
                smartRouteBuildRoute.withParam(bundle);
                smartRouteBuildRoute.withParam("item_type", 3);
                smartRouteBuildRoute.open();
                return null;
            }
            return null;
        }
        DonationFragment donationFragment = new DonationFragment();
        donationFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = donationFragment;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        return tuxSheet;
    }

    @Override // com.ss.android.ugc.aweme.donation.IDonationService
    public final TuxSheet LIZLLL(Context context, int i, String str, String str2, String str3, Bundle bundle) {
        bundle.putInt("ngo_id", i);
        C786410Ut5.LJJJI("organization_id", str, bundle);
        C786410Ut5.LJJJI("organization_type", str2, bundle);
        C786410Ut5.LJJJI("profile_uid", str3, bundle);
        bundle.putInt("item_type", 3);
        if (C255860A0y.LIZ()) {
            if (context != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://donation/pannel");
                smartRouteBuildRoute.withParam(bundle);
                smartRouteBuildRoute.withParam("item_type", 3);
                smartRouteBuildRoute.open();
                return null;
            }
            return null;
        }
        DonationFragment donationFragment = new DonationFragment();
        donationFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = donationFragment;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        return tuxSheet;
    }
}
