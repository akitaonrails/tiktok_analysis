package com.ss.android.ugc.aweme.common;

import X.C0X52;
import X.C0X9S;
import X.C0XSA;
import X.C2088908Gh;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174908fb;
import X.InterfaceC820680WHi;
import android.util.Pair;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.effectmanager.common.ChunkResponseCallback;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class NaviEffectNetworkerImpl implements IEffectNetWorker {

    /* JADX INFO: loaded from: classes4.dex */
    public interface EffectNetworkAPI {
        @InterfaceC2174608fY
        @InterfaceC1501160pAQ
        C0X9S<TypedInput> doGet(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) LinkedHashMap<String, String> linkedHashMap);

        @InterfaceC2174608fY
        @InterfaceC1501170pAR
        C0X9S<TypedInput> doPost(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1485405rg Map<String, ? extends Object> map);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    public final /* synthetic */ void executeChunked(EffectRequest effectRequest, ChunkResponseCallback chunkResponseCallback) {
        C0XSA.LIZ(this, effectRequest, chunkResponseCallback);
    }

    public static InputStream LIZ(EffectRequest effectRequest) {
        C0X52<TypedInput> c0x52Execute;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        InputStream inputStreamIn = null;
        try {
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(effectRequest.getUrl(), linkedHashMap);
            String str = (String) pairLIZJ.first;
            String str2 = (String) pairLIZJ.second;
            boolean zIsUseCommonParams = effectRequest.isUseCommonParams();
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().createRetrofit(str, zIsUseCommonParams, EffectNetworkAPI.class);
            if (zIsUseCommonParams) {
                linkedHashMap.put("game_version", "1.0");
            }
            if (Intrinsics.LJFF("POST", effectRequest.getHttpMethod())) {
                c0x52Execute = effectNetworkAPI.doPost(zIsUseCommonParams, Integer.MAX_VALUE, str2, effectRequest.getParams()).execute();
            } else {
                c0x52Execute = effectNetworkAPI.doGet(zIsUseCommonParams, Integer.MAX_VALUE, str2, linkedHashMap).execute();
            }
            if (c0x52Execute.LIZJ()) {
                inputStreamIn = c0x52Execute.LIZIZ.in();
                effectRequest.setContentLength(c0x52Execute.LIZIZ.length());
                return inputStreamIn;
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            effectRequest.setErrorMsg(e.getMessage());
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            effectRequest.setErrorMsg(e2.getMessage());
            return inputStreamIn;
        }
        return inputStreamIn;
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    public final InputStream execute(EffectRequest effectRequest) {
        InputStream inputStreamLIZ = null;
        if (effectRequest == null) {
            return null;
        }
        try {
            inputStreamLIZ = LIZ(effectRequest);
            return inputStreamLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return inputStreamLIZ;
        }
    }
}
