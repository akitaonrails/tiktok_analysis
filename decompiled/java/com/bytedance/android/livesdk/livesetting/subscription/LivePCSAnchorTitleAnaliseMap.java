package com.bytedance.android.livesdk.livesetting.subscription;

import X.AbstractC2098408Jy;
import X.C13BV;
import X.C13LZ;
import X.C15438062q;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class LivePCSAnchorTitleAnaliseMap {
    public final String androidScene;
    public final double binaryThreshold;
    public final double classificationThreshold;
    public final boolean enable;
    public final String inputSeparator;
    public final JSONObject jsonObject;
    public final List<String> tagList;

    public final String getAndroidScene() {
        return this.androidScene;
    }

    public final double getBinaryThreshold() {
        return this.binaryThreshold;
    }

    public final double getClassificationThreshold() {
        return this.classificationThreshold;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getInputSeparator() {
        return this.inputSeparator;
    }

    public final List<String> getTagList() {
        return this.tagList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public LivePCSAnchorTitleAnaliseMap(String str) {
        JSONObject jSONObject;
        ?? arrayList;
        String strOptString;
        if (TextUtils.isEmpty(str)) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(str);
        }
        this.jsonObject = jSONObject;
        this.enable = jSONObject.optBoolean("enabled", false);
        this.inputSeparator = jSONObject.optString("input_separator", ",");
        this.binaryThreshold = jSONObject.optDouble("binary_threshold", 0.0d);
        this.classificationThreshold = jSONObject.optDouble("classification_threshold", 0.0d);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tag_list");
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, jSONArrayOptJSONArray.length());
            arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
            Iterator<Integer> it2 = intRangeLJIILJJIL.iterator();
            while (it2.hasNext()) {
                arrayList.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, ((AbstractC2098408Jy) it2).nextInt()));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.tagList = arrayList;
        JSONObject jSONObjectOptJSONObject = this.jsonObject.optJSONObject("android");
        String str2 = "";
        if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("scene_bytenn", "")) != null) {
            str2 = strOptString;
        }
        this.androidScene = str2;
    }
}
