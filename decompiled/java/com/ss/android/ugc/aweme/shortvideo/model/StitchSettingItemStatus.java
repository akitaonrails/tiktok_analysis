package com.ss.android.ugc.aweme.shortvideo.model;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes29.dex */
public final class StitchSettingItemStatus extends CommonSettingItemStatus {
    public static final int $stable = 8;
    public final MutableLiveData<Boolean> _commerceActive = new MutableLiveData<>(Boolean.FALSE);

    public final MutableLiveData<Boolean> getCommerceActive() {
        return this._commerceActive;
    }
}
