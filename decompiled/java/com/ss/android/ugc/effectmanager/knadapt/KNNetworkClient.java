package com.ss.android.ugc.effectmanager.knadapt;

import X.C0XSU;
import X.C0XSV;
import X.C0XSW;
import X.C13N8;
import X.C13NB;
import X.C2097608Jq;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ChunkResponseCallback;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class KNNetworkClient implements C13NB {
    public static final Companion Companion = new Companion();
    public final IEffectNetWorker effectNetWrapper;

    public static final class Companion {
    }

    public KNNetworkClient(IEffectNetWorker iEffectNetWorker) {
        this.effectNetWrapper = iEffectNetWorker;
    }

    @Override // X.C13NB
    public C13N8 fetchFromNetwork(C0XSU c0xsu) {
        String str;
        EffectRequest effectRequest;
        HashMap map;
        C13N8 c13n8;
        boolean zLJI = MethodIDManager.LJI(137388);
        if (c0xsu.LIZJ == C0XSV.POST) {
            str = "POST";
        } else {
            str = "GET";
        }
        if (c0xsu.LJII) {
            effectRequest = new EffectRequest(str, c0xsu.LIZ, c0xsu.LJI, true);
        } else {
            effectRequest = new EffectRequest(str, c0xsu.LIZ, c0xsu.LJI);
        }
        effectRequest.setContentType(c0xsu.LJFF);
        Map<String, String> map2 = c0xsu.LIZLLL;
        if (map2 != null) {
            effectRequest.setHeaders(map2);
        }
        Map<String, Object> map3 = c0xsu.LJ;
        if (map3 != null) {
            effectRequest.setBodyParams(map3);
        }
        Map<String, Object> map4 = c0xsu.LJIIIZ;
        if (map4 != null) {
            effectRequest.setFormDataParts(map4);
        }
        try {
            InputStream inputStreamExecute = this.effectNetWrapper.execute(effectRequest);
            String logId = effectRequest.getLogId();
            if (logId != null && !a0.LJJJIL(logId)) {
                map = C2097608Jq.LJI(new Pair("x-tt-logid", effectRequest.getLogId()));
            } else {
                map = new HashMap();
            }
            if (inputStreamExecute != null) {
                c13n8 = new C13N8(200, new InputStreamByteRead(inputStreamExecute), effectRequest.getContentLength(), effectRequest.getErrorMsg(), map);
            } else {
                c13n8 = new C13N8(400, new C0XSW(), 0L, effectRequest.getErrorMsg(), map);
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c13n8;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0XSW c0xsw = new C0XSW();
            String errorMsg = effectRequest.getErrorMsg();
            if (errorMsg == null) {
                errorMsg = e.getMessage();
            }
            C13N8 c13n82 = new C13N8(400, c0xsw, 0L, errorMsg);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c13n82;
        }
    }

    public void fetchFromNetworkChunked(C0XSU c0xsu, ChunkResponseCallback chunkResponseCallback) {
        String str;
        EffectRequest effectRequest;
        if (c0xsu.LIZJ == C0XSV.POST) {
            str = "POST";
        } else {
            str = "GET";
        }
        if (c0xsu.LJII) {
            effectRequest = new EffectRequest(str, c0xsu.LIZ, c0xsu.LJI, true);
        } else {
            effectRequest = new EffectRequest(str, c0xsu.LIZ, c0xsu.LJI);
        }
        effectRequest.setContentType(c0xsu.LJFF);
        Map<String, String> map = c0xsu.LIZLLL;
        if (map != null) {
            effectRequest.setHeaders(map);
        }
        Map<String, Object> map2 = c0xsu.LJ;
        if (map2 != null) {
            effectRequest.setBodyParams(map2);
        }
        this.effectNetWrapper.executeChunked(effectRequest, chunkResponseCallback);
    }
}
