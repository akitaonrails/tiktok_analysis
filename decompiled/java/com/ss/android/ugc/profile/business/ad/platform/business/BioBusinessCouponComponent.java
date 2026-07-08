package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C08JS;
import X.C1017070cZd;
import X.C1216270hkv;
import X.C1248720ibG;
import X.C1251350ifV;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC1248370iah;
import X.EnumC1249830id3;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ad.platform.BioCouponData;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public final class BioBusinessCouponComponent extends BioBusinessBaseUIComponent<BioCouponData> {
    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ap() {
        return "HAS_BA_COUPON".toLowerCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        List<CouponInfo> couponList;
        String uid;
        String currentUserID;
        BioCouponData bioCouponData = (BioCouponData) this.LLJJLIIIJLLLLLLLZ;
        if (bioCouponData == null || (couponList = bioCouponData.getCouponList()) == null) {
            return;
        }
        int i = 0;
        CouponInfo couponInfo = (CouponInfo) ListProtector.get(couponList, 0);
        if (couponInfo != null) {
            kp(C1248720ibG.LIZ(EnumC1249830id3.HAS_BA_COUPON), EnumC1248370iah.BIO);
            BAProfilePageServiceImpl.LJIIL().LIZLLL(getContext(), Fp(), getUser(), couponInfo);
            C2344009Gk c2344009Gk = new C2344009Gk();
            User user = getUser();
            String str = "";
            if (user == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            c2344009Gk.LJIIIIZZ("to_user_id", uid);
            Aweme awemeFp = Fp();
            if (awemeFp != null && !AwemeExtKt.isAdTraffic(awemeFp) && !C1017070cZd.LLILII(Fp())) {
                i = 1;
            }
            c2344009Gk.LIZJ(i, "is_organic");
            Aweme awemeFp2 = Fp();
            c2344009Gk.LJIIIIZZ("item_id", awemeFp2 != null ? awemeFp2.getAid() : null);
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null) {
                str = currentUserID;
            }
            c2344009Gk.LJIIIIZZ("from_user_id", str);
            C20684815ws.LJIILLIIL("ttelite_user_click_coupon", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Integer Bp() {
        return Integer.valueOf(R.raw.icon_coupon);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ep() {
        return C1216270hkv.LIZJ(2131827239);
    }

    public final Aweme Fp() {
        C1251350ifV state;
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp == null || (state = profilePlatformViewModelYp.getState()) == null) {
            return null;
        }
        return state.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        String uid;
        String currentUserID;
        super.Go();
        C2344009Gk c2344009Gk = new C2344009Gk();
        User user = getUser();
        String str = "";
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("to_user_id", uid);
        Aweme awemeFp = Fp();
        c2344009Gk.LIZJ((awemeFp == null || AwemeExtKt.isAdTraffic(awemeFp) || C1017070cZd.LLILII(Fp())) ? 0 : 1, "is_organic");
        Aweme awemeFp2 = Fp();
        c2344009Gk.LJIIIIZZ("item_id", awemeFp2 != null ? awemeFp2.getAid() : null);
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null) {
            str = currentUserID;
        }
        c2344009Gk.LJIIIIZZ("from_user_id", str);
        C20684815ws.LJIILLIIL("ttelite_ba_coupon_exp", c2344009Gk.LIZ);
    }

    public final User getUser() {
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            return profilePlatformViewModelZo.vQ2();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        BizAccountInfo bizAccountInfo;
        List<CouponInfo> couponList;
        super.tp();
        User user = getUser();
        if (user == null || (bizAccountInfo = user.getBizAccountInfo()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        BioCouponData bioCouponData = (BioCouponData) this.LLJJLIIIJLLLLLLLZ;
        if (bioCouponData != null && (couponList = bioCouponData.getCouponList()) != null) {
            Iterator<CouponInfo> it2 = couponList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        bizAccountInfo.setCouponInfo(arrayList);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C08JS.LIZ(nVar.toString(), BioCouponData.class);
    }
}
