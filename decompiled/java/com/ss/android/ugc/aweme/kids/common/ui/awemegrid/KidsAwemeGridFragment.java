package com.ss.android.ugc.aweme.kids.common.ui.awemegrid;

import X.AbstractC214823195h;
import X.C01GW;
import X.C098200Yq;
import X.C0P6P;
import X.C11JF;
import X.C14EU;
import X.C151T;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C516201zk;
import X.C622680Oba;
import X.C683620Qrg;
import X.C683640Qri;
import X.C786410Ut5;
import X.C989360bqw;
import X.InterfaceC1620210sGR;
import X.InterfaceC683650Qrj;
import Y.AObserverS233S0100000_31;
import Y.AfS200S0100000_31;
import Y.AkS491S0100000_31;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes32.dex */
public abstract class KidsAwemeGridFragment extends AmeBaseFragment implements C0P6P, InterfaceC683650Qrj, InterfaceC1620210sGR {
    public RecyclerView LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 762));
    public C151T LLILLL;
    public KidsAwemeGridViewModel LLILZ;
    public C683620Qrg LLILZIL;
    public C1749280vcc LLILZLL;

    public abstract View MR();

    public abstract String NR();

    public abstract void OR(View view, Aweme aweme);

    public abstract void PR();

    public abstract boolean VR();

    @Override // X.InterfaceC683650Qrj
    public final boolean LJIIJJI() {
        C151T c151t = this.LLILLL;
        return c151t != null && c151t.LJJJJI();
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        C11JF c11jf;
        C683620Qrg c683620Qrg = this.LLILZIL;
        if (c683620Qrg != null) {
            c683620Qrg.showLoadMoreLoading();
        }
        C683620Qrg c683620Qrg2 = this.LLILZIL;
        if (c683620Qrg2 != null) {
            c683620Qrg2.setShowFooter(true);
        }
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.LLILZ;
        if (kidsAwemeGridViewModel == null || kidsAwemeGridViewModel.LL == null || kidsAwemeGridViewModel.LLIZ) {
            return;
        }
        kidsAwemeGridViewModel.LLIZ = true;
        C11JF c11jf2 = kidsAwemeGridViewModel.LLILZLL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = kidsAwemeGridViewModel.LLILZLL) != null) {
            c11jf.dispose();
        }
        kidsAwemeGridViewModel.LLILZLL = (C11JF) kidsAwemeGridViewModel.LL.LJJIFFI().LJJJJZI(new AkS491S0100000_31(kidsAwemeGridViewModel, 0)).LJJIJIIJIL(new AfS200S0100000_31(kidsAwemeGridViewModel, 30)).LJJLL(new C516201zk(kidsAwemeGridViewModel, 190), new C516201zk(kidsAwemeGridViewModel, 191));
    }

    public void RR() {
        C1749280vcc c1749280vcc = this.LLILZLL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    public void SR() {
        C1749280vcc c1749280vcc = this.LLILZLL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    public final void UR() {
        C11JF c11jf;
        C1749280vcc c1749280vcc = this.LLILZLL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        C1749280vcc c1749280vcc2 = this.LLILZLL;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.LLILZ;
        if (kidsAwemeGridViewModel == null || kidsAwemeGridViewModel.LL == null || kidsAwemeGridViewModel.LLIZ) {
            return;
        }
        kidsAwemeGridViewModel.LLIZ = true;
        C11JF c11jf2 = kidsAwemeGridViewModel.LLILZIL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = kidsAwemeGridViewModel.LLILZIL) != null) {
            c11jf.dispose();
        }
        kidsAwemeGridViewModel.LLILZIL = (C11JF) kidsAwemeGridViewModel.LL.refresh().LJJJJZI(new AkS491S0100000_31(kidsAwemeGridViewModel, 1)).LJJIJIIJIL(new AfS200S0100000_31(kidsAwemeGridViewModel, 31)).LJJLL(new C516201zk(kidsAwemeGridViewModel, 192), new C516201zk(kidsAwemeGridViewModel, 193));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.InterfaceC683650Qrj
    public final void preload() {
        LJJIFFI();
    }

    @Override // X.InterfaceC683650Qrj
    public final void n2(boolean z) {
        C683620Qrg c683620Qrg = this.LLILZIL;
        if (c683620Qrg != null) {
            c683620Qrg.setLoadMoreListener((C0P6P) null);
        }
        C683620Qrg c683620Qrg2 = this.LLILZIL;
        if (c683620Qrg2 != null) {
            c683620Qrg2.showLoadMoreEmpty();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReportEvent(C989360bqw c989360bqw) {
        KidsAwemeGridViewModel kidsAwemeGridViewModel = this.LLILZ;
        if (kidsAwemeGridViewModel != null) {
            List<Aweme> value = kidsAwemeGridViewModel.LLILLJJLI.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            Iterator<Aweme> it2 = value.iterator();
            while (it2.hasNext()) {
                if (it2.next().getAid().equals(c989360bqw.LIZ)) {
                    it2.remove();
                }
            }
            kidsAwemeGridViewModel.LLILLJJLI.postValue(value);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = (RecyclerView) view.findViewById(R.id.m1p);
        this.LLILZLL = (C1749280vcc) view.findViewById(R.id.m1q);
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager((RecyclerView.LayoutManager) this.LLILLJJLI.getValue());
        }
        if (getContext() != null) {
            C683620Qrg c683620Qrg = new C683620Qrg(NR(), this, VR());
            this.LLILZIL = c683620Qrg;
            c683620Qrg.LLILZLL = MR();
            C683620Qrg c683620Qrg2 = this.LLILZIL;
            if (c683620Qrg2 != null) {
                c683620Qrg2.setLoadMoreListener(this);
            }
            C683620Qrg c683620Qrg3 = this.LLILZIL;
            if (c683620Qrg3 != null) {
                c683620Qrg3.spanSizeLookup = new AbstractC214823195h() { // from class: X.155r
                    @Override // X.AbstractC214823195h
                    public final int LJFF(int i) {
                        return 1;
                    }
                };
            }
        }
        C151T c151t = this.LLILLL;
        if (c151t != null) {
            KidsAwemeGridViewModel kidsAwemeGridViewModel = new KidsAwemeGridViewModel(c151t);
            kidsAwemeGridViewModel.LLILLJJLI.observe(this, new AObserverS233S0100000_31(this, 35));
            kidsAwemeGridViewModel.LLILLL.observe(this, new AObserverS233S0100000_31(this, 36));
            kidsAwemeGridViewModel.LLILZ.observe(this, new AObserverS233S0100000_31(this, 37));
            this.LLILZ = kidsAwemeGridViewModel;
        }
        RecyclerView recyclerView3 = this.LL;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.LLILZIL);
        }
        RecyclerView recyclerView4 = this.LL;
        if (recyclerView4 != null) {
            recyclerView4.setOnFlingListener(new C683640Qri(recyclerView4, this));
        }
        UR();
    }

    @Override // X.InterfaceC1620210sGR
    public final void I2(Aweme aweme, View view, String str) {
        OR(view, aweme);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.czv, viewGroup, false);
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
