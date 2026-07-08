package com.ss.android.ugc.feed.platform.cell;

import X.C1954807lC;
import X.C283400B8w;
import X.C700100RdA;
import X.C700420Rdg;
import X.EnumC700430Rdh;
import X.EnumC700440Rdi;
import android.view.View;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class BaseCellComponentExtension implements IComponentStatus {
    @Override // com.ss.android.ugc.feed.platform.cell.IComponentStatus
    public final void setComponentClickStatusExperimental(View view, EnumC700430Rdh enumC700430Rdh) {
        if (((Boolean) C283400B8w.LIZ.getValue()).booleanValue()) {
            LIZ(view, enumC700430Rdh, EnumC700440Rdi.CLICK);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.IComponentStatus
    public final void vn(View view, EnumC700430Rdh enumC700430Rdh) {
        LIZ(view, enumC700430Rdh, EnumC700440Rdi.CLICK);
    }

    public final void LIZ(View view, EnumC700430Rdh enumC700430Rdh, EnumC700440Rdi enumC700440Rdi) {
        String str;
        if (C700420Rdg.LIZIZ[enumC700440Rdi.ordinal()] == 1) {
            int i = C700420Rdg.LIZ[enumC700430Rdh.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "unknown";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "negative";
                }
            } else {
                str = "positive";
            }
            Set<String> set = C700100RdA.LIZ;
            view.setTag(C700100RdA.LJIIIZ, str);
            return;
        }
        throw new C1954807lC();
    }
}
