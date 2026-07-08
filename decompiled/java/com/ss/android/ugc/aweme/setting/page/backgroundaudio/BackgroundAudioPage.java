package com.ss.android.ugc.aweme.setting.page.backgroundaudio;

import X.C01GW;
import X.C0OM1;
import X.C1237450iJ5;
import X.C1911000zpS;
import X.C19318810i2;
import X.C19319010i4;
import X.C19319110i5;
import X.C20684815ws;
import X.C20692415y6;
import X.C2344009Gk;
import X.C452501pT;
import X.EnumC20692515y7;
import X.EnumC20692615y8;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC836760Ws6
public final class BackgroundAudioPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOS40LWHELIOSsuKCw4LzcjPCE3KTAoICB9CiQvIighJzAiLQ4mLCwjGS40LQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1007));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1006));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f7_;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void SR() {
        super.SR();
        Boolean value = ((BGAudioViewModel) this.LLJI.getValue()).LL.getValue();
        EnumC20692615y8 value2 = ((BGAudioViewModel) this.LLJI.getValue()).LLILLJJLI.getValue();
        if (value != null) {
            String str = value.booleanValue() ? "on" : "off";
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            c2344009Gk.LJIIIIZZ("play_order", value2 != null ? value2.toMobString() : null);
            C20684815ws.LJIILLIIL("background_audio_status", c2344009Gk.LIZ);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void VR(Activity activity) {
        C19318810i2 c19318810i2 = (C19318810i2) this.LLJIJIL.getValue();
        c19318810i2.LIZ(new C1911000zpS(this));
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        c19318810i2.LIZ(new C19319110i5(new C19319010i4(activity.getString(2131826771), false, objArr, objArr2, objArr3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr4, objArr5, 65534)));
        c19318810i2.LIZ(new C20692415y6(this, EnumC20692515y7.PLAY_IN_ORDER));
        c19318810i2.LIZ(new C20692415y6(this, EnumC20692515y7.REPEAT));
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.y1z);
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, "", new AwS575S0100000_31(this, 1005));
        tuxNavBar.setNavActions(c0om1);
    }
}
