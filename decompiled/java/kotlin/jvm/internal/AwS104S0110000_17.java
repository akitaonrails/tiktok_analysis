package kotlin.jvm.internal;

import X.C09AY;
import X.C1081600eFi;
import X.C1109810ezD;
import X.C1109850ezH;
import X.C1114120f6A;
import X.C1118220fCm;
import X.C1131770fYd;
import X.C1138230fj3;
import X.C2188811AlT;
import X.C439101nJ;
import X.EnumC918970a1P;
import X.InterfaceC1132060fZ6;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS104S0110000_17 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS104S0110000_17 awS104S0110000_17, Object obj) {
        ((C1109850ezH) awS104S0110000_17.l0).h6((CharSequence) obj);
        ((C1109810ezD) ((C1109850ezH) awS104S0110000_17.l0).LLJJJJJIL.getValue()).LJIIL = new AwS561S0100000_17((C1109850ezH) awS104S0110000_17.l0, 29);
        ((C1109850ezH) awS104S0110000_17.l0).I5(awS104S0110000_17.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS104S0110000_17 awS104S0110000_17, Object obj) {
        C1081600eFi c1081600eFi = (C1081600eFi) obj;
        EnumC918970a1P enumC918970a1P = c1081600eFi.LIZ;
        int i = c1081600eFi.LIZIZ;
        if (!LiveGiftReceivingRefactorSetting.INSTANCE.isEnableWidget() && ((C1118220fCm) awS104S0110000_17.l0).LIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiLiveRTCLayoutChannel: type = ");
            sbLIZ.append(enumC918970a1P);
            sbLIZ.append(", guestWindowCount=");
            sbLIZ.append(i);
            C1138230fj3.LIZ("GiftDataCenterPresenter", C2188811AlT.LIZIZ(sbLIZ));
            if ((enumC918970a1P == EnumC918970a1P.FLOATING_FIX || (enumC918970a1P == EnumC918970a1P.FLOATING && i > 0)) && awS104S0110000_17.z1) {
                ((C1118220fCm) awS104S0110000_17.l0).LIZJ.b1(C439101nJ.LIZ(85));
            } else {
                ((C1118220fCm) awS104S0110000_17.l0).LIZJ.b1(0);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS104S0110000_17 awS104S0110000_17, Object obj) {
        C1081600eFi c1081600eFi = (C1081600eFi) obj;
        InterfaceC1132060fZ6 interfaceC1132060fZ6 = ((C1131770fYd) awS104S0110000_17.l0).LIZIZ;
        if (interfaceC1132060fZ6 != null) {
            interfaceC1132060fZ6.LIZJ(awS104S0110000_17.z1, c1081600eFi);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS104S0110000_17 awS104S0110000_17, Object obj) {
        ((C1114120f6A) awS104S0110000_17.l0).LLJJJJLIIL = awS104S0110000_17.z1;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS104S0110000_17 awS104S0110000_17, Object obj) {
        ((C1114120f6A) awS104S0110000_17.l0).LLJJL = awS104S0110000_17.z1;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0110000_17(C1109850ezH c1109850ezH, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1109850ezH;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0110000_17(C1114120f6A c1114120f6A, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1114120f6A;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0110000_17(C1118220fCm c1118220fCm, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1118220fCm;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0110000_17(C1131770fYd c1131770fYd, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1131770fYd;
        this.z1 = z;
    }
}
