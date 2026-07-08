package com.ss.android.ugc.profile.business.ur;

import X.AbstractC426530Gnz;
import X.C0P0T;
import X.C1243400iSg;
import X.C1243410iSh;
import X.C1247000iYU;
import X.C1248940ibc;
import X.C1250210idf;
import X.C1250250idj;
import X.C1250280idm;
import X.C1253000iiA;
import X.C1391600mJi;
import X.C1558360qeg;
import X.C1558420qem;
import X.C1558520qew;
import X.C19EG;
import X.C2537109wv;
import X.C259800zU;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C430750Gun;
import X.C444920HcY;
import X.C444960Hcc;
import X.C450860Hm8;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1235690iGF;
import X.EnumC1248220iaS;
import X.EnumC1249130ibv;
import X.EnumC1251790igD;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.business.ur.nickname.IProfileInfoOtherNicknameAbility;
import com.ss.android.ugc.profile.business.ur.platform.NickNameData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarOtherNicknameAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS116S0400000_19;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarOtherNicknameProtocol extends NavbarPlatformProtocol<NickNameData> implements INavBarOtherNicknameAbility, GenericLifecycleObserver {
    public final EnumC1248220iaS LLJLL = EnumC1248220iaS.OTHER;
    public C1250250idj LLJLLIL = new C1250250idj();
    public String LLJLLL;
    public NickNameData LLJZ;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJILLIZJL() {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ProfileNavbarOtherNicknameProtocol.LJJLIIIJILLIZJL():boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_center_nickname";
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
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.FQ2(new AwS598S0100000_19(this, 340));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return !this.LLJI;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C19EG activity;
        Fragment fragmentLIZLLL;
        Fragment fragment = this.LLILZ;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(activity, null);
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null) {
            interfaceC665370Q7zLJI = C1558360qeg.LJFF(fragmentLIZLLL, null);
        }
        C1558520qew.LJII(interfaceC665370Q7zLJI, this, INavBarOtherNicknameAbility.class, null, null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C19EG activity;
        Fragment fragmentLIZLLL;
        Fragment fragment = this.LLILZ;
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(activity, null);
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null) {
            interfaceC665370Q7zLJI = C1558360qeg.LJFF(fragmentLIZLLL, null);
        }
        C1558520qew.LJIIJJI(interfaceC665370Q7zLJI, INavBarOtherNicknameAbility.class, null);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, X.0P0T] */
    public final void LJLIIIL() {
        Integer aliasPermission;
        if (C1253000iiA.LIZ()) {
            UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
            User user = userProfileAbility != null ? userProfileAbility.getUser() : null;
            NickNameData nickNameData = (NickNameData) this.LLJILJIL;
            if (C1247000iYU.LIZLLL(nickNameData != null ? nickNameData.getAliasPermission() : null, user != null ? Integer.valueOf(user.getFollowStatus()) : null)) {
                UserProfileAbility userProfileAbility2 = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
                User user2 = userProfileAbility2 != null ? userProfileAbility2.getUser() : null;
                Context context = getContext();
                View view = this.LLJJI;
                if (user2 == null || context == null || view == null) {
                    return;
                }
                C259800zU c259800zU = new C259800zU();
                C450860Hm8 c450860Hm8 = new C450860Hm8(context);
                View viewFindViewById = view.findViewById(R.id.p1k);
                C1391600mJi c1391600mJi = c450860Hm8.LLILLJJLI;
                c1391600mJi.LIZIZ = viewFindViewById;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c1391600mJi.LJII = -1001L;
                c450860Hm8.LJIIJ(new AwS116S0400000_19(user2, (User) this, (ProfileNavbarOtherNicknameProtocol) c259800zU, (C259800zU<C0P0T>) context, (Context) 3));
                c259800zU.element = c450860Hm8.LIZIZ();
                C1243400iSg c1243400iSg = C1243400iSg.LIZ;
                int followStatus = user2.getFollowStatus();
                boolean z = C1247000iYU.LIZIZ(user2) != null;
                NickNameData nickNameData2 = (NickNameData) this.LLJILJIL;
                int iIntValue = (nickNameData2 == null || (aliasPermission = nickNameData2.getAliasPermission()) == null) ? 0 : aliasPermission.intValue();
                NickNameData nickNameData3 = (NickNameData) this.LLJILJIL;
                C1243410iSh c1243410iSh = new C1243410iSh("others_homepage", "click_nickname_on_top", "show", followStatus, z, iIntValue, C1247000iYU.LIZLLL(nickNameData3 != null ? nickNameData3.getAliasPermission() : null, Integer.valueOf(user2.getFollowStatus())) ? 1 : 0);
                c1243400iSg.getClass();
                C1243400iSg.LIZIZ(c1243410iSh);
                ((C0P0T) c259800zU.element).show();
                IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
                if (iProfilePlatformVM != null) {
                    iProfilePlatformVM.GQ2(new AwS585S0100000_6(c259800zU, (C259800zU<TuxSheet>) 325));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248220iaS LJIIZILJ() {
        return this.LLJLL;
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

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r3) != false) goto L44;
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
            if (r0 == 0) goto L96
            java.lang.String r2 = r0.toString()
        L9:
            java.lang.String r0 = r6.LLJLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r5 = 0
            if (r0 != 0) goto L89
            com.google.gson.n r0 = r7.bizData
            if (r0 == 0) goto L89
            r6.LJJJLZIJ(r0)
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r4 = r6.LLJILJIL
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r4 = (com.ss.android.ugc.profile.business.ur.platform.NickNameData) r4
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = r6.LLJZ
            if (r0 == 0) goto L94
            java.lang.String r1 = r0.getSubTitle()
        L25:
            java.lang.String r0 = r4.getSubTitle()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L99
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = r6.LLJZ
            if (r0 == 0) goto L92
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r0.getDescribe()
            if (r0 == 0) goto L92
            java.lang.String r1 = r0.getText()
        L3d:
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r4.getDescribe()
            if (r0 == 0) goto L90
            java.lang.String r0 = r0.getText()
        L47:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L99
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = r6.LLJZ
            if (r0 == 0) goto L8e
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r0.getVerifyIcon()
            if (r0 == 0) goto L8e
            java.lang.String r1 = r0.getLocalIcon()
        L5b:
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r4.getVerifyIcon()
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.getLocalIcon()
        L65:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L99
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = r6.LLJZ
            if (r0 == 0) goto L8a
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r0.getVerifyIcon()
            if (r0 == 0) goto L8a
            java.lang.String r1 = r0.getRemoteIcon()
        L79:
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r4.getVerifyIcon()
            if (r0 == 0) goto L83
            java.lang.String r3 = r0.getRemoteIcon()
        L83:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L99
        L89:
            return r5
        L8a:
            r1 = r3
            goto L79
        L8c:
            r0 = r3
            goto L65
        L8e:
            r1 = r3
            goto L5b
        L90:
            r0 = r3
            goto L47
        L92:
            r1 = r3
            goto L3d
        L94:
            r1 = r3
            goto L25
        L96:
            r2 = r3
            goto L9
        L99:
            r6.LJJLIIIJILLIZJL()
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r6.LLJILJIL
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = (com.ss.android.ugc.profile.business.ur.platform.NickNameData) r0
            r6.LLJZ = r0
            r6.LLJLLL = r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ProfileNavbarOtherNicknameProtocol.LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final boolean LJJLL(C1250280idm c1250280idm) {
        this.LLJLLIL.LIZJ = "";
        return false;
    }

    public final CharSequence LJLI(String str) {
        NickNameData nickNameData;
        if (str == null && ((nickNameData = (NickNameData) this.LLJILJIL) == null || (str = nickNameData.getSubTitle()) == null)) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, false), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarOtherNicknameAbility
    public final void ef1(String str, boolean z) {
        User user;
        IProfileInfoOtherNicknameAbility iProfileInfoOtherNicknameAbility;
        List<String> listSingletonList;
        Describe describe;
        T t = this.LLJILJIL;
        if (t != 0 && (describe = t.getDescribe()) != null) {
            describe.setRemoteText(str);
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
        if (userProfileAbility != null && (user = userProfileAbility.getUser()) != null) {
            if (z) {
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
        if (C2537109wv.LJI() && (iProfileInfoOtherNicknameAbility = (IProfileInfoOtherNicknameAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IProfileInfoOtherNicknameAbility.class, null)) != null) {
            iProfileInfoOtherNicknameAbility.CP0(null, str);
        }
    }

    public final void LJLILLLLZI(int i, String str, String str2) {
        C430750Gun c430750Gun;
        C419890GdH c419890GdHLIZIZ;
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
        AbstractC426530Gnz abstractC426530Gnz = new AbstractC426530Gnz() { // from class: X.0iaA
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                this.LL.LJLIIIL();
            }
        };
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "12");
        if (C444960Hcc.LIZIZ()) {
            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
            C786410Ut5.q2(spannableStringBuilder, c430750Gun, 1, 2, 17);
            C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, 1, 2, 17);
        } else {
            C786410Ut5.q2(spannableStringBuilder, c430750Gun, 0, 1, 17);
            C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, 0, 1, 17);
            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 1, 2, 17);
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = spannableStringBuilder;
        c1250250idj.LIZLLL = LJLI(str2);
        c1250250idj.LJFF = 0;
        c1250250idj.LJI = null;
        c1250250idj.LIZ = null;
        this.LLJLLIL = c1250250idj;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
            value = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
        if (iNavbarBaseAbility != null) {
            iNavbarBaseAbility.f31(this.LLJLLIL);
        }
    }
}
