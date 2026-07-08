package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class FakeDataInfo implements Serializable {

    @C09CT("fake_nickname")
    public String fakeNickname;

    @C09CT("fake_username")
    public String fakeUsername;

    @C09CT("is_fake_avatar")
    public Boolean isFakeAvatar;

    @C09CT("is_fake_bio")
    public Boolean isFakeBio;

    public FakeDataInfo() {
    }

    public final Boolean isFakeAvatar() {
        return this.isFakeAvatar;
    }

    public final Boolean isFakeBio() {
        return this.isFakeBio;
    }

    public FakeDataInfo(String str, String str2, Boolean bool, Boolean bool2) {
        this.fakeNickname = str;
        this.fakeUsername = str2;
        this.isFakeAvatar = bool;
        this.isFakeBio = bool2;
    }
}
