package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC2217701Bqy;
import X.InterfaceC2217711Bqz;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes35.dex */
public class AwS50S0102000_34 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final Object invoke$0(AwS50S0102000_34 awS50S0102000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).onActivityResult(awS50S0102000_34.i1, awS50S0102000_34.i2, (Intent) awS50S0102000_34.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS50S0102000_34 awS50S0102000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).onActivityResult(awS50S0102000_34.i1, awS50S0102000_34.i2, (Intent) awS50S0102000_34.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0102000_34(int i, int i2, Intent intent, int i3) {
        super(2);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = intent;
    }
}
