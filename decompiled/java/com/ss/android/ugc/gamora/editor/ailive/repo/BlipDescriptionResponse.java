package com.ss.android.ugc.gamora.editor.ailive.repo;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class BlipDescriptionResponse {

    @C09CT("descriptions")
    public final List<String> blipDescription;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    public BlipDescriptionResponse() {
        this(null, 0, null, 7, null);
    }

    public BlipDescriptionResponse(List<String> list, int i, String str) {
        this.blipDescription = list;
        this.statusCode = i;
        this.statusMessage = str;
    }

    public BlipDescriptionResponse(List list, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str);
    }
}
