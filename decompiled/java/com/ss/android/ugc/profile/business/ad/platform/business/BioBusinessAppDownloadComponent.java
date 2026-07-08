package com.ss.android.ugc.profile.business.ad.platform.business;

import X.C08JS;
import X.C1050610dRj;
import X.C10EU;
import X.C1216270hkv;
import X.C1248720ibG;
import X.C1251350ifV;
import X.C1558520qew;
import X.C20684815ws;
import X.C2344009Gk;
import X.C736480Suk;
import X.EnumC1248370iah;
import X.EnumC1249830id3;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ad.platform.BioDownloadData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public final class BioBusinessAppDownloadComponent extends BioBusinessBaseUIComponent<BioDownloadData> {
    public boolean LLJLL;

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ap() {
        return "HAS_DOWNLOAD_APP".toLowerCase(Locale.ROOT);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Integer Bp() {
        return Integer.valueOf(R.raw.icon_arrow_down_to_line);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String Ep() {
        return C1216270hkv.LIZJ(2131821573);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        String androidDownloadAppLink;
        C1251350ifV state;
        Aweme aweme;
        String aid;
        String uid;
        String androidDownloadAppLink2;
        C1251350ifV state2;
        IBAProfilePageService iBAProfilePageServiceLJIIL = BAProfilePageServiceImpl.LJIIL();
        Context context = getContext();
        BioDownloadData bioDownloadData = (BioDownloadData) this.LLJJLIIIJLLLLLLLZ;
        String str = "";
        if (bioDownloadData == null || (androidDownloadAppLink = bioDownloadData.getAndroidDownloadAppLink()) == null) {
            androidDownloadAppLink = "";
        }
        Aweme aweme2 = null;
        this.LLJLL = iBAProfilePageServiceLJIIL.LJ(context, 4, androidDownloadAppLink, null, null, null, null);
        User user = getUser();
        if (user != null && (uid = user.getUid()) != null && !C10EU.LJIIZILJ(uid)) {
            C1050610dRj c1050610dRj = new C1050610dRj();
            User user2 = getUser();
            ProfilePlatformViewModel profilePlatformViewModelYp = yp();
            if (profilePlatformViewModelYp != null && (state2 = profilePlatformViewModelYp.getState()) != null) {
                aweme2 = state2.LLJILJILJ;
            }
            String enterFrom = getEnterFrom();
            String str2 = this.LLJLL ? "1" : CardStruct.IStatusCode.DEFAULT;
            BioDownloadData bioDownloadData2 = (BioDownloadData) this.LLJJLIIIJLLLLLLLZ;
            if (bioDownloadData2 == null || (androidDownloadAppLink2 = bioDownloadData2.getAndroidDownloadAppLink()) == null) {
                androidDownloadAppLink2 = "";
            }
            c1050610dRj.LJIILIIL(user2, aweme2, enterFrom, str2, androidDownloadAppLink2);
        }
        kp(C1248720ibG.LIZ(EnumC1249830id3.HAS_DOWNLOAD_APP), EnumC1248370iah.BIO);
        IBioBAAbility iBioBAAbility = (IBioBAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IBioBAAbility.class, null);
        if (iBioBAAbility != null) {
            ProfileCommonInfo profileCommonInfoVo = Vo();
            ProfilePlatformViewModel profilePlatformViewModelYp2 = yp();
            if (profilePlatformViewModelYp2 != null && (state = profilePlatformViewModelYp2.getState()) != null && (aweme = state.LLJILJILJ) != null && (aid = aweme.getAid()) != null) {
                str = aid;
            }
            iBioBAAbility.lp2(profileCommonInfoVo, str);
        }
    }

    public final User getUser() {
        ProfilePlatformViewModel profilePlatformViewModelYp = yp();
        if (profilePlatformViewModelYp != null) {
            return profilePlatformViewModelYp.vQ2();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        BizAccountInfo bizAccountInfo;
        super.tp();
        new C1050610dRj().LJJIIJZLJL(getUser(), getEnterFrom());
        User user = getUser();
        if (user != null && (bizAccountInfo = user.getBizAccountInfo()) != null) {
            BioDownloadData bioDownloadData = (BioDownloadData) this.LLJJLIIIJLLLLLLLZ;
            bizAccountInfo.setAndroidDownloadAppLink(bioDownloadData != null ? bioDownloadData.getAndroidDownloadAppLink() : null);
        }
        getContext();
        String enterFrom = getEnterFrom();
        User user2 = getUser();
        String uid = user2 != null ? user2.getUid() : null;
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("link_type", "download_link");
        C20684815ws.LJIILIIL("show_link", enterFrom, uid, CardStruct.IStatusCode.DEFAULT, c736480Suk.LIZIZ());
        C2344009Gk c2344009Gk = new C2344009Gk();
        User user3 = getUser();
        c2344009Gk.LJIIIIZZ("author_id", user3 != null ? user3.getUid() : null);
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        c2344009Gk.LJIIIIZZ("link_type", "download_link");
        C20684815ws.LJIILLIIL("show_link", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        this.LLJJLIIIJLLLLLLLZ = (T) C08JS.LIZ(nVar.toString(), BioDownloadData.class);
    }
}
