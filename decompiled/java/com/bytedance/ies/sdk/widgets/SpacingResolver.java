package com.bytedance.ies.sdk.widgets;

import X.C13LQ;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes18.dex */
public final class SpacingResolver {
    public final int endId;
    public final List<HorizontalConstraint> horizontalConstraints;
    public final int[] ids;
    public final LayeredElementContext layeredElementContext;
    public final int startId;

    public final int[] getIds() {
        return this.ids;
    }

    public final int getStartId() {
        return this.startId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r7 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r7 != r12.startId) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r1.connect(6, r7, 7, r0);
        r1.apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        r0 = r4.startMargin;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveSpacing(java.util.List<? extends com.bytedance.ies.sdk.widgets.ConstraintProperty> r13) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.SpacingResolver.resolveSpacing(java.util.List):void");
    }

    public static final class HorizontalConstraint {
        public final int endMargin;
        public final int endToStart;
        public final int startMargin;
        public final int startToEnd;

        public HorizontalConstraint(int i, int i2, int i3, int i4) {
            this.startToEnd = i;
            this.endToStart = i2;
            this.startMargin = i3;
            this.endMargin = i4;
        }
    }

    public SpacingResolver(LayeredElementContext layeredElementContext, int i, int i2, int... iArr) {
        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams;
        int i3;
        this.layeredElementContext = layeredElementContext;
        this.startId = i;
        this.endId = i2;
        this.ids = iArr;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i4 : iArr) {
            ConstraintProperty constraintPropertyById = this.layeredElementContext.getConstraintPropertyById(i4);
            int i5 = -1;
            if (constraintPropertyById != null && (layeredConstraintLayout$LayoutParams = constraintPropertyById.mParams) != null) {
                if (layeredConstraintLayout$LayoutParams.startToStart == -1 && layeredConstraintLayout$LayoutParams.endToEnd == -1) {
                    int[] iArr2 = this.ids;
                    if (iArr2.length != 0 && i4 == C13LQ.LJIJJLI(iArr2) && layeredConstraintLayout$LayoutParams.startToEnd != this.startId) {
                        throw new IllegalArgumentException("The first item should be constraint to startId.");
                    }
                    int[] iArr3 = this.ids;
                    if (iArr3.length != 0) {
                        if (iArr3.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        if (i4 == iArr3[iArr3.length - 1] && layeredConstraintLayout$LayoutParams.endToStart != this.endId) {
                            throw new IllegalArgumentException("The last item should be constraint to endId.");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Only startToEnd and endToStart are supported.");
                }
            } else {
                layeredConstraintLayout$LayoutParams = null;
            }
            if (layeredConstraintLayout$LayoutParams != null) {
                i3 = layeredConstraintLayout$LayoutParams.startToEnd;
                i5 = layeredConstraintLayout$LayoutParams.endToStart;
            } else {
                i3 = -1;
            }
            arrayList.add(new HorizontalConstraint(i3, i5, layeredConstraintLayout$LayoutParams.getMarginStart(), layeredConstraintLayout$LayoutParams.getMarginEnd()));
        }
        this.horizontalConstraints = arrayList;
    }
}
