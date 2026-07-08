package kotlin.jvm.internal;

import X.C09AY;
import X.C1244380iUG;
import X.C1244390iUH;
import X.C12823050b;
import X.C1670140tYy;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import android.content.Context;
import android.view.LayoutInflater;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS1S0412000_19 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

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

    public static final Object invoke$0(AwS1S0412000_19 awS1S0412000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1670140tYy.LIZ((C12823050b) awS1S0412000_19.l0, awS1S0412000_19.z4, (Function0) awS1S0412000_19.l1, (InterfaceC1685750ty9) awS1S0412000_19.l2, (Function0) awS1S0412000_19.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS1S0412000_19.i5 | 1), awS1S0412000_19.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0412000_19 awS1S0412000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1244390iUH.LIZ((Context) awS1S0412000_19.l0, (C1244380iUG) awS1S0412000_19.l1, (PushSettingsLoginVM) awS1S0412000_19.l2, (LayoutInflater) awS1S0412000_19.l3, awS1S0412000_19.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS1S0412000_19.i5 | 1), awS1S0412000_19.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS1S0412000_19 awS1S0412000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1244390iUH.LIZ((Context) awS1S0412000_19.l0, (C1244380iUG) awS1S0412000_19.l1, (PushSettingsLoginVM) awS1S0412000_19.l2, (LayoutInflater) awS1S0412000_19.l3, awS1S0412000_19.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS1S0412000_19.i5 | 1), awS1S0412000_19.i6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S0412000_19(C12823050b c12823050b, C12823050b c12823050b2, boolean z, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function02, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c12823050b;
        this.z4 = c12823050b2;
        this.l1 = z;
        this.l2 = function0;
        this.l3 = interfaceC1685750ty9;
        this.i5 = function02;
        this.i6 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0412000_19(Context context, C1244380iUG c1244380iUG, PushSettingsLoginVM pushSettingsLoginVM, LayoutInflater layoutInflater, boolean z, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = context;
        this.l1 = c1244380iUG;
        this.l2 = pushSettingsLoginVM;
        this.l3 = layoutInflater;
        this.z4 = z;
        this.i5 = i;
        this.i6 = i2;
    }
}
