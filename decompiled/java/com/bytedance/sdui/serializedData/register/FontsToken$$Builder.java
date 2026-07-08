package com.bytedance.sdui.serializedData.register;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class FontsToken$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        FontsToken fontsToken = (FontsToken) absSerializedData;
        c$d c_d = new c$d(outputStream);
        List<FontCacheItem> list = fontsToken.LIZ;
        if (list != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) list;
                if (i >= arrayList.size()) {
                    break;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ((FontCacheItem) arrayList.get(i)).LIZ(byteArrayOutputStream);
                    c_d.LJIIIIZZ(1, byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    byteArrayOutputStream.close();
                    throw th;
                }
            }
        }
        c_d.LIZ(2, Integer.valueOf(fontsToken.LIZIZ).intValue());
        c_d.LJFF();
    }
}
