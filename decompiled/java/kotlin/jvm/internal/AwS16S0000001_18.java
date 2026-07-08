package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS16S0000001_18 extends C09AY implements Function0 {
    public final int $t;
    public float f0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S0000001_18 awS16S0000001_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDragEnd ");
        sbLIZ.append(awS16S0000001_18.f0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS16S0000001_18 awS16S0000001_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("extra video task, progress: ");
        sbLIZ.append(awS16S0000001_18.f0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS16S0000001_18 awS16S0000001_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add watermark with source video task, progress: ");
        sbLIZ.append(awS16S0000001_18.f0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS16S0000001_18 awS16S0000001_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("titleAlpha:");
        sbLIZ.append(awS16S0000001_18.f0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S0000001_18(float f, int i) {
        super(0);
        this.$t = i;
        this.f0 = f;
    }
}
