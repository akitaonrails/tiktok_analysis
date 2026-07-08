package com.ss.android.ugc.profile.business.ur.platform;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1242830iRl;
import X.C1249090ibr;
import X.C1250040idO;
import X.C1250050idP;
import X.C1250090idT;
import X.C1250110idV;
import X.C1250210idf;
import X.C1252220igu;
import X.C1252230igv;
import X.C1558520qew;
import X.C1559260qg8;
import X.C20642515q3;
import X.C2097608Jq;
import X.C291200BbC;
import X.C723580SZw;
import X.EnumC1248370iah;
import X.InterfaceC665370Q7z;
import com.google.gson.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialConnect;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialEntranceData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCTASocialEntranceComponent extends HeaderCTABaseUIComponent {
    public Map<Integer, C1242830iRl> LLJZIJLIL = C2097608Jq.LJ();
    public SocialEntranceData LLL;

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        int i = this.LLJILLL;
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.k82(i, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        String uid;
        UserProfileInfo userProfileInfo;
        String str;
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        String str2;
        C1252220igu otherParams2;
        SocialConnect socialConnect;
        SocialConnect socialConnect2;
        SocialConnect socialConnect3;
        SocialConnect socialConnect4;
        SocialConnect socialConnect5;
        SocialConnect socialConnect6;
        SocialConnect socialConnect7;
        SocialConnect socialConnect8;
        User userXp = Xp();
        if (userXp != null) {
            SocialEntranceData socialEntranceData = this.LLL;
            userXp.setTwitterId((socialEntranceData == null || (socialConnect8 = socialEntranceData.getSocialConnect()) == null) ? null : socialConnect8.getTwitterId());
            SocialEntranceData socialEntranceData2 = this.LLL;
            userXp.setTwitterName((socialEntranceData2 == null || (socialConnect7 = socialEntranceData2.getSocialConnect()) == null) ? null : socialConnect7.getTwitterName());
            SocialEntranceData socialEntranceData3 = this.LLL;
            userXp.setYoutubeChannelId((socialEntranceData3 == null || (socialConnect6 = socialEntranceData3.getSocialConnect()) == null) ? null : socialConnect6.getYoutubeChannelId());
            SocialEntranceData socialEntranceData4 = this.LLL;
            userXp.setYoutubeChannelTitle((socialEntranceData4 == null || (socialConnect5 = socialEntranceData4.getSocialConnect()) == null) ? null : socialConnect5.getYoutubeChannelTitle());
            SocialEntranceData socialEntranceData5 = this.LLL;
            userXp.setInsId((socialEntranceData5 == null || (socialConnect4 = socialEntranceData5.getSocialConnect()) == null) ? null : socialConnect4.getInsId());
            SocialEntranceData socialEntranceData6 = this.LLL;
            userXp.setLemon8OpenId((socialEntranceData6 == null || (socialConnect3 = socialEntranceData6.getSocialConnect()) == null) ? null : socialConnect3.getLemon8OpenId());
            SocialEntranceData socialEntranceData7 = this.LLL;
            userXp.setLemon8UserName((socialEntranceData7 == null || (socialConnect2 = socialEntranceData7.getSocialConnect()) == null) ? null : socialConnect2.getLemon8UserName());
            SocialEntranceData socialEntranceData8 = this.LLL;
            userXp.setLemon8StoreRegion((socialEntranceData8 == null || (socialConnect = socialEntranceData8.getSocialConnect()) == null) ? null : socialConnect.getLemon8StoreRegion());
        }
        if (!sp()) {
            Gp();
            return;
        }
        if (!this.LLILZ || this.LLL == null) {
            Gp();
            return;
        }
        if (q1()) {
            uid = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        } else {
            ProfileCommonInfo profileCommonInfoVo = Vo();
            uid = (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null) ? null : userProfileInfo.getUid();
        }
        if (q1()) {
            str = "";
        } else {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            str = (interfaceC665370Q7zLJIIL == null || (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, UserProfileAbility.class, null)) == null || (otherParams = userProfileAbility.getOtherParams()) == null) ? null : otherParams.LJIILL;
        }
        boolean zQ1 = q1();
        String str3 = zQ1 ? "personal_homepage" : "others_homepage";
        C1249090ibr c1249090ibr = (C1249090ibr) new C1559260qg8(new C723580SZw(this, C1249090ibr.class, null), checkSupervisorPrepared()).getValue();
        C1252230igv c1252230igv = c1249090ibr != null ? c1249090ibr.LLIZLLLIL : null;
        if (zQ1) {
            if (Intrinsics.LJFF(c1252230igv != null ? c1252230igv.LLILLL : null, "sticker_set_details_page")) {
                str3 = "sticker_set_details_page";
            }
        } else {
            if (Intrinsics.LJFF(c1252230igv != null ? c1252230igv.LLILLL : null, "sticker_set_details_page")) {
                str3 = "sticker_set_details_page";
            }
        }
        if (uid == null) {
            uid = "";
        }
        if (str == null) {
            str = "";
        }
        UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility2 == null || (otherParams2 = userProfileAbility2.getOtherParams()) == null || (str2 = otherParams2.LJIIJ) == null) {
            str2 = "";
        }
        C1250110idV c1250110idV = new C1250110idV(str3, uid, str, str2, EnumC1248370iah.CTA);
        if (this.LLJZIJLIL.isEmpty()) {
            Gp();
            return;
        }
        C1250090idT c1250090idT = C1250090idT.LIZ;
        Set<Integer> setKeySet = this.LLJZIJLIL.keySet();
        C1250040idO c1250040idO = new C1250040idO(this);
        C1250050idP c1250050idP = new C1250050idP(this);
        c1250090idT.getClass();
        if (setKeySet.contains(4)) {
            c1250040idO.invoke(Integer.valueOf(R.raw.icon_lemon8_smile));
            c1250050idP.invoke(C20642515q3.LJFF().getString(2131822635));
        } else if (setKeySet.contains(1)) {
            c1250040idO.invoke(Integer.valueOf(R.raw.icon_instagram));
            c1250050idP.invoke(C20642515q3.LJFF().getString(2131823302));
        } else if (setKeySet.contains(2)) {
            c1250040idO.invoke(Integer.valueOf(R.raw.icon_youtube));
            c1250050idP.invoke(C20642515q3.LJFF().getString(2131823307));
        } else if (setKeySet.contains(3)) {
            c1250040idO.invoke(Integer.valueOf(R.raw.icon_twitter));
            c1250050idP.invoke(C20642515q3.LJFF().getString(2131823306));
        }
        Pc1(null, new AwS420S0200000_19(this, c1250110idV, 206));
        EnumC1248370iah enumC1248370iah = EnumC1248370iah.CTA;
        Locale locale = Locale.ROOT;
        lp(enumC1248370iah, "HAS_TWITTER_FUNCTION".toLowerCase(locale), this.LLJZIJLIL.containsKey(3));
        lp(EnumC1248370iah.CTA, "HAS_YOUTUBE_FUNCTION".toLowerCase(locale), this.LLJZIJLIL.containsKey(2));
        lp(EnumC1248370iah.CTA, "HAS_INSTAGRAM_FUNCTION".toLowerCase(locale), this.LLJZIJLIL.containsKey(1));
        lp(EnumC1248370iah.CTA, "HAS_LEMON8_FUNCTION".toLowerCase(locale), this.LLJZIJLIL.containsKey(4));
        if (this.LLJZIJLIL.size() > 1) {
            lp(EnumC1248370iah.CTA, "HAS_SOCIAL_BUTTON".toLowerCase(locale), true);
        }
        Ip();
        User userXp2 = Xp();
        if (userXp2 != null) {
            ArrayList arrayList = new ArrayList(C1250090idT.LIZ(getContext(), userXp2, c1250110idV, this.LLJZIJLIL));
            IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
            if (iHeaderCTAAbility != null) {
                String str4 = this.assemTagInternal;
                iHeaderCTAAbility.Jo0(str4 != null ? str4 : "", arrayList);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final Integer up() {
        Icon icon;
        Integer iconInt$default;
        SocialEntranceData socialEntranceData = this.LLL;
        int iIntValue = R.raw.icon_instagram;
        if (socialEntranceData != null && (icon = socialEntranceData.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, Integer.valueOf(R.raw.icon_instagram), 1, null)) != null) {
            iIntValue = iconInt$default.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        ProfilePlatformViewModel profilePlatformViewModelZo;
        if (q1() || (profilePlatformViewModelZo = Zo()) == null) {
            return;
        }
        profilePlatformViewModelZo.FQ2(new AwS598S0100000_19(this, 835));
    }

    public final User Xp() {
        if (q1()) {
            return C0XQ7.LJFF().getCurUser();
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            return userProfileAbility.getUser();
        }
        return null;
    }

    public final boolean q1() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null) {
            return profileBaseAbility.q1();
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final boolean sp() {
        return !C291200BbC.LIZ();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        if (!sp()) {
            Gp();
            return;
        }
        SocialEntranceData socialEntranceData = (SocialEntranceData) C1250210idf.LIZ(nVar.toString(), SocialEntranceData.class);
        this.LLL = socialEntranceData;
        C1250090idT c1250090idT = C1250090idT.LIZ;
        User userXp = Xp();
        c1250090idT.getClass();
        this.LLJZIJLIL = C1250090idT.LIZJ(socialEntranceData, userXp);
    }
}
