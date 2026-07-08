package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import X.AnonymousClass0716;
import X.C0P0T;
import X.C14EU;
import X.C1618680sDy;
import X.C1618740sE4;
import X.C19308310gL;
import X.C19EG;
import X.C2274271E0b;
import X.C2277881EDy;
import X.C487280J9a;
import X.C736490Sul;
import X.InterfaceC1570250qxr;
import X.InterfaceC1570600qyQ;
import X.InterfaceC487330J9f;
import Y.ARunnableS124S0100000_24;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FissionPopupWindowHelp implements InterfaceC487330J9f, GenericLifecycleObserver {
    public UgAwemeActivitySetting LL;
    public C1618740sE4 LLILLJJLI;
    public final Fragment LLILLL;
    public final ScrollSwitchStateManager LLILZ;
    public final View LLILZIL;
    public View LLILZLL;
    public ViewStub LLIZ;
    public FeedPanelStateViewModel LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL = true;
    public boolean LLJILJIL;
    public final Function0<Boolean> LLJILJILJ;
    public boolean LLJILLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LLJILJIL = false;
        LIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        View viewFindViewById;
        InterfaceC1570600qyQ interfaceC1570600qyQLJIILL;
        this.LLJILJIL = true;
        if (this.LLJIJIL && ((Boolean) C2274271E0b.LJIIIIZZ.getValue()).booleanValue()) {
            this.LLJIJIL = false;
            return;
        }
        if (this.LLJIJIL && ((Boolean) AnonymousClass0716.LJIJI.getValue()).booleanValue()) {
            this.LLJIJIL = false;
            return;
        }
        C19EG activity = this.LLILLL.getActivity();
        if (activity != null) {
            IHomePageService iHomePageService = (IHomePageService) PluggableExtentionKt.pluggableSpi$default(IHomePageService.class, false, false, false, 14, null);
            if (iHomePageService == null || (interfaceC1570600qyQLJIILL = iHomePageService.LJIILL(activity)) == null || ((viewFindViewById = interfaceC1570600qyQLJIILL.Zn2()) == null && (viewFindViewById = interfaceC1570600qyQLJIILL.GA()) == null)) {
                viewFindViewById = activity.findViewById(R.id.nwe);
            }
        } else {
            viewFindViewById = null;
        }
        this.LLILZLL = viewFindViewById;
        this.LLIZ = (ViewStub) this.LLILZIL.findViewById(R.id.f2g);
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = (FeedPanelStateViewModel) ViewModelProviders.of(this.LLILLL.requireActivity()).get(FeedPanelStateViewModel.class);
        }
        if (C19308310gL.LJI) {
            UgAwemeActivitySetting ugAwemeActivitySetting = C19308310gL.LJII.LIZ;
            this.LL = ugAwemeActivitySetting;
            if (ugAwemeActivitySetting != null) {
                LIZIZ();
                return;
            }
            return;
        }
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        ((ArrayList) C19308310gL.LJII.LIZIZ).add(new WeakReference(new InterfaceC1570250qxr() { // from class: X.0sE5
            @Override // X.InterfaceC1570250qxr
            public final void LIZ(UgAwemeActivitySetting ugAwemeActivitySetting2) {
                FissionPopupWindowHelp fissionPopupWindowHelp = this.LIZ;
                fissionPopupWindowHelp.LL = ugAwemeActivitySetting2;
                if (ugAwemeActivitySetting2 != null && fissionPopupWindowHelp.LLJILJIL) {
                    fissionPopupWindowHelp.LIZIZ();
                }
            }
        }));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LIZ() {
        Context context;
        C0P0T c0p0t;
        C1618740sE4 c1618740sE4 = this.LLILLJJLI;
        if (c1618740sE4 == null || (context = c1618740sE4.LIZ) == null || !(context instanceof Activity) || ((Activity) context).isFinishing() || (c0p0t = c1618740sE4.LIZJ) == null) {
            return;
        }
        c0p0t.dismiss();
    }

    public final void LIZIZ() {
        ARunnableS124S0100000_24 aRunnableS124S0100000_24 = new ARunnableS124S0100000_24(this, 13);
        View view = this.LLILZLL;
        if (view != null) {
            HandlerHook.viewPostDelay(view, aRunnableS124S0100000_24, C1618740sE4.LIZLLL ? 0L : 4000L);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            HandlerHook.viewPostDelay(view2, new ARunnableS124S0100000_24(this, 12), C2277881EDy.LIZIZ.showBubbleInCouponKeva() ? 4000L : 0L);
        }
    }

    @C14EU
    public final void onScrolledToProfileTab(C736490Sul c736490Sul) {
        LIZ();
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        LIZ();
    }

    public FissionPopupWindowHelp(C1618680sDy c1618680sDy, Fragment fragment, View view, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LLILLL = fragment;
        this.LLILZ = scrollSwitchStateManager;
        this.LLILZIL = view;
        this.LLJILJILJ = c1618680sDy;
        Lifecycle lifecycle = fragment.getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C487280J9a.LIZIZ(fragment.requireActivity(), this);
    }
}
