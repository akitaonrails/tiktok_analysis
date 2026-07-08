package com.ss.android.ugc.aweme.services.popsuite.local;

import X.C1233710iD3;
import X.C21312318an;
import X.C2214201BlK;
import X.EnumC1233700iD2;
import android.app.Activity;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class Gpppa2svUpsellCampaign implements CampaignManager {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();

    public static final class Companion {
    }

    @Override // com.ss.android.ugc.aweme.services.popsuite.local.CampaignManager
    public boolean startCampaign(IPopSuiteManagerService.PopupConfigObject popupConfigObject, C21312318an c21312318an) {
        String value;
        if (!Intrinsics.LJFF(popupConfigObject.popupName, "tt_gpppa_non_mandatory_2sv_upsell") && !Intrinsics.LJFF(popupConfigObject.popupName, "tt_gpppa_mandatory_2sv_upsell")) {
            return false;
        }
        boolean zLJFF = Intrinsics.LJFF(popupConfigObject.popupName, "tt_gpppa_mandatory_2sv_upsell");
        String str = TwoStepVerificationManagementActivity._pnsPageId;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (zLJFF) {
            value = EnumC1233700iD2.MANDATORY_GPPPA_2SV_FULLSHEET.getValue();
        } else {
            value = EnumC1233700iD2.NONMANDATORY_GPPPA_2SV_FULLSHEET.getValue();
        }
        C1233710iD3.LIZ(activityLJFF, value, popupConfigObject.titleStr, popupConfigObject.descString, R.drawable.xh, !zLJFF, Integer.valueOf(c21312318an.LIZIZ + 1));
        return true;
    }
}
