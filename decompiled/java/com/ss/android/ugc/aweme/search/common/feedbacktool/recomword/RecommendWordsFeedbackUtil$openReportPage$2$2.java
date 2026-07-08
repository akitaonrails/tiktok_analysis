package com.ss.android.ugc.aweme.search.common.feedbacktool.recomword;

import X.C013C;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendWordsFeedbackUtil$openReportPage$2$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ Word LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;

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
        Word word;
        String id;
        Function1<String, Unit> function1;
        if (this.LL.element && (word = this.LLILLJJLI) != null && (id = word.getId()) != null && (function1 = this.LLILLL) != null) {
            function1.invoke(id);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendWordsFeedbackUtil$openReportPage$2$2(C013C c013c, Word word, Function1<? super String, Unit> function1) {
        this.LL = c013c;
        this.LLILLJJLI = word;
        this.LLILLL = function1;
    }
}
