package com.bytedance.android.livesdk.linkmic;

import X.C01GW;
import X.C01QD;
import X.C09JN;
import X.C0UCX;
import X.C0UO0;
import X.C0UVW;
import X.C11NJ;
import X.C1286510jaD;
import X.C292401Bi;
import X.InterfaceC769940UIe;
import X.InterfaceC923940a9Q;
import X.InterfaceC948500an2;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdk.api.StickerReportApi;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC948500an2(name = "MULTI_GUEST_REVIEW_MANAGER")
public final class MultiGuestV3OriginFrameReviewManager implements InterfaceC923940a9Q {
    public final long LIZ;
    public LiveEffect LIZIZ;
    public final C01GW LIZJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(140));
    public final C01GW LIZLLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(141));
    public InterfaceC769940UIe LJ;
    public int LJFF;
    public boolean LJI;

    @Override // X.InterfaceC923940a9Q
    public final void LIZLLL() {
        this.LJI = true;
        LiveEffect liveEffect = this.LIZIZ;
        if (liveEffect != null && liveEffect.LJJJI() && this.LJFF == 1) {
            LJIIJJI();
        }
    }

    @Override // X.InterfaceC923940a9Q
    public final void LJII() {
        this.LJFF = 1;
        LiveEffect liveEffect = this.LIZIZ;
        if (liveEffect != null && liveEffect.LJJJI() && this.LJI) {
            LJIIL();
        }
    }

    @Override // X.InterfaceC923940a9Q
    public final void LJIIIIZZ() {
        this.LJFF = 1;
        LiveEffect liveEffect = this.LIZIZ;
        if (liveEffect != null && liveEffect.LJJJI() && this.LJI) {
            LJIIJJI();
        }
    }

    @Override // X.InterfaceC923940a9Q
    public final void LIZ() {
        ((C1286510jaD) this.LIZLLL.getValue()).LIZIZ(false);
    }

    @Override // X.InterfaceC923940a9Q
    public final void LIZJ() {
        ((C11NJ) this.LIZJ.getValue()).LJ();
        LJIIL();
        this.LJFF = 0;
        this.LJI = false;
        this.LJ = null;
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC924050a9b
    public final void LJFF() {
        if (this.LIZIZ == null) {
            return;
        }
        LJIIJ(null);
        LiveEffect liveEffect = this.LIZIZ;
        if (liveEffect != null && liveEffect.LJJJI()) {
            LJIIL();
        }
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC923940a9Q
    public final void LJI() {
        ((C1286510jaD) this.LIZLLL.getValue()).LIZ();
    }

    public final void LJIIJJI() {
        InterfaceC769940UIe interfaceC769940UIe = this.LJ;
        if (interfaceC769940UIe != null) {
            ((C1286510jaD) this.LIZLLL.getValue()).LIZJ(interfaceC769940UIe, this.LIZ, false);
        }
    }

    public final void LJIIL() {
        C1286510jaD c1286510jaD = (C1286510jaD) this.LIZLLL.getValue();
        c1286510jaD.LJIIJ = 0L;
        c1286510jaD.LIZLLL();
    }

    public MultiGuestV3OriginFrameReviewManager(long j) {
        this.LIZ = j;
    }

    @Override // X.InterfaceC923940a9Q
    public final void LIZIZ(InterfaceC769940UIe interfaceC769940UIe) {
        this.LJ = interfaceC769940UIe;
    }

    @Override // X.InterfaceC924050a9b
    public final void LJ(LiveEffect liveEffect) {
        LJIIJ(liveEffect);
        this.LIZIZ = liveEffect;
    }

    @Override // X.InterfaceC924050a9b
    public final void LJIIIZ(LiveEffect liveEffect) {
        LJIIJ(liveEffect);
        if (liveEffect.LJJJI() && this.LJI) {
            LJIIJJI();
        } else {
            LJIIL();
        }
        this.LIZIZ = liveEffect;
    }

    public final void LJIIJ(LiveEffect liveEffect) {
        long effectId;
        String resourceId;
        String resourceId2;
        UrlModel urlModel = LiveEffect.LIZLLL;
        if (C0UCX.LIZ(liveEffect, this.LIZIZ)) {
            return;
        }
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C0UVW c0uvwLIZ = C01QD.LIZ();
        c0uvwLIZ.getClass();
        StickerReportApi stickerReportApi = (StickerReportApi) c0uvwLIZ.LIZJ(StickerReportApi.class);
        long j = this.LIZ;
        long effectId2 = 0;
        if (liveEffect != null) {
            effectId = liveEffect.getEffectId();
        } else {
            effectId = 0;
        }
        String strValueOf = String.valueOf(effectId);
        LiveEffect liveEffect2 = this.LIZIZ;
        if (liveEffect2 != null) {
            effectId2 = liveEffect2.getEffectId();
        }
        String strValueOf2 = String.valueOf(effectId2);
        String str = "";
        if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null) {
            resourceId = "";
        }
        LiveEffect liveEffect3 = this.LIZIZ;
        if (liveEffect3 != null && (resourceId2 = liveEffect3.getResourceId()) != null) {
            str = resourceId2;
        }
        ((C11NJ) this.LIZJ.getValue()).LIZ(stickerReportApi.reportEvent(j, 1, strValueOf, strValueOf2, resourceId, str, 2, 0, 0).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0UTw
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiGuestV3OriginFrameReviewManager@e688.reportStickerChange$disposable$1");
                C1C7U.LIZIZ("MultiGuestV3OriginFrameReviewManager@e688.reportStickerChange$disposable$1");
            }
        }, new C09JN() { // from class: X.0UTx
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiGuestV3OriginFrameReviewManager@e688.reportStickerChange$disposable$2");
                C1C7U.LIZIZ("MultiGuestV3OriginFrameReviewManager@e688.reportStickerChange$disposable$2");
            }
        }));
    }
}
