package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C127K;
import X.C1371600lnS;
import X.C1397620mTQ;
import X.InterfaceC1036110d4L;
import X.InterfaceC1370310llN;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.k;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS33S0600000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS33S0600000_16 awS33S0600000_16, Object obj) {
        InterfaceC1036110d4L interfaceC1036110d4L;
        ((Boolean) obj).booleanValue();
        BaseSharePackage baseSharePackage = ((C1371600lnS) awS33S0600000_16.l0).LJJIIJ;
        if (baseSharePackage != null) {
            InterfaceC1370310llN interfaceC1370310llN = (InterfaceC1370310llN) awS33S0600000_16.l2;
            C127K c127k = (C127K) awS33S0600000_16.l3;
            SparkContext sparkContext = (SparkContext) awS33S0600000_16.l4;
            k kVar = (k) awS33S0600000_16.l5;
            interfaceC1370310llN.LJIILIIL(c127k.getContext(), baseSharePackage);
            if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                interfaceC1036110d4L.LJJ(1, kVar.LJIL());
            }
        }
        ((TuxSheet) awS33S0600000_16.l1).dismiss();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS33S0600000_16 awS33S0600000_16, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(((C118300cf) awS33S0600000_16.l0).element, new AwS113S0400000_16((C118300cf) awS33S0600000_16.l2, (C118300cf) awS33S0600000_16.l3, (BAAnchorServiceImpl) awS33S0600000_16.l4, (Context) awS33S0600000_16.l5, (Function0<Unit>) 4));
        c1397620mTQ.LJII(((C118300cf) awS33S0600000_16.l1).element, new AwS595S0100000_16((C118300cf) awS33S0600000_16.l2, 457));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0600000_16(C118300cf c118300cf, C118300cf c118300cf2, C118300cf c118300cf3, BAAnchorServiceImpl bAAnchorServiceImpl, Context context, AwS573S0100000_29 awS573S0100000_29, int i) {
        super(1);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c118300cf3;
        this.l3 = bAAnchorServiceImpl;
        this.l4 = context;
        this.l5 = awS573S0100000_29;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0600000_16(C1371600lnS c1371600lnS, TuxSheet tuxSheet, InterfaceC1370310llN interfaceC1370310llN, C127K c127k, SparkContext sparkContext, k kVar, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1371600lnS;
        this.l1 = tuxSheet;
        this.l2 = interfaceC1370310llN;
        this.l3 = c127k;
        this.l4 = sparkContext;
        this.l5 = kVar;
    }
}
