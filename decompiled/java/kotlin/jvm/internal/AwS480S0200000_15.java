package kotlin.jvm.internal;

import X.AbstractC923750a97;
import X.AbstractC963510bBF;
import X.C01GW;
import X.C09AY;
import X.C0K04;
import X.C1AZW;
import X.C20441214yg;
import X.C2074808Aw;
import X.C2188811AlT;
import X.C259800zU;
import X.C307001Gy;
import X.C501540Jlg;
import X.C784440Upu;
import X.C915130ZvD;
import X.C915980Zwa;
import X.C919700a2a;
import X.C921180a4y;
import X.C923650a8x;
import X.C924630aAX;
import X.C925600aC6;
import X.C925700aCG;
import X.C925710aCH;
import X.C925770aCN;
import X.C925820aCS;
import X.C927600aFK;
import X.C930540aK4;
import X.C932290aMt;
import X.C934660aQi;
import X.C944240agA;
import X.C944610agl;
import X.C944730agx;
import X.C950360aq2;
import X.C954460awe;
import X.C962950bAL;
import X.C969360bKg;
import X.C974210bSV;
import X.C974230bSX;
import X.C975500bUa;
import X.C975800bV4;
import X.C975830bV7;
import X.C975910bVF;
import X.C975960bVK;
import X.C975990bVN;
import X.C976020bVQ;
import X.EnumC919170a1j;
import X.EnumC962960bAM;
import X.EnumC964170bCJ;
import X.EnumC975850bV9;
import X.InterfaceC1631620sYq;
import X.InterfaceC923600a8s;
import X.InterfaceC923660a8y;
import X.InterfaceC925780aCO;
import X.InterfaceC975520bUc;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.matchv2.connection.util.FriendRankQuickMatchInviteInfoChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.LinkInRoomGuestApplySucceedFromAutoEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class AwS480S0200000_15 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS480S0200000_15(C925700aCG c925700aCG, C925770aCN c925770aCN, int i) {
        super(3);
        this.$t = i;
        this.l0 = c925700aCG;
        this.l1 = c925770aCN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS480S0200000_15(C925710aCH c925710aCH, C925770aCN c925770aCN, int i) {
        super(3);
        this.$t = i;
        this.l0 = c925710aCH;
        this.l1 = c925770aCN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS480S0200000_15(C974210bSV c974210bSV, MultiMatchAnchorWidget multiMatchAnchorWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = c974210bSV;
        this.l1 = multiMatchAnchorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS480S0200000_15(EnumC975850bV9 enumC975850bV9, C975830bV7 c975830bV7, int i) {
        super(3);
        this.$t = i;
        this.l0 = enumC975850bV9;
        this.l1 = c975830bV7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS480S0200000_15(MultiMatchAnchorWidget multiMatchAnchorWidget, AbstractC963510bBF abstractC963510bBF, int i) {
        super(3);
        this.$t = i;
        this.l0 = multiMatchAnchorWidget;
        this.l1 = abstractC963510bBF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS480S0200000_15(C259800zU c259800zU, MultiMatchAnchorWidget multiMatchAnchorWidget, boolean z, int i) {
        super(3);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = multiMatchAnchorWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    public static final Object invoke$0(AwS480S0200000_15 awS480S0200000_15, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        EnumC919170a1j enumC919170a1j = (EnumC919170a1j) obj3;
        if (((Boolean) obj2).booleanValue()) {
            ((C259800zU) awS480S0200000_15.l0).element = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
        }
        if (zBooleanValue) {
            C976020bVQ c976020bVQ = ((MultiMatchAnchorWidget) awS480S0200000_15.l1).LLJIJIL;
            if (c976020bVQ != null) {
                String str = (String) ((C259800zU) awS480S0200000_15.l0).element;
                EnumC962960bAM.Companion.getClass();
                c976020bVQ.LIZLLL(str, C962950bAL.LJ(enumC919170a1j));
            }
        } else {
            C975500bUa c975500bUa = ((MultiMatchAnchorWidget) awS480S0200000_15.l1).LLJI;
            if (c975500bUa != null) {
                c975500bUa.LJIJI((String) ((C259800zU) awS480S0200000_15.l0).element);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS480S0200000_15 awS480S0200000_15, Object obj, Object obj2, Object obj3) {
        InterfaceC975520bUc interfaceC975520bUcLJIIJJI;
        C976020bVQ c976020bVQ;
        String strLJJIJIIJI;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        EnumC919170a1j enumC919170a1j = (EnumC919170a1j) obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoad, new ensure callback triggered for ");
        sbLIZ.append(enumC919170a1j);
        sbLIZ.append(", isCompetition: ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(((C974210bSV) awS480S0200000_15.l0).LJFF, "full_screen")) {
            C974230bSX c974230bSX = ((C974210bSV) awS480S0200000_15.l0).LJIIIIZZ;
            if (c974230bSX.LIZIZ && enumC919170a1j.isOpenEntranceDirectInviteType()) {
                if (zBooleanValue) {
                    C976020bVQ c976020bVQ2 = ((MultiMatchAnchorWidget) awS480S0200000_15.l1).LLJIJIL;
                    if (c976020bVQ2 != null) {
                        c976020bVQ2.LJIILIIL(C974230bSX.LIZ(c974230bSX, enumC919170a1j));
                    }
                } else {
                    C975500bUa c975500bUa = ((MultiMatchAnchorWidget) awS480S0200000_15.l1).LLJI;
                    if (c975500bUa != null) {
                        C974230bSX c974230bSXLIZ = C974230bSX.LIZ(c974230bSX, enumC919170a1j);
                        InterfaceC975520bUc interfaceC975520bUcLJIIJJI2 = c975500bUa.LJIIJJI();
                        if (interfaceC975520bUcLJIIJJI2 != null) {
                            interfaceC975520bUcLJIIJJI2.i3(c974230bSXLIZ);
                        }
                    }
                }
            } else {
                if (zBooleanValue2) {
                    strLJJIJIIJI = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
                } else {
                    strLJJIJIIJI = ((C974210bSV) awS480S0200000_15.l0).LJFF;
                }
                if (zBooleanValue) {
                    C976020bVQ c976020bVQ3 = ((MultiMatchAnchorWidget) awS480S0200000_15.l1).LLJIJIL;
                    if (c976020bVQ3 != null) {
                        EnumC962960bAM.Companion.getClass();
                        c976020bVQ3.LIZLLL(strLJJIJIIJI, C962950bAL.LJ(enumC919170a1j));
                    }
                } else {
                    C975500bUa c975500bUa2 = ((MultiMatchAnchorWidget) awS480S0200000_15.l1).LLJI;
                    if (c975500bUa2 != null) {
                        c975500bUa2.LJIJI(strLJJIJIIJI);
                    }
                }
            }
        } else {
            C974230bSX c974230bSX2 = ((C974210bSV) awS480S0200000_15.l0).LJIIIIZZ;
            if (zBooleanValue) {
                if (c974230bSX2.LIZIZ && (c976020bVQ = ((MultiMatchAnchorWidget) awS480S0200000_15.l1).LLJIJIL) != null) {
                    c976020bVQ.LJIILIIL(c974230bSX2);
                }
            } else {
                C975500bUa c975500bUa3 = ((MultiMatchAnchorWidget) awS480S0200000_15.l1).LLJI;
                if (c975500bUa3 != null && (interfaceC975520bUcLJIIJJI = c975500bUa3.LJIIJJI()) != null) {
                    interfaceC975520bUcLJIIJJI.i3(c974230bSX2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS480S0200000_15 awS480S0200000_15, Object obj, Object obj2, Object obj3) {
        long followStatus;
        String strLJJJJ;
        Long lValueOf;
        Long lValueOf2;
        DataChannel dataChannel;
        InterfaceC923600a8s interfaceC923600a8s;
        User owner;
        FollowInfo followInfo;
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        Throwable th = (Throwable) obj3;
        C925710aCH c925710aCH = (C925710aCH) awS480S0200000_15.l0;
        C925770aCN c925770aCN = (C925770aCN) awS480S0200000_15.l1;
        c925710aCH.getClass();
        C915130ZvD.LIZ(th);
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        Room room = c925710aCH.LLILLL;
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 5, "api_fail", followStatus, C927600aFK.LJII(), C932290aMt.LIZ());
        AbstractC923750a97 abstractC923750a97 = c925710aCH.LLILLJJLI;
        if (abstractC923750a97 != null && (interfaceC923600a8s = (InterfaceC923600a8s) abstractC923750a97.mView) != null) {
            interfaceC923600a8s.zP(new C919700a2a(th));
        }
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILJJIL(c925770aCN)) {
            c925710aCH.LLJILJIL = false;
            if (th == null || PlaybookUtilKt.LJIIL(th) != 4004624) {
                C501540Jlg.LIZLLL(C915980Zwa.LIZJ().context(), th, 2131853452);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("throwable:");
            sbLIZ.append(th);
            C944240agA.LJFF("LinkIn_Guest_Apply_Failed", C2188811AlT.LIZIZ(sbLIZ));
        }
        c925710aCH.LLJILJIL = false;
        T t = c925710aCH.LL;
        if (t != 0) {
            ((InterfaceC925780aCO) t).zo(th);
            if (c925770aCN != null && c925770aCN.LIZJ == 4 && (dataChannel = c925710aCH.LLIZ) != null) {
                dataChannel.LC0(LinkInRoomGuestApplySucceedFromAutoEvent.class, Boolean.FALSE);
            }
            String strLJIJ = C925710aCH.LJIJ(398);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sendApplyRequest failed code=");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(" msg=");
            sbLIZ2.append(str);
            sbLIZ2.append(", from source:");
            if (c925770aCN != null) {
                strLJJJJ = C930540aK4.LJJJJ(c925770aCN.LIZJ);
            } else {
                strLJJJJ = null;
            }
            sbLIZ2.append(strLJJJJ);
            sbLIZ2.append(", roomId:");
            Room room2 = c925710aCH.LLILLL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getId());
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            sbLIZ2.append("; ownerUid:");
            Room room3 = c925710aCH.LLILLL;
            if (room3 != null) {
                lValueOf2 = Long.valueOf(room3.getOwnerUserId());
            } else {
                lValueOf2 = null;
            }
            sbLIZ2.append(lValueOf2);
            sbLIZ2.append("; type:");
            sbLIZ2.append(c925710aCH.LLIZLLLIL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("throwable:");
            sbLIZ3.append(th);
            C1AZW.LJFF(strLJIJ, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3), null);
            if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                JSONObject jSONObject = new JSONObject();
                C924630aAX c924630aAX = C924630aAX.LIZ;
                C944730agx.LJIIL(th, jSONObject);
                C0K04.LJ("cost", System.currentTimeMillis() - C924630aAX.LJII, jSONObject);
                c924630aAX.LJJJLIIL(1, "apply_failed", jSONObject, false);
                JSONObject jSONObject2 = new JSONObject();
                c924630aAX.LJIIJJI(jSONObject2, false);
                String string = UUID.randomUUID().toString();
                C0K04.LJFF("record_id", string, jSONObject2);
                C0K04.LJFF("live_type", C924630aAX.LJIIZILJ(), jSONObject2);
                C969360bKg c969360bKgLJIILLIIL = C924630aAX.LJIILLIIL();
                c969360bKgLJIILLIIL.LIZIZ(jSONObject2);
                c969360bKgLJIILLIIL.LIZJ(string, "apply_failed", jSONObject, null);
                c969360bKgLJIILLIIL.LIZ(2, string);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS480S0200000_15 awS480S0200000_15, Object obj, Object obj2, Object obj3) {
        EnumC964170bCJ enumC964170bCJY2;
        C975960bVK c975960bVKM3;
        C975990bVN c975990bVN;
        long j;
        long j2;
        InterfaceC975520bUc interfaceC975520bUc;
        DataChannel dataChannel;
        C950360aq2 c950360aq2;
        DataChannel dataChannel2;
        EnumC919170a1j enumC919170a1j = (EnumC919170a1j) obj;
        List<C954460awe> list = (List) obj2;
        List<C954460awe> list2 = (List) obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("1v1 conform ,and send, type = ");
        sbLIZ.append(enumC919170a1j);
        C20441214yg.LIZIZ("MatchStatePreparing", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = true;
        if (((EnumC975850bV9) awS480S0200000_15.l0) == EnumC975850bV9.INVITER_FROM_FRIEND_RANK && C2074808Aw.LJ() && (((C975830bV7) awS480S0200000_15.l1).LJIILJJIL() instanceof C975910bVF) && (interfaceC975520bUc = ((C975830bV7) awS480S0200000_15.l1).LIZIZ) != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null && (c950360aq2 = (C950360aq2) dataChannel.gg0(FriendRankQuickMatchInviteInfoChannel.class)) != null) {
            C20441214yg.LIZIZ("MatchStatePreparing", "friend-rank quick match confirmed (lynx), reuse CohostInviteEvent payload");
            C784440Upu.LIZ().LIZIZ(new C944610agl(c950360aq2));
            InterfaceC975520bUc interfaceC975520bUc2 = ((C975830bV7) awS480S0200000_15.l1).LIZIZ;
            if (interfaceC975520bUc2 != null && (dataChannel2 = interfaceC975520bUc2.getDataChannel()) != null) {
                dataChannel2.zW(FriendRankQuickMatchInviteInfoChannel.class, null);
            }
        } else {
            InterfaceC975520bUc interfaceC975520bUc3 = ((C975830bV7) awS480S0200000_15.l1).LIZIZ;
            if (interfaceC975520bUc3 != null) {
                enumC964170bCJY2 = interfaceC975520bUc3.Y2();
            } else {
                enumC964170bCJY2 = null;
            }
            if (enumC964170bCJY2 == EnumC964170bCJ.PREPARING) {
                InterfaceC975520bUc interfaceC975520bUc4 = ((C975830bV7) awS480S0200000_15.l1).LIZIZ;
                if (interfaceC975520bUc4 != null) {
                    interfaceC975520bUc4.k3(enumC919170a1j);
                }
                C975830bV7 c975830bV7 = (C975830bV7) awS480S0200000_15.l1;
                if (enumC919170a1j != EnumC919170a1j.MATCH_TYPE_1V1) {
                    z = false;
                }
                InterfaceC975520bUc interfaceC975520bUc5 = c975830bV7.LIZIZ;
                if (interfaceC975520bUc5 != null && (c975960bVKM3 = interfaceC975520bUc5.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
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
                C975830bV7 c975830bV72 = (C975830bV7) awS480S0200000_15.l1;
                EnumC975850bV9 enumC975850bV9 = (EnumC975850bV9) awS480S0200000_15.l0;
                if (enumC975850bV9 == null) {
                    enumC975850bV9 = EnumC975850bV9.MATCH_MODE_CONFIRM_CLICK;
                }
                C975800bV4.LJJIII(c975830bV72, null, enumC975850bV9, 3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS480S0200000_15 awS480S0200000_15, Object obj, Object obj2, Object obj3) {
        C976020bVQ c976020bVQ;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initFromCompetitionAction, ensureCallback, isCompetition = ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", isFromModeGuidePage = ");
        sbLIZ.append(zBooleanValue2);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue && (c976020bVQ = ((MultiMatchAnchorWidget) awS480S0200000_15.l0).LLJIJIL) != null) {
            c976020bVQ.LJIIL((AbstractC963510bBF) awS480S0200000_15.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS480S0200000_15 awS480S0200000_15, Object obj, Object obj2, Object obj3) {
        long followStatus;
        InterfaceC923660a8y interfaceC923660a8y;
        User owner;
        FollowInfo followInfo;
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        Throwable th = (Throwable) obj3;
        C925700aCG c925700aCG = (C925700aCG) awS480S0200000_15.l0;
        C925770aCN c925770aCN = (C925770aCN) awS480S0200000_15.l1;
        c925700aCG.getClass();
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        Room room = c925700aCG.LLILLL;
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            followStatus = followInfo.getFollowStatus();
        } else {
            followStatus = 0;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        C925600aC6.LJJIIZI(strLJIILLIIL, strLJIIJ, 5, "api_fail", followStatus, C927600aFK.LJII(), C934660aQi.LIZ());
        C923650a8x c923650a8x = c925700aCG.LLILLJJLI;
        if (c923650a8x != null && (interfaceC923660a8y = (InterfaceC923660a8y) c923650a8x.mView) != null) {
            interfaceC923660a8y.od1(new C925820aCS(th));
        }
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILJJIL(c925770aCN)) {
            c925700aCG.LLJ = false;
            C501540Jlg.LIZLLL(C915980Zwa.LIZJ().context(), th, 2131853452);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("throwable:");
            sbLIZ.append(th);
            C944240agA.LJFF("LinkIn_Guest_Apply_Failed", C2188811AlT.LIZIZ(sbLIZ));
        }
        c925700aCG.LLJ = false;
        T t = c925700aCG.LL;
        if (t != 0) {
            ((InterfaceC925780aCO) t).zo(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("code=");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(" msg=");
            sbLIZ2.append(str);
            sbLIZ2.append(" throwable:");
            sbLIZ2.append(th);
            C944240agA.LJFF("LinkIn_Guest_Apply_Failed", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return Unit.LIZ;
    }
}
