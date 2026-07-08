package kotlin.jvm.internal;

import X.C03H5;
import X.C09AY;
import X.C0RPZ;
import X.C0RTA;
import X.C0RTB;
import X.C0SL3;
import X.C1163440gNi;
import X.C259800zU;
import X.C719660SKu;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS14S0401000_11 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS14S0401000_11 awS14S0401000_11, Object obj) {
        C0RTA c0rta = (C0RTA) obj;
        View viewLIZIZ = ((C0RPZ) awS14S0401000_11.l0).LIZIZ(awS14S0401000_11.i4, (ViewGroup) awS14S0401000_11.l1, (ReusedUIAssem) awS14S0401000_11.l2, (RootCellCommonAbility) awS14S0401000_11.l3);
        c0rta.LLJILJIL = viewLIZIZ;
        c0rta.LLJI = viewLIZIZ.getId();
        c0rta.LLJ = (ReusedUIContentAssem) ((ReusedUIAssem) awS14S0401000_11.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS14S0401000_11 awS14S0401000_11, Object obj) {
        C0RTA c0rta = (C0RTA) obj;
        View viewLIZIZ = ((C0RPZ) awS14S0401000_11.l0).LIZIZ(awS14S0401000_11.i4, (ViewGroup) awS14S0401000_11.l1, (ReusedUIAssem) awS14S0401000_11.l2, (RootCellCommonAbility) awS14S0401000_11.l3);
        c0rta.LLJILJIL = viewLIZIZ;
        c0rta.LLJI = viewLIZIZ.getId();
        c0rta.LLJ = (ReusedUIContentAssem) ((ReusedUIAssem) awS14S0401000_11.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS14S0401000_11 awS14S0401000_11, Object obj) {
        C0RTB c0rtb = (C0RTB) obj;
        View viewLIZIZ = ((C0RPZ) awS14S0401000_11.l0).LIZIZ(awS14S0401000_11.i4, (ViewGroup) awS14S0401000_11.l1, (ReusedUIAssem) awS14S0401000_11.l2, (RootCellCommonAbility) awS14S0401000_11.l3);
        c0rtb.LLJILJIL = viewLIZIZ;
        c0rtb.LLJI = viewLIZIZ.getId();
        c0rtb.LLJ = (ReusedUISlotAssem) ((ReusedUIAssem) awS14S0401000_11.l2);
        c0rtb.LLJIJIL = C1163440gNi.LIZLLL;
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS14S0401000_11 awS14S0401000_11, Object obj) {
        C0SL3 c0sl3 = (C0SL3) obj;
        int i = awS14S0401000_11.i4;
        float f = i / ((C719660SKu) awS14S0401000_11.l0).LJJI;
        ImageView.ScaleType scaleType = (ImageView.ScaleType) ((C259800zU) awS14S0401000_11.l1).element;
        if (scaleType == null) {
            C0SL3 c0sl32 = c0sl3.LJIIL;
            if (c0sl32 == null) {
                c0sl32 = c0sl3;
            }
            scaleType = c0sl32.LIZ;
        }
        if (c0sl3.LIZJ == i && c0sl3.LIZIZ == f && c0sl3.LIZ == scaleType && Intrinsics.LJFF(c0sl3.LJI, (Rect) awS14S0401000_11.l2)) {
            return null;
        }
        C0SL3 c0sl33 = c0sl3.LJIIL;
        if (c0sl33 == null) {
            c0sl33 = c0sl3;
        }
        return C0SL3.LIZ(c0sl3, scaleType, f, awS14S0401000_11.i4, (Rect) ((C259800zU) awS14S0401000_11.l3).element, (Rect) awS14S0401000_11.l2, c0sl33, 12200);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS14S0401000_11(int i, int i2, C719660SKu c719660SKu, C259800zU<ImageView.ScaleType> c259800zU, Rect rect, C259800zU<Rect> c259800zU2) {
        super(1);
        this.$t = c259800zU2;
        this.i4 = i;
        this.l0 = i2;
        this.l1 = c719660SKu;
        this.l2 = c259800zU;
        this.l3 = rect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS14S0401000_11(C0RPZ c0rpz, C0RPZ c0rpz2, int i, ViewGroup viewGroup, ReusedUIAssem<? extends C03H5> reusedUIAssem, RootCellCommonAbility rootCellCommonAbility) {
        super(1);
        this.$t = rootCellCommonAbility;
        this.l0 = c0rpz;
        this.i4 = c0rpz2;
        this.l1 = i;
        this.l2 = viewGroup;
        this.l3 = reusedUIAssem;
    }
}
