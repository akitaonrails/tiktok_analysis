package com.bytedance.sdui.serializedData.common;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class PollingResponse$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        PollingResponse pollingResponse = (PollingResponse) absSerializedData;
        c$d c_d = new c$d(outputStream);
        String str = pollingResponse.LIZ;
        if (str != null) {
            c_d.LJIIJJI(1, str);
        }
        if (pollingResponse.LIZIZ != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                pollingResponse.LIZIZ.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(2, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
            }
        }
        if (pollingResponse.LIZJ != null) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                pollingResponse.LIZJ.LIZ(byteArrayOutputStream2);
                c_d.LJIIIIZZ(3, byteArrayOutputStream2.toByteArray());
                byteArrayOutputStream2.close();
            } finally {
            }
        }
        if (pollingResponse.LIZLLL != null) {
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            try {
                pollingResponse.LIZLLL.LIZ(byteArrayOutputStream3);
                c_d.LJIIIIZZ(4, byteArrayOutputStream3.toByteArray());
                byteArrayOutputStream3.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream3.close();
            }
        }
        if (pollingResponse.LJ != null) {
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            try {
                pollingResponse.LJ.LIZ(byteArrayOutputStream4);
                c_d.LJIIIIZZ(5, byteArrayOutputStream4.toByteArray());
                byteArrayOutputStream4.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream4.close();
            }
        }
        String str2 = pollingResponse.LJFF;
        if (str2 != null) {
            c_d.LJIIJJI(6, str2);
        }
        String str3 = pollingResponse.LJI;
        if (str3 != null) {
            c_d.LJIIJJI(7, str3);
        }
        if (pollingResponse.LJII != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                pollingResponse.LJII.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(8, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream.close();
            }
        }
        c_d.LJFF();
    }
}
