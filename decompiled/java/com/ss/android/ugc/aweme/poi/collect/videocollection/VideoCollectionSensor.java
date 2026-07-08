package com.ss.android.ugc.aweme.poi.collect.videocollection;

import X.AbstractC616030OEf;
import X.C13LE;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C609270Nv3;
import X.C622680Oba;
import X.C638900P4e;
import X.C704830Rkn;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS109S0100000_9;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.collect.videocollection.VideoCollectionSensor;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoCollectionSensor extends AbstractC616030OEf<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final Lifecycle LLILZIL;
    public final C638900P4e LLILZLL;
    public boolean LLIZ;
    public final C609270Nv3 LLIZLLLIL;
    public final ARunnableS109S0100000_9 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoCollectionSensor.class, "videoVM", "getVideoVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC616030OEf
    public final void LIZJ() {
        C638900P4e c638900P4e = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) c638900P4e.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0Nv4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new AwS623S0100000_9(this, 139), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0Nv5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new AwS623S0100000_9(this, 140), 6);
        C622680Oba.LIZJ(this.LLIZLLLIL);
        this.LLILZIL.addObserver(new VideoCollectionSensor$onInit$5(this));
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void LJJJJZ() {
        Function0<VideoItemParams> function0;
        VideoItemParams videoItemParamsInvoke;
        Aweme aweme;
        this.LLIZ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(", onUnBind aid: ");
        C704830Rkn c704830Rkn = this.LLILLL;
        sbLIZ.append((c704830Rkn == null || (function0 = c704830Rkn.LIZLLL) == null || (videoItemParamsInvoke = function0.invoke()) == null || (aweme = videoItemParamsInvoke.getAweme()) == null) ? null : aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Nv3] */
    public VideoCollectionSensor(Lifecycle lifecycle) {
        super("bottom_button_ls_collection");
        this.LLILZIL = lifecycle;
        this.LLILZLL = new C638900P4e(this, C13LE.LIZ(VideoViewModel.class), 9);
        final WeakReference weakReference = new WeakReference(this);
        this.LLIZLLLIL = new Object(weakReference) { // from class: X.0Nv3
            public final WeakReference<VideoCollectionSensor> LIZ;

            {
                this.LIZ = weakReference;
            }

            @C14EU
            public final void handleOnVideoCollectionEvent(C609300Nv6 c609300Nv6) {
                String aid;
                Function0<VideoItemParams> function0;
                VideoItemParams videoItemParamsInvoke;
                Aweme aweme;
                Function0<VideoItemParams> function02;
                VideoItemParams videoItemParamsInvoke2;
                Aweme aweme2;
                VideoCollectionSensor videoCollectionSensor = this.LIZ.get();
                if (videoCollectionSensor != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleOnVideoCollectionEvent: aid1: ");
                    sbLIZ.append(c609300Nv6.LIZ);
                    sbLIZ.append(", aid: ");
                    C704830Rkn c704830Rkn = videoCollectionSensor.LLILLL;
                    String aid2 = null;
                    if (c704830Rkn != null && (function02 = c704830Rkn.LIZLLL) != null && (videoItemParamsInvoke2 = function02.invoke()) != null && (aweme2 = videoItemParamsInvoke2.getAweme()) != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ.append(aid);
                    C2188811AlT.LIZIZ(sbLIZ);
                    String str = c609300Nv6.LIZ;
                    C704830Rkn c704830Rkn2 = videoCollectionSensor.LLILLL;
                    if (c704830Rkn2 != null && (function0 = c704830Rkn2.LIZLLL) != null && (videoItemParamsInvoke = function0.invoke()) != null && (aweme = videoItemParamsInvoke.getAweme()) != null) {
                        aid2 = aweme.getAid();
                    }
                    if (Intrinsics.LJFF(str, aid2)) {
                        videoCollectionSensor.LLIZ = true;
                        videoCollectionSensor.LJ(false);
                    }
                }
            }
        };
        this.LLJ = new ARunnableS109S0100000_9(this, 111);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        String aid;
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(", onBind,aid: ");
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
