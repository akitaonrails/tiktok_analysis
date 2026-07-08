package kotlin.jvm.internal;

import X.C09AY;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public class AwS126S1000000_21 extends C09AY implements Function2 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S1000000_21(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS126S1000000_21 awS126S1000000_21, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setContentDescription(awS126S1000000_21.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS126S1000000_21 awS126S1000000_21, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setContentDescription(awS126S1000000_21.s0);
        return Unit.LIZ;
    }
}
