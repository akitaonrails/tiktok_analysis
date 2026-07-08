package kotlin.jvm.internal;

import X.C09AY;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes25.dex */
public class AwS127S1000000_24 extends C09AY implements Function2 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS127S1000000_24(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS127S1000000_24 awS127S1000000_24, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setContentDescription(awS127S1000000_24.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS127S1000000_24 awS127S1000000_24, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setContentDescription(awS127S1000000_24.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS127S1000000_24 awS127S1000000_24, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setContentDescription(awS127S1000000_24.s0);
        return Unit.LIZ;
    }
}
