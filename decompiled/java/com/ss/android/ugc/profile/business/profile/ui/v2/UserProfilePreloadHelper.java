package com.ss.android.ugc.profile.business.profile.ui.v2;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0PEM;
import X.C0XQ7;
import X.C1251760igA;
import X.C1251770igB;
import X.C1251800igE;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C2549809yy;
import X.C299880BpC;
import X.C361001ai;
import android.util.LruCache;
import com.ss.android.ugc.aweme.im.saas.host.api.profile.IMHostApiIUserProfilePreload;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfilePreloadHelper implements IUserProfilePreload, IMHostApiIUserProfilePreload {
    public String LIZIZ = C0XQ7.LJFF().getCurUserId();
    public boolean LIZJ = true;
    public boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void LJ() {
        ((List) C1251770igB.LIZIZ.getValue()).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void clearCache() {
        ((List) C1251770igB.LIZIZ.getValue()).clear();
        ((LruCache) C1251770igB.LIZ.getValue()).evictAll();
        C1251800igE c1251800igE = (C1251800igE) C1251770igB.LIZJ.getValue();
        c1251800igE.getClass();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C361001ai(c1251800igE, null), 3);
        C1251760igA.LIZ.getClass();
        ((LruCache) C1251760igA.LIZLLL.getValue()).evictAll();
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final boolean LIZLLL() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final boolean LJFF() {
        return this.LIZJ;
    }

    public static boolean LJIIIIZZ(User user) {
        if (user == null) {
            return false;
        }
        if ((!user.isAccuratePrivateAccount() || user.getFollowStatus() >= 1) && !user.isBlocked() && !user.isBlock) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload, com.ss.android.ugc.aweme.im.saas.host.api.profile.IMHostApiIUserProfilePreload
    public final void LIZ(User user) {
        ((List) C1251770igB.LIZIZ.getValue()).add(user);
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void LIZIZ(User user) {
        if (!LJIIIIZZ(user)) {
            ((LruCache) C1251770igB.LIZ.getValue()).put(user.getUid(), user);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void LIZJ(boolean z) {
        this.LIZLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void LJI(boolean z) {
        this.LIZJ = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final User LJII(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        if (!Intrinsics.LJFF(this.LIZIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            clearCache();
            this.LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        }
        User userLIZ = C1251770igB.LIZ(str);
        if (userLIZ != null) {
            if (userLIZ.getFollowerCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                userLIZ.setFollowerCount(-1);
            } else if (userLIZ != null) {
            }
            if (userLIZ.getFollowingCount() == 0) {
                userLIZ.setFollowingCount(-1);
            }
            if (userLIZ.getTotalFavorited() == 0 || userLIZ.getFollowerCount() == -1 || userLIZ.getFollowingCount() == -1) {
                userLIZ.setTotalFavorited(-1L);
            }
        }
        if (C299880BpC.LIZ() && userLIZ != null) {
            userLIZ.isShowMessageEntrance = true;
        }
        C01GW c01gw = C1251770igB.LIZ;
        User user = (User) ((LruCache) c01gw.getValue()).get(str);
        if (user != null) {
            if (LJIIIIZZ(userLIZ)) {
                ((LruCache) c01gw.getValue()).remove(str);
                if (C2549809yy.LIZ != 1) {
                    return null;
                }
                this.LIZJ = true;
                return userLIZ;
            }
            this.LIZJ = false;
            return user;
        }
        this.LIZJ = true;
        return userLIZ;
    }
}
