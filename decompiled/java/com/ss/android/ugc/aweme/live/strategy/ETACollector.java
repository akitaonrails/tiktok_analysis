package com.ss.android.ugc.aweme.live.strategy;

import X.C098200Yq;
import X.C0NAL;
import X.C1161920gLG;
import X.C13LP;
import X.C189200o6;
import X.C1AC7;
import X.C1AD4;
import X.C1AD8;
import X.C356901a3;
import X.C480930ItX;
import X.C480940ItY;
import X.EnumC480960Ita;
import X.InterfaceC588340N5s;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes34.dex */
public final class ETACollector implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final WeakReference<Fragment> LL;
    public Long LLILLJJLI;
    public boolean LLILLL;
    public final C1AD4 LLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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

    public static void LIZ() {
        try {
            ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW("stream_pull_with_warmup");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1AD4] */
    public ETACollector(WeakReference<Fragment> weakReference) {
        this.LL = weakReference;
        new BPEAHandler(Looper.getMainLooper());
        this.LLILZ = new InterfaceC588340N5s() { // from class: X.1AD4
            /* JADX WARN: Removed duplicated region for block: B:131:0x0349  */
            /* JADX WARN: Type inference failed for: r7v4, types: [X.1AD9] */
            @Override // X.InterfaceC588340N5s
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(java.lang.String r27, X.C1510130pOt r28) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 928
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1AD4.LIZJ(java.lang.String, X.0pOt):void");
            }
        };
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        MLCommonService.Companion.getClass();
        C0NAL.LIZ.removeCommonEventListener("on_view_pager_selected", this.LLILZ);
        LIZ();
        C480940ItY.LIZ.getClass();
        for (Long l : C13LP.LLIIII(C480940ItY.LIZIZ.keySet())) {
            C480940ItY.LIZ.getClass();
            C480940ItY.LIZJ(l, "eta_collector_destroy");
        }
        C480940ItY.LIZJ.clear();
        this.LLILLJJLI = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLILLL = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        if (this.LLILLL) {
            this.LLILLL = false;
        }
    }

    public static void LIZIZ(LiveRoomStruct liveRoomStruct, String str) {
        C1AC7 c1ac7 = C1AC7.LIZ;
        boolean z = false;
        Pair[] pairArr = {new Pair("roomId", Long.valueOf(liveRoomStruct.id)), new Pair("stage", "precreate"), new Pair("playerTag", str)};
        c1ac7.getClass();
        C1AC7.LJIILL("eta_prewarm_stage", pairArr);
        C480940ItY c480940ItY = C480940ItY.LIZ;
        Long lValueOf = Long.valueOf(liveRoomStruct.id);
        C1AD8 c1ad8 = new C1AD8();
        c1ad8.LIZJ = Long.valueOf(liveRoomStruct.id);
        c1ad8.LJFF = str;
        c1ad8.LJII = true;
        if (liveRoomStruct.getForceLowLatency()) {
            z = true;
        }
        c1ad8.LJIIJJI = z;
        c1ad8.LJI = EnumC480960Ita.PRECREATE;
        C480930ItX c480930ItXLIZ = c1ad8.LIZ();
        c480940ItY.getClass();
        C480940ItY.LIZIZ(lValueOf, c480930ItXLIZ);
    }

    public static void LIZJ(LiveRoomStruct liveRoomStruct, String str, String str2) {
        C1AC7 c1ac7 = C1AC7.LIZ;
        boolean z = false;
        Pair[] pairArr = {new Pair("roomId", Long.valueOf(liveRoomStruct.id)), new Pair("stage", "prepare"), new Pair("playerTag", str), new Pair("sessionId", str2)};
        c1ac7.getClass();
        C1AC7.LJIILL("eta_prewarm_stage", pairArr);
        C480940ItY c480940ItY = C480940ItY.LIZ;
        Long lValueOf = Long.valueOf(liveRoomStruct.id);
        C1AD8 c1ad8 = new C1AD8();
        c1ad8.LIZ = liveRoomStruct.getMultiStreamData();
        c1ad8.LIZIZ = liveRoomStruct.getMultiStreamDefaultPreviewQualitySdkKey();
        c1ad8.LJ = false;
        c1ad8.LIZJ = Long.valueOf(liveRoomStruct.id);
        c1ad8.LJFF = str;
        c1ad8.LIZLLL = str2;
        c1ad8.LJIIL = liveRoomStruct.logId;
        c1ad8.LJIIIZ = true;
        c1ad8.LJIIJ = true;
        if (liveRoomStruct.getForceLowLatency()) {
            z = true;
        }
        c1ad8.LJIIJJI = z;
        c1ad8.LJI = EnumC480960Ita.PREPARE;
        C480930ItX c480930ItXLIZ = c1ad8.LIZ();
        c480940ItY.getClass();
        C480940ItY.LIZIZ(lValueOf, c480930ItXLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x047b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r33, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r34, X.C1ACA r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.strategy.ETACollector.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct, X.1ACA, int):void");
    }
}
