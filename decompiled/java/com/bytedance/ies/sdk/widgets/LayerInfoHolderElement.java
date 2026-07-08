package com.bytedance.ies.sdk.widgets;

import X.C1083340eIW;
import X.C19ME;
import X.C2188811AlT;
import X.C786410Ut5;
import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public final class LayerInfoHolderElement extends GroupHolderConstraintElement {
    public ConstraintProperty constraintProperty;
    public final C1083340eIW container;
    public final int id;
    public final LayerInfo layerInfo;

    @Override // com.bytedance.ies.sdk.widgets.ConstraintElement
    public ConstraintProperty getConstraintProperty() {
        ConstraintProperty constraintProperty = this.constraintProperty;
        if (constraintProperty != null) {
            return constraintProperty;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No view attached. Id is ");
        sbLIZ.append(this.container.getContext().getResources().getResourceEntryName(this.id));
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C1083340eIW getContainer() {
        return this.container;
    }

    public final int getId() {
        return this.id;
    }

    public final LayerInfo getLayerInfo() {
        return this.layerInfo;
    }

    public final void onAttachView(View view, C19ME c19me) {
        View viewFindViewById = this.container.findViewById(this.id);
        if (viewFindViewById != null) {
            C786410Ut5.LJJLIIIJLJLI(this.container, viewFindViewById);
        }
        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams = new LayeredConstraintLayout$LayoutParams(c19me);
        layeredConstraintLayout$LayoutParams.setLayerAndOrder(this.layerInfo.getLayer(), this.layerInfo.getOrder());
        C786410Ut5.W5(view, layeredConstraintLayout$LayoutParams);
        this.container.addViewByWeight(view);
        ConstraintProperty constraintProperty = new ConstraintProperty(view);
        constraintProperty.mPropertyResolver = getPropertyResolver();
        this.constraintProperty = constraintProperty;
    }

    public LayerInfoHolderElement(int i, C1083340eIW c1083340eIW, PropertyResolver propertyResolver) {
        super(propertyResolver);
        this.id = i;
        this.container = c1083340eIW;
        this.layerInfo = new LayerInfo();
    }
}
