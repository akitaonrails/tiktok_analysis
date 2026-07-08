package kotlin.jvm.internal;

import X.AbstractC1386130mAt;
import X.AbstractC634910OvJ;
import X.AbstractC705030Rl7;
import X.AbstractC724890Sc3;
import X.AbstractC725500Sd2;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C01U6;
import X.C03H5;
import X.C04VI;
import X.C07XB;
import X.C098200Yq;
import X.C09AY;
import X.C0BWV;
import X.C0BX9;
import X.C0GWY;
import X.C0HD1;
import X.C0HTT;
import X.C0OVM;
import X.C0ROM;
import X.C0RSR;
import X.C0RWZ;
import X.C0RXZ;
import X.C0RY5;
import X.C0RZK;
import X.C0S48;
import X.C0S9I;
import X.C0SA5;
import X.C0SAZ;
import X.C0SC0;
import X.C0SEI;
import X.C0SIK;
import X.C0SIR;
import X.C0SOM;
import X.C0SQH;
import X.C0SU0;
import X.C0SUC;
import X.C0SUQ;
import X.C0SUU;
import X.C0SX4;
import X.C0SX6;
import X.C0SX8;
import X.C0SZ8;
import X.C0SZN;
import X.C0SZS;
import X.C0SZT;
import X.C0T6L;
import X.C0XQ7;
import X.C104100aN;
import X.C1205210hT5;
import X.C1233440iCc;
import X.C1233510iCj;
import X.C1233600iCs;
import X.C1234220iDs;
import X.C1247120iYg;
import X.C1252380ihA;
import X.C1260910iuv;
import X.C1260960iv0;
import X.C1348720lCY;
import X.C1370890lmJ;
import X.C1389300mG0;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C13BV;
import X.C13DA;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C1479570obb;
import X.C1489005sG;
import X.C15438062q;
import X.C1558520qew;
import X.C1600750rl3;
import X.C1607100rvI;
import X.C1697810uHb;
import X.C189200o6;
import X.C1893560zNK;
import X.C1893580zNM;
import X.C1894320zOY;
import X.C1894700zPA;
import X.C1895820zQy;
import X.C19651011uW;
import X.C19EG;
import X.C1ER1;
import X.C20145813s8;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2175231ABd;
import X.C2178808gE;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23250099c;
import X.C2344009Gk;
import X.C238400w2;
import X.C278520Avq;
import X.C291001Au;
import X.C296550Bjp;
import X.C300660BqS;
import X.C304280BwI;
import X.C305550ByL;
import X.C337180DJs;
import X.C603280NlO;
import X.C631370Opb;
import X.C690870R8b;
import X.C694940RNs;
import X.C696330RTb;
import X.C698680Ras;
import X.C700930ReV;
import X.C700970ReZ;
import X.C701010Red;
import X.C708990RrV;
import X.C709160Rrm;
import X.C716660S9g;
import X.C717020SAq;
import X.C717720SDi;
import X.C719950SLx;
import X.C720360SNm;
import X.C720890SPn;
import X.C721190SQr;
import X.C721220SQu;
import X.C721800STa;
import X.C722600SWc;
import X.C722760SWs;
import X.C723830SaL;
import X.C724240Sb0;
import X.C725480Sd0;
import X.C729360SjG;
import X.C729440SjO;
import X.C729510SjV;
import X.C735370Ssx;
import X.C735820Stg;
import X.C735840Sti;
import X.C737030Svd;
import X.C786410Ut5;
import X.C838130WuJ;
import X.C844470XAv;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC721170SQp;
import X.EnumC736440Sug;
import X.InterfaceC0148002o;
import X.InterfaceC1443605kw;
import X.InterfaceC1444205l2;
import X.InterfaceC1479620obg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC705050Rl9;
import X.InterfaceC717050SAt;
import X.InterfaceC719500SKe;
import X.InterfaceC898260ZLs;
import Y.AComparatorS504S0100000_5;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS80S0200000_11;
import android.R;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.model.SharePanelInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagTrigger;
import com.ss.android.ugc.aweme.feed.adapter.AdMultiContentViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPAssem;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.longpressanim.LongPressEmojiAnimAssem;
import com.ss.android.ugc.aweme.feed.assem.report.ReportViewAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.report.TUCReportMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.unreadshare.ShareUnreadVideoQuickDMAssem;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility;
import com.ss.android.ugc.aweme.feed.collection.friends.component.FriendsDetailTransitionAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.feed.model.banner.IStandardModelProvider;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryBottomBarContainerComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.follow.ImmersiveStoryFollowAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryNavBarAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerNavBarAssem;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNumIndicatorAssem;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.fullscreen.above.FullScreenAboveInteractionComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.decision.BaseFcpDecisionContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.VideoBottomDescLabelContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.AutoDubbingConsumptionLabelAssemV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AwS412S0200000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case 85:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS412S0200000_11 awS412S0200000_11) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        CompeteAbility competeAbility;
        if (!C0BWV.LIZ() || Intrinsics.LJFF((VideoItemParams) awS412S0200000_11.l0, C631370Opb.LIZ((StoryBottomBarContainerComponent) awS412S0200000_11.l1))) {
            if (C0BWV.LIZ() && (interfaceC665370Q7z = (InterfaceC665370Q7z) ((StoryBottomBarContainerComponent) awS412S0200000_11.l1).LLJL.getValue()) != null && (competeAbility = (CompeteAbility) C1558520qew.LIZ(interfaceC665370Q7z, CompeteAbility.class, null)) != null) {
                competeAbility.FB((VideoItemParams) awS412S0200000_11.l0);
            }
            StoryBottomBarContainerComponent storyBottomBarContainerComponent = (StoryBottomBarContainerComponent) awS412S0200000_11.l1;
            AssemViewModel assemViewModel = (AssemViewModel) storyBottomBarContainerComponent.LLJJLIIIJLLLLLLLZ.getValue(storyBottomBarContainerComponent, StoryBottomBarContainerComponent.LLJLILLLLZIIL[0]);
            assemViewModel.getClass();
            assemViewModel.setState(new AwS24S0010000_9(false, 17));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS412S0200000_11 awS412S0200000_11) {
        ((StoryFeedViewModel) awS412S0200000_11.l0).zQ2((UserStory) awS412S0200000_11.l1, "ON_CURRENT_INFO_CHANGED");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.FrameLayout*/.onTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$100(AwS412S0200000_11 awS412S0200000_11) {
        Object objProvideItemPayload = ((IStandardModelProvider) awS412S0200000_11.l0).provideItemPayload();
        if (!(objProvideItemPayload instanceof VideoItemParams) || objProvideItemPayload == null) {
            VideoItemParams videoItemParams = new VideoItemParams();
            videoItemParams.setAweme((Aweme) awS412S0200000_11.l1);
            videoItemParams.setFragment(videoItemParams.fragment);
            return videoItemParams;
        }
        return objProvideItemPayload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$101(AwS412S0200000_11 awS412S0200000_11) {
        C2189821An6 c2189821An6LIZ;
        String followRecommendTrackEnterFrom;
        User author;
        String strLIZ;
        String previousPage;
        boolean zIsBigCard;
        HashMap<String, String> mobParams;
        String eventType;
        MatchedFriendStruct matchedFriendStructTrack;
        Context context = ((FollowButtonFFPAssem) awS412S0200000_11.l0).getContext();
        Boolean followRecommendShowRelationLabel = null;
        if (context != null) {
            c2189821An6LIZ = C0SUC.LIZ(context);
        } else {
            c2189821An6LIZ = null;
        }
        Map<String, String> params = TakoAIVideoMobFiller.toParams(c2189821An6LIZ);
        boolean z = true;
        if (!(!params.isEmpty())) {
            params = null;
        }
        if (c2189821An6LIZ == null || (followRecommendTrackEnterFrom = c2189821An6LIZ.getFollowRecommendTrackEnterFrom()) == null) {
            followRecommendTrackEnterFrom = "";
        }
        Aweme aweme = ((VideoItemParams) awS412S0200000_11.l1).getAweme();
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            if (c2189821An6LIZ != null) {
                matchedFriendStructTrack = c2189821An6LIZ.getMatchedFriendStructTrack();
            } else {
                matchedFriendStructTrack = null;
            }
            author.setMatchedFriendStruct(matchedFriendStructTrack);
        } else {
            author = null;
        }
        Context context2 = ((FollowButtonFFPAssem) awS412S0200000_11.l0).getContext();
        if (context2 != null) {
            strLIZ = C721800STa.LIZ(C0SUC.LIZ(context2));
        } else {
            strLIZ = null;
        }
        if (c2189821An6LIZ != null) {
            previousPage = c2189821An6LIZ.getPreviousPage();
        } else {
            previousPage = null;
        }
        boolean zBooleanValue = false;
        if (c2189821An6LIZ != null) {
            zIsBigCard = c2189821An6LIZ.isBigCard();
        } else {
            zIsBigCard = false;
        }
        if (C296550Bjp.LIZ()) {
            if (c2189821An6LIZ != null) {
                eventType = c2189821An6LIZ.getEventType();
            } else {
                eventType = null;
            }
            if (!Intrinsics.LJFF(eventType, "others_homepage") && !Intrinsics.LJFF(eventType, "personal_homepage")) {
                z = false;
            }
        }
        if (c2189821An6LIZ != null) {
            Boolean hasMLBBBadge = c2189821An6LIZ.getHasMLBBBadge();
            if (hasMLBBBadge != null) {
                zBooleanValue = hasMLBBBadge.booleanValue();
            }
            followRecommendShowRelationLabel = c2189821An6LIZ.getFollowRecommendShowRelationLabel();
        }
        VideoItemParams videoItemParams = (VideoItemParams) awS412S0200000_11.l1;
        C13DA c13da = new C13DA();
        C2097608Jq.LJIILL(c13da, C19651011uW.LIZIZ.LIZIZ(videoItemParams.getAweme()));
        Aweme aweme2 = videoItemParams.getAweme();
        if (aweme2 != null && (mobParams = aweme2.getMobParams()) != null) {
            c13da.putAll(mobParams);
        }
        return new C1260960iv0(followRecommendTrackEnterFrom, author, "click_button", (String) null, previousPage, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), "CARD", (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 0, (int) (0 == true ? 1 : 0), Boolean.valueOf(zIsBigCard), (int) (0 == true ? 1 : 0), strLIZ, (boolean) (0 == true ? 1 : 0), Boolean.TRUE, Boolean.valueOf(z), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), Boolean.valueOf(zBooleanValue), c13da.build(), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), followRecommendShowRelationLabel, (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1247120iYg) (0 == true ? 1 : 0), (Map) params, -105907224, -1073744897, 8191);
    }

    public static final Object invoke$102(AwS412S0200000_11 awS412S0200000_11) {
        return ((PhotosViewHolderV3) awS412S0200000_11.l0).LJIILLIIL((C719950SLx) awS412S0200000_11.l1);
    }

    public static final Object invoke$103(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed Annotation Layer receive timing callback. signal#: ");
        sbLIZ.append((C698680Ras) awS412S0200000_11.l0);
        sbLIZ.append(". current_aid: ");
        sbLIZ.append(((VideoItemParams) ((VideoBottomDescLabelContainer) awS412S0200000_11.l1).bo()).getAweme().getAid());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$104(AwS412S0200000_11 awS412S0200000_11) {
        C0S9I c0s9i = (C0S9I) awS412S0200000_11.l0;
        try {
            C20684815ws.LJIJ(c0s9i.getEventName(), (JSONObject) awS412S0200000_11.l1);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$105(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVHLoadComplete, pos:==> ");
        sbLIZ.append(((SlidesImageLoadParams) awS412S0200000_11.l0).index);
        sbLIZ.append(", slideShowInfo =>");
        sbLIZ.append((C0SAZ) awS412S0200000_11.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS412S0200000_11 awS412S0200000_11) {
        C1389890mGx c1389890mGx = new C1389890mGx(((ExploreFeedCell) awS412S0200000_11.l0).itemView);
        c1389890mGx.LJIIIZ(2131830552);
        c1389890mGx.LJIIJJI();
        C1440005kM.LIZ(new C737030Svd(2, (Aweme) awS412S0200000_11.l1));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS412S0200000_11 awS412S0200000_11) {
        return C603280NlO.LIZ((VideoItemParams) awS412S0200000_11.l0, ((VideoFeedMultiTagTrigger) awS412S0200000_11.l1).jm());
    }

    public static final Object invoke$13(AwS412S0200000_11 awS412S0200000_11) {
        return C603280NlO.LIZ((VideoItemParams) awS412S0200000_11.l0, ((VideoFeedMultiTagTrigger) awS412S0200000_11.l1).jm());
    }

    public static final Object invoke$14(AwS412S0200000_11 awS412S0200000_11) {
        ((FeedAvatarDefaultAssem) awS412S0200000_11.l0).tp((Aweme) awS412S0200000_11.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS412S0200000_11 awS412S0200000_11) {
        IVideoCommentAbility iVideoCommentAbility = (IVideoCommentAbility) ((LongPressEmojiAnimAssem) awS412S0200000_11.l0).LLJLIL.getValue();
        if (iVideoCommentAbility != null) {
            iVideoCommentAbility.vX1(((C0RSR) awS412S0200000_11.l1).LIZLLL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS412S0200000_11 awS412S0200000_11) {
        IVideoCommentAbility iVideoCommentAbility = (IVideoCommentAbility) ((LongPressEmojiAnimAssem) awS412S0200000_11.l0).LLJLIL.getValue();
        if (iVideoCommentAbility != null) {
            iVideoCommentAbility.vX1(((C0RSR) awS412S0200000_11.l1).LIZLLL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS412S0200000_11 awS412S0200000_11) {
        C2175231ABd c2175231ABd = C2175231ABd.LIZ;
        Aweme aweme = ((VideoItemParams) awS412S0200000_11.l0).getAweme();
        FrameLayout frameLayoutBp = ((ReportViewAssem) awS412S0200000_11.l1).Bp();
        c2175231ABd.getClass();
        C2175231ABd.LIZIZ(frameLayoutBp, aweme);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS412S0200000_11 awS412S0200000_11) {
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        C20684815ws.LJIIJ(0L, "click_share_button", "homepage_follow", ((Aweme) awS412S0200000_11.l0).getAid(), ((VideoShareViewModel) awS412S0200000_11.l1).AQ2((Aweme) awS412S0200000_11.l0));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$19(AwS412S0200000_11 awS412S0200000_11) {
        C1252380ihA c1252380ihALIZ;
        String str;
        String str2;
        String str3;
        Map<String, String> mapLIZJ;
        Map<String, String> mapLIZ;
        int iIntValue;
        String str4;
        Integer numLJIIJJI;
        String str5;
        Integer numLJIIJJI2;
        InterfaceC898260ZLs interfaceC898260ZLs = (InterfaceC898260ZLs) ((VideoExposeSharerInformationAssem) awS412S0200000_11.l0).LLJZ.getValue();
        if (interfaceC898260ZLs != null) {
            VideoExposeSharerInformationVM videoExposeSharerInformationVMFp = ((VideoExposeSharerInformationAssem) awS412S0200000_11.l0).Fp();
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((VideoExposeSharerInformationAssem) awS412S0200000_11.l0)).getAweme();
            String str6 = ((VideoExposeSharerInformationAssem) awS412S0200000_11.l0).Fp().eventType;
            if (str6 == null) {
                str6 = "";
            }
            boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
            C1233440iCc c1233440iCc = (C1233440iCc) awS412S0200000_11.l1;
            videoExposeSharerInformationVMFp.getClass();
            User sharer = AwemeBizExtKt.getSharer(aweme);
            if (sharer != null) {
                if (sharer.getFollowerStatus() == 0) {
                    str = "null";
                } else {
                    str = "single";
                }
                C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
                C735840Sti c735840Sti = C735840Sti.LIZ;
                C19651011uW c19651011uW = C19651011uW.LIZIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "share_user_info_card");
                if (videoExposeSharerInformationVMFp.pageType == 0) {
                    str2 = "homepage_hot";
                } else {
                    str2 = "server_push";
                }
                c2344009Gk.LJIIIIZZ("previous_page", str2);
                c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                c2344009Gk.LJIIIIZZ("to_user_id", sharer.getUid());
                c2344009Gk.LJIIIIZZ("follow_type", str);
                c2344009Gk.LIZJ(sharer.isAccuratePrivateAccount() ? 1 : 0, "is_private");
                if (aweme.isAd()) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("is_ad", str3);
                c2344009Gk.LJII(C1234220iDs.LJIIIIZZ(C1234220iDs.LJI(sharer)));
                Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
                c735840Sti.getClass();
                C735840Sti.LIZIZ(aweme, objLJIIIZ);
                C20684815ws.LJIILLIIL("follow", ((C2344009Gk) c1370890lmJ.appendCreationParams(objLJIIIZ, aweme)).LIZ);
                int iLIZ = 0;
                C1260910iuv c1260910iuv = new C1260910iuv(0);
                c1260910iuv.LJJIL("share_link");
                String str7 = videoExposeSharerInformationVMFp.eventType;
                if (str7 == null) {
                    str7 = "homepage_hot";
                }
                c1260910iuv.LJJIJLIJ(str7);
                c1260910iuv.LJJJJZI(sharer);
                c1260910iuv.LJJLIIIJJI = EnumC1260930iux.FOLLOW;
                c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
                c1260910iuv.LJJJJLL();
                c1260910iuv.LJZ = C1234220iDs.LJIIIIZZ(C1234220iDs.LJI(sharer));
                c1260910iuv.LJJJJIZL("sharer_card");
                Object objLJIIIZ2 = c19651011uW.LJIIIZ(aweme, c1260910iuv);
                C735840Sti.LIZIZ(aweme, objLJIIIZ2);
                ((AbstractC1386130mAt) objLJIIIZ2).LJIILJJIL();
                C1233510iCj c1233510iCjLJI = C1234220iDs.LJI(sharer);
                if (c1233510iCjLJI != null) {
                    mapLIZJ = C1234220iDs.LIZJ(c1233510iCjLJI);
                } else {
                    mapLIZJ = null;
                }
                if (c1233440iCc != null) {
                    mapLIZ = C1233600iCs.LIZ(c1233440iCc);
                } else {
                    mapLIZ = null;
                }
                if (mapLIZJ != null && (str5 = mapLIZJ.get("from")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str5)) != null) {
                    iIntValue = numLJIIJJI2.intValue();
                } else if (mapLIZ != null && (str4 = mapLIZ.get("from")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 21;
                }
                C0OVM c0ovm = new C0OVM();
                c0ovm.LIZJ(sharer.getUid());
                c0ovm.LIZIZ(sharer.getSecUid());
                boolean zIsAccuratePrivateAccount = sharer.isAccuratePrivateAccount();
                C1252380ihA c1252380ihA = c0ovm.LIZ;
                c1252380ihA.LJIILIIL = zIsAccuratePrivateAccount;
                c1252380ihA.LIZLLL = 1;
                c1252380ihA.LJI = str6;
                c1252380ihA.LJ = iIntValue;
                c0ovm.LIZ.LJIIJ = sharer.getFollowStatus();
                c0ovm.LIZ.LJIIJJI = sharer.getFollowerStatus();
                String accurateRecType = sharer.getAccurateRecType();
                C1252380ihA c1252380ihA2 = c0ovm.LIZ;
                c1252380ihA2.LJIILLIIL = accurateRecType;
                if (mapLIZJ == null) {
                    mapLIZJ = mapLIZ;
                }
                c1252380ihA2.LJIIL = mapLIZJ;
                if (zIsLogin) {
                    if (!Intrinsics.LJFF(str6, "homepage_hot")) {
                        iLIZ = C735820Stg.LIZ(str6);
                    }
                    c0ovm.LIZ.LJFF = iLIZ;
                } else {
                    c0ovm.LIZ.LJFF = C735820Stg.LIZ(str6);
                }
                c1252380ihALIZ = c0ovm.LIZ();
            } else {
                c1252380ihALIZ = null;
            }
            interfaceC898260ZLs.AI2(c1252380ihALIZ, "share_user_info_card", null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed MetaTag Layer receive timing callback. signal#: ");
        sbLIZ.append((C698680Ras) awS412S0200000_11.l0);
        sbLIZ.append(". current_aid: ");
        sbLIZ.append(((VideoItemParams) ((FcpMetaTagContainer) awS412S0200000_11.l1).bo()).getAweme().getAid());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$20(AwS412S0200000_11 awS412S0200000_11) {
        IFriendsDetailPageAbility iFriendsDetailPageAbility;
        ((TUCReportMaskAssem) awS412S0200000_11.l0).Gp((Context) awS412S0200000_11.l1, "othershow");
        if (C1389300mG0.LJIIJ(((VideoItemParams) C631370Opb.LIZ((TUCReportMaskAssem) awS412S0200000_11.l0)).fragment) && (iFriendsDetailPageAbility = (IFriendsDetailPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL((TUCReportMaskAssem) awS412S0200000_11.l0), IFriendsDetailPageAbility.class, null)) != null) {
            iFriendsDetailPageAbility.SO1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS412S0200000_11 awS412S0200000_11) {
        ((TUCReportMaskAssem) awS412S0200000_11.l0).Gp((Context) awS412S0200000_11.l1, "play");
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS412S0200000_11 awS412S0200000_11) {
        VideoCommentAssem videoCommentAssem = (VideoCommentAssem) awS412S0200000_11.l0;
        View view = (View) awS412S0200000_11.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoCommentAssem.LLLJ;
        videoCommentAssem.Xp(1, view);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS412S0200000_11 awS412S0200000_11) {
        Window window;
        ((FriendsDetailTransitionAssem) awS412S0200000_11.l0).Jp();
        C19EG c19egLIZ = C724240Sb0.LIZ((FriendsDetailTransitionAssem) awS412S0200000_11.l0);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            window.setSharedElementsUseOverlay(true);
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ((FriendsDetailTransitionAssem) awS412S0200000_11.l0);
        if (c19egLIZ2 != null) {
            c19egLIZ2.setEnterSharedElementCallback(((FriendsDetailTransitionAssem) awS412S0200000_11.l0).LLLIIII);
        }
        ((FriendsDetailTransitionAssem) awS412S0200000_11.l0).Gp().setBackground(null);
        C337180DJs.LIZJ(((FriendsDetailTransitionAssem) awS412S0200000_11.l0).Gp());
        FriendsDetailTransitionAssem friendsDetailTransitionAssem = (FriendsDetailTransitionAssem) awS412S0200000_11.l0;
        friendsDetailTransitionAssem.zw0(new AwS412S0200000_11(friendsDetailTransitionAssem, (FriendsDetailTransitionAssem) awS412S0200000_11.l1, (Function0<Unit>) 63));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.FrameLayout*/.onInterceptTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$25(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.FrameLayout*/.onTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$26(AwS412S0200000_11 awS412S0200000_11) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((PhotoFeedLivePhotoComponent) awS412S0200000_11.l0).hashCode());
        sbLIZ.append(" onResumePlayEvent ");
        C291001Au c291001Au = (C291001Au) awS412S0200000_11.l1;
        if (c291001Au != null) {
            str = (String) c291001Au.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$27(AwS412S0200000_11 awS412S0200000_11) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((PhotoFeedLivePhotoComponent) awS412S0200000_11.l0).hashCode());
        sbLIZ.append(" onPausePlayEvent ");
        C291001Au c291001Au = (C291001Au) awS412S0200000_11.l1;
        if (c291001Au != null) {
            str = (String) c291001Au.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$28(AwS412S0200000_11 awS412S0200000_11) {
        String aid;
        Aweme aweme;
        LivePhotoStruct livePhotoStructLJI;
        Aweme aweme2;
        StringBuilder sb = new StringBuilder();
        sb.append(((LivePhotoViewHolder) awS412S0200000_11.l0).hashCode());
        sb.append(" bindData aid: ");
        VideoItemParams videoItemParams = ((C719950SLx) awS412S0200000_11.l1).LLILLL;
        String str = null;
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sb.append(aid);
        sb.append(" position: ");
        sb.append(((C719950SLx) awS412S0200000_11.l1).LL);
        sb.append(" vid: ");
        C719950SLx c719950SLx = (C719950SLx) awS412S0200000_11.l1;
        VideoItemParams videoItemParams2 = c719950SLx.LLILLL;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (livePhotoStructLJI = C721220SQu.LJI(c719950SLx.LL, aweme)) != null) {
            str = livePhotoStructLJI.livePhotoVid;
        }
        sb.append(str);
        return sb.toString();
    }

    public static final Object invoke$29(AwS412S0200000_11 awS412S0200000_11) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LivePhotoViewHolder) awS412S0200000_11.l0).hashCode());
        sbLIZ.append(" play called, initialStartTimeMs ");
        C1479570obb c1479570obbLIZLLL = ((InterfaceC1479620obg) awS412S0200000_11.l1).LIZLLL();
        if (c1479570obbLIZLLL != null) {
            numValueOf = Integer.valueOf(c1479570obbLIZLLL.LJIIIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" playType ");
        sbLIZ.append(((LivePhotoViewHolder) awS412S0200000_11.l0).LLLZZIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS412S0200000_11 awS412S0200000_11) {
        List<String> listLIZ;
        InterfaceC1443605kw result;
        InterfaceC1444205l2 interfaceC1444205l2 = ((C0RXZ) awS412S0200000_11.l0).LJIIJ().LIZIZ;
        if (interfaceC1444205l2 == null || (result = interfaceC1444205l2.getResult()) == null || (listLIZ = result.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        if (!Intrinsics.LJFF(((C0RY5) awS412S0200000_11.l1).LLJI, listLIZ)) {
            C0RY5 c0ry5 = (C0RY5) awS412S0200000_11.l1;
            c0ry5.LLJI = listLIZ;
            c0ry5.LIZJ();
        }
        C0RY5 c0ry52 = (C0RY5) awS412S0200000_11.l1;
        if (c0ry52.LLILZLL) {
            c0ry52.LLILLJJLI.xg();
            C0T6L.LIZLLL();
            ((C0RY5) awS412S0200000_11.l1).LIZLLL();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(AwS412S0200000_11 awS412S0200000_11) {
        return ((InterfaceC451590HnJ) awS412S0200000_11.l0).LIZ((LifecycleOwner) ((Function0) awS412S0200000_11.l1).invoke());
    }

    public static final Object invoke$31(AwS412S0200000_11 awS412S0200000_11) {
        if (!((StoryViewerNavBarAssem) awS412S0200000_11.l0).LLJI) {
            ((StoryViewerNavBarAssem) awS412S0200000_11.l0).Jo((Context) awS412S0200000_11.l1, -1L, new C0SEI());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS412S0200000_11 awS412S0200000_11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StoryGalleryNavBarAssem storyGalleryNavBarAssem = (StoryGalleryNavBarAssem) awS412S0200000_11.l0;
        long j = jCurrentTimeMillis - storyGalleryNavBarAssem.LLJILJILJ;
        if (!storyGalleryNavBarAssem.LLJILJIL && j >= 500) {
            storyGalleryNavBarAssem.LLJILJIL = true;
            Context context = ((View) awS412S0200000_11.l1).getContext();
            AssemVMLazy assemVMLazy = storyGalleryNavBarAssem.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StoryGalleryNavBarAssem.LLJJI;
            storyGalleryNavBarAssem.withState(assemVMLazy.getValue(), new AwS377S0200000_11(storyGalleryNavBarAssem, context, 111));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$33(AwS412S0200000_11 awS412S0200000_11) {
        return ((InterfaceC451590HnJ) awS412S0200000_11.l0).LIZ((LifecycleOwner) ((Function0) awS412S0200000_11.l1).invoke());
    }

    public static final Object invoke$34(AwS412S0200000_11 awS412S0200000_11) {
        ViewPropertyAnimator viewPropertyAnimator = ((PhotoNumIndicatorAssem) awS412S0200000_11.l0).LLJLIL;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ((PhotoNumIndicatorAssem) awS412S0200000_11.l0).LLJLIL = ((C716660S9g) awS412S0200000_11.l1).animate().alpha(1.0f).setDuration(150L).setInterpolator(new LinearInterpolator()).setListener(null);
        ViewPropertyAnimator viewPropertyAnimator2 = ((PhotoNumIndicatorAssem) awS412S0200000_11.l0).LLJLIL;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.start();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS412S0200000_11 awS412S0200000_11) {
        FeedContentLayoutInfo feedContentLayoutInfo = (FeedContentLayoutInfo) awS412S0200000_11.l0;
        int i = feedContentLayoutInfo.textHeight + feedContentLayoutInfo.belowTextHeight;
        float f = ((SmartImagePhotoViewHolderV2) awS412S0200000_11.l1).LLJIJIL.getResources().getDisplayMetrics().density;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calculate title line:");
        sbLIZ.append(((FeedContentLayoutInfo) awS412S0200000_11.l0).titleLines);
        sbLIZ.append(" desc line:");
        sbLIZ.append(((FeedContentLayoutInfo) awS412S0200000_11.l0).descriptionLines);
        sbLIZ.append(':');
        sbLIZ.append(((FeedContentLayoutInfo) awS412S0200000_11.l0).rawDescLines);
        sbLIZ.append(",\ntext height: ");
        sbLIZ.append((int) (((FeedContentLayoutInfo) awS412S0200000_11.l0).textHeight / f));
        sbLIZ.append("dp ");
        sbLIZ.append(((FeedContentLayoutInfo) awS412S0200000_11.l0).textHeight);
        sbLIZ.append("px\ntext+component height: ");
        sbLIZ.append((int) (i / f));
        sbLIZ.append("dp ");
        sbLIZ.append(i);
        sbLIZ.append("px\nmax total height: ");
        sbLIZ.append((int) (((FeedContentLayoutInfo) awS412S0200000_11.l0).maxTotalHeight / f));
        sbLIZ.append("dp ");
        sbLIZ.append(((FeedContentLayoutInfo) awS412S0200000_11.l0).maxTotalHeight);
        sbLIZ.append("px");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$36(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.LinearLayout*/.onInterceptTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$37(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.LinearLayout*/.onTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$38(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBanner doProcessPolicyResult enqueue, componentKey=");
        sbLIZ.append(((C0RZK) awS412S0200000_11.l0).LLLII());
        sbLIZ.append(", earlyWinnerEnable=");
        sbLIZ.append(C04VI.LIZ());
        sbLIZ.append(", pendingCount=");
        sbLIZ.append(((InteractBottomBannerComponent) awS412S0200000_11.l1).LLLIIII.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$39(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBanner early release by AB, componentKey=");
        sbLIZ.append(((C0RZK) awS412S0200000_11.l0).LLLII());
        sbLIZ.append(", pendingCount=");
        sbLIZ.append(((InteractBottomBannerComponent) awS412S0200000_11.l1).LLLIIII.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS412S0200000_11 awS412S0200000_11) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(((C238400w2) awS412S0200000_11.l0).element);
        sbLIZ.append(" --- ");
        C700970ReZ c700970ReZ = ((C701010Red) awS412S0200000_11.l1).node;
        if (c700970ReZ != null) {
            str = c700970ReZ.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" --- FcpReleaseTask#compute start --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$40(AwS412S0200000_11 awS412S0200000_11) {
        C786410Ut5.LJLLLLLL(0, ((BottomLabelTriggerComponent) awS412S0200000_11.l0).LJJIJL());
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) ((BottomLabelTriggerComponent) awS412S0200000_11.l0).LLJJLIIIJLLLLLLLZ.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1((ComponentPriorityProtocol) awS412S0200000_11.l1);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$41(AwS412S0200000_11 awS412S0200000_11) {
        ((AutoDubbingConsumptionLabelAssemV2) awS412S0200000_11.l0).tp((VideoItemParams) awS412S0200000_11.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS412S0200000_11 awS412S0200000_11) {
        return C603280NlO.LIZ((VideoItemParams) awS412S0200000_11.l0, ((VideoTagContainer) awS412S0200000_11.l1).jm());
    }

    public static final Object invoke$43(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.LinearLayout*/.onInterceptTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$44(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.LinearLayout*/.onTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$45(AwS412S0200000_11 awS412S0200000_11) {
        C1440005kM.LIZ(new C722600SWc(0, ((C19EG) awS412S0200000_11.l0).hashCode(), ((Aweme) awS412S0200000_11.l1).getAid()));
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS412S0200000_11 awS412S0200000_11) {
        C1440005kM.LIZ(new C722600SWc(1, ((C19EG) awS412S0200000_11.l0).hashCode(), ((Aweme) awS412S0200000_11.l1).getAid()));
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpVisibilityErrorDetector checkInteractAreaVisibility ");
        sbLIZ.append(((C0S48) awS412S0200000_11.l0).getValue());
        sbLIZ.append(' ');
        sbLIZ.append(((VideoBaseCell) ((C0SZ8) awS412S0200000_11.l1)).LLJILJILJ.LJIILJJIL);
        sbLIZ.append(", ");
        sbLIZ.append(((VideoBaseCell) ((C0SZ8) awS412S0200000_11.l1)).LLJILJILJ.LJIIJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$48(AwS412S0200000_11 awS412S0200000_11) {
        ((Assembler) awS412S0200000_11.l0).vQ2((Fragment) awS412S0200000_11.l1, AFwS243S0000000_11.get$arr$(591));
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS412S0200000_11 awS412S0200000_11) {
        AbstractC705030Rl7 abstractC705030Rl7 = (AbstractC705030Rl7) awS412S0200000_11.l0;
        T t = abstractC705030Rl7.LJIIL;
        if (t != 0) {
            Function0<Unit> function0 = (Function0) awS412S0200000_11.l1;
            t.LIZ();
            T t2 = abstractC705030Rl7.LJIIL;
            if (t2 != 0 && t2.LIZLLL()) {
                abstractC705030Rl7.LJIIZILJ(t, function0);
                abstractC705030Rl7.onShow();
            } else {
                InterfaceC705050Rl9.LIZ.getClass();
                abstractC705030Rl7.LIZ("invalid_data");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS412S0200000_11 awS412S0200000_11) {
        return Integer.valueOf(((C0SZN) awS412S0200000_11.l0).LIZLLL().indexOf((C0SZS) awS412S0200000_11.l1));
    }

    public static final Object invoke$50(AwS412S0200000_11 awS412S0200000_11) {
        ShareUnreadVideoQuickDMAssem shareUnreadVideoQuickDMAssem = (ShareUnreadVideoQuickDMAssem) awS412S0200000_11.l0;
        User user = (User) awS412S0200000_11.l1;
        shareUnreadVideoQuickDMAssem.getClass();
        if (C300660BqS.LIZ()) {
            return ((MessageDraftViewModel) shareUnreadVideoQuickDMAssem.LLJLLL.getValue()).vQ2(user.getUid());
        }
        return null;
    }

    public static final Object invoke$51(AwS412S0200000_11 awS412S0200000_11) {
        ShareUnreadVideoQuickDMAssem shareUnreadVideoQuickDMAssem = (ShareUnreadVideoQuickDMAssem) awS412S0200000_11.l0;
        User user = (User) awS412S0200000_11.l1;
        shareUnreadVideoQuickDMAssem.getClass();
        if (C300660BqS.LIZ()) {
            return ((MessageDraftViewModel) shareUnreadVideoQuickDMAssem.LLJLLL.getValue()).vQ2(user.getUid());
        }
        return null;
    }

    public static final Object invoke$52(AwS412S0200000_11 awS412S0200000_11) {
        ((ConditionData) awS412S0200000_11.l0).setCanApplySlot(false);
        ((ConditionData) awS412S0200000_11.l0).setCanApplyDisplay(false);
        ((AbstractC634910OvJ) awS412S0200000_11.l1).LLILLJJLI = false;
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed Banner Layer receive timing callback. signal#: ");
        sbLIZ.append((C698680Ras) awS412S0200000_11.l0);
        sbLIZ.append(". current_aid: ");
        sbLIZ.append(((VideoItemParams) ((InteractBottomBannerComponent) awS412S0200000_11.l1).bo()).getAweme().getAid());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$54(AwS412S0200000_11 awS412S0200000_11) {
        return C603280NlO.LIZ((VideoItemParams) awS412S0200000_11.l0, ((FeedCommonBannerAssem) awS412S0200000_11.l1).jm());
    }

    public static final Object invoke$55(AwS412S0200000_11 awS412S0200000_11) {
        return C603280NlO.LIZ((VideoItemParams) awS412S0200000_11.l0, ((FeedCommonBannerAssem) awS412S0200000_11.l1).jm());
    }

    public static final Object invoke$56(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" --- doResetActive --- component_clazz: ");
        sbLIZ.append(C13LE.LIZ(((C700930ReV) awS412S0200000_11.l0).getClass()).LJI());
        sbLIZ.append(" ---- component_key: ");
        sbLIZ.append(((FcpNodeProtocol) awS412S0200000_11.l1).LLLII());
        sbLIZ.append(" ---- active: false.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$57(AwS412S0200000_11 awS412S0200000_11) {
        View view = ((C722760SWs) awS412S0200000_11.l0).LIZIZ;
        if (view != null) {
            C786410Ut5.T4(view, 0.5f);
        }
        ((C19EG) awS412S0200000_11.l1).getWindow().setBackgroundDrawableResource(R.color.transparent);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$58(AwS412S0200000_11 awS412S0200000_11) {
        View view = ((C722760SWs) awS412S0200000_11.l0).LIZIZ;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        ((C19EG) awS412S0200000_11.l1).getWindow().setBackgroundDrawableResource(R.color.transparent);
        return Unit.LIZ;
    }

    public static final Object invoke$59(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((PhotoFeedLivePhotoComponent) awS412S0200000_11.l0).hashCode());
        sbLIZ.append(" onBind ");
        sbLIZ.append(((VideoItemParams) awS412S0200000_11.l1).getAweme().getAid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS412S0200000_11 awS412S0200000_11) {
        ((Function1) awS412S0200000_11.l0).invoke((InterfaceC0148002o) awS412S0200000_11.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$60(AwS412S0200000_11 awS412S0200000_11) {
        String from;
        String str;
        String strValueOf;
        String str2;
        C2189821An6 c2189821An6;
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryFollowAssem) awS412S0200000_11.l0)).baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        String strLIZIZ = C1600750rl3.LIZIZ(from);
        if (C729510SjV.LJJ(((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryFollowAssem) awS412S0200000_11.l0)).getAweme())) {
            str = "story";
        } else {
            str = "post";
        }
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryFollowAssem) awS412S0200000_11.l0)).getAweme());
        String aid = ((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryFollowAssem) awS412S0200000_11.l0)).getAweme().getAid();
        int awemeType = ((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryFollowAssem) awS412S0200000_11.l0)).getAweme().getAwemeType();
        String strLJII = C729510SjV.LJII(((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryFollowAssem) awS412S0200000_11.l0)).getAweme());
        Pair[] pairArr = new Pair[3];
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author = ((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryFollowAssem) awS412S0200000_11.l0)).getAweme().getAuthor();
        c735840Sti.getClass();
        pairArr[0] = new Pair("follow_status", String.valueOf(C735840Sti.LJIIIIZZ(author)));
        User author2 = ((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryFollowAssem) awS412S0200000_11.l0)).getAweme().getAuthor();
        if (author2 == null || (strValueOf = Integer.valueOf(author2.getFollowStatusRelation()).toString()) == null) {
            strValueOf = String.valueOf(EnumC736440Sug.ELSE.getValue());
        }
        pairArr[1] = new Pair("follow_status_relation", strValueOf);
        if (C729510SjV.LJJIIZI(((VideoItemParams) C631370Opb.LIZ((ImmersiveStoryFollowAssem) awS412S0200000_11.l0)).getAweme())) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_note", str2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        return new C1260960iv0(strLIZIZ, (User) awS412S0200000_11.l1, "story_immersive_feed", (String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), aid, str, strLJII, 0, (int) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), Integer.valueOf(awemeType), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), mapLJIIIIZZ, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), authorUid, (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1247120iYg) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), -229384, -8390673, 16383);
    }

    public static final Object invoke$61(AwS412S0200000_11 awS412S0200000_11) {
        C725480Sd0.LIZIZ((AbstractC725500Sd2) awS412S0200000_11.l0, (C07XB) ((Function0) awS412S0200000_11.l1).invoke());
        return Unit.LIZ;
    }

    public static final Object invoke$62(AwS412S0200000_11 awS412S0200000_11) {
        String aid;
        String str;
        C1895820zQy c1895820zQy = C1895820zQy.LL;
        Context context = (Context) awS412S0200000_11.l0;
        Aweme aweme = (Aweme) awS412S0200000_11.l1;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c1895820zQy.getClass();
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        SharePanelInfo sharePanelInfo = (SharePanelInfo) C2178808gE.LIZ().LJ(33);
        if (sharePanelInfo != null && (str = sharePanelInfo.jumpLink) != null) {
            String string = UriProtector.parse(str).buildUpon().appendQueryParameter("video_item_id", aid).build().toString();
            C1893580zNM c1893580zNM = C1893580zNM.LIZ;
            Integer numValueOf = Integer.valueOf(sharePanelInfo.LIZ);
            String str2 = sharePanelInfo.LIZIZ;
            Map<String, String> map = sharePanelInfo.LJ;
            c1893580zNM.getClass();
            C01U6.LIZIZ(new C1893560zNK(context, numValueOf, string, str2, aid, map, null, false));
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c1894320zOY.getClass();
            C1894320zOY.LJIILJJIL(33, linkedHashMap, null, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$63(AwS412S0200000_11 awS412S0200000_11) {
        if (((Boolean) C278520Avq.LIZ.getValue()).booleanValue()) {
            HandlerHook.viewPost(((FriendsDetailTransitionAssem) awS412S0200000_11.l0).Ip(), new ARunnableS80S0200000_11((FriendsDetailTransitionAssem) awS412S0200000_11.l0, (Function0) awS412S0200000_11.l1, 39));
        } else {
            ((FriendsDetailTransitionAssem) awS412S0200000_11.l0).Qp();
            ((Function0) awS412S0200000_11.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$64(AwS412S0200000_11 awS412S0200000_11) {
        if (((Boolean) C278520Avq.LIZ.getValue()).booleanValue()) {
            HandlerHook.viewPost(((FriendsDetailTransitionAssem) awS412S0200000_11.l0).Ip(), new ARunnableS80S0200000_11((FriendsDetailTransitionAssem) awS412S0200000_11.l0, (Function0) awS412S0200000_11.l1, 42));
        } else {
            ((FriendsDetailTransitionAssem) awS412S0200000_11.l0).Qp();
            ((Function0) awS412S0200000_11.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$65(AwS412S0200000_11 awS412S0200000_11) {
        return C603280NlO.LIZ((VideoItemParams) awS412S0200000_11.l0, ((AIGCOverLabelBannerAssem) awS412S0200000_11.l1).jm());
    }

    public static final Object invoke$66(AwS412S0200000_11 awS412S0200000_11) {
        return C603280NlO.LIZ((VideoItemParams) awS412S0200000_11.l0, ((AIGCOverLabelBannerAssem) awS412S0200000_11.l1).jm());
    }

    public static /* bridge */ /* synthetic */ Object invoke$67(AwS412S0200000_11 awS412S0200000_11) {
        return ((InterfaceC451590HnJ) awS412S0200000_11.l0).LIZ((LifecycleOwner) ((Function0) awS412S0200000_11.l1).invoke());
    }

    public static /* bridge */ /* synthetic */ Object invoke$68(AwS412S0200000_11 awS412S0200000_11) {
        return ((InterfaceC451590HnJ) awS412S0200000_11.l0).LIZ((LifecycleOwner) ((Function0) awS412S0200000_11.l1).invoke());
    }

    public static final Object invoke$69(AwS412S0200000_11 awS412S0200000_11) {
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBeforeFullPageClosed photosShareVM: ");
        sbLIZ.append((PhotoSharedViewModel) awS412S0200000_11.l0);
        sbLIZ.append(", lastSeenPosition: ");
        sbLIZ.append(((PhotoSharedViewModel) awS412S0200000_11.l0).LLJ);
        sbLIZ.append(", lastPreviousProgress: ");
        sbLIZ.append(((PhotoSharedViewModel) awS412S0200000_11.l0).LLJI);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        InterfaceC717050SAt interfaceC717050SAt = ((C717020SAq) awS412S0200000_11.l1).LJFF;
        PhotoSharedViewModel photoSharedViewModel = (PhotoSharedViewModel) awS412S0200000_11.l0;
        interfaceC717050SAt.K6(photoSharedViewModel.LLJ, photoSharedViewModel.LLJILJILJ);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS412S0200000_11 awS412S0200000_11) {
        ((Function1) awS412S0200000_11.l0).invoke((InterfaceC0148002o) awS412S0200000_11.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$70(AwS412S0200000_11 awS412S0200000_11) {
        C0HTT<C737030Svd> c0htt;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C721190SQr c721190SQr = C721190SQr.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFullPageClosed exitMethod: ");
        sbLIZ.append(((PhotoSharedViewModel) awS412S0200000_11.l0).LLJILJIL);
        sbLIZ.append(", photosShareVM: ");
        sbLIZ.append((PhotoSharedViewModel) awS412S0200000_11.l0);
        C2188811AlT.LIZIZ(sbLIZ);
        c721190SQr.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isPlayerPaused: ");
        sbLIZ2.append(((PhotoSharedViewModel) awS412S0200000_11.l0).LLILZLL);
        sbLIZ2.append(", isAutoAdvancePausedUntilManualResume: ");
        sbLIZ2.append(((PhotoSharedViewModel) awS412S0200000_11.l0).LLIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        C717020SAq c717020SAq = (C717020SAq) awS412S0200000_11.l1;
        C696330RTb c696330RTb = c717020SAq.LJ;
        if (c696330RTb != null) {
            c696330RTb.LLJIJIL = false;
        }
        if (((PhotoSharedViewModel) awS412S0200000_11.l0).LLJILJIL == EnumC721170SQp.PULL_UP) {
            if (c696330RTb != null) {
                c696330RTb.LLJIJIL = false;
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = c717020SAq.LIZLLL;
            if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
                iViewPagerComponentAbilityMb.rH();
            }
        }
        PostModeEgressEtData postModeEgressEtData = ((PhotoSharedViewModel) awS412S0200000_11.l0).LLIZLLLIL;
        if (postModeEgressEtData != null) {
            C717020SAq c717020SAq2 = (C717020SAq) awS412S0200000_11.l1;
            C696330RTb c696330RTb2 = c717020SAq2.LJ;
            if (c696330RTb2 != null) {
                c696330RTb2.LLJI = System.currentTimeMillis();
                c696330RTb2.LLJILJIL = postModeEgressEtData;
                c696330RTb2.LLJILJILJ = postModeEgressEtData.videoPlayTimeAccumulated;
            }
            if (postModeEgressEtData.isVideoPlayFinishReported) {
                c717020SAq2.LIZ.LLJILLL.LIZLLL = false;
            }
            int i = postModeEgressEtData.loopTimesInDetailPage;
            if (i > 0) {
                PhotoViewModelV2 photoViewModelV2 = c717020SAq2.LIZ;
                photoViewModelV2.getClass();
                photoViewModelV2.setState(new AwS26S0001000_11(i, 8));
            }
        }
        C717020SAq c717020SAq3 = (C717020SAq) awS412S0200000_11.l1;
        PhotoSharedViewModel photoSharedViewModel = (PhotoSharedViewModel) awS412S0200000_11.l0;
        boolean z = photoSharedViewModel.LLILZLL;
        boolean z2 = photoSharedViewModel.LLIZ;
        long j = photoSharedViewModel.LLJIJIL;
        EnumC721170SQp enumC721170SQp = photoSharedViewModel.LLJILJIL;
        PhotoViewModelV2 photoViewModelV22 = c717020SAq3.LIZ;
        photoViewModelV22.LLJI = j;
        photoViewModelV22.PQ2();
        if (z2) {
            c717020SAq3.LIZ.wQ2();
        } else {
            c717020SAq3.LIZ.xQ2();
        }
        if (z) {
            if (C304280BwI.LIZIZ()) {
                c717020SAq3.LIZ.KQ2();
                C786410Ut5.LJLIIL(200L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS111S0100000_11(c717020SAq3, 124));
            } else {
                C786410Ut5.LJLIIL(200L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS111S0100000_11(c717020SAq3, 125));
            }
        } else {
            if (C304280BwI.LIZIZ()) {
                c717020SAq3.LIZ.LQ2();
            }
            c717020SAq3.LIZ.LLJJ = false;
        }
        if (enumC721170SQp == EnumC721170SQp.DELETE && (c0htt = c717020SAq3.LJI) != null) {
            c0htt.LLIIL(new C737030Svd(2, c717020SAq3.LIZJ.getAweme()));
        }
        c717020SAq3.LJFF.Qk(enumC721170SQp);
        return Unit.LIZ;
    }

    public static final Object invoke$71(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.LinearLayout*/.onInterceptTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$72(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.LinearLayout*/.onInterceptTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$73(AwS412S0200000_11 awS412S0200000_11) {
        C23250099c.LIZLLL((InterfaceC497601wk) awS412S0200000_11.l0, null, null, new C729360SjG((C729440SjO) awS412S0200000_11.l1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$74(AwS412S0200000_11 awS412S0200000_11) {
        return Integer.valueOf(((C0SZT) awS412S0200000_11.l0).LIZLLL().indexOf((C0SZS) awS412S0200000_11.l1));
    }

    public static final Object invoke$75(AwS412S0200000_11 awS412S0200000_11) {
        ((ReactionBubbleDescriptionCell) awS412S0200000_11.l0).N5((C720890SPn) awS412S0200000_11.l1);
        return null;
    }

    public static final Object invoke$76(AwS412S0200000_11 awS412S0200000_11) {
        String labelName;
        AwemeRawAd awemeRawAd;
        AwemeTextLabelModel label;
        Aweme aweme = (Aweme) awS412S0200000_11.l0;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (label = awemeRawAd.getLabel()) == null || (labelName = label.getLabelName()) == null) {
            labelName = "Sponsored";
        }
        return new C0SIR(labelName, C1697810uHb.LJIILJJIL(C717720SDi.LIZ((Context) awS412S0200000_11.l1, (Aweme) awS412S0200000_11.l0), new C0HD1(0.0f, 0, C0GWY.class)), C0SIK.CUSTOM_CLICK_SPAN, 8);
    }

    public static final Object invoke$77(AwS412S0200000_11 awS412S0200000_11) {
        List listLJ = ((C0ROM) awS412S0200000_11.l0).LJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
        Iterator it2 = listLJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C0ROM) it2.next()).LJI());
        }
        return C13LP.LJLLLL(new AComparatorS504S0100000_5((C694940RNs) awS412S0200000_11.l1, 6), arrayList);
    }

    public static /* bridge */ /* synthetic */ Object invoke$78(AwS412S0200000_11 awS412S0200000_11) {
        String str;
        InterfaceC1443605kw result;
        List<String> listLIZ;
        InterfaceC1444205l2 interfaceC1444205l2 = ((C0RXZ) awS412S0200000_11.l0).LJIIJ().LIZIZ;
        if (interfaceC1444205l2 != null && (result = interfaceC1444205l2.getResult()) != null && (listLIZ = result.LIZ()) != null) {
            str = (String) C13LP.LJJJLL(listLIZ);
        } else {
            str = null;
        }
        ((VideoItemParams) C631370Opb.LIZ((FeedBottomButtonContainer) awS412S0200000_11.l1)).getAweme().getAid();
        new AwS96S1000000_11(str, 11);
        C0T6L.LIZLLL();
        if (str != null) {
            ((VideoItemParams) C631370Opb.LIZ((FeedBottomButtonContainer) awS412S0200000_11.l1)).getAweme().getAid();
            new AwS96S1000000_11(str, 12);
            C0T6L.LIZLLL();
            C786410Ut5.LJLLLLLL(0, ((FeedBottomButtonContainer) awS412S0200000_11.l1).LJJIJL());
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) ((FeedBottomButtonContainer) awS412S0200000_11.l1).LLLII.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.CL(str, (FeedBottomButtonContainer) awS412S0200000_11.l1, true);
            }
        } else {
            InteractAreaCommonAbility interactAreaCommonAbility2 = (InteractAreaCommonAbility) ((FeedBottomButtonContainer) awS412S0200000_11.l1).LLLII.getValue();
            if (interactAreaCommonAbility2 != null) {
                interactAreaCommonAbility2.CL(null, (FeedBottomButtonContainer) awS412S0200000_11.l1, false);
            }
            C0RWZ c0rwz = ((FeedBottomButtonContainer) awS412S0200000_11.l1).LLJLLL;
            if (c0rwz != null) {
                c0rwz.qa(null);
            }
            ((C0RXZ) awS412S0200000_11.l0).LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$79(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed Button Layer receive timing callback. signal#: ");
        sbLIZ.append((C698680Ras) awS412S0200000_11.l0);
        sbLIZ.append(". current_aid: ");
        sbLIZ.append(((VideoItemParams) ((FeedBottomButtonContainer) awS412S0200000_11.l1).bo()).getAweme().getAid());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.FrameLayout*/.dispatchTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$80(AwS412S0200000_11 awS412S0200000_11) {
        C0RWZ c0rwz = ((FeedBottomButtonContainer) awS412S0200000_11.l0).LLJLLL;
        if (c0rwz != null) {
            c0rwz.qa(null);
        }
        ((C0RXZ) awS412S0200000_11.l1).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$81(AwS412S0200000_11 awS412S0200000_11) {
        if (((C0SOM) awS412S0200000_11.l0).LLLLZIL) {
            ((C0SU0) awS412S0200000_11.l1).suppressLayout(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$82(AwS412S0200000_11 awS412S0200000_11) {
        ((C0SOM) awS412S0200000_11.l0).setUnderUserAction(false);
        ((C0SU0) awS412S0200000_11.l1).suppressLayout(false);
        return Unit.LIZ;
    }

    public static final Object invoke$83(AwS412S0200000_11 awS412S0200000_11) {
        Lifecycle.State currentState;
        Lifecycle lifecycle;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Assem.Supervisor Error: \n eventType:");
            sbLIZ.append(((AdMultiContentViewHolder) awS412S0200000_11.l0).LLJILJILJ.LJIIIZ);
            sbLIZ.append(", fragment:");
            sbLIZ.append(((AdMultiContentViewHolder) awS412S0200000_11.l0).E82());
            sbLIZ.append(", supervisor:");
            sbLIZ.append((AssemSupervisor) awS412S0200000_11.l1);
            sbLIZ.append(", paren state:");
            LifecycleOwner lifecycleOwnerE82 = ((AdMultiContentViewHolder) awS412S0200000_11.l0).E82();
            if (lifecycleOwnerE82 != null && (lifecycle = lifecycleOwnerE82.getLifecycle()) != null) {
                currentState = lifecycle.getCurrentState();
            } else {
                currentState = null;
            }
            sbLIZ.append(currentState);
            sbLIZ.append(",state:");
            sbLIZ.append(((AdMultiContentViewHolder) awS412S0200000_11.l0).getLifecycle().getCurrentState());
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final Object invoke$84(AwS412S0200000_11 awS412S0200000_11) {
        AbstractC724890Sc3 abstractC724890Sc3 = (AbstractC724890Sc3) awS412S0200000_11.l0;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) awS412S0200000_11.l1;
        abstractC724890Sc3.getClass();
        while (!linkedBlockingQueue.isEmpty()) {
            ((Runnable) linkedBlockingQueue.take()).run();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$85(AwS412S0200000_11 awS412S0200000_11) {
        C786410Ut5.E3(((ViewGroup) awS412S0200000_11.l0).getViewTreeObserver(), (ViewTreeObserver.OnScrollChangedListener) awS412S0200000_11.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$86(AwS412S0200000_11 awS412S0200000_11) {
        String str;
        int i;
        String str2;
        int i2;
        PostModeDetailParams postModeDetailParams = (PostModeDetailParams) awS412S0200000_11.l0;
        String str3 = "";
        if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        String aid = ((Aweme) awS412S0200000_11.l1).getAid();
        Aweme aweme = (Aweme) awS412S0200000_11.l1;
        PostModeDetailParams postModeDetailParams2 = (PostModeDetailParams) awS412S0200000_11.l0;
        if (postModeDetailParams2 != null) {
            i = postModeDetailParams2.pageType;
        } else {
            i = 0;
        }
        String strLJIJ = C735370Ssx.LJIJ(i, aweme);
        PostModeDetailParams postModeDetailParams3 = (PostModeDetailParams) awS412S0200000_11.l0;
        String str4 = null;
        if (postModeDetailParams3 != null) {
            str2 = postModeDetailParams3.previousPage;
        } else {
            str2 = null;
        }
        int awemeType = ((Aweme) awS412S0200000_11.l1).getAwemeType();
        PhotoModeImageInfo photoModeImageInfo = ((Aweme) awS412S0200000_11.l1).getPhotoModeImageInfo();
        if (photoModeImageInfo != null && photoModeImageInfo.hasTitle()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme2 = (Aweme) awS412S0200000_11.l1;
        PostModeDetailParams postModeDetailParams4 = (PostModeDetailParams) awS412S0200000_11.l0;
        linkedHashMap.put("action_from_page", "graphic_panel");
        linkedHashMap.put("request_id", C735370Ssx.LJIJJ(aweme2));
        linkedHashMap.put("pic_cnt", String.valueOf(C735370Ssx.LJIILL(aweme2)));
        String logPbString = aweme2.getLogPbString();
        if (logPbString != null) {
            str3 = logPbString;
        }
        linkedHashMap.put("log_pb", str3);
        if (C720360SNm.LJI(aweme2) || C720360SNm.LJIIJJI(aweme2)) {
            linkedHashMap.put("is_text_mode", "1");
        }
        if (C720360SNm.LJIIJJI(aweme2)) {
            linkedHashMap.put("is_text_trans_pic", "1");
        }
        if (C720360SNm.LJFF(aweme2)) {
            linkedHashMap.put("is_comment_to_post", "1");
        }
        if (postModeDetailParams4 != null) {
            str4 = postModeDetailParams4.eventType;
        }
        C1205210hT5.LIZ(aweme2, linkedHashMap, str4, "follow");
        C1489005sG.LIZ(aweme2, linkedHashMap);
        int iLJII = C720360SNm.LJII((Aweme) awS412S0200000_11.l1);
        int iLJIIJ = C720360SNm.LJIIJ((Aweme) awS412S0200000_11.l1);
        String authorUid = AwemeExtKt.getAuthorUid((Aweme) awS412S0200000_11.l1);
        Map<String, String> mapLIZIZ = C1348720lCY.LIZIZ((Aweme) awS412S0200000_11.l1);
        int iLIZ = C721220SQu.LIZ((Aweme) awS412S0200000_11.l1);
        int iLIZIZ = C721220SQu.LIZIZ((Aweme) awS412S0200000_11.l1);
        return new C1260960iv0(str, (User) null, "", (String) (0 == true ? 1 : 0), str2, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), aid, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 0, (int) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), strLJIJ, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), Integer.valueOf(awemeType), "graphic_detail", Integer.valueOf(i2), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Map) linkedHashMap, (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), authorUid, iLJII, iLJIIJ, (Integer) (0 == true ? 1 : 0), (Map) mapLIZIZ, (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), Integer.valueOf(iLIZ), Integer.valueOf(C721220SQu.LIZ((Aweme) awS412S0200000_11.l1) - C721220SQu.LIZIZ((Aweme) awS412S0200000_11.l1)), Integer.valueOf(iLIZIZ), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1247120iYg) (0 == true ? 1 : 0), (Map) (0 == true ? 1 : 0), -134250518, -377489521, 16327);
    }

    public static final Object invoke$87(AwS412S0200000_11 awS412S0200000_11) {
        C0SX4 c0sx4 = (C0SX4) awS412S0200000_11.l0;
        TextView textView = (TextView) awS412S0200000_11.l1;
        c0sx4.getClass();
        String strLJIIJ = C0SX4.LJIIJ(textView);
        if (strLJIIJ != null) {
            try {
                C20145813s8.LIZ("post_mode_text", strLJIIJ, c0sx4.LIZIZ, CertProviderManagerKt.findCert("bpea-detail_page_copy_search", 1476399162));
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1389880mGw c1389880mGw = new C1389880mGw(textView);
            c1389880mGw.LIZLLL(3000L);
            c1389880mGw.LJIIIIZZ(2131821458);
            c1389880mGw.LJIIJ();
            C0SX8 c0sx8 = C0SX8.LIZ;
            int length = strLJIIJ.length();
            String str = c0sx4.LIZLLL;
            String str2 = c0sx4.LJ;
            String str3 = c0sx4.LJFF;
            c0sx8.getClass();
            C0SX8.LIZ(length, "copy", str, str2, str3);
            C721190SQr c721190SQr = C721190SQr.LIZ;
            Aweme aweme = c0sx4.LIZJ;
            PostModeDetailParams postModeDetailParams = c0sx4.LJI.LJII;
            c721190SQr.getClass();
            C721190SQr.LJIJI(aweme, postModeDetailParams, "copy");
            c0sx4.LJIIIIZZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$88(AwS412S0200000_11 awS412S0200000_11) {
        C0SX4 c0sx4 = (C0SX4) awS412S0200000_11.l0;
        TextView textView = (TextView) awS412S0200000_11.l1;
        c0sx4.getClass();
        String strLJIIJ = C0SX4.LJIIJ(textView);
        if (strLJIIJ != null) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            Context context = c0sx4.LIZIZ;
            Aweme aweme = c0sx4.LIZJ;
            String str = c0sx4.LIZLLL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = c0sx4.LJ;
            if (str3 != null) {
                str2 = str3;
            }
            c1er1.LJJLIIIJLLLLLLLZ(context, strLJIIJ, aweme, str, str2);
            C0SX8 c0sx8 = C0SX8.LIZ;
            int length = strLJIIJ.length();
            String str4 = c0sx4.LIZLLL;
            String str5 = c0sx4.LJ;
            String str6 = c0sx4.LJFF;
            c0sx8.getClass();
            C0SX8.LIZ(length, "search", str4, str5, str6);
            C721190SQr c721190SQr = C721190SQr.LIZ;
            Aweme aweme2 = c0sx4.LIZJ;
            PostModeDetailParams postModeDetailParams = c0sx4.LJI.LJII;
            c721190SQr.getClass();
            C721190SQr.LJIJI(aweme2, postModeDetailParams, "search");
            c0sx4.LJIIIIZZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$89(AwS412S0200000_11 awS412S0200000_11) {
        ((TuxSheet) awS412S0200000_11.l0).dismiss();
        Function0 function0 = (Function0) awS412S0200000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS412S0200000_11 awS412S0200000_11) {
        return Boolean.valueOf(super/*android.widget.FrameLayout*/.onInterceptTouchEvent((MotionEvent) awS412S0200000_11.l1));
    }

    public static final Object invoke$90(AwS412S0200000_11 awS412S0200000_11) {
        ((TuxSheet) awS412S0200000_11.l0).dismiss();
        Function0 function0 = (Function0) awS412S0200000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$91(AwS412S0200000_11 awS412S0200000_11) {
        List<InterfaceC719500SKe> list = ((PostModePhotosComponent) awS412S0200000_11.l0).LLLILZLLLI;
        SlidesImageLoadParams slidesImageLoadParams = (SlidesImageLoadParams) awS412S0200000_11.l1;
        for (InterfaceC719500SKe interfaceC719500SKe : (ArrayList) list) {
            if (interfaceC719500SKe != null) {
                interfaceC719500SKe.p2(slidesImageLoadParams);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$92(AwS412S0200000_11 awS412S0200000_11) {
        List<InterfaceC719500SKe> list = ((PostModePhotosComponent) awS412S0200000_11.l0).LLLILZLLLI;
        SlidesImageLoadParams slidesImageLoadParams = (SlidesImageLoadParams) awS412S0200000_11.l1;
        for (InterfaceC719500SKe interfaceC719500SKe : (ArrayList) list) {
            if (interfaceC719500SKe != null) {
                interfaceC719500SKe.p2(slidesImageLoadParams);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$93(AwS412S0200000_11 awS412S0200000_11) {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        return new C1260960iv0(((C1607100rvI) awS412S0200000_11.l0).LJFF(), (User) awS412S0200000_11.l1, "top_cell", (String) null, (String) objArr, (String) objArr2, (Integer) objArr3, (String) objArr4, (String) objArr5, (String) objArr6, (String) objArr7, (String) objArr8, (String) objArr9, (String) objArr10, (String) objArr11, "story", (String) objArr12, 0, (int) (0 == true ? 1 : 0), (Boolean) objArr13, (int) (0 == true ? 1 : 0), (String) objArr14, (boolean) (0 == true ? 1 : 0), (Boolean) objArr15, (Boolean) objArr16, (String) objArr17, (String) objArr18, (String) objArr19, (String) objArr20, (String) objArr21, (String) objArr22, (String) objArr23, (String) objArr24, (String) objArr25, (Integer) objArr26, (String) objArr27, (Integer) objArr28, (String) objArr29, (int) (0 == true ? 1 : 0), (String) objArr30, (Boolean) objArr31, (Map) objArr32, (String) objArr33, (Integer) objArr34, (Integer) objArr35, (String) objArr36, (String) objArr37, (int) (0 == true ? 1 : 0), (String) objArr38, (Long) objArr39, (int) (0 == true ? 1 : 0), (Integer) objArr40, (String) objArr41, (String) objArr42, (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) objArr43, (Map) objArr44, (String) objArr45, (Boolean) objArr46, (Integer) objArr47, (Integer) objArr48, (String) objArr49, (String) objArr50, (Integer) objArr51, (Integer) objArr52, (Integer) objArr53, (String) objArr54, (String) objArr55, (String) objArr56, (Integer) objArr57, (Integer) objArr58, (String) objArr59, (C1247120iYg) objArr60, (Map) objArr61, -65544, -1, 16383);
    }

    public static final Object invoke$94(AwS412S0200000_11 awS412S0200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed Annotation Layer receive timing callback. signal#: ");
        sbLIZ.append((C698680Ras) awS412S0200000_11.l0);
        sbLIZ.append(". current_aid: ");
        sbLIZ.append(((VideoItemParams) ((BaseFcpDecisionContainer) awS412S0200000_11.l1).bo()).getAweme().getAid());
        sbLIZ.append('.');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$95(AwS412S0200000_11 awS412S0200000_11) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = true;
        if (C305550ByL.LIZLLL() && C104100aN.LIZ().LJIILIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (C0BX9.LIZ() || z) {
            z2 = false;
        }
        C723830SaL.LIZJ((ReusedUIAssem) awS412S0200000_11.l0, C13LE.LIZ(((ReusedUIContentAssem) awS412S0200000_11.l1).getClass()), z2);
        if (z2) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
    }

    public static final Object invoke$96(AwS412S0200000_11 awS412S0200000_11) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = true;
        if (C305550ByL.LIZLLL() && C104100aN.LIZ().LJIILIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (C0BX9.LIZ() || z) {
            z2 = false;
        }
        C723830SaL.LIZJ((ReusedUIAssem) awS412S0200000_11.l0, C13LE.LIZ(((ReusedUIContentAssem) awS412S0200000_11.l1).getClass()), z2);
        if (z2) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
    }

    public static final Object invoke$97(AwS412S0200000_11 awS412S0200000_11) {
        ((IIMService) awS412S0200000_11.l0).getImChatService().LJIILLIIL((EnterChatParams) awS412S0200000_11.l1, null);
        return Unit.LIZ;
    }

    public static final Object invoke$98(AwS412S0200000_11 awS412S0200000_11) {
        AwS447S0200000_11 awS447S0200000_11 = ((C0SC0) awS412S0200000_11.l0).LJJIJIL;
        if (awS447S0200000_11 != null) {
            awS447S0200000_11.invoke(((ComposeView) awS412S0200000_11.l1).getContext(), Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$99(AwS412S0200000_11 awS412S0200000_11) {
        C0SA5 c0sa5 = (C0SA5) awS412S0200000_11.l0;
        PhotoViewModelV2 photoViewModelV2 = (PhotoViewModelV2) awS412S0200000_11.l1;
        c0sa5.LJIILL = photoViewModelV2.LLILZIL;
        c0sa5.LJIILLIIL = photoViewModelV2.LLILZLL;
        AwS555S0100000_11 awS555S0100000_11 = photoViewModelV2.LLJIJIL;
        if (awS555S0100000_11 != null) {
            awS555S0100000_11.invoke();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS412S0200000_11(android.content.Context r3, com.ss.android.ugc.aweme.feed.model.Aweme r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 62 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS412S0200000_11.<init>(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS412S0200000_11(com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer r3, X.C0RXZ r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 78 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS412S0200000_11.<init>(com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer, X.0RXZ, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C238400w2 c238400w2, C701010Red c701010Red, int i) {
        super(0);
        this.$t = i;
        this.l0 = c238400w2;
        this.l1 = c701010Red;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(InterfaceC497601wk interfaceC497601wk, C729440SjO c729440SjO, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC497601wk;
        this.l1 = c729440SjO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(InterfaceC451590HnJ interfaceC451590HnJ, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC451590HnJ;
        this.l1 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(C0ROM c0rom, C0ROM<VideoItemParams, C690870R8b> c0rom2, C694940RNs c694940RNs) {
        super(0);
        this.$t = c694940RNs;
        this.l0 = c0rom;
        this.l1 = c0rom2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0RXZ c0rxz, C0RY5 c0ry5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0rxz;
        this.l1 = c0ry5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0RZK c0rzk, InteractBottomBannerComponent interactBottomBannerComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0rzk;
        this.l1 = interactBottomBannerComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C698680Ras c698680Ras, InteractBottomBannerComponent interactBottomBannerComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c698680Ras;
        this.l1 = interactBottomBannerComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(C698680Ras c698680Ras, C698680Ras c698680Ras2, BaseFcpDecisionContainer<C03H5> baseFcpDecisionContainer) {
        super(0);
        this.$t = baseFcpDecisionContainer;
        this.l0 = c698680Ras;
        this.l1 = c698680Ras2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C698680Ras c698680Ras, VideoBottomDescLabelContainer videoBottomDescLabelContainer, int i) {
        super(0);
        this.$t = i;
        this.l0 = c698680Ras;
        this.l1 = videoBottomDescLabelContainer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C698680Ras c698680Ras, FcpMetaTagContainer fcpMetaTagContainer, int i) {
        super(0);
        this.$t = i;
        this.l0 = c698680Ras;
        this.l1 = fcpMetaTagContainer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C698680Ras c698680Ras, FeedBottomButtonContainer feedBottomButtonContainer, int i) {
        super(0);
        this.$t = i;
        this.l0 = c698680Ras;
        this.l1 = feedBottomButtonContainer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C700930ReV c700930ReV, FcpNodeProtocol fcpNodeProtocol, int i) {
        super(0);
        this.$t = i;
        this.l0 = c700930ReV;
        this.l1 = fcpNodeProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(AbstractC705030Rl7 abstractC705030Rl7, AbstractC705030Rl7<T> abstractC705030Rl72, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = abstractC705030Rl7;
        this.l1 = abstractC705030Rl72;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C708990RrV c708990RrV, MotionEvent motionEvent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c708990RrV;
        this.l1 = motionEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C709160Rrm c709160Rrm, MotionEvent motionEvent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c709160Rrm;
        this.l1 = motionEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0S48 c0s48, C0SZ8 c0sz8, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0s48;
        this.l1 = c0sz8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0S9I c0s9i, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0s9i;
        this.l1 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0SA5 c0sa5, PhotoViewModelV2 photoViewModelV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0sa5;
        this.l1 = photoViewModelV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0SC0 c0sc0, ComposeView composeView, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0sc0;
        this.l1 = composeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0SOM c0som, C0SU0 c0su0, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0som;
        this.l1 = c0su0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0SQH c0sqh, MotionEvent motionEvent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0sqh;
        this.l1 = motionEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0SUQ c0suq, MotionEvent motionEvent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0suq;
        this.l1 = motionEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C0SUU c0suu, MotionEvent motionEvent, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0suu;
        this.l1 = motionEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C722760SWs c722760SWs, C19EG c19eg, int i) {
        super(0);
        this.$t = i;
        this.l0 = c722760SWs;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(C0SZN c0szn, C0SZN c0szn2, C0SZS<?, ?> c0szs) {
        super(0);
        this.$t = c0szs;
        this.l0 = c0szn;
        this.l1 = c0szn2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(C0SZT c0szt, C0SZT<R, ITEM> c0szt2, C0SZS<R, ITEM> c0szs) {
        super(0);
        this.$t = c0szs;
        this.l0 = c0szt;
        this.l1 = c0szt2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(AbstractC724890Sc3 abstractC724890Sc3, AbstractC724890Sc3 abstractC724890Sc32, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        super(0);
        this.$t = linkedBlockingQueue;
        this.l0 = abstractC724890Sc3;
        this.l1 = abstractC724890Sc32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(AbstractC725500Sd2 abstractC725500Sd2, AbstractC725500Sd2<Object> abstractC725500Sd22, Function0<Object> function0) {
        super(0);
        this.$t = function0;
        this.l0 = abstractC725500Sd2;
        this.l1 = abstractC725500Sd22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C1607100rvI c1607100rvI, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1607100rvI;
        this.l1 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(C19EG c19eg, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(ViewGroup viewGroup, C0SX6 c0sx6, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = c0sx6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(TextView textView, C0SX4 c0sx4, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0sx4;
        this.l1 = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(Fragment fragment, Assembler assembler, int i) {
        super(0);
        this.$t = i;
        this.l0 = assembler;
        this.l1 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(TuxSheet tuxSheet, AwS555S0100000_11 awS555S0100000_11, int i) {
        super(0);
        this.$t = i;
        this.l0 = tuxSheet;
        this.l1 = awS555S0100000_11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(ReactionBubbleDescriptionCell reactionBubbleDescriptionCell, C720890SPn c720890SPn, int i) {
        super(0);
        this.$t = i;
        this.l0 = reactionBubbleDescriptionCell;
        this.l1 = c720890SPn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(ExploreFeedCell exploreFeedCell, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = exploreFeedCell;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(VideoFeedMultiTagTrigger videoFeedMultiTagTrigger, VideoItemParams videoItemParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = videoFeedMultiTagTrigger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(AdMultiContentViewHolder adMultiContentViewHolder, AssemSupervisor assemSupervisor, int i) {
        super(0);
        this.$t = i;
        this.l0 = adMultiContentViewHolder;
        this.l1 = assemSupervisor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(FeedAvatarDefaultAssem feedAvatarDefaultAssem, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = feedAvatarDefaultAssem;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(FollowButtonFFPAssem followButtonFFPAssem, VideoItemParams videoItemParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = followButtonFFPAssem;
        this.l1 = videoItemParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(LongPressEmojiAnimAssem longPressEmojiAnimAssem, C0RSR c0rsr, int i) {
        super(0);
        this.$t = i;
        this.l0 = longPressEmojiAnimAssem;
        this.l1 = c0rsr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(VideoExposeSharerInformationAssem videoExposeSharerInformationAssem, C1233440iCc c1233440iCc, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoExposeSharerInformationAssem;
        this.l1 = c1233440iCc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(TUCReportMaskAssem tUCReportMaskAssem, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = tUCReportMaskAssem;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(ShareUnreadVideoQuickDMAssem shareUnreadVideoQuickDMAssem, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = shareUnreadVideoQuickDMAssem;
        this.l1 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(VideoCommentAssem videoCommentAssem, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoCommentAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(FriendsDetailTransitionAssem friendsDetailTransitionAssem, FriendsDetailTransitionAssem friendsDetailTransitionAssem2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = friendsDetailTransitionAssem;
        this.l1 = friendsDetailTransitionAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(FriendsDetailTransitionAssem friendsDetailTransitionAssem, AwS568S0100000_24 awS568S0100000_24, int i) {
        super(0);
        this.$t = i;
        this.l0 = friendsDetailTransitionAssem;
        this.l1 = awS568S0100000_24;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(Aweme aweme, VideoShareViewModel videoShareViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = videoShareViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(Aweme aweme, PostModeDetailParams postModeDetailParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = postModeDetailParams;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(VideoItemParams videoItemParams, ReportViewAssem reportViewAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = reportViewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(VideoItemParams videoItemParams, StoryBottomBarContainerComponent storyBottomBarContainerComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = storyBottomBarContainerComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(VideoItemParams videoItemParams, FeedCommonBannerAssem feedCommonBannerAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = feedCommonBannerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(VideoItemParams videoItemParams, AIGCOverLabelBannerAssem aIGCOverLabelBannerAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = aIGCOverLabelBannerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(VideoItemParams videoItemParams, VideoTagContainer videoTagContainer, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = videoTagContainer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(ConditionData conditionData, ConditionData conditionData2, AbstractC634910OvJ<Object> abstractC634910OvJ) {
        super(0);
        this.$t = abstractC634910OvJ;
        this.l0 = conditionData;
        this.l1 = conditionData2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(IStandardModelProvider iStandardModelProvider, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = iStandardModelProvider;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(IIMService iIMService, EnterChatParams enterChatParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = iIMService;
        this.l1 = enterChatParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(PhotoFeedLivePhotoComponent photoFeedLivePhotoComponent, PhotoFeedLivePhotoComponent photoFeedLivePhotoComponent2, C291001Au<String> c291001Au) {
        super(0);
        this.$t = c291001Au;
        this.l0 = photoFeedLivePhotoComponent;
        this.l1 = photoFeedLivePhotoComponent2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(PhotoFeedLivePhotoComponent photoFeedLivePhotoComponent, VideoItemParams videoItemParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = photoFeedLivePhotoComponent;
        this.l1 = videoItemParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(LivePhotoViewHolder livePhotoViewHolder, C719950SLx c719950SLx, int i) {
        super(0);
        this.$t = i;
        this.l0 = livePhotoViewHolder;
        this.l1 = c719950SLx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(LivePhotoViewHolder livePhotoViewHolder, InterfaceC1479620obg interfaceC1479620obg, int i) {
        super(0);
        this.$t = i;
        this.l0 = livePhotoViewHolder;
        this.l1 = interfaceC1479620obg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(SlidesImageLoadParams slidesImageLoadParams, C0SAZ c0saz, int i) {
        super(0);
        this.$t = i;
        this.l0 = slidesImageLoadParams;
        this.l1 = c0saz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(StoryFeedViewModel storyFeedViewModel, UserStory userStory, int i) {
        super(0);
        this.$t = i;
        this.l0 = storyFeedViewModel;
        this.l1 = userStory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(ImmersiveStoryFollowAssem immersiveStoryFollowAssem, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = immersiveStoryFollowAssem;
        this.l1 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(StoryGalleryNavBarAssem storyGalleryNavBarAssem, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = storyGalleryNavBarAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(StoryViewerNavBarAssem storyViewerNavBarAssem, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = storyViewerNavBarAssem;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(PhotoSharedViewModel photoSharedViewModel, C717020SAq c717020SAq, int i) {
        super(0);
        this.$t = i;
        this.l0 = photoSharedViewModel;
        this.l1 = c717020SAq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(PhotoNumIndicatorAssem photoNumIndicatorAssem, C716660S9g c716660S9g, int i) {
        super(0);
        this.$t = i;
        this.l0 = photoNumIndicatorAssem;
        this.l1 = c716660S9g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(PhotosViewHolderV3 photosViewHolderV3, C719950SLx c719950SLx, int i) {
        super(0);
        this.$t = i;
        this.l0 = photosViewHolderV3;
        this.l1 = c719950SLx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(FeedContentLayoutInfo feedContentLayoutInfo, SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = feedContentLayoutInfo;
        this.l1 = smartImagePhotoViewHolderV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(PostModePhotosComponent postModePhotosComponent, SlidesImageLoadParams slidesImageLoadParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = postModePhotosComponent;
        this.l1 = slidesImageLoadParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(BaseCellContentComponent baseCellContentComponent, ReusedUIContentAssem reusedUIContentAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseCellContentComponent;
        this.l1 = reusedUIContentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(FullScreenAboveInteractionComponent fullScreenAboveInteractionComponent, ReusedUIContentAssem reusedUIContentAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = fullScreenAboveInteractionComponent;
        this.l1 = reusedUIContentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(BottomLabelTriggerComponent bottomLabelTriggerComponent, BottomLabelTriggerComponent<RECEIVER> bottomLabelTriggerComponent2, ComponentPriorityProtocol componentPriorityProtocol) {
        super(0);
        this.$t = componentPriorityProtocol;
        this.l0 = bottomLabelTriggerComponent;
        this.l1 = bottomLabelTriggerComponent2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS412S0200000_11(AutoDubbingConsumptionLabelAssemV2 autoDubbingConsumptionLabelAssemV2, VideoItemParams videoItemParams, int i) {
        super(0);
        this.$t = i;
        this.l0 = autoDubbingConsumptionLabelAssemV2;
        this.l1 = videoItemParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS412S0200000_11(Function1 function1, Function1<InterfaceC0148002o, Unit> function12, InterfaceC0148002o interfaceC0148002o) {
        super(0);
        this.$t = interfaceC0148002o;
        this.l0 = function1;
        this.l1 = function12;
    }
}
