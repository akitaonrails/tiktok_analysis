package com.bytedance.ies.sdk.widgets;

import X.C1697810uHb;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class ChainResolver {
    public final int chainStyle;
    public final int endId;
    public final int[] ids;
    public final int spacing;
    public final int startId;

    public final int getChainStyle() {
        return this.chainStyle;
    }

    public final int getEndId() {
        return this.endId;
    }

    public final int[] getIds() {
        return this.ids;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    public final int getStartId() {
        return this.startId;
    }

    public final void resolveChain(List<? extends ConstraintProperty> list) {
        for (ConstraintProperty constraintProperty : list) {
            constraintProperty.removeConstraints(6);
            constraintProperty.removeConstraints(7);
            constraintProperty.apply();
        }
        ArrayList arrayList = new ArrayList();
        for (ConstraintProperty constraintProperty2 : list) {
            if (constraintProperty2.getView().getVisibility() != 8) {
                arrayList.add(constraintProperty2);
            }
        }
        if (!arrayList.isEmpty()) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    ConstraintProperty constraintProperty3 = (ConstraintProperty) obj;
                    if (i == 0) {
                        constraintProperty3.addToHorizontalChainHeadRtl(this.startId);
                    } else {
                        constraintProperty3.addToHorizontalChainRtl(((ConstraintProperty) ListProtector.get(arrayList, i - 1)).id(), 0);
                    }
                    constraintProperty3.horizontalChainStyle(this.chainStyle);
                    constraintProperty3.horizontalBias(0.0f);
                    if (i > 0) {
                        constraintProperty3.margin(6, this.spacing);
                    }
                    if (i == arrayList.size() - 1) {
                        constraintProperty3.addToHorizontalChainTailRtl(this.endId);
                    }
                    constraintProperty3.apply();
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public ChainResolver(int i, int i2, int i3, int i4, int... iArr) {
        this.startId = i;
        this.endId = i2;
        this.chainStyle = i3;
        this.spacing = i4;
        this.ids = iArr;
    }
}
