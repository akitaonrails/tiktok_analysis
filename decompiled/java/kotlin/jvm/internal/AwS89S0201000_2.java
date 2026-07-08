package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y7P;
import X.C1358505Tj;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C13IQ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1690080u58;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C23250099c;
import X.C724240Sb0;
import X.C869590Y9l;
import X.InterfaceC1566906Bn;
import X.InterfaceC497601wk;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS89S0201000_2 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        Fragment fragmentLJI = C724240Sb0.LJI((UIAssem) awS89S0201000_2.l0);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), (RequestKeyboardAbility) awS89S0201000_2.l1, RequestKeyboardAbility.class, null, null);
        }
        assembler.RQ2((UIAssem) awS89S0201000_2.l0, new AwS17S0001000_2(awS89S0201000_2.i2, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        ((Assembler) obj).RQ2((LifecycleOwner) awS89S0201000_2.l0, new AwS110S0101000_2((C13IQ) awS89S0201000_2.l1, (C13IQ<? extends BaseInnerPushSlotAssem>) awS89S0201000_2.i2, 7));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        ((Assembler) obj).RQ2((LifecycleOwner) awS89S0201000_2.l0, new AwS110S0101000_2((C13IQ) awS89S0201000_2.l1, (C13IQ<? extends BaseInnerPushSlotAssem>) awS89S0201000_2.i2, 8));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        ((Assembler) obj).QQ2((LifecycleOwner) awS89S0201000_2.l0, new AwS110S0101000_2((C13IQ) awS89S0201000_2.l1, (C13IQ<? extends BaseInnerPushSlotAssem>) awS89S0201000_2.i2, 9));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        ((Assembler) obj).QQ2((LifecycleOwner) awS89S0201000_2.l0, new AwS110S0101000_2((C13IQ) awS89S0201000_2.l1, (C13IQ<? extends BaseInnerPushSlotAssem>) awS89S0201000_2.i2, 10));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        C20684815ws.onEventV3("impersonation_account_nr_finish_edits_no_button");
        int i = awS89S0201000_2.i2;
        if (i != 1) {
            if (i == 2) {
                Function0 function0 = (Function0) awS89S0201000_2.l0;
                if (function0 != null) {
                    function0.invoke();
                }
                ((C19EG) awS89S0201000_2.l1).finish();
            }
        } else {
            c1397660mTU.LIZ().LIZIZ(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(R.string.yes, new AwS368S0200000_2((C19EG) awS89S0201000_2.l0, (C19EG) awS89S0201000_2.l1, (Function0<Unit>) 116));
        c1397620mTQ.LJII(R.string.m78, new AwS89S0201000_2((C19EG) awS89S0201000_2.l0, awS89S0201000_2.i2, (Function0) awS89S0201000_2.l1, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        ((Assembler) obj).RQ2((RavenFragment) awS89S0201000_2.l0, new AwS110S0101000_2((C13IQ) awS89S0201000_2.l1, (C13IQ<? extends BaseInnerPushSlotAssem>) awS89S0201000_2.i2, 15));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        ((InterfaceC1566906Bn) obj).d5((List) awS89S0201000_2.l0, awS89S0201000_2.i2, (C0Y7P) awS89S0201000_2.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS89S0201000_2 awS89S0201000_2, Object obj) {
        C23250099c.LIZLLL((InterfaceC497601wk) awS89S0201000_2.l0, null, null, new C1358505Tj((C1690080u58) awS89S0201000_2.l1, ((Number) obj).intValue(), awS89S0201000_2.i2, null), 3);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS89S0201000_2(X.C19EG r3, int r4, kotlin.jvm.functions.Function0 r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 5 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.i2 = r4
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.i2 = r4
            r1.l0 = r5
            r1.l1 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS89S0201000_2.<init>(X.19EG, int, kotlin.jvm.functions.Function0, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0201000_2(InterfaceC497601wk interfaceC497601wk, C1690080u58 c1690080u58, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC497601wk;
        this.l1 = c1690080u58;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS89S0201000_2(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, C13IQ<? extends BaseInnerPushSlotAssem> c13iq, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleOwner2;
        this.i2 = c13iq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0201000_2(UIAssem uIAssem, RequestKeyboardAbility requestKeyboardAbility, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = uIAssem;
        this.l1 = requestKeyboardAbility;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S0201000_2(RavenFragment ravenFragment, C19719912Dl c19719912Dl, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = ravenFragment;
        this.l1 = c19719912Dl;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS89S0201000_2(List list, List<C869590Y9l> list2, int i, C0Y7P c0y7p) {
        super(1);
        this.$t = c0y7p;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }
}
