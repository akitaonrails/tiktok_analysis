package com.ss.android.ugc.profile.business.profile.popup;

import X.AbstractC666100QAu;
import X.C01GW;
import X.C0BXP;
import X.C10F8;
import X.C1246080iX0;
import X.C1246090iX1;
import X.C1252550ihR;
import X.C1254120ijy;
import X.C1260870iur;
import X.C13DL;
import X.C1445970njP;
import X.C14EU;
import X.C19296410eQ;
import X.C2214201BlK;
import X.C267420Adw;
import X.C443120HZe;
import X.C452501pT;
import X.C746760TRa;
import X.C786410Ut5;
import X.InterfaceC1254080iju;
import X.InterfaceC20660615sy;
import X.ViewOnClickListenerC1238510iKn;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl;
import com.ss.android.ugc.aweme.series.banner.serviceimpl.SeriesAwareBannerServiceImpl;
import com.ss.android.ugc.aweme.series.banner.serviceimpl.ServiceBannerServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.common.component.fragment.ComponentFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS46S0001000_35;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MyProfileGuideWidgetV2 extends BaseMyProfileGuideWidget implements C10F8 {
    public final InterfaceC20660615sy LLJL;
    public C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;

    @Override // X.C10F8
    public final void onFailed(Exception exc) {
    }

    @Override // com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget, com.ss.android.ugc.profile.business.profile.popup.ProfileWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.widget.Widget
    public final void onStop() {
        if (C2214201BlK.LJIIJJI) {
            return;
        }
        LJII();
    }

    @Override // com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget, com.ss.android.ugc.profile.business.profile.popup.ProfileWidget, com.bytedance.widget.Widget
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(71917);
        super.onCreate();
        C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
        this.LLJLIL = c1260870iurProvidePushSettingFetchPresenter;
        c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(this);
        this.LLJLIL.LIZJ(new Object[0]);
        C746760TRa.LIZ().LJJLIIIIJ();
        ProfileViewModel profileViewModelLJI = LJI();
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 335);
        profileViewModelLJI.getClass();
        C1254120ijy c1254120ijy = C1254120ijy.LL;
        JediViewModel.bR2(profileViewModelLJI, c1254120ijy, null, new AwS581S0100000_2((Function1) awS598S0100000_19, (Function1<Object, String>) 631), 2, null);
        ProfileViewModel profileViewModelLJI2 = LJI();
        AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(this, 69);
        profileViewModelLJI2.getClass();
        JediViewModel.bR2(profileViewModelLJI2, c1254120ijy, null, new AwS581S0100000_2((Function1) awS582S0100000_3, (Function1<Object, String>) 631), 2, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget, com.bytedance.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iur = this.LLJLIL;
        if (c1260870iur != null) {
            c1260870iur.LIZ();
        }
        SeriesAwareBannerServiceImpl.LJFF().LIZ();
        ServiceBannerServiceImpl.LJFF().LIZ();
        EducatePhotoModeServiceImpl.LIZJ().onDestroy();
    }

    @Override // com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget, com.bytedance.widget.Widget
    public final void onResume() {
        super.onResume();
        if (this.LLILZ.findViewById(R.id.view_bind_phone_number_notice).getVisibility() == 0) {
            C1252550ihR.LIZ.getClass();
            if (C1252550ihR.LJIIIZ()) {
                C786410Ut5.B1((ViewOnClickListenerC1238510iKn) this.LLILZ.findViewById(R.id.view_bind_phone_number_notice), 8);
            }
        }
    }

    @Override // X.C10F8
    public final void Hl(PushSettings pushSettings) {
        if (pushSettings.downloadPrompt == 1) {
            ProfileViewModel profileViewModelLJI = LJI();
            int i = pushSettings.downloadSetting;
            profileViewModelLJI.getClass();
            profileViewModelLJI.setState(new AwS46S0001000_35(i, 16));
        }
    }

    @C14EU(sticky = true)
    public final void onPublishStatus(C1445970njP c1445970njP) {
        ((InterfaceC1254080iju) this.LLJLL.getValue()).LIZLLL(c1445970njP);
    }

    @Override // com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget
    public final C443120HZe[] LJIILLIIL(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        return (C443120HZe[]) C13DL.LJIIIZ(C13DL.LJIIIZ(new C443120HZe[]{new C443120HZe(Boolean.valueOf(C0BXP.LIZ()), new AwS563S0100000_19(this, 2970), new AwS563S0100000_19(this, 2975))}, LJJIIZ(myProfileGuideState, profileState)), LJJIIJZLJL(myProfileGuideState, profileState));
    }

    @Override // com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget
    public final C443120HZe[] LJIIZILJ(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        return (C443120HZe[]) C13DL.LJIIIZ(LJJIIZ(myProfileGuideState, profileState), LJJIIJZLJL(myProfileGuideState, profileState));
    }

    @Override // com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget
    public final C443120HZe[] LJIJ(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        return LJJIIZ(myProfileGuideState, profileState);
    }

    public final C443120HZe[] LJJIIJZLJL(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        C443120HZe[] c443120HZeArr = new C443120HZe[44];
        Boolean bool = Boolean.TRUE;
        boolean z = false;
        c443120HZeArr[0] = new C443120HZe(bool, new AwS563S0100000_19(this, 3029), new AwS563S0100000_19(this, 2976));
        c443120HZeArr[1] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(675), new AwS563S0100000_19(this, 2965));
        c443120HZeArr[2] = new C443120HZe(bool, new AwS563S0100000_19(this, profileState, 3003), new AwS563S0100000_19(this, 3042));
        c443120HZeArr[3] = new C443120HZe(bool, new AwS563S0100000_19(this, 2987), new AwS563S0100000_19(this, 3023));
        c443120HZeArr[4] = new C443120HZe(bool, new AwS547S0100000_3(this, 115), new AwS563S0100000_19(this, 2993));
        c443120HZeArr[5] = new C443120HZe(bool, new AwS563S0100000_19(this, 2996), new AwS563S0100000_19(this, 3001));
        c443120HZeArr[6] = new C443120HZe(bool, new AwS563S0100000_19(profileState, 3006), new AwS420S0200000_19(this, profileState, 166));
        c443120HZeArr[7] = new C443120HZe(bool, new AwS557S0100000_13(this, 159), new AwS563S0100000_19(this, 3016));
        c443120HZeArr[8] = new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 168), new AwS563S0100000_19(this, 3022));
        c443120HZeArr[9] = new C443120HZe(bool, new AwS263S0300000_19(this, myProfileGuideState, profileState, 25), new AwS563S0100000_19(this, 3032));
        c443120HZeArr[10] = new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 169), new AwS563S0100000_19(this, 3040));
        c443120HZeArr[11] = new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 171), new AwS420S0200000_19(this, myProfileGuideState, 155));
        c443120HZeArr[12] = new C443120HZe(bool, AFwS192S0000000_6.get$arr$(486), new AwS563S0100000_19(this, 2964));
        c443120HZeArr[13] = new C443120HZe(bool, new AwS420S0200000_19(this, profileState, 159), new AwS420S0200000_19(this, myProfileGuideState, 160));
        c443120HZeArr[14] = new C443120HZe(bool, new AwS563S0100000_19(this, 2971), new AwS563S0100000_19(this, 2979));
        c443120HZeArr[15] = new C443120HZe(bool, new AwS563S0100000_19(this, 2982), new AwS563S0100000_19(this, 2985));
        c443120HZeArr[16] = new C443120HZe(bool, new AwS563S0100000_19(this, 2989), new AwS563S0100000_19(this, 2994));
        c443120HZeArr[17] = new C443120HZe(bool, new AwS563S0100000_19(this, 2997), new AwS563S0100000_19(this, 3002));
        c443120HZeArr[18] = new C443120HZe(bool, new AwS563S0100000_19(profileState, 3007), new AwS563S0100000_19(this, 3011));
        c443120HZeArr[19] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(674), new AwS563S0100000_19(this, 3018));
        c443120HZeArr[20] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(677), new AwS563S0100000_19(this, 3025));
        c443120HZeArr[21] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(679), new AwS563S0100000_19(this, 3033));
        c443120HZeArr[22] = new C443120HZe(bool, new AwS563S0100000_19(this, 3036), new AwS563S0100000_19(this, 3041));
        c443120HZeArr[23] = new C443120HZe(bool, new AwS563S0100000_19(this, profileState, 3044), new AwS563S0100000_19(this, 2960));
        c443120HZeArr[24] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(665), new AwS563S0100000_19(this, 2966));
        if (myProfileGuideState.getPostListHasLoaded() && profileState.isPostGuideShow() != null) {
            z = true;
        }
        c443120HZeArr[25] = new C443120HZe(Boolean.valueOf(z), new AwS420S0200000_19(this, profileState, 161), new AwS563S0100000_19(this, 2972));
        c443120HZeArr[26] = new C443120HZe(bool, new AwS563S0100000_19(this, 2977), new AwS563S0100000_19(this, 2980));
        c443120HZeArr[27] = new C443120HZe(bool, AFwS187S0000000_2.get$arr$(1015), new AwS563S0100000_19(this, 2986));
        c443120HZeArr[28] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(668), new AwS563S0100000_19(this, 2995));
        c443120HZeArr[29] = new C443120HZe(bool, new AwS563S0100000_19(this, 2998), new AwS563S0100000_19(this, 3008));
        c443120HZeArr[30] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(672), new AwS563S0100000_19(this, 3012));
        c443120HZeArr[31] = new C443120HZe(bool, AFwS199S0000000_12.get$arr$(368), new AwS563S0100000_19(this, 3019));
        c443120HZeArr[32] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(678), new AwS563S0100000_19(this, 3026));
        c443120HZeArr[33] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(680), new AwS563S0100000_19(this, 3034));
        c443120HZeArr[34] = new C443120HZe(bool, new AwS563S0100000_19(this, profileState, 3037), new AwS563S0100000_19(this, 3045));
        c443120HZeArr[35] = new C443120HZe(Boolean.valueOf(myProfileGuideState.getHasSurveyDetermined()), new AwS420S0200000_19(this, myProfileGuideState, profileState, 156), new AwS563S0100000_19(this, 2962));
        c443120HZeArr[36] = new C443120HZe(bool, AFwS187S0000000_2.get$arr$(1013), new AwS563S0100000_19(this, 2967));
        c443120HZeArr[37] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(666), new AwS563S0100000_19(this, 2973));
        c443120HZeArr[38] = new C443120HZe(bool, AFwS187S0000000_2.get$arr$(1014), new AwS563S0100000_19(this, 2981));
        c443120HZeArr[39] = new C443120HZe(bool, AFwS187S0000000_2.get$arr$(1016), new AwS563S0100000_19(this, 2990));
        c443120HZeArr[40] = new C443120HZe(bool, AFwS187S0000000_2.get$arr$(1017), new AwS563S0100000_19(this, 2999));
        c443120HZeArr[41] = new C443120HZe(bool, new AwS563S0100000_19(profileState, 3004), new AwS563S0100000_19(this, 3009));
        c443120HZeArr[42] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(673), new AwS563S0100000_19(this, 3013));
        c443120HZeArr[43] = new C443120HZe(bool, AFwS207S0000000_19.get$arr$(676), new AwS563S0100000_19(this, 3020));
        return c443120HZeArr;
    }

    public final C443120HZe[] LJJIIZ(MyProfileGuideState myProfileGuideState, ProfileState profileState) {
        Boolean bool = Boolean.TRUE;
        return new C443120HZe[]{new C443120HZe(bool, new AwS563S0100000_19(this, 2974), new AwS563S0100000_19(this, 3014)), new C443120HZe(bool, new AwS550S0100000_6(this, 1229), new AwS563S0100000_19(this, 3039)), new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 170), new AwS563S0100000_19(this, 3046)), new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 157), new AwS563S0100000_19(this, 2963)), new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 158), new AwS563S0100000_19(this, 3030)), new C443120HZe(bool, new AwS563S0100000_19(this, profileState, 3035), new AwS563S0100000_19(this, 3038)), new C443120HZe(bool, new AwS563S0100000_19(this, profileState, 3043), new C1246090iX1(this)), new C443120HZe(bool, new AwS563S0100000_19(this, profileState, 2961), new C1246080iX0(this)), new C443120HZe(bool, new AwS550S0100000_6(this, 1228), new AwS563S0100000_19(this, 2968)), new C443120HZe(bool, new AwS563S0100000_19(this, profileState, 2969), new AwS563S0100000_19(this, 2978)), new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 162), new AwS563S0100000_19(this, 2983)), new C443120HZe(bool, AFwS207S0000000_19.get$arr$(667), new AwS563S0100000_19(this, 2991)), new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 164), new AwS563S0100000_19(this, LivePreCreateNextRoomPlayer.ENABLE)), new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 165), new AwS563S0100000_19(this, 3010)), new C443120HZe(bool, new AwS420S0200000_19(this, myProfileGuideState, 167), new AwS563S0100000_19(this, 3017)), new C443120HZe(bool, new AwS420S0200000_19(this, profileState, 163), new AwS563S0100000_19(this, 2988)), new C443120HZe(bool, new AwS563S0100000_19(this, profileState, 3021), new AwS563S0100000_19(this, 3024)), new C443120HZe(bool, new AwS563S0100000_19(this, 3027), new AwS563S0100000_19(this, 3031))};
    }

    public MyProfileGuideWidgetV2(ComponentFragment componentFragment, ViewGroup viewGroup, InterfaceC20660615sy interfaceC20660615sy) {
        super(componentFragment, viewGroup);
        this.LLJL = interfaceC20660615sy;
        this.LLJLILLLLZIIL = ((Boolean) C267420Adw.LIZ.getValue()).booleanValue();
        this.LLJLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(372));
    }
}
