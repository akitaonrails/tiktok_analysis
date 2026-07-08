package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x8<T> implements Comparator {
    public static final x8<T> LL = new x8<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Intrinsics.LJI(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }
}
