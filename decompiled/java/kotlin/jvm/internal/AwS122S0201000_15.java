package kotlin.jvm.internal;

import X.C09AY;
import X.C1058250de3;
import X.C1669850tYV;
import X.C1672240tcM;
import X.C1672250tcN;
import X.C20441214yg;
import X.C2188811AlT;
import X.C341440Da2;
import X.C970410bMN;
import X.C970530bMZ;
import X.C980430bcX;
import X.EnumC919170a1j;
import X.InterfaceC1680500tpg;
import com.bytedance.android.live.liveinteract.matchv2.connection.matchoption.MatchOptionViewModel;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS122S0201000_15 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS122S0201000_15 awS122S0201000_15, Object obj, Object obj2) {
        BattleInfoResponse battleInfoResponse = (BattleInfoResponse) obj;
        int iIntValue = ((Number) obj2).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchSeiEntrance");
        sbLIZ.append(": sei_audience_competition Dispatch match SEI entrance success,matchType = ");
        sbLIZ.append(awS122S0201000_15.i2);
        sbLIZ.append(", validatedBattleInfo=");
        sbLIZ.append(C1058250de3.LIZLLL(battleInfoResponse));
        C20441214yg.LIZIZ("CompetitionAudienceLauncher", C2188811AlT.LIZIZ(sbLIZ));
        ((C970530bMZ) awS122S0201000_15.l0).LIZ.invoke(new C970410bMN((EnumC919170a1j) awS122S0201000_15.l1, battleInfoResponse, iIntValue));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS122S0201000_15 awS122S0201000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1672240tcM.LIZ((UpRightIconViewModel) awS122S0201000_15.l0, (C1672250tcN) awS122S0201000_15.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS122S0201000_15.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS122S0201000_15 awS122S0201000_15, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669850tYV.LJII((MatchOptionViewModel) awS122S0201000_15.l0, (C980430bcX) awS122S0201000_15.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS122S0201000_15.i2 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0201000_15(int i, C970530bMZ c970530bMZ, EnumC919170a1j enumC919170a1j, int i2) {
        super(2);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c970530bMZ;
        this.l1 = enumC919170a1j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0201000_15(MatchOptionViewModel matchOptionViewModel, C980430bcX c980430bcX, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = matchOptionViewModel;
        this.l1 = c980430bcX;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS122S0201000_15(UpRightIconViewModel upRightIconViewModel, C1672250tcN c1672250tcN, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = upRightIconViewModel;
        this.l1 = c1672250tcN;
        this.i2 = i;
    }
}
