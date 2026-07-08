package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2;

import X.AbstractC1347290lAF;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1344030l4z;
import X.C1347110l9x;
import X.C1352140lI4;
import X.C1352150lI5;
import X.C1352160lI6;
import X.C1352460lIa;
import X.C13IQ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1352000lHq;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AAListenerS332S0100000_21;
import Y.ACListenerS155S0100000_21;
import Y.AUListenerS270S0100000_21;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.Editable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboarInputAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS5S0020000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NowKeyboardFragment extends BaseNowKeyboardFragment implements InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiIioqHELIOSKiotOyt9IyA1KyAyOiE6e2EdJzIHLDYxJyQ+LQkhKSIhLCEn";
    public KeyboardFakePopupWindow LLIZLLLIL;
    public View LLJ;
    public Animator LLJI;
    public Animator LLJIJIL;
    public C1352460lIa LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(117));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(118));
    public ValueAnimator LLJJ;
    public final C01GW LLJJI;
    public ICommentMentionAssemAbility LLJJIII;
    public IKeyboarInputAbility LLJJIJI;
    public IKeyboardV2Ability LLJJIJIIJIL;

    public NowKeyboardFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NowKeyboardVM.class);
        this.LLJJI = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 823), AFwS259S0000000_21.get$arr$(388), (Function0) null, 2));
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ICommentMentionAssemAbility.class) {
            this.LLJJIII = (ICommentMentionAssemAbility) obj;
        } else if (cls == IKeyboarInputAbility.class) {
            this.LLJJIJI = (IKeyboarInputAbility) obj;
        } else if (cls == IKeyboardV2Ability.class) {
            this.LLJJIJIIJIL = (IKeyboardV2Ability) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentKeyboardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ICommentMentionAssemAbility.class) {
            return this.LLJJIII;
        }
        if (cls == IKeyboarInputAbility.class) {
            return this.LLJJIJI;
        }
        if (cls == IKeyboardV2Ability.class) {
            return this.LLJJIJIIJIL;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentKeyboardScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentKeyboardScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ICommentMentionAssemAbility.class) {
            this.LLJJIII = null;
        } else if (cls == IKeyboarInputAbility.class) {
            this.LLJJIJI = null;
        } else if (cls == IKeyboardV2Ability.class) {
            this.LLJJIJIIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void SR() {
        AbstractC1347290lAF abstractC1347290lAF;
        C1352140lI4 c1352140lI4 = this.LLIZ;
        if (c1352140lI4 == null || (abstractC1347290lAF = c1352140lI4.LIZ) == null) {
            abstractC1347290lAF = C1347110l9x.LIZ;
        }
        UR().xQ2(abstractC1347290lAF, true);
        C1352140lI4 c1352140lI42 = this.LLIZ;
        Editable editable = c1352140lI42 != null ? c1352140lI42.LIZIZ : null;
        INowKeyboardInputPanelAssemAbility iNowKeyboardInputPanelAssemAbility = (INowKeyboardInputPanelAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), INowKeyboardInputPanelAssemAbility.class, null);
        if (iNowKeyboardInputPanelAssemAbility != null) {
            iNowKeyboardInputPanelAssemAbility.h10(editable);
        }
        C1352140lI4 c1352140lI43 = this.LLIZ;
        if (c1352140lI43 == null || !Intrinsics.LJFF(c1352140lI43.LIZJ, Boolean.TRUE)) {
            return;
        }
        NowKeyboardVM nowKeyboardVMUR = UR();
        nowKeyboardVMUR.getClass();
        nowKeyboardVMUR.setStateImmediate(new AwS5S0020000_21(true, 3));
    }

    public final NowKeyboardVM UR() {
        return (NowKeyboardVM) this.LLJJI.getValue();
    }

    public final void VR() {
        ValueAnimator valueAnimator;
        C1344030l4z.LIZJ("NowKeyboardFragment", "showKeyboardFragment");
        if (getView() == null) {
            return;
        }
        C1344030l4z.LIZJ("NowKeyboardFragment", "truly showKeyboardFragment ");
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1352160lI6 c1352160lI6 = C1352150lI5.LIZ;
        if (c1352160lI6.LIZJ == 0) {
            c1352160lI6.LIZJ = jCurrentTimeMillis;
        }
        KeyboardFakePopupWindow keyboardFakePopupWindow = this.LLIZLLLIL;
        if (keyboardFakePopupWindow != null) {
            keyboardFakePopupWindow.show();
        }
        ValueAnimator valueAnimator2 = this.LLJJ;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LLJJ) != null) {
            valueAnimator.cancel();
        }
        SR();
        this.LLJIJIL = ObjectAnimator.ofFloat(getView(), (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
        View view = getView();
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
        this.LLJJ = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator3 = this.LLJJ;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS270S0100000_21(this, 2));
        }
        ValueAnimator valueAnimator4 = this.LLJJ;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(200L);
        }
        Animator animator = this.LLJIJIL;
        if (animator != null) {
            animator.setDuration(200L);
        }
        Animator animator2 = this.LLJIJIL;
        if (animator2 != null) {
            animator2.setInterpolator((Interpolator) this.LLJILJILJ.getValue());
        }
        Animator animator3 = this.LLJIJIL;
        if (animator3 != null) {
            animator3.addListener(new AAListenerS332S0100000_21(this, 5));
        }
        ValueAnimator valueAnimator5 = this.LLJJ;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        Animator animator4 = this.LLJIJIL;
        if (animator4 != null) {
            animator4.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.BaseNowKeyboardFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        KeyboardFakePopupWindow keyboardFakePopupWindow = this.LLIZLLLIL;
        if (keyboardFakePopupWindow != null) {
            keyboardFakePopupWindow.release();
        }
    }

    public final void dr(C1352460lIa c1352460lIa) {
        this.LLJILJIL = c1352460lIa;
        View view = getView();
        if (view != null) {
            Aweme aweme = null;
            INowKeyboardInputPanelAssemAbility iNowKeyboardInputPanelAssemAbility = (INowKeyboardInputPanelAssemAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), INowKeyboardInputPanelAssemAbility.class, null);
            if (iNowKeyboardInputPanelAssemAbility != null) {
                iNowKeyboardInputPanelAssemAbility.dr(c1352460lIa);
            }
            NowKeyboardVM nowKeyboardVMUR = UR();
            if (c1352460lIa != null) {
                aweme = c1352460lIa.LL;
            }
            nowKeyboardVMUR.wQ2(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.BaseNowKeyboardFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Aweme aweme;
        super.onViewCreated(view, bundle);
        NowKeyboardVM nowKeyboardVMUR = UR();
        C1352460lIa c1352460lIa = this.LLJILJIL;
        if (c1352460lIa != null) {
            aweme = c1352460lIa.LL;
        } else {
            aweme = null;
        }
        nowKeyboardVMUR.wQ2(aweme);
        View view2 = this.LLJ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 21), view2);
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 100), 3);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0lI3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJIJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 18), 4);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0lI2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLILZ;
            }
        }, null, new AwS635S0100000_21(this, 19), 6);
        SR();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a3g, viewGroup, false);
        KeyboardFakePopupWindow keyboardFakePopupWindow = new KeyboardFakePopupWindow(viewTd.getContext(), viewTd);
        this.LLIZLLLIL = keyboardFakePopupWindow;
        keyboardFakePopupWindow.LLJ = new InterfaceC1352000lHq() { // from class: X.0lDu
            @Override // X.InterfaceC1352000lHq
            public final void j(int i) {
            }

            @Override // X.InterfaceC1352000lHq
            public final void LLILII() {
                this.LL.UR().yQ2(0, false);
            }

            @Override // X.InterfaceC1352000lHq
            public final void LLLLZI(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("keyboardFakePopupWindow show keyboard height->");
                sbLIZ.append(i);
                C1344030l4z.LIZJ("NowKeyboardFragment", C2188811AlT.LIZIZ(sbLIZ));
                if (i != C1349270lDR.LJFF) {
                    C1349270lDR.LJFF = i;
                    if (i > 100) {
                        C1349270lDR.LIZIZ().storeInt("keyboard_height_portrait", i);
                    }
                }
                this.LL.UR().yQ2(i, true);
            }
        };
        keyboardFakePopupWindow.show();
        this.LLJ = viewTd.findViewById(R.id.pvy);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
