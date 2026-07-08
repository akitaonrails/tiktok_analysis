package com.ss.android.ugc.aweme.compliance.api.services.consent.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ConsentLabelConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("change_region")
    public final TextWithInlineLink changeRegion;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default_config")
    public final TextWithInlineLink f52default;

    @C09CT("kids_mode")
    public final TextWithInlineLink kidsMode;

    public ConsentLabelConfig() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentLabelConfig)) {
            return false;
        }
        ConsentLabelConfig consentLabelConfig = (ConsentLabelConfig) obj;
        return Intrinsics.LJFF(this.f52default, consentLabelConfig.f52default) && Intrinsics.LJFF(this.changeRegion, consentLabelConfig.changeRegion) && Intrinsics.LJFF(this.kidsMode, consentLabelConfig.kidsMode);
    }

    public int hashCode() {
        TextWithInlineLink textWithInlineLink = this.f52default;
        int iHashCode = (textWithInlineLink == null ? 0 : textWithInlineLink.hashCode()) * 31;
        TextWithInlineLink textWithInlineLink2 = this.changeRegion;
        int iHashCode2 = (iHashCode + (textWithInlineLink2 == null ? 0 : textWithInlineLink2.hashCode())) * 31;
        TextWithInlineLink textWithInlineLink3 = this.kidsMode;
        return iHashCode2 + (textWithInlineLink3 != null ? textWithInlineLink3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsentLabelConfig(default=");
        sbLIZ.append(this.f52default);
        sbLIZ.append(", changeRegion=");
        sbLIZ.append(this.changeRegion);
        sbLIZ.append(", kidsMode=");
        sbLIZ.append(this.kidsMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ConsentLabelConfig(TextWithInlineLink textWithInlineLink, TextWithInlineLink textWithInlineLink2, TextWithInlineLink textWithInlineLink3) {
        this.f52default = textWithInlineLink;
        this.changeRegion = textWithInlineLink2;
        this.kidsMode = textWithInlineLink3;
    }
}
