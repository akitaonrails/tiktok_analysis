package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import com.bytedance.ies.sdk.widgets.dependence.Constraint;
import com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver;
import com.bytedance.ies.sdk.widgets.dependence.DefaultProperty;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public final class PriorityConstraintSolver implements ConstraintSolver {
    public SceneConstraintSolver sceneConstraintSolver;
    public XmlConstraintSolver xmlConstraintSolver;

    public PriorityConstraintSolver(XmlConstraintSolver xmlConstraintSolver) {
        this.xmlConstraintSolver = xmlConstraintSolver;
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public Constraint getOrCreate(int i) {
        Constraint orCreate;
        SceneConstraintSolver sceneConstraintSolver = this.sceneConstraintSolver;
        if (sceneConstraintSolver != null && (orCreate = sceneConstraintSolver.getOrCreate(i)) != null) {
            return orCreate;
        }
        return this.xmlConstraintSolver.getOrCreate(i);
    }

    public final void removeSceneConstraintAndLayoutParams(int i) {
        Constraint orCreate;
        Set<Constraint> verticalDependents;
        Set<Constraint> verticalDependents2;
        Set<Constraint> verticalDependents3;
        Set<Constraint> horizontalDependents;
        Set<Constraint> horizontalDependents2;
        Set<Constraint> horizontalDependents3;
        Set<Constraint> horizontalDependents4;
        SceneConstraintSolver sceneConstraintSolver = this.sceneConstraintSolver;
        if (sceneConstraintSolver == null || (orCreate = sceneConstraintSolver.getOrCreate(i)) == null) {
            return;
        }
        sceneConstraintSolver.removeConstraintAndLayoutParams(i);
        Constraint left = orCreate.getLeft();
        if (left != null && (horizontalDependents4 = left.getHorizontalDependents()) != null) {
            horizontalDependents4.remove(orCreate);
        }
        Constraint right = orCreate.getRight();
        if (right != null && (horizontalDependents3 = right.getHorizontalDependents()) != null) {
            horizontalDependents3.remove(orCreate);
        }
        Constraint start = orCreate.getStart();
        if (start != null && (horizontalDependents2 = start.getHorizontalDependents()) != null) {
            horizontalDependents2.remove(orCreate);
        }
        Constraint end = orCreate.getEnd();
        if (end != null && (horizontalDependents = end.getHorizontalDependents()) != null) {
            horizontalDependents.remove(orCreate);
        }
        Constraint top = orCreate.getTop();
        if (top != null && (verticalDependents3 = top.getVerticalDependents()) != null) {
            verticalDependents3.remove(orCreate);
        }
        Constraint bottom = orCreate.getBottom();
        if (bottom != null && (verticalDependents2 = bottom.getVerticalDependents()) != null) {
            verticalDependents2.remove(orCreate);
        }
        Constraint baseline = orCreate.getBaseline();
        if (baseline != null && (verticalDependents = baseline.getVerticalDependents()) != null) {
            verticalDependents.remove(orCreate);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public void resolveDependence(Constraint constraint) {
        constraint.resolve(this);
    }

    public final void addSceneConstraintAndLayoutParams(Constraint constraint, LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams) {
        SceneConstraintSolver sceneConstraintSolver = this.sceneConstraintSolver;
        if (sceneConstraintSolver == null) {
            sceneConstraintSolver = new SceneConstraintSolver();
            this.sceneConstraintSolver = sceneConstraintSolver;
        }
        sceneConstraintSolver.addConstraintAndLayoutParams(constraint, layeredConstraintLayout$LayoutParams);
        constraint.copyDependents(this.xmlConstraintSolver.getOrCreate(constraint.ownerId));
        resolveDependence(constraint);
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public DefaultProperty getDefaultProperty(Context context, int i) {
        return this.xmlConstraintSolver.getDefaultProperty(context, i);
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.ConstraintSolver
    public LayeredConstraintLayout$LayoutParams getOrCreateLayoutParams(Context context, int i) {
        LayeredConstraintLayout$LayoutParams orCreateLayoutParams;
        SceneConstraintSolver sceneConstraintSolver = this.sceneConstraintSolver;
        if (sceneConstraintSolver != null && (orCreateLayoutParams = sceneConstraintSolver.getOrCreateLayoutParams(context, i)) != null) {
            return orCreateLayoutParams;
        }
        return this.xmlConstraintSolver.getOrCreateLayoutParams(context, i);
    }
}
