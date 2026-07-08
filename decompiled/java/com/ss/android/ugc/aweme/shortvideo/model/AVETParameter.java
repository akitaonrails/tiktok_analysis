package com.ss.android.ugc.aweme.shortvideo.model;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AVETParameter implements Serializable {
    public int draftId;
    public int picCnt;
    public int shootMode;
    public int videoCnt;
    public long videoLength;
    public String creationId = "";
    public String newDraftId = "";
    public String shootWay = "";
    public String shootTabName = "";
    public String storySceneId = "";
    public String contentType = "video";
    public String contentSource = "shoot";
    public String storyShootEntrance = "";
    public int original = -1;
    public String enterFrom = "";

    public final boolean getAfterPost() {
        return Intrinsics.LJFF(this.enterFrom, "edit_post_page");
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftId() {
        return this.draftId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getNewDraftId() {
        return this.newDraftId;
    }

    public final int getOriginal() {
        return this.original;
    }

    public final int getPicCnt() {
        return this.picCnt;
    }

    public final int getShootMode() {
        return this.shootMode;
    }

    public final String getShootTabName() {
        return this.shootTabName;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStorySceneId() {
        return this.storySceneId;
    }

    public final String getStoryShootEntrance() {
        return this.storyShootEntrance;
    }

    public final int getVideoCnt() {
        return this.videoCnt;
    }

    public final long getVideoLength() {
        return this.videoLength;
    }

    public final void setContentSource(String str) {
        this.contentSource = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setDraftId(int i) {
        this.draftId = i;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setNewDraftId(String str) {
        this.newDraftId = str;
    }

    public final void setOriginal(int i) {
        this.original = i;
    }

    public final void setPicCnt(int i) {
        this.picCnt = i;
    }

    public final void setShootMode(int i) {
        this.shootMode = i;
    }

    public final void setShootTabName(String str) {
        this.shootTabName = str;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setStorySceneId(String str) {
        this.storySceneId = str;
    }

    public final void setStoryShootEntrance(String str) {
        this.storyShootEntrance = str;
    }

    public final void setVideoCnt(int i) {
        this.videoCnt = i;
    }

    public final void setVideoLength(long j) {
        this.videoLength = j;
    }
}
