package com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container;

import X.C01GW;
import X.C05OM;
import X.C103A;
import X.C106R;
import X.C106V;
import X.C108C;
import X.C108P;
import X.C10BK;
import X.C1163504gr;
import X.C1207604ny;
import X.C1888960zFu;
import X.C191870104m;
import X.C191871104n;
import X.C191880104w;
import X.C2097608Jq;
import X.C23250099c;
import X.C452501pT;
import X.EnumC191875104r;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class MainPrivacySettingFragmentV2 extends BasePrivacySettingFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s8Jzx9ODclPy4wMWs/LDsnISsrZzsjOyHELIOSZiKCwwJzAiPWEwJys4KCY9LTdiBC46JhU+IDkyKzwfLDsnISsrDz0yLygpJzsFeg==";
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 647));

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment
    public final void finish() {
        C108C c108c = C108C.LIZ;
        Context context = getContext();
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 646);
        c108c.getClass();
        C108C.LIZ(context, this, awS572S0100000_28);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.BasePrivacySettingFragmentV2, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C106R.LIZ.getClass();
        C1163504gr.LIZIZ.onEventV3("privacy_center_exit", C106R.LIZIZ());
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.BasePrivacySettingFragmentV2
    public final void NR() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C05OM(null), 3);
        if (C1207604ny.LIZ()) {
            C106V.LIZ.getClass();
            C191880104w c191880104wLIZIZ = C106V.LIZIZ();
            AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(434);
            c191880104wLIZIZ.getClass();
            C191870104m c191870104mLIZLLL = C191871104n.LIZLLL();
            EnumC191875104r enumC191875104r = EnumC191875104r.ALL;
            c191870104mLIZLLL.getClass();
            C191870104m.LIZIZ(enumC191875104r, "enter_privacy_main_page", false, aFwS217S0000000_28);
        } else {
            C106V.LIZ.getClass();
            C191880104w c191880104wLIZIZ2 = C106V.LIZIZ();
            AFwS217S0000000_28 aFwS217S0000000_282 = AFwS217S0000000_28.get$arr$(435);
            c191880104wLIZIZ2.getClass();
            C191880104w.LIZLLL("enter_privacy_main_page", aFwS217S0000000_282, true);
            C106V.LIZIZ().getClass();
            C191880104w.LIZIZ("enter_privacy_main_page", null);
        }
        C106V.LIZ.getClass();
        C106V.LIZIZ().getClass();
        C191871104n.LIZ().getClass();
        C1888960zFu.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.BasePrivacySettingFragmentV2, com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Intrinsics.LJFF(this.LLJI.getValue(), "system_notification")) {
            C1163504gr.LIZIZ.onEventV3("enter_privacy_setting", C2097608Jq.LJIIIIZZ(new Pair("enter_method", this.LLIZLLLIL.getValue()), new Pair("previous_page", this.LLJI.getValue())));
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.BasePrivacySettingFragmentV2, com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C108C c108c = C108C.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c108c.getClass();
        C108C.LIZIZ = jCurrentTimeMillis;
        C10BK c10bk = C10BK.LIZ;
        Context context = view.getContext();
        FragmentManager childFragmentManager = getChildFragmentManager();
        c10bk.getClass();
        C10BK.LIZIZ(context, childFragmentManager, "settings", null);
        C108P.LIZ.getClass();
        C108P.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.BasePrivacySettingFragmentV2
    public final void OR(String str, Function0<Unit> function0, Function0<Unit> function02) {
        C103A.LIZJ(null, "fallback_main", function0, function02);
    }
}
