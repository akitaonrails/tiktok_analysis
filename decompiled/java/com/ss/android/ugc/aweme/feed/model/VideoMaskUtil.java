package com.ss.android.ugc.aweme.feed.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoMaskUtil {
    public static final VideoMaskUtil INSTANCE = new VideoMaskUtil();
    public static final VideoMaskInfo emptyVideoMaskInfo = new VideoMaskInfo(Boolean.FALSE, 0, null, null, null, "", "", "", null);

    public final VideoMaskInfo getEmptyVideoMaskInfo() {
        return emptyVideoMaskInfo;
    }

    public final VideoMaskInfo getMaskInfo(List<VideoMaskInfo> list, int i) {
        for (VideoMaskInfo videoMaskInfo : list) {
            Integer num = videoMaskInfo.maskType;
            if (num != null && num.intValue() == i) {
                return videoMaskInfo;
            }
        }
        return emptyVideoMaskInfo;
    }
}
