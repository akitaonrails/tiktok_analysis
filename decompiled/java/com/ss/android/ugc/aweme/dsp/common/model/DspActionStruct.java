package com.ss.android.ugc.aweme.dsp.common.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class DspActionStruct implements Serializable {

    @C09CT("action_type")
    public Integer actionType;

    @C09CT("extra")
    public String extra;

    @C09CT("item_id")
    public String itemId;

    @C09CT("item_type")
    public Integer itemType;

    @C09CT(Scene.SCENE_SERVICE)
    public Integer scene;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DspActionStruct(actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(", itemType=");
        sbLIZ.append(this.itemType);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.itemId);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(",extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getActionType() {
        return this.actionType;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Integer getItemType() {
        return this.itemType;
    }

    public final Integer getScene() {
        return this.scene;
    }

    public final void setActionType(Integer num) {
        this.actionType = num;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setItemType(Integer num) {
        this.itemType = num;
    }

    public final void setScene(Integer num) {
        this.scene = num;
    }
}
