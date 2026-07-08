package kotlin.jvm.internal;

import X.C09AY;
import X.EnumC930180aJU;
import X.InterfaceC921620a5g;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS9S0410000_15 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS9S0410000_15 awS9S0410000_15, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((LayoutSettingContract) awS9S0410000_15.l0).LJJIJIL(awS9S0410000_15.z4, (EnumC930180aJU) awS9S0410000_15.l1, (Function0) awS9S0410000_15.l2, (Context) awS9S0410000_15.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0410000_15 awS9S0410000_15, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((LayoutSettingContract) awS9S0410000_15.l0).LJJIJIL(awS9S0410000_15.z4, (EnumC930180aJU) awS9S0410000_15.l1, (Function0) awS9S0410000_15.l2, (Context) awS9S0410000_15.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS9S0410000_15 awS9S0410000_15, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((Fragment) awS9S0410000_15.l0, new AwS67S0210000_15(awS9S0410000_15.z4, (LiveWidget) awS9S0410000_15.l1, (InterfaceC921620a5g) awS9S0410000_15.l2, 3));
        assembler.RQ2((Fragment) awS9S0410000_15.l0, new AwS586S0100000_7((ViewGroup) awS9S0410000_15.l3, 328));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0410000_15(Fragment fragment, boolean z, LiveWidget liveWidget, InterfaceC921620a5g interfaceC921620a5g, ViewGroup viewGroup, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.z4 = z;
        this.l1 = liveWidget;
        this.l2 = interfaceC921620a5g;
        this.l3 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS9S0410000_15(LayoutSettingContract layoutSettingContract, LayoutSettingContract layoutSettingContract2, boolean z, EnumC930180aJU enumC930180aJU, Function0<Unit> function0, Context context) {
        super(1);
        this.$t = context;
        this.l0 = layoutSettingContract;
        this.z4 = layoutSettingContract2;
        this.l1 = z;
        this.l2 = enumC930180aJU;
        this.l3 = function0;
    }
}
