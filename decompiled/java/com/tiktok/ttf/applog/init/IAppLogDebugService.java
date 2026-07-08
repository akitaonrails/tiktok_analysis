package com.tiktok.ttf.applog.init;

import android.content.Context;
import android.view.View;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public interface IAppLogDebugService {
    boolean LIZ();

    void LIZIZ();

    boolean LIZJ();

    boolean LIZLLL();

    void LJ(String str, String str2, String str3);

    void LJFF(Context context);

    void addDebugInfo(Map<String, String> map);

    void addDebugInfo(JSONObject jSONObject);

    String getMockChannel();

    String getPPELane();

    void injectViewListener(View view);
}
