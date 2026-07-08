package com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.second;

import X.AbstractC1856150yOz;
import X.C098200Yq;
import X.C0OM1;
import X.C0Q4Y;
import X.C1110404Vy;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1619980sG4;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1856130yOx;
import X.C1856140yOy;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C786410Ut5;
import X.InterfaceC1058150ddt;
import X.InterfaceC1352000lHq;
import X.InterfaceC1355580lNc;
import X.InterfaceC1856100yOu;
import X.InterfaceC344240DeY;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS161S0100000_27;
import Y.AsS36S0200000_27;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.second.TakoSecondLevelQuestionnaireFragment;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaireText;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS133S0101000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSecondLevelQuestionnaireFragment extends Fragment implements InterfaceC344240DeY, InterfaceC1058150ddt {
    public static final List<Integer> LLJI = new ArrayList();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9Kio4OS40LWsvKD03O2s9PCogPCwjHELIOSJyEyITcpZzw2KyoiLWEHKS4jGiowJysoBSolLSkdPCogPCwjJyEyITcpDz0yLygpJzs=";
    public InterfaceC1856100yOu LL;
    public TakoQuestionnaire LLILLJJLI;
    public Map<String, String> LLILLL;
    public InterfaceC1355580lNc LLILZ;
    public String LLILZIL = "";
    public boolean LLILZLL;
    public View LLIZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public View LLJ;

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public final List<AbstractC1856150yOz> MR() {
        ?? arrayList;
        String str;
        List<TakoQuestionnaireText> list;
        TakoQuestionnaire takoQuestionnaire = this.LLILLJJLI;
        if (takoQuestionnaire == null || (list = takoQuestionnaire.options) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (TakoQuestionnaireText takoQuestionnaireText : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                arrayList.add(new C1856140yOy(i, takoQuestionnaireText, ((ArrayList) LLJI).contains(Integer.valueOf(i)), new AwS133S0101000_27(i, this, 1)));
                i = i2;
            }
        }
        TakoQuestionnaire takoQuestionnaire2 = this.LLILLJJLI;
        String str2 = takoQuestionnaire2 != null ? takoQuestionnaire2.inputTips : null;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (takoQuestionnaire2 != null && (str = takoQuestionnaire2.characterLimitText) != null) {
            str3 = str;
        }
        return C13LP.LJLIL(Collections.singletonList(new C1856130yOx(str3, str2, new AwS606S0100000_27(this, 233))), arrayList);
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String str;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        TakoQuestionnaire takoQuestionnaire = this.LLILLJJLI;
        if (takoQuestionnaire == null || (str = takoQuestionnaire.level2Title) == null) {
            str = "";
        }
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS571S0100000_27(this, 760));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1355580lNc interfaceC1355580lNc = this.LLILZ;
        if (interfaceC1355580lNc != null) {
            interfaceC1355580lNc.release();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        TakoQuestionnaire takoQuestionnaire;
        Window window;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        View decorView = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("tako_questionnaire");
        } else {
            serializable = null;
        }
        if ((serializable instanceof TakoQuestionnaire) && (takoQuestionnaire = (TakoQuestionnaire) serializable) != null) {
            this.LLILLJJLI = takoQuestionnaire;
            ((ArrayList) LLJI).clear();
            IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
            C19EG activity = getActivity();
            C19EG activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = iKeyboardServiceLIZ.LIZ(activity, decorView);
            this.LLILZ = keyboardFakePopupWindowLIZ;
            if (keyboardFakePopupWindowLIZ != null) {
                keyboardFakePopupWindowLIZ.LLJ = new InterfaceC1352000lHq() { // from class: X.0yOw
                    @Override // X.InterfaceC1352000lHq
                    public final void j(int i) {
                    }

                    @Override // X.InterfaceC1352000lHq
                    public final void LLILII() {
                        TakoSecondLevelQuestionnaireFragment takoSecondLevelQuestionnaireFragment = this.LL;
                        takoSecondLevelQuestionnaireFragment.NR(0, new AwS571S0100000_27(takoSecondLevelQuestionnaireFragment, 1413));
                    }

                    @Override // X.InterfaceC1352000lHq
                    public final void LLLLZI(int i) {
                        int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = i - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL.getContext());
                        TakoSecondLevelQuestionnaireFragment takoSecondLevelQuestionnaireFragment = this.LL;
                        takoSecondLevelQuestionnaireFragment.NR(iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight, new AwS571S0100000_27(takoSecondLevelQuestionnaireFragment, 1414));
                    }
                };
                keyboardFakePopupWindowLIZ.show();
            }
        }
    }

    public final void NR(final int i, final Function0<Unit> function0) {
        final View view = this.LLJ;
        if (view != null) {
            final int measuredHeight = view.getMeasuredHeight();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eM5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i2 = (int) (measuredHeight + ((i - r2) * animatedFraction));
                    View view2 = view;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.height = i2;
                    C786410Ut5.W5(view2, layoutParams);
                    if (animatedFraction == 1.0f) {
                        function0.invoke();
                    }
                }
            });
            valueAnimatorOfFloat.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC1856100yOu interfaceC1856100yOu = this.LL;
        if (interfaceC1856100yOu != null) {
            interfaceC1856100yOu.onShow();
        }
        View viewFindViewById = view.findViewById(R.id.xc2);
        C786410Ut5.W5(viewFindViewById, new FrameLayout.LayoutParams(-1, (int) (ScreenUtils.getScreenHeight(getContext()) * 0.8f)));
        this.LLIZ = viewFindViewById;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.xc1);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
        viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoSecondLevelQuestionnaireOptionItemCell.class, TakoSecondLevelQuestionnaireInputItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS36S0200000_27(this, viewOnAttachStateChangeListenerC20604515jv, 1));
        viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(MR(), null);
        this.LLIZLLLIL = viewOnAttachStateChangeListenerC20604515jv;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.xc3);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
        C786410Ut5.h9(tuxTextView, new ACListenerS161S0100000_27(this, 74));
        C427690Gpr.LJI(tuxTextView, null);
        this.LLJ = view.findViewById(R.id.xc0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.foh, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
