package kotlin.jvm.internal;

import X.C0113001f;
import X.C09AY;
import X.C13BV;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C974480bSw;
import X.C975960bVK;
import X.C975970bVL;
import X.C976040bVS;
import X.C976060bVU;
import X.C976070bVV;
import X.EnumC964170bCJ;
import X.EnumC973680bRe;
import X.EnumC976420bW4;
import X.InterfaceC975520bUc;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.model.BattleFinishResult;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiBattleFinishResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS0S0111300_15 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public long j3;
    public long j4;
    public long j5;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0111300_15 awS0S0111300_15, Object obj) {
        EnumC964170bCJ enumC964170bCJY2;
        int i;
        BattleTeamResult battleTeamResult;
        EnumC973680bRe enumC973680bRe;
        Room roomInfo;
        User owner;
        Long lValueOf;
        MultiBattleFinishResponse multiBattleFinishResponse = (MultiBattleFinishResponse) obj;
        C975970bVL c975970bVL = (C975970bVL) awS0S0111300_15.l0;
        c975970bVL.LJIIL = false;
        InterfaceC975520bUc interfaceC975520bUc = c975970bVL.LIZIZ;
        if (interfaceC975520bUc == null || (enumC964170bCJY2 = interfaceC975520bUc.Y2()) == null) {
            enumC964170bCJY2 = EnumC964170bCJ.NONE;
        }
        Map<Long, BattleTeamResult> map = multiBattleFinishResponse.teamBattleResult;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finish multi, battleResult = ");
        sbLIZ.append(map);
        C20441214yg.LJIIIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        if (((C975970bVL) awS0S0111300_15.l0).LIZIZ == null) {
            C20441214yg.LJIIIZ("MultiMatchStateMatching", "dealResult, match engine already destroyed");
        } else if (enumC964170bCJY2.compareTo(EnumC964170bCJ.PUNISH_START) >= 0) {
            C20441214yg.LJIIIZ("MultiMatchStateMatching", "dealResult, Battle state is punish, return");
        } else {
            C915980Zwa.LJFF().V22(awS0S0111300_15.j3);
            C975970bVL c975970bVL2 = (C975970bVL) awS0S0111300_15.l0;
            C975960bVK c975960bVK = c975970bVL2.LJII;
            boolean z = awS0S0111300_15.z1;
            if (c975960bVK != null) {
                c975960bVK.LJIJJLI = z;
            }
            DataChannel dataChannel = null;
            Integer numValueOf = null;
            if (z) {
                Map<Long, BattleTeamResult> map2 = multiBattleFinishResponse.teamBattleResult;
                if (map2 != null) {
                    if (c975960bVK != null) {
                        lValueOf = Long.valueOf(c975960bVK.LJJJJJ());
                    } else {
                        lValueOf = null;
                    }
                    battleTeamResult = map2.get(lValueOf);
                } else {
                    battleTeamResult = null;
                }
                C975970bVL c975970bVL3 = (C975970bVL) awS0S0111300_15.l0;
                if (battleTeamResult != null) {
                    numValueOf = Integer.valueOf(battleTeamResult.result);
                }
                c975970bVL3.LJJJJI(numValueOf);
                C975970bVL c975970bVL4 = (C975970bVL) awS0S0111300_15.l0;
                long j = awS0S0111300_15.j4;
                c975970bVL4.getClass();
                Boolean boolValueOf = Boolean.valueOf(C976040bVS.LJIIZILJ(j));
                InterfaceC975520bUc interfaceC975520bUc2 = ((C975970bVL) awS0S0111300_15.l0).LIZIZ;
                if (interfaceC975520bUc2 != null && (roomInfo = interfaceC975520bUc2.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null && awS0S0111300_15.j5 == owner.getId()) {
                    enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
                } else {
                    enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
                }
                c975970bVL4.LJJJ(boolValueOf, enumC973680bRe);
                ((C975970bVL) awS0S0111300_15.l0).LJJIJ("cut_short_request", false);
            } else {
                if (map != null) {
                    InterfaceC975520bUc interfaceC975520bUc3 = c975970bVL2.LIZIZ;
                    if (interfaceC975520bUc3 != null) {
                        dataChannel = interfaceC975520bUc3.getDataChannel();
                    }
                    C975970bVL c975970bVL5 = (C975970bVL) awS0S0111300_15.l0;
                    C974480bSw.LJIL(dataChannel, map, c975970bVL5.LJIIIZ, EnumC976420bW4.HTTP_MULTI_FINISH, true, c975970bVL5.LJIILIIL);
                }
                C975960bVK c975960bVK2 = ((C975970bVL) awS0S0111300_15.l0).LJII;
                if (c975960bVK2 != null) {
                    c975960bVK2.LJJIJIIJI = multiBattleFinishResponse.battleComboV2;
                }
                ArrayList arrayList = new ArrayList();
                Map<Long, BattleTeamUserArmies> map3 = multiBattleFinishResponse.teamArmies;
                if (map3 != null) {
                    Iterator<Map.Entry<Long, BattleTeamUserArmies>> it2 = map3.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getValue());
                    }
                }
                C976060bVU.LIZIZ((C975970bVL) awS0S0111300_15.l0, arrayList, C2097608Jq.LJ(), 0L, 0L, true, 12);
                C975970bVL c975970bVL6 = (C975970bVL) awS0S0111300_15.l0;
                int i2 = awS0S0111300_15.i2;
                long j2 = awS0S0111300_15.j5;
                BattleSetting battleSetting = multiBattleFinishResponse.battleSettings;
                if (battleSetting != null) {
                    i = battleSetting.status;
                } else {
                    i = 2;
                }
                C976070bVV.LIZ(c975970bVL6, i2, map, j2, i, awS0S0111300_15.j4);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0111300_15 awS0S0111300_15, Object obj) {
        EnumC964170bCJ enumC964170bCJY2;
        Map<Long, BattleResult> map;
        Map<Long, BattleUserArmies> mapLJ;
        int i;
        BattleSetting battleSetting;
        BattleResult battleResult;
        EnumC973680bRe enumC973680bRe;
        Room roomInfo;
        User owner;
        Map<Long, BattleResult> map2;
        Long lValueOf;
        Map<Long, BattleComboInfo> map3;
        BattleFinishResult.ResponseData responseData = (BattleFinishResult.ResponseData) obj;
        C975970bVL c975970bVL = (C975970bVL) awS0S0111300_15.l0;
        c975970bVL.LJIIL = false;
        InterfaceC975520bUc interfaceC975520bUc = c975970bVL.LIZIZ;
        if (interfaceC975520bUc == null || (enumC964170bCJY2 = interfaceC975520bUc.Y2()) == null) {
            enumC964170bCJY2 = EnumC964170bCJ.NONE;
        }
        DataChannel dataChannel = null;
        Integer numValueOf = null;
        if (responseData != null) {
            map = responseData.battleResult;
        } else {
            map = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finish 1v1, battleResult = ");
        sbLIZ.append(map);
        C20441214yg.LJIIIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        if (((C975970bVL) awS0S0111300_15.l0).LIZIZ == null) {
            C20441214yg.LJIIIZ("MultiMatchStateMatching", "dealResult, match engine already destroyed");
        } else if (enumC964170bCJY2.compareTo(EnumC964170bCJ.PUNISH_START) >= 0) {
            C20441214yg.LJIIIZ("MultiMatchStateMatching", "dealResult, Battle state is punish, return");
        } else {
            C915980Zwa.LJFF().V22(awS0S0111300_15.j3);
            C975960bVK c975960bVK = ((C975970bVL) awS0S0111300_15.l0).LJII;
            boolean z = awS0S0111300_15.z1;
            if (c975960bVK != null) {
                c975960bVK.LJIJJLI = z;
                if (responseData != null) {
                    map3 = responseData.battleComboV2;
                } else {
                    map3 = null;
                }
                c975960bVK.LJJIJIIJI = map3;
            }
            if (z) {
                if (responseData != null && (map2 = responseData.battleResult) != null) {
                    if (c975960bVK != null) {
                        lValueOf = Long.valueOf(c975960bVK.LJJJJJ());
                    } else {
                        lValueOf = null;
                    }
                    battleResult = map2.get(lValueOf);
                } else {
                    battleResult = null;
                }
                C975970bVL c975970bVL2 = (C975970bVL) awS0S0111300_15.l0;
                if (battleResult != null) {
                    numValueOf = Integer.valueOf(battleResult.result);
                }
                c975970bVL2.LJJJJI(numValueOf);
                C975970bVL c975970bVL3 = (C975970bVL) awS0S0111300_15.l0;
                long j = awS0S0111300_15.j4;
                c975970bVL3.getClass();
                Boolean boolValueOf = Boolean.valueOf(C976040bVS.LJIIZILJ(j));
                InterfaceC975520bUc interfaceC975520bUc2 = ((C975970bVL) awS0S0111300_15.l0).LIZIZ;
                if (interfaceC975520bUc2 != null && (roomInfo = interfaceC975520bUc2.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null && awS0S0111300_15.j5 == owner.getId()) {
                    enumC973680bRe = EnumC973680bRe.POSITIVE_OVER;
                } else {
                    enumC973680bRe = EnumC973680bRe.NEGATIVE_OVER;
                }
                c975970bVL3.LJJJ(boolValueOf, enumC973680bRe);
                ((C975970bVL) awS0S0111300_15.l0).LJJIJ("cut_short_request", false);
            } else {
                Map<Long, BattleTeamResult> mapLIZ = C0113001f.LIZ(map);
                if (map != null) {
                    InterfaceC975520bUc interfaceC975520bUc3 = ((C975970bVL) awS0S0111300_15.l0).LIZIZ;
                    if (interfaceC975520bUc3 != null) {
                        dataChannel = interfaceC975520bUc3.getDataChannel();
                    }
                    C975970bVL c975970bVL4 = (C975970bVL) awS0S0111300_15.l0;
                    C974480bSw.LJIL(dataChannel, mapLIZ, c975970bVL4.LJIIIZ, EnumC976420bW4.HTTP_FINISH, true, c975970bVL4.LJIILIIL);
                }
                C975970bVL c975970bVL5 = (C975970bVL) awS0S0111300_15.l0;
                C13BV c13bv = C13BV.INSTANCE;
                if (responseData == null || (mapLJ = responseData.armies) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                C976060bVU.LIZIZ(c975970bVL5, c13bv, mapLJ, 0L, 0L, true, 12);
                C975970bVL c975970bVL6 = (C975970bVL) awS0S0111300_15.l0;
                int i2 = awS0S0111300_15.i2;
                long j2 = awS0S0111300_15.j5;
                if (responseData != null && (battleSetting = responseData.battleSettings) != null) {
                    i = battleSetting.status;
                } else {
                    i = 2;
                }
                C976070bVV.LIZ(c975970bVL6, i2, mapLIZ, j2, i, awS0S0111300_15.j4);
            }
            C20441214yg.LIZIZ("MultiMatchStateMatching", "finish, success, callback");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0111300_15(C975970bVL c975970bVL, long j, boolean z, long j2, long j3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c975970bVL;
        this.j3 = j;
        this.z1 = z;
        this.j4 = j2;
        this.j5 = j3;
        this.i2 = i;
    }
}
