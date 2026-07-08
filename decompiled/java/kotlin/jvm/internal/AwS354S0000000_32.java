package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import X.InterfaceC21503119Dh;
import android.app.Activity;
import android.os.Bundle;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public class AwS354S0000000_32 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS354S0000000_32(Bundle bundle, int i) {
        super(3);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS354S0000000_32(Activity activity, int i, int i2) {
        super(3);
        this.$t = i2;
    }

    public static final Object invoke$0(AwS354S0000000_32 awS354S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJJJIZL();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS354S0000000_32 awS354S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJJJJL();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS354S0000000_32 awS354S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJ();
        return Unit.LIZ;
    }
}
