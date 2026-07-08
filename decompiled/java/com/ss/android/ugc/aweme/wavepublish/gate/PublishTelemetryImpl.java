package com.ss.android.ugc.aweme.wavepublish.gate;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class PublishTelemetryImpl implements IPublishTelemetry {
    public final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.wavepublish.gate.IPublishTelemetry
    public final void LIZ(String str) {
        if (str != null && str.length() != 0) {
            this.LIZ.remove(str);
            this.LIZIZ.remove(str);
            this.LIZJ.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.wavepublish.gate.IPublishTelemetry
    public final void LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            this.LIZIZ.put(str, Boolean.TRUE);
        }
    }

    @Override // com.ss.android.ugc.aweme.wavepublish.gate.IPublishTelemetry
    public final void LIZJ(String str) {
        if (str != null && str.length() != 0) {
            this.LIZJ.put(str, Boolean.TRUE);
        }
    }

    @Override // com.ss.android.ugc.aweme.wavepublish.gate.IPublishTelemetry
    public final void LIZLLL(String str) {
        if (str != null && str.length() != 0) {
            this.LIZ.put(str, Boolean.TRUE);
        }
    }
}
