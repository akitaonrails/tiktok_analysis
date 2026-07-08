package com.google.android.material.transformation;

import X.C16BC;
import X.C16G0;
import X.C786410Ut5;
import X.InterfaceC21559919Zd;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.transformation.ExpandableBehavior;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
public abstract class ExpandableBehavior extends C16BC<View> {
    public int LIZ;

    public abstract void LIZ(View view, View view2, boolean z, boolean z2);

    @Override // X.C16BC
    public abstract boolean layoutDependsOn(C16G0 c16g0, View view, View view2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C16BC
    public final boolean onDependentViewChanged(C16G0 c16g0, View view, View view2) {
        int i;
        InterfaceC21559919Zd interfaceC21559919Zd = (InterfaceC21559919Zd) view2;
        int i2 = 2;
        if (!interfaceC21559919Zd.LLIIIL() ? this.LIZ != 1 : (i = this.LIZ) != 0 && i != 2) {
            return false;
        }
        if (interfaceC21559919Zd.LLIIIL()) {
            i2 = 1;
        }
        this.LIZ = i2;
        LIZ((View) interfaceC21559919Zd, view, interfaceC21559919Zd.LLIIIL(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, final View view, int i) {
        int i2;
        if (!view.isLaidOut()) {
            ArrayList arrayList = (ArrayList) c16g0.LJFF(view);
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                View view2 = (View) ListProtector.get(arrayList, i3);
                if (layoutDependsOn(c16g0, view, view2)) {
                    final InterfaceC21559919Zd interfaceC21559919Zd = (InterfaceC21559919Zd) view2;
                    if (interfaceC21559919Zd != null) {
                        final int i4 = 2;
                        if (!interfaceC21559919Zd.LLIIIL() ? this.LIZ == 1 : !((i2 = this.LIZ) != 0 && i2 != 2)) {
                            if (interfaceC21559919Zd.LLIIIL()) {
                                i4 = 1;
                            }
                            this.LIZ = i4;
                            C786410Ut5.y3(view.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.19Zc
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                public final boolean onPreDraw() {
                                    C786410Ut5.D3(view.getViewTreeObserver(), this);
                                    ExpandableBehavior expandableBehavior = this.LLILZ;
                                    if (expandableBehavior.LIZ == i4) {
                                        InterfaceC21559919Zd interfaceC21559919Zd2 = interfaceC21559919Zd;
                                        expandableBehavior.LIZ((View) interfaceC21559919Zd2, view, interfaceC21559919Zd2.LLIIIL(), false);
                                    }
                                    return false;
                                }
                            });
                        }
                    }
                } else {
                    i3++;
                }
            }
        }
        return false;
    }
}
