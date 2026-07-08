package com.ss.android.ugc.profile.business.balance;

import X.C01GW;
import X.C1253840ijW;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.InterfaceC1253830ijV;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.profile.platform.standard.protocol.component.SemiPopProtocol;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public class SemiPopBalanceProtocol extends SemiPopProtocol {
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(346));

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public String getName() {
        return "settings_semi_pop_up_balance";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String str;
        boolean z;
        String str2;
        C19EG activity;
        C2344009Gk c2344009Gk = new C2344009Gk();
        boolean z2 = this instanceof AdvancedBalanceProtocol;
        if (z2) {
            str = "profile_common_function";
        } else {
            str = "setting_panel";
        }
        c2344009Gk.LJIIIIZZ("entrance", str);
        InterfaceC1253830ijV interfaceC1253830ijV = (InterfaceC1253830ijV) this.LLJL.getValue();
        if (interfaceC1253830ijV != null && interfaceC1253830ijV.LJIILJJIL()) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "1";
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_income_before", str2);
        InterfaceC1253830ijV interfaceC1253830ijV2 = (InterfaceC1253830ijV) this.LLJL.getValue();
        if (interfaceC1253830ijV2 == null || !interfaceC1253830ijV2.LJIIL()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("display_balance", str3);
        c2344009Gk.LJIIIIZZ("show_red_point", CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("livesdk_wallet_entrance_click", c2344009Gk.LIZ);
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1253840ijW.LIZIZ(activity, z2, false);
        }
        return true;
    }
}
