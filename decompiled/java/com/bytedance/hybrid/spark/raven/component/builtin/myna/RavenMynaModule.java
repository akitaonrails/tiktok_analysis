package com.bytedance.hybrid.spark.raven.component.builtin.myna;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenMynaModule extends BaseComponentData implements Serializable {

    @C09CT("height")
    public Integer height;

    @C09CT("init_data")
    public final String initData;

    @C09CT("instant_configs")
    public final RavenMynaInstantConfigs instantConfigs;

    @C09CT(alternate = {FollowStatusChangeMethod.PARAM_UID}, value = "item_id")
    public final String itemId;

    @C09CT("schema")
    public String schema;

    @C09CT("width")
    public Integer width;

    public RavenMynaModule() {
        this("", null, null, null, null, null);
    }

    public final RavenMynaModule copy(String str, String str2, String str3, Integer num, Integer num2, RavenMynaInstantConfigs ravenMynaInstantConfigs) {
        return new RavenMynaModule(str, str2, str3, num, num2, ravenMynaInstantConfigs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RavenMynaModule)) {
            return false;
        }
        RavenMynaModule ravenMynaModule = (RavenMynaModule) obj;
        return Intrinsics.LJFF(this.schema, ravenMynaModule.schema) && Intrinsics.LJFF(this.initData, ravenMynaModule.initData) && Intrinsics.LJFF(this.itemId, ravenMynaModule.itemId) && Intrinsics.LJFF(this.width, ravenMynaModule.width) && Intrinsics.LJFF(this.height, ravenMynaModule.height) && Intrinsics.LJFF(this.instantConfigs, ravenMynaModule.instantConfigs);
    }

    public int hashCode() {
        int iHashCode = this.schema.hashCode() * 31;
        String str = this.initData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        RavenMynaInstantConfigs ravenMynaInstantConfigs = this.instantConfigs;
        return iHashCode5 + (ravenMynaInstantConfigs != null ? ravenMynaInstantConfigs.hashCode() : 0);
    }

    @Override // com.bytedance.hybrid.spark.raven.model.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenMynaModule(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", initData=");
        sbLIZ.append(this.initData);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.itemId);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", instantConfigs=");
        sbLIZ.append(this.instantConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getInitData() {
        return this.initData;
    }

    public final RavenMynaInstantConfigs getInstantConfigs() {
        return this.instantConfigs;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Integer getWidth() {
        return this.width;
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseComponentData, X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof RavenMynaModule) {
            return Intrinsics.LJFF(this.itemId, ((RavenMynaModule) interfaceC1891350zJl).itemId);
        }
        return false;
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseComponentData, X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        BaseComponentData baseComponentData;
        if (!(interfaceC1891350zJl instanceof RavenMynaModule)) {
            return false;
        }
        String str = this.instanceId;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof BaseComponentData) && (baseComponentData = (BaseComponentData) interfaceC1891350zJl) != null) {
            str2 = baseComponentData.instanceId;
        }
        if (str != null && str2 != null) {
            return Intrinsics.LJFF(str, str2);
        }
        return Intrinsics.LJFF(this.itemId, ((RavenMynaModule) interfaceC1891350zJl).itemId);
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setWidth(Integer num) {
        this.width = num;
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseComponentData
    public boolean areContentsTheSame(BaseComponentData baseComponentData) {
        if (baseComponentData instanceof RavenMynaModule) {
            return Intrinsics.LJFF(this.itemId, ((RavenMynaModule) baseComponentData).itemId);
        }
        return false;
    }

    public RavenMynaModule(String str, String str2, String str3, Integer num, Integer num2, RavenMynaInstantConfigs ravenMynaInstantConfigs) {
        this.schema = str;
        this.initData = str2;
        this.itemId = str3;
        this.width = num;
        this.height = num2;
        this.instantConfigs = ravenMynaInstantConfigs;
    }
}
