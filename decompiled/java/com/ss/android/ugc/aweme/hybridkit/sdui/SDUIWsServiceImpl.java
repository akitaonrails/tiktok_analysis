package com.ss.android.ugc.aweme.hybridkit.sdui;

import X.C0XE1;
import X.C1317860kOm;
import X.C1528210ps3;
import X.C821280WJq;
import X.InterfaceC1317950kOv;
import X.InterfaceC1528230ps5;
import X.InterfaceC1528240ps6;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SDUIWsServiceImpl implements InterfaceC1528230ps5, InterfaceC1528240ps6 {
    public final List<C1317860kOm> LIZ = new ArrayList();
    public final C1528210ps3 LIZIZ;
    public final List<InterfaceC1317950kOv> LIZJ;

    public SDUIWsServiceImpl() {
        C1528210ps3 c1528210ps3 = new C1528210ps3();
        this.LIZIZ = c1528210ps3;
        this.LIZJ = new ArrayList();
        c1528210ps3.LIZIZ(this);
    }

    @Override // X.InterfaceC1528240ps6
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        for (InterfaceC1317950kOv interfaceC1317950kOv : (ArrayList) this.LIZJ) {
            C1317860kOm c1317860kOm = new C1317860kOm();
            c1317860kOm.LIZ = wsChannelMsg.LIZ();
            c1317860kOm.LIZJ = wsChannelMsg.payloadEncoding;
            c1317860kOm.LIZIZ = wsChannelMsg.payloadType;
            c1317860kOm.LJ = wsChannelMsg.method;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (WsChannelMsg.MsgHeader msgHeader : wsChannelMsg.msgHeaders) {
                linkedHashMap.put(msgHeader.key, msgHeader.value);
            }
            c1317860kOm.LIZLLL = linkedHashMap;
            interfaceC1317950kOv.LIZIZ(c1317860kOm);
        }
    }

    public final void LIZJ(InterfaceC1317950kOv interfaceC1317950kOv) {
        ISparkHostApi iSparkHostApi;
        SparkHostApiImpl sparkHostApiImplLLIZ;
        if (((ArrayList) this.LIZJ).isEmpty() && (iSparkHostApi = this.LIZIZ.LIZIZ) != null && (sparkHostApiImplLLIZ = iSparkHostApi.LLIZ()) != null) {
            sparkHostApiImplLLIZ.LLLILZJ(this);
        }
        if (interfaceC1317950kOv != null) {
            ((ArrayList) this.LIZJ).add(interfaceC1317950kOv);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.common.wschannel.model.WsChannelMsg, com.ss.android.ugc.aweme.hybridkit.sdui.SDUIWsServiceImpl$sendMsg$1] */
    public final void LIZLLL(C1317860kOm c1317860kOm) {
        SparkHostApiImpl sparkHostApiImplLLIZ;
        String str;
        SparkHostApiImpl sparkHostApiImplLLIZ2;
        SparkHostApiImpl sparkHostApiImplLLIZ3;
        ISparkHostApi iSparkHostApi = this.LIZIZ.LIZIZ;
        int i = 0;
        if (iSparkHostApi != null && (sparkHostApiImplLLIZ2 = iSparkHostApi.LLIZ()) != null && sparkHostApiImplLLIZ2.LLLIIL()) {
            C1528210ps3 c1528210ps3 = this.LIZIZ;
            ?? r1 = new WsChannelMsg() { // from class: com.ss.android.ugc.aweme.hybridkit.sdui.SDUIWsServiceImpl$sendMsg$1
                @Override // com.bytedance.common.wschannel.model.WsChannelMsg
                public final String toString() {
                    return "";
                }
            };
            r1.payload = c1317860kOm.LIZ;
            r1.service = 134217750;
            r1.payloadEncoding = c1317860kOm.LIZJ;
            r1.payloadType = c1317860kOm.LIZIZ;
            r1.method = c1317860kOm.LJ;
            ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi2 != null && iSparkHostApi2.LLIZ() != null) {
                i = 1239108;
            }
            r1.channelId = i;
            ISparkHostApi iSparkHostApi3 = c1528210ps3.LIZIZ;
            if (iSparkHostApi3 != null && (sparkHostApiImplLLIZ3 = iSparkHostApi3.LLIZ()) != 0) {
                sparkHostApiImplLLIZ3.LLLIZZ(r1);
                return;
            }
            return;
        }
        C1528210ps3 c1528210ps32 = this.LIZIZ;
        ISparkHostApi iSparkHostApi4 = c1528210ps32.LIZIZ;
        if (iSparkHostApi4 != null && (sparkHostApiImplLLIZ = iSparkHostApi4.LLIZ()) != null) {
            ISparkHostApi iSparkHostApi5 = c1528210ps32.LIZIZ;
            if (iSparkHostApi5 != null && iSparkHostApi5.LJJJIL() != null) {
                str = "sdui";
            } else {
                str = "";
            }
            sparkHostApiImplLLIZ.LLL(str);
        }
        ((ArrayList) this.LIZ).add(c1317860kOm);
    }

    @Override // X.InterfaceC1528230ps5
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        if (c821280WJq.LIZIZ == C0XE1.CONNECTED) {
            Iterator<C1317860kOm> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                LIZLLL(it2.next());
            }
            ((ArrayList) this.LIZ).clear();
        }
    }
}
