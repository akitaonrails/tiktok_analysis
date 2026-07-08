package kotlin.jvm.internal;

import X.C09AY;
import X.C1397620mTQ;
import X.C344950Dfh;
import X.C345010Dfn;
import X.EnumC344990Dfl;
import android.app.Activity;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS0S0100500_4 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public long j2;
    public long j3;
    public long j4;
    public long j5;
    public Object l0;

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

    public static final Object invoke$0(AwS0S0100500_4 awS0S0100500_4, Object obj) {
        SmartRouter.buildRoute((Activity) awS0S0100500_4.l0, "//setting/diskmanager_compose").open();
        C344950Dfh.LIZ = false;
        C344950Dfh.LIZJ(EnumC344990Dfl.CLEAN_STORAGE_WITH_LOADING, awS0S0100500_4.j1, awS0S0100500_4.j2, awS0S0100500_4.j3, awS0S0100500_4.j4, awS0S0100500_4.j5, false, true, false, 512);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0100500_4 awS0S0100500_4, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131826589, new AwS0S0100500_4((Activity) awS0S0100500_4.l0, awS0S0100500_4.j1, awS0S0100500_4.j2, awS0S0100500_4.j3, awS0S0100500_4.j4, awS0S0100500_4.j5, 0));
        c1397620mTQ.LJII(2131826588, new C345010Dfn(awS0S0100500_4.j1, awS0S0100500_4.j2, awS0S0100500_4.j3, awS0S0100500_4.j4, awS0S0100500_4.j5));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0100500_4(Activity activity, long j, long j2, long j3, long j4, long j5, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
        this.j4 = j4;
        this.j5 = j5;
    }
}
