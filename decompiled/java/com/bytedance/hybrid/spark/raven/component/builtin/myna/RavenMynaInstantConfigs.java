package com.bytedance.hybrid.spark.raven.component.builtin.myna;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1168310gVZ;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenMynaInstantConfigs extends BaseComponentData implements Serializable {

    @C09CT("business_identifier")
    public final String businessIdentifier;

    @C09CT("data_source")
    public final String dataSource;

    @C09CT("protocol")
    public final String protocol;

    @C09CT("render_config")
    public final InterfaceC1168310gVZ renderConfig;

    @C09CT("template_name")
    public final String templateName;

    public final RavenMynaInstantConfigs copy(String str, String str2, String str3, String str4, InterfaceC1168310gVZ interfaceC1168310gVZ) {
        return new RavenMynaInstantConfigs(str, str2, str3, str4, interfaceC1168310gVZ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RavenMynaInstantConfigs)) {
            return false;
        }
        RavenMynaInstantConfigs ravenMynaInstantConfigs = (RavenMynaInstantConfigs) obj;
        return Intrinsics.LJFF(this.businessIdentifier, ravenMynaInstantConfigs.businessIdentifier) && Intrinsics.LJFF(this.templateName, ravenMynaInstantConfigs.templateName) && Intrinsics.LJFF(this.protocol, ravenMynaInstantConfigs.protocol) && Intrinsics.LJFF(this.dataSource, ravenMynaInstantConfigs.dataSource) && Intrinsics.LJFF(this.renderConfig, ravenMynaInstantConfigs.renderConfig);
    }

    public int hashCode() {
        int iHashCode = ((((this.businessIdentifier.hashCode() * 31) + this.templateName.hashCode()) * 31) + this.protocol.hashCode()) * 31;
        String str = this.dataSource;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC1168310gVZ interfaceC1168310gVZ = this.renderConfig;
        return iHashCode2 + (interfaceC1168310gVZ != null ? interfaceC1168310gVZ.hashCode() : 0);
    }

    @Override // com.bytedance.hybrid.spark.raven.model.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenMynaInstantConfigs(businessIdentifier=");
        sbLIZ.append(this.businessIdentifier);
        sbLIZ.append(", templateName=");
        sbLIZ.append(this.templateName);
        sbLIZ.append(", protocol=");
        sbLIZ.append(this.protocol);
        sbLIZ.append(", dataSource=");
        sbLIZ.append(this.dataSource);
        sbLIZ.append(", renderConfig=");
        sbLIZ.append(this.renderConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getBusinessIdentifier() {
        return this.businessIdentifier;
    }

    public final String getDataSource() {
        return this.dataSource;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final InterfaceC1168310gVZ getRenderConfig() {
        return this.renderConfig;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public RavenMynaInstantConfigs(String str, String str2, String str3, String str4, InterfaceC1168310gVZ interfaceC1168310gVZ) {
        this.businessIdentifier = str;
        this.templateName = str2;
        this.protocol = str3;
        this.dataSource = str4;
        this.renderConfig = interfaceC1168310gVZ;
    }
}
