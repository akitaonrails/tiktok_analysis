package com.bytedance.ies.sdk.widgets;

import X.C19ME;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes18.dex */
public final class LayeredConstraintLayout$LayoutParams extends C19ME {
    public int layer;
    public int order;
    public int weight;

    private final void resolveWeight() {
        this.weight = (this.layer * LSPassThroughRecordSizeConfig.DEFAULT) + this.order;
    }

    public final int getLayer() {
        return this.layer;
    }

    public final int getOrder() {
        return this.order;
    }

    public final /* synthetic */ int getWeight$live_widget_release() {
        return this.weight;
    }

    public LayeredConstraintLayout$LayoutParams(LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams) {
        super((C19ME) layeredConstraintLayout$LayoutParams);
        this.layer = layeredConstraintLayout$LayoutParams.layer;
        this.order = layeredConstraintLayout$LayoutParams.order;
        resolveWeight();
    }

    public final void setLayer(int i) {
        this.layer = i;
        resolveWeight();
    }

    public final void setOrder(int i) {
        this.order = i;
        resolveWeight();
    }

    public final /* synthetic */ void setWeight$live_widget_release(int i) {
        this.weight = i;
    }

    public LayeredConstraintLayout$LayoutParams(C19ME c19me) {
        super(c19me);
    }

    public LayeredConstraintLayout$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public LayeredConstraintLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.ss.android.ugc.aweme.app.R$styleable.LayeredConstraintLayout_Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = com.ss.android.ugc.aweme.app.R$styleable.LayeredConstraintLayout_Layout_layout_layer;
            if (index == i2) {
                this.layer = typedArrayObtainStyledAttributes.getInt(i2, 0);
            } else {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i);
                int i3 = com.ss.android.ugc.aweme.app.R$styleable.LayeredConstraintLayout_Layout_layout_order;
                if (index2 == i3) {
                    this.order = typedArrayObtainStyledAttributes.getInt(i3, 0);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        resolveWeight();
    }

    public final void setLayerAndOrder(int i, int i2) {
        this.layer = i;
        this.order = i2;
        resolveWeight();
    }

    public LayeredConstraintLayout$LayoutParams(int i, int i2) {
        super(i, i2);
    }
}
