package com.ss.ugc.live.sdk.message.data;

import X.C786410Ut5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class FullLinkTrack {
    public final List<BaseNode> nodes = new ArrayList();

    public final String jsonString() {
        return C786410Ut5.J3(json(null));
    }

    public final List<BaseNode> getNodes() {
        return this.nodes;
    }

    public final JSONObject json(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<BaseNode> it2 = this.nodes.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().json());
        }
        jSONObject.put("nodes", jSONArray);
        return jSONObject;
    }
}
