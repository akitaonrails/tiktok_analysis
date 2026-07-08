package kotlin.jvm.internal;

import X.C09AY;
import X.C0SFO;
import X.C0SFR;
import X.C2188811AlT;
import X.C259800zU;
import android.text.Layout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS0S2103000_11 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS0S2103000_11 awS0S2103000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryEllipsisWithHashTagTruncated line [");
        sbLIZ.append(awS0S2103000_11.s0);
        sbLIZ.append("] from ");
        sbLIZ.append(awS0S2103000_11.s1);
        sbLIZ.append(' ');
        sbLIZ.append(awS0S2103000_11.i3);
        sbLIZ.append('/');
        sbLIZ.append(((Layout) ((C259800zU) awS0S2103000_11.l2).element).getLineCount());
        sbLIZ.append(" [");
        sbLIZ.append(awS0S2103000_11.i4);
        sbLIZ.append(", ");
        sbLIZ.append(awS0S2103000_11.i5);
        sbLIZ.append("] content: ");
        C0SFO c0sfo = C0SFR.LIZ;
        sbLIZ.append(C0SFR.LIZIZ(awS0S2103000_11.i3, (Layout) ((C259800zU) awS0S2103000_11.l2).element));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS0S2103000_11 awS0S2103000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeLatestEllipsis [");
        sbLIZ.append(awS0S2103000_11.s0);
        sbLIZ.append("] from ");
        sbLIZ.append(awS0S2103000_11.s1);
        sbLIZ.append(' ');
        sbLIZ.append(awS0S2103000_11.i3);
        sbLIZ.append('/');
        sbLIZ.append(((Layout) ((C259800zU) awS0S2103000_11.l2).element).getLineCount());
        sbLIZ.append(" [");
        sbLIZ.append(awS0S2103000_11.i4);
        sbLIZ.append(", ");
        sbLIZ.append(awS0S2103000_11.i5);
        sbLIZ.append("] content: ");
        C0SFO c0sfo = C0SFR.LIZ;
        sbLIZ.append(C0SFR.LIZIZ(awS0S2103000_11.i3, (Layout) ((C259800zU) awS0S2103000_11.l2).element));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S2103000_11(String str, String str2, String str3, int i, C259800zU<Layout> c259800zU, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.s0 = str;
        this.s1 = str2;
        this.i3 = str3;
        this.l2 = i;
        this.i4 = c259800zU;
        this.i5 = i2;
    }
}
