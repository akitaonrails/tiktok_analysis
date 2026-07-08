package com.ss.android.ugc.aweme.ecommercebase.preload;

import X.C1701430uNR;
import X.RunnableC2486009og;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes27.dex */
public class ECAsyncInflaterV2 implements LifecycleEventObserver {
    public static final ConcurrentHashMap<Context, ECAsyncInflaterV2> LLILZLL;
    public final Activity LL;
    public final ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> LLILLJJLI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Integer> LLILLL = new ConcurrentHashMap<>();
    public boolean LLILZ;
    public RunnableC2486009og LLILZIL;

    static {
        new C1701430uNR();
        LLILZLL = new ConcurrentHashMap<>();
    }

    public ECAsyncInflaterV2(Activity activity) {
        this.LL = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1701430uNR.LIZLLL(this.LL);
        }
    }
}
