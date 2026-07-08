package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class KeySegmentInfo implements Serializable {

    @C09CT("second_end")
    public int secondEnd;

    @C09CT("segment_cover")
    public UrlStruct segmentCover;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("sub_title_playing")
    public String subTitlePlaying;

    @C09CT("title")
    public String title;

    @C09CT("title_playing")
    public String titlePlaying;

    @C09CT("second_start")
    public int secondStart = -1;

    @C09CT("index_start")
    public int indexStart = -1;

    public int getIndexStart() {
        return this.indexStart;
    }

    public int getSecondEnd() {
        return this.secondEnd;
    }

    public int getSecondStart() {
        return this.secondStart;
    }

    public UrlStruct getSegmentCover() {
        return this.segmentCover;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getSubTitlePlaying() {
        return this.subTitlePlaying;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitlePlaying() {
        return this.titlePlaying;
    }

    public void setIndexStart(int i) {
        this.indexStart = i;
    }

    public void setSecondEnd(int i) {
        this.secondEnd = i;
    }

    public void setSecondStart(int i) {
        this.secondStart = i;
    }

    public void setSegmentCover(UrlStruct urlStruct) {
        this.segmentCover = urlStruct;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setSubTitlePlaying(String str) {
        this.subTitlePlaying = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitlePlaying(String str) {
        this.titlePlaying = str;
    }
}
