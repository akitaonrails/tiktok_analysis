package com.bytedance.sdui.serializedData.common.operations;

import X.AbstractC1322720kWc;
import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class Glyph$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        Glyph glyph = (Glyph) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LJIIL(1, Integer.valueOf(glyph.LIZ).intValue());
        c_d.LJIIL(2, Integer.valueOf(glyph.LIZIZ).intValue());
        if (glyph.LIZJ != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                glyph.LIZJ.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(3, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream.close();
                throw th;
            }
        }
        AbstractC1322720kWc abstractC1322720kWc = glyph.LIZLLL;
        if (abstractC1322720kWc != null) {
            c_d.LJIILIIL(34);
            c_d.LJIILIIL(abstractC1322720kWc.size());
            abstractC1322720kWc.LJIIJ(c_d);
        }
        c_d.LJFF();
    }
}
