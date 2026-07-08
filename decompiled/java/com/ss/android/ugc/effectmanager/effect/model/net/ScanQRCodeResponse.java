package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.PlatformEffect;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ScanQRCodeResponse extends BaseNetResponse {
    public DataNode data;

    public static class DataNode {
        public PlatformEffect effect;
        public List<String> url_prefix;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        return this.data != null;
    }
}
