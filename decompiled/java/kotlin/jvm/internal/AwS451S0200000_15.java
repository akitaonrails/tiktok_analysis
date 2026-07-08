package kotlin.jvm.internal;

import X.C09AY;
import X.C13Z4;
import X.C1670410tZP;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C766270U4b;
import X.C782130UmB;
import X.C785410UrT;
import X.C915980Zwa;
import X.C916750Zxp;
import X.C917110ZyP;
import X.C918130a03;
import X.C922430a6z;
import X.C922680a7O;
import X.C923650a8x;
import X.C923760a98;
import X.C931970aMN;
import X.C934120aPq;
import X.C934130aPr;
import X.C934190aPx;
import X.C943450aet;
import X.C943550af3;
import X.C945810aih;
import X.C950220apo;
import X.C953600avG;
import X.C954060aw0;
import X.C954630awv;
import X.C970390bML;
import X.C970400bMM;
import X.C970410bMN;
import X.C970420bMO;
import X.C970480bMU;
import X.C970520bMY;
import X.C970530bMZ;
import X.C970540bMa;
import X.C973660bRc;
import X.C977550bXt;
import X.C977560bXu;
import X.C977570bXv;
import X.C977580bXw;
import X.C980900bdI;
import X.EnumC919170a1j;
import X.EnumC953170auZ;
import X.EnumC980470bcb;
import X.InterfaceC1680500tpg;
import X.InterfaceC917550Zz7;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.MultiCoHostScreenshareEducationDialog;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection.SendTargetSelectionDialog;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS451S0200000_15 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C922680a7O c922680a7O, AwS2S1111000_15 awS2S1111000_15, int i) {
        super(2);
        this.$t = i;
        this.l0 = c922680a7O;
        this.l1 = awS2S1111000_15;
    }

    public static final Object invoke$0(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ((C977570bXv) awS451S0200000_15.l0).LJIILJJIL = null;
        ((Function2) awS451S0200000_15.l1).invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = ((MultiGuestV3GuestPresenter) awS451S0200000_15.l0).getMultiGuestDataHolder().LJJJLL;
        Function1 function1 = (Function1) awS451S0200000_15.l1;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchSeiEntrance");
        sbLIZ.append(": sei_audience_competition Dispatch match SEI entrance success, other");
        C20441214yg.LIZIZ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ));
        ((C970530bMZ) awS451S0200000_15.l0).LIZ.invoke(new C970410bMN((EnumC919170a1j) awS451S0200000_15.l1, (BattleInfoResponse) obj, iIntValue));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        int i;
        BattleInfoResponse battleInfoResponse = (BattleInfoResponse) obj;
        int iIntValue = ((Number) obj2).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchMatchArmiesMessageEntrance");
        sbLIZ.append(": Dispatch armies message fallback entrance success,params = ");
        sbLIZ.append((C970390bML) awS451S0200000_15.l0);
        C20441214yg.LIZIZ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ));
        ((C970480bMU) awS451S0200000_15.l1).getClass();
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i = battleSetting.battleType;
        } else {
            i = 0;
        }
        ((C970390bML) awS451S0200000_15.l0).LIZ.invoke(new C970420bMO<>(C918130a03.LIZ(Integer.valueOf(i)), battleInfoResponse, iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$12(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        int i;
        ((Number) obj2).intValue();
        C970480bMU c970480bMU = (C970480bMU) awS451S0200000_15.l0;
        LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) ((C970520bMY) awS451S0200000_15.l1).LIZIZ;
        c970480bMU.getClass();
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null) {
            i = battleSetting.battleType;
        } else {
            i = 0;
        }
        EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(Integer.valueOf(i));
        C970520bMY c970520bMY = (C970520bMY) awS451S0200000_15.l1;
        c970520bMY.LIZ.invoke((C970540bMa<T>) new C970540bMa(enumC919170a1jLIZ, c970520bMY.LIZIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$13(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        int i;
        BattleInfoResponse battleInfoResponse = (BattleInfoResponse) obj;
        int iIntValue = ((Number) obj2).intValue();
        ((C970480bMU) awS451S0200000_15.l0).getClass();
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i = battleSetting.battleType;
        } else {
            i = 0;
        }
        EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(Integer.valueOf(i));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchMatchRoomEnterEntrance");
        sbLIZ.append(",onIdentifySuccess, matchType = ");
        sbLIZ.append(enumC919170a1jLIZ);
        C20441214yg.LIZIZ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ));
        ((C970400bMM) awS451S0200000_15.l1).LIZ.invoke((C970420bMO<T>) new C970420bMO(enumC919170a1jLIZ, battleInfoResponse, iIntValue));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        TuxPanel tuxPanel = (TuxPanel) obj;
        if (C950220apo.LJI()) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            C973660bRc.LIZ.LJJJJJ(((C980900bdI) awS451S0200000_15.l0).LLILZIL, "popup_guide", "ai_icon", "turn_off_ai_comment", "", false);
            C20441214yg.LIZIZ("TwoMatchSpeakingIndicatorComponent", "showIntroPanelForVoiceVisualisation, clicked on Cancel");
            C915980Zwa.LJ().me1((Context) awS451S0200000_15.l1, C497740JfY.LJIJI(2131853702), C497740JfY.LJIJI(2131853699), C497740JfY.LJIJI(2131853700), C497740JfY.LJIJI(2131853701), new AwS416S0200000_15((C980900bdI) awS451S0200000_15.l0, tuxPanel, 58), new AwS559S0100000_15((C980900bdI) awS451S0200000_15.l0, 575));
        } else {
            IMatchAICommentaryService iMatchAICommentaryServiceLJ = C915980Zwa.LJ();
            DataChannel dataChannel = ((C980900bdI) awS451S0200000_15.l0).LLILZIL;
            if (dataChannel != null) {
                iMatchAICommentaryServiceLJ.PM2(dataChannel, EnumC980470bcb.AI_COMMENTARY_ICON, AFwS231S0000000_3.get$arr$(125));
                tuxPanel.dismiss();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        Integer numValueOf;
        int iIntValue;
        ((Number) obj2).intValue();
        MultiGuestDataHolder multiGuestDataHolder = ((C922680a7O) awS451S0200000_15.l0).getMultiGuestDataHolder();
        if (multiGuestDataHolder != null) {
            numValueOf = Integer.valueOf(multiGuestDataHolder.LJJJLL);
        } else {
            numValueOf = null;
        }
        Function1 function1 = (Function1) awS451S0200000_15.l1;
        if (function1 != null) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 2;
            }
            function1.invoke(Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        PunishEventInfo punishEventInfo = ((PerceptionMessage) awS451S0200000_15.l0).publicEventInfo;
        if (punishEventInfo != null) {
            C782130UmB.LIZ(((PerceptionMessage) ((IMessage) awS451S0200000_15.l1)).dialog, punishEventInfo, str, str2, false, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = ((C923760a98) awS451S0200000_15.l0).LJJJLZIJ().LJJJLL;
        Function1 function1 = (Function1) awS451S0200000_15.l1;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ((C977560bXu) awS451S0200000_15.l0).LJIILLIIL = null;
        ((Function2) awS451S0200000_15.l1).invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ((C977550bXt) awS451S0200000_15.l0).LJIILL = null;
        ((Function2) awS451S0200000_15.l1).invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        DataChannel dataChannel = ((MultiGuestV3GuestPresenter) awS451S0200000_15.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(MicClickableEvent.class, new C931970aMN(((C922430a6z) awS451S0200000_15.l1).LIZ, "business_mute_source_audio_mute_punish"));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        MultiGuestDataHolder multiGuestDataHolder = ((C923650a8x) awS451S0200000_15.l0).getMultiGuestDataHolder();
        if (multiGuestDataHolder != null) {
            int i = multiGuestDataHolder.LJJJLL;
            Function1 function1 = (Function1) awS451S0200000_15.l1;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(i));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C954060aw0 c954060aw0 = (C954060aw0) awS451S0200000_15.l0;
        Context context = (Context) awS451S0200000_15.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upload to Tos... ");
        sbLIZ.append(iIntValue);
        sbLIZ.append('/');
        sbLIZ.append(iIntValue2);
        c954060aw0.LIZ(context, "step 4/5", C2188811AlT.LIZIZ(sbLIZ), false);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        View view3 = ((C934190aPx) awS451S0200000_15.l0).LLJJJJ;
        if (view3 != null) {
            view3.setTag((C943450aet) awS451S0200000_15.l1);
        }
        C934190aPx c934190aPx = (C934190aPx) awS451S0200000_15.l0;
        Animator animator = c934190aPx.LLLFFI;
        if (animator != null) {
            animator.cancel();
        }
        c934190aPx.LLLFFI = null;
        C943550af3 c943550af3 = new C943550af3(view, view2);
        c943550af3.LIZJ = new C945810aih((C943450aet) awS451S0200000_15.l1);
        return c943550af3.LIZ();
    }

    public static final Object invoke$23(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) awS451S0200000_15.l0;
        if (multiGuestDataHolder != null) {
            int i = multiGuestDataHolder.LJJJLL;
            Function1 function1 = (Function1) awS451S0200000_15.l1;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(i));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        C934120aPq c934120aPq = (C934120aPq) awS451S0200000_15.l0;
        Animator animator = c934120aPq.LLJZ;
        if (animator != null) {
            animator.cancel();
        }
        c934120aPq.LLJZ = null;
        C943550af3 c943550af3 = new C943550af3(view, view2);
        c943550af3.LIZJ = new C945810aih((C943450aet) awS451S0200000_15.l1);
        return c943550af3.LIZ();
    }

    public static final Object invoke$4(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        C934130aPr c934130aPr = (C934130aPr) awS451S0200000_15.l0;
        Animator animator = c934130aPr.LLLFF;
        if (animator != null) {
            animator.cancel();
        }
        c934130aPr.LLLFF = null;
        C943550af3 c943550af3 = new C943550af3(view, view2);
        c943550af3.LIZJ = new C945810aih((C943450aet) awS451S0200000_15.l1);
        return c943550af3.LIZ();
    }

    public static final Object invoke$5(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        boolean z;
        InterfaceC917550Zz7 interfaceC917550Zz7;
        InterfaceC917550Zz7 interfaceC917550Zz72;
        String str = (String) obj;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        long jLongValue = 0;
        if (z) {
            WeakReference<InterfaceC917550Zz7> weakReference = ((C953600avG) awS451S0200000_15.l0).LJFF;
            if (weakReference != null && (interfaceC917550Zz72 = weakReference.get()) != null) {
                C953600avG c953600avG = (C953600avG) awS451S0200000_15.l0;
                int i = c953600avG.LJIIJJI;
                Long l = c953600avG.LJIIIIZZ;
                if (l != null) {
                    jLongValue = l.longValue();
                }
                interfaceC917550Zz72.LJFF(new C916750Zxp(i, jLongValue, ((C953600avG) awS451S0200000_15.l0).LIZ), str);
            }
            Function1<? super Boolean, Unit> function1 = ((C953600avG) awS451S0200000_15.l0).LJIILIIL;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            Function1 function12 = (Function1) awS451S0200000_15.l1;
            if (function12 != null) {
                function12.invoke(str);
            }
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131855118));
            WeakReference<InterfaceC917550Zz7> weakReference2 = ((C953600avG) awS451S0200000_15.l0).LJFF;
            if (weakReference2 != null && (interfaceC917550Zz7 = weakReference2.get()) != null) {
                C953600avG c953600avG2 = (C953600avG) awS451S0200000_15.l0;
                int i2 = c953600avG2.LJIIJJI;
                Long l2 = c953600avG2.LJIIIIZZ;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                interfaceC917550Zz7.LJ(new C916750Zxp(i2, jLongValue, ((C953600avG) awS451S0200000_15.l0).LIZ), EnumC953170auZ.UPLOAD_FAIL, null);
            }
            Function1<? super Boolean, Unit> function13 = ((C953600avG) awS451S0200000_15.l0).LJIILIIL;
            if (function13 != null) {
                function13.invoke(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$6(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        long j = ((C954630awv) ((C917110ZyP) obj2).LIZ).LIZLLL;
        Long l = (Long) awS451S0200000_15.l0;
        if (l != null && j == l.longValue()) {
            MultiCoHostScreenshareEducationDialog multiCoHostScreenshareEducationDialog = (MultiCoHostScreenshareEducationDialog) awS451S0200000_15.l1;
            multiCoHostScreenshareEducationDialog.dismiss();
            C785410UrT.LIZ(multiCoHostScreenshareEducationDialog);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670410tZP.LIZ(null, null, null, null, null, null, C13Z4.LIZJ(-419139329, new AwS451S0200000_15((SendTargetSelectionDialog) awS451S0200000_15.l0, (SendTargetSelectionDialog) awS451S0200000_15.l1, (List<? extends User>) 8), interfaceC1680500tpg), interfaceC1680500tpg, 1572864, 63);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS451S0200000_15 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r8.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L19
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L19
            r7.LIZJ()
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            java.lang.Object r0 = r6.l0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection.SendTargetSelectionDialog r0 = (com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection.SendTargetSelectionDialog) r0
            java.util.List<? extends com.bytedance.android.live.base.model.user.User> r2 = r0.LLILLL
            java.lang.Object r3 = r6.l1
            java.util.List r3 = (java.util.List) r3
            java.lang.Long r4 = r0.LLILZ
            boolean r5 = r0.LLILZIL
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r7.LJJIIJZLJL(r0)
            java.lang.Object r0 = r6.l0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection.SendTargetSelectionDialog r0 = (com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection.SendTargetSelectionDialog) r0
            boolean r0 = r7.LJII(r0)
            java.lang.Object r1 = r6.l0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection.SendTargetSelectionDialog r1 = (com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.receiverselection.SendTargetSelectionDialog) r1
            java.lang.Object r6 = r7.LJJ()
            if (r0 != 0) goto L48
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L52
        L48:
            kotlin.jvm.internal.AwS594S0100000_15 r6 = new kotlin.jvm.internal.AwS594S0100000_15
            r0 = 574(0x23e, float:8.04E-43)
            r6.<init>(r1, r0)
            r7.LJJIJIIJI(r6)
        L52:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r7.LJ()
            r8 = 0
            X.C1670720tZu.LIZ(r2, r3, r4, r5, r6, r7, r8)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS451S0200000_15.invoke$8(kotlin.jvm.internal.AwS451S0200000_15, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS451S0200000_15 awS451S0200000_15, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ((C977580bXw) awS451S0200000_15.l0).LJIILL = null;
        ((Function2) awS451S0200000_15.l1).invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C923650a8x c923650a8x, AwS594S0100000_15 awS594S0100000_15, int i) {
        super(2);
        this.$t = i;
        this.l0 = c923650a8x;
        this.l1 = awS594S0100000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C923760a98 c923760a98, AwS594S0100000_15 awS594S0100000_15, int i) {
        super(2);
        this.$t = i;
        this.l0 = c923760a98;
        this.l1 = awS594S0100000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C934120aPq c934120aPq, C943450aet c943450aet, int i) {
        super(2);
        this.$t = i;
        this.l0 = c934120aPq;
        this.l1 = c943450aet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C934130aPr c934130aPr, C943450aet c943450aet, int i) {
        super(2);
        this.$t = i;
        this.l0 = c934130aPr;
        this.l1 = c943450aet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C934190aPx c934190aPx, C943450aet c943450aet, int i) {
        super(2);
        this.$t = i;
        this.l0 = c934190aPx;
        this.l1 = c943450aet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS451S0200000_15(C953600avG c953600avG, C953600avG c953600avG2, Function1<? super String, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = c953600avG;
        this.l1 = c953600avG2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C970390bML c970390bML, C970480bMU c970480bMU, int i) {
        super(2);
        this.$t = i;
        this.l0 = c970390bML;
        this.l1 = c970480bMU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C970480bMU c970480bMU, C970400bMM c970400bMM, int i) {
        super(2);
        this.$t = i;
        this.l0 = c970480bMU;
        this.l1 = c970400bMM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS451S0200000_15(C970480bMU c970480bMU, C970480bMU c970480bMU2, C970520bMY<LinkMicBattleMessage> c970520bMY) {
        super(2);
        this.$t = c970520bMY;
        this.l0 = c970480bMU;
        this.l1 = c970480bMU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C970530bMZ c970530bMZ, EnumC919170a1j enumC919170a1j, int i) {
        super(2);
        this.$t = i;
        this.l0 = c970530bMZ;
        this.l1 = enumC919170a1j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C977550bXt c977550bXt, AwS155S0110000_15 awS155S0110000_15, int i) {
        super(2);
        this.$t = i;
        this.l0 = c977550bXt;
        this.l1 = awS155S0110000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS451S0200000_15(C977560bXu c977560bXu, C977560bXu c977560bXu2, Function2<? super Boolean, ? super Boolean, Unit> function2) {
        super(2);
        this.$t = function2;
        this.l0 = c977560bXu;
        this.l1 = c977560bXu2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C977570bXv c977570bXv, AwS155S0110000_15 awS155S0110000_15, int i) {
        super(2);
        this.$t = i;
        this.l0 = c977570bXv;
        this.l1 = awS155S0110000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C977580bXw c977580bXw, AwS155S0110000_15 awS155S0110000_15, int i) {
        super(2);
        this.$t = i;
        this.l0 = c977580bXw;
        this.l1 = awS155S0110000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(C980900bdI c980900bdI, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = c980900bdI;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(Context context, C954060aw0 c954060aw0, int i) {
        super(2);
        this.$t = i;
        this.l0 = c954060aw0;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(MultiGuestDataHolder multiGuestDataHolder, AwS7S1400100_15 awS7S1400100_15, int i) {
        super(2);
        this.$t = i;
        this.l0 = multiGuestDataHolder;
        this.l1 = awS7S1400100_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, C922430a6z c922430a6z, int i) {
        super(2);
        this.$t = i;
        this.l0 = multiGuestV3GuestPresenter;
        this.l1 = c922430a6z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS451S0200000_15(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter2, Function1<? super Integer, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = multiGuestV3GuestPresenter;
        this.l1 = multiGuestV3GuestPresenter2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS451S0200000_15(SendTargetSelectionDialog sendTargetSelectionDialog, SendTargetSelectionDialog sendTargetSelectionDialog2, List<? extends User> list) {
        super(2);
        this.$t = list;
        this.l0 = sendTargetSelectionDialog;
        this.l1 = sendTargetSelectionDialog2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(PerceptionMessage perceptionMessage, IMessage iMessage, int i) {
        super(2);
        this.$t = i;
        this.l0 = perceptionMessage;
        this.l1 = iMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS451S0200000_15(Long l, MultiCoHostScreenshareEducationDialog multiCoHostScreenshareEducationDialog, int i) {
        super(2);
        this.$t = i;
        this.l0 = l;
        this.l1 = multiCoHostScreenshareEducationDialog;
    }
}
