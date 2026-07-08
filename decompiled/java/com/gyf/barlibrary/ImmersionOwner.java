package com.gyf.barlibrary;

/* JADX INFO: loaded from: classes30.dex */
public interface ImmersionOwner {
    boolean immersionBarEnabled();

    void initImmersionBar();

    void onInvisible();

    void onLazyAfterView();

    void onLazyBeforeView();

    void onVisible();
}
