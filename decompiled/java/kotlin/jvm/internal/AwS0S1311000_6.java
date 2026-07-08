package kotlin.jvm.internal;

import X.C09AY;
import X.C0I04;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS0S1311000_6 extends C09AY implements Function1 {
    public final int $t;
    public int i5 = R.id.h05;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S1311000_6 awS0S1311000_6, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.DQ2((Fragment) awS0S1311000_6.l1, new AwS11S1210000_6((C0I04) awS0S1311000_6.l2, awS0S1311000_6.s0, awS0S1311000_6.z4, (Function0) awS0S1311000_6.l3, 0));
        assembler.RQ2((Fragment) awS0S1311000_6.l1, new AwS21S0001000_6(awS0S1311000_6.i5, 14));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1311000_6 awS0S1311000_6, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((UISlotAssem) awS0S1311000_6.l1, new AwS11S1210000_6((C0I04) awS0S1311000_6.l2, awS0S1311000_6.s0, awS0S1311000_6.z4, (Function0) awS0S1311000_6.l3, 1));
        assembler.RQ2((UISlotAssem) awS0S1311000_6.l1, new AwS21S0001000_6(awS0S1311000_6.i5, 15));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1311000_6(Fragment fragment, C0I04 c0i04, String str, Function0 function0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = fragment;
        this.l2 = c0i04;
        this.s0 = str;
        this.z4 = z;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1311000_6(UISlotAssem uISlotAssem, C0I04 c0i04, String str, AwS565S0100000_21 awS565S0100000_21, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = uISlotAssem;
        this.l2 = c0i04;
        this.s0 = str;
        this.z4 = z;
        this.l3 = awS565S0100000_21;
    }
}
