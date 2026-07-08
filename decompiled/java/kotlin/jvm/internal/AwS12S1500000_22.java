package kotlin.jvm.internal;

import X.C09AY;
import X.C1416200mxO;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS12S1500000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
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

    public static final Object invoke$0(AwS12S1500000_22 awS12S1500000_22) {
        ((C1416200mxO) awS12S1500000_22.l1).LIZ(((NLELokiResourceProtocol) awS12S1500000_22.l2).getEffectId());
        ((C1416200mxO) awS12S1500000_22.l1).LIZIZ.put(((NLELokiResourceProtocol) awS12S1500000_22.l2).getEffectId(), (Effect) awS12S1500000_22.l3);
        NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) awS12S1500000_22.l4;
        if (nLEResourceCallback != null) {
            nLEResourceCallback.onSuccess(awS12S1500000_22.s0, ((Effect) awS12S1500000_22.l5).getUnzipPath(), false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S1500000_22 awS12S1500000_22) {
        ((C1416200mxO) awS12S1500000_22.l1).LIZ(((NLELokiResourceProtocol) awS12S1500000_22.l2).getEffectId());
        ((C1416200mxO) awS12S1500000_22.l1).LIZIZ.put(((NLELokiResourceProtocol) awS12S1500000_22.l2).getEffectId(), (Effect) awS12S1500000_22.l3);
        NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) awS12S1500000_22.l4;
        if (nLEResourceCallback != null) {
            nLEResourceCallback.onSuccess(awS12S1500000_22.s0, ((Effect) awS12S1500000_22.l5).getUnzipPath(), false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S1500000_22(C1416200mxO c1416200mxO, NLELokiResourceProtocol nLELokiResourceProtocol, Effect effect, NLEResourceCallback nLEResourceCallback, String str, Effect effect2, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1416200mxO;
        this.l2 = nLELokiResourceProtocol;
        this.l3 = effect;
        this.l4 = nLEResourceCallback;
        this.s0 = str;
        this.l5 = effect2;
    }
}
