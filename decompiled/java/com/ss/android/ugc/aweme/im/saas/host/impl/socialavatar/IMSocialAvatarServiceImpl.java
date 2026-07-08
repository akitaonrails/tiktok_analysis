package com.ss.android.ugc.aweme.im.saas.host.impl.socialavatar;

import X.C099R;
import X.C0HYP;
import X.C0HZE;
import X.C1245160iVW;
import X.C1605770rt9;
import X.C1606010rtX;
import X.C1618440sDa;
import X.C19EG;
import X.C427870Gq9;
import X.C437480HDm;
import X.C437510HDp;
import X.C437530HDr;
import X.C443000HYs;
import X.EnumC1606080rte;
import X.InterfaceC1364105Vn;
import X.InterfaceC1398730mVD;
import X.InterfaceC427850Gq7;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;

/* JADX INFO: loaded from: classes7.dex */
public final class IMSocialAvatarServiceImpl implements SocialAvatarFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final boolean LIZLLL() {
        return C0HZE.LIZIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final boolean LJ() {
        return C0HZE.LIZIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final boolean LJIIIIZZ() {
        C0HYP.LIZ.getClass();
        return C0HYP.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final boolean LIZIZ() {
        return C443000HYs.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final InterfaceC1398730mVD LIZ(C1605770rt9 c1605770rt9) {
        return C1606010rtX.LIZIZ.LIZ(c1605770rt9);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final String LJI(String str) {
        C437480HDm.LIZ.getClass();
        if (C437480HDm.LIZ(str)) {
            return "view_avatar";
        }
        return "create_avatar";
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final boolean LJII(User user) {
        return C1245160iVW.LIZJ(user);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final float LJIIIZ(EnumC1606080rte enumC1606080rte) {
        if (C1618440sDa.LIZIZ.LJJIJLIJ().LIZIZ().LIZ.get("blue_state") != null) {
            return r0.badgeStrokeWidth;
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final void LJIIJ(C19EG c19eg) {
        ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarService.class, false, false, false, 14, null);
        if (iSocialAvatarService != null) {
            iSocialAvatarService.LJIIZILJ(c19eg, "chat", "long_press", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final boolean LJIIL(User user) {
        return C437530HDr.LIZIZ(user);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final Object LIZJ(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarService.class, false, false, false, 14, null);
        if (iSocialAvatarService != null) {
            Object objLIZJ = iSocialAvatarService.LIZJ(str, interfaceC1364105Vn);
            if (objLIZJ == C099R.LJFF()) {
                return objLIZJ;
            }
            return objLIZJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final int LJIIJJI(User user, Integer num) {
        return C437510HDp.LIZ(C437510HDp.LIZ, user, 2131827050, num, null, null, 24);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.socialavatar.SocialAvatarFeature
    public final void LJFF(int i, C427870Gq9 c427870Gq9, InterfaceC427850Gq7 interfaceC427850Gq7) {
        ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarService.class, false, false, false, 14, null);
        if (iSocialAvatarService != null) {
            iSocialAvatarService.LJFF(i, c427870Gq9, interfaceC427850Gq7);
        }
    }
}
