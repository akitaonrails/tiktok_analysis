package com.ss.android.ugc.aweme.topic.review.panel;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0I7D;
import X.C0OM1;
import X.C0P4X;
import X.C0WZX;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418540Gb6;
import X.C444960Hcc;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C626710Oi5;
import X.C626730Oi7;
import X.C626800OiE;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C817403Hg;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC459810I1j;
import X.InterfaceC724760Sbq;
import Y.ACListenerS144S0100000_9;
import Y.ARunnableS109S0100000_9;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicReviewPanel extends BaseFragment {
    public static final C626800OiE LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSYwHELIOSZjcpPyY2P2s8KCE2JGsYJj86KxcpPyY2PxUtJyo/";
    public final AssemVMLazy LLIZ;
    public boolean LLIZLLLIL;
    public Integer LLJ;
    public TopicReview LLJI;
    public TuxNavBar LLJIJIL;
    public C418540Gb6 LLJILJIL;
    public C0I7D LLJILJILJ;
    public TuxTextView LLJILLL;
    public C197039127h LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopicReviewPanel.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJI = new C626800OiE();
    }

    public TopicReviewPanel() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicReviewVM.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1572);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(656);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1573), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 1574), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1575), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
    }

    public final boolean SR() {
        String str;
        TopicReview topicReview = this.LLJI;
        return (topicReview == null || (str = topicReview.text) == null || str.length() <= 0) ? false : true;
    }

    public final TopicReviewVM UR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (TopicReviewVM) assemVMLazy.getValue();
    }

    public final void VR() throws Throwable {
        Integer numLIZJ;
        C0I7D c0i7d = this.LLJILJILJ;
        if (c0i7d == null) {
            c0i7d = null;
        }
        Editable editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nc5bNkiAJu2nkXOUzEtngxvcplE5Gn6PqqblFNw/Wzbj+", null));
        if (editableLLLLJI != null) {
            int i = 0;
            int iCodePointCount = Character.codePointCount(editableLLLLJI, 0, editableLLLLJI.length());
            Context context = getContext();
            if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.zs, context)) == null) {
                return;
            }
            int iIntValue = numLIZJ.intValue();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String strValueOf = String.valueOf(iCodePointCount);
            spannableStringBuilder.append((CharSequence) strValueOf).append((CharSequence) "/").append((CharSequence) "500");
            if (iCodePointCount > 500 || (SR() && iCodePointCount == 0)) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, strValueOf.length(), 17);
            }
            TuxTextView tuxTextView = this.LLJILLL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setText(spannableStringBuilder);
            TuxTextView tuxTextView2 = this.LLJILLL;
            TuxTextView tuxTextView3 = tuxTextView2 != null ? tuxTextView2 : null;
            if (iCodePointCount <= 0 && !SR()) {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR() {
        /*
            r6 = this;
            X.0Gb6 r0 = r6.LLJILJIL
            r2 = 0
            if (r0 != 0) goto L6
            r0 = r2
        L6:
            float r1 = r0.getRatingValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L1a
            X.127h r0 = r6.LLJJ
            if (r0 == 0) goto L16
            r2 = r0
        L16:
            r2.setEnabled(r4)
            return
        L1a:
            com.ss.android.ugc.aweme.topic.review.model.TopicReview r5 = r6.LLJI
            if (r5 == 0) goto L5d
            X.0Gb6 r0 = r6.LLJILJIL
            if (r0 != 0) goto L23
            r0 = r2
        L23:
            float r0 = r0.getRatingValue()
            int r1 = X.C814420VxA.LIZIZ(r0)
            int r0 = r5.topicRating
            if (r1 != r0) goto L5d
            r0 = 1
        L30:
            java.lang.String r5 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nc5bNkiAJu2nkXOUzEtngxvcplE5Gn6PqqblFNw/Wzbj+"
            if (r0 == 0) goto L5f
            X.0I7D r1 = r6.LLJILJILJ
            if (r1 != 0) goto L39
            r1 = r2
        L39:
            X.0WZX r0 = new X.0WZX
            r0.<init>(r5, r2)
            android.text.Editable r0 = X.C2204961BRm.LLLLJI(r1, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.topic.review.model.TopicReview r0 = r6.LLJI
            if (r0 == 0) goto L5b
            java.lang.String r0 = r0.text
        L4c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5f
            X.127h r0 = r6.LLJJ
            if (r0 == 0) goto L57
            r2 = r0
        L57:
            r2.setEnabled(r4)
            return
        L5b:
            r0 = r2
            goto L4c
        L5d:
            r0 = 0
            goto L30
        L5f:
            X.0I7D r1 = r6.LLJILJILJ
            if (r1 != 0) goto L64
            r1 = r2
        L64:
            X.0WZX r0 = new X.0WZX
            r0.<init>(r5, r2)
            android.text.Editable r1 = X.C2204961BRm.LLLLJI(r1, r0)
            if (r1 == 0) goto L8b
            int r0 = r1.length()
            int r1 = java.lang.Character.codePointCount(r1, r4, r0)
            X.127h r0 = r6.LLJJ
            if (r0 == 0) goto L7c
            r2 = r0
        L7c:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 > r0) goto L8c
            boolean r0 = r6.SR()
            if (r0 == 0) goto L88
            if (r1 == 0) goto L8c
        L88:
            r2.setEnabled(r3)
        L8b:
            return
        L8c:
            r3 = 0
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel.WR():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0I7D c0i7d = this.LLJILJILJ;
        if (c0i7d == null) {
            c0i7d = null;
        }
        KeyboardUtils.LIZIZ(c0i7d);
        KeyboardUtils.LJ(3, getActivity(), 15);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C626710Oi5 c626710Oi5 = C626710Oi5.LIZ;
        Object obj = ((LinkedHashMap) UR().LLILLL).get("enter_method");
        Object obj2 = ((LinkedHashMap) UR().LLILLL).get("previous_page");
        String strLIZ = C626730Oi7.LIZ(UR().LLILLJJLI);
        String str = UR().LL;
        Object obj3 = ((LinkedHashMap) UR().LLILLL).get("topic_title");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c626710Oi5.getClass();
        C20684815ws.LJIILLIIL("enter_topic_review_panel", C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("enter_from", "topic_detail"), new Pair("enter_method", obj), new Pair("previous_page", obj2), new Pair("category", strLIZ), new Pair("topic_id", str), new Pair("topic_title", obj3)), linkedHashMap));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        TopicReview topicReview;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        C0I7D c0i7d = null;
        if (arguments != null) {
            this.LLIZLLLIL = arguments.getBoolean("auto_focus", this.LLIZLLLIL);
            Integer numValueOf = Integer.valueOf(arguments.getInt("initial_rating"));
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            this.LLJ = numValueOf;
            Serializable serializable = arguments.getSerializable("initial_review");
            if (serializable instanceof TopicReview) {
                topicReview = (TopicReview) serializable;
            } else {
                topicReview = null;
            }
            this.LLJI = topicReview;
        }
        this.LLJIJIL = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLJILJIL = (C418540Gb6) view.findViewById(R.id.srg);
        this.LLJILJILJ = (C0I7D) view.findViewById(R.id.grz);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.mm1);
        this.LLJJ = (C197039127h) view.findViewById(R.id.whh);
        TuxNavBar tuxNavBar = this.LLJIJIL;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131827862);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 1571));
        c0om1.LIZIZ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
        tuxNavBar.LJIIZILJ(true);
        C0I7D c0i7d2 = this.LLJILJILJ;
        if (c0i7d2 == null) {
            c0i7d2 = null;
        }
        c0i7d2.addTextChangedListener(new C0P4X(this, 4));
        C197039127h c197039127h = this.LLJJ;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.U8(c197039127h, new ACListenerS144S0100000_9(this, 90));
        TopicReview topicReview2 = this.LLJI;
        if (topicReview2 != null) {
            C418540Gb6 c418540Gb6 = this.LLJILJIL;
            if (c418540Gb6 == null) {
                c418540Gb6 = null;
            }
            c418540Gb6.setRatingValue(topicReview2.topicRating);
            String str = topicReview2.text;
            if (str != null) {
                C0I7D c0i7d3 = this.LLJILJILJ;
                if (c0i7d3 == null) {
                    c0i7d3 = null;
                }
                c0i7d3.setText(str);
            }
        }
        Integer num = this.LLJ;
        if (num != null) {
            int iIntValue = num.intValue();
            C418540Gb6 c418540Gb62 = this.LLJILJIL;
            if (c418540Gb62 == null) {
                c418540Gb62 = null;
            }
            c418540Gb62.setRatingValue(iIntValue);
        }
        VR();
        WR();
        C817403Hg c817403Hg = new C817403Hg();
        C418540Gb6 c418540Gb63 = this.LLJILJIL;
        if (c418540Gb63 == null) {
            c418540Gb63 = null;
        }
        c817403Hg.element = c418540Gb63.getRatingValue();
        C418540Gb6 c418540Gb64 = this.LLJILJIL;
        if (c418540Gb64 == null) {
            c418540Gb64 = null;
        }
        c418540Gb64.setOnStarChanged$topic_release(new AwS375S0200000_9(c817403Hg, this, 105));
        new KeyBoardMonitor(this).LIZ(view, new InterfaceC459810I1j() { // from class: X.0OiF
            @Override // X.InterfaceC459810I1j
            public final void V3() {
                Dialog dialog;
                Fragment parentFragment = this.LL.getParentFragment();
                DialogFragment dialogFragment = parentFragment instanceof TuxSheet ? (DialogFragment) parentFragment : null;
                if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
                    dialog.setCanceledOnTouchOutside(false);
                }
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJIIZILJ(this.LL, false);
            }

            @Override // X.InterfaceC459810I1j
            public final void ub() {
                Dialog dialog;
                Fragment parentFragment = this.LL.getParentFragment();
                DialogFragment dialogFragment = parentFragment instanceof TuxSheet ? (DialogFragment) parentFragment : null;
                if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
                    dialog.setCanceledOnTouchOutside(true);
                }
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJIIZILJ(this.LL, true);
            }
        });
        if (C444960Hcc.LIZIZ()) {
            C0I7D c0i7d4 = this.LLJILJILJ;
            if (c0i7d4 != null) {
                c0i7d = c0i7d4;
            }
            c0i7d.setGravity(5);
        }
        if (this.LLIZLLLIL) {
            HandlerHook.viewPostDelay(view, new ARunnableS109S0100000_9(this, 113), 100L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fwa, viewGroup, false);
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
