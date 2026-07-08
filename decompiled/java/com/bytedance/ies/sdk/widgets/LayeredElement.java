package com.bytedance.ies.sdk.widgets;

import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public class LayeredElement extends XmlViewHolderConstraintElement {
    public final ConstraintProperty constraintProperty;

    @Override // com.bytedance.ies.sdk.widgets.ConstraintElement
    public ConstraintProperty getConstraintProperty() {
        return this.constraintProperty;
    }

    public LayeredElement(View view, PropertyResolver propertyResolver) {
        super(view, propertyResolver);
        ConstraintProperty constraintProperty = new ConstraintProperty(view);
        constraintProperty.mPropertyResolver = propertyResolver;
        this.constraintProperty = constraintProperty;
    }
}
