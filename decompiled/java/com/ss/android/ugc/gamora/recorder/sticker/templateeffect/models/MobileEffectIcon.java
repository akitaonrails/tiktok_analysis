package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class MobileEffectIcon {

    @C09CT("icon_asset_id")
    public final String iconAssetId;

    @C09CT("is_loki_material")
    public final boolean isLokiMaterial;

    @C09CT("url_list")
    public final List<String> list;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    public MobileEffectIcon() {
        this(null, null, null, false, 15, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobileEffectIcon(list=");
        sbLIZ.append(this.list);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", iconAssetId=");
        sbLIZ.append(this.iconAssetId);
        sbLIZ.append(", isLokiMaterial=");
        sbLIZ.append(this.isLokiMaterial);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MobileEffectIcon(List<String> list, String str, String str2, boolean z) {
        this.list = list;
        this.scene = str;
        this.iconAssetId = str2;
        this.isLokiMaterial = z;
    }

    public MobileEffectIcon(List list, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }
}
