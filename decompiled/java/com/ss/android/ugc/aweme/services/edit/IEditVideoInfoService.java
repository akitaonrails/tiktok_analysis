package com.ss.android.ugc.aweme.services.edit;

/* JADX INFO: loaded from: classes6.dex */
public interface IEditVideoInfoService {
    VideoInfoData getVideoInfoData(String str);

    Long getVideoLength(String str);

    void setVideoInfoData(String str, VideoInfoData videoInfoData);

    void setVideoLength(String str, long j);
}
