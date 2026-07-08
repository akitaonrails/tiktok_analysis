package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VideoCardContent {

    @C09CT("video")
    public final List<VideoBlock> video;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoCardContent) && Intrinsics.LJFF(this.video, ((VideoCardContent) obj).video);
    }

    public final int hashCode() {
        List<VideoBlock> list = this.video;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCardContent(video=");
        sbLIZ.append(this.video);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoCardContent(List<VideoBlock> list) {
        this.video = list;
    }
}
