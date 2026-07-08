package com.bytedance.ies.sdk.widgets;

import X.C1083340eIW;
import X.C19ME;
import X.C19OA;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes18.dex */
public final class LayeredPlaceholderElement extends XmlViewHolderConstraintElement {
    public ConstraintProperty constraintProperty;
    public final C1083340eIW container;
    public boolean contentAttached;
    public View contentView;
    public final View placeholderView;
    public String tag;

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
        transferProperties(this.contentView, this.placeholderView);
        int iIndexOfChild = this.container.indexOfChild(this.contentView);
        C786410Ut5.LJJLIIIJLJLI(this.container, this.contentView);
        this.container.addView(this.placeholderView, iIndexOfChild);
        View view = this.placeholderView;
        this.contentView = view;
        ConstraintProperty constraintProperty = new ConstraintProperty(view, this.constraintProperty);
        constraintProperty.mPropertyResolver = getPropertyResolver();
        this.constraintProperty = constraintProperty;
    }

    @Override // com.bytedance.ies.sdk.widgets.ConstraintElement
    public ConstraintProperty getConstraintProperty() {
        return this.constraintProperty;
    }

    public final C1083340eIW getContainer() {
        return this.container;
    }

    @Override // com.bytedance.ies.sdk.widgets.GroupHolderConstraintElement
    public String getTag() {
        return this.tag;
    }

    @Override // com.bytedance.ies.sdk.widgets.GroupHolderConstraintElement
    public boolean isAttached() {
        return this.contentAttached;
    }

    private final void transferProperties(View view, View view2) {
        C786410Ut5.LJLLLLLL(view.getVisibility(), view2);
        view2.setId(view.getId());
        C786410Ut5.T4(view2, view.getAlpha());
        C786410Ut5.Jc(view2, view.getTranslationX());
        C786410Ut5.ed(view2, view.getTranslationY());
        C786410Ut5.Ab(view2, view.getRotation());
        C786410Ut5.Hb(view2, view.getRotationX());
        C786410Ut5.Ib(view2, view.getRotationY());
        C786410Ut5.Ob(view2, view.getScaleX());
        C786410Ut5.pc(view2, view.getScaleY());
        view2.setPivotX(view.getPivotX());
        view2.setPivotY(view.getPivotY());
        if (view.isLayoutDirectionResolved()) {
            view2.setLayoutDirection(view.getLayoutDirection());
        }
        C786410Ut5.W5(view2, view.getLayoutParams());
        view2.setTag(view.getTag());
        Object tag = view.getTag(R.id.n9c);
        if (tag != null) {
            view2.setTag(R.id.n9c, tag);
        }
    }

    public final void onAttachView(View view, String str) {
        Integer num;
        Integer num2;
        if (!this.contentAttached) {
            this.contentAttached = true;
            PropertyResolver propertyResolver = getPropertyResolver();
            if (propertyResolver != null) {
                propertyResolver.increaseContentView();
            }
        }
        this.tag = str;
        this.contentView = view;
        Object tag = view.getTag(R.id.n9e);
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != -2 && iIntValue != -1) {
                this.placeholderView.getLayoutParams().width = iIntValue;
            }
        } else {
            ViewGroup.LayoutParams layoutParams = this.contentView.getLayoutParams();
            if (layoutParams != null) {
                int i = layoutParams.width;
                if (i != -2 && i != -1) {
                    this.placeholderView.getLayoutParams().width = layoutParams.width;
                }
                view.setTag(R.id.n9e, Integer.valueOf(layoutParams.width));
            }
        }
        Object tag2 = view.getTag(R.id.n9d);
        if ((tag2 instanceof Integer) && (num2 = (Integer) tag2) != null) {
            int iIntValue2 = num2.intValue();
            if (iIntValue2 != -2 && iIntValue2 != -1) {
                this.placeholderView.getLayoutParams().height = iIntValue2;
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.contentView.getLayoutParams();
            if (layoutParams2 != null) {
                int i2 = layoutParams2.height;
                if (i2 != -2 && i2 != -1) {
                    this.placeholderView.getLayoutParams().height = layoutParams2.height;
                }
                view.setTag(R.id.n9d, Integer.valueOf(layoutParams2.height));
            }
        }
        transferProperties(this.placeholderView, this.contentView);
        int iIndexOfChild = this.container.indexOfChild(this.placeholderView);
        C786410Ut5.LJJLIIIJLJLI(this.container, this.placeholderView);
        this.container.addView(this.contentView, iIndexOfChild);
        ConstraintProperty constraintProperty = new ConstraintProperty(this.contentView, this.constraintProperty);
        constraintProperty.mPropertyResolver = getPropertyResolver();
        this.constraintProperty = constraintProperty;
    }

    public LayeredPlaceholderElement(View view, C1083340eIW c1083340eIW, PropertyResolver propertyResolver) {
        this(view, c1083340eIW, propertyResolver, null);
    }

    public LayeredPlaceholderElement(View view, C1083340eIW c1083340eIW, PropertyResolver propertyResolver, C19OA c19oa) throws IllegalAccessException, NoSuchFieldException {
        super(view, propertyResolver);
        this.container = c1083340eIW;
        if (LayeredElementConfiguration.INSTANCE.getDebug() && c19oa != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C19ME) && layoutParams != null) {
                Field declaredField = C19ME.class.getDeclaredField("widget");
                declaredField.setAccessible(true);
                declaredField.set(layoutParams, c19oa);
            }
        }
        this.placeholderView = view;
        this.contentView = view;
        ConstraintProperty constraintProperty = new ConstraintProperty(view);
        constraintProperty.mPropertyResolver = propertyResolver;
        this.constraintProperty = constraintProperty;
    }
}
