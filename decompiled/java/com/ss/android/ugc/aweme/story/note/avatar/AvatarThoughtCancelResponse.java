package com.ss.android.ugc.aweme.story.note.avatar;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarThoughtCancelResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("tasks")
    public final List<Object> tasks;

    public final AvatarThoughtCancelResponse copy(List<Object> list) {
        return new AvatarThoughtCancelResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarThoughtCancelResponse) && Intrinsics.LJFF(this.tasks, ((AvatarThoughtCancelResponse) obj).tasks);
    }

    public int hashCode() {
        List<Object> list = this.tasks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarThoughtCancelResponse(tasks=");
        sbLIZ.append(this.tasks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Object> getTasks() {
        return this.tasks;
    }

    public AvatarThoughtCancelResponse(List<Object> list) {
        this.tasks = list;
    }
}
