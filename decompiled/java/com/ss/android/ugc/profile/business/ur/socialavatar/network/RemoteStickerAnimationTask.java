package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class RemoteStickerAnimationTask {

    @C09CT("task_status")
    public final Integer status;

    @C09CT("sticker_id")
    public final Long stickerId;

    @C09CT("task_id")
    public final String taskId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteStickerAnimationTask)) {
            return false;
        }
        RemoteStickerAnimationTask remoteStickerAnimationTask = (RemoteStickerAnimationTask) obj;
        return Intrinsics.LJFF(this.taskId, remoteStickerAnimationTask.taskId) && Intrinsics.LJFF(this.status, remoteStickerAnimationTask.status) && Intrinsics.LJFF(this.stickerId, remoteStickerAnimationTask.stickerId);
    }

    public final int hashCode() {
        String str = this.taskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.stickerId;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteStickerAnimationTask(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.stickerId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RemoteStickerAnimationTask(String str, Integer num, Long l) {
        this.taskId = str;
        this.status = num;
        this.stickerId = l;
    }
}
