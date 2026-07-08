package com.ss.android.ugc.aweme.servicimpl;

import X.C1446350nk1;
import X.C1648040szK;
import X.C1648490t03;
import X.C1DRG;
import X.C569590MVp;
import X.InterfaceC1653190t7d;
import a6n.a;
import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.bottom.LightRecordBottomTabIntegrationService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class LightRecordBottomTabIntegrationServiceImpl implements LightRecordBottomTabIntegrationService {
    @Override // com.ss.android.ugc.gamora.recorder.bottom.LightRecordBottomTabIntegrationService
    public final List<InterfaceC1653190t7d> LIZ(C1DRG c1drg) {
        Object obj;
        ShortVideoContext shortVideoContext = (ShortVideoContext) c1drg.LJIIL(null, ShortVideoContext.class);
        C1446350nk1.LIZ.getClass();
        if (C1446350nk1.LJ(shortVideoContext)) {
            obj = new Object() { // from class: X.0szw
            };
        } else {
            obj = new Object() { // from class: X.0szv
            };
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1648490t03(c1drg, Intrinsics.LJFF(obj, new Object() { // from class: X.0szv
        })));
        arrayList.add(C569590MVp.LIZIZ.LIZIZ(c1drg, "RecordAlbumTab", Intrinsics.LJFF(obj, new Object() { // from class: X.0szw
        })));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0szK] */
    @Override // com.ss.android.ugc.gamora.recorder.bottom.LightRecordBottomTabIntegrationService
    public final C1648040szK LIZIZ(final C1DRG c1drg) {
        return new InterfaceC1653190t7d(c1drg) { // from class: X.0szK
            public final C1DRG LL;

            @Override // X.InterfaceC1653190t7d
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC1653190t7d
            public final void initialize(a aVar) {
            }

            @Override // X.InterfaceC1653190t7d
            public final AbstractC1653180t7c provideScene() {
                return new C1654940tAS(this.LL);
            }

            {
                this.LL = c1drg;
            }

            @Override // X.InterfaceC1653190t7d
            public final C1653330t7r createBottomTabItem(a aVar) {
                EnumC1647570syZ enumC1647570syZ = EnumC1647570syZ.LIVE;
                return new C1653330t7r(((Context) this.LL.LJII(Context.class, null)).getString(enumC1647570syZ.getNameResId()), enumC1647570syZ.getTag(), "live", aVar.LIZLLL().mToLive, null, null, false, null, null, 496);
            }
        };
    }
}
