package com.ss.android.ugc.aweme.ui.experiment;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PhotoModeDetailTypographyConfig {

    @C09CT("font_table")
    public final Map<String, FontMultipliers> fontTable;

    @C09CT("tiktok_sans")
    public final FontMultipliers tiktokSans;

    public PhotoModeDetailTypographyConfig() {
        this(null, C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeDetailTypographyConfig)) {
            return false;
        }
        PhotoModeDetailTypographyConfig photoModeDetailTypographyConfig = (PhotoModeDetailTypographyConfig) obj;
        return Intrinsics.LJFF(this.tiktokSans, photoModeDetailTypographyConfig.tiktokSans) && Intrinsics.LJFF(this.fontTable, photoModeDetailTypographyConfig.fontTable);
    }

    public final int hashCode() {
        FontMultipliers fontMultipliers = this.tiktokSans;
        return ((fontMultipliers == null ? 0 : fontMultipliers.hashCode()) * 31) + this.fontTable.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeDetailTypographyConfig(tiktokSans=");
        sbLIZ.append(this.tiktokSans);
        sbLIZ.append(", fontTable=");
        sbLIZ.append(this.fontTable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhotoModeDetailTypographyConfig(FontMultipliers fontMultipliers, Map<String, FontMultipliers> map) {
        this.tiktokSans = fontMultipliers;
        this.fontTable = map;
    }
}
