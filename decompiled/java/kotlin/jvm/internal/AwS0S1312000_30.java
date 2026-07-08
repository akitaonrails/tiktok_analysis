package kotlin.jvm.internal;

import X.C09AY;
import X.C20304714cf;
import X.C20694815yU;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AwS0S1312000_30 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public int i6;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

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

    public static final Object invoke$0(AwS0S1312000_30 awS0S1312000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20304714cf.LIZ((Context) awS0S1312000_30.l1, (C20694815yU) awS0S1312000_30.l2, (PushSettingsLoginVM) awS0S1312000_30.l3, awS0S1312000_30.z4, awS0S1312000_30.s0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1312000_30.i5 | 1), awS0S1312000_30.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1312000_30 awS0S1312000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20304714cf.LIZ((Context) awS0S1312000_30.l1, (C20694815yU) awS0S1312000_30.l2, (PushSettingsLoginVM) awS0S1312000_30.l3, awS0S1312000_30.z4, awS0S1312000_30.s0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1312000_30.i5 | 1), awS0S1312000_30.i6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1312000_30(Context context, C20694815yU c20694815yU, PushSettingsLoginVM pushSettingsLoginVM, boolean z, String str, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l1 = context;
        this.l2 = c20694815yU;
        this.l3 = pushSettingsLoginVM;
        this.z4 = z;
        this.s0 = str;
        this.i5 = i;
        this.i6 = i2;
    }
}
