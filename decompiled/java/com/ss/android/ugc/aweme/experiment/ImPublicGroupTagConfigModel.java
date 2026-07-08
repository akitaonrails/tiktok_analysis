package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ImPublicGroupTagConfigModel {

    @C09CT("tag_panel_config")
    public final TagPanelConfig tagPanelConfig;

    public ImPublicGroupTagConfigModel() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImPublicGroupTagConfigModel) && Intrinsics.LJFF(this.tagPanelConfig, ((ImPublicGroupTagConfigModel) obj).tagPanelConfig);
    }

    public final int hashCode() {
        TagPanelConfig tagPanelConfig = this.tagPanelConfig;
        if (tagPanelConfig == null) {
            return 0;
        }
        return tagPanelConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImPublicGroupTagConfigModel(tagPanelConfig=");
        sbLIZ.append(this.tagPanelConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImPublicGroupTagConfigModel(TagPanelConfig tagPanelConfig) {
        this.tagPanelConfig = tagPanelConfig;
    }
}
