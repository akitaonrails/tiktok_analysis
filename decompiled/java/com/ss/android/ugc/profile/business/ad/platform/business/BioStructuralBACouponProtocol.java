package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C08JS;
import X.C1017070cZd;
import X.C1251350ifV;
import X.C20684815ws;
import X.C2344009Gk;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.ad.platform.BioCouponData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralBACouponProtocol extends BioStructuralBABaseProtocol<BioCouponData> {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "bio_business_account_coupon";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        String uid;
        String currentUserID;
        C2344009Gk c2344009Gk = new C2344009Gk();
        User user = this.LLJJJJ;
        String str = "";
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("to_user_id", uid);
        Aweme awemeLJJLIIIJLJLI = LJJLIIIJLJLI();
        c2344009Gk.LIZJ((awemeLJJLIIIJLJLI == null || AwemeExtKt.isAdTraffic(awemeLJJLIIIJLJLI) || C1017070cZd.LLILII(LJJLIIIJLJLI())) ? 0 : 1, "is_organic");
        Aweme awemeLJJLIIIJLJLI2 = LJJLIIIJLJLI();
        c2344009Gk.LJIIIIZZ("item_id", awemeLJJLIIIJLJLI2 != null ? awemeLJJLIIIJLJLI2.getAid() : null);
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null) {
            str = currentUserID;
        }
        c2344009Gk.LJIIIIZZ("from_user_id", str);
        C20684815ws.LJIILLIIL("ttelite_ba_coupon_exp", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        BizAccountInfo bizAccountInfo;
        List<CouponInfo> couponList;
        User user = this.LLJJJJ;
        if (user == null || (bizAccountInfo = user.getBizAccountInfo()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        BioCouponData bioCouponData = (BioCouponData) this.LLJILJIL;
        if (bioCouponData != null && (couponList = bioCouponData.getCouponList()) != null) {
            Iterator<CouponInfo> it2 = couponList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        bizAccountInfo.setCouponInfo(arrayList);
        return false;
    }

    public final Aweme LJJLIIIJLJLI() {
        C1251350ifV state;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM == null || (state = iProfilePlatformVM.getState()) == null) {
            return null;
        }
        return state.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        int size;
        BioCouponData bioCouponData;
        List<CouponInfo> couponList;
        CouponInfo couponInfo;
        String uid;
        String aid;
        String currentUserID;
        List<CouponInfo> couponList2;
        BioCouponData bioCouponData2 = (BioCouponData) this.LLJILJIL;
        int i = 0;
        if (bioCouponData2 != null && (couponList2 = bioCouponData2.getCouponList()) != null) {
            size = couponList2.size();
        } else {
            size = 0;
        }
        if (size > 0 && (bioCouponData = (BioCouponData) this.LLJILJIL) != null && (couponList = bioCouponData.getCouponList()) != null && (couponInfo = (CouponInfo) ListProtector.get(couponList, 0)) != null) {
            BAProfilePageServiceImpl.LJIIL().LIZLLL(getContext(), LJJLIIIJLJLI(), this.LLJJJJ, couponInfo);
            C2344009Gk c2344009Gk = new C2344009Gk();
            User user = this.LLJJJJ;
            String str = "";
            if (user == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            c2344009Gk.LJIIIIZZ("to_user_id", uid);
            Aweme awemeLJJLIIIJLJLI = LJJLIIIJLJLI();
            if (awemeLJJLIIIJLJLI != null && !AwemeExtKt.isAdTraffic(awemeLJJLIIIJLJLI) && !C1017070cZd.LLILII(LJJLIIIJLJLI())) {
                i = 1;
            }
            c2344009Gk.LIZJ(i, "is_organic");
            Aweme awemeLJJLIIIJLJLI2 = LJJLIIIJLJLI();
            if (awemeLJJLIIIJLJLI2 != null) {
                aid = awemeLJJLIIIJLJLI2.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("item_id", aid);
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null) {
                str = currentUserID;
            }
            c2344009Gk.LJIIIIZZ("from_user_id", str);
            C20684815ws.LJIILLIIL("ttelite_user_click_coupon", c2344009Gk.LIZ);
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        BioCouponData bioCouponData;
        try {
            bioCouponData = (BioCouponData) C08JS.LIZ(nVar.toString(), BioCouponData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            bioCouponData = null;
        }
        this.LLJILJIL = bioCouponData;
    }
}
