package com.bytedance.ies.sdk.widgets;

import X.C19OA;
import com.bytedance.ies.sdk.widgets.ElementSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class ElementSpecImpl implements ElementSpec {
    public AnimationInfo animation;
    public C19OA constraintWidget;
    public final int id;
    public Function1<? super ConstraintProperty, Unit> onAttach;
    public final List<SceneObserver> sceneObservers = new ArrayList();

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public void dispose() {
        ElementSpec.DefaultImpls.dispose(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public AnimationInfo getAnimation() {
        return this.animation;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public C19OA getConstraintWidget() {
        return this.constraintWidget;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public int getId() {
        return this.id;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public Function1<ConstraintProperty, Unit> getOnAttach() {
        return this.onAttach;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public List<SceneObserver> getSceneObservers() {
        return this.sceneObservers;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public void onDispose() {
        ElementSpec.DefaultImpls.onDispose(this);
    }

    public ElementSpecImpl(int i) {
        this.id = i;
    }

    public final ElementSpecImpl addSceneObserver(SceneObserver sceneObserver) {
        if (!this.sceneObservers.contains(sceneObserver)) {
            this.sceneObservers.add(sceneObserver);
        }
        return this;
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpec
    public void attach(ConstraintProperty constraintProperty) {
        ElementSpec.DefaultImpls.attach(this, constraintProperty);
    }

    public void setAnimation(AnimationInfo animationInfo) {
        this.animation = animationInfo;
    }

    public void setConstraintWidget(C19OA c19oa) {
        this.constraintWidget = c19oa;
    }

    public void setOnAttach(Function1<? super ConstraintProperty, Unit> function1) {
        this.onAttach = function1;
    }
}
