package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.C098200Yq;
import X.C0OM1;
import X.C11GO;
import X.C1250250idj;
import X.C127K;
import X.C1685300txQ;
import X.C1748470vbJ;
import X.C1749190vcT;
import X.C1775980wJg;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.EnumC1749210vcV;
import X.InterfaceC344240DeY;
import Y.ACListenerS160S0100000_26;
import Y.AObserverS228S0100000_26;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class FeedbackPage extends Fragment implements InterfaceC344240DeY {
    public static TuxSheet LLJI = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyHELIOSw6KSklMyp9KyohOSM6KSsvLGEyPCRiDyo2LCctKiQDKSIp";
    public TuxTextView LL;
    public C127K LLILLJJLI;
    public C127K LLILLL;
    public C197039127h LLILZ;
    public Activity LLILZIL;
    public AwemeRawAd LLILZLL;
    public C1749190vcT LLIZLLLIL;
    public final MutableLiveData<Integer> LLIZ = new MutableLiveData<>();
    public String LLJ = "";

    public final C127K MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hwc) : null;
            this.LLILLJJLI = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hwd) : null;
            this.LLILLL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C197039127h OR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hwg) : null;
            this.LLILZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Activity activity = this.LLILZIL;
        if (activity == null) {
            activity = null;
        }
        String string = activity.getString(2131823001);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = (C1749190vcT) view.findViewById(R.id.hwe);
        View viewFindViewById = this.LL;
        Activity activity = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.hvw);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        Activity activity2 = this.LLILZIL;
        if (activity2 == null) {
            activity2 = null;
        }
        textView.setText(activity2.getString(2131822999));
        C127K c127kMR = MR();
        Activity activity3 = this.LLILZIL;
        if (activity3 == null) {
            activity3 = null;
        }
        c127kMR.setTitle(activity3.getString(2131823002));
        MR().setWithSeparator(true);
        ((C11GO) MR().getAccessory()).LJIILL(new AwS570S0100000_26(this, 1216));
        C127K c127kNR = NR();
        Activity activity4 = this.LLILZIL;
        if (activity4 == null) {
            activity4 = null;
        }
        c127kNR.setTitle(activity4.getString(2131823003));
        NR().setWithSeparator(true);
        ((C11GO) NR().getAccessory()).LJIILL(new AwS570S0100000_26(this, 1217));
        Activity activity5 = this.LLILZIL;
        if (activity5 == null) {
            activity5 = null;
        }
        String string = activity5.getString(2131823000);
        Activity activity6 = this.LLILZIL;
        if (activity6 == null) {
            activity6 = null;
        }
        C1748470vbJ c1748470vbJ = new C1748470vbJ(activity6, null, 6);
        c1748470vbJ.LJIIJ(string);
        c1748470vbJ.LLIZLLLIL = 200;
        c1748470vbJ.LJIIIIZZ(200);
        c1748470vbJ.LJIIIZ(1);
        c1748470vbJ.LJFF(true);
        c1748470vbJ.LIZIZ(new C1775980wJg(this, 7));
        C1749190vcT c1749190vcT = this.LLIZLLLIL;
        if (c1749190vcT != null) {
            c1749190vcT.setFormField(c1748470vbJ);
            c1749190vcT.LIZIZ(EnumC1749210vcV.FOOTER);
        }
        C197039127h c197039127hOR = OR();
        Activity activity7 = this.LLILZIL;
        if (activity7 != null) {
            activity = activity7;
        }
        c197039127hOR.setText(activity.getString(2131822998));
        this.LLIZ.observe(this, new AObserverS228S0100000_26(this, 6));
        C786410Ut5.U8(OR(), new ACListenerS160S0100000_26(this, 41));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bc7, viewGroup, false);
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
