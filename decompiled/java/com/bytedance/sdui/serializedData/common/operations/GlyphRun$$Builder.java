package com.bytedance.sdui.serializedData.common.operations;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class GlyphRun$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        GlyphRun glyphRun = (GlyphRun) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LIZ(1, Integer.valueOf(glyphRun.LIZ).intValue());
        c_d.LIZ(2, Integer.valueOf(glyphRun.LIZIZ).intValue());
        c_d.LIZIZ(Float.valueOf(glyphRun.LIZJ).floatValue(), 3);
        List<GlyphPosition> list = glyphRun.LIZLLL;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    list.get(i).LIZ(byteArrayOutputStream);
                    c_d.LJIIIIZZ(4, byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    byteArrayOutputStream.close();
                    throw th;
                }
            }
        }
        c_d.LJFF();
    }
}
