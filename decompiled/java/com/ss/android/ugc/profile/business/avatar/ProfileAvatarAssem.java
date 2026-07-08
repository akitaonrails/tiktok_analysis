package com.ss.android.ugc.profile.business.avatar;

import X.C013C;
import X.C019F;
import X.C01GW;
import X.C0BWT;
import X.C0H9H;
import X.C0ZPH;
import X.C1245160iVW;
import X.C1248210iaR;
import X.C1248230iaT;
import X.C1251390ifZ;
import X.C1251860igK;
import X.C1253930ijf;
import X.C1255030ilR;
import X.C1255650imR;
import X.C1256220inM;
import X.C1256230inN;
import X.C1256300inU;
import X.C1256320inW;
import X.C1256410inf;
import X.C1256470inl;
import X.C1256520inq;
import X.C1256530inr;
import X.C1256560inu;
import X.C13LE;
import X.C1439905kL;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1720106oR;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19EG;
import X.C19ME;
import X.C19PZ;
import X.C1BNE;
import X.C1EJQ;
import X.C20584815gk;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2344009Gk;
import X.C268330AfP;
import X.C418440Gaw;
import X.C420101kF;
import X.C427660Gpo;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C740740T3w;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248370iah;
import X.EnumC1253850ijX;
import X.EnumC1256400ine;
import X.EnumC1256590inx;
import X.EnumC1257160ios;
import X.EnumC1606080rte;
import X.EnumC1607270rvZ;
import X.EnumC1608710rxt;
import X.EnumC588120N4w;
import X.InterfaceC1249220ic4;
import X.InterfaceC1251040if0;
import X.InterfaceC1256280inS;
import X.InterfaceC1256490inn;
import X.InterfaceC1398730mVD;
import X.InterfaceC1606880ruw;
import X.InterfaceC1609780rzc;
import X.InterfaceC2217461Bqa;
import X.InterfaceC438160HGc;
import X.InterfaceC487330J9f;
import X.InterfaceC897330ZId;
import X.InterfaceC899440ZQg;
import Y.ALAdapterS0S0300000_5;
import Y.ALAdapterS0S0500001_19;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.story.ProfileStoryNote;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.story.experiment.thought.AvatarThoughtsConfigs;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS484S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileAvatarAssem extends UIContentAssem implements InterfaceC487330J9f, IAvatarAbility, InterfaceC1256490inn, InterfaceC1609780rzc {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJ;
    public AvatarComponentView LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public InterfaceC1256280inS LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public AnimatorSet LLJJ;
    public Rect LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public InterfaceC1398730mVD LLJJJJJIL;
    public C1255030ilR LLJJL;
    public C1256530inr LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public InterfaceC899440ZQg LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final List<InterfaceC1251040if0> LLJZ;
    public ProfileStoryNote LLJZIJLIL;
    public boolean LLL;
    public final C01GW LLLF;
    public String LLLFF;
    public final C2252321DDq LLLFFI;
    public ThoughtInfo LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public final C01GW LLLIIIL;
    public boolean LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final MutableLiveData<Boolean> LLLILZ;
    public final MutableLiveData<Boolean> LLLILZJ;
    public String LLLILZLLLI;
    public StoryNoteDataCollection LLLIZZ;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2063));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2061));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2058));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2059));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2064));
    public final MutableLiveData<C0ZPH> LLJJJJLIIL = new MutableLiveData<>(C0ZPH.LIZJ);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAvatarAssem.class, "profilePlatformViewModel", "getProfilePlatformViewModel()Lcom/ss/android/ugc/profile/platform/base/viewmodel/ProfilePlatformViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileAvatarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfilePlatformViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2065), AFwS257S0000000_19.get$arr$(347), null, true);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2056));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2060));
        this.LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2057));
        this.LLJZ = new ArrayList();
        this.LLLF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(344));
        this.LLLFFI = C1BNE.LIZ(null);
        this.LLLIIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(342));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2062));
        this.LLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(343));
        Boolean bool = Boolean.FALSE;
        this.LLLILZ = new MutableLiveData<>(bool);
        this.LLLILZJ = new MutableLiveData<>(bool);
    }

    public abstract void Ho();

    public abstract void No();

    public InterfaceC897330ZId So() {
        return null;
    }

    public final void Wp() {
        int[] iArr = new int[2];
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        if (avatarComponentView != null) {
            avatarComponentView.getLocationInWindow(iArr);
        }
        int i = iArr[0];
        int i2 = iArr[1];
        AvatarComponentView avatarComponentView2 = this.LLIZLLLIL;
        int width = (avatarComponentView2 != null ? avatarComponentView2.getWidth() : 0) + i;
        AvatarComponentView avatarComponentView3 = this.LLIZLLLIL;
        this.LLJJI = new Rect(i, i2, width, (avatarComponentView3 != null ? avatarComponentView3.getHeight() : 0) + i2);
    }

    public abstract C1255030ilR dp();

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract boolean q1();

    public void xE(boolean z) {
    }

    private final C1248230iaT ap() {
        return (C1248230iaT) this.LLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.avatar.IAvatarAbility
    public final View Co0() {
        InterfaceC1256280inS interfaceC1256280inS = this.LLJIJIL;
        if (interfaceC1256280inS != null) {
            return interfaceC1256280inS.LJJZZI();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ep() {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem.Ep():void");
    }

    @Override // X.InterfaceC1609780rzc
    public final void Gi() {
        int i = C2187451AjH.LIZ;
        for (InterfaceC1251040if0 interfaceC1251040if0 : (ArrayList) this.LLJZ) {
            AvatarComponentView avatarComponentView = this.LLIZLLLIL;
            if (avatarComponentView != null) {
                avatarComponentView.getAvatar();
            }
            interfaceC1251040if0.s7();
        }
    }

    public final String ep() {
        return (String) this.LLJJJJ.getValue();
    }

    public final ProfilePlatformViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJ;
        return (ProfilePlatformViewModel) assemVMLazy.getValue();
    }

    public final IStoryThoughtMyDataManager lp() {
        return (IStoryThoughtMyDataManager) this.LLLF.getValue();
    }

    public final boolean op() {
        return ((Boolean) this.LLLIIIL.getValue()).booleanValue();
    }

    public final boolean sp() {
        return ((Boolean) this.LLJLLIL.getValue()).booleanValue();
    }

    private final boolean cp() {
        String str;
        if (!q1()) {
            return false;
        }
        StoryNoteDataCollection storyNoteDataCollection = this.LLLIZZ;
        return (storyNoteDataCollection == null || (str = storyNoteDataCollection.text) == null || str.length() == 0) && System.currentTimeMillis() < AvatarThoughtsConfigs.LIZ().newUserGuideExpireDate;
    }

    private final boolean kp() {
        SocialAvatarAccess socialAvatarAccess;
        User userIp;
        User userIp2;
        SocialAvatarAccess socialAvatarAccess2;
        return (q1() && (socialAvatarAccess2 = (SocialAvatarAccess) this.LLLIL.getValue()) != null && socialAvatarAccess2.LIZLLL() && C1245160iVW.LIZ(ip())) || !(q1() || (socialAvatarAccess = (SocialAvatarAccess) this.LLLIL.getValue()) == null || !socialAvatarAccess.LIZ() || (userIp = ip()) == null || userIp.isBlock || (userIp2 = ip()) == null || userIp2.isBlocked() || !C1245160iVW.LIZ(ip()));
    }

    public final boolean Ap() {
        boolean z = Bp() && !C268330AfP.LIZLLL();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needAdjustPadding = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    public final boolean Bp() {
        boolean z = false;
        boolean z2 = C268330AfP.LJIIJ() || mp(ip());
        if (C0BWT.LIZ() && z2) {
            z = true;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needShrinkThought = ");
        sbLIZ.append(z2);
        sbLIZ.append(", result = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    public final void Lo() {
        Intent intent;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Boolean boolValueOf = null;
        if (c19egLIZ != null && (intent = c19egLIZ.getIntent()) != null) {
            boolValueOf = Boolean.valueOf(intent.getBooleanExtra("auto_transfer_to_enlarge_avatar", false));
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || boolValueOf == null) {
            return;
        }
        boolValueOf.booleanValue();
        synchronized (this) {
            try {
                if (!this.LLLIIL && this.LLLI && this.LLLIIII) {
                    HandlerHook.viewPostDelay(LJJIJL(), (Runnable) this.LLLIILIL.getValue(), 500L);
                    this.LLLIIL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void Up() {
        User userIp;
        IHeaderAccountInfoAbility iHeaderAccountInfoAbility;
        int iLIZIZ;
        int iLIZJ;
        IHeaderUserBasicInfoAbility iHeaderUserBasicInfoAbility;
        if (!C268330AfP.LIZLLL() || (userIp = ip()) == null || (iHeaderAccountInfoAbility = (IHeaderAccountInfoAbility) this.LLJJJ.getValue()) == null) {
            return;
        }
        boolean zMp = mp(userIp);
        int iLIZIZ2 = 0;
        if (C268330AfP.LJIIIIZZ()) {
            C1248230iaT c1248230iaTAp = ap();
            boolean z = this.LLJILJIL;
            c1248230iaTAp.getClass();
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(z ? zMp ? c1248230iaTAp.LIZIZ ? 24 : 28 : c1248230iaTAp.LIZIZ ? 6 : 10 : zMp ? 12 : 4)));
            C1248230iaT c1248230iaTAp2 = ap();
            boolean z2 = this.LLJILJIL;
            c1248230iaTAp2.getClass();
            iLIZIZ2 = !z2 ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            iLIZJ = 0;
        } else {
            iLIZIZ = ap().LIZIZ(zMp, this.LLJILJIL);
            C1248230iaT c1248230iaTAp3 = ap();
            boolean z3 = this.LLJILJIL;
            c1248230iaTAp3.getClass();
            iLIZJ = (zMp || z3) ? C1248230iaT.LIZJ() : C1248230iaT.LIZLLL();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncInfoContainerMargin: topA=");
        sbLIZ.append(iLIZIZ);
        sbLIZ.append(", topB=");
        sbLIZ.append(iLIZIZ2);
        sbLIZ.append(", bottom=");
        sbLIZ.append(iLIZJ);
        sbLIZ.append(", frame=");
        sbLIZ.append(zMp);
        sbLIZ.append(", thoughtVisible=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", isMine=");
        sbLIZ.append(q1());
        C1248210iaR.LJ("ProfileAvatarAssem", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
        iHeaderAccountInfoAbility.lp1(iLIZIZ, iLIZJ);
        if (!C268330AfP.LJIIIIZZ() || (iHeaderUserBasicInfoAbility = (IHeaderUserBasicInfoAbility) this.LLJJJIL.getValue()) == null) {
            return;
        }
        iHeaderUserBasicInfoAbility.ND0(iLIZIZ2);
    }

    public final int Vo() {
        return ap().LIZ().getFirst().intValue();
    }

    public final int Zo() {
        C1248230iaT c1248230iaTAp = ap();
        c1248230iaTAp.getClass();
        if (C268330AfP.LIZLLL()) {
            return 96;
        }
        return (C268330AfP.LJIIL() || c1248230iaTAp.LIZ) ? 84 : 96;
    }

    public final boolean bp() {
        return !q1() && C420101kF.LIZ(EnumC1606080rte.OTHER_PROFILE);
    }

    public final User ip() {
        if (q1()) {
            return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            return userProfileAbility.getUser();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            r3 = this;
            super.onCreate()
            X.19EG r0 = X.C724240Sb0.LIZ(r3)
            if (r0 == 0) goto L35
            int r0 = r0.hashCode()
            X.C487280J9a.LIZ(r0, r3)
            boolean r0 = r3.op()
            if (r0 != 0) goto L25
            X.0ifZ r1 = X.C1251390ifZ.LIZ
            boolean r0 = r3.q1()
            r1.getClass()
            boolean r0 = X.C1251390ifZ.LIZIZ(r0)
            if (r0 == 0) goto L35
        L25:
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r3)
            if (r0 == 0) goto L35
            r2 = 0
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r2)
            java.lang.Class<com.ss.android.ugc.profile.business.avatar.IAvatarAbility> r0 = com.ss.android.ugc.profile.business.avatar.IAvatarAbility.class
            X.C1558520qew.LJII(r1, r3, r0, r2, r2)
        L35:
            boolean r0 = X.C1EJQ.LIZIZ()
            if (r0 != 0) goto L4b
            X.0inl r1 = X.C1256470inl.LL
            android.content.Context r0 = r3.getContext()
            r1.LIZ(r0)
            java.util.List<X.0inn> r0 = X.C1256470inl.LLILZIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r3)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem.onCreate():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        if (!C1EJQ.LIZIZ()) {
            C1256470inl.LL.getClass();
            ((ArrayList) C1256470inl.LLILZIL).remove(this);
        }
        HandlerHook.viewRemoveCallbacks(LJJIJL(), (Runnable) this.LLLIILIL.getValue());
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
        if (!op()) {
            C1251390ifZ c1251390ifZ = C1251390ifZ.LIZ;
            boolean zQ1 = q1();
            c1251390ifZ.getClass();
            if (!C1251390ifZ.LIZIZ(zQ1)) {
                return;
            }
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IAvatarAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLLIIII = false;
        this.LLLIIIIL = false;
        if (bp()) {
            this.LLJJJJLIIL.setValue(new C0ZPH(false, "page_pause"));
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        this.LLLIIII = true;
        Vp(false);
        Lo();
    }

    public final void yp() {
        C1256520inq c1256520inq;
        Object id;
        String uid;
        Aweme awemeLJFF;
        String groupId;
        ProfileBadgeStruct profileBadge;
        Map<EnumC1607270rvZ, InterfaceC1606880ruw> currentActiveBusiness;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        InterfaceC1606880ruw interfaceC1606880ruw = null;
        if (avatarComponentView != null && (currentActiveBusiness = avatarComponentView.getCurrentActiveBusiness()) != null) {
            interfaceC1606880ruw = currentActiveBusiness.get(EnumC1607270rvZ.PERSON);
        }
        if ((interfaceC1606880ruw instanceof C1256520inq) && (c1256520inq = (C1256520inq) interfaceC1606880ruw) != null && c1256520inq.LL) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", ep());
            User userIp = ip();
            String str = "";
            if (userIp == null || (profileBadge = userIp.getProfileBadge()) == null || (id = profileBadge.getId()) == null) {
                id = "";
            }
            c2344009Gk.LJ(id, "badge_id");
            User userIp2 = ip();
            if (userIp2 == null || (uid = userIp2.getUid()) == null) {
                uid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            if (c19egLIZ != null && (awemeLJFF = C740740T3w.LJFF(c19egLIZ)) != null && (groupId = awemeLJFF.getGroupId()) != null) {
                str = groupId;
            }
            c2344009Gk.LJIIIIZZ("group_id", str);
            C20684815ws.LJIILLIIL("profile_badge_click", c2344009Gk.LIZ);
        }
    }

    public static final SocialAvatarAccess Go(ProfileAvatarAssem profileAvatarAssem) {
        return (SocialAvatarAccess) profileAvatarAssem.LLLIL.getValue();
    }

    public static boolean mp(User user) {
        ProfileBadgeStruct profileBadge;
        if (user != null && (profileBadge = user.getProfileBadge()) != null && profileBadge.getShouldShow()) {
            return true;
        }
        return false;
    }

    public final void Fp(Function0<Unit> function0) {
        Object avatar;
        HashMap<EnumC1608710rxt, View> avatarDisplayView;
        View view;
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        if (avatarComponentView != null && (avatarDisplayView = avatarComponentView.getAvatarDisplayView()) != null && (view = avatarDisplayView.get(EnumC1608710rxt.OVERLAY)) != null && view.getVisibility() == 0) {
            avatar = this.LLIZLLLIL;
        } else if (kp()) {
            AvatarComponentView avatarComponentView2 = this.LLIZLLLIL;
            if (avatarComponentView2 != null) {
                avatar = avatarComponentView2.getSocialAvatar();
            } else {
                return;
            }
        } else {
            AvatarComponentView avatarComponentView3 = this.LLIZLLLIL;
            if (avatarComponentView3 != null) {
                avatar = avatarComponentView3.getAvatar();
            } else {
                return;
            }
        }
        if (avatar != null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI("scaleX", "scaleY");
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                arrayList.add(ObjectAnimator.ofFloat(avatar, (String) it2.next(), 0.9f));
            }
            if (this.LLJJ == null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
                animatorSet.setDuration(100L);
                animatorSet.playTogether(arrayList);
                animatorSet.addListener(new ALAdapterS0S0300000_5(this, function0, avatar, 2));
                this.LLJJ = animatorSet;
            }
            AnimatorSet animatorSet2 = this.LLJJ;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }

    public final void Gp(Function0 function0) {
        View avatar;
        HashMap<EnumC1608710rxt, View> avatarDisplayView;
        View view;
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        if (avatarComponentView != null && (avatarDisplayView = avatarComponentView.getAvatarDisplayView()) != null && (view = avatarDisplayView.get(EnumC1608710rxt.OVERLAY)) != null && view.getVisibility() == 0) {
            avatar = this.LLIZLLLIL;
        } else if (kp()) {
            AvatarComponentView avatarComponentView2 = this.LLIZLLLIL;
            if (avatarComponentView2 == null) {
                return;
            } else {
                avatar = avatarComponentView2.getSocialAvatar();
            }
        } else {
            AvatarComponentView avatarComponentView3 = this.LLIZLLLIL;
            if (avatarComponentView3 == null) {
                return;
            } else {
                avatar = avatarComponentView3.getAvatar();
            }
        }
        if (avatar != null) {
            C013C c013c = new C013C();
            C013C c013c2 = new C013C();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(avatar, "scaleX", 1.0f, 0.9f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(new C19PZ());
            objectAnimatorOfFloat.addListener(new ALAdapterS0S0500001_19(c013c, c013c2, function0, this, avatar, 0));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(avatar, "scaleY", 1.0f, 0.9f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(new C19PZ());
            objectAnimatorOfFloat2.addListener(new ALAdapterS0S0500001_19(c013c2, c013c, function0, this, avatar, 1));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ip(com.ss.android.ugc.aweme.profile.model.User r13) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem.Ip(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void Jo(boolean z) {
        int iLIZIZ;
        AvatarComponentView avatarComponentView;
        int i;
        int i2 = 0;
        if (z) {
            int i3 = 18;
            if (C268330AfP.LJIIL()) {
                i = 12;
            } else if (Zo() == 96) {
                i = 28;
            } else {
                i = 18;
            }
            if (!mp(ip())) {
                i3 = 0;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i + i3)));
        } else {
            iLIZIZ = 0;
        }
        View view = this.LLJI;
        if (view != null) {
            if (!z) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iLIZIZ;
                C786410Ut5.W5(view, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (!C1439905kL.LIZ() || (avatarComponentView = this.LLIZLLLIL) == null) {
            return;
        }
        C0H9H.LJI(iLIZIZ, avatarComponentView);
    }

    public final void Qp(String str) {
        if (!C1439905kL.LIZ()) {
            return;
        }
        C2252321DDq c2252321DDq = this.LLLFFI;
        if (str.length() <= 0) {
            str = null;
        }
        c2252321DDq.setValue(str);
    }

    public final void Vp(boolean z) {
        AvatarSizeUrlStruct dynamicSocialAvatar;
        UrlModel urlModel;
        List<String> urlList;
        InterfaceC438160HGc socialAvatarAbility;
        User userIp;
        AvatarSizeUrlStruct dynamicSocialAvatar2;
        UrlModel urlModel2;
        List<String> urlList2;
        AvatarComponentView avatarComponentView;
        InterfaceC438160HGc socialAvatarAbility2;
        SocialAvatarAccess socialAvatarAccess = (SocialAvatarAccess) this.LLLIL.getValue();
        if (socialAvatarAccess != null && socialAvatarAccess.LIZ()) {
            User userIp2 = ip();
            if (userIp2 != null && userIp2.isBlock) {
                return;
            }
            if (C1256220inM.LIZ() && C1256230inN.LIZ(ip())) {
                return;
            }
            if (z) {
                User userIp3 = ip();
                if (userIp3 != null && C1245160iVW.LIZ(userIp3) && (userIp = ip()) != null && (dynamicSocialAvatar2 = userIp.getDynamicSocialAvatar()) != null && (urlModel2 = dynamicSocialAvatar2.avatarLarger) != null && (urlList2 = urlModel2.getUrlList()) != null && (avatarComponentView = this.LLIZLLLIL) != null && (socialAvatarAbility2 = avatarComponentView.getSocialAvatarAbility()) != null) {
                    socialAvatarAbility2.LIZIZ(urlList2);
                    return;
                }
                return;
            }
            synchronized (this) {
                try {
                    if (!this.LLLIIIIL && this.LLLIIII && this.LLLI) {
                        User userIp4 = ip();
                        if (userIp4 != null && C1245160iVW.LIZ(userIp4)) {
                            User userIp5 = ip();
                            if (userIp5 != null && (dynamicSocialAvatar = userIp5.getDynamicSocialAvatar()) != null && (urlModel = dynamicSocialAvatar.avatarLarger) != null && (urlList = urlModel.getUrlList()) != null) {
                                AvatarComponentView avatarComponentView2 = this.LLIZLLLIL;
                                if (avatarComponentView2 != null && (socialAvatarAbility = avatarComponentView2.getSocialAvatarAbility()) != null) {
                                    socialAvatarAbility.LIZIZ(urlList);
                                }
                                this.LLLIIIIL = true;
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void Xp(ProfileStoryNote profileStoryNote) {
        this.LLJZIJLIL = profileStoryNote;
        StoryNoteDataCollection storyNoteDataCollectionLIZ = null;
        String uid = null;
        if (profileStoryNote != null) {
            User userIp = ip();
            if (userIp != null) {
                uid = userIp.getUid();
            }
            storyNoteDataCollectionLIZ = C1251860igK.LIZ(profileStoryNote, uid);
        }
        this.LLLIZZ = storyNoteDataCollectionLIZ;
        InterfaceC1256280inS interfaceC1256280inS = this.LLJIJIL;
        if (interfaceC1256280inS != null) {
            C1256560inu c1256560inu = C1256560inu.LIZ;
            EnumC1256590inx enumC1256590inx = EnumC1256590inx.PROFILE;
            boolean zQ1 = q1();
            boolean z = this.LLJJIII;
            c1256560inu.getClass();
            interfaceC1256280inS.setEnableStarSticker(C1256560inu.LJFF(storyNoteDataCollectionLIZ, enumC1256590inx, zQ1, z));
        }
        boolean zShouldHideThoughtBubbleAndPlus = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).shouldHideThoughtBubbleAndPlus(ip());
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        if (avatarComponentView != null) {
            C1256560inu.LIZ(C1256560inu.LIZ, avatarComponentView, this.LLJIJIL, this, q1(), null, storyNoteDataCollectionLIZ, false, ip(), EnumC1256590inx.PROFILE, Boolean.valueOf(zShouldHideThoughtBubbleAndPlus), null, new AwS484S0200000_19(this, storyNoteDataCollectionLIZ, 4), 4584);
        }
        Vp(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03fe  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r31) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem.onViewCreated(android.view.View):void");
    }

    public final void tp(EnumC1608710rxt enumC1608710rxt) {
        String uid;
        String aid;
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        String strEp = ep();
        User userIp = ip();
        String str = "";
        if (userIp == null || (uid = userIp.getUid()) == null) {
            uid = "";
        }
        Aweme aweme = hp().getAweme();
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str = aid;
        }
        EnumC1256400ine.Companion.getClass();
        C1253930ijf.LJJIII(c1253930ijf, strEp, uid, str, a0.LJJJJZ("HAS_", C1256410inf.LIZ(enumC1608710rxt).name()).toLowerCase(Locale.ROOT), EnumC1248370iah.AVATAR, null, null, 96);
    }

    public final void up(String str) {
        ProfileCommonInfo profileCommonInfoWG2;
        UserProfileInfo userProfileInfo;
        Integer profileReverseExpGroup;
        String uid = null;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null && (profileCommonInfoWG2 = iProfileBaseAbility.wG2()) != null && (userProfileInfo = profileCommonInfoWG2.getUserProfileInfo()) != null && (profileReverseExpGroup = userProfileInfo.getProfileReverseExpGroup()) != null) {
            profileReverseExpGroup.intValue();
        }
        boolean zKp = kp();
        C2344009Gk c2344009Gk = new C2344009Gk();
        User userIp = ip();
        if (userIp != null) {
            uid = userIp.getUid();
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("enter_from", ep());
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("has_social_avatar", String.valueOf(zKp ? 1 : 0));
        C20684815ws.LJIILLIIL("click_profile_icon", c2344009Gk.LIZ);
        if (Intrinsics.LJFF(str, "click_head")) {
            tp(EnumC1608710rxt.AVATAR);
        }
    }

    public void xf(boolean z) {
        InterfaceC1256280inS interfaceC1256280inS = this.LLJIJIL;
        if (interfaceC1256280inS != null) {
            interfaceC1256280inS.LJIILIIL();
        }
    }

    @Override // X.InterfaceC1609780rzc
    public final void y1(boolean z) {
        C427660Gpo avatar;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAvatarLoadComplete isSameUser = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        for (InterfaceC1251040if0 interfaceC1251040if0 : (ArrayList) this.LLJZ) {
            AvatarComponentView avatarComponentView = this.LLIZLLLIL;
            if (avatarComponentView != null) {
                avatar = avatarComponentView.getAvatar();
            } else {
                avatar = null;
            }
            interfaceC1251040if0.Rj(avatar);
        }
    }

    @Override // com.ss.android.ugc.profile.business.avatar.IAvatarAbility
    public final void z70(InterfaceC1251040if0 interfaceC1251040if0) {
        ((ArrayList) this.LLJZ).add(interfaceC1251040if0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp(boolean r24) {
        /*
            r23 = this;
            r2 = r23
            java.lang.String r3 = r2.LLLFF
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.ip()
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.getUid()
        Lf:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L18
            return
        L16:
            r0 = r1
            goto Lf
        L18:
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.ip()
            if (r0 == 0) goto La2
            java.lang.String r0 = r0.getUid()
        L22:
            r2.LLLFF = r0
            X.0Sti r5 = X.C735840Sti.LIZ
            com.ss.android.ugc.aweme.profile.model.User r6 = r2.ip()
            java.lang.String r7 = "note_bubble_show"
            boolean r0 = r2.q1()
            if (r0 == 0) goto L9f
            java.lang.String r8 = "personal_homepage"
        L34:
            java.lang.String r9 = "avatar_bubble"
            r14 = 0
            X.0inS r0 = r2.LLJIJIL
            if (r0 == 0) goto L9d
            boolean r15 = r0.LJIILL()
        L3f:
            X.0inS r0 = r2.LLJIJIL
            if (r0 == 0) goto L9a
            java.lang.String r16 = r0.getNotePromptText()
        L47:
            boolean r0 = r2.cp()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.profile.story.ProfileStoryNote r0 = r2.LLJZIJLIL
            if (r0 == 0) goto L98
            java.lang.Integer r4 = r0.avatarThoughtType
            com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtType r0 = com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtType.AVATARTYPE_AVATAR_THOUGHT
            int r3 = r0.getValue()
            if (r4 == 0) goto L98
            int r0 = r4.intValue()
            if (r0 != r3) goto L98
            r0 = 1
        L64:
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r0)
            X.0inS r0 = r2.LLJIJIL
            if (r0 == 0) goto L95
            boolean r19 = r0.LJIJ()
        L70:
            X.0inS r0 = r2.LLJIJIL
            if (r0 == 0) goto L92
            java.lang.String r20 = r0.getMentionUidsString()
        L78:
            com.ss.android.ugc.aweme.profile.story.ProfileStoryNote r2 = r2.LLJZIJLIL
            if (r2 == 0) goto L90
            java.lang.String r0 = r2.text
            java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo> r1 = r2.richText
        L80:
            r10 = 1
            r13 = 0
            r5.getClass()
            r12 = r24
            r11 = r10
            r21 = r0
            r22 = r1
            X.C735840Sti.LJIILLIIL(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        L90:
            r0 = r1
            goto L80
        L92:
            r20 = r1
            goto L78
        L95:
            r19 = 0
            goto L70
        L98:
            r0 = 0
            goto L64
        L9a:
            r16 = r1
            goto L47
        L9d:
            r15 = 0
            goto L3f
        L9f:
            java.lang.String r8 = "others_homepage"
            goto L34
        La2:
            r0 = r1
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem.zp(boolean):void");
    }

    public static void Tp(View view, float f) {
        List listLJIIJJI = C1697810uHb.LJIIJJI("scaleX", "scaleY");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (String) it2.next(), f, 1.0f);
            objectAnimatorOfFloat.setInterpolator(new C19PZ());
            objectAnimatorOfFloat.setDuration(300L);
            arrayList.add(objectAnimatorOfFloat);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    public C1256530inr Oo(String str, Rect rect) {
        String groupId;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        C1255650imR c1255650imR = null;
        if (c19egLIZ == null) {
            return null;
        }
        Aweme awemeLJFF = C740740T3w.LJFF(c19egLIZ);
        if (awemeLJFF == null || (groupId = awemeLJFF.getGroupId()) == null) {
            groupId = "";
        }
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        if (avatarComponentView == null) {
            return null;
        }
        C724240Sb0.LJI(this);
        C1255030ilR c1255030ilRDp = dp();
        if (c1255030ilRDp != null) {
            c1255650imR = c1255030ilRDp.LL;
        }
        return new C1256530inr(c19egLIZ, avatarComponentView, c1255650imR, ip(), groupId, rect, str, 256);
    }

    public final void aq(C20584815gk c20584815gk, boolean z) {
        C1256320inW c1256320inWLIZ;
        EnumC1257160ios enumC1257160ios;
        int i;
        int iLIZIZ;
        int iZo;
        Boolean boolValueOf;
        if (c20584815gk != null) {
            boolean zBp = Bp();
            EnumC1257160ios bubbleStyle = c20584815gk.getBubbleStyle();
            if (zBp) {
                enumC1257160ios = EnumC1257160ios.MINI_FOR_PROFILE;
                c1256320inWLIZ = enumC1257160ios.getTuxFontConfig();
            } else {
                c1256320inWLIZ = C1256300inU.LIZ();
                enumC1257160ios = EnumC1257160ios.MINI;
            }
            c20584815gk.setBubbleStyle(enumC1257160ios);
            if (bubbleStyle != c20584815gk.getBubbleStyle()) {
                c20584815gk.setTuxFontConfig(c1256320inWLIZ);
            }
            boolean z2 = true;
            if (C0BWT.LIZ()) {
                if (C268330AfP.LIZLLL()) {
                    i = 96;
                } else if (C268330AfP.LJIIL()) {
                    i = 99;
                } else if (sp()) {
                    i = 100;
                } else if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
                    i = 128;
                } else {
                    i = 112;
                }
                int iZo2 = (i - Zo()) / 2;
                boolean zAp = Ap();
                if (zAp) {
                    if (mp(ip()) && z) {
                        iZo = Zo();
                        if (!sp() && C268330AfP.LJIIL()) {
                            iZo += 8;
                        }
                    } else {
                        iZo = (C268330AfP.LJIIL() || sp()) ? 62 : 74;
                    }
                    C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iZo2 + iZo))), c20584815gk);
                    C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), this.LLIZLLLIL);
                } else {
                    C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), c20584815gk);
                    boolean z3 = this.LLJILJIL;
                    if (C268330AfP.LIZLLL()) {
                        iLIZIZ = ap().LIZIZ(mp(ip()), z3);
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(24 - iZo2)));
                    }
                    C0H9H.LJI(iLIZIZ, this.LLIZLLLIL);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateStoryNoteLayout2, avatarMarginTop=");
                    sbLIZ.append(iLIZIZ);
                    C1720106oR.LJI("ProfileAvatarAssem", C2188811AlT.LIZIZ(sbLIZ));
                    if (C268330AfP.LIZLLL()) {
                        Up();
                    }
                    iZo = 0;
                }
                IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) this.LLJJIJIIJIL.getValue();
                if (iProfileBaseAbility != null) {
                    iProfileBaseAbility.zl2(EnumC588120N4w.AVATAR_WIDGET.getScene(), true, zAp);
                }
                C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), c20584815gk);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateStoryNoteLayout2， avatarMarginBottom=");
                sbLIZ2.append(iZo2);
                sbLIZ2.append("，thoughtsMarginBottom=");
                sbLIZ2.append(iZo);
                sbLIZ2.append(", needAdjustPadding=");
                sbLIZ2.append(zAp);
                sbLIZ2.append(", thought is empty = ");
                CharSequence text = c20584815gk.getText();
                if (text != null) {
                    if (text.length() != 0) {
                        z2 = false;
                    }
                    boolValueOf = Boolean.valueOf(z2);
                } else {
                    boolValueOf = null;
                }
                sbLIZ2.append(boolValueOf);
                sbLIZ2.append(" || ");
                sbLIZ2.append(z);
                sbLIZ2.append('}');
                C1720106oR.LJI("ProfileAvatarAssem", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            if (!op() && !C268330AfP.LJIIJ()) {
                ((C19ME) c20584815gk.getLayoutParams()).endToEnd = R.id.bj2;
                C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), c20584815gk);
            } else {
                ((C19ME) c20584815gk.getLayoutParams()).endToEnd = 0;
                ((C19ME) c20584815gk.getLayoutParams()).startToStart = 0;
                C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), c20584815gk);
            }
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        Jp(Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp), Integer.valueOf(configuration.orientation));
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = c19252910Tv.LIZLLL().LJI();
        AvatarComponentView avatarComponentView = this.LLIZLLLIL;
        C20584815gk c20584815gk = null;
        if (avatarComponentView != null) {
            tuxIconView = (TuxIconView) avatarComponentView.findViewById(R.id.s0l);
        } else {
            tuxIconView = null;
        }
        AvatarComponentView avatarComponentView2 = this.LLIZLLLIL;
        if (avatarComponentView2 != null) {
            tuxTextView = (TuxTextView) avatarComponentView2.findViewById(R.id.s0m);
        } else {
            tuxTextView = null;
        }
        interfaceC1249220ic4LJI.LLLILZJ(tuxIconView, tuxTextView, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp), Integer.valueOf(configuration.orientation));
        InterfaceC1249220ic4 interfaceC1249220ic4LJI2 = c19252910Tv.LIZLLL().LJI();
        InterfaceC1256280inS interfaceC1256280inS = this.LLJIJIL;
        if (interfaceC1256280inS instanceof C20584815gk) {
            c20584815gk = (C20584815gk) interfaceC1256280inS;
        }
        interfaceC1249220ic4LJI2.LJJ(c20584815gk, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp), Integer.valueOf(configuration.orientation));
        Jo(this.LLJILJIL);
    }

    public final void Jp(Integer num, Integer num2, Integer num3) {
        int i;
        int i2;
        if (!C268330AfP.LJIIL() && !C268330AfP.LIZLLL()) {
            if (sp()) {
                i = 84;
            } else {
                i = 96;
            }
            if (sp()) {
                i2 = 116;
            } else {
                i2 = 128;
            }
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            int iLLIIIZ = c19252910Tv.LIZLLL().LJI().LLIIIZ(i, num, num2, num3);
            AvatarComponentView avatarComponentView = this.LLIZLLLIL;
            if (avatarComponentView != null) {
                avatarComponentView.LJIILJJIL(Integer.valueOf(iLLIIIZ), Integer.valueOf(c19252910Tv.LIZLLL().LJI().LIZIZ(i2, num, num2, num3)));
            }
        }
    }
}
