package com.ss.android.ugc.aweme.aikit.experiments;

import X.C09CT;
import X.C2188811AlT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CameoPreviewPageConfigExp {
    public static final CameoPreviewPageConfigData LIZ = new CameoPreviewPageConfigData(null, 1, null);

    public static final class CameoPreviewPageConfig {

        @C09CT("business_type")
        public final String businessType;

        @C09CT("min_compatible_version")
        public final String minCompatibleVersion;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CameoPreviewPageConfig)) {
                return false;
            }
            CameoPreviewPageConfig cameoPreviewPageConfig = (CameoPreviewPageConfig) obj;
            return Intrinsics.LJFF(this.businessType, cameoPreviewPageConfig.businessType) && Intrinsics.LJFF(this.minCompatibleVersion, cameoPreviewPageConfig.minCompatibleVersion);
        }

        public final int hashCode() {
            return (this.businessType.hashCode() * 31) + this.minCompatibleVersion.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CameoPreviewPageConfig(businessType=");
            sbLIZ.append(this.businessType);
            sbLIZ.append(", minCompatibleVersion=");
            sbLIZ.append(this.minCompatibleVersion);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CameoPreviewPageConfig() {
            this("", "");
        }

        public CameoPreviewPageConfig(String str, String str2) {
            this.businessType = str;
            this.minCompatibleVersion = str2;
        }
    }

    public static final class CameoPreviewPageConfigData {

        @C09CT("cameo_preview_page_to_edit_config")
        public final List<CameoPreviewPageConfig> cameoPreviewPageConfig;

        public CameoPreviewPageConfigData() {
            this(null, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CameoPreviewPageConfigData) && Intrinsics.LJFF(this.cameoPreviewPageConfig, ((CameoPreviewPageConfigData) obj).cameoPreviewPageConfig);
        }

        public final int hashCode() {
            return this.cameoPreviewPageConfig.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CameoPreviewPageConfigData(cameoPreviewPageConfig=");
            sbLIZ.append(this.cameoPreviewPageConfig);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CameoPreviewPageConfigData(List<CameoPreviewPageConfig> list) {
            this.cameoPreviewPageConfig = list;
        }

        public CameoPreviewPageConfigData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Collections.singletonList(new CameoPreviewPageConfig("ai_remix", "45.0.0")) : list);
        }
    }
}
