package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import X.C1248280iaY;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C844470XAv;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class Describe implements Serializable {

    @C09CT("starling_key")
    public String localText;

    @C09CT("text")
    public String remoteText;

    @C09CT("sub_text")
    public String subText;

    @C09CT("sub_text_color")
    public String subTextColor;

    @C09CT("sub_text_font")
    public String subTextFont;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_font")
    public String textFont;

    public final String getText() {
        String str = this.remoteText;
        if (!(str == null || str.length() == 0)) {
            return this.remoteText;
        }
        String str2 = this.localText;
        if (str2 == null || str2.length() == 0) {
            C1248280iaY c1248280iaY = C1248280iaY.LIZ;
            String str3 = this.localText;
            c1248280iaY.getClass();
            C1248280iaY.LIZ("remote and local text are empty", str3);
            return null;
        }
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            int iN3 = C786410Ut5.n3(contextLIZ.getResources(), this.localText, "string", contextLIZ.getPackageName());
            if (iN3 == 0) {
                return null;
            }
            return contextLIZ.getResources().getString(iN3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1248280iaY c1248280iaY2 = C1248280iaY.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get resource exception: ");
            sbLIZ.append(e.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str4 = this.localText;
            c1248280iaY2.getClass();
            C1248280iaY.LIZ(strLIZIZ, str4);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZLLL(e);
            return null;
        }
    }

    public final String getLocalText() {
        return this.localText;
    }

    public final String getRemoteText() {
        return this.remoteText;
    }

    public final String getSubText() {
        return this.subText;
    }

    public final String getSubTextColor() {
        return this.subTextColor;
    }

    public final String getSubTextFont() {
        return this.subTextFont;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextFont() {
        return this.textFont;
    }

    public final void setLocalText(String str) {
        this.localText = str;
    }

    public final void setRemoteText(String str) {
        this.remoteText = str;
    }

    public final void setSubText(String str) {
        this.subText = str;
    }

    public final void setSubTextColor(String str) {
        this.subTextColor = str;
    }

    public final void setSubTextFont(String str) {
        this.subTextFont = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public final void setTextFont(String str) {
        this.textFont = str;
    }
}
