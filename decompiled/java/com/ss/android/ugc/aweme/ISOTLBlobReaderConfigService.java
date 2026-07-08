package com.ss.android.ugc.aweme;

import X.C845830XGb;
import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface ISOTLBlobReaderConfigService {
    C845830XGb executeGet(String str, Map<String, String> map);

    Pair<Boolean, String> getGaid(Context context);

    void sendEvent(String str, JSONObject jSONObject);
}
