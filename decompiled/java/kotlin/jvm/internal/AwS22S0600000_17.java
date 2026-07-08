package kotlin.jvm.internal;

import X.AbstractC1110790f0n;
import X.C09AY;
import X.C1113510f5B;
import X.C1113680f5S;
import X.C1114030f61;
import X.C1114050f63;
import X.EnumC1110950f13;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class AwS22S0600000_17 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS22S0600000_17 awS22S0600000_17) {
        ((C1114030f61) awS22S0600000_17.l0).LIZIZ((C1114050f63) awS22S0600000_17.l1, (C1113680f5S) awS22S0600000_17.l2);
        Function2 function2 = (Function2) awS22S0600000_17.l3;
        if (function2 != null) {
            function2.invoke(((PublicAreaMessageCommon.OperationState) awS22S0600000_17.l4).scene, (EnumC1110950f13) awS22S0600000_17.l5);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S0600000_17 awS22S0600000_17) {
        ((C1114030f61) awS22S0600000_17.l0).LIZIZ((C1114050f63) awS22S0600000_17.l1, (C1113680f5S) awS22S0600000_17.l2);
        Function2 function2 = (Function2) awS22S0600000_17.l3;
        if (function2 != null) {
            function2.invoke(((PublicAreaMessageCommon.OperationState) awS22S0600000_17.l4).scene, (EnumC1110950f13) awS22S0600000_17.l5);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS22S0600000_17 awS22S0600000_17) {
        ((C1113510f5B) awS22S0600000_17.l0).LJIIJ((AbstractC1110790f0n) awS22S0600000_17.l1, (List) awS22S0600000_17.l2, (List) awS22S0600000_17.l3, (List) awS22S0600000_17.l4, (Map) awS22S0600000_17.l5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS22S0600000_17(C1113510f5B c1113510f5B, C1113510f5B c1113510f5B2, AbstractC1110790f0n abstractC1110790f0n, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list2, List<Integer> list3, Map<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem, String> map) {
        super(0);
        this.$t = map;
        this.l0 = c1113510f5B;
        this.l1 = c1113510f5B2;
        this.l2 = abstractC1110790f0n;
        this.l3 = list;
        this.l4 = list2;
        this.l5 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS22S0600000_17(C1114030f61 c1114030f61, C1114030f61 c1114030f612, C1114050f63 c1114050f63, C1113680f5S c1113680f5S, Function2<? super String, ? super EnumC1110950f13, Unit> function2, PublicAreaMessageCommon.OperationState operationState, EnumC1110950f13 enumC1110950f13) {
        super(0);
        this.$t = enumC1110950f13;
        this.l0 = c1114030f61;
        this.l1 = c1114030f612;
        this.l2 = c1114050f63;
        this.l3 = c1113680f5S;
        this.l4 = function2;
        this.l5 = operationState;
    }
}
