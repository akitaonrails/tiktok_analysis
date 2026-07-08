package com.bytedance.pipo.verify.base.model;

import X.C09CT;
import com.bytedance.pipo.verify.base.model.response.PopupContent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class StatusReason {

    @C09CT("button")
    public final List<PopupContent> button;

    @C09CT("reason_code")
    public final Integer reasonCode;

    @C09CT("reason_msg")
    public final String reasonMsg;

    @C09CT("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusReason)) {
            return false;
        }
        StatusReason statusReason = (StatusReason) obj;
        return Intrinsics.LJFF(this.reasonCode, statusReason.reasonCode) && Intrinsics.LJFF(this.reasonMsg, statusReason.reasonMsg) && Intrinsics.LJFF(this.title, statusReason.title) && Intrinsics.LJFF(this.button, statusReason.button);
    }

    public StatusReason(Integer num, String str, String str2, List<PopupContent> list) {
        this.reasonCode = num;
        this.reasonMsg = str;
        this.title = str2;
        this.button = list;
    }
}
