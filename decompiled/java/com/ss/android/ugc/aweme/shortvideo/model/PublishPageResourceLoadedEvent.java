package com.ss.android.ugc.aweme.shortvideo.model;

import X.C560530Lyd;
import com.bytedance.als.LiveEvent;

/* JADX INFO: loaded from: classes26.dex */
public final class PublishPageResourceLoadedEvent {
    public static final int $stable = 8;
    public final C560530Lyd<Integer> _onChange;
    public final LiveEvent<Integer> onChange;

    public final void triggerLoaded() {
        C560530Lyd<Integer> c560530Lyd = this._onChange;
        Integer numLJI = c560530Lyd.LJI();
        c560530Lyd.LJIIJ(Integer.valueOf((numLJI != null ? numLJI.intValue() : 0) + 1));
    }

    public PublishPageResourceLoadedEvent() {
        C560530Lyd<Integer> c560530Lyd = new C560530Lyd<>();
        this._onChange = c560530Lyd;
        this.onChange = c560530Lyd;
    }

    public final LiveEvent<Integer> getOnChange() {
        return this.onChange;
    }
}
