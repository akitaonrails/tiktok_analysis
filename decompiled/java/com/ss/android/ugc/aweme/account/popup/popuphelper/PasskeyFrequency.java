package com.ss.android.ugc.aweme.account.popup.popuphelper;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class PasskeyFrequency {

    @C09CT("does_user_exist")
    public boolean doesUserExist;

    @C09CT("show_time")
    public List<Long> showTime;

    public PasskeyFrequency() {
        this(new ArrayList(), false);
    }

    public PasskeyFrequency(List<Long> list, boolean z) {
        this.showTime = list;
        this.doesUserExist = z;
    }
}
