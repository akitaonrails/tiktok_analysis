package com.ss.android.ugc.aweme.service;

import X.AbstractC848400XPy;
import X.C0ACD;
import X.C0PEM;
import X.C0XQ7;
import X.C1260250itr;
import X.C1260490iuF;
import X.C1260550iuL;
import X.C1260560iuM;
import X.C1346420l8q;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C258700ABw;
import X.C259010ADb;
import X.C259150ADp;
import X.C295490Bi7;
import X.C299450BoV;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerTopicType;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class PhotoModeStrengthenIntentionServiceImpl implements IPhotoModeStrengthenIntentionService {
    public static final /* synthetic */ int LIZJ = 0;
    public final int LIZ = 86400000;
    public final C1260490iuF LIZIZ = C1260250itr.LIZ();

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final boolean LIZ() {
        return ((Number) C295490Bi7.LIZ.getValue()).intValue() == 3 && LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final String LIZLLL() {
        C1260550iuL.LIZ.getClass();
        String str = C1260550iuL.LIZJ;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final void LJ() {
        C1260550iuL.LIZ.getClass();
        C1260550iuL.LIZIZ = null;
        C1260550iuL.LIZJ = null;
        C1260550iuL.LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final boolean LJFF() {
        return C295490Bi7.LIZ() && LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJI() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAccuratePrivateAccount() || ((AccountUserService) C0XQ7.LJFF()).LIZ() || C1346420l8q.LIZ((Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue())) {
            return false;
        }
        int iIntValue = ((Number) C259150ADp.LIZ.getValue()).intValue();
        List list = (List) C299450BoV.LIZIZ.getValue();
        if (list == null) {
            list = C299450BoV.LIZ;
        }
        int iLIZJ = this.LIZIZ.LIZJ();
        long time = (new Date().getTime() - this.LIZIZ.LIZ.getLong(C1260490iuF.LJ("photo_mode_banner_show_timestamp"), -1L)) / ((long) this.LIZ);
        if (iLIZJ >= list.size() || iLIZJ < 0) {
            return false;
        }
        return iLIZJ < iIntValue && time >= ((long) ((Number) ListProtector.get(list, iLIZJ)).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.model.BannerDisplayInfo> r19) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.PhotoModeStrengthenIntentionServiceImpl.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final boolean LJII(int i) {
        if (i == PhotoTopicBannerTopicType.OPERATIONAL.getValue()) {
            return true;
        }
        if (i == PhotoTopicBannerTopicType.TRAVEL.getValue()) {
            int iIntValue = ((Number) C259010ADb.LIZ.getValue()).intValue();
            Keva keva = this.LIZIZ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1260490iuF.LJ("photo_mode_banner_show_type_timestamp"));
            sbLIZ.append('_');
            sbLIZ.append(i);
            if ((new Date().getTime() - keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L)) / ((long) this.LIZ) >= iIntValue) {
                return true;
            }
            return false;
        }
        if (i == PhotoTopicBannerTopicType.REGULAR.getValue()) {
            if ((new Date().getTime() - this.LIZIZ.LIZ.getLong(C1260490iuF.LJ("photo_mode_banner_auto_show_timeout"), -1L)) / ((long) this.LIZ) < ((Number) C0ACD.LIZ.getValue()).intValue()) {
                return false;
            }
        }
        return true;
    }

    public final void LJIIIIZZ(BannerDisplayInfo bannerDisplayInfo) {
        C1260550iuL.LIZ.getClass();
        C1260550iuL.LIZLLL = bannerDisplayInfo;
        int iIntValue = ((Number) C258700ABw.LIZ.getValue()).intValue();
        C1260490iuF c1260490iuF = this.LIZIZ;
        int i = c1260490iuF.LIZ.getInt(C1260490iuF.LJ("photo_mode_banner_auto_show_times"), 0) + 1;
        c1260490iuF.LIZ.storeInt(C1260490iuF.LJ("photo_mode_banner_auto_show_times"), i);
        if (iIntValue != 0 && i >= iIntValue) {
            this.LIZIZ.LIZ.storeInt(C1260490iuF.LJ("photo_mode_banner_auto_show_times"), 0);
            C1260490iuF c1260490iuF2 = this.LIZIZ;
            c1260490iuF2.LIZ.storeLong(C1260490iuF.LJ("photo_mode_banner_auto_show_timeout"), new Date().getTime());
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final void LIZJ(PhotoTopicBannerReadStatus photoTopicBannerReadStatus, String str, Integer num, String str2, Long l) {
        C1260550iuL.LIZ.getClass();
        Integer numValueOf = null;
        Integer num2 = null;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1260560iuM(str, photoTopicBannerReadStatus, num, l, null), 3);
        if (photoTopicBannerReadStatus == PhotoTopicBannerReadStatus.PUBLISH) {
            C1260490iuF c1260490iuFLIZ = C1260250itr.LIZ();
            BannerDisplayInfo bannerDisplayInfo = C1260550iuL.LIZLLL;
            if (bannerDisplayInfo != null) {
                numValueOf = Integer.valueOf(bannerDisplayInfo.hashCode());
            }
            c1260490iuFLIZ.LJIIIIZZ(numValueOf);
            C1260490iuF c1260490iuFLIZ2 = C1260250itr.LIZ();
            BannerDisplayInfo bannerDisplayInfo2 = C1260550iuL.LIZLLL;
            if (bannerDisplayInfo2 != null) {
                num2 = bannerDisplayInfo2.topicType;
            }
            c1260490iuFLIZ2.LJIIIZ(num2);
            if (((Number) C295490Bi7.LIZ.getValue()).intValue() == 3) {
                C1260250itr.LIZ().LJFF(1);
                C1260490iuF.LJII(C1260250itr.LIZ());
                C1260250itr.LIZ().LIZIZ();
            } else {
                if (!C295490Bi7.LIZ()) {
                    return;
                }
                C1260250itr.LIZ().LJFF(0);
                C1260250itr.LIZ().LIZ.storeInt(C1260490iuF.LJ("photo_mode_banner_auto_show_times"), 0);
                C1260250itr.LIZ().LIZ.storeLong(C1260490iuF.LJ("photo_mode_banner_auto_show_timeout"), -1L);
            }
        }
    }
}
