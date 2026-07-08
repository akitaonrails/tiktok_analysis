package kotlin.jvm.internal;

import X.AbstractC551020LjI;
import X.C09AY;
import X.C550580Lia;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowArchConfig;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS51S2100000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
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

    public static final Object invoke$0(AwS51S2100000_8 awS51S2100000_8) {
        IAVProcessService.IProcessCallback iProcessCallback = (IAVProcessService.IProcessCallback) awS51S2100000_8.l2;
        if (iProcessCallback != null) {
            iProcessCallback.finish(Integer.valueOf(VEUtils.extractVideo(awS51S2100000_8.s0, awS51S2100000_8.s1)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS51S2100000_8 awS51S2100000_8) {
        return new AIGCWorkflowConfig(new AIGCWorkflowArchConfig(((AbstractC551020LjI) awS51S2100000_8.l2).LIZLLL().getSource(), awS51S2100000_8.s0, awS51S2100000_8.s1, null, ((C550580Lia) ((AbstractC551020LjI) awS51S2100000_8.l2).LIZ()).LIZIZ), null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS51S2100000_8(AbstractC551020LjI abstractC551020LjI, AbstractC551020LjI<C550580Lia<Object>> abstractC551020LjI2, String str, String str2) {
        super(0);
        this.$t = str2;
        this.l2 = abstractC551020LjI;
        this.s0 = abstractC551020LjI2;
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S2100000_8(String str, String str2, IAVProcessService.IProcessCallback iProcessCallback, int i) {
        super(0);
        this.$t = i;
        this.l2 = iProcessCallback;
        this.s0 = str;
        this.s1 = str2;
    }
}
