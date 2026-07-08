package com.ss.android.ugc.aweme.compliance.privacy.settings.video.v2;

import X.AnonymousClass1095;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C103L;
import X.C104A;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C191821102p;
import X.C191848103q;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.AObserverS230S0100000_28;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.v2.items.visibility.VideoVisibilityViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.VideoItemRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.VideoItemSettings;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.BaseSettingDataViewModel;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.video.base.VideoPrivacySettingPageViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteVideoVisibilitySettingFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclPy4wMWs/LDsnISHELIOSsrOmElISEpJmElemscOyA+JzEpHyY3LSoaIDw6KiwgIDsqGyA4PSY9LwM+KCg+LSs4";
    public RecyclerView LL;
    public TuxTextView LLILLJJLI;
    public Aweme LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AnonymousClass1095(this));

    public final RecyclerView MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ms4) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string = getString(2131845181);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 168));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String aid;
        Serializable serializable;
        Map<String, PrivacySettingsRestrictionItem> mapLJ;
        Serializable serializable2;
        Map<String, Integer> mapLJ2;
        VideoItemSettings videoItemSettings;
        VideoItemRestriction videoItemRestriction;
        super.onViewCreated(view, bundle);
        MR().setLayoutManager(new WrapLinearLayoutManager(getContext(), 1));
        View viewFindViewById = null;
        MR().setItemAnimator(null);
        final VideoPrivacySettingPageViewModel videoPrivacySettingPageViewModel = (VideoPrivacySettingPageViewModel) new ViewModelProvider(this).get(VideoPrivacySettingPageViewModel.class);
        Aweme aweme = this.LLILLL;
        videoPrivacySettingPageViewModel.LL = aweme;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        videoPrivacySettingPageViewModel.LLILLJJLI = aid;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("restriction");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof VideoItemRestriction) || (videoItemRestriction = (VideoItemRestriction) serializable) == null || (mapLJ = videoItemRestriction.getRestrictionMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        videoPrivacySettingPageViewModel.LLILLL = mapLJ;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("settings");
        } else {
            serializable2 = null;
        }
        if (!(serializable2 instanceof VideoItemSettings) || (videoItemSettings = (VideoItemSettings) serializable2) == null || (mapLJ2 = videoItemSettings.getSettingMap()) == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        videoPrivacySettingPageViewModel.LLILZ = mapLJ2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            C19EG activity = getActivity();
            if (activity != null) {
                arguments3.putInt("sender_hashcode", System.identityHashCode(activity));
            }
        } else {
            arguments3 = null;
        }
        videoPrivacySettingPageViewModel.LLILZIL = arguments3;
        ((BaseSettingDataViewModel) new ViewModelProvider(this, new ViewModelProvider.Factory() { // from class: X.1094
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new VideoVisibilityViewModel(this.LIZ.LLILLL, videoPrivacySettingPageViewModel.LLILZ.get("visibility"));
            }
        }).get("video_privacy_visibility_options", VideoVisibilityViewModel.class)).LLILLL.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 18));
        RecyclerView recyclerViewMR = MR();
        TPSCRenderManager tPSCRenderManagerLIZJ = C191821102p.LIZJ();
        C191848103q c191848103q = new C191848103q(new ContextThemeWrapper(requireContext(), R.style.abn), this, this, ((C103L) this.LLILZ.getValue()).LIZ, getArguments(), null, null, 224);
        List<? extends C104A> list = ((C103L) this.LLILZ.getValue()).LJ;
        tPSCRenderManagerLIZJ.getClass();
        recyclerViewMR.setAdapter(TPSCRenderManager.LIZJ(c191848103q, list));
        View view2 = this.LLILLJJLI;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.rv0);
            }
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.LLLLZLL((TuxTextView) view2, 8);
        C20684815ws.onEventV3("promote_vidoe_visibility_page_show");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bew, viewGroup, false);
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
