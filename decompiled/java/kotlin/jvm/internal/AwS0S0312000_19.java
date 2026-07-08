package kotlin.jvm.internal;

import X.C09AY;
import X.C1244180iTw;
import X.C1244220iU0;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS0S0312000_19 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS0S0312000_19 awS0S0312000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1244180iTw.LIZ((Context) awS0S0312000_19.l0, (C1244220iU0) awS0S0312000_19.l1, (PushSettingsLoginVM) awS0S0312000_19.l2, awS0S0312000_19.z3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0312000_19.i4 | 1), awS0S0312000_19.i5);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0312000_19 awS0S0312000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1244180iTw.LIZ((Context) awS0S0312000_19.l0, (C1244220iU0) awS0S0312000_19.l1, (PushSettingsLoginVM) awS0S0312000_19.l2, awS0S0312000_19.z3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0312000_19.i4 | 1), awS0S0312000_19.i5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0312000_19(Context context, C1244220iU0 c1244220iU0, PushSettingsLoginVM pushSettingsLoginVM, boolean z, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = context;
        this.l1 = c1244220iU0;
        this.l2 = pushSettingsLoginVM;
        this.z3 = z;
        this.i4 = i;
        this.i5 = i2;
    }
}
