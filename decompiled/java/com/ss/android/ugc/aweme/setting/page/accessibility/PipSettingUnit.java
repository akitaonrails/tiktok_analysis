package com.ss.android.ugc.aweme.setting.page.accessibility;

import X.AbstractC19293010ds;
import X.C1833500xoS;
import X.C19292910dr;
import X.C19319810iC;
import X.C20684815ws;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C814420VxA;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class PipSettingUnit extends C19292910dr {
    public final Fragment LLILZIL;
    public final IPipFeedService LLILZLL;

    @Override // X.C19292910dr
    /* JADX INFO: renamed from: LJII */
    public final C19319810iC LIZLLL() {
        String string = this.LLILZIL.getString(2131840067);
        String string2 = this.LLILZIL.getString(2131840070);
        IPipFeedService iPipFeedService = (IPipFeedService) ServiceManager.get().getService(IPipFeedService.class);
        IPipFeedService iPipFeedService2 = (IPipFeedService) ServiceManager.get().getService(IPipFeedService.class);
        Context context = this.LLILZIL.getContext();
        if (context == null || !this.LLILZLL.LJIL(context)) {
            iPipFeedService2.LJIIJ(false);
        }
        boolean zLJIJJ = iPipFeedService.LJIJJ();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c419910GdJ.LIZ = R.raw.icon_rectangle_rectangle_fill_1_ltr;
        return new C19319810iC(zLJIJJ, string, new ACListenerS162S0100000_28(this, 71), false, null, null, c419910GdJ, string2, false, false, false, null, 129784);
    }

    @Override // X.C19292910dr, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public final void LJIIIZ() {
        LJIIIIZZ();
        this.LLILZLL.LJIIJ(LIZIZ().LLJJIJIL);
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("settings_page", "enter_from");
        pairArr[1] = new Pair(LIZIZ().LLJJIJIL ? "on" : "off", "to_status");
        C20684815ws.LJIJI("change_floating_window_status", pairArr);
    }

    public PipSettingUnit(Fragment fragment) {
        super(null);
        this.LLILZIL = fragment;
        this.LLILZLL = (IPipFeedService) ServiceManager.get().getService(IPipFeedService.class);
        fragment.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.setting.page.accessibility.PipSettingUnit.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                PipSettingUnit pipSettingUnit = PipSettingUnit.this;
                pipSettingUnit.getClass();
                IPipFeedService iPipFeedService = (IPipFeedService) ServiceManager.get().getService(IPipFeedService.class);
                Context context = pipSettingUnit.LLILZIL.getContext();
                if (context == null || !pipSettingUnit.LLILZLL.LJIL(context)) {
                    iPipFeedService.LJIIJ(false);
                }
                if (((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJJ()) {
                    return;
                }
                C1833500xoS.LIZ(PipSettingUnit.this.LIZIZ(), false);
            }
        });
    }
}
