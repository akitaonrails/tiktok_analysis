package kotlin.jvm.internal;

import X.C09AY;
import X.C0ITC;
import X.C0KCX;
import X.C0KHS;
import X.C0SZ4;
import X.C1163440gNi;
import X.C118300cf;
import X.C19323610io;
import X.C483830IyD;
import com.bytedance.android.livesdk.liveroom.InnerFlowHotRefreshController;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public class AwS115S0101000_7 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS115S0101000_7 awS115S0101000_7, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        ((InnerFlowHotRefreshController) awS115S0101000_7.l0).reportInnerHotRefresh(2, awS115S0101000_7.i1, iIntValue);
        if (iIntValue == 8) {
            ((InnerFlowHotRefreshController) awS115S0101000_7.l0).markExecuted(C0ITC.FEED_TIMEOUT);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS115S0101000_7 awS115S0101000_7, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        ((InnerFlowHotRefreshController) awS115S0101000_7.l0).reportInnerHotRefresh(2, awS115S0101000_7.i1, iIntValue);
        if (iIntValue == 8) {
            ((InnerFlowHotRefreshController) awS115S0101000_7.l0).markExecuted(C0ITC.APP_RETURN_FOREGROUND);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS115S0101000_7 awS115S0101000_7, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        ((InnerFlowHotRefreshController) awS115S0101000_7.l0).reportInnerHotRefresh(2, awS115S0101000_7.i1, iIntValue);
        if (iIntValue == 8) {
            ((InnerFlowHotRefreshController) awS115S0101000_7.l0).markExecuted(C0ITC.NEGATIVE_SIGNAL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS115S0101000_7 awS115S0101000_7, Object obj) {
        BaMessageSettingActivity baMessageSettingActivity = (BaMessageSettingActivity) awS115S0101000_7.l0;
        return C19323610io.LJJIJL((C19323610io) obj, baMessageSettingActivity.LLLLZI(new C483830IyD(baMessageSettingActivity.LLJJIJI, awS115S0101000_7.i1)), null, false, null, null, false, false, null, false, false, null, false, false, 16777214);
    }

    public static final Object invoke$4(AwS115S0101000_7 awS115S0101000_7, Object obj) {
        C118300cf c118300cf = (C118300cf) awS115S0101000_7.l0;
        int i = c118300cf.element + 1;
        c118300cf.element = i;
        int i2 = awS115S0101000_7.i1;
        String value = ((MatchResult) obj).getValue();
        if (i > i2) {
            return u.LJJIFFI(value, "%", "%%", false);
        }
        return value;
    }

    public static final Object invoke$5(AwS115S0101000_7 awS115S0101000_7, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = ((C0KCX) awS115S0101000_7.l0).getType();
        c0sz4.LLIZLLLIL = awS115S0101000_7.i1;
        C1163440gNi c1163440gNiLIZIZ = ((C0KCX) awS115S0101000_7.l0).LIZIZ();
        if (c1163440gNiLIZIZ == null) {
            c1163440gNiLIZIZ = C1163440gNi.LIZ;
        }
        c0sz4.LLJIJIL = c1163440gNiLIZIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS115S0101000_7 awS115S0101000_7, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = ((C0KHS) awS115S0101000_7.l0).getType();
        c0sz4.LLIZLLLIL = awS115S0101000_7.i1;
        C1163440gNi c1163440gNiLIZIZ = ((C0KHS) awS115S0101000_7.l0).LIZIZ();
        if (c1163440gNiLIZIZ == null) {
            c1163440gNiLIZIZ = C1163440gNi.LIZ;
        }
        c0sz4.LLJIJIL = c1163440gNiLIZIZ;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0101000_7(int i, C118300cf c118300cf, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c118300cf;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0101000_7(C0KCX c0kcx, C0KCX<Enum<Object>> c0kcx2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0kcx;
        this.i1 = c0kcx2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS115S0101000_7(C0KHS c0khs, C0KHS<Enum<Object>> c0khs2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0khs;
        this.i1 = c0khs2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0101000_7(InnerFlowHotRefreshController innerFlowHotRefreshController, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = innerFlowHotRefreshController;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S0101000_7(BaMessageSettingActivity baMessageSettingActivity, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = baMessageSettingActivity;
        this.i1 = i;
    }
}
