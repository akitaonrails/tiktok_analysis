package com.ss.android.ugc.aweme.music.model;

import X.C13LQ;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicInfo implements Serializable {
    public static final Companion Companion = new Companion();
    public final String artistNames;
    public final String awemeId;
    public final String buttonText;
    public String clickSource;
    public final String clipId;
    public final DspImageUrlModel cover;
    public final long duration;
    public final String entrance;
    public final boolean isPgc;
    public final TTMLink link;
    public final Map<String, String> logExtraMap;
    public final String musicTitle;
    public final Integer product;
    public final String requestId;
    public final String subtitle;
    public final String title;
    public final String trackId;

    public static final class Companion {
    }

    public final boolean isClickDisk() {
        return Intrinsics.LJFF(this.clickSource, "click_source_disk");
    }

    public final boolean isClickIcon() {
        return Intrinsics.LJFF(this.clickSource, "click_source_icon");
    }

    public final boolean isClickMusicTitle() {
        return Intrinsics.LJFF(this.clickSource, "click_source_music_title");
    }

    public final boolean isInExp() {
        return C13LQ.LJJIJIIJI(this.entrance, new String[]{"for_you_action_sheet", "music_detail_action_sheet", "music_detail_button"}) >= 0;
    }

    public final boolean isTtm() {
        Integer num = this.product;
        return num != null && num.intValue() == 2;
    }

    public final boolean isUX1() {
        return Intrinsics.LJFF(this.entrance, "for_you_action_sheet");
    }

    public final boolean isUX2() {
        return Intrinsics.LJFF(this.entrance, "music_detail_action_sheet");
    }

    public final boolean isUX3() {
        return Intrinsics.LJFF(this.entrance, "music_detail_button");
    }

    public final boolean isPgc() {
        return this.isPgc;
    }

    public final void setClickSource(String str) {
        this.clickSource = str;
    }

    public MusicInfo(String str, String str2, DspImageUrlModel dspImageUrlModel, long j, String str3, TTMLink tTMLink, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, Map<String, String> map, boolean z) {
        this.musicTitle = str;
        this.artistNames = str2;
        this.cover = dspImageUrlModel;
        this.duration = j;
        this.entrance = str3;
        this.link = tTMLink;
        this.clickSource = str4;
        this.trackId = str5;
        this.clipId = str6;
        this.requestId = str7;
        this.awemeId = str8;
        this.product = num;
        this.title = str9;
        this.subtitle = str10;
        this.buttonText = str11;
        this.logExtraMap = map;
        this.isPgc = z;
    }
}
