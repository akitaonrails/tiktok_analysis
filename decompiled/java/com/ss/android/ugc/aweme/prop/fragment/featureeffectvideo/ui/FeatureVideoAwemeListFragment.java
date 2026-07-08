package com.ss.android.ugc.aweme.prop.fragment.featureeffectvideo.ui;

import X.C098200Yq;
import X.C1572640r1i;
import X.C1572650r1j;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C723850SaN;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC1575010r5X;
import X.InterfaceC447510Hgj;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
@InterfaceC836760Ws6
public final class FeatureVideoAwemeListFragment extends BaseFragment implements InterfaceC1575010r5X {
    public static final C1572640r1i LLJILLL = new Object() { // from class: X.0r1i
    };
    public static final int LLJJ = 8;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LjctLiI2JjFiLyoyPDA+HELIOSLCo1LiAvPTk6LCAjZzo6ZgMpKDsmOiAaICs2JwQ7LCI2BCw/PQkhKSIhLCEn";
    public TuxNavBar LLIZ;
    public FrameLayout LLIZLLLIL;
    public Aweme LLJI;
    public DialogC1389620mGW LLJILJILJ;
    public String LLJ = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "";

    private final int bS() {
        return R.layout.c72;
    }

    private final void clearFromXmlViewCache() {
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // X.InterfaceC1575010r5X, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return VR(this, layoutInflater, viewGroup, bundle);
    }

    private final void cS() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.LJJLJ(2131836769);
        dialogC1389620mGW.LJJLIIJ(false);
        dialogC1389620mGW.hide();
        this.LLJILJILJ = dialogC1389620mGW;
        dialogC1389620mGW.hide();
    }

    @Override // X.InterfaceC1575010r5X
    public void LLJJJJJIL() {
        DialogC1389620mGW dialogC1389620mGW = this.LLJILJILJ;
        if (dialogC1389620mGW != null) {
            C786410Ut5.J4(dialogC1389620mGW);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0r1j] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: WR, reason: merged with bridge method [inline-methods] */
    public C1572650r1j lt() {
        return new InterfaceC447510Hgj() { // from class: X.0r1j
        };
    }

    public final FrameLayout ZR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.i5w) : null;
            this.LLIZLLLIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final TuxNavBar aS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p15) : null;
            this.LLIZ = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    @Override // X.InterfaceC1575010r5X
    public void yP() {
        DialogC1389620mGW dialogC1389620mGW = this.LLJILJILJ;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.hide();
        }
    }

    private final void init() {
        String strSR;
        String strSR2;
        String strSR3;
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = activity.getIntent();
        String str = "";
        if (intent == null || (strSR = SR(intent, "sticker_id")) == null) {
            strSR = "";
        }
        this.LLJ = strSR;
        Intent intent2 = activity.getIntent();
        this.LLJI = (Aweme) (intent2 != null ? intent2.getSerializableExtra("extra_related_item") : null);
        Intent intent3 = activity.getIntent();
        if (intent3 == null || (strSR2 = SR(intent3, "author_id")) == null) {
            strSR2 = "";
        }
        this.LLJIJIL = strSR2;
        Intent intent4 = activity.getIntent();
        if (intent4 != null && (strSR3 = SR(intent4, "video_id")) != null) {
            str = strSR3;
        }
        this.LLJILJIL = str;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    public final void dS(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    public final void gS(TuxNavBar tuxNavBar) {
        this.LLIZ = tuxNavBar;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public static String SR(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NR(AFwS264S0000000_24.get$arr$(247));
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 172), 3);
        cS();
    }

    public View UR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, bS(), viewGroup, false);
    }

    public static View VR(FeatureVideoAwemeListFragment featureVideoAwemeListFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewUR = featureVideoAwemeListFragment.UR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewUR instanceof View)) {
            viewUR = null;
        }
        if (viewUR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewUR, featureVideoAwemeListFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewUR, featureVideoAwemeListFragment);
                viewUR.setTag(R.id.view_tree_saved_state_registry_owner, featureVideoAwemeListFragment);
                C19EG activity = featureVideoAwemeListFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewUR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewUR;
    }
}
