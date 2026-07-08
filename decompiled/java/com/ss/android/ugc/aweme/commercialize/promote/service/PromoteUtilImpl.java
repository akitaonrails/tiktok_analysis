package com.ss.android.ugc.aweme.commercialize.promote.service;

import X.AbstractC848400XPy;
import X.C09JN;
import X.C0X2A;
import X.C0XQ7;
import X.C11S5;
import X.C1395960mQk;
import X.C13LP;
import X.C1701940uOG;
import X.C1911510zqH;
import X.C1911520zqI;
import X.C1911570zqN;
import X.C20684815ws;
import X.C2344009Gk;
import X.C844470XAv;
import Y.ACListenerS130S0200000_28;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEligibleCheckModel;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventCategories;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventCommon;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventData;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventModel;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.PromoteEventPayload;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.commercialize.promote.service.PromoteUtilImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteUtilImpl implements IPromoteUtil {
    public static final Map<String, Boolean> LIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final void LIZJ() {
        C1911520zqI.LIZ.getClass();
        C1911520zqI.LIZIZ.checkUserPromoteEligible().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0zK6
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PromoteUtilImpl@49f8.refreshCurUserPromoteEligible$1");
                PromoteEligibleCheckModel promoteEligibleCheckModel = (PromoteEligibleCheckModel) obj;
                if (C123100dR.LIZ(C1911570zqN.LJI())) {
                    PromoteUtilImpl.LIZ.put(C1911570zqN.LJI(), Boolean.valueOf(promoteEligibleCheckModel.getShowPromote()));
                }
                C1C7U.LIZIZ("PromoteUtilImpl@49f8.refreshCurUserPromoteEligible$1");
            }
        }, new C09JN() { // from class: X.0ylx
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PromoteUtilImpl@49f8.refreshCurUserPromoteEligible$2");
                C1C7U.LIZIZ("PromoteUtilImpl@49f8.refreshCurUserPromoteEligible$2");
            }
        });
    }

    public static boolean LJIIIZ() {
        if (C1911570zqN.LJI().length() == 0) {
            return false;
        }
        Boolean bool = (Boolean) ((LinkedHashMap) LIZ).get(C1911570zqN.LJI());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LIZIZ() {
        User curUser = C0XQ7.LJFF().getCurUser();
        if (curUser == null || curUser.getCommerceUserInfo() == null) {
            return false;
        }
        return curUser.getCommerceUserInfo().hasPromote;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LIZLLL() {
        if (C1911570zqN.LJI().length() == 0) {
            return false;
        }
        return ((LinkedHashMap) LIZ).get(C1911570zqN.LJI()) == null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("promote_other_no_show_in_fyp", false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final String LJIIIIZZ() {
        return C1395960mQk.LIZ().get("ads_subscription_cta");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LIZ(Aweme aweme) {
        PromoteModel promoteModel;
        if (aweme != null && (promoteModel = aweme.getPromoteModel()) != null && promoteModel.isPromoteAdLabel()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final View.OnClickListener LJFF(Aweme aweme) {
        return new ACListenerS130S0200000_28(this, aweme, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(com.ss.android.ugc.aweme.feed.model.Aweme r9, X.C21279718Pj r10) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.promote.service.PromoteUtilImpl.LJI(com.ss.android.ugc.aweme.feed.model.Aweme, X.18Pj):boolean");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final void LJII(final String str, final String str2, final String str3) {
        String str4;
        String str5;
        SettingsManager.LIZLLL().getClass();
        String str6 = "";
        String strLJI = SettingsManager.LJI("promote_entrance_click_url", "");
        if (strLJI == null) {
            strLJI = "";
        }
        if (TextUtils.isEmpty(strLJI)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("session_id", str);
            c2344009Gk.LJIIIIZZ("is_success", CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LJIIIIZZ("promote_by", str3);
            c2344009Gk.LJIIIIZZ("store_country", C0X2A.LIZJ);
            C20684815ws.LJIILLIIL("promote_entrance_click", c2344009Gk.LIZ);
            return;
        }
        if (C13LP.LJJJJ(str2, C1911510zqH.LIZ)) {
            str4 = "delivery";
        } else if (!C13LP.LJJJJ(str2, C1911510zqH.LIZIZ)) {
            str4 = "";
        } else {
            str4 = "promote-center";
        }
        C844470XAv.LIZ.getClass();
        PromoteEventCommon promoteEventCommon = new PromoteEventCommon("tiktok_promote_lynx", "www.tiktok.com", "SDK_SLARDAR_WEB", "production", str, String.valueOf(C844470XAv.LJIIJ), C844470XAv.LJFF(), CardStruct.IStatusCode.DEFAULT, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (str2 == null) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if (str3 != null) {
            str6 = str3;
        }
        String str7 = str6;
        PromoteEventData promoteEventData = new PromoteEventData("batch", Collections.singletonList(new PromoteEventModel("custom", promoteEventCommon, new PromoteEventPayload("promote_entrance_click", "event", new PromoteEventCategories(str5, str7, C0X2A.LIZJ, String.valueOf(C844470XAv.LJIIJ), C844470XAv.LJFF(), CardStruct.IStatusCode.DEFAULT, str4)))));
        C1911520zqI.LIZ.getClass();
        C1911520zqI.LIZIZ.postPromoteClickToFE(strLJI, promoteEventData).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0yly
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PromoteUtilImpl@49f8.uploadPromoteClickToFE$1");
                C1C7U.LIZIZ("PromoteUtilImpl@49f8.uploadPromoteClickToFE$1");
            }
        }, new C09JN() { // from class: X.0zqP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1494690ozz c1494690ozz;
                C1C7U.LIZ("PromoteUtilImpl@49f8.uploadPromoteClickToFE$2");
                Throwable th = (Throwable) obj;
                if ((th instanceof C1494690ozz) && (c1494690ozz = (C1494690ozz) th) != null && c1494690ozz.getStatusCode() == 204) {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", str2);
                    c2344009Gk2.LJIIIIZZ("session_id", str);
                    c2344009Gk2.LJIIIIZZ("is_success", "1");
                    c2344009Gk2.LJIIIIZZ("promote_by", str3);
                    c2344009Gk2.LJIIIIZZ("store_country", C0X2A.LIZJ);
                    C20684815ws.LJIILLIIL("promote_entrance_click", c2344009Gk2.LIZ);
                } else {
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJIIIIZZ("enter_from", str2);
                    c2344009Gk3.LJIIIIZZ("session_id", str);
                    c2344009Gk3.LJIIIIZZ("is_success", CardStruct.IStatusCode.DEFAULT);
                    c2344009Gk3.LJIIIIZZ("promote_by", str3);
                    c2344009Gk3.LJIIIIZZ("store_country", C0X2A.LIZJ);
                    C20684815ws.LJIILLIIL("promote_entrance_click", c2344009Gk3.LIZ);
                }
                C1C7U.LIZIZ("PromoteUtilImpl@49f8.uploadPromoteClickToFE$2");
            }
        });
    }
}
