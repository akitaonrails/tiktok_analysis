package kotlin.jvm.internal;

import X.AbstractC1375550ltp;
import X.C09AY;
import X.C1371430lnB;
import X.C1371590lnR;
import X.C1375020lsy;
import X.C1375200ltG;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369790lkX;
import android.content.Context;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.DownloadAndShareViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public class AwS174S0400000_21 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS174S0400000_21 awS174S0400000_21, Object obj, Object obj2) {
        AbstractC1375550ltp abstractC1375550ltp = (AbstractC1375550ltp) obj;
        if (((Boolean) obj2).booleanValue() && (abstractC1375550ltp instanceof C1371430lnB)) {
            ((C1375200ltG) awS174S0400000_21.l0).LIZ.LJJIFFI((C1371430lnB) abstractC1375550ltp, (Context) awS174S0400000_21.l1, null);
            C1375020lsy c1375020lsy = (C1375020lsy) awS174S0400000_21.l2;
            c1375020lsy.LIZJ = "url_form";
            ((Function1) awS174S0400000_21.l3).invoke(c1375020lsy);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS174S0400000_21 awS174S0400000_21, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        boolean zLJJIIJ = ((InterfaceC1369790lkX) awS174S0400000_21.l0).LJJIIJ((AbstractC1375550ltp) obj, (Context) awS174S0400000_21.l1, null);
        C1371590lnR c1371590lnR = (C1371590lnR) awS174S0400000_21.l2;
        InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
        if (interfaceC1366490lfD != null) {
            interfaceC1366490lfD.LIZ((InterfaceC1369790lkX) awS174S0400000_21.l0, zLJJIIJ, c1371590lnR.LJIJJ, (Context) awS174S0400000_21.l1);
        }
        if (!((InterfaceC1369790lkX) awS174S0400000_21.l0).LIZJ()) {
            ((DownloadAndShareViewModel) awS174S0400000_21.l3).LLILLJJLI.setValue(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS174S0400000_21(C1375200ltG c1375200ltG, C1375200ltG c1375200ltG2, Context context, C1375020lsy c1375020lsy, Function1<? super C1375020lsy, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = c1375200ltG;
        this.l1 = c1375200ltG2;
        this.l2 = context;
        this.l3 = c1375020lsy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS174S0400000_21(Context context, DownloadAndShareViewModel downloadAndShareViewModel, InterfaceC1369790lkX interfaceC1369790lkX, C1371590lnR c1371590lnR, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1369790lkX;
        this.l1 = context;
        this.l2 = c1371590lnR;
        this.l3 = downloadAndShareViewModel;
    }
}
