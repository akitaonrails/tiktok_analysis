package com.bytedance.sdui.serializedData.common;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.sdui.serializedData.common.operations.HostOperation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class Frame$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        Frame frame = (Frame) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LJIILJJIL(2, Long.valueOf(frame.LIZ).longValue());
        List<HostOperation> list = frame.LIZIZ;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    list.get(i).LIZ(byteArrayOutputStream);
                    c_d.LJIIIIZZ(3, byteArrayOutputStream.toByteArray());
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
