package com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model;

import androidx.lifecycle.ViewModel;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicPlaceRequestParamsVM extends ViewModel {
    public static final /* synthetic */ int LLILZLL = 0;
    public String LL;
    public JSONObject LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public final void vQ2(Map<String, ? extends Object> map) throws JSONException {
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject = this.LLILLJJLI;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    jSONObject.put(key, value);
                }
            }
            this.LLILLJJLI = jSONObject;
            this.LLILZIL = true;
        }
    }

    public final void wQ2(String str) {
        this.LL = str;
        if (str != null) {
            this.LLILZIL = true;
        } else {
            if (this.LLILLJJLI != null) {
                return;
            }
            this.LLILZIL = false;
        }
    }
}
