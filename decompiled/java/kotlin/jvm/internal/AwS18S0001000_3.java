package kotlin.jvm.internal;

import X.C09AY;
import X.C1251350ifV;
import X.C291001Au;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.memory.profiler.strategy.FpsRegistry;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS18S0001000_3 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f962i0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0001000_3(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f962i0 = i;
    }

    public static final Object invoke$0(AwS18S0001000_3 awS18S0001000_3, Object obj) {
        return C1251350ifV.LIZ((C1251350ifV) obj, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(Integer.valueOf(awS18S0001000_3.f962i0)), null, null, null, null, null, Integer.MAX_VALUE, 31);
    }

    public static final Object invoke$1(AwS18S0001000_3 awS18S0001000_3, Object obj) {
        ListProtector.remove((List) obj, awS18S0001000_3.f962i0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS18S0001000_3 awS18S0001000_3, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        n nVar = new n();
        nVar.LJJIII(Float.valueOf(fFloatValue), "refreshRate");
        FpsRegistry.INSTANCE.sendEvent(awS18S0001000_3.f962i0, nVar);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS18S0001000_3 awS18S0001000_3, Object obj) {
        ((Map) obj).put("active_cache_count", String.valueOf(awS18S0001000_3.f962i0));
        return Unit.LIZ;
    }
}
