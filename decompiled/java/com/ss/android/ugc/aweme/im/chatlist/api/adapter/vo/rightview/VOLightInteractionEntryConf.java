package com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class VOLightInteractionEntryConf implements Serializable {

    @C09CT("dark_mode_url")
    public final String darkModeUrl;

    @C09CT("hint")
    public final String hint;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("interaction_name")
    public final String interactionName;

    @C09CT("light_mode_url")
    public final String lightModeUrl;

    @C09CT("text")
    public final String text;

    public VOLightInteractionEntryConf() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VOLightInteractionEntryConf)) {
            return false;
        }
        VOLightInteractionEntryConf vOLightInteractionEntryConf = (VOLightInteractionEntryConf) obj;
        return Intrinsics.LJFF(this.iconUrl, vOLightInteractionEntryConf.iconUrl) && Intrinsics.LJFF(this.lightModeUrl, vOLightInteractionEntryConf.lightModeUrl) && Intrinsics.LJFF(this.darkModeUrl, vOLightInteractionEntryConf.darkModeUrl) && Intrinsics.LJFF(this.text, vOLightInteractionEntryConf.text) && Intrinsics.LJFF(this.interactionName, vOLightInteractionEntryConf.interactionName) && Intrinsics.LJFF(this.hint, vOLightInteractionEntryConf.hint);
    }

    public VOLightInteractionEntryConf(String str, String str2, String str3, String str4, String str5, String str6) {
        this.iconUrl = str;
        this.lightModeUrl = str2;
        this.darkModeUrl = str3;
        this.text = str4;
        this.interactionName = str5;
        this.hint = str6;
    }
}
