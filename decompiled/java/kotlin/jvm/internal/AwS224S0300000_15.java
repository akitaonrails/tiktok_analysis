package kotlin.jvm.internal;

import X.AbstractC928510aGn;
import X.C013C;
import X.C01EI;
import X.C01FQ;
import X.C01GW;
import X.C01HE;
import X.C01N8;
import X.C09AY;
import X.C0KVU;
import X.C0KX4;
import X.C0UI0;
import X.C1102950eo9;
import X.C1112330f3H;
import X.C1113800f5e;
import X.C1119590fEz;
import X.C1143300frE;
import X.C1143680frq;
import X.C118300cf;
import X.C1295960jpS;
import X.C1397620mTQ;
import X.C13BV;
import X.C1697810uHb;
import X.C16FS;
import X.C1AZW;
import X.C20361214lm;
import X.C20424814w2;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.C307001Gy;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C782110Um9;
import X.C785220UrA;
import X.C786410Ut5;
import X.C915850ZwN;
import X.C915980Zwa;
import X.C916750Zxp;
import X.C917920Zzi;
import X.C918230a0D;
import X.C919530a2J;
import X.C919640a2U;
import X.C919870a2r;
import X.C920060a3A;
import X.C920170a3L;
import X.C920280a3W;
import X.C921170a4x;
import X.C921520a5W;
import X.C925710aCH;
import X.C925770aCN;
import X.C925870aCX;
import X.C927600aFK;
import X.C928540aGq;
import X.C930940aKi;
import X.C932050aMV;
import X.C933390aOf;
import X.C934550aQX;
import X.C934570aQZ;
import X.C936730aU3;
import X.C936770aU7;
import X.C945740aia;
import X.C946060aj6;
import X.C947280al4;
import X.C950220apo;
import X.C953600avG;
import X.C953610avH;
import X.C953770avX;
import X.C954340awS;
import X.C954460awe;
import X.C954600aws;
import X.C955010axX;
import X.C955400ayA;
import X.C955750ayj;
import X.C955910ayz;
import X.C955960az4;
import X.C957560b1e;
import X.C971040bNO;
import X.C971370bNv;
import X.C973970bS7;
import X.C974060bSG;
import X.C974990bTl;
import X.C975000bTm;
import X.C975970bVL;
import X.C982090bfD;
import X.C982320bfa;
import X.C982760bgI;
import X.C983300bhA;
import X.C987200bnS;
import X.EnumC1120860fH2;
import X.EnumC919170a1j;
import X.EnumC920250a3T;
import X.EnumC930180aJU;
import X.EnumC945440ai6;
import X.EnumC955760ayk;
import X.EnumC964700bDA;
import X.InterfaceC1103130eoR;
import X.InterfaceC1143790fs1;
import X.InterfaceC20354714kj;
import X.InterfaceC254600ye;
import X.InterfaceC302401Fe;
import X.InterfaceC302601Fg;
import X.InterfaceC743640TFa;
import X.InterfaceC920110a3F;
import X.InterfaceC920680a4A;
import X.InterfaceC927510aFB;
import X.InterfaceC954180awC;
import X.InterfaceC954910axN;
import X.InterfaceC964770bDH;
import X.InterfaceC979390bar;
import Y.AAListenerS267S0200000_15;
import Y.ACListenerS118S0200000_15;
import Y.AcS354S0200000_15;
import Y.AcS496S0100000_15;
import Y.AcS84S0400000_15;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.cohost.playentity.DesignatedGiftEntity;
import com.bytedance.android.live.liveinteract.cohost.playentity.VictoryLapFunnyEffectEntity;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionStateTransitCountdownEvent;
import com.bytedance.android.live.liveinteract.linkroom.toolbarbehavior.ToolbarMultiGuestManageBehavior;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.CountDownForAllEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.CountDownSingleEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.ExpandEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.GiftSettingEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.GuestShowdownEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.LayoutSettingEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.LiveShowEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.SharedBackgroundEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.test.TestNewLiveShowEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestQuickConnectInviteSheetFragment;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.ActivityBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptExtraSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviterPanelLynxConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.LiveShowConfigChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import tikcast.linkmic.common.GuestUserInfo;
import tikcast.linkmic.common.PosIdentity;
import webcast.im.CohostContent;
import webcast.im.JoinGroupBizContent;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: loaded from: classes16.dex */
public class AwS224S0300000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        C918230a0D c918230a0D = (C918230a0D) obj;
        if (c918230a0D.LIZJ) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131852856));
            Function2<? super C918230a0D, ? super List<? extends LinkPlayerInfo>, Unit> function2 = ((MultiGuestQuickConnectInviteSheetFragment) awS224S0300000_15.l0).LLILLJJLI;
            if (function2 != null) {
                function2.invoke(c918230a0D, (List) awS224S0300000_15.l1);
            }
        }
        ((Function1) awS224S0300000_15.l2).invoke(Boolean.valueOf(c918230a0D.LIZJ));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        User user = ((ListByTypeResponse.ReservedUser) awS224S0300000_15.l0).user;
        if (user != null) {
            long id = user.getId();
            HashMap map = new HashMap();
            map.put("from_user_id", String.valueOf(id));
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                map.put("room_id", room.getIdStr());
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            C0KX4.LIZ("livesdk_connection_reservation_response", map, null, true);
        }
        C782110Um9 c782110Um9 = new C782110Um9(((C16FS) awS224S0300000_15.l1).getContext());
        c782110Um9.LJIIZILJ(2131842078);
        c782110Um9.LJII(2131842076);
        c782110Um9.LJIIJ(2131842075, new InterfaceC743640TFa() { // from class: X.0a5M
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILIIL(2131842077, new AcS354S0200000_15((C928540aGq) awS224S0300000_15.l2, (ListByTypeResponse.ReservedUser) awS224S0300000_15.l0, 2));
        C786410Ut5.E4(c782110Um9.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        if (obj == EnumC945440ai6.NORMAL) {
            PlayEntityUtilKt.LJ((CountDownSingleEntity) awS224S0300000_15.l0, 2, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        int i;
        if (obj == EnumC945440ai6.NORMAL) {
            i = 2;
        } else {
            i = 1;
        }
        PlayEntityUtilKt.LJ((ExpandEntity) awS224S0300000_15.l0, i, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) awS224S0300000_15.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LIZIZ((GiftSettingEntity) awS224S0300000_15.l0, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, null, ((Number) obj).longValue(), 24);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LJ((GiftSettingEntity) awS224S0300000_15.l0, ((Number) obj).intValue(), (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LIZIZ((GuestShowdownEntity) awS224S0300000_15.l0, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) awS224S0300000_15.l2, null, ((Number) obj).longValue(), 24);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LJ((GuestShowdownEntity) awS224S0300000_15.l0, ((Number) obj).intValue(), (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((GuestShowdownEntity) awS224S0300000_15.l0, 2, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        InterfaceC979390bar interfaceC979390bar;
        ((Number) obj).intValue();
        CharSequence charSequence = (CharSequence) ((C259800zU) awS224S0300000_15.l0).element;
        if ((charSequence == null || a0.LJJJIL(charSequence)) && (interfaceC979390bar = (InterfaceC979390bar) awS224S0300000_15.l1) != null) {
            interfaceC979390bar.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LIZIZ((LayoutSettingEntity) awS224S0300000_15.l0, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, null, ((Number) obj).longValue(), 24);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LJ((LayoutSettingEntity) awS224S0300000_15.l0, ((Number) obj).intValue(), (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LJ((DesignatedGiftEntity) awS224S0300000_15.l0, ((Number) obj).intValue(), (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LJ((LiveShowEntity) awS224S0300000_15.l0, ((Number) obj).intValue(), (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LJI((LiveShowEntity) awS224S0300000_15.l0, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, null, null, 0L, 56);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((LiveShowEntity) awS224S0300000_15.l0, 2, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        String str = (String) obj;
        if (str != null) {
            NoticeboardEntity noticeboardEntity = (NoticeboardEntity) awS224S0300000_15.l0;
            C916750Zxp c916750Zxp = (C916750Zxp) awS224S0300000_15.l1;
            C20361214lm c20361214lm = (C20361214lm) awS224S0300000_15.l2;
            String strLIZ = C01EI.LIZ(99, noticeboardEntity.LLJJJJJIL.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("success, onReviewPassed prepareNoticeboardDraft, noticeboardData=");
            sbLIZ.append(c916750Zxp);
            sbLIZ.append(", result=");
            sbLIZ.append(str);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            noticeboardEntity.LJJLIL(c916750Zxp, str);
            PlayEntityUtilKt.LIZJ(noticeboardEntity, NoticeboardEntity.LJJLIIIJ(c916750Zxp), c20361214lm, noticeboardEntity.LLJJL, true);
            PlayEntityUtilKt.LIZLLL(noticeboardEntity);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        String strLIZ = C01EI.LIZ(11, ((NoticeboardEntity) awS224S0300000_15.l0).LLJJJJJIL.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error, onReviewPassed prepareNoticeboardDraft, noticeboardData=");
        sbLIZ.append((C916750Zxp) awS224S0300000_15.l1);
        sbLIZ.append(", throwable=");
        sbLIZ.append(((Throwable) obj).getMessage());
        C1AZW.LJFF(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        NoticeboardEntity noticeboardEntity = (NoticeboardEntity) awS224S0300000_15.l0;
        C916750Zxp c916750Zxp = (C916750Zxp) awS224S0300000_15.l1;
        noticeboardEntity.getClass();
        PlayEntityUtilKt.LIZJ(noticeboardEntity, NoticeboardEntity.LJJLIIIJ(c916750Zxp), (C20361214lm) awS224S0300000_15.l2, ((NoticeboardEntity) awS224S0300000_15.l0).LLJJL, true);
        PlayEntityUtilKt.LIZLLL((NoticeboardEntity) awS224S0300000_15.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJ((SharedBackgroundEntity) awS224S0300000_15.l0, 2, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((SharedBackgroundEntity) awS224S0300000_15.l0, 2, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LJ((CountDownSingleEntity) awS224S0300000_15.l0, ((Number) obj).intValue(), (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        DataChannel dataChannel = ((TestNewLiveShowEntity) awS224S0300000_15.l0).LLJ;
        if (dataChannel != null) {
            dataChannel.zW(LiveShowConfigChannel.class, new C946060aj6(null, null, null, null, null, null, null, null, false, null, null, null, 16383));
        }
        PlayEntityUtilKt.LJ((TestNewLiveShowEntity) awS224S0300000_15.l0, iIntValue, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LJI((TestNewLiveShowEntity) awS224S0300000_15.l0, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, null, null, 0L, 56);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((DesignatedGiftEntity) awS224S0300000_15.l0, 2, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, true);
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((TestNewLiveShowEntity) awS224S0300000_15.l0, 0, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, true);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$31(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        LinkUser linkUserLJJLJLI;
        LinkPlayerInfo linkPlayerInfoLJI;
        InterfaceC927510aFB zoomService;
        AbstractC928510aGn abstractC928510aGnLIZ;
        long jLongValue;
        Long l;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        if (((EnumC920250a3T) awS224S0300000_15.l0) == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
            C915850ZwN.LJIIJJI(24, UserService.getInstance().user().getCurrentUserId(), "click", null, false);
        }
        String str = "";
        User user = null;
        C919870a2r.LIZLLL(((C932050aMV) awS224S0300000_15.l1).getEnlargeType(), String.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "", "click", "anchor", null);
        C932050aMV c932050aMV = (C932050aMV) awS224S0300000_15.l1;
        c932050aMV.getClass();
        C1143300frE.LJIIJJI().LJII(c932050aMV.LLJJI, C2097608Jq.LJIIJ(new Pair("action", "onZoomClick")));
        Boolean boolValueOf = null;
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIJI()) {
            C01N8.LIZ(0, "zoom", C920280a3W.LIZIZ((EnumC920250a3T) awS224S0300000_15.l0), 0L, "anchor", "live_show", "");
            C766270U4b.LIZLLL(2131843582);
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                String strLJIILIIL = ((InterfaceC927510aFB) awS224S0300000_15.l2).LJIILIIL();
                if (strLJIILIIL == null) {
                    strLJIILIIL = "";
                }
                linkUserLJJLJLI = interfaceC954180awCLLJLL.LJJLJLI(strLJIILIIL);
            } else {
                linkUserLJJLJLI = null;
            }
            InterfaceC302401Fe anchorUserManager = ((C932050aMV) awS224S0300000_15.l1).getAnchorUserManager();
            if (anchorUserManager != null && (abstractC928510aGnLIZ = anchorUserManager.LIZ()) != null) {
                if (linkUserLJJLJLI != null && (l = linkUserLJJLJLI.userId) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                linkPlayerInfoLJI = C921170a4x.LJI(abstractC928510aGnLIZ, jLongValue);
            } else {
                linkPlayerInfoLJI = null;
            }
            C932050aMV c932050aMV2 = (C932050aMV) awS224S0300000_15.l1;
            c932050aMV2.getClass();
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            if (!C927600aFK.LJ() && (zoomService = c932050aMV2.getZoomService()) != null && zoomService.LJJ() && !C917920Zzi.LIZ()) {
                C782110Um9 c782110Um9 = new C782110Um9(((C932050aMV) awS224S0300000_15.l1).getContext());
                c782110Um9.LIZJ = C497740JfY.LJIJJ(2131843613, C0KVU.LIZ(UserService.getInstance().user().LJIJJLI()));
                Object[] objArr = new Object[2];
                if (linkPlayerInfoLJI != null) {
                    user = linkPlayerInfoLJI.mUser;
                }
                objArr[0] = C0KVU.LIZ(user);
                objArr[1] = C0KVU.LIZ(UserService.getInstance().user().LJIJJLI());
                c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131843612, objArr));
                c782110Um9.LJIIJ(2131843611, new AcS496S0100000_15((EnumC920250a3T) awS224S0300000_15.l0, 33));
                c782110Um9.LJIILIIL(2131843610, new AcS84S0400000_15((C932050aMV) awS224S0300000_15.l1, (InterfaceC927510aFB) awS224S0300000_15.l2, linkPlayerInfoLJI, (EnumC920250a3T) awS224S0300000_15.l0, 3));
                C786410Ut5.E4(c782110Um9.LIZ());
            } else {
                C932050aMV c932050aMV3 = (C932050aMV) awS224S0300000_15.l1;
                String strLJIILL = ((InterfaceC927510aFB) awS224S0300000_15.l2).LJIILL();
                if (strLJIILL != null) {
                    str = strLJIILL;
                }
                c932050aMV3.s0(str, linkPlayerInfoLJI, (EnumC920250a3T) awS224S0300000_15.l0);
            }
        }
        C932050aMV c932050aMV4 = (C932050aMV) awS224S0300000_15.l1;
        LiveIconView liveIconView = c932050aMV4.LLJI;
        InterfaceC927510aFB zoomService2 = c932050aMV4.getZoomService();
        if (zoomService2 != null) {
            boolValueOf = Boolean.valueOf(zoomService2.LJFF());
        }
        C971370bNv.LIZIZ(liveIconView, 2131840809, 2131840795, C500260Jjc.LJJJI(boolValueOf));
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        EnumC919170a1j enumC919170a1j = (EnumC919170a1j) obj;
        C974990bTl c974990bTl = (C974990bTl) awS224S0300000_15.l0;
        C974060bSG c974060bSG = (C974060bSG) awS224S0300000_15.l1;
        List list = (List) awS224S0300000_15.l2;
        c974990bTl.getClass();
        LiveMatchInviterPanelLynxConfigSetting liveMatchInviterPanelLynxConfigSetting = LiveMatchInviterPanelLynxConfigSetting.INSTANCE;
        if (liveMatchInviterPanelLynxConfigSetting.isEnabled() && liveMatchInviterPanelLynxConfigSetting.isSkipMatchModePanel() && !Intrinsics.LJFF(c974060bSG.LIZJ, "plaza_icon") && !Intrinsics.LJFF(c974060bSG.LIZJ, "lynx_fallback")) {
            EnumC919170a1j enumC919170a1j2 = C973970bS7.LIZJ().LIZ;
            c974990bTl.LJIIJ(c974060bSG.LIZIZ, new AwS171S0400000_15(enumC919170a1j2, (EnumC919170a1j) c974990bTl, (C974990bTl) c974060bSG, (C974060bSG) list, (List<C954460awe>) 2), new AwS112S0400000_15(enumC919170a1j2, (EnumC919170a1j) c974990bTl, (C974990bTl) c974060bSG, (C974060bSG) list, (List<C954460awe>) 2));
        } else {
            C974990bTl c974990bTl2 = (C974990bTl) awS224S0300000_15.l0;
            C974060bSG c974060bSG2 = (C974060bSG) awS224S0300000_15.l1;
            List list2 = (List) awS224S0300000_15.l2;
            c974990bTl2.getClass();
            if (list2.size() == 2 && (Intrinsics.LJFF(c974060bSG2.LIZJ, "pk_icon") || Intrinsics.LJFF(c974060bSG2.LIZJ, "pk_guide") || Intrinsics.LJFF(c974060bSG2.LIZJ, "playbook_match") || Intrinsics.LJFF(c974060bSG2.LIZJ, "livefest_page"))) {
                c974990bTl2.LJIIJ(c974060bSG2.LIZIZ, new AwS293S0300000_15(c974990bTl2, (C974990bTl) c974060bSG2, (C974060bSG) list2, (List<C954460awe>) 14), new AwS224S0300000_15(c974990bTl2, c974060bSG2, list2, 33));
            } else {
                long jUptimeMillis = SystemClock.uptimeMillis();
                C974990bTl c974990bTl3 = (C974990bTl) awS224S0300000_15.l0;
                C974060bSG c974060bSG3 = (C974060bSG) awS224S0300000_15.l1;
                c974990bTl3.LJIIJ(c974060bSG3.LIZIZ, new C975000bTm(c974990bTl3, c974060bSG3, (List) awS224S0300000_15.l2, enumC919170a1j, jUptimeMillis), new AwS7S1400100_15("realDispatchClickEntrance", (C974990bTl) awS224S0300000_15.l0, (C974060bSG) awS224S0300000_15.l1, (List) awS224S0300000_15.l2, enumC919170a1j, jUptimeMillis, 0));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show1V1MatchPanel request match prepare api failed, OptExtra=");
        LiveMatchTakeStageOptExtraSetting liveMatchTakeStageOptExtraSetting = LiveMatchTakeStageOptExtraSetting.INSTANCE;
        sbLIZ.append(liveMatchTakeStageOptExtraSetting.isEnable());
        C20441214yg.LJFF("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        if (!C915980Zwa.LIZIZ().Dn0().isTakeTheStage() && !C915980Zwa.LIZIZ().Dn0().isCatchBean()) {
            if (liveMatchTakeStageOptExtraSetting.isEnable()) {
                C974990bTl c974990bTl = (C974990bTl) awS224S0300000_15.l0;
                C974060bSG c974060bSG = (C974060bSG) awS224S0300000_15.l1;
                c974990bTl.getClass();
                C974990bTl.LIZ(c974060bSG);
                C974990bTl c974990bTl2 = (C974990bTl) awS224S0300000_15.l0;
                C974060bSG c974060bSG2 = (C974060bSG) awS224S0300000_15.l1;
                c974990bTl2.LIZIZ(c974060bSG2.LIZIZ, new AwS416S0200000_15(c974060bSG2, (C974060bSG) awS224S0300000_15.l2, (List<C954460awe>) 55), AFwS203S0000000_15.get$arr$(192));
            }
        } else {
            ((C974990bTl) awS224S0300000_15.l0).LJIIL((C974060bSG) awS224S0300000_15.l1, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((MultiGuestSharedBgAnchorViewModel) awS224S0300000_15.l0).JQ2(2131843397, "pm_mt_multiWallpaper_wallpaperPanel_error_toast");
        ((MultiGuestSharedBgAnchorViewModel) awS224S0300000_15.l0).IQ2((Context) awS224S0300000_15.l1, (DataChannel) awS224S0300000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS224S0300000_15.l0;
        Context context = (Context) awS224S0300000_15.l1;
        DataChannel dataChannel = (DataChannel) awS224S0300000_15.l2;
        String str = MultiGuestSharedBgAnchorViewModel.LLJJIII;
        multiGuestSharedBgAnchorViewModel.IQ2(context, dataChannel, true);
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS224S0300000_15.l0;
        Context context = (Context) awS224S0300000_15.l1;
        DataChannel dataChannel = (DataChannel) awS224S0300000_15.l2;
        String str = MultiGuestSharedBgAnchorViewModel.LLJJIII;
        multiGuestSharedBgAnchorViewModel.IQ2(context, dataChannel, true);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS224S0300000_15.l0;
        Context context = (Context) awS224S0300000_15.l1;
        DataChannel dataChannel = (DataChannel) awS224S0300000_15.l2;
        String str = MultiGuestSharedBgAnchorViewModel.LLJJIII;
        multiGuestSharedBgAnchorViewModel.IQ2(context, dataChannel, true);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) awS224S0300000_15.l0;
        Context context = (Context) awS224S0300000_15.l1;
        DataChannel dataChannel = (DataChannel) awS224S0300000_15.l2;
        String str = MultiGuestSharedBgAnchorViewModel.LLJJIII;
        multiGuestSharedBgAnchorViewModel.IQ2(context, dataChannel, true);
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        String str = (String) obj;
        ((NoticeboardEntity) awS224S0300000_15.l0).LJJLIIIJL(((C916750Zxp) awS224S0300000_15.l1).LIZIZ, str, (C20424814w2) awS224S0300000_15.l2, null);
        ((NoticeboardEntity) awS224S0300000_15.l0).LLJLLIL.put((C916750Zxp) awS224S0300000_15.l1, str);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJ((VictoryLapFunnyEffectEntity) awS224S0300000_15.l0, 2, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((NoticeboardEntity) awS224S0300000_15.l0).LJJLIIIJL(((C916750Zxp) awS224S0300000_15.l1).LIZIZ, null, (C20424814w2) awS224S0300000_15.l2, (Throwable) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        C933390aOf.LJIIJ((User) awS224S0300000_15.l0, (C933390aOf) awS224S0300000_15.l1, (C1112330f3H) awS224S0300000_15.l2, (Boolean) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        C933390aOf.LJIIJ((User) awS224S0300000_15.l0, (C933390aOf) awS224S0300000_15.l1, (C1112330f3H) awS224S0300000_15.l2, (Boolean) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        C933390aOf.LJFF((User) awS224S0300000_15.l0, (C933390aOf) awS224S0300000_15.l1, (C1112330f3H) awS224S0300000_15.l2, ((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        C933390aOf.LJFF((User) awS224S0300000_15.l0, (C933390aOf) awS224S0300000_15.l1, (C1112330f3H) awS224S0300000_15.l2, ((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        Long lValueOf;
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        GuestUserInfo guestUserInfo = (GuestUserInfo) awS224S0300000_15.l0;
        Long l = null;
        if (guestUserInfo != null) {
            lValueOf = Long.valueOf(guestUserInfo.roomId);
        } else {
            lValueOf = null;
        }
        interfaceC954910axN.LJIILIIL(String.valueOf(lValueOf), "guestUserInfoRoomId");
        C936770aU7 c936770aU7 = (C936770aU7) awS224S0300000_15.l1;
        if (c936770aU7 != null) {
            l = c936770aU7.LIZIZ;
        }
        interfaceC954910axN.LJIILIIL(String.valueOf(l), "currentGuestUserRoomId");
        interfaceC954910axN.LJIILIIL(String.valueOf(((LinkUser) awS224S0300000_15.l2).roomId), "linkUserRoomId");
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$46(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS224S0300000_15.l0;
        enlargeScreenManageParams.scene = 7;
        enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(obj);
        ((C920170a3L) awS224S0300000_15.l1).LJIILL((InterfaceC920110a3F) awS224S0300000_15.l2, (EnlargeScreenManageParams) awS224S0300000_15.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$47(kotlin.jvm.internal.AwS224S0300000_15 r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS224S0300000_15.invoke$47(kotlin.jvm.internal.AwS224S0300000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$48(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((C945740aia) awS224S0300000_15.l0).LJ()) {
            C013C c013c = (C013C) awS224S0300000_15.l1;
            if (!c013c.element) {
                c013c.element = true;
                ((Function1) awS224S0300000_15.l2).invoke(Boolean.valueOf(zBooleanValue));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((C945740aia) awS224S0300000_15.l0).LJ()) {
            C013C c013c = (C013C) awS224S0300000_15.l1;
            if (!c013c.element) {
                c013c.element = true;
                ((Function1) awS224S0300000_15.l2).invoke(Boolean.valueOf(zBooleanValue));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        InterfaceC1103130eoR interfaceC1103130eoR;
        View contentView;
        if (((Boolean) obj).booleanValue() && (interfaceC1103130eoR = (InterfaceC1103130eoR) awS224S0300000_15.l0) != null && (contentView = interfaceC1103130eoR.getContentView()) != null) {
            DataChannel dataChannel = (DataChannel) awS224S0300000_15.l1;
            ToolbarMultiGuestManageBehavior toolbarMultiGuestManageBehavior = (ToolbarMultiGuestManageBehavior) awS224S0300000_15.l2;
            C785220UrA c785220UrA = new C785220UrA(contentView);
            c785220UrA.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c785220UrA.LJIIIZ = true;
            c785220UrA.LIZLLL(2131852825);
            c785220UrA.LIZ(R.attr.e86);
            c785220UrA.LJIILL = new InterfaceC254600ye() { // from class: X.0aPK
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    InterfaceC934710aQn.kc.LJFF(Boolean.TRUE);
                }
            };
            c785220UrA.LJIILLIIL = new C987200bnS(toolbarMultiGuestManageBehavior, 0);
            c785220UrA.LJ = new ACListenerS118S0200000_15(toolbarMultiGuestManageBehavior, contentView, 21);
            C1113800f5e.LIZ.LJ(new C1119590fEz(c785220UrA), EnumC1120860fH2.MULTI_GUEST_CUSTOMIZE_AVATAR_GUIDE, dataChannel);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        Throwable th = (Throwable) obj;
        ((C954340awS) awS224S0300000_15.l0).LJ.LIZLLL(EnumC964700bDA.INVITE, ((C954600aws) awS224S0300000_15.l1).LIZIZ);
        LinkCoreError linkCoreError = new LinkCoreError(0, 0L, "");
        InterfaceC920680a4A interfaceC920680a4A = (InterfaceC920680a4A) awS224S0300000_15.l2;
        if (interfaceC920680a4A != null) {
            interfaceC920680a4A.LIZ(linkCoreError, th);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$51(kotlin.jvm.internal.AwS224S0300000_15 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS224S0300000_15.invoke$51(kotlin.jvm.internal.AwS224S0300000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$52(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PosIdentity posIdentity = (PosIdentity) obj;
        EnlargeScreenManageParams enlargeScreenManageParams = (EnlargeScreenManageParams) awS224S0300000_15.l0;
        enlargeScreenManageParams.scene = 7;
        boolean z = false;
        enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(posIdentity);
        Function1 function1 = (Function1) awS224S0300000_15.l1;
        C920060a3A c920060a3A = (C920060a3A) awS224S0300000_15.l2;
        EnlargeScreenManageParams enlargeScreenManageParams2 = (EnlargeScreenManageParams) awS224S0300000_15.l0;
        c920060a3A.getClass();
        function1.invoke(C920060a3A.LJJIIZI(enlargeScreenManageParams2));
        long jLJI = C01HE.LJI(posIdentity.value);
        if (posIdentity.type == 2) {
            z = true;
        }
        C915850ZwN.LJIIIZ(jLJI, "", true, z);
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        C953600avG c953600avG = (C953600avG) awS224S0300000_15.l0;
        c953600avG.LIZIZ = (String) obj;
        if (Intrinsics.LJFF(((C953610avH) awS224S0300000_15.l1).LJIIIIZZ, c953600avG.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateNoticeboardImage token=");
            sbLIZ.append(((C953610avH) awS224S0300000_15.l1).LJIIIIZZ);
            C20441214yg.LIZIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
            ((Function0) awS224S0300000_15.l2).invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0184  */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$54(kotlin.jvm.internal.AwS224S0300000_15 r30, java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS224S0300000_15.invoke$54(kotlin.jvm.internal.AwS224S0300000_15, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$55(kotlin.jvm.internal.AwS224S0300000_15 r37, java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS224S0300000_15.invoke$55(kotlin.jvm.internal.AwS224S0300000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$56(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((SwitchLayoutPanelController) awS224S0300000_15.l0).LJIIIIZZ((EnumC930180aJU) awS224S0300000_15.l1, (Function0) awS224S0300000_15.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$57(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((SwitchLayoutPanelController) awS224S0300000_15.l0).LJIIIIZZ((EnumC930180aJU) awS224S0300000_15.l1, (Function0) awS224S0300000_15.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((SwitchLayoutPanelController) awS224S0300000_15.l0).LJIIIIZZ((EnumC930180aJU) awS224S0300000_15.l1, (Function0) awS224S0300000_15.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        final Float f = (Float) obj;
        final C1295960jpS c1295960jpS = (C1295960jpS) awS224S0300000_15.l0;
        final ConstraintLayout constraintLayout = (ConstraintLayout) awS224S0300000_15.l1;
        final C947280al4 c947280al4 = (C947280al4) awS224S0300000_15.l2;
        C1143680frq.LJIIL(c1295960jpS, "tiktok_live_interaction_normal_4", "live_mg_lets_dance_countdown_lottie_new.zip", "images", false, new InterfaceC1143790fs1() { // from class: X.0al5
            @Override // X.InterfaceC1143790fs1
            public final void onFinish(boolean z) {
                float fFloatValue;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("countdown lottie load result = ");
                sbLIZ.append(z);
                C20441214yg.LIZIZ("LetsDanceMainSpotBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                    C930540aK4.LJJIL(-1, c1295960jpS, constraintLayout);
                    C947280al4 c947280al42 = c947280al4;
                    C1295960jpS c1295960jpS2 = c1295960jpS;
                    AAListenerS267S0200000_15 aAListenerS267S0200000_15 = new AAListenerS267S0200000_15(c1295960jpS2, c947280al42, 11);
                    AAListenerS267S0200000_15 aAListenerS267S0200000_152 = c947280al42.LLJJIJI;
                    if (aAListenerS267S0200000_152 != null) {
                        c1295960jpS2.removeAnimatorListener(aAListenerS267S0200000_152);
                    }
                    c947280al4.LLJJIJI = aAListenerS267S0200000_15;
                    c1295960jpS.addAnimatorListener(aAListenerS267S0200000_15);
                    Float f2 = f;
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    float fLIZLLL = C13LZ.LIZLLL(fFloatValue, 0.0f, 1.0f);
                    c1295960jpS.setMinAndMaxProgress(fLIZLLL, 1.0f);
                    c1295960jpS.setProgress(fLIZLLL);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("LetsDanceMainSpotBizViewElement countdown lottie progress = ");
                    sbLIZ2.append(c1295960jpS.getProgress());
                    C20441214yg.LJIIL("lzp-test", C2188811AlT.LIZIZ(sbLIZ2));
                    c1295960jpS.playAnimation();
                    return;
                }
                C930540aK4.LJJIJL(c1295960jpS);
                c1295960jpS.cancelAnimation();
                AAListenerS267S0200000_15 aAListenerS267S0200000_153 = c947280al4.LLJJIJI;
                if (aAListenerS267S0200000_153 != null) {
                    c1295960jpS.removeAnimatorListener(aAListenerS267S0200000_153);
                }
                C947280al4 c947280al43 = c947280al4;
                c947280al43.LLJJIJI = null;
                c947280al43.LLJJJJLIIL = false;
            }
        }, Boolean.FALSE, null);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((C921520a5W) awS224S0300000_15.l0).LJJLIIIIJ((C919530a2J) awS224S0300000_15.l1, (LinkPlayerInfo) awS224S0300000_15.l2);
        if (((C919530a2J) awS224S0300000_15.l1).LIZIZ) {
            C921520a5W c921520a5W = (C921520a5W) awS224S0300000_15.l0;
            C919640a2U c919640a2U = c921520a5W.LLJLLL;
            if (c919640a2U == null) {
                c919640a2U = new C919640a2U();
                c921520a5W.LLJLLL = c919640a2U;
            }
            c919640a2U.LIZ.put(Long.valueOf(((C919530a2J) awS224S0300000_15.l1).LIZ.getId()), Long.valueOf(System.currentTimeMillis()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        C955400ayA.LIZ.LJZI("disconnect", ((C013C) awS224S0300000_15.l0).element);
        C915980Zwa.LJI().LIZ().LLJ();
        Function1<? super Boolean, Unit> function1 = ((C936730aU3) awS224S0300000_15.l1).LIZIZ.LIZLLL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(((C013C) awS224S0300000_15.l2).element));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$61(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131841175, new AwS224S0300000_15((C013C) awS224S0300000_15.l0, (C936730aU3) awS224S0300000_15.l1, (C013C) awS224S0300000_15.l2, 60));
        c1397620mTQ.LJII(2131841176, new AwS594S0100000_15((C013C) awS224S0300000_15.l0, 1167));
        return Unit.LIZ;
    }

    public static final Object invoke$62(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        JoinGroupMessageExtra joinGroupMessageExtra;
        Integer numValueOf;
        JoinGroupMessageExtra.RivalExtra rivalExtra;
        ActivityBadgeInfo activityBadgeInfo;
        CohostContent cohostContent;
        JoinGroupBizContent joinGroupBizContent;
        ((InterfaceC964770bDH) obj).LJLIIIL(((C955960az4) awS224S0300000_15.l0).LIZ, (InviteGroupMessage) awS224S0300000_15.l1);
        BusinessContent businessContent = ((InviteGroupMessage) awS224S0300000_15.l1).businessContent;
        Map<String, String> map = null;
        if (businessContent != null && (cohostContent = businessContent.cohostContent) != null && (joinGroupBizContent = cohostContent.joinGroupBizContent) != null) {
            joinGroupMessageExtra = joinGroupBizContent.joinGroupMsgExtra;
        } else {
            joinGroupMessageExtra = null;
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955750ayj c955750ayj = (C955750ayj) awS224S0300000_15.l2;
        long j = c955750ayj.LIZIZ;
        C13BV c13bv = C13BV.INSTANCE;
        C957560b1e c957560b1e = c955750ayj.LIZJ;
        if (c957560b1e != null) {
            numValueOf = Integer.valueOf(c957560b1e.LIZ);
        } else {
            numValueOf = null;
        }
        EnumC955760ayk enumC955760ayk = EnumC955760ayk.NONE;
        if (joinGroupMessageExtra != null && (rivalExtra = joinGroupMessageExtra.extra) != null && (activityBadgeInfo = rivalExtra.activityBadgeInfo) != null) {
            map = activityBadgeInfo.eventTrace;
        }
        C955400ayA.LIZ.LLFF(false, j, c13bv, 0, null, numValueOf, enumC955760ayk, joinGroupMessageExtra, "", false, 0L, 0L, map);
        return Unit.LIZ;
    }

    public static final Object invoke$63(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((C955960az4) awS224S0300000_15.l0).LIZJ.LIZLLL(EnumC964700bDA.INVITE, ((C955910ayz) awS224S0300000_15.l1).LIZIZ);
        ((InterfaceC964770bDH) obj).LJLI(((C955960az4) awS224S0300000_15.l0).LIZ, (ReplyInviteGroupMessage) awS224S0300000_15.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$64(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        LiveIconView liveIconView;
        C0UI0 c0ui0 = (C0UI0) obj;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) awS224S0300000_15.l0;
        if (interfaceC1103130eoR != null && (liveIconView = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74)) != null) {
            DataChannel dataChannel = (DataChannel) awS224S0300000_15.l1;
            C934550aQX c934550aQX = (C934550aQX) awS224S0300000_15.l2;
            boolean z = c0ui0.LIZ;
            if (C934570aQZ.LIZ[C1102950eo9.LIZIZ(dataChannel).ordinal()] == 1) {
                c934550aQX.getClass();
                if (z) {
                    liveIconView.setIconAttr(R.attr.emc);
                } else {
                    liveIconView.setIconAttr(R.attr.emt);
                }
                c934550aQX.LIZ(liveIconView);
            } else {
                c934550aQX.getClass();
                if (z) {
                    liveIconView.setIconAttr(R.attr.emd);
                } else {
                    liveIconView.setIconAttr(R.attr.emu);
                }
                c934550aQX.LIZ(liveIconView);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$65(kotlin.jvm.internal.AwS224S0300000_15 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS224S0300000_15.invoke$65(kotlin.jvm.internal.AwS224S0300000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$66(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        DataChannel dataChannel;
        C982760bgI c982760bgI = (C982760bgI) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("score update = ");
        sbLIZ.append(c982760bgI);
        C20441214yg.LIZIZ("CatchBeansSettlementCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
        if (c982760bgI.LIZJ) {
            ((C013C) awS224S0300000_15.l0).element = true;
        }
        if (c982760bgI.LJ) {
            ((C013C) awS224S0300000_15.l1).element = true;
        }
        if (((C013C) awS224S0300000_15.l0).element && ((C013C) awS224S0300000_15.l1).element && (dataChannel = ((C982090bfD) awS224S0300000_15.l2).LIZLLL) != null) {
            dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("CatchBeansSettlementCoordinatorAnchor_doIfNeedOnStateDidEnter", 0L));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$67(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("score update = ");
        sbLIZ.append(((C013C) awS224S0300000_15.l0).element);
        sbLIZ.append(' ');
        sbLIZ.append(((C013C) awS224S0300000_15.l1).element);
        C20441214yg.LIZIZ("CatchBeansSettlementCoordinatorAudience", C2188811AlT.LIZIZ(sbLIZ));
        if (((C013C) awS224S0300000_15.l0).element && ((C013C) awS224S0300000_15.l1).element) {
            C982320bfa.LIZLLL(C950220apo.LJ());
            DataChannel dataChannel = ((C982090bfD) awS224S0300000_15.l2).LIZLLL;
            if (dataChannel != null) {
                dataChannel.zW(CompetitionStateTransitCountdownEvent.class, new C983300bhA("CatchBeansSettlementCoordinatorAudience_doIfNeedOnStateDidEnter", 0L));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS224S0300000_15 r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS224S0300000_15.invoke$7(kotlin.jvm.internal.AwS224S0300000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        PlayEntityUtilKt.LJ((CountDownForAllEntity) awS224S0300000_15.l0, ((Number) obj).intValue(), (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS224S0300000_15 awS224S0300000_15, Object obj) {
        ((Number) obj).intValue();
        PlayEntityUtilKt.LJII((CountDownForAllEntity) awS224S0300000_15.l0, 2, (C20361214lm) awS224S0300000_15.l1, (InterfaceC20354714kj) ((C259800zU) awS224S0300000_15.l2).element, true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(C259800zU c259800zU, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, C955010axX c955010axX) {
        super(1);
        this.$t = c955010axX;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c259800zU3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C013C c013c, C013C c013c2, C982090bfD c982090bfD, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = c982090bfD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C013C c013c, C936730aU3 c936730aU3, C013C c013c2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c936730aU3;
        this.l2 = c013c2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C920060a3A c920060a3A, EnlargeScreenManageParams enlargeScreenManageParams, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l0 = enlargeScreenManageParams;
        this.l1 = function1;
        this.l2 = c920060a3A;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(EnumC920250a3T enumC920250a3T, C932050aMV c932050aMV, InterfaceC927510aFB interfaceC927510aFB, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC920250a3T;
        this.l1 = c932050aMV;
        this.l2 = interfaceC927510aFB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C921520a5W c921520a5W, C919530a2J c919530a2J, LinkPlayerInfo linkPlayerInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = c921520a5W;
        this.l1 = c919530a2J;
        this.l2 = linkPlayerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C925710aCH c925710aCH, C925770aCN c925770aCN, C925870aCX c925870aCX, int i) {
        super(1);
        this.$t = i;
        this.l0 = c925710aCH;
        this.l1 = c925770aCN;
        this.l2 = c925870aCX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C945740aia c945740aia, C013C c013c, AwS594S0100000_15 awS594S0100000_15, int i) {
        super(1);
        this.$t = i;
        this.l0 = c945740aia;
        this.l1 = c013c;
        this.l2 = awS594S0100000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C953600avG c953600avG, C953610avH c953610avH, AwS416S0200000_15 awS416S0200000_15, int i) {
        super(1);
        this.$t = i;
        this.l0 = c953600avG;
        this.l1 = c953610avH;
        this.l2 = awS416S0200000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(C954340awS c954340awS, C954340awS c954340awS2, C954600aws c954600aws, InterfaceC920680a4A<InviteGroupResult> interfaceC920680a4A) {
        super(1);
        this.$t = interfaceC920680a4A;
        this.l0 = c954340awS;
        this.l1 = c954340awS2;
        this.l2 = c954600aws;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C955960az4 c955960az4, C955910ayz c955910ayz, ReplyInviteGroupMessage replyInviteGroupMessage, int i) {
        super(1);
        this.$t = i;
        this.l0 = c955960az4;
        this.l1 = c955910ayz;
        this.l2 = replyInviteGroupMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C955960az4 c955960az4, InviteGroupMessage inviteGroupMessage, C955750ayj c955750ayj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c955960az4;
        this.l1 = inviteGroupMessage;
        this.l2 = c955750ayj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(C971040bNO c971040bNO, C971040bNO c971040bNO2, C953770avX c953770avX, Function1<? super C953770avX, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c971040bNO;
        this.l1 = c971040bNO2;
        this.l2 = c953770avX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C974990bTl c974990bTl, C974060bSG c974060bSG, List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = c974990bTl;
        this.l1 = c974060bSG;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(C975970bVL c975970bVL, C975970bVL c975970bVL2, Function1<? super Boolean, Unit> function1, C118300cf c118300cf) {
        super(1);
        this.$t = c118300cf;
        this.l0 = c975970bVL;
        this.l1 = c975970bVL2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel, C934550aQX c934550aQX, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1103130eoR;
        this.l1 = dataChannel;
        this.l2 = c934550aQX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel, ToolbarMultiGuestManageBehavior toolbarMultiGuestManageBehavior, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1103130eoR;
        this.l1 = dataChannel;
        this.l2 = toolbarMultiGuestManageBehavior;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C1295960jpS c1295960jpS, ConstraintLayout constraintLayout, C947280al4 c947280al4, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1295960jpS;
        this.l1 = constraintLayout;
        this.l2 = c947280al4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, C259800zU c259800zU, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = interfaceC979390bar;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(User user, C933390aOf c933390aOf, C1112330f3H c1112330f3H, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
        this.l1 = c933390aOf;
        this.l2 = c1112330f3H;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(DesignatedGiftEntity designatedGiftEntity, DesignatedGiftEntity designatedGiftEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = designatedGiftEntity;
        this.l1 = designatedGiftEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(VictoryLapFunnyEffectEntity victoryLapFunnyEffectEntity, VictoryLapFunnyEffectEntity victoryLapFunnyEffectEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = victoryLapFunnyEffectEntity;
        this.l1 = victoryLapFunnyEffectEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(CountDownForAllEntity countDownForAllEntity, CountDownForAllEntity countDownForAllEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = countDownForAllEntity;
        this.l1 = countDownForAllEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(CountDownSingleEntity countDownSingleEntity, CountDownSingleEntity countDownSingleEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = countDownSingleEntity;
        this.l1 = countDownSingleEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(ExpandEntity expandEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(1);
        this.$t = i;
        this.l0 = expandEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(GiftSettingEntity giftSettingEntity, GiftSettingEntity giftSettingEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = giftSettingEntity;
        this.l1 = giftSettingEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(GuestShowdownEntity guestShowdownEntity, GuestShowdownEntity guestShowdownEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = guestShowdownEntity;
        this.l1 = guestShowdownEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(GuestShowdownEntity guestShowdownEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, int i) {
        super(1);
        this.$t = i;
        this.l0 = guestShowdownEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(LayoutSettingEntity layoutSettingEntity, LayoutSettingEntity layoutSettingEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = layoutSettingEntity;
        this.l1 = layoutSettingEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(LiveShowEntity liveShowEntity, LiveShowEntity liveShowEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = liveShowEntity;
        this.l1 = liveShowEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(NoticeboardEntity noticeboardEntity, C916750Zxp c916750Zxp, C20361214lm c20361214lm, int i) {
        super(1);
        this.$t = i;
        this.l0 = noticeboardEntity;
        this.l1 = c916750Zxp;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(NoticeboardEntity noticeboardEntity, C916750Zxp c916750Zxp, C20424814w2 c20424814w2, int i) {
        super(1);
        this.$t = i;
        this.l0 = noticeboardEntity;
        this.l1 = c916750Zxp;
        this.l2 = c20424814w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(SharedBackgroundEntity sharedBackgroundEntity, SharedBackgroundEntity sharedBackgroundEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = sharedBackgroundEntity;
        this.l1 = sharedBackgroundEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(TestNewLiveShowEntity testNewLiveShowEntity, TestNewLiveShowEntity testNewLiveShowEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = testNewLiveShowEntity;
        this.l1 = testNewLiveShowEntity2;
        this.l2 = c20361214lm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, Context context, DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiGuestSharedBgAnchorViewModel;
        this.l1 = context;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS224S0300000_15(SwitchLayoutPanelController switchLayoutPanelController, SwitchLayoutPanelController switchLayoutPanelController2, EnumC930180aJU enumC930180aJU, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = switchLayoutPanelController;
        this.l1 = switchLayoutPanelController2;
        this.l2 = enumC930180aJU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(MultiGuestQuickConnectInviteSheetFragment multiGuestQuickConnectInviteSheetFragment, List list, AwS594S0100000_15 awS594S0100000_15, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiGuestQuickConnectInviteSheetFragment;
        this.l1 = list;
        this.l2 = awS594S0100000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(EnlargeScreenManageParams enlargeScreenManageParams, C920170a3L c920170a3L, InterfaceC920110a3F interfaceC920110a3F, int i) {
        super(1);
        this.$t = i;
        this.l0 = enlargeScreenManageParams;
        this.l1 = c920170a3L;
        this.l2 = interfaceC920110a3F;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(ListByTypeResponse.ReservedUser reservedUser, C16FS c16fs, C928540aGq c928540aGq, int i) {
        super(1);
        this.$t = i;
        this.l0 = reservedUser;
        this.l1 = c16fs;
        this.l2 = c928540aGq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, MultiLiveSettingDialog multiLiveSettingDialog, Layout layout, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiLiveAnchorPanelSettings;
        this.l1 = multiLiveSettingDialog;
        this.l2 = layout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS224S0300000_15(GuestUserInfo guestUserInfo, C936770aU7 c936770aU7, LinkUser linkUser, int i) {
        super(1);
        this.$t = i;
        this.l0 = guestUserInfo;
        this.l1 = c936770aU7;
        this.l2 = linkUser;
    }
}
