package com.ss.android.ugc.aweme.setting.page.playback;

import X.AbstractC19293010ds;
import X.C19292910dr;
import X.C19319810iC;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2531909w5;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C814420VxA;
import Y.ACListenerS146S0100000_11;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeAutoRotationServiceImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class AutoRotationSettingUnit extends C19292910dr {
    public boolean LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final C419910GdJ LLIZLLLIL;

    @Override // X.C19292910dr
    /* JADX INFO: renamed from: LJII */
    public final C19319810iC LIZLLL() {
        C419910GdJ c419910GdJ = this.LLIZLLLIL;
        return new C19319810iC(LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZLLL(), this.LLILZLL, new ACListenerS146S0100000_11(this, 23), false, null, null, c419910GdJ, this.LLIZ, false, false, false, null, 129784);
    }

    @Override // X.C19292910dr, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public AutoRotationSettingUnit(Fragment fragment) {
        super(null);
        this.LLILZLL = fragment.getString(2131826889);
        this.LLIZ = fragment.getString(2131826888);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c419910GdJ.LIZ = R.raw.icon_rotate_device_fill;
        this.LLIZLLLIL = c419910GdJ;
        fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.setting.page.playback.AutoRotationSettingUnit.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                String str;
                String str2;
                String str3;
                if (AutoRotationSettingUnit.this.LLILZIL && event == Lifecycle.Event.ON_DESTROY) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    String str4 = "on";
                    if (AutoRotationSettingUnit.this.LIZIZ().LLJJIJIL) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    c2344009Gk.LJIIIIZZ("setting_app_rotate_status", str);
                    c2344009Gk.LJIIIIZZ("set_method", "playback_setting");
                    if (C2531909w5.LIZIZ) {
                        str2 = "on";
                    } else {
                        str2 = "off";
                    }
                    c2344009Gk.LJIIIIZZ("default_app_rotate_status", str2);
                    if (LandscapeAutoRotationServiceImpl.LJIIIIZZ().LJII()) {
                        str3 = "on";
                    } else {
                        str3 = "off";
                    }
                    c2344009Gk.LJIIIIZZ("phone_rotate_status", str3);
                    if (!LandscapeAutoRotationServiceImpl.LJIIIIZZ().LIZLLL()) {
                        str4 = "off";
                    }
                    c2344009Gk.LJIIIIZZ("app_rotate_status", str4);
                    C20684815ws.LJIILLIIL("rotate_landscape_screen_setting", c2344009Gk.LIZ);
                }
            }
        });
    }
}
