package com.ss.android.ugc.aweme.ecommerce.base.osp.view.bizum;

import X.C098200Yq;
import X.C0H19;
import X.C1018703yb;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C1719580uqi;
import X.C1748330vb5;
import X.C1748440vbG;
import X.C1775980wJg;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C21411818qq;
import X.C2188811AlT;
import X.C236700vl;
import X.C338180DNo;
import X.C343970De7;
import X.C786410Ut5;
import X.C812303Fh;
import X.C878403by;
import X.C958703ov;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class BizumPhoneInputBottomSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGs6HELIOSICokZiclMzo+ZgclMzo+GC0jJyoaJjU5PQ08PDEjJBw7LSA4Dz0yLygpJzs=";
    public Function1<? super C878403by, Unit> LL;
    public Function0<Unit> LLILLJJLI;
    public C1748440vbG LLILLL;
    public C1748330vb5 LLILZ;
    public C21411818qq LLILZIL;
    public C197039127h LLILZLL;
    public C0H19 LLIZ;
    public C1775980wJg LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public String LLIZLLLIL = "ES";
    public String LLJ = "+34";
    public final AtomicBoolean LLJILJILJ = new AtomicBoolean(false);

    public final void NR() {
        C1748330vb5 c1748330vb5 = this.LLILZ;
        if (c1748330vb5 != null) {
            c1748330vb5.setMessageStyle(C1719580uqi.LIZ);
        }
        C1748330vb5 c1748330vb52 = this.LLILZ;
        if (c1748330vb52 != null) {
            c1748330vb52.setMessageIcon(null);
        }
        C1748330vb5 c1748330vb53 = this.LLILZ;
        if (c1748330vb53 != null) {
            c1748330vb53.setMessage(null);
        }
        C1748440vbG c1748440vbG = this.LLILLL;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(0);
        }
    }

    public final String OR() {
        String string;
        Editable text;
        C1748440vbG c1748440vbG = this.LLILLL;
        if (c1748440vbG == null || (text = c1748440vbG.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        return a0.LJLIIIL(string).toString();
    }

    public final String PR() {
        String str = this.LLJ;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('0' <= cCharAt && cCharAt < ':') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1748440vbG c1748440vbG;
        C1775980wJg c1775980wJg = this.LLJI;
        if (c1775980wJg != null && (c1748440vbG = this.LLILLL) != null) {
            C1748440vbG.LJIIL(c1748440vbG, c1775980wJg);
        }
        this.LLJI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLJILJILJ.set(false);
        this.LL = null;
        this.LLILLJJLI = null;
        super.onDestroyView();
    }

    public final void MR() {
        String strOR = OR();
        if (strOR.length() == 0) {
            NR();
            C197039127h c197039127h = this.LLILZLL;
            if (c197039127h != null) {
                c197039127h.setEnabled(false);
                return;
            }
            return;
        }
        if (!C236700vl.LIZ(PR(), C236700vl.LIZIZ(strOR))) {
            RR(this);
            return;
        }
        NR();
        C197039127h c197039127h2 = this.LLILZLL;
        if (c197039127h2 != null) {
            c197039127h2.setEnabled(!this.LLJILJILJ.get());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InputMethodManager inputMethodManager;
        super.onPause();
        View view = getView();
        if (view != null) {
            Object objH2 = C786410Ut5.H2(view.getContext(), "input_method");
            if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1748440vbG c1748440vbG = this.LLILLL;
        if (c1748440vbG != null) {
            c1748440vbG.LJIIIZ();
            HandlerHook.viewPost(c1748440vbG, new ARunnableS126S0100000_26(this, 26));
        }
    }

    public final void u3() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJIJIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "bizum_phone_input");
        linkedHashMap.put("stay_time", Long.valueOf(jElapsedRealtime));
        C1018703yb.LIZIZ("tiktokec_stay_page", linkedHashMap);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    public static void RR(BizumPhoneInputBottomSheetFragment bizumPhoneInputBottomSheetFragment) {
        String string;
        bizumPhoneInputBottomSheetFragment.LLJILJILJ.set(false);
        C1748440vbG c1748440vbG = bizumPhoneInputBottomSheetFragment.LLILLL;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(3);
        }
        C1748330vb5 c1748330vb5 = bizumPhoneInputBottomSheetFragment.LLILZ;
        if (c1748330vb5 != null) {
            c1748330vb5.setMessageStyle(C338180DNo.LIZ);
        }
        C1748330vb5 c1748330vb52 = bizumPhoneInputBottomSheetFragment.LLILZ;
        if (c1748330vb52 != null) {
            c1748330vb52.setMessageIcon(C958703ov.LIZ);
        }
        C1748330vb5 c1748330vb53 = bizumPhoneInputBottomSheetFragment.LLILZ;
        if (c1748330vb53 != null) {
            Context context = bizumPhoneInputBottomSheetFragment.getContext();
            if (context != null) {
                string = context.getString(2131829357);
            } else {
                string = null;
            }
            c1748330vb53.setMessage(string);
        }
        C197039127h c197039127h = bizumPhoneInputBottomSheetFragment.LLILZLL;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("arg_default_save_enabled", false);
        }
        this.LLJILJIL = z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        super.onViewCreated(view, bundle);
        view.setMinimumHeight((int) (getResources().getDisplayMetrics().heightPixels * 0.7f));
        this.LLILLL = (C1748440vbG) view.findViewById(R.id.c2c);
        this.LLILZ = (C1748330vb5) view.findViewById(R.id.c2b);
        this.LLILZIL = (C21411818qq) view.findViewById(R.id.c2e);
        this.LLILZLL = (C197039127h) view.findViewById(R.id.c27);
        C21411818qq c21411818qq = this.LLILZIL;
        if (c21411818qq != null) {
            c21411818qq.setChecked(this.LLJILJIL);
        }
        C1748440vbG c1748440vbG = this.LLILLL;
        if (c1748440vbG != null) {
            c1748440vbG.setPlaceholderText(getString(2131832904));
            c1748440vbG.LJIILIIL(3, false);
            c1748440vbG.setMaxLength(15);
            c1748440vbG.LJIILLIIL(true);
        }
        C1748440vbG c1748440vbG2 = this.LLILLL;
        if (c1748440vbG2 != null && (context = getContext()) != null) {
            C0H19 c0h19 = new C0H19(context);
            String str = this.LLIZLLLIL;
            String str2 = this.LLJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(str2);
            c0h19.setText(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LLLLLLZZ(c0h19.getBizumPhoneCountryRegionSelectIconFromXml(), 0);
            c0h19.setClickEvent(new AwS545S0100000_1(this, 1810));
            this.LLIZ = c0h19;
            c1748440vbG2.LJI(c0h19);
        }
        TextView textView = (TextView) view.findViewById(R.id.c28);
        if (textView != null) {
            textView.setText(C812303Fh.LIZ(view.getContext(), getString(2131832810), getString(2131832811)));
        }
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.cov), new ACListenerS160S0100000_26(this, 28));
        C1748440vbG c1748440vbG3 = this.LLILLL;
        if (c1748440vbG3 != null) {
            C1775980wJg c1775980wJg = new C1775980wJg(this, 13);
            this.LLJI = c1775980wJg;
            c1748440vbG3.LIZ(c1775980wJg);
        }
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS160S0100000_26(this, 29));
        }
        C786410Ut5.I7(new ACListenerS160S0100000_26(this, 86), view);
        this.LLJIJIL = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "bizum_phone_input");
        linkedHashMap.put("region_alpha2", this.LLIZLLLIL);
        linkedHashMap.put("mobile_code", this.LLJ);
        C1018703yb.LIZIZ("tiktokec_enter_page", linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c84, viewGroup, false);
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
