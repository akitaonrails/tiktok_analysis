package kotlin.jvm.internal;

import X.C09AY;
import X.C0XVZ;
import X.C2188811AlT;
import X.C849720XVa;
import X.InterfaceC823460WSa;
import X.InterfaceC849390XTt;
import android.app.Activity;
import com.bytedance.helios.network.api.consumer.OperateHistory;
import com.bytedance.pumbaa.ruler.base.models.RuleModel;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS14S2300000_13 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS14S2300000_13 awS14S2300000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RuleEngineManger id:");
        sbLIZ.append(((InterfaceC823460WSa) awS14S2300000_13.l2).LIZ().LIZ.LIZ);
        sbLIZ.append(" uuid:");
        sbLIZ.append(((InterfaceC823460WSa) awS14S2300000_13.l2).LIZ().LJJIII);
        sbLIZ.append(" checkHitRuleModel(");
        sbLIZ.append(awS14S2300000_13.s0);
        sbLIZ.append(") target: ");
        sbLIZ.append(((OperateHistory) awS14S2300000_13.l3).target);
        sbLIZ.append(" operator: ");
        sbLIZ.append(((OperateHistory) awS14S2300000_13.l3).operator);
        sbLIZ.append(" key: ");
        sbLIZ.append(awS14S2300000_13.s1);
        sbLIZ.append('\n');
        sbLIZ.append((RuleModel) awS14S2300000_13.l4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS14S2300000_13 awS14S2300000_13) {
        IForceBindingAccountService.BindPromptConfig bindPromptConfig = (IForceBindingAccountService.BindPromptConfig) awS14S2300000_13.l2;
        if (bindPromptConfig != null) {
            Activity activity = (Activity) awS14S2300000_13.l3;
            String str = awS14S2300000_13.s0;
            String str2 = awS14S2300000_13.s1;
            InterfaceC849390XTt interfaceC849390XTt = (InterfaceC849390XTt) awS14S2300000_13.l4;
            C849720XVa c849720XVa = C849720XVa.LIZ;
            C0XVZ c0xvz = C0XVZ.SKIPPABLE_LOGOUT_PROMPT;
            c849720XVa.getClass();
            C849720XVa.LIZ(activity, bindPromptConfig, null, str, str2, c0xvz, interfaceC849390XTt);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S2300000_13(InterfaceC823460WSa interfaceC823460WSa, String str, OperateHistory operateHistory, String str2, RuleModel ruleModel, int i) {
        super(0);
        this.$t = i;
        this.l2 = interfaceC823460WSa;
        this.s0 = str;
        this.l3 = operateHistory;
        this.s1 = str2;
        this.l4 = ruleModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S2300000_13(IForceBindingAccountService.BindPromptConfig bindPromptConfig, Activity activity, String str, String str2, InterfaceC849390XTt interfaceC849390XTt, int i) {
        super(0);
        this.$t = i;
        this.l2 = bindPromptConfig;
        this.l3 = activity;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = interfaceC849390XTt;
    }
}
