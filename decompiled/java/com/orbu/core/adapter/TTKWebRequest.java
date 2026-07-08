package com.orbu.core.adapter;

import X.C098200Yq;
import X.C189200o6;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuWebRequestPayload;
import java.util.Map;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes29.dex */
public final class TTKWebRequest implements ITTKOrbuRequest<ITTKOrbuWebRequestPayload> {
    public final Map<String, String> headers;
    public final Map<String, String> metadata;
    public final String method;
    public final AnonymousClass1 payload = new ITTKOrbuWebRequestPayload() { // from class: com.orbu.core.adapter.TTKWebRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuWebRequestPayload
        public byte[] data() {
            return TTKWebRequest.this.reqDataByte;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuWebRequestPayload
        public Map<String, String> headers() {
            return TTKWebRequest.this.headers;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuWebRequestPayload
        public String method() {
            return TTKWebRequest.this.method;
        }

        public String toString() {
            try {
                return UriProtector.parse(TTKWebRequest.this.url).buildUpon().clearQuery().toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return "";
            }
        }

        @Override // ttp.orbu.sdk.ITTPOrbuWebRequestPayload
        public String url() {
            return TTKWebRequest.this.url;
        }
    };
    public final byte[] reqDataByte;
    public final String url;

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.WEB;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuWebRequestPayload payload() {
        return this.payload;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKWebRequest$payload$1] */
    public TTKWebRequest(String str, String str2, Map<String, String> map, byte[] bArr, Map<String, String> map2) {
        this.url = str;
        this.method = str2;
        this.headers = map;
        this.reqDataByte = bArr;
        this.metadata = map2;
    }
}
