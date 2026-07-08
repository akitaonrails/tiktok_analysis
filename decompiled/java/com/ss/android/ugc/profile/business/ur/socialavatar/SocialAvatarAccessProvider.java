package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.C01GW;
import X.C06P0;
import X.C1644706cH;
import X.C1644806cI;
import X.C1645306cN;
import X.C437560HDu;
import X.C452501pT;
import X.EnumC437540HDs;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialAvatarAccessProvider implements SocialAvatarAccess {
    public final C01GW LIZ = C452501pT.LIZIZ(new C06P0());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1644706cH());

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess
    public final boolean LIZ() {
        return C1644806cI.LIZIZ();
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess
    public final boolean LIZIZ() {
        return C1644806cI.LIZ() == 1 && LIZLLL();
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess
    public final boolean LIZJ() {
        return C1644806cI.LIZJ();
    }

    @Override // com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess
    public final boolean LIZLLL() {
        if (C1645306cN.LIZ() && !((IIMSocialAvatarService) this.LIZ.getValue()).LJJLIIIJJIZ() && (LJ() == EnumC437540HDs.IDLE || LJ() == EnumC437540HDs.UNKNOWN)) {
            return false;
        }
        return C1644806cI.LIZJ();
    }

    public final EnumC437540HDs LJ() {
        User currentUser;
        String uid;
        EnumC437540HDs enumC437540HDs;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null || (enumC437540HDs = ((C437560HDu) ((ISocialAvatarCreationStatusService) this.LIZIZ.getValue()).LIZ(uid).getValue()).LIZ) == null) ? EnumC437540HDs.UNKNOWN : enumC437540HDs;
    }
}
