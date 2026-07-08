package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.AbstractRunnableC21377818lM;
import X.C01GW;
import X.C09JN;
import X.C0C64;
import X.C0LJ0;
import X.C11JF;
import X.C11NZ;
import X.C19EG;
import X.C1C7U;
import X.C524780Ki4;
import X.C530370Kr5;
import X.C530750Krh;
import X.C530760Kri;
import X.C533930Kwp;
import X.C535280Kz0;
import X.C535700Kzg;
import X.C786410Ut5;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import X.InterfaceC500500Jk0;
import Y.ARunnableS108S0100000_8;
import Y.AfS172S0100000_3;
import Y.AfS177S0100000_8;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.setting.performance.PhotoPreloadDefaultSizeConfig;
import com.ss.android.ugc.aweme.setting.performance.PhotoPreloadDowngrade;
import dtj.u7;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PreloadMediaDataTask extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1, GenericLifecycleObserver {
    public final C19EG LLILZLL;
    public final Scene LLIZ;
    public final EnumC194317110p LLIZLLLIL;
    public final BPEAHandler LLJ = new BPEAHandler(Looper.getMainLooper());
    public C11JF LLJI;
    public C11JF LLJIJIL;
    public C11JF LLJILJIL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final boolean LIZIZ() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C11JF c11jf = this.LLJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LLJIJIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        C11JF c11jf3 = this.LLJILJIL;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        C530760Kri.LIZ().LJI.LJI();
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PreloadMediaDataTask@4ab2.run");
        try {
            LJIIIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadMediaDataTask@4ab2.run");
    }

    public final void LJIIIZ() {
        Pair pair;
        if (C533930Kwp.LIZJ()) {
            C530750Krh.LIZIZ(C786410Ut5.P3(this.LLILZLL));
            C530760Kri.LIZ();
            C01GW c01gw = PhotoPreloadDefaultSizeConfig.LIZIZ;
            if (((PhotoPreloadDefaultSizeConfig.Config) c01gw.getValue()).enable) {
                pair = new Pair(Integer.valueOf(((PhotoPreloadDefaultSizeConfig.Config) c01gw.getValue()).imageSize), Integer.valueOf(((PhotoPreloadDefaultSizeConfig.Config) c01gw.getValue()).videoSize));
            } else {
                C01GW c01gw2 = PhotoPreloadDowngrade.LIZIZ;
                pair = ((PhotoPreloadDowngrade.PhotoPreloadConfig) c01gw2.getValue()).enable ? new Pair(Integer.valueOf(((PhotoPreloadDowngrade.PhotoPreloadConfig) c01gw2.getValue()).imageSize), Integer.valueOf(((PhotoPreloadDowngrade.PhotoPreloadConfig) c01gw2.getValue()).videoSize)) : new Pair(30, 30);
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            if (!((PhotoPreloadDefaultSizeConfig.Config) c01gw.getValue()).enable) {
                C01GW c01gw3 = PhotoPreloadDowngrade.LIZIZ;
                if (((PhotoPreloadDowngrade.PhotoPreloadConfig) c01gw3.getValue()).enable && ((PhotoPreloadDowngrade.PhotoPreloadConfig) c01gw3.getValue()).videoSize == 0) {
                    LJIIJ(iIntValue, new AwS587S0100000_8(this, 271));
                    return;
                }
            }
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_upload_icon_cover_support_video_v2", true, false)) {
                LJIIJ(iIntValue, new AwS587S0100000_8(this, 273));
                this.LLJIJIL = (C11JF) C530760Kri.LIZ().LJJIJL(new C535280Kz0(4, iIntValue2, 0, false), C530370Kr5.LIZ).LJJLL(new AfS172S0100000_3(3), new C09JN() { // from class: X.00P0
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("PreloadMediaDataTask@4ab2.fetchVideoDataList$2");
                        C1C7U.LIZIZ("PreloadMediaDataTask@4ab2.fetchVideoDataList$2");
                    }
                });
                return;
            }
            AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(this, 272);
            C0LJ0 c0lj0LIZ = C530760Kri.LIZ();
            C535280Kz0 c535280Kz0 = new C535280Kz0(3, iIntValue, 0, false);
            C530370Kr5 c530370Kr5 = C530370Kr5.LIZ;
            this.LLJILJIL = (C11JF) C11NZ.LJLLILLLL(c0lj0LIZ.LJJIJL(c535280Kz0, c530370Kr5), C530760Kri.LIZ().LJJIJL(new C535280Kz0(4, iIntValue2, 0, false), c530370Kr5), new InterfaceC500500Jk0() { // from class: X.0L3j
                @Override // X.InterfaceC500500Jk0
                public final Object apply(Object obj, Object obj2) {
                    C535700Kzg c535700Kzg = (C535700Kzg) obj;
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(((C535700Kzg) obj2).LIZIZ);
                    arrayList.addAll(c535700Kzg.LIZIZ);
                    C08XD.LJIL(arrayList);
                    if (!arrayList.isEmpty()) {
                        return new C535700Kzg(new C535280Kz0(0, arrayList.size(), 0, false), arrayList);
                    }
                    return c535700Kzg;
                }
            }).LJJLL(new AfS177S0100000_8(awS587S0100000_8, 2), new C09JN() { // from class: X.00P1
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PreloadMediaDataTask@4ab2.mergeFetchImageAndVideoDataList$3");
                    C1C7U.LIZIZ("PreloadMediaDataTask@4ab2.mergeFetchImageAndVideoDataList$3");
                }
            });
        }
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return this.LLIZLLLIL;
    }

    public final void LJIIJJI(C535700Kzg c535700Kzg) {
        if (!c535700Kzg.LIZIZ.isEmpty()) {
            AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this, c535700Kzg, 60);
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                awS409S0200000_8.invoke();
            } else {
                C786410Ut5.LJJZZIII(this.LLJ, new ARunnableS108S0100000_8(awS409S0200000_8, 59));
            }
        }
        if (u7.LJ() || u7.LIZIZ()) {
            C524780Ki4.LIZ.step("tool_performance_show_album_icon", "setFirstPhoto");
        }
    }

    public final void LJIIJ(int i, Function1<? super C535700Kzg, Unit> function1) {
        this.LLJI = (C11JF) C530760Kri.LIZ().LJJIJL(new C535280Kz0(3, i, 0, false), C530370Kr5.LIZ).LJJLL(new AfS177S0100000_8(function1, 17), new C09JN() { // from class: X.0L3Y
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PreloadMediaDataTask@4ab2.fetchImageDataList$2");
                C1C7U.LIZIZ("PreloadMediaDataTask@4ab2.fetchImageDataList$2");
            }
        });
    }

    public PreloadMediaDataTask(Lifecycle lifecycle, C19EG c19eg, Scene scene, EnumC194317110p enumC194317110p) {
        this.LLILZLL = c19eg;
        this.LLIZ = scene;
        this.LLIZLLLIL = enumC194317110p;
        LJ(AFwS239S0000000_8.get$arr$(116));
        lifecycle.addObserver(this);
    }
}
