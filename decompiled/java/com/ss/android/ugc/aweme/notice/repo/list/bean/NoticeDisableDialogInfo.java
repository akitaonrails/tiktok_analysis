package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class NoticeDisableDialogInfo {

    @C09CT("strategy_options")
    public final List<NoticeDisableActionInfo> actionList;

    @C09CT("title")
    public final String title;

    @C09CT("toast")
    public final String toast;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeDisableDialogInfo)) {
            return false;
        }
        NoticeDisableDialogInfo noticeDisableDialogInfo = (NoticeDisableDialogInfo) obj;
        return Intrinsics.LJFF(this.title, noticeDisableDialogInfo.title) && Intrinsics.LJFF(this.actionList, noticeDisableDialogInfo.actionList) && Intrinsics.LJFF(this.toast, noticeDisableDialogInfo.toast);
    }

    public NoticeDisableDialogInfo(String str, List<NoticeDisableActionInfo> list, String str2) {
        this.title = str;
        this.actionList = list;
        this.toast = str2;
    }
}
