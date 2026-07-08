package kotlin.jvm.internal;

import X.AbstractC1100450ek7;
import X.AbstractC476820Imu;
import X.C013C;
import X.C01U6;
import X.C09AY;
import X.C09JN;
import X.C09R7;
import X.C0IJT;
import X.C0ISF;
import X.C0ISJ;
import X.C0IU0;
import X.C0IXW;
import X.C0J3O;
import X.C0J3P;
import X.C0J4W;
import X.C0JCX;
import X.C0JFN;
import X.C0JH3;
import X.C0JHL;
import X.C0JT6;
import X.C0K25;
import X.C0K31;
import X.C0K7M;
import X.C0KDP;
import X.C0KFM;
import X.C0KMY;
import X.C0KNI;
import X.C0KPG;
import X.C0KPI;
import X.C0KS3;
import X.C0KSC;
import X.C0KTD;
import X.C0KTF;
import X.C0SUC;
import X.C0U56;
import X.C0UO0;
import X.C0WZX;
import X.C1124290fMZ;
import X.C1161920gLG;
import X.C11KU;
import X.C11S5;
import X.C1209120hZO;
import X.C1262850iy3;
import X.C12ES;
import X.C1338270kvh;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397660mTU;
import X.C13BV;
import X.C13IQ;
import X.C13LP;
import X.C1443310nf7;
import X.C15438062q;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1619720sFe;
import X.C1697810uHb;
import X.C16F5;
import X.C16G0;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C176600m4;
import X.C1893370zN1;
import X.C19719912Dl;
import X.C199Y;
import X.C19EG;
import X.C19EH;
import X.C20441214yg;
import X.C20629915o1;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C23250099c;
import X.C259800zU;
import X.C262100zr;
import X.C304701Gb;
import X.C339190DRl;
import X.C474500IjA;
import X.C475510Ikn;
import X.C476640Imc;
import X.C477750IoP;
import X.C477860Ioa;
import X.C479150Iqf;
import X.C480460Ism;
import X.C481150Itt;
import X.C481760Ius;
import X.C484370Iz5;
import X.C488550JDx;
import X.C489110JGb;
import X.C494790Jan;
import X.C497740JfY;
import X.C499870Jiz;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C501540Jlg;
import X.C511230K3d;
import X.C511520K4g;
import X.C511970K5z;
import X.C516700KOe;
import X.C517630KRt;
import X.C517690KRz;
import X.C517840KSo;
import X.C517910KSv;
import X.C518150KTt;
import X.C736680Sv4;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC1106030et7;
import X.InterfaceC1107590evd;
import X.InterfaceC1631620sYq;
import X.InterfaceC1791300wiO;
import X.InterfaceC1791930wjP;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC489200JGk;
import X.InterfaceC512380K7o;
import X.InterfaceC518100KTo;
import X.InterfaceC518120KTq;
import X.InterfaceC665370Q7z;
import X.InterfaceC743640TFa;
import Y.AObserverS172S0200000_7;
import Y.AcS494S0100000_7;
import Y.AfS143S0200000_7;
import Y.AfS176S0100000_7;
import Y.AfS1S0300200_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameDropsPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget;
import com.bytedance.android.livesdk.chatroom.api.PriceChangeInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.model.PunishmentData;
import com.bytedance.android.livesdk.dataChannel.GlobalRoomMessage;
import com.bytedance.android.livesdk.livesetting.level.SuperFanPurchaseConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeInvitationLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveMoneyPlatformFeedbackLink;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdk.model.message.FollowCardMessage;
import com.bytedance.android.livesdk.programmedlive.api.ProgrammedLiveApi;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.api.IRevenueApi;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckService;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubLiveBanner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.touchpoint.core.crossplatform.IncentiveTaskPageFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hangout.component.distribute.view.MultiTopLiveDistributeAssem;
import com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem;
import com.ss.android.ugc.aweme.hangout.component.interact.view.MultiTopLiveInteractModuleAssem;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCell;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCellV2;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem;
import com.ss.android.ugc.aweme.live.toplives.notifications.vm.LiveNotificationListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity;
import com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseManagementContainerAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePriceTierSheet;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContainerAssemV2;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCoursePriceTierSheetV2;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseVideoListCell;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseManageVmAbility;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoPublishVM;
import com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackageMultiMonthFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubUpdowngradePackageFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment.DetailSettingDialogFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment.SpaceFeedGuestSettingDialogFragment;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.ss.android.ugc.aweme.video.SubOnlyVideoContentFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.fans.GetFansBasicInfoReq;
import tikcast.api.privilege.EntranceIconAnimation;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.NoticeItem;
import webcast.api.game.GameDrawerCategory;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;
import webcast.api.room.StrategyCheckData;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public class AwS408S0200000_7 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS408S0200000_7 awS408S0200000_7) {
        ImageView imageView;
        View view = ((GameDropsPreviewBanner) awS408S0200000_7.l0).getView();
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.jvg)) != null) {
            imageView.setImageDrawable((Drawable) awS408S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS408S0200000_7 awS408S0200000_7) {
        C0KS3 c0ks3 = (C0KS3) awS408S0200000_7.l0;
        final Context context = ((C517690KRz) awS408S0200000_7.l1).LIZJ;
        c0ks3.getClass();
        if (context != null) {
            final String feedbackUrl = LiveMoneyPlatformFeedbackLink.INSTANCE.getFeedbackUrl("80XR2DK73101", C0KPI.UNDEFINED.getValue());
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LIZJ = context.getString(2131851586);
            c782110Um9.LJIIIZ(context.getString(2131837519));
            c782110Um9.LJIILIIL(2131837517, new InterfaceC743640TFa() { // from class: X.00y0
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, feedbackUrl);
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIIJ(2131851998, new C304701Gb());
            c782110Um9.LJIILLIIL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS408S0200000_7 awS408S0200000_7) {
        C501540Jlg.LIZLLL(((C517840KSo) awS408S0200000_7.l0).LIZ.get(), (Throwable) awS408S0200000_7.l1, 2131851936);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS408S0200000_7 awS408S0200000_7) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_open_cost_time");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0U56 c0u56 = (C0U56) awS408S0200000_7.l0;
        Map map = (Map) awS408S0200000_7.l1;
        linkedHashMap.put("panel_type", c0u56.getValue());
        linkedHashMap.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap2.put(entry.getKey(), String.valueOf(((Number) entry.getValue()).longValue()));
        }
        linkedHashMap.putAll(linkedHashMap2);
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS408S0200000_7 awS408S0200000_7) {
        C19EG activity;
        C1893370zN1 c1893370zN1;
        C1893370zN1 c1893370zN12;
        if (Intrinsics.LJFF(((C262100zr) awS408S0200000_7.l0).LIZ, "event_switch_rec_feed")) {
            C19EG activity2 = ((IncentiveTaskPageFragment) awS408S0200000_7.l1).getActivity();
            if (activity2 != null && (c1893370zN12 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003)) != null) {
                c1893370zN12.LJIIIZ(activity2);
            }
        } else if (Intrinsics.LJFF(((C262100zr) awS408S0200000_7.l0).LIZ, "exitEmbeddedPage") && (activity = ((IncentiveTaskPageFragment) awS408S0200000_7.l1).getActivity()) != null && (c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003)) != null) {
            c1893370zN1.LJIIIZ(activity);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS408S0200000_7 awS408S0200000_7) {
        C1893370zN1 c1893370zN1;
        IncentiveTaskPageFragment incentiveTaskPageFragment = (IncentiveTaskPageFragment) awS408S0200000_7.l0;
        View view = (View) awS408S0200000_7.l1;
        incentiveTaskPageFragment.getClass();
        C01U6.LIZIZ(new AwS408S0200000_7(view, incentiveTaskPageFragment, 62));
        IncentiveTaskPageFragment incentiveTaskPageFragment2 = (IncentiveTaskPageFragment) awS408S0200000_7.l0;
        incentiveTaskPageFragment2.getClass();
        C01U6.LIZIZ(new AwS572S0100000_28(incentiveTaskPageFragment2, 816));
        C19EH c19ehLJIIJ = ((IncentiveTaskPageFragment) awS408S0200000_7.l0).getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.xel, (Fragment) ((IncentiveTaskPageFragment) awS408S0200000_7.l0).LL.getValue());
        c19ehLJIIJ.LJIIJ();
        C1548820qPI.LIZLLL("event_switch_rec_feed", (IncentiveTaskPageFragment) awS408S0200000_7.l0);
        C1548820qPI.LIZLLL("exitEmbeddedPage", (IncentiveTaskPageFragment) awS408S0200000_7.l0);
        C19EG activity = ((IncentiveTaskPageFragment) awS408S0200000_7.l0).getActivity();
        if (activity != null && (c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003)) != null) {
            c1893370zN1.LIZIZ(activity);
        }
        IncentiveTaskPageFragment incentiveTaskPageFragment3 = (IncentiveTaskPageFragment) awS408S0200000_7.l0;
        C736680Sv4.LJIIIIZZ(incentiveTaskPageFragment3, incentiveTaskPageFragment3.LLILLJJLI.getValue(), new C2217381BqS() { // from class: X.0zP0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1895080zPm) obj).LL);
            }
        }, null, new AwS642S0100000_28((IncentiveTaskPageFragment) awS408S0200000_7.l0, 3), 6);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS408S0200000_7 awS408S0200000_7) {
        ((MultiTopLiveInteractModuleAssem) awS408S0200000_7.l0).hp((MGModuleInteraction) awS408S0200000_7.l1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("topModuleAssem enterRoomByRealtimeData fallback: ");
        sbLIZ.append(((MGModuleInteraction) awS408S0200000_7.l1).name);
        C20441214yg.LIZIZ("MultiTopLiveInteractAssem", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS408S0200000_7 awS408S0200000_7) {
        PlayCardFeedCell playCardFeedCell = (PlayCardFeedCell) awS408S0200000_7.l0;
        C479150Iqf c479150Iqf = (C479150Iqf) awS408S0200000_7.l1;
        int i = PlayCardFeedCell.LLJ;
        playCardFeedCell.V5(c479150Iqf, false);
        C477860Ioa.LJIIIIZZ("click", ((PlayCardFeedCell) awS408S0200000_7.l0).LLIZLLLIL);
        ((PlayCardFeedCell) awS408S0200000_7.l0).T5("card");
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS408S0200000_7 awS408S0200000_7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("avatarListView addButton clicked, roomId:");
        sbLIZ.append(((C479150Iqf) awS408S0200000_7.l0).LLILLL.LIZ);
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
        ((PlayCardFeedCell) awS408S0200000_7.l1).V5((C479150Iqf) awS408S0200000_7.l0, true);
        C477860Ioa.LJIIIIZZ("click", ((PlayCardFeedCell) awS408S0200000_7.l1).LLIZLLLIL);
        ((PlayCardFeedCell) awS408S0200000_7.l1).T5("join");
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS408S0200000_7 awS408S0200000_7) {
        PlayCardFeedCell playCardFeedCell = (PlayCardFeedCell) awS408S0200000_7.l0;
        C479150Iqf c479150Iqf = (C479150Iqf) awS408S0200000_7.l1;
        int i = PlayCardFeedCell.LLJ;
        playCardFeedCell.V5(c479150Iqf, false);
        C477860Ioa.LJIIIIZZ("click", ((PlayCardFeedCell) awS408S0200000_7.l0).LLIZLLLIL);
        ((PlayCardFeedCell) awS408S0200000_7.l0).T5("card");
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS408S0200000_7 awS408S0200000_7) {
        PlayCardFeedCellV2 playCardFeedCellV2 = (PlayCardFeedCellV2) awS408S0200000_7.l0;
        C479150Iqf c479150Iqf = (C479150Iqf) awS408S0200000_7.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PlayCardFeedCellV2.LLJJJJLIIL;
        playCardFeedCellV2.w6(c479150Iqf, false);
        C477860Ioa.LJIIIIZZ("click", ((PlayCardFeedCellV2) awS408S0200000_7.l0).LLJJIII);
        ((PlayCardFeedCellV2) awS408S0200000_7.l0).d6("card");
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS408S0200000_7 awS408S0200000_7) {
        PlayCardFeedCellV2 playCardFeedCellV2 = (PlayCardFeedCellV2) awS408S0200000_7.l0;
        C479150Iqf c479150Iqf = (C479150Iqf) awS408S0200000_7.l1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PlayCardFeedCellV2.LLJJJJLIIL;
        playCardFeedCellV2.w6(c479150Iqf, false);
        C477860Ioa.LJIIIIZZ("click", ((PlayCardFeedCellV2) awS408S0200000_7.l0).LLJJIII);
        ((PlayCardFeedCellV2) awS408S0200000_7.l0).d6("card");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS408S0200000_7 awS408S0200000_7) {
        C500260Jjc.LJJJLL((C477750IoP) awS408S0200000_7.l0);
        ((MultiTopLiveDistributeAssem) awS408S0200000_7.l1).ip();
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", "onNormalClick");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(AwS408S0200000_7 awS408S0200000_7) {
        return ((InterfaceC451590HnJ) awS408S0200000_7.l0).LIZ((LifecycleOwner) ((Function0) awS408S0200000_7.l1).invoke());
    }

    public static final Object invoke$21(AwS408S0200000_7 awS408S0200000_7) {
        String str;
        String str2;
        Integer num;
        PriceChangeInfo priceChangeInfo;
        PriceChangeInfo priceChangeInfo2;
        PriceChangeInfo priceChangeInfo3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_change_price_sheet_not_now");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("app_start", "show_entrance");
        c474500IjALIZ.LJJII("notify_and_consent", "show_type");
        SubInfo subInfo = ((SubscribingInfo) awS408S0200000_7.l0).subInfo;
        Long lValueOf = null;
        if (subInfo != null && (priceChangeInfo3 = subInfo.priceChangeInfo) != null) {
            str = priceChangeInfo3.oldPrice;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "old_price");
        SubInfo subInfo2 = ((SubscribingInfo) awS408S0200000_7.l0).subInfo;
        if (subInfo2 != null && (priceChangeInfo2 = subInfo2.priceChangeInfo) != null) {
            str2 = priceChangeInfo2.newPrice;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "new_price");
        SubInfo subInfo3 = ((SubscribingInfo) awS408S0200000_7.l0).subInfo;
        if (subInfo3 != null) {
            num = subInfo3.subscribedMonth;
        } else {
            num = null;
        }
        c474500IjALIZ.LJJII(num, "subscribe_month");
        c474500IjALIZ.LJJII("auto_sub", "subscribe_type");
        SubInfo subInfo4 = ((SubscribingInfo) awS408S0200000_7.l0).subInfo;
        if (subInfo4 != null && (priceChangeInfo = subInfo4.priceChangeInfo) != null) {
            lValueOf = Long.valueOf(priceChangeInfo.nextBillingDate);
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "renewal_time");
        c474500IjALIZ.LIZ();
        ((C11KU) ((InterfaceC512380K7o) awS408S0200000_7.l1)).onComplete();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AwS408S0200000_7 awS408S0200000_7) {
        return ((InterfaceC451590HnJ) awS408S0200000_7.l0).LIZ((LifecycleOwner) ((Function0) awS408S0200000_7.l1).invoke());
    }

    public static final Object invoke$23(AwS408S0200000_7 awS408S0200000_7) {
        String str;
        String str2;
        Integer num;
        PriceChangeInfo priceChangeInfo;
        PriceChangeInfo priceChangeInfo2;
        PriceChangeInfo priceChangeInfo3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_change_price_sheet_not_now");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("app_start", "show_entrance");
        c474500IjALIZ.LJJII("notify_and_consent", "show_type");
        SubInfo subInfo = ((SubscribingInfo) awS408S0200000_7.l0).subInfo;
        Long lValueOf = null;
        if (subInfo != null && (priceChangeInfo3 = subInfo.priceChangeInfo) != null) {
            str = priceChangeInfo3.oldPrice;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "old_price");
        SubInfo subInfo2 = ((SubscribingInfo) awS408S0200000_7.l0).subInfo;
        if (subInfo2 != null && (priceChangeInfo2 = subInfo2.priceChangeInfo) != null) {
            str2 = priceChangeInfo2.newPrice;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "new_price");
        SubInfo subInfo3 = ((SubscribingInfo) awS408S0200000_7.l0).subInfo;
        if (subInfo3 != null) {
            num = subInfo3.subscribedMonth;
        } else {
            num = null;
        }
        c474500IjALIZ.LJJII(num, "subscribe_month");
        c474500IjALIZ.LJJII("auto_sub", "subscribe_type");
        SubInfo subInfo4 = ((SubscribingInfo) awS408S0200000_7.l0).subInfo;
        if (subInfo4 != null && (priceChangeInfo = subInfo4.priceChangeInfo) != null) {
            lValueOf = Long.valueOf(priceChangeInfo.nextBillingDate);
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "renewal_time");
        c474500IjALIZ.LIZ();
        ((C11KU) ((InterfaceC512380K7o) awS408S0200000_7.l1)).onComplete();
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS408S0200000_7 awS408S0200000_7) {
        ((AssemViewModel) ((PcsVideoPublishActivity) awS408S0200000_7.l0).LL.getValue()).setState(new AwS586S0100000_7((VideoPublishEditModel) awS408S0200000_7.l1, 570));
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS408S0200000_7 awS408S0200000_7) {
        ((AssemViewModel) ((PcsVideoPublishActivity) awS408S0200000_7.l0).LLILLJJLI.getValue()).setState(new AwS586S0100000_7(C1443310nf7.LJIIJ(C1443310nf7.LIZIZ, (VideoPublishEditModel) awS408S0200000_7.l1, null, Boolean.TRUE, 2), 501));
        AssemViewModel assemViewModel = (AssemViewModel) ((PcsVideoPublishActivity) awS408S0200000_7.l0).LLILLJJLI.getValue();
        if (!((C0JHL) assemViewModel.getState()).LLILZ) {
            assemViewModel.setState(new AwS22S0010000_7(3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS408S0200000_7 awS408S0200000_7) {
        C0J4W c0j4wC4;
        VerticalViewPager verticalViewPager;
        C0J3P c0j3p = C0J3P.LIZ;
        C0J3O c0j3o = (C0J3O) awS408S0200000_7.l0;
        c0j3p.getClass();
        C0J3P.LIZIZ = c0j3o;
        boolean zLIZLLL = C0J3P.LIZLLL();
        if (C0J3P.LJI != zLIZLLL) {
            C0J3O c0j3o2 = C0J3P.LIZIZ;
            if (c0j3o2 != null && (verticalViewPager = ((C1209120hZO) c0j3o2).LIZ.LLJJIJI) != null) {
                verticalViewPager.setDisableScroll(!zLIZLLL);
            }
            C0J3P.LJI = zLIZLLL;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (c0j4wC4 = iLiveOuterService.C4()) != null && !c0j4wC4.enable()) {
            SearchLiveCardViewHolder searchLiveCardViewHolder = (SearchLiveCardViewHolder) awS408S0200000_7.l1;
            searchLiveCardViewHolder.LLJIJIL = C0J3P.LJFF(searchLiveCardViewHolder.LLJILJIL, searchLiveCardViewHolder.LLJILLL, searchLiveCardViewHolder.LLJJIII, searchLiveCardViewHolder.LLJJ, searchLiveCardViewHolder.LLJJI);
        }
        SearchLiveCardViewHolder searchLiveCardViewHolder2 = (SearchLiveCardViewHolder) awS408S0200000_7.l1;
        searchLiveCardViewHolder2.LLJILLL = null;
        C0SUC.LIZ(searchLiveCardViewHolder2.LLILLL).setEcLiveExtra(null);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS408S0200000_7 awS408S0200000_7) {
        ((C0K7M) awS408S0200000_7.l0).Gs((DataResponse) awS408S0200000_7.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS408S0200000_7 awS408S0200000_7) {
        InterfaceC214902198i interfaceC214902198iLIZJ = C20629915o1.LIZJ((InterfaceC214897198d) awS408S0200000_7.l0);
        if ((interfaceC214902198iLIZJ instanceof Fragment) && interfaceC214902198iLIZJ != null) {
            FragmentManager fragmentManager = (FragmentManager) awS408S0200000_7.l1;
            return C13LP.LJLIL(fragmentManager.LJJLIIIJL(), Collections.singletonList(interfaceC214902198iLIZJ));
        }
        return ((FragmentManager) awS408S0200000_7.l1).LJJLIIIJL();
    }

    public static final Object invoke$29(AwS408S0200000_7 awS408S0200000_7) {
        C494790Jan c494790JanW2 = ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
        Context context = ((C16F5) awS408S0200000_7.l0).getContext();
        SubOnlyVideoContentFragment subOnlyVideoContentFragment = (SubOnlyVideoContentFragment) awS408S0200000_7.l1;
        c494790JanW2.LIZIZ(context, true, subOnlyVideoContentFragment.LLILZLL, "", subOnlyVideoContentFragment.LLILZIL, "sub_only_video_demo", null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS408S0200000_7 awS408S0200000_7) {
        ((C259800zU) awS408S0200000_7.l0).element = "home_page";
        PreviewSubscriptionWidget previewSubscriptionWidget = (PreviewSubscriptionWidget) awS408S0200000_7.l1;
        previewSubscriptionWidget.LLIZ.LIZIZ(previewSubscriptionWidget.context, SubscribeInvitationLynxUrlSetting.INSTANCE.getHome_page(), "invitation_letter", "live_take_page", "", "page");
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS408S0200000_7 awS408S0200000_7) {
        C494790Jan c494790JanW2 = ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
        Context context = ((C16F5) awS408S0200000_7.l0).getContext();
        SubOnlyVideoContentFragment subOnlyVideoContentFragment = (SubOnlyVideoContentFragment) awS408S0200000_7.l1;
        c494790JanW2.LIZIZ(context, true, subOnlyVideoContentFragment.LLILZLL, "", subOnlyVideoContentFragment.LLILZIL, "sub_only_video_demo", null);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS408S0200000_7 awS408S0200000_7) {
        String anchorPerksList = ((LiveSubscribeLynxMap) ((SubOnlyVideoContentFragment) awS408S0200000_7.l0).LLJJJIL.getValue()).getAnchorPerksList();
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
        Context context = ((C16F5) awS408S0200000_7.l1).getContext();
        String str = ((SubOnlyVideoContentFragment) awS408S0200000_7.l0).LLILZLL;
        C494790Jan.LJ(context, anchorPerksList, str, str, "", "", "", false, null, "page", "");
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS408S0200000_7 awS408S0200000_7) {
        C0KFM c0kfm;
        WeakReference<Activity> weakReference;
        Activity activityLIZJ = C511520K4g.LIZJ();
        if (activityLIZJ != null || ((c0kfm = ((C0KMY) awS408S0200000_7.l0).LIZLLL) != null && (weakReference = c0kfm.LIZJ) != null && (activityLIZJ = weakReference.get()) != null)) {
            C511230K3d.LIZ(activityLIZJ, (Throwable) awS408S0200000_7.l1, 2131839337);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS408S0200000_7 awS408S0200000_7) {
        Activity activity;
        WeakReference<Activity> weakReference;
        C0KSC c0ksc = C0KSC.LIZ;
        C517840KSo c517840KSo = ((TreasureBoxViewModel) awS408S0200000_7.l0).LL;
        if (c517840KSo != null && (weakReference = c517840KSo.LIZ) != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        Throwable th = (Throwable) awS408S0200000_7.l1;
        c0ksc.getClass();
        C176600m4.LIZJ(new AwS408S0200000_7(activity, th, 37));
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS408S0200000_7 awS408S0200000_7) {
        C501540Jlg.LIZLLL(((C517840KSo) awS408S0200000_7.l0).LIZ.get(), (Throwable) awS408S0200000_7.l1, 2131851936);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS408S0200000_7 awS408S0200000_7) {
        C476640Imc.LIZIZ((C013C) awS408S0200000_7.l0, (Function0) awS408S0200000_7.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS408S0200000_7 awS408S0200000_7) {
        SuperFanViewModel superFanViewModel = (SuperFanViewModel) awS408S0200000_7.l0;
        Activity activity = (Activity) awS408S0200000_7.l1;
        superFanViewModel.getClass();
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(activity, SuperFanPurchaseConfig.INSTANCE.getConfig().feedbackUrl);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS408S0200000_7 awS408S0200000_7) {
        Throwable th = (Throwable) awS408S0200000_7.l0;
        if (th instanceof C501470JlZ) {
            Map<String, Object> map = C1338270kvh.LIZ;
            switch (((C501520Jle) th).getErrorCode()) {
                case 41155:
                    C0KSC c0ksc = C0KSC.LIZ;
                    C501470JlZ c501470JlZ = (C501470JlZ) ((Throwable) awS408S0200000_7.l0);
                    c0ksc.getClass();
                    C0KSC.LIZIZ(c501470JlZ, 2131844529);
                    break;
                case 4005189:
                case 4005272:
                    C0KSC c0ksc2 = C0KSC.LIZ;
                    Context context = (Context) awS408S0200000_7.l1;
                    String prompt = ((C501470JlZ) ((Throwable) awS408S0200000_7.l0)).getPrompt();
                    if (prompt == null || prompt.length() != 0) {
                        prompt = C497740JfY.LJIJI(2131841279);
                    }
                    c0ksc2.getClass();
                    C0KSC.LIZ(context, "", prompt);
                    break;
                case 4005192:
                case 4005208:
                case 4005209:
                case 4025002:
                    C0KSC c0ksc3 = C0KSC.LIZ;
                    Context context2 = (Context) awS408S0200000_7.l1;
                    String strLJIJI = C497740JfY.LJIJI(2131856666);
                    String prompt2 = ((C501470JlZ) ((Throwable) awS408S0200000_7.l0)).getPrompt();
                    c0ksc3.getClass();
                    C0KSC.LIZ(context2, strLJIJI, prompt2);
                    break;
                case 4005256:
                case 4005257:
                    C0KSC c0ksc4 = C0KSC.LIZ;
                    C501470JlZ c501470JlZ2 = (C501470JlZ) ((Throwable) awS408S0200000_7.l0);
                    c0ksc4.getClass();
                    C0KSC.LIZIZ(c501470JlZ2, 2131843092);
                    break;
                case 4025001:
                    C0KSC c0ksc5 = C0KSC.LIZ;
                    Context context3 = (Context) awS408S0200000_7.l1;
                    String strLJIJI2 = C497740JfY.LJIJI(2131856667);
                    String prompt3 = ((C501470JlZ) ((Throwable) awS408S0200000_7.l0)).getPrompt();
                    c0ksc5.getClass();
                    C0KSC.LIZ(context3, strLJIJI2, prompt3);
                    break;
                default:
                    C501540Jlg.LIZLLL((Context) awS408S0200000_7.l1, (Throwable) awS408S0200000_7.l0, 2131851936);
                    break;
            }
        } else {
            C766270U4b.LIZLLL(2131843092);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS408S0200000_7 awS408S0200000_7) {
        Activity activity;
        WeakReference<Activity> weakReference;
        C517840KSo c517840KSo = ((SuperFanViewModel) awS408S0200000_7.l0).LLILLJJLI;
        if (c517840KSo != null && (weakReference = c517840KSo.LIZ) != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        C501540Jlg.LIZLLL(activity, (Throwable) awS408S0200000_7.l1, 2131851936);
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS408S0200000_7 awS408S0200000_7) {
        Activity activity;
        WeakReference<Activity> weakReference;
        C0KPG c0kpg = (C0KPG) awS408S0200000_7.l0;
        if (c0kpg != null && c0kpg.LIZ != C0KPI.SUCCESS) {
            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
            C517840KSo c517840KSo = ((SuperFanViewModel) awS408S0200000_7.l1).LLILLJJLI;
            if (c517840KSo != null && (weakReference = c517840KSo.LIZ) != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            interfaceC1791930wjP.LJFF(activity, (C0KPG) awS408S0200000_7.l0, "80XR2DK73101", null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$4(kotlin.jvm.internal.AwS408S0200000_7 r10) {
        /*
            java.lang.Object r0 = r10.l0
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L65
            X.0Ihi r1 = X.ViewOnTouchListenerC473590Ihh.LLIZLLLIL
            if (r1 == 0) goto L8c
            int r5 = r1.LIZJ
            int r4 = r1.LIZLLL
        L12:
            r9 = 0
            if (r1 == 0) goto L88
            android.graphics.Point r0 = r1.LJ
            if (r0 == 0) goto L88
            int r0 = r0.x
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L1f:
            android.graphics.Point r0 = r1.LJ
            if (r0 == 0) goto L29
            int r0 = r0.y
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L29:
            android.view.ViewGroup r3 = X.ViewOnTouchListenerC473590Ihh.LLJILJILJ
            if (r3 == 0) goto L65
            java.lang.Object r7 = r10.l0
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r6 = r10.l1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            if (r2 == 0) goto L9e
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r2.height
            int r0 = r7.getWidth()
            int r1 = r1 * r0
            float r1 = (float) r1
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = X.C814420VxA.LIZIZ(r1)
            r2.width = r0
            X.0IaR r0 = X.ViewOnTouchListenerC473590Ihh.LLJJIJIIJIL
            if (r0 == 0) goto L78
            int r1 = r0.LIZ
        L57:
            r2.setMarginStart(r1)
            X.0IaR r0 = X.ViewOnTouchListenerC473590Ihh.LLJJIJIIJIL
            if (r0 == 0) goto L68
            int r1 = r0.LIZIZ
        L60:
            r2.topMargin = r1
            X.C786410Ut5.W5(r3, r2)
        L65:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L68:
            if (r9 == 0) goto L6f
            int r1 = r9.intValue()
            goto L60
        L6f:
            int r1 = r6.getHeight()
            int r1 = r1 - r4
            int r0 = r2.height
            int r1 = r1 - r0
            goto L60
        L78:
            if (r8 == 0) goto L7f
            int r1 = r8.intValue()
            goto L57
        L7f:
            int r1 = r6.getWidth()
            int r1 = r1 - r5
            int r0 = r2.width
            int r1 = r1 - r0
            goto L57
        L88:
            r8 = r9
            if (r1 == 0) goto L29
            goto L1f
        L8c:
            int r5 = X.ViewOnTouchListenerC473590Ihh.LLJLILLLLZIIL
            r0 = 186(0xba, float:2.6E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r4 = X.C814420VxA.LIZIZ(r0)
            goto L12
        L9e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS408S0200000_7.invoke$4(kotlin.jvm.internal.AwS408S0200000_7):java.lang.Object");
    }

    public static final Object invoke$40(AwS408S0200000_7 awS408S0200000_7) {
        ((C1397660mTU) awS408S0200000_7.l0).LIZ().LIZIZ(null);
        ((DetailSettingDialogFragment) awS408S0200000_7.l1).dismissAllowingStateLoss();
        C0JCX.LIZ(2131839576);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS408S0200000_7 awS408S0200000_7) {
        ((C1397660mTU) awS408S0200000_7.l0).LIZ().LIZIZ(null);
        ((SpaceFeedGuestSettingDialogFragment) awS408S0200000_7.l1).dismissAllowingStateLoss();
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS408S0200000_7 awS408S0200000_7) {
        C477860Ioa.LIZJ(0L, "random_match_landing_page", "click");
        ((HangoutInteractModuleV2Assem) awS408S0200000_7.l0).up((MGModuleInteraction) awS408S0200000_7.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[PHI: r10
      0x0021: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v3 int) binds: [B:31:0x006f, B:10:0x001b, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$43(kotlin.jvm.internal.AwS408S0200000_7 r11) {
        /*
            java.lang.Object r5 = r11.l0
            X.0Imu r5 = (X.AbstractC476820Imu) r5
            java.lang.Object r1 = r11.l1
            webcast.api.room.StrategyCheckData r1 = (webcast.api.room.StrategyCheckData) r1
            boolean r0 = r5.LJIIIZ()
            if (r0 != 0) goto L6b
            webcast.api.room.ShowMode r1 = r1.showMode
            r4 = 0
            if (r1 == 0) goto L6e
            webcast.api.room.TopliveTooltip r0 = r1.topliveTooltip
            if (r0 == 0) goto L6e
            int r10 = r0.tooltipType
        L19:
            webcast.api.room.TopliveTooltip r0 = r1.topliveTooltip
            if (r0 == 0) goto L21
            java.lang.String r6 = r0.text
            if (r6 != 0) goto L23
        L21:
            java.lang.String r6 = ""
        L23:
            X.00w2 r3 = new X.00w2
            r3.<init>()
            X.00w2 r2 = new X.00w2
            r2.<init>()
            X.0Ihv r1 = r5.LJJI
            if (r1 == 0) goto L6b
            kotlin.jvm.internal.AwS147S0101000_7 r8 = new kotlin.jvm.internal.AwS147S0101000_7
            r0 = 0
            r8.<init>(r10, r3, r0)
            kotlin.jvm.internal.AwS147S0101000_7 r11 = new kotlin.jvm.internal.AwS147S0101000_7
            r0 = 1
            r11.<init>(r10, r2, r0)
            X.0Iht r9 = new X.0Iht
            r9.<init>(r3, r10, r2, r5)
            X.0InV r1 = (X.C477190InV) r1
            androidx.recyclerview.widget.RecyclerView r0 = r1.LLILZ
            r7 = 0
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.RecyclerView$ViewHolder r7 = r0.findViewHolderForAdapterPosition(r4)
        L4d:
            boolean r0 = r7 instanceof com.bytedance.android.livesdk.feed.adapter.viewholder.GoLiveViewHolder
            if (r0 == 0) goto L6b
            com.bytedance.android.livesdk.feed.adapter.viewholder.GoLiveViewHolder r7 = (com.bytedance.android.livesdk.feed.adapter.viewholder.GoLiveViewHolder) r7
            if (r7 == 0) goto L6b
            android.view.View r0 = r7.itemView
            android.content.Context r5 = r0.getContext()
            if (r5 == 0) goto L6b
            X.0kZq r4 = r7.LLJILJIL
            if (r4 == 0) goto L6b
            r7.LLJI = r10
            X.0J3J r3 = new X.0J3J
            r3.<init>()
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r4, r3)
        L6b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6e:
            r10 = 0
            if (r1 == 0) goto L21
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS408S0200000_7.invoke$43(kotlin.jvm.internal.AwS408S0200000_7):java.lang.Object");
    }

    public static final Object invoke$44(AwS408S0200000_7 awS408S0200000_7) {
        ((PcsCoursePriceTierSheet) awS408S0200000_7.l0).BS();
        ((Function0) awS408S0200000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS408S0200000_7 awS408S0200000_7) {
        ((PcsCourseManagementContainerAssem) awS408S0200000_7.l0).hp().FQ2(true);
        C489110JGb.LIZJ(((PcsCourseManagementContainerAssem) awS408S0200000_7.l0).hp().zQ2(), "submit", "click");
        ((Function0) awS408S0200000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS408S0200000_7 awS408S0200000_7) {
        PcsCourseManageVM pcsCourseManageVMHp = ((PcsCourseManagementContainerAssem) awS408S0200000_7.l0).hp();
        pcsCourseManageVMHp.getClass();
        pcsCourseManageVMHp.xQ2(new AwS551S0100000_7(pcsCourseManageVMHp, 708));
        C489110JGb.LIZJ(((PcsCourseManagementContainerAssem) awS408S0200000_7.l0).hp().zQ2(), "submit", "click");
        ((Function0) awS408S0200000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS408S0200000_7 awS408S0200000_7) {
        ((InterfaceC518120KTq) awS408S0200000_7.l0).LIZ((C0KPG) awS408S0200000_7.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS408S0200000_7 awS408S0200000_7) {
        ((InterfaceC1791300wiO) awS408S0200000_7.l0).LIZLLL((C518150KTt) awS408S0200000_7.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS408S0200000_7 awS408S0200000_7) {
        ((InterfaceC518100KTo) awS408S0200000_7.l0).LIZ((Map) awS408S0200000_7.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS408S0200000_7 awS408S0200000_7) {
        ((NewTopRightBannerWidget) awS408S0200000_7.l0).H1((BannerInRoomCollection.BannerInfo) awS408S0200000_7.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS408S0200000_7 awS408S0200000_7) {
        if (((C0JH3) awS408S0200000_7.l0).LLILZ != null) {
            PcsVideoPublishVM.wQ2(((InterfaceC489200JGk) awS408S0200000_7.l1).LJII());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$51(AwS408S0200000_7 awS408S0200000_7) {
        IPcsCourseManageVmAbility iPcsCourseManageVmAbility;
        C0JH3 c0jh3 = (C0JH3) awS408S0200000_7.l0;
        InterfaceC489200JGk interfaceC489200JGk = (InterfaceC489200JGk) awS408S0200000_7.l1;
        InterfaceC665370Q7z interfaceC665370Q7z = c0jh3.LLILLJJLI;
        if (interfaceC665370Q7z != null && (iPcsCourseManageVmAbility = (IPcsCourseManageVmAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPcsCourseManageVmAbility.class, null)) != null) {
            iPcsCourseManageVmAbility.VO2(interfaceC489200JGk);
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131855811));
        return Unit.LIZ;
    }

    public static final Object invoke$52(AwS408S0200000_7 awS408S0200000_7) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("share");
        c474500IjALIZ.LJIJJLI(((PreviewShareWidget) awS408S0200000_7.l0).dataChannel);
        c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, ((PreviewShareWidget) awS408S0200000_7.l0).dataChannel, "user_live_share"));
        c474500IjALIZ.LJJIIZI((Map) awS408S0200000_7.l1);
        c474500IjALIZ.LJJIIZI(C2097608Jq.LJIIZILJ(C481150Itt.LIZ));
        c474500IjALIZ.LIZ();
        C481150Itt.LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS408S0200000_7 awS408S0200000_7) {
        StrategyCheckData strategyCheckData = (StrategyCheckData) awS408S0200000_7.l0;
        if (strategyCheckData.decision == 1) {
            ((Function2) awS408S0200000_7.l1).invoke(Boolean.TRUE, "success");
        } else {
            ((Function2) awS408S0200000_7.l1).invoke(Boolean.FALSE, strategyCheckData.detail);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$54(AwS408S0200000_7 awS408S0200000_7) {
        ((PcsCourseManagementContainerAssemV2) awS408S0200000_7.l0).hp().FQ2(true);
        C489110JGb.LIZJ(((PcsCourseManagementContainerAssemV2) awS408S0200000_7.l0).hp().zQ2(), "submit", "click");
        ((Function0) awS408S0200000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$55(AwS408S0200000_7 awS408S0200000_7) {
        ((PcsCoursePriceTierSheetV2) awS408S0200000_7.l0).BS();
        ((Function0) awS408S0200000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$56(AwS408S0200000_7 awS408S0200000_7) {
        PcsCourseManageVM pcsCourseManageVMHp = ((PcsCourseManagementContainerAssemV2) awS408S0200000_7.l0).hp();
        pcsCourseManageVMHp.getClass();
        pcsCourseManageVMHp.xQ2(new AwS551S0100000_7(pcsCourseManageVMHp, 708));
        C489110JGb.LIZJ(((PcsCourseManagementContainerAssemV2) awS408S0200000_7.l0).hp().zQ2(), "submit", "click");
        ((Function0) awS408S0200000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$57(AwS408S0200000_7 awS408S0200000_7) {
        ((Function0) awS408S0200000_7.l0).invoke();
        C489110JGb.LJIIJJI(((CourseVideoListCell) awS408S0200000_7.l1).L5(), ((CourseVideoListCell) awS408S0200000_7.l1).LLJILLL, "confirm_peel", "click");
        return Unit.LIZ;
    }

    public static final Object invoke$58(AwS408S0200000_7 awS408S0200000_7) {
        PcsCourseManageVM pcsCourseManageVMI5 = ((CourseVideoListCell) awS408S0200000_7.l0).I5();
        InterfaceC489200JGk interfaceC489200JGk = (InterfaceC489200JGk) awS408S0200000_7.l1;
        List<InterfaceC489200JGk> list = pcsCourseManageVMI5.getState().LLILLL.LIZ;
        int iIndexOf = list.indexOf(interfaceC489200JGk);
        if (iIndexOf > 0) {
            ListProtector.remove(list, iIndexOf);
            ListProtector.add(list, 0, interfaceC489200JGk);
            pcsCourseManageVMI5.setState(new AwS586S0100000_7((List) list, (List<GameDrawerCategory>) 440));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InterfaceC489200JGk> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ(true)));
            }
            pcsCourseManageVMI5.setState(new AwS586S0100000_7((List) arrayList, (List<GameDrawerCategory>) 441));
            pcsCourseManageVMI5.FQ2(true);
        }
        C489110JGb.LJIIIZ(((CourseVideoListCell) awS408S0200000_7.l0).L5(), "move_to_top", "click");
        return Boolean.TRUE;
    }

    public static final Object invoke$59(AwS408S0200000_7 awS408S0200000_7) {
        CourseVideoListCell courseVideoListCell = (CourseVideoListCell) awS408S0200000_7.l0;
        courseVideoListCell.I5().VO2((InterfaceC489200JGk) awS408S0200000_7.l1);
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131855811));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS408S0200000_7 awS408S0200000_7) {
        ((NewTopRightBannerWidget) awS408S0200000_7.l0).H1(((BannerInRoomCollection) awS408S0200000_7.l1).topRightBanner);
        return Unit.LIZ;
    }

    public static final Object invoke$60(AwS408S0200000_7 awS408S0200000_7) {
        int i;
        C488550JDx state;
        GetSMBCourseDetailResponse.Data data;
        SMBCourse sMBCourse;
        AwS408S0200000_7 awS408S0200000_72 = new AwS408S0200000_7((CourseVideoListCell) awS408S0200000_7.l0, (InterfaceC489200JGk) awS408S0200000_7.l1, 59);
        CourseVideoListCell courseVideoListCell = (CourseVideoListCell) awS408S0200000_7.l0;
        PcsCourseManageVM pcsCourseManageVMI5 = courseVideoListCell.I5();
        if (pcsCourseManageVMI5 != null && (state = pcsCourseManageVMI5.getState()) != null && (data = state.LLILLJJLI) != null && (sMBCourse = data.course) != null && sMBCourse.hasCustomers) {
            i = 2131855757;
        } else {
            i = 2131855756;
        }
        Context context = courseVideoListCell.getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131855758);
            c1397580mTM.LIZ(i);
            C985403tE.LIZ(c1397580mTM, new AwS373S0200000_7(awS408S0200000_72, courseVideoListCell, 65));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C489110JGb.LJIIJ(courseVideoListCell.L5(), courseVideoListCell.I5(), "", "show");
        }
        C489110JGb.LJIIIZ(((CourseVideoListCell) awS408S0200000_7.l0).L5(), "delete", "click");
        return Boolean.TRUE;
    }

    public static final Object invoke$61(AwS408S0200000_7 awS408S0200000_7) {
        final LinkedHashSet linkedHashSet;
        Room room;
        C0ISJ c0isj = (C0ISJ) awS408S0200000_7.l0;
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) awS408S0200000_7.l1;
        c0isj.getClass();
        if (linkedHashSet2.isEmpty()) {
            linkedHashSet = new LinkedHashSet();
        } else {
            linkedHashSet = new LinkedHashSet();
            int size = c0isj.LLJILJIL.size();
            for (int i = c0isj.LLJI + 1; i < size; i++) {
                Room room2 = (Room) ListProtector.get(c0isj.LLJILJIL, i);
                if (linkedHashSet2.contains(Long.valueOf(room2.getId())) && room2.getId() != c0isj.LLLLIILL && !c0isj.LLJJJJLIIL.contains(Long.valueOf(room2.getId())) && !room2.isShow) {
                    linkedHashSet.add(Long.valueOf(room2.getId()));
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            ((C0ISJ) awS408S0200000_7.l0).LJJJJJ(20);
        } else {
            C0ISJ c0isj2 = (C0ISJ) awS408S0200000_7.l0;
            c0isj2.getClass();
            if (!linkedHashSet.isEmpty()) {
                final String uniqueItemId = null;
                if (!c0isj2.LLJILJIL.isEmpty()) {
                    int size2 = c0isj2.LLJILJIL.size();
                    int i2 = c0isj2.LLJI;
                    if (size2 > i2 && (room = (Room) ListProtector.get(c0isj2.LLJILJIL, i2)) != null) {
                        uniqueItemId = room.getUniqueItemId();
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("doRemoveNonCurrentItemsV2 itemIdsToRemove = ");
                sbLIZ.append(C13LP.LJJLIIIJ(linkedHashSet, "|", null, null, 0, null, null, 62));
                C20441214yg.LIZIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
                ArrayList<Room> arrayList = c0isj2.LLJILJIL;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator<Room> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getRequestId());
                }
                final LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                c0isj2.LJJJJIZL(new C0ISF<Room>() { // from class: X.0IL1
                    @Override // X.C0ISF
                    public final boolean LIZ(Room room3) {
                        long id;
                        Set<Long> set = linkedHashSet;
                        Long lValueOf = null;
                        if (room3 != null) {
                            lValueOf = Long.valueOf(room3.getId());
                        }
                        if (C13LP.LJJJJ(lValueOf, set) && uniqueItemId != null && room3 != null && room3.getUniqueItemId() != null && !Intrinsics.LJFF(uniqueItemId, room3.getUniqueItemId())) {
                            Set<Long> set2 = linkedHashSet3;
                            if (room3 != null) {
                                id = room3.getId();
                            } else {
                                id = 0;
                            }
                            set2.add(Long.valueOf(id));
                            return true;
                        }
                        return false;
                    }
                }, true);
                linkedHashSet.remove(Long.valueOf(c0isj2.LLLLIILL));
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    C0IU0.LIZ.remove(Long.valueOf(((Number) it3.next()).longValue()));
                }
            }
            Iterator<Map.Entry<String, HashSet<Long>>> it4 = ((C0ISJ) awS408S0200000_7.l0).LLJJL.entrySet().iterator();
            while (it4.hasNext()) {
                it4.next().getValue().removeAll(linkedHashSet);
            }
            ((C0ISJ) awS408S0200000_7.l0).LJJJJJ(8);
        }
        ((C0ISJ) awS408S0200000_7.l0).LLLLLLJ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$62(AwS408S0200000_7 awS408S0200000_7) {
        View viewFindViewById = ((View) awS408S0200000_7.l0).findViewById(R.id.xel);
        C1619720sFe.LIZ.LIZ(1003);
        viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), (int) C12ES.LIZJ(0, ((IncentiveTaskPageFragment) awS408S0200000_7.l1).getContext()));
        return Unit.LIZ;
    }

    public static final Object invoke$63(AwS408S0200000_7 awS408S0200000_7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C13IQ) awS408S0200000_7.l0).LJI());
        sbLIZ.append('_');
        sbLIZ.append(((C1262850iy3) awS408S0200000_7.l1).hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$64(AwS408S0200000_7 awS408S0200000_7) {
        IEnigmaService iEnigmaService;
        C1124290fMZ c1124290fMZ = (C1124290fMZ) awS408S0200000_7.l0;
        String str = ((EntranceIconAnimation) awS408S0200000_7.l1).animationUuid;
        c1124290fMZ.getClass();
        C0JT6<List<String>> c0jt6 = InterfaceC1106030et7.H6;
        List<String> listLIZ = c0jt6.LIZ();
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (listLIZ.size() >= 10) {
            arrayList.addAll(C13LP.LLD(5, listLIZ));
        } else {
            arrayList.addAll(listLIZ);
        }
        arrayList.add(str);
        c0jt6.LIZJ(arrayList);
        if (((EntranceIconAnimation) awS408S0200000_7.l1).businessType == 1 && (iEnigmaService = (IEnigmaService) C1161920gLG.LIZJ(IEnigmaService.class)) != null) {
            iEnigmaService.Bl2(((EntranceIconAnimation) awS408S0200000_7.l1).animationUuid);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$65(AwS408S0200000_7 awS408S0200000_7) {
        MutableLiveData<C0KDP> mutableLiveData;
        PackagePageViewModel packagePageViewModel = ((SubPackageMultiMonthFragment) awS408S0200000_7.l0).LLILLL;
        if (packagePageViewModel != null && (mutableLiveData = packagePageViewModel.LLJI) != null) {
            mutableLiveData.removeObserver((Observer) awS408S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$66(AwS408S0200000_7 awS408S0200000_7) {
        MutableLiveData<C0KDP> mutableLiveData;
        UpDowngradePackageViewModel upDowngradePackageViewModel = ((SubUpdowngradePackageFragment) awS408S0200000_7.l0).LLILLL;
        if (upDowngradePackageViewModel != null && (mutableLiveData = upDowngradePackageViewModel.LLJ) != null) {
            mutableLiveData.removeObserver((Observer) awS408S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$67(AwS408S0200000_7 awS408S0200000_7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isBottombarEnterLiveQuickly ,enableHero ");
        sbLIZ.append((Boolean) awS408S0200000_7.l0);
        sbLIZ.append(", enablePage ");
        sbLIZ.append((Boolean) awS408S0200000_7.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$68(AwS408S0200000_7 awS408S0200000_7) {
        String string;
        View view;
        View viewFindViewById;
        C0K25 c0k25 = C0K25.LIZ;
        String strAS = ((SubscriptionPrivilegeDetailFragment) awS408S0200000_7.l0).aS();
        String str = ((SubscriptionPrivilegeDetailFragment) awS408S0200000_7.l0).LLILZLL;
        PGCSubLiveBanner pGCSubLiveBanner = ((PGCGetSubPrivilegeDetailResponse.Data) awS408S0200000_7.l1).banner;
        if (pGCSubLiveBanner == null || (string = Long.valueOf(pGCSubLiveBanner.id).toString()) == null) {
            string = "";
        }
        c0k25.getClass();
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_operation_top_banner_show");
        if (strAS != null) {
            c511970K5z.LIZIZ(strAS, "subscribe_state");
        }
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ(string, "banner_id");
        c511970K5z.LIZLLL();
        C16G0 c16g0SS = ((SubscriptionPrivilegeDetailFragment) awS408S0200000_7.l0).sS();
        if (c16g0SS != null) {
            ViewGroup.LayoutParams layoutParams = c16g0SS.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = (int) C511520K4g.LIZ(50.0f);
                C786410Ut5.W5(c16g0SS, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        Fragment parentFragment = ((SubscriptionPrivilegeDetailFragment) awS408S0200000_7.l0).getParentFragment();
        if (parentFragment != null && (view = parentFragment.getView()) != null && (viewFindViewById = view.findViewById(R.id.es1)) != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = (int) C511520K4g.LIZ(50.0f);
                C786410Ut5.W5(viewFindViewById, marginLayoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$69(AwS408S0200000_7 awS408S0200000_7) {
        String string;
        C0K25 c0k25 = C0K25.LIZ;
        String strAS = ((SubscriptionPrivilegeDetailFragment) awS408S0200000_7.l0).aS();
        String str = ((SubscriptionPrivilegeDetailFragment) awS408S0200000_7.l0).LLILZLL;
        PGCSubLiveBanner pGCSubLiveBanner = ((PGCGetSubPrivilegeDetailResponse.Data) awS408S0200000_7.l1).banner;
        if (pGCSubLiveBanner == null || (string = Long.valueOf(pGCSubLiveBanner.id).toString()) == null) {
            string = "";
        }
        c0k25.getClass();
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_operation_top_banner_click");
        if (strAS != null) {
            c511970K5z.LIZIZ(strAS, "subscribe_state");
        }
        c511970K5z.LIZIZ(str, "show_entrance");
        c511970K5z.LIZIZ(string, "banner_id");
        c511970K5z.LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS408S0200000_7 awS408S0200000_7) {
        long jLongValue;
        ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget = (ProgrammedLiveFollowCardWidget) awS408S0200000_7.l0;
        FollowCardMessage followCardMessage = (FollowCardMessage) HandlerHook.getMessageObj(((Message) awS408S0200000_7.l1).obj);
        Room room = programmedLiveFollowCardWidget.LLJILJILJ;
        if (room != null) {
            long id = room.getId();
            C480460Ism.LIZ().getClass();
            ProgrammedLiveApi programmedLiveApi = (ProgrammedLiveApi) C480460Ism.LIZLLL(ProgrammedLiveApi.class);
            Long l = followCardMessage.followCardId;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            programmedLiveApi.getFollowCard(id, jLongValue).LJIILIIL(new C0UO0()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS143S0200000_7((Object) followCardMessage, (EmoteModel) programmedLiveFollowCardWidget, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 7), new AfS176S0100000_7(programmedLiveFollowCardWidget, 291));
        }
        ((ProgrammedLiveFollowCardWidget) awS408S0200000_7.l0).LLJILLL = new Pair<>(HandlerHook.getMessageObj(((Message) awS408S0200000_7.l1).obj), Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$70(AwS408S0200000_7 awS408S0200000_7) {
        C013C c013c = (C013C) awS408S0200000_7.l0;
        Function0 function0 = (Function0) awS408S0200000_7.l1;
        if (!c013c.element) {
            c013c.element = true;
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$71(AwS408S0200000_7 awS408S0200000_7) {
        C013C c013c = (C013C) awS408S0200000_7.l0;
        Function0 function0 = (Function0) awS408S0200000_7.l1;
        if (!c013c.element) {
            c013c.element = true;
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$72(AwS408S0200000_7 awS408S0200000_7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveHostNoStreamListener.onDownlinkMessageReceived: notifyMessage ");
        C481760Ius c481760Ius = C481760Ius.LL;
        FeedUserRoomMonitorMessage feedUserRoomMonitorMessage = (FeedUserRoomMonitorMessage) awS408S0200000_7.l0;
        c481760Ius.getClass();
        sbLIZ.append(C481760Ius.LIZJ(feedUserRoomMonitorMessage));
        sbLIZ.append(", seqDetectResult=");
        sbLIZ.append(((FeedUserRoomMonitorMessage) awS408S0200000_7.l0).seqDetectResult);
        C20441214yg.LIZIZ("SignalingRoomState", C2188811AlT.LIZIZ(sbLIZ));
        ILiveStatusCheckService iLiveStatusCheckService = (ILiveStatusCheckService) C1161920gLG.LIZJ(ILiveStatusCheckService.class);
        if (iLiveStatusCheckService != null && iLiveStatusCheckService.C82((FeedUserRoomMonitorMessage) awS408S0200000_7.l0)) {
            ((Function0) awS408S0200000_7.l1).invoke();
        }
        DataChannelGlobal.LLILZ.HQ2(GlobalRoomMessage.class, (FeedUserRoomMonitorMessage) awS408S0200000_7.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$73(AwS408S0200000_7 awS408S0200000_7) {
        ((HashMap) awS408S0200000_7.l0).putAll(((IInteractService) awS408S0200000_7.l1).getMatchLogParams());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$74(AwS408S0200000_7 awS408S0200000_7) {
        Activity activity;
        SuperFanViewModel superFanViewModel;
        C517840KSo c517840KSo;
        WeakReference<Activity> weakReference;
        WeakReference<SuperFanViewModel> weakReference2 = C517910KSv.LIZ;
        if (weakReference2 != null && (superFanViewModel = weakReference2.get()) != null && (c517840KSo = superFanViewModel.LLILLJJLI) != null && (weakReference = c517840KSo.LIZ) != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        C782110Um9 c782110Um9 = new C782110Um9(activity);
        C0KTF c0ktf = (C0KTF) awS408S0200000_7.l0;
        c782110Um9.LIZJ = c0ktf.LIZ;
        c782110Um9.LJIIIZ(c0ktf.LIZIZ);
        C0KTF c0ktf2 = (C0KTF) awS408S0200000_7.l0;
        c782110Um9.LJIILJJIL(c0ktf2.LIZLLL, new AcS494S0100000_7(c0ktf2, 10));
        c782110Um9.LJIIJJI(((C0KTF) awS408S0200000_7.l0).LIZJ, new AcS494S0100000_7((CompletionBlock) awS408S0200000_7.l1, 11));
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILLIIL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$75(AwS408S0200000_7 awS408S0200000_7) {
        ((LiveNotificationItem) awS408S0200000_7.l0).itemView.setBackground(null);
        C339190DRl.LIZIZ((View) ((LiveNotificationItem) awS408S0200000_7.l0).LLILZIL.getValue());
        AssemVMLazy assemVMLazy = ((LiveNotificationItem) awS408S0200000_7.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveNotificationItem.LLJILLL;
        LiveNotificationListViewModel liveNotificationListViewModel = (LiveNotificationListViewModel) assemVMLazy.getValue();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveNotificationListViewModel), null, null, new C484370Iz5(liveNotificationListViewModel, ((NoticeItem) awS408S0200000_7.l1).noticeId, null), 3);
        ((NoticeItem) awS408S0200000_7.l1).hasRead = true;
        return Unit.LIZ;
    }

    public static final Object invoke$76(AwS408S0200000_7 awS408S0200000_7) {
        ((PcsCourseActivity) awS408S0200000_7.l0).LLLLZIL().xQ2(null);
        ((PcsCourseActivity) awS408S0200000_7.l0).finish();
        C489110JGb.LIZJ(((PcsCourseActivity) awS408S0200000_7.l0).LLLLZIL().zQ2(), "confirm", "click");
        ((Function0) awS408S0200000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$77(AwS408S0200000_7 awS408S0200000_7) {
        C489110JGb.LIZJ(((PcsCourseActivity) awS408S0200000_7.l0).LLLLZIL().zQ2(), "submit", "cancel");
        ((Function0) awS408S0200000_7.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$78(AwS408S0200000_7 awS408S0200000_7) {
        C0KNI c0kni = (C0KNI) awS408S0200000_7.l0;
        Context context = (Context) awS408S0200000_7.l1;
        c0kni.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse("https://support.google.com/googleplay/answer/1267137?co=GENIE.Platform%3DAndroid"));
        try {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUawvQgCF9hFwDEFG3+8oA+67uamKbp3dxfXDqG9xkMY86DNI5q786kOuMsXg==", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0JCX.LIZ(2131839337);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$79(AwS408S0200000_7 awS408S0200000_7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((AbstractC1100450ek7) awS408S0200000_7.l0).getClass().getName());
        sbLIZ.append('_');
        sbLIZ.append(C09R7.LIZ((C13IQ) awS408S0200000_7.l1).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS408S0200000_7 awS408S0200000_7) {
        Map<String, Object> mapLIZ;
        long id;
        long id2;
        String strLIZ;
        Room roomLJJLIIIIJ;
        User userLJIIIIZZ;
        InterfaceC1107590evd interfaceC1107590evd = ((C262100zr) awS408S0200000_7.l0).LIZIZ;
        if (interfaceC1107590evd != null) {
            mapLIZ = interfaceC1107590evd.LIZ();
        } else {
            mapLIZ = null;
        }
        HashMap map = new HashMap();
        if (mapLIZ != null) {
            for (Map.Entry<String, Object> entry : mapLIZ.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    map.put(key, value.toString());
                }
            }
        }
        SuperFanViewModel superFanViewModel = (SuperFanViewModel) awS408S0200000_7.l1;
        C517840KSo c517840KSo = superFanViewModel.LLILLJJLI;
        if (c517840KSo != null) {
            DataChannel dataChannel = superFanViewModel.getDataChannel();
            if (dataChannel != null && (userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel)) != null) {
                id = userLJIIIIZZ.getId();
            } else {
                id = 0;
            }
            DataChannel dataChannel2 = superFanViewModel.getDataChannel();
            if (dataChannel2 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null) {
                id2 = roomLJJLIIIIJ.getId();
            } else {
                id2 = 0;
            }
            GetFansBasicInfoReq getFansBasicInfoReq = new GetFansBasicInfoReq();
            getFansBasicInfoReq.anchorId = id;
            getFansBasicInfoReq.userId = UserService.getInstance().user().getCurrentUserId();
            getFansBasicInfoReq.infoEnums = C1697810uHb.LJIILJJIL(0, 3);
            ISubscribeService iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
            if (iSubscribeService != null && iSubscribeService.Ae() != null) {
                strLIZ = C516700KOe.LIZ();
            } else {
                strLIZ = "";
            }
            getFansBasicInfoReq.iapCountryCode = strLIZ;
            C480460Ism.LIZ().getClass();
            ((ArrayList) superFanViewModel.LLJ).add(((IRevenueApi) C480460Ism.LIZLLL(IRevenueApi.class)).getFansBasicInfo(getFansBasicInfoReq).LJIILIIL(new C0UO0()).LJJLL(new AfS1S0300200_7(superFanViewModel, map, id, c517840KSo, id2, 1), new C09JN() { // from class: X.00N0
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("SuperFanViewModel@dada.onReceiveSuperFanBox$disposable$2");
                    C1C7U.LIZIZ("SuperFanViewModel@dada.onReceiveSuperFanBox$disposable$2");
                }
            }));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$80(AwS408S0200000_7 awS408S0200000_7) {
        ((C499870Jiz) awS408S0200000_7.l0).LIZ.invoke((PunishmentData) awS408S0200000_7.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$81(AwS408S0200000_7 awS408S0200000_7) {
        ((Function0) awS408S0200000_7.l0).invoke();
        ((C0K31) awS408S0200000_7.l1).LIZIZ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$82(AwS408S0200000_7 awS408S0200000_7) {
        C766270U4b.LIZLLL(2131841383);
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannelLJ = C475510Ikn.LJ((Fragment) awS408S0200000_7.l0);
        c0jfn.getClass();
        C0JFN.LJIIJ(dataChannelLJ, "anchor_connection", "draw_guess_start", false);
        ((Function1) awS408S0200000_7.l1).invoke(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$83(AwS408S0200000_7 awS408S0200000_7) {
        C766270U4b.LIZLLL(2131841421);
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannelLJ = C475510Ikn.LJ((Fragment) awS408S0200000_7.l0);
        c0jfn.getClass();
        C0JFN.LJIIJ(dataChannelLJ, "guest_connection_enlarge_screen", "draw_guess_start", false);
        ((Function1) awS408S0200000_7.l1).invoke(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS408S0200000_7 awS408S0200000_7) {
        ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LJFF(((C517840KSo) awS408S0200000_7.l0).LIZ.get(), (C0KPG) awS408S0200000_7.l1, "80XR2DK73101", null);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS408S0200000_7(com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCell r3, X.C479150Iqf r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 15: goto Lf;
                case 16: goto L5;
                case 17: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS408S0200000_7.<init>(com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCell, X.0Iqf, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS408S0200000_7(X.C16F5 r3, com.ss.android.ugc.aweme.video.SubOnlyVideoContentFragment r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 29: goto Lf;
                case 30: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS408S0200000_7.<init>(X.16F5, com.ss.android.ugc.aweme.video.SubOnlyVideoContentFragment, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS408S0200000_7(android.view.View r3, com.bytedance.touchpoint.core.crossplatform.IncentiveTaskPageFragment r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 13 - r5
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS408S0200000_7.<init>(android.view.View, com.bytedance.touchpoint.core.crossplatform.IncentiveTaskPageFragment, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(C259800zU c259800zU, C259800zU<String> c259800zU2, PreviewSubscriptionWidget previewSubscriptionWidget) {
        super(0);
        this.$t = previewSubscriptionWidget;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C262100zr c262100zr, SuperFanViewModel superFanViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c262100zr;
        this.l1 = superFanViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C262100zr c262100zr, IncentiveTaskPageFragment incentiveTaskPageFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = c262100zr;
        this.l1 = incentiveTaskPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(C013C c013c, C013C c013c2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c013c;
        this.l1 = c013c2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C013C c013c, AFwS193S0000000_7 aFwS193S0000000_7, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = aFwS193S0000000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(InterfaceC451590HnJ interfaceC451590HnJ, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC451590HnJ;
        this.l1 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C0ISJ c0isj, LinkedHashSet linkedHashSet, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0isj;
        this.l1 = linkedHashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(AbstractC476820Imu abstractC476820Imu, StrategyCheckData strategyCheckData, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC476820Imu;
        this.l1 = strategyCheckData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C477750IoP c477750IoP, MultiTopLiveDistributeAssem multiTopLiveDistributeAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = c477750IoP;
        this.l1 = multiTopLiveDistributeAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C0J3O c0j3o, SearchLiveCardViewHolder searchLiveCardViewHolder, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0j3o;
        this.l1 = searchLiveCardViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C0JH3 c0jh3, InterfaceC489200JGk interfaceC489200JGk, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0jh3;
        this.l1 = interfaceC489200JGk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C499870Jiz c499870Jiz, PunishmentData punishmentData, int i) {
        super(0);
        this.$t = i;
        this.l0 = c499870Jiz;
        this.l1 = punishmentData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(C0K7M c0k7m, C0K7M c0k7m2, DataResponse<n> dataResponse) {
        super(0);
        this.$t = dataResponse;
        this.l0 = c0k7m;
        this.l1 = c0k7m2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C0KMY c0kmy, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0kmy;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C0KNI c0kni, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0kni;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C0KPG c0kpg, SuperFanViewModel superFanViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0kpg;
        this.l1 = superFanViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C0KS3 c0ks3, C517690KRz c517690KRz, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0ks3;
        this.l1 = c517690KRz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C517840KSo c517840KSo, C0KPG c0kpg, int i) {
        super(0);
        this.$t = i;
        this.l0 = c517840KSo;
        this.l1 = c0kpg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C517840KSo c517840KSo, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = c517840KSo;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(C0KTF c0ktf, C0KTF c0ktf2, CompletionBlock<C0KTD> completionBlock) {
        super(0);
        this.$t = completionBlock;
        this.l0 = c0ktf;
        this.l1 = c0ktf2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(InterfaceC518100KTo interfaceC518100KTo, InterfaceC518100KTo interfaceC518100KTo2, Map<String, C517630KRt> map) {
        super(0);
        this.$t = map;
        this.l0 = interfaceC518100KTo;
        this.l1 = interfaceC518100KTo2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(InterfaceC518120KTq interfaceC518120KTq, C0KPG c0kpg, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC518120KTq;
        this.l1 = c0kpg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(C0U56 c0u56, C0U56 c0u562, Map<String, Long> map) {
        super(0);
        this.$t = map;
        this.l0 = c0u56;
        this.l1 = c0u562;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(AbstractC1100450ek7 abstractC1100450ek7, C13IQ c13iq, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC1100450ek7;
        this.l1 = c13iq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C1124290fMZ c1124290fMZ, EntranceIconAnimation entranceIconAnimation, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1124290fMZ;
        this.l1 = entranceIconAnimation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C1397660mTU c1397660mTU, DetailSettingDialogFragment detailSettingDialogFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1397660mTU;
        this.l1 = detailSettingDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C1397660mTU c1397660mTU, SpaceFeedGuestSettingDialogFragment spaceFeedGuestSettingDialogFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1397660mTU;
        this.l1 = spaceFeedGuestSettingDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(InterfaceC1791300wiO interfaceC1791300wiO, C518150KTt c518150KTt, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1791300wiO;
        this.l1 = c518150KTt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(C19719912Dl c19719912Dl, C1262850iy3 c1262850iy3, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19719912Dl;
        this.l1 = c1262850iy3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(Context context, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = th;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(View view, ViewGroup viewGroup, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(Fragment fragment, Fragment fragment2, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = fragment;
        this.l1 = fragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(FragmentManager fragmentManager, C199Y c199y, int i) {
        super(0);
        this.$t = i;
        this.l0 = c199y;
        this.l1 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(GameDropsPreviewBanner gameDropsPreviewBanner, Drawable drawable, int i) {
        super(0);
        this.$t = i;
        this.l0 = gameDropsPreviewBanner;
        this.l1 = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(PreviewShareWidget previewShareWidget, PreviewShareWidget previewShareWidget2, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = previewShareWidget;
        this.l1 = previewShareWidget2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(NewTopRightBannerWidget newTopRightBannerWidget, BannerInRoomCollection.BannerInfo bannerInfo, int i) {
        super(0);
        this.$t = i;
        this.l0 = newTopRightBannerWidget;
        this.l1 = bannerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(NewTopRightBannerWidget newTopRightBannerWidget, BannerInRoomCollection bannerInRoomCollection, int i) {
        super(0);
        this.$t = i;
        this.l0 = newTopRightBannerWidget;
        this.l1 = bannerInRoomCollection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage, AwS125S0110000_7 awS125S0110000_7, int i) {
        super(0);
        this.$t = i;
        this.l0 = feedUserRoomMonitorMessage;
        this.l1 = awS125S0110000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget, Message message, int i) {
        super(0);
        this.$t = i;
        this.l0 = programmedLiveFollowCardWidget;
        this.l1 = message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(TreasureBoxViewModel treasureBoxViewModel, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = treasureBoxViewModel;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(SuperFanViewModel superFanViewModel, Activity activity, int i) {
        super(0);
        this.$t = i;
        this.l0 = superFanViewModel;
        this.l1 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(SuperFanViewModel superFanViewModel, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = superFanViewModel;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(SubscribingInfo subscribingInfo, C11KU c11ku, int i) {
        super(0);
        this.$t = i;
        this.l0 = subscribingInfo;
        this.l1 = c11ku;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(HangoutInteractModuleV2Assem hangoutInteractModuleV2Assem, MGModuleInteraction mGModuleInteraction, int i) {
        super(0);
        this.$t = i;
        this.l0 = hangoutInteractModuleV2Assem;
        this.l1 = mGModuleInteraction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(MultiTopLiveInteractModuleAssem multiTopLiveInteractModuleAssem, MGModuleInteraction mGModuleInteraction, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiTopLiveInteractModuleAssem;
        this.l1 = mGModuleInteraction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(PlayCardFeedCellV2 playCardFeedCellV2, C479150Iqf c479150Iqf, int i) {
        super(0);
        this.$t = i;
        this.l0 = playCardFeedCellV2;
        this.l1 = c479150Iqf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(LiveNotificationItem liveNotificationItem, NoticeItem noticeItem, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveNotificationItem;
        this.l1 = noticeItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(PcsCourseActivity pcsCourseActivity, PcsCourseActivity pcsCourseActivity2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = pcsCourseActivity;
        this.l1 = pcsCourseActivity2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(PcsVideoPublishActivity pcsVideoPublishActivity, VideoPublishEditModel videoPublishEditModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = pcsVideoPublishActivity;
        this.l1 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(PcsCourseManagementContainerAssem pcsCourseManagementContainerAssem, PcsCourseManagementContainerAssem pcsCourseManagementContainerAssem2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = pcsCourseManagementContainerAssem;
        this.l1 = pcsCourseManagementContainerAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(PcsCoursePriceTierSheet pcsCoursePriceTierSheet, PcsCoursePriceTierSheet pcsCoursePriceTierSheet2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = pcsCoursePriceTierSheet;
        this.l1 = pcsCoursePriceTierSheet2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(PcsCourseManagementContainerAssemV2 pcsCourseManagementContainerAssemV2, PcsCourseManagementContainerAssemV2 pcsCourseManagementContainerAssemV22, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = pcsCourseManagementContainerAssemV2;
        this.l1 = pcsCourseManagementContainerAssemV22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(PcsCoursePriceTierSheetV2 pcsCoursePriceTierSheetV2, PcsCoursePriceTierSheetV2 pcsCoursePriceTierSheetV22, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = pcsCoursePriceTierSheetV2;
        this.l1 = pcsCoursePriceTierSheetV22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(CourseVideoListCell courseVideoListCell, InterfaceC489200JGk interfaceC489200JGk, int i) {
        super(0);
        this.$t = i;
        this.l0 = courseVideoListCell;
        this.l1 = interfaceC489200JGk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(SubPackageMultiMonthFragment subPackageMultiMonthFragment, AObserverS172S0200000_7 aObserverS172S0200000_7, int i) {
        super(0);
        this.$t = i;
        this.l0 = subPackageMultiMonthFragment;
        this.l1 = aObserverS172S0200000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(SubUpdowngradePackageFragment subUpdowngradePackageFragment, AObserverS172S0200000_7 aObserverS172S0200000_7, int i) {
        super(0);
        this.$t = i;
        this.l0 = subUpdowngradePackageFragment;
        this.l1 = aObserverS172S0200000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, PGCGetSubPrivilegeDetailResponse.Data data, int i) {
        super(0);
        this.$t = i;
        this.l0 = subscriptionPrivilegeDetailFragment;
        this.l1 = data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(Boolean bool, Boolean bool2, int i) {
        super(0);
        this.$t = i;
        this.l0 = bool;
        this.l1 = bool2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(HashMap map, HashMap<String, String> map2, IInteractService iInteractService) {
        super(0);
        this.$t = iInteractService;
        this.l0 = map;
        this.l1 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(AFwS193S0000000_7 aFwS193S0000000_7, C0K31 c0k31, int i) {
        super(0);
        this.$t = i;
        this.l0 = aFwS193S0000000_7;
        this.l1 = c0k31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS408S0200000_7(AwS551S0100000_7 awS551S0100000_7, CourseVideoListCell courseVideoListCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = awS551S0100000_7;
        this.l1 = courseVideoListCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS408S0200000_7(StrategyCheckData strategyCheckData, StrategyCheckData strategyCheckData2, Function2<? super Boolean, ? super String, Unit> function2) {
        super(0);
        this.$t = function2;
        this.l0 = strategyCheckData;
        this.l1 = strategyCheckData2;
    }
}
