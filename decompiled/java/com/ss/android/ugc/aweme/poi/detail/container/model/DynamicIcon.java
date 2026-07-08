package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C2248361CzK;
import X.C698190Ra5;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class DynamicIcon implements Serializable {

    @C09CT("dark_mode_url")
    public final String darkModeUrl;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("tux_token")
    public final String tuxToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicIcon)) {
            return false;
        }
        DynamicIcon dynamicIcon = (DynamicIcon) obj;
        return Intrinsics.LJFF(this.tuxToken, dynamicIcon.tuxToken) && Intrinsics.LJFF(this.imageUrl, dynamicIcon.imageUrl) && Intrinsics.LJFF(this.darkModeUrl, dynamicIcon.darkModeUrl);
    }

    public int hashCode() {
        String str = this.tuxToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkModeUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicIcon(tuxToken=");
        sbLIZ.append(this.tuxToken);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", darkModeUrl=");
        sbLIZ.append(this.darkModeUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C698190Ra5 parseDynamicToken(Context context) {
        if (context == null) {
            return null;
        }
        try {
            C01GW c01gw = C2248361CzK.LIZ;
            String str = this.tuxToken;
            if (str == null) {
                str = "";
            }
            return C2248361CzK.LJFF(context, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final Integer parseDynamicIcon(Context context, Integer num) {
        if (context == null) {
            return num;
        }
        try {
            C01GW c01gw = C2248361CzK.LIZ;
            String str = this.tuxToken;
            if (str == null) {
                str = "";
            }
            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(context, str);
            if (c698190Ra5LJFF != null) {
                num = Integer.valueOf(c698190Ra5LJFF.LIZ);
                return num;
            }
            return num;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return num;
        }
    }

    public DynamicIcon(String str, String str2, String str3) {
        this.tuxToken = str;
        this.imageUrl = str2;
        this.darkModeUrl = str3;
    }
}
