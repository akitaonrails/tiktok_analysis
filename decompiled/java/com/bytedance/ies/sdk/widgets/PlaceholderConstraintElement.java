package com.bytedance.ies.sdk.widgets;

import X.C1083090eI7;
import X.C1083340eIW;
import X.C2188811AlT;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.dependence.DefaultProperty;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class PlaceholderConstraintElement extends GroupHolderConstraintElement {
    public ConstraintProperty constraintProperty;
    public final C1083340eIW container;
    public boolean contentAttached;
    public View contentView;
    public LayerInfo layerInfo;
    public String tag;
    public final int viewId;

    @Override // com.bytedance.ies.sdk.widgets.GroupHolderConstraintElement
    public boolean checkDetach() {
        return true;
    }

    public final void onDetachView() {
        if (this.contentAttached) {
            this.contentAttached = false;
            PropertyResolver propertyResolver = getPropertyResolver();
            if (propertyResolver != null) {
                propertyResolver.decreaseContentView();
            }
        }
        View view = this.contentView;
        if (view == null) {
            return;
        }
        C786410Ut5.LJJLIIIJLJLI(this.container, view);
        this.container.removeSceneConstraintAndLayoutParams(view);
    }

    @Override // com.bytedance.ies.sdk.widgets.ConstraintElement
    public ConstraintProperty getConstraintProperty() {
        return this.constraintProperty;
    }

    public final C1083340eIW getContainer() {
        return this.container;
    }

    public final LayerInfo getLayerInfo() {
        return this.layerInfo;
    }

    @Override // com.bytedance.ies.sdk.widgets.GroupHolderConstraintElement
    public String getTag() {
        return this.tag;
    }

    public final int getViewId() {
        return this.viewId;
    }

    @Override // com.bytedance.ies.sdk.widgets.GroupHolderConstraintElement
    public boolean isAttached() {
        return this.contentAttached;
    }

    public final void initConstraintProperty(View view) {
        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams = this.container.calculateChildLayoutParams(view.getId());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            if (i != -2 && i != -1) {
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams).width = i;
            }
            int i2 = layoutParams.height;
            if (i2 != -2 && i2 != -1) {
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams).height = i2;
            }
        }
        C786410Ut5.W5(view, layeredConstraintLayout$LayoutParamsCalculateChildLayoutParams);
        resetViewProperty(view, this.container.getDefaultProperty(view.getId()));
        ConstraintProperty constraintProperty = new ConstraintProperty(view);
        constraintProperty.mPropertyResolver = getPropertyResolver();
        constraintProperty.container = this.container;
        this.constraintProperty = constraintProperty;
    }

    public final void onAttachView(View view) {
        if (!this.contentAttached) {
            this.contentAttached = true;
            PropertyResolver propertyResolver = getPropertyResolver();
            if (propertyResolver != null) {
                propertyResolver.increaseContentView();
            }
        }
        this.contentView = view;
        if (this.container.findViewById(view.getId()) == null) {
            List<C1083090eI7> groups = getGroups();
            if (groups != null && (true ^ groups.isEmpty())) {
                Iterator<C1083090eI7> it2 = groups.iterator();
                while (it2.hasNext()) {
                    it2.next().addReferencedId(view.getId());
                }
            }
            this.container.addView(view, this.layerInfo);
            ConstraintProperty constraintProperty = this.constraintProperty;
            if (constraintProperty != null) {
                constraintProperty.mParams = (LayeredConstraintLayout$LayoutParams) view.getLayoutParams();
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WidgetPlaceholder doesn't remove, id:");
        sbLIZ.append(ViewIdUtils.getIdName(view));
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setLayerInfo(LayerInfo layerInfo) {
        this.layerInfo = layerInfo;
    }

    private final void resetViewProperty(View view, DefaultProperty defaultProperty) {
        C786410Ut5.T4(view, defaultProperty.alpha);
        C786410Ut5.Jc(view, defaultProperty.translationX);
        C786410Ut5.ed(view, defaultProperty.translationY);
        C786410Ut5.Ob(view, defaultProperty.scaleX);
        C786410Ut5.pc(view, defaultProperty.scaleY);
        int visibility = view.getVisibility();
        int i = defaultProperty.visibility;
        if (visibility != i) {
            C786410Ut5.LJLLLLLL(i, view);
        }
        ConstraintProperty constraintProperty = this.constraintProperty;
        if (constraintProperty != null) {
            constraintProperty.mAlpha = defaultProperty.alpha;
            constraintProperty.mTranslationX = defaultProperty.translationX;
            constraintProperty.mTranslationY = defaultProperty.translationY;
            constraintProperty.mScaleX = defaultProperty.scaleX;
            constraintProperty.mScaleY = defaultProperty.scaleY;
            constraintProperty.mVisibility = defaultProperty.visibility;
        }
    }

    public PlaceholderConstraintElement(int i, C1083340eIW c1083340eIW, PropertyResolver propertyResolver) {
        super(propertyResolver);
        this.viewId = i;
        this.container = c1083340eIW;
        this.layerInfo = new LayerInfo();
    }
}
