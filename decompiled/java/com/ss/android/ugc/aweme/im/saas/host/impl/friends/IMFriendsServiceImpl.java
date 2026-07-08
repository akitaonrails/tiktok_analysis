package com.ss.android.ugc.aweme.im.saas.host.impl.friends;

import X.C07NC;
import X.C0SY5;
import X.C0SY7;
import X.C0XIR;
import X.C1076010e6h;
import X.C1243240iSQ;
import X.C1247000iYU;
import X.C1247120iYg;
import X.C1252380ihA;
import X.C1260960iv0;
import X.C1387050mCN;
import X.C1843500y4a;
import X.C1908830zlx;
import X.C1908890zm3;
import X.C19EG;
import X.C20640015pe;
import X.C20642515q3;
import X.C2097908Jt;
import X.C343230Dcv;
import X.EnumC1387060mCO;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class IMFriendsServiceImpl implements IMFriendsService {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final boolean LJII() {
        C07NC.LIZ.getClass();
        return C07NC.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final EventLiveData<FollowStatus> getRelationObservable() {
        return C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final String LIZ(User user) {
        C20640015pe.LIZ.getClass();
        return C20640015pe.LIZ(user);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final String LIZJ(User user) {
        C20640015pe.LIZ.getClass();
        return C20642515q3.LJ(2131755688, user.getFollowerCount(), C1843500y4a.LIZIZ(user.getFollowerCount()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final C1260960iv0 LIZLLL(Map map) {
        User user = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        Object[] objArr62 = 0 == true ? 1 : 0;
        return new C1260960iv0("member_list", user, "expand_group_chat", (String) objArr, (String) objArr2, (String) objArr3, (Integer) objArr4, (String) objArr5, (String) objArr6, (String) objArr7, (String) objArr8, (String) objArr9, (String) objArr10, (String) objArr11, (String) objArr12, (String) objArr13, (String) objArr14, 0, (int) (0 == true ? 1 : 0), (Boolean) objArr15, (int) (0 == true ? 1 : 0), (String) objArr16, (boolean) (0 == true ? 1 : 0), (Boolean) objArr17, (Boolean) objArr18, (String) objArr19, (String) objArr20, (String) objArr21, (String) objArr22, (String) objArr23, (String) objArr24, (String) objArr25, (String) objArr26, (String) objArr27, (Integer) objArr28, (String) objArr29, (Integer) objArr30, (String) objArr31, (int) (0 == true ? 1 : 0), (String) objArr32, (Boolean) objArr33, map, (String) objArr34, (Integer) objArr35, (Integer) objArr36, (String) objArr37, (String) objArr38, (int) (0 == true ? 1 : 0), (String) objArr39, (Long) objArr40, (int) (0 == true ? 1 : 0), (Integer) objArr41, (String) objArr42, (String) objArr43, (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (Integer) objArr44, (Map) objArr45, (String) objArr46, (Boolean) objArr47, (Integer) objArr48, (Integer) objArr49, (String) objArr50, (String) objArr51, (Integer) objArr52, (Integer) objArr53, (Integer) objArr54, (String) objArr55, (String) objArr56, (String) objArr57, (Integer) objArr58, (Integer) objArr59, (String) objArr60, (C1247120iYg) objArr61, (Map) objArr62, -6, -2049, 16383);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final LifecycleOwner LJI(Context context) {
        return C0SY5.LIZIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final C1908830zlx LJIIIIZZ(User user) {
        return new C1387050mCN(user).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final String LIZIZ(String str, String str2) {
        String strLIZJ;
        if (str != null) {
            C1243240iSQ.LIZ.getClass();
            if (C343230Dcv.LIZ() && (strLIZJ = C1247000iYU.LIZJ(str)) != null) {
                return strLIZJ;
            }
            return str2;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final void LJ(C19EG c19eg, C1252380ihA c1252380ihA, String str, Function2<? super Boolean, ? super C0XIR, Unit> function2) {
        C1076010e6h.LIZJ.LIZIZ().LIZIZ(c19eg).AI2(c1252380ihA, str, function2);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService
    public final void LJFF(RelationButton relationButton, User user, boolean z, LifecycleOwner lifecycleOwner, C1908890zm3 c1908890zm3) {
        C1387050mCN c1387050mCN = new C1387050mCN(user);
        if (lifecycleOwner == null) {
            lifecycleOwner = IMainSAFLifecycleKt.findSAFExpLifecycleOwner(relationButton, (C19EG) null);
        }
        c1387050mCN.LJIIJJI = lifecycleOwner;
        c1387050mCN.LJ = EnumC1387060mCO.MESSAGE;
        c1387050mCN.LJII.putAll(C2097908Jt.LIZJ(new Pair(C0SY7.FOLLOW_MUTUAL, c1908890zm3)));
        c1387050mCN.LJIIJ = z;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
    }
}
