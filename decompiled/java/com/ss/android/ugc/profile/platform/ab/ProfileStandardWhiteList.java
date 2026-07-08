package com.ss.android.ugc.profile.platform.ab;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ProfileStandardWhiteList implements Serializable {
    public static final int $stable = 8;

    @C09CT("white_list")
    public List<ProfileWhiteComponent> whiteList;

    public final List<ProfileWhiteComponent> getWhiteList() {
        return this.whiteList;
    }

    public final void setWhiteList(List<ProfileWhiteComponent> list) {
        this.whiteList = list;
    }
}
