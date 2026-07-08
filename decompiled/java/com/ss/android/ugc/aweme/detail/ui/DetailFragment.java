package com.ss.android.ugc.aweme.detail.ui;

import X.AbstractC1025070cmX;
import X.C098200Yq;
import X.C0BX3;
import X.C0QSJ;
import X.C0R12;
import X.C0SPE;
import X.C0SZ8;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XQ7;
import X.C1009740cNo;
import X.C1012040cRW;
import X.C1017070cZd;
import X.C1017550caP;
import X.C1021860chM;
import X.C1026350cob;
import X.C1029590ctp;
import X.C1030670cvZ;
import X.C10EU;
import X.C1209170hZT;
import X.C1209890had;
import X.C1211940hdw;
import X.C1233040iBy;
import X.C1360340lVI;
import X.C1387620mDI;
import X.C1440005kM;
import X.C1483410ohn;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1565800qqg;
import X.C1578630rBN;
import X.C1588600rRS;
import X.C1590390rUL;
import X.C1590400rUM;
import X.C1590670rUn;
import X.C1591020rVM;
import X.C1591030rVN;
import X.C1591410rVz;
import X.C1599640rjG;
import X.C1600700rky;
import X.C1600750rl3;
import X.C1600770rl5;
import X.C1606370ru7;
import X.C1611490s2N;
import X.C1620930sHb;
import X.C1685300txQ;
import X.C1742080vR0;
import X.C1766860w4y;
import X.C189200o6;
import X.C198H;
import X.C19EG;
import X.C19GS;
import X.C1ER1;
import X.C2115308Ql;
import X.C2187451AjH;
import X.C2189821An6;
import X.C2277711EDh;
import X.C2277881EDy;
import X.C294780Bgy;
import X.C319860CgK;
import X.C486860J7k;
import X.C488600JEc;
import X.C580820MqG;
import X.C582980Mtk;
import X.C616540OGe;
import X.C636090OxD;
import X.C637980P0q;
import X.C663720Q1q;
import X.C673150Qan;
import X.C680080Qly;
import X.C682840QqQ;
import X.C687700QyG;
import X.C714440S0s;
import X.C740740T3w;
import X.C786410Ut5;
import X.C913020Zro;
import X.C913060Zrs;
import X.C988700bps;
import X.C989870brl;
import X.InterfaceC1146704e9;
import X.InterfaceC1209250hZb;
import X.InterfaceC1554640qYg;
import X.InterfaceC1590450rUR;
import X.InterfaceC1590610rUh;
import X.InterfaceC1591430rW1;
import X.InterfaceC1606390ru9;
import X.InterfaceC20622815ms;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC718140SEy;
import X.InterfaceC723060SXw;
import X.InterfaceC744170THb;
import Y.AObserverS215S0100000_11;
import Y.AObserverS223S0100000_19;
import Y.AObserverS226S0100000_24;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.common.viewmodel.TrendingMixInFlowViewModel;
import com.ss.android.ugc.aweme.detail.DetailFlingGestureAbility;
import com.ss.android.ugc.aweme.detail.DetailFragmentScope;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.detail.ui.story.StoryDetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.feed.panel.DetailNodeVisibility$initNodeVisibility$1;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.ss.android.ugc.aweme.services.IBusinessComponentService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public class DetailFragment extends AmeBaseFragment implements InterfaceC1606390ru9, DetailFlingGestureAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final C1211940hdw LLJJL = new C1211940hdw();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSEpPS46JGs5IGEXLTEtICMVOiQrJCo9PA==";
    public C1591410rVz LL;
    public InterfaceC1209250hZb LLILLJJLI;
    public ScrollSwitchStateManager LLILLL;
    public HomePageDataViewModel LLILZIL;
    public C1590400rUM LLILZLL;
    public DataCenter LLJ;
    public Aweme LLJI;
    public Aweme LLJIJIL;
    public AnalysisStayTimeFragmentComponent LLJILJILJ;
    public IAdSceneService LLJILLL;
    public C714440S0s LLJJIJI;
    public C1591030rVN LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJIJIL;
    public final C1590670rUn LLILZ = new C1590670rUn();
    public C2189821An6 LLIZ = new C2189821An6();
    public int LLIZLLLIL = -1;
    public boolean LLJILJIL = false;
    public boolean LLJJ = false;
    public String LLJJI = "";
    public String LLJJIII = "";
    public boolean LLJJJ = false;
    public String LLJJJIL = "";
    public final String LLJJJJ = "DetailFragment";
    public DefaultLifecycleObserver LLJJJJJIL = null;
    public final IBusinessComponentService LLJJJJLIIL = (IBusinessComponentService) PluggableExtentionKt.pluggableSpi(IBusinessComponentService.class);

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DetailFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1809055789) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.main.FlingGestureAbility
    public final void EN1() {
        this.LL.setFlingEnabled(true);
    }

    public final boolean MR() {
        Aweme aweme;
        if (("from_nearby".equals(getFrom()) || "from_search_mix".equals(getFrom()) || "from_search_live".equals(getFrom()) || "trending_page".equals(getFrom())) && (aweme = this.LLJI) != null && AwemeSaaSExtKt.isLive(aweme)) {
            return true;
        }
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        Aweme aweme2 = this.LLJI;
        c1387620mDI.getClass();
        if (C1387620mDI.LJI(aweme2)) {
            return true;
        }
        return UR();
    }

    public final boolean OR() {
        return (!TextUtils.isEmpty(this.LLIZ.getFeedsAwemeId()) && (TextUtils.equals(this.LLIZ.getPreviousPage(), "homepage_follow") || TextUtils.equals(this.LLIZ.getPreviousPage(), "homepage_hot"))) || LLJJL.containsKey(this.LLIZ.getEventType()) || TextUtils.equals(this.LLIZ.getEventType(), "playlist") || C1600750rl3.LJ(this.LLIZ.getFrom()) || C2277711EDh.LIZIZ.LJIILLIIL(this.LLIZ);
    }

    public Class<? extends CommonPageFragment> PR() {
        return (!this.LLIZ.isFromDuetMode() && this.LLIZ.isStoryPage() && C1600750rl3.LJFF(this.LLIZ.getFrom())) ? StoryDetailPageFragment.class : DetailPageFragment.class;
    }

    public final int SR() {
        IDetailPageAbility iDetailPageAbilityZP;
        C0SZ8 c0sz8LJLIL;
        Aweme aweme = this.LLJI;
        if (aweme == null || !C582980Mtk.LIZIZ(aweme) || (iDetailPageAbilityZP = ZP()) == null || (c0sz8LJLIL = iDetailPageAbilityZP.JQ().LJLIL()) == null || !c0sz8LJLIL.LLZZZIL() || !(c0sz8LJLIL instanceof IPhotosViewHolderType)) {
            return -1;
        }
        return ((IPhotosViewHolderType) c0sz8LJLIL).getCurrentPlayPosition();
    }

    public final boolean UR() {
        Aweme aweme;
        return ("from_profile_self".equals(getFrom()) || "from_profile_other".equals(getFrom()) || "STORY_ENTRANCE_OTHER".equals(getFrom()) || "STORY_ENTRANCE_MINE".equals(getFrom()) || "from_ad_new_fake_user".equals(getFrom()) || "from_video_sticker_profile_self".equals(getFrom())) && (aweme = this.LLJI) != null && aweme.getAuthor() != null && TextUtils.equals(this.LLJI.getAuthor().getUid(), this.LLIZ.getUid());
    }

    @Override // X.InterfaceC1606390ru9
    public final IDetailPageAbility ZP() {
        ScrollSwitchStateManager scrollSwitchStateManager;
        if (this.LLILZLL == null || (scrollSwitchStateManager = this.LLILLL) == null) {
            return null;
        }
        return C1600700rky.LIZ(scrollSwitchStateManager.xQ2("page_feed"));
    }

    @Override // com.ss.android.ugc.aweme.main.FlingGestureAbility
    public final void eE1() {
        this.LL.setFlingEnabled(false);
    }

    public final String getFrom() {
        return this.LLIZ.getFrom();
    }

    @Override // X.InterfaceC1606390ru9
    public final DetailPageFragment vD() {
        ScrollSwitchStateManager scrollSwitchStateManager;
        if (this.LLILZLL == null || (scrollSwitchStateManager = this.LLILLL) == null) {
            return null;
        }
        CommonPageFragment commonPageFragmentXQ2 = scrollSwitchStateManager.xQ2("page_feed");
        if (commonPageFragmentXQ2 instanceof DetailPageFragment) {
            return (DetailPageFragment) commonPageFragmentXQ2;
        }
        return null;
    }

    @Override // X.InterfaceC1606390ru9
    public final void LJIJ() {
        boolean zLJI = MethodIDManager.LJI(71930);
        if (TextUtils.equals(this.LLIZ.getEventType(), "others_homepage")) {
            C1440005kM.LIZ(new C1565800qqg(null));
        }
        Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(this);
        Integer numValueOf = fragmentLIZIZ != null ? Integer.valueOf(fragmentLIZIZ.hashCode()) : null;
        DataCenter dataCenter = this.LLJ;
        if (dataCenter != null) {
            dataCenter.zQ2(numValueOf, "onBack");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1606390ru9
    public final boolean LLLLIIL() {
        ScrollSwitchStateManager scrollSwitchStateManager;
        boolean zLJI = MethodIDManager.LJI(71975);
        if (this.LLILLJJLI == null || (scrollSwitchStateManager = this.LLILLL) == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        if (scrollSwitchStateManager.FQ2("page_profile")) {
            this.LLILLJJLI.LIZIZ();
            if (!zLJI) {
                return true;
            }
            MethodIDManager.LJ();
            return true;
        }
        CommonPageFragment commonPageFragmentZQ2 = this.LLILLL.zQ2();
        if (commonPageFragmentZQ2 == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        boolean zLLZLL = commonPageFragmentZQ2.LLZLL();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLLZLL;
    }

    public final boolean NR() {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (!C10EU.LJIIIIZZ()) {
            int videoType = this.LLIZ.getVideoType();
            boolean z = videoType == 0 || videoType == 15;
            boolean zEquals = "from_profile_self".equals(getFrom());
            boolean zEquals2 = "from_profile_other".equals(getFrom());
            if ((!zEquals && !zEquals2) || !z) {
                Aweme aweme = this.LLJI;
                if ((!C1017070cZd.LLFII(aweme) || aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isPersonalPageForbidden()) && !C1360340lVI.LIZJ(this.LLIZ) && !TextUtils.equals("new_ad_fake_user", this.LLIZ.getEventType()) && !"from_publish_add_video".equals(getFrom()) && !C2277711EDh.LIZIZ.LJI(this.LLJI) && !((IStoryService) ServiceManager.get().getService(IStoryService.class)).LJJIIJ().LJIILLIIL(this.LLIZ.getFrom())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC1606390ru9
    public final int cn() {
        IDetailPageAbility iDetailPageAbilityZP = ZP();
        if (iDetailPageAbilityZP != null) {
            return iDetailPageAbilityZP.vj1();
        }
        return 0;
    }

    @Override // X.InterfaceC1606390ru9
    public final void ew() {
        if (C1209170hZT.LIZIZ(getFrom()) && C1ER1.LIZIZ.LLFZ(getFrom()) && getActivity() != null) {
            C1012040cRW.LIZIZ().LIZ = FeedSharePlayerViewModel.getPlayerManager(getActivity());
            C1012040cRW.LIZIZ().LJIIJJI = true;
            C1012040cRW.LIZIZ().LJIIL = SR();
        }
        C0R12.LIZIZ.LJJIIJ(getContext(), this.LLJI, SR());
        if (!C636090OxD.LIZ() || this.LLJI == null) {
            return;
        }
        ((IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class)).LJIILL(this.LLJI.getAid());
        ((IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class)).LJIILLIIL(C1483410ohn.LJLJJI().getCurrentPosition(), this.LLJI.getAid(), "video");
        ((IMusicDetailService) ServiceManager.get().getService(IMusicDetailService.class)).LJIILLIIL(SR(), this.LLJI.getAid(), "photo");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        if (!OR()) {
            return super.getAnalysis();
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("others_homepage");
        return analysis;
    }

    public final String getCurrentUid() {
        C0XQ7.LJ();
        if (C0XQ7.LIZ.LJIIJ() == null) {
            return "";
        }
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIIJ().getCurUserId();
        C0XQ7.LJ();
        return C0XQ7.LIZ.LJIIJ().getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!TextUtils.isEmpty(this.LLIZ.getReactSessionId()) && this.LLJI != null) {
            C1440005kM.LIZ(new C663720Q1q(2, this.LLIZ.getReactSessionId(), C1483410ohn.LJLJJI().getCurrentPosition(), this.LLJI.getAid()));
        }
        if (this.LLJJJJJIL != null) {
            getLifecycle().removeObserver(this.LLJJJJJIL);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        if (this.LLJILJIL) {
            new Intent();
            ArrayList<String> arrayList = new ArrayList<>();
            String[] strArrSplit = new String[0];
            Aweme aweme = this.LLJI;
            if (aweme != null) {
                strArrSplit = aweme.getStickerIDs().split(",");
            }
            for (String str : strArrSplit) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.creationId(UUID.randomUUID().toString());
            builder.stickers(arrayList);
            builder.autoUseSticker((String) ListProtector.get(arrayList, 0));
            builder.stickerMusic(this.LLJI.getMusic());
            builder.translationType(3);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("DetailFeed", new C580820MqG(builder, this, 6));
            this.LLJILJIL = false;
        }
    }

    @Override // X.InterfaceC1606390ru9
    public final Aweme LJIIIIZZ() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // X.InterfaceC1606390ru9
    public final InterfaceC1209250hZb w8() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1606390ru9
    public final void ID(int i) {
        Aweme awemeHm;
        long jVN1;
        IDetailPageAbility iDetailPageAbilityZP = ZP();
        Aweme awemeHm2 = null;
        if (iDetailPageAbilityZP != null) {
            awemeHm = iDetailPageAbilityZP.hm();
        } else {
            awemeHm = null;
        }
        RR(i, awemeHm);
        IDetailPageAbility iDetailPageAbilityZP2 = ZP();
        if (iDetailPageAbilityZP2 != null) {
            awemeHm2 = iDetailPageAbilityZP2.hm();
        }
        String from = getFrom();
        int videoType = this.LLIZ.getVideoType();
        String eventType = this.LLIZ.getEventType();
        IDetailPageAbility iDetailPageAbilityZP3 = ZP();
        if (iDetailPageAbilityZP3 != null) {
            jVN1 = iDetailPageAbilityZP3.VN1();
        } else {
            jVN1 = -1;
        }
        C1209890had.LIZIZ(awemeHm2, from, videoType, eventType, jVN1, i, this.LLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public void onScrollToProfileEvent(C0SPE c0spe) {
        C198H rootSAFSceneWrapper;
        ComponentCallbacks2 componentCallbacks2LJFF;
        Scene scene;
        Context sceneContext;
        boolean z;
        User author;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        int i;
        IMainService iMainService;
        Aweme aweme;
        AwemeCommerceStruct commerceVideoAuthInfo;
        ComponentCallbacks2 componentCallbacks2LJFF2;
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        Context sceneContext2;
        C488600JEc c488600JEcLIZ;
        if (c0spe != null && this.LLILLJJLI != null && getActivity() != null && this.LLILLJJLI != null) {
            int i2 = c0spe.LIZ;
            InterfaceC214902198i interfaceC214902198i = null;
            if (C1606370ru7.LIZIZ(this) != null) {
                C19EG activity = getActivity();
                if (activity instanceof InterfaceC214897198d) {
                    if (i2 != activity.hashCode()) {
                        Context context = getContext();
                        if (context != null) {
                            componentCallbacks2LJFF2 = SAFExtensionKt.LJFF(context);
                        } else {
                            componentCallbacks2LJFF2 = null;
                        }
                        if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF2).getEnableSAF() : !(componentCallbacks2LJFF2 instanceof InterfaceC214897198d)) {
                            c488600JEcLIZ = C682840QqQ.LIZ(interfaceC214902198i, activity);
                            if (c488600JEcLIZ != null || i2 != c488600JEcLIZ.hashCode()) {
                                return;
                            }
                        } else {
                            Fragment parentFragment = this;
                            while (true) {
                                if (parentFragment instanceof InterfaceC214902198i) {
                                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                                    if (interfaceC214902198i == null || (sAFFragmentRootSceneIb = interfaceC214902198i.ib()) == null || (sceneContext2 = sAFFragmentRootSceneIb.getSceneContext()) == null || i2 != sceneContext2.hashCode()) {
                                        break;
                                    }
                                } else {
                                    parentFragment = parentFragment.getParentFragment();
                                    if (parentFragment == null) {
                                        break;
                                    }
                                }
                            }
                            c488600JEcLIZ = C682840QqQ.LIZ(interfaceC214902198i, activity);
                            if (c488600JEcLIZ != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                C19EG activity2 = getActivity();
                if (!(activity2 instanceof InterfaceC214897198d)) {
                    return;
                }
                if (i2 != activity2.hashCode() && ((rootSAFSceneWrapper = ((InterfaceC20622815ms) activity2).getRootSAFSceneWrapper()) == null || (scene = rootSAFSceneWrapper.getScene()) == null || (sceneContext = scene.getSceneContext()) == null || i2 != sceneContext.hashCode())) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context2);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        Fragment parentFragment2 = this;
                        while (true) {
                            if (parentFragment2 instanceof InterfaceC214902198i) {
                                interfaceC214902198i = (InterfaceC214902198i) parentFragment2;
                                break;
                            } else {
                                parentFragment2 = parentFragment2.getParentFragment();
                                if (parentFragment2 == null) {
                                    break;
                                }
                            }
                        }
                    }
                    C488600JEc c488600JEcLIZ2 = C682840QqQ.LIZ(interfaceC214902198i, activity2);
                    if (c488600JEcLIZ2 == null || i2 != c488600JEcLIZ2.hashCode()) {
                        return;
                    }
                }
            }
            Aweme aweme2 = this.LLJI;
            if (C1017070cZd.LLFII(aweme2) && aweme2 != null && (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isPersonalPageForbidden()) {
                C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                c1233040iBy.LIZIZ(2131824738);
                c1233040iBy.LIZLLL();
                return;
            }
            if (C1017070cZd.LJJLIIJ(this.LLJI) && !C1017070cZd.LJJJJL(this.LLJI) && C1017070cZd.LL(this.LLJI) && !TextUtils.equals("new_ad_fake_user", this.LLIZ.getEventType())) {
                C1233040iBy c1233040iBy2 = new C1233040iBy(getContext());
                c1233040iBy2.LIZIZ(2131824734);
                c1233040iBy2.LIZLLL();
                return;
            }
            if (UR()) {
                LJIJ();
                return;
            }
            if (this.LLJI.getCollabInfo() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!TextUtils.equals(this.LLIZ.getEventType(), "others_homepage") && !TextUtils.equals(this.LLIZ.getEventType(), "personal_homepage")) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
                    smartRouteBuildRoute.withParam("uid", AwemeExtKt.getAuthorUid(this.LLJI));
                    smartRouteBuildRoute.withParam("sec_userid", AwemeExtKt.getSecAuthorUid(this.LLJI));
                    smartRouteBuildRoute.withParam("enter_from", getFrom());
                    smartRouteBuildRoute.withParam("extra_from_pre_page", this.LLIZ.getPreviousPage());
                    smartRouteBuildRoute.withParam(c0spe.LIZIZ);
                    smartRouteBuildRoute.open();
                    return;
                }
                LJIJ();
                return;
            }
            if (getActivity() instanceof InterfaceC723060SXw) {
                if (TextUtils.equals(this.LLJI.getAuthor().getUid(), getCurrentUid())) {
                    SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(getContext(), "aweme://user/homepage");
                    smartRouteBuildRoute2.withParam("uid", AwemeExtKt.getAuthorUid(this.LLJI));
                    smartRouteBuildRoute2.withParam("sec_userid", AwemeExtKt.getSecAuthorUid(this.LLJI));
                    smartRouteBuildRoute2.withParam("enter_from", getFrom());
                    smartRouteBuildRoute2.addFlags(67108864);
                    smartRouteBuildRoute2.open();
                    return;
                }
                SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
                smartRouteBuildRoute3.withParam("uid", AwemeExtKt.getAuthorUid(this.LLJI));
                smartRouteBuildRoute3.withParam("sec_userid", AwemeExtKt.getSecAuthorUid(this.LLJI));
                smartRouteBuildRoute3.withParam("enter_from", getFrom());
                smartRouteBuildRoute3.withParam("extra_from_pre_page", this.LLIZ.getPreviousPage());
                smartRouteBuildRoute3.withParam(c0spe.LIZIZ);
                smartRouteBuildRoute3.open();
                return;
            }
            if ((getActivity() instanceof DetailActivity) && "STORY_ENTRANCE_AVATAR".equals(getFrom())) {
                SmartRoute smartRouteBuildRoute4 = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
                smartRouteBuildRoute4.withParam("uid", AwemeExtKt.getAuthorUid(this.LLJI));
                smartRouteBuildRoute4.withParam("sec_userid", AwemeExtKt.getSecAuthorUid(this.LLJI));
                smartRouteBuildRoute4.withParam("enter_from", getFrom());
                smartRouteBuildRoute4.withParam("extra_from_pre_page", this.LLIZ.getPreviousPage());
                smartRouteBuildRoute4.withParam(c0spe.LIZIZ);
                smartRouteBuildRoute4.open();
                return;
            }
            if (C637980P0q.LIZ(this.LLJI) && ((aweme = this.LLJI) == null || aweme.getAuthor() == null || TextUtils.isEmpty(this.LLJI.getAuthor().toString()))) {
                C1233040iBy c1233040iBy3 = new C1233040iBy(getContext());
                c1233040iBy3.LIZIZ(2131837303);
                c1233040iBy3.LIZLLL();
                return;
            }
            String str = c0spe.LIZJ;
            if (str == null) {
                str = "";
            }
            Aweme aweme3 = this.LLJI;
            C19EG activity3 = getActivity();
            if (activity3 != null && aweme3 != null && AwemeExtKt.isAdTraffic(aweme3) && (awemeRawAd2 = aweme3.getAwemeRawAd()) != null && (!TextUtils.equals(str, "click_ad_web_jsb") || !C1009740cNo.LJIILIIL(aweme3))) {
                if (!str.equals("click_name")) {
                    if (!str.equals("click_avatar")) {
                        i = -1;
                    } else {
                        i = 64;
                    }
                } else {
                    i = 39;
                }
                if (!C1017070cZd.LJJZ(aweme3, C1026350cob.LIZIZ(i), C1026350cob.LIZ(i)) || (iMainService = (IMainService) ServiceManager.get().getService(IMainService.class)) == null || !iMainService.useSystemBrowserOpenWebPage(activity3, aweme3, i)) {
                    C1026350cob.LJ(this.LLIZ.getEventType());
                    if (C1017070cZd.LLJJIJI(aweme3, "draw_ad", "slide", false) && C1017070cZd.LL(aweme3) && !C1017070cZd.LJIIJ(aweme3) && !TextUtils.isEmpty(C1017070cZd.LJIIZILJ(aweme3))) {
                        C1012040cRW.LIZIZ().LJIIIIZZ = 40;
                        C1029590ctp.LIZIZ().getClass();
                        AbstractC1025070cmX.LJJIJIIJI(activity3, aweme3, 40);
                        return;
                    }
                    if (C1017070cZd.LL(aweme3) && C1017070cZd.LLJLLL(aweme3)) {
                        InterfaceC718140SEy interfaceC718140SEyLIZIZ = C1029590ctp.LIZIZ();
                        String webUrl = aweme3.getAwemeRawAd().getWebUrl();
                        interfaceC718140SEyLIZIZ.getClass();
                        C1017550caP.LIZIZ(activity3, webUrl);
                        return;
                    }
                    if (!C1017070cZd.LJJLJLI(aweme3) && TextUtils.isEmpty(awemeRawAd2.getWebUrl()) && C1017070cZd.LL(aweme3)) {
                        C786410Ut5.re(Toast.makeText(activity3, 2131824734, 0));
                        return;
                    }
                    if (C1017070cZd.LJJLJLI(aweme3) && C1017070cZd.LL(aweme3) && !C1017070cZd.LJIIJ(aweme3) && !C1017070cZd.LJJLL(aweme3)) {
                        if (C1017070cZd.LJJLJLI(aweme3)) {
                            ISamsungPageService iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi(ISamsungPageService.class);
                            if (iSamsungPageService != null && iSamsungPageService.LIZ(activity3, aweme3, 40)) {
                                return;
                            }
                            C1029590ctp.LIZIZ().getClass();
                            if (!C1021860chM.LJJJIL(activity3, aweme3, "", 40)) {
                                C786410Ut5.re(Toast.makeText(activity3, 2131824734, 0));
                                return;
                            }
                            return;
                        }
                        C786410Ut5.re(Toast.makeText(activity3, 2131824734, 0));
                        return;
                    }
                }
            }
            Aweme aweme4 = this.LLJI;
            if (aweme4 != null && AwemeExtKt.isAdTraffic(aweme4) && (author = aweme4.getAuthor()) != null && author.isAdFake() && (C1017070cZd.LIZJ(aweme4) || ((awemeRawAd = aweme4.getAwemeRawAd()) != null && awemeRawAd.isAllowDspAutoJump()))) {
                InterfaceC718140SEy interfaceC718140SEyLIZIZ2 = C1029590ctp.LIZIZ();
                Context context3 = getContext();
                Aweme aweme5 = this.LLJI;
                interfaceC718140SEyLIZIZ2.getClass();
                if (AbstractC1025070cmX.LJIIZILJ(context3, aweme5)) {
                    return;
                }
            }
            if (!MR()) {
                Aweme aweme6 = this.LLJI;
                if (aweme6 == null || !C1009740cNo.LJIILIIL(aweme6) || !TextUtils.equals(str, "click_ad_web_jsb")) {
                    Aweme aweme7 = this.LLJI;
                    if (aweme7 != null && AwemeExtKt.isAdTraffic(aweme7)) {
                        IMiniAppService iMiniAppServiceLIZIZ = C988700bps.LIZ.LIZIZ();
                        String microAppUrl = this.LLJI.getAwemeRawAd().getMicroAppUrl();
                        C1611490s2N c1611490s2N = new C1611490s2N();
                        if (C1030670cvZ.LIZ(microAppUrl) && iMiniAppServiceLIZIZ.openMiniApp(getContext(), microAppUrl, c1611490s2N)) {
                            return;
                        }
                    }
                    if (C1017070cZd.LJJLJLI(this.LLJI) && C1017070cZd.LL(this.LLJI) && !C1017070cZd.LJIIJ(this.LLJI) && !C1017070cZd.LJJLL(this.LLJI)) {
                        InterfaceC718140SEy interfaceC718140SEyLIZIZ3 = C1029590ctp.LIZIZ();
                        Context context4 = getContext();
                        Aweme aweme8 = this.LLJI;
                        interfaceC718140SEyLIZIZ3.getClass();
                        if (C1021860chM.LJJJIL(context4, aweme8, "", 40)) {
                            return;
                        }
                    }
                }
                this.LLILLJJLI.ph(c0spe.LIZIZ, this.LLJI, c0spe.LIZJ);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onTalentProfileAdEvent(C989870brl c989870brl) {
        List<Aweme> list;
        IDetailPageAbility iDetailPageAbilityZP;
        if (c989870brl != null && (list = c989870brl.LIZ) != null && (iDetailPageAbilityZP = ZP()) != null) {
            iDetailPageAbilityZP.yL(list);
        }
    }

    @C14EU
    public void receiveJumpToRecord(C1588600rRS c1588600rRS) {
        this.LLJILJIL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/detail/ui/DetailFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6td57H0HxzkXZEXSFj9H/y5l1GptBEgw==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LLJILJILJ;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.LIZIZ(z);
        }
    }

    public final int RR(int i, Aweme aweme) {
        if (aweme != null && getActivity() != null && !getActivity().isDestroyed()) {
            if (((List) ((TrendingMixInFlowViewModel) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(requireActivity().getLifecycle(), TrendingMixInFlowViewModel.class)).LL.getValue()).contains(Integer.valueOf(i))) {
                ((ISearchService) ServiceManager.get().getService(ISearchService.class)).m0();
            }
        }
        return i;
    }

    @Override // X.InterfaceC1606390ru9
    public final void jr(int i, boolean z) {
        Aweme awemeHm;
        long jDy;
        IDetailPageAbility iDetailPageAbilityZP = ZP();
        if (iDetailPageAbilityZP != null) {
            awemeHm = iDetailPageAbilityZP.hm();
        } else {
            awemeHm = null;
        }
        String from = getFrom();
        int videoType = this.LLIZ.getVideoType();
        String eventType = this.LLIZ.getEventType();
        IDetailPageAbility iDetailPageAbilityZP2 = ZP();
        if (iDetailPageAbilityZP2 != null) {
            jDy = iDetailPageAbilityZP2.Dy();
        } else {
            jDy = -1;
        }
        C1209890had.LIZJ(awemeHm, from, videoType, eventType, jDy, i, this.LLIZ);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [X.0S0s] */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.0rVN] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        LifecycleOwner activity;
        HomePageDataViewModel homePageDataViewModel;
        ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL;
        ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL2;
        C913020Zro c913020Zro;
        String eventType;
        super.onViewCreated(view, bundle);
        this.LLJ = DataCenter.vQ2(ViewModelProviders.of(getActivity()), this);
        this.LL = (C1591410rVz) view.findViewById(R.id.viewpager);
        this.LLJILLL = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        Bundle arguments = getArguments();
        C2189821An6 c2189821An6 = (C2189821An6) arguments.getSerializable("feed_param");
        this.LLIZ = c2189821An6;
        if (c2189821An6 != null && (eventType = c2189821An6.getEventType()) != null) {
            Npth.addTag("detail_feed_event_type", eventType);
        }
        arguments.getBoolean("extra_challenge_is_hashtag", false);
        this.LLIZLLLIL = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
        this.LLJJJIL = arguments.getString("extra_hashtag_tagline", "");
        C1578630rBN.LJIIIIZZ(arguments, "DETAIL");
        if (TextUtils.equals("", this.LLJJI) && this.LLIZ.getAid() != null) {
            this.LLJJI = this.LLIZ.getAid();
        }
        String from = getFrom();
        if (!Intrinsics.LJFF("from_profile_self", from) && !Intrinsics.LJFF("from_profile_other", from)) {
            Intrinsics.LJFF("from_roaming", from);
        }
        String string = arguments.getString("auto_route_schema", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                BcmParams bcmParams = new BcmParams();
                bcmParams.put("ec_is_video_page", "1");
                String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c1985.d0", PageFinder.via((Fragment) this), bcmParams);
                if (!TextUtils.isEmpty(strCreateJumpSourceBtmToken)) {
                    Uri uri = UriProtector.parse(string);
                    if (uri.isHierarchical()) {
                        string = uri.buildUpon().appendQueryParameter("source_btm_token", strCreateJumpSourceBtmToken).toString();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            String strLJIIJJI = C1742080vR0.LJIIJJI(2, string);
            C1766860w4y.LIZ.getClass();
            C1766860w4y.LJIIIZ(null, this, true);
            SmartRouter.buildRoute(this, strLJIIJJI).open();
        }
        C2189821An6 c2189821An62 = this.LLIZ;
        if (c2189821An62 != null && c2189821An62.getAid() != null) {
            String aid = this.LLIZ.getAid();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aid != null && (c913020Zro = C913060Zrs.LIZ) != null && Intrinsics.LJFF(c913020Zro.LIZ, aid) && c913020Zro.LJIIIIZZ <= 0) {
                c913020Zro.LJIIIIZZ = jCurrentTimeMillis;
            }
        }
        Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(this);
        if (fragmentLIZIZ != null) {
            this.LLILLL = C486860J7k.LIZ(fragmentLIZIZ);
        } else {
            this.LLILLL = C486860J7k.LIZIZ(getActivity());
        }
        this.LLILZIL = C680080Qly.LIZIZ(getActivity());
        C1590390rUL c1590390rUL = new C1590390rUL();
        if (!this.LLIZ.isFromDuetMode() && !this.LLIZ.isFromEffectDiscover()) {
            c1590390rUL.LIZIZ(PR(), "page_feed", 0, 1.0f, getArguments());
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("related_gid", this.LLIZ.getRelatedId(), bundle2);
            bundle2.putInt("from_recommend_card", this.LLIZ.getFromRecommendCard());
            DetailNavArgModel navArgModel = this.LLIZ.getNavArgModel();
            if (navArgModel != null && navArgModel.isFromPush() > 0) {
                bundle2.putInt("is_from_push", 1);
                C786410Ut5.LJJJI("push_type", navArgModel.getPushType(), bundle2);
                C786410Ut5.LJJJI("push_id", navArgModel.getPushId(), bundle2);
            }
            if (this.LLIZ.isStoryPage()) {
                if (!TextUtils.equals(this.LLIZ.getEventType(), "personal_homepage") && (TextUtils.equals(this.LLIZ.getEventType(), "others_homepage") || !NR() || ((iTalentAdRevenueShareServiceLJIIL2 = TalentAdRevenueShareServiceImpl.LJIIL()) != null && iTalentAdRevenueShareServiceLJIIL2.LJIIIZ()))) {
                    c1590390rUL.LIZ(bundle2, C2277881EDy.LIZIZ.getProfilePageFragmentClass());
                }
            } else if (TextUtils.equals(this.LLIZ.getEventType(), "others_homepage") || !NR() || ((iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL()) != null && iTalentAdRevenueShareServiceLJIIL.LJIIIZ())) {
                c1590390rUL.LIZ(bundle2, C2277881EDy.LIZIZ.getProfilePageFragmentClass());
            }
        } else {
            c1590390rUL.LIZIZ(PR(), "page_feed", 0, 1.0f, getArguments());
        }
        c1590390rUL.LIZIZ = new InterfaceC1590450rUR() { // from class: X.0rUW
            @Override // X.InterfaceC1590450rUR
            public final void LIZ() {
            }

            @Override // X.InterfaceC1590450rUR
            public final void LIZIZ(HashMap<Integer, CommonPageFragment> map) {
                C1590400rUM c1590400rUM = this.LIZ.LLILZLL;
                if (c1590400rUM != null && Objects.equals(c1590400rUM.LJJIL(0), "page_feed")) {
                    C1590670rUn c1590670rUn = this.LIZ.LLILZ;
                    CommonPageFragment commonPageFragment = map.get(0);
                    c1590670rUn.getClass();
                    if (commonPageFragment != null) {
                        commonPageFragment.getLifecycle().addObserver(new DetailNodeVisibility$initNodeVisibility$1(commonPageFragment, c1590670rUn));
                    }
                }
                ScrollSwitchStateManager scrollSwitchStateManager = this.LIZ.LLILLL;
                if (scrollSwitchStateManager != null) {
                    scrollSwitchStateManager.LLILLL.setValue(map);
                }
            }

            @Override // X.InterfaceC1590450rUR
            public final void LIZJ(List<C1590430rUP> list) {
                ScrollSwitchStateManager scrollSwitchStateManager = this.LIZ.LLILLL;
                if (scrollSwitchStateManager != null) {
                    scrollSwitchStateManager.LLILLJJLI.setValue(list);
                }
            }
        };
        if (!this.LLIZ.isHotSpot() && !((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(getContext())) {
            this.LLILZLL = c1590390rUL.LIZJ(getFragmentManager());
        } else {
            this.LLILZLL = c1590390rUL.LIZJ(getChildFragmentManager());
        }
        C1591410rVz c1591410rVz = this.LL;
        if (c1591410rVz != null) {
            c1591410rVz.setAdapter(this.LLILZLL);
        }
        C1591410rVz c1591410rVz2 = this.LL;
        if (c1591410rVz2 != null) {
            c1591410rVz2.LIZLLL(new C1620930sHb(this, 13));
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LLILLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LL.setBridge(new InterfaceC1590610rUh() { // from class: X.0rVo
                @Override // X.InterfaceC1590610rUh
                public final int getValue() {
                    C1591410rVz c1591410rVz3 = this.LIZ.LL;
                    if (c1591410rVz3 != null) {
                        return c1591410rVz3.getCurrentItem();
                    }
                    return 0;
                }

                @Override // X.InterfaceC1590610rUh
                public final void LJ(int i) {
                    C1591410rVz c1591410rVz3 = this.LIZ.LL;
                    if (c1591410rVz3 != null) {
                        c1591410rVz3.setCurrentItem(i);
                    }
                }

                @Override // X.InterfaceC1590610rUh
                public final void LIZ(int i, boolean z) {
                    C1591410rVz c1591410rVz3 = this.LIZ.LL;
                    if (c1591410rVz3 != null) {
                        c1591410rVz3.LLFFF(i, z);
                    }
                }
            });
        }
        C1591410rVz c1591410rVz3 = this.LL;
        if (c1591410rVz3 != null) {
            c1591410rVz3.setOnFlingEndListener(new InterfaceC1591430rW1() { // from class: X.0rUb
                @Override // X.InterfaceC1591430rW1
                public final void LIZ() {
                    ScrollSwitchStateManager scrollSwitchStateManager2 = this.LIZ.LLILLL;
                    if (scrollSwitchStateManager2 != null) {
                        scrollSwitchStateManager2.LLJILJIL.setValue(EnumC2029507xF.INSTANCE);
                    }
                }
            });
        }
        if (this.LLILLL != null) {
            LifecycleOwner lifecycleOwnerLIZIZ = C1606370ru7.LIZIZ(this);
            if (lifecycleOwnerLIZIZ == null) {
                lifecycleOwnerLIZIZ = getActivity();
            }
            this.LLILLL.LLJILJIL.observe(lifecycleOwnerLIZIZ, new AObserverS226S0100000_24(this, 22));
        }
        if (fragmentLIZIZ != null) {
            activity = fragmentLIZIZ;
        } else {
            activity = getActivity();
        }
        this.LLILLL.LLILZ.observe(activity, new AObserverS223S0100000_19(this, 60));
        this.LLILLL.LLILZLL.observe(activity, new AObserverS223S0100000_19(this, 61));
        this.LLILLL.IQ2(activity, new AObserverS226S0100000_24(this, 21));
        this.LLILLL.LLJJIII.observe(activity, new AObserverS223S0100000_19(this, 62));
        if (fragmentLIZIZ != null) {
            this.LLILLJJLI = this.LLJJJJLIIL.newScrollSwitchHelper(fragmentLIZIZ, this.LL, this.LLILZLL);
        } else {
            this.LLILLJJLI = this.LLJJJJLIIL.newScrollSwitchHelper(getActivity(), this.LL, this.LLILZLL);
        }
        final C19EG activity2 = getActivity();
        this.LLJJIJI = new C1591020rVM(activity2) { // from class: X.0S0s
            public final C19EG LIZIZ;

            {
                this.LIZIZ = activity2;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
            @Override // X.C1591020rVM, X.InterfaceC1210210hb9
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJJIL(float r13, float r14, int r15) {
                /*
                    r12 = this;
                    r2 = 1
                    r7 = 0
                    r0 = -1
                    if (r15 != r0) goto L22
                    X.19EG r0 = r12.LIZIZ
                    com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r1 = X.C486860J7k.LIZIZ(r0)
                    java.lang.String r0 = "page_feed"
                    boolean r0 = r1.FQ2(r0)
                    if (r0 == 0) goto Lb3
                    X.19EG r0 = r12.LIZIZ
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C740740T3w.LJFF(r0)
                    if (r0 == 0) goto L21
                    com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
                    if (r0 != 0) goto Lb3
                L21:
                    return r7
                L22:
                    if (r15 == r0) goto Lb3
                    if (r15 != r0) goto Lc0
                L26:
                    com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
                    X.0XPy r0 = (X.AbstractC848400XPy) r0
                    boolean r0 = r0.isLogin()
                    if (r0 != 0) goto Lc0
                    java.lang.Class<com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService> r6 = com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService.class
                    r10 = 14
                    r11 = 0
                    r8 = r7
                    r9 = r7
                    java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
                    com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService r1 = (com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService) r1
                    if (r1 == 0) goto Lc0
                    X.19EG r0 = r12.LIZIZ
                    boolean r0 = r1.LIZJ(r0)
                    if (r0 != r2) goto Lc0
                    float r1 = java.lang.Math.abs(r13)
                    r0 = 40
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r0 = X.C814420VxA.LIZIZ(r0)
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 < 0) goto Lb0
                    float r1 = java.lang.Math.abs(r13)
                    float r0 = java.lang.Math.abs(r14)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto Lb0
                    X.19EG r0 = r12.LIZIZ
                    com.ss.android.ugc.aweme.feed.model.Aweme r6 = X.C740740T3w.LJFF(r0)
                    X.19EG r4 = r12.LIZIZ
                    X.0Oin r5 = new X.0Oin
                    r5.<init>()
                    r3 = 0
                    if (r6 == 0) goto Lb1
                    java.lang.String r2 = r6.getAid()
                L80:
                    android.os.Bundle r1 = r5.LIZ
                    java.lang.String r0 = "group_id"
                    X.C786410Ut5.LJJJI(r0, r2, r1)
                    if (r6 == 0) goto L8d
                    java.lang.String r11 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r6)
                L8d:
                    android.os.Bundle r1 = r5.LIZ
                    java.lang.String r0 = "author_id"
                    X.C786410Ut5.LJJJI(r0, r11, r1)
                    if (r6 == 0) goto L9a
                    java.lang.String r3 = r6.getAid()
                L9a:
                    java.lang.String r2 = X.C735370Ssx.LJIIJJI(r3)
                    android.os.Bundle r1 = r5.LIZ
                    java.lang.String r0 = "log_pb"
                    X.C786410Ut5.LJJJI(r0, r2, r1)
                    android.os.Bundle r3 = r5.LIZ
                    X.0S0t r2 = new X.InterfaceC849390XTt() { // from class: X.0S0t
                        static {
                            /*
                                X.0S0t r0 = new X.0S0t
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:X.0S0t) X.0S0t.LIZ X.0S0t
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C714450S0t.<clinit>():void");
                        }

                        {
                            /*
                                r0 = this;
                                r0.<init>()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C714450S0t.<init>():void");
                        }

                        @Override // X.InterfaceC849390XTt
                        public final void LIZ() {
                            /*
                                r0 = this;
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C714450S0t.LIZ():void");
                        }

                        @Override // X.InterfaceC849390XTt
                        public final /* synthetic */ void LIZIZ() {
                            /*
                                r0 = this;
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C714450S0t.LIZIZ():void");
                        }
                    }
                    java.lang.String r1 = "paid_series_detail_page"
                    java.lang.String r0 = "click_other_homepage"
                    X.C0XPD.LIZIZ(r4, r1, r0, r3, r2)
                Lb0:
                    return r7
                Lb1:
                    r2 = r11
                    goto L80
                Lb3:
                    X.19EG r0 = r12.LIZIZ
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = X.C740740T3w.LJFF(r0)
                    boolean r0 = X.C1375880luM.LIZIZ(r0)
                    if (r0 == 0) goto L26
                    return r7
                Lc0:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C714440S0s.LJJIL(float, float, int):boolean");
            }
        };
        final C19EG activity3 = getActivity();
        final C714440S0s c714440S0s = this.LLJJIJI;
        this.LLJJIJIIJIL = new C1591020rVM(activity3, c714440S0s) { // from class: X.0rVN
            public final C19EG LIZIZ;
            public final C714440S0s LIZJ;

            {
                this.LIZIZ = activity3;
                this.LIZJ = c714440S0s;
            }

            @Override // X.C1591020rVM, X.InterfaceC1210210hb9
            public final boolean LJJIL(float f, float f2, int i) {
                if (!LJJIL(f, f2, i)) {
                    return false;
                }
                if (i == -1) {
                    return C486860J7k.LIZIZ(this.LIZIZ).FQ2("page_discover");
                }
                return true;
            }
        };
        this.LLILZLL.notifyDataSetChanged();
        C680080Qly.LIZIZ(getActivity()).setEventType(this.LLIZ.getEventType());
        this.LLILLL.kE0("page_feed", false);
        if (this.LLIZ.isChain()) {
            this.LLILZLL.LLJILJILJ = new C2115308Ql();
        }
        C1600770rl5 c1600770rl5 = new C1600770rl5(this);
        if (fragmentLIZIZ != null) {
            C740740T3w.LIZ(fragmentLIZIZ, this, c1600770rl5);
        } else {
            C740740T3w.LIZIZ(getActivity(), this, c1600770rl5);
        }
        this.LLILLL.LQ2(this.LLJJIJI);
        if (!C0BX3.LIZ() && (homePageDataViewModel = this.LLILZIL) != null) {
            homePageDataViewModel.LLIZLLLIL.observe(getActivity(), new AObserverS215S0100000_11(this, 27));
        }
        Fragment fragmentLIZIZ2 = C1606370ru7.LIZIZ(this);
        if (fragmentLIZIZ2 != null) {
            this.LLJJIJIL = C1558360qeg.LJFF(fragmentLIZIZ2, null);
        } else {
            this.LLJJIJIL = C1558360qeg.LJI(getActivity(), null);
        }
        C1558520qew.LJII(this.LLJJIJIL, this, DetailFlingGestureAbility.class, null, null);
        if (OR()) {
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(this);
            this.LLJILJILJ = analysisStayTimeFragmentComponent;
            analysisStayTimeFragmentComponent.LLILZ = new InterfaceC744170THb() { // from class: X.0rHH
                @Override // X.InterfaceC744170THb
                public final C1386470mBR LIZ(C1386470mBR c1386470mBR) {
                    DetailFragment detailFragment = this.LIZ;
                    c1386470mBR.LJJLIIIJL = detailFragment.LLIZ.getPreviousPage();
                    c1386470mBR.LJJLIIIJLJLI = detailFragment.LLIZ.getUid();
                    c1386470mBR.LJJLIIIJJIZ = detailFragment.LLIZ.getFeedsAwemeId();
                    String str = DetailFragment.LLJJL.get(detailFragment.LLIZ.getEventType());
                    C2277711EDh.LIZIZ.LJJJJJL(c1386470mBR, detailFragment.LLIZ);
                    if (!TextUtils.isEmpty(str)) {
                        c1386470mBR.LJJIJL(str);
                    }
                    if (TextUtils.equals(detailFragment.LLIZ.getEventType(), "playlist")) {
                        c1386470mBR.LJJIJL("playlist");
                        c1386470mBR.LJJLIL = detailFragment.LLIZ.getPlayListId();
                        c1386470mBR.LJJLIIIJJI = detailFragment.LLIZ.getEnterPlaylistGroupId();
                    }
                    return c1386470mBR;
                }
            };
        }
        if (TextUtils.equals(this.LLIZ.getFrom(), "from_friends_v3_feed") || (TextUtils.equals(this.LLIZ.getFrom(), "STORY_ENTRANCE_FRIENDS_TOP_LIST") && C319860CgK.LIZ())) {
            DefaultLifecycleObserver defaultLifecycleObserverOr = C1599640rjG.LIZIZ.Or();
            this.LLJJJJJIL = defaultLifecycleObserverOr;
            if (defaultLifecycleObserverOr != null) {
                getLifecycle().addObserver(this.LLJJJJJIL);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bl4, viewGroup, false);
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
