package com.bytedance.sdui.serializedData.common.operations;

import X.AbstractC1322720kWc;
import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class FontOperation$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        FontOperation fontOperation = (FontOperation) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LIZ(1, fontOperation.LIZ.intValue());
        c_d.LJIIL(2, fontOperation.LIZIZ.intValue());
        c_d.LJIIL(3, fontOperation.LIZJ.intValue());
        AbstractC1322720kWc abstractC1322720kWc = fontOperation.LIZLLL;
        if (abstractC1322720kWc != null) {
            c_d.LJIILIIL(34);
            c_d.LJIILIIL(abstractC1322720kWc.size());
            abstractC1322720kWc.LJIIJ(c_d);
        }
        c_d.LJFF();
    }
}
