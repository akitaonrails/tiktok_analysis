package kotlin.jvm.internal;

import X.C09AY;
import X.C0NOA;
import X.C1909107dp;
import X.C2188811AlT;
import X.C606280NqE;
import X.InterfaceC606300NqG;
import X.InterfaceC634840OvC;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS27S1201000_9 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AwS27S1201000_9 awS27S1201000_9) {
        String containerID;
        CompletionBlock completionBlock = (CompletionBlock) awS27S1201000_9.l1;
        InterfaceC634840OvC interfaceC634840OvC = ((C606280NqE) awS27S1201000_9.l2).IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC606300NqG.class, containerID);
        int i = awS27S1201000_9.i3;
        String str = awS27S1201000_9.s0;
        InterfaceC606300NqG interfaceC606300NqG = (InterfaceC606300NqG) xBaseModelLIZJ;
        interfaceC606300NqG.setCode(Integer.valueOf(i));
        interfaceC606300NqG.setMsg(str);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS27S1201000_9 awS27S1201000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C0NOA) awS27S1201000_9.l1).LIZ);
        sbLIZ.append(" callback: (code: ");
        sbLIZ.append(awS27S1201000_9.i3);
        sbLIZ.append("), (msg: ");
        sbLIZ.append(awS27S1201000_9.s0);
        sbLIZ.append("), (result: ");
        sbLIZ.append((Map) awS27S1201000_9.l2);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS27S1201000_9(C0NOA c0noa, C0NOA c0noa2, int i, String str, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l1 = c0noa;
        this.i3 = c0noa2;
        this.s0 = i;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS27S1201000_9(CompletionBlock completionBlock, CompletionBlock<InterfaceC606300NqG> completionBlock2, C606280NqE c606280NqE, int i, String str) {
        super(0);
        this.$t = str;
        this.l1 = completionBlock;
        this.l2 = completionBlock2;
        this.i3 = c606280NqE;
        this.s0 = i;
    }
}
