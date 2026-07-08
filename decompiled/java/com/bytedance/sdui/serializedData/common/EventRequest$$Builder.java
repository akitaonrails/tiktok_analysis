package com.bytedance.sdui.serializedData.common;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.sdui.serializedData.common.event.ClientEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class EventRequest$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        EventRequest eventRequest = (EventRequest) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = eventRequest.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        String str2 = eventRequest.LIZIZ;
        if (str2 != null) {
            c_d.LJIIJJI(2, str2);
        }
        List<ClientEvent> list = eventRequest.LIZJ;
        if (list != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) list;
                if (i >= arrayList.size()) {
                    break;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ((ClientEvent) arrayList.get(i)).LIZ(byteArrayOutputStream);
                    c_d.LJIIIIZZ(3, byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    byteArrayOutputStream.close();
                    throw th;
                }
            }
        }
        c_d.LJIILJJIL(4, Long.valueOf(eventRequest.LIZLLL).longValue());
        c_d.LJFF();
    }
}
