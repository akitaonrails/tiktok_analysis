package kotlin.jvm.internal;

import X.C09AY;
import X.C1220690hs3;
import X.C1220740hs8;
import X.C291001Au;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS9S1001000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public String s0;

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

    public static final Object invoke$0(AwS9S1001000_19 awS9S1001000_19, Object obj) {
        if (obj != null && Intrinsics.LJFF(awS9S1001000_19.s0, CardStruct.IStatusCode.DEFAULT)) {
            Integer numValueOf = Integer.valueOf(awS9S1001000_19.i1);
            if (numValueOf.intValue() > 0) {
                ((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJJZ(numValueOf.intValue());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S1001000_19 awS9S1001000_19, Object obj) {
        return C1220740hs8.LIZ((C1220740hs8) obj, null, null, null, null, new C291001Au(new C1220690hs3(awS9S1001000_19.s0, awS9S1001000_19.i1)), 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S1001000_19(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
