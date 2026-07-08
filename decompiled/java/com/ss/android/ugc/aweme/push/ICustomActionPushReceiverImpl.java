package com.ss.android.ugc.aweme.push;

import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class ICustomActionPushReceiverImpl implements ICustomActionPushReceiver {
    @Override // com.ss.android.ugc.aweme.push.ICustomActionPushReceiver
    public final boolean LIZ(JSONObject jSONObject) {
        if (Intrinsics.LJFF("popup", jSONObject.optString("in_app_push_form")) && Intrinsics.LJFF("author", jSONObject.optString("in_app_push_type")) && !TextUtils.isEmpty(jSONObject.optString("event"))) {
            return true;
        }
        return false;
    }
}
