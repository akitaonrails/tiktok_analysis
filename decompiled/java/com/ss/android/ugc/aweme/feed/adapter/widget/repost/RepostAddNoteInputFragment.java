package com.ss.android.ugc.aweme.feed.adapter.widget.repost;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0I7D;
import X.C0WZX;
import X.C0XQ7;
import X.C0ZP4;
import X.C1110404Vy;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C123100dR;
import X.C12ES;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1388190mED;
import X.C1402120mag;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2204961BRm;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427870Gq9;
import X.C438710HIf;
import X.C452501pT;
import X.C723850SaN;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C857160Xju;
import X.InterfaceC0148002o;
import X.InterfaceC1352000lHq;
import X.InterfaceC1355580lNc;
import X.InterfaceC1363540laS;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1842140y2O;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostAddNoteInputFragment extends BaseDialogFragment implements InterfaceC724530SbT, RepostInputAbility, View.OnClickListener, InterfaceC1352000lHq {
    public static final C419910GdJ LLJJIJIIJIL;
    public static final C419910GdJ LLJJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpLCt9KSEtOTs2Oms7HELIOSICs0LTFiOyojJzY4Zx02OCo/PQ43LAsjPSoaJjU5PQkhKSIhLCEn";
    public TuxTextView LLILLL;
    public LinearLayout LLILZ;
    public C427870Gq9 LLILZIL;
    public TuxIconView LLILZLL;
    public C197039127h LLIZ;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public long LLJI;
    public Map<String, String> LLJIJIL;
    public int LLJILJIL;
    public C0I7D LLJILJILJ;
    public InterfaceC1842140y2O LLJILLL;
    public Function0<Unit> LLJJ;
    public InterfaceC1355580lNc LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(255));

    @Override // X.InterfaceC1352000lHq
    public final void LLILII() {
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    static {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_emoji;
        Integer numValueOf = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LJ = numValueOf;
        LLJJIJIIJIL = c419910GdJ;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_keyboard_circle;
        c419910GdJ2.LJ = numValueOf;
        LLJJIJIL = c419910GdJ2;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        Function0<Unit> function0 = this.LLJJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC1355580lNc interfaceC1355580lNc = this.LLJJI;
        if (interfaceC1355580lNc != null) {
            interfaceC1355580lNc.release();
        }
        InterfaceC1355580lNc interfaceC1355580lNc2 = this.LLJJI;
        if (interfaceC1355580lNc2 != null) {
            interfaceC1355580lNc2.LJIJJ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0I7D c0i7d = this.LLJILJILJ;
        if (c0i7d != null) {
            c0i7d.requestFocus();
        }
        KeyboardUtils.LIZLLL(this.LLJILJILJ);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
            if (Build.VERSION.SDK_INT >= 30) {
                window2.setDecorFitsSystemWindows(false);
                WindowInsetsController insetsController = window2.getInsetsController();
                if (insetsController != null) {
                    insetsController.setSystemBarsBehavior(2);
                }
            } else {
                window2.getDecorView().setSystemUiVisibility(1792);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final Map<String, String> MR(String str) {
        LinkedHashMap linkedHashMap;
        String str2;
        Map<String, String> map = this.LLJIJIL;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (str != null) {
            InterfaceC1363540laS interfaceC1363540laS = (InterfaceC1363540laS) this.LLJJIJI.getValue();
            int iLJIIIIZZ = 0;
            if (interfaceC1363540laS != null && interfaceC1363540laS.onlyEmoji(str)) {
                str2 = "emoji";
            } else {
                InterfaceC1363540laS interfaceC1363540laS2 = (InterfaceC1363540laS) this.LLJJIJI.getValue();
                if (interfaceC1363540laS2 != null && interfaceC1363540laS2.containEmoji(str)) {
                    str2 = "text_emoji";
                } else {
                    str2 = "text";
                }
            }
            linkedHashMap.put("message_type", str2);
            InterfaceC1363540laS interfaceC1363540laS3 = (InterfaceC1363540laS) this.LLJJIJI.getValue();
            if (interfaceC1363540laS3 != null) {
                iLJIIIIZZ = interfaceC1363540laS3.LJIIIIZZ(str);
            }
            linkedHashMap.put("repost_length", String.valueOf(iLJIIIIZZ));
        }
        return linkedHashMap;
    }

    public final void NR(boolean z) {
        int iIntValue;
        Integer numLIZJ;
        C419910GdJ c419910GdJ;
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            if (z) {
                c419910GdJ = LLJJIJIL;
            } else {
                c419910GdJ = LLJJIJIIJIL;
            }
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxIconView tuxIconView2 = this.LLILZLL;
        if (tuxIconView2 != null) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxIconView2.setTintColor(iIntValue);
        }
        TuxIconView tuxIconView3 = this.LLILZLL;
        if (tuxIconView3 != null) {
            tuxIconView3.setSelected(z);
        }
    }

    public final void OR(Editable editable) {
        String string;
        C0I7D c0i7d;
        String string2 = null;
        if ((editable != null || ((c0i7d = this.LLJILJILJ) != null && (editable = C2204961BRm.LLLLJ(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3TaCzaVy3Ouy0XeOiT6f05qtKwcGMYTJRYr6tWkB/QdvHMxGl+M95jPzI1lAcJze", null))) != null)) && (string = editable.toString()) != null) {
            string2 = a0.LJLIIIL(string).toString();
        }
        C197039127h c197039127h = this.LLIZ;
        if (c197039127h != null) {
            c197039127h.setEnabled(C123100dR.LIZ(string2));
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
        Activity activityLIZ;
        ViewGroup.LayoutParams layoutParams;
        double d = i;
        Context context = getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (d < ((double) C12ES.LJIIIIZZ(activityLIZ)) * 0.15d) {
            return;
        }
        C1110404Vy.LIZ().LIZIZ(i, true);
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        FrameLayout frameLayout2 = this.LLIZLLLIL;
        if (frameLayout2 != null) {
            frameLayout2.requestLayout();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        Integer numValueOf;
        Editable editableLLLLJI;
        Editable editableLLLLJI2;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.t_f) {
                FrameLayout frameLayout = this.LLJ;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(8, frameLayout);
                }
                NR(false);
                KeyboardUtils.LIZLLL(this.LLJILJILJ);
                return;
            }
            if (numValueOf.intValue() == R.id.t_g) {
                TuxIconView tuxIconView = this.LLILZLL;
                if (tuxIconView == null) {
                    return;
                }
                tuxIconView.setSelected(!tuxIconView.isSelected());
                if (tuxIconView.isSelected()) {
                    FrameLayout frameLayout2 = this.LLJ;
                    if (frameLayout2 != null) {
                        C786410Ut5.LJZ(0, frameLayout2);
                    }
                    NR(true);
                    KeyboardUtils.LIZIZ(this.LLJILJILJ);
                } else {
                    FrameLayout frameLayout3 = this.LLJ;
                    if (frameLayout3 != null) {
                        C786410Ut5.LJZ(8, frameLayout3);
                    }
                    NR(false);
                    KeyboardUtils.LIZLLL(this.LLJILJILJ);
                }
                NR(tuxIconView.isSelected());
                return;
            }
            if (numValueOf.intValue() == R.id.t_m) {
                C0I7D c0i7d = this.LLJILJILJ;
                if (c0i7d != null) {
                    editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3TaCzaVy3Ouy0XeOiT6f05qtKwcGMYTJRYr6tWkB/QdvHMxGl+M95jPzI1lAcJze", null));
                } else {
                    editableLLLLJI = null;
                }
                String string = a0.LJLIIIL(String.valueOf(editableLLLLJI)).toString();
                Map<String, String> mapMR = MR(string);
                InterfaceC1363540laS interfaceC1363540laS = (InterfaceC1363540laS) this.LLJJIJI.getValue();
                if (interfaceC1363540laS != null) {
                    interfaceC1363540laS.LJII(this.LLJI, this.LLJILLL, string, mapMR);
                }
                C0I7D c0i7d2 = this.LLJILJILJ;
                if (c0i7d2 != null && (editableLLLLJI2 = C2204961BRm.LLLLJI(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3TaCzaVy3Ouy0XeOiT6f05qtKwcGMYTJRYr6tWkB/QdvHMxGl+M95jPzI1lAcJze", null))) != null) {
                    editableLLLLJI2.clear();
                }
                dismiss();
                C20684815ws.LJIILLIIL("livesdk_repost_notes_add", mapMR);
                return;
            }
        }
        dismiss();
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.ae_);
        setCancelable(true);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        String string;
        super.onViewCreated(view, bundle);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, RepostInputAbility.class, null, null);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.t_n);
        this.LLILZ = (LinearLayout) view.findViewById(R.id.t_l);
        this.LLILZIL = (C427870Gq9) view.findViewById(R.id.t_c);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.t_g);
        this.LLIZ = (C197039127h) view.findViewById(R.id.t_m);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.t9u);
        this.LLJ = (FrameLayout) view.findViewById(R.id.t9t);
        this.LLJILJILJ = (C0I7D) view.findViewById(R.id.t_f);
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context == null || (string = context.getString(2131855709)) == null) {
                string = "";
            }
            tuxTextView.setText(string);
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(40));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
        Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(curUser.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJ(this.LLILZIL);
        c1331670kl3LJIIIIZZ.LJJIIZI(drawableLIZ);
        c1331670kl3LJIIIIZZ.LJIIJJI();
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1d);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
            linearLayout.setBackground(c384050F3z2.LIZ(view.getContext()));
        }
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = C1110404Vy.LIZ().LIZJ(false);
        }
        FrameLayout frameLayout2 = this.LLIZLLLIL;
        if (frameLayout2 != null) {
            frameLayout2.requestLayout();
        }
        C723850SaN.LIZ(this, false, null, new AwS600S0100000_21(this, 265), 3);
        C197039127h c197039127h = this.LLIZ;
        if (c197039127h != null) {
            c197039127h.setText(getText(2131850097));
        }
        OR(null);
        C0I7D c0i7d = this.LLJILJILJ;
        if (c0i7d != null) {
            final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 545);
            c0i7d.setFilters(new C857160Xju[]{new InputFilter(awS565S0100000_21) { // from class: X.0Xju
                public final Function0<Unit> LL;

                {
                    this.LL = awS565S0100000_21;
                }

                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                    Function0<Unit> function0;
                    int length = 30 - (spanned.length() - (i4 - i3));
                    if (length <= 0) {
                        if (charSequence.length() > 0 && (function0 = this.LL) != null) {
                            function0.invoke();
                        }
                        return "";
                    }
                    if (length >= i2 - i) {
                        return null;
                    }
                    int i5 = length + i;
                    int i6 = i5 - 1;
                    if (Character.isHighSurrogate(charSequence.charAt(i6))) {
                        if (i6 == i) {
                            Function0<Unit> function02 = this.LL;
                            if (function02 != null) {
                                function02.invoke();
                            }
                            return "";
                        }
                        i5 = i6;
                    }
                    Function0<Unit> function03 = this.LL;
                    if (function03 != null) {
                        function03.invoke();
                    }
                    return charSequence.subSequence(i, i5);
                }
            }});
        }
        C0I7D c0i7d2 = this.LLJILJILJ;
        if (c0i7d2 != null) {
            c0i7d2.addTextChangedListener(new C1402120mag(this, 5));
        }
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, this);
        }
        C197039127h c197039127h2 = this.LLIZ;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, this);
        }
        C786410Ut5.I7(this, view);
        C0I7D c0i7d3 = this.LLJILJILJ;
        if (c0i7d3 != null) {
            c0i7d3.requestFocus();
        }
        C0I7D c0i7d4 = this.LLJILJILJ;
        if (c0i7d4 != null) {
            C786410Ut5.d9(c0i7d4, this);
        }
        KeyboardUtils.LIZLLL(this.LLJILJILJ);
        C20684815ws.LJIILLIIL("livesdk_repost_notes_edit_panel_show", this.LLJIJIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dh6, viewGroup, false);
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = C1110404Vy.LIZ().LIZ(getContext(), viewTd);
        this.LLJJI = keyboardFakePopupWindowLIZ;
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = this;
        }
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.show();
        }
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
