package kotlin.jvm.internal;

import X.C09AY;
import X.C1574620r4u;
import X.C1574640r4w;
import X.C1954807lC;
import X.C208700rF;
import X.C2188811AlT;
import X.EnumC1574650r4x;
import X.EnumC1574730r55;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public class AFwS345S0000000_24 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(2);
    public final int $t;

    public static AFwS345S0000000_24 get$arr$(int i) {
        AFwS345S0000000_24 aFwS345S0000000_24 = (AFwS345S0000000_24) arr$.get(i);
        if (aFwS345S0000000_24 != null) {
            return aFwS345S0000000_24;
        }
        arr$.compareAndSet(i, null, new AFwS345S0000000_24(i));
        return (AFwS345S0000000_24) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS345S0000000_24(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS345S0000000_24 aFwS345S0000000_24, Object obj, Object obj2, Object obj3) {
        String strLIZIZ;
        String str = ((C208700rF) obj2).LIZIZ;
        int i = C1574640r4w.LIZ[((EnumC1574650r4x) obj3).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("invalidate_");
                    sbLIZ.append(str);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    throw new C1954807lC();
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("evict_on_consumed_");
                sbLIZ2.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("lru_evict_");
            sbLIZ3.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        MiniDramaPreloadMonitor.LIZIZ(EnumC1574730r55.AWEME_PRELOAD, new C1574620r4u(strLIZIZ));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS345S0000000_24 aFwS345S0000000_24, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }
}
