package com.ss.android.ugc.aweme.tako.aivideo.detail.page;

import X.C0HTT;
import X.C0R9L;
import X.C0SR4;
import X.C0SZ8;
import X.C0T1R;
import X.C1209360hZm;
import X.C2189821An6;
import X.C711620Rvk;
import X.C714460S0u;
import X.C737030Svd;
import X.InterfaceC1209130hZP;
import X.InterfaceC1682240tsU;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TakoAIVideoPlayDetailPageFragmentPanel extends DetailFragmentPanel {
    public final InterfaceC1682240tsU z0;

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void Cu1() {
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final Map<String, String> Y() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2189821An6 c2189821An6 = this.LLLLIIIILLL;
        DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
        String strI7 = this.z0.i7();
        if (strI7.length() > 0) {
            linkedHashMap.put("enter_method", strI7);
        }
        String processId = c2189821An6.getProcessId();
        if (processId != null && processId.length() > 0) {
            linkedHashMap.put("process_id", processId);
        }
        if (navArgModel != null) {
            String takoSessionId = navArgModel.getTakoSessionId();
            if (takoSessionId != null && takoSessionId.length() > 0) {
                linkedHashMap.put("tako_session_id", takoSessionId);
            }
            String takoVideoSessionId = navArgModel.getTakoVideoSessionId();
            if (takoVideoSessionId != null && takoVideoSessionId.length() > 0) {
                linkedHashMap.put("video_session_id", takoVideoSessionId);
            }
        }
        Fragment fragment = getFragment();
        if (fragment != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) != null) {
            Integer numValueOf = Integer.valueOf(iFeedPanelPlatformAbilityLIZJ.LJLLJ());
            if (numValueOf.intValue() >= 0) {
                linkedHashMap.put("video_rank", String.valueOf(numValueOf.intValue()));
            }
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, X.InterfaceC728550Shx, X.InterfaceC1212360hec
    public final void LJ() {
        InterfaceC1209130hZP interfaceC1209130hZP;
        if (isViewValid() && (interfaceC1209130hZP = this.I) != null) {
            interfaceC1209130hZP.bb();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLIIZ(C737030Svd c737030Svd) {
        super.LLIIZ(c737030Svd);
        this.z0.G4(c737030Svd);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void onVideoCleanModeEvent(C1209360hZm c1209360hZm) {
        C0SZ8 c0sz8FR;
        String aid;
        super.onVideoCleanModeEvent(c1209360hZm);
        if (Intrinsics.LJFF(this, c1209360hZm.LIZJ) && (c0sz8FR = FR()) != null && c1209360hZm.LIZIZ != null && c0sz8FR.getAweme() != null) {
            Aweme aweme = c1209360hZm.LIZIZ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(aid, c0sz8FR.getAweme().getAid())) {
                return;
            }
            Aweme aweme2 = c1209360hZm.LIZIZ;
            if (aweme2 != null && aweme2.getAwemeType() == 502) {
                return;
            }
            this.z0.Ls(!c1209360hZm.LIZ);
        }
    }

    public TakoAIVideoPlayDetailPageFragmentPanel(C2189821An6 c2189821An6, TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment) {
        super(c2189821An6);
        this.z0 = takoAiVideoDetailPageFragment;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C711620Rvk(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0RvO
            @Override // X.C0SR4
            public final Collection<C711420RvQ> LJJJJJ() {
                return null;
            }

            @Override // X.C0SR4
            public final List<C711420RvQ> LJJJJIZL() {
                return new ArrayList();
            }

            @Override // X.C711620Rvk
            /* JADX INFO: renamed from: LJJLL */
            public final C711360RvK LJJLI() {
                return new C711360RvK(AFwS243S0000000_11.get$arr$(10));
            }

            @Override // X.C711620Rvk, X.C0SR4
            public final /* bridge */ /* synthetic */ C711420RvQ LJJLI() {
                return LJJLI();
            }
        };
    }
}
