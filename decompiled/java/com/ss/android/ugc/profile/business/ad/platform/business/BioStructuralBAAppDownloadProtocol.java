package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C08JS;
import X.C1050610dRj;
import X.C10EU;
import X.C1251350ifV;
import X.C1558420qem;
import X.C1558520qew;
import X.C20684815ws;
import X.C2344009Gk;
import X.C736480Suk;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.ad.platform.BioDownloadData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralBAAppDownloadProtocol extends BioStructuralBABaseProtocol<BioDownloadData> {
    public boolean LLJJJJJIL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "bio_business_account_app_download";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        BizAccountInfo bizAccountInfo;
        C1050610dRj c1050610dRj = new C1050610dRj();
        User user = this.LLJJJJ;
        String str = this.LLJJIJIL;
        if (str == null) {
            str = "";
        }
        c1050610dRj.LJJIIJZLJL(user, str);
        User user2 = this.LLJJJJ;
        if (user2 != null && (bizAccountInfo = user2.getBizAccountInfo()) != null) {
            BioDownloadData bioDownloadData = (BioDownloadData) this.LLJILJIL;
            bizAccountInfo.setAndroidDownloadAppLink(bioDownloadData != null ? bioDownloadData.getAndroidDownloadAppLink() : null);
        }
        getContext();
        String str2 = this.LLJJIJIL;
        User user3 = this.LLJJJJ;
        String uid = user3 != null ? user3.getUid() : null;
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("link_type", "download_link");
        C20684815ws.LJIILIIL("show_link", str2, uid, CardStruct.IStatusCode.DEFAULT, c736480Suk.LIZIZ());
        C2344009Gk c2344009Gk = new C2344009Gk();
        User user4 = this.LLJJJJ;
        c2344009Gk.LJIIIIZZ("author_id", user4 != null ? user4.getUid() : null);
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJIJIL);
        c2344009Gk.LJIIIIZZ("link_type", "download_link");
        C20684815ws.LJIILLIIL("show_link", c2344009Gk.LIZ);
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String androidDownloadAppLink;
        C1251350ifV state;
        Aweme aweme;
        String aid;
        String uid;
        Aweme aweme2;
        String str;
        String androidDownloadAppLink2;
        C1251350ifV state2;
        IBAProfilePageService iBAProfilePageServiceLJIIL = BAProfilePageServiceImpl.LJIIL();
        Context context = getContext();
        BioDownloadData bioDownloadData = (BioDownloadData) this.LLJILJIL;
        String str2 = "";
        if (bioDownloadData == null || (androidDownloadAppLink = bioDownloadData.getAndroidDownloadAppLink()) == null) {
            androidDownloadAppLink = "";
        }
        this.LLJJJJJIL = iBAProfilePageServiceLJIIL.LJ(context, 4, androidDownloadAppLink, null, null, null, null);
        User user = this.LLJJJJ;
        if (user != null && (uid = user.getUid()) != null && !C10EU.LJIIZILJ(uid)) {
            C1050610dRj c1050610dRj = new C1050610dRj();
            User user2 = this.LLJJJJ;
            IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
            if (iProfilePlatformVM != null && (state2 = iProfilePlatformVM.getState()) != null) {
                aweme2 = state2.LLJILJILJ;
            } else {
                aweme2 = null;
            }
            String str3 = this.LLJJIJIL;
            if (this.LLJJJJJIL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            BioDownloadData bioDownloadData2 = (BioDownloadData) this.LLJILJIL;
            if (bioDownloadData2 == null || (androidDownloadAppLink2 = bioDownloadData2.getAndroidDownloadAppLink()) == null) {
                androidDownloadAppLink2 = "";
            }
            c1050610dRj.LJIILIIL(user2, aweme2, str3, str, androidDownloadAppLink2);
        }
        IBioBAAbility iBioBAAbility = (IBioBAAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IBioBAAbility.class, null);
        if (iBioBAAbility != null) {
            ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
            IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
            if (iProfilePlatformVM2 != null && (state = iProfilePlatformVM2.getState()) != null && (aweme = state.LLJILJILJ) != null && (aid = aweme.getAid()) != null) {
                str2 = aid;
            }
            iBioBAAbility.lp2(profileCommonInfoLJIILIIL, str2);
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        BioDownloadData bioDownloadData;
        try {
            bioDownloadData = (BioDownloadData) C08JS.LIZ(nVar.toString(), BioDownloadData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            bioDownloadData = null;
        }
        this.LLJILJIL = bioDownloadData;
    }
}
