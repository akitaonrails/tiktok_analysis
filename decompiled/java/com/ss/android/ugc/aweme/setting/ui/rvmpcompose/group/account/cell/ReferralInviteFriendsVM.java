package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell;

import X.C1668880tWw;
import X.C1669660tYC;
import X.C1926707gf;
import X.C19871212ow;
import X.C2015807v2;
import X.C2016307v7;
import X.C20684815ws;
import X.C844470XAv;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralInviteFriendsVM extends BaseCellSettingsVM<C2015807v2> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C844470XAv.LIZ.getClass();
        boolean z = !KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "referral_code", 0).getBoolean("referral_code_badge", false);
        C1926707gf c1926707gf = new C1926707gf(this);
        C1668880tWw c1668880tWw = C1669660tYC.N;
        return new C2015807v2(c1668880tWw, c1668880tWw, null, null, "", null, c1926707gf, new AwS617S0100000_3(this, 35), z);
    }

    public final void vQ2(Context context) {
        setState(AFwS231S0000000_3.get$arr$(63));
        C844470XAv.LIZ.getClass();
        KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "referral_code", 0).storeBoolean("referral_code_badge", true);
        String strLIZ = SharePrefCache.inst().getReferralEntrance().LIZ();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview");
        smartRouteBuildRoute.withParam("use_webview_title", true);
        smartRouteBuildRoute.withParam(UriProtector.parse(strLIZ));
        smartRouteBuildRoute.open();
        C20684815ws.LJIILLIIL("click_referral_invite_friends", C19871212ow.of("enter_from", "settings_page"));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2016307v7.LIZ[event.ordinal()] == 1) {
            setState(AFwS231S0000000_3.get$arr$(216));
        }
    }
}
