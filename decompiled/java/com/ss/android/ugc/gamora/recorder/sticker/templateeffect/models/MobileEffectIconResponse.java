package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class MobileEffectIconResponse {

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("icon_list")
    public final List<MobileEffectIcon> iconList;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    public MobileEffectIconResponse() {
        this(0, null, 0, null, 15, null);
    }

    public MobileEffectIconResponse(int i, String str, int i2, List<MobileEffectIcon> list) {
        this.statusCode = i;
        this.message = str;
        this.errorCode = i2;
        this.iconList = list;
    }

    public MobileEffectIconResponse(int i, String str, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
