package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class NoticeMessageData implements Serializable {

    @C09CT("message_button_name")
    public final String messageButtonName;

    @C09CT("message_button_type")
    public final int messageButtonType;

    public NoticeMessageData() {
        this(0, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeMessageData)) {
            return false;
        }
        NoticeMessageData noticeMessageData = (NoticeMessageData) obj;
        return this.messageButtonType == noticeMessageData.messageButtonType && Intrinsics.LJFF(this.messageButtonName, noticeMessageData.messageButtonName);
    }

    public NoticeMessageData(int i, String str) {
        this.messageButtonType = i;
        this.messageButtonName = str;
    }
}
