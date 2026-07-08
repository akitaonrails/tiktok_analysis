package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.AnonymousClass0956;
import X.C054G;
import X.C095D;
import X.C09AL;
import X.C09IC;
import X.C1322090kVb;
import X.C1324800kZy;
import X.C1619980sG4;
import X.C1640790snd;
import X.C1641190soH;
import X.C1641200soI;
import X.C1641230soL;
import X.C1662850tND;
import X.C1701940uOG;
import X.C1954807lC;
import X.C2022007w2;
import X.C2108108Nr;
import X.C2176211AEx;
import X.C2197608jG;
import X.C2296808zG;
import X.C300250Bpn;
import X.C418440Gaw;
import X.C443120HZe;
import X.C538770LBb;
import X.C786410Ut5;
import X.C861640Xr8;
import X.EnumC1641520soo;
import X.InterfaceC1320850kTb;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public final class GifEntranceBannerController {
    public final FrameLayout LIZ;
    public final C1662850tND LIZIZ;
    public final Pair<Integer, Integer> LIZJ;
    public final List<C1324800kZy> LIZLLL = new ArrayList();
    public int LJ = -1;
    public boolean LJFF;
    public AnonymousClass0956 LJI;
    public final C538770LBb<Boolean> LJII;
    public boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public boolean LJIIJ;
    public C054G LJIIJJI;

    public final C443120HZe<Integer, Float, Float> LIZIZ() {
        float fIntValue = (this.LIZIZ.getWidth() == 0 || this.LIZIZ.getHeight() == 0) ? this.LIZJ.getFirst().intValue() : this.LIZIZ.getWidth();
        if (C1641230soL.LIZIZ()) {
            float screenWidth = C1641230soL.LIZ() ? 1.09375f : ScreenUtils.getScreenWidth(this.LIZIZ.getContext()) / C418440Gaw.LIZIZ(390);
            int iLIZIZ = (int) (C418440Gaw.LIZIZ(34) * screenWidth);
            float fLIZIZ = C418440Gaw.LIZIZ(32) * screenWidth;
            float fSin = (float) (((double) iLIZIZ) * Math.sin(0.17453292519943295d) * ((double) 0.5f));
            return new C443120HZe<>(Integer.valueOf(iLIZIZ), Float.valueOf(((this.LIZIZ.getWidth() - (2.5714285f * fLIZIZ)) * 0.5f) + (C418440Gaw.LIZIZ(8) * screenWidth) + fSin), Float.valueOf(((((this.LIZIZ.getHeight() + fLIZIZ) * 0.5f) - (C418440Gaw.LIZIZ(8) * screenWidth)) - iLIZIZ) + fSin));
        }
        if (!C300250Bpn.LIZ()) {
            return new C443120HZe<>(Integer.valueOf((int) (0.325f * fIntValue)), Float.valueOf(0.18f * fIntValue), Float.valueOf(fIntValue * 0.26f));
        }
        int i = (int) (0.325f * fIntValue);
        float fSin2 = (float) (((double) i) * Math.sin(0.17453292519943295d) * ((double) 0.5f));
        return new C443120HZe<>(Integer.valueOf(i), Float.valueOf((0.18f * fIntValue) + fSin2), Float.valueOf((fIntValue * 0.26f) + fSin2));
    }

    public final void LIZLLL() {
        Animatable animatableLIZ;
        if (C2176211AEx.LJ()) {
            Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
            if (it2.hasNext()) {
                C1324800kZy c1324800kZy = (C1324800kZy) it2.next();
                LIZ(c1324800kZy);
                C786410Ut5.t1(c1324800kZy, 0);
                return;
            }
        }
        if (((ArrayList) this.LIZLLL).isEmpty()) {
            return;
        }
        if (!C2296808zG.LJI(this.LJIIJJI)) {
            this.LJIIJJI = C2296808zG.LIZ(C2108108Nr.LIZ.plus(new C09AL()));
        }
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Iterator it3 = ((ArrayList) this.LIZLLL).iterator();
        while (it3.hasNext()) {
            InterfaceC1320850kTb controller = ((C1322090kVb) it3.next()).getController();
            if (controller != null && (animatableLIZ = controller.LIZ()) != null) {
                animatableLIZ.start();
            }
        }
        this.LJI = C09IC.LJJI(this.LJIIJJI, new C861640Xr8(new C1641190soH(this, null), new C095D(new C2197608jG(this, null))));
    }

    public final void LIZ(C1324800kZy c1324800kZy) {
        if (this.LIZIZ.getWidth() != 0 && this.LIZIZ.getHeight() != 0) {
            if (!C300250Bpn.LIZ() && !C1641230soL.LIZIZ()) {
                if (c1324800kZy.getTranslationX() != this.LIZIZ.getWidth() * 0.18f) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324800kZy);
                    c1324800kZy.setTranslationX(this.LIZIZ.getWidth() * 0.18f);
                }
                if (c1324800kZy.getTranslationY() != this.LIZIZ.getHeight() * 0.26f) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324800kZy);
                    c1324800kZy.setTranslationY(this.LIZIZ.getHeight() * 0.26f);
                    return;
                }
                return;
            }
            if (c1324800kZy.getTranslationX() != LIZIZ().getSecond().floatValue()) {
                float fFloatValue = LIZIZ().getSecond().floatValue();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324800kZy);
                c1324800kZy.setTranslationX(fFloatValue);
            }
            if (c1324800kZy.getTranslationY() == LIZIZ().getThird().floatValue()) {
                return;
            }
            float fFloatValue2 = LIZIZ().getThird().floatValue();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324800kZy);
            c1324800kZy.setTranslationY(fFloatValue2);
        }
    }

    public static void LIZJ(C1324800kZy c1324800kZy, EnumC1641520soo enumC1641520soo) {
        float f;
        int i = C1641200soI.LIZ[enumC1641520soo.ordinal()];
        if (i != 1) {
            if (i == 2) {
                f = 0.0f;
            } else {
                throw new C1954807lC();
            }
        } else {
            f = 1.0f;
        }
        C786410Ut5.t1(c1324800kZy, 0);
        float f2 = 1.0f - f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1324800kZy, "scaleX", f2, f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJFF());
        C786410Ut5.Pd(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1324800kZy, "scaleY", f2, f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJFF());
        C786410Ut5.Pd(objectAnimatorOfFloat2);
    }

    public GifEntranceBannerController(FrameLayout frameLayout, C1640790snd c1640790snd, LifecycleOwner lifecycleOwner, C1662850tND c1662850tND, LiveData<List<ProviderEffect>> liveData, Pair<Integer, Integer> pair) {
        this.LIZ = frameLayout;
        this.LIZIZ = c1662850tND;
        this.LIZJ = pair;
        C538770LBb<Boolean> c538770LBb = new C538770LBb<>(null);
        this.LJII = c538770LBb;
        this.LJIIIIZZ = true;
        this.LJIIIZ = true;
        this.LJIIJJI = C2296808zG.LIZ(C2108108Nr.LIZ.plus(new C09AL()));
        c1640790snd.LIZJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 96));
        c1640790snd.LJIIJJI.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 97));
        c538770LBb.LIZ(lifecycleOwner, new AObjectS246S0100000_25(this, 685));
        if (liveData != null) {
            liveData.observe(lifecycleOwner, new AObserverS227S0100000_25(this, 82));
        }
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.tools.infosticker.repository.internal.GifEntranceBannerController.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (C2022007w2.LIZ[event.ordinal()] == 1) {
                    C2296808zG.LIZLLL(GifEntranceBannerController.this.LJIIJJI, "");
                }
            }
        });
    }
}
