package kotlin.jvm.internal;

import X.C09AY;
import X.C11IE;
import X.C953610avH;
import X.EnumC930180aJU;
import X.InterfaceC19483011Ki;
import Y.AfS7S0401000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.LayoutState;

/* JADX INFO: loaded from: classes16.dex */
public class AwS21S0401000_15 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS21S0401000_15 awS21S0401000_15) {
        ((LayoutSettingContract) awS21S0401000_15.l0).LJJIJIIJIL(awS21S0401000_15.i4, (Function0) awS21S0401000_15.l1, (Function0) awS21S0401000_15.l3, (Function1) awS21S0401000_15.l2, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S0401000_15 awS21S0401000_15) {
        ((LayoutSettingContract) awS21S0401000_15.l0).LJJIJIIJI((EnumC930180aJU) awS21S0401000_15.l1, (Integer) awS21S0401000_15.l2, (Integer) awS21S0401000_15.l3, awS21S0401000_15.i4, true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S0401000_15 awS21S0401000_15) {
        ((LayoutSettingContract) awS21S0401000_15.l0).LJJIJIIJIL(awS21S0401000_15.i4, (Function0) awS21S0401000_15.l1, (Function0) awS21S0401000_15.l3, (Function1) awS21S0401000_15.l2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS21S0401000_15 awS21S0401000_15) {
        C953610avH.LJJI.getClass();
        ((LayoutSettingContract) awS21S0401000_15.l0).compositeDisposable.LIZ(new C11IE(C953610avH.LJJIII.LJJIL(new InterfaceC19483011Ki() { // from class: X.08Bk
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((String) obj).length() == 0) {
                    return true;
                }
                return false;
            }
        })).LJIILLIIL(new AfS7S0401000_15((LayoutSettingContract) awS21S0401000_15.l0, awS21S0401000_15.i4, (Function0) awS21S0401000_15.l1, (Function1) awS21S0401000_15.l2, (Function0) awS21S0401000_15.l3, 3)));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS21S0401000_15 awS21S0401000_15) {
        ((LayoutSettingContract) awS21S0401000_15.l0).LJJJJL(awS21S0401000_15.i4, (Function0) awS21S0401000_15.l1, (Function1) awS21S0401000_15.l2, (Function0) awS21S0401000_15.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS21S0401000_15(LayoutSettingContract layoutSettingContract, LayoutSettingContract layoutSettingContract2, int i, Function0<Unit> function0, Function1<? super LayoutState, Unit> function1, Function0<Unit> function02) {
        super(0);
        this.$t = function02;
        this.l0 = layoutSettingContract;
        this.i4 = layoutSettingContract2;
        this.l1 = i;
        this.l2 = function0;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S0401000_15(LayoutSettingContract layoutSettingContract, EnumC930180aJU enumC930180aJU, Integer num, Integer num2, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = layoutSettingContract;
        this.l1 = enumC930180aJU;
        this.l2 = num;
        this.l3 = num2;
        this.i4 = i;
    }
}
