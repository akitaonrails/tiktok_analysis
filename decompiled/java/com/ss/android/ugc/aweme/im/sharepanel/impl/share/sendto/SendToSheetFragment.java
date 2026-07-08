package com.ss.android.ugc.aweme.im.sharepanel.impl.share.sendto;

import X.C01GW;
import X.C098200Yq;
import X.C0I7D;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1370970lmR;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C424560Gko;
import X.C452501pT;
import X.C786410Ut5;
import X.C905710Zg1;
import X.C914190Zth;
import X.InterfaceC1364710lcL;
import Y.ACListenerS149S0100000_14;
import Y.AObserverS218S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SendToSheetFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw7KTcpOS49LSliHELIOSICIjJGs/IS4hLWs/LCE3PCpiGio9LBEjGic2LTEKOy40JSAiPQ==";
    public ConstraintLayout LLIZ;
    public TuxIconView LLIZLLLIL;
    public View LLJ;
    public FrameLayout LLJI;
    public C0I7D LLJIJIL;
    public C197039127h LLJILJIL;
    public C424560Gko LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1041));
    public C905710Zg1 LLJJ;
    public AwS558S0100000_14 LLJJI;
    public AwS593S0100000_14 LLJJIII;

    public final C0I7D SR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.opr) : null;
            this.LLJIJIL = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final SendToViewModel UR() {
        return (SendToViewModel) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        UR().LL = this.LLJJ;
        View viewFindViewById = this.LLIZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.v49);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (ConstraintLayout) viewFindViewById;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZ(R.attr.c3, requireContext());
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
        viewFindViewById.setBackground(c384050F3z.LIZ(requireContext()));
        View viewFindViewById3 = this.LLIZLLLIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.lc0);
            } else {
                viewFindViewById3 = null;
            }
            this.LLIZLLLIL = (TuxIconView) viewFindViewById3;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById3, new ACListenerS149S0100000_14(this, 43));
        View viewFindViewById4 = this.LLJ;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.h3n);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJ = viewFindViewById4;
        }
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 44), viewFindViewById4);
        View viewFindViewById5 = this.LLJI;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.v03);
            } else {
                viewFindViewById5 = null;
            }
            this.LLJI = (FrameLayout) viewFindViewById5;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById5;
        IInternalShareApi.LIZ.getClass();
        InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
        C0I7D c0i7dSR = SR();
        C914190Zth c914190Zth = C914190Zth.get$arr$(0);
        View viewFindViewById6 = this.LLJI;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.v03);
            } else {
                viewFindViewById6 = null;
            }
            this.LLJI = (FrameLayout) viewFindViewById6;
        }
        viewGroup.addView(interfaceC1364710lcLLIZIZ.LJ(c0i7dSR, c914190Zth, (ViewGroup) viewFindViewById6).LIZ);
        View viewFindViewById7 = this.LLJILJIL;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.up4);
            } else {
                viewFindViewById7 = null;
            }
            this.LLJILJIL = (C197039127h) viewFindViewById7;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById7, new ACListenerS149S0100000_14(this, 45));
        C905710Zg1 c905710Zg1 = UR().LL;
        String str3 = "";
        if (c905710Zg1 == null || (str = c905710Zg1.LJFF) == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        View view8 = this.LLJILJILJ;
        if (view8 == null) {
            View view9 = getView();
            if (view9 != null) {
                viewFindViewById2 = view9.findViewById(R.id.opq);
            }
            this.LLJILJILJ = (C424560Gko) viewFindViewById2;
            view8 = viewFindViewById2;
        }
        c1331670kl3LJIIIZ.LJJ((SmartImageView) view8);
        c1331670kl3LJIIIZ.LJJIIZ(R.drawable.c9z);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(2);
        c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        UR().LLILLL.observe(this, new AObserverS218S0100000_14(this, 4));
        C0I7D c0i7dSR2 = SR();
        C905710Zg1 c905710Zg12 = this.LLJJ;
        if (c905710Zg12 != null && (str2 = c905710Zg12.LJ) != null) {
            str3 = str2;
        }
        c0i7dSR2.setText(str3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chr, viewGroup, false);
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
