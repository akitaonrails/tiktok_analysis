package com.ss.android.ugc.aweme.setting.page.playback;

import X.ActivityC21503719Dn;
import X.C01GW;
import X.C0OM1;
import X.C10EU;
import X.C1237450iJ5;
import X.C1244970iVD;
import X.C1308910kAL;
import X.C1474810oTv;
import X.C19292910dr;
import X.C19318810i2;
import X.C19319010i4;
import X.C19319110i5;
import X.C19EG;
import X.C1ER1;
import X.C2015707v1;
import X.C20684815ws;
import X.C2174441A8c;
import X.C452501pT;
import X.C638290P1v;
import X.C690950R8j;
import X.C713290RyR;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS162S0100000_28;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.page.accessibility.PipSettingUnit;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class PlaybackSettingPage extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiHELIOSOS40LWs8JS4qKiQvImEDJCQ1Ky4wIxYpPTs6JiIcKCg2";
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 531));
    public final boolean LLJIJIL = ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJII();
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return R.layout.f63;
    }

    public final C19318810i2 ZR() {
        return (C19318810i2) this.LLJI.getValue();
    }

    public PlaybackSettingPage() {
        this.LLJILJIL = C2174441A8c.LIZIZ.LIZ() && C690950R8j.LIZIZ && !C10EU.LJIILIIL();
        this.LLJILJILJ = C638290P1v.LIZ();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final void VR(Activity activity) {
        TuxNavBar tuxNavBar = (TuxNavBar) activity.findViewById(R.id.y1z);
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, activity.getString(2131838808), new AwS572S0100000_28(this, 530));
        tuxNavBar.setNavActions(c0om1);
        tuxNavBar.LJIIZILJ(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, activity);
        if (numLIZJ != null) {
            tuxNavBar.setNavBackground(numLIZJ.intValue());
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, activity);
        if (numLIZJ2 != null) {
            int iIntValue = numLIZJ2.intValue();
            View view = getView();
            if (view != null) {
                view.setBackgroundColor(iIntValue);
            }
        }
        if (this.LLJIJIL) {
            ZR().LIZ(new PipSettingUnit(this));
        }
        if (this.LLJIJIL && this.LLJILJIL && this.LLJILJILJ) {
            C19318810i2 c19318810i2ZR = ZR();
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            c19318810i2ZR.LIZ(new C19319110i5(new C19319010i4(activity.getString(2131822118), true, false, objArr, objArr2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr3, objArr4, 65532)));
        }
        if (this.LLJILJIL) {
            ZR().LIZ(new C19292910dr(this) { // from class: X.0zs3
                public final String LLILZIL;
                public final String LLILZLL;
                public final C419910GdJ LLIZ;

                @Override // X.C19292910dr
                /* JADX INFO: renamed from: LJII */
                public final C19319810iC LIZLLL() {
                    C419910GdJ c419910GdJ = this.LLIZ;
                    return new C19319810iC(C1E95.LIZIZ.LJIIZILJ(), this.LLILZIL, new ACListenerS162S0100000_28(this, 212), false, null, null, c419910GdJ, this.LLILZLL, false, false, false, null, 129784);
                }

                @Override // X.C19292910dr, X.AbstractC19318610i0
                public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
                    return LIZLLL();
                }

                {
                    super(null);
                    this.LLILZIL = this.getString(2131838807);
                    this.LLILZLL = this.getString(2131838806);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                    c419910GdJ.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
                    this.LLIZ = c419910GdJ;
                }
            });
        }
        if (this.LLJILJILJ) {
            ZR().LIZ(new C19292910dr(this) { // from class: X.0zsL
                public final String LLILZIL;
                public final String LLILZLL;
                public final C419910GdJ LLIZ;

                @Override // X.C19292910dr
                /* JADX INFO: renamed from: LJII */
                public final C19319810iC LIZLLL() {
                    C419910GdJ c419910GdJ = this.LLIZ;
                    return new C19319810iC(C1E95.LIZIZ.LJIIJJI(), this.LLILZIL, new ACListenerS162S0100000_28(this, 211), false, null, null, c419910GdJ, this.LLILZLL, false, false, false, null, 129784);
                }

                @Override // X.C19292910dr, X.AbstractC19318610i0
                public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
                    return LIZLLL();
                }

                {
                    super(null);
                    this.LLILZIL = this.getString(2131858394);
                    this.LLILZLL = this.getString(2131858393);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                    c419910GdJ.LIZ = R.raw.icon_speaker_2_fill_ltr;
                    this.LLIZ = c419910GdJ;
                }
            });
        }
        if (C713290RyR.LIZ) {
            ZR().LIZ(new AutoRotationSettingUnit(this));
        }
        if (C1ER1.LIZIZ.LJLJJL()) {
            ZR().LIZ(new C19292910dr(this) { // from class: X.10FM
                public final String LLILZIL;
                public final String LLILZLL;
                public final C419910GdJ LLIZ;

                @Override // X.C19292910dr
                /* JADX INFO: renamed from: LJII */
                public final C19319810iC LIZLLL() {
                    C419910GdJ c419910GdJ = this.LLIZ;
                    return new C19319810iC(C1255704vj.LIZ().LJJIL(), this.LLILZIL, new ACListenerS162S0100000_28(this, 213), false, null, null, c419910GdJ, this.LLILZLL, false, false, false, null, 129784);
                }

                @Override // X.C19292910dr, X.AbstractC19318610i0
                public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
                    return LIZLLL();
                }

                {
                    super(null);
                    this.LLILZIL = this.getString(2131858273);
                    this.LLILZLL = this.getString(2131858272);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                    c419910GdJ.LIZ = R.raw.icon_scan_magnifying_glass;
                    this.LLIZ = c419910GdJ;
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 24 && C1474810oTv.LJJJJZI() && C2015707v1.LIZ() == 2) {
            ZR().LIZ(new C1244970iVD(this));
        }
        ZR().LJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LLJIJIL) {
            C20684815ws.LJIJI("enter_playback_page", new Pair("settings_page", "enter_from"));
        }
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
