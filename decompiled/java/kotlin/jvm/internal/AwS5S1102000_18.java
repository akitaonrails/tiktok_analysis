package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS5S1102000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S1102000_18 awS5S1102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumePendingPreLoadContinuation source=");
        sbLIZ.append(awS5S1102000_18.s0);
        sbLIZ.append(" cursor=");
        sbLIZ.append(awS5S1102000_18.i2);
        sbLIZ.append(" next=");
        sbLIZ.append(awS5S1102000_18.i3);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS5S1102000_18.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS5S1102000_18 awS5S1102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerPreLoadMore skip reason=");
        sbLIZ.append(awS5S1102000_18.s0);
        sbLIZ.append(" count=");
        sbLIZ.append(awS5S1102000_18.i2);
        sbLIZ.append(" expectedItemCount=");
        sbLIZ.append(awS5S1102000_18.i3);
        sbLIZ.append(" supplementAwaitGate ");
        sbLIZ.append(((RavenFragment) awS5S1102000_18.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS5S1102000_18 awS5S1102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement defer body visibility source=");
        sbLIZ.append(awS5S1102000_18.s0);
        sbLIZ.append(" expectedInsertStart=");
        sbLIZ.append(awS5S1102000_18.i2);
        sbLIZ.append(" expectedInsertCount=");
        sbLIZ.append(awS5S1102000_18.i3);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS5S1102000_18.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS5S1102000_18 awS5S1102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS5S1102000_18.s0);
        sbLIZ.append(" complete, finish first fetch supplement, cursor=");
        sbLIZ.append(awS5S1102000_18.i2);
        sbLIZ.append(" next=");
        sbLIZ.append(awS5S1102000_18.i3);
        sbLIZ.append(" data.size=");
        sbLIZ.append(((List) awS5S1102000_18.l1).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS5S1102000_18 awS5S1102000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS5S1102000_18.s0);
        sbLIZ.append(" complete, finish first fetch supplement with page complete, cursor=");
        sbLIZ.append(awS5S1102000_18.i2);
        sbLIZ.append(" next=");
        sbLIZ.append(awS5S1102000_18.i3);
        sbLIZ.append(" data.size=");
        sbLIZ.append(((List) awS5S1102000_18.l1).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1102000_18(int i, int i2, RavenFragment ravenFragment, int i3) {
        super(0);
        this.$t = i3;
        this.s0 = "preload retry";
        this.i2 = i;
        this.i3 = i2;
        this.l1 = ravenFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S1102000_18(String str, String str2, int i, int i2, RavenFragment<CONTEXT> ravenFragment) {
        super(0);
        this.$t = ravenFragment;
        this.s0 = str;
        this.i2 = str2;
        this.i3 = i;
        this.l1 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S1102000_18(String str, String str2, int i, int i2, List<? extends InterfaceC1891350zJl> list) {
        super(0);
        this.$t = list;
        this.s0 = str;
        this.i2 = str2;
        this.i3 = i;
        this.l1 = i2;
    }
}
