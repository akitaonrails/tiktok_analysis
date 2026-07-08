package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class NoticeDisableInfo {

    @C09CT("disable_details")
    @C09CS(StringJsonAdapterFactory.class)
    public Map<String, Integer> disableDetails;

    @C09CT("disable_type")
    public Integer disableType;

    @C09CT("feedback_dialog_info")
    public final NoticeDisableDialogInfo feedbackDialogInfo;

    @C09CT("turn_off_dialog_info")
    public final NoticeDisableDialogInfo turnOffDialogInfo;

    @C09CT("turn_on_dialog_info")
    public final NoticeDisableDialogInfo turnOnDialogInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeDisableInfo)) {
            return false;
        }
        NoticeDisableInfo noticeDisableInfo = (NoticeDisableInfo) obj;
        return Intrinsics.LJFF(this.disableDetails, noticeDisableInfo.disableDetails) && Intrinsics.LJFF(this.turnOffDialogInfo, noticeDisableInfo.turnOffDialogInfo) && Intrinsics.LJFF(this.turnOnDialogInfo, noticeDisableInfo.turnOnDialogInfo) && Intrinsics.LJFF(this.disableType, noticeDisableInfo.disableType) && Intrinsics.LJFF(this.feedbackDialogInfo, noticeDisableInfo.feedbackDialogInfo);
    }

    public NoticeDisableInfo(Map<String, Integer> map, NoticeDisableDialogInfo noticeDisableDialogInfo, NoticeDisableDialogInfo noticeDisableDialogInfo2, Integer num, NoticeDisableDialogInfo noticeDisableDialogInfo3) {
        this.disableDetails = map;
        this.turnOffDialogInfo = noticeDisableDialogInfo;
        this.turnOnDialogInfo = noticeDisableDialogInfo2;
        this.disableType = num;
        this.feedbackDialogInfo = noticeDisableDialogInfo3;
    }
}
