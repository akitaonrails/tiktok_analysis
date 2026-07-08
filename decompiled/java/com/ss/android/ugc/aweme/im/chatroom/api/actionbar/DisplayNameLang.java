package com.ss.android.ugc.aweme.im.chatroom.api.actionbar;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DisplayNameLang {

    @C09CT("en")
    public final String en;

    @C09CT("local")
    public final String local;

    public DisplayNameLang() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayNameLang)) {
            return false;
        }
        DisplayNameLang displayNameLang = (DisplayNameLang) obj;
        return Intrinsics.LJFF(this.en, displayNameLang.en) && Intrinsics.LJFF(this.local, displayNameLang.local);
    }

    public DisplayNameLang(String str, String str2) {
        this.en = str;
        this.local = str2;
    }
}
