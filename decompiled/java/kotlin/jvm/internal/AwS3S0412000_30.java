package kotlin.jvm.internal;

import X.C09AY;
import X.C20304814cg;
import X.C20305414cm;
import X.C20694515yR;
import X.C20694615yS;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AwS3S0412000_30 extends C09AY implements Function2 {
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
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S0412000_30 awS3S0412000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20305414cm.LIZ((Context) awS3S0412000_30.l0, (C20694615yS) awS3S0412000_30.l1, (PushSettingsLoginVM) awS3S0412000_30.l2, (LayoutInflater) awS3S0412000_30.l3, awS3S0412000_30.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS3S0412000_30.i5 | 1), awS3S0412000_30.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0412000_30 awS3S0412000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20305414cm.LIZ((Context) awS3S0412000_30.l0, (C20694615yS) awS3S0412000_30.l1, (PushSettingsLoginVM) awS3S0412000_30.l2, (LayoutInflater) awS3S0412000_30.l3, awS3S0412000_30.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS3S0412000_30.i5 | 1), awS3S0412000_30.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS3S0412000_30 awS3S0412000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20304814cg.LIZ((Context) awS3S0412000_30.l0, (C20694515yR) awS3S0412000_30.l1, (PushSettingsLoginVM) awS3S0412000_30.l2, awS3S0412000_30.z4, (Activity) awS3S0412000_30.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS3S0412000_30.i5 | 1), awS3S0412000_30.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS3S0412000_30 awS3S0412000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20304814cg.LIZ((Context) awS3S0412000_30.l0, (C20694515yR) awS3S0412000_30.l1, (PushSettingsLoginVM) awS3S0412000_30.l2, awS3S0412000_30.z4, (Activity) awS3S0412000_30.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS3S0412000_30.i5 | 1), awS3S0412000_30.i6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0412000_30(Context context, C20694515yR c20694515yR, PushSettingsLoginVM pushSettingsLoginVM, boolean z, Activity activity, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = context;
        this.l1 = c20694515yR;
        this.l2 = pushSettingsLoginVM;
        this.z4 = z;
        this.l3 = activity;
        this.i5 = i;
        this.i6 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0412000_30(Context context, C20694615yS c20694615yS, PushSettingsLoginVM pushSettingsLoginVM, LayoutInflater layoutInflater, boolean z, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = context;
        this.l1 = c20694615yS;
        this.l2 = pushSettingsLoginVM;
        this.l3 = layoutInflater;
        this.z4 = z;
        this.i5 = i;
        this.i6 = i2;
    }
}
