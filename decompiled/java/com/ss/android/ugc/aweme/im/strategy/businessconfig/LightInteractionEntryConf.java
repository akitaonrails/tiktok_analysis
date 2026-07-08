package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import X.C894910Z8v;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionEntryConf extends IBusinessConfig {
    public static final C894910Z8v Companion = new Object() { // from class: X.0Z8v
    };

    @C09CT("dark_mode_url")
    public final String darkModeUrl;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("inbox_preview")
    public final String inboxPreview;

    @C09CT("interaction_name")
    public final String interactionName;

    @C09CT("light_mode_url")
    public final String lightModeUrl;

    @C09CT("text")
    public final String text;

    public LightInteractionEntryConf() {
        this(null, null, null, null, null, null);
    }

    public final LightInteractionEntryConf copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new LightInteractionEntryConf(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightInteractionEntryConf)) {
            return false;
        }
        LightInteractionEntryConf lightInteractionEntryConf = (LightInteractionEntryConf) obj;
        return Intrinsics.LJFF(this.iconUrl, lightInteractionEntryConf.iconUrl) && Intrinsics.LJFF(this.lightModeUrl, lightInteractionEntryConf.lightModeUrl) && Intrinsics.LJFF(this.darkModeUrl, lightInteractionEntryConf.darkModeUrl) && Intrinsics.LJFF(this.text, lightInteractionEntryConf.text) && Intrinsics.LJFF(this.interactionName, lightInteractionEntryConf.interactionName) && Intrinsics.LJFF(this.inboxPreview, lightInteractionEntryConf.inboxPreview);
    }

    public int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lightModeUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkModeUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.interactionName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.inboxPreview;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LightInteractionEntryConf(iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", lightModeUrl=");
        sbLIZ.append(this.lightModeUrl);
        sbLIZ.append(", darkModeUrl=");
        sbLIZ.append(this.darkModeUrl);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", interactionName=");
        sbLIZ.append(this.interactionName);
        sbLIZ.append(", inboxPreview=");
        sbLIZ.append(this.inboxPreview);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getDarkModeUrl() {
        return this.darkModeUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getInboxPreview() {
        return this.inboxPreview;
    }

    public final String getInteractionName() {
        return this.interactionName;
    }

    public final String getLightModeUrl() {
        return this.lightModeUrl;
    }

    public final String getText() {
        return this.text;
    }

    public LightInteractionEntryConf(String str, String str2, String str3, String str4, String str5, String str6) {
        this.iconUrl = str;
        this.lightModeUrl = str2;
        this.darkModeUrl = str3;
        this.text = str4;
        this.interactionName = str5;
        this.inboxPreview = str6;
    }
}
