package com.ss.android.ugc.aweme.setting.page.theme;

import X.AbstractC19318610i0;
import X.ActivityC21503719Dn;
import X.C01GW;
import X.C0OM1;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C19292910dr;
import X.C19318810i2;
import X.C19319010i4;
import X.C19319110i5;
import X.C19319810iC;
import X.C19EG;
import X.C20684815ws;
import X.C20692115y3;
import X.C20692215y4;
import X.C452501pT;
import X.C810670Vr7;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS133S0200000_31;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC836760Ws6
public final class ThemeSettingPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6HELIOSJiJiOS40LWs4ISo+LWsYISo+LRYpPTs6JiIcKCg2";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1013));
    public C19292910dr LLJIJIL;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f5l;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void VR(Activity activity) {
        boolean z;
        TuxNavBar tuxNavBar = (TuxNavBar) activity.findViewById(R.id.y1z);
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, activity.getString(2131830715), new AwS575S0100000_31(this, 1012));
        tuxNavBar.setNavActions(c0om1);
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(activity.findViewById(R.id.y1z).getContext(), 0, "sp_dark_mode");
        int i = sharedPreferencesLIZJ.getInt("dark_mode", 1);
        C19318810i2 c19318810i2 = (C19318810i2) this.LLJI.getValue();
        String string = activity.getString(2131830486);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        c19318810i2.LIZ(new C19319110i5(new C19319010i4(string, false, objArr, objArr2, objArr3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, true, objArr4, 49148)));
        ((C19318810i2) this.LLJI.getValue()).LIZ(new C20692115y3(new C20692215y4(false, false)));
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        this.LLJIJIL = new C19292910dr(new C19319810iC(z, activity.getString(2131830489), new ACListenerS133S0200000_31(this, sharedPreferencesLIZJ, 15), false, null, null, null, activity.getString(2131830490), false, false, false, null, 130040));
        C19318810i2 c19318810i22 = (C19318810i2) this.LLJI.getValue();
        AbstractC19318610i0<?> abstractC19318610i0 = this.LLJIJIL;
        if (abstractC19318610i0 == null) {
            abstractC19318610i0 = null;
        }
        c19318810i22.LIZ(abstractC19318610i0);
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
        ((C19318810i2) this.LLJI.getValue()).LJ();
        C20684815ws.onEventV3("tt_darkmode_open_setting_page");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C19EG activity = getActivity();
        if (activity instanceof ActivityC21503719Dn) {
            ((ActivityC21503719Dn) activity).powerHostActivityResult(i, i2, intent);
        }
    }
}
