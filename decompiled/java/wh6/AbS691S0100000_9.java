package wh6;

import X.AbstractC1387200mCc;
import X.AbstractC1905540zge;
import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C036E;
import X.C050S;
import X.C0NNE;
import X.C0O2K;
import X.C0OLV;
import X.C0ONA;
import X.C0OP5;
import X.C0OPQ;
import X.C0OS1;
import X.C0OS2;
import X.C0OS3;
import X.C0OS4;
import X.C0OTQ;
import X.C0OTS;
import X.C0OYH;
import X.C0OYR;
import X.C0P0X;
import X.C0PEM;
import X.C0XQ7;
import X.C0XQS;
import X.C0XQT;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1196320hEk;
import X.C1227904rF;
import X.C123100dR;
import X.C1247510iZJ;
import X.C1252710ihh;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LP;
import X.C1443560nfW;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1629106Zl;
import X.C1697810uHb;
import X.C1906580ziK;
import X.C19319410i8;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C2344009Gk;
import X.C297140Bkm;
import X.C325700Cpk;
import X.C343950De5;
import X.C343970De7;
import X.C343980De8;
import X.C344010DeB;
import X.C418540Gb6;
import X.C447520Hgk;
import X.C465990IPd;
import X.C591720NIs;
import X.C591730NIt;
import X.C600100NgG;
import X.C615070OAn;
import X.C618930OPj;
import X.C619560ORu;
import X.C619600ORy;
import X.C621040OXm;
import X.C624290OeB;
import X.C624310OeD;
import X.C626800OiE;
import X.C629730Omx;
import X.C629740Omy;
import X.C630980Ooy;
import X.C631370Opb;
import X.C631640Oq2;
import X.C632050Oqh;
import X.C632090Oql;
import X.C632210Oqx;
import X.C633020OsG;
import X.C633710OtN;
import X.C637380OzI;
import X.C638340P2a;
import X.C638350P2b;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C814420VxA;
import X.C828330WeV;
import X.C844470XAv;
import X.EnumC587920N4c;
import X.EnumC624950OfF;
import X.EnumC626270OhN;
import X.EnumC631120OpC;
import X.InterfaceC1260110itd;
import X.InterfaceC1361890lXn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC456120Huc;
import X.InterfaceC634000Otq;
import X.InterfaceC634010Otr;
import X.InterfaceC665370Q7z;
import X.InterfaceC828360WeY;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinSubscriberUnSubscribeAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.create.BulletinBoardCreateAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic.BulletinShareMusicPresaveItemAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic.BulletinShareMusicSongItemAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.ability.BulletinCommentSheetAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.assem.BulletinCommentKeyboardInputAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.assem.BulletinCommentSheetAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentFoldFooterCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.powercell.BulletinCommentSheetCell;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinCommentAddCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinCommentContentCell;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinCommentTotalCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicPlayViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.EllipsisAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.FanSpotlightBlockVideoAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight.FanSpotlightEllipsisAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.spotlight.MusicCellSpotlightItemAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.spotlight.detail.SpotlightProfileDetailBottomComponent;
import com.ss.android.ugc.aweme.music.assem.list.cell.spotlight.detail.vm.SpotlightProfileDetailShareVM;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui.MediaCardHierarchyData;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui.MediaCoverAssem;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui.MusicAddSongButtonAssem;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui.OpenDspAssem;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.guide.FanSpotlightGuideSheetFragment;
import com.ss.android.ugc.aweme.music.fanspotlight.service.IMusicFanSpotlightService;
import com.ss.android.ugc.aweme.music.ghost.ClaimStatusMusicAssem;
import com.ss.android.ugc.aweme.music.ghost.GhostMusicAssem;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicBaseAssem;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicSelectIconAssem;
import com.ss.android.ugc.aweme.music.highlight.cell.assem.HighlightSelectMusicSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.AppleMusicToken;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspLinkState;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicETBusinessModule;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStruct;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.v2.assem.BulletinMusicDetailAssem;
import com.ss.android.ugc.aweme.music.v2.panel.MusicItemAssem;
import com.ss.android.ugc.aweme.music.v2.panel.ViewMusicDetailAbility;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.offlinemode.ui.OfflineModeDetailPageComponent;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageAssem;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.aweme.poi.detail.postcard.component.PoiPostNonPersonalizedUIComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.topic.review.panel.TopicRatingBarAssem;
import com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.ss.android.ugc.nearby.component.NearbyNonPersonalizedUIComponent;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursDetailScaffoldAssem;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS46S0100100_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public class AbS691S0100000_9 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, view);
                break;
            case 35:
                LIZ$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, view);
                break;
            case 37:
                LIZ$37(this, view);
                break;
            case 38:
                LIZ$38(this, view);
                break;
            case 39:
                LIZ$39(this, view);
                break;
            case 40:
                LIZ$40(this, view);
                break;
            case 41:
                LIZ$41(this, view);
                break;
            case 42:
                LIZ$42(this, view);
                break;
            case 43:
                LIZ$43(this, view);
                break;
            case 44:
                LIZ$44(this, view);
                break;
            case 45:
                LIZ$45(this, view);
                break;
            case 46:
                LIZ$46(this, view);
                break;
            case 47:
                LIZ$47(this, view);
                break;
            case 48:
                LIZ$48(this, view);
                break;
            case 49:
                LIZ$49(this, view);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                LIZ$50(this, view);
                break;
            case 51:
                LIZ$51(this, view);
                break;
            case 52:
                LIZ$52(this, view);
                break;
            case 53:
                LIZ$53(this, view);
                break;
            case 54:
                LIZ$54(this, view);
                break;
            case 55:
                LIZ$55(this, view);
                break;
            case 56:
                LIZ$56(this, view);
                break;
            case 57:
                LIZ$57(this, view);
                break;
            case 58:
                LIZ$58(this, view);
                break;
            case 59:
                LIZ$59(this, view);
                break;
            case 60:
                LIZ$60(this, view);
                break;
            case 61:
                LIZ$61(this, view);
                break;
            case BaseNotice.CREATOR /* 62 */:
                LIZ$62(this, view);
                break;
            case 63:
                LIZ$63(this, view);
                break;
            case 64:
                LIZ$64(this, view);
                break;
            case 65:
                LIZ$65(this, view);
                break;
            case 66:
                LIZ$66(this, view);
                break;
            case 67:
                LIZ$67(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS691S0100000_9(OfflineModeDetailPageComponent offlineModeDetailPageComponent, int i) {
        super(700L);
        this.$t = i;
        this.l0 = offlineModeDetailPageComponent;
    }

    public static final void LIZ$0(AbS691S0100000_9 abS691S0100000_9, View view) {
        C0OLV c0olvHh2;
        String str;
        if (view != null && (c0olvHh2 = ((BulletinSubscriberUnSubscribeAssem) abS691S0100000_9.l0).Hh2()) != null && c0olvHh2.LL != null) {
            BulletinSubscriberUnSubscribeAssem bulletinSubscriberUnSubscribeAssem = (BulletinSubscriberUnSubscribeAssem) abS691S0100000_9.l0;
            bulletinSubscriberUnSubscribeAssem.kp().setLoading(true);
            bulletinSubscriberUnSubscribeAssem.kp().setClickable(false);
            BulletinProfileViewModel bulletinProfileViewModelLp = ((BulletinSubscriberUnSubscribeAssem) abS691S0100000_9.l0).lp();
            Context context = ((BulletinSubscriberUnSubscribeAssem) abS691S0100000_9.l0).getContext();
            C0OLV c0olvHh22 = ((BulletinSubscriberUnSubscribeAssem) abS691S0100000_9.l0).Hh2();
            if (c0olvHh22 == null || (str = c0olvHh22.LLILLJJLI) == null) {
                str = "";
            }
            bulletinProfileViewModelLp.XQ2(context, "bulletin_board_page", str, new AwS588S0100000_9((BulletinSubscriberUnSubscribeAssem) abS691S0100000_9.l0, 43));
        }
    }

    public static final void LIZ$1(AbS691S0100000_9 abS691S0100000_9, View view) {
        Fragment fragmentLJI;
        ShootAbility shootAbility;
        if (view != null && (fragmentLJI = C724240Sb0.LJI((ShootAssem) abS691S0100000_9.l0)) != null && (shootAbility = (ShootAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ShootAbility.class, null)) != null) {
            shootAbility.lP0();
        }
    }

    public static final void LIZ$10(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentAbility bulletinCommentAbility;
        if (view != null && (bulletinCommentAbility = (BulletinCommentAbility) ((BulletinCommentTotalCell) abS691S0100000_9.l0).LLILZ.getValue()) != null) {
            bulletinCommentAbility.s82(false);
        }
    }

    public static final void LIZ$11(AbS691S0100000_9 abS691S0100000_9, View view) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (view != null) {
            EllipsisAssem ellipsisAssem = (EllipsisAssem) abS691S0100000_9.l0;
            ellipsisAssem.getClass();
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(2131846315);
            c1247510iZJ.LIZ(new AwS588S0100000_9(ellipsisAssem, 258));
            c1390850mIV.LIZIZ(c1247510iZJ);
            TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("button_name", "more");
            c2344009Gk.LIZJ(1, "is_self");
            C20684815ws.LJIILLIIL("music_tab_click_more", c2344009Gk.LIZ);
            Context context = ((EllipsisAssem) abS691S0100000_9.l0).getContext();
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                tuxActionSheetLIZJ.show(supportFragmentManager, "ellipsis");
            }
        }
    }

    public static final void LIZ$12(AbS691S0100000_9 abS691S0100000_9, View view) {
        String str;
        String string;
        int iHashCode;
        Object obj;
        String idStr;
        if (view != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((FanSpotlightBlockVideoAssem) abS691S0100000_9.l0).getContext(), "aweme://aweme/detail/");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((C050S) C631370Opb.LIZ((FanSpotlightBlockVideoAssem) abS691S0100000_9.l0)).LL.getAid());
            OriginMusicArg originMusicArg = (OriginMusicArg) ((FanSpotlightBlockVideoAssem) abS691S0100000_9.l0).LLJL.getValue();
            if (originMusicArg != null && originMusicArg.isMe()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.withParam("video_from", "fan_spotlighted_page");
            Context context = ((FanSpotlightBlockVideoAssem) abS691S0100000_9.l0).getContext();
            String str2 = "";
            if (context == null || (string = context.getString(2131834401)) == null) {
                string = "";
            }
            smartRouteBuildRoute.withParam("extra_detail_title_text", string);
            HashMap map = new HashMap();
            Fragment fragmentLJI = C724240Sb0.LJI((FanSpotlightBlockVideoAssem) abS691S0100000_9.l0);
            if (fragmentLJI != null) {
                iHashCode = fragmentLJI.hashCode();
            } else {
                iHashCode = 0;
            }
            map.put("fan_spotlighted_extra_key", String.valueOf(iHashCode));
            smartRouteBuildRoute.withParam("feed_param_extra", map);
            smartRouteBuildRoute.withParam("tab_name", "artist_music");
            smartRouteBuildRoute.open();
            FanSpotlightBlockVideoAssem fanSpotlightBlockVideoAssem = (FanSpotlightBlockVideoAssem) abS691S0100000_9.l0;
            OriginMusicArg originMusicArg2 = (OriginMusicArg) fanSpotlightBlockVideoAssem.LLJL.getValue();
            if (originMusicArg2 != null && !originMusicArg2.isMe()) {
                C724270Sb3 c724270Sb3 = fanSpotlightBlockVideoAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                C050S c050s = (C050S) obj;
                if (c050s != null) {
                    C633710OtN.LIZ.getClass();
                    IMusicFanSpotlightService iMusicFanSpotlightService = C633710OtN.LIZJ;
                    Music music = c050s.LL.getMusic();
                    if (music != null && (idStr = music.getIdStr()) != null) {
                        str2 = idStr;
                    }
                    iMusicFanSpotlightService.LIZLLL("music_tab_item", 0, null, null, null, null, null, null, null, null, null, null, str2, c050s.LL.getAid());
                }
            }
        }
    }

    public static final void LIZ$13(AbS691S0100000_9 abS691S0100000_9, View view) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (view != null) {
            FanSpotlightEllipsisAssem fanSpotlightEllipsisAssem = (FanSpotlightEllipsisAssem) abS691S0100000_9.l0;
            fanSpotlightEllipsisAssem.getClass();
            ArrayList arrayList = new ArrayList();
            if (fanSpotlightEllipsisAssem.cp().LLJJIJIL != ArtistHonorLabel.ARTIST_HONOR_LABEL_SONG_WRITER) {
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZIZ(2131846315);
                c1247510iZJ.LIZ(new AwS588S0100000_9(fanSpotlightEllipsisAssem, 549));
                arrayList.add(c1247510iZJ);
            }
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZIZ(2131846316);
            c1247510iZJ2.LIZ(new AwS588S0100000_9(fanSpotlightEllipsisAssem, 550));
            arrayList.add(c1247510iZJ2);
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJI(arrayList);
            TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("button_name", "more");
            c2344009Gk.LIZJ(1, "is_self");
            C20684815ws.LJIILLIIL("music_tab_click_more", c2344009Gk.LIZ);
            Context context = ((FanSpotlightEllipsisAssem) abS691S0100000_9.l0).getContext();
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                tuxActionSheetLIZJ.show(supportFragmentManager, "ellipsis");
            }
        }
    }

    public static final void LIZ$14(AbS691S0100000_9 abS691S0100000_9, View view) {
        int i;
        String str;
        String aid;
        Aweme aweme;
        if (view != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((MusicCellSpotlightItemAssem) abS691S0100000_9.l0).getContext(), "aweme://aweme/detail/");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((C325700Cpk) C631370Opb.LIZ((MusicCellSpotlightItemAssem) abS691S0100000_9.l0)).LL.getAid());
            smartRouteBuildRoute.withParam("enter_from", "spotlight_video_play");
            smartRouteBuildRoute.withParam("video_from", "music_spotlight");
            smartRouteBuildRoute.withParam("tab_name", "artist_music");
            HashMap map = new HashMap();
            C325700Cpk c325700Cpk = ((MusicCellSpotlightItemAssem) abS691S0100000_9.l0).LLJJLIIIJLLLLLLLZ;
            if (c325700Cpk != null) {
                i = c325700Cpk.LLILLJJLI;
            } else {
                i = 0;
            }
            map.put("spotlight_profile_detail_extra_key", String.valueOf(i));
            smartRouteBuildRoute.withParam("feed_param_extra", map);
            smartRouteBuildRoute.open();
            MusicCellSpotlightItemAssem musicCellSpotlightItemAssem = (MusicCellSpotlightItemAssem) abS691S0100000_9.l0;
            musicCellSpotlightItemAssem.getClass();
            C631640Oq2 c631640Oq2 = (C631640Oq2) C1252710ihh.LJIIIIZZ(musicCellSpotlightItemAssem, C13LE.LIZ(InterfaceC634000Otq.class));
            if (c631640Oq2 != null && c631640Oq2.LIZJ) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            C325700Cpk c325700Cpk2 = musicCellSpotlightItemAssem.LLJJLIIIJLLLLLLLZ;
            if (c325700Cpk2 != null && (aweme = c325700Cpk2.LL) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("video_id", aid);
            C20684815ws.LJIILLIIL("music_spotlight_video_click", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$15(AbS691S0100000_9 abS691S0100000_9, View view) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityHo;
        Aweme awemeLJIIIIZZ;
        Music music;
        int iLJLLJ;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        String str;
        String str2;
        IAccountService iAccountService;
        ILoginService iLoginServiceLIZJ;
        if (view != null && (iFeedPanelPlatformAbilityHo = ((SpotlightProfileDetailBottomComponent) abS691S0100000_9.l0).Ho()) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityHo.LJIIIIZZ()) != null && (music = awemeLJIIIIZZ.getMusic()) != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityHo2 = ((SpotlightProfileDetailBottomComponent) abS691S0100000_9.l0).Ho();
            if (iFeedPanelPlatformAbilityHo2 != null) {
                iLJLLJ = iFeedPanelPlatformAbilityHo2.LJLLJ();
            } else {
                iLJLLJ = 0;
            }
            SpotlightProfileDetailShareVM spotlightProfileDetailShareVMJo = ((SpotlightProfileDetailBottomComponent) abS691S0100000_9.l0).Jo();
            spotlightProfileDetailShareVMJo.getClass();
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZIZ2 = C737910Sx3.LIZIZ(activityLIZIZ)) != null) {
                MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(musicModelConvertToMusicModel, activityLIZIZ2, true)) {
                    C632210Oqx.LIZ.getClass();
                    if (!C632210Oqx.LJII() && ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().needLoginBeforeRecord()) {
                        ServiceManager serviceManager = ServiceManager.get();
                        if (serviceManager != null && (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) != null && (iLoginServiceLIZJ = iAccountService.LIZJ()) != null) {
                            C0XQS c0xqs = new C0XQS();
                            c0xqs.LIZ = activityLIZIZ2;
                            iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
                            return;
                        }
                        return;
                    }
                    spotlightProfileDetailShareVMJo.LLJ = UUID.randomUUID().toString();
                    spotlightProfileDetailShareVMJo.LLJI = C1443560nfW.LJIIIIZZ();
                    MusicDownloadPlayHelper musicDownloadPlayHelper = spotlightProfileDetailShareVMJo.LLILZLL;
                    if (musicDownloadPlayHelper != null) {
                        musicDownloadPlayHelper.LLJILJIL = iLJLLJ;
                        musicDownloadPlayHelper.Pf(musicModelConvertToMusicModel, 25);
                    }
                    if (spotlightProfileDetailShareVMJo.LLIZLLLIL) {
                        str = "";
                    } else {
                        str = spotlightProfileDetailShareVMJo.LLIZ;
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("shoot_way", "spotlight");
                    c2344009Gk.LJIIIIZZ("music_id", musicModelConvertToMusicModel.getMusicId());
                    MusicReleaseInfo musicReleaseInfo = musicModelConvertToMusicModel.getMusicReleaseInfo();
                    if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk.LJIIIIZZ("music_new_flag", str2);
                    c2344009Gk.LJIIIIZZ("enter_from", "spotlight_video_play");
                    c2344009Gk.LJIIIIZZ("from_group_id", spotlightProfileDetailShareVMJo.LLJI);
                    c2344009Gk.LJIIIIZZ("group_id", spotlightProfileDetailShareVMJo.LLJI);
                    c2344009Gk.LJIIIIZZ("creation_id", spotlightProfileDetailShareVMJo.LLJ);
                    if (!spotlightProfileDetailShareVMJo.LLIZLLLIL) {
                        c2344009Gk.LJIIIIZZ("shoot_from", "spotlight_video_play");
                        c2344009Gk.LJIIIIZZ("enter_method", "spotlight");
                        c2344009Gk.LJFF("to_user_id", str);
                    }
                    c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
                    C20684815ws.LJIILLIIL("shoot", c2344009Gk.LIZ);
                }
            }
        }
    }

    public static final void LIZ$16(AbS691S0100000_9 abS691S0100000_9, View view) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityHo;
        Aweme awemeLJIIIIZZ;
        Music music;
        String id;
        TT2DSPSongInfo next;
        String str;
        DspLinkState dspLinkState;
        String str2;
        AppleMusicToken appleMusicToken;
        TT2DSPSongInfo next2;
        AppleMusicToken appleMusicToken2;
        if (view != null && (iFeedPanelPlatformAbilityHo = ((SpotlightProfileDetailBottomComponent) abS691S0100000_9.l0).Ho()) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityHo.LJIIIIZZ()) != null && (music = awemeLJIIIIZZ.getMusic()) != null) {
            SpotlightProfileDetailBottomComponent spotlightProfileDetailBottomComponent = (SpotlightProfileDetailBottomComponent) abS691S0100000_9.l0;
            spotlightProfileDetailBottomComponent.getClass();
            List<TT2DSPSongInfo> tT2DSPSongInfos = music.getTT2DSPSongInfos();
            if (tT2DSPSongInfos != null) {
                DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(music);
                Iterator<TT2DSPSongInfo> it2 = tT2DSPSongInfos.iterator();
                while (true) {
                    id = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        Integer num = next.dspPlatform;
                        int value = dspPlatformLJIILJJIL.getValue();
                        if (num != null && num.intValue() == value) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                TT2DSPSongInfo tT2DSPSongInfo = next;
                C633020OsG c633020OsG = C633020OsG.LIZIZ;
                String strLJIILL = c633020OsG.LJIILL(dspPlatformLJIILJJIL);
                if (spotlightProfileDetailBottomComponent.Jo().LLIZLLLIL) {
                    str = "profile_music_tab_personal";
                } else {
                    str = "profile_music_tab_others";
                }
                MusicETBusinessModule musicETBusinessModule = MusicETBusinessModule.MUSIC_TAB;
                String eventValue = C0P0X.SMALL.getEventValue();
                MatchedSoundInfo matchedSongInfo = music.getMatchedSongInfo();
                if (matchedSongInfo != null) {
                    id = matchedSongInfo.getId();
                }
                String strLIZLLL = C630980Ooy.LIZLLL(music);
                EnumC631120OpC enumC631120OpC = EnumC631120OpC.FEED_PROFILE_SPOTLIGHT;
                DspPlatform dspPlatform = DspPlatform.UNKNOWN;
                if (dspPlatformLJIILJJIL == dspPlatform) {
                    dspLinkState = DspLinkState.UNLINKED;
                } else {
                    dspLinkState = DspLinkState.LINKED;
                }
                AddSongContextData addSongContextData = new AddSongContextData("spotlight_video_play", str, musicETBusinessModule, null, "", eventValue, music, 0, id, "", strLIZLLL, enumC631120OpC, dspLinkState, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, null, false, 2147475464, null);
                if (dspPlatformLJIILJJIL == dspPlatform) {
                    String str3 = null;
                    List<DspPlatform> listLJJLIIIJJI = c633020OsG.LJJLIIIJJI(music, null, null, null);
                    if (listLJJLIIIJJI.size() == 1) {
                        DspPlatform dspPlatform2 = (DspPlatform) ListProtector.get(listLJJLIIIJJI, 0);
                        Iterator<TT2DSPSongInfo> it3 = tT2DSPSongInfos.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                Integer num2 = next2.dspPlatform;
                                int value2 = dspPlatform2.getValue();
                                if (num2 != null && num2.intValue() == value2) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        TT2DSPSongInfo tT2DSPSongInfo2 = next2;
                        if (tT2DSPSongInfo2 != null) {
                            switch (C638340P2a.LIZ[dspPlatform2.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    C633020OsG c633020OsG2 = C633020OsG.LIZIZ;
                                    C19EG c19egLIZ = C724240Sb0.LIZ(spotlightProfileDetailBottomComponent);
                                    Fragment fragmentLJI = C724240Sb0.LJI(spotlightProfileDetailBottomComponent);
                                    addSongContextData.appendLogExtra(C2097608Jq.LJIIIIZZ(new Pair("dsp_installed", dspPlatform2.getEventName()), new Pair("dsp_installed_number", "1")));
                                    List<String> listLJIIL = C1697810uHb.LJIIL(tT2DSPSongInfo2.songId);
                                    EnumC587920N4c enumC587920N4c = EnumC587920N4c.DIRECTLY_AUTH;
                                    DspAuthToken dspAuthToken = tT2DSPSongInfo2.token;
                                    if (dspAuthToken != null && (appleMusicToken2 = dspAuthToken.appleMusicToken) != null) {
                                        str3 = appleMusicToken2.developToken;
                                    }
                                    c633020OsG2.LJJJJZI(c19egLIZ, fragmentLJI, addSongContextData, dspPlatform2, listLJIIL, enumC587920N4c, str3, null, null);
                                    break;
                                default:
                                    spotlightProfileDetailBottomComponent.Lo(addSongContextData, tT2DSPSongInfos);
                                    break;
                            }
                        } else {
                            spotlightProfileDetailBottomComponent.Lo(addSongContextData, tT2DSPSongInfos);
                        }
                    } else {
                        spotlightProfileDetailBottomComponent.Lo(addSongContextData, tT2DSPSongInfos);
                    }
                } else {
                    String str4 = null;
                    if (tT2DSPSongInfo != null && (str2 = tT2DSPSongInfo.songId) != null && str2.length() != 0) {
                        if (strLJIILL.length() == 0) {
                            switch (C638340P2a.LIZ[dspPlatformLJIILJJIL.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    C19EG c19egLIZ2 = C724240Sb0.LIZ(spotlightProfileDetailBottomComponent);
                                    Fragment fragmentLJI2 = C724240Sb0.LJI(spotlightProfileDetailBottomComponent);
                                    List<String> listLJIIL2 = C1697810uHb.LJIIL(tT2DSPSongInfo.songId);
                                    EnumC587920N4c enumC587920N4c2 = EnumC587920N4c.DIRECTLY_AUTH;
                                    DspAuthToken dspAuthToken2 = tT2DSPSongInfo.token;
                                    if (dspAuthToken2 != null && (appleMusicToken = dspAuthToken2.appleMusicToken) != null) {
                                        str4 = appleMusicToken.developToken;
                                    }
                                    c633020OsG.LJJJJZI(c19egLIZ2, fragmentLJI2, addSongContextData, dspPlatformLJIILJJIL, listLJIIL2, enumC587920N4c2, str4, null, null);
                                    break;
                                default:
                                    spotlightProfileDetailBottomComponent.Lo(addSongContextData, tT2DSPSongInfos);
                                    break;
                            }
                        } else {
                            c633020OsG.LJJIIZI(C724240Sb0.LIZ(spotlightProfileDetailBottomComponent), C724240Sb0.LJI(spotlightProfileDetailBottomComponent), addSongContextData, dspPlatformLJIILJJIL, Collections.singletonList(tT2DSPSongInfo), false);
                        }
                    } else {
                        Fragment fragmentLJI3 = C724240Sb0.LJI(spotlightProfileDetailBottomComponent);
                        if (fragmentLJI3 != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI3);
                            c1389890mGx.LJIIIZ(2131824930);
                            c1389890mGx.LJIIJJI();
                        }
                    }
                }
                C633020OsG.LIZIZ.LJJLJ(spotlightProfileDetailBottomComponent.Go(music));
            }
        }
    }

    public static final void LIZ$17(AbS691S0100000_9 abS691S0100000_9, View view) {
        String userId;
        if (view != null) {
            MusicCellSimilarSoundsAssem musicCellSimilarSoundsAssem = (MusicCellSimilarSoundsAssem) abS691S0100000_9.l0;
            ((OriginMusicListViewModel) musicCellSimilarSoundsAssem.LLJLILLLLZIIL.getValue(musicCellSimilarSoundsAssem, MusicCellSimilarSoundsAssem.LLJLLIL[0])).xQ2((C632090Oql) C631370Opb.LIZ((MusicCellSimilarSoundsAssem) abS691S0100000_9.l0));
            MusicCellSimilarSoundsAssem musicCellSimilarSoundsAssem2 = (MusicCellSimilarSoundsAssem) abS691S0100000_9.l0;
            C632090Oql c632090Oql = (C632090Oql) C631370Opb.LIZ(musicCellSimilarSoundsAssem2);
            HashMap map = new HashMap();
            map.put("music_id", c632090Oql.getMusicModel().getMusicId());
            map.put("song_number", String.valueOf(c632090Oql.getMusicItemModel().similarMusicSize));
            OriginMusicArg originMusicArg = (OriginMusicArg) musicCellSimilarSoundsAssem2.LLJLIL.getValue();
            if (originMusicArg == null || (userId = originMusicArg.getUserId()) == null) {
                userId = "";
            }
            map.put("to_user_id", userId);
            C20684815ws.LJIILLIIL("similar_song_click", map);
        }
    }

    public static final void LIZ$18(AbS691S0100000_9 abS691S0100000_9, View view) {
        String str;
        DmMessageConfig dmMessageConfig;
        DmMessageConfig dmMessageConfig2;
        if (view != null) {
            MediaCardHierarchyData mediaCardHierarchyDataJo = ((MediaCoverAssem) abS691S0100000_9.l0).Jo();
            String str2 = null;
            if (mediaCardHierarchyDataJo != null && (dmMessageConfig2 = mediaCardHierarchyDataJo.getDmMessageConfig()) != null) {
                str = dmMessageConfig2.artistUserId;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((MediaCoverAssem) abS691S0100000_9.l0).getContext(), "aweme://user/profile/");
                MediaCardHierarchyData mediaCardHierarchyDataJo2 = ((MediaCoverAssem) abS691S0100000_9.l0).Jo();
                if (mediaCardHierarchyDataJo2 != null && (dmMessageConfig = mediaCardHierarchyDataJo2.getDmMessageConfig()) != null) {
                    str2 = dmMessageConfig.artistUserId;
                }
                smartRouteBuildRoute.withParam("uid", str2);
                smartRouteBuildRoute.open();
                Fragment fragmentLJI = C724240Sb0.LJI((MediaCoverAssem) abS691S0100000_9.l0);
                if (fragmentLJI != null) {
                    String str3 = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
                }
            }
        }
    }

    public static final void LIZ$19(AbS691S0100000_9 abS691S0100000_9, View view) {
        String str;
        Fragment fragmentLJI;
        final Context context;
        String str2;
        DmMessageConfig dmMessageConfig;
        DmMessageConfig dmMessageConfig2;
        if (view != null) {
            MediaCardHierarchyData mediaCardHierarchyDataHo = ((OpenDspAssem) abS691S0100000_9.l0).Ho();
            DmMessageConfig dmMessageConfig3 = null;
            if (mediaCardHierarchyDataHo != null && (dmMessageConfig2 = mediaCardHierarchyDataHo.getDmMessageConfig()) != null) {
                str = dmMessageConfig2.shareUrl;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str) && (fragmentLJI = C724240Sb0.LJI((OpenDspAssem) abS691S0100000_9.l0)) != null && (context = fragmentLJI.getContext()) != null) {
                C828330WeV c828330WeV = new C828330WeV(new ThirdPartyBizCert(402685956));
                MediaCardHierarchyData mediaCardHierarchyDataHo2 = ((OpenDspAssem) abS691S0100000_9.l0).Ho();
                if (mediaCardHierarchyDataHo2 == null || (dmMessageConfig = mediaCardHierarchyDataHo2.getDmMessageConfig()) == null || (str2 = dmMessageConfig.shareUrl) == null) {
                    str2 = "";
                }
                c828330WeV.LIZIZ(context, str2, new InterfaceC828360WeY() { // from class: X.09fg
                    @Override // X.InterfaceC828360WeY
                    public final void LIZ(Context context2, String str3) {
                        try {
                            Context context3 = context;
                            Intent data = new Intent("android.intent.action.VIEW").setData(UriProtector.parse(str3));
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context3, data, "Context_startActivity_1");
                            C1701330uNH.LIZ(data, context3);
                            C2204961BRm.LJJJJJL(context3, data, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkjZsvEiQrQ1FcGMWXojGeZrG6QxnTg+QGyAnxGlWgp6iyuA=", null));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            try {
                                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context2);
                                if (c19egLIZIZ != null) {
                                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                                    c1389890mGx.LJIIIZ(2131829440);
                                    c1389890mGx.LJIIJJI();
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                }, null);
            }
            C618930OPj c618930OPj = C618930OPj.LIZ;
            MediaCardHierarchyData mediaCardHierarchyDataHo3 = ((OpenDspAssem) abS691S0100000_9.l0).Ho();
            if (mediaCardHierarchyDataHo3 != null) {
                dmMessageConfig3 = mediaCardHierarchyDataHo3.getDmMessageConfig();
            }
            c618930OPj.getClass();
            HashMap map = new HashMap();
            map.put("enter_from", "dsp2tt");
            if (dmMessageConfig3 != null) {
                String str3 = dmMessageConfig3.entityUri;
                if (str3 != null) {
                    map.put("entity_uri", str3);
                }
                String str4 = dmMessageConfig3.musicId;
                if (str4 != null) {
                    map.put("clip_id", str4);
                }
                String str5 = dmMessageConfig3.title;
                if (str5 != null) {
                    map.put("dsp2tt_title", str5);
                }
                String str6 = dmMessageConfig3.subtitle;
                if (str6 != null) {
                    map.put("dsp2tt_sub_title", str6);
                }
                EnumC626270OhN enumC626270OhN = dmMessageConfig3.contentType;
                if (enumC626270OhN != null) {
                    map.put("music_type", enumC626270OhN.getEventName());
                }
                DspPlatform dspPlatform = dmMessageConfig3.dspPlatform;
                if (dspPlatform != null) {
                    map.put("share_from_dsp", dspPlatform.getEventName());
                }
            }
            C20684815ws.LJIILLIIL("goto_dsp", map);
            Fragment fragmentLJI2 = C724240Sb0.LJI((OpenDspAssem) abS691S0100000_9.l0);
            if (fragmentLJI2 != null) {
                String str7 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJI2, C343970De7.LIZ);
            }
        }
    }

    public static final void LIZ$2(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            BulletinShareMusicPresaveItemAssem bulletinShareMusicPresaveItemAssem = (BulletinShareMusicPresaveItemAssem) abS691S0100000_9.l0;
            C736680Sv4.LJIJJ(bulletinShareMusicPresaveItemAssem.op(), new AwS588S0100000_9(bulletinShareMusicPresaveItemAssem, 574));
        }
    }

    public static final void LIZ$20(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((FanSpotlightGuideSheetFragment) abS691S0100000_9.l0, C343970De7.LIZ);
        }
    }

    public static final void LIZ$21(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            C633710OtN.LIZ.getClass();
            C633710OtN.LIZJ.LJII(((FanSpotlightGuideSheetFragment) abS691S0100000_9.l0).getContext());
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((FanSpotlightGuideSheetFragment) abS691S0100000_9.l0, new C343950De5() { // from class: X.0Or7
            });
        }
    }

    public static final void LIZ$22(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            ((ClaimStatusMusicAssem) abS691S0100000_9.l0).lp();
            ((ClaimStatusMusicAssem) abS691S0100000_9.l0).ip("later");
        }
    }

    public static final void LIZ$23(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            ((GhostMusicAssem) abS691S0100000_9.l0).sp(true);
            ((GhostMusicAssem) abS691S0100000_9.l0).mp();
        }
    }

    public static final void LIZ$24(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            ((GhostMusicAssem) abS691S0100000_9.l0).sp(false);
            ((GhostMusicAssem) abS691S0100000_9.l0).yp();
        }
    }

    public static final void LIZ$25(AbS691S0100000_9 abS691S0100000_9, View view) {
        Object obj;
        Object obj2;
        if (view != null) {
            HighlightSelectMusicBaseAssem highlightSelectMusicBaseAssem = (HighlightSelectMusicBaseAssem) abS691S0100000_9.l0;
            C724270Sb3 c724270Sb3 = highlightSelectMusicBaseAssem.LLJI;
            Object obj3 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!((C632090Oql) obj).getMusicItemModel().isSimilarMusic()) {
                C724270Sb3 c724270Sb32 = highlightSelectMusicBaseAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                if (((C632090Oql) obj2).getMusicItemModel().isSelected()) {
                    AssemVMLazy assemVMLazy = highlightSelectMusicBaseAssem.LLJJLIIIJLLLLLLLZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HighlightSelectMusicBaseAssem.LLJLIL;
                    HighlightSelectListViewModel highlightSelectListViewModel = (HighlightSelectListViewModel) assemVMLazy.getValue();
                    C724270Sb3 c724270Sb33 = highlightSelectMusicBaseAssem.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    }
                    highlightSelectListViewModel.listSetItems(HighlightSelectListViewModel.vQ2(highlightSelectListViewModel, null, ((C632090Oql) obj3).getMusicModel().getMusicId(), null, null, 13));
                    return;
                }
                AssemVMLazy assemVMLazy2 = highlightSelectMusicBaseAssem.LLJJLIIIJLLLLLLLZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = HighlightSelectMusicBaseAssem.LLJLIL;
                HighlightSelectListViewModel highlightSelectListViewModel2 = (HighlightSelectListViewModel) assemVMLazy2.getValue();
                C724270Sb3 c724270Sb34 = highlightSelectMusicBaseAssem.LLJI;
                if (c724270Sb34 != null) {
                    obj3 = c724270Sb34.LL;
                }
                highlightSelectListViewModel2.listSetItems(HighlightSelectListViewModel.vQ2(highlightSelectListViewModel2, ((C632090Oql) obj3).getMusicModel().getMusicId(), null, null, null, 14));
            }
        }
    }

    public static final void LIZ$26(AbS691S0100000_9 abS691S0100000_9, View view) {
        Object obj;
        Object obj2;
        if (view != null) {
            HighlightSelectMusicSelectIconAssem highlightSelectMusicSelectIconAssem = (HighlightSelectMusicSelectIconAssem) abS691S0100000_9.l0;
            C724270Sb3 c724270Sb3 = highlightSelectMusicSelectIconAssem.LLJI;
            Object obj3 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!((C632090Oql) obj).getMusicItemModel().isSimilarMusic()) {
                C724270Sb3 c724270Sb32 = highlightSelectMusicSelectIconAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                if (((C632090Oql) obj2).getMusicItemModel().isSelected()) {
                    AssemVMLazy assemVMLazy = highlightSelectMusicSelectIconAssem.LLJL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HighlightSelectMusicSelectIconAssem.LLJLILLLLZIIL;
                    HighlightSelectListViewModel highlightSelectListViewModel = (HighlightSelectListViewModel) assemVMLazy.getValue();
                    C724270Sb3 c724270Sb33 = highlightSelectMusicSelectIconAssem.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    }
                    highlightSelectListViewModel.listSetItems(HighlightSelectListViewModel.vQ2(highlightSelectListViewModel, null, ((C632090Oql) obj3).getMusicModel().getMusicId(), null, null, 13));
                    return;
                }
                AssemVMLazy assemVMLazy2 = highlightSelectMusicSelectIconAssem.LLJL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = HighlightSelectMusicSelectIconAssem.LLJLILLLLZIIL;
                HighlightSelectListViewModel highlightSelectListViewModel2 = (HighlightSelectListViewModel) assemVMLazy2.getValue();
                C724270Sb3 c724270Sb34 = highlightSelectMusicSelectIconAssem.LLJI;
                if (c724270Sb34 != null) {
                    obj3 = c724270Sb34.LL;
                }
                highlightSelectListViewModel2.listSetItems(HighlightSelectListViewModel.vQ2(highlightSelectListViewModel2, ((C632090Oql) obj3).getMusicModel().getMusicId(), null, null, null, 14));
            }
        }
    }

    public static final void LIZ$27(AbS691S0100000_9 abS691S0100000_9, View view) {
        List listVQ2;
        if (view != null) {
            AssemVMLazy assemVMLazy = ((HighlightSelectMusicSimilarSoundsAssem) abS691S0100000_9.l0).LLJLILLLLZIIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HighlightSelectMusicSimilarSoundsAssem.LLJLLIL;
            HighlightSelectListViewModel highlightSelectListViewModel = (HighlightSelectListViewModel) assemVMLazy.getValue();
            C632090Oql c632090Oql = (C632090Oql) C631370Opb.LIZ((HighlightSelectMusicSimilarSoundsAssem) abS691S0100000_9.l0);
            if (c632090Oql.getMusicItemModel().unFoldStatus) {
                listVQ2 = HighlightSelectListViewModel.vQ2(highlightSelectListViewModel, null, null, c632090Oql.getMusicModel().getMusicId(), null, 11);
            } else {
                listVQ2 = HighlightSelectListViewModel.vQ2(highlightSelectListViewModel, null, null, null, c632090Oql.getMusicModel().getMusicId(), 7);
            }
            highlightSelectListViewModel.listSetItems(listVQ2);
            HighlightSelectMusicSimilarSoundsAssem highlightSelectMusicSimilarSoundsAssem = (HighlightSelectMusicSimilarSoundsAssem) abS691S0100000_9.l0;
            C632090Oql c632090Oql2 = (C632090Oql) C631370Opb.LIZ(highlightSelectMusicSimilarSoundsAssem);
            HashMap map = new HashMap();
            map.put("music_id", c632090Oql2.getMusicModel().getMusicId());
            map.put("song_number", String.valueOf(c632090Oql2.getMusicItemModel().similarMusicSize));
            map.put("to_user_id", highlightSelectMusicSimilarSoundsAssem.LLJLIL.getValue());
            C20684815ws.LJIILLIIL("similar_song_click", map);
        }
    }

    public static final void LIZ$28(AbS691S0100000_9 abS691S0100000_9, View view) {
        List<C632090Oql> listVQ2;
        String str;
        if (view != null) {
            SearchMusicCellSimilarSoundsAssem searchMusicCellSimilarSoundsAssem = (SearchMusicCellSimilarSoundsAssem) abS691S0100000_9.l0;
            SearchMusicListViewModel searchMusicListViewModel = (SearchMusicListViewModel) searchMusicCellSimilarSoundsAssem.LLJLIL.getValue(searchMusicCellSimilarSoundsAssem, SearchMusicCellSimilarSoundsAssem.LLJLL[0]);
            C632090Oql c632090Oql = (C632090Oql) C631370Opb.LIZ((SearchMusicCellSimilarSoundsAssem) abS691S0100000_9.l0);
            searchMusicListViewModel.getClass();
            if (c632090Oql.getMusicItemModel().unFoldStatus) {
                MusicGroup musicGroupLIZIZ = C632050Oqh.LIZIZ(searchMusicListViewModel.wQ2(c632090Oql.getMusicModel()).getIdStr(), searchMusicListViewModel.LLILLL);
                if (musicGroupLIZIZ != null) {
                    searchMusicListViewModel.LLILZ.add(musicGroupLIZIZ.getId());
                }
                listVQ2 = searchMusicListViewModel.vQ2();
            } else {
                MusicGroup musicGroupLIZIZ2 = C632050Oqh.LIZIZ(searchMusicListViewModel.wQ2(c632090Oql.getMusicModel()).getIdStr(), searchMusicListViewModel.LLILLL);
                if (musicGroupLIZIZ2 != null) {
                    searchMusicListViewModel.LLILZ.remove(musicGroupLIZIZ2.getId());
                }
                listVQ2 = searchMusicListViewModel.vQ2();
            }
            searchMusicListViewModel.listSetItems(listVQ2);
            SearchMusicCellSimilarSoundsAssem searchMusicCellSimilarSoundsAssem2 = (SearchMusicCellSimilarSoundsAssem) abS691S0100000_9.l0;
            C632090Oql c632090Oql2 = (C632090Oql) C631370Opb.LIZ(searchMusicCellSimilarSoundsAssem2);
            HashMap map = new HashMap();
            map.put("music_id", c632090Oql2.getMusicModel().getMusicId());
            map.put("song_number", String.valueOf(c632090Oql2.getMusicItemModel().similarMusicSize));
            C447520Hgk c447520Hgk = (C447520Hgk) C1252710ihh.LJIIIIZZ(searchMusicCellSimilarSoundsAssem2, C13LE.LIZ(InterfaceC634010Otr.class));
            if (c447520Hgk == null || (str = c447520Hgk.LIZ) == null) {
                str = "";
            }
            map.put("to_user_id", str);
            C20684815ws.LJIILLIIL("similar_song_click", map);
        }
    }

    public static final void LIZ$29(AbS691S0100000_9 abS691S0100000_9, View view) {
        MusicResourceBitStruct musicResourceBitStruct;
        String schema;
        Context context;
        String logExtra;
        if (view != null && (musicResourceBitStruct = ((BulletinMusicDetailAssem) abS691S0100000_9.l0).LLJJJ) != null && (schema = musicResourceBitStruct.getSchema()) != null && (context = ((BulletinMusicDetailAssem) abS691S0100000_9.l0).getContext()) != null) {
            SmartRouter.buildRoute(context, schema).open();
            HashMap map = null;
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                MusicResourceBitStruct musicResourceBitStruct2 = ((BulletinMusicDetailAssem) abS691S0100000_9.l0).LLJJJ;
                if (musicResourceBitStruct2 != null) {
                    logExtra = musicResourceBitStruct2.getLogExtra();
                } else {
                    logExtra = null;
                }
                Type type = new AbstractC1905540zge<HashMap<String, String>>() { // from class: X.0Ooi
                }.getType();
                c1227904rF.getClass();
                map = (HashMap) C1227904rF.LIZJ(logExtra, type);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("action_type", "click");
            c2344009Gk.LJFF("click_type", "enter_cell");
            if (map != null) {
                c2344009Gk.LJI(map);
            }
            C20684815ws.LJIILLIIL("bulletin_board_cell", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$3(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            BulletinShareMusicPresaveItemAssem bulletinShareMusicPresaveItemAssem = (BulletinShareMusicPresaveItemAssem) abS691S0100000_9.l0;
            C736680Sv4.LJIJJ(bulletinShareMusicPresaveItemAssem.op(), new AwS588S0100000_9(bulletinShareMusicPresaveItemAssem, 574));
        }
    }

    public static final void LIZ$30(AbS691S0100000_9 abS691S0100000_9, View view) {
        MusicItemAssem musicItemAssem;
        C629740Omy c629740Omy;
        Music music;
        ViewMusicDetailAbility viewMusicDetailAbility;
        boolean zLJI = MethodIDManager.LJI(72071);
        if (view != null && (c629740Omy = (musicItemAssem = (MusicItemAssem) abS691S0100000_9.l0).LLLIIII) != null && (music = c629740Omy.LL) != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(musicItemAssem);
            if (fragmentLJI != null && (viewMusicDetailAbility = (ViewMusicDetailAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ViewMusicDetailAbility.class, null)) != null) {
                viewMusicDetailAbility.sM0(music);
            }
            C629730Omx c629730Omx = C629730Omx.LIZ;
            String str = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJJLIIIJLLLLLLLZ.getValue();
            String str2 = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJL.getValue();
            String str3 = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJLILLLLZIIL.getValue();
            String idStr = music.getIdStr();
            String str4 = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJLIL.getValue();
            c629730Omx.getClass();
            C629730Omx.LIZ(str, str2, str3, idStr, str4, "enter_mdp");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LIZ$31(AbS691S0100000_9 abS691S0100000_9, View view) {
        String idStr;
        Music music;
        if (view != null) {
            MusicItemAssem musicItemAssem = (MusicItemAssem) abS691S0100000_9.l0;
            if (musicItemAssem.LLLIIII != null) {
                C736680Sv4.LJIJJ(musicItemAssem.op(), new AwS588S0100000_9((MusicItemAssem) abS691S0100000_9.l0, 332));
                C629730Omx c629730Omx = C629730Omx.LIZ;
                String str = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJJLIIIJLLLLLLLZ.getValue();
                String str2 = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJL.getValue();
                String str3 = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJLILLLLZIIL.getValue();
                C629740Omy c629740Omy = ((MusicItemAssem) abS691S0100000_9.l0).LLLIIII;
                if (c629740Omy != null && (music = c629740Omy.LL) != null) {
                    idStr = music.getIdStr();
                } else {
                    idStr = null;
                }
                String str4 = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJLIL.getValue();
                c629730Omx.getClass();
                C629730Omx.LIZ(str, str2, str3, idStr, str4, "favourite");
            }
        }
    }

    public static final void LIZ$32(AbS691S0100000_9 abS691S0100000_9, View view) {
        MusicItemAssem musicItemAssem;
        C629740Omy c629740Omy;
        Music music;
        com.ss.android.ugc.aweme.music.v2.panel.ShootAbility shootAbility;
        if (view != null && (c629740Omy = (musicItemAssem = (MusicItemAssem) abS691S0100000_9.l0).LLLIIII) != null && (music = c629740Omy.LL) != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(musicItemAssem);
            if (fragmentLJI != null && (shootAbility = (com.ss.android.ugc.aweme.music.v2.panel.ShootAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), com.ss.android.ugc.aweme.music.v2.panel.ShootAbility.class, null)) != null) {
                shootAbility.AS0(music);
            }
            C629730Omx c629730Omx = C629730Omx.LIZ;
            String str = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJJLIIIJLLLLLLLZ.getValue();
            String str2 = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJL.getValue();
            String str3 = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJLILLLLZIIL.getValue();
            String idStr = music.getIdStr();
            String str4 = (String) ((MusicItemAssem) abS691S0100000_9.l0).LLJLIL.getValue();
            c629730Omx.getClass();
            C629730Omx.LIZ(str, str2, str3, idStr, str4, "create");
        }
    }

    public static final void LIZ$33(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            ((OfflineModeDetailPageComponent) abS691S0100000_9.l0).Ep().yQ2(EnumC624950OfF.CLICK_SETTINGS_ICON);
        }
    }

    public static final void LIZ$34(AbS691S0100000_9 abS691S0100000_9, View view) {
        String str;
        if (view != null) {
            IComplianceBusinessService iComplianceBusinessService = (IComplianceBusinessService) PluggableExtentionKt.pluggableSpi$default(IComplianceBusinessService.class, false, false, false, 14, null);
            if (iComplianceBusinessService != null) {
                iComplianceBusinessService.LJJJJJL(C724240Sb0.LIZ((PoiPostNonPersonalizedUIComponent) abS691S0100000_9.l0), "poi_detail", "clickable_banner");
            }
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            PoiPostNonPersonalizedUIComponent poiPostNonPersonalizedUIComponent = (PoiPostNonPersonalizedUIComponent) abS691S0100000_9.l0;
            Pair[] pairArr = new Pair[3];
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("login_type", str);
            pairArr[1] = new Pair("enter_from", "poi_detail");
            pairArr[2] = new Pair("scenario", CardStruct.IStatusCode.DEFAULT);
            Map<String, String> mapGo = poiPostNonPersonalizedUIComponent.Go(C2097608Jq.LJIIIIZZ(pairArr));
            C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(C724240Sb0.LJI((PoiPostNonPersonalizedUIComponent) abS691S0100000_9.l0)));
            c1185040gwY.getClass();
            C1185040gwY.LJFF("click_feed_personalization_toast", mapGo, c1185050gwZ);
        }
    }

    public static final void LIZ$35(AbS691S0100000_9 abS691S0100000_9, View view) {
        Fragment fragmentLJI;
        FragmentManager fragmentManager;
        C418540Gb6 c418540Gb6 = ((TopicRatingBarAssem) abS691S0100000_9.l0).LLJJIII;
        if (c418540Gb6 == null) {
            c418540Gb6 = null;
        }
        float ratingValue = c418540Gb6.getRatingValue();
        if (ratingValue != 0.0f && (fragmentLJI = C724240Sb0.LJI((TopicRatingBarAssem) abS691S0100000_9.l0)) != null && (fragmentManager = fragmentLJI.getFragmentManager()) != null) {
            AssemVMLazy assemVMLazy = ((TopicRatingBarAssem) abS691S0100000_9.l0).LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TopicRatingBarAssem.LLJJIJIIJIL;
            ((TopicReviewVM) assemVMLazy.getValue()).LLILLL.put("enter_method", "click_topic_rate");
            C626800OiE.LIZ(TopicReviewPanel.LLJJI, fragmentManager, Integer.valueOf(C814420VxA.LIZIZ(ratingValue)), null, false, new AwS553S0100000_9((TopicRatingBarAssem) abS691S0100000_9.l0, 1569), 12);
        }
    }

    public static final void LIZ$36(AbS691S0100000_9 abS691S0100000_9, View view) {
        String str;
        if (view != null) {
            IComplianceBusinessService iComplianceBusinessService = (IComplianceBusinessService) PluggableExtentionKt.pluggableSpi$default(IComplianceBusinessService.class, false, false, false, 14, null);
            if (iComplianceBusinessService != null) {
                iComplianceBusinessService.LJJJJJL(C724240Sb0.LIZ((NearbyNonPersonalizedUIComponent) abS691S0100000_9.l0), "homepage_nearby", "clickable_banner");
            }
            Pair[] pairArr = new Pair[2];
            if (C0XQ7.LJFF().isLogin()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("login_type", str);
            pairArr[1] = new Pair("enter_from", "homepage_nearby");
            C20684815ws.LJIILLIIL("click_feed_personalization_toast", C2097608Jq.LJIIIIZZ(pairArr));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$37(wh6.AbS691S0100000_9 r10, android.view.View r11) {
        /*
            if (r11 == 0) goto L4f
            X.11uW r1 = X.C19651011uW.LIZIZ
            android.content.Context r2 = r11.getContext()
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem r0 = (com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem) r0
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            X.0OAn r0 = (X.C615070OAn) r0
            com.ss.android.ugc.aweme.addyours.model.AddYoursTopic r3 = r0.LLILLJJLI
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem r0 = (com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem) r0
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            X.0OAn r0 = (X.C615070OAn) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.LLILZLL
            r5 = 0
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem r0 = (com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem) r0
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            X.0OAn r0 = (X.C615070OAn) r0
            java.util.List<com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar> r6 = r0.LLIZ
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem r0 = (com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem) r0
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            X.0OAn r0 = (X.C615070OAn) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLILZLL
            if (r0 == 0) goto L50
            X.0NNE r0 = X.C600100NgG.LIZ(r0)
            if (r0 == 0) goto L50
            int r0 = r0.LIZIZ
            r7 = 1
            if (r0 == r7) goto L50
        L46:
            java.lang.String r8 = "personal_homepage"
            java.lang.String r9 = "favourite"
            r10 = 2
            r11 = r5
            r1.LJIILJJIL(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L4f:
            return
        L50:
            r7 = 0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS691S0100000_9.LIZ$37(wh6.AbS691S0100000_9, android.view.View):void");
    }

    public static final void LIZ$38(AbS691S0100000_9 abS691S0100000_9, View view) {
        Context context;
        C19EG c19egLIZIZ;
        C0NNE c0nneLIZ;
        if (view != null && (context = ((AddYoursCollectionCellAssem) abS691S0100000_9.l0).getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            AssemVMLazy assemVMLazy = ((AddYoursCollectionCellAssem) abS691S0100000_9.l0).LLJLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AddYoursCollectionCellAssem.LLL;
            AssemViewModel value = assemVMLazy.getValue();
            C615070OAn c615070OAn = (C615070OAn) C631370Opb.LIZ((AddYoursCollectionCellAssem) abS691S0100000_9.l0);
            AwS445S0200000_9 awS445S0200000_9 = new AwS445S0200000_9((AddYoursCollectionCellAssem) abS691S0100000_9.l0, c19egLIZIZ, 21);
            Aweme aweme = c615070OAn.LLILZLL;
            if (aweme != null) {
                c0nneLIZ = C600100NgG.LIZ(aweme);
            } else {
                c0nneLIZ = null;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(value), null, null, new C591730NIt(c0nneLIZ, c615070OAn, awS445S0200000_9, null), 3);
        }
    }

    public static final void LIZ$39(AbS691S0100000_9 abS691S0100000_9, View view) {
        C19EG c19egLIZIZ;
        C0NNE c0nneLIZ;
        if (view != null && (c19egLIZIZ = C1388190mED.LIZIZ(view.getContext())) != null) {
            AddYoursHubItemCellAssem addYoursHubItemCellAssem = (AddYoursHubItemCellAssem) abS691S0100000_9.l0;
            ViewModel viewModel = (ViewModel) addYoursHubItemCellAssem.LLLFZ.getValue(addYoursHubItemCellAssem, AddYoursHubItemCellAssem.LLLIIII[0]);
            AddYoursTopic addYoursTopic = ((C0O2K) C631370Opb.LIZ((AddYoursHubItemCellAssem) abS691S0100000_9.l0)).LLILLJJLI;
            AwS445S0200000_9 awS445S0200000_9 = new AwS445S0200000_9(c19egLIZIZ, (AddYoursHubItemCellAssem) abS691S0100000_9.l0, 22);
            viewModel.getClass();
            Aweme video = addYoursTopic.getVideo();
            if (video != null) {
                c0nneLIZ = C600100NgG.LIZ(video);
            } else {
                c0nneLIZ = null;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(viewModel), null, null, new C591720NIs(c0nneLIZ, addYoursTopic, awS445S0200000_9, null), 3);
        }
    }

    public static final void LIZ$4(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinShareMusicSongItemAssem bulletinShareMusicSongItemAssem;
        C621040OXm c621040OXm;
        if (view != null && (c621040OXm = (bulletinShareMusicSongItemAssem = (BulletinShareMusicSongItemAssem) abS691S0100000_9.l0).LLJZIJLIL) != null) {
            AssemVMLazy assemVMLazy = bulletinShareMusicSongItemAssem.LLLF;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinShareMusicSongItemAssem.LLLFZ;
            BulletinShareMusicPlayViewModel bulletinShareMusicPlayViewModel = (BulletinShareMusicPlayViewModel) assemVMLazy.getValue();
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    bulletinShareMusicPlayViewModel.withState(new AwS375S0200000_9(c621040OXm, bulletinShareMusicPlayViewModel, 154));
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(bulletinShareMusicPlayViewModel);
            if (c19egLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public static final void LIZ$40(AbS691S0100000_9 abS691S0100000_9, View view) {
        Fragment fragmentLJI;
        if (view != null && (fragmentLJI = C724240Sb0.LJI((AddYoursDetailScaffoldAssem) abS691S0100000_9.l0)) != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLJI, C343980De8.LIZ);
        }
    }

    public static final void LIZ$41(AbS691S0100000_9 abS691S0100000_9, View view) {
        String nickname;
        String str;
        UrlModel avatarLarger;
        List<String> urlList;
        if (view != null) {
            if (!((BulletinBoardCreateAssem) abS691S0100000_9.l0).Go().LLJILLL) {
                BulletinBoardCreateAssem bulletinBoardCreateAssem = (BulletinBoardCreateAssem) abS691S0100000_9.l0;
                int i = bulletinBoardCreateAssem.LLJ + 1;
                bulletinBoardCreateAssem.LLJ = i;
                C0OP5 c0op5 = C0OP5.LJI;
                c0op5.LJIIL(i, "click_default_count");
                c0op5.LJIIJJI("un_click_create");
                return;
            }
            C0OP5.LJI.LJIIJJI("create");
            C0OP5.LJIILL = true;
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            String string = ((BulletinBoardCreateAssem) abS691S0100000_9.l0).LJJIJL().getContext().getString(2131828085);
            if (curUser == null || (nickname = curUser.getNickname()) == null) {
                nickname = "";
            }
            String strLJJIFFI = u.LJJIFFI(string, "%1$s", nickname, false);
            BulletinBoardEditViewModel bulletinBoardEditViewModelGo = ((BulletinBoardCreateAssem) abS691S0100000_9.l0).Go();
            if (curUser != null && (avatarLarger = curUser.getAvatarLarger()) != null && (urlList = avatarLarger.getUrlList()) != null) {
                str = (String) C13LP.LJJJLL(urlList);
            } else {
                str = null;
            }
            bulletinBoardEditViewModelGo.setState(AFwS240S0000000_9.get$arr$(857));
            bulletinBoardEditViewModelGo.LLJILLL = false;
            bulletinBoardEditViewModelGo.LLJ = strLJJIFFI;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinBoardEditViewModelGo), C0PEM.LIZJ, null, new C465990IPd(bulletinBoardEditViewModelGo, str, null), 2);
            C0OPQ c0opq = C0OPQ.LIZ;
            boolean z = ((BulletinBoardCreateAssem) abS691S0100000_9.l0).Go().LLJILJIL;
            String str2 = ((BulletinBoardCreateAssem) abS691S0100000_9.l0).Go().LLJJI;
            String str3 = ((BulletinBoardCreateAssem) abS691S0100000_9.l0).Go().LLJJIII;
            c0opq.getClass();
            C0OPQ.LJIILJJIL(str2, str3, z);
        }
    }

    public static final void LIZ$42(AbS691S0100000_9 abS691S0100000_9, View view) {
        C0ONA c0ona;
        Aweme aweme;
        InterfaceC1260110itd interfaceC1260110itd;
        if (view != null && (aweme = (c0ona = (C0ONA) abS691S0100000_9.l0).LL) != null && (interfaceC1260110itd = c0ona.LLIZ) != null) {
            interfaceC1260110itd.I2(aweme, c0ona.itemView, "click_eoy_banner");
        }
    }

    public static final void LIZ$43(AbS691S0100000_9 abS691S0100000_9, View view) {
        C0ONA c0ona;
        Aweme aweme;
        InterfaceC1260110itd interfaceC1260110itd;
        if (view != null && (aweme = (c0ona = (C0ONA) abS691S0100000_9.l0).LL) != null && (interfaceC1260110itd = c0ona.LLIZ) != null) {
            interfaceC1260110itd.I2(aweme, c0ona.itemView, "click_invite");
        }
    }

    public static final void LIZ$44(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            MusicPlayViewModel musicPlayViewModelLo = ((MediaCoverAssem) abS691S0100000_9.l0).Lo();
            if (C619560ORu.LIZ(musicPlayViewModelLo.LL)) {
                musicPlayViewModelLo.LLILZ = false;
                musicPlayViewModelLo.setState(AFwS240S0000000_9.get$arr$(843));
            } else if (musicPlayViewModelLo.LLILZ) {
                musicPlayViewModelLo.LLILZ = false;
                musicPlayViewModelLo.vQ2().pause();
                musicPlayViewModelLo.setState(AFwS240S0000000_9.get$arr$(844));
            } else {
                musicPlayViewModelLo.LLILZ = true;
                musicPlayViewModelLo.vQ2().resume();
                musicPlayViewModelLo.setState(AFwS240S0000000_9.get$arr$(845));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.0OsG] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r47v2, types: [java.lang.String] */
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
    public static final void LIZ$45(AbS691S0100000_9 abS691S0100000_9, View view) {
        DspPlatform dspPlatform;
        DmMessageConfig dmMessageConfig;
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        Object objLJFF;
        TT2DSPSongInfo next;
        String id;
        DspLinkState dspLinkState;
        DspPlatform dspPlatform2;
        String str;
        Fragment fragmentLJFF;
        AppleMusicToken appleMusicToken;
        DmMessageConfig dmMessageConfig2;
        if (view != null) {
            MusicAddSongButtonAssem musicAddSongButtonAssem = (MusicAddSongButtonAssem) abS691S0100000_9.l0;
            Music music = musicAddSongButtonAssem.LLJIJIL;
            if (music != null && (tT2DSPSongInfos = music.getTT2DSPSongInfos()) != null) {
                DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(music);
                Iterator<TT2DSPSongInfo> it2 = tT2DSPSongInfos.iterator();
                while (true) {
                    objLJFF = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        Integer num = next.dspPlatform;
                        int value = dspPlatformLJIILJJIL.getValue();
                        if (num != null && num.intValue() == value) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                TT2DSPSongInfo tT2DSPSongInfo = next;
                ?? r10 = C633020OsG.LIZIZ;
                String strLJIILL = r10.LJIILL(dspPlatformLJIILJJIL);
                MusicETBusinessModule musicETBusinessModule = MusicETBusinessModule.DSP2TT;
                String eventValue = C0P0X.UNKNOWN.getEventValue();
                MatchedSoundInfo matchedSongInfo = music.getMatchedSongInfo();
                if (matchedSongInfo != null) {
                    id = matchedSongInfo.getId();
                } else {
                    id = null;
                }
                String strLIZLLL = C630980Ooy.LIZLLL(music);
                EnumC631120OpC enumC631120OpC = EnumC631120OpC.DSP2TT_DM;
                DspPlatform dspPlatform3 = DspPlatform.UNKNOWN;
                if (dspPlatformLJIILJJIL == dspPlatform3) {
                    dspLinkState = DspLinkState.UNLINKED;
                } else {
                    dspLinkState = DspLinkState.LINKED;
                }
                MediaCardHierarchyData mediaCardHierarchyData = (MediaCardHierarchyData) musicAddSongButtonAssem.LLJI.getValue();
                if (mediaCardHierarchyData == null || (dmMessageConfig2 = mediaCardHierarchyData.getDmMessageConfig()) == null || (dspPlatform2 = dmMessageConfig2.dspPlatform) == null) {
                    dspPlatform2 = dspPlatform3;
                }
                AddSongContextData addSongContextData = new AddSongContextData("dsp2tt", "dsp2tt", musicETBusinessModule, null, "", eventValue, music, 0, id, "", strLIZLLL, enumC631120OpC, dspLinkState, null, null, null, null, null, null, null, dspPlatform2, false, false, null, Collections.singletonList(Long.valueOf(music.getId())), null, false, null, false, null, false, 2129649672, null);
                if (dspPlatformLJIILJJIL == dspPlatform3) {
                    musicAddSongButtonAssem.Ho(addSongContextData, tT2DSPSongInfos);
                } else if (tT2DSPSongInfo != null && (str = tT2DSPSongInfo.songId) != null && str.length() != 0) {
                    if (strLJIILL.length() == 0) {
                        if (C297140Bkm.LIZ()) {
                            C19EG c19egLIZ = C724240Sb0.LIZ(musicAddSongButtonAssem);
                            IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
                            if (iIMChatRoomOpenService != null) {
                                objLJFF = iIMChatRoomOpenService.LJFF(C724240Sb0.LIZ(musicAddSongButtonAssem));
                            }
                            r10.LJJIIZI(c19egLIZ, objLJFF, addSongContextData, dspPlatformLJIILJJIL, Collections.singletonList(tT2DSPSongInfo), false);
                            Fragment fragmentLJI = C724240Sb0.LJI(musicAddSongButtonAssem);
                            if (fragmentLJI != null) {
                                String str2 = TuxSheet._pnsPageId;
                                C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
                            }
                        } else {
                            switch (C638350P2b.LIZ[dspPlatformLJIILJJIL.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    C19EG c19egLIZ2 = C724240Sb0.LIZ(musicAddSongButtonAssem);
                                    IIMChatRoomOpenService iIMChatRoomOpenService2 = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
                                    if (iIMChatRoomOpenService2 != null) {
                                        fragmentLJFF = iIMChatRoomOpenService2.LJFF(C724240Sb0.LIZ(musicAddSongButtonAssem));
                                    } else {
                                        fragmentLJFF = null;
                                    }
                                    List listLJIIL = C1697810uHb.LJIIL(tT2DSPSongInfo.songId);
                                    EnumC587920N4c enumC587920N4c = EnumC587920N4c.DIRECTLY_AUTH;
                                    DspAuthToken dspAuthToken = tT2DSPSongInfo.token;
                                    if (dspAuthToken != null && (appleMusicToken = dspAuthToken.appleMusicToken) != null) {
                                        objLJFF = appleMusicToken.developToken;
                                    }
                                    r10.LJJJJZI(c19egLIZ2, fragmentLJFF, addSongContextData, dspPlatformLJIILJJIL, listLJIIL, enumC587920N4c, objLJFF, null, null);
                                    Fragment fragmentLJI2 = C724240Sb0.LJI(musicAddSongButtonAssem);
                                    if (fragmentLJI2 != null) {
                                        String str3 = TuxSheet._pnsPageId;
                                        C1391190mJ3.LJFF(fragmentLJI2, C343970De7.LIZ);
                                    }
                                    break;
                                default:
                                    musicAddSongButtonAssem.Ho(addSongContextData, tT2DSPSongInfos);
                                    break;
                            }
                        }
                    } else {
                        C19EG c19egLIZ3 = C724240Sb0.LIZ(musicAddSongButtonAssem);
                        IIMChatRoomOpenService iIMChatRoomOpenService3 = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
                        if (iIMChatRoomOpenService3 != null) {
                            objLJFF = iIMChatRoomOpenService3.LJFF(C724240Sb0.LIZ(musicAddSongButtonAssem));
                        }
                        r10.LJJIIZI(c19egLIZ3, objLJFF, addSongContextData, dspPlatformLJIILJJIL, Collections.singletonList(tT2DSPSongInfo), false);
                        Fragment fragmentLJI3 = C724240Sb0.LJI(musicAddSongButtonAssem);
                        if (fragmentLJI3 != null) {
                            String str4 = TuxSheet._pnsPageId;
                            C1391190mJ3.LJFF(fragmentLJI3, C343970De7.LIZ);
                        }
                    }
                } else {
                    Fragment fragmentLJI4 = C724240Sb0.LJI(musicAddSongButtonAssem);
                    if (fragmentLJI4 != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI4);
                        c1389890mGx.LJIIIZ(2131824930);
                        c1389890mGx.LJIIJJI();
                    }
                }
            }
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            MediaCardHierarchyData mediaCardHierarchyData2 = (MediaCardHierarchyData) ((MusicAddSongButtonAssem) abS691S0100000_9.l0).LLJI.getValue();
            if (mediaCardHierarchyData2 == null || (dmMessageConfig = mediaCardHierarchyData2.getDmMessageConfig()) == null || (dspPlatform = dmMessageConfig.dspPlatform) == null) {
                dspPlatform = DspPlatform.UNKNOWN;
            }
            c633020OsG.LJJLJ(new LogData(dspPlatform, EnumC631120OpC.DSP2TT_DM, C0P0X.UNKNOWN, "dsp2tt", "dsp2tt", MusicETBusinessModule.DSP2TT, null, ((MusicAddSongButtonAssem) abS691S0100000_9.l0).LLJIJIL, null, null, "", "", "", null, null, null, "", null, null, false, 0, null));
        }
    }

    public static final void LIZ$46(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentAbility bulletinCommentAbility;
        if (view != null && (bulletinCommentAbility = ((C619600ORy) abS691S0100000_9.l0).LIZ) != null) {
            bulletinCommentAbility.s82(false);
        }
    }

    public static final void LIZ$47(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentAbility bulletinCommentAbility;
        if (view != null && (bulletinCommentAbility = ((C0OS2) abS691S0100000_9.l0).LIZ) != null) {
            bulletinCommentAbility.s82(false);
        }
    }

    public static final void LIZ$48(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentAbility commentAbility;
        if (view != null && (commentAbility = ((C0OS3) abS691S0100000_9.l0).getCommentAbility()) != null) {
            commentAbility.s82(true);
        }
    }

    public static final void LIZ$49(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentAbility commentAbility;
        if (view != null && (commentAbility = ((C0OS1) abS691S0100000_9.l0).getCommentAbility()) != null) {
            commentAbility.s82(false);
        }
    }

    public static final void LIZ$5(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            BulletinShareMusicSongItemAssem bulletinShareMusicSongItemAssem = (BulletinShareMusicSongItemAssem) abS691S0100000_9.l0;
            C736680Sv4.LJIJJ(bulletinShareMusicSongItemAssem.sp(), new AwS588S0100000_9(bulletinShareMusicSongItemAssem, 575));
        }
    }

    public static final void LIZ$50(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentAbility commentAbility;
        if (view != null && (commentAbility = ((C0OS4) abS691S0100000_9.l0).getCommentAbility()) != null) {
            commentAbility.s82(false);
        }
    }

    public static final void LIZ$51(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            AddYoursHubItemCellAssem.op((AddYoursHubItemCellAssem) abS691S0100000_9.l0);
        }
    }

    public static final void LIZ$52(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            AddYoursHubItemCellAssem.op((AddYoursHubItemCellAssem) abS691S0100000_9.l0);
        }
    }

    public static final void LIZ$53(AbS691S0100000_9 abS691S0100000_9, View view) {
        Long topicId;
        if (view != null && (topicId = ((C0O2K) C631370Opb.LIZ((AddYoursHubItemCellAssem) abS691S0100000_9.l0)).LLILLJJLI.getTopicId()) != null) {
            long jLongValue = topicId.longValue();
            C344010DeB c344010DeB = C344010DeB.LIZIZ;
            c344010DeB.LIZJ(view.getContext(), c344010DeB.LIZIZ(), new AwS46S0100100_9(jLongValue, (AddYoursHubItemCellAssem) abS691S0100000_9.l0, 8));
        }
    }

    public static final void LIZ$54(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            OfflineModeManagerVM offlineModeManagerVMGo = ((OfflineModeSheetPageAssem) abS691S0100000_9.l0).Go();
            C19319410i8 c19319410i8 = OfflineModeManagerVM.LLILZLL;
            offlineModeManagerVMGo.IQ2(null);
        }
    }

    public static final void LIZ$55(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            BulletinCommentSheetAssem bulletinCommentSheetAssem = (BulletinCommentSheetAssem) abS691S0100000_9.l0;
            bulletinCommentSheetAssem.getClass();
            Fragment fragmentLJI = C724240Sb0.LJI(bulletinCommentSheetAssem);
            if (fragmentLJI != null) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
            }
        }
    }

    public static final void LIZ$56(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentSheetAbility bulletinCommentSheetAbility;
        if (view != null && (bulletinCommentSheetAbility = (BulletinCommentSheetAbility) C1558520qew.LIZ(C1558520qew.LJIIL((BulletinCommentSheetAssem) abS691S0100000_9.l0), BulletinCommentSheetAbility.class, null)) != null) {
            bulletinCommentSheetAbility.EO(null, false, "comment_panel");
        }
    }

    public static final void LIZ$57(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentSheetAbility bulletinCommentSheetAbility;
        if (view != null && (bulletinCommentSheetAbility = (BulletinCommentSheetAbility) C1558520qew.LIZ(C1558520qew.LJIIL((BulletinCommentSheetAssem) abS691S0100000_9.l0), BulletinCommentSheetAbility.class, null)) != null) {
            bulletinCommentSheetAbility.EO(null, true, "comment_panel");
        }
    }

    public static final void LIZ$58(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            BulletinCommentActionViewModel.vQ2((BulletinCommentActionViewModel) ((BulletinCommentSheetAssem) abS691S0100000_9.l0).LLJI.getValue(), ((BulletinCommentSheetAssem) abS691S0100000_9.l0).LJJIJL().getContext(), null, false, null, null, 30);
        }
    }

    public static final void LIZ$59(AbS691S0100000_9 abS691S0100000_9, View view) {
        String str;
        if (view != null) {
            BulletinCommentActionViewModel bulletinCommentActionViewModelGo = ((BulletinCommentKeyboardInputAssem) abS691S0100000_9.l0).Go();
            C1629106Zl c1629106Zl = C1629106Zl.LL;
            bulletinCommentActionViewModelGo.getClass();
            bulletinCommentActionViewModelGo.setState(new AwS588S0100000_9((InterfaceC456120Huc) c1629106Zl, 652));
            BulletinCommentActionViewModel bulletinCommentActionViewModelGo2 = ((BulletinCommentKeyboardInputAssem) abS691S0100000_9.l0).Go();
            Context context = ((BulletinCommentKeyboardInputAssem) abS691S0100000_9.l0).LJJIJL().getContext();
            C0OTQ c0otq = (C0OTQ) ((BulletinCommentKeyboardInputAssem) abS691S0100000_9.l0).LLIZLLLIL.getValue();
            String str2 = null;
            if (c0otq != null) {
                str = c0otq.LLILLJJLI;
            } else {
                str = null;
            }
            C0OTQ c0otq2 = (C0OTQ) ((BulletinCommentKeyboardInputAssem) abS691S0100000_9.l0).LLIZLLLIL.getValue();
            if (c0otq2 != null) {
                str2 = c0otq2.LLILLL;
            }
            BulletinCommentActionViewModel.vQ2(bulletinCommentActionViewModelGo2, context, null, false, str, str2, 6);
        }
    }

    public static final void LIZ$6(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            BulletinShareMusicSongItemAssem bulletinShareMusicSongItemAssem = (BulletinShareMusicSongItemAssem) abS691S0100000_9.l0;
            C736680Sv4.LJIJJ(bulletinShareMusicSongItemAssem.sp(), new AwS588S0100000_9(bulletinShareMusicSongItemAssem, 575));
        }
    }

    public static final void LIZ$60(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            BulletinCommentActionViewModel.vQ2((BulletinCommentActionViewModel) ((BulletinCommentSheetCell) abS691S0100000_9.l0).LLJI.getValue(), ((BulletinCommentSheetCell) abS691S0100000_9.l0).itemView.getContext(), ((BulletinCommentSheetCell) abS691S0100000_9.l0).getItem(), false, null, null, 28);
        }
    }

    public static final void LIZ$61(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentSheetAbility bulletinCommentSheetAbility;
        if (view != null) {
            BulletinCommentSheetCell bulletinCommentSheetCell = (BulletinCommentSheetCell) abS691S0100000_9.l0;
            bulletinCommentSheetCell.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(bulletinCommentSheetCell);
            if (interfaceC665370Q7zLIZ != null && (bulletinCommentSheetAbility = (BulletinCommentSheetAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinCommentSheetAbility.class, null)) != null) {
                bulletinCommentSheetAbility.EO(((BulletinCommentSheetCell) abS691S0100000_9.l0).getItem(), false, "comment_panel");
            }
        }
    }

    public static final void LIZ$62(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            ((Function1) abS691S0100000_9.l0).invoke("click_comment_head");
        }
    }

    public static final void LIZ$63(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            ((Function1) abS691S0100000_9.l0).invoke("click_name");
        }
    }

    public static final void LIZ$64(AbS691S0100000_9 abS691S0100000_9, View view) {
        C0OTS item;
        String replyToUserId;
        Comment comment;
        if (view != null && (item = ((BulletinCommentSheetCell) abS691S0100000_9.l0).getItem()) != null && item.LLIZLLLIL) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((BulletinCommentSheetCell) abS691S0100000_9.l0).itemView.getContext(), "aweme://user/profile/");
            C0OTS item2 = ((BulletinCommentSheetCell) abS691S0100000_9.l0).getItem();
            if (item2 != null && (comment = item2.LL) != null) {
                replyToUserId = comment.getReplyToUserId();
            } else {
                replyToUserId = null;
            }
            smartRouteBuildRoute.withParam("uid", replyToUserId);
            smartRouteBuildRoute.withParam("enter_method", "click_name");
            smartRouteBuildRoute.open();
        }
    }

    public static final void LIZ$65(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            ((AddYoursDetailScaffoldAssem) abS691S0100000_9.l0).Oo(true);
        }
    }

    public static final void LIZ$66(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            ((AddYoursDetailScaffoldAssem) abS691S0100000_9.l0).Oo(false);
        }
    }

    public static final void LIZ$67(AbS691S0100000_9 abS691S0100000_9, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        if (view != null) {
            C624310OeD c624310OeD = ((C624290OeB) abS691S0100000_9.l0).LL;
            if (c624310OeD == null || (str = c624310OeD.LLILZIL) == null) {
                str = "aweme://inbox/bulletin_board/create";
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), str);
            smartRouteBuildRoute.withParam("enter_method", "banner_guide");
            C624310OeD c624310OeD2 = ((C624290OeB) abS691S0100000_9.l0).LL;
            if (c624310OeD2 == null || (str2 = c624310OeD2.LLIZ) == null) {
                str2 = "";
            }
            smartRouteBuildRoute.withParam("user_type", str2);
            smartRouteBuildRoute.open();
            C0OPQ c0opq = C0OPQ.LIZ;
            C624310OeD c624310OeD3 = ((C624290OeB) abS691S0100000_9.l0).LL;
            if (c624310OeD3 != null) {
                str3 = c624310OeD3.LLIZ;
            } else {
                str3 = null;
            }
            c0opq.getClass();
            C0OPQ.LJIILL(2, "try_now", str3);
            C624310OeD c624310OeD4 = ((C624290OeB) abS691S0100000_9.l0).LL;
            if (c624310OeD4 != null) {
                str4 = c624310OeD4.LLIZ;
            } else {
                str4 = null;
            }
            C0OPQ.LJIILIIL(c0opq, "notice", str4, null, 4);
            C0OP5 c0op5 = C0OP5.LJI;
            c0op5.LJIIIIZZ();
            if (c0op5.LJFF()) {
                C0OP5.LJII.LIZJ();
                C0OP5.LJIIIZ.LIZJ();
                C0OP5.LJIIJ = "notice";
            }
            C637380OzI.LIZ.getClass();
            C637380OzI.LIZIZ("bulletin_board_guide", null, false);
        }
    }

    public static final void LIZ$7(AbS691S0100000_9 abS691S0100000_9, View view) {
        if (view != null) {
            InterfaceC1361890lXn<C0OYR> operator = ((BulletinCommentListViewModel) ((BulletinCommentFoldFooterCell) abS691S0100000_9.l0).LL.getValue()).LL.getOperator();
            C0OYH item = ((BulletinCommentFoldFooterCell) abS691S0100000_9.l0).getItem();
            if (item != null) {
                operator.LIZ(new C0OYR(item.LLILLJJLI, true));
            }
        }
    }

    public static final void LIZ$8(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentAbility bulletinCommentAbility;
        if (view != null && (bulletinCommentAbility = (BulletinCommentAbility) ((BulletinCommentAddCell) abS691S0100000_9.l0).LLILZ.getValue()) != null) {
            bulletinCommentAbility.s82(true);
        }
    }

    public static final void LIZ$9(AbS691S0100000_9 abS691S0100000_9, View view) {
        BulletinCommentAbility bulletinCommentAbility;
        if (view != null && (bulletinCommentAbility = (BulletinCommentAbility) ((BulletinCommentContentCell) abS691S0100000_9.l0).LLILZ.getValue()) != null) {
            bulletinCommentAbility.s82(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS691S0100000_9(Object obj, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS691S0100000_9(Object obj, int i, int i2) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS691S0100000_9(Object obj, int i, int i2, int i3) {
        super(500L);
        this.$t = i;
        this.l0 = obj;
    }
}
