package com.ss.android.ugc.aweme.feed.landscape;

import X.C04TD;
import X.C0TGX;
import X.C0XI4;
import X.C11XD;
import X.C11XE;
import X.C11XF;
import X.C11XG;
import X.C1202304n7;
import X.C1257230ioz;
import X.C13LE;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1891570zK7;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2531009vw;
import X.C2531109vx;
import X.C2531209vy;
import X.C2531309vz;
import X.C2531409w0;
import X.C634170Ou7;
import X.C823050WQl;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS129S0100000_29;
import android.view.ViewStub;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.ILandscapeEducatorService;
import com.ss.android.ugc.aweme.services.video.OneMinuteH5PreloadServiceImpl;
import java.net.URLEncoder;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class LandscapeEducatorImpl implements ILandscapeEducatorService {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ = "creator_educate_longer_videos";
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final C19719912Dl LJIIIZ() {
        return C13LE.LIZ(LandscapeEducatorAssem.class);
    }

    public static ILandscapeEducatorService LJIIJJI() {
        Object objLIZ = C04TD.LIZ(ILandscapeEducatorService.class, false);
        if (objLIZ != null) {
            return (ILandscapeEducatorService) objLIZ;
        }
        if (C04TD.u0 == null) {
            synchronized (ILandscapeEducatorService.class) {
                if (C04TD.u0 == null) {
                    C04TD.u0 = new LandscapeEducatorImpl();
                }
            }
        }
        return C04TD.u0;
    }

    public static boolean LJIILIIL() {
        if (!C2531109vx.LIZ) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_landscape_component");
        if (repo.getBoolean("learn_more_entered", false)) {
            return false;
        }
        return (System.currentTimeMillis() - repo.getLong("last_time_x_clicked", 0L)) / ((long) 86400000) >= ((long) C2531309vz.LIZ) && repo.getInt("x_clicked_count", 0) < C2531209vy.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LIZ() {
        if (this.LIZJ || !C2531409w0.LIZ) {
            return;
        }
        this.LIZJ = true;
        if (LJIILIIL()) {
            C823050WQl.LIZJ().submit(new ARunnableS129S0100000_29(this, 40));
        }
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LJIIIIZZ() {
        if (this.LIZIZ) {
            return;
        }
        boolean z = C2531409w0.LIZ;
        if (C2531409w0.LIZ) {
            this.LIZIZ = true;
            if (OneMinuteH5PreloadServiceImpl.createIOneMinuteH5PreloadServiceImplbyMonsterPlugin(false).shouldPreloadWebView()) {
                C823050WQl.LIZJ().submit(new ARunnableS129S0100000_29(this, 41));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LJIIJ() {
        if (this.LIZLLL || !C2531009vw.LIZ) {
            return;
        }
        this.LIZLLL = true;
        if (OneMinuteH5PreloadServiceImpl.createIOneMinuteH5PreloadServiceImplbyMonsterPlugin(false).shouldPreloadWebView() || LJIILIIL()) {
            C823050WQl.LIZLLL().submit(new ARunnableS116S0100000_16(this, 54));
        }
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final boolean LIZJ() {
        return C11XE.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final String LIZLLL() {
        return C1202304n7.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final boolean LJ() {
        return C11XF.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final boolean LJII() {
        if (!LJIILIIL()) {
            return false;
        }
        LJIIJJI().LIZ();
        return true;
    }

    public static void LJIIL(String str) {
        C0XI4 c0xi4 = new C0XI4(C1202304n7.LIZ());
        c0xi4.LJ("enter_from", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview?url=");
        sbLIZ.append(URLEncoder.encode(c0xi4.LJFF(), "ISO-8859-1"));
        sbLIZ.append("&use_spark=1&use_preload=1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        List<String> list = C1891570zK7.LIZ;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIIIZ(strLIZIZ, "one_minute_spark_biz", null, 12);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LIZIZ(C0TGX c0tgx, ViewStub viewStub, C19EG c19eg, C1257230ioz c1257230ioz) {
        PopupManager.LJIJI(new C634170Ou7(c0tgx, c19eg, c1257230ioz), true);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LJFF(C0TGX c0tgx, ViewStub viewStub, C19EG c19eg, C1257230ioz c1257230ioz) {
        PopupManager.LJIJI(new C11XG(c0tgx, c19eg, c1257230ioz), true);
    }

    @Override // com.ss.android.ugc.aweme.ILandscapeEducatorService
    public final void LJI(C0TGX c0tgx, ViewStub viewStub, C19EG c19eg, C1257230ioz c1257230ioz) {
        PopupManager.LJIJI(new C11XD(c0tgx, c19eg, c1257230ioz), true);
    }
}
