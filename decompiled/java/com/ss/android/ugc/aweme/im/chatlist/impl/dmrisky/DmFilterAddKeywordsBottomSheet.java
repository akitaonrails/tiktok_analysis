package com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky;

import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C0I0B;
import X.C1007520cKE;
import X.C1308910kAL;
import X.C14MI;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C894490Z7f;
import X.C894540Z7k;
import X.C894580Z7o;
import X.EnumC894560Z7m;
import Y.ACListenerS149S0100000_14;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class DmFilterAddKeywordsBottomSheet extends BaseFragment {
    public static DmFilterAddKeywordsBottomSheet LLJILLL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZyw7KTEgIDwnZiwhOSHELIOSN9LCg+IDw4MWsIJAk6JDEpOw43LA4pMDg8OiE/CyAnPCohGic2LTE=";
    public TuxSheet LLIZ;
    public DmRiskyKeywordsViewModel LLIZLLLIL;
    public C1007520cKE LLJ;
    public C197039127h LLJI;
    public AnonymousClass0956 LLJILJIL;
    public boolean LLJIJIL = true;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 239));

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        LLJILLL = null;
        super.onDetach();
    }

    public final EnumC894560Z7m SR() {
        return (EnumC894560Z7m) this.LLJILJILJ.getValue();
    }

    public final void UR() {
        Drawable drawableLIZ;
        C197039127h c197039127h = this.LLJI;
        if (c197039127h == null) {
            c197039127h = null;
        }
        if (this.LLJIJIL) {
            drawableLIZ = C14MI.LIZ(c197039127h.getContext(), R.drawable.c_q);
        } else {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.bs, c197039127h.getContext());
            drawableLIZ = c384050F3z.LIZ(c197039127h.getContext());
        }
        c197039127h.setBackground(drawableLIZ);
        Integer numLIZJ = this.LLJIJIL ? C1308910kAL.LIZJ(R.attr.ee, c197039127h.getContext()) : C1308910kAL.LIZJ(R.attr.ua, c197039127h.getContext());
        if (this.LLJIJIL) {
            c197039127h.setClickable(true);
            c197039127h.setLongClickable(true);
        } else {
            c197039127h.setClickable(false);
            c197039127h.setLongClickable(false);
        }
        if (numLIZJ != null) {
            c197039127h.setTextColor(numLIZJ.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LLJILJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C894580Z7o(this, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC894560Z7m enumC894560Z7mSR = SR();
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("show_dm_filtered_keyword_banner", C894490Z7f.LIZ(new Pair("enter_method", C894540Z7k.LIZIZ(enumC894560Z7mSR))));
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.lc0), new ACListenerS149S0100000_14(this, 13));
        C1007520cKE c1007520cKE = (C1007520cKE) view.findViewById(R.id.gt0);
        c1007520cKE.setAddTagAction(new AwS380S0200000_14(this, c1007520cKE, 20));
        c1007520cKE.setDeleteTagAction(new AwS593S0100000_14(this, 28));
        c1007520cKE.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Z7q
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                view2.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        this.LLJ = c1007520cKE;
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.tzb);
        C786410Ut5.U8(c197039127h, new ACListenerS149S0100000_14(this, 14));
        this.LLJI = c197039127h;
        UR();
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLIZLLLIL = (DmRiskyKeywordsViewModel) new ViewModelProvider(this).get(DmRiskyKeywordsViewModel.class);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chc, viewGroup, false);
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
