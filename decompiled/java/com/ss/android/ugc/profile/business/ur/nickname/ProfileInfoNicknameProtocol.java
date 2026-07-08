package com.ss.android.ugc.profile.business.ur.nickname;

import X.AbstractC426530Gnz;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C0HZL;
import X.C0XQ7;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1215670hjx;
import X.C1215680hjy;
import X.C1215960hkQ;
import X.C1232140iAW;
import X.C1232410iAx;
import X.C1235030iFB;
import X.C1235040iFC;
import X.C1245340iVo;
import X.C1247810iZn;
import X.C1247950ia1;
import X.C1247980ia4;
import X.C1248090iaF;
import X.C1248100iaG;
import X.C1248210iaR;
import X.C1248230iaT;
import X.C1249980idI;
import X.C1250210idf;
import X.C1250680ieQ;
import X.C1252550ihR;
import X.C1252570ihT;
import X.C1253010iiB;
import X.C1253930ijf;
import X.C1255380im0;
import X.C1255390im1;
import X.C1257290ip5;
import X.C1308910kAL;
import X.C1369630lkH;
import X.C1391600mJi;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19EG;
import X.C1EDI;
import X.C20684815ws;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C268330AfP;
import X.C291001Au;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C428770Grb;
import X.C430750Gun;
import X.C444960Hcc;
import X.C450720Hlu;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1216800hlm;
import X.EnumC1235690iGF;
import X.EnumC1248220iaS;
import X.EnumC1248370iah;
import X.EnumC1254850il9;
import X.InterfaceC0148002o;
import X.InterfaceC1215650hjv;
import X.InterfaceC1232420iAy;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC586170Myt;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewTreeObserverOnGlobalLayoutListenerC1265990j37;
import Y.ARunnableS101S0100000_1;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService;
import com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol;
import com.ss.android.ugc.profile.business.ur.platform.NickNameData;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserInfoManageBaseComponent;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileInfoNicknameProtocol extends ProfilePlatformProtocol<NickNameData> implements InterfaceC1232420iAy, InterfaceC724530SbT, IProfileInfoNicknameAbility, GenericLifecycleObserver {
    public String LLJJJJJIL;
    public NickNameData LLJJJJLIIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1265990j37 LLJJL;
    public C1215680hjy LLJJLIIIJLLLLLLLZ;
    public C1232410iAx LLJL;
    public View LLLII;
    public final C1235040iFC LLJJJIL = new C1235040iFC();
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(454));
    public final List<C1215670hjx> LLJLIL = new ArrayList();
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(455));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2389));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2387));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2386));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2388));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(453));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 885));
    public int LLLF = 1;
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 888));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2390));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 886));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 887));
    public final C1247980ia4 LLLIIII = new C1247980ia4(this);
    public final EnumC1248220iaS LLLIIIIL = EnumC1248220iaS.SELF;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        ViewTreeObserver viewTreeObserver;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            C736680Sv4.LJIIIIZZ(this, iProfilePlatformVM, new C2217381BqS() { // from class: X.0ia5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLIZ;
                }
            }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 94), 4);
        }
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (C1EDI.LIZIZ()) {
            this.LLJJL = new ViewTreeObserverOnGlobalLayoutListenerC1265990j37(this, 5);
            TuxTextView tuxTextViewLJLI = LJLI();
            if (tuxTextViewLJLI == null || (viewTreeObserver = tuxTextViewLJLI.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37 = this.LLJJL;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1265990j37);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1265990j37, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJI() {
        C0HZL.LJI = false;
    }

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
        return "user_info_nickname";
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

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final View LJIIJJI() {
        return (View) this.LLLFF.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJJJJ() {
        return Integer.valueOf(((C1248230iaT) this.LLJLLIL.getValue()).LJIJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x02fc  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJILLIZJL() {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol.LJJLIIIJILLIZJL():boolean");
    }

    public final C0HZL LJJLL() {
        return (C0HZL) this.LLL.getValue();
    }

    public final ProfileCommonInfo LJJZZI() {
        return (ProfileCommonInfo) this.LLJLLL.getValue();
    }

    public final TuxTextView LJLI() {
        return (TuxTextView) this.LLLFZ.getValue();
    }

    public final C428770Grb LJLIIIL() {
        return (C428770Grb) this.LLLI.getValue();
    }

    public final TuxTextView LJLILLLLZI() {
        return (TuxTextView) this.LLLFFI.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.ur.nickname.IProfileInfoNicknameAbility
    public final void Ow() {
        TuxTextView tuxTextViewLJLI;
        if (Intrinsics.LJFF(this.LLLII, LJLILLLLZI())) {
            TuxTextView tuxTextViewLJLILLLLZI = LJLILLLLZI();
            if (tuxTextViewLJLILLLLZI != null) {
                tuxTextViewLJLILLLLZI.performClick();
                return;
            }
            return;
        }
        if (((Boolean) C1EDI.LJIIJJI.getValue()).booleanValue() || (tuxTextViewLJLI = LJLI()) == null) {
            return;
        }
        this.LLLIIII.onClick(tuxTextViewLJLI);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C19EG activity;
        C1249980idI.LJ++;
        C1232410iAx c1232410iAx = new C1232410iAx(EnumC1254850il9.PROFILE.getValue());
        c1232410iAx.LLJ = this;
        this.LLJL = c1232410iAx;
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, IProfileInfoNicknameAbility.class, null, null);
        }
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL((InterfaceC586170Myt) this.LLJZIJLIL.getValue());
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
            LJZI(stringExtra);
            intent.removeExtra("switch_account_sec_uid");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJLJLI() {
        UserProfileInfo userProfileInfo;
        TuxTextView tuxTextViewLJLILLLLZI = LJLILLLLZI();
        if (tuxTextViewLJLILLLLZI == null) {
            return;
        }
        ProfileCommonInfo profileCommonInfoLJJZZI = LJJZZI();
        String uid = (profileCommonInfoLJJZZI == null || (userProfileInfo = profileCommonInfoLJJZZI.getUserProfileInfo()) == null) ? null : userProfileInfo.getUid();
        if (C268330AfP.LJIIIIZZ()) {
            return;
        }
        Layout layout = tuxTextViewLJLILLLLZI.getLayout();
        boolean z = false;
        if (layout != null && layout.getEllipsisCount(0) > 0) {
            z = true;
        }
        C1245340iVo c1245340iVo = C1245340iVo.LIZ;
        boolean z2 = this.LLJI;
        c1245340iVo.getClass();
        C1245340iVo.LJIILJJIL(uid, z2, z);
    }

    public final int LJL() {
        Icon icon;
        Integer iconInt$default;
        int i = C268330AfP.LIZLLL() ? R.raw.icon_arrow_triangle_down_large_fill : R.raw.icon_chevron_down;
        T t = this.LLJILJIL;
        return (t == 0 || (icon = t.getIcon()) == null || (iconInt$default = Icon.getIconInt$default(icon, null, Integer.valueOf(i), 1, null)) == null) ? i : iconInt$default.intValue();
    }

    public final void LJLJJI() {
        UserProfileInfo userProfileInfo;
        final User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        ProfileCommonInfo profileCommonInfoLJJZZI = LJJZZI();
        curUser.setSecUid((profileCommonInfoLJJZZI == null || (userProfileInfo = profileCommonInfoLJJZZI.getUserProfileInfo()) == null) ? null : userProfileInfo.getSecUid());
        this.LLJJJIL.LIZIZ(curUser, new C1235030iFB() { // from class: X.0hjt
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
                    this.LJLJI(curUser);
                    return;
                }
                String string3 = null;
                if (!verificationResponse.isCerting() && !verificationResponse.isCertedAgain()) {
                    if (verificationResponse.isCerted()) {
                        if (C1215600hjq.LIZ()) {
                            Context context = this.getContext();
                            if (context != null && (resources5 = context.getResources()) != null) {
                                string = resources5.getString(2131846434);
                            } else {
                                string = null;
                            }
                            Context context2 = this.getContext();
                            if (context2 != null && (resources4 = context2.getResources()) != null) {
                                string2 = resources4.getString(2131846433);
                            } else {
                                string2 = null;
                            }
                            if (string != null && string2 != null) {
                                Fragment fragment2 = this.LLILZ;
                                if (fragment2 != null && fragment2.getActivity() != null) {
                                    Fragment fragment3 = this.LLILZ;
                                    if (fragment3 == null || (activity4 = fragment3.getActivity()) == null) {
                                        return;
                                    }
                                    C21566919al c21566919al = new C21566919al(activity4);
                                    ProfileInfoNicknameProtocol profileInfoNicknameProtocol = this;
                                    User user = curUser;
                                    c21566919al.LIZJ = string2;
                                    c21566919al.LIZIZ = string;
                                    c21566919al.LJIIJ(2131846435, new DialogInterfaceOnClickListenerC1265860j2u(user, profileInfoNicknameProtocol, 5), false);
                                    c21566919al.LJII(R.string.f1_, null, false);
                                    new C21566519ah(c21566919al).LIZLLL();
                                    return;
                                }
                                Fragment fragment4 = this.LLILZ;
                                if (fragment4 != null && (activity3 = fragment4.getActivity()) != null) {
                                    ProfileInfoNicknameProtocol profileInfoNicknameProtocol2 = this;
                                    C1389890mGx c1389890mGx = new C1389890mGx(activity3);
                                    Context context3 = profileInfoNicknameProtocol2.getContext();
                                    if (context3 != null && (resources3 = context3.getResources()) != null) {
                                        string3 = resources3.getString(2131846436);
                                    }
                                    c1389890mGx.LJIIJ(string3);
                                    c1389890mGx.LJIIJJI();
                                    return;
                                }
                                return;
                            }
                        }
                        this.LJLJI(curUser);
                        return;
                    }
                    if (!verificationResponse.isUpdating() || (fragment = this.LLILZ) == null || (activity2 = fragment.getActivity()) == null) {
                        return;
                    }
                    ProfileInfoNicknameProtocol profileInfoNicknameProtocol3 = this;
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activity2);
                    Context context4 = profileInfoNicknameProtocol3.getContext();
                    if (context4 != null && (resources2 = context4.getResources()) != null) {
                        string3 = resources2.getString(2131846437);
                    }
                    c1389890mGx2.LJIIJ(string3);
                    c1389890mGx2.LJIIJJI();
                    return;
                }
                Fragment fragment5 = this.LLILZ;
                if (fragment5 == null || (activity = fragment5.getActivity()) == null) {
                    return;
                }
                ProfileInfoNicknameProtocol profileInfoNicknameProtocol4 = this;
                C1389890mGx c1389890mGx3 = new C1389890mGx(activity);
                Context context5 = profileInfoNicknameProtocol4.getContext();
                if (context5 != null && (resources = context5.getResources()) != null) {
                    string3 = resources.getString(2131846436);
                }
                c1389890mGx3.LJIIJ(string3);
                c1389890mGx3.LJIIJJI();
            }
        });
        LJLJJLL("add_name");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        TuxTextView tuxTextViewLJLI;
        ViewTreeObserver viewTreeObserver;
        C19EG activity;
        C0XQ7.LJ();
        C0XQ7.LIZ.LJI((InterfaceC586170Myt) this.LLJZIJLIL.getValue());
        C0HZL c0hzlLJJLL = LJJLL();
        if (c0hzlLJJLL != null) {
            EventBus.LIZLLL().LJJI(c0hzlLJJLL);
            c0hzlLJJLL.LIZLLL = 0;
            C0HZL.LJI = false;
        }
        int i = C1249980idI.LJ - 1;
        C1249980idI.LJ = i;
        if (i <= 0) {
            C1249980idI.LIZJ = false;
            C1249980idI.LIZLLL = 0;
            C1249980idI.LJ = 0;
        }
        Fragment fragment = this.LLILZ;
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), IProfileInfoNicknameAbility.class, null);
        }
        if (!C1EDI.LIZIZ() || (tuxTextViewLJLI = LJLI()) == null || (viewTreeObserver = tuxTextViewLJLI.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37 = this.LLJJL;
        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1265990j37);
        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1265990j37, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248220iaS LJIIZILJ() {
        return this.LLLIIIIL;
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

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r3) != false) goto L60;
     */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol.LJJLIIIJJIZ(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):boolean");
    }

    public final void LJLJI(final User user) throws Throwable {
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
        profileEditNicknameFragmentLIZ.LLJJIII = new InterfaceC1215650hjv() { // from class: X.0ia0
            @Override // X.InterfaceC1215650hjv
            public final void LIZ(String str, C1215680hjy c1215680hjy) {
                UserProfileInfo userProfileInfo;
                Describe describe;
                user.setNickname(str);
                ProfileInfoNicknameProtocol profileInfoNicknameProtocol = this;
                ProfileCommonInfo profileCommonInfoLJJZZI = profileInfoNicknameProtocol.LJJZZI();
                if (profileCommonInfoLJJZZI == null) {
                    profileCommonInfoLJJZZI = new ProfileCommonInfo();
                }
                ProfileCommonInfo profileCommonInfoLJJZZI2 = profileInfoNicknameProtocol.LJJZZI();
                if (profileCommonInfoLJJZZI2 == null || (userProfileInfo = profileCommonInfoLJJZZI2.getUserProfileInfo()) == null) {
                    userProfileInfo = new UserProfileInfo();
                }
                userProfileInfo.setNickname(str);
                profileCommonInfoLJJZZI.setUserProfileInfo(userProfileInfo);
                IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(profileInfoNicknameProtocol), IProfileBaseAbility.class, null);
                if (iProfileBaseAbility != null) {
                    iProfileBaseAbility.OJ1(profileCommonInfoLJJZZI);
                }
                T t = this.LLJILJIL;
                if (t != 0 && (describe = t.getDescribe()) != null) {
                    describe.setRemoteText(str);
                }
                ProfileInfoNicknameProtocol profileInfoNicknameProtocol2 = this;
                profileInfoNicknameProtocol2.LLJJLIIIJLLLLLLLZ = c1215680hjy;
                profileInfoNicknameProtocol2.LJJLIIIJILLIZJL();
                ProfileInfoNicknameProtocol profileInfoNicknameProtocol3 = this;
                C1215680hjy c1215680hjy2 = profileInfoNicknameProtocol3.LLJJLIIIJLLLLLLLZ;
                if (c1215680hjy2 != null) {
                    ((ArrayList) profileInfoNicknameProtocol3.LLJLIL).add(new C1215670hjx(EnumC1216800hlm.NICKNAME));
                    if (c1215680hjy2.LIZ) {
                        String str2 = c1215680hjy2.LIZJ;
                        C1215770hk7.LIZ.getClass();
                        if (C1215770hk7.LIZIZ(str2) && C1215760hk6.LIZ(str2, profileInfoNicknameProtocol3.getContext())) {
                            profileInfoNicknameProtocol3.LLJJLIIIJLLLLLLLZ = c1215680hjy2;
                            C1232410iAx c1232410iAx = profileInfoNicknameProtocol3.LLJL;
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
        FragmentManager fragmentManager = (FragmentManager) this.LLJZ.getValue();
        if (fragmentManager != null) {
            profileEditNicknameFragmentLIZ.show(fragmentManager, "EditWebsiteDialog");
        }
    }

    public final void LJLJJLL(String str) {
        String str2;
        String uid;
        Aweme aweme;
        String aid;
        UserProfileInfo userProfileInfo;
        if (((Boolean) this.LLJLL.getValue()).booleanValue()) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        ProfileCommonInfo profileCommonInfoLJJZZI = LJJZZI();
        String str3 = "";
        if (profileCommonInfoLJJZZI == null || (userProfileInfo = profileCommonInfoLJJZZI.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
            uid = "";
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null && (aweme = iProfilePlatformVM.getAweme()) != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        C1253930ijf.LJJIII(C1253930ijf.LIZ, str2, uid, str3, str, EnumC1248370iah.INFO, null, null, 96);
    }

    public final void LJZI(final String str) {
        Bundle bundle;
        if (!C0XQ7.LIZJ().isEnableMultiAccountLogin()) {
            return;
        }
        synchronized (this) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("profile_choose_account_dialog ");
            sbLIZ.append(((C1255390im1) this.LLJJJJ.getValue()).LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            FragmentManager fragmentManager = (FragmentManager) this.LLJZ.getValue();
            if (fragmentManager != null) {
                Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(strLIZIZ);
                if (fragmentLJJJJZI != null && fragmentLJJJJZI.isAdded()) {
                    if (str == null) {
                        return;
                    }
                } else {
                    if (str == null) {
                        bundle = null;
                    }
                    C1255380im0.LIZ(fragmentManager, (C1255390im1) this.LLJJJJ.getValue(), strLIZIZ, bundle, null, new DialogInterface.OnCancelListener() { // from class: X.0im9
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
                ((C1255390im1) this.LLJJJJ.getValue()).LIZIZ = "push_landing";
                bundle = new Bundle();
                C786410Ut5.LJJJI("switch_account_sec_uid", str, bundle);
                C1255380im0.LIZ(fragmentManager, (C1255390im1) this.LLJJJJ.getValue(), strLIZIZ, bundle, null, new DialogInterface.OnCancelListener() { // from class: X.0im9
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
    }

    public static boolean LJLL(Context context, View view) {
        Pair pair;
        if (context != null && view != null && ((Boolean) C1EDI.LJIIL.getValue()).booleanValue()) {
            C1248100iaG c1248100iaGLIZ = new C1248100iaG().LIZ();
            Keva keva = c1248100iaGLIZ.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add_name_guide_show");
            sbLIZ.append(c1248100iaGLIZ.LIZIZ);
            if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                if (view instanceof C428770Grb) {
                    pair = new Pair(Integer.valueOf(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13))));
                } else {
                    pair = new Pair(Integer.valueOf((view.getMeasuredWidth() / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), Integer.valueOf(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                }
                C450720Hlu c450720Hlu = new C450720Hlu(context);
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = view;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c450720Hlu.LJIIJ(2131838854);
                c450720Hlu.LJIIIIZZ(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
                c450720Hlu.LLILLJJLI.LJI = ((Number) pair.getFirst()).intValue();
                c450720Hlu.LIZJ(AFwS257S0000000_19.get$arr$(443));
                c450720Hlu.LIZIZ().show();
                C1250680ieQ.LIZ.getClass();
                C20684815ws.LJFF().execute(new Runnable() { // from class: X.01SX
                    public static void LIZ() {
                        Object c098200Yq;
                        try {
                            C20684815ws.LJIILLIIL("switch_account_bubble_show", new C2344009Gk().LIZ);
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ProfilePlatformStatistics@1051.sendShowSwitchAccountGuideEvent$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ProfilePlatformStatistics@1051.sendShowSwitchAccountGuideEvent$1");
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        IProfilePlatformVM iProfilePlatformVM;
        if (i == 116 && (iProfilePlatformVM = this.LLIZLLLIL) != null) {
            iProfilePlatformVM.zQ2(new C291001Au<>(new Pair(exc, Integer.valueOf(i))));
        }
    }

    public final void LJLJLLL(SpannableStringBuilder spannableStringBuilder, TuxTextView tuxTextView) {
        C0HZL c0hzlLJJLL = LJJLL();
        if (c0hzlLJJLL != null) {
            int i = this.LLLF;
            c0hzlLJJLL.LJFF = spannableStringBuilder;
            c0hzlLJJLL.LIZJ = i;
            if (tuxTextView != null) {
                c0hzlLJJLL.LJ = tuxTextView;
            }
            if (spannableStringBuilder != null) {
                TuxTextView tuxTextView2 = c0hzlLJJLL.LJ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(spannableStringBuilder);
                }
                C0HZL.LJI = false;
            }
        }
        C0HZL c0hzlLJJLL2 = LJJLL();
        if (c0hzlLJJLL2 != null) {
            c0hzlLJJLL2.LIZIZ(true);
        }
    }

    public final void LJLLL(int i, final String str) {
        boolean z;
        final int iIntValue;
        Object obj;
        C419890GdH c419890GdHLIZIZ;
        Context context;
        int i2;
        int i3;
        TuxTextView tuxTextViewLJLI = LJLI();
        if (tuxTextViewLJLI != null) {
            if (C0XQ7.LIZJ().isEnableMultiAccountLogin() && C1253010iiB.LIZJ.LJFF()) {
                z = true;
            } else {
                z = false;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str2 = "12";
            if (C1EDI.LIZIZ()) {
                if (z) {
                    str2 = "1234";
                }
                spannableStringBuilder.append((CharSequence) str2);
            } else {
                if (!z) {
                    str2 = "1";
                }
                spannableStringBuilder.append((CharSequence) str2);
            }
            if (C1EDI.LIZIZ()) {
                Context context2 = tuxTextViewLJLI.getContext();
                C1248090iaF c1248090iaF = new C1248090iaF(context2);
                c1248090iaF.LIZIZ(3);
                c1248090iaF.LIZJ(str);
                c1248090iaF.LIZLLL(C1369630lkH.LIZ(R.attr.a1h, context2));
                c1248090iaF.LIZ(0);
                c1248090iaF.LL.setPressed(false);
                obj = c1248090iaF;
            } else {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, tuxTextViewLJLI.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                final Context context3 = tuxTextViewLJLI.getContext();
                obj = new ReplacementSpan(context3, iIntValue, str) { // from class: X.0iab
                    public final int LL;
                    public final Context LLILLJJLI;
                    public float LLILLL = C418440Gaw.LIZIZ(6);
                    public final float LLILZ = C418440Gaw.LIZIZ(6);
                    public final float LLILZIL = C418440Gaw.LIZIZ(4);
                    public String LLILZLL;
                    public final int LLIZ;

                    public final float LIZ(Paint paint) {
                        float fMeasureText = paint.measureText(this.LLILZLL);
                        float f = this.LLILLL;
                        float f2 = 2;
                        float f3 = fMeasureText + (f * f2);
                        if (f3 >= this.LLIZ) {
                            if (f == C418440Gaw.LIZIZ(6)) {
                                this.LLILLL = C418440Gaw.LIZIZ(2);
                            }
                            float fMeasureText2 = paint.measureText(this.LLILZLL) + (this.LLILLL * f2);
                            if (fMeasureText2 > this.LLIZ) {
                                if (u.LJJIIJZLJL(this.LLILZLL, "+ ", false)) {
                                    this.LLILZLL = this.LLILZLL.substring(2);
                                } else if (u.LJIIZILJ(this.LLILZLL, " +", false) && this.LLILZLL.length() > 2) {
                                    String str3 = this.LLILZLL;
                                    this.LLILZLL = str3.substring(0, str3.length() - 2);
                                }
                                fMeasureText2 = paint.measureText(this.LLILZLL) + (this.LLILLL * f2);
                            }
                            if (fMeasureText2 > this.LLIZ) {
                                String str4 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(this.LLILZLL, new String[]{" "}, 0, 6), 0);
                                this.LLILZLL = str4;
                                return (this.LLILLL * f2) + paint.measureText(str4);
                            }
                            return fMeasureText2;
                        }
                        return f3;
                    }

                    {
                        int iLIZIZ;
                        int iLIZ;
                        int iLIZIZ2;
                        this.LL = iIntValue;
                        this.LLILLJJLI = context3;
                        this.LLILZLL = str;
                        if (C268330AfP.LJIIL()) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
                        } else {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                        }
                        if (C268330AfP.LJIIJ()) {
                            int iLIZIZ3 = C497820Jfg.LIZIZ(context3);
                            int i4 = ProfileUserInfoManageBaseComponent.LLJLIL;
                            iLIZ = ((iLIZIZ3 - (C1248300iaa.LIZ() * 4)) - iLIZIZ) - C1248300iaa.LIZIZ();
                            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                        } else {
                            int iLIZIZ4 = C497820Jfg.LIZIZ(context3);
                            int i5 = ProfileUserInfoManageBaseComponent.LLJLIL;
                            iLIZ = iLIZIZ4 - (((C1248300iaa.LIZ() + C1248300iaa.LIZIZ()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30))) * 2);
                            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                        }
                        this.LLIZ = iLIZ - iLIZIZ2;
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                        return (int) LIZ(paint);
                    }

                    @Override // android.text.style.ReplacementSpan
                    public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
                        int iIntValue2;
                        float fLIZ = LIZ(paint);
                        float f2 = this.LLILZ;
                        RectF rectF = new RectF(f, i6 - f2, fLIZ + f, i8 + f2);
                        Paint paint2 = new Paint();
                        paint2.setStyle(Paint.Style.FILL);
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, this.LLILLJJLI);
                        if (numLIZJ2 != null) {
                            iIntValue2 = numLIZJ2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        paint2.setColor(iIntValue2);
                        float f3 = this.LLILZIL;
                        canvas.drawRoundRect(rectF, f3, f3, paint2);
                        paint.setColor(this.LL);
                        canvas.drawText(this.LLILZLL, f + this.LLILLL, i7, paint);
                    }
                };
            }
            if (!C1EDI.LIZIZ()) {
                C786410Ut5.q2(spannableStringBuilder, obj, 0, 1, 17);
            }
            if (z && (context = tuxTextViewLJLI.getContext()) != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = i;
                if (C1EDI.LIZIZ()) {
                    i2 = 14;
                } else {
                    i2 = 16;
                }
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
                if (C1EDI.LIZIZ()) {
                    i3 = 14;
                } else {
                    i3 = 16;
                }
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3));
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
                if (c419890GdHLIZIZ != null) {
                    c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C444960Hcc.LIZIZ());
                }
            } else {
                c419890GdHLIZIZ = null;
            }
            AbstractC426530Gnz abstractC426530Gnz = new AbstractC426530Gnz() { // from class: X.0ia3
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    ProfileInfoNicknameProtocol profileInfoNicknameProtocol = this.LL;
                    profileInfoNicknameProtocol.getClass();
                    C1249980idI.LIZIZ();
                    profileInfoNicknameProtocol.LJZI(null);
                    profileInfoNicknameProtocol.LJLJJLL("switch_account");
                }
            };
            if (C1EDI.LIZIZ()) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_plus_fill;
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                C786410Ut5.q2(spannableStringBuilder, c419910GdJ2.LIZIZ(2, tuxTextViewLJLI.getContext()), 0, 1, 17);
                C786410Ut5.q2(spannableStringBuilder, obj, 1, 2, 17);
                C786410Ut5.q2(spannableStringBuilder, this.LLLIIII, 1, 2, 17);
                if (z) {
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZ = R.raw.icon_vertical_line;
                    c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                    c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    c419910GdJ3.LJ = Integer.valueOf(R.attr.a02);
                    C419890GdH c419890GdHLIZIZ2 = c419910GdJ3.LIZIZ(2, tuxTextViewLJLI.getContext());
                    c419890GdHLIZIZ2.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C444960Hcc.LIZIZ());
                    C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ2, 2, 3, 17);
                    C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 3, 4, 17);
                    C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, 3, 4, 17);
                }
                TuxTextView tuxTextViewLJLI2 = LJLI();
                if (tuxTextViewLJLI2 != null) {
                    C426750GoL.LJIIL(tuxTextViewLJLI2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, 16);
                }
                TuxTextView tuxTextViewLJLI3 = LJLI();
                if (tuxTextViewLJLI3 != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                    tuxTextViewLJLI3.setBackground(c384050F3z.LIZ(tuxTextViewLJLI.getContext()));
                }
            } else {
                C786410Ut5.q2(spannableStringBuilder, this.LLLIIII, 0, 1, 17);
                if (z) {
                    C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 1, 2, 17);
                    C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, 1, 2, 17);
                }
            }
            this.LLLF = 3;
            LJLJLLL(spannableStringBuilder, LJLI());
            tuxTextViewLJLI.setText(spannableStringBuilder);
            C786410Ut5.LLLLZLL(tuxTextViewLJLI, 0);
            TuxTextView tuxTextViewLJLILLLLZI = LJLILLLLZI();
            if (tuxTextViewLJLILLLLZI != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJLILLLLZI, 8);
            }
            HandlerHook.viewPost(tuxTextViewLJLI, new ARunnableS101S0100000_1((Object) tuxTextViewLJLI, 72));
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        if (i == 116 && this.LLJJLIIIJLLLLLLLZ != null) {
            C1232140iAW.LIZ.getClass();
            C1232140iAW.LJIILIIL(1, "edit_nickname_page", null, true);
            ((ArrayList) this.LLJLIL).add(new C1215670hjx(EnumC1216800hlm.USERNAME));
            Fragment fragment = this.LLILZ;
            if (fragment != null) {
                ((ProfileNameSyncService) this.LLJLILLLLZIIL.getValue()).LJFF(fragment, this.LLJLIL, new AwS563S0100000_19(this, 3188));
            }
            ((ArrayList) this.LLJLIL).clear();
            Fragment fragment2 = this.LLILZ;
            if ((fragment2 instanceof I18nMyProfileFragment) && fragment2 != null) {
                fragment2.onResume();
            }
        }
    }

    public final void LJJLIIIJLJLI(int i, Integer num, String str) {
        Context context;
        boolean z;
        boolean z2;
        int iLIZIZ;
        int iLIZIZ2;
        C419890GdH c419890GdHLIZIZ;
        C419890GdH c419890GdHLIZIZ2;
        String uid;
        boolean z3;
        String uid2;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        UserProfileInfo userProfileInfo3;
        TuxTextView tuxTextViewLJLILLLLZI = LJLILLLLZI();
        if (tuxTextViewLJLILLLLZI == null || (context = tuxTextViewLJLILLLLZI.getContext()) == null) {
            return;
        }
        String uid3 = null;
        tuxTextViewLJLILLLLZI.setCompoundDrawables(null, null, null, null);
        tuxTextViewLJLILLLLZI.setTuxFont(LJJJJJ().intValue());
        boolean z4 = false;
        tuxTextViewLJLILLLLZI.setMinTextSizePx(0);
        tuxTextViewLJLILLLLZI.setBreakStrategy(1);
        tuxTextViewLJLILLLLZI.setHyphenationFrequency(1);
        if (num != null && num.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (C1253010iiB.LIZJ.LJFF() && C0XQ7.LIZJ().isEnableMultiAccountLogin()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        } else {
            iLIZIZ = 0;
        }
        if (z2) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        } else {
            iLIZIZ2 = 0;
        }
        int i2 = iLIZIZ + iLIZIZ2;
        int iLIZ = C1247810iZn.LIZ(0, 1, context);
        C1247950ia1 c1247950ia1LIZ = C1257290ip5.LIZ(tuxTextViewLJLILLLLZI.getPaint(), str, tuxTextViewLJLILLLLZI.getPaint().getTextSize(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), iLIZ, i2, ((Boolean) C268330AfP.LJIIL.getValue()).booleanValue());
        tuxTextViewLJLILLLLZI.LJJJJI(c1247950ia1LIZ.LIZLLL / tuxTextViewLJLILLLLZI.getResources().getDisplayMetrics().scaledDensity);
        int i3 = 2;
        if (z && num != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = num.intValue();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
            c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C444960Hcc.LIZIZ());
        } else {
            c419890GdHLIZIZ = null;
        }
        if (z2) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = i;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
            c419890GdHLIZIZ2 = c419910GdJ2.LIZIZ(2, context);
        } else {
            c419890GdHLIZIZ2 = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1247950ia1LIZ.LIZIZ);
        if (C444960Hcc.LIZIZ()) {
            if (c419890GdHLIZIZ != null) {
                spannableStringBuilder.insert(0, "2");
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
            }
            if (c419890GdHLIZIZ2 != null) {
                spannableStringBuilder.insert(0, "1");
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ2, 0, 1, 17);
            }
        } else {
            if (c419890GdHLIZIZ != null) {
                spannableStringBuilder.append("2");
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
            if (c419890GdHLIZIZ2 != null) {
                spannableStringBuilder.append("1");
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
        }
        tuxTextViewLJLILLLLZI.setMaxLines(c1247950ia1LIZ.LIZ);
        if (c419890GdHLIZIZ == null) {
            i3 = 1;
        }
        this.LLLF = i3;
        tuxTextViewLJLILLLLZI.setText(spannableStringBuilder);
        C786410Ut5.LLLLZLL(tuxTextViewLJLILLLLZI, 0);
        TuxTextView tuxTextViewLJLI = LJLI();
        if (tuxTextViewLJLI != null) {
            C786410Ut5.LLLLZLL(tuxTextViewLJLI, 8);
        }
        LJLJLLL(spannableStringBuilder, tuxTextViewLJLILLLLZI);
        C1245340iVo c1245340iVo = C1245340iVo.LIZ;
        boolean z5 = this.LLJI;
        boolean z6 = c1247950ia1LIZ.LIZJ;
        ProfileCommonInfo profileCommonInfoLJJZZI = LJJZZI();
        if (profileCommonInfoLJJZZI != null && (userProfileInfo3 = profileCommonInfoLJJZZI.getUserProfileInfo()) != null) {
            uid = userProfileInfo3.getUid();
        } else {
            uid = null;
        }
        c1245340iVo.getClass();
        C1245340iVo.LJIILJJIL(uid, z5, z6);
        boolean z7 = this.LLJI;
        if (c1247950ia1LIZ.LIZ > 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        ProfileCommonInfo profileCommonInfoLJJZZI2 = LJJZZI();
        if (profileCommonInfoLJJZZI2 != null && (userProfileInfo2 = profileCommonInfoLJJZZI2.getUserProfileInfo()) != null) {
            uid2 = userProfileInfo2.getUid();
        } else {
            uid2 = null;
        }
        C1245340iVo.LJIILL(uid2, z7, z3);
        boolean z8 = this.LLJI;
        if (c1247950ia1LIZ.LIZ > 1 && c1247950ia1LIZ.LJ) {
            z4 = true;
        }
        ProfileCommonInfo profileCommonInfoLJJZZI3 = LJJZZI();
        if (profileCommonInfoLJJZZI3 != null && (userProfileInfo = profileCommonInfoLJJZZI3.getUserProfileInfo()) != null) {
            uid3 = userProfileInfo.getUid();
        }
        C1245340iVo.LJIILLIIL(uid3, z8, z4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyV2Layout plan: maxLines=");
        sbLIZ.append(c1247950ia1LIZ.LIZ);
        sbLIZ.append(", isEllipsized=");
        sbLIZ.append(c1247950ia1LIZ.LIZJ);
        sbLIZ.append(", iconReservedPx=");
        sbLIZ.append(i2);
        sbLIZ.append(", availW=");
        sbLIZ.append(iLIZ);
        C1248210iaR.LIZIZ("InfoNicknameTag", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJLLLL(int i, int i2, String str) {
        if (C268330AfP.LJIIIIZZ()) {
            LJJLIIIJLJLI(i2, Integer.valueOf(i), str);
            return;
        }
        TuxTextView tuxTextViewLJLILLLLZI = LJLILLLLZI();
        if (tuxTextViewLJLILLLLZI != null) {
            tuxTextViewLJLILLLLZI.setMaxLines(Integer.MAX_VALUE);
            TuxTextView tuxTextView = new TuxTextView(tuxTextViewLJLILLLLZI.getContext(), null, 6, 0);
            tuxTextView.setTextColor(C1369630lkH.LIZ(R.attr.a1h, tuxTextView.getContext()));
            tuxTextView.setTuxFont(LJJJJJ().intValue());
            tuxTextView.setText(str);
            C430750Gun c430750Gun = new C430750Gun(tuxTextView);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, tuxTextViewLJLILLLLZI.getContext());
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = i2;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
            C419890GdH c419890GdHLIZIZ2 = c419910GdJ2.LIZIZ(2, tuxTextViewLJLILLLLZI.getContext());
            c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C444960Hcc.LIZIZ());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append("123");
            if (C444960Hcc.LIZIZ()) {
                if (C1253010iiB.LIZJ.LJFF()) {
                    C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ2, 0, 1, 17);
                }
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 1, 2, 17);
                C786410Ut5.q2(spannableStringBuilder, c430750Gun, 2, 3, 17);
            } else {
                C786410Ut5.q2(spannableStringBuilder, c430750Gun, 0, 1, 17);
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 1, 2, 17);
                if (C1253010iiB.LIZJ.LJFF()) {
                    C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ2, 2, 3, 17);
                }
            }
            this.LLLF = 2;
            tuxTextViewLJLILLLLZI.setText(spannableStringBuilder);
            C786410Ut5.LLLLZLL(tuxTextViewLJLILLLLZI, 0);
            TuxTextView tuxTextViewLJLI = LJLI();
            if (tuxTextViewLJLI != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJLI, 8);
            }
            LJLJLLL(spannableStringBuilder, tuxTextViewLJLILLLLZI);
            HandlerHook.viewPost(tuxTextViewLJLILLLLZI, new ARunnableS119S0100000_19(this, 190));
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
