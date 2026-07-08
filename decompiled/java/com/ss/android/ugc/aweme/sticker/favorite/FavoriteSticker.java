package com.ss.android.ugc.aweme.sticker.favorite;

import X.C01GW;
import X.C0CNO;
import X.C11NJ;
import X.C11VU;
import X.C1630210sWZ;
import X.C1631810sZ9;
import X.C1635820sfc;
import X.C1695930uEZ;
import X.C19GS;
import X.C20094213jo;
import X.C2520309uD;
import X.C423180Gia;
import X.C444960Hcc;
import X.C452501pT;
import X.C786410Ut5;
import X.C790060Uyy;
import X.InterfaceC1623100sL6;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625220sOW;
import X.InterfaceC1628180sTI;
import X.InterfaceC1628970sUZ;
import X.InterfaceC1630220sWa;
import X.InterfaceC1637600siU;
import X.InterfaceC790070Uyz;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS39S0300000_6;
import Y.AfS194S0100000_25;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.ab.EffectUploadPickerFolderUIExperiment;
import com.ss.android.ugc.aweme.sticker.favorite.FavoriteSticker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import irm.AkS92S0100000_25;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS141S0110000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import u4.q0;

/* JADX INFO: loaded from: classes26.dex */
public class FavoriteSticker implements InterfaceC1623100sL6, GenericLifecycleObserver {
    public final C19GS LL;
    public final LifecycleOwner LLILLJJLI;
    public final InterfaceC1624480sNK LLILLL;
    public final InterfaceC1625220sOW LLILZ;
    public final InterfaceC1628180sTI LLILZIL;
    public final FrameLayout LLILZLL;
    public final C1695930uEZ LLIZ;
    public final InterfaceC1630220sWa LLIZLLLIL;
    public final Function2<Effect, Boolean, Unit> LLJ;
    public C1630210sWZ LLJI;
    public final Drawable LLJIJIL;
    public final Drawable LLJILJIL;
    public final View LLJILJILJ;
    public final TuxTextView LLJILLL;
    public C11NJ LLJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 410));
    public final C423180Gia LLJJIII;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZLLL() {
        this.LLILLL.getStickerRepository().LIZIZ(new C1631810sZ9("sticker_category:favorite", 0, 0, 0, false, 0, null, 1022));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLIZ.setOnStateChangeListener(null);
        this.LLIZ.clearAnimation();
        C1630210sWZ c1630210sWZ = this.LLJI;
        if (c1630210sWZ != null) {
            C790060Uyy.LIZLLL(c1630210sWZ);
            this.LLJI = null;
        }
        C11NJ c11nj = this.LLJJ;
        if (c11nj != null) {
            c11nj.LJ();
        }
    }

    @Override // X.InterfaceC1623100sL6
    public void LIZ(boolean z) {
        if (z) {
            if (!this.LL.isFinishing()) {
                C423180Gia c423180Gia = this.LLJJIII;
                View view = this.LLJILJILJ;
                C19GS c19gs = this.LL;
                if (!c423180Gia.LIZ.LIZLLL() && view.getParent() != null) {
                    HandlerHook.viewPost(view, new ARunnableS39S0300000_6(c19gs, view, c423180Gia, 9));
                }
            }
            C786410Ut5.LJZ(0, this.LLILZLL);
            return;
        }
        C786410Ut5.LJZ(8, this.LLILZLL);
    }

    @Override // X.InterfaceC1623100sL6
    public final void LIZIZ(Effect effect) {
        C0CNO.LIZLLL(0L, new AwS141S0110000_25(LIZJ(effect), this, 2));
    }

    public final boolean LIZJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        return ((InterfaceC1628970sUZ) this.LLJJI.getValue()).LJJII(effect.getEffectId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0Uyz, X.0sWZ] */
    public FavoriteSticker(C19GS c19gs, LifecycleOwner lifecycleOwner, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625220sOW interfaceC1625220sOW, InterfaceC1628180sTI interfaceC1628180sTI, FrameLayout frameLayout, C1695930uEZ c1695930uEZ, InterfaceC1630220sWa interfaceC1630220sWa, Function0<C1635820sfc> function0, Function2<? super Effect, ? super Boolean, Unit> function2) {
        float fLIZ;
        float fLIZ2;
        this.LL = c19gs;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = interfaceC1624480sNK;
        this.LLILZ = interfaceC1625220sOW;
        this.LLILZIL = interfaceC1628180sTI;
        this.LLILZLL = frameLayout;
        this.LLIZ = c1695930uEZ;
        this.LLIZLLLIL = interfaceC1630220sWa;
        this.LLJ = function2;
        this.LLJJIII = new C423180Gia(interfaceC1630220sWa);
        lifecycleOwner.getLifecycle().addObserver(this);
        C786410Ut5.O7(frameLayout, new AkS92S0100000_25(this, 3));
        final String string = c19gs.getString(R.string.cpa);
        final String string2 = c19gs.getString(2131828350);
        q0.LJIJ(frameLayout, new C20094213jo() { // from class: X.0sjr
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                String str;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                if (view.isSelected()) {
                    str = string2;
                } else {
                    str = string;
                }
                accessibilityNodeInfoCompat.addAction(new C20092413jW(16, str));
            }
        });
        TuxTextView tuxTextView = (TuxTextView) frameLayout.findViewById(R.id.w_z);
        this.LLJILLL = tuxTextView;
        View viewFindViewById = frameLayout.findViewById(R.id.mfn);
        View viewFindViewById2 = frameLayout.findViewById(R.id.mfm);
        this.LLJILJILJ = viewFindViewById2;
        if (function0.invoke() != null) {
            if (viewFindViewById != null) {
                viewFindViewById.getLayoutParams().height = (int) C11VU.LIZ(32.0f);
                viewFindViewById.getLayoutParams().width = (int) C11VU.LIZ(32.0f);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setPadding((int) C11VU.LIZ(12.0f), viewFindViewById2.getPaddingTop(), viewFindViewById2.getPaddingRight(), viewFindViewById2.getPaddingBottom());
            }
            interfaceC1624480sNK.getStickerRepository().LJIILJJIL().LJJ().LJIILJJIL.observe(this.LLILLJJLI, new AObserverS227S0100000_25(this, 35));
        }
        if (EffectUploadPickerFolderUIExperiment.isEnabled()) {
            interfaceC1624480sNK.LJJJI().observe(this.LLILLJJLI, new AObserverS227S0100000_25(this, 36));
        }
        c19gs.getResources().getDimension(R.dimen.ne);
        c19gs.getResources().getDimension(R.dimen.nh);
        c19gs.getResources().getDimension(R.dimen.nc);
        this.LLJIJIL = c19gs.getResources().getDrawable(R.drawable.c2w);
        this.LLJILJIL = c19gs.getResources().getDrawable(R.drawable.c2x);
        c1695930uEZ.setOnStateChangeListener(new InterfaceC1637600siU() { // from class: X.0sUW
            public Effect LIZ;
            public Effect LIZIZ;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1637600siU
            public final void LIZ() {
                String key;
                InterfaceC420801kM interfaceC420801kMLJJIIZ;
                Effect effect = this.LIZ;
                if (effect != null) {
                    FavoriteSticker favoriteSticker = this.LIZJ;
                    Function2<Effect, Boolean, Unit> function22 = favoriteSticker.LLJ;
                    if (function22 != null) {
                        function22.invoke(effect, Boolean.valueOf(favoriteSticker.LIZJ(effect)));
                    }
                    C11NJ c11nj = favoriteSticker.LLJJ;
                    if (c11nj == null) {
                        c11nj = new C11NJ();
                        favoriteSticker.LLJJ = c11nj;
                    }
                    if (favoriteSticker.LIZJ(effect)) {
                        interfaceC420801kMLJJIIZ = ((InterfaceC1628970sUZ) favoriteSticker.LLJJI.getValue()).LJII(EnumC1149370g11.PANEL, effect, true).LJJIIZ(new AfS194S0100000_25(favoriteSticker, effect, 41), new C09JN() { // from class: X.0sUX
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("FavoriteSticker@7d3c.<init>$5$onAnimationEnd$1$2");
                                C1C7U.LIZIZ("FavoriteSticker@7d3c.<init>$5$onAnimationEnd$1$2");
                            }
                        });
                    } else {
                        C1449000noI c1449000noI = (C1449000noI) favoriteSticker.LLILLL.LJII().LJ().getValue();
                        EffectCategoryModel effectCategoryModelLJIIIIZZ = c1449000noI != null ? C1625940sPg.LJIIIIZZ(favoriteSticker.LLILLL, c1449000noI.LIZIZ) : null;
                        Pair[] pairArr = new Pair[2];
                        if (effectCategoryModelLJIIIIZZ == null || (key = effectCategoryModelLJIIIIZZ.getKey()) == null) {
                            key = "";
                        }
                        pairArr[0] = new Pair("tab_key", key);
                        pairArr[1] = new Pair("impr_position", c1449000noI != null ? String.valueOf(c1449000noI.LIZJ) : "");
                        favoriteSticker.LLILZ.LJI(effect, false, "click_main_panel", C2097608Jq.LJIIIIZZ(pairArr));
                        if (this.LIZIZ != null) {
                            favoriteSticker.LLILZ.LJI(effect, true, "click_banner", C2097608Jq.LJ());
                        }
                        interfaceC420801kMLJJIIZ = ((InterfaceC1628970sUZ) favoriteSticker.LLJJI.getValue()).LJII(EnumC1149370g11.PANEL, effect, false).LJJIIZ(new AfS194S0100000_25(favoriteSticker, effect, 42), new C09JN() { // from class: X.0sUY
                            @Override // X.C09JN
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                C1C7U.LIZ("FavoriteSticker@7d3c.<init>$5$onAnimationEnd$1$4");
                                C1C7U.LIZIZ("FavoriteSticker@7d3c.<init>$5$onAnimationEnd$1$4");
                            }
                        });
                    }
                    c11nj.LIZ(interfaceC420801kMLJJIIZ);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1637600siU
            public final void onStateChange(int i) {
                if (i == 0) {
                    this.LIZ = this.LIZJ.LLILLL.LLILIL();
                    Effect effect = (Effect) this.LIZJ.LLILLL.LJII().LJIJJLI().getValue();
                    if (effect != null && !TextUtils.isEmpty(effect.getParentId())) {
                        this.LIZIZ = effect;
                    }
                    InterfaceC1628970sUZ interfaceC1628970sUZ = (InterfaceC1628970sUZ) this.LIZJ.LLJJI.getValue();
                    FavoriteSticker favoriteSticker = this.LIZJ;
                    interfaceC1628970sUZ.LJIILJJIL(!favoriteSticker.LIZJ(favoriteSticker.LLILLL.LLILIL()));
                    return;
                }
                if (i != 1) {
                    return;
                }
                FavoriteSticker favoriteSticker2 = this.LIZJ;
                C0CNO.LIZLLL(0L, new AwS141S0110000_25(true ^ favoriteSticker2.LIZJ(favoriteSticker2.LLILLL.LLILIL()), favoriteSticker2, 2));
            }
        });
        if (C2520309uD.LIZ) {
            if (C444960Hcc.LIZIZ()) {
                fLIZ = C11VU.LIZ(8.0f);
            } else {
                fLIZ = C11VU.LIZ(6.0f);
            }
            int i = (int) fLIZ;
            int iLIZ = (int) C11VU.LIZ(6.0f);
            if (C444960Hcc.LIZIZ()) {
                fLIZ2 = C11VU.LIZ(6.0f);
            } else {
                fLIZ2 = C11VU.LIZ(8.0f);
            }
            viewFindViewById.setPadding(i, iLIZ, (int) fLIZ2, (int) C11VU.LIZ(6.0f));
            viewFindViewById.getLayoutParams().height = -2;
            viewFindViewById.getLayoutParams().width = -2;
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C790060Uyy.LIZIZ(c19gs);
        ?? r0 = new InterfaceC790070Uyz() { // from class: X.0sWZ
            public boolean LIZ = true;

            @Override // X.InterfaceC790070Uyz
            public final void LIZ() {
                this.LIZ = false;
            }

            @Override // X.InterfaceC790070Uyz
            public final void LIZIZ() {
                if (this.LIZ) {
                    return;
                }
                this.LIZIZ.LIZLLL();
                this.LIZ = true;
            }
        };
        this.LLJI = r0;
        C790060Uyy.LIZJ(r0);
    }
}
