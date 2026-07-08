package kotlin.jvm.internal;

import X.C09AY;
import X.C11TS;
import X.C13BV;
import X.C13LP;
import X.C19505611Ta;
import X.InterfaceC1631620sYq;
import java.util.Collection;

/* JADX INFO: loaded from: classes30.dex */
public class AwS351S0000000_29 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS351S0000000_29(int i) {
        super(3);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS351S0000000_29 awS351S0000000_29, Object obj, Object obj2, Object obj3) {
        Iterable iterable = (Iterable) obj2;
        Collection collection = (Collection) obj3;
        if (((C11TS) obj).LIZJ == 0) {
            if (iterable == null) {
                return null;
            }
            return iterable;
        }
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        if (iterable == null && (iterable = C13BV.INSTANCE) == null) {
            throw new RuntimeException();
        }
        return C13LP.LJLIL(iterable, collection);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS351S0000000_29 awS351S0000000_29, Object obj, Object obj2, Object obj3) {
        Iterable iterable = (Iterable) obj2;
        Collection collection = (Collection) obj3;
        if (((C19505611Ta) obj).LIZJ == 0) {
            if (iterable == null) {
                return null;
            }
            return iterable;
        }
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        if (iterable == null && (iterable = C13BV.INSTANCE) == null) {
            throw new RuntimeException();
        }
        return C13LP.LJLIL(iterable, collection);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS351S0000000_29 awS351S0000000_29, Object obj, Object obj2, Object obj3) {
        Iterable iterable = (Iterable) obj2;
        Collection collection = (Collection) obj3;
        if (((C19505611Ta) obj).LIZJ == 0) {
            if (iterable == null) {
                return null;
            }
            return iterable;
        }
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        if (iterable == null && (iterable = C13BV.INSTANCE) == null) {
            throw new RuntimeException();
        }
        return C13LP.LJLIL(iterable, collection);
    }
}
