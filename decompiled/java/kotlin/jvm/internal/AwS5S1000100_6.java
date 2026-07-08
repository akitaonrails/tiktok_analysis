package kotlin.jvm.internal;

import X.C09AY;
import X.C0HW3;
import X.C0HW5;
import X.C1440005kM;
import X.C291001Au;
import X.C442480HWs;
import X.C446370Het;
import X.C737030Svd;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS5S1000100_6 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public String s0;

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

    public static final Object invoke$0(AwS5S1000100_6 awS5S1000100_6, Object obj) {
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).sr(awS5S1000100_6.j1, awS5S1000100_6.s0);
        C1440005kM.LIZ(new C737030Svd(awS5S1000100_6.s0, Long.valueOf(awS5S1000100_6.j1)));
        return C442480HWs.LIZ((C442480HWs) obj, new C291001Au(new C446370Het(awS5S1000100_6.s0, awS5S1000100_6.j1)), null, 2);
    }

    public static final Object invoke$1(AwS5S1000100_6 awS5S1000100_6, Object obj) {
        return C442480HWs.LIZ((C442480HWs) obj, new C291001Au(new C446370Het(awS5S1000100_6.s0, awS5S1000100_6.j1)), null, 2);
    }

    public static final Object invoke$2(AwS5S1000100_6 awS5S1000100_6, Object obj) {
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).sr(awS5S1000100_6.j1, awS5S1000100_6.s0);
        C291001Au c291001Au = new C291001Au(new C0HW5(awS5S1000100_6.s0, awS5S1000100_6.j1));
        obj.getClass();
        return new C0HW3(c291001Au);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1000100_6(String str, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
