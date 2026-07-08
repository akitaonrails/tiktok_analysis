package com.bytedance.i18n.location.sensor;

import X.C1208460hYK;
import X.C1289490jf1;
import X.C13LP;
import X.C1798540wu4;
import X.C185100nR;
import X.C186000na;
import X.C786410Ut5;
import X.InterfaceC1289500jf2;
import Y.ARunnableS120S0100000_20;
import android.os.SystemClock;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.i18n.location.api.SensorClient;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class SensorClientImpl implements SensorClient {
    public C1798540wu4 LIZIZ;

    @Override // com.bytedance.i18n.location.api.SensorClient
    public final void LJI(C1798540wu4 c1798540wu4) {
        this.LIZIZ = c1798540wu4;
    }

    @Override // com.bytedance.i18n.location.api.SensorClient
    public final void LJII(BPEAHandler bPEAHandler, Cert cert, InterfaceC1289500jf2 interfaceC1289500jf2) throws JSONException {
        String strInvoke;
        int iIntValue;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1798540wu4 c1798540wu4 = this.LIZIZ;
        String upperCase = null;
        if (c1798540wu4 != null) {
            if (!c1798540wu4.LIZIZ) {
                interfaceC1289500jf2.LIZ(-100, null);
                C185100nR c185100nR = C185100nR.LIZ;
                C186000na.LIZ(-100, "not enabled");
                return;
            }
            String strCertToken = cert.certToken();
            if (strCertToken == null) {
                strCertToken = "no_cert";
            }
            C1208460hYK.LIZLLL(strCertToken, "Sensor", "precise");
            Function0<String> function0 = c1798540wu4.LJIIIIZZ;
            if (function0 != null) {
                strInvoke = function0.invoke();
            } else {
                strInvoke = null;
            }
            Set<String> set = c1798540wu4.LIZLLL;
            if (strInvoke != null) {
                upperCase = strInvoke.toUpperCase(Locale.ROOT);
            }
            if (!C13LP.LJJJJ(upperCase, set)) {
                LJIJJLI(strCertToken, SystemClock.uptimeMillis() - jUptimeMillis, -2001, "region_blocked", interfaceC1289500jf2);
                return;
            }
            Function0<Integer> function02 = c1798540wu4.LJIIIZ;
            if (function02 != null) {
                iIntValue = function02.invoke().intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue < c1798540wu4.LIZJ) {
                LJIJJLI(strCertToken, SystemClock.uptimeMillis() - jUptimeMillis, -3001, "no_permission", interfaceC1289500jf2);
                return;
            } else {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS120S0100000_20(new C1289490jf1(c1798540wu4.LIZ, bPEAHandler, c1798540wu4.LJ, c1798540wu4.LJII, c1798540wu4.LJFF, c1798540wu4.LJI, interfaceC1289500jf2, cert), 259));
                LJIJJLI(strCertToken, SystemClock.uptimeMillis() - jUptimeMillis, 0, null, interfaceC1289500jf2);
                return;
            }
        }
        interfaceC1289500jf2.LIZ(-103, null);
        C185100nR c185100nR2 = C185100nR.LIZ;
        C186000na.LIZ(-103, "not initialised");
    }

    public static void LJIJJLI(String str, long j, int i, String str2, InterfaceC1289500jf2 interfaceC1289500jf2) throws JSONException {
        String str3;
        String str4 = str2;
        if (i == 0) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        C1208460hYK.LIZJ(j, str, "Sensor", null, "precise", i, str3, false, str4);
        if (i != 0) {
            interfaceC1289500jf2.LIZ(i, null);
        }
        C185100nR c185100nR = C185100nR.LIZ;
        if (str4 == null) {
            str4 = "unknown";
        }
        C186000na.LIZ(i, str4);
    }
}
