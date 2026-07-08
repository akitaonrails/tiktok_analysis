package com.ss.android.ugc.profile.business.profile.edit.pop;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C0XQ7;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditBottomBannerImpl implements IProfileEditBottomBanner {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(361));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2096));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(363));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(362));

    public static IProfileEditBottomBanner LIZJ() {
        Object objLIZ = C04TD.LIZ(IProfileEditBottomBanner.class, false);
        if (objLIZ != null) {
            return (IProfileEditBottomBanner) objLIZ;
        }
        if (C04TD.E6 == null) {
            synchronized (IProfileEditBottomBanner.class) {
                if (C04TD.E6 == null) {
                    C04TD.E6 = new ProfileEditBottomBannerImpl();
                }
            }
        }
        return C04TD.E6;
    }

    public final Keva LJ() {
        return (Keva) this.LIZIZ.getValue();
    }

    public static boolean LIZLLL() {
        List<String> list = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().boldFields;
        if (list == null || list.isEmpty()) {
            return true;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        return (curUser.boldFields.contains("photo") && curUser.boldFields.contains("nickname") && curUser.boldFields.contains("bio")) ? false : true;
    }

    public static String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // com.ss.android.ugc.profile.business.profile.edit.pop.IProfileEditBottomBanner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(boolean r8, java.lang.Boolean r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.edit.pop.ProfileEditBottomBannerImpl.LIZIZ(boolean, java.lang.Boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    @Override // com.ss.android.ugc.profile.business.profile.edit.pop.IProfileEditBottomBanner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C0TGX r14, X.C20515215Pi r15, androidx.fragment.app.Fragment r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.edit.pop.ProfileEditBottomBannerImpl.LIZ(X.0TGX, X.15Pi, androidx.fragment.app.Fragment, boolean):void");
    }
}
