package com.bytedance.ies.sdk.widgets;

import X.C1083080eI6;
import android.content.Context;
import com.bytedance.ies.sdk.widgets.dependence.Constraint;
import com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver;
import com.bytedance.ies.sdk.widgets.dependence.DefaultProperty;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes18.dex */
public abstract class XmlConstraintSolver implements ConstraintSolver {
    public static final ConcurrentHashMap<Integer, Constraint> sConstraints = new ConcurrentHashMap<>(128);

    public abstract Constraint createConstraint(int i);

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public /* synthetic */ DefaultProperty getDefaultProperty(Context context, int i) {
        return C1083080eI6.LIZ(this, context, i);
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public void resolveDependence(Constraint constraint) {
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public final Constraint getOrCreate(int i) {
        ConcurrentHashMap<Integer, Constraint> concurrentHashMap = sConstraints;
        Constraint constraint = concurrentHashMap.get(Integer.valueOf(i));
        if (constraint != null) {
            return constraint;
        }
        Constraint constraintCreateConstraint = createConstraint(i);
        if (constraintCreateConstraint != null) {
            concurrentHashMap.put(Integer.valueOf(i), constraintCreateConstraint);
        }
        return constraintCreateConstraint;
    }
}
