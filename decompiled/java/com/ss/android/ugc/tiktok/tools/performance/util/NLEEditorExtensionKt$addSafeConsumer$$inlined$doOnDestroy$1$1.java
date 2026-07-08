package com.ss.android.ugc.tiktok.tools.performance.util;

import X.C20102213l6;
import X.C201955140j;
import X.C2188811AlT;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;

/* JADX INFO: loaded from: classes30.dex */
public final class NLEEditorExtensionKt$addSafeConsumer$$inlined$doOnDestroy$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ NLEEditor LLILLL;
    public final /* synthetic */ NLEEditorListener LLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" onDestroy");
        C201955140j.LIZLLL(c20102213l6, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLILLJJLI);
        sbLIZ2.append(" addSafeConsumer: removeConsumer");
        C201955140j.LIZLLL(c20102213l6, "MEMORY_LEAK", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILLL.removeConsumer(this.LLILZ);
    }

    public NLEEditorExtensionKt$addSafeConsumer$$inlined$doOnDestroy$1$1(String str, String str2, NLEEditor nLEEditor, NLEEditorListener nLEEditorListener) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = nLEEditor;
        this.LLILZ = nLEEditorListener;
    }
}
