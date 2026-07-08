package com.ss.android.ugc.aweme.feed.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class AnchorKt {
    public static final String getExtraBasedOnKey(AnchorCommonStruct anchorCommonStruct, String str) {
        boolean z;
        String extra = anchorCommonStruct.getExtra();
        if (extra.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return new JSONObject(extra).optString(str, null);
    }
}
