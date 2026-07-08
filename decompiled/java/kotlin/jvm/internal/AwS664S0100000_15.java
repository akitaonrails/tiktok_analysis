package kotlin.jvm.internal;

import X.C01ZE;
import X.C09AJ;
import X.C09AY;
import X.C1113800f5e;
import X.C1252980ii8;
import X.C16F5;
import X.C16FS;
import X.C176600m4;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C784440Upu;
import X.C786410Ut5;
import X.C823050WQl;
import X.C915980Zwa;
import X.C921180a4y;
import X.C936030aSv;
import X.C936150aT7;
import X.C936170aT9;
import X.C939720aYs;
import X.C939740aYu;
import X.C940120aZW;
import X.C940240aZi;
import X.C940620aaK;
import X.C944610agl;
import X.C945730aiZ;
import X.C946950akX;
import X.C946980aka;
import X.C947050akh;
import X.C947420alI;
import X.C947590alZ;
import X.C950360aq2;
import X.C954460awe;
import X.C955390ay9;
import X.C962950bAL;
import X.C969850bLT;
import X.C972260bPM;
import X.C973580bRU;
import X.C973590bRV;
import X.C973890bRz;
import X.C975960bVK;
import X.C975990bVN;
import X.C976030bVR;
import X.EnumC1120860fH2;
import X.EnumC919170a1j;
import X.EnumC935940aSm;
import X.EnumC942260acy;
import X.EnumC947440alK;
import X.EnumC962960bAM;
import X.EnumC964170bCJ;
import X.InterfaceC1631620sYq;
import X.InterfaceC946970akZ;
import X.InterfaceC955380ay8;
import X.InterfaceC975520bUc;
import X.RunnableC514701zV;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.matchv2.connection.util.FriendRankQuickMatchInviteInfoChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.guest.LetsDanceGuestViewModel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostMatchFixRejectSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceGameProgressChannel;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public class AwS664S0100000_15 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            case 22:
                return invoke$22(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C936170aT9 c936170aT9, int i) {
        super(3);
        this.$t = i;
        this.l0 = c936170aT9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C939720aYs c939720aYs, int i) {
        super(3);
        this.$t = i;
        this.l0 = c939720aYs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C939740aYu c939740aYu, int i) {
        super(3);
        this.$t = i;
        this.l0 = c939740aYu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C940120aZW c940120aZW, int i) {
        super(3);
        this.$t = i;
        this.l0 = c940120aZW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C940240aZi c940240aZi, int i) {
        super(3);
        this.$t = i;
        this.l0 = c940240aZi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C940620aaK c940620aaK, int i) {
        super(3);
        this.$t = i;
        this.l0 = c940620aaK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C946980aka c946980aka, int i) {
        super(3);
        this.$t = i;
        this.l0 = c946980aka;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C947050akh c947050akh, int i) {
        super(3);
        this.$t = i;
        this.l0 = c947050akh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C955390ay9 c955390ay9, int i) {
        super(3);
        this.$t = i;
        this.l0 = c955390ay9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C973580bRU c973580bRU, int i) {
        super(3);
        this.$t = i;
        this.l0 = c973580bRU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C973590bRV c973590bRV, int i) {
        super(3);
        this.$t = i;
        this.l0 = c973590bRV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C976030bVR c976030bVR, int i) {
        super(3);
        this.$t = i;
        this.l0 = c976030bVR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(C1252980ii8 c1252980ii8, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1252980ii8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(MultiGuestConnectDistributeFragment multiGuestConnectDistributeFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = multiGuestConnectDistributeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = multiGuestAvatarPreviewFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = multiGuestCreateAvatarFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(LetsDanceBaseViewModel letsDanceBaseViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = letsDanceBaseViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(LetsDanceGuestViewModel letsDanceGuestViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = letsDanceGuestViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(MultiMatchAnchorWidget multiMatchAnchorWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = multiMatchAnchorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS664S0100000_15(AwS626S0100000_12 awS626S0100000_12, int i) {
        super(3);
        this.$t = i;
        this.l0 = awS626S0100000_12;
    }

    public static final Object invoke$0(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        EnumC947440alK enumC947440alK = (EnumC947440alK) obj;
        EnumC947440alK enumC947440alK2 = (EnumC947440alK) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" GamePhase change: ");
        sbLIZ.append(enumC947440alK);
        sbLIZ.append(" -> ");
        sbLIZ.append(enumC947440alK2);
        C20441214yg.LIZIZ("BaseLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C947050akh c947050akh = (C947050akh) awS664S0100000_15.l0;
        c947050akh.LJI = c947050akh.LJIIIZ.getValue();
        ((C947050akh) awS664S0100000_15.l0).LJIIIZ.setValue(enumC947440alK2);
        ((C947050akh) awS664S0100000_15.l0).LJIILIIL(enumC947440alK, enumC947440alK2, obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        Long l;
        C947420alI c947420alI = (C947420alI) obj;
        C947420alI c947420alI2 = (C947420alI) obj2;
        C20441214yg.LIZIZ("BaseLetsDanceBizViewModel", " GameState change");
        C947050akh c947050akh = (C947050akh) awS664S0100000_15.l0;
        if (c947420alI != null) {
            l = c947420alI.LJI;
        } else {
            l = null;
        }
        c947050akh.LJII = l;
        c947050akh.LJIIIIZZ.setValue(c947420alI2);
        ((C947050akh) awS664S0100000_15.l0).LJIIJJI.setValue(c947420alI2.LJII);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        long jLongValue = ((Number) obj3).longValue();
        if (iIntValue != 6) {
            if (iIntValue != 7) {
                C936170aT9 c936170aT9 = (C936170aT9) awS664S0100000_15.l0;
                C09AJ<C936030aSv> c09aj = c936170aT9.LIZLLL;
                if (c09aj != null) {
                    c09aj.onNext(new C936030aSv(c936170aT9, EnumC935940aSm.STATE_PROGRESS, (int) ((((long) 10) * jLongValue) / ((long) 100)), null, 0 == true ? 1 : 0, 24));
                }
            } else {
                C936170aT9 c936170aT92 = (C936170aT9) awS664S0100000_15.l0;
                C09AJ<C936030aSv> c09aj2 = c936170aT92.LIZLLL;
                if (c09aj2 != null) {
                    c09aj2.onNext(new C936030aSv(c936170aT92, EnumC935940aSm.STATE_FAILED, 0, null, "upload_fail", 8));
                }
                C936170aT9 c936170aT93 = (C936170aT9) awS664S0100000_15.l0;
                c936170aT93.getClass();
                C20441214yg.LIZIZ("GenerateTask", "deleteCropFile");
                String str2 = c936170aT93.LJI;
                if (str2 != null) {
                    C823050WQl.LIZLLL().submit(new RunnableC514701zV(str2, 1));
                }
                C09AJ<C936030aSv> c09aj3 = ((C936170aT9) awS664S0100000_15.l0).LIZLLL;
                if (c09aj3 != null) {
                    c09aj3.onComplete();
                }
            }
        } else {
            C936170aT9 c936170aT94 = (C936170aT9) awS664S0100000_15.l0;
            c936170aT94.getClass();
            C20441214yg.LIZIZ("GenerateTask", "deleteCropFile");
            String str3 = c936170aT94.LJI;
            if (str3 != null) {
                C823050WQl.LIZLLL().submit(new RunnableC514701zV(str3, 1));
            }
            C936170aT9 c936170aT95 = (C936170aT9) awS664S0100000_15.l0;
            C09AJ<C936030aSv> c09aj4 = c936170aT95.LIZLLL;
            if (c09aj4 != null) {
                c09aj4.onNext(new C936030aSv(c936170aT95, EnumC935940aSm.STATE_PROGRESS, 10, null, 0 == true ? 1 : 0, 24));
            }
            C936170aT9 c936170aT96 = (C936170aT9) awS664S0100000_15.l0;
            c936170aT96.LJII = str;
            c936170aT96.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        EnumC962960bAM enumC962960bAM = (EnumC962960bAM) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeCompatibleMatchStatusV3 status:");
        sbLIZ.append(obj);
        sbLIZ.append(", bizType:");
        sbLIZ.append(enumC962960bAM);
        sbLIZ.append(", isRematch:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", competitionService.getCurrentBizType:");
        sbLIZ.append(C915980Zwa.LIZIZ().Dn0());
        sbLIZ.append(" matchService.getCurrentMatchType:");
        sbLIZ.append(C915980Zwa.LJFF().xB0());
        C20441214yg.LIZIZ("ToolbarInteractBattleBehavior", C2188811AlT.LIZIZ(sbLIZ));
        Function2 function2 = (Function2) awS664S0100000_15.l0;
        EnumC962960bAM.Companion.getClass();
        function2.invoke(obj, C962950bAL.LJFF(enumC962960bAM));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        boolean z;
        C975960bVK c975960bVKM3;
        C975990bVN c975990bVN;
        long j;
        long j2;
        List<C954460awe> list = (List) obj;
        List<C954460awe> list2 = (List) obj2;
        C976030bVR c976030bVR = (C976030bVR) awS664S0100000_15.l0;
        if (obj3 == EnumC919170a1j.MATCH_TYPE_1V1) {
            z = true;
        } else {
            z = false;
        }
        c976030bVR.getClass();
        if (!LiveCoHostMatchFixRejectSetting.INSTANCE.isEnable()) {
            C20441214yg.LIZIZ("MatchStateInvitee", "updatePrepareInviteeMatchModel return for disable.");
        } else {
            InterfaceC975520bUc interfaceC975520bUc = c976030bVR.LIZIZ;
            if (interfaceC975520bUc != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
                for (C954460awe c954460awe : list) {
                    if (!z) {
                        j2 = 1;
                    } else {
                        j2 = c954460awe.LJ;
                    }
                    c975990bVN.LJFF(j2, Collections.singletonList(Long.valueOf(c954460awe.LJ)));
                }
                for (C954460awe c954460awe2 : list2) {
                    if (!z) {
                        j = 2;
                    } else {
                        j = c954460awe2.LJ;
                    }
                    c975990bVN.LJFF(j, Collections.singletonList(Long.valueOf(c954460awe2.LJ)));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        Integer num;
        EnumC947440alK enumC947440alK = EnumC947440alK.PLAYING;
        if (obj2 == enumC947440alK && (num = (Integer) ((C946980aka) awS664S0100000_15.l0).LL.gg0(MultiLetsDanceGameProgressChannel.class)) != null && num.intValue() > 0) {
            C20441214yg.LJIIIZ("LetsDanceBackgroundEffectManager", "loadAndPlayLetsDanceAnimation, receive Playing event and not in Countdown");
            C946980aka.LIZ((C946980aka) awS664S0100000_15.l0);
        } else if (obj2 != enumC947440alK) {
            C176600m4.LIZJ(new AwS559S0100000_15((C946980aka) awS664S0100000_15.l0, 887));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        boolean z;
        String lowerCase;
        String strName;
        EnumC947440alK enumC947440alK = (EnumC947440alK) obj;
        EnumC947440alK enumC947440alK2 = (EnumC947440alK) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LetsDanceBaseViewModel) awS664S0100000_15.l0).getTag());
        sbLIZ.append(" gamePhaseSubscription currentPhase:");
        sbLIZ.append(enumC947440alK2);
        C20441214yg.LIZIZ("LetsDanceBaseViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC947440alK2 != EnumC947440alK.NONE) {
            z = true;
        } else {
            z = false;
        }
        ((LetsDanceBaseViewModel) awS664S0100000_15.l0).LLJILJILJ.postValue(Boolean.valueOf(z));
        ((LetsDanceBaseViewModel) awS664S0100000_15.l0).LLJILLL.postValue(new Pair<>(enumC947440alK, enumC947440alK2));
        ((LetsDanceBaseViewModel) awS664S0100000_15.l0).FQ2(enumC947440alK, enumC947440alK2);
        if (enumC947440alK == null || (strName = enumC947440alK.name()) == null || (lowerCase = strName.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = "none";
        }
        String lowerCase2 = enumC947440alK2.name().toLowerCase(Locale.ROOT);
        if (!Intrinsics.LJFF(lowerCase, lowerCase2)) {
            Map mapLJ = C2097608Jq.LJ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("pre_phase", lowerCase);
            linkedHashMap.put("next_phase", lowerCase2);
            linkedHashMap.putAll(mapLJ);
            C946950akX.LJIIIIZZ("phase_changed_msg_receive", linkedHashMap);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        C950360aq2 c950360aq2;
        DataChannel dataChannel = ((MultiMatchAnchorWidget) awS664S0100000_15.l0).dataChannel;
        if (dataChannel != null) {
            c950360aq2 = (C950360aq2) dataChannel.gg0(FriendRankQuickMatchInviteInfoChannel.class);
        } else {
            c950360aq2 = null;
        }
        if (c950360aq2 != null) {
            C20441214yg.LIZIZ("MultiMatchWidget", "friend-rank quick match confirmed (lynx-direct), reuse CohostInviteEvent payload");
            C784440Upu.LIZ().LIZIZ(new C944610agl(c950360aq2));
            DataChannel dataChannel2 = ((MultiMatchAnchorWidget) awS664S0100000_15.l0).dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.zW(FriendRankQuickMatchInviteInfoChannel.class, null);
            }
        } else {
            C20441214yg.LJIIL("MultiMatchWidget", "friend-rank quick match confirmed (lynx-direct), inviteInfo is null");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        ((C939740aYu) awS664S0100000_15.l0).LJJIFFI((String) obj);
        ((C939740aYu) awS664S0100000_15.l0).LJJIIZ((String) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj2;
        String str = (String) obj3;
        ((C940240aZi) awS664S0100000_15.l0).LJIILLIIL((String) obj);
        if (C01ZE.LIZ()) {
            ((C940240aZi) awS664S0100000_15.l0).LJJI(str);
        } else {
            ((C940240aZi) awS664S0100000_15.l0).LJJ(num);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        C176600m4.LIZJ(new AwS416S0200000_15((EnumC947440alK) obj2, (C940240aZi) awS664S0100000_15.l0, 115));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        C176600m4.LIZJ(new AwS416S0200000_15((C940620aaK) awS664S0100000_15.l0, (C947590alZ) obj2, 116));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        EnumC942260acy enumC942260acy;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        EnumC942260acy enumC942260acy2;
        String strName;
        String lowerCase4;
        EnumC942260acy enumC942260acy3;
        String strName2;
        EnumC942260acy enumC942260acy4;
        String strName3;
        EnumC942260acy enumC942260acy5;
        String strName4;
        C947590alZ c947590alZ = (C947590alZ) obj;
        C947590alZ c947590alZ2 = (C947590alZ) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" PlayerStatus change: ");
        EnumC942260acy enumC942260acy6 = null;
        if (c947590alZ != null) {
            enumC942260acy = c947590alZ.LIZJ;
        } else {
            enumC942260acy = null;
        }
        sbLIZ.append(enumC942260acy);
        sbLIZ.append(" -> ");
        if (c947590alZ2 != null) {
            enumC942260acy6 = c947590alZ2.LIZJ;
        }
        sbLIZ.append(enumC942260acy6);
        C20441214yg.LIZIZ("BaseLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
        ((C947050akh) awS664S0100000_15.l0).LJIIJ.setValue(c947590alZ2);
        ((C947050akh) awS664S0100000_15.l0).LJIILL(c947590alZ, c947590alZ2, obj3);
        String str = "none";
        if (c947590alZ == null || (enumC942260acy5 = c947590alZ.LIZJ) == null || (strName4 = enumC942260acy5.name()) == null || (lowerCase = strName4.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = "none";
        }
        if (c947590alZ2 == null || (enumC942260acy4 = c947590alZ2.LIZJ) == null || (strName3 = enumC942260acy4.name()) == null || (lowerCase2 = strName3.toLowerCase(Locale.ROOT)) == null) {
            lowerCase2 = "none";
        }
        if (!Intrinsics.LJFF(lowerCase, lowerCase2)) {
            if (c947590alZ == null || (enumC942260acy3 = c947590alZ.LIZJ) == null || (strName2 = enumC942260acy3.name()) == null || (lowerCase3 = strName2.toLowerCase(Locale.ROOT)) == null) {
                lowerCase3 = "none";
            }
            if (c947590alZ2 != null && (enumC942260acy2 = c947590alZ2.LIZJ) != null && (strName = enumC942260acy2.name()) != null && (lowerCase4 = strName.toLowerCase(Locale.ROOT)) != null) {
                str = lowerCase4;
            }
            Map mapLJ = C2097608Jq.LJ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("pre_status", lowerCase3);
            linkedHashMap.put("next_status", str);
            linkedHashMap.putAll(mapLJ);
            C946950akX.LJIIIIZZ("player_status_changed_msg_receive", linkedHashMap);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        C947590alZ c947590alZ = (C947590alZ) obj;
        C947590alZ c947590alZ2 = (C947590alZ) obj2;
        if (C940120aZW.LJIILIIL(c947590alZ) && !C940120aZW.LJIILIIL(c947590alZ2)) {
            ((C940120aZW) awS664S0100000_15.l0).LJIJI();
        } else if (!C940120aZW.LJIILIIL(c947590alZ) && C940120aZW.LJIILIIL(c947590alZ2)) {
            ((C940120aZW) awS664S0100000_15.l0).LJIJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        EnumC964170bCJ enumC964170bCJ;
        EnumC964170bCJ enumC964170bCJ2 = (EnumC964170bCJ) obj;
        EnumC962960bAM enumC962960bAM = (EnumC962960bAM) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeCompatibleMatchStatusV3 status:");
        sbLIZ.append(enumC964170bCJ2);
        sbLIZ.append(", bizType:");
        sbLIZ.append(enumC962960bAM);
        sbLIZ.append(", isRematch:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", competitionService.getCurrentBizType:");
        sbLIZ.append(C915980Zwa.LIZIZ().Dn0());
        sbLIZ.append(" matchService.getCurrentMatchType:");
        sbLIZ.append(C915980Zwa.LJFF().xB0());
        C20441214yg.LIZIZ("ToolbarInteractBattleBehavior", C2188811AlT.LIZIZ(sbLIZ));
        C973580bRU c973580bRU = (C973580bRU) awS664S0100000_15.l0;
        c973580bRU.getClass();
        if (!enumC962960bAM.isCatchBean() && !enumC962960bAM.isTakeTheStage()) {
            C16F5 c16f5 = c973580bRU.LLILZLL;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            boolean z = false;
            if (!zBooleanValue) {
                if (enumC964170bCJ2.compareTo(EnumC964170bCJ.MATCH_START) >= 0) {
                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                    C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_BATTLE);
                }
                C973580bRU.LIZIZ(c973580bRU, enumC964170bCJ2, false, 6);
            } else {
                C973890bRz.LJI();
                int i = C969850bLT.LIZ[enumC964170bCJ2.ordinal()];
                if (i != 1 && i != 2) {
                    DataChannel dataChannel = c973580bRU.LLJIJIL;
                    if (dataChannel != null) {
                        enumC964170bCJ = (EnumC964170bCJ) dataChannel.gg0(BattleStateChannel.class);
                    } else {
                        enumC964170bCJ = null;
                    }
                    if (enumC964170bCJ2.compareTo(EnumC964170bCJ.NONE) > 0) {
                        z = true;
                    }
                    C973580bRU.LIZIZ(c973580bRU, enumC964170bCJ, z, 2);
                } else {
                    c973580bRU.LIZJ();
                    c973580bRU.LJ("handleBattleRematchState");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        EnumC964170bCJ enumC964170bCJ;
        EnumC964170bCJ enumC964170bCJ2 = (EnumC964170bCJ) obj;
        EnumC962960bAM enumC962960bAM = (EnumC962960bAM) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeCompatibleMatchStatusV3 status:");
        sbLIZ.append(enumC964170bCJ2);
        sbLIZ.append(", bizType:");
        sbLIZ.append(enumC962960bAM);
        sbLIZ.append(", isRematch:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", competitionService.getCurrentBizType:");
        sbLIZ.append(C915980Zwa.LIZIZ().Dn0());
        sbLIZ.append(" matchService.getCurrentMatchType:");
        sbLIZ.append(C915980Zwa.LJFF().xB0());
        C20441214yg.LIZIZ("ToolbarInteractivePlazaBehavior", C2188811AlT.LIZIZ(sbLIZ));
        C973590bRV c973590bRV = (C973590bRV) awS664S0100000_15.l0;
        c973590bRV.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onBattleStateChange: status ");
        sbLIZ2.append(enumC964170bCJ2);
        sbLIZ2.append(", bizType ");
        sbLIZ2.append(enumC962960bAM);
        sbLIZ2.append(", isRematch ");
        sbLIZ2.append(zBooleanValue);
        C20441214yg.LIZIZ("ToolbarInteractivePlazaBehavior", C2188811AlT.LIZIZ(sbLIZ2));
        boolean z = false;
        if (!zBooleanValue) {
            int i = C972260bPM.LIZ[enumC962960bAM.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C973590bRV.LJFF(c973590bRV, enumC964170bCJ2, false, 6);
                } else {
                    c973590bRV.LJI(enumC964170bCJ2, false);
                }
            } else {
                c973590bRV.LJII(enumC964170bCJ2, false);
            }
        } else {
            C973890bRz.LJI();
            int i2 = C972260bPM.LIZ[enumC962960bAM.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("handleBattleRematchState: state ");
                    sbLIZ3.append(enumC964170bCJ2);
                    C20441214yg.LIZIZ("ToolbarInteractivePlazaBehavior", C2188811AlT.LIZIZ(sbLIZ3));
                    int i3 = C972260bPM.LIZIZ[enumC964170bCJ2.ordinal()];
                    if (i3 != 1 && i3 != 2) {
                        DataChannel dataChannel = c973590bRV.LLILLJJLI;
                        if (dataChannel != null) {
                            enumC964170bCJ = (EnumC964170bCJ) dataChannel.gg0(BattleStateChannel.class);
                        } else {
                            enumC964170bCJ = null;
                        }
                        if (enumC964170bCJ2.compareTo(EnumC964170bCJ.NONE) > 0) {
                            z = true;
                        }
                        C973590bRV.LJFF(c973590bRV, enumC964170bCJ, z, 2);
                    } else {
                        c973590bRV.LJIIJ(EnumC919170a1j.UNKNOWN);
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("handleCatchBeansRematchState: state ");
                    sbLIZ4.append(enumC964170bCJ2);
                    C20441214yg.LIZIZ("ToolbarInteractivePlazaBehavior", C2188811AlT.LIZIZ(sbLIZ4));
                    int i4 = C972260bPM.LIZIZ[enumC964170bCJ2.ordinal()];
                    if (i4 != 1 && i4 != 2) {
                        if (enumC964170bCJ2.compareTo(EnumC964170bCJ.NONE) > 0) {
                            z = true;
                        }
                        c973590bRV.LJI(enumC964170bCJ2, z);
                    } else {
                        c973590bRV.LJIIJ(EnumC919170a1j.UNKNOWN);
                    }
                }
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("handleTakeTheStageRematchState: state ");
                sbLIZ5.append(enumC964170bCJ2);
                C20441214yg.LIZIZ("ToolbarInteractivePlazaBehavior", C2188811AlT.LIZIZ(sbLIZ5));
                int i5 = C972260bPM.LIZIZ[enumC964170bCJ2.ordinal()];
                if (i5 != 1 && i5 != 2) {
                    if (enumC964170bCJ2.compareTo(EnumC964170bCJ.NONE) > 0) {
                        z = true;
                    }
                    c973590bRV.LJII(enumC964170bCJ2, z);
                } else {
                    c973590bRV.LJIIJ(EnumC919170a1j.UNKNOWN);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ((InterfaceC955380ay8) ((C955390ay9) awS664S0100000_15.l0).mView).E20((EnumC964170bCJ) obj, (EnumC962960bAM) obj2, zBooleanValue);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS664S0100000_15 r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS664S0100000_15.invoke$4(kotlin.jvm.internal.AwS664S0100000_15, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj2;
        String str = (String) obj3;
        ((C939720aYs) awS664S0100000_15.l0).updateIconUrl((String) obj, "animationEnd");
        if (C01ZE.LIZ()) {
            ((C939720aYs) awS664S0100000_15.l0).updateTicketLayoutByByIconName(str);
        } else {
            ((C939720aYs) awS664S0100000_15.l0).updateTicketLayoutBg(num);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        long jLongValue;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Avatar avatar = (Avatar) obj2;
        if (((Boolean) obj3).booleanValue()) {
            MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment = (MultiGuestAvatarPreviewFragment) awS664S0100000_15.l0;
            Long l = multiGuestAvatarPreviewFragment.LLJJIJI;
            multiGuestAvatarPreviewFragment.LLJJIII = l;
            IAvatarBusinessAbility iAvatarBusinessAbility = multiGuestAvatarPreviewFragment.LLJJIJIIJIL;
            if (iAvatarBusinessAbility != null) {
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                iAvatarBusinessAbility.Gl0(jLongValue);
            }
            IAvatarBusinessAbility iAvatarBusinessAbility2 = ((MultiGuestAvatarPreviewFragment) awS664S0100000_15.l0).LLJJIJIIJIL;
            if (iAvatarBusinessAbility2 != null) {
                iAvatarBusinessAbility2.e42(avatar);
                return Unit.LIZ;
            }
            return null;
        }
        Function2<? super Boolean, ? super Avatar, Unit> function2 = ((MultiGuestAvatarPreviewFragment) awS664S0100000_15.l0).LLJJIJIL;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(zBooleanValue), avatar);
        }
        MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment2 = (MultiGuestAvatarPreviewFragment) awS664S0100000_15.l0;
        if (!multiGuestAvatarPreviewFragment2.LLILLL) {
            boolean z = true;
            if (avatar != null && avatar.status != 1) {
                z = false;
            }
            Function1<? super Boolean, Unit> function1 = multiGuestAvatarPreviewFragment2.LLJJJ;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z));
            }
            C16FS c16fs = ((MultiGuestAvatarPreviewFragment) awS664S0100000_15.l0).LLJ;
            if (c16fs != null) {
                c16fs.setEnabled(z);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        ((Number) obj3).longValue();
        C09AJ<C936150aT7> c09aj = ((MultiGuestCreateAvatarFragment) awS664S0100000_15.l0).LLJJJ;
        if (c09aj != null) {
            c09aj.onNext(new C936150aT7(iIntValue, str));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS664S0100000_15 awS664S0100000_15, Object obj, Object obj2, Object obj3) {
        EnumC947440alK enumC947440alK;
        EnumC942260acy enumC942260acy;
        EnumC942260acy enumC942260acy2;
        EnumC942260acy enumC942260acy3;
        EnumC942260acy enumC942260acy4;
        EnumC947440alK enumC947440alK2;
        EnumC942260acy enumC942260acy5;
        EnumC942260acy enumC942260acy6;
        EnumC942260acy enumC942260acy7;
        C947420alI c947420alILJII;
        C947420alI c947420alILJII2;
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        C947590alZ c947590alZ = (C947590alZ) ((Map) obj).get(strLJIIJ);
        C947590alZ c947590alZ2 = (C947590alZ) ((Map) obj2).get(strLJIIJ);
        InterfaceC946970akZ interfaceC946970akZXQ2 = ((LetsDanceGuestViewModel) awS664S0100000_15.l0).xQ2();
        if (interfaceC946970akZXQ2 != null && (c947420alILJII2 = interfaceC946970akZXQ2.LJII()) != null) {
            enumC947440alK = c947420alILJII2.LIZJ;
        } else {
            enumC947440alK = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerStatus change: ");
        if (c947590alZ != null) {
            enumC942260acy = c947590alZ.LIZJ;
        } else {
            enumC942260acy = null;
        }
        sbLIZ.append(enumC942260acy);
        sbLIZ.append(" -> ");
        if (c947590alZ2 != null) {
            enumC942260acy2 = c947590alZ2.LIZJ;
        } else {
            enumC942260acy2 = null;
        }
        sbLIZ.append(enumC942260acy2);
        sbLIZ.append(", curGamePhase=");
        sbLIZ.append(enumC947440alK);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(strLJIIJ);
        C20441214yg.LIZIZ("LetsDanceGuestViewModel", C2188811AlT.LIZIZ(sbLIZ));
        LetsDanceGuestViewModel letsDanceGuestViewModel = (LetsDanceGuestViewModel) awS664S0100000_15.l0;
        letsDanceGuestViewModel.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onPlayerStatusChanged, previousPlayerState=");
        sbLIZ2.append(c947590alZ);
        sbLIZ2.append(", currentPlayerState=");
        sbLIZ2.append(c947590alZ2);
        C20441214yg.LIZIZ("LetsDanceGuestViewModel", C2188811AlT.LIZIZ(sbLIZ2));
        if (c947590alZ != null) {
            enumC942260acy3 = c947590alZ.LIZJ;
        } else {
            enumC942260acy3 = null;
        }
        if (c947590alZ2 != null) {
            enumC942260acy4 = c947590alZ2.LIZJ;
        } else {
            enumC942260acy4 = null;
        }
        if (enumC942260acy3 != enumC942260acy4) {
            InterfaceC946970akZ interfaceC946970akZXQ22 = letsDanceGuestViewModel.xQ2();
            if (interfaceC946970akZXQ22 != null && (c947420alILJII = interfaceC946970akZXQ22.LJII()) != null) {
                enumC947440alK2 = c947420alILJII.LIZJ;
            } else {
                enumC947440alK2 = null;
            }
            if (c947590alZ2 != null) {
                enumC942260acy5 = c947590alZ2.LIZJ;
            } else {
                enumC942260acy5 = null;
            }
            EnumC942260acy enumC942260acy8 = EnumC942260acy.READY;
            if (enumC942260acy5 == enumC942260acy8 && enumC947440alK2 == EnumC947440alK.PLAYING) {
                C20441214yg.LIZIZ("LetsDanceGuestViewModel", "Player join game midway");
                if (letsDanceGuestViewModel.EQ2()) {
                    letsDanceGuestViewModel.HQ2();
                }
            } else {
                if (c947590alZ2 != null) {
                    enumC942260acy6 = c947590alZ2.LIZJ;
                } else {
                    enumC942260acy6 = null;
                }
                if (enumC942260acy6 == EnumC942260acy.IDLE && enumC947440alK2 == EnumC947440alK.PLAYING) {
                    C20441214yg.LIZIZ("LetsDanceGuestViewModel", "Player quit game midway");
                    letsDanceGuestViewModel.KQ2(1, "");
                    String strZQ2 = letsDanceGuestViewModel.zQ2();
                    if (strZQ2 != null) {
                        C945730aiZ c945730aiZ = C945730aiZ.LIZ;
                        DataChannel dataChannel = letsDanceGuestViewModel.LL;
                        c945730aiZ.getClass();
                        C945730aiZ.LJ(dataChannel, "play_end", strZQ2, null, null);
                    }
                } else if (c947590alZ2 == null) {
                    if (c947590alZ != null) {
                        enumC942260acy7 = c947590alZ.LIZJ;
                    } else {
                        enumC942260acy7 = null;
                    }
                    if (enumC942260acy7 == enumC942260acy8 && enumC947440alK2 == EnumC947440alK.PLAYING) {
                        C20441214yg.LIZIZ("LetsDanceGuestViewModel", "Player quit game midway, offline");
                        letsDanceGuestViewModel.KQ2(1, "");
                        String strZQ22 = letsDanceGuestViewModel.zQ2();
                        if (strZQ22 != null) {
                            C945730aiZ c945730aiZ2 = C945730aiZ.LIZ;
                            DataChannel dataChannel2 = letsDanceGuestViewModel.LL;
                            c945730aiZ2.getClass();
                            C945730aiZ.LJ(dataChannel2, "play_end", strZQ22, null, null);
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$9(kotlin.jvm.internal.AwS664S0100000_15 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS664S0100000_15.invoke$9(kotlin.jvm.internal.AwS664S0100000_15, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
