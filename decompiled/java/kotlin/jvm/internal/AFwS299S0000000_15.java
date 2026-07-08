package kotlin.jvm.internal;

import X.C09AY;
import X.C11H9;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C915260ZvQ;
import X.C915980Zwa;
import X.C916430ZxJ;
import X.C917110ZyP;
import X.C920610a43;
import X.C928460aGi;
import X.C937520aVK;
import X.C945210ahj;
import X.C949990apR;
import X.C954460awe;
import X.C954640aww;
import X.C956620b08;
import X.C980430bcX;
import X.EnumC918810a19;
import X.EnumC950200apm;
import X.InterfaceC950010apT;
import X.InterfaceC954180awC;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostUnpolishedTipFaceDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostUnpolishedTipFaceEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostUnpolishedTipFaceThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostUnpolishedTipVoiceDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostUnpolishedTipVoiceEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostUnpolishedTipVoiceThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostUnpolishedTipsEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.lyrax.video.TTLHVideoContentReportConfig;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: loaded from: classes16.dex */
public class AFwS299S0000000_15 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(52);
    public final int $t;

    public static AFwS299S0000000_15 get$arr$(int i) {
        AFwS299S0000000_15 aFwS299S0000000_15 = (AFwS299S0000000_15) arr$.get(i);
        if (aFwS299S0000000_15 != null) {
            return aFwS299S0000000_15;
        }
        arr$.compareAndSet(i, null, new AFwS299S0000000_15(i));
        return (AFwS299S0000000_15) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS299S0000000_15(int i) {
        super(2);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        int i;
        String str;
        JoinGroupMessageExtra joinGroupMessageExtra;
        C954640aww c954640aww = (C954640aww) ((C917110ZyP) obj2).LIZ;
        if (C949990apR.LIZJ(c954640aww) && c954640aww.LIZLLL > 0) {
            MHJoinReplyBizContent mHJoinReplyBizContent = new MHJoinReplyBizContent(0, "", 0);
            MHJoinBizContent mHJoinBizContent = c954640aww.LJI;
            if (mHJoinBizContent != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null) {
                i = (int) joinGroupMessageExtra.sourceType;
            } else {
                i = 0;
            }
            mHJoinReplyBizContent.sourceType = i;
            if (mHJoinBizContent == null || (str = mHJoinBizContent.LIZ) == null) {
                str = "";
            }
            mHJoinReplyBizContent.algoRequestId = str;
            int i2 = c954640aww.LIZ;
            long j = c954640aww.LIZJ;
            long j2 = c954640aww.LIZIZ;
            long j3 = c954640aww.LIZLLL;
            long j4 = c954640aww.LJ;
            String str2 = c954640aww.LJFF;
            ArrayList arrayList = new ArrayList();
            arrayList.add("offliveInviteReply");
            C945210ahj c945210ahj = new C945210ahj(i2, j, j2, j3, j4, str2, 1, (Map) null, mHJoinReplyBizContent, arrayList, 256);
            InterfaceC950010apT<C920610a43> interfaceC950010apT = new InterfaceC950010apT<C920610a43>() { // from class: X.0a4F
                @Override // X.InterfaceC950010apT
                public final void LIZ(C920640a46 c920640a46) {
                    C961300b7g.LIZ.getClass();
                    C961300b7g.LIZLLL();
                }

                @Override // X.InterfaceC950010apT
                public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                    if (th != null) {
                        C501540Jlg.LJ(C497740JfY.LJII(), th);
                    }
                }
            };
            int i3 = c954640aww.LIZ;
            if (i3 != 0) {
                if (i3 == 1) {
                    C915980Zwa.LJII().LJLIL(c945210ahj, interfaceC950010apT);
                }
            } else {
                C915980Zwa.LJII().LLILZIL(c945210ahj, interfaceC950010apT, C915260ZvQ.LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        C20441214yg.LJIIIZ("NudgeReservationHelper", "receive UserListChangedMessage");
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList<C954460awe> arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            C954460awe c954460awe2 = c954460awe;
            if (!c954460awe2.LJI() && c954460awe2.LJJIIZ == EnumC950200apm.LINKED) {
                arrayList.add(c954460awe);
            }
        }
        for (C954460awe c954460awe3 : arrayList) {
            C916430ZxJ.LJI(c954460awe3.LJ);
            C916430ZxJ.LJFF(c954460awe3.LJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$13(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$14(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$15(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C11H9) obj).LIZ, ((C11H9) obj2).LIZ));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$17(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$18(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        int value;
        if (((C956620b08) ((C917110ZyP) obj2).LIZ).LIZ.state() == EnumC918810a19.StateLinked) {
            TTLHVideoContentReportConfig tTLHVideoContentReportConfig = new TTLHVideoContentReportConfig();
            tTLHVideoContentReportConfig.enable = MultiCoHostUnpolishedTipsEnableSetting.INSTANCE.getValue();
            tTLHVideoContentReportConfig.reportIntervalMs = LSPassThroughRecordSizeConfig.DEFAULT;
            boolean value2 = MultiCoHostUnpolishedTipFaceEnableSetting.INSTANCE.getValue();
            int value3 = -1;
            if (value2) {
                value = MultiCoHostUnpolishedTipFaceDurationSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT;
            } else if (!value2) {
                value = -1;
            } else {
                throw new C1954807lC();
            }
            tTLHVideoContentReportConfig.faceCountStatsIntervalMs = value;
            boolean value4 = MultiCoHostUnpolishedTipVoiceEnableSetting.INSTANCE.getValue();
            if (value4) {
                value3 = MultiCoHostUnpolishedTipVoiceDurationSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT;
            } else if (value4) {
                throw new C1954807lC();
            }
            tTLHVideoContentReportConfig.vadStatsIntervalMs = value3;
            tTLHVideoContentReportConfig.vadStatsThreshold = MultiCoHostUnpolishedTipVoiceThresholdSetting.INSTANCE.getValue();
            tTLHVideoContentReportConfig.faceCountStatsThreshold = MultiCoHostUnpolishedTipFaceThresholdSetting.INSTANCE.getValue();
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null) {
                interfaceC954180awCLJIIIZ.LLILLL(tTLHVideoContentReportConfig);
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$19(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        String str;
        C20441214yg.LIZIZ("MultiGuestMicHangupHelper", "onCancel");
        C937520aVK.LIZ.getClass();
        C937520aVK.LJIIIIZZ();
        if (C937520aVK.LIZJ == 0) {
            str = "off";
        } else {
            str = "on";
        }
        C928460aGi.LIZIZ("cancel", str);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$20(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$21(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$22(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$23(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        C20441214yg.LIZIZ("TwoMatchSpeakingIndicatorComponent", "showIntroPanelForVoiceVisualisation, clicked on Try now");
        C20441214yg.LIZIZ("TwoMatchSpeakingIndicatorComponent", "primaryActionCallback, not turning off AI commentary");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$25(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return C980430bcX.LIZ((C980430bcX) obj, 0, ((Boolean) obj2).booleanValue(), false, false, null, false, 61);
    }

    public static final Object invoke$27(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((MatchSettingsInfo) obj).enableAutoIceShowdown = ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return C980430bcX.LIZ((C980430bcX) obj, 0, false, ((Boolean) obj2).booleanValue(), false, null, false, 59);
    }

    public static final Object invoke$29(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((MatchSettingsInfo) obj).enableAiCommentary = ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return C980430bcX.LIZ((C980430bcX) obj, 0, false, false, ((Boolean) obj2).booleanValue(), null, false, 55);
    }

    public static final Object invoke$31(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((MatchSettingsInfo) obj).enableMatchHistoryDataShare = ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$32(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        C20441214yg.LIZIZ("LinkBattleGuideCapsuleHandler", "showIntroPanelForCapsule, clicked on Cancel");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$33(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$34(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error caused, errorCode: ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", message: ");
        sbLIZ.append((String) obj2);
        C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$36(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error caused, errorCode: ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", message: ");
        sbLIZ.append((String) obj2);
        C20441214yg.LIZIZ("CombinedMatchPreparingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$37(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        boolean z;
        if (((C11H9) obj).LIZ == ((C11H9) obj2).LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$39(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$4(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$40(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$41(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$42(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj).longValue();
        return Unit.LIZ;
    }

    public static final Object invoke$43(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        C20441214yg.LIZIZ("CombinedMatchInviterFragment", "showIntroPanelForInviterPanel, clicked on Maybe Later");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$44(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$45(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$46(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        C20441214yg.LIZIZ("TwoMatchInvitePanelV2", "showIntroPanelForInviterPanel, clicked on Maybe Later");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$47(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$48(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$49(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$5(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$50(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$51(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$6(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$7(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$8(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS299S0000000_15 aFwS299S0000000_15, Object obj, Object obj2) {
        C20441214yg.LJIIIZ("MultiCoHostResumeTracker", "doOnSei, onNoneParsed");
        return Unit.LIZ;
    }
}
