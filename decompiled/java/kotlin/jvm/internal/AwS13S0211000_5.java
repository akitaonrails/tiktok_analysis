package kotlin.jvm.internal;

import X.C09AY;
import X.C0E48;
import X.C1397620mTQ;
import X.C351220Dpo;
import X.C357700E0q;
import X.C377270Eqj;
import X.C377280Eqk;
import X.C377400Eqw;
import X.EnumC356070Dxd;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS13S0211000_5 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS13S0211000_5 awS13S0211000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C357700E0q c357700E0q = (C357700E0q) awS13S0211000_5.l0;
        boolean z = awS13S0211000_5.z2;
        c1397620mTQ.LJFF(R.string.effect_tool_templateadd_confirm, new AwS13S0211000_5(awS13S0211000_5.i3, c357700E0q, (ResourceItem) awS13S0211000_5.l1, z, 1));
        c1397620mTQ.LJII(2131833383, AFwS234S0000000_5.get$arr$(166));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS13S0211000_5 awS13S0211000_5, Object obj) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = ((C357700E0q) awS13S0211000_5.l0).U5().LIZIZ;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null && C351220Dpo.LLIZLLLIL(nLETrackSlotLLLLLLIL)) {
            c0e48.LLFII().LJJZ(nLETrackSlotLLLLLLIL, EnumC356070Dxd.COMMIT, null);
        }
        ((C357700E0q) awS13S0211000_5.l0).U5().LIZIZ(awS13S0211000_5.z2, (ResourceItem) awS13S0211000_5.l1, awS13S0211000_5.i3, LifecycleOwnerKt.getLifecycleScope((C357700E0q) awS13S0211000_5.l0), ((C357700E0q) awS13S0211000_5.l0).LLLII);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS13S0211000_5 awS13S0211000_5, Object obj) {
        boolean z;
        C377400Eqw c377400EqwT2 = ((C377280Eqk) awS13S0211000_5.l0).T2();
        boolean z2 = awS13S0211000_5.z2;
        int i = awS13S0211000_5.i3;
        C377270Eqj c377270Eqj = (C377270Eqj) awS13S0211000_5.l1;
        int i2 = c377270Eqj.LIZLLL;
        if (c377270Eqj.LIZIZ.size() > ((C377270Eqj) awS13S0211000_5.l1).LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        c377400EqwT2.getClass();
        return new C377400Eqw(z2, i, i2, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0211000_5(int i, C357700E0q c357700E0q, ResourceItem resourceItem, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c357700E0q;
        this.z2 = z;
        this.l1 = resourceItem;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0211000_5(C377280Eqk c377280Eqk, boolean z, int i, C377270Eqj c377270Eqj, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c377280Eqk;
        this.z2 = z;
        this.i3 = i;
        this.l1 = c377270Eqj;
    }
}
