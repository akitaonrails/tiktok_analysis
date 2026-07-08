package com.bytedance.ies.sdk.widgets;

import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public abstract class XmlViewHolderConstraintElement extends GroupHolderConstraintElement {
    public final View view;

    public final View getView() {
        return this.view;
    }

    public XmlViewHolderConstraintElement(View view, PropertyResolver propertyResolver) {
        super(propertyResolver);
        this.view = view;
    }
}
