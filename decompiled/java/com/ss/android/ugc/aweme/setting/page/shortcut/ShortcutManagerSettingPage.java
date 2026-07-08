package com.ss.android.ugc.aweme.setting.page.shortcut;

import X.C01GW;
import X.C0OM1;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C19318810i2;
import X.C19EG;
import X.C20662315tF;
import X.C20693315yF;
import X.C2421209eE;
import X.C452501pT;
import X.C816050Vzn;
import X.EnumC1216700hlc;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS64S1200000_31;
import android.app.Activity;
import android.view.View;
import com.bytedance.hox.Hox;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS43S0001000_31;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS81S1000000_31;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC836760Ws6
public final class ShortcutManagerSettingPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOS40LWHELIOSs/ISAhPCY5PWEAICo+PSwmPAgtJy40LTcfLDsnISsrGS40LQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1011));
    public final Map<String, C20662315tF> LLJIJIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f69;
    }

    public final C19318810i2 aS() {
        return (C19318810i2) this.LLJI.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        for (Map.Entry entry : ((LinkedHashMap) this.LLJIJIL).entrySet()) {
            String str = (String) entry.getKey();
            C20662315tF c20662315tF = (C20662315tF) entry.getValue();
            C816050Vzn c816050VznLIZLLL = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LIZLLL(str);
            if (c816050VznLIZLLL == null) {
                return;
            }
            boolean z = c20662315tF.LIZIZ().LLJZ;
            boolean z2 = !c816050VznLIZLLL.LIZIZ();
            if (z2 != z) {
                bS(c20662315tF, z2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void VR(Activity activity) {
        C19EG c19eg;
        C20662315tF c20662315tFZR;
        C20662315tF c20662315tFZR2;
        C20662315tF c20662315tFZR3;
        C20662315tF c20662315tFZR4;
        TuxNavBar tuxNavBar = (TuxNavBar) activity.findViewById(R.id.y1z);
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, activity.getString(2131835553), new AwS575S0100000_31(this, 1010));
        tuxNavBar.setNavActions(c0om1);
        Activity activityLIZ = C2421209eE.LIZ();
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19eg);
            if ((hoxLIZ.GQ2("Shop") != null || hoxLIZ.GQ2("SHOP_MALL") != null) && (c20662315tFZR = ZR("shop", activity.getString(2131835556))) != null) {
                aS().LIZ(c20662315tFZR);
            }
            C20662315tF c20662315tFZR5 = ZR("search", activity.getString(2131835557));
            if (c20662315tFZR5 != null) {
                aS().LIZ(c20662315tFZR5);
            }
            if (hoxLIZ.GQ2("NOTIFICATION") != null && (c20662315tFZR4 = ZR("inbox", activity.getString(2131835555))) != null) {
                aS().LIZ(c20662315tFZR4);
            }
            if ((hoxLIZ.GQ2("FRIENDS_FEED") != null || hoxLIZ.GQ2("FRIENDS_TAB") != null) && (c20662315tFZR2 = ZR("friends", activity.getString(2131835558))) != null) {
                aS().LIZ(c20662315tFZR2);
            }
            if (hoxLIZ.GQ2("Following") != null && (c20662315tFZR3 = ZR("follow", activity.getString(2131835554))) != null) {
                aS().LIZ(c20662315tFZR3);
            }
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, activity);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            View view = getView();
            if (view != null) {
                view.setBackgroundColor(iIntValue);
            }
            ((TuxNavBar) activity.findViewById(R.id.y1z)).setNavBackground(iIntValue);
        }
        ((TuxNavBar) activity.findViewById(R.id.y1z)).LJIIZILJ(false);
        aS().LJ();
    }

    public final C20662315tF ZR(String str, String str2) {
        int i;
        C816050Vzn c816050VznLIZLLL = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LIZLLL(str);
        if (c816050VznLIZLLL == null) {
            return null;
        }
        if (c816050VznLIZLLL.LIZIZ()) {
            i = 2131835552;
        } else {
            i = 2131835551;
        }
        String string = getString(i);
        boolean zLIZIZ = c816050VznLIZLLL.LIZIZ();
        C20662315tF c20662315tF = new C20662315tF(new C20693315yF(string, zLIZIZ ? 1 : 0, str2, EnumC1216700hlc.NORMAL, true, new ACListenerS64S1200000_31(this, c816050VznLIZLLL, str, 2), null, false, null, true, false, false, false, false, !c816050VznLIZLLL.LIZIZ()));
        this.LLJIJIL.put(str, c20662315tF);
        return c20662315tF;
    }

    public final void bS(C20662315tF c20662315tF, boolean z) {
        if (getContext() == null) {
            return;
        }
        if (z) {
            c20662315tF.LJI(new AwS43S0001000_31(0, 3));
            c20662315tF.LJI(new AwS81S1000000_31(getString(2131835551), 11));
        } else {
            c20662315tF.LJI(new AwS43S0001000_31(1, 3));
            c20662315tF.LJI(new AwS81S1000000_31(getString(2131835552), 11));
        }
        c20662315tF.LJI(new AwS43S0010000_31(z, 17));
    }
}
