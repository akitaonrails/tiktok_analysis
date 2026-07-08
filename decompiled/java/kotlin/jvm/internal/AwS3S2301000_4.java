package kotlin.jvm.internal;

import X.C020W;
import X.C09AY;
import X.C11O8;
import X.C1239300iM4;
import X.C1397620mTQ;
import X.C344660DfE;
import android.content.Context;
import com.ss.android.ugc.tiktok.tns.userrelation.block.api.BlockManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS3S2301000_4 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS3S2301000_4 awS3S2301000_4, Object obj) {
        C344660DfE c344660DfE = BlockManager.LIZ;
        String str = awS3S2301000_4.s0;
        int i = awS3S2301000_4.i5;
        String str2 = awS3S2301000_4.s1;
        c344660DfE.getClass();
        C11O8 c11o8LIZ = C344660DfE.LIZ(str, i, str2);
        if (c11o8LIZ != null) {
            C1239300iM4.LJ(c11o8LIZ, new C020W((Context) awS3S2301000_4.l3, (Function1) awS3S2301000_4.l2, 52), C1239300iM4.LIZJ, new C020W((Context) awS3S2301000_4.l3, (Context) awS3S2301000_4.l4, (Function0<Unit>) 53));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S2301000_4 awS3S2301000_4, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131821705, new AwS3S2301000_4(awS3S2301000_4.s0, awS3S2301000_4.i5, awS3S2301000_4.s1, (Function1) awS3S2301000_4.l2, (Context) awS3S2301000_4.l3, (Function0) awS3S2301000_4.l4, 0));
        c1397620mTQ.LJII(2131821707, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S2301000_4(String str, String str2, AwS70S1000000_19 awS70S1000000_19, Context context, AwS168S1100000_19 awS168S1100000_19, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.i5 = 1;
        this.s1 = str2;
        this.l2 = awS70S1000000_19;
        this.l3 = context;
        this.l4 = awS168S1100000_19;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S2301000_4(String str, String str2, int i, String str3, Function1<? super Throwable, Unit> function1, Context context, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.s0 = str;
        this.i5 = str2;
        this.s1 = i;
        this.l2 = str3;
        this.l3 = function1;
        this.l4 = context;
    }
}
