package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1066050dqd;
import X.C786410Ut5;
import X.InterfaceC1019840ce6;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class RecordParamMethod extends OpenMethod {
    public static final C1066050dqd Companion = new Object() { // from class: X.0dqd
    };
    public String enterFrom;
    public String taskId;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.framework.OpenMethod, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return "openRecord";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.framework.OpenMethod, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RecordParamMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        String string = JSONObjectProtectorUtils.getString(jSONObject, "type");
        if (TextUtils.equals("goods_order_share", string)) {
            new WeakReference(getContext());
            return;
        }
        new JSONObject();
        jSONObject.put("type", "openRecord");
        if (jSONObject.has("args")) {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "args");
            jSONObject2.put("recordOrigin", "jsBridge");
            if (Intrinsics.LJFF("challenge", string)) {
                jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("challenge_id"));
                jSONObject2.put("recordParam", "challenge");
            } else if (Intrinsics.LJFF("music", string)) {
                jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("music_id"));
                jSONObject2.put("recordParam", "music");
            } else if (Intrinsics.LJFF("effect", string)) {
                if (jSONObject2.has("effect_id")) {
                    jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("effect_id"));
                }
                jSONObject2.put("recordParam", "sticker");
                if (jSONObject2.has("effect_meta_info")) {
                    jSONObject2.put("effect_meta_info", C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "effect_meta_info")));
                }
                if (jSONObject2.has("effect_image")) {
                    jSONObject2.put("effect_image", C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "effect_image")));
                }
            } else if (Intrinsics.LJFF("donation", string)) {
                jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("charity_id"));
                jSONObject2.put("recordParam", "donation");
            } else if (Intrinsics.LJFF("star_atlas", string)) {
                jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, jSONObject2.get("star_atlas_id"));
                jSONObject2.put("recordParam", "star_atlas");
                jSONObject2.put("star_atlas_object", C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(jSONObject, "args")));
            } else if (Intrinsics.LJFF("tcm", string)) {
                jSONObject2.put("recordParam", "tcm");
                jSONObject2.put("star_atlas_object", C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(jSONObject, "args")));
            }
            jSONObject2.put("group", "1");
        }
        open(jSONObject);
    }
}
