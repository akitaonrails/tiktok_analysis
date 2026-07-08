package com.ss.android.ugc.profile.business.ur.platform;

import X.AbstractC848400XPy;
import X.C08JS;
import X.C0XQ7;
import X.C1242830iRl;
import X.C1250090idT;
import X.C1250110idV;
import X.C1252220igu;
import X.C13LP;
import X.C1558420qem;
import X.C1558520qew;
import X.C2344009Gk;
import X.C291200BbC;
import X.C817410W4t;
import X.EnumC1248370iah;
import android.content.Context;
import android.view.View;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialConnect;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialEntranceData;
import com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAdvancedFeatureSocialConnectProtocol extends AdvancedFeatureProtocol {
    public SocialEntranceData LLJLIL;
    public final String LLJL = "advanced_feature_social_entrance";
    public Map<Integer, C1242830iRl> LLJLILLLLZIIL = new ConcurrentHashMap();

    public final User LJLILLLLZI() {
        if (this.LLJI) {
            return C0XQ7.LJFF().getCurUser();
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            return userProfileAbility.getUser();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_instagram);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return !C291200BbC.LIZ();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        SocialConnect socialConnect;
        SocialConnect socialConnect2;
        SocialConnect socialConnect3;
        SocialConnect socialConnect4;
        SocialConnect socialConnect5;
        SocialConnect socialConnect6;
        SocialConnect socialConnect7;
        SocialConnect socialConnect8;
        User userLJLILLLLZI = LJLILLLLZI();
        if (userLJLILLLLZI != null) {
            SocialEntranceData socialEntranceData = this.LLJLIL;
            String lemon8StoreRegion = null;
            userLJLILLLLZI.setTwitterId((socialEntranceData == null || (socialConnect8 = socialEntranceData.getSocialConnect()) == null) ? null : socialConnect8.getTwitterId());
            SocialEntranceData socialEntranceData2 = this.LLJLIL;
            userLJLILLLLZI.setTwitterName((socialEntranceData2 == null || (socialConnect7 = socialEntranceData2.getSocialConnect()) == null) ? null : socialConnect7.getTwitterName());
            SocialEntranceData socialEntranceData3 = this.LLJLIL;
            userLJLILLLLZI.setYoutubeChannelId((socialEntranceData3 == null || (socialConnect6 = socialEntranceData3.getSocialConnect()) == null) ? null : socialConnect6.getYoutubeChannelId());
            SocialEntranceData socialEntranceData4 = this.LLJLIL;
            userLJLILLLLZI.setYoutubeChannelTitle((socialEntranceData4 == null || (socialConnect5 = socialEntranceData4.getSocialConnect()) == null) ? null : socialConnect5.getYoutubeChannelTitle());
            SocialEntranceData socialEntranceData5 = this.LLJLIL;
            userLJLILLLLZI.setInsId((socialEntranceData5 == null || (socialConnect4 = socialEntranceData5.getSocialConnect()) == null) ? null : socialConnect4.getInsId());
            SocialEntranceData socialEntranceData6 = this.LLJLIL;
            userLJLILLLLZI.setLemon8OpenId((socialEntranceData6 == null || (socialConnect3 = socialEntranceData6.getSocialConnect()) == null) ? null : socialConnect3.getLemon8OpenId());
            SocialEntranceData socialEntranceData7 = this.LLJLIL;
            userLJLILLLLZI.setLemon8UserName((socialEntranceData7 == null || (socialConnect2 = socialEntranceData7.getSocialConnect()) == null) ? null : socialConnect2.getLemon8UserName());
            SocialEntranceData socialEntranceData8 = this.LLJLIL;
            if (socialEntranceData8 != null && (socialConnect = socialEntranceData8.getSocialConnect()) != null) {
                lemon8StoreRegion = socialConnect.getLemon8StoreRegion();
            }
            userLJLILLLLZI.setLemon8StoreRegion(lemon8StoreRegion);
        }
        if (!LJJJZ()) {
            AdvancedFeatureProtocol.LJJLL(this);
            return true;
        }
        if (this.LLJLIL == null) {
            AdvancedFeatureProtocol.LJJLL(this);
            return true;
        }
        if (!this.LLJLILLLLZIIL.isEmpty()) {
            return false;
        }
        AdvancedFeatureProtocol.LJJLL(this);
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol
    public final void LJJLIIIJLJLI() {
        LJJZZI();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String uid;
        UserProfileInfo userProfileInfo;
        String aid;
        C1252220igu otherParams;
        Aweme aweme;
        C1252220igu otherParams2;
        String str;
        if (this.LLJI) {
            uid = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        } else {
            ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
            if (profileCommonInfoLJIILIIL != null && (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) != null) {
                uid = userProfileInfo.getUid();
            } else {
                uid = null;
            }
        }
        String str2 = "";
        if (this.LLJI) {
            aid = "";
        } else {
            UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
            if (userProfileAbility != null && (otherParams = userProfileAbility.getOtherParams()) != null && (aweme = otherParams.LIZJ) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
        }
        String str3 = this.LLJJIJIL;
        if (uid == null) {
            uid = "";
        }
        if (aid == null) {
            aid = "";
        }
        UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
        if (userProfileAbility2 != null && (otherParams2 = userProfileAbility2.getOtherParams()) != null && (str = otherParams2.LJIIJ) != null) {
            str2 = str;
        }
        C1250110idV c1250110idV = new C1250110idV(str3, uid, aid, str2, EnumC1248370iah.INTERACTION);
        C1250090idT c1250090idT = C1250090idT.LIZ;
        User userLJLILLLLZI = LJLILLLLZI();
        Map<Integer, C1242830iRl> map = this.LLJLILLLLZIIL;
        Context context = getContext();
        c1250090idT.getClass();
        C1250090idT.LJI(context, userLJLILLLLZI, c1250110idV, map);
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        SocialEntranceData socialEntranceData = (SocialEntranceData) C08JS.LIZ(nVar.toString(), SocialEntranceData.class);
        this.LLJLIL = socialEntranceData;
        this.LLJJJJ = socialEntranceData;
        C1250090idT c1250090idT = C1250090idT.LIZ;
        User userLJLILLLLZI = LJLILLLLZI();
        c1250090idT.getClass();
        this.LLJLILLLLZIIL = C1250090idT.LIZJ(socialEntranceData, userLJLILLLLZI);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Map<String, String> uP(int i, String str) {
        HashSet hashSet = new HashSet(this.LLJLILLLLZIIL.keySet());
        String str2 = null;
        if (hashSet.isEmpty() || ((Number) C13LP.LJJJJZ(hashSet)).intValue() != 4) {
            return null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (Intrinsics.LJFF(str, "profile_info_click")) {
            Context context = getContext();
            if (context != null) {
                if (C817410W4t.LIZIZ(context) && C817410W4t.LIZJ(context)) {
                    str2 = "jump";
                } else {
                    str2 = "in_app_viewer";
                }
            }
            c2344009Gk.LJFF("result", str2);
        }
        return c2344009Gk.LIZ;
    }
}
