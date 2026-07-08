package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C349670DnJ;
import X.C349800DnW;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS14S0200001_5 extends C09AY implements Function0 {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS14S0200001_5 awS14S0200001_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("3.apply to normal speed ");
        sbLIZ.append(((NLESegmentVideo) awS14S0200001_5.l0).getAbsSpeed());
        sbLIZ.append(" scale ");
        sbLIZ.append(awS14S0200001_5.f2);
        sbLIZ.append(" \n ");
        sbLIZ.append(C349670DnJ.LIZ((List) awS14S0200001_5.l1));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS14S0200001_5 awS14S0200001_5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("2.reset from normal speed ");
        sbLIZ.append(((NLESegmentVideo) awS14S0200001_5.l0).getAbsSpeed());
        sbLIZ.append(" scale ");
        sbLIZ.append(awS14S0200001_5.f2);
        sbLIZ.append(" \n ");
        sbLIZ.append(C349670DnJ.LIZ((List) awS14S0200001_5.l1));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS14S0200001_5(NLESegmentVideo nLESegmentVideo, NLESegmentVideo nLESegmentVideo2, float f, List<C349800DnW> list) {
        super(0);
        this.$t = list;
        this.l0 = nLESegmentVideo;
        this.f2 = nLESegmentVideo2;
        this.l1 = f;
    }
}
