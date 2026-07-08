package com.orbu.core.adapter;

import X.C098200Yq;
import X.C189200o6;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuWebRouterRequestPayload;
import java.util.Map;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes13.dex */
public final class TTKWebRouterRequest implements ITTKOrbuRequest<ITTKOrbuWebRouterRequestPayload> {
    public final Map<String, String> metadata;
    public final AnonymousClass1 payload = new ITTKOrbuWebRouterRequestPayload() { // from class: com.orbu.core.adapter.TTKWebRouterRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuWebRouterRequestPayload
        public String routerString() {
            return TTKWebRouterRequest.this.routerString;
        }

        public String toString() {
            TTKWebRouterRequest tTKWebRouterRequest = TTKWebRouterRequest.this;
            try {
                String string = UriProtector.parse(tTKWebRouterRequest.url).buildUpon().clearQuery().toString();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(tTKWebRouterRequest.webviewRuntime);
                sbLIZ.append('#');
                sbLIZ.append(string);
                return C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(TTKWebRouterRequest.this.webviewRuntime);
                sbLIZ2.append('#');
                sbLIZ2.append(TTKWebRouterRequest.this.url);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }

        @Override // ttp.orbu.sdk.ITTPOrbuWebRouterRequestPayload
        public String url() {
            return TTKWebRouterRequest.this.url;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuWebRouterRequestPayload
        public String webviewRuntime() {
            return TTKWebRouterRequest.this.webviewRuntime;
        }
    };
    public final String routerString;
    public final String url;
    public final String webviewRuntime;

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.WEB_ROUTER;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuWebRouterRequestPayload payload() {
        return this.payload;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKWebRouterRequest$payload$1] */
    public TTKWebRouterRequest(String str, String str2, String str3, Map<String, String> map) {
        this.routerString = str;
        this.url = str2;
        this.webviewRuntime = str3;
        this.metadata = map;
    }
}
