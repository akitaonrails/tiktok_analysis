package kotlin.jvm.internal;

import X.C09AY;
import X.C852500XcO;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS0S1120000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;
    public boolean z3;

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

    public static final Object invoke$0(AwS0S1120000_13 awS0S1120000_13, Object obj) {
        C852500XcO c852500XcO = C852500XcO.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) awS0S1120000_13.l1;
        String str = awS0S1120000_13.s0;
        c852500XcO.getClass();
        C852500XcO.LIZ(baseAccountFlowFragment, "phone", str);
        C852500XcO.LIZIZ((BaseAccountFlowFragment) awS0S1120000_13.l1, "phone", awS0S1120000_13.z2, awS0S1120000_13.z3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1120000_13 awS0S1120000_13, Object obj) {
        C852500XcO c852500XcO = C852500XcO.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) awS0S1120000_13.l1;
        String str = awS0S1120000_13.s0;
        c852500XcO.getClass();
        C852500XcO.LIZ(baseAccountFlowFragment, "email", str);
        C852500XcO.LIZIZ((BaseAccountFlowFragment) awS0S1120000_13.l1, "email", awS0S1120000_13.z2, awS0S1120000_13.z3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1120000_13(BaseAccountFlowFragment baseAccountFlowFragment, String str, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l1 = baseAccountFlowFragment;
        this.s0 = str;
        this.z2 = z;
        this.z3 = z2;
    }
}
