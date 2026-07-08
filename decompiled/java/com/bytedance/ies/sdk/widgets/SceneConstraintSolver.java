package com.bytedance.ies.sdk.widgets;

import X.C1083080eI6;
import android.content.Context;
import com.bytedance.ies.sdk.widgets.dependence.Constraint;
import com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver;
import com.bytedance.ies.sdk.widgets.dependence.DefaultProperty;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class SceneConstraintSolver implements ConstraintSolver {
    public final ConcurrentHashMap<Integer, Constraint> constraints = new ConcurrentHashMap<>(32);
    public final ConcurrentHashMap<Integer, LayeredConstraintLayout$LayoutParams> layoutParams = new ConcurrentHashMap<>(32);

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public final /* synthetic */ DefaultProperty getDefaultProperty(Context context, int i) {
        return C1083080eI6.LIZ(this, context, i);
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public void resolveDependence(Constraint constraint) {
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public Constraint getOrCreate(int i) {
        return this.constraints.get(Integer.valueOf(i));
    }

    public final void removeConstraintAndLayoutParams(int i) {
        this.constraints.remove(Integer.valueOf(i));
        this.layoutParams.remove(Integer.valueOf(i));
    }

    public final void addConstraintAndLayoutParams(Constraint constraint, LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams) {
        int i = constraint.ownerId;
        this.constraints.put(Integer.valueOf(i), constraint);
        if (layeredConstraintLayout$LayoutParams != null) {
            this.layoutParams.put(Integer.valueOf(i), layeredConstraintLayout$LayoutParams);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public LayeredConstraintLayout$LayoutParams getOrCreateLayoutParams(Context context, int i) {
        return this.layoutParams.get(Integer.valueOf(i));
    }
}
