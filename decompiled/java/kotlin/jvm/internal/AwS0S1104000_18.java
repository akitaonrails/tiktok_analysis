package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS0S1104000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public Object l1;
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

    public static final Object invoke$0(AwS0S1104000_18 awS0S1104000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement ignore item range changed source=");
        sbLIZ.append(awS0S1104000_18.s0);
        sbLIZ.append(" positionStart=");
        sbLIZ.append(awS0S1104000_18.i2);
        sbLIZ.append(" itemCount=");
        sbLIZ.append(awS0S1104000_18.i3);
        sbLIZ.append(" expectedInsertStart=");
        sbLIZ.append(awS0S1104000_18.i4);
        sbLIZ.append(" expectedInsertCount=");
        sbLIZ.append(awS0S1104000_18.i5);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS0S1104000_18.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS0S1104000_18 awS0S1104000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement ignore unrelated insert source=");
        sbLIZ.append(awS0S1104000_18.s0);
        sbLIZ.append(" positionStart=");
        sbLIZ.append(awS0S1104000_18.i2);
        sbLIZ.append(" itemCount=");
        sbLIZ.append(awS0S1104000_18.i3);
        sbLIZ.append(" expectedInsertStart=");
        sbLIZ.append(awS0S1104000_18.i4);
        sbLIZ.append(" expectedInsertCount=");
        sbLIZ.append(awS0S1104000_18.i5);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS0S1104000_18.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1104000_18(String str, String str2, int i, int i2, int i3, int i4, RavenFragment<Object> ravenFragment) {
        super(0);
        this.$t = ravenFragment;
        this.s0 = str;
        this.i2 = str2;
        this.i3 = i;
        this.i4 = i2;
        this.i5 = i3;
        this.l1 = i4;
    }
}
