package com.ss.android.ugc.aweme.sticker.view.internal.main;

import X.AbstractC1557360qd4;
import X.C01GW;
import X.C054G;
import X.C09HN;
import X.C0PEM;
import X.C11NJ;
import X.C11NZ;
import X.C11RK;
import X.C1308910kAL;
import X.C1557350qd3;
import X.C1621340sIG;
import X.C1624570sNT;
import X.C1625780sPQ;
import X.C1630880sXe;
import X.C1631250sYF;
import X.C1635590sfF;
import X.C1635820sfc;
import X.C1635840sfe;
import X.C1635850sff;
import X.C1635860sfg;
import X.C1635890sfj;
import X.C1635900sfk;
import X.C1636000sfu;
import X.C1636040sfy;
import X.C1636070sg1;
import X.C1636320sgQ;
import X.C1636520sgk;
import X.C1638190sjR;
import X.C1638250sjX;
import X.C1638260sjY;
import X.C1641640sp0;
import X.C1697810uHb;
import X.C1701960uOI;
import X.C19475711Hn;
import X.C19487811Me;
import X.C19561611g6;
import X.C19734012Iw;
import X.C19736412Ju;
import X.C19EG;
import X.C19GS;
import X.C1DRG;
import X.C2281551ESb;
import X.C2296808zG;
import X.C2296908zH;
import X.C23113093v;
import X.C23117093z;
import X.C341710DaT;
import X.C375780EoK;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C424680Gl0;
import X.C426750GoL;
import X.C446980Hfs;
import X.C452501pT;
import X.C579040MnO;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.EnumC1159860gHw;
import X.EnumC1641570sot;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625410sOp;
import X.InterfaceC1625520sP0;
import X.InterfaceC1625760sPO;
import X.InterfaceC1630240sWc;
import X.InterfaceC1631540sYi;
import X.InterfaceC1635560sfC;
import X.InterfaceC1635640sfK;
import X.InterfaceC1635870sfh;
import X.InterfaceC1635880sfi;
import X.InterfaceC1635930sfn;
import X.InterfaceC1636820shE;
import X.InterfaceC1685430txd;
import X.InterfaceC420801kM;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS159S0100000_25;
import Y.AObserverS186S0200000_25;
import Y.AObserverS226S0100000_24;
import Y.AObserverS227S0100000_25;
import Y.AfS115S0300000_25;
import Y.AfS159S0200000_25;
import Y.AfS193S0100000_24;
import Y.AfS194S0100000_25;
import Y.AfS87S0101000_25;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.absetting.EffectDiscoveryButtonMovedToRightExperiment;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.adapter.LoadingSkeletonEffect;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractStickerView implements InterfaceC1625760sPO, GenericLifecycleObserver {
    public final C19EG LL;
    public final ViewGroup LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C1630880sXe LLILZ;
    public final C1631250sYF LLILZIL;
    public final InterfaceC1625520sP0 LLILZLL;
    public final C1635820sfc LLIZ;
    public final InterfaceC1635870sfh LLIZLLLIL;
    public final boolean LLJ;
    public final InterfaceC1636820shE LLJI;
    public final FragmentManager LLJIJIL;
    public final C01GW LLJILJIL;
    public ViewGroup LLJILJILJ;
    public View LLJILLL;
    public ViewGroup LLJJ;
    public View LLJJI;
    public InterfaceC1630240sWc LLJJIII;
    public ViewGroup LLJJIJI;
    public C19561611g6 LLJJIJIIJIL;
    public C1636040sfy LLJJIJIL;
    public C1638250sjX LLJJJ;
    public C424680Gl0 LLJJJIL;
    public ViewGroup LLJJJJ;
    public SearchStickerViewContainer LLJJJJJIL;
    public C1635850sff LLJJJJLIIL;
    public int LLJJL;
    public final C11NJ LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public long LLJLIL;
    public final C11RK<AbstractC1557360qd4> LLJLILLLLZIIL;
    public final C11RK LLJLL;
    public final C11RK<Integer> LLJLLIL;
    public final C054G LLJLLL;
    public boolean LLJZ;
    public View LLJZIJLIL;
    public boolean LLL;

    public abstract C1635590sfF LJIILIIL(ViewGroup viewGroup);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy$feature_effect_record_release();
        }
    }

    @Override // X.InterfaceC1625800sPS
    public final C11NZ<Integer> Cm() {
        C11RK<Integer> c11rk = this.LLJLLIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final void LJFF() {
        C11NZ<Pair<Integer, Integer>> c11nz;
        View view;
        boolean z;
        if (this.LLJJIII != null) {
            return;
        }
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        LJIIJ(viewGroup);
        ViewGroup viewGroup2 = this.LLJILJILJ;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        C1635590sfF c1635590sfFLJIILIIL = LJIILIIL(viewGroup2);
        C19475711Hn c19475711HnLIZIZ = c1635590sfFLJIILIIL.LIZIZ();
        AfS193S0100000_24 afS193S0100000_24 = new AfS193S0100000_24(this, 47);
        C1701960uOI c1701960uOI = C19487811Me.LJ;
        LJ(c19475711HnLIZIZ.LJJLL(afS193S0100000_24, c1701960uOI));
        LJ(c1635590sfFLJIILIIL.LIZLLL().LJJLL(new AfS193S0100000_24(this, 48), c1701960uOI));
        LJ(c1635590sfFLJIILIIL.Cm().LJJLL(new AfS193S0100000_24(this, 49), C09HN.LIZ));
        this.LLJJIII = c1635590sfFLJIILIIL;
        ViewGroup viewGroup3 = this.LLJILJILJ;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        LJIIL(viewGroup3).LIZ(new AwS569S0100000_25(this, 1052));
        ViewGroup viewGroup4 = this.LLJILJILJ;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        InterfaceC1635870sfh interfaceC1635870sfh = this.LLIZLLLIL;
        ViewGroup viewGroup5 = this.LLJJIJI;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        C1635860sfg c1635860sfgLIZ = interfaceC1635870sfh.LIZ(viewGroup5);
        if (c1635860sfgLIZ == null) {
            c1635860sfgLIZ = new C1635860sfg(viewGroup4.findViewById(R.id.kg9));
        }
        c1635860sfgLIZ.LIZ(new ACListenerS159S0100000_25(this, 81));
        C1638260sjY c1638260sjY = this.LLIZ.LIZJ;
        int i = 0;
        if (c1638260sjY != null) {
            Effect effectLLILIL = this.LLILZ.LIZ.LLILIL();
            boolean zLJIJ = C1624570sNT.LJIJ(effectLLILIL);
            if (zLJIJ) {
                z = false;
            } else {
                z = !((effectLLILIL == null || effectLLILIL.getTypes() == null || !effectLLILIL.getTypes().contains("AR")) ? false : true);
            }
            ViewGroup viewGroup6 = this.LLJILJILJ;
            if (viewGroup6 == null) {
                viewGroup6 = null;
            }
            C1638250sjX c1638250sjX = new C1638250sjX((ViewGroup) viewGroup6.findViewById(R.id.m9b), c1638260sjY, z);
            c1638250sjX.LJIIIIZZ = zLJIJ ? null : 2131845839;
            this.LLJJJ = c1638250sjX;
        }
        int i2 = this.LLIZ.LJI;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            ViewGroup viewGroup7 = this.LLJILJILJ;
            if (viewGroup7 == null) {
                viewGroup7 = null;
            }
            View viewFindViewById = viewGroup7.findViewById(R.id.mfu);
            if (viewFindViewById != null) {
                int i3 = this.LLIZ.LJI;
                View view2 = this.LLJJI;
                if (view2 == null) {
                    view2 = null;
                }
                ViewGroup viewGroup8 = this.LLJJJJ;
                if (viewGroup8 == null) {
                    viewGroup8 = null;
                }
                C1638190sjR c1638190sjR = new C1638190sjR(i3, viewFindViewById, view2, viewGroup8);
                C19EG c19eg = this.LL;
                ViewGroup viewGroup9 = this.LLJILJILJ;
                if (viewGroup9 == null) {
                    viewGroup9 = null;
                }
                SearchStickerViewContainer searchStickerViewContainerLIZLLL = c1638190sjR.LIZLLL(c19eg, viewGroup9, this.LLILZ, this.LLJI, this.LLIZ, this.LLILLL);
                View view3 = searchStickerViewContainerLIZLLL.LLJ;
                if (view3 == null) {
                    view3 = null;
                }
                c1638190sjR.LJ = view3;
                LJ(searchStickerViewContainerLIZLLL.LJFF().LJJLJLI(new AfS159S0200000_25(this, c1638190sjR, 17)));
                LJ(searchStickerViewContainerLIZLLL.LIZIZ().LJJLJLI(new AfS194S0100000_25(this, 205)));
                LJ(li().LJJLJLI(new AfS115S0300000_25(searchStickerViewContainerLIZLLL, this, c1638190sjR, 10)));
                this.LLJJJJJIL = searchStickerViewContainerLIZLLL;
                int iLJII = LJII();
                if (iLJII >= 0 && (c11nz = this.LLILZIL.LJII) != null) {
                    LJ(c11nz.LJJLJLI(new AfS87S0101000_25(iLJII, this, 0)));
                }
                this.LLJI.nQ().observe(this.LLILLL, new AObserverS227S0100000_25(this, 129));
            }
        }
        if (C2281551ESb.LIZIZ.LJFF().LIZ()) {
            ViewGroup viewGroup10 = this.LLJILJILJ;
            if (viewGroup10 == null) {
                viewGroup10 = null;
            }
            ViewGroup viewGroup11 = (ViewGroup) viewGroup10.findViewById(R.id.mhh);
            if (C1635900sfk.LIZ()) {
                ViewGroup viewGroup12 = this.LLJILJILJ;
                if (viewGroup12 == null) {
                    viewGroup12 = null;
                }
                RecyclerView recyclerView = new RecyclerView(viewGroup12.getContext());
                C1630880sXe c1630880sXe = this.LLILZ;
                SkeletonDataViewModel skeletonDataViewModel = new SkeletonDataViewModel(this.LLILLL, c1630880sXe.LIZ, c1630880sXe.LIZIZ, c1630880sXe.LJ, c1630880sXe.LJI);
                InterfaceC1624480sNK interfaceC1624480sNK = c1630880sXe.LIZ;
                InterfaceC1635560sfC interfaceC1635560sfC = c1630880sXe.LJ;
                C1636520sgk c1636520sgk = this.LLILZ.LJFF;
                C1631250sYF c1631250sYF = this.LLILZIL;
                C1636320sgQ c1636320sgQ = new C1636320sgQ(interfaceC1624480sNK, interfaceC1635560sfC, (InterfaceC1631540sYi) skeletonDataViewModel, c1636520sgk, c1631250sYF.LIZLLL, c1631250sYF.LIZIZ, c1631250sYF, (EffectCategoryModel) (false ? 1 : 0), i, 640);
                c1636320sgQ.LLILZIL = 0;
                recyclerView.setHasFixedSize(true);
                recyclerView.setItemViewCacheSize(4);
                recyclerView.setLayoutManager(new GridLayoutManager(this.LLILZ.LJFF.LIZ, 1, this.LLILLJJLI.getContext(), false));
                if (recyclerView.getItemDecorationCount() == 0) {
                    recyclerView.setVerticalFadingEdgeEnabled(true);
                    recyclerView.setFadingEdgeLength(20);
                    recyclerView.addItemDecoration(new C1636000sfu(0));
                }
                recyclerView.setAdapter(c1636320sgQ);
                ArrayList arrayList = new ArrayList(60);
                int i4 = 0;
                do {
                    arrayList.add(new LoadingSkeletonEffect());
                    i4++;
                } while (i4 < 60);
                c1636320sgQ.setData(arrayList);
                ViewGroup viewGroup13 = this.LLJILJILJ;
                if (viewGroup13 == null) {
                    viewGroup13 = null;
                }
                viewGroup11.addView(recyclerView, -1, viewGroup13.getContext().getResources().getDimensionPixelSize(R.dimen.adl));
                view = recyclerView;
            } else {
                ViewGroup viewGroup14 = this.LLJILJILJ;
                if (viewGroup14 == null) {
                    viewGroup14 = null;
                }
                View c341710DaT = new C341710DaT(viewGroup14.getContext(), null);
                c341710DaT.setId(R.id.w6r);
                C375780EoK.LIZIZ(c341710DaT, false);
                viewGroup11.addView(c341710DaT, -1, -1);
                view = c341710DaT;
            }
            this.LLJZIJLIL = view;
        }
        ViewGroup viewGroup15 = this.LLJILJILJ;
        if (viewGroup15 == null) {
            viewGroup15 = null;
        }
        C424680Gl0 c424680Gl0 = new C424680Gl0((FrameLayout) viewGroup15.findViewById(R.id.mhh), this.LLIZ.LJIIJ.LIZ);
        if (C2281551ESb.LIZIZ.LJFF().LIZ()) {
            c424680Gl0.LJJ(false);
        }
        C23113093v.LIZ(LJI().LJJIJ(), this.LLJLLL, AFwS266S0000000_25.get$arr$(535), AFwS266S0000000_25.get$arr$(536)).observe(this.LLILLL, new AObserverS186S0200000_25((Object) this, (LiveData<C1641640sp0<HorizontalEffectsModel>>) c424680Gl0, (l0) 9));
        C786410Ut5.I7(new ACListenerS159S0100000_25(new AwS569S0100000_25(this, 1051), 80), c424680Gl0.LIZJ);
        this.LLJJJIL = c424680Gl0;
        if (!this.LLJL) {
            this.LLJL = true;
            C11RK<AbstractC1557360qd4> c11rk = this.LLJLILLLLZIIL;
            ViewGroup viewGroup16 = this.LLJILJILJ;
            c11rk.onNext(new C1557350qd3(viewGroup16 != null ? viewGroup16 : null));
        }
        LJI().on1().observe(this.LLILLL, new AObserverS226S0100000_24(this, 30));
    }

    public final InterfaceC1635640sfK LJI() {
        return (InterfaceC1635640sfK) this.LLJILJIL.getValue();
    }

    public final int LJII() {
        int i = 0;
        for (EffectCategoryModel effectCategoryModel : C23117093z.LJFF(this.LLILZ.LIZ.getStickerRepository().LJFF())) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (Intrinsics.LJFF(effectCategoryModel.getKey(), "sticker_category:search")) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public final C19561611g6 LJIIIIZZ() {
        C19561611g6 c19561611g6 = this.LLJJIJIIJIL;
        if (c19561611g6 != null) {
            return c19561611g6;
        }
        return null;
    }

    public final InterfaceC1630240sWc LJIIIZ() {
        InterfaceC1630240sWc interfaceC1630240sWc = this.LLJJIII;
        if (interfaceC1630240sWc != null) {
            return interfaceC1630240sWc;
        }
        return null;
    }

    public final C11NZ<Boolean> LJIIJJI() {
        C11RK c11rk = this.LLJLL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1625760sPO
    public final void QE() {
        SearchStickerViewContainer searchStickerViewContainer = this.LLJJJJJIL;
        if (searchStickerViewContainer != null) {
            searchStickerViewContainer.LJIIIZ();
        }
    }

    @Override // X.InterfaceC1625760sPO
    public final ViewGroup RN() {
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    @Override // X.InterfaceC1625760sPO
    public final void V0() {
        Function1<Boolean, Unit> function1 = this.LLIZ.LJIIJ.LJIIL;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1636040sfy c1636040sfy = this.LLJJIJIL;
        if (c1636040sfy == null) {
            c1636040sfy = null;
        }
        c1636040sfy.LIZJ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy$feature_effect_record_release() {
        this.LLJJLIIIJLLLLLLLZ.LJ();
        C2296808zG.LIZJ(this.LLJLLL, null);
    }

    @Override // X.InterfaceC1625760sPO
    public final void hide() {
        Function1<Boolean, Unit> function1 = this.LLIZ.LJIIJ.LJIIL;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        if (this.LLJ) {
            C1636040sfy c1636040sfy = this.LLJJIJIL;
            (c1636040sfy != null ? c1636040sfy : null).LIZIZ();
        } else {
            C1636040sfy c1636040sfy2 = this.LLJJIJIL;
            (c1636040sfy2 != null ? c1636040sfy2 : null).LIZJ();
        }
    }

    @Override // X.InterfaceC1625760sPO
    public final boolean isShowing() {
        C1636040sfy c1636040sfy = this.LLJJIJIL;
        if (c1636040sfy == null) {
            c1636040sfy = null;
        }
        EnumC1641570sot enumC1641570sot = c1636040sfy.LJII;
        return enumC1641570sot == EnumC1641570sot.LL || enumC1641570sot == EnumC1641570sot.LLILLJJLI;
    }

    @Override // X.InterfaceC1625760sPO
    public final C11NZ<AbstractC1557360qd4> k2() {
        C11RK<AbstractC1557360qd4> c11rk = this.LLJLILLLLZIIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1625760sPO
    public final C11NZ<EnumC1159860gHw> li() {
        C1636040sfy c1636040sfy = this.LLJJIJIL;
        if (c1636040sfy == null) {
            c1636040sfy = null;
        }
        return c1636040sfy.LIZLLL();
    }

    @Override // X.InterfaceC1625760sPO
    public final void prepare() {
        if (this.LLJL) {
            return;
        }
        this.LLJL = true;
        C11RK<AbstractC1557360qd4> c11rk = this.LLJLILLLLZIIL;
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        c11rk.onNext(new C1557350qd3(viewGroup));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r0.LJIIIZ == false) goto L13;
     */
    @Override // X.InterfaceC1625760sPO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show() {
        /*
            r3 = this;
            X.0sfc r0 = r3.LLIZ
            X.0sfe r0 = r0.LJIIJ
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r0.LJIIL
            if (r1 == 0) goto Ld
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.invoke(r0)
        Ld:
            long r1 = java.lang.System.currentTimeMillis()
            r3.LLJLIL = r1
            X.0sXe r0 = r3.LLILZ
            X.0sNK r0 = r0.LIZ
            r0.LJJLIIJ(r1)
            r3.LJFF()
            X.0sfc r0 = r3.LLIZ
            X.0sfe r0 = r0.LJIIJ
            boolean r2 = r0.LJIILL
            boolean r0 = r3.LLJ
            r1 = 0
            if (r0 == 0) goto L3c
            if (r2 == 0) goto L33
            X.0sfy r0 = r3.LLJJIJIL
            if (r0 != 0) goto L2f
            r0 = r1
        L2f:
            boolean r0 = r0.LJIIIZ
            if (r0 != 0) goto L3c
        L33:
            X.0sfy r0 = r3.LLJJIJIL
            if (r0 == 0) goto L38
            r1 = r0
        L38:
            r1.LJ()
            return
        L3c:
            X.0sfy r0 = r3.LLJJIJIL
            if (r0 == 0) goto L41
            r1 = r0
        L41:
            r1.LJFF()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView.show():void");
    }

    @Override // X.InterfaceC1625760sPO
    public final void zp() {
        ViewGroup viewGroup = this.LLJILJILJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJLLLLLL(8, viewGroup.findViewById(R.id.mdc));
        View view = this.LLJJI;
        (view != null ? view : null).getLayoutParams().height = -2;
    }

    @Override // X.InterfaceC1625760sPO
    public final View FG() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1625760sPO
    public final InterfaceC1635930sfn Fq() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1623400sLa
    public final void LIZ(C579040MnO c579040MnO) {
        C1635850sff c1635850sff = this.LLJJJJLIIL;
        if (c1635850sff == null) {
            c1635850sff = null;
        }
        c1635850sff.LIZ(c579040MnO);
    }

    @Override // X.InterfaceC1623400sLa
    public final void LIZIZ(C579040MnO c579040MnO) {
        C1635850sff c1635850sff = this.LLJJJJLIIL;
        if (c1635850sff == null) {
            c1635850sff = null;
        }
        c1635850sff.LIZIZ(c579040MnO);
    }

    @Override // X.InterfaceC1625810sPT
    public final void LIZJ(List<? extends EffectCategoryModel> list) {
        LJFF();
        LJIIIZ().LIZJ(list);
    }

    @Override // X.InterfaceC1623400sLa
    public final void LIZLLL(InterfaceC1635880sfi interfaceC1635880sfi) {
        C1635850sff c1635850sff = this.LLJJJJLIIL;
        if (c1635850sff == null) {
            c1635850sff = null;
        }
        c1635850sff.LIZLLL(interfaceC1635880sfi);
    }

    public final InterfaceC420801kM LJ(InterfaceC420801kM interfaceC420801kM) {
        this.LLJJLIIIJLLLLLLLZ.LIZ(interfaceC420801kM);
        return interfaceC420801kM;
    }

    public void LJIIJ(ViewGroup viewGroup) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.mg8);
        ViewGroup viewGroup3 = (ViewGroup) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), this.LLIZLLLIL.LIZIZ(), viewGroup2, false);
        this.LLJJIJI = viewGroup3;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        viewGroup2.addView(viewGroup3);
        InterfaceC1635870sfh interfaceC1635870sfh = this.LLIZLLLIL;
        ViewGroup viewGroup4 = this.LLJJIJI;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.LLJJIJIIJIL = interfaceC1635870sfh.LIZJ(viewGroup4);
        if (C1621340sIG.LIZ()) {
            TuxIconView tuxIconView = new TuxIconView(viewGroup.getContext(), null, 0, 6, null);
            tuxIconView.setId(R.id.kg9);
            tuxIconView.setIconRes(R.raw.icon_block);
            tuxIconView.setTintColorRes(R.attr.zk);
            tuxIconView.setContentDescription(viewGroup.getContext().getString(2131823193));
            C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), -2);
            layoutParams.addRule(15);
            C786410Ut5.M6(tuxIconView, layoutParams);
            ViewGroup viewGroup5 = this.LLJJIJI;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            viewGroup5.addView(tuxIconView, 0);
        } else {
            C19736412Ju c19736412Ju = new C19736412Ju(viewGroup.getContext(), null, 6, 0);
            c19736412Ju.setId(R.id.kg9);
            c19736412Ju.setEnableTint(false);
            c19736412Ju.setImageDrawable(C19734012Iw.LIZLLL(C800330VaR.LIZIZ(c19736412Ju.getContext(), R.drawable.c3t), C446980Hfs.LIZ(c19736412Ju.getContext(), R.color.a0v)));
            c19736412Ju.setContentDescription(viewGroup.getContext().getString(2131823193));
            C426750GoL.LJIIL(c19736412Ju, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), -2);
            layoutParams2.addRule(15);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19736412Ju);
            c19736412Ju.setLayoutParams(layoutParams2);
            ViewGroup viewGroup6 = this.LLJJIJI;
            if (viewGroup6 == null) {
                viewGroup6 = null;
            }
            viewGroup6.addView(c19736412Ju, 0);
        }
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.fv);
        LJIIIIZZ().setHorizontalFadingEdgeEnabled(true);
        if (EffectDiscoveryButtonMovedToRightExperiment.isEnabled()) {
            LJIIIIZZ().setTabEdgeExtraMargin(viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.fr));
            LJIIIIZZ().setFadingEdgeLength(viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.fj));
            if (C1621340sIG.LIZ()) {
                LJIIIIZZ().setTabMarginByPixel(dimensionPixelSize);
                TuxIconView tuxIconView2 = (TuxIconView) viewGroup.findViewById(R.id.kg9);
                if (tuxIconView2 != null) {
                    int dimensionPixelSize2 = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.f6);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_block;
                    c419910GdJ.LIZIZ = dimensionPixelSize2;
                    c419910GdJ.LIZJ = dimensionPixelSize2;
                    c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.zk, viewGroup.getContext());
                    tuxIconView2.setTuxIcon(c419910GdJ);
                    tuxIconView2.setPadding(0, 0, 0, 0);
                    ViewGroup.LayoutParams layoutParams3 = tuxIconView2.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMargins(0, 0, 0, 0);
                            marginLayoutParams.height = -1;
                            marginLayoutParams.width = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.f7);
                        }
                    } else {
                        marginLayoutParams = null;
                    }
                    C786410Ut5.M6(tuxIconView2, marginLayoutParams);
                }
            } else {
                LJIILJJIL(dimensionPixelSize);
            }
        } else {
            LJIIIIZZ().setFadingEdgeLength(viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.fi));
            LJIILJJIL(dimensionPixelSize);
        }
        View viewFindViewById = viewGroup.findViewById(R.id.mfw);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams4 = viewFindViewById.getLayoutParams();
            layoutParams4.height = viewFindViewById.getContext().getResources().getDimensionPixelSize(R.dimen.ft);
            C786410Ut5.W5(viewFindViewById, layoutParams4);
        }
        View viewFindViewById2 = viewGroup.findViewById(R.id.wyx);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
    }

    public C1635890sfj LJIIL(ViewGroup viewGroup) {
        return new C1635890sfj(viewGroup.findViewById(R.id.w7p), false);
    }

    public final void LJIILJJIL(int i) {
        LJIIIIZZ().setTabMarginByPixel(i);
        ViewGroup viewGroup = this.LLJILJILJ;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewGroup.findViewById(R.id.kg9);
        if (appCompatImageView != null) {
            appCompatImageView.setPadding(0, 0, 0, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatImageView.getLayoutParams();
            ViewGroup viewGroup3 = this.LLJILJILJ;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            int dimensionPixelSize = viewGroup3.getContext().getResources().getDimensionPixelSize(R.dimen.fn);
            marginLayoutParams.setMargins(dimensionPixelSize * 2, dimensionPixelSize, i, dimensionPixelSize);
            ViewGroup viewGroup4 = this.LLJILJILJ;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            marginLayoutParams.height = viewGroup4.getContext().getResources().getDimensionPixelSize(R.dimen.f6);
            ViewGroup viewGroup5 = this.LLJILJILJ;
            if (viewGroup5 != null) {
                viewGroup2 = viewGroup5;
            }
            marginLayoutParams.width = viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.f6);
            C786410Ut5.h6(appCompatImageView, marginLayoutParams);
        }
    }

    @Override // X.InterfaceC1625760sPO
    public final void Zf(boolean z) {
        C1635850sff c1635850sff = this.LLJJJJLIIL;
        if (c1635850sff == null) {
            c1635850sff = null;
        }
        c1635850sff.Zf(z);
    }

    @Override // X.InterfaceC1625800sPS
    public final void in(boolean z) {
        LJFF();
        LJIIIZ().in(z);
    }

    @Override // X.InterfaceC1625800sPS
    public final void qB(Effect effect) {
        LJFF();
        LJIIIZ().qB(effect);
    }

    @Override // X.InterfaceC1625820sPU
    public final void qM(int i) {
        LJFF();
        LJIIIZ().qM(i);
    }

    @Override // X.InterfaceC1625820sPU
    public final void YL(String str, boolean z) {
        LJFF();
        if (this.LLJJIII != null) {
            LJIIIZ().YL(str, z);
        }
    }

    public static final class SkeletonDataViewModel extends StickerListViewModel {
        @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        public SkeletonDataViewModel(LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635560sfC interfaceC1635560sfC, C1DRG c1drg) {
            super(lifecycleOwner, interfaceC1624480sNK, interfaceC1625410sOp, interfaceC1635560sfC, c1drg, null, false, 96);
        }
    }

    public AbstractStickerView(C19GS c19gs, ViewGroup viewGroup, LifecycleOwner lifecycleOwner, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, C1625780sPQ c1625780sPQ, C1635820sfc c1635820sfc, InterfaceC1635870sfh interfaceC1635870sfh, FragmentManager fragmentManager, InterfaceC1635640sfK interfaceC1635640sfK, boolean z, InterfaceC1636820shE interfaceC1636820shE) {
        ViewGroup viewGroup2;
        FragmentManager supportFragmentManager = fragmentManager;
        this.LL = c19gs;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c1630880sXe;
        this.LLILZIL = c1631250sYF;
        this.LLILZLL = c1625780sPQ;
        this.LLIZ = c1635820sfc;
        this.LLIZLLLIL = interfaceC1635870sfh;
        this.LLJ = z;
        this.LLJI = interfaceC1636820shE;
        if (supportFragmentManager == null) {
            if (lifecycleOwner instanceof Fragment) {
                supportFragmentManager = ((Fragment) lifecycleOwner).getChildFragmentManager();
            } else {
                supportFragmentManager = c19gs.getSupportFragmentManager();
            }
        }
        this.LLJIJIL = supportFragmentManager;
        final StickerViewImpl stickerViewImpl = (StickerViewImpl) this;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS426S0200000_25(interfaceC1635640sfK, stickerViewImpl, 171));
        this.LLJJL = -999;
        this.LLJJLIIIJLLLLLLLZ = new C11NJ();
        this.LLJLILLLLZIIL = new C11RK<>();
        this.LLJLL = new C11RK();
        this.LLJLLIL = new C11RK<>();
        this.LLJLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        lifecycleOwner.getLifecycle().addObserver(this);
        c1630880sXe.LIZIZ.LJFF(new InterfaceC1625520sP0() { // from class: X.0sWe
            @Override // X.InterfaceC1625520sP0
            public final void LIZ(C1627360sRy c1627360sRy) {
                C1638250sjX c1638250sjX = stickerViewImpl.LLJJJ;
                if (c1638250sjX != null) {
                    c1638250sjX.LIZ(true);
                }
                stickerViewImpl.LLILZLL.LIZ(c1627360sRy);
            }

            @Override // X.InterfaceC1625520sP0
            public final void LIZIZ(C1627370sRz c1627370sRz) {
                Integer num;
                boolean zLJIJ = C1624570sNT.LJIJ(c1627370sRz.LIZ);
                boolean z2 = false;
                if (!zLJIJ) {
                    Effect effect = c1627370sRz.LIZ;
                    if (effect != null && effect.getTypes() != null && effect.getTypes().contains("AR")) {
                        z2 = true;
                    }
                    z2 = !z2;
                }
                C1638250sjX c1638250sjX = stickerViewImpl.LLJJJ;
                if (c1638250sjX != null) {
                    if (zLJIJ) {
                        num = null;
                    } else {
                        num = 2131845839;
                    }
                    c1638250sjX.LJIIIIZZ = num;
                }
                C1638250sjX c1638250sjX2 = stickerViewImpl.LLJJJ;
                if (c1638250sjX2 != null) {
                    c1638250sjX2.LIZ(z2);
                }
                stickerViewImpl.LLILZLL.LIZIZ(c1627370sRz);
            }
        });
        this.LLJJJJLIIL = new C1635850sff();
        C1635840sfe c1635840sfe = c1635820sfc.LJIIJ;
        InterfaceC1685430txd<String, Context, LayoutInflater, Integer, ViewGroup, Boolean, View> interfaceC1685430txd = c1635840sfe.LJIILJJIL;
        if (c1635840sfe.LJIILIIL && interfaceC1685430txd != null) {
            viewGroup2 = (ViewGroup) interfaceC1685430txd.invoke("tool_layout_viewpager_choose_sticker", viewGroup.getContext(), C786410Ut5.ne(viewGroup.getContext()), Integer.valueOf(R.layout.ftd), viewGroup, Boolean.FALSE);
        } else {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ftd, viewGroup, false);
        }
        this.LLJILJILJ = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) (viewGroup2 == null ? null : viewGroup2).findViewById(R.id.w4x);
        C786410Ut5.LJJJJI(viewGroup3);
        C1635840sfe c1635840sfe2 = c1635820sfc.LJIIJ;
        InterfaceC1685430txd<String, Context, LayoutInflater, Integer, ViewGroup, Boolean, View> interfaceC1685430txd2 = c1635840sfe2.LJIILJJIL;
        if (c1635840sfe2.LJIILIIL && interfaceC1685430txd2 != null) {
            interfaceC1685430txd2.invoke("layout_tool_viewpager_choose_sticker_v2", viewGroup.getContext(), C786410Ut5.ne(viewGroup.getContext()), Integer.valueOf(R.layout.d9y), viewGroup3, Boolean.TRUE);
        } else {
            C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d9y, viewGroup3, true);
        }
        this.LLJJ = viewGroup3;
        ViewGroup viewGroup4 = this.LLJILJILJ;
        this.LLJJI = (viewGroup4 == null ? null : viewGroup4).findViewById(R.id.mfy);
        ViewGroup viewGroup5 = this.LLJILJILJ;
        this.LLJJJJ = (ViewGroup) (viewGroup5 == null ? null : viewGroup5).findViewById(R.id.mfz);
        ViewGroup viewGroup6 = this.LLJILJILJ;
        this.LLJILLL = (viewGroup6 == null ? null : viewGroup6).findViewById(R.id.dar);
        ViewGroup viewGroup7 = this.LLJILJILJ;
        viewGroup7 = viewGroup7 == null ? null : viewGroup7;
        ViewGroup viewGroup8 = this.LLJJ;
        viewGroup8 = viewGroup8 == null ? null : viewGroup8;
        long j = c1635820sfc.LJIIIIZZ;
        C1635840sfe c1635840sfe3 = c1635820sfc.LJIIJ;
        this.LLJJIJIL = new C1636040sfy(viewGroup, viewGroup7, viewGroup8, j, c1635840sfe3.LJFF, c1635840sfe3.LJIIJ, c1635840sfe3.LJIILL);
        MutableLiveData mutableLiveData = new MutableLiveData();
        LJ(li().LJJLJLI(new AfS159S0200000_25(mutableLiveData, stickerViewImpl, 18)));
        c1631250sYF.LJ = mutableLiveData;
        if (c1635820sfc.LJIIJ.LJIIJ) {
            viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: X.0sfo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            ViewGroup viewGroup9 = this.LLJILJILJ;
            (viewGroup9 == null ? null : viewGroup9).setOnTouchListener(new View.OnTouchListener() { // from class: X.0sfp
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
        }
        ViewGroup viewGroup10 = this.LLJILJILJ;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (viewGroup10 == null ? null : viewGroup10).findViewById(R.id.x1q).getLayoutParams();
        int i = c1635820sfc.LIZLLL;
        if (i > 0) {
            marginLayoutParams.topMargin = i;
        }
        int i2 = marginLayoutParams.topMargin;
        ViewGroup viewGroup11 = this.LLJILJILJ;
        marginLayoutParams.topMargin = i2 + ScreenUtils.getStatusBarHeight((viewGroup11 == null ? null : viewGroup11).getContext());
        ViewGroup viewGroup12 = this.LLJILJILJ;
        View viewFindViewById = (viewGroup12 == null ? null : viewGroup12).findViewById(R.id.mfw);
        if (viewFindViewById != null && c1635820sfc.LIZ != 0) {
            viewFindViewById.setBackground(c19gs.getResources().getDrawable(c1635820sfc.LIZ));
        }
        if (c1635820sfc.LIZIZ != 0) {
            ViewGroup viewGroup13 = this.LLJJJJ;
            (viewGroup13 == null ? null : viewGroup13).setBackground(c19gs.getResources().getDrawable(c1635820sfc.LIZIZ));
        }
        C1636070sg1.LIZ = 15;
    }
}
