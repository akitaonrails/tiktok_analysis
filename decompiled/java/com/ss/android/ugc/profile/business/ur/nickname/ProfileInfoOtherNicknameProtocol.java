package com.ss.android.ugc.profile.business.ur.nickname;

import X.C01GW;
import X.C09YG;
import X.C0C64;
import X.C0P0T;
import X.C1076010e6h;
import X.C123100dR;
import X.C1243400iSg;
import X.C1243410iSh;
import X.C1247000iYU;
import X.C1248230iaT;
import X.C1248840ibS;
import X.C1248950ibd;
import X.C1249540ica;
import X.C1250210idf;
import X.C1253000iiA;
import X.C1391600mJi;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C19EG;
import X.C259800zU;
import X.C450860Hm8;
import X.C452501pT;
import X.EnumC1235690iGF;
import X.EnumC1248220iaS;
import X.EnumC1251790igD;
import X.InterfaceC665370Q7z;
import Y.AObserverS223S0100000_19;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ur.platform.NickNameData;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS116S0400000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileInfoOtherNicknameProtocol extends ProfilePlatformProtocol<NickNameData> implements IProfileInfoOtherNicknameAbility, GenericLifecycleObserver {
    public String LLJJJIL;
    public NickNameData LLJJJJ;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2391));
    public final EnumC1248220iaS LLJJJJLIIL = EnumC1248220iaS.OTHER;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2392));

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_info_nickname";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJJJJ() {
        return Integer.valueOf(((C1248230iaT) this.LLJJJJJIL.getValue()).LJIJ());
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return !this.LLJI;
    }

    public final TuxTextView LJJLIIIJLJLI() {
        return (TuxTextView) this.LLJJL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        Fragment fragmentLIZLLL;
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            C19EG activity = fragment.getActivity();
            if (activity != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(activity, null);
                IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null) {
                    interfaceC665370Q7zLJI = C1558360qeg.LJFF(fragmentLIZLLL, null);
                }
                C1558520qew.LJII(interfaceC665370Q7zLJI, this, IProfileInfoOtherNicknameAbility.class, null, null);
            }
            C1076010e6h.LIZJ.LIZIZ().LIZ().observe(fragment, new AObserverS223S0100000_19(this, 45));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C19EG activity;
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), IProfileInfoOtherNicknameAbility.class, null);
        }
        Fragment fragment2 = this.LLILZ;
        if (fragment2 != null) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().removeObservers(fragment2);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final View LJIIJJI() {
        return LJJLIIIJLJLI();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJILLIZJL() {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoOtherNicknameProtocol.LJJLIIIJILLIZJL():boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248220iaS LJIIZILJ() {
        return this.LLJJJJLIIL;
    }

    /* JADX WARN: Type inference failed for: r2v35, types: [T, X.0P0T] */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        User user;
        Integer aliasPermission;
        Integer numValueOf;
        User user2;
        boolean z;
        Integer aliasPermission2;
        ProfileComponents profileComponents;
        List<Action> list;
        Action.RouterInfo router;
        String url;
        Fragment fragment;
        C19EG activity;
        ProfileComponents profileComponents2;
        List<EventParams> list2;
        int iIntValue = 0;
        Integer aliasPermission3 = null;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_about_this_account_client", true, false)) {
            C1248950ibd c1248950ibd = this.LLIZ;
            if (c1248950ibd != null && (profileComponents2 = c1248950ibd.LLILLJJLI) != null && (list2 = profileComponents2.eventParams) != null) {
                C1248840ibS.LIZ(C1248840ibS.LIZ, C09YG.TYPE_CLICK.getType(), list2, null, 12);
            }
            C1248950ibd c1248950ibd2 = this.LLIZ;
            if (c1248950ibd2 != null && (profileComponents = c1248950ibd2.LLILLJJLI) != null && (list = profileComponents.actions) != null) {
                for (Action action : list) {
                    if (Intrinsics.LJFF(action.getType(), "router") && (router = action.getRouter()) != null && (url = router.getUrl()) != null && (fragment = this.LLILZ) != null && (activity = fragment.getActivity()) != null) {
                        SmartRouter.buildRoute(activity, url).open();
                        return true;
                    }
                }
            }
        }
        if (C1253000iiA.LIZ()) {
            UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
            if (userProfileAbility != null) {
                user = userProfileAbility.getUser();
            } else {
                user = null;
            }
            NickNameData nickNameData = (NickNameData) this.LLJILJIL;
            if (nickNameData != null) {
                aliasPermission = nickNameData.getAliasPermission();
            } else {
                aliasPermission = null;
            }
            if (user != null) {
                numValueOf = Integer.valueOf(user.getFollowStatus());
            } else {
                numValueOf = null;
            }
            if (C1247000iYU.LIZLLL(aliasPermission, numValueOf)) {
                UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
                if (userProfileAbility2 != null) {
                    user2 = userProfileAbility2.getUser();
                } else {
                    user2 = null;
                }
                Context context = getContext();
                View view2 = this.LLJJI;
                if (user2 != null && context != null && view2 != null && C1253000iiA.LIZ() && user2.getVerificationType() != 2 && user2.getVerificationType() != 3 && !C123100dR.LIZ(user2.getCustomVerify()) && !C123100dR.LIZ(user2.getEnterpriseVerifyReason()) && (user2.getFollowStatus() == 1 || user2.getFollowStatus() == 2 || user2.getFollowStatus() == 4)) {
                    C259800zU c259800zU = new C259800zU();
                    View view3 = this.LLILZLL;
                    if (view3 != null) {
                        C450860Hm8 c450860Hm8 = new C450860Hm8(context);
                        C1391600mJi c1391600mJi = c450860Hm8.LLILLJJLI;
                        c1391600mJi.LIZIZ = view3;
                        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                        c1391600mJi.LJII = -1001L;
                        c450860Hm8.LJIIJ(new AwS116S0400000_19(user2, (User) this, (ProfileInfoOtherNicknameProtocol) c259800zU, (C259800zU<C0P0T>) context, (Context) 5));
                        c259800zU.element = c450860Hm8.LIZIZ();
                    }
                    C1243400iSg c1243400iSg = C1243400iSg.LIZ;
                    int followStatus = user2.getFollowStatus();
                    if (C1247000iYU.LIZIZ(user2) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    NickNameData nickNameData2 = (NickNameData) this.LLJILJIL;
                    if (nickNameData2 != null && (aliasPermission2 = nickNameData2.getAliasPermission()) != null) {
                        iIntValue = aliasPermission2.intValue();
                    }
                    NickNameData nickNameData3 = (NickNameData) this.LLJILJIL;
                    if (nickNameData3 != null) {
                        aliasPermission3 = nickNameData3.getAliasPermission();
                    }
                    C1243410iSh c1243410iSh = new C1243410iSh("others_homepage", "click_nickname_on_top", "show", followStatus, z, iIntValue, C1247000iYU.LIZLLL(aliasPermission3, Integer.valueOf(user2.getFollowStatus())) ? 1 : 0);
                    c1243400iSg.getClass();
                    C1243400iSg.LIZIZ(c1243410iSh);
                    C0P0T c0p0t = (C0P0T) c259800zU.element;
                    if (c0p0t != null) {
                        c0p0t.show();
                    }
                    IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
                    if (iProfilePlatformVM != null) {
                        iProfilePlatformVM.GQ2(new AwS585S0100000_6(c259800zU, (C259800zU<TuxSheet>) 361));
                    }
                }
            }
        }
        return true;
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r3) != false) goto L46;
     */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r7) {
        /*
            r6 = this;
            com.google.gson.n r0 = r7.bizData
            r3 = 0
            if (r0 == 0) goto L9a
            java.lang.String r2 = r0.toString()
        L9:
            java.lang.String r0 = r6.LLJJJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r5 = 0
            if (r0 != 0) goto L8d
            com.google.gson.n r0 = r7.bizData
            if (r0 == 0) goto L8d
            r6.LJJJLZIJ(r0)
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r4 = r6.LLJILJIL
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r4 = (com.ss.android.ugc.profile.business.ur.platform.NickNameData) r4
            java.lang.String r0 = r6.LLJJJIL
            if (r0 == 0) goto L9d
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = r6.LLJJJJ
            if (r0 == 0) goto L98
            java.lang.String r1 = r0.getSubTitle()
        L29:
            java.lang.String r0 = r4.getSubTitle()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9d
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = r6.LLJJJJ
            if (r0 == 0) goto L96
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r0.getDescribe()
            if (r0 == 0) goto L96
            java.lang.String r1 = r0.getText()
        L41:
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r4.getDescribe()
            if (r0 == 0) goto L94
            java.lang.String r0 = r0.getText()
        L4b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9d
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = r6.LLJJJJ
            if (r0 == 0) goto L92
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r0.getVerifyIcon()
            if (r0 == 0) goto L92
            java.lang.String r1 = r0.getLocalIcon()
        L5f:
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r4.getVerifyIcon()
            if (r0 == 0) goto L90
            java.lang.String r0 = r0.getLocalIcon()
        L69:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9d
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = r6.LLJJJJ
            if (r0 == 0) goto L8e
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r0.getVerifyIcon()
            if (r0 == 0) goto L8e
            java.lang.String r1 = r0.getRemoteIcon()
        L7d:
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r4.getVerifyIcon()
            if (r0 == 0) goto L87
            java.lang.String r3 = r0.getRemoteIcon()
        L87:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L9d
        L8d:
            return r5
        L8e:
            r1 = r3
            goto L7d
        L90:
            r0 = r3
            goto L69
        L92:
            r1 = r3
            goto L5f
        L94:
            r0 = r3
            goto L4b
        L96:
            r1 = r3
            goto L41
        L98:
            r1 = r3
            goto L29
        L9a:
            r2 = r3
            goto L9
        L9d:
            r6.LJJLIIIJILLIZJL()
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r6.LLJILJIL
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = (com.ss.android.ugc.profile.business.ur.platform.NickNameData) r0
            r6.LLJJJJ = r0
            r6.LLJJJIL = r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoOtherNicknameProtocol.LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):boolean");
    }

    @Override // com.ss.android.ugc.profile.business.ur.nickname.IProfileInfoOtherNicknameAbility
    public final void CP0(Boolean bool, String str) {
        Describe describe;
        User user;
        List<String> listSingletonList;
        if (C1249540ica.LIZ && bool != null) {
            UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
            if (userProfileAbility != null && (user = userProfileAbility.getUser()) != null) {
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    listSingletonList = Collections.singletonList("alias");
                } else {
                    listSingletonList = Collections.singletonList("nickname");
                }
                user.boldFields = listSingletonList;
            } else {
                user = null;
            }
            UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
            if (userProfileAbility2 != null) {
                userProfileAbility2.sA2(user, EnumC1251790igD.NORMAL);
            }
        }
        T t = this.LLJILJIL;
        if (t != 0 && (describe = t.getDescribe()) != null) {
            describe.setRemoteText(str);
        }
    }
}
