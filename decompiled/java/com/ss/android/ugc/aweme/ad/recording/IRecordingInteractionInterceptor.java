package com.ss.android.ugc.aweme.ad.recording;

import X.C1035880d3y;
import X.InterfaceC1038080d7W;
import android.webkit.WebView;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface IRecordingInteractionInterceptor {
    void LIZ(JSONObject jSONObject, C1035880d3y c1035880d3y, InterfaceC1038080d7W interfaceC1038080d7W);

    Pair<Boolean, String> LIZIZ(JSONObject jSONObject, C1035880d3y c1035880d3y, WebView webView);

    void LIZJ(JSONObject jSONObject, C1035880d3y c1035880d3y, InterfaceC1038080d7W interfaceC1038080d7W);

    boolean LIZLLL(C1035880d3y c1035880d3y, String str);
}
