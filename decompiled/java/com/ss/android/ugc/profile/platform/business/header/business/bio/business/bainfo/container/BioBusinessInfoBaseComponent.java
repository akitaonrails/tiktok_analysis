package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container;

import X.C01GW;
import X.C0C38;
import X.C1017070cZd;
import X.C1029590ctp;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2344009Gk;
import X.C2532609wC;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C736480Suk;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class BioBusinessInfoBaseComponent extends HeaderBaseContainerComponent implements IBioBAAbility, InterfaceC487330J9f {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2497));

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility
    public final void bI0() {
        this.LLJJJ--;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public void cp() {
        IHeaderBioAbility iHeaderBioAbility;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderBioAbility.LJIIIZ(this.LLJJ, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IBioBAAbility.class, null, null);
        }
        ProfilePlatformViewModel profilePlatformViewModelSo = So();
        if (profilePlatformViewModelSo != null) {
            profilePlatformViewModelSo.FQ2(new AwS598S0100000_19(this, 480));
        }
        if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IBioBAAbility.class, null);
        }
        if (((Boolean) C2532609wC.LIZJ.getValue()).booleanValue() || C2532609wC.LIZIZ() || ((Boolean) C2532609wC.LJII.getValue()).booleanValue()) {
            ViewGroup viewGroup2 = this.LLJJIJIIJIL;
            ViewParent parent = viewGroup2 != null ? viewGroup2.getParent() : null;
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LLJJIJIIJIL, viewGroup);
            }
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public void Hj(ProfileComponents profileComponents) {
        ProfileComponentUIConfig profileComponentUIConfig;
        dp(profileComponents.components);
        if (C0C38.LIZ() && (profileComponentUIConfig = (ProfileComponentUIConfig) this.LLJJJJLIIL.getValue()) != null) {
            C1248870ibV.LIZJ(this.LLJJIJIIJIL, C1248870ibV.LIZIZ(Integer.valueOf(this.LLJJ), profileComponentUIConfig), true, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        int i;
        LinearLayout linearLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.LLJJIJIIJIL = linearLayout2;
        C786410Ut5.d6(linearLayout2, layoutParams);
        ?? r9 = 0;
        r9 = 0;
        Integer num = 0;
        if (C268330AfP.LIZLLL()) {
            this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
            i = 16;
            C426750GoL.LJIIIZ(linearLayout2, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), num, num, false, 16);
            linearLayout = linearLayout2;
        } else if (C2537109wv.LJFF()) {
            i = 16;
            C426750GoL.LJIIIZ(linearLayout2, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), false, 16);
            linearLayout = linearLayout2;
        } else {
            LinearLayout linearLayout3 = linearLayout2;
            num = num;
            r9 = 0;
            i = 16;
            C426750GoL.LJIIIZ(linearLayout3, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), num, num, false, 16);
            linearLayout = linearLayout3;
        }
        C426750GoL.LJIIL(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), num, i);
        C1248870ibV.LIZJ(linearLayout, C1248870ibV.LIZIZ(Integer.valueOf(this.LLJJ), profileComponentUIConfig), true, r9);
        C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIILIL(linearLayout, null, null);
        linearLayout.setOrientation(r9);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility
    public final void lp2(ProfileCommonInfo profileCommonInfo, String str) {
        Aweme aweme;
        boolean z;
        String str2;
        String uid;
        String uid2;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        ProfilePlatformViewModel profilePlatformViewModelSo = So();
        if (profilePlatformViewModelSo != null) {
            aweme = profilePlatformViewModelSo.getAweme();
            if (aweme != null && C1017070cZd.LJLJJLL(aweme)) {
                C1029590ctp.LIZLLL().LJJIJIIJIL(getContext(), aweme);
                C2184171Adz.LIZLLL("homepage_ad", "homepagelink_click", aweme.getAwemeRawAd()).LJIIIIZZ();
            }
        } else {
            aweme = null;
        }
        getContext();
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.q1()) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "personal_homepage";
        if (z) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        if (profileCommonInfo != null && (userProfileInfo2 = profileCommonInfo.getUserProfileInfo()) != null) {
            uid = userProfileInfo2.getUid();
        } else {
            uid = null;
        }
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("link_type", "download_link");
        C20684815ws.LJIILIIL("click_link", str2, uid, CardStruct.IStatusCode.DEFAULT, c736480Suk.LIZIZ());
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (profileCommonInfo != null && (userProfileInfo = profileCommonInfo.getUserProfileInfo()) != null) {
            uid2 = userProfileInfo.getUid();
        } else {
            uid2 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid2);
        ProfileBaseAbility profileBaseAbility2 = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility2 == null || !profileBaseAbility2.q1()) {
            str3 = "others_homepage";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("link_type", "download_link");
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LIZLLL(0L, "cid");
        c2344009Gk.LJIIIIZZ("log_extra", "");
        C20684815ws.LJIILLIIL("click_link", c2344009Gk.LIZ);
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            if (Intrinsics.LJFF("download_link", "download_link")) {
                C1029590ctp.LIZLLL().LJIIJJI(getContext(), aweme);
            } else {
                if (!Intrinsics.LJFF("download_link", "web_link")) {
                    return;
                }
                C1029590ctp.LIZLLL().LJIJ(getContext(), aweme);
            }
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIILIL(this.LLJJIJIIJIL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility
    public final void LJIIIZ(int i, View view, String str) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams.gravity = 16;
        View view2 = new View(getContext());
        C786410Ut5.W5(view2, layoutParams);
        view2.setBackground(C1308910kAL.LJ(R.attr.ng, view2.getContext()));
        this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
        C426750GoL.LJIIIZ(view2, numValueOf, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false, 16);
        view2.setTag("divider");
        view2.setId(str.hashCode());
        C786410Ut5.W5(view2, layoutParams);
        HeaderBaseContainerComponent.bp(this, str, i, view, null, view2, false, 40);
    }
}
