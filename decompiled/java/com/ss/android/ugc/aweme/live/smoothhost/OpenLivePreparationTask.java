package com.ss.android.ugc.aweme.live.smoothhost;

import X.AnonymousClass0956;
import X.C1DEV;
import X.C2191201ApK;
import X.C445901oP;
import X.C446001oQ;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import webcast.api.creator.PreScheduleStream;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes.dex */
public final class OpenLivePreparationTask {
    public static final OpenLivePreparationTask LIZ = new OpenLivePreparationTask();
    public static final C1DEV LIZIZ = C2191201ApK.LIZ();
    public static final C1DEV LIZJ = C2191201ApK.LIZ();
    public static final List<Function1<InterfaceC1364105Vn<? super Pair<String, String>>, Object>> LIZLLL = new ArrayList();
    public static final Map<String, String> LJ = new LinkedHashMap();
    public static PreScheduleStream LJFF;
    public static LifecycleOwner LJI;
    public static AnonymousClass0956 LJII;
    public static LivePodcastResponse.ResponseData LJIIIIZZ;
    public static DefaultLifecycleObserver LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C446101oR
            if (r0 == 0) goto L28
            r9 = r12
            X.01oR r9 = (X.C446101oR) r9
            int r2 = r9.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r9.LLILZIL = r2
        L12:
            java.lang.Object r2 = r9.LLILLL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLILZIL
            r10 = 2
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L3c
            if (r0 == r1) goto L36
            if (r0 != r10) goto L2e
            long r3 = r9.LLILLJJLI
            X.01eN r5 = r9.LL
            goto L99
        L28:
            X.01oR r9 = new X.01oR
            r9.<init>(r11, r12)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.01eN r5 = r9.LL
            X.C155000ia.LIZIZ(r2)
            goto L4c
        L3c:
            X.C155000ia.LIZIZ(r2)
            X.1DEV r5 = com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask.LIZIZ
            r9.LL = r5
            r9.LLILZIL = r1
            java.lang.Object r0 = r5.LIZLLL(r6, r9)
            if (r0 != r8) goto L4c
            return r8
        L4c:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb6
            java.util.Map<java.lang.String, java.lang.String> r7 = com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask.LJ     // Catch: java.lang.Throwable -> Lb6
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> Lb6
            r1 = r1 ^ r0
            if (r1 == 0) goto L71
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "execute time:return "
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb6
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb6
            long r0 = r0 - r3
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb6
            X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lb6
            r5.LIZIZ(r6)
            return r7
        L71:
            androidx.lifecycle.LifecycleOwner r0 = com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask.LJI     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L93
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L93
        L7b:
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> Lb6
            X.01oN r0 = new X.01oN     // Catch: java.lang.Throwable -> Lb6
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Lb6
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r1, r6, r0, r10)     // Catch: java.lang.Throwable -> Lb6
            com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask.LJII = r0     // Catch: java.lang.Throwable -> Lb6
            r9.LL = r5     // Catch: java.lang.Throwable -> Lb6
            r9.LLILLJJLI = r3     // Catch: java.lang.Throwable -> Lb6
            r9.LLILZIL = r10     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r0 = r0.LJJZ(r9)     // Catch: java.lang.Throwable -> Lb6
            goto L96
        L93:
            X.03Hh r2 = X.C817503Hh.LL     // Catch: java.lang.Throwable -> Lb6
            goto L7b
        L96:
            if (r0 != r8) goto L9c
            return r8
        L99:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lbb
        L9c:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "execute time: join return "
            r2.append(r0)     // Catch: java.lang.Throwable -> Lbb
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbb
            long r0 = r0 - r3
            r2.append(r0)     // Catch: java.lang.Throwable -> Lbb
            X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lbb
            java.util.Map<java.lang.String, java.lang.String> r0 = com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask.LJ     // Catch: java.lang.Throwable -> Lbb
            r5.LIZIZ(r6)
            return r0
        Lb6:
            r0 = move-exception
        Lb7:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lbb
            goto Lbd
        Lbb:
            r0 = move-exception
            goto Lb7
        Lbd:
            r5.LIZIZ(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask.LIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        DefaultLifecycleObserver openLivePreparationTask$prepare$currentObserver$1$1 = LJIIIZ;
        if (openLivePreparationTask$prepare$currentObserver$1$1 == null) {
            openLivePreparationTask$prepare$currentObserver$1$1 = new OpenLivePreparationTask$prepare$currentObserver$1$1(this);
        }
        LJIIIZ = openLivePreparationTask$prepare$currentObserver$1$1;
        LifecycleOwner lifecycleOwner2 = LJI;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(openLivePreparationTask$prepare$currentObserver$1$1);
        }
        lifecycleOwner.getLifecycle().addObserver(openLivePreparationTask$prepare$currentObserver$1$1);
        LJI = lifecycleOwner;
        Map<String, String> map = LJ;
        if (!map.isEmpty()) {
            return;
        }
        List<Function1<InterfaceC1364105Vn<? super Pair<String, String>>, Object>> list = LIZLLL;
        ((ArrayList) list).clear();
        ((LinkedHashMap) map).clear();
        LJIIIIZZ = null;
        LJFF = null;
        C446001oQ c446001oQ = new C446001oQ(null);
        C445901oP c445901oP = new C445901oP(null);
        ((ArrayList) list).add(c446001oQ);
        ((ArrayList) list).add(c445901oP);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super webcast.api.room.LivePodcastResponse.ResponseData> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C446201oS
            if (r0 == 0) goto L26
            r6 = r9
            X.01oS r6 = (X.C446201oS) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r3 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 == r1) goto L34
            if (r0 != r2) goto L2c
            X.01eN r4 = r6.LL
            goto La0
        L26:
            X.01oS r6 = new X.01oS
            r6.<init>(r8, r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.01eN r4 = r6.LL
            X.C155000ia.LIZIZ(r3)
            goto L4a
        L3a:
            X.C155000ia.LIZIZ(r3)
            X.1DEV r4 = com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask.LIZJ
            r6.LL = r4
            r6.LLILZ = r1
            java.lang.Object r0 = r4.LIZLLL(r5, r6)
            if (r0 != r7) goto L4a
            return r7
        L4a:
            webcast.api.room.LivePodcastResponse$ResponseData r0 = com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask.LJIIIIZZ     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L52
            r4.LIZIZ(r5)
            return r0
        L52:
            r6.LL = r4     // Catch: java.lang.Throwable -> La9
            r6.getClass()     // Catch: java.lang.Throwable -> La9
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> La9
            X.1DEt r3 = new X.1DEt     // Catch: java.lang.Throwable -> La9
            X.05Vn r0 = X.C099M.LIZLLL(r6)     // Catch: java.lang.Throwable -> La9
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> La9
            r3.LJIJJ()     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = "story"
            X.020f r1 = new X.020f     // Catch: java.lang.Throwable -> L77
            r0 = 141(0x8d, float:1.98E-43)
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L77
            X.C783820Uou.LJIIIZ(r2, r1)     // Catch: java.lang.Throwable -> L77
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L77
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L77
            goto L83
        L77:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La9
            X.00Yq r0 = new X.00Yq     // Catch: java.lang.Throwable -> La9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La9
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> La9
        L83:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto L90
            java.lang.String r1 = "OpenLivePreparationTask"
            java.lang.String r0 = "queryPodcast failed"
            X.C20441214yg.LJ(r1, r0)     // Catch: java.lang.Throwable -> La9
        L90:
            java.lang.Object r3 = r3.LJIJ()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> La9
            if (r3 != r0) goto L9d
            X.C099Q.LIZJ(r6)     // Catch: java.lang.Throwable -> La9
        L9d:
            if (r3 != r7) goto La3
            return r7
        La0:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> Lae
        La3:
            webcast.api.room.LivePodcastResponse$ResponseData r3 = (webcast.api.room.LivePodcastResponse.ResponseData) r3     // Catch: java.lang.Throwable -> Lae
            r4.LIZIZ(r5)
            return r3
        La9:
            r0 = move-exception
        Laa:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lae
            goto Lb0
        Lae:
            r0 = move-exception
            goto Laa
        Lb0:
            r4.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask.LIZJ(X.05Vn):java.lang.Object");
    }
}
