package com.bytedance.sdui.serializedData.register;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import g86.c$d;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class FontCacheItem$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        FontCacheItem fontCacheItem = (FontCacheItem) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LIZ(1, Integer.valueOf(fontCacheItem.LIZ).intValue());
        c_d.LJIIL(2, Integer.valueOf(fontCacheItem.LIZIZ).intValue());
        c_d.LJFF();
    }
}
