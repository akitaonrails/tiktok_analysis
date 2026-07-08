package com.ss.android.ugc.aweme.slash.component.lynx.icon;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class LynxFloatComponent extends BaseLynxComponent<LynxFloatIconModel> {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f99;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent
    public final void hp(float f, float f2) throws JSONException {
        View view;
        int width;
        View view2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("x", Float.valueOf(f));
        jSONObject2.put("y", Float.valueOf(f2));
        jSONObject2.put("width", LJJIJL().getWidth());
        jSONObject2.put("height", LJJIJL().getHeight());
        jSONObject.put("target_location", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        Object parent = LJJIJL().getParent();
        if (parent instanceof ViewGroup) {
            view = (View) parent;
        } else {
            view = null;
        }
        int height = 0;
        if (view != null) {
            width = view.getWidth();
        } else {
            width = 0;
        }
        jSONObject3.put("width", width);
        Object parent2 = LJJIJL().getParent();
        if ((parent2 instanceof ViewGroup) && (view2 = (View) parent2) != null) {
            height = view2.getHeight();
        }
        jSONObject3.put("height", height);
        jSONObject.put("container_size", jSONObject3);
        JG1("slash_float_icon_pan_gesture_end", jSONObject);
    }
}
