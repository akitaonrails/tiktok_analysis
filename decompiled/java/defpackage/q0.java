package defpackage;

import X.C13LP;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class q0<E> extends CopyOnWriteArrayList<E> {
    public final int LL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public q0(int i) {
        this.LL = i;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean add(E e) {
        while (size() >= this.LL) {
            remove(C13LP.LJJJLL(this));
        }
        return super.add(e);
    }

    public final q0<E> filter(Function1<? super E, Boolean> function1) {
        q0<E> q0Var = new q0<>(this.LL);
        for (E e : this) {
            if (function1.invoke(e).booleanValue()) {
                q0Var.add(e);
            }
        }
        return q0Var;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ E remove(int i) {
        return (E) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final void removeIfCompat(Function1<? super E, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        for (E e : this) {
            if (!function1.invoke(e).booleanValue()) {
                arrayList.add(e);
            }
        }
        clear();
        addAll(arrayList);
    }
}
