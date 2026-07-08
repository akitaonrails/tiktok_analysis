package kotlin.jvm.internal;

import X.AbstractC981450beB;
import X.C09AY;
import X.C1666300tSm;
import X.C1685850tyJ;
import X.C1685910tyP;
import X.C1850730yGF;
import X.C20028913Yh;
import X.C20441214yg;
import X.C2188811AlT;
import X.C782130UmB;
import X.C915980Zwa;
import X.C939740aYu;
import X.C940240aZi;
import X.C973890bRz;
import X.C974450bSt;
import X.C975960bVK;
import X.C976050bVT;
import X.C981470beD;
import X.C981480beE;
import X.C981550beL;
import X.EnumC919170a1j;
import X.EnumC962960bAM;
import X.EnumC964170bCJ;
import X.EnumC975850bV9;
import X.InterfaceC1680500tpg;
import X.InterfaceC975520bUc;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTicketIconUrlSetting;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS155S0110000_15 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0110000_15(PerceptionMessage perceptionMessage, int i) {
        super(2);
        this.$t = i;
        this.l0 = perceptionMessage;
        this.z1 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0110000_15(C939740aYu c939740aYu, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = c939740aYu;
        this.z1 = z;
    }

    public static final Object invoke$0(AwS155S0110000_15 awS155S0110000_15, Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        PerceptionMessage perceptionMessage = (PerceptionMessage) awS155S0110000_15.l0;
        PunishEventInfo punishEventInfo = perceptionMessage.publicEventInfo;
        if (punishEventInfo != null) {
            C782130UmB.LIZ(perceptionMessage.dialog, punishEventInfo, str, str2, awS155S0110000_15.z1, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS155S0110000_15 awS155S0110000_15, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        C981480beE c981480beELJJIII = ((C981470beD) awS155S0110000_15.l0).LJJIII();
        boolean z = awS155S0110000_15.z1;
        c981480beELJJIII.getClass();
        C915980Zwa.LJI().LJIIJ().LJJJLL(jLongValue);
        c981480beELJJIII.LJIIIZ = jLongValue;
        C981550beL c981550beL = c981480beELJJIII.LJJIJ;
        c981550beL.LIZJ = true;
        C973890bRz.LIZ.LJI = true;
        c981550beL.LIZLLL = z;
        c981480beELJJIII.LJIIJJI = c981480beELJJIII.LJFF;
        ((C981470beD) awS155S0110000_15.l0).LJJIII().LIZLLL.LJFF((List) obj2);
        if (((C981470beD) awS155S0110000_15.l0).LIZ.d3()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openInvitationPanel");
            sbLIZ.append(", send invite and update rematch button");
            C20441214yg.LIZIZ("CompetitionStateInviter", C2188811AlT.LIZIZ(sbLIZ));
        }
        AbstractC981450beB.LJJIL((C981470beD) awS155S0110000_15.l0, EnumC975850bV9.INVITE_REQUEST_FAILED);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS155S0110000_15 awS155S0110000_15, Object obj, Object obj2) {
        EnumC964170bCJ enumC964170bCJY2;
        Long lValueOf;
        InterfaceC975520bUc interfaceC975520bUc;
        C975960bVK c975960bVKM3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        InterfaceC975520bUc interfaceC975520bUc2 = ((C976050bVT) awS155S0110000_15.l0).LIZIZ;
        EnumC964170bCJ enumC964170bCJY22 = null;
        if (interfaceC975520bUc2 != null) {
            enumC964170bCJY2 = interfaceC975520bUc2.Y2();
        } else {
            enumC964170bCJY2 = null;
        }
        if (enumC964170bCJY2 != EnumC964170bCJ.INVITED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invite Failed, Already not in invited status, current status = ");
            InterfaceC975520bUc interfaceC975520bUc3 = ((C976050bVT) awS155S0110000_15.l0).LIZIZ;
            if (interfaceC975520bUc3 != null) {
                enumC964170bCJY22 = interfaceC975520bUc3.Y2();
            }
            sbLIZ.append(enumC964170bCJY22);
            C20441214yg.LJ("MatchStateInviter", C2188811AlT.LIZIZ(sbLIZ));
        } else if (zBooleanValue) {
            InterfaceC975520bUc interfaceC975520bUc4 = ((C976050bVT) awS155S0110000_15.l0).LIZIZ;
            if (interfaceC975520bUc4 != null) {
                interfaceC975520bUc4.k3(EnumC919170a1j.UNKNOWN);
            }
            C974450bSt c974450bSt = C973890bRz.LIZ;
            InterfaceC975520bUc interfaceC975520bUc5 = ((C976050bVT) awS155S0110000_15.l0).LIZIZ;
            if (interfaceC975520bUc5 != null && (c975960bVKM3 = interfaceC975520bUc5.m3()) != null) {
                lValueOf = Long.valueOf(c975960bVKM3.LJJJJIZL);
            } else {
                lValueOf = null;
            }
            C973890bRz.LJIILJJIL = lValueOf;
            C20441214yg.LIZIZ("MatchStateInviter", "Invite Failed, update match type to UNKNOWN");
            C976050bVT c976050bVT = (C976050bVT) awS155S0110000_15.l0;
            EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.NONE;
            EnumC975850bV9 enumC975850bV9 = EnumC975850bV9.INVITE_REQUEST_FAILED;
            c976050bVT.LJIJ(enumC964170bCJ, enumC975850bV9, null, null);
            if (!awS155S0110000_15.z1 && zBooleanValue2 && (interfaceC975520bUc = ((C976050bVT) awS155S0110000_15.l0).LIZIZ) != null) {
                interfaceC975520bUc.LIZ(EnumC962960bAM.MATCH_INDIVIDUAL, enumC975850bV9.getSource());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS155S0110000_15 awS155S0110000_15, Object obj, Object obj2) {
        long jLIZIZ;
        long jLIZIZ2;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            long jLongValue = ((Number) C20028913Yh.LIZIZ(((C939740aYu) awS155S0110000_15.l0).LLLLIIL, interfaceC1680500tpg, 0).getValue()).longValue();
            int iIntValue = ((Number) C20028913Yh.LIZIZ(((C939740aYu) awS155S0110000_15.l0).LLLLIILL, interfaceC1680500tpg, 0).getValue()).intValue();
            String str = (String) C20028913Yh.LIZIZ(((C939740aYu) awS155S0110000_15.l0).LLLLIILLL, interfaceC1680500tpg, 0).getValue();
            LinkMicTicketIconUrlSetting linkMicTicketIconUrlSetting = LinkMicTicketIconUrlSetting.INSTANCE;
            Integer rankBgColorByName = linkMicTicketIconUrlSetting.getRankBgColorByName(str);
            if (rankBgColorByName != null) {
                jLIZIZ = C1685850tyJ.LIZIZ(rankBgColorByName.intValue());
            } else {
                jLIZIZ = C1685910tyP.LIZJ;
            }
            Integer iconBgColorByName = linkMicTicketIconUrlSetting.getIconBgColorByName(str);
            if (iconBgColorByName != null) {
                jLIZIZ2 = C1685850tyJ.LIZIZ(iconBgColorByName.intValue());
            } else {
                jLIZIZ2 = C1685910tyP.LIZJ;
            }
            C1666300tSm.LIZ(C1850730yGF.LJI(iIntValue), C1850730yGF.LIZLLL(jLongValue, true), jLIZIZ2, jLIZIZ, awS155S0110000_15.z1, interfaceC1680500tpg, 0, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS155S0110000_15 awS155S0110000_15, Object obj, Object obj2) {
        long jLIZIZ;
        long jLIZIZ2;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            long jLongValue = ((Number) C20028913Yh.LIZIZ(((C940240aZi) awS155S0110000_15.l0).LLJJIJIL, interfaceC1680500tpg, 0).getValue()).longValue();
            int iIntValue = ((Number) C20028913Yh.LIZIZ(((C940240aZi) awS155S0110000_15.l0).LLJJJ, interfaceC1680500tpg, 0).getValue()).intValue();
            String str = (String) C20028913Yh.LIZIZ(((C940240aZi) awS155S0110000_15.l0).LLJJJIL, interfaceC1680500tpg, 0).getValue();
            LinkMicTicketIconUrlSetting linkMicTicketIconUrlSetting = LinkMicTicketIconUrlSetting.INSTANCE;
            Integer rankBgColorByName = linkMicTicketIconUrlSetting.getRankBgColorByName(str);
            if (rankBgColorByName != null) {
                jLIZIZ = C1685850tyJ.LIZIZ(rankBgColorByName.intValue());
            } else {
                jLIZIZ = C1685910tyP.LIZJ;
            }
            Integer iconBgColorByName = linkMicTicketIconUrlSetting.getIconBgColorByName(str);
            if (iconBgColorByName != null) {
                jLIZIZ2 = C1685850tyJ.LIZIZ(iconBgColorByName.intValue());
            } else {
                jLIZIZ2 = C1685910tyP.LIZJ;
            }
            C1666300tSm.LIZ(C1850730yGF.LJI(iIntValue), C1850730yGF.LIZLLL(jLongValue, true), jLIZIZ2, jLIZIZ, awS155S0110000_15.z1, interfaceC1680500tpg, 0, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS155S0110000_15 awS155S0110000_15, Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        PerceptionMessage perceptionMessage = (PerceptionMessage) awS155S0110000_15.l0;
        PunishEventInfo punishEventInfo = perceptionMessage.publicEventInfo;
        if (punishEventInfo != null) {
            C782130UmB.LIZ(perceptionMessage.dialog, punishEventInfo, str, str2, awS155S0110000_15.z1, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0110000_15(C940240aZi c940240aZi, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = c940240aZi;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0110000_15(C976050bVT c976050bVT, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = c976050bVT;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0110000_15(C981470beD c981470beD, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = c981470beD;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS155S0110000_15(PerceptionMessage perceptionMessage, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = perceptionMessage;
        this.z1 = z;
    }
}
