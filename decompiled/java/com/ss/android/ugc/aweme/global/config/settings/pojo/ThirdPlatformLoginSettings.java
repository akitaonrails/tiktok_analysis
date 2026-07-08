package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ThirdPlatformLoginSettings {

    @C09CT("login_jump")
    public List<LoginJumpStruct> loginJump = new ArrayList();

    @C09CT("other_bind_window")
    public List<BindWindowsStruct> otherBindWindow = new ArrayList();

    @C09CT("profile_bind_window")
    public List<BindWindowsStruct> profileBindWindow = new ArrayList();

    public List<LoginJumpStruct> getLoginJump() {
        return this.loginJump;
    }

    public List<BindWindowsStruct> getOtherBindWindow() {
        return this.otherBindWindow;
    }

    public List<BindWindowsStruct> getProfileBindWindow() {
        return this.profileBindWindow;
    }
}
