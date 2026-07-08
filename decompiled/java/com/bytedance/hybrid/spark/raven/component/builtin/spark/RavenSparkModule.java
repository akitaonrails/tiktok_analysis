package com.bytedance.hybrid.spark.raven.component.builtin.spark;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenSparkModule extends BaseComponentData implements Serializable {

    @C09CT("height")
    public Integer height;

    @C09CT("init_data")
    public final String initData;

    @C09CT(alternate = {FollowStatusChangeMethod.PARAM_UID}, value = "item_id")
    public final String itemId;

    @C09CT("schema")
    public String schema;

    @C09CT("width")
    public Integer width;

    public RavenSparkModule() {
        this(null, null, null, null, null);
    }

    public final RavenSparkModule copy(String str, String str2, String str3, Integer num, Integer num2) {
        return new RavenSparkModule(str, str2, str3, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RavenSparkModule)) {
            return false;
        }
        RavenSparkModule ravenSparkModule = (RavenSparkModule) obj;
        return Intrinsics.LJFF(this.schema, ravenSparkModule.schema) && Intrinsics.LJFF(this.initData, ravenSparkModule.initData) && Intrinsics.LJFF(this.itemId, ravenSparkModule.itemId) && Intrinsics.LJFF(this.width, ravenSparkModule.width) && Intrinsics.LJFF(this.height, ravenSparkModule.height);
    }

    public int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.initData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.bytedance.hybrid.spark.raven.model.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenSparkModule(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", initData=");
        sbLIZ.append(this.initData);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.itemId);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getInitData() {
        return this.initData;
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
        if (interfaceC1891350zJl instanceof RavenSparkModule) {
            return Intrinsics.LJFF(this.itemId, ((RavenSparkModule) interfaceC1891350zJl).itemId);
        }
        return false;
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseComponentData, X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        BaseComponentData baseComponentData;
        if (!(interfaceC1891350zJl instanceof RavenSparkModule)) {
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
        return Intrinsics.LJFF(this.itemId, ((RavenSparkModule) interfaceC1891350zJl).itemId);
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
        if (baseComponentData instanceof RavenSparkModule) {
            return Intrinsics.LJFF(this.itemId, ((RavenSparkModule) baseComponentData).itemId);
        }
        return false;
    }

    public RavenSparkModule(String str, String str2, String str3, Integer num, Integer num2) {
        this.schema = str;
        this.initData = str2;
        this.itemId = str3;
        this.width = num;
        this.height = num2;
    }
}
