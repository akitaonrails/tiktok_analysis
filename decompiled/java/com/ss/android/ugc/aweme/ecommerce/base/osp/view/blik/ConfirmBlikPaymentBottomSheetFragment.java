package com.ss.android.ugc.aweme.ecommerce.base.osp.view.blik;

import X.C098200Yq;
import X.C1018703yb;
import X.C1308910kAL;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C343970De7;
import X.C786410Ut5;
import Y.ACListenerS136S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfirmBlikPaymentBottomSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGs6ICHELIOSokZicgICR9CyoiLyYhJQcgICQDKTwhLCEnCio4PSA+Gy0pLDsVOiQrJCo9PA==";
    public Function0<Unit> LL;
    public long LLILLJJLI;

    public final void u3() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLJJLI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "blik_awaiting_payment");
        linkedHashMap.put("stay_time", Long.valueOf(jElapsedRealtime));
        C1018703yb.LIZIZ("tiktokec_stay_page", linkedHashMap);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.cov), new ACListenerS136S0100000_1(this, 7));
        TextView textView = (TextView) view.findViewById(R.id.fmt);
        if (textView != null) {
            Context context = view.getContext();
            String string = context.getString(2131840222);
            String string2 = context.getString(2131840324);
            String string3 = context.getString(2131840325);
            String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string2, string3}, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), 0, strJ4.length(), 33);
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ2 != null) {
                for (String str : C1697810uHb.LJIIJJI(string2, string3)) {
                    int iLJJJ = a0.LJJJ(strJ4, str, 0, false, 6);
                    if (iLJJJ >= 0) {
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ2.intValue()), iLJJJ, str.length() + iLJJJ, 33);
                    }
                }
            }
            textView.setText(spannableStringBuilder);
        }
        this.LLILLJJLI = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "blik_awaiting_payment");
        C1018703yb.LIZIZ("tiktokec_enter_page", linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c89, viewGroup, false);
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
