package com.bytedance.sdui.serializedData.common.event;

import X.InterfaceC1298970juJ;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class ClientEvent$$Builder implements InterfaceC1298970juJ {
    @Override // X.InterfaceC1298970juJ
    public final void LIZ(AbsSerializedData absSerializedData, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ClientEvent clientEvent = (ClientEvent) absSerializedData;
        c$d c_d = new c$d(outputStream);
        clientEvent.getClass();
        if (clientEvent.LIZ != null) {
            byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                clientEvent.LIZ.LIZ(byteArrayOutputStream2);
                c_d.LJIIIIZZ(2, byteArrayOutputStream2.toByteArray());
                byteArrayOutputStream2.close();
            } finally {
            }
        }
        if (clientEvent.LIZIZ != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                clientEvent.LIZIZ.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(3, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
            }
        }
        if (clientEvent.LIZJ != null) {
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            try {
                clientEvent.LIZJ.LIZ(byteArrayOutputStream3);
                c_d.LJIIIIZZ(4, byteArrayOutputStream3.toByteArray());
                byteArrayOutputStream3.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream3.close();
            }
        }
        if (clientEvent.LIZLLL != null) {
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            try {
                clientEvent.LIZLLL.LIZ(byteArrayOutputStream4);
                c_d.LJIIIIZZ(5, byteArrayOutputStream4.toByteArray());
                byteArrayOutputStream4.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream4.close();
            }
        }
        if (clientEvent.LJ != null) {
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                clientEvent.LJ.LIZ(byteArrayOutputStream5);
                c_d.LJIIIIZZ(6, byteArrayOutputStream5.toByteArray());
                byteArrayOutputStream5.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream5.close();
            }
        }
        if (clientEvent.LJFF != null) {
            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
            try {
                clientEvent.LJFF.LIZ(byteArrayOutputStream6);
                c_d.LJIIIIZZ(7, byteArrayOutputStream6.toByteArray());
                byteArrayOutputStream6.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream6.close();
            }
        }
        if (clientEvent.LJI != null) {
            byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                clientEvent.LJI.LIZ(byteArrayOutputStream2);
                c_d.LJIIIIZZ(8, byteArrayOutputStream2.toByteArray());
                byteArrayOutputStream2.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream2.close();
            }
        }
        c_d.LJIILJJIL(9, Long.valueOf(clientEvent.LJII).longValue());
        if (clientEvent.LJIIIIZZ != null) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                clientEvent.LJIIIIZZ.LIZ(byteArrayOutputStream);
                c_d.LJIIIIZZ(10, byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.close();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                byteArrayOutputStream.close();
            }
        }
        c_d.LJFF();
    }
}
