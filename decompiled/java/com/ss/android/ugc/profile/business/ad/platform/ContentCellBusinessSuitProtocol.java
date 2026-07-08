package com.ss.android.ugc.profile.business.ad.platform;

import X.AbstractC848400XPy;
import X.C0OBG;
import X.C0XQ7;
import X.C1248950ibd;
import X.C1250210idf;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BABusinessSuitePageServiceImp;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.data.SemiBusinessSuitBizData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ContentCellBusinessSuitProtocol extends ContentCellProtocol {
    public SemiBusinessSuitBizData LLL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_business_suite";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        Context context;
        int iIntValue;
        String str;
        String str2;
        ProfileComponents profileComponents;
        Integer proAccountUpdateNotificationStatus;
        if (!C0OBG.LIZIZ(this.LLILZLL) && (context = getContext()) != null) {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            SemiBusinessSuitBizData semiBusinessSuitBizData = this.LLL;
            if (semiBusinessSuitBizData != null && (proAccountUpdateNotificationStatus = semiBusinessSuitBizData.getProAccountUpdateNotificationStatus()) != null) {
                iIntValue = proAccountUpdateNotificationStatus.intValue();
            } else {
                iIntValue = 0;
            }
            curUser.setProAccountUpdateNotificationStatus(iIntValue);
            IBABusinessSuitePageService iBABusinessSuitePageServiceLIZIZ = BABusinessSuitePageServiceImp.LIZIZ();
            if (iBABusinessSuitePageServiceLIZIZ != null) {
                C1248950ibd c1248950ibd = this.LLIZ;
                if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null) {
                    str = profileComponents.componentId;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "advanced_feature_base_item")) {
                    str2 = "business_suite_setting";
                } else {
                    str2 = "profile_interaction";
                }
                iBABusinessSuitePageServiceLIZIZ.LIZ(context, curUser, str2);
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        SemiBusinessSuitBizData semiBusinessSuitBizData = (SemiBusinessSuitBizData) C1250210idf.LIZ(nVar.toString(), SemiBusinessSuitBizData.class);
        this.LLL = semiBusinessSuitBizData;
        this.LLJILJIL = semiBusinessSuitBizData;
        this.LLJJJJ = semiBusinessSuitBizData;
    }
}
