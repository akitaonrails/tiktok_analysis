package com.ss.android.ugc.profile.business.ur;

import X.AbstractC426530Gnz;
import X.C01GW;
import X.C03H5;
import X.C0HZK;
import X.C0XQ7;
import X.C0ZP4;
import X.C10EU;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1215670hjx;
import X.C1215680hjy;
import X.C1215960hkQ;
import X.C1232140iAW;
import X.C1232410iAx;
import X.C1235040iFC;
import X.C1248090iaF;
import X.C1248940ibc;
import X.C1249980idI;
import X.C1250210idf;
import X.C1250250idj;
import X.C1252550ihR;
import X.C1252570ihT;
import X.C1253010iiB;
import X.C1253930ijf;
import X.C1255380im0;
import X.C1255390im1;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19EG;
import X.C1EDI;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C268330AfP;
import X.C283610B9r;
import X.C291001Au;
import X.C297440BlG;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C428150Gqb;
import X.C430750Gun;
import X.C444920HcY;
import X.C444960Hcc;
import X.C452501pT;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1216800hlm;
import X.EnumC1248220iaS;
import X.EnumC1248370iah;
import X.EnumC1249130ibv;
import X.EnumC1254850il9;
import X.EnumC1584360rKc;
import X.EnumC428940Grs;
import X.InterfaceC0148002o;
import X.InterfaceC1215650hjv;
import X.InterfaceC1232420iAy;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC586170Myt;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.business.ur.ProfileNavbarNickNameProtocol;
import com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService;
import com.ss.android.ugc.profile.business.ur.platform.NickNameData;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS633S0100000_19;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarNickNameProtocol extends NavbarPlatformProtocol<NickNameData> implements INavbarCenterAbility, InterfaceC1232420iAy, InterfaceC724530SbT, GenericLifecycleObserver {
    public static final /* synthetic */ int LLLILZLLLI = 0;
    public C0HZK LLJLLL;
    public SpannableStringBuilder LLJZ;
    public String LLLF;
    public NickNameData LLLFF;
    public long LLLFFI;
    public C1215680hjy LLLII;
    public C1232410iAx LLLIIII;
    public boolean LLLIIL;
    public final EnumC1248220iaS LLJLL = EnumC1248220iaS.SELF;
    public final C1235040iFC LLJLLIL = new C1235040iFC();
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(394));
    public final C1250250idj LLL = new C1250250idj();
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(393));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2140));
    public final List<C1215670hjx> LLLIIIIL = new ArrayList();
    public final C01GW LLLIIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(395));
    public int LLLIILIL = 1;
    public final C01GW LLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(392));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2139));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(396));

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
    }

    @Override // X.InterfaceC1232420iAy
    public final void aL0(String str, boolean z) {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_center_nickname";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJILLIZJL() {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ProfileNavbarNickNameProtocol.LJJLIIIJILLIZJL():boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility
    public final int SH() {
        int i = this.LLLIILIL;
        return (i == 3 || i == 4) ? 1 : 0;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C19EG activity;
        C1249980idI.LJ++;
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, INavbarCenterAbility.class, null, null);
        }
        C1232410iAx c1232410iAx = new C1232410iAx(EnumC1254850il9.PROFILE.getValue());
        c1232410iAx.LLJ = this;
        this.LLLIIII = c1232410iAx;
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL((InterfaceC586170Myt) this.LLLIL.getValue());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C19EG activity;
        Intent intent;
        Fragment fragment = this.LLILZ;
        if (fragment == null || (activity = fragment.getActivity()) == null || (intent = activity.getIntent()) == null) {
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("switch_account_sec_uid");
            if (stringExtra == null || stringExtra.length() <= 0) {
                return;
            }
            LJLILLLLZI(stringExtra);
            intent.removeExtra("switch_account_sec_uid");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM;
        if (C10EU.LIZ() != null) {
            LJLJJI();
        }
        if (C297440BlG.LIZ() || (iProfilePlatformVM = this.LLIZLLLIL) == null) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, iProfilePlatformVM, new C2217381BqS() { // from class: X.0ia7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLIZ;
            }
        }, null, new AwS633S0100000_19(this, 125), 6);
    }

    public final void LJLJJI() {
        String value;
        EnumC1249130ibv enumC1249130ibv;
        if (C0XQ7.LIZJ().isEnableMultiAccountLogin()) {
            LJJLIIIJILLIZJL();
            C0HZK c0hzk = this.LLJLLL;
            if (c0hzk != null) {
                c0hzk.LJ();
                return;
            }
            return;
        }
        LJJLIIIJILLIZJL();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
            value = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
        if (iNavbarBaseAbility != null) {
            iNavbarBaseAbility.S21(0, false);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final void cO1() {
        String value;
        TuxNavBar tuxNavBarBp0;
        TuxTextView tuxTextView;
        EnumC1249130ibv enumC1249130ibv;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
            value = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
        if (iNavbarBaseAbility == null || (tuxNavBarBp0 = iNavbarBaseAbility.Bp0()) == null || (tuxTextView = (TuxTextView) tuxNavBarBp0.findViewById(R.id.p1i)) == null) {
            return;
        }
        TuxTextView.LJJJJ(tuxTextView, 17.0f, 22, (Typeface) this.LLLILZJ.getValue(), 0.02f);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C19EG activity;
        C0XQ7.LJ();
        C0XQ7.LIZ.LJI((InterfaceC586170Myt) this.LLLIL.getValue());
        C0HZK c0hzk = this.LLJLLL;
        if (c0hzk != null) {
            EventBus.LIZLLL().LJJI(c0hzk);
            c0hzk.LJ = 0;
            C0HZK.LJII = false;
        }
        this.LLJLLL = null;
        int i = C1249980idI.LJ - 1;
        C1249980idI.LJ = i;
        if (i <= 0) {
            C1249980idI.LIZJ = false;
            C1249980idI.LIZLLL = 0;
            C1249980idI.LJ = 0;
        }
        Fragment fragment = this.LLILZ;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), INavbarCenterAbility.class, null);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248220iaS LJIIZILJ() {
        return this.LLJLL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        NickNameData nickNameData;
        try {
            nickNameData = (NickNameData) C1250210idf.LIZ(nVar.toString(), NickNameData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            nickNameData = null;
        }
        this.LLJILJIL = nickNameData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r3) != false) goto L65;
     */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r7) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ProfileNavbarNickNameProtocol.LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):boolean");
    }

    public final CharSequence LJLI(String str) {
        if (str == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, false), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void LJLIIIL(final User user) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLLFFI < 500) {
            return;
        }
        this.LLLFFI = jCurrentTimeMillis;
        C1252570ihT c1252570ihT = C1252570ihT.LIZ;
        C1252550ihR.LIZ.getClass();
        boolean z = !C1252550ihR.LJIIJJI(user, "nickname");
        c1252570ihT.getClass();
        C1252570ihT.LIZLLL("name", z);
        Bundle bundleLJI = C1252550ihR.LJI(user, "click_card", "nickname");
        if (C1EDI.LIZLLL()) {
            bundleLJI.putBoolean("is_from_profile_nickname_empty", true);
        }
        if (C1EDI.LJFF()) {
            C786410Ut5.LJJJI("enter_from", "add_name", bundleLJI);
        }
        ProfileEditNicknameFragment profileEditNicknameFragmentLIZ = C1215960hkQ.LIZ(bundleLJI, "");
        profileEditNicknameFragmentLIZ.setUserVisibleHint(true);
        profileEditNicknameFragmentLIZ.LLJJIII = new InterfaceC1215650hjv() { // from class: X.0iZz
            @Override // X.InterfaceC1215650hjv
            public final void LIZ(String str, C1215680hjy c1215680hjy) {
                UserProfileInfo userProfileInfo;
                Describe describe;
                user.setNickname(str);
                ProfileNavbarNickNameProtocol profileNavbarNickNameProtocol = this;
                ProfileCommonInfo profileCommonInfoLJIILIIL = profileNavbarNickNameProtocol.LJIILIIL();
                if (profileCommonInfoLJIILIIL == null) {
                    profileCommonInfoLJIILIIL = new ProfileCommonInfo();
                }
                ProfileCommonInfo profileCommonInfoLJIILIIL2 = profileNavbarNickNameProtocol.LJIILIIL();
                if (profileCommonInfoLJIILIIL2 == null || (userProfileInfo = profileCommonInfoLJIILIIL2.getUserProfileInfo()) == null) {
                    userProfileInfo = new UserProfileInfo();
                }
                userProfileInfo.setNickname(str);
                profileCommonInfoLJIILIIL.setUserProfileInfo(userProfileInfo);
                IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(profileNavbarNickNameProtocol), IProfileBaseAbility.class, null);
                if (iProfileBaseAbility != null) {
                    iProfileBaseAbility.OJ1(profileCommonInfoLJIILIIL);
                }
                T t = this.LLJILJIL;
                if (t != 0 && (describe = t.getDescribe()) != null) {
                    describe.setRemoteText(str);
                }
                ProfileNavbarNickNameProtocol profileNavbarNickNameProtocol2 = this;
                profileNavbarNickNameProtocol2.LLLII = c1215680hjy;
                profileNavbarNickNameProtocol2.LJJLIIIJILLIZJL();
                ProfileNavbarNickNameProtocol profileNavbarNickNameProtocol3 = this;
                C1215680hjy c1215680hjy2 = profileNavbarNickNameProtocol3.LLLII;
                if (c1215680hjy2 != null) {
                    ((ArrayList) profileNavbarNickNameProtocol3.LLLIIIIL).add(new C1215670hjx(EnumC1216800hlm.NICKNAME));
                    if (c1215680hjy2.LIZ) {
                        String str2 = c1215680hjy2.LIZJ;
                        C1215770hk7.LIZ.getClass();
                        if (C1215770hk7.LIZIZ(str2) && C1215760hk6.LIZ(str2, profileNavbarNickNameProtocol3.getContext())) {
                            profileNavbarNickNameProtocol3.LLLII = c1215680hjy2;
                            C1232410iAx c1232410iAx = profileNavbarNickNameProtocol3.LLLIIII;
                            if (c1232410iAx != null) {
                                c1232410iAx.LIZJ(str2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1232140iAW.LIZ.getClass();
                C1232140iAW.LJIIJJI(null, "edit_nickname_page", 1, false);
            }
        };
        FragmentManager fragmentManager = (FragmentManager) this.LLLILZ.getValue();
        if (fragmentManager != null) {
            profileEditNicknameFragmentLIZ.show(fragmentManager, "EditWebsiteDialog");
        }
    }

    public final void LJLILLLLZI(final String str) {
        Bundle bundle;
        if (!C0XQ7.LIZJ().isEnableMultiAccountLogin()) {
            return;
        }
        C1249980idI.LIZIZ();
        synchronized (this) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("profile_choose_account_dialog ");
            sbLIZ.append(((C1255390im1) this.LLJZIJLIL.getValue()).LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            FragmentManager fragmentManager = (FragmentManager) this.LLLILZ.getValue();
            if (fragmentManager != null) {
                Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(strLIZIZ);
                if (fragmentLJJJJZI == null || !fragmentLJJJJZI.isAdded()) {
                    if (str == null) {
                        bundle = null;
                    }
                    C1255380im0.LIZ(fragmentManager, (C1255390im1) this.LLJZIJLIL.getValue(), strLIZIZ, bundle, null, new DialogInterface.OnCancelListener() { // from class: X.0im8
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C19EG activity;
                            if (TextUtils.isEmpty(str)) {
                                return;
                            }
                            InterfaceC1255480imA interfaceC1255480imALJJIIZ = C19212010Ec.LIZJ.LJJIIZ();
                            Fragment fragment = this.LLILZ;
                            if (fragment != null && (activity = fragment.getActivity()) != null) {
                                EnumC1905360zgM enumC1905360zgM = EnumC1905360zgM.ONE;
                                if (interfaceC1255480imALJJIIZ.LIZIZ(enumC1905360zgM)) {
                                    interfaceC1255480imALJJIIZ.LIZ(activity, enumC1905360zgM);
                                }
                            }
                        }
                    });
                } else if (str == null) {
                }
                ((C1255390im1) this.LLJZIJLIL.getValue()).LIZIZ = "push_landing";
                bundle = new Bundle();
                C786410Ut5.LJJJI("switch_account_sec_uid", str, bundle);
                C1255380im0.LIZ(fragmentManager, (C1255390im1) this.LLJZIJLIL.getValue(), strLIZIZ, bundle, null, new DialogInterface.OnCancelListener() { // from class: X.0im8
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        C19EG activity;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        InterfaceC1255480imA interfaceC1255480imALJJIIZ = C19212010Ec.LIZJ.LJJIIZ();
                        Fragment fragment = this.LLILZ;
                        if (fragment != null && (activity = fragment.getActivity()) != null) {
                            EnumC1905360zgM enumC1905360zgM = EnumC1905360zgM.ONE;
                            if (interfaceC1255480imALJJIIZ.LIZIZ(enumC1905360zgM)) {
                                interfaceC1255480imALJJIIZ.LIZ(activity, enumC1905360zgM);
                            }
                        }
                    }
                });
            }
        }
        LJLJI("switch_account");
    }

    public final void LJLJI(String str) {
        String str2;
        String uid;
        Aweme aweme;
        String aid;
        UserProfileInfo userProfileInfo;
        if (Om()) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        String str3 = "";
        if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
            uid = "";
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null && (aweme = iProfilePlatformVM.getAweme()) != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        C1253930ijf.LJJIII(C1253930ijf.LIZ, str2, uid, str3, str, EnumC1248370iah.NAV, null, null, 96);
    }

    public final void LJLL(boolean z) {
        String value;
        View viewYp1;
        EnumC1249130ibv enumC1249130ibv;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
            value = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
        if (iNavbarBaseAbility != null && (viewYp1 = iNavbarBaseAbility.Yp1("nav_bar_center_nickname")) != null) {
            if (z) {
                if (C1EDI.LIZIZ()) {
                    C428150Gqb.LIZ(viewYp1, EnumC428940Grs.LIGHT_MASK, C418440Gaw.LIZIZ(200));
                    return;
                } else {
                    C428150Gqb.LIZ(viewYp1, EnumC428940Grs.ALPHA, 0.0f);
                    return;
                }
            }
            viewYp1.setOnTouchListener(null);
            if (!C1EDI.LIZIZ()) {
                return;
            }
            viewYp1.setForeground(null);
        }
    }

    public final void LJLLL(boolean z) {
        TuxTextView tuxTextView;
        String value;
        View viewYp1;
        EnumC1249130ibv enumC1249130ibv;
        C0HZK c0hzk = this.LLJLLL;
        if (c0hzk == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            C1248940ibc c1248940ibc = this.LLJJJJ;
            if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                viewYp1 = iNavbarBaseAbility.Yp1("nav_bar_center_nickname");
            } else {
                viewYp1 = null;
            }
            if (viewYp1 instanceof TuxTextView) {
                this.LLJLLL = new C0HZK(getContext(), (TuxTextView) viewYp1, this.LLJZ, this.LLLIILIL);
            }
        } else if (C0HZK.LJII || z) {
            c0hzk.LJII();
        }
        C0HZK c0hzk2 = this.LLJLLL;
        if (c0hzk2 != null && (tuxTextView = c0hzk2.LIZIZ) != null) {
            tuxTextView.setMinTextSize(-1.0f);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility
    public final AnimatorSet RF2(AwS585S0100000_6 awS585S0100000_6) {
        String value;
        TuxNavBar tuxNavBarBp0;
        View viewFindViewById;
        EnumC1249130ibv enumC1249130ibv;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
            value = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
        if (iNavbarBaseAbility == null || (tuxNavBarBp0 = iNavbarBaseAbility.Bp0()) == null || (viewFindViewById = tuxNavBarBp0.findViewById(R.id.p1k)) == null) {
            return null;
        }
        return (AnimatorSet) awS585S0100000_6.invoke(viewFindViewById);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility
    public final void ih2(boolean z) {
        EnumC1584360rKc enumC1584360rKc = C1249980idI.LIZ;
        if (C283610B9r.LIZ() && z && C1249980idI.LIZLLL > 0 && !C1249980idI.LIZJ) {
            C1249980idI.LIZLLL();
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        IProfilePlatformVM iProfilePlatformVM;
        if (i == 116 && (iProfilePlatformVM = this.LLIZLLLIL) != null) {
            iProfilePlatformVM.zQ2(new C291001Au<>(new Pair(exc, Integer.valueOf(i))));
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        if (i == 116 && this.LLLII != null) {
            C1232140iAW.LIZ.getClass();
            C1232140iAW.LJIILIIL(1, "edit_nickname_page", null, true);
            ((ArrayList) this.LLLIIIIL).add(new C1215670hjx(EnumC1216800hlm.USERNAME));
            Fragment fragment = this.LLILZ;
            if (fragment != null) {
                ((ProfileNameSyncService) this.LLLIIIL.getValue()).LJFF(fragment, this.LLLIIIIL, new AwS563S0100000_19(this, 3079));
            }
            ((ArrayList) this.LLLIIIIL).clear();
            Fragment fragment2 = this.LLILZ;
            if ((fragment2 instanceof I18nMyProfileFragment) && fragment2 != null) {
                fragment2.onResume();
            }
        }
    }

    public final void LJLJJLL(int i, String str, String str2) {
        C1248090iaF c1248090iaF;
        C419890GdH c419890GdHLIZIZ;
        String value;
        EnumC1249130ibv enumC1249130ibv;
        View viewD00;
        Context context;
        int i2;
        int i3;
        boolean zIsEnableMultiAccountLogin = C0XQ7.LIZJ().isEnableMultiAccountLogin();
        Context context2 = getContext();
        if (context2 != null) {
            c1248090iaF = new C1248090iaF(context2);
            c1248090iaF.LIZIZ(3);
            c1248090iaF.LIZJ(str);
            c1248090iaF.LIZLLL(C960203pA.LIZ(R.attr.a1j, context2));
            c1248090iaF.LIZ(C960203pA.LIZ(R.attr.bs, context2));
        } else {
            c1248090iaF = null;
        }
        AbstractC426530Gnz abstractC426530Gnz = new AbstractC426530Gnz() { // from class: X.0iZy
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                String secUid;
                UserProfileInfo userProfileInfo;
                final ProfileNavbarNickNameProtocol profileNavbarNickNameProtocol = this.LL;
                profileNavbarNickNameProtocol.getClass();
                final User curUser = C0XQ7.LJFF().getCurUser();
                ProfileCommonInfo profileCommonInfoLJIILIIL = profileNavbarNickNameProtocol.LJIILIIL();
                if (profileCommonInfoLJIILIIL != null && (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) != null) {
                    secUid = userProfileInfo.getSecUid();
                } else {
                    secUid = null;
                }
                curUser.setSecUid(secUid);
                profileNavbarNickNameProtocol.LLJLLIL.LIZIZ(curUser, new C1235030iFB() { // from class: X.0hjs
                    @Override // X.C1235030iFB
                    public final void LIZIZ() {
                    }

                    @Override // X.C1235030iFB
                    public final void LIZJ(VerificationResponse verificationResponse) throws Throwable {
                        C19EG activity;
                        Resources resources;
                        Fragment fragment;
                        C19EG activity2;
                        Resources resources2;
                        String string;
                        String string2;
                        C19EG activity3;
                        Resources resources3;
                        C19EG activity4;
                        Resources resources4;
                        Resources resources5;
                        if (verificationResponse.isEmpty()) {
                            profileNavbarNickNameProtocol.LJLIIIL(curUser);
                            return;
                        }
                        String string3 = null;
                        if (!verificationResponse.isCerting() && !verificationResponse.isCertedAgain()) {
                            if (verificationResponse.isCerted()) {
                                if (C1215600hjq.LIZ()) {
                                    Context context3 = profileNavbarNickNameProtocol.getContext();
                                    if (context3 != null && (resources5 = context3.getResources()) != null) {
                                        string = resources5.getString(2131846434);
                                    } else {
                                        string = null;
                                    }
                                    Context context4 = profileNavbarNickNameProtocol.getContext();
                                    if (context4 != null && (resources4 = context4.getResources()) != null) {
                                        string2 = resources4.getString(2131846433);
                                    } else {
                                        string2 = null;
                                    }
                                    if (string != null && string2 != null) {
                                        Fragment fragment2 = profileNavbarNickNameProtocol.LLILZ;
                                        if (fragment2 != null && fragment2.getActivity() != null) {
                                            Fragment fragment3 = profileNavbarNickNameProtocol.LLILZ;
                                            if (fragment3 == null || (activity4 = fragment3.getActivity()) == null) {
                                                return;
                                            }
                                            C21566919al c21566919al = new C21566919al(activity4);
                                            ProfileNavbarNickNameProtocol profileNavbarNickNameProtocol2 = profileNavbarNickNameProtocol;
                                            User user = curUser;
                                            c21566919al.LIZJ = string2;
                                            c21566919al.LIZIZ = string;
                                            c21566919al.LJIIJ(2131846435, new DialogInterfaceOnClickListenerC1265860j2u(user, profileNavbarNickNameProtocol2, 4), false);
                                            c21566919al.LJII(R.string.f1_, null, false);
                                            new C21566519ah(c21566919al).LIZLLL();
                                            return;
                                        }
                                        Fragment fragment4 = profileNavbarNickNameProtocol.LLILZ;
                                        if (fragment4 != null && (activity3 = fragment4.getActivity()) != null) {
                                            ProfileNavbarNickNameProtocol profileNavbarNickNameProtocol3 = profileNavbarNickNameProtocol;
                                            C1389890mGx c1389890mGx = new C1389890mGx(activity3);
                                            Context context5 = profileNavbarNickNameProtocol3.getContext();
                                            if (context5 != null && (resources3 = context5.getResources()) != null) {
                                                string3 = resources3.getString(2131846436);
                                            }
                                            c1389890mGx.LJIIJ(string3);
                                            c1389890mGx.LJIIJJI();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                profileNavbarNickNameProtocol.LJLIIIL(curUser);
                                return;
                            }
                            if (!verificationResponse.isUpdating() || (fragment = profileNavbarNickNameProtocol.LLILZ) == null || (activity2 = fragment.getActivity()) == null) {
                                return;
                            }
                            ProfileNavbarNickNameProtocol profileNavbarNickNameProtocol4 = profileNavbarNickNameProtocol;
                            C1389890mGx c1389890mGx2 = new C1389890mGx(activity2);
                            Context context6 = profileNavbarNickNameProtocol4.getContext();
                            if (context6 != null && (resources2 = context6.getResources()) != null) {
                                string3 = resources2.getString(2131846437);
                            }
                            c1389890mGx2.LJIIJ(string3);
                            c1389890mGx2.LJIIJJI();
                            return;
                        }
                        Fragment fragment5 = profileNavbarNickNameProtocol.LLILZ;
                        if (fragment5 == null || (activity = fragment5.getActivity()) == null) {
                            return;
                        }
                        ProfileNavbarNickNameProtocol profileNavbarNickNameProtocol5 = profileNavbarNickNameProtocol;
                        C1389890mGx c1389890mGx3 = new C1389890mGx(activity);
                        Context context7 = profileNavbarNickNameProtocol5.getContext();
                        if (context7 != null && (resources = context7.getResources()) != null) {
                            string3 = resources.getString(2131846436);
                        }
                        c1389890mGx3.LJIIJ(string3);
                        c1389890mGx3.LJIIJJI();
                    }
                });
                profileNavbarNickNameProtocol.LJLJI("add_name");
            }
        };
        if (zIsEnableMultiAccountLogin && (context = getContext()) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            if (C1EDI.LIZIZ()) {
                i2 = 10;
            } else {
                i2 = 14;
            }
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
            if (C1EDI.LIZIZ()) {
                i3 = 10;
            } else {
                i3 = 14;
            }
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        } else {
            c419890GdHLIZIZ = null;
        }
        if (c419890GdHLIZIZ != null) {
            c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C444960Hcc.LIZIZ());
        }
        AbstractC426530Gnz abstractC426530Gnz2 = new AbstractC426530Gnz() { // from class: X.0ia8
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                this.LL.LJLILLLLZI(null);
            }
        };
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str3 = "12";
        if (C1EDI.LIZIZ()) {
            if (zIsEnableMultiAccountLogin) {
                str3 = "1234";
            }
            spannableStringBuilder.append((CharSequence) str3);
        } else {
            if (!zIsEnableMultiAccountLogin) {
                str3 = "1";
            }
            spannableStringBuilder.append((CharSequence) str3);
        }
        if (C1EDI.LIZIZ()) {
            Context context3 = getContext();
            if (context3 == null) {
                return;
            }
            C1248090iaF c1248090iaF2 = new C1248090iaF(context3);
            c1248090iaF2.LIZIZ(2);
            c1248090iaF2.LIZJ(str);
            c1248090iaF2.LIZLLL(C960203pA.LIZ(R.attr.a1h, context3));
            c1248090iaF2.LIZ(0);
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_plus_fill;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
            C786410Ut5.q2(spannableStringBuilder, c419910GdJ2.LIZIZ(2, context3), 0, 1, 17);
            C786410Ut5.q2(spannableStringBuilder, c1248090iaF2, 1, 2, 17);
            C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, 1, 2, 17);
            if (zIsEnableMultiAccountLogin) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = R.raw.icon_vertical_line;
                c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ3.LJ = Integer.valueOf(R.attr.a02);
                C419890GdH c419890GdHLIZIZ2 = c419910GdJ3.LIZIZ(2, context3);
                c419890GdHLIZIZ2.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C444960Hcc.LIZIZ());
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ2, 2, 3, 17);
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 3, 4, 17);
                C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz2, 3, 4, 17);
            }
            INavBarActionAbility iNavBarActionAbility = (INavBarActionAbility) this.LLLI.getValue();
            if (iNavBarActionAbility != null) {
                viewD00 = iNavBarActionAbility.d00(EnumC1249130ibv.CENTER_AREA);
            } else {
                viewD00 = null;
            }
            if ((viewD00 instanceof ViewGroup) && viewD00 != null) {
                View viewFindViewById = viewD00.findViewById(R.id.p1i);
                C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                viewFindViewById.setBackground(c384050F3z.LIZ(context3));
            } else {
                return;
            }
        } else {
            C786410Ut5.q2(spannableStringBuilder, c1248090iaF, 0, 1, 17);
            C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, 0, 1, 17);
            if (zIsEnableMultiAccountLogin) {
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 1, 2, 17);
                C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz2, 1, 2, 17);
            }
        }
        this.LLLIILIL = 3;
        C0HZK c0hzk = this.LLJLLL;
        if (c0hzk != null) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c0hzk.LIZJ = spannableStringBuilder;
            c0hzk.LJFF = iLIZIZ;
            c0hzk.LJI = iLIZIZ2;
            c0hzk.LIZLLL = 3;
            c0hzk.LIZIZ.setText(spannableStringBuilder);
            C0HZK.LJII = false;
        }
        this.LLJZ = spannableStringBuilder;
        if (!((Boolean) this.LLLFZ.getValue()).booleanValue() && !C268330AfP.LJIIIZ()) {
            C1250250idj c1250250idj = this.LLL;
            c1250250idj.LIZJ = spannableStringBuilder;
            c1250250idj.LIZLLL = LJLI(str2);
            c1250250idj.LJFF = 0;
            c1250250idj.LJI = null;
            c1250250idj.LIZ = null;
        } else {
            C1250250idj c1250250idj2 = this.LLL;
            c1250250idj2.LIZJ = spannableStringBuilder;
            c1250250idj2.LJFF = 0;
            c1250250idj2.LJI = null;
            c1250250idj2.LIZ = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
            value = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
        if (iNavbarBaseAbility != null) {
            iNavbarBaseAbility.f31(this.LLL);
        }
    }

    public final void LJLJLLL(int i, int i2, String str, String str2) {
        C430750Gun c430750Gun;
        C419890GdH c419890GdHLIZIZ;
        C419890GdH c419890GdHLIZIZ2;
        String value;
        EnumC1249130ibv enumC1249130ibv;
        Context context = getContext();
        if (context != null) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, context));
            tuxTextView.setTuxFont(33);
            tuxTextView.setText(str);
            c430750Gun = new C430750Gun(tuxTextView);
        } else {
            c430750Gun = null;
        }
        Context context2 = getContext();
        if (context2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context2);
            if (c419890GdHLIZIZ != null) {
                c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C444960Hcc.LIZIZ());
            }
        } else {
            c419890GdHLIZIZ = null;
        }
        Context context3 = getContext();
        if (context3 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = i2;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
            c419890GdHLIZIZ2 = c419910GdJ2.LIZIZ(2, context3);
        } else {
            c419890GdHLIZIZ2 = null;
        }
        AbstractC426530Gnz abstractC426530Gnz = new AbstractC426530Gnz() { // from class: X.0ia9
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                this.LL.LJLILLLLZI(null);
            }
        };
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (C1253010iiB.LIZJ.LJFF()) {
            spannableStringBuilder.append((CharSequence) "123");
            if (C444960Hcc.LIZIZ()) {
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ2, 0, 1, 17);
                C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, 0, 3, 17);
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 1, 2, 17);
                C786410Ut5.q2(spannableStringBuilder, c430750Gun, 2, 3, 17);
            } else {
                C786410Ut5.q2(spannableStringBuilder, c430750Gun, 0, 1, 17);
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 1, 2, 17);
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ2, 2, 3, 17);
                C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, 0, 3, 17);
            }
        } else {
            spannableStringBuilder.append((CharSequence) "12");
            if (C444960Hcc.LIZIZ()) {
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
                C786410Ut5.q2(spannableStringBuilder, c430750Gun, 1, 2, 17);
            } else {
                C786410Ut5.q2(spannableStringBuilder, c430750Gun, 0, 1, 17);
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 1, 2, 17);
            }
        }
        this.LLLIILIL = 2;
        boolean z = C0HZK.LJII;
        C0HZK c0hzk = this.LLJLLL;
        if (c0hzk != null) {
            C0HZK.LIZ(c0hzk, spannableStringBuilder, 2);
        }
        this.LLJZ = spannableStringBuilder;
        LJLLL(z);
        if (!((Boolean) this.LLLFZ.getValue()).booleanValue() && !C268330AfP.LJIIIZ()) {
            C1250250idj c1250250idj = this.LLL;
            c1250250idj.LIZJ = spannableStringBuilder;
            c1250250idj.LIZLLL = LJLI(str2);
            c1250250idj.LJFF = 0;
            c1250250idj.LJI = null;
            c1250250idj.LIZ = null;
        } else {
            C1250250idj c1250250idj2 = this.LLL;
            c1250250idj2.LIZJ = spannableStringBuilder;
            c1250250idj2.LJFF = 0;
            c1250250idj2.LJI = null;
            c1250250idj2.LIZ = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
            value = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
        if (iNavbarBaseAbility != null) {
            iNavbarBaseAbility.f31(this.LLL);
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
