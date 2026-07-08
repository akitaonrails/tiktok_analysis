package com.ss.android.ugc.aweme.compliance.business.policynotice.ui;

import X.C01GW;
import X.C098200Yq;
import X.C13LP;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C1913750ztt;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2097908Jt;
import X.C21411818qq;
import X.C431260Gvc;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS120S0200000_17;
import Y.ACListenerS152S0100000_17;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.DSAToggle;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class TTKDSABottomUI extends UniversalPopupUI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjHELIOSA/ICE2OzZiOSA/ISY1JyAnISYpZzo6ZhEYAgsACQcjPTs8JRAF";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 256));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 257));

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final int MR() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void VR(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final Map<String, String> OR() {
        CompoundButton compoundButton = (CompoundButton) this.LLIZ.getValue();
        return C2097908Jt.LIZJ(new Pair("toggle_data", (compoundButton == null || !compoundButton.isChecked()) ? "false" : "true"));
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void WR(String str) {
        View view = getView();
        TextView textView = null;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.gag);
        }
        if ((textView instanceof TuxTextView) && textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void RR(Map<String, String> map, StyleExtra styleExtra) {
        List<DSAToggle> list;
        DSAToggle dSAToggle;
        if (styleExtra != null && (list = styleExtra.dsaToggles) != null && (dSAToggle = (DSAToggle) C13LP.LJJJLZIJ(0, list)) != null) {
            TextView textView = (TextView) this.LLIZLLLIL.getValue();
            if (textView != null) {
                textView.setText(dSAToggle.name);
            }
            C21411818qq c21411818qq = (C21411818qq) this.LLIZ.getValue();
            if (c21411818qq != null) {
                c21411818qq.setChecked(dSAToggle.defaultValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void SR(SpannableStringBuilder spannableStringBuilder, String str) {
        View view = getView();
        TextView textView = null;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.gac);
        }
        if ((textView instanceof TuxTextView) && textView != null) {
            textView.setMovementMethod(C431260Gvc.LIZ);
            textView.setText(spannableStringBuilder);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIJJI();
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void UR(List list, Boolean bool, AwS596S0100000_17 awS596S0100000_17) {
        TuxIconView tuxIconView;
        C197039127h c197039127h;
        C1913750ztt c1913750ztt = (C1913750ztt) C13LP.LJJJLZIJ(0, list);
        LinearLayout linearLayout = null;
        if (c1913750ztt != null) {
            View view = getView();
            if (view != null) {
                c197039127h = (C197039127h) view.findViewById(R.id.gad);
            } else {
                c197039127h = null;
            }
            if ((c197039127h instanceof C197039127h) && c197039127h != null) {
                C786410Ut5.U8(c197039127h, new ACListenerS120S0200000_17(c1913750ztt, awS596S0100000_17, 36));
                c197039127h.setText(c1913750ztt.LIZ);
            }
        }
        View view2 = getView();
        if (view2 != null) {
            tuxIconView = (TuxIconView) view2.findViewById(R.id.gae);
        } else {
            tuxIconView = null;
        }
        if ((tuxIconView instanceof TuxIconView) && tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS152S0100000_17(this, 188));
        }
        View view3 = getView();
        if (view3 != null) {
            linearLayout = (LinearLayout) view3.findViewById(R.id.gaf);
        }
        if ((linearLayout instanceof LinearLayout) && linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS152S0100000_17(this, 189));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bcm, viewGroup, false);
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
