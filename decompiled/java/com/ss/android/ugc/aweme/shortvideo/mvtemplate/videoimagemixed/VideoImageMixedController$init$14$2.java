package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import X.C356901a3;
import X.C538480L9y;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoImageMixedController$init$14$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public boolean LL;
    public final /* synthetic */ C538480L9y LLILLJJLI;
    public final /* synthetic */ VideoImageMixedController LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
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
    public final void onPause(LifecycleOwner lifecycleOwner) {
        boolean z;
        View view = this.LLILLJJLI.LLILLL;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume(androidx.lifecycle.LifecycleOwner r13) {
        /*
            r12 = this;
            boolean r0 = r12.LL
            if (r0 != 0) goto L5f
            X.0L9y r0 = r12.LLILLJJLI
            android.view.View r0 = r0.LLILLL
            r9 = 0
            if (r0 == 0) goto L5f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L5f
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController r0 = r12.LLILLL
            X.0KnJ r0 = r0.LLJJJJJIL
            r5 = 0
            if (r0 != 0) goto L19
            r0 = r5
        L19:
            X.0L9y r0 = r0.getAutoCutBtn()
            if (r0 == 0) goto L64
            X.0MWA r1 = r0.getLottieAnimationType()
        L23:
            X.0MWB r0 = X.C0MWB.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L62
            X.0L62 r0 = X.C0L62.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.template.TemplateOperationData r0 = X.C0L62.LIZJ()
            if (r0 == 0) goto L62
            java.lang.String r6 = r0.activityId
        L38:
            java.lang.String r2 = "upload"
            java.lang.String r3 = "upload_page"
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController r0 = r12.LLILLL
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LL
            if (r0 == 0) goto L60
            java.lang.String r4 = r0.shootWay
            java.lang.String r5 = r0.getCreationId()
        L48:
            r7 = 0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController r1 = r12.LLILLL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r1.LLILLJJLI
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
            boolean r9 = r0.isDraft
        L55:
            X.0mzq r10 = r1.LJJJJLI()
            r11 = 96
            r8 = r7
            X.C1417710mzp.LJJIJ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L5f:
            return
        L60:
            r4 = r5
            goto L48
        L62:
            r6 = r5
            goto L38
        L64:
            r1 = r5
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController$init$14$2.onResume(androidx.lifecycle.LifecycleOwner):void");
    }

    public VideoImageMixedController$init$14$2(C538480L9y c538480L9y, VideoImageMixedController videoImageMixedController) {
        this.LLILLJJLI = c538480L9y;
        this.LLILLL = videoImageMixedController;
    }
}
