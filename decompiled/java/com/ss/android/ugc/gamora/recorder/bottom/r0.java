package com.ss.android.ugc.gamora.recorder.bottom;

import X.AbstractC1252750ihl;
import X.AbstractC1653290t7n;
import X.C004I;
import X.C01GW;
import X.C0LCS;
import X.C0LG8;
import X.C1170060gYO;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C12ES;
import X.C1634100scq;
import X.C1644460stY;
import X.C1653620t8K;
import X.C1653630t8L;
import X.C1655280tB0;
import X.C1765020w20;
import X.C19ME;
import X.C385670FAf;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C560020Lxo;
import X.C786410Ut5;
import X.C861980Xrg;
import X.InterfaceC1166920gTK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS241S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import bfk.b0;
import com.bytedance.als.h0;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.views.TransEdgeView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class r0 extends Scene implements InterfaceC1166920gTK {
    public final ShortVideoContext LLJI;
    public final AbstractC1653290t7n LLJIJIL;
    public final C385670FAf<Boolean> LLJILJIL;
    public TabHost LLJILLL;
    public ImageView LLJJI;
    public final h0<Boolean> LLJILJILJ = new h0<>(Boolean.FALSE);
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 525));

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final Object LLLII() {
        TabHost tabHost = this.LLJILLL;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        } else {
            tabHost2 = tabHost;
        }
        return tabHost2.LIZ(tabHost.getCurrentIndex());
    }

    public final TransEdgeView LLLIILIL() {
        return (TransEdgeView) this.LLJJ.getValue();
    }

    public final void LLLLIILL() {
        TabHost tabHost = this.LLJILLL;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        } else {
            tabHost2 = tabHost;
        }
        tabHost2.LJ(true, tabHost.getLastIndex(), 7, true);
    }

    public final void LLLILZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LLLIILIL().getLayoutParams();
        float fLIZJ = C12ES.LIZJ(16.0f, requireActivity());
        int i = marginLayoutParams.leftMargin;
        if (i > 0) {
            if (marginLayoutParams.rightMargin > 0) {
                TransEdgeView transEdgeViewLLLIILIL = LLLIILIL();
                transEdgeViewLLLIILIL.LLILZLL = 12;
                transEdgeViewLLLIILIL.invalidate();
                LLLIILIL().setDrawSize(fLIZJ);
                return;
            }
        } else if (i == 0) {
            TransEdgeView transEdgeViewLLLIILIL2 = LLLIILIL();
            transEdgeViewLLLIILIL2.LLILZLL = 4;
            transEdgeViewLLLIILIL2.invalidate();
            LLLIILIL().setDrawSize(fLIZJ);
            return;
        }
        if (marginLayoutParams.rightMargin != 0) {
            LLLIILIL().setDrawSize(0.0f);
            return;
        }
        TransEdgeView transEdgeViewLLLIILIL3 = LLLIILIL();
        transEdgeViewLLLIILIL3.LLILZLL = 8;
        transEdgeViewLLLIILIL3.invalidate();
        LLLIILIL().setDrawSize(fLIZJ);
    }

    public final int LLLIIIIL(Object obj) {
        TabHost tabHost = this.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        int tabCount = tabHost.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabHost tabHost2 = this.LLJILLL;
            if (tabHost2 == null) {
                tabHost2 = null;
            }
            if (Intrinsics.LJFF(obj, tabHost2.LIZ(i))) {
                return i;
            }
        }
        return -1;
    }

    public final void LLLIL(String str) {
        View childAt;
        b0 b0Var;
        int i;
        int i2;
        int iLLLIIIIL = LLLIIIIL(str);
        TabHost tabHost = null;
        if (iLLLIIIIL >= 0) {
            TabHost tabHost2 = this.LLJILLL;
            if (tabHost2 == null) {
                tabHost2 = null;
            }
            LinearLayout linearLayout = tabHost2.LLIZ;
            if (linearLayout == null) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(iLLLIIIIL);
            }
            if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null) {
                b0Var.LLILZLL = false;
                TuxIconView tuxIconView = b0Var.LLILZ;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
                this.LLJIJIL.LJII().getClass();
                TextView textView = b0Var.getTextView();
                if (textView != null) {
                    textView.getPaint().setShader(null);
                    C786410Ut5.LLIL(textView, 0);
                    textView.invalidate();
                }
                C1295960jpS lottieView = b0Var.getLottieView();
                if (lottieView != null) {
                    lottieView.cancelAnimation();
                    C1294720jnS composition = lottieView.getComposition();
                    if (composition != null) {
                        lottieView.setComposition(composition);
                        lottieView.clearAnimation();
                        C786410Ut5.LLD(8, lottieView);
                    }
                }
                TextView textView2 = b0Var.getTextView();
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 0);
                }
                TabHost tabHost3 = this.LLJILLL;
                if (tabHost3 != null) {
                    tabHost = tabHost3;
                }
                int iLLLIIIIL2 = LLLIIIIL(str);
                int i3 = tabHost.LLJL;
                if (i3 == iLLLIIIIL2) {
                    i = tabHost.LLJJIJIL;
                } else {
                    i = tabHost.LLJJJ;
                }
                if (i3 == iLLLIIIIL2) {
                    i2 = tabHost.LLJJJIL;
                } else {
                    i2 = tabHost.LLJJJJ;
                }
                tabHost.LJII(iLLLIIIIL2, i, i2);
            }
        }
    }

    public final void LLLILZLLLI(Integer num) {
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LLLIILIL().getLayoutParams();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        marginLayoutParams.rightMargin = iIntValue;
        TransEdgeView transEdgeViewLLLIILIL = LLLIILIL();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(transEdgeViewLLLIILIL);
        transEdgeViewLLLIILIL.setLayoutParams(marginLayoutParams);
        LLLILZ();
    }

    public final void LLLJ(Integer num) {
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LLLIILIL().getLayoutParams();
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        marginLayoutParams.leftMargin = iIntValue;
        TabHost tabHost = this.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        if (num != null) {
            iIntValue2 = num.intValue();
        }
        tabHost.setStartMargin(iIntValue2);
        TransEdgeView transEdgeViewLLLIILIL = LLLIILIL();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(transEdgeViewLLLIILIL);
        transEdgeViewLLLIILIL.setLayoutParams(marginLayoutParams);
        LLLILZ();
    }

    public final void LLLLII(Animation animation) {
        TabHost tabHost = this.LLJILLL;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.clearAnimation();
        TabHost tabHost3 = this.LLJILLL;
        if (tabHost3 != null) {
            tabHost2 = tabHost3;
        }
        tabHost2.startAnimation(animation);
    }

    public final void LLLLIIIILLL(boolean z) {
        TabHost tabHost = null;
        if (z) {
            TabHost tabHost2 = this.LLJILLL;
            if (tabHost2 != null) {
                tabHost = tabHost2;
            }
            tabHost.LJIIIIZZ(R.attr.ee, R.attr.hp, false);
            return;
        }
        TabHost tabHost3 = this.LLJILLL;
        if (tabHost3 != null) {
            tabHost = tabHost3;
        }
        tabHost.LJIIIIZZ(R.attr.a0o, R.attr.a0w, true);
    }

    public final void LLLLIL(boolean z) {
        int i;
        if (((Boolean) C861980Xrg.LIZ.getValue()).booleanValue()) {
            return;
        }
        ImageView imageView = this.LLJJI;
        if (imageView == null) {
            imageView = null;
        }
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LJZI(i, imageView);
    }

    public final void LLLLILI(int i) {
        ImageView imageView = this.LLJJI;
        TabHost tabHost = null;
        if (imageView == null) {
            imageView = null;
        }
        C560020Lxo.LIZ(i, imageView);
        RecordPageOptionalConfig recordPageOptionalConfig = this.LLJI.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null && recordPageOptionalConfig.exteriorRecordPageType == C0LG8.PHOTO_SEARCH.getType()) {
            TabHost tabHost2 = this.LLJILLL;
            if (tabHost2 == null) {
                tabHost2 = null;
            }
            tabHost2.setScrollEnabled(false);
            TabHost tabHost3 = this.LLJILLL;
            if (tabHost3 != null) {
                tabHost = tabHost3;
            }
            tabHost.setUISwitchEnabled(false);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJILLL = (TabHost) requireViewById(R.id.ch_);
        this.LLJJI = (ImageView) requireViewById(R.id.sz2);
        TabHost tabHost = null;
        if (((Boolean) C861980Xrg.LIZ.getValue()).booleanValue()) {
            ImageView imageView = this.LLJJI;
            if (imageView == null) {
                imageView = null;
            }
            C786410Ut5.LJZI(8, imageView);
        }
        TabHost tabHost2 = this.LLJILLL;
        if (tabHost2 == null) {
            tabHost2 = null;
        }
        tabHost2.setSelectedTextColor(R.attr.ee);
        TabHost tabHost3 = this.LLJILLL;
        if (tabHost3 == null) {
            tabHost3 = null;
        }
        tabHost3.setUnselectedTextColor(R.attr.hp);
        TabHost tabHost4 = this.LLJILLL;
        if (tabHost4 == null) {
            tabHost4 = null;
        }
        tabHost4.setSelectedTextFont(43);
        TabHost tabHost5 = this.LLJILLL;
        if (tabHost5 == null) {
            tabHost5 = null;
        }
        tabHost5.setUnselectedTextFont(42);
        TabHost tabHost6 = this.LLJILLL;
        if (tabHost6 == null) {
            tabHost6 = null;
        }
        Context contextRequireSceneContext = requireSceneContext();
        TabHost tabHost7 = this.LLJILLL;
        if (tabHost7 == null) {
            tabHost7 = null;
        }
        tabHost6.setTabHostGestureListener(new C1653630t8L(contextRequireSceneContext, tabHost7, this.LLJILJILJ));
        AbstractC1653290t7n abstractC1653290t7n = this.LLJIJIL;
        ShortVideoContext shortVideoContext = this.LLJI;
        TabHost tabHost8 = this.LLJILLL;
        if (tabHost8 != null) {
            tabHost = tabHost8;
        }
        abstractC1653290t7n.LJIIJJI(shortVideoContext, tabHost);
        this.LLJILJIL.LIZ(this, new AObjectS241S0100000_8(this, 48));
    }

    public final void setTabSwitchEnabled(boolean z) {
        TabHost tabHost = this.LLJILLL;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.setScrollEnabled(z);
        TabHost tabHost3 = this.LLJILLL;
        if (tabHost3 != null) {
            tabHost2 = tabHost3;
        }
        tabHost2.setUISwitchEnabled(z);
    }

    public final void LLLJL(String str, C1655280tB0 c1655280tB0) {
        View childAt;
        b0 b0Var;
        int i;
        int i2;
        int iLLLIIIIL = LLLIIIIL(str);
        TabHost tabHost = null;
        if (iLLLIIIIL >= 0) {
            TabHost tabHost2 = this.LLJILLL;
            if (tabHost2 == null) {
                tabHost2 = null;
            }
            LinearLayout linearLayout = tabHost2.LLIZ;
            if (linearLayout == null) {
                childAt = null;
            } else {
                childAt = linearLayout.getChildAt(iLLLIIIIL);
            }
            if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null) {
                b0Var.LLILZLL = true;
                if (b0Var.LLILZ == null) {
                    b0Var.LLILZ = new TuxIconView(b0Var.getContext());
                    C19ME c19me = new C19ME(C418440Gaw.LIZ(17), C418440Gaw.LIZ(13));
                    c19me.rightToRight = b0Var.LL.getId();
                    c19me.topToTop = b0Var.LL.getId();
                    C786410Ut5.M6(b0Var.LLILZ, c19me);
                    b0Var.LLILZIL.addView(b0Var.LLILZ);
                }
                C786410Ut5.LLLLLLZZ(b0Var.LLILZ, 0);
                b0Var.LLILZ.setIconRes(R.raw.icon_color_ai_tool_tag);
                C426750GoL.LJIIJJI(b0Var.LL, null, null, Integer.valueOf(C418440Gaw.LIZ(18)), null, false);
                int paddingTop = b0Var.LL.getPaddingTop() - C418440Gaw.LIZ(7);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b0Var.LLILZ.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = paddingTop;
                    C786410Ut5.M6(b0Var.LLILZ, marginLayoutParams);
                }
                this.LLJIJIL.LJII().getClass();
                C1653620t8K.LIZIZ(b0Var, c1655280tB0);
                TabHost tabHost3 = this.LLJILLL;
                if (tabHost3 != null) {
                    tabHost = tabHost3;
                }
                int iLLLIIIIL2 = LLLIIIIL(str);
                int i3 = tabHost.LLJL;
                if (i3 == iLLLIIIIL2) {
                    i = tabHost.LLJJIJIL;
                } else {
                    i = tabHost.LLJJJ;
                }
                if (i3 == iLLLIIIIL2) {
                    i2 = tabHost.LLJJJIL;
                } else {
                    i2 = tabHost.LLJJJJ;
                }
                tabHost.LJII(iLLLIIIIL2, i, i2);
            }
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public r0(ShortVideoContext shortVideoContext, AbstractC1653290t7n abstractC1653290t7n, C385670FAf<Boolean> c385670FAf) {
        this.LLJI = shortVideoContext;
        this.LLJIJIL = abstractC1653290t7n;
        this.LLJILJIL = c385670FAf;
    }

    public final void LLLIZZ(int i, boolean z, boolean z2) {
        TabHost tabHost = this.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.LJFF(z, i, 0, z2, true);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).loadLayoutFiles("RecordBottomTabScene", getSceneContext(), layoutInflater, R.layout.i91, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
