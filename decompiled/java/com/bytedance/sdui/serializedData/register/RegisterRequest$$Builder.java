package com.bytedance.sdui.serializedData.register;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.sdui.serializedData.common.event.ClientEvent;
import com.bytedance.sdui.serializedData.common.event.GlobalEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class RegisterRequest$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        RegisterRequest registerRequest = (RegisterRequest) absSerializedData;
        c$d c_d = new c$d(outputStream);
        c_d.LJIIIZ(1, Integer.valueOf(registerRequest.LIZ).intValue());
        String str = registerRequest.LIZIZ;
        if (str != null) {
            c_d.LJIIJJI(2, str);
        }
        String str2 = registerRequest.LIZJ;
        if (str2 != null) {
            c_d.LJIIJJI(3, str2);
        }
        String str3 = registerRequest.LIZLLL;
        if (str3 != null) {
            c_d.LJIIJJI(4, str3);
        }
        c_d.LJIIIZ(5, Integer.valueOf(registerRequest.LJ).intValue());
        c_d.LJIIIZ(6, Integer.valueOf(registerRequest.LJFF).intValue());
        c_d.LIZIZ(Float.valueOf(registerRequest.LJI).floatValue(), 7);
        if (registerRequest.LJII != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                registerRequest.LJII.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(8, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
            }
        }
        String str4 = registerRequest.LJIIIIZZ;
        if (str4 != null) {
            c_d.LJIIJJI(9, str4);
        }
        String str5 = registerRequest.LJIIIZ;
        if (str5 != null) {
            c_d.LJIIJJI(11, str5);
        }
        List<GlobalEvent> list = registerRequest.LJIIJ;
        int i = 0;
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    list.get(i2).LIZ(byteArrayOutputStream);
                    c_d.LJIIIIZZ(12, byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                } finally {
                }
            }
        }
        String str6 = registerRequest.LJIIJJI;
        if (str6 != null) {
            c_d.LJIIJJI(13, str6);
        }
        String str7 = registerRequest.LJIIL;
        if (str7 != null) {
            c_d.LJIIJJI(14, str7);
        }
        c_d.LJIILJJIL(15, Long.valueOf(registerRequest.LJIILIIL).longValue());
        c_d.LJI(11);
        c_d.LIZJ(128);
        byte[] bArr = c_d.LIZIZ;
        int i3 = c_d.LIZLLL;
        c_d.LIZLLL = i3 + 1;
        bArr[i3] = (byte) 0;
        String str8 = registerRequest.LJIILJJIL;
        if (str8 != null) {
            c_d.LJIIJJI(17, str8);
        }
        List<ClientEvent> list2 = registerRequest.LJIILL;
        if (list2 != null) {
            while (true) {
                ArrayList arrayList = (ArrayList) list2;
                if (i >= arrayList.size()) {
                    break;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    ((ClientEvent) arrayList.get(i)).LIZ(byteArrayOutputStream2);
                    c_d.LJIIIIZZ(18, byteArrayOutputStream2.toByteArray());
                    byteArrayOutputStream2.close();
                    i++;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                    byteArrayOutputStream2.close();
                }
            }
        }
        c_d.LJFF();
    }
}
