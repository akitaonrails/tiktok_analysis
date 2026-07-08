package com.ss.android.ugc.aweme.detail.ui.story;

import X.C01GW;
import X.C0RGV;
import X.C0RO1;
import X.C0SZ8;
import X.C0T2Y;
import X.C0T8T;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1022290ci3;
import X.C102700a9;
import X.C1189504l3;
import X.C1209890had;
import X.C1223104qT;
import X.C1440005kM;
import X.C1483410ohn;
import X.C14LC;
import X.C1533950q1J;
import X.C1558520qew;
import X.C1565800qqg;
import X.C1578630rBN;
import X.C1590430rUP;
import X.C1590670rUn;
import X.C1600700rky;
import X.C1600750rl3;
import X.C1600780rl6;
import X.C1606370ru7;
import X.C1618440sDa;
import X.C16FB;
import X.C19EG;
import X.C20533215Wg;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2189821An6;
import X.C2200821BBo;
import X.C281310B0v;
import X.C309690CBz;
import X.C418440Gaw;
import X.C452501pT;
import X.C486860J7k;
import X.C616540OGe;
import X.C628500Oky;
import X.C630740Ooa;
import X.C663720Q1q;
import X.C680080Qly;
import X.C692910RFx;
import X.C740740T3w;
import X.C814420VxA;
import X.InterfaceC1209250hZb;
import X.InterfaceC1590610rUh;
import X.InterfaceC1600810rl9;
import X.InterfaceC1606390ru9;
import X.InterfaceC214902198i;
import X.InterfaceC665370Q7z;
import X.InterfaceC729990SkH;
import X.InterfaceC744170THb;
import Y.ARunnableS119S0100000_19;
import Y.ATListenerS456S0100000_24;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.detail.ui.story.StoryDetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.DetailNodeVisibility$initNodeVisibility$1;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.story.experiment.StoryGestureThreshold;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS673S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class StoryDetailPageFragment extends DetailPageFragment implements InterfaceC1600810rl9, InterfaceC1606390ru9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEpPS46JGs5HELIOSIGEgPCo+MGEAPCo+MAs2PCQlJR8yLyAKOy40JSAiPQ==";
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public int LLJILJILJ;
    public long LLJILLL;
    public Aweme LLJJI;
    public ScrollSwitchStateManager LLJJIII;
    public AnalysisStayTimeFragmentComponent LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 283));
    public final C630740Ooa LLJJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 282));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(62));

    @Override // X.InterfaceC1606390ru9
    public final void ew() {
    }

    @Override // X.InterfaceC1606390ru9
    public final DetailPageFragment vD() {
        return this;
    }

    @Override // X.InterfaceC1606390ru9
    public final InterfaceC1209250hZb w8() {
        return null;
    }

    public static boolean bS() {
        return ((Number) C102700a9.LIZ.getValue()).intValue() == 1;
    }

    @Override // X.InterfaceC1606390ru9
    public final void LJIJ() {
        if (TextUtils.equals(this.LLILLJJLI.getEventType(), "others_homepage")) {
            C1440005kM.LIZ(new C1565800qqg(null));
        }
        Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(this);
        if (!(fragmentLIZIZ instanceof InterfaceC214902198i)) {
            fragmentLIZIZ = null;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            DataCenter.vQ2(ViewModelProviders.of(activity), this).zQ2(fragmentLIZIZ != null ? Integer.valueOf(fragmentLIZIZ.hashCode()) : null, "onBack");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailPageComponent NR() {
        return new StoryDetailComponent();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final DetailFragmentPanel PR() {
        boolean z = this.LL == null;
        DetailFragmentPanel detailFragmentPanelPR = super.PR();
        if (z && C0RO1.LIZ(this.LLILLJJLI, null)) {
            getLifecycle().addObserver(new DetailNodeVisibility$initNodeVisibility$1(this, new C1590670rUn()));
        }
        return detailFragmentPanelPR;
    }

    public final boolean ZR() {
        return (!TextUtils.isEmpty(this.LLILLJJLI.getFeedsAwemeId()) && (TextUtils.equals(this.LLILLJJLI.getPreviousPage(), "homepage_follow") || TextUtils.equals(this.LLILLJJLI.getPreviousPage(), "homepage_hot"))) || C1600750rl3.LJ(this.LLILLJJLI.getFrom());
    }

    public final StoryDetailAbility aS() {
        InterfaceC665370Q7z interfaceC665370Q7zK0;
        DetailFragmentPanel detailFragmentPanel = this.LL;
        if (detailFragmentPanel == null || (interfaceC665370Q7zK0 = detailFragmentPanel.k0()) == null) {
            return null;
        }
        return (StoryDetailAbility) C1558520qew.LIZ(interfaceC665370Q7zK0, StoryDetailAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        if (!C0RO1.LIZ(this.LLILLJJLI, null)) {
            return super.getAnalysis();
        }
        if (!ZR()) {
            return super.getAnalysis();
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("others_homepage");
        return analysis;
    }

    @Override // X.InterfaceC1606390ru9
    public final boolean LLLLIIL() {
        return LLZLL();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public final void VR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C1578630rBN.LJIIIIZZ(arguments, "DETAIL_STORY");
        }
    }

    @Override // X.InterfaceC1606390ru9
    public final IDetailPageAbility ZP() {
        return C1600700rky.LIZ(this);
    }

    public final void cS() {
        StoryDetailAbility storyDetailAbilityAS;
        if (!C1223104qT.LIZ() || (storyDetailAbilityAS = aS()) == null) {
            return;
        }
        storyDetailAbilityAS.yI1();
    }

    @Override // X.InterfaceC1606390ru9
    public final int cn() {
        IDetailPageAbility iDetailPageAbilityLIZ = C1600700rky.LIZ(this);
        if (iDetailPageAbilityLIZ != null) {
            return iDetailPageAbilityLIZ.vj1();
        }
        return 0;
    }

    public final boolean dS() {
        if (C281310B0v.LIZ() && C281310B0v.LIZ()) {
            return !Intrinsics.LJFF(this.LLILLJJLI.getFrom(), "STORY_ENTRANCE_ARCHIVE") || C1189504l3.LIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Aweme aweme;
        super.onDestroy();
        if (C0RO1.LIZ(this.LLILLJJLI, null)) {
            String reactSessionId = this.LLILLJJLI.getReactSessionId();
            if (reactSessionId != null && C1533950q1J.LJ(reactSessionId) && (aweme = this.LLJJI) != null) {
                C1440005kM.LIZ(new C663720Q1q(2, reactSessionId, C1483410ohn.LJLJJI().getCurrentPosition(), aweme.getAid()));
            }
            C1618440sDa.LIZIZ.LJIJJLI().LJIJJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1618440sDa.LIZIZ.LJIJJLI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
    }

    @Override // X.InterfaceC1606390ru9
    public final Aweme LJIIIIZZ() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // X.InterfaceC1606390ru9
    public final void ID(int i) {
        Aweme awemeHm;
        int i2;
        long jVN1;
        IDetailPageAbility iDetailPageAbilityLIZ = C1600700rky.LIZ(this);
        if (iDetailPageAbilityLIZ != null) {
            awemeHm = iDetailPageAbilityLIZ.hm();
        } else {
            awemeHm = null;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            i2 = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
        } else {
            i2 = -1;
        }
        String from = this.LLILLJJLI.getFrom();
        int videoType = this.LLILLJJLI.getVideoType();
        String eventType = this.LLILLJJLI.getEventType();
        IDetailPageAbility iDetailPageAbilityLIZ2 = C1600700rky.LIZ(this);
        if (iDetailPageAbilityLIZ2 != null) {
            jVN1 = iDetailPageAbilityLIZ2.VN1();
        } else {
            jVN1 = -1;
        }
        C1209890had.LIZIZ(awemeHm, from, videoType, eventType, jVN1, i2, this.LLILLJJLI);
    }

    public final void WR(boolean z) {
        C0SZ8 c0sz8LJLIL;
        C0SZ8 c0sz8LJLIL2;
        if (z) {
            if (this.LLJJIJIL) {
                this.LLJJIJIL = false;
                IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJJJ.getValue();
                if (iPlayerComponentAbility != null) {
                    iPlayerComponentAbility.tryResumePlay();
                }
                DetailFragmentPanel detailFragmentPanel = this.LL;
                if (detailFragmentPanel != null && (c0sz8LJLIL2 = detailFragmentPanel.LJLIL()) != null) {
                    Object value = this.LLJJJIL.getValue();
                    IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LLJJJ.getValue();
                    value.getClass();
                    C0RGV.LIZIZ(c0sz8LJLIL2, iPlayerComponentAbility2);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLJJIJIL) {
            return;
        }
        this.LLJJIJIL = true;
        IPlayerComponentAbility iPlayerComponentAbility3 = (IPlayerComponentAbility) this.LLJJJ.getValue();
        if (iPlayerComponentAbility3 != null) {
            iPlayerComponentAbility3.LLLLLLLLLL();
        }
        DetailFragmentPanel detailFragmentPanel2 = this.LL;
        if (detailFragmentPanel2 == null || (c0sz8LJLIL = detailFragmentPanel2.LJLIL()) == null) {
            return;
        }
        Object value2 = this.LLJJJIL.getValue();
        IPlayerComponentAbility iPlayerComponentAbility4 = (IPlayerComponentAbility) this.LLJJJ.getValue();
        value2.getClass();
        C0RGV.LIZ(c0sz8LJLIL, iPlayerComponentAbility4);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        InterfaceC729990SkH interfaceC729990SkHLJJIZ = c1618440sDa.LJJIZ();
        if (interfaceC729990SkHLJJIZ != null) {
            interfaceC729990SkHLJJIZ.LIZJ(120, "detail_create_to_story_frag_attach_dur_us");
        }
        InterfaceC729990SkH interfaceC729990SkHLJJIZ2 = c1618440sDa.LJJIZ();
        if (interfaceC729990SkHLJJIZ2 != null) {
            interfaceC729990SkHLJJIZ2.LJFF(SystemClock.uptimeMillis(), "frag_ui_dur_us");
        }
        c1618440sDa.LJJ().LJ(activity, this, this.LLILLJJLI.getFrom());
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1618440sDa.LIZIZ.LJIJJLI().LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/detail/ui/story/StoryDetailPageFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6td57H0HxzkXZzTDpw5D3n4FNTsvFPC526gG1KlJBVHU7QbKJcKw==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (C0RO1.LIZ(this.LLILLJJLI, null) && (analysisStayTimeFragmentComponent = this.LLJJIJI) != null) {
            analysisStayTimeFragmentComponent.LIZIZ(z);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(getClass());
        }
    }

    @Override // X.InterfaceC1606390ru9
    public final void jr(int i, boolean z) {
        Aweme awemeHm;
        long jDy;
        IDetailPageAbility iDetailPageAbilityLIZ = C1600700rky.LIZ(this);
        if (iDetailPageAbilityLIZ != null) {
            awemeHm = iDetailPageAbilityLIZ.hm();
        } else {
            awemeHm = null;
        }
        String from = this.LLILLJJLI.getFrom();
        int videoType = this.LLILLJJLI.getVideoType();
        String eventType = this.LLILLJJLI.getEventType();
        IDetailPageAbility iDetailPageAbilityLIZ2 = C1600700rky.LIZ(this);
        if (iDetailPageAbilityLIZ2 != null) {
            jDy = iDetailPageAbilityLIZ2.Dy();
        } else {
            jDy = -1;
        }
        C1209890had.LIZJ(awemeHm, from, videoType, eventType, jDy, i, this.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String eventType;
        super.onViewCreated(view, bundle);
        InterfaceC729990SkH interfaceC729990SkHLJJIZ = C1618440sDa.LIZIZ.LJJIZ();
        if (interfaceC729990SkHLJJIZ != null) {
            interfaceC729990SkHLJJIZ.LIZJ(130, "frag_ui_dur_us");
        }
        C0T8T c0t8t = (C0T8T) view.findViewById(R.id.trr);
        if (c0t8t != null) {
            c0t8t.setChildListCanVerticalScrollCallback(new AwS603S0100000_24(this, 45));
        }
        C16FB c16fb = (C16FB) view.findViewById(R.id.vw9);
        if (c16fb != null) {
            if (bS()) {
                boolean z = C14LC.LJIIIZ;
                C14LC c14lc = C309690CBz.LIZ;
                int iLJ = c14lc.LIZJ;
                if (iLJ <= 0) {
                    iLJ = C692910RFx.LJ() - c14lc.LIZ;
                }
                c16fb.setMaxOverScrollDistance(iLJ * 0.35f);
                c16fb.setRubberBandCoefficient(1.0f);
            } else if (((StoryGestureThreshold) C1600780rl6.LIZIZ.getValue()).y > 0.0f) {
                c16fb.setRubberBandCoefficient(1.0f);
            } else {
                c16fb.setMaxOverScrollDistance(C418440Gaw.LIZIZ(200));
                c16fb.setRubberBandCoefficient(0.4f);
            }
            c16fb.setOnScrollChangeListener(new AwS673S0100000_24(this, 1));
            c16fb.setOnTouchListener(new ATListenerS456S0100000_24(this, 1));
        }
        if (C0RO1.LIZ(this.LLILLJJLI, null)) {
            C2189821An6 c2189821An6 = this.LLILLJJLI;
            if (c2189821An6 != null && (eventType = c2189821An6.getEventType()) != null) {
                Npth.addTag("detail_feed_event_type", eventType);
            }
            Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(this);
            if (fragmentLIZIZ != null) {
                this.LLJJIII = C486860J7k.LIZ(fragmentLIZIZ);
            } else {
                C19EG activity = getActivity();
                if (activity != null) {
                    this.LLJJIII = C486860J7k.LIZIZ(activity);
                }
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.LLJJIII;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.LLILLJJLI.setValue(Collections.singletonList(new C1590430rUP(StoryDetailPageFragment.class, "page_feed", 0, 1.0f, getArguments())));
            }
            C0T2Y c0t2y = new C0T2Y() { // from class: X.0hcZ
                @Override // X.C0T2Y
                public final void Y3(Aweme aweme) {
                    if (aweme != null && aweme.getAuthor() != null) {
                        StoryDetailPageFragment storyDetailPageFragment = this.LL;
                        storyDetailPageFragment.LLJJI = aweme;
                        C810560Vqw.LIZLLL(new ARunnableS119S0100000_19(storyDetailPageFragment, 171), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                    }
                }
            };
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.LLJJIII;
            if (scrollSwitchStateManager2 != null) {
                scrollSwitchStateManager2.LL.setBridge(new InterfaceC1590610rUh() { // from class: X.0rl8
                    @Override // X.InterfaceC1590610rUh
                    public final void LIZ(int i, boolean z2) {
                    }

                    @Override // X.InterfaceC1590610rUh
                    public final void LJ(int i) {
                    }

                    @Override // X.InterfaceC1590610rUh
                    public final int getValue() {
                        return 0;
                    }
                });
            }
            if (fragmentLIZIZ != null) {
                C680080Qly.LIZ(fragmentLIZIZ).setEventType(this.LLILLJJLI.getEventType());
            } else {
                C19EG activity2 = getActivity();
                if (activity2 != null) {
                    C680080Qly.LIZIZ(activity2).setEventType(this.LLILLJJLI.getEventType());
                }
            }
            ScrollSwitchStateManager scrollSwitchStateManager3 = this.LLJJIII;
            if (scrollSwitchStateManager3 != null) {
                scrollSwitchStateManager3.kE0("page_feed", false);
            }
            if (fragmentLIZIZ != null) {
                C740740T3w.LIZ(fragmentLIZIZ, this, c0t2y);
            } else {
                C19EG activity3 = getActivity();
                if (activity3 != null) {
                    C740740T3w.LIZIZ(activity3, this, c0t2y);
                }
            }
            ScrollSwitchStateManager scrollSwitchStateManager4 = this.LLJJIII;
            if (scrollSwitchStateManager4 != null) {
                scrollSwitchStateManager4.LLILLL.setValue(C2097608Jq.LJI(new Pair(0, this)));
            }
            IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
            if (iAdWebUtils != null) {
                iAdWebUtils.Zu();
            }
            IAdSceneService iAdSceneService = (IAdSceneService) PluggableExtentionKt.pluggableSpi$default(IAdSceneService.class, false, false, false, 14, null);
            if (iAdSceneService != null && iAdSceneService.LIZIZ() != null) {
                C1022290ci3.LJIJJ(null, null, false, false);
            }
        }
        if (C0RO1.LIZ(this.LLILLJJLI, null) && ZR()) {
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(this);
            this.LLJJIJI = analysisStayTimeFragmentComponent;
            analysisStayTimeFragmentComponent.LLILZ = new InterfaceC744170THb() { // from class: X.0rHI
                @Override // X.InterfaceC744170THb
                public final C1386470mBR LIZ(C1386470mBR c1386470mBR) {
                    c1386470mBR.LJJLIIIJL = this.LIZ.LLILLJJLI.getPreviousPage();
                    c1386470mBR.LJJLIIIJLJLI = this.LIZ.LLILLJJLI.getUid();
                    c1386470mBR.LJJLIIIJJIZ = this.LIZ.LLILLJJLI.getFeedsAwemeId();
                    C2277711EDh.LIZIZ.LJJJJJL(c1386470mBR, this.LIZ.LLILLJJLI);
                    return c1386470mBR;
                }
            };
        }
    }
}
