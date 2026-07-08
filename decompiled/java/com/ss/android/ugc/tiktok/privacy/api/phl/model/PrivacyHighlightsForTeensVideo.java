package com.ss.android.ugc.tiktok.privacy.api.phl.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PrivacyHighlightsForTeensVideo {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("title")
    public final String title;

    @C09CT("video_info")
    public final Video videoInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyHighlightsForTeensVideo)) {
            return false;
        }
        PrivacyHighlightsForTeensVideo privacyHighlightsForTeensVideo = (PrivacyHighlightsForTeensVideo) obj;
        return Intrinsics.LJFF(this.id, privacyHighlightsForTeensVideo.id) && Intrinsics.LJFF(this.title, privacyHighlightsForTeensVideo.title) && Intrinsics.LJFF(this.videoInfo, privacyHighlightsForTeensVideo.videoInfo);
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.videoInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyHighlightsForTeensVideo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", videoInfo=");
        sbLIZ.append(this.videoInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyHighlightsForTeensVideo(String str, String str2, Video video) {
        this.id = str;
        this.title = str2;
        this.videoInfo = video;
    }
}
