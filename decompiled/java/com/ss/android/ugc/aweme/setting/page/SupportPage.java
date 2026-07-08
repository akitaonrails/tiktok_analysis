package com.ss.android.ugc.aweme.setting.page;

import X.C01GW;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12N4;
import X.C19318810i2;
import X.C20684815ws;
import X.C20694015yM;
import X.C419910GdJ;
import X.C452501pT;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnClickListenerC2026707wn;
import Y.ACListenerS147S0100000_12;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class SupportPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSYpPTs6JiJiOS40LWsfPD8jJzc4GS40LQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public TuxNavBar LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 590));
    public C12N4 LLJILJIL;
    public C12N4 LLJILJILJ;
    public C12N4 LLJILLL;
    public C12N4 LLJJ;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f78;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.my);
        }
        super.Q9(activity);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        NR(AFwS245S0000000_12.get$arr$(86));
        View viewFindViewById = this.LLJI;
        C12N4 c12n4 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).LJIIZILJ(false);
        View viewFindViewById2 = this.LLJI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.p15);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJI = (TuxNavBar) viewFindViewById2;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LJIIIIZZ = getString(2131823332);
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 589));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131847819);
        c0om1.LIZJ = c1250250idj;
        ((TuxNavBar) viewFindViewById2).setNavActions(c0om1);
        String string = getString(2131834566);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_question_mark_circle_fill_ltr;
        this.LLJILJIL = new C12N4(new C20694015yM(string, c419910GdJ, new ACListenerS147S0100000_12(this, 268), "helper_center", false, false, null, 16777200));
        String string2 = getString(2131846709);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_shield_plus_fill;
        this.LLJILJILJ = new C12N4(new C20694015yM(string2, c419910GdJ2, new ACListenerS147S0100000_12(this, 269), "safety_center", false, false, null, 16777200));
        String string3 = getString(2131845049);
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_lock_large_fill;
        this.LLJILLL = new C12N4(new C20694015yM(string3, c419910GdJ3, new ACListenerS147S0100000_12(this, 270), "privacy_center", false, false, null, 16777200));
        String string4 = getString(2131845084);
        C419910GdJ c419910GdJ4 = new C419910GdJ();
        c419910GdJ4.LIZ = R.raw.icon_shield_tick_fill;
        ViewOnClickListenerC2026707wn viewOnClickListenerC2026707wn = new View.OnClickListener() { // from class: X.07wn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view4.getContext(), "//privacy/checkup");
                smartRouteBuildRoute.withParam("enter_from", "support_page");
                smartRouteBuildRoute.open();
                C20684815ws.LJFF().submit(new Runnable() { // from class: X.00kl
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SupportPage@7722.onViewCreated$10$1");
                        try {
                            C20684815ws.LJIILLIIL("click_privacy_checkup", C2097608Jq.LJIIJ(new Pair("enter_from", "settings_page")));
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SupportPage@7722.onViewCreated$10$1");
                    }
                });
            }
        };
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(0, "checkup");
        if (privacySettingsRestrictionItemLJIIIZ != null && privacySettingsRestrictionItemLJIIIZ.showType == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJ = new C12N4(new C20694015yM(string4, c419910GdJ4, viewOnClickListenerC2026707wn, "privacy_checkup", false, z, new ACListenerS147S0100000_12(this, 267), 16121840));
        C19318810i2 c19318810i2 = (C19318810i2) this.LLJIJIL.getValue();
        C12N4 c12n42 = this.LLJILJIL;
        if (c12n42 == null) {
            c12n42 = null;
        }
        c19318810i2.LIZ(c12n42);
        C19318810i2 c19318810i22 = (C19318810i2) this.LLJIJIL.getValue();
        C12N4 c12n43 = this.LLJILJILJ;
        if (c12n43 == null) {
            c12n43 = null;
        }
        c19318810i22.LIZ(c12n43);
        C19318810i2 c19318810i23 = (C19318810i2) this.LLJIJIL.getValue();
        C12N4 c12n44 = this.LLJILLL;
        if (c12n44 == null) {
            c12n44 = null;
        }
        c19318810i23.LIZ(c12n44);
        if (ComplianceServiceProvider.LJIJJ().LJIL()) {
            C19318810i2 c19318810i24 = (C19318810i2) this.LLJIJIL.getValue();
            C12N4 c12n45 = this.LLJJ;
            if (c12n45 != null) {
                c12n4 = c12n45;
            }
            c19318810i24.LIZ(c12n4);
            C20684815ws.LJFF().submit(new Runnable() { // from class: X.00ki
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SupportPage@7722.trackPrivacyCheckup$1");
                    try {
                        C20684815ws.LJIILLIIL("show_privacy_checkup", C2097608Jq.LJIIJ(new Pair("enter_from", "settings_page")));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SupportPage@7722.trackPrivacyCheckup$1");
                }
            });
        }
        ((C19318810i2) this.LLJIJIL.getValue()).LJ();
        C20684815ws.LJFF().submit(new Runnable() { // from class: X.00kj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SupportPage@7722.trackHelpCenter$1");
                try {
                    C20684815ws.LJIILLIIL("show_help_center", C2097608Jq.LJIIJ(new Pair("enter_from", "settings_page")));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SupportPage@7722.trackHelpCenter$1");
            }
        });
        C20684815ws.LJFF().submit(new Runnable() { // from class: X.00kf
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SupportPage@7722.trackPrivacyCenter$1");
                try {
                    C20684815ws.LJIILLIIL("show_privacy_center", C2097608Jq.LJIIJ(new Pair("enter_from", "settings_page")));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SupportPage@7722.trackPrivacyCenter$1");
            }
        });
        C20684815ws.LJFF().submit(new Runnable() { // from class: X.00qG
            public static void LIZ() {
                C20684815ws.LJIILLIIL("show_safety_center", C2097608Jq.LJIIJ(new Pair("enter_from", "settings_page"), new Pair("entrance", "settings_page"), new Pair("origin_refer", ""), new Pair("page_id", "")));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SupportPage@7722.trackSafetyCenter$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SupportPage@7722.trackSafetyCenter$1");
            }
        });
    }
}
