package com.ss.android.ugc.tiktok.privacy.api.phl.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PrivacyHighlightsForTeensDescription {

    @C09CT("link")
    public final String link;

    @C09CT("link_name")
    public final String linkName;

    @C09CT("name")
    public final String name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyHighlightsForTeensDescription)) {
            return false;
        }
        PrivacyHighlightsForTeensDescription privacyHighlightsForTeensDescription = (PrivacyHighlightsForTeensDescription) obj;
        return Intrinsics.LJFF(this.name, privacyHighlightsForTeensDescription.name) && Intrinsics.LJFF(this.linkName, privacyHighlightsForTeensDescription.linkName) && Intrinsics.LJFF(this.link, privacyHighlightsForTeensDescription.link);
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + this.linkName.hashCode()) * 31) + this.link.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyHighlightsForTeensDescription(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", linkName=");
        sbLIZ.append(this.linkName);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyHighlightsForTeensDescription() {
        this("", "", "");
    }

    public PrivacyHighlightsForTeensDescription(String str, String str2, String str3) {
        this.name = str;
        this.linkName = str2;
        this.link = str3;
    }
}
