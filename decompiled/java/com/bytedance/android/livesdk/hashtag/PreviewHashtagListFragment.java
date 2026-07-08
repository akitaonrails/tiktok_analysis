package com.bytedance.android.livesdk.hashtag;

import X.C01GW;
import X.C036E;
import X.C098200Yq;
import X.C0IJT;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C754650Tix;
import X.C786410Ut5;
import X.InterfaceC1813060xHU;
import X.ViewOnClickListenerC1836610xtT;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewHashtagListFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ICQ/HELIOSITsyL2scOyolISA7AS4gIDEtLgM6OzEKOy40JSAiPQ==";
    public ViewOnClickListenerC1836610xtT LL;
    public RecyclerView LLILLJJLI;
    public Hashtag LLILLL;
    public Hashtag LLILZ;
    public LiveMode LLILZLL;
    public String LLIZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(50));
    public final AwS586S0100000_7 LLIZLLLIL = new AwS586S0100000_7(this, 109);

    public final ViewOnClickListenerC1836610xtT OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jhf) : null;
            this.LL = (ViewOnClickListenerC1836610xtT) viewFindViewById;
        }
        return (ViewOnClickListenerC1836610xtT) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final void onVisible() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_livetake_topic_one_show");
        c474500IjALIZ.LJJII(this.LLILZIL.getValue(), "anchor_id");
        String str = this.LLIZ;
        if (str != null) {
            c474500IjALIZ.LJJII(str, "enter_from");
        }
        LiveMode liveMode = this.LLILZLL;
        if (liveMode != null) {
            c474500IjALIZ.LJJII(liveMode.logStreamingType, "live_type");
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            c474500IjALIZ.LJIJJLI(dataChannelLJ);
        }
        c474500IjALIZ.LIZ();
    }

    public final void NR() {
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTOR = OR();
        if (viewOnClickListenerC1836610xtTOR != null) {
            viewOnClickListenerC1836610xtTOR.LJI();
        }
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C754650Tix.LIZ(C475510Ikn.LJ(this), this, new AwS586S0100000_7(this, 491), new AwS551S0100000_7(this, 761));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTOR2 = OR();
        if (viewOnClickListenerC1836610xtTOR2 != null) {
            viewOnClickListenerC1836610xtTOR2.LJII();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NR();
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTOR = OR();
        if (viewOnClickListenerC1836610xtTOR != null) {
            viewOnClickListenerC1836610xtTOR.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0Icm
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    this.LIZ.NR();
                }
            });
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTOR2 = OR();
        if (viewOnClickListenerC1836610xtTOR2 != null) {
            viewOnClickListenerC1836610xtTOR2.setOfflineClickListener(new InterfaceC1813060xHU() { // from class: X.0Icn
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    this.LIZ.NR();
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gio, viewGroup, false);
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
