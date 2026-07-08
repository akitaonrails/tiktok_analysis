package com.ss.android.ugc.aweme.video;

import X.C08Q0;
import X.C0B87;
import X.C1024720cly;
import X.C1024750cm1;
import X.C1150504el;
import X.C1475650oVH;
import X.C1480850odf;
import X.C1480970odr;
import X.C1481110oe5;
import X.C1487220onw;
import X.C1BWL;
import X.C2104108Md;
import X.C823050WQl;
import X.EnumC1480880odi;
import X.InterfaceC1480930odn;
import X.InterfaceC1480950odp;
import X.InterfaceC1480960odq;
import X.InterfaceC1481170oeB;
import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: loaded from: classes24.dex */
public final class PlayerKitInitImpl implements IPlayerInitService {
    @Override // com.ss.android.ugc.aweme.video.IPlayerInitService
    public final void LIZLLL() {
        C1487220onw.LIZ(0);
    }

    @Override // com.ss.android.ugc.aweme.video.IPlayerInitService
    public final void LIZ() {
        EnumC1480880odi enumC1480880odi = EnumC1480880odi.INSTANCE;
        enumC1480880odi.setHttpsHelper(new InterfaceC1480950odp() { // from class: X.0oeC
        });
        enumC1480880odi.setPlayUrlBuilder(new InterfaceC1480960odq() { // from class: X.0oeD
        });
        enumC1480880odi.setCacheChecker(new InterfaceC1480930odn() { // from class: X.0oe7
            @Override // X.InterfaceC1480930odn
            public final boolean LIZ(VideoUrlModel videoUrlModel) {
                return C1478160oZK.LIZ().isCache(C1481230oeH.LJII(videoUrlModel));
            }
        });
        enumC1480880odi.setPlayInfoCallback(C1475650oVH.LIZ().LIZJ());
    }

    @Override // com.ss.android.ugc.aweme.video.IPlayerInitService
    public final void LIZIZ() throws Throwable {
        if (((Boolean) C0B87.LIZ.getValue()).booleanValue()) {
            try {
                C1480970odr.LJI(C1480850odf.LIZJ.getPlayerType(), false, true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.IPlayerInitService
    public final void LIZJ() {
        C1150504el.LIZ().LIZLLL("player_init_build_duration", false);
        C1481110oe5.LIZIZ = new InterfaceC1481170oeB() { // from class: X.0oe8
            @Override // X.InterfaceC1481170oeB
            public final void onLog(String str) {
                if (InterfaceC1481090oe3.LIZ) {
                    C2344809Gs.LIZLLL(6, "PlayerLog", str);
                }
            }

            @Override // X.InterfaceC1481170oeB
            public final void ensureNotReachHere(Throwable th, String str) {
                C1AF0.LJFF(th, str);
            }
        };
        C1024720cly.LIZ = new C1024750cm1();
    }

    @Override // com.ss.android.ugc.aweme.video.IPlayerInitService
    public final void LJ() {
        Application applicationLIZ = C1BWL.LIZ();
        String strLIZ = C2104108Md.LIZ(applicationLIZ);
        if (strLIZ == null || !((strLIZ.endsWith(":push") || strLIZ.endsWith(":pushservice")) && C08Q0.LJ(applicationLIZ, "load_so_main_process_opt", false))) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0oe6
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PlayerKitInitImpl@6d9b.preloadPreCreate$1");
                    try {
                        C1487220onw.LIZIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PlayerKitInitImpl@6d9b.preloadPreCreate$1");
                }
            });
        }
    }
}
