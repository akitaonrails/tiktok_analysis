package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui;

import X.C098200Yq;
import X.C0HE8;
import X.C0K0R;
import X.C0K61;
import X.C0KCC;
import X.C0KDQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C344860DfY;
import X.C426930God;
import X.C511520K4g;
import X.C511970K5z;
import X.C513080KAg;
import X.C786410Ut5;
import X.EnumC513420KBo;
import Y.ACListenerS111S0200000_7;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageRenewalSpecialStatusFragment extends PgcBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyAmJiEtPSHELIOSY8Jms8KCw4KSIpOS40LWs5IGEAPSccKCw4KSIpGyo9LTItJRwjLSYlKCMAPCQ4PDwVOiQrJCo9PA==";
    public Map<String, String> LLILZIL;
    public TuxIconView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public LinearLayout LLJ;
    public C197039127h LLJI;
    public TuxTextView LLJIJIL;
    public String LLILLJJLI = "";
    public EnumC513420KBo LLILLL = EnumC513420KBo.LATE_CALLBACK_SCENE;
    public C0KCC LLILZ = new C0KCC(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, null, false, 0, null, 0, 0, false, -1, 15);
    public Function0<Unit> LLJILJIL = AFwS193S0000000_7.get$arr$(173);
    public Function0<Unit> LLJILJILJ = AFwS193S0000000_7.get$arr$(174);

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    public final void MR(CharSequence charSequence) {
        View viewSd = C786410Ut5.Sd(R.layout.fen, getLayoutInflater(), null);
        TextView textView = (TextView) viewSd.findViewById(R.id.fof);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        textView.setText(charSequence);
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout != null) {
            linearLayout.addView(viewSd);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C0HE8.LIZ(layoutInflaterOnGetLayoutInflater.getContext()));
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.e26);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.pyo);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.je5);
        this.LLJ = (LinearLayout) view.findViewById(R.id.evm);
        this.LLJI = (C197039127h) view.findViewById(R.id.a0z);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.a10);
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS142S0100000_7(this, 282));
        }
        EnumC513420KBo enumC513420KBo = this.LLILLL;
        if (enumC513420KBo == null) {
            i = -1;
        } else {
            i = C513080KAg.LIZ[enumC513420KBo.ordinal()];
        }
        String str = "";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TuxTextView tuxTextView = this.LLIZ;
                    if (tuxTextView != null) {
                        tuxTextView.setText(C511520K4g.LJII(2131839546));
                    }
                    TuxTextView tuxTextView2 = this.LLIZLLLIL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(C511520K4g.LJII(2131839541));
                    }
                    C197039127h c197039127h = this.LLJI;
                    if (c197039127h != null) {
                        c197039127h.setText(C511520K4g.LJII(2131839545));
                        C786410Ut5.U8(c197039127h, new ACListenerS142S0100000_7(this, 279));
                    }
                    TuxTextView tuxTextView3 = this.LLJIJIL;
                    if (tuxTextView3 != null) {
                        C0K0R.LIZJ(tuxTextView3);
                        tuxTextView3.setText(C511520K4g.LJII(2131839544));
                        C786410Ut5.h9(tuxTextView3, new ACListenerS142S0100000_7(this, 280));
                    }
                    ArrayList arrayList = new ArrayList();
                    String strLJII = C511520K4g.LJII(2131839542);
                    if (strLJII == null) {
                        strLJII = "";
                    }
                    arrayList.add(strLJII);
                    String strLJII2 = C511520K4g.LJII(2131839543);
                    if (strLJII2 != null) {
                        str = strLJII2;
                    }
                    arrayList.add(str);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        MR((CharSequence) it2.next());
                    }
                    C0KDQ c0kdq = C0KDQ.LIZ;
                    Map<String, String> map = this.LLILZIL;
                    c0kdq.getClass();
                    C511970K5z c511970K5z = new C511970K5z("livesdk_ios_resubscirbe_popup_show");
                    c511970K5z.LIZJ(map);
                    c511970K5z.LIZLLL();
                    return;
                }
                return;
            }
            TuxTextView tuxTextView4 = this.LLIZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(C511520K4g.LJII(2131839540));
            }
            TuxTextView tuxTextView5 = this.LLIZLLLIL;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(C511520K4g.LJII(2131839538));
            }
            C197039127h c197039127h2 = this.LLJI;
            if (c197039127h2 != null) {
                c197039127h2.setText(C511520K4g.LJII(2131839539));
                C786410Ut5.U8(c197039127h2, new ACListenerS111S0200000_7(c197039127h2, this, 60));
            }
            ArrayList arrayList2 = new ArrayList();
            String strLJII3 = C511520K4g.LJII(2131839550);
            if (strLJII3 == null) {
                strLJII3 = "";
            }
            String strLJII4 = C511520K4g.LJII(2131839537);
            if (strLJII4 == null) {
                strLJII4 = "";
            }
            SpannableStringBuilder spannableStringBuilderLIZ = C344860DfY.LIZ(strLJII4, strLJII3, C426930God.LIZ(R.attr.f_6, getContext()), new AwS551S0100000_7(this, 743));
            String strLJII5 = C511520K4g.LJII(2131839536);
            if (strLJII5 != null) {
                str = strLJII5;
            }
            arrayList2.add(str);
            arrayList2.add(spannableStringBuilderLIZ);
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                MR((CharSequence) it3.next());
            }
            C0KDQ c0kdq2 = C0KDQ.LIZ;
            Map<String, String> map2 = this.LLILZIL;
            c0kdq2.getClass();
            C511970K5z c511970K5z2 = new C511970K5z("livesdk_late_call_subscirbe_popup_show");
            c511970K5z2.LIZJ(map2);
            c511970K5z2.LIZLLL();
            return;
        }
        C0KDQ c0kdq3 = C0KDQ.LIZ;
        Map<String, String> map3 = this.LLILZIL;
        c0kdq3.getClass();
        C511970K5z c511970K5z3 = new C511970K5z("livesdk_onhold_subscirbe_popup_show");
        C0K61.LIZ(c511970K5z3, null);
        c511970K5z3.LIZJ(map3);
        c511970K5z3.LIZLLL();
        TuxTextView tuxTextView6 = this.LLIZ;
        if (tuxTextView6 != null) {
            tuxTextView6.setText(C511520K4g.LJII(2131839553));
        }
        TuxTextView tuxTextView7 = this.LLIZLLLIL;
        if (tuxTextView7 != null) {
            tuxTextView7.setText(C511520K4g.LJII(2131839551));
        }
        C197039127h c197039127h3 = this.LLJI;
        if (c197039127h3 != null) {
            c197039127h3.setText(C511520K4g.LJII(2131839552));
            C786410Ut5.U8(c197039127h3, new ACListenerS111S0200000_7(c197039127h3, this, 61));
        }
        TuxTextView tuxTextView8 = this.LLJIJIL;
        if (tuxTextView8 != null) {
            C0K0R.LIZ(tuxTextView8);
        }
        String strLJII6 = C511520K4g.LJII(2131839549);
        if (strLJII6 == null) {
            strLJII6 = "";
        }
        ArrayList arrayList3 = new ArrayList();
        String strLJII7 = C511520K4g.LJII(2131839550);
        if (strLJII7 == null) {
            strLJII7 = "";
        }
        String strLJII8 = C511520K4g.LJII(2131839548);
        if (strLJII8 == null) {
            strLJII8 = "";
        }
        SpannableStringBuilder spannableStringBuilderLIZ2 = C344860DfY.LIZ(strLJII8, strLJII7, C426930God.LIZ(R.attr.f_6, getContext()), new AwS551S0100000_7(this, 744));
        String strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131839547, strLJII6);
        if (strLJIIIIZZ != null) {
            str = strLJIIIIZZ;
        }
        arrayList3.add(str);
        arrayList3.add(spannableStringBuilderLIZ2);
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            MR((CharSequence) it4.next());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fij, viewGroup, false);
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
