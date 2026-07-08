package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C0M81;
import X.C1390380mHk;
import X.C1446160nji;
import X.C1452150ntN;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1446740nke;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS7S0211000_8 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S0211000_8 awS7S0211000_8) {
        ((C0M81) awS7S0211000_8.l0).LJFF(awS7S0211000_8.i3, true);
        if (awS7S0211000_8.z2) {
            ((Function0) awS7S0211000_8.l1).invoke();
        } else {
            C1452150ntN.LIZLLL();
            C0M81 c0m81 = (C0M81) awS7S0211000_8.l0;
            c0m81.getClass();
            if (C0CHQ.LIZ().LJJJJJ().shouldDisable10MinDraftRecord(c0m81.LIZJ)) {
                C19GS c19gs = c0m81.LJIIIIZZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131824731);
                C1390380mHk.LIZ(c19gs, 1047, creativeToastBuilder);
            } else {
                C1446160nji.LIZLLL(c0m81.LIZJ);
                InterfaceC1446740nke interfaceC1446740nke = c0m81.LJ;
                if (interfaceC1446740nke != null) {
                    interfaceC1446740nke.vK2();
                }
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$1(AwS7S0211000_8 awS7S0211000_8) {
        ((C0M81) awS7S0211000_8.l0).LJFF(awS7S0211000_8.i3, awS7S0211000_8.z2);
        ((Function0) awS7S0211000_8.l1).invoke();
        return Boolean.TRUE;
    }

    public static final Object invoke$2(AwS7S0211000_8 awS7S0211000_8) {
        ((C0M81) awS7S0211000_8.l0).LJFF(awS7S0211000_8.i3, awS7S0211000_8.z2);
        ((Function0) awS7S0211000_8.l1).invoke();
        return Boolean.TRUE;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS7S0211000_8 awS7S0211000_8) {
        return C786410Ut5.Td((LayoutInflater) awS7S0211000_8.l0, awS7S0211000_8.i3, (ViewGroup) awS7S0211000_8.l1, awS7S0211000_8.z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0211000_8(C0M81 c0m81, boolean z, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0m81;
        this.i3 = 2131846549;
        this.z2 = z;
        this.l1 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0211000_8(C0M81 c0m81, boolean z, AwS566S0100000_22 awS566S0100000_22, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0m81;
        this.i3 = 2131846550;
        this.z2 = z;
        this.l1 = awS566S0100000_22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0211000_8(C0M81 c0m81, C0M81 c0m812, int i, boolean z, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c0m81;
        this.i3 = c0m812;
        this.z2 = i;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0211000_8(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = layoutInflater;
        this.i3 = i;
        this.l1 = viewGroup;
        this.z2 = z;
    }
}
