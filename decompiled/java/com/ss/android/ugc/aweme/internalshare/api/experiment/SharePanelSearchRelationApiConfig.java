package com.ss.android.ugc.aweme.internalshare.api.experiment;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes5.dex */
public final class SharePanelSearchRelationApiConfig {

    @C09CT("enabled")
    public final int enabled;

    @C09CT("remote_search_debounce_ms")
    public final int remote_search_debounce_ms;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    public SharePanelSearchRelationApiConfig() {
        this(0, 3, 500);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharePanelSearchRelationApiConfig)) {
            return false;
        }
        SharePanelSearchRelationApiConfig sharePanelSearchRelationApiConfig = (SharePanelSearchRelationApiConfig) obj;
        return this.enabled == sharePanelSearchRelationApiConfig.enabled && this.scene == sharePanelSearchRelationApiConfig.scene && this.remote_search_debounce_ms == sharePanelSearchRelationApiConfig.remote_search_debounce_ms;
    }

    public int hashCode() {
        return (((this.enabled * 31) + this.scene) * 31) + this.remote_search_debounce_ms;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelSearchRelationApiConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", remote_search_debounce_ms=");
        sbLIZ.append(this.remote_search_debounce_ms);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getRemoteSearchDebounceMs() {
        return this.remote_search_debounce_ms;
    }

    public SharePanelSearchRelationApiConfig(int i, int i2, int i3) {
        this.enabled = i;
        this.scene = i2;
        this.remote_search_debounce_ms = i3;
    }
}
