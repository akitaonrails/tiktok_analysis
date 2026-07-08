package com.bytedance.live.render.engine.alphaplayer.api;

import X.C006A;
import X.InterfaceC2246731Cwh;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes36.dex */
public interface ILiveGiftAlphaPlayerService extends C006A {
    Object buildDelegateGiftPlayListener(InterfaceC2246731Cwh interfaceC2246731Cwh);

    void clearMasks(Object obj);

    Object createLiveGiftPlayController(Context context, LifecycleOwner lifecycleOwner, Object obj, ViewGroup viewGroup);

    View getAlphaView(Object obj);

    /* bridge */ /* synthetic */ void onInit();

    void releasePlayer(Object obj, Object obj2, ViewGroup viewGroup);

    void setAutoReleaseParam(Object obj, boolean z);

    void setImageMask(Object obj, String str, Bitmap bitmap, float f);

    void setKeepLastFrame(Object obj, boolean z);

    void setLoopParam(Object obj, boolean z);

    void setMute(Object obj, boolean z);

    void setTransparentType(Object obj, int i);

    Object start(Object obj, String str, long j);

    void stop(Object obj);

    void tryCancel(Object obj);

    void tryPreloadFromExternal(Context context, String str);
}
