package kotlin.jvm.internal;

import X.AbstractC928510aGn;
import X.C09AY;
import X.C921170a4x;
import X.C948450amx;
import X.InterfaceC302401Fe;
import X.InterfaceC915550Zvt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS52S0000100_15 extends C09AY implements Function0 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS52S0000100_15 awS52S0000100_15) {
        ConcurrentHashMap<Long, List<InterfaceC915550Zvt>> concurrentHashMap = CloudDraftItemManager.LJ;
        if (concurrentHashMap.containsKey(Long.valueOf(awS52S0000100_15.j0)) && !CloudDraftItemManager.LJFF.containsKey(Long.valueOf(awS52S0000100_15.j0))) {
            concurrentHashMap.remove(Long.valueOf(awS52S0000100_15.j0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS52S0000100_15 awS52S0000100_15) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
            return C921170a4x.LJIIIZ(abstractC928510aGnLIZ, awS52S0000100_15.j0);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0000100_15(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
