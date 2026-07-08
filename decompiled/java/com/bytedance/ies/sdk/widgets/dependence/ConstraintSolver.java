package com.bytedance.ies.sdk.widgets.dependence;

import android.content.Context;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams;

/* JADX INFO: loaded from: classes18.dex */
public interface ConstraintSolver {
    DefaultProperty getDefaultProperty(Context context, int i);

    Constraint getOrCreate(int i);

    LayeredConstraintLayout$LayoutParams getOrCreateLayoutParams(Context context, int i);

    void resolveDependence(Constraint constraint);
}
