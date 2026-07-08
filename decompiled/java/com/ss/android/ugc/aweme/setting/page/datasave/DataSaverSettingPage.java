package com.ss.android.ugc.aweme.setting.page.datasave;

import X.C01GW;
import X.C0OM1;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C19318810i2;
import X.C20684815ws;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnClickListenerC1904600zf8;
import X.ViewOnClickListenerC1909540zn6;
import android.app.Activity;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class DataSaverSettingPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOSHELIOS40LWsoKDsyOyQ6LGEXKTEtGi4lLTcfLDsnISsrGS40LQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 529));
    public final String LLJIJIL = "enter_data_use";

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f5y;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void VR(Activity activity) {
        int i;
        boolean zEnable = SpeedModeServiceImpl.LIZLLL().enable();
        if (!zEnable) {
            i = 2131830502;
        } else {
            i = 2131848353;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) activity.findViewById(R.id.y1z);
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, activity.getString(i), new AwS572S0100000_28(this, 528));
        tuxNavBar.setNavActions(c0om1);
        ((C19318810i2) this.LLJI.getValue()).LIZ(new ViewOnClickListenerC1909540zn6(this));
        if (zEnable) {
            ((C19318810i2) this.LLJI.getValue()).LIZ(new ViewOnClickListenerC1904600zf8(this));
        }
        if (zEnable) {
            C786410Ut5.LLLLZLL((TuxTextView) activity.findViewById(R.id.zb1), 0);
        }
        C20684815ws.onEventV3(this.LLJIJIL);
        int iIntValue = C1308910kAL.LIZJ(R.attr.zp, activity).intValue();
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(iIntValue);
        }
        TuxNavBar tuxNavBar2 = (TuxNavBar) activity.findViewById(R.id.y1z);
        tuxNavBar2.setNavBackground(iIntValue);
        tuxNavBar2.LJIIZILJ(false);
        ((C19318810i2) this.LLJI.getValue()).LJ();
    }
}
