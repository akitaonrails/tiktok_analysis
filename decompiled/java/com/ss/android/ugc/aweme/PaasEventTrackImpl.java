package com.ss.android.ugc.aweme;

import X.C20684815ws;
import com.tiktok.ttf.track.IPaasEventTrack;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PaasEventTrackImpl implements IPaasEventTrack {
    @Override // com.tiktok.ttf.track.IPaasEventTrack
    public final void onEventV3(String str, Map<String, String> map) {
        C20684815ws.LJIILLIIL(str, map);
    }

    @Override // com.tiktok.ttf.track.IPaasEventTrack
    public final void onEventV3(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }
}
