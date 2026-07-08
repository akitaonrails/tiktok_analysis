package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract int LJLZ();

    public abstract long LLFFF();

    public abstract long LLI();

    public abstract String LLIFFJFJJ();

    public final String toString() {
        return LLI() + "\t" + LJLZ() + "\t" + LLFFF() + LLIFFJFJJ();
    }
}
