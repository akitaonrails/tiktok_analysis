package com.ss.android.ugc.aweme.wavepublish.gate;

import X.C1433880nPu;
import X.InterfaceC1433950nQ1;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class PublishGateServiceImpl implements IPublishGateService {
    public final ConcurrentHashMap<String, InterfaceC1433950nQ1> LIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.wavepublish.gate.IPublishGateService
    public final InterfaceC1433950nQ1 LIZIZ(String str) {
        return this.LIZ.get(str);
    }

    @Override // com.ss.android.ugc.aweme.wavepublish.gate.IPublishGateService
    public final void LIZJ(String str) {
        this.LIZ.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.wavepublish.gate.IPublishGateService
    public final void LIZ(String str, C1433880nPu c1433880nPu) {
        this.LIZ.put(str, c1433880nPu);
    }
}
