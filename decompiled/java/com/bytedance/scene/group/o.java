package com.bytedance.scene.group;

import X.InterfaceC214877197j;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes30.dex */
public final class o extends View {
    public String LL;
    public String LLILLJJLI;
    public Bundle LLILLL;
    public InterfaceC214877197j LLILZ;

    public String getSceneName() {
        if (TextUtils.isEmpty(this.LL)) {
            throw new IllegalArgumentException("ScenePlaceHolderView name is empty, invoke setSceneName first");
        }
        return this.LL;
    }

    public String getSceneTag() {
        if (TextUtils.isEmpty(this.LLILLJJLI)) {
            throw new IllegalArgumentException("ScenePlaceHolderView tag is empty, invoke setSceneTag first");
        }
        return this.LLILLJJLI;
    }

    public Bundle getArguments() {
        return this.LLILLL;
    }

    public InterfaceC214877197j getSceneComponentFactory() {
        return this.LLILZ;
    }

    public void setArguments(Bundle bundle) {
        this.LLILLL = bundle;
    }

    public void setSceneComponentFactory(InterfaceC214877197j interfaceC214877197j) {
        this.LLILZ = interfaceC214877197j;
    }

    public void setSceneName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LL = str;
            return;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView name can't be empty");
    }

    public void setSceneTag(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LLILLJJLI = str;
            return;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView tag can't be empty");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                suggestedMinimumWidth = size;
            }
        } else {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                suggestedMinimumHeight = size2;
            }
        } else {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }
}
