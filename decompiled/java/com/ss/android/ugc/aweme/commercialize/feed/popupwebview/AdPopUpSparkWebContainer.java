package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import X.InterfaceC1038080d7W;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPopUpSparkWebContainer implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLILLL = 0;
    public final LifecycleOwner LL;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLJJLI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        SparkContext sparkContext;
        InterfaceC1038080d7W interfaceC1038080d7W;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLJJLI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) == null || (interfaceC1038080d7W = (InterfaceC1038080d7W) sparkContext.LJFF(InterfaceC1038080d7W.class)) == null) {
            return;
        }
        InterfaceC1541990qEH kitView = this.LLILLJJLI.getKitView();
        View viewE1 = kitView != null ? kitView.e1() : null;
        interfaceC1038080d7W.LIZJ(viewE1 instanceof WebView ? (WebView) viewE1 : null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        SparkContext sparkContext;
        InterfaceC1038080d7W interfaceC1038080d7W;
        InterfaceC1541990qEH kitView;
        System.currentTimeMillis();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLJJLI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) == null || (interfaceC1038080d7W = (InterfaceC1038080d7W) sparkContext.LJFF(InterfaceC1038080d7W.class)) == null) {
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILLJJLI;
        View viewE1 = (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) == null) ? null : kitView.e1();
        interfaceC1038080d7W.LJJIII(viewE1 instanceof WebView ? (WebView) viewE1 : null);
    }

    public AdPopUpSparkWebContainer(LifecycleOwner lifecycleOwner, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
