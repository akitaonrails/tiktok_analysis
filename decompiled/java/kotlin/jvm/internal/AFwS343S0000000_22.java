package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1631620sYq;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes23.dex */
public class AFwS343S0000000_22 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(4);
    public final int $t;

    public static AFwS343S0000000_22 get$arr$(int i) {
        AFwS343S0000000_22 aFwS343S0000000_22 = (AFwS343S0000000_22) arr$.get(i);
        if (aFwS343S0000000_22 != null) {
            return aFwS343S0000000_22;
        }
        arr$.compareAndSet(i, null, new AFwS343S0000000_22(i));
        return (AFwS343S0000000_22) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS343S0000000_22(int i) {
        super(3);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS343S0000000_22 aFwS343S0000000_22, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS343S0000000_22 aFwS343S0000000_22, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS343S0000000_22 aFwS343S0000000_22, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        return new int[]{(iIntValue + iIntValue2) / 2};
    }

    public static final Object invoke$3(AFwS343S0000000_22 aFwS343S0000000_22, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        return new int[]{(iIntValue + iIntValue2) / 2};
    }
}
