package com.orbu.core.adapter;

import X.C098200Yq;
import X.C189200o6;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.api.ITTKOrbuNetworkRequestPayload;
import com.orbu.core.api.ITTKOrbuRequest;
import java.util.List;
import java.util.Map;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKNetworkRequest implements ITTKOrbuRequest<ITTKOrbuNetworkRequestPayload> {
    public String domainType;
    public final Map<String, List<String>> headers;
    public final Map<String, String> metadata;
    public final String method;
    public final AnonymousClass1 payload = new ITTKOrbuNetworkRequestPayload() { // from class: com.orbu.core.adapter.TTKNetworkRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload
        public byte[] data() {
            return TTKNetworkRequest.this.reqDataByte;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload
        public Map<String, List<String>> headers() {
            return TTKNetworkRequest.this.headers;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload
        public String method() {
            return TTKNetworkRequest.this.method;
        }

        public String toString() {
            try {
                return UriProtector.parse(TTKNetworkRequest.this.url).buildUpon().clearQuery().toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return "";
            }
        }

        @Override // ttp.orbu.sdk.ITTPOrbuNetworkRequestPayload
        public String url() {
            return TTKNetworkRequest.this.url;
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
        return Channel.NETWORK;
    }

    public final String getDomainType() {
        return this.domainType;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuNetworkRequestPayload payload() {
        return this.payload;
    }

    public final void setDomainType(String str) {
        this.domainType = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKNetworkRequest$payload$1] */
    public TTKNetworkRequest(String str, String str2, Map<String, List<String>> map, byte[] bArr, Map<String, String> map2) {
        this.url = str;
        this.method = str2;
        this.headers = map;
        this.reqDataByte = bArr;
        this.metadata = map2;
    }
}
