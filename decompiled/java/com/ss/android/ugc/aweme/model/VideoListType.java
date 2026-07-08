package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class VideoListType {
    public static final /* synthetic */ VideoListType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("1")
    public static final VideoListType VIDEO_LIST_TYPE_CTA;

    @C09CT("2")
    public static final VideoListType VIDEO_LIST_TYPE_PLAY_NEXT;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final VideoListType VIDEO_LIST_TYPE_SDP;
    public final int LL;

    public static InterfaceC2044707zh<VideoListType> getEntries() {
        return LLILLL;
    }

    static {
        VideoListType videoListType = new VideoListType("VIDEO_LIST_TYPE_SDP", 0, 0);
        VIDEO_LIST_TYPE_SDP = videoListType;
        VideoListType videoListType2 = new VideoListType("VIDEO_LIST_TYPE_CTA", 1, 1);
        VIDEO_LIST_TYPE_CTA = videoListType2;
        VideoListType videoListType3 = new VideoListType("VIDEO_LIST_TYPE_PLAY_NEXT", 2, 2);
        VIDEO_LIST_TYPE_PLAY_NEXT = videoListType3;
        VideoListType[] videoListTypeArr = {videoListType, videoListType2, videoListType3};
        LLILLJJLI = videoListTypeArr;
        LLILLL = new C2254308sP(videoListTypeArr);
    }

    public static VideoListType[] values() {
        return (VideoListType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static VideoListType valueOf(String str) {
        return (VideoListType) C08FF.LIZ(VideoListType.class, str);
    }

    public VideoListType(String str, int i, int i2) {
        this.LL = i2;
    }
}
