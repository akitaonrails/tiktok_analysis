package com.ss.android.ugc.aweme.search.pages.common.theme.activitybg;

import X.C01GW;
import X.C07GU;
import X.C0P8W;
import X.C0P8X;
import X.C0P9Y;
import X.C0QDN;
import X.C0R40;
import X.C1108404Ve;
import X.C1308910kAL;
import X.C19EG;
import X.C2188811AlT;
import X.C259800zU;
import X.C271530AkZ;
import X.C325901Of;
import X.C418440Gaw;
import X.C452501pT;
import X.C467860IWi;
import X.C640160P9a;
import X.C640180P9c;
import X.C640210P9f;
import X.C640220P9g;
import X.C640240P9i;
import X.C640290P9n;
import X.C654510Plp;
import X.C814420VxA;
import X.InterfaceC21676519sR;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS108S0400000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchActivityCardBgController implements C0P8X, DefaultLifecycleObserver, View.OnAttachStateChangeListener, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJJI = 0;
    public final C19EG LL;
    public final Fragment LLILLJJLI;
    public final RecyclerView LLILLL;
    public final C640240P9i LLILZ;
    public final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    public final C640160P9a LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public C640160P9a LLJILJIL;
    public C0R40 LLJILJILJ;
    public volatile boolean LLJILLL;
    public C0P9Y LLJJ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public final ActivityCardThemeViewModel LIZ() {
        return (ActivityCardThemeViewModel) this.LLJ.getValue();
    }

    public final C0P9Y LIZIZ() {
        if (this.LLJJ == null) {
            this.LLJJ = new C0P9Y(this.LL, this.LLILLJJLI, this.LLILLL, LIZ(), new C640180P9c(this), new AwS554S0100000_10(this, 384));
        }
        return this.LLJJ;
    }

    public final void LJFF() {
        this.LLILLL.removeOnAttachStateChangeListener(this);
        C0P8W c0p8w = (C0P8W) this.LLIZ.getValue();
        c0p8w.LIZIZ.runOnUiThread(new ARunnableS110S0100000_10(c0p8w, 177));
        C640220P9g c640220P9g = (C640220P9g) this.LLIZLLLIL.getValue();
        c640220P9g.LJJIJIIJIL(true);
        c640220P9g.LLILZ = null;
        c640220P9g.LL.removeOnScrollListener(c640220P9g);
    }

    @Override // X.C0P8X
    public final void LJLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideBackground, maxIndex: ");
        C640160P9a c640160P9a = this.LLJILJIL;
        sbLIZ.append(c640160P9a != null ? c640160P9a.LIZJ : null);
        sbLIZ.append(", item visible: ");
        sbLIZ.append(((C640220P9g) this.LLIZLLLIL.getValue()).isVisible());
        C2188811AlT.LIZIZ(sbLIZ);
        LIZ().zQ2(this.LLILZLL);
    }

    @Override // X.C0P8X
    public final void LJLLI() {
        C0P9Y c0p9y;
        GlobalDoodleConfig globalDoodleConfig;
        SearchActivityCardBgData activityCardBg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showBackground, maxIndex: ");
        C640160P9a c640160P9a = this.LLJILJIL;
        sbLIZ.append(c640160P9a != null ? c640160P9a.LIZJ : null);
        sbLIZ.append(", item visible: ");
        sbLIZ.append(((C640220P9g) this.LLIZLLLIL.getValue()).isVisible());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJILJIL == null) {
            this.LLJILJIL = this.LLILZLL;
        }
        LIZ().zQ2((((C640220P9g) this.LLIZLLLIL.getValue()).isVisible() && ((c0p9y = this.LLJJ) == null || (globalDoodleConfig = c0p9y.LJI) == null || (activityCardBg = globalDoodleConfig.getActivityCardBg()) == null || !C640210P9f.LIZIZ(activityCardBg) || activityCardBg.getGradientConfig() == null || !Intrinsics.LJFF(c0p9y.LJII, Boolean.FALSE))) ? this.LLJILJIL : this.LLILZLL);
    }

    @Override // X.C0P8X
    public final void LJLLILLLL(boolean z) {
        if (z) {
            LJLLI();
        } else {
            LJLL();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        IVisualSearchHalfScreenAbility iVisualSearchHalfScreenAbilityLIZIZ = C654510Plp.LIZIZ(this.LL);
        if (!C0QDN.LIZJ(this.LLILLL.getContext())) {
            if (iVisualSearchHalfScreenAbilityLIZIZ != null && iVisualSearchHalfScreenAbilityLIZIZ.isShowing() && !iVisualSearchHalfScreenAbilityLIZIZ.isFullScreen()) {
                return;
            }
            LJFF();
        }
    }

    public final void LIZJ(GlobalDoodleConfig globalDoodleConfig, RecyclerView recyclerView) {
        SearchActivityCardBgData activityCardBg;
        String activityBgColor;
        C640160P9a c640160P9a;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer activityBgRange;
        Context context;
        SearchActivityCardBgData activityCardBg2;
        C0P9Y c0p9yLIZIZ = LIZIZ();
        boolean z = true;
        int iIntValue = 0;
        if (globalDoodleConfig != null && c0p9yLIZIZ != null && (activityCardBg2 = globalDoodleConfig.getActivityCardBg()) != null && C640210P9f.LIZIZ(activityCardBg2) && activityCardBg2.getGradientConfig() != null) {
            c0p9yLIZIZ.LJI = globalDoodleConfig;
            boolean zLJFF = Intrinsics.LJFF(c0p9yLIZIZ.LIZLLL.yQ2().getValue(), Boolean.TRUE);
            c0p9yLIZIZ.LIZLLL.yQ2().removeObserver((Observer) c0p9yLIZIZ.LJIIIIZZ.getValue());
            MutableLiveData<Boolean> mutableLiveDataYQ2 = c0p9yLIZIZ.LIZLLL.yQ2();
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Fragment fragment = c0p9yLIZIZ.LIZIZ;
            C19EG c19eg = c0p9yLIZIZ.LIZ;
            sAFHelper.getClass();
            mutableLiveDataYQ2.observe(SAFHelper.LJJIIZ(fragment, c19eg), (Observer) c0p9yLIZIZ.LJIIIIZZ.getValue());
            if (!zLJFF) {
                return;
            }
        }
        Integer num = null;
        if (globalDoodleConfig != null) {
            activityCardBg = globalDoodleConfig.getActivityCardBg();
        } else {
            activityCardBg = null;
        }
        if (recyclerView == null || (context = recyclerView.getContext()) == null || !C467860IWi.LIZ(context)) {
            z = false;
        }
        if (activityCardBg != null) {
            activityBgColor = activityCardBg.getActivityBgColor();
        } else {
            activityBgColor = null;
        }
        Integer numLIZ = C640290P9n.LIZ(activityBgColor);
        if (numLIZ != null) {
            int iIntValue2 = numLIZ.intValue();
            if (activityCardBg != null && (activityBgRange = activityCardBg.getActivityBgRange()) != null) {
                iIntValue = activityBgRange.intValue();
            }
            if (iIntValue > 0) {
                numValueOf2 = Integer.valueOf(iIntValue - 1);
            } else {
                numValueOf2 = null;
            }
            if (z) {
                numValueOf3 = Integer.valueOf(Color.argb(71, 18, 18, 18));
            } else {
                numValueOf3 = null;
            }
            c640160P9a = new C640160P9a(iIntValue2, numValueOf2, numValueOf3, "activity_bg");
        } else {
            c640160P9a = null;
        }
        LJ(recyclerView, c640160P9a);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processActivityCardBg ，activity card background: color = ");
        if (c640160P9a != null) {
            numValueOf = Integer.valueOf(c640160P9a.LIZ());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", maxIndex = ");
        if (c640160P9a != null) {
            num = c640160P9a.LIZJ;
        }
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c640160P9a != null) {
            LIZLLL(c640160P9a, globalDoodleConfig, recyclerView);
        }
    }

    public final void LJ(RecyclerView recyclerView, C640160P9a c640160P9a) {
        this.LLJI = false;
        LIZ().LLILLJJLI = 0;
        if (c640160P9a == null) {
            if (!C07GU.LIZ() || this.LLJILJIL != null) {
                this.LLJILJIL = null;
                LJFF();
                LIZ().vQ2(this.LLILZLL);
                LIZ().LLILZ = 0.5f;
                C640240P9i c640240P9i = this.LLILZ;
                c640240P9i.LJ = 0;
                c640240P9i.LJI = 0.0f;
                c640240P9i.LJIIJ = 0;
                c640240P9i.LJIIIZ = 0;
                c640240P9i.LIZ();
                if (recyclerView != null) {
                    recyclerView.removeOnLayoutChangeListener(this.LLJILJILJ);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.0P9b, X.19sR] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0P9Z, android.view.View$OnLayoutChangeListener] */
    public final void LIZLLL(C640160P9a c640160P9a, GlobalDoodleConfig globalDoodleConfig, final RecyclerView recyclerView) {
        final int iIntValue;
        SearchActivityCardBgData activityCardBg;
        Integer activityBgRange;
        if (recyclerView == 0) {
            return;
        }
        if (!((Boolean) C1108404Ve.LIZ.getValue()).booleanValue()) {
            recyclerView.removeOnLayoutChangeListener(this.LLJILJILJ);
        }
        if (((Boolean) C271530AkZ.LIZ.getValue()).booleanValue()) {
            if (globalDoodleConfig != null && (activityCardBg = globalDoodleConfig.getActivityCardBg()) != null && (activityBgRange = activityCardBg.getActivityBgRange()) != null) {
                iIntValue = activityBgRange.intValue();
            } else {
                iIntValue = 0;
            }
            final AwS108S0400000_10 awS108S0400000_10 = new AwS108S0400000_10(recyclerView, globalDoodleConfig, this, c640160P9a, 1);
            final C259800zU c259800zU = new C259800zU();
            final ?? r4 = new View.OnLayoutChangeListener() { // from class: X.0P9Z
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int i9 = i4 - i2;
                    if (i9 != i8 - i6) {
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager != null) {
                            int iMin = Math.min(layoutManager.getChildCount(), iIntValue);
                            for (int i10 = 0; i10 < iMin; i10++) {
                                View childAt = layoutManager.getChildAt(i10);
                                if (childAt != null) {
                                    childAt.removeOnLayoutChangeListener(this);
                                }
                            }
                        }
                        InterfaceC21676519sR interfaceC21676519sR = c259800zU.element;
                        if (interfaceC21676519sR != null) {
                            recyclerView.removeOnChildAttachStateChangeListener(interfaceC21676519sR);
                        }
                        awS108S0400000_10.invoke(Integer.valueOf(i9));
                    }
                }
            };
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                int iMin = Math.min(layoutManager.getChildCount(), iIntValue);
                for (int i = 0; i < iMin; i++) {
                    View childAt = layoutManager.getChildAt(i);
                    if (childAt != 0) {
                        childAt.addOnLayoutChangeListener(r4);
                    }
                }
            }
            ?? r0 = new InterfaceC21676519sR() { // from class: X.0P9b
                @Override // X.InterfaceC21676519sR
                public final void g5(View view) {
                    if (recyclerView.getChildAdapterPosition(view) < iIntValue) {
                        view.addOnLayoutChangeListener(r4);
                    }
                }

                @Override // X.InterfaceC21676519sR
                public final void m3(View view) {
                    if (recyclerView.getChildAdapterPosition(view) < iIntValue) {
                        view.removeOnLayoutChangeListener(r4);
                    }
                }
            };
            c259800zU.element = r0;
            recyclerView.removeOnChildAttachStateChangeListener(r0);
            recyclerView.addOnChildAttachStateChangeListener((InterfaceC21676519sR) c259800zU.element);
        }
        this.LLJILJILJ = new C0R40(recyclerView, globalDoodleConfig, this, c640160P9a, 0);
        this.LLJILLL = false;
        recyclerView.removeOnLayoutChangeListener(this.LLJILJILJ);
        recyclerView.addOnLayoutChangeListener(this.LLJILJILJ);
    }

    public SearchActivityCardBgController(C19EG c19eg, Fragment fragment, RecyclerView recyclerView, C640240P9i c640240P9i) {
        int iIntValue;
        this.LL = c19eg;
        this.LLILLJJLI = fragment;
        this.LLILLL = recyclerView;
        this.LLILZ = c640240P9i;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uk, c19eg);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZLL = new C640160P9a(iIntValue, null, null, "no_bg");
        this.LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 386));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 385));
        this.LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 383));
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragment2 = this.LLILLJJLI;
        C19EG c19eg2 = this.LL;
        sAFHelper.getClass();
        C325901Of.LIZ(SAFHelper.LJIJJ(fragment2, c19eg2), this);
    }
}
