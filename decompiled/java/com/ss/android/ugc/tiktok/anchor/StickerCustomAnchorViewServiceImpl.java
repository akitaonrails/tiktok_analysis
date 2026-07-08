package com.ss.android.ugc.tiktok.anchor;

import X.C04TD;
import X.C1393720mN8;
import X.InterfaceC1393680mN4;
import com.ss.android.ugc.aweme.anchor.service.StickerCustomAnchorViewService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StickerCustomAnchorViewServiceImpl implements StickerCustomAnchorViewService {
    public static StickerCustomAnchorViewService LIZIZ() {
        Object objLIZ = C04TD.LIZ(StickerCustomAnchorViewService.class, false);
        if (objLIZ != null) {
            return (StickerCustomAnchorViewService) objLIZ;
        }
        if (C04TD.U6 == null) {
            synchronized (StickerCustomAnchorViewService.class) {
                if (C04TD.U6 == null) {
                    C04TD.U6 = new StickerCustomAnchorViewServiceImpl();
                }
            }
        }
        return C04TD.U6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0mN8] */
    @Override // com.ss.android.ugc.aweme.anchor.service.StickerCustomAnchorViewService
    public final C1393720mN8 LIZ() {
        return new InterfaceC1393680mN4() { // from class: X.0mN8
            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                C1393870mNN c1393870mNN = new C1393870mNN(interfaceC1392640mLO.LIZIZ());
                ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(c1393870mNN, EnumC700430Rdh.POSITIVE);
                return c1393870mNN;
            }

            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                if (z && !AwemeExtKt.isPrivate(aweme) && !C10EU.LJIILIIL()) {
                    if ((i == EnumC1430380nKG.PROP.getTYPE() && !Intrinsics.LJFF(AnchorKt.getExtraBasedOnKey(anchorCommonStruct, "sub_type"), "ai_self")) || i == EnumC1430380nKG.GREEN_SCREEN.getTYPE() || i == EnumC1430380nKG.PROP_COMMERCIAL_EFFECT.getTYPE()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
    }
}
