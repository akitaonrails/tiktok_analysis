package kotlin.jvm.internal;

import X.C09AY;
import X.C0EPT;
import X.C259800zU;
import X.C377390Eqv;
import X.C377730ErT;
import X.C389960FQs;
import X.InterfaceC377650ErL;
import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.effect.EffectModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS26S1201000_5 extends C09AY implements Function0 {
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
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS26S1201000_5 awS26S1201000_5) {
        ((C0EPT) awS26S1201000_5.l1).P4((EffectModel) awS26S1201000_5.l2, awS26S1201000_5.s0, awS26S1201000_5.i3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS26S1201000_5 awS26S1201000_5) {
        InterfaceC377650ErL interfaceC377650ErLC5 = ((C377730ErT) awS26S1201000_5.l1).C5();
        if (interfaceC377650ErLC5 != null) {
            interfaceC377650ErLC5.et1(awS26S1201000_5.s0, new C377390Eqv(false, true, false, false, 13));
        }
        ((C377730ErT) awS26S1201000_5.l1).L7((AIGCGenerationParam) ((C259800zU) awS26S1201000_5.l2).element, awS26S1201000_5.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS26S1201000_5 awS26S1201000_5) {
        List<INLEResourceDownloadStatusListener> list = ((C389960FQs) awS26S1201000_5.l1).LJJIJ;
        NLEResourceNode nLEResourceNode = (NLEResourceNode) awS26S1201000_5.l2;
        int i = awS26S1201000_5.i3;
        String str = awS26S1201000_5.s0;
        for (INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener : (CopyOnWriteArrayList) list) {
            if (iNLEResourceDownloadStatusListener != null) {
                iNLEResourceDownloadStatusListener.onFail(nLEResourceNode, i, str);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S1201000_5(C0EPT c0ept, EffectModel effectModel, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c0ept;
        this.l2 = effectModel;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S1201000_5(C377730ErT c377730ErT, C377730ErT c377730ErT2, String str, C259800zU<AIGCGenerationParam> c259800zU, int i) {
        super(0);
        this.$t = i;
        this.l1 = c377730ErT;
        this.s0 = c377730ErT2;
        this.l2 = str;
        this.i3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S1201000_5(C389960FQs c389960FQs, NLEResourceNode nLEResourceNode, int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c389960FQs;
        this.l2 = nLEResourceNode;
        this.i3 = i;
        this.s0 = str;
    }
}
