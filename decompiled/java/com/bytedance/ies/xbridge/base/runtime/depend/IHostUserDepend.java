package com.bytedance.ies.xbridge.base.runtime.depend;

import X.InterfaceC1871530ynn;
import X.InterfaceC1874730ysx;
import android.app.Activity;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface IHostUserDepend {
    String getAvatarURL();

    String getBoundEmail();

    String getBoundPhone();

    List<String> getBoundThirdPartyPlatforms();

    String getNickname();

    String getSecUid();

    String getUniqueID();

    String getUserId();

    UserModelExt getUserModelExt();

    boolean hasLogin();

    boolean isCurUserOrgAccount();

    boolean isOrgAccConvInterPeriod();

    void login(Activity activity, InterfaceC1874730ysx interfaceC1874730ysx, Map<String, String> map);

    void login(Activity activity, InterfaceC1874730ysx interfaceC1874730ysx, Map<String, String> map, LoginParamsExt loginParamsExt);

    void logout(Activity activity, InterfaceC1871530ynn interfaceC1871530ynn, Map<String, String> map);

    public static final class LoginParamsExt {
        public boolean keepOpen = true;

        public final boolean getKeepOpen() {
            return this.keepOpen;
        }

        public final void setKeepOpen(boolean z) {
            this.keepOpen = z;
        }
    }

    public static final class UserModelExt {
        public String shortID;

        public final String getShortID() {
            return this.shortID;
        }

        public final void setShortID(String str) {
            this.shortID = str;
        }
    }
}
