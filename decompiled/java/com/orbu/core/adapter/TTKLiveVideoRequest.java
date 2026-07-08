package com.orbu.core.adapter;

import X.C2188811AlT;
import android.graphics.Bitmap;
import com.orbu.core.api.ITTKOrbuLiveVideoRequestPayload;
import com.orbu.core.api.ITTKOrbuRequest;
import java.util.Map;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes21.dex */
public final class TTKLiveVideoRequest implements ITTKOrbuRequest<ITTKOrbuLiveVideoRequestPayload> {
    public final Bitmap bitmap;
    public final Map<String, String> metadata;
    public final AnonymousClass1 payload = new ITTKOrbuLiveVideoRequestPayload() { // from class: com.orbu.core.adapter.TTKLiveVideoRequest.payload.1
        @Override // ttp.orbu.sdk.ITTPOrbuLiveVideoRequestPayload
        public Bitmap bitmap() {
            return TTKLiveVideoRequest.this.bitmap;
        }

        @Override // ttp.orbu.sdk.ITTPOrbuLiveVideoRequestPayload
        public int textureId() {
            return TTKLiveVideoRequest.this.textureId;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(TTKLiveVideoRequest.this.textureId);
            sbLIZ.append(", ");
            sbLIZ.append(TTKLiveVideoRequest.this.bitmap);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    };
    public final int textureId;

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.LIVE_VIDEO;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuLiveVideoRequestPayload payload() {
        return this.payload;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.orbu.core.adapter.TTKLiveVideoRequest$payload$1] */
    public TTKLiveVideoRequest(int i, Bitmap bitmap, Map<String, String> map) {
        this.textureId = i;
        this.bitmap = bitmap;
        this.metadata = map;
    }
}
