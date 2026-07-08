package com.bytedance.ies.sdk.widgets;

/* JADX INFO: loaded from: classes18.dex */
public interface PropertyResolver {
    void decreaseContentView();

    float getResolvedAlpha(int i);

    float getResolvedTranslationX(int i);

    float getResolvedTranslationY(int i);

    int getResolvedVisibility(int i);

    void increaseContentView();

    void onHiddenChanged(int i, boolean z);
}
