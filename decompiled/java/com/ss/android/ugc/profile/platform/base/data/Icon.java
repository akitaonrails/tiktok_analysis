package com.ss.android.ugc.profile.platform.base.data;

import X.C04TD;
import X.C09CT;
import X.C1248280iaY;
import X.C1266210j3T;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1720106oR;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C844470XAv;
import X.C960203pA;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.profile.platform.base.utils.ProfileStandardDataHelper;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class Icon implements Serializable {
    public final String LL = "Profile.Icon";

    @C09CT("icon_color")
    public String iconColor;

    @C09CT("icon_key")
    public String localIcon;

    @C09CT("icon_url")
    public String remoteIcon;

    @C09CT("icon_url_dark")
    public String remoteIconDark;

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getLocalIcon() {
        return this.localIcon;
    }

    public final String getRemoteIcon() {
        return this.remoteIcon;
    }

    public final String getRemoteIconDark() {
        return this.remoteIconDark;
    }

    public final String getTag() {
        return this.LL;
    }

    public final String getIconUrl(Context context) {
        if (C960203pA.LIZIZ(context)) {
            return this.remoteIconDark;
        }
        return this.remoteIcon;
    }

    public final void setIconColor(String str) {
        this.iconColor = str;
    }

    public final void setLocalIcon(String str) {
        this.localIcon = str;
    }

    public final void setRemoteIcon(String str) {
        this.remoteIcon = str;
    }

    public final void setRemoteIconDark(String str) {
        this.remoteIconDark = str;
    }

    public final Integer getIconInt(String str, Integer num) {
        IProfileDataCacheHelper profileStandardDataHelper;
        String str2;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        boolean z;
        try {
            String str3 = this.localIcon;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                int iN3 = C786410Ut5.n3(contextLIZ.getResources(), this.localIcon, str, contextLIZ.getPackageName());
                if (iN3 == 0) {
                    return num;
                }
                return Integer.valueOf(iN3);
            }
            return num;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            String str4 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getIconInt error, type: ");
            sbLIZ.append(str);
            sbLIZ.append(", exp: ");
            sbLIZ.append(th.getMessage());
            C1720106oR.LIZ(str4, C2188811AlT.LIZIZ(sbLIZ));
            C1248280iaY c1248280iaY = C1248280iaY.LIZ;
            String message = th.getMessage();
            if (message == null) {
                message = "get local icon error";
            }
            String str5 = this.localIcon;
            c1248280iaY.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("profile_attributes", C1248280iaY.LIZIZ);
            c2344009Gk.LJIIIIZZ("report_scene", "profile_icon_error");
            c2344009Gk.LJIIIIZZ("error_msg", message);
            c2344009Gk.LJIIIIZZ("icon_name", str5);
            Object objLIZ = C04TD.LIZ(IProfileDataCacheHelper.class, false);
            if (objLIZ != null) {
                profileStandardDataHelper = (IProfileDataCacheHelper) objLIZ;
            } else {
                profileStandardDataHelper = new ProfileStandardDataHelper();
            }
            ProfileUser profileUserLIZ = profileStandardDataHelper.LIZ();
            if (profileUserLIZ != null && (serverTimeExtra = profileUserLIZ.extra) != null) {
                str2 = serverTimeExtra.logid;
            } else {
                str2 = null;
            }
            c2344009Gk.LJIIIIZZ("log_id", str2);
            C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
            return num;
        }
    }

    public static /* synthetic */ Integer getIconInt$default(Icon icon, String str, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "raw";
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return icon.getIconInt(str, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIconInt");
    }

    public final void setIconToImageView(TuxIconView tuxIconView, String str, Integer num, Integer num2, Integer num3, Integer num4, boolean z, Function0<Unit> function0) {
        String iconUrl;
        int width;
        int height;
        Context context = tuxIconView.getContext();
        if (context != null) {
            iconUrl = getIconUrl(context);
        } else {
            iconUrl = null;
        }
        int iIntValue = 0;
        if (iconUrl != null && iconUrl.length() != 0) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(iconUrl);
            c1331670kl3LJIIIZ.LJJI(tuxIconView);
            c1331670kl3LJIIIZ.LJJIIZI(tuxIconView.getDrawable());
            c1331670kl3LJIIIZ.LJIIJ(new C1266210j3T(function0, 1));
            return;
        }
        if (z) {
            Integer iconInt = getIconInt(str, num);
            if (iconInt != null) {
                iIntValue = iconInt.intValue();
            }
            tuxIconView.setIconRes(iIntValue);
        } else {
            C419910GdJ c419910GdJ = new C419910GdJ();
            Integer iconInt2 = getIconInt(str, num);
            if (iconInt2 != null) {
                iIntValue = iconInt2.intValue();
            }
            c419910GdJ.LIZ = iIntValue;
            if (num3 != null) {
                width = num3.intValue();
            } else {
                width = tuxIconView.getWidth();
            }
            c419910GdJ.LIZIZ = width;
            if (num4 != null) {
                height = num4.intValue();
            } else {
                height = tuxIconView.getHeight();
            }
            c419910GdJ.LIZJ = height;
            if (num2 != null) {
                c419910GdJ.LJ = num2;
            }
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setIconToImageView$default(Icon icon, TuxIconView tuxIconView, String str, Integer num, Integer num2, Integer num3, Integer num4, boolean z, Function0 function0, int i, Object obj) {
        boolean z2 = z;
        Integer num5 = num4;
        Integer num6 = num3;
        Integer num7 = num2;
        Integer num8 = num;
        String str2 = str;
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = "raw";
            }
            Function0 function02 = null;
            if ((i & 4) != 0) {
                num8 = null;
            }
            if ((i & 8) != 0) {
                num7 = null;
            }
            if ((i & 16) != 0) {
                num6 = null;
            }
            if ((i & 32) != 0) {
                num5 = null;
            }
            if ((i & 64) != 0) {
                z2 = false;
            }
            if ((i & 128) == 0) {
                function02 = function0;
            }
            icon.setIconToImageView(tuxIconView, str2, num8, num7, num6, num5, z2, function02);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIconToImageView");
    }
}
