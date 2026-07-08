package com.ss.android.ugc.aweme.mvtemplate.impl;

import X.AbstractC1216410hl9;
import X.AbstractC1255880imo;
import X.C04TD;
import X.C0P02;
import X.C1255920ims;
import X.C1394510mOP;
import X.C15Q0;
import X.C20516915Pz;
import X.C637780Ozw;
import X.InterfaceC1389750mGj;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;

/* JADX INFO: loaded from: classes32.dex */
public final class MovieReuseServiceImpl implements IMovieReuseService {
    public static IMovieReuseService LJ() {
        Object objLIZ = C04TD.LIZ(IMovieReuseService.class, false);
        if (objLIZ != null) {
            return (IMovieReuseService) objLIZ;
        }
        if (C04TD.M2 == null) {
            synchronized (IMovieReuseService.class) {
                if (C04TD.M2 == null) {
                    C04TD.M2 = new MovieReuseServiceImpl();
                }
            }
        }
        return C04TD.M2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0P02] */
    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final C0P02 LIZIZ(final AbstractC1255880imo abstractC1255880imo) {
        return new AbstractC1216410hl9<C637780Ozw, C1255920ims<C637780Ozw>>(abstractC1255880imo) { // from class: X.0P02
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 11000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = (!(abstractC1255880imo instanceof C637780Ozw) || abstractC1255880imo == null) ? new C637780Ozw() : abstractC1255880imo;
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An6.getMvId(), Integer.valueOf(c2189821An6.getVideoType()));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void LIZ(String str, Activity activity, InterfaceC1389750mGj interfaceC1389750mGj) {
        C20516915Pz c20516915Pz = new C20516915Pz(activity, 3);
        c20516915Pz.LJFF = false;
        c20516915Pz.LJIIIIZZ = new C15Q0(interfaceC1389750mGj);
        c20516915Pz.LIZ(str, 1, null, "scan", "scan", 1, false, "", null);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void LIZLLL(Fragment fragment, String str, int i, int i2, boolean z) {
        if (str == null || !((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().checkIsAlreadyPublished(fragment.getContext())) {
            return;
        }
        new C20516915Pz(fragment.getContext()).LIZ(str, Integer.valueOf(i), null, "mv_page", "mv_page", i2, z, "", null);
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService
    public final void LIZJ(Context context, Integer num, String str, C1394510mOP c1394510mOP, Integer num2, String str2, String str3, int i, boolean z, String str4, String str5, String str6, ShootExtraData shootExtraData, String str7) {
        C20516915Pz c20516915Pz = new C20516915Pz(context, num);
        c20516915Pz.LJIIIZ = str5;
        c20516915Pz.LJIIJ = str6;
        c20516915Pz.LJIIL = str7;
        c20516915Pz.LIZ(str, num2, c1394510mOP, str2, str3, i, z, str4, shootExtraData);
    }
}
