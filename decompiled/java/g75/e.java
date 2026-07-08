package g75;

import X.C093Y;
import X.C1305020k44;
import X.C13LP;
import X.C15438062q;
import X.InterfaceC1305030k45;
import X.InterfaceC19504011Sk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e<T> implements InterfaceC19504011Sk<T> {
    public static final /* synthetic */ int LIZJ = 0;
    public final T LIZ;
    public final LinkedHashSet<Pair<InterfaceC1305030k45<?>, Long>> LIZIZ;

    static {
        new C1305020k44();
    }

    @Override // X.InterfaceC19504011Sk
    public final T payload() {
        return this.LIZ;
    }

    @Override // X.InterfaceC19504011Sk
    public final boolean LIZ(InterfaceC1305030k45<T> interfaceC1305030k45) {
        return this.LIZIZ.add(new Pair<>(interfaceC1305030k45, Long.valueOf(System.currentTimeMillis())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19504011Sk
    public final e LIZIZ(Object obj) {
        if (Intrinsics.LJFF(this.LIZ, obj)) {
            return this;
        }
        int size = this.LIZIZ.size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = C13LP.LJJJJJL(this.LIZIZ, i);
        }
        return new e(obj, C093Y.LIZLLL(pairArr));
    }

    @Override // X.InterfaceC19504011Sk
    public final boolean LIZJ(InterfaceC1305030k45<?> interfaceC1305030k45) {
        LinkedHashSet<Pair<InterfaceC1305030k45<?>, Long>> linkedHashSet = this.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(linkedHashSet, 10));
        Iterator<Pair<InterfaceC1305030k45<?>, Long>> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getFirst());
        }
        return arrayList.contains(interfaceC1305030k45);
    }

    public e(T t, LinkedHashSet<Pair<InterfaceC1305030k45<?>, Long>> linkedHashSet) {
        this.LIZ = t;
        this.LIZIZ = linkedHashSet;
    }
}
