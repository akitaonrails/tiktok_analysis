package com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel;

import X.AbstractC712240Rwk;
import X.C098200Yq;
import X.C0FPM;
import X.C1624550sNR;
import X.C1633850scR;
import X.C1642990srB;
import X.C1643270srd;
import X.C1685300txQ;
import X.C1698150uI9;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19U1;
import X.C20632315oP;
import X.C786410Ut5;
import X.InterfaceC1584740rLE;
import X.InterfaceC1635410sex;
import Y.ACListenerS159S0100000_25;
import Y.AObserverS130S0300000_25;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class OptionCategoryPanelFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWs+LCw8OiEpO2EgPCwvIiohZiHELIOSo8PSY8JiklOjt9OCQiLCN9BzU4ICA9CyQ4LCg8OjwcKCE2JAM+KCg+LSs4";
    public final l0 LL;
    public final ShortVideoContext LLILLJJLI;
    public C20632315oP LLILLL;
    public C19U1 LLILZ;
    public InterfaceC1635410sex LLILZIL;
    public C1643270srd LLILZLL;
    public OptionCategoryPanelViewModel LLIZ;
    public C1642990srB LLIZLLLIL;
    public Effect LLJ;
    public Effect LLJI;
    public String LLJIJIL;
    public Function1<? super Boolean, Unit> LLJILJIL = AFwS266S0000000_25.get$arr$(306);
    public Boolean LLJILJILJ;

    public OptionCategoryPanelFragment(l0 l0Var, ShortVideoContext shortVideoContext) {
        this.LL = l0Var;
        this.LLILLJJLI = shortVideoContext;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Effect effect;
        Effect effect2;
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (effect = (Effect) arguments.getParcelable("panel_effect")) == null) {
            effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        }
        this.LLJ = effect;
        Bundle arguments2 = getArguments();
        OptionCategoryPanelViewModel optionCategoryPanelViewModel = null;
        if (arguments2 != null) {
            effect2 = (Effect) arguments2.getParcelable("stackable_effect");
        } else {
            effect2 = null;
        }
        this.LLJI = effect2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string = arguments3.getString("selected_image_path");
        } else {
            string = null;
        }
        this.LLJIJIL = string;
        this.LLILZIL = C1633850scR.LIZ(C786410Ut5.P3(requireActivity()), null);
        Effect effect3 = this.LLJ;
        if (effect3 == null) {
            effect3 = null;
        }
        InterfaceC1635410sex interfaceC1635410sex = this.LLILZIL;
        if (interfaceC1635410sex == null) {
            interfaceC1635410sex = null;
        }
        this.LLILZLL = new C1643270srd(effect3, interfaceC1635410sex, this.LL, this.LLILLJJLI);
        this.LLIZ = (OptionCategoryPanelViewModel) ViewModelProviders.of(this, new C1698150uI9(this, 0)).get(OptionCategoryPanelViewModel.class);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.bn2);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS159S0100000_25(this, 45));
        }
        this.LLILLL = (C20632315oP) view.findViewById(R.id.ppx);
        this.LLILZ = (C19U1) view.findViewById(R.id.ppu);
        C0FPM c0fpm = (C0FPM) view.findViewById(R.id.g3w);
        c0fpm.LIZ();
        TextView textView = (TextView) view.findViewById(R.id.q1q);
        Effect effect4 = this.LLJ;
        if (effect4 == null) {
            effect4 = null;
        }
        if (C1624550sNR.LIZJ(effect4)) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ppv);
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
        } else {
            C19U1 c19u1 = this.LLILZ;
            if (c19u1 == null) {
                c19u1 = null;
            }
            C786410Ut5.LLFFF(0, c19u1);
        }
        C19U1 c19u12 = this.LLILZ;
        if (c19u12 == null) {
            c19u12 = null;
        }
        c19u12.addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0sr6
            @Override // X.InterfaceC1586460rO0
            public final void ih(C19U0 c19u0) {
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC1586460rO0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Oq(X.C19U0 r7) {
                /*
                    r6 = this;
                    com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment r3 = r6.LL
                    java.lang.CharSequence r0 = r7.LIZJ
                    java.lang.String r5 = java.lang.String.valueOf(r0)
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LLJI
                    r2 = 1
                    if (r0 == 0) goto L6b
                    boolean r0 = X.C1624550sNR.LJ(r0)
                    if (r0 != r2) goto L6b
                    java.lang.String r1 = "mix_other_effects"
                L15:
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LLJI
                    if (r0 == 0) goto L69
                    boolean r0 = X.C1624550sNR.LJ(r0)
                    if (r0 != r2) goto L69
                L1f:
                    r4 = 0
                    if (r2 == 0) goto L5f
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LLJI
                    if (r0 != 0) goto L64
                    r3 = r4
                L27:
                    X.0LAB r2 = new X.0LAB
                    r2.<init>()
                    java.lang.String r0 = "enter_from"
                    r2.LJ(r0, r1)
                    java.lang.String r1 = "enter_method"
                    java.lang.String r0 = "click"
                    r2.LJ(r1, r0)
                    java.lang.String r0 = "entry_effect_identifier"
                    r2.LJ(r0, r3)
                    java.lang.String r0 = "effect_category"
                    r2.LJ(r0, r5)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                    java.lang.String r0 = "click_stackable_effect_category"
                    X.C1449260noi.LJ(r0, r1)
                    com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment r0 = r6.LL
                    X.15oP r0 = r0.LLILLL
                    if (r0 == 0) goto L50
                    r4 = r0
                L50:
                    int r0 = r7.LJ
                    r4.setCurrentItem(r0)
                    android.graphics.drawable.Drawable r1 = r7.LIZIZ
                    if (r1 == 0) goto L5e
                    r0 = 255(0xff, float:3.57E-43)
                    r1.setAlpha(r0)
                L5e:
                    return
                L5f:
                    com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LLJ
                    if (r0 != 0) goto L64
                    r0 = r4
                L64:
                    java.lang.String r3 = r0.getName()
                    goto L27
                L69:
                    r2 = 0
                    goto L1f
                L6b:
                    java.lang.String r1 = "prop_click"
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1642940sr6.Oq(X.19U0):void");
            }

            @Override // X.InterfaceC1586460rO0
            public final void Yn(C19U0 c19u0) {
                Drawable drawable = c19u0.LIZIZ;
                if (drawable != null) {
                    drawable.setAlpha(127);
                }
            }
        });
        C20632315oP c20632315oP = this.LLILLL;
        if (c20632315oP == null) {
            c20632315oP = null;
        }
        c20632315oP.LIZIZ(new AbstractC712240Rwk() { // from class: X.0sr7
            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                C19U1 c19u13 = this.LL.LLILZ;
                if (c19u13 == null) {
                    c19u13 = null;
                }
                C19U0 tabAt = c19u13.getTabAt(i);
                if (tabAt != null) {
                    tabAt.LIZIZ();
                }
            }
        });
        OptionCategoryPanelViewModel optionCategoryPanelViewModel2 = this.LLIZ;
        if (optionCategoryPanelViewModel2 != null) {
            optionCategoryPanelViewModel = optionCategoryPanelViewModel2;
        }
        optionCategoryPanelViewModel.LLJ.observe(this, new AObserverS130S0300000_25(this, c0fpm, textView, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.du8, viewGroup, false);
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
