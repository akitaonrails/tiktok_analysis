package com.ss.android.ugc.aweme.services.external.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public final class StickerDownloadConfig {
    public static final Companion Companion = new Companion();
    public final String musicId;
    public final Boolean musicPostUnavailable;
    public final String musicUrl;
    public Function1<? super Integer, Unit> onFail;
    public Function0<Unit> onSuccess;
    public final String region;
    public final String stickerId;
    public Integer type = 0;
    public int enterFromType = 10002;
    public int sourceId = 1;

    public static final class Companion {
    }

    public final int getEnterFromType() {
        return this.enterFromType;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final Boolean getMusicPostUnavailable() {
        return this.musicPostUnavailable;
    }

    public final String getMusicUrl() {
        return this.musicUrl;
    }

    public final Function1<Integer, Unit> getOnFail() {
        return this.onFail;
    }

    public final Function0<Unit> getOnSuccess() {
        return this.onSuccess;
    }

    public final String getRegion() {
        return this.region;
    }

    public final int getSourceId() {
        return this.sourceId;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setEnterFromType(int i) {
        this.enterFromType = i;
    }

    public final void setOnFail(Function1<? super Integer, Unit> function1) {
        this.onFail = function1;
    }

    public final void setOnSuccess(Function0<Unit> function0) {
        this.onSuccess = function0;
    }

    public final void setSourceId(int i) {
        this.sourceId = i;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public StickerDownloadConfig(String str, String str2, String str3, String str4, Boolean bool) {
        this.stickerId = str;
        this.region = str2;
        this.musicId = str3;
        this.musicUrl = str4;
        this.musicPostUnavailable = bool;
    }
}
