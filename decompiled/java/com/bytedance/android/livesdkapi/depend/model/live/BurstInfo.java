package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class BurstInfo {

    @C09CT("burst_time_remain_seconds")
    public Long burstTimeRemainSeconds;

    @C09CT("multiple")
    public Long multiple;

    @C09CT("property_definition_id")
    public Long propertyDefinitionId;

    @C09CT("property_icon")
    public ImageModel propertyIcon;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.burstTimeRemainSeconds != null) {
            sb.append(", burst_time_remain_seconds=");
            sb.append(this.burstTimeRemainSeconds);
        }
        if (this.multiple != null) {
            sb.append(", multiple=");
            sb.append(this.multiple);
        }
        if (this.propertyDefinitionId != null) {
            sb.append(", property_definition_id=");
            sb.append(this.propertyDefinitionId);
        }
        if (this.propertyIcon != null) {
            sb.append(", property_icon=");
            sb.append(this.propertyIcon);
        }
        sb.replace(0, 2, "BurstInfo{");
        sb.append('}');
        return sb.toString();
    }
}
