package com.ss.android.ugc.aweme.commercialize.ba.impl.ui;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C12ES;
import X.C1911600zqQ;
import X.C2188811AlT;
import X.C497820Jfg;
import X.C596440NaM;
import X.C596450NaN;
import X.C7740030o;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.BATab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class BusinessSuiteActivityArgs implements IRouteAction {
    public static final Keva LL = Keva.getRepo("BusinessAccountActivity");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.bytedance.router.SmartRoute] */
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Boolean boolValueOf;
        String string;
        int promotePayType;
        List<String> permissionList;
        int iLJIILJJIL;
        ?? BooleanValue;
        BATab bATab;
        Boolean showBATab;
        if (context == null) {
            return Boolean.FALSE;
        }
        if (bundle != null) {
            boolValueOf = Boolean.valueOf(bundle.getBoolean("new_order", true));
        } else {
            boolValueOf = null;
        }
        if (bundle != null) {
            string = bundle.getString("enter_from", "personal_homepage");
        } else {
            string = null;
        }
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("business_suite_page_schema", "aweme://lynxview/?channel=tiktok_ba_lynx_next&bundle=pages%2Fba%2Ftemplate.js&group=tiktok_ba_lynx_next&pageModule=navigation&webview_clear_color=1&dynamic=3&hide_nav_bar=1&use_spark=1&trans_status_bar=1&hide_status_bar=0&enable_canvas=1&status_bar_color=00000000&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Fba_lynx_next%2Ftiktok_ba_lynx_next%2Fpages%2Fba%2Ftemplate.js");
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        boolean zLIZIZ = C1911600zqQ.LIZIZ.LIZIZ();
        int accountType = curUser.getAccountType();
        if (zLIZIZ && curUser.getCommerceUserInfo() != null) {
            promotePayType = curUser.getCommerceUserInfo().getPromotePayType();
        } else {
            promotePayType = 0;
        }
        C596450NaN c596450NaN = C596440NaM.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ba_branded_content_tip_showed");
        sbLIZ.append(curUser.getUid());
        int i = !c596450NaN.LIZ(Boolean.FALSE, C2188811AlT.LIZIZ(sbLIZ)).booleanValue() ? 1 : 0;
        Gson gson = C7740030o.LIZ().getGson();
        BizAccountInfo bizAccountInfo = curUser.getBizAccountInfo();
        if (bizAccountInfo != null) {
            permissionList = bizAccountInfo.getPermissionList();
        } else {
            permissionList = null;
        }
        String json = GsonProtectorUtils.toJson(gson, permissionList);
        int iLIZJ = C497820Jfg.LIZJ(context);
        if (iLIZJ > 0) {
            iLJIILJJIL = C12ES.LJIILJJIL(iLIZJ, context);
        } else {
            iLJIILJJIL = 44;
        }
        ?? BuildRoute = SmartRouter.buildRoute(context, strLJI);
        Boolean bool = Boolean.TRUE;
        BuildRoute.withParam("new_order", Intrinsics.LJFF(boolValueOf, bool) ? 1 : 0);
        BuildRoute.withParam("enter_from", string);
        BuildRoute.withParam("permission_list", json);
        BuildRoute.withParam("video_counts", ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJIIL());
        BuildRoute.withParam("has_promote", zLIZIZ ? 1 : 0);
        BuildRoute.withParam("promote_version", promotePayType);
        BuildRoute.withParam("user_account_type", accountType);
        BuildRoute.withParam("status_bar_height", iLJIILJJIL);
        Keva keva = LL;
        BuildRoute.withParam("shown_lead_red_dot", keva.getBoolean("isGetLeadsBadgeShown", false) ? 1 : 0);
        BuildRoute.withParam("shown_branded_content_bubble", i);
        TabSetting tabSetting = curUser.getTabSetting();
        if (tabSetting != null && (bATab = tabSetting.baTab) != null && (showBATab = bATab.getShowBATab()) != null) {
            BooleanValue = showBATab.booleanValue();
        } else {
            BooleanValue = 0;
        }
        BuildRoute.withParam("has_biz_page_entrance", BooleanValue);
        BuildRoute.open();
        if (!keva.getBoolean("isGetLeadsBadgeShown", false)) {
            keva.storeBoolean("isGetLeadsBadgeShown", true);
        }
        if (i != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ba_branded_content_tip_showed");
            sbLIZ2.append(curUser.getUid());
            c596450NaN.LIZLLL(bool, C2188811AlT.LIZIZ(sbLIZ2));
        }
        return bool;
    }
}
