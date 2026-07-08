package com.ss.android.ugc.aweme.sticker.bean;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class TemplateStickerState {
    public static final int $stable = 8;
    public MutableLiveData<Pair<String, View>> clickEvent;
    public MutableLiveData<String> showEvent;

    public TemplateStickerState() {
        this(new MutableLiveData(), new MutableLiveData());
    }

    public final MutableLiveData<Pair<String, View>> getClickEvent() {
        return this.clickEvent;
    }

    public final MutableLiveData<String> getShowEvent() {
        return this.showEvent;
    }

    public final void setClickEvent(MutableLiveData<Pair<String, View>> mutableLiveData) {
        this.clickEvent = mutableLiveData;
    }

    public final void setShowEvent(MutableLiveData<String> mutableLiveData) {
        this.showEvent = mutableLiveData;
    }

    public TemplateStickerState(MutableLiveData<Pair<String, View>> mutableLiveData, MutableLiveData<String> mutableLiveData2) {
        this.clickEvent = mutableLiveData;
        this.showEvent = mutableLiveData2;
    }
}
