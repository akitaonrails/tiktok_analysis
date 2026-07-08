package com.orbu.core.adapter;

import X.C098200Yq;
import X.C0VSJ;
import X.C189200o6;
import X.C2097908Jt;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.api.ITTKOrbuGeckoRequestPayload;
import com.orbu.core.api.ITTKOrbuRequest;
import java.util.Map;
import kotlin.Pair;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKGeckoRequest implements ITTKOrbuRequest<ITTKOrbuGeckoRequestPayload> {
    public static final Companion Companion = new Companion();
    public final AnonymousClass1 payload = new ITTKOrbuGeckoRequestPayload() { // from class: com.orbu.core.adapter.TTKGeckoRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuGeckoRequestPayload
        public String geckoFilePath() {
            return "";
        }

        @Override // ttp.orbu.sdk.ITTPOrbuGeckoRequestPayload
        public String sourceChannel() {
            return "";
        }

        @Override // ttp.orbu.sdk.ITTPOrbuGeckoRequestPayload
        public String temporaryPath() {
            return TTKGeckoRequest.this.temporaryPath;
        }

        public String toString() {
            TTKGeckoRequest tTKGeckoRequest = TTKGeckoRequest.this;
            try {
                int i = new C0VSJ(tTKGeckoRequest.temporaryPath, "manifest-sandbox-signed.json").exists() ? 1 : 0;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append('#');
                sbLIZ.append(tTKGeckoRequest.temporaryPath);
                return C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("0#");
                sbLIZ2.append(TTKGeckoRequest.this.temporaryPath);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    };
    public final String temporaryPath;

    public static final class Companion {
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return C2097908Jt.LIZJ(new Pair("x-tt-dataflow-id", "2013265920"));
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.GECKO;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuGeckoRequestPayload payload() {
        return this.payload;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKGeckoRequest$payload$1] */
    public TTKGeckoRequest(String str) {
        this.temporaryPath = str;
    }
}
