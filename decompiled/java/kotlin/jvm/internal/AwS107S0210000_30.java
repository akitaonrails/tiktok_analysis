package kotlin.jvm.internal;

import X.C09AY;
import X.C20134213qG;
import android.graphics.Bitmap;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AwS107S0210000_30 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS107S0210000_30 awS107S0210000_30) {
        ((Function2) awS107S0210000_30.l0).invoke((Bitmap) awS107S0210000_30.l1, Boolean.valueOf(awS107S0210000_30.z2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS107S0210000_30 awS107S0210000_30) {
        super/*X.13qA*/.LIZJ((NavBackStackEntry) awS107S0210000_30.l1, awS107S0210000_30.z2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS107S0210000_30(C20134213qG c20134213qG, NavBackStackEntry navBackStackEntry, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20134213qG;
        this.l1 = navBackStackEntry;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS107S0210000_30(Function2 function2, Function2<? super Bitmap, ? super Boolean, Unit> function22, Bitmap bitmap, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = function2;
        this.l1 = function22;
        this.z2 = bitmap;
    }
}
