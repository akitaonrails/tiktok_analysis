package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class NoticeTextStruct {

    @C09CT("content")
    public final NoticeTextConfig content;

    @C09CT("text_configs")
    public final List<NoticeTextConfig> textConfigs;

    public NoticeTextStruct() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeTextStruct)) {
            return false;
        }
        NoticeTextStruct noticeTextStruct = (NoticeTextStruct) obj;
        return Intrinsics.LJFF(this.content, noticeTextStruct.content) && Intrinsics.LJFF(this.textConfigs, noticeTextStruct.textConfigs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeTextStruct(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", textConfigs=");
        sbLIZ.append(this.textConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NoticeTextStruct(NoticeTextConfig noticeTextConfig, List<NoticeTextConfig> list) {
        this.content = noticeTextConfig;
        this.textConfigs = list;
    }
}
