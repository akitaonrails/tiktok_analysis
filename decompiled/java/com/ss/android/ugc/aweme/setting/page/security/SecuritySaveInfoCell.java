package com.ss.android.ugc.aweme.setting.page.security;

import X.C036E;
import X.C0XGR;
import X.C0XQ5;
import X.C0XWC;
import X.C0XWD;
import X.C0XWJ;
import X.C127A;
import X.C127K;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C20334214hQ;
import X.C20334314hR;
import X.C20684815ws;
import X.C785410UrT;
import X.C786410Ut5;
import X.C846430XIj;
import X.C985403tE;
import X.DialogC1389620mGW;
import Y.AObserverS131S0300000_31;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.page.base.SwitchCell;
import com.ss.android.ugc.aweme.user.UserStore;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SecuritySaveInfoCell extends SwitchCell<C20334314hR> {
    public DialogC1389620mGW LLILZ;

    public final boolean P5() {
        try {
            if (C036E.LIZ.LIZIZ()) {
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Activity activity = this.LL;
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell
    public final void N5() {
        String uniqueId;
        C127K c127k = this.LLILLJJLI;
        if (c127k != null) {
            UserStore.LIZ.getClass();
            User userLIZJ = UserStore.LIZJ(false);
            if (userLIZJ == null || (uniqueId = userLIZJ.getUniqueId()) == null) {
                return;
            }
            c127k.setSubtitle(c127k.getContext().getString(2131838772, uniqueId));
        }
    }

    public final void R5() {
        DialogC1389620mGW dialogC1389620mGW = this.LLILZ;
        if (dialogC1389620mGW == null || !dialogC1389620mGW.isShowing()) {
            return;
        }
        dialogC1389620mGW.dismiss();
        C785410UrT.LIZ(dialogC1389620mGW);
    }

    public final void U5() {
        DialogC1389620mGW dialogC1389620mGW;
        if (this.LLILZ == null) {
            Activity activity = this.LL;
            this.LLILZ = activity != null ? new DialogC1389620mGW(activity) : null;
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LLILZ;
        if (dialogC1389620mGW2 == null || dialogC1389620mGW2.isShowing() || (dialogC1389620mGW = this.LLILZ) == null) {
            return;
        }
        C786410Ut5.J4(dialogC1389620mGW);
    }

    public final void S5(int i) {
        Activity activity = this.LL;
        if (activity == null) {
            return;
        }
        if (i == 2029) {
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJFF(2131839107);
            c1397580mTM.LJII = true;
            c1397580mTM.LJIIIIZZ = true;
            c1397580mTM.LIZ(2131839106);
            C985403tE.LIZ(c1397580mTM, AFwS276S0000000_31.get$arr$(169));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        Activity activity2 = this.LL;
        if (activity2 != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity2);
            c1389890mGx.LJIIIZ(2131839108);
            c1389890mGx.LJIIJJI();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: T5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(C20334314hR c20334314hR) {
        LifecycleOwner parent;
        super.onBindItemView(c20334314hR);
        if (!c20334314hR.LLILZ || (parent = getParent()) == null) {
            return;
        }
        C127A c127a = this.LLILLL;
        if (c127a != null) {
            c127a.LJIIIZ(false);
        }
        IOneClickLoginService iOneClickLoginService = (IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class);
        iOneClickLoginService.LJIIZILJ().observe(parent, new AObserverS131S0300000_31(iOneClickLoginService, parent, this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        String oneClickLoginToken;
        String oneClickLoginToken2;
        C20334214hQ c20334214hQ = (C20334214hQ) getItem();
        if (c20334214hQ != null) {
            z = c20334214hQ.LLILLL;
        } else {
            z = false;
        }
        if (z) {
            C0XWJ.LIZ.getClass();
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            C20684815ws.LJIILLIIL("save_login_info_toggle", c0xgr.LIZ);
            if (P5()) {
                String strLIZLLL = C0XQ5.LIZLLL();
                BaseLoginMethod baseLoginMethodLIZLLL = ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZLLL();
                if (!C846430XIj.LIZIZ() && (baseLoginMethodLIZLLL == null || !Intrinsics.LJFF(baseLoginMethodLIZLLL.isOneClickLogin(), Boolean.TRUE) || (oneClickLoginToken2 = baseLoginMethodLIZLLL.getOneClickLoginToken()) == null || oneClickLoginToken2.length() == 0)) {
                    return;
                }
                U5();
                IOneClickLoginService iOneClickLoginService = (IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class);
                if (baseLoginMethodLIZLLL != null) {
                    oneClickLoginToken = baseLoginMethodLIZLLL.getOneClickLoginToken();
                } else {
                    oneClickLoginToken = null;
                }
                iOneClickLoginService.LJIILL(oneClickLoginToken, strLIZLLL, true, C0XWC.SETTING, "settings_page", new AwS575S0100000_31(this, 22), new AwS610S0100000_31(this, 17));
                return;
            }
            return;
        }
        C0XWJ.LIZ.getClass();
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("save_login_info_toggle", c0xgr2.LIZ);
        if (!P5()) {
            return;
        }
        U5();
        ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIIIIZZ(false, C0XWD.SETTING, "settings_page", null, new AwS575S0100000_31(this, 23), new AwS610S0100000_31(this, 13));
    }
}
