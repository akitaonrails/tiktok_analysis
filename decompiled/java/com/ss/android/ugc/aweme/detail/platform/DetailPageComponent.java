package com.ss.android.ugc.aweme.detail.platform;

import X.AbstractC1255880imo;
import X.AbstractC1387200mCc;
import X.AbstractC2361009My;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C07CX;
import X.C098200Yq;
import X.C0AAK;
import X.C0COM;
import X.C0N0Y;
import X.C0NBO;
import X.C0OAD;
import X.C0OQN;
import X.C0P0D;
import X.C0PMX;
import X.C0PN1;
import X.C0QSU;
import X.C0R6I;
import X.C0RD4;
import X.C0RDR;
import X.C0S4J;
import X.C0SHX;
import X.C0SR4;
import X.C0SUC;
import X.C0SZ8;
import X.C0T1R;
import X.C0T2Y;
import X.C0T45;
import X.C0VWN;
import X.C0XQ7;
import X.C0ZDN;
import X.C1012040cRW;
import X.C10IT;
import X.C1159340gH6;
import X.C1177190gjt;
import X.C1209140hZQ;
import X.C1209370hZn;
import X.C123100dR;
import X.C1235870iGX;
import X.C1254880ilC;
import X.C128Y;
import X.C12ES;
import X.C1336205Ku;
import X.C1357660lQy;
import X.C1359610lU7;
import X.C1360460lVU;
import X.C1372310lob;
import X.C1375880luM;
import X.C1388190mED;
import X.C1389300mG0;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1443290nf5;
import X.C1481000odu;
import X.C1483410ohn;
import X.C14EU;
import X.C1512820pTE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1565800qqg;
import X.C1567240qt0;
import X.C15WT;
import X.C1603430rpN;
import X.C1603500rpU;
import X.C1603960rqE;
import X.C1606370ru7;
import X.C1606430ruD;
import X.C1612650s4F;
import X.C1617560sCA;
import X.C1618440sDa;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1787206zG;
import X.C189200o6;
import X.C1906580ziK;
import X.C19252910Tv;
import X.C19651011uW;
import X.C19EG;
import X.C1AF0;
import X.C1ER1;
import X.C20673215v0;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2200821BBo;
import X.C2214201BlK;
import X.C2277711EDh;
import X.C23053091n;
import X.C2344009Gk;
import X.C276510Asb;
import X.C276520Asc;
import X.C286240BJu;
import X.C294120Bfu;
import X.C295470Bi5;
import X.C299030Bnp;
import X.C299520Boc;
import X.C303460Buy;
import X.C337180DJs;
import X.C419910GdJ;
import X.C443120HZe;
import X.C452501pT;
import X.C486860J7k;
import X.C582980Mtk;
import X.C584760Mwc;
import X.C584850Mwl;
import X.C603820NmG;
import X.C610350Nwn;
import X.C679360Qko;
import X.C680080Qly;
import X.C688120Qyw;
import X.C714060Rzg;
import X.C716550S8v;
import X.C729980SkG;
import X.C735370Ssx;
import X.C735840Sti;
import X.C738620SyC;
import X.C739400SzS;
import X.C739490Szb;
import X.C740740T3w;
import X.C741080T5e;
import X.C786410Ut5;
import X.C844470XAv;
import X.C888460YtI;
import X.C912110ZqL;
import X.C990890btP;
import X.DialogInterfaceOnCancelListenerC1401970maR;
import X.DialogInterfaceOnDismissListenerC738780SyS;
import X.EnumC1616310sA9;
import X.InterfaceC1058480deQ;
import X.InterfaceC1209130hZP;
import X.InterfaceC1209250hZb;
import X.InterfaceC1216440hlC;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1603190roz;
import X.InterfaceC1603360rpG;
import X.InterfaceC1603420rpM;
import X.InterfaceC1603450rpP;
import X.InterfaceC1609920rzq;
import X.InterfaceC1618460sDc;
import X.InterfaceC214902198i;
import X.InterfaceC665370Q7z;
import X.InterfaceC752360TfG;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS126S0100000_26;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.experiment.DetailPageRecreateExperimentSettingModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.ECMixFeedService;
import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.controller.I18nPlayerController;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.services.IBusinessComponentService;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService;
import com.ss.android.ugc.aweme.subscription.urllessaweme.service.PaidContentCommonServiceImpl;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.SplitContainerManager;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import com.ss.android.ugc.aweme.video.experiment.DetailPlayerReleaseLeakFixExp;
import com.ss.android.ugc.feed.platform.cell.im.safety.SafetyViewModel;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.detail.LegacyDetailAbilityDetail;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public class DetailPageComponent extends BasePanelUIComponent implements LegacyDetailAbilityDetail, IDetailPageAbility {
    public DetailPageFragment LLJIJIL;
    public C19EG LLJILJILJ;
    public View LLJJ;
    public ViewStub LLJJI;
    public View LLJJIII;
    public TuxTextView LLJJIJI;
    public View LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public View LLJJJ;
    public ViewStub LLJJJIL;
    public ViewStub LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public DetailFragmentPanel LLJL;
    public InterfaceC1209250hZb LLJLILLLLZIIL;
    public C1483410ohn LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public InterfaceC1603450rpP LLJZ;
    public C738620SyC LLJZIJLIL;
    public String LLL;
    public InterfaceC752360TfG LLLF;
    public Aweme LLLFFI;
    public InterfaceC1603360rpG LLLFZ;
    public ViewGroup LLLII;
    public IFeedCleanAbility LLLIIII;
    public String LLLIIIIL;
    public boolean LLLIIIL;
    public AnimatorSet LLLIILIL;
    public IRefreshAbility LLLILZJ;
    public LoadMorePanelComponentTempHelper LLLILZLLLI;
    public IPageStateAbility LLLIZZ;
    public boolean LLLJ;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 262));
    public final String LLJILLL = "action_remove_recommend_user_card";
    public C2189821An6 LLJJL = new C2189821An6();
    public boolean LLJLIL = true;
    public final C01GW LLLFF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(94));
    public final C0S4J LLLI = new C0S4J("DetailPageFragment");
    public final C0P0D LLLIIL = new C0OQN() { // from class: X.0P0D
        @Override // X.C0OQN, X.C0VWC
        public final void LJIIJ(String str) {
            InterfaceC1602960roc interfaceC1602960rocLIZIZ;
            DetailFragmentPanel detailFragmentPanel = this.LIZ.LLJL;
            if (detailFragmentPanel == null) {
                return;
            }
            VerticalViewPager verticalViewPager = detailFragmentPanel.LLJJIJI;
            C0SR4 c0sr4 = detailFragmentPanel.LLJL;
            if (verticalViewPager != null && c0sr4 != null && (interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(str)) != null) {
                int currentItem = verticalViewPager.getCurrentItem();
                Aweme item = c0sr4.getItem(currentItem);
                interfaceC1602960rocLIZIZ.LIZ("launch_vv", Integer.toString(currentItem));
                interfaceC1602960rocLIZIZ.LIZ("current_video", C584470Mw9.LIZIZ(item));
                if (this.LIZ.LLJJL.isStoryPage()) {
                    interfaceC1602960rocLIZIZ.LIZ("enter_from", this.LIZ.LLJJL.getEventType());
                    interfaceC1602960rocLIZIZ.LIZ("extra_desc", "story_vertical_viewpager");
                }
                String eventType = this.LIZ.LLJJL.getEventType();
                if (eventType == null) {
                    eventType = "";
                }
                if (C652090Phv.LJ(eventType, C0SUC.LIZ(this.LIZ.Vo()).getPlaylistPreviousPage()) || C652090Phv.LJFF(this.LIZ.LLJJL.getEnterFromSub(), eventType, C0SUC.LIZ(this.LIZ.Vo()).getPlaylistPreviousPage()) || Intrinsics.LJFF(eventType, "similar_videos_page") || Intrinsics.LJFF(eventType, "shared_feed")) {
                    interfaceC1602960rocLIZIZ.LIZ("enter_from", eventType);
                }
                ECMixFeedService eCMixFeedService = (ECMixFeedService) PluggableExtentionKt.pluggableSpi$default(ECMixFeedService.class, false, false, false, 14, null);
                if (eCMixFeedService != null && eCMixFeedService.LJ(this.LIZ.LLJJL)) {
                    for (Map.Entry<String, String> entry : eCMixFeedService.LIZ().entrySet()) {
                        interfaceC1602960rocLIZIZ.LIZ(entry.getKey(), entry.getValue());
                    }
                }
            }
        }

        @Override // X.C0OQN, X.C0VWC
        public final void onStop(String str) {
            InterfaceC1602960roc interfaceC1602960rocLIZIZ;
            DetailFragmentPanel detailFragmentPanel = this.LIZ.LLJL;
            if (detailFragmentPanel != null) {
                VerticalViewPager verticalViewPager = detailFragmentPanel.LLJJIJI;
                C0SR4 c0sr4 = detailFragmentPanel.LLJL;
                if (verticalViewPager != null && c0sr4 != null && (interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(str)) != null) {
                    interfaceC1602960rocLIZIZ.LIZ("next_video", C584470Mw9.LIZIZ(c0sr4.getItem(verticalViewPager.getCurrentItem())));
                }
            }
        }
    };
    public boolean LLLIL = true;
    public final int LLLILZ = 150;

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final DetailPageComponent Dn1() {
        return this;
    }

    @Override // X.InterfaceC1603280rp8
    public final void LJJIIJ() {
        lp(4);
    }

    @Override // X.InterfaceC606880NrC
    public final /* synthetic */ int Um(List list) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public Analysis getAnalysis() {
        return null;
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "detail_page";
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    private final String Zo() {
        return TextUtils.equals(this.LLJJL.getFrom(), "from_duet_mode") ? "duet" : TextUtils.equals(this.LLJJL.getFrom(), "from_duet_mode_detail") ? "original" : "";
    }

    @Override // X.InterfaceC988100bou
    public final boolean Ci() {
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        return detailFragmentPanel != null && detailFragmentPanel.LLJJ();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final long Dy() {
        I18nPlayerController i18nPlayerController;
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel == null || (i18nPlayerController = detailFragmentPanel.LLLLIILL) == null) {
            return -1L;
        }
        return i18nPlayerController.LJLJJI(C1012040cRW.LIZIZ().LIZIZ);
    }

    public final boolean Jo() {
        InterfaceC1603360rpG interfaceC1603360rpG;
        InterfaceC1603360rpG interfaceC1603360rpG2 = this.LLLFZ;
        if (interfaceC1603360rpG2 == null || interfaceC1603360rpG2.isLoading() || ((interfaceC1603360rpG = this.LLLFZ) != null && interfaceC1603360rpG.cannotLoadLatest())) {
            return false;
        }
        InterfaceC1603360rpG interfaceC1603360rpG3 = this.LLLFZ;
        if (!(interfaceC1603360rpG3 instanceof InterfaceC1216440hlC)) {
            return false;
        }
        if (interfaceC1603360rpG3 instanceof InterfaceC1603420rpM) {
            ((InterfaceC1603420rpM) interfaceC1603360rpG3).setPreLoad(true);
        } else {
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            if (detailFragmentPanel != null) {
                detailFragmentPanel.f338O = true;
            }
        }
        return lp(2);
    }

    public void LJIJ() {
        InterfaceC214902198i interfaceC214902198i;
        InterfaceC214902198i interfaceC214902198i2;
        EnterChatParams enterChatParams;
        Activity activityLIZ;
        InterfaceC1603190roz interfaceC1603190roz;
        C0R6I mediaSafetyModel;
        SafetyViewModel safetyViewModelLIZ;
        Aweme awemeLIZLLL;
        C0R6I mediaSafetyModel2;
        DetailFragmentPanel detailFragmentPanel;
        C0N0Y playerManager;
        Long lValueOf;
        String shareToStoryAidOfStory;
        String shareToStoryAidOfStory2;
        Aweme aweme = this.LLLFFI;
        if (aweme != null && this.LLJJL.isFromSharedStory() && (detailFragmentPanel = this.LLJL) != null && (playerManager = detailFragmentPanel.getPlayerManager()) != null && (lValueOf = Long.valueOf(playerManager.getCurrentPosition())) != null && lValueOf.longValue() > 0 && this.LLJJL.getPrevPanelId() > 0) {
            boolean zLIZIZ = C582980Mtk.LIZIZ(aweme);
            String str = "";
            if (!zLIZIZ) {
                InterfaceC1618460sDc interfaceC1618460sDcLJIJJLI = C1618440sDa.LIZIZ.LJIJJLI();
                long prevPanelId = this.LLJJL.getPrevPanelId();
                long jLongValue = lValueOf.longValue();
                DetailNavArgModel navArgModel = this.LLJJL.getNavArgModel();
                if (navArgModel != null && (shareToStoryAidOfStory2 = navArgModel.getShareToStoryAidOfStory()) != null) {
                    str = shareToStoryAidOfStory2;
                }
                interfaceC1618460sDcLJIJJLI.LJJI(prevPanelId, jLongValue, str);
            } else if (((long) this.LLJJL.getSeekProgress()) > 0) {
                InterfaceC1618460sDc interfaceC1618460sDcLJIJJLI2 = C1618440sDa.LIZIZ.LJIJJLI();
                long prevPanelId2 = this.LLJJL.getPrevPanelId();
                long seekProgress = (long) this.LLJJL.getSeekProgress();
                DetailNavArgModel navArgModel2 = this.LLJJL.getNavArgModel();
                if (navArgModel2 != null && (shareToStoryAidOfStory = navArgModel2.getShareToStoryAidOfStory()) != null) {
                    str = shareToStoryAidOfStory;
                }
                interfaceC1618460sDcLJIJJLI2.LJJI(prevPanelId2, seekProgress, str);
            }
        }
        Aweme awemeSo = So();
        String from = this.LLJJL.getFrom();
        if (awemeSo != null && from != null) {
            C1603500rpU c1603500rpU = C1603500rpU.LIZIZ;
            if (c1603500rpU.LLJILJIL().LIZ()) {
                c1603500rpU.LLJILJIL().LIZIZ(awemeSo, from);
            }
        }
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(getActivity())) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), "//duo");
            smartRouteBuildRoute.withParam("duo_type", "duo_back");
            smartRouteBuildRoute.open();
            return;
        }
        Aweme awemeLIZLLL2 = C729980SkG.LIZLLL(this.LLLFFI);
        if (awemeLIZLLL2 != null && (mediaSafetyModel = AwemeBizExtKt.getMediaSafetyModel(awemeLIZLLL2)) != null && mediaSafetyModel.isSafeMode() && (safetyViewModelLIZ = C912110ZqL.LIZ(getFragment())) != null && (awemeLIZLLL = C729980SkG.LIZLLL(this.LLLFFI)) != null && (mediaSafetyModel2 = AwemeBizExtKt.getMediaSafetyModel(awemeLIZLLL)) != null) {
            safetyViewModelLIZ.vQ2(mediaSafetyModel2);
        }
        if (this.LLJJL.getEnterChatParam() != null) {
            Serializable enterChatParam = this.LLJJL.getEnterChatParam();
            if ((enterChatParam instanceof EnterChatParams) && (enterChatParams = (EnterChatParams) enterChatParam) != null) {
                if (enterChatParams.isQuickChat()) {
                    AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                    int length = abstractC1387200mCcArrLJII.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        AbstractC1387200mCc abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
                        Object obj = abstractC1387200mCc.LIZ;
                        if (((!(obj instanceof InterfaceC1603190roz) || (interfaceC1603190roz = (InterfaceC1603190roz) obj) == null) ? null : interfaceC1603190roz.getCurFragment()) instanceof InterfaceC1593630rZZ) {
                            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                            if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                                IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                                enterChatParams.setContext(activityLIZ);
                                String conversationId = this.LLJJL.getConversationId();
                                if (conversationId != null) {
                                    enterChatParams.setEffectIds(C1336205Ku.LIZ(false).getCameraEffectService().LIZIZ(getFragment(), conversationId));
                                }
                                imChatService.LJIILLIIL(enterChatParams, null);
                            }
                        } else {
                            i++;
                        }
                    }
                } else {
                    IIMChatService imChatService2 = C1336205Ku.LIZ(false).getImChatService();
                    String conversationId2 = this.LLJJL.getConversationId();
                    if (conversationId2 != null) {
                        enterChatParams.setEffectIds(C1336205Ku.LIZ(false).getCameraEffectService().LIZIZ(getFragment(), conversationId2));
                    }
                    imChatService2.LJIILLIIL(enterChatParams, null);
                }
            }
        }
        Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(getFragment());
        if (fragmentLIZIZ instanceof DetailSafRootFragment) {
            DetailSafRootFragment detailSafRootFragment = (DetailSafRootFragment) fragmentLIZIZ;
            detailSafRootFragment.uS();
            detailSafRootFragment.finish();
            return;
        }
        C19EG activity = getActivity();
        if (activity != null && (activity instanceof DetailActivity)) {
            DetailActivity detailActivity = (DetailActivity) activity;
            if (detailActivity.LLLLZIL() != null) {
                detailActivity.LLLLZIL().uS();
            }
        }
        C128Y c128yLIZIZ = C1606370ru7.LIZIZ(getFragment());
        if ((c128yLIZIZ instanceof InterfaceC214902198i) && (interfaceC214902198i2 = (InterfaceC214902198i) c128yLIZIZ) != null) {
            interfaceC214902198i2.finish();
        } else if (getFragment().getActivity() instanceof InterfaceC1058480deQ) {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            if (this.LLJILJILJ instanceof InterfaceC1603190roz) {
                try {
                    C1AF0.LJ(new RuntimeException("Don't call MainActivity finish() in Detail_SAF_Scene: " + getClass().getName() + ", use fragment's method finish()"));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        } else {
            C128Y parentFragment = getFragment().getParentFragment();
            if ((parentFragment instanceof InterfaceC214902198i) && (interfaceC214902198i = (InterfaceC214902198i) parentFragment) != null) {
                interfaceC214902198i.finish();
            }
        }
        this.LLLI.LJIIIZ("[finishActivity]");
        C2189821An6 c2189821An6 = this.LLJJL;
        if (c2189821An6 == null || !c2189821An6.isFromAdsActivity() || activity == null) {
            return;
        }
        C786410Ut5.ae(R.anim.dd, activity, R.anim.dd);
    }

    public final Aweme So() {
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null) {
            return detailFragmentPanel.o();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final long VN1() {
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel == null) {
            return -1L;
        }
        Aweme awemeHm = detailFragmentPanel.hm();
        String aid = awemeHm != null ? awemeHm.getAid() : "";
        I18nPlayerController i18nPlayerController = detailFragmentPanel.LLLLIILL;
        if (i18nPlayerController != null) {
            return i18nPlayerController.LJLJJI(aid);
        }
        return -1L;
    }

    public final C1235870iGX ap() {
        IPageStateAbility iPageStateAbility = this.LLLIZZ;
        if (iPageStateAbility == null) {
            return null;
        }
        return iPageStateAbility.D31();
    }

    public void bp() {
        View view = this.LLJJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final void ep() {
        if (C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(getFragment())) {
            View view = this.LLJJIJIIJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
            }
            TuxIconView tuxIconView = this.LLJJIJIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 4);
                return;
            }
            return;
        }
        String eventType = this.LLJJL.getEventType();
        if (eventType == null || !(Intrinsics.LJFF(eventType, "story_archive") || Intrinsics.LJFF(eventType, "web"))) {
            View view2 = this.LLJJIJIIJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
            TuxIconView tuxIconView2 = this.LLJJIJIL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                return;
            }
            return;
        }
        View view3 = this.LLJJIJIIJIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        TuxIconView tuxIconView3 = this.LLJJIJIL;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 4);
        }
    }

    public final C19EG getActivity() {
        if (this.LLJILJILJ == null && C299520Boc.LIZ()) {
            this.LLJILJILJ = getPanelContext().LIZ();
        }
        return this.LLJILJILJ;
    }

    public final Fragment getFragment() {
        return (Fragment) this.LLJILJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final Aweme hm() {
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null) {
            return detailFragmentPanel.hm();
        }
        return null;
    }

    public void ip() {
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null) {
            C0SZ8 c0sz8LJLIL = detailFragmentPanel.LJLIL();
            if (c0sz8LJLIL instanceof C0RDR) {
                c0sz8LJLIL.LLJJIJIL();
            }
        }
    }

    public void kp() {
        IFeedCleanAbility iFeedCleanAbility = this.LLLIIII;
        if (iFeedCleanAbility != null) {
            iFeedCleanAbility.Cp0(this.LLJJ);
        }
        IFeedCleanAbility iFeedCleanAbility2 = this.LLLIIII;
        if (iFeedCleanAbility2 != null) {
            iFeedCleanAbility2.Cp0(this.LLLII);
        }
        IFeedCleanAbility iFeedCleanAbility3 = this.LLLIIII;
        if (iFeedCleanAbility3 != null) {
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            iFeedCleanAbility3.Cp0(detailFragmentPanel != null ? detailFragmentPanel.F : null);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final boolean ku1() {
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null) {
            return detailFragmentPanel.p;
        }
        return false;
    }

    public void op() {
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C679360Qko.LIZ(view.getAlpha(), 1.0f, view);
        }
        C1ER1.LIZIZ.LLJILJILJ(getFragment(), false);
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final void os0() {
        C1209140hZQ c1209140hZQ;
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel == null || detailFragmentPanel.v()) {
            DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
            if (detailFragmentPanel2 != null && detailFragmentPanel2.h() && (c1209140hZQ = detailFragmentPanel2.q0) != null && c1209140hZQ.LJ && !c1209140hZQ.LJI) {
                c1209140hZQ.LIZIZ();
                return;
            }
            InterfaceC1603360rpG interfaceC1603360rpG = this.LLLFZ;
            if (interfaceC1603360rpG instanceof InterfaceC1603420rpM) {
                ((InterfaceC1603420rpM) interfaceC1603360rpG).setPreLoad(true);
            } else {
                DetailFragmentPanel detailFragmentPanel3 = this.LLJL;
                if (detailFragmentPanel3 != null) {
                    detailFragmentPanel3.f338O = true;
                }
            }
            lp(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final int vj1() {
        C0SR4 c0sr4;
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        return (detailFragmentPanel == null || (c0sr4 = detailFragmentPanel.LLJL) == null || detailFragmentPanel.LLLLLLIL != c0sr4.getCount() - 1) ? 0 : 1;
    }

    public final boolean yp() {
        if (this.LLJJL.isStoryPage()) {
            return C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(getFragment()) || C294120Bfu.LIZ() <= 0;
        }
        return false;
    }

    public final void zp() {
        C1749280vcc c1749280vcc;
        ViewStub viewStub = this.LLJJJJ;
        if (viewStub != null && this.LLJJJJJIL != null) {
            viewStub.setLayoutResource(R.layout.blc);
            ViewStub viewStub2 = this.LLJJJJ;
            if (viewStub2 != null) {
                C786410Ut5.LJLLLL(viewStub2);
            }
            View view = this.LLJJJJJIL;
            if (view != null && (c1749280vcc = (C1749280vcc) view.findViewById(R.id.video_show_private_account_status_view)) != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                c1722300uv6.LJI = c1749280vcc.getContext().getString(2131845224);
                c1722300uv6.LJIIIIZZ = c1749280vcc.getContext().getString(2131845225);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_large_lock;
                c419910GdJ.LJ = Integer.valueOf(R.attr.eh);
                c1722300uv6.LIZ(c419910GdJ);
                c1749280vcc.setStatus(c1722300uv6);
            }
        }
        C19EG activity = getActivity();
        if (activity != null) {
            tp(activity).KQ2(false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IViewPagerComponentAbility Mb() {
        return C0T1R.LIZLLL(getFragment());
    }

    public final Context Vo() {
        return C299520Boc.LIZ() ? getContext() : getFragment().getContext();
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    public final void dp() {
        if (getActivity() == null || TextUtils.equals("from_publish_add_video", this.LLJJL.getFrom()) || TextUtils.equals("from_effect_discover_panel", this.LLJJL.getFrom()) || TextUtils.equals("from_effect_discover_tab", this.LLJJL.getFrom())) {
            return;
        }
        Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(getFragment());
        if (fragmentLIZIZ != null) {
            C740740T3w.LIZ(fragmentLIZIZ, getFragment(), new C0T2Y() { // from class: X.0rpK
                @Override // X.C0T2Y
                public final void Y3(Aweme aweme) {
                    this.LL.Lo(aweme);
                }
            });
        } else {
            C740740T3w.LIZIZ(mp(), getFragment(), new C0T2Y() { // from class: X.0rpL
                @Override // X.C0T2Y
                public final void Y3(Aweme aweme) {
                    this.LL.Lo(aweme);
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.LifecycleOwner
    public final LifecycleRegistry getLifecycle() {
        return C299520Boc.LIZ() ? super.getLifecycle() : (LifecycleRegistry) getFragment().getLifecycle();
    }

    public final void hp() {
        if (TextUtils.isEmpty(Zo())) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", this.LLJJL.getCreationId());
        c2344009Gk.LJIIIIZZ("duet_mode_type", Zo());
        Aweme aweme = this.LLLFFI;
        if (aweme != null) {
            c2344009Gk.LJFF("group_id", aweme.getGroupId());
        }
        C20684815ws.LJIILLIIL("duet_mode_shoot_button_show", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context contextVo = Vo();
        C19EG activity = getActivity();
        if (contextVo == null || activity == null) {
            return null;
        }
        return new C688120Qyw(contextVo, activity, null);
    }

    public final C19EG mp() {
        C19EG activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" not attached to an activity.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        if (C299520Boc.LIZ()) {
            up(true, false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        if (this.LLJJL.isfollowSkyLight()) {
            C0QSU.LIZ = new LinkedHashMap();
            C0QSU.LIZIZ = new LinkedHashMap();
        }
        C0VWN.LIZ(C1389300mG0.LJIJJLI(getPanelContext()) ? "detail_page_nearby_inner" : "detail_page", false).LJIIIIZZ();
        this.LLLI.LJIIIZ("[onDestroy]");
        if (C286240BJu.LIZ()) {
            C19EG c19eg = this.LLJILJILJ;
            C741080T5e.LIZ(c19eg != null ? c19eg.getClass().getName() : "");
        }
        if (C276520Asc.LIZ()) {
            InterfaceC1603360rpG interfaceC1603360rpG = this.LLLFZ;
            Object viewModel = interfaceC1603360rpG != null ? interfaceC1603360rpG.getViewModel() : null;
            final AbstractC1255880imo abstractC1255880imo = viewModel instanceof AbstractC1255880imo ? (AbstractC1255880imo) viewModel : null;
            Aweme aweme = this.LLLFFI;
            final String aid = aweme != null ? aweme.getAid() : null;
            if (abstractC1255880imo == null || aid == null) {
                return;
            }
            String eventType = this.LLJJL.getEventType();
            if (((Set) C1159340gH6.LIZJ.getValue()).contains(eventType != null ? eventType : "")) {
                C19EG c19eg2 = this.LLJILJILJ;
                if (!C276520Asc.LIZ() || c19eg2 == null) {
                    return;
                }
                final String strValueOf = String.valueOf(c19eg2.hashCode());
                C443120HZe c443120HZe = (C443120HZe) ((C603820NmG) C1177190gjt.LIZIZ.getValue()).LIZJ(strValueOf);
                if (c443120HZe != null) {
                    if (c443120HZe.getSecond() == null || c443120HZe.getThird() == null) {
                        if (!((DetailPageRecreateExperimentSettingModel) C1159340gH6.LIZIZ.getValue()).enableMemJudge) {
                            C1177190gjt.LIZ(strValueOf, aid, abstractC1255880imo);
                            return;
                        }
                        InterfaceC1609920rzq interfaceC1609920rzq = new InterfaceC1609920rzq() { // from class: X.0ru5
                            @Override // X.InterfaceC1609920rzq
                            public final void LIZ(C1512820pTE c1512820pTE) {
                                if (c1512820pTE.LIZ.getScore() > EnumC1006810cJ5.Critical.getScore()) {
                                    C1177190gjt.LIZ(strValueOf, aid, abstractC1255880imo);
                                }
                            }
                        };
                        C2200821BBo.LIZ.getClass();
                        if (C2200821BBo.LIZ()) {
                            interfaceC1609920rzq.LIZ(new C1512820pTE());
                        } else {
                            C0NBO.LIZLLL(new ARunnableS126S0100000_26(interfaceC1609920rzq, 128));
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public void onDestroyView() {
        DetailFragmentPanel detailFragmentPanel;
        C0N0Y playerManager;
        C19EG activity;
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
        C2189821An6 c2189821An6 = this.LLJJL;
        if (c2189821An6 != null && u.LJIJI("from_profile_self", c2189821An6.getFrom(), true) && u.LJIJI("output", this.LLJJL.getTabName(), true) && u.LJIJI("personal_homepage", this.LLJJL.getEventType(), true)) {
            C23053091n.LIZ.getClass();
            C23053091n.LIZIZ.postValue("self_detail_video_back");
        }
        DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
        if (detailFragmentPanel2 != null) {
            detailFragmentPanel2.onDestroyView();
        }
        InterfaceC1603360rpG interfaceC1603360rpG = this.LLLFZ;
        if (interfaceC1603360rpG != null) {
            interfaceC1603360rpG.unInit();
        }
        C01GW c01gw = DetailPlayerReleaseLeakFixExp.LIZIZ;
        if (((DetailPlayerReleaseLeakFixExp.Config) c01gw.getValue()).fixIndependentPlayerRelease) {
            C1481000odu.LIZIZ = false;
            C1483410ohn c1483410ohn = this.LLJLL;
            if (c1483410ohn != null) {
                c1483410ohn.release();
            }
            this.LLJLL = null;
        } else {
            C1481000odu.LIZIZ = false;
            if (C1481000odu.LIZ && (detailFragmentPanel = this.LLJL) != null && (playerManager = detailFragmentPanel.getPlayerManager()) != null) {
                playerManager.release();
            }
        }
        if (((DetailPlayerReleaseLeakFixExp.Config) c01gw.getValue()).fixSharePlayerLeak && (activity = getActivity()) != null) {
            FeedSharePlayerViewModel.Companion companion = FeedSharePlayerViewModel.Companion;
            C0N0Y playerManager2 = companion.getPlayerManager(activity);
            companion.getViewModel(activity).player = null;
            if (playerManager2 != null && activity.isFinishing() && !playerManager2.isPlaying() && playerManager2 != C1483410ohn.LJLJJI() && playerManager2 != C1012040cRW.LIZIZ().LIZ) {
                playerManager2.release();
            }
        }
        if (((Boolean) C0AAK.LIZ.getValue()).booleanValue()) {
            this.LLJLILLLLZIIL = null;
        }
        if (C299030Bnp.LIZ()) {
            String str = this.LLL;
            if (str != null) {
                ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZJ(str);
            }
            this.LLJZIJLIL = null;
            this.LLL = null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(getFragment(), null);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IFeedFragmentAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, LegacyDetailAbilityDetail.class, null, null);
    }

    @Override // X.AbstractC738140SxQ
    public void onPause() {
        super.onPause();
        this.LLJJL.getEventType();
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        C19EG c19eg = this.LLJILJILJ;
        if (c19eg != null) {
            Intent intent = c19eg.getIntent();
            if (intent != null && intent.getBooleanExtra("story_to_post_need_toast", false)) {
                intent.removeExtra("story_to_post_need_toast");
                C1389880mGw c1389880mGw = new C1389880mGw(c19eg);
                c1389880mGw.LJIIIZ(c19eg.getString(2131849356));
                c1389880mGw.LJIIJ();
            }
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            if (detailFragmentPanel == null || !detailFragmentPanel.getUserVisibleHint()) {
                return;
            }
            cp(true);
        }
    }

    @Override // X.InterfaceC740200T1u
    public final boolean q9() {
        InterfaceC1603360rpG interfaceC1603360rpG;
        boolean zLJI = MethodIDManager.LJI(71887);
        InterfaceC1603360rpG interfaceC1603360rpG2 = this.LLLFZ;
        if (interfaceC1603360rpG2 == null || interfaceC1603360rpG2.isLoading() || ((interfaceC1603360rpG = this.LLLFZ) != null && interfaceC1603360rpG.cannotLoadMore())) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        InterfaceC1603360rpG interfaceC1603360rpG3 = this.LLLFZ;
        if (interfaceC1603360rpG3 instanceof InterfaceC1603420rpM) {
            ((InterfaceC1603420rpM) interfaceC1603360rpG3).setPreLoad(true);
        } else {
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            if (detailFragmentPanel != null) {
                detailFragmentPanel.f338O = true;
            }
        }
        boolean zLp = lp(4);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLp;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IRefreshAbility E80() {
        return this.LLLILZJ;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final ILoadMoreAbility Ew0() {
        return this.LLLILZLLLI;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final DetailFragmentPanel JQ() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility
    public final IPageStateAbility sl0() {
        return this.LLLIZZ;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.LifecycleOwner
    public final /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return getLifecycle();
    }

    public final void Ap(Aweme aweme) {
        IDetailFeedAppDiffService.LIZ.getClass();
        IDetailFeedAppDiffService value = C1606430ruD.LIZIZ.getValue();
        this.LLJJL.getEventType();
        value.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public boolean Eb2(AwS568S0100000_24 awS568S0100000_24) {
        Aweme aweme;
        Context context;
        InterfaceC752360TfG interfaceC752360TfG = this.LLLF;
        if (interfaceC752360TfG == null || !interfaceC752360TfG.LJIILL()) {
            if (!this.LLLJ || !C295470Bi5.LIZIZ() || ((aweme = this.LLLFFI) != null && aweme.isAd())) {
                return ((Boolean) awS568S0100000_24.invoke()).booleanValue();
            }
            C1440005kM.LIZ(new C714060Rzg(false, EnumC1616310sA9.BACK_BUTTON.getType(), "back_button", this.LLJJL.getEventType()));
            if (C0COM.LIZJ() && (context = getContext()) != null) {
                new C0ZDN(context).LIZ(0);
                return true;
            }
        }
        return true;
    }

    @Override // X.InterfaceC740200T1u
    public final boolean Ed(String str) {
        return q9();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final boolean FK(int i) {
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel == null || detailFragmentPanel.LLJL.getCount() - 1 <= i) {
            return false;
        }
        return true;
    }

    public final void Go(Aweme aweme) {
        Aweme awemeK12;
        String aid;
        AnchorCustomData anchorCustomData;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb != null && (awemeK12 = iViewPagerComponentAbilityMb.k12(aweme)) != null && (aid = awemeK12.getAid()) != null && aweme != null && (anchorCustomData = AwemeBizExtKt.getAnchorCustomData(aweme)) != null) {
            anchorCustomData.setPreviousAid(aid);
        }
    }

    public void Ho(View view) {
        View view2;
        this.LLJJ = view.findViewById(R.id.ija);
        if (((Number) C07CX.LIZ.getValue()).intValue() >= 3) {
            C07CX.LIZ(this.LLJJ);
        }
        this.LLJJI = (ViewStub) view.findViewById(R.id.ij_);
        View viewFindViewById = view.findViewById(R.id.bn2);
        this.LLJJIJIIJIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 9), viewFindViewById);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e2g);
        this.LLJJIJIL = tuxIconView;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS158S0100000_24(this, 10));
        }
        this.LLJJJIL = (ViewStub) view.findViewById(R.id.t8q);
        this.LLJJJJ = (ViewStub) view.findViewById(R.id.wc_);
        this.LLJJJJJIL = view.findViewById(R.id.trr);
        this.LLJJJJLIIL = view.findViewById(R.id.ltz);
        if (this.LLJJL.isFromEffectDiscover() && (view2 = this.LLJJJJLIIL) != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        this.LLLII = (ViewGroup) view.findViewById(R.id.cb7);
    }

    @Override // X.InterfaceC606880NrC
    public final boolean LLZLLIL(Aweme aweme) {
        return deleteItem(aweme.getAid());
    }

    public final void Lo(Aweme aweme) {
        boolean z;
        DetailNavArgModel navArgModel;
        String flowChangeToastText;
        Fragment fragment;
        String dynamicDetailTitleText;
        String str;
        View viewLJLLLL;
        TuxTextView tuxTextView;
        ViewStub viewStub;
        ArrayMap arrayMap = new ArrayMap(4);
        if (C1375880luM.LIZIZ(C729980SkG.LIZLLL(aweme))) {
            View view = this.LLJJJJLIIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        arrayMap.put("enter_from", this.LLJJL.getEventType());
        if (!TextUtils.isEmpty(this.LLJJL.getTrendingEventId()) || Intrinsics.LJFF(this.LLJJL.getEventType(), "trending_inflow_page")) {
            arrayMap.put("isTrending", "ture");
        }
        String tabName = this.LLJJL.getTabName();
        if (!TextUtils.isEmpty(tabName)) {
            arrayMap.put("tab_name", tabName);
        }
        if (this.LLJJL.isPlaylistCleanMode() && ((Intrinsics.LJFF(this.LLJJL.getEventType(), "personal_homepage") || Intrinsics.LJFF(this.LLJJL.getEventType(), "collection_video")) && Intrinsics.LJFF(tabName, "collection"))) {
            arrayMap.put("visibility_flags", "hide");
        }
        arrayMap.put("search_session_id", String.valueOf(this.LLJJL.getSessionId()));
        String enterFromSub = this.LLJJL.getEnterFromSub();
        String str2 = "";
        if (enterFromSub == null) {
            enterFromSub = "";
        }
        if (!TextUtils.isEmpty(enterFromSub)) {
            arrayMap.put("enter_from_sub", enterFromSub);
        }
        String preClickImprId = this.LLJJL.getPreClickImprId();
        if (preClickImprId == null) {
            preClickImprId = "";
        }
        if (!TextUtils.isEmpty(preClickImprId)) {
            arrayMap.put("preClickImprId", preClickImprId);
        }
        if (getFragment() != null && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            String str3 = null;
            if (this.LLJJ != null) {
                CommentService commentService = (CommentService) ServiceManager.get().getService(CommentService.class);
                View view2 = this.LLJJ;
                if (view2 != null) {
                    viewStub = (ViewStub) view2.findViewById(R.id.vsb_expose_comment);
                } else {
                    viewStub = null;
                }
                commentService.LJZI(viewStub, this.LLJJL, aweme);
            }
            String searchEntrance = this.LLJJL.getSearchEntrance();
            if (C123100dR.LIZ(searchEntrance) && searchEntrance != null) {
                arrayMap.put("search_entrance", searchEntrance);
            }
            String from = this.LLJJL.getFrom();
            if (C123100dR.LIZ(from) && from != null) {
                arrayMap.put("video_from", from);
            }
            String pageName = this.LLJJL.getPageName();
            if (C123100dR.LIZ(pageName) && pageName != null) {
                arrayMap.put("page_name", pageName);
            }
            String rootEnterFromType = this.LLJJL.getRootEnterFromType();
            if (C123100dR.LIZ(rootEnterFromType) && rootEnterFromType != null) {
                arrayMap.put("root_enter_from_type", rootEnterFromType);
            }
            String ecSearchTrafficSourceList = this.LLJJL.getEcSearchTrafficSourceList();
            if (C123100dR.LIZ(ecSearchTrafficSourceList) && ecSearchTrafficSourceList != null) {
                arrayMap.put("ec_search_traffic_source_list", ecSearchTrafficSourceList);
            }
            if (Intrinsics.LJFF(this.LLJJL.getEventType(), "school_community_page")) {
                String aid = C0SUC.LIZ(Vo()).getAid();
                if (aid != null) {
                    str2 = aid;
                }
                arrayMap.put("school_innerfeed_entrance_group_id", str2);
            }
            if (TextUtils.isEmpty(this.LLJJL.getDetailTitleText())) {
                DetailNavArgModel navArgModel2 = this.LLJJL.getNavArgModel();
                if (navArgModel2 != null) {
                    dynamicDetailTitleText = navArgModel2.getDynamicDetailTitleText();
                } else {
                    dynamicDetailTitleText = null;
                }
                if (!TextUtils.isEmpty(dynamicDetailTitleText)) {
                    HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
                    if (searchExtraParams != null) {
                        str = searchExtraParams.get("token_type");
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "pgc_todays_news")) {
                        if (this.LLJJIII == null) {
                            ViewStub viewStub2 = this.LLJJI;
                            if (viewStub2 != null) {
                                viewLJLLLL = C786410Ut5.LJLLLL(viewStub2);
                            } else {
                                viewLJLLLL = null;
                            }
                            this.LLJJIII = viewLJLLLL;
                            if (viewLJLLLL != null) {
                                tuxTextView = (TuxTextView) viewLJLLLL.findViewById(R.id.ij9);
                            } else {
                                tuxTextView = null;
                            }
                            this.LLJJIJI = tuxTextView;
                        }
                        TuxTextView tuxTextView2 = this.LLJJIJI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(dynamicDetailTitleText);
                        }
                        View view3 = this.LLJJIII;
                        if (view3 != null) {
                            C337180DJs.LIZJ(view3);
                        }
                    } else {
                        View view4 = this.LLJJIII;
                        if (view4 != null) {
                            C337180DJs.LIZ(view4);
                        }
                    }
                }
            }
            if (!this.LLLIIIL && Intrinsics.LJFF(this.LLJJL.getEventType(), "general_search")) {
                HashMap<String, String> searchExtraParams2 = AwemeBizExtKt.getSearchExtraParams(aweme);
                if (searchExtraParams2 != null) {
                    str3 = searchExtraParams2.get("token_type");
                }
                String str4 = this.LLLIIIIL;
                if (str4 != null && !Intrinsics.LJFF(str3, str4)) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLLIIIIL = str3;
                if (z && (navArgModel = this.LLJJL.getNavArgModel()) != null && (flowChangeToastText = navArgModel.getFlowChangeToastText()) != null && flowChangeToastText.length() != 0 && (fragment = getFragment()) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                    c1389890mGx.LJIIL(56);
                    c1389890mGx.LJIIJ(flowChangeToastText);
                    c1389890mGx.LJIIJJI();
                    this.LLLIIIL = true;
                }
            }
            No(getFragment(), aweme, arrayMap, C0SUC.LIZ(Vo()));
        }
    }

    public InterfaceC1603360rpG Oo(AbstractC1255880imo<?, ?> abstractC1255880imo) {
        C2189821An6 c2189821An6 = this.LLJJL;
        JediViewModel jediViewModel = C1603960rqE.LIZIZ;
        C1603960rqE.LIZIZ = null;
        return C1617560sCA.LIZ(c2189821An6, abstractC1255880imo, jediViewModel, getFragment());
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final boolean Qw0(String str) {
        return deleteItem(str);
    }

    @Override // X.C0T0L
    public final void Tv(C0PN1<Aweme> c0pn1) {
        DetailFragmentPanel detailFragmentPanel;
        C0SR4 c0sr4;
        List<Aweme> listFg;
        if ((this.LLLFZ instanceof C0PMX) && (detailFragmentPanel = this.LLJL) != null && (c0sr4 = detailFragmentPanel.LLJL) != null && (listFg = c0sr4.Fg()) != null) {
            ((C0PMX) this.LLLFZ).LIZJ(c0pn1, listFg);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.09My] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0SyC] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.screenshot.IScreenshotService] */
    public final void cp(boolean z) {
        final String str;
        final String eventType = this.LLJJL.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        if (!Intrinsics.LJFF(eventType, "chat") && !Intrinsics.LJFF(eventType, "group_chat")) {
            str = eventType;
        } else {
            str = "video_detail_page";
        }
        if (z && !Intrinsics.LJFF(str, "homepage_nearby")) {
            ?? r2 = (IScreenshotService) ServiceManager.get().getService(IScreenshotService.class);
            C738620SyC c738620SyC = this.LLJZIJLIL;
            ?? r1 = c738620SyC;
            if (c738620SyC == null) {
                ?? r12 = new AbstractC2361009My() { // from class: X.0SyC
                    @Override // X.AbstractC2361009My
                    public final Map<String, String> mobExtraParams() {
                        String aid;
                        Map<String, String> mapLJ;
                        LogPbBean logPbBean;
                        String imprId;
                        Pair[] pairArr = new Pair[4];
                        pairArr[0] = new Pair("enter_from", str);
                        Aweme awemeSo = this.So();
                        String str2 = "";
                        if (awemeSo == null || (aid = awemeSo.getAid()) == null) {
                            aid = "";
                        }
                        pairArr[1] = new Pair("group_id", aid);
                        Aweme awemeSo2 = this.So();
                        if (awemeSo2 != null && (logPbBean = awemeSo2.getLogPbBean()) != null && (imprId = logPbBean.getImprId()) != null) {
                            str2 = imprId;
                        }
                        pairArr[2] = new Pair("request_id", str2);
                        Aweme awemeSo3 = this.So();
                        pairArr[3] = new Pair("aweme_type", String.valueOf(awemeSo3 != null ? Integer.valueOf(awemeSo3.getAwemeType()) : null));
                        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                        String str3 = eventType;
                        DetailPageComponent detailPageComponent = this;
                        if (Intrinsics.LJFF(str3, "group_chat") || Intrinsics.LJFF(str3, "chat")) {
                            mapLJIIJ.put("enter_dm", "video_detail_page");
                        }
                        DetailFragmentPanel detailFragmentPanel = detailPageComponent.LLJL;
                        if (detailFragmentPanel == null || (mapLJ = detailFragmentPanel.Y()) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        mapLJIIJ.putAll(mapLJ);
                        mapLJIIJ.putAll(C1ER1.LIZIZ.LLZ());
                        return mapLJIIJ;
                    }

                    @Override // X.AbstractC2361009My
                    public final boolean onShot(String str2) {
                        return false;
                    }
                };
                this.LLJZIJLIL = r12;
                r1 = r12;
            }
            if (Intrinsics.LJFF(eventType, "chat") || Intrinsics.LJFF(eventType, "group_chat") || C1389300mG0.LJFF(getPanelContext())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(eventType);
                sbLIZ.append("_feed");
                eventType = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LLL = eventType;
            r2.LJI(eventType, r1);
            return;
        }
        IScreenshotService iScreenshotService = (IScreenshotService) ServiceManager.get().getService(IScreenshotService.class);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_feed");
        iScreenshotService.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC606880NrC
    public final boolean deleteItem(String str) {
        InterfaceC1603360rpG interfaceC1603360rpG = this.LLLFZ;
        boolean z = false;
        if (interfaceC1603360rpG != null && str != null && Intrinsics.LJFF(Boolean.valueOf(interfaceC1603360rpG.deleteItem(str)), Boolean.TRUE)) {
            z = true;
        }
        C0S4J c0s4j = this.LLLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[deleteItem] ");
        sbLIZ.append(str);
        sbLIZ.append(',');
        sbLIZ.append(z);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public final boolean lp(int i) {
        Aweme awemeLLILZ;
        InterfaceC1603360rpG interfaceC1603360rpG = this.LLLFZ;
        if (interfaceC1603360rpG != null && !interfaceC1603360rpG.isLoading()) {
            C0S4J c0s4j = this.LLLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[request] ");
            sbLIZ.append(i);
            c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLJJL.isFromChatRoomPlaying()) {
                this.LLJJL.setIsFromChatRoomPlaying(false);
                DetailFragmentPanel detailFragmentPanel = this.LLJL;
                if (detailFragmentPanel != null) {
                    detailFragmentPanel.postDelayed(new ARunnableS119S0100000_19(this, 55), 200L);
                }
            }
            if (TextUtils.equals("from_local", this.LLJJL.getQueryAwemeMode()) && (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(this.LLJJL.getAid())) != null && this.LLJL != null) {
                DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
                if (detailFragmentPanel2 != null) {
                    detailFragmentPanel2.G90(new Pair<>(0, awemeLLILZ));
                }
                return true;
            }
            if (this.LLJJL.isShouldQueryMyStoryFromCache()) {
                Aweme awemeLJIIIIZZ = C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIIZZ();
                if (this.LLJL != null) {
                    DetailFragmentPanel detailFragmentPanel3 = this.LLJL;
                    if (detailFragmentPanel3 != null) {
                        detailFragmentPanel3.G90(new Pair<>(0, awemeLJIIIIZZ));
                    }
                    return true;
                }
            }
            try {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("detail_request_type", String.valueOf(i));
                c2344009Gk.LJIIIIZZ("enter_from", this.LLJJL.getEventType());
                C20684815ws.LJIILLIIL("detail_request", c2344009Gk.LIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "detail_request_counter_exception");
            }
            InterfaceC1603360rpG interfaceC1603360rpG2 = this.LLLFZ;
            if (interfaceC1603360rpG2 != null) {
                C2189821An6 c2189821An6 = this.LLJJL;
                interfaceC1603360rpG2.request(i, c2189821An6, c2189821An6.getVideoType(), this.LLJJLIIIJLLLLLLLZ);
            }
            return true;
        }
        this.LLLI.LJIILL("[request] operator is null");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public void onAttach(Activity activity) {
        C19EG c19eg;
        if (activity instanceof C19EG) {
            c19eg = (C19EG) activity;
        } else {
            c19eg = null;
        }
        this.LLJILJILJ = c19eg;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(getFragment(), null);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IFeedFragmentAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, LegacyDetailAbilityDetail.class, null, null);
    }

    @C14EU
    public void onBlockUserEvent(C888460YtI c888460YtI) {
        String uid;
        C2189821An6 c2189821An6 = this.LLJJL;
        if (c2189821An6 != null && TextUtils.equals(c2189821An6.getEventType(), "personal_homepage") && c888460YtI != null && c888460YtI.LIZ != null && So() != null) {
            User user = c888460YtI.LIZ;
            String authorUid = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            Aweme awemeSo = So();
            if (awemeSo != null) {
                authorUid = AwemeExtKt.getAuthorUid(awemeSo);
            }
            if (!TextUtils.equals(uid, authorUid)) {
                return;
            }
        }
        C2189821An6 c2189821An62 = this.LLJJL;
        if (c2189821An62 != null && TextUtils.equals(c2189821An62.getEventType(), "general_search")) {
            return;
        }
        C2189821An6 c2189821An63 = this.LLJJL;
        if (c2189821An63 != null && TextUtils.equals(c2189821An63.getEventType(), "collection_comment")) {
            return;
        }
        lp(1);
    }

    @C14EU
    public void onCancelVideoCoverMaskEvent(C716550S8v c716550S8v) {
        if (yp()) {
            ep();
        } else {
            Lo(this.LLLFFI);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        int i;
        C0SR4 c0sr4;
        List<Aweme> listFg;
        String aid;
        C0RD4 c0rd42 = c0rd4;
        String str = c0rd42.LIZ;
        Object objValueOf = null;
        if (Intrinsics.LJFF(str, "onBack")) {
            Object obj = c0rd42.LIZIZ;
            if (obj == null) {
                obj = null;
            }
            Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(getFragment());
            if (fragmentLIZIZ != null) {
                objValueOf = Integer.valueOf(fragmentLIZIZ.hashCode());
            }
            if (obj != null && !Intrinsics.LJFF(obj, objValueOf)) {
                return;
            }
            LJIJ();
            return;
        }
        if (Intrinsics.LJFF(str, this.LLJILLL)) {
            Object obj2 = c0rd42.LIZIZ;
            if (obj2 == null) {
                return;
            }
            String str2 = (String) obj2;
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            if (detailFragmentPanel != null && (c0sr4 = detailFragmentPanel.LLJL) != null && (listFg = c0sr4.Fg()) != null && listFg.size() > 0) {
                int size = listFg.size();
                i = 0;
                while (i < size) {
                    if (ListProtector.get(listFg, i) != null) {
                        Aweme aweme = (Aweme) ListProtector.get(listFg, i);
                        if (aweme != null) {
                            aid = aweme.getAid();
                        } else {
                            aid = null;
                        }
                        if (TextUtils.equals(aid, str2)) {
                            break;
                        }
                    }
                    i++;
                }
                i = -1;
            } else {
                i = -1;
            }
            DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
            if (detailFragmentPanel2 == null) {
                return;
            }
            detailFragmentPanel2.Y1(i);
            return;
        }
        if (Intrinsics.LJFF(str, "feed_transition_state")) {
            Object obj3 = c0rd42.LIZIZ;
            if (obj3 != null) {
                objValueOf = obj3;
            }
            boolean zBooleanValue = ((Boolean) objValueOf).booleanValue();
            DetailFragmentPanel detailFragmentPanel3 = this.LLJL;
            if (detailFragmentPanel3 == null) {
                return;
            }
            C0SZ8 c0sz8LJLIL = detailFragmentPanel3.LJLIL();
            if (!(c0sz8LJLIL instanceof C0RDR)) {
                return;
            }
            c0sz8LJLIL.B0(zBooleanValue);
            return;
        }
        if (!Intrinsics.LJFF(str, "feed_enter_transition_end")) {
            return;
        }
        ip();
    }

    @C14EU
    public void onDislikeAwemeEvent(C1372310lob c1372310lob) {
        boolean z;
        String uid;
        Boolean boolValueOf;
        String str;
        Integer numValueOf;
        Aweme awemeLLLLLJLJLL;
        String eventType;
        String aid;
        String eventType2;
        List<PhotoModeImageUrlModel> imageList;
        C19EG activity = getActivity();
        if (activity != null && c1372310lob.LJ == activity.hashCode() && !C0OAD.LIZIZ(this.LLLFFI) && c1372310lob.LIZIZ == 2) {
            boolean z2 = c1372310lob.LIZ;
            tp(activity).KQ2(!z2);
            String eventType3 = null;
            C0SHX.LIZ(activity, null).LJIIJJI("long_press_layer", c1372310lob.LIZ, null);
            if (!z2) {
                if (So() != null) {
                    op();
                    ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJIIJ(this.LLLFFI);
                    return;
                }
                return;
            }
            if (((Boolean) C276510Asb.LIZ.getValue()).booleanValue() && C610350Nwn.LIZ(this.LLLFFI, this.LLJJL.getEventType())) {
                z = true;
            } else {
                z = false;
            }
            View view = this.LLJJIJIIJIL;
            if (view != null) {
                if (!z) {
                    C679360Qko.LIZ(view.getAlpha(), 0.0f, view);
                    C1ER1.LIZIZ.LLJILJILJ(getFragment(), true);
                }
            } else if (!z) {
                C1ER1.LIZIZ.LLJILJILJ(getFragment(), true);
            }
            int i = c1372310lob.LJFF;
            if (i == 0 || i == 4) {
                Aweme aweme = this.LLLFFI;
                if (aweme == null) {
                    this.LLLI.LJIILL("[enterDislikeMode] aweme is null");
                    return;
                }
                C844470XAv.LIZ.getClass();
                int iLJIIJ = C12ES.LJIIJ(C844470XAv.LIZ());
                int iLJIIIIZZ = C12ES.LJIIIIZZ(C844470XAv.LIZ());
                float f = 100;
                int i2 = (int) ((c1372310lob.LIZJ * f) / iLJIIJ);
                int i3 = (int) ((c1372310lob.LIZLLL * f) / iLJIIIIZZ);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                String eventType4 = "";
                if (aweme.getAuthor() == null) {
                    uid = "";
                } else {
                    uid = aweme.getAuthor().getUid();
                }
                c2344009Gk.LJIIIIZZ("author_id", uid);
                c2344009Gk.LJIIIIZZ("content_type", C735370Ssx.LJFF(aweme));
                c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme)));
                DetailFragmentPanel detailFragmentPanel = this.LLJL;
                if (detailFragmentPanel != null) {
                    eventType4 = detailFragmentPanel.getEventType();
                }
                c2344009Gk.LJIIIIZZ("enter_from", eventType4);
                c2344009Gk.LJIIIIZZ("enter_method", "detail");
                c2344009Gk.LIZJ(i2, "x");
                c2344009Gk.LIZJ(i3, "y");
                c2344009Gk.LJIIIIZZ("from_group_id", C584760Mwc.LIZ(C0SUC.LIZ(Vo()).getPreviousPage(), C0SUC.LIZ(Vo()).getFromGroupId()));
                Aweme aweme2 = this.LLLFFI;
                if (aweme2 != null) {
                    boolValueOf = Boolean.valueOf(aweme2.isSubOnlyVideo());
                } else {
                    boolValueOf = null;
                }
                c2344009Gk.LJ(boolValueOf, "is_sub_only_video");
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("login_type", str);
                c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    numValueOf = Integer.valueOf(imageList.size());
                } else {
                    numValueOf = null;
                }
                c2344009Gk.LJ(numValueOf, "pic_cnt");
                c2344009Gk.LJFF("request_id", C735370Ssx.LJIJJ(aweme));
                C735840Sti c735840Sti = C735840Sti.LIZ;
                DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
                if (detailFragmentPanel2 != null) {
                    awemeLLLLLJLJLL = detailFragmentPanel2.LLLLLJLJLL();
                } else {
                    awemeLLLLLJLJLL = null;
                }
                String eventType5 = this.LLJJL.getEventType();
                String from = this.LLJJL.getFrom();
                Activity activityLJFF = C2214201BlK.LJFF();
                c735840Sti.getClass();
                C735840Sti.LIZJ(c2344009Gk, awemeLLLLLJLJLL, eventType5, from, activityLJFF, null);
                if (So() != null) {
                    C19651011uW c19651011uW = C19651011uW.LIZIZ;
                    Aweme awemeSo = So();
                    DetailFragmentPanel detailFragmentPanel3 = this.LLJL;
                    if (detailFragmentPanel3 != null) {
                        detailFragmentPanel3.getEventType();
                    }
                    C1359610lU7.LJ(c2344009Gk, awemeSo, null);
                    C735840Sti.LIZIZ(So(), c19651011uW.LJIIIZ(So(), c2344009Gk));
                    c2344009Gk.LJFF("search_id", this.LLJJL.getSearchId());
                    C1ER1 c1er1 = C1ER1.LIZIZ;
                    Aweme awemeSo2 = So();
                    DetailFragmentPanel detailFragmentPanel4 = this.LLJL;
                    if (detailFragmentPanel4 != null) {
                        eventType2 = detailFragmentPanel4.getEventType();
                    } else {
                        eventType2 = null;
                    }
                    c1er1.LLLF(awemeSo2, eventType2, c2344009Gk);
                }
                C1612650s4F.LIZIZ(c2344009Gk, So());
                C2277711EDh c2277711EDh = C2277711EDh.LIZIZ;
                c2277711EDh.LJJIIJ(c2344009Gk);
                c2277711EDh.LJJIZ(c2344009Gk, C0SUC.LIZ(Vo()));
                C15WT c15wt = C15WT.LIZIZ;
                DetailFragmentPanel detailFragmentPanel5 = this.LLJL;
                if (detailFragmentPanel5 != null) {
                    eventType = detailFragmentPanel5.getEventType();
                } else {
                    eventType = null;
                }
                String aid2 = C0SUC.LIZ(Vo()).getAid();
                Aweme awemeSo3 = So();
                if (awemeSo3 != null) {
                    aid = awemeSo3.getAid();
                } else {
                    aid = null;
                }
                c15wt.LJFF(c2344009Gk, eventType, aid2, aid);
                C1357660lQy.LJI(c2344009Gk, aweme);
                C1357660lQy.LJIIIIZZ(c2344009Gk, aweme);
                C1357660lQy.LIZLLL(c2344009Gk, aweme);
                TakoAIVideoMobFiller.INSTANCE.appendFeedParams(c2344009Gk, C0SUC.LIZ(Vo()));
                C20684815ws.LJIILLIIL("click_trans_layer", c2344009Gk.LIZ);
                C1360460lVU.LIZIZ.LJJII().LJIILJJIL(aweme.getAid());
                if (So() != null) {
                    DetailFragmentPanel detailFragmentPanel6 = this.LLJL;
                    if (detailFragmentPanel6 != null) {
                        detailFragmentPanel6.LLLILZLLLI(new C739400SzS(i2, i3));
                    }
                    ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJJIII(aweme);
                } else {
                    Context contextVo = Vo();
                    if (contextVo != null) {
                        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IBusinessComponentService.class, false, false, false, 14, null);
                        if (objPluggableSpi$default != null) {
                            IBusinessComponentService iBusinessComponentService = (IBusinessComponentService) objPluggableSpi$default;
                            Fragment fragment = getFragment();
                            Aweme awemeSo4 = So();
                            DetailFragmentPanel detailFragmentPanel7 = this.LLJL;
                            if (detailFragmentPanel7 != null) {
                                eventType3 = detailFragmentPanel7.getEventType();
                            }
                            Dialog dialogNewOptionsDialog = iBusinessComponentService.newOptionsDialog(fragment, contextVo, awemeSo4, eventType3);
                            if (c1372310lob.LJFF == 4) {
                                Window window = dialogNewOptionsDialog.getWindow();
                                if (window != null) {
                                    window.clearFlags(2);
                                }
                                dialogNewOptionsDialog.setOnCancelListener(new DialogInterfaceOnCancelListenerC1401970maR(c1372310lob, 1));
                            }
                            dialogNewOptionsDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC738780SyS(this, aweme, 0));
                            ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJJIII(aweme);
                            C786410Ut5.B4(dialogNewOptionsDialog);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
                this.LLLI.LJIIIZ("[enterDislikeMode]");
            }
        }
    }

    @C14EU
    public void onDismissTitleTabEvent(C990890btP c990890btP) {
        View view;
        boolean z;
        ObjectAnimator objectAnimatorOfFloat;
        AnimatorSet animatorSet;
        if (this.LLLIL != c990890btP.LIZ && (view = this.LLJJ) != null) {
            AnimatorSet animatorSet2 = this.LLLIILIL;
            boolean z2 = true;
            if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LLLIILIL) != null) {
                animatorSet.cancel();
            }
            this.LLLIL = c990890btP.LIZ;
            this.LLLIILIL = new AnimatorSet();
            if (!c990890btP.LIZ) {
                if (view.getAlpha() == 0.0f || c990890btP.LIZIZ == 0) {
                    C786410Ut5.T4(view, 0.0f);
                    if (Boolean.valueOf(c990890btP.LIZJ).booleanValue()) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    z2 = false;
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            } else {
                if (view.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C786410Ut5.LJLLLLLL(0, view);
                if (z && view.getAlpha() == 1.0f) {
                    z2 = false;
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            }
            if (!z2) {
                return;
            }
            AnimatorSet animatorSet3 = this.LLLIILIL;
            if (animatorSet3 != null) {
                long j = c990890btP.LIZIZ;
                if (j == 0) {
                    j = this.LLLILZ;
                }
                animatorSet3.setDuration(j);
            }
            AnimatorSet animatorSet4 = this.LLLIILIL;
            if (animatorSet4 != null) {
                animatorSet4.play(objectAnimatorOfFloat);
            }
            AnimatorSet animatorSet5 = this.LLLIILIL;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public boolean onDispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 62 || this.LLJL == null) {
            return false;
        }
        if (C1483410ohn.LJLJJI().isPlaying()) {
            C1483410ohn.LJLJJI().LIZ();
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            if (detailFragmentPanel != null) {
                detailFragmentPanel.showIvPlay();
            }
        } else {
            C1483410ohn.LJLJJI().LJIILLIIL();
            DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
            if (detailFragmentPanel2 != null) {
                detailFragmentPanel2.LLIL(true);
                return true;
            }
        }
        return true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedClearModeEvent(C714060Rzg c714060Rzg) {
        String str;
        if (c714060Rzg != null) {
            str = c714060Rzg.LIZLLL;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, this.LLJJL.getEventType())) {
            boolean z = false;
            if (c714060Rzg != null && c714060Rzg.LIZ) {
                z = true;
            }
            this.LLLJ = z;
        }
    }

    @C14EU
    public void onFeedFetchEvent(C1209370hZn c1209370hZn) {
        c1209370hZn.getClass();
        if (TextUtils.equals("from_full_recommend", "from_cell_recommend")) {
            lp(4);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMediaPublish(IMMediaPublishEvent.DMRecordMediaPublishEvent dMRecordMediaPublishEvent) {
        String imMsgId;
        ViewGroup viewGroup;
        if (Intrinsics.LJFF(dMRecordMediaPublishEvent.getPhotoSwapScene(), "photo_swap_pong") && dMRecordMediaPublishEvent.getPhotoSwapPairedMsgId() != null) {
            String photoSwapPairedMsgId = dMRecordMediaPublishEvent.getPhotoSwapPairedMsgId();
            Aweme awemeLIZLLL = C729980SkG.LIZLLL(So());
            if (awemeLIZLLL != null) {
                imMsgId = AwemeBizExtKt.getImMsgId(awemeLIZLLL);
            } else {
                imMsgId = null;
            }
            if (Intrinsics.LJFF(photoSwapPairedMsgId, imMsgId) && (viewGroup = this.LLLII) != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
        }
    }

    @C14EU
    public void onMobEnterFromEvent(C1567240qt0 c1567240qt0) {
        C19EG activity = getActivity();
        if (c1567240qt0 != null && this.LLJLILLLLZIIL != null && activity != null) {
            C680080Qly.LIZIZ(activity).setEventType(c1567240qt0.LIZ);
        }
    }

    @C14EU
    public void onMobRequestIdEvent(C739490Szb c739490Szb) {
        C19EG activity = getActivity();
        if (c739490Szb != null && this.LLJLILLLLZIIL != null && activity != null) {
            C680080Qly.LIZIZ(activity).LLJ = c739490Szb.LIZ;
        }
    }

    @C14EU
    public void onRefreshDetailEvent(C1603430rpN c1603430rpN) {
        lp(1);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void setUserVisibleHint(boolean z) {
        up(z, true);
    }

    public final ScrollSwitchStateManager tp(C19EG c19eg) {
        Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(getFragment());
        if (fragmentLIZIZ != null) {
            return C486860J7k.LIZ(fragmentLIZIZ);
        }
        return C486860J7k.LIZIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void y62(boolean z) {
        VerticalViewPager verticalViewPager;
        this.LLJLIL = z;
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null && (verticalViewPager = detailFragmentPanel.LLJJIJI) != null) {
            verticalViewPager.setDisableScroll(!z);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void yL(List<? extends Aweme> list) {
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null) {
            detailFragmentPanel.c0(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void Qj1(Music music, EditPostPermission editPostPermission) {
        List<EditPostBizPermissionStruct> list;
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel != null) {
            C0SZ8 c0sz8LJLIL = detailFragmentPanel.LJLIL();
            Aweme awemeO = detailFragmentPanel.o();
            if (c0sz8LJLIL != null) {
                if (c0sz8LJLIL instanceof VideoViewCell) {
                    List<EditPostBizPermissionStruct> list2 = editPostPermission.bizPermission;
                    if (list2 != null && !list2.isEmpty()) {
                        EditPostPermission editPostPermission2 = awemeO.getEditPostPermission();
                        if (editPostPermission2 != null && (list = editPostPermission2.bizPermission) != null && !list.isEmpty()) {
                            for (EditPostBizPermissionStruct editPostBizPermissionStruct : editPostPermission.bizPermission) {
                                int i = editPostBizPermissionStruct.bizType;
                                for (EditPostBizPermissionStruct editPostBizPermissionStruct2 : editPostPermission2.bizPermission) {
                                    if (editPostBizPermissionStruct2.bizType == i) {
                                        editPostPermission2.bizPermission.remove(editPostBizPermissionStruct2);
                                        editPostPermission2.bizPermission.add(editPostBizPermissionStruct);
                                    }
                                }
                            }
                            awemeO.setEditPostPermission(editPostPermission2);
                        } else {
                            awemeO.setEditPostPermission(editPostPermission);
                        }
                        C1443290nf5.LIZJ(awemeO.getAid(), awemeO.getEditPostPermission());
                    }
                    awemeO.setAddedSoundMusicInfo(music);
                    awemeO.setMusic(music);
                    if (awemeO.getVideo() != null) {
                        Video video = awemeO.getVideo();
                        if (video.getPlayAddr() != null && music.getPlayUrl() != null) {
                            video.getPlayAddr().setUri(music.getPlayUrl().getUri());
                            video.getPlayAddr().setUrlList(music.getPlayUrl().getUrlList());
                            video.getPlayAddr().setWidth(music.getPlayUrl().getWidth());
                            video.getPlayAddr().setHeight(music.getPlayUrl().getHeight());
                            video.getPlayAddr().setUrlKey(String.valueOf(music.getId()));
                        }
                        awemeO.setVideo(video);
                    }
                    ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(awemeO);
                    c0sz8LJLIL.L0(detailFragmentPanel.LJLLJ(), awemeO);
                    detailFragmentPanel.LLLLIILL.U(0, awemeO);
                }
                C1389890mGx c1389890mGx = new C1389890mGx(detailFragmentPanel.l);
                c1389890mGx.LJIIIZ(2131839839);
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f4  */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.0rpJ] */
    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.platform.DetailPageComponent.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View sp(int i, ViewGroup viewGroup) {
        Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(getFragment());
        C19EG activity = getActivity();
        if (fragmentLIZIZ == null) {
            return C20673215v0.LIZLLL(R.layout.bl6, activity, viewGroup, false);
        }
        return C20673215v0.LJFF(fragmentLIZIZ.getContext(), fragmentLIZIZ.getContext(), i, viewGroup, false);
    }

    public final void up(boolean z, boolean z2) {
        boolean z3 = false;
        if (this.LLJL == null) {
            Bundle arguments = getFragment().getArguments();
            if (arguments != null) {
                Fragment fragment = getFragment();
                if (fragment instanceof DetailPageFragment) {
                    this.LLJJL = ((DetailPageFragment) fragment).LLILLJJLI;
                }
                this.LLJJLIIIJLLLLLLLZ = arguments.getBoolean("extra_challenge_is_hashtag", false);
            } else {
                this.LLJJL.setEventType("");
            }
            Fragment fragment2 = getFragment();
            if (fragment2 instanceof DetailPageFragment) {
                this.LLJL = ((DetailPageFragment) fragment2).LL;
            }
        }
        if (z2) {
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            if (detailFragmentPanel != null) {
                detailFragmentPanel.setUserVisibleHint(z);
            }
        } else {
            DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
            if (detailFragmentPanel2 != null) {
                detailFragmentPanel2.j0(z, false);
            }
        }
        cp(z);
        if (z) {
            DetailFragmentPanel detailFragmentPanel3 = this.LLJL;
            if (detailFragmentPanel3 != null) {
                if (!((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).C3().LJIJJ(So()) && !C10IT.LJIIJJI(So())) {
                    z3 = true;
                }
                detailFragmentPanel3.h0(z3);
            }
            DetailFragmentPanel detailFragmentPanel4 = this.LLJL;
            if (detailFragmentPanel4 != null) {
                detailFragmentPanel4.S = true;
                detailFragmentPanel4.tryResumePlay();
            }
        } else {
            DetailFragmentPanel detailFragmentPanel5 = this.LLJL;
            if (detailFragmentPanel5 != null) {
                detailFragmentPanel5.h0(false);
            }
            DetailFragmentPanel detailFragmentPanel6 = this.LLJL;
            if (detailFragmentPanel6 != null) {
                detailFragmentPanel6.S = false;
            }
        }
        C0S4J c0s4j = this.LLLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setUserVisibleHint] ");
        sbLIZ.append(z);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1603450rpP interfaceC1603450rpP = this.LLJZ;
        if (interfaceC1603450rpP != null) {
            interfaceC1603450rpP.setUserVisibleHint(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public void yF(int i, String str) {
        C19EG c19eg;
        InterfaceC1209130hZP interfaceC1209130hZP;
        String aid;
        Integer numValueOf;
        Bundle arguments;
        NewFaceStickerBean stickerEntranceInfo;
        VerticalViewPager verticalViewPager;
        String secUid;
        User author;
        DetailNavArgModel navArgModel = this.LLJJL.getNavArgModel();
        if (navArgModel != null && Intrinsics.LJFF(navArgModel.isThumbnailScaleUp(), Boolean.TRUE)) {
            C19EG c19eg2 = this.LLJILJILJ;
            if (c19eg2 != null) {
                c19eg2.onBackPressed();
                return;
            }
            return;
        }
        ISubscriptionCommonService iSubscriptionCommonServiceLIZ = PaidContentCommonServiceImpl.LIZ();
        String str2 = null;
        if (iSubscriptionCommonServiceLIZ != null) {
            C19EG c19eg3 = this.LLJILJILJ;
            Aweme aweme = this.LLLFFI;
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                secUid = author.getSecUid();
            } else {
                secUid = null;
            }
            if (iSubscriptionCommonServiceLIZ.LJ(c19eg3, secUid)) {
                return;
            }
        }
        if (TextUtils.equals(this.LLJJL.getEventType(), "others_homepage")) {
            C1440005kM.LIZ(new C1565800qqg(null));
        }
        if (this.LLLFFI != null && this.LLJJL.isFromEffectDiscover()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (this.LLJJL.isFromEffectDiscoverTab()) {
                c2344009Gk.LJFF("enter_from", "prop_page_discover");
            } else if (this.LLJJL.isFromEffectDiscoverPanel()) {
                c2344009Gk.LJFF("enter_from", "video_shoot_page");
            }
            Aweme aweme2 = this.LLLFFI;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            if (detailFragmentPanel != null && (verticalViewPager = detailFragmentPanel.LLJJIJI) != null) {
                numValueOf = Integer.valueOf(verticalViewPager.getCurrentItem());
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "impr_position");
            Aweme aweme3 = this.LLLFFI;
            if (aweme3 != null && aweme3.getStickerEntranceInfo() != null) {
                Aweme aweme4 = this.LLLFFI;
                if (aweme4 != null && (stickerEntranceInfo = aweme4.getStickerEntranceInfo()) != null) {
                    str2 = stickerEntranceInfo.id;
                }
                c2344009Gk.LJFF("prop_id", str2);
            }
            if (this.LLJJL.isFromEffectDiscoverPanel() && (arguments = getFragment().getArguments()) != null) {
                c2344009Gk.LJFF("creation_id", arguments.getString("creation_id", ""));
                c2344009Gk.LJFF("shoot_way", arguments.getString("shoot_way", ""));
                c2344009Gk.LJFF("shoot_tab_name", arguments.getString("shoot_tab_name", ""));
            }
            C20684815ws.LJIILLIIL("back_to_prop_discover_feed", c2344009Gk.LIZ);
        }
        DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
        if (detailFragmentPanel2 != null && (interfaceC1209130hZP = detailFragmentPanel2.I) != null) {
            interfaceC1209130hZP.kB();
        }
        LJIJ();
        if (i != -1 && (c19eg = this.LLJILJILJ) != null) {
            C1254880ilC.LIZ.getClass();
            C1254880ilC.LIZ(c19eg, false, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewSp;
        String strLLFF;
        if (C1787206zG.LIZ() && C303460Buy.LIZIZ()) {
            viewSp = sp(R.layout.bl6, viewGroup);
        } else {
            viewSp = sp(R.layout.bl5, viewGroup);
        }
        C0T45 c0t45LJIIIIZZ = C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel == null || (strLLFF = detailFragmentPanel.LLFF()) == null) {
            strLLFF = "";
        }
        Fragment fragment = getFragment();
        c0t45LJIIIIZZ.getClass();
        InterfaceC752360TfG interfaceC752360TfGLIZ = SplitContainerManager.LIZ(strLLFF, fragment, viewSp, false);
        this.LLLF = interfaceC752360TfGLIZ;
        return interfaceC752360TfGLIZ.LJ();
    }

    public void No(Fragment fragment, Aweme aweme, Map map, C2189821An6 c2189821An6) {
        C1ER1.LIZIZ.R0(fragment, aweme, map, c2189821An6);
    }
}
