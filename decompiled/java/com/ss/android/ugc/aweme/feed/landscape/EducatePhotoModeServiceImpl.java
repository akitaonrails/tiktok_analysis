package com.ss.android.ugc.aweme.feed.landscape;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C054G;
import X.C0PEM;
import X.C0XQ7;
import X.C1257230ioz;
import X.C1260510iuH;
import X.C1260520iuI;
import X.C1260610iuR;
import X.C1260620iuS;
import X.C1260640iuU;
import X.C1260660iuW;
import X.C1260670iuX;
import X.C1260720iuc;
import X.C1514430pVp;
import X.C1529590puH;
import X.C1537060q6K;
import X.C19EG;
import X.C20514915Pf;
import X.C20515215Pi;
import X.C2188811AlT;
import X.C2276971EAl;
import X.C2296808zG;
import X.C23250099c;
import X.C276760At0;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS122S0200000_19;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.router.SmartRoute;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.experiment.PhotoModeBannerLearnMoreConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.service.IEducatePhotoModeService;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.Date;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes20.dex */
public final class EducatePhotoModeServiceImpl implements IEducatePhotoModeService {
    public boolean LIZIZ;
    public boolean LIZJ;
    public final int LIZ = 86400000;
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C01GW LJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1437));
    public final C1260640iuU LJFF = C1260620iuS.LIZ();

    public static IEducatePhotoModeService LIZJ() {
        Object objLIZ = C04TD.LIZ(IEducatePhotoModeService.class, false);
        if (objLIZ != null) {
            return (IEducatePhotoModeService) objLIZ;
        }
        if (C04TD.t0 == null) {
            synchronized (IEducatePhotoModeService.class) {
                if (C04TD.t0 == null) {
                    C04TD.t0 = new EducatePhotoModeServiceImpl();
                }
            }
        }
        return C04TD.t0;
    }

    public final boolean LJ() {
        int i = this.LJFF.LIZ.getInt(C1260640iuU.LIZ("number_of_times_generic_notice_shown"), 0);
        long j = this.LJFF.LIZ.getLong(C1260640iuU.LIZ("timestamp_last_photo_mode_publish"), -1L);
        long j2 = this.LJFF.LIZ.getLong(C1260640iuU.LIZ("timestamp_generic_notice"), -1L);
        if (i >= 2) {
            return false;
        }
        if (i == 1 && j > j2) {
            return false;
        }
        ((Uri.Builder) this.LJ.getValue()).appendQueryParameter("notice_type", CardStruct.IStatusCode.DEFAULT);
        return true;
    }

    public final boolean LJFF() {
        int i = this.LJFF.LIZ.getInt(C1260640iuU.LIZ("number_of_times_performance_notice_shown"), 0);
        long j = this.LJFF.LIZ.getLong(C1260640iuU.LIZ("timestamp_last_photo_mode_publish"), -1L);
        this.LJFF.LIZ.getLong(C1260640iuU.LIZ("timestamp_generic_notice"), -1L);
        long j2 = this.LJFF.LIZ.getLong(C1260640iuU.LIZ("timestamp_performance_notice"), -1L);
        long j3 = this.LJFF.LIZ.getLong(C1260640iuU.LIZ("timestamp_first_photo_mode_publish_since_generic_notice"), -1L);
        if (j3 != -1 && (new Date().getTime() - j3) / ((long) this.LIZ) >= 7 && i < 2) {
            return i != 1 || j <= j2;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IEducatePhotoModeService
    public final void onDestroy() {
        C2296808zG.LIZJ(this.LIZLLL, null);
    }

    @Override // com.ss.android.ugc.aweme.service.IEducatePhotoModeService
    public final boolean LIZ(C19EG c19eg) {
        boolean z;
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            return false;
        }
        if ((c19eg != null && DeviceRegisterManager.isNewUserMode(c19eg)) || ((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser() || C1514430pVp.LIZLLL().booleanValue() || !C2276971EAl.LIZ()) {
            return false;
        }
        boolean zLIZ = C1260520iuI.LIZIZ.LIZ();
        this.LIZJ = zLIZ;
        if (!zLIZ) {
            if (!C276760At0.LIZIZ) {
                return false;
            }
            if (!LJ() && !LJFF()) {
                z = false;
            } else {
                z = true;
            }
            this.LIZIZ = z;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static void LIZLLL(BannerDisplayInfo bannerDisplayInfo, String str) {
        C1260720iuc c1260720iuc = C1260720iuc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C01GW c01gw = C1260610iuR.LIZIZ;
        sbLIZ.append(((PhotoModeBannerLearnMoreConfig) c01gw.getValue()).container);
        sbLIZ.append(((PhotoModeBannerLearnMoreConfig) c01gw.getValue()).url);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("&category=");
        sbLIZ2.append(bannerDisplayInfo.category);
        sbLIZ.append(URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ2), "UTF-8"));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("&num_of_people=");
        sbLIZ3.append(bannerDisplayInfo.searchCount);
        sbLIZ.append(URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ3), "UTF-8"));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("&session_id=");
        sbLIZ4.append(str);
        sbLIZ.append(URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ4), "UTF-8"));
        sbLIZ.append(((PhotoModeBannerLearnMoreConfig) c01gw.getValue()).containerParameter);
        sbLIZ.append("&use_preload=1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1260720iuc.getClass();
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIIIZ(strLIZIZ, "photo_mode_spark_biz", null, 12);
    }

    @Override // com.ss.android.ugc.aweme.service.IEducatePhotoModeService
    public final void LIZIZ(ViewStub viewStub, C19EG c19eg, C1257230ioz c1257230ioz) {
        View viewFindViewById;
        if (this.LIZJ) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1260510iuH(this, viewStub, R.id.s5o, c19eg, c1257230ioz, null), 3);
            return;
        }
        if (!this.LIZIZ) {
            return;
        }
        if (LJ()) {
            C1260670iuX c1260670iuX = new C1260670iuX(viewStub, R.id.s5o, c19eg, c1257230ioz);
            C20515215Pi c20515215Pi = c1257230ioz.LIZ;
            c20515215Pi.LJI(new AwS583S0100000_4(c1260670iuX, 269));
            c20515215Pi.LIZ.LJ = c19eg.getString(2131839819);
            c20515215Pi.LIZ.LJFF = C1260670iuX.LIZIZ(2131839818, c19eg, new Object[0]);
            ((SmartRoute) c1260670iuX.LJ.getValue()).withParam("notice_type", 0);
            c20515215Pi.LJ();
            C20514915Pf c20514915Pf = c20515215Pi.LJ;
            if (c20514915Pf != null && (viewFindViewById = c20514915Pf.findViewById(R.id.evm)) != null) {
                viewFindViewById.setClickable(true);
                C786410Ut5.I7(new ACListenerS122S0200000_19(c1260670iuX, c20515215Pi, 49), viewFindViewById);
            }
            C1260670iuX.LJ(c1260670iuX, null, "first", null, null, null, 125);
            C1260640iuU c1260640iuU = this.LJFF;
            c1260640iuU.LIZ.storeInt(C1260640iuU.LIZ("number_of_times_generic_notice_shown"), c1260640iuU.LIZ.getInt(C1260640iuU.LIZ("number_of_times_generic_notice_shown"), 0) + 1);
            c1260640iuU.LIZ.storeLong(C1260640iuU.LIZ("timestamp_generic_notice"), new Date().getTime());
            return;
        }
        if (!LJFF()) {
            return;
        }
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C1260660iuW(this, viewStub, R.id.s5o, c19eg, c1257230ioz, null), 3);
    }
}
