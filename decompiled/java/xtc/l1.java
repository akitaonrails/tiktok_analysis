package xtc;

import X.C0C64;
import X.C19252910Tv;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;

/* JADX INFO: loaded from: classes22.dex */
public final class l1 {
    public static final l1 LIZ = new l1();
    public static final int LIZIZ = 1;

    static {
        C0C64.LJIILLIIL().LJIJ(31744, 0, "fyp_auto_scroll", false);
    }

    public static boolean LIZ() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJLJJLL(C0C64.LJIILLIIL().LJIJ(31744, 0, "fyp_auto_scroll", false) == LIZIZ) && !((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJIFFI();
    }
}
