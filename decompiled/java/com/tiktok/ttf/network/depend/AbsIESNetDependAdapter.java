package com.tiktok.ttf.network.depend;

import X.AbstractC1493260oxg;
import X.C0VJ4;
import X.C0XM1;
import X.C0XPI;
import X.C2213981Bky;
import X.C443120HZe;
import X.C847400XMc;
import X.InterfaceC1493280oxi;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174708fZ;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.common.util.MultiProcessSharedProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbsIESNetDependAdapter extends AbstractC1493260oxg implements InterfaceC1493280oxi {

    public interface IESNetDependApi {
        @InterfaceC1501160pAQ
        ListenableFuture<String> doGet(@InterfaceC2174708fZ String str);
    }

    @Override // X.InterfaceC1493280oxi
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1493280oxi
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1493280oxi
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC1493280oxi
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1493280oxi
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC1493280oxi
    public final void LJIILL() {
    }

    @Override // X.AbstractC1493260oxg
    public final void LJIILLIIL() {
    }

    @Override // X.AbstractC1493260oxg
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC1493280oxi
    public final void onColdStartFinish() {
    }

    static {
        new HashMap();
    }

    @Override // X.InterfaceC1493280oxi
    public final Map<String, String> LJIIIIZZ() {
        HashMap map = new HashMap();
        C443120HZe c443120HZe = new C443120HZe("34.102.215.99", "ttnet.tiktokv.com", "xxx");
        map.put("httpdns", c443120HZe.getFirst());
        map.put(TTNetInit.DOMAIN_NETLOG_KEY, c443120HZe.getSecond());
        map.put("boe", c443120HZe.getThird());
        return map;
    }

    @Override // X.InterfaceC1493280oxi
    public final int getAppId() {
        return C2213981Bky.LIZIZ.getAppId();
    }

    @Override // X.InterfaceC1493280oxi
    public final Context getContext() {
        return C2213981Bky.LIZIZ.getApplicationContext();
    }

    @Override // X.InterfaceC1493280oxi
    public final void LJI(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length > 0) {
                for (String strSubstring : strArrSplit) {
                    if (!TextUtils.isEmpty(strSubstring)) {
                        if (strSubstring.length() > 1 && strSubstring.startsWith(e3.d)) {
                            strSubstring = strSubstring.substring(1);
                        }
                        arrayList.add(strSubstring);
                    }
                }
            }
            C847400XMc.LIZ(arrayList);
        }
    }

    @Override // X.InterfaceC1493280oxi
    public final String LIZJ(Context context, String str) {
        return MultiProcessSharedProvider.LIZJ(context).LIZIZ(str);
    }

    @Override // X.InterfaceC1493280oxi
    public final void LIZLLL(Context context, Map<String, ?> map) {
        try {
            C0VJ4 c0vj4 = new C0VJ4(context);
            if (map != null) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        c0vj4.LIZIZ.put(entry.getKey(), Integer.valueOf(((Integer) value).intValue()));
                    } else if (value instanceof Long) {
                        c0vj4.LIZIZ.put(entry.getKey(), Long.valueOf(((Long) value).longValue()));
                    } else if (value instanceof Float) {
                        c0vj4.LIZIZ.put(entry.getKey(), Float.valueOf(((Float) value).floatValue()));
                    } else if (value instanceof Boolean) {
                        c0vj4.LIZIZ.put(entry.getKey(), Boolean.valueOf(((Boolean) value).booleanValue()));
                    } else if (value instanceof String) {
                        c0vj4.LIZIZ.put(entry.getKey(), (String) value);
                    }
                }
                synchronized (c0vj4) {
                    c0vj4.LIZ();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1493280oxi
    public final void LJII(String str, JSONObject jSONObject) {
        C0XPI c0xpiLIZJ = C0XM1.LIZJ();
        if (c0xpiLIZJ != null) {
            c0xpiLIZJ.monitorCommonLog(str, jSONObject);
        }
    }

    @Override // X.InterfaceC1493280oxi
    public final int LJFF(Context context, int i, String str) {
        return MultiProcessSharedProvider.LIZJ(context).LIZ(str, i);
    }
}
