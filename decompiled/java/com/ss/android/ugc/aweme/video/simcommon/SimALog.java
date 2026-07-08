package com.ss.android.ugc.aweme.video.simcommon;

import X.C1481030odx;
import X.C2344809Gs;
import X.InterfaceC1481090oe3;
import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SimALog implements IALog {
    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public boolean isEnabled() {
        return InterfaceC1481090oe3.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void d(String str) {
        if (InterfaceC1481090oe3.LIZ) {
            C2344809Gs.LIZLLL(3, "VideoPlayer_Log", str);
        }
    }

    public void d(String str, JSONObject jSONObject) throws JSONException {
        C1481030odx.LIZIZ(str, jSONObject);
    }

    public void e(String str, JSONObject jSONObject) throws JSONException {
        if (InterfaceC1481090oe3.LIZ) {
            String strLIZ = C1481030odx.LIZ(str, jSONObject);
            if (!TextUtils.isEmpty(strLIZ)) {
                C2344809Gs.LIZLLL(6, "VideoPlayer_Log", strLIZ);
            }
        }
    }

    public void i(String str, JSONObject jSONObject) throws JSONException {
        if (InterfaceC1481090oe3.LIZ) {
            String strLIZ = C1481030odx.LIZ(str, jSONObject);
            if (!TextUtils.isEmpty(strLIZ)) {
                C2344809Gs.LIZLLL(4, "VideoPlayer_Log", strLIZ);
            }
        }
    }

    public void v(String str, JSONObject jSONObject) throws JSONException {
        if (InterfaceC1481090oe3.LIZ) {
            String strLIZ = C1481030odx.LIZ(str, jSONObject);
            if (!TextUtils.isEmpty(strLIZ)) {
                C2344809Gs.LIZLLL(2, "VideoPlayer_Log", strLIZ);
            }
        }
    }

    public void w(String str, JSONObject jSONObject) throws JSONException {
        if (InterfaceC1481090oe3.LIZ) {
            String strLIZ = C1481030odx.LIZ(str, jSONObject);
            if (!TextUtils.isEmpty(strLIZ)) {
                C2344809Gs.LIZLLL(5, "VideoPlayer_Log", strLIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void e(String str, String str2) {
        C1481030odx.LIZJ(str, str2);
    }
}
