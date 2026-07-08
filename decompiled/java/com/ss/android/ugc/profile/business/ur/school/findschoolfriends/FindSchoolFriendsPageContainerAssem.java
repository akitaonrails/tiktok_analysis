package com.ss.android.ugc.profile.business.ur.school.findschoolfriends;

import X.AnonymousClass0206;
import X.AnonymousClass0822;
import X.AnonymousClass0951;
import X.C019F;
import X.C01GW;
import X.C03IT;
import X.C09IC;
import X.C09R3;
import X.C0C64;
import X.C0DHZ;
import X.C0DNC;
import X.C0DND;
import X.C0DNE;
import X.C0DNF;
import X.C0DNG;
import X.C0DNH;
import X.C0DNI;
import X.C0DNJ;
import X.C0DNN;
import X.C0DNO;
import X.C0DNP;
import X.C0DNQ;
import X.C0DOO;
import X.C0QSJ;
import X.C0S1B;
import X.C1007260cJo;
import X.C1007360cJy;
import X.C1007370cJz;
import X.C1245620iWG;
import X.C1245630iWH;
import X.C1245690iWN;
import X.C1245760iWU;
import X.C1245770iWV;
import X.C1245860iWe;
import X.C1245980iWq;
import X.C1246150iX7;
import X.C1261170ivL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1386470mBR;
import X.C1391890mKB;
import X.C1391960mKI;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C14EU;
import X.C14LC;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1617806Vc;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C16GX;
import X.C1846060y8i;
import X.C1910890zpH;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C1BNE;
import X.C21543519Sv;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C289690BXb;
import X.C291240BbG;
import X.C337950DMr;
import X.C338790DPx;
import X.C418440Gaw;
import X.C427760Gpy;
import X.C439850HMp;
import X.C452501pT;
import X.C481090Itn;
import X.C5182020e;
import X.C673150Qan;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1007380cK0;
import X.EnumC1338240kve;
import X.EnumC19356710o9;
import X.EnumC337870DMj;
import X.EnumC337930DMp;
import X.EnumC338610DPf;
import X.EnumC346100DhY;
import X.EnumC428930Grr;
import X.EnumC429060Gs4;
import X.EnumC481060Itk;
import X.EnumC913760Zt0;
import X.InterfaceC1146704e9;
import X.InterfaceC1245990iWr;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import X.ViewOnAttachStateChangeListenerC346330Dhv;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.friends.model.SchoolPopupConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem;
import com.ss.android.ugc.profile.platform.exp.CampusFypAnchor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS103S1000000_19;
import kotlin.jvm.internal.AwS153S1100000_4;
import kotlin.jvm.internal.AwS187S1100000_4;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public class FindSchoolFriendsPageContainerAssem extends CampusPageAssem implements ContainerAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C1559260qg8 LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public C16GX LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C1846060y8i LLJL;
    public C481090Itn LLJLIL;
    public C1245630iWH LLJLILLLLZIIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJLL;
    public TuxNavBar LLJLLIL;
    public C21543519Sv LLJLLL;
    public C197039127h LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public boolean LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final float LLLI;
    public final float LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final float LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public long LLLJL;
    public long LLLL;
    public int LLLLII;
    public final C2252321DDq LLLLIIIILLL;
    public final C2252321DDq LLLLIIL;
    public final C2252321DDq LLLLIILL;
    public Integer LLLLIILLL;
    public Integer LLLLIL;
    public float LLLLILI;
    public float LLLLJ;
    public boolean LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public final C01GW LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public Boolean LLLLLJLJLL;
    public long LLLLLL;
    public long LLLLLLIL;
    public final AwS633S0100000_19 LLLLLLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FindSchoolFriendsPageContainerAssem.class, "campusVM", "getCampusVM()Lcom/ss/android/ugc/profile/business/ur/school/modifyschool/CampusFlowViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FindSchoolFriendsPageContainerAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/profile/business/ur/school/findschoolfriends/FindSchoolFriendsPageViewModel;", 0);
        c09r3.getClass();
        LLLLLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{FindSchoolFriendsScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FindSchoolFriendsScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FindSchoolFriendsScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1615211880) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public FindSchoolFriendsPageContainerAssem() {
        super(EnumC337870DMj.FIND_SCHOOL_FRIENDS);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CampusFlowViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ, 191), AFwS232S0000000_4.get$arr$(165), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FindSchoolFriendsPageViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new C5182020e((C13IQ) c19719912DlLIZ2, 192), AFwS252S0000000_16.get$arr$(394), null, true);
        this.LLJJJIL = new C1559260qg8(new C723580SZw(this, C337950DMr.class, null), checkSupervisorPrepared());
        this.LLJJJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(603));
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(602));
        this.LLLFF = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(251));
        this.LLLFFI = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(261));
        this.LLLFZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(257));
        Float fValueOf = Float.valueOf(28.0f);
        Float fValueOf2 = Float.valueOf(24.0f);
        boolean z = C14LC.LJIIIZ;
        this.LLLI = (z ? fValueOf2 : fValueOf).floatValue();
        this.LLLII = (z ? Float.valueOf(20.0f) : fValueOf2).floatValue();
        this.LLLIIII = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(258));
        this.LLLIIIIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(256));
        this.LLLIIIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(253));
        this.LLLIIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(255));
        this.LLLIILIL = C418440Gaw.LIZIZ(17);
        this.LLLIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(259));
        this.LLLILZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(260));
        C1261170ivL.LIZ.getClass();
        this.LLLILZJ = C1261170ivL.LIZ();
        this.LLLJ = true;
        this.LLLJL = -1L;
        this.LLLL = -1L;
        this.LLLLIIIILLL = C1BNE.LIZ(new ContainerStatus() { // from class: X.0iWM
        });
        this.LLLLIIL = C1BNE.LIZ(EnumC337930DMp.SUCCEED_ADD);
        this.LLLLIILL = C1BNE.LIZ(Boolean.TRUE);
        this.LLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2754));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2755));
        this.LLLLLILLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2753));
        this.LLLLLJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2756));
        this.LLLLLLJ = new AwS633S0100000_19(this, 196);
    }

    public final void Fp() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNC(10, this, 100L, null, this), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DND(10, this, 100L, null, this), 3);
    }

    public final void Gp() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNE(10, this, 100L, null, this), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNF(10, this, 100L, null, this), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNG(10, this, 100L, null, this), 3);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final AnonymousClass0951 dH0() {
        return C09IC.LIZIZ(this.LLLLIIIILLL);
    }

    public final C337950DMr ip() {
        return (C337950DMr) this.LLJJJIL.getValue();
    }

    public final CampusFlowViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLLL;
        return (CampusFlowViewModel) assemVMLazy.getValue();
    }

    public final int lp() {
        return ((Number) this.LLLFF.getValue()).intValue();
    }

    public final FindSchoolFriendsPageViewModel mp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLLL;
        return (FindSchoolFriendsPageViewModel) assemVMLazy.getValue();
    }

    public final int sp() {
        return ((Number) this.LLLLLILLIL.getValue()).intValue();
    }

    public final C1910890zpH tp() {
        return (C1910890zpH) this.LLJJJJJIL.getValue();
    }

    public final int up() {
        return ((Number) this.LLLLLIL.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final AnonymousClass0951 xJ1() {
        return C09IC.LIZIZ(this.LLLLIIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0471 A[LOOP:0: B:61:0x046b->B:63:0x0471, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x056a  */
    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xo() {
        /*
            Method dump skipped, instruction units count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem.xo():void");
    }

    public final int yp() {
        return ((Number) this.LLLLLJIL.getValue()).intValue();
    }

    public final List<FindSchoolFriendsTabProtocol> zp() {
        return (List) this.LLLLL.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final Integer It2() {
        return kp().getState().LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFF() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem.LLFF():void");
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final C0DHZ Ua0() {
        return kp().getState().LLILZLL;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final C1245860iWe getEnterFrom() {
        return kp().getEnterFrom();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem
    public final void onPagePause() {
        tp().LIZ("FindSchoolFriendsPage", "on page pause");
        C1910890zpH c1910890zpHTp = tp();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SwipeDebug] onPagePause: resetting debounce from ");
        sbLIZ.append(this.LLLLLLIL);
        sbLIZ.append(" to 0");
        c1910890zpHTp.LIZ("FindSchoolFriendsPage", C2188811AlT.LIZIZ(sbLIZ));
        kp().LLIZ = null;
        this.LLLLIIIILLL.setValue(C1245690iWN.LIZ);
        if (this.LLLJL > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLLJL;
            this.LLLJL = -1L;
            if (jElapsedRealtime > 0) {
                C1245860iWe enterFrom = kp().getEnterFrom();
                String paramValue = enterFrom.externalEnterFrom;
                if (paramValue == null) {
                    paramValue = enterFrom.internalEnterFrom.getParamValue();
                }
                C1386470mBR c1386470mBR = new C1386470mBR();
                c1386470mBR.LJJLIIIJ = String.valueOf(jElapsedRealtime);
                c1386470mBR.LJJIJL("school_community_page");
                c1386470mBR.LJJLIIIJL = paramValue;
                c1386470mBR.LJIILJJIL();
            }
        }
        Ap(this.LLLLII);
        this.LLLLLLIL = 0L;
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final String xZ() {
        C337950DMr c337950DMrIp = ip();
        if (c337950DMrIp != null) {
            return c337950DMrIp.LLILZLL;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zj0() {
        /*
            r5 = this;
            boolean r0 = X.C1245620iWG.LIZ()
            r4 = 0
            if (r0 == 0) goto L24
            boolean r0 = X.C289690BXb.LIZ()
            if (r0 == 0) goto L25
            X.0C64 r3 = X.C0C64.LJIILLIIL()
            java.lang.Class<com.ss.android.ugc.profile.platform.exp.CampusFypAnchor> r2 = com.ss.android.ugc.profile.platform.exp.CampusFypAnchor.class
            com.ss.android.ugc.profile.platform.exp.CampusFypAnchor r1 = X.C1245620iWG.LIZ
            java.lang.String r0 = "campus_fyp_anchor"
            java.lang.Object r0 = r3.LJJII(r2, r1, r0, r4)
            com.ss.android.ugc.profile.platform.exp.CampusFypAnchor r0 = (com.ss.android.ugc.profile.platform.exp.CampusFypAnchor) r0
            if (r0 == 0) goto L20
            r1 = r0
        L20:
            boolean r0 = r1.shouldShowAddButtonInPostTab
            if (r0 == 0) goto L25
        L24:
            return r4
        L25:
            com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel r0 = r5.kp()
            boolean r0 = r0.EQ2()
            if (r0 == 0) goto L24
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem.zj0():boolean");
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final boolean Zv1() {
        return this.LLLIZZ;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    public final void Ap(int i) {
        String value;
        EnumC338610DPf enumC338610DPfLJFF;
        if (this.LLLL > 0 && i >= 0 && i < zp().size()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLLL;
            this.LLLL = -1L;
            if (jElapsedRealtime <= 0) {
                return;
            }
            C1245860iWe enterFrom = kp().getEnterFrom();
            String paramValue = enterFrom.externalEnterFrom;
            if (paramValue == null) {
                paramValue = enterFrom.internalEnterFrom.getParamValue();
            }
            FindSchoolFriendsTabProtocol findSchoolFriendsTabProtocol = (FindSchoolFriendsTabProtocol) C13LP.LJJJLZIJ(i, zp());
            if (findSchoolFriendsTabProtocol == null || (enumC338610DPfLJFF = findSchoolFriendsTabProtocol.LJFF()) == null || (value = enumC338610DPfLJFF.getValue()) == null) {
                value = "";
            }
            final AnonymousClass0822 anonymousClass0822 = new AnonymousClass0822(paramValue, value, jElapsedRealtime);
            C1245980iWq.LIZ(new InterfaceC1245990iWr(anonymousClass0822) { // from class: X.0821
                public final AnonymousClass0822 LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof AnonymousClass0821) && Intrinsics.LJFF(this.LIZ, ((AnonymousClass0821) obj).LIZ);
                }

                @Override // X.InterfaceC1245990iWr
                public final String getEventName() {
                    return "ttsocial_school_stay_time";
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SchoolPostStayTimeEvent(params=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1245990iWr
                public final Map<String, String> LIZ() {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    this.LIZ.getClass();
                    c2344009Gk.LJIIIIZZ("enter_from", "school_community_page");
                    c2344009Gk.LJIIIIZZ("previous_page", this.LIZ.LIZ);
                    c2344009Gk.LJIIIIZZ("tab_name", this.LIZ.LIZIZ);
                    c2344009Gk.LJIIIIZZ("duration", String.valueOf(this.LIZ.LIZJ));
                    return c2344009Gk.LIZ;
                }

                {
                    this.LIZ = anonymousClass0822;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final void Bc0(boolean z) {
        C481090Itn c481090Itn;
        EnumC481060Itk enumC481060Itk;
        C481090Itn c481090Itn2 = this.LLJLIL;
        if (c481090Itn2 != null) {
            c481090Itn2.setEnabled(z);
        }
        C481090Itn c481090Itn3 = this.LLJLIL;
        if (c481090Itn3 != null) {
            if (z) {
                enumC481060Itk = EnumC481060Itk.REFRESH;
            } else {
                enumC481060Itk = EnumC481060Itk.NONE;
            }
            c481090Itn3.setScrollMode(enumC481060Itk);
        }
        if (!z && (c481090Itn = this.LLJLIL) != null) {
            c481090Itn.setOverScrollMode(EnumC19356710o9.NONE);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.setUserInputEnabled(z);
        }
    }

    public final void Bp(int i) {
        C1910890zpH c1910890zpHTp = tp();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SwipeDebug] setupScrollCallbackForTab: position=");
        sbLIZ.append(i);
        sbLIZ.append(", memberTabIndex=");
        sbLIZ.append(up());
        sbLIZ.append(", groupTabIndex=");
        sbLIZ.append(sp());
        c1910890zpHTp.LIZ("FindSchoolFriendsPage", C2188811AlT.LIZIZ(sbLIZ));
        if (i == up()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNI(10, this, 100L, null, this), 3);
        } else if (i == sp()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNJ(10, this, 100L, null, this), 3);
        } else {
            if (i != yp()) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNH(10, this, 100L, null, this), 3);
        }
    }

    public final void Ip(int i) {
        if (i == up()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNO(10, this, 100L, null, this), 3);
            return;
        }
        if (i == sp()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNN(10, this, 100L, null, this), 3);
        } else if (i == yp()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNP(10, this, 100L, null, this), 3);
        } else {
            this.LLLLIILL.setValue(Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qp(int r7) {
        /*
            r6 = this;
            X.15oD r0 = r6.LLJLL
            r5 = 0
            if (r0 == 0) goto L4c
            X.0OyF r0 = r0.getFragmentItemOperator()
            if (r0 == 0) goto L4c
            androidx.fragment.app.Fragment r4 = r0.LIZIZ(r7)
        Lf:
            boolean r0 = r4 instanceof com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
            if (r0 == 0) goto L49
            com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment r4 = (com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment) r4
            if (r4 == 0) goto L4a
            android.view.View r3 = r4.LJJLIIIJILLIZJL()
        L1b:
            X.0zpH r2 = r6.tp()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "update scroll target "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", fragment "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "FindSchoolFriendsPage"
            r2.LIZ(r0, r1)
            X.0iWH r0 = r6.LLJLILLLLZIIL
            if (r0 == 0) goto L43
            r0.setScrollTarget(r3)
        L43:
            r1 = 0
            r0 = 3
            Jp(r6, r5, r1, r0)
            return
        L49:
            r4 = r5
        L4a:
            r3 = r5
            goto L1b
        L4c:
            r4 = r5
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem.Qp(int):void");
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final boolean W80(EnumC338610DPf enumC338610DPf) {
        FindSchoolFriendsTabProtocol findSchoolFriendsTabProtocol;
        if (enumC338610DPf == null) {
            if (zp().size() != 1) {
                return false;
            }
        } else if (zp().size() != 1 || (findSchoolFriendsTabProtocol = (FindSchoolFriendsTabProtocol) C13LP.LJJJLL(zp())) == null || enumC338610DPf != findSchoolFriendsTabProtocol.LJFF()) {
            return false;
        }
        return true;
    }

    public final void hp(Function0<Unit> function0) {
        C481090Itn c481090Itn = this.LLJLIL;
        if (c481090Itn != null && c481090Itn.LLLFF) {
            c481090Itn.setRefreshing(false);
            c481090Itn.setScrollMode(EnumC481060Itk.REFRESH);
            function0.invoke();
            C16GX c16gx = this.LLJJJJLIIL;
            if (c16gx != null) {
                c16gx.LJ(true, true, true);
            }
            this.LLLLLJLJLL = Boolean.TRUE;
            HandlerHook.viewPost(c481090Itn, new ARunnableS104S0100000_4(this, 57));
        }
    }

    @C14EU
    public final void onPublicGroupCreateFinish(C1617806Vc c1617806Vc) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        if (c1617806Vc.LIZ && Intrinsics.LJFF(c1617806Vc.LIZJ, EnumC913760Zt0.CAMPUS_GROUP.getValue()) && (viewOnAttachStateChangeListenerC20631115oD = this.LLJLL) != null) {
            viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(sp());
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        EnumC1007380cK0 enumC1007380cK0;
        super.onViewCreated(view);
        if (Intrinsics.LJFF(kp().getState().LLIZLLLIL, Boolean.TRUE)) {
            FindSchoolFriendsPageViewModel findSchoolFriendsPageViewModelMp = mp();
            C0DHZ c0dhz = kp().getState().LLILZLL;
            if (c0dhz == null || (str = c0dhz.LIZIZ) == null) {
                str = "";
            }
            C1007370cJz.LIZ.getClass();
            if (System.currentTimeMillis() - C1007370cJz.LIZ().getLong("timestamp_of_red_dot", 0L) > TimeUnit.DAYS.toMillis(1L)) {
                enumC1007380cK0 = EnumC1007380cK0.COUNT_WITH_RED_DOT;
            } else {
                enumC1007380cK0 = EnumC1007380cK0.COUNT;
            }
            C23250099c.LIZLLL(findSchoolFriendsPageViewModelMp.getAssemVMScope(), null, null, new C1007360cJy(findSchoolFriendsPageViewModelMp, enumC1007380cK0, str, null), 3);
        }
        FindSchoolFriendsPageViewModel findSchoolFriendsPageViewModelMp2 = mp();
        C23250099c.LIZLLL(findSchoolFriendsPageViewModelMp2.getAssemVMScope(), null, null, new C1007260cJo(findSchoolFriendsPageViewModelMp2, null), 3);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0iWI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1007270cJp) obj).LLILLJJLI;
            }
        }, null, new AwS633S0100000_19(this, 142), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0iWJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1007270cJp) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 143), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0iWK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1007270cJp) obj).LLILLL;
            }
        }, null, new AwS633S0100000_19(this, 144), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0DNR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C337920DMo) obj).LLILZLL;
            }
        }, null, new AwS633S0100000_19(this, 141), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0DPa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C337920DMo) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 35), 4);
        Fp();
        Gp();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0DNQ(this, null), 3);
        if (!EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        if (kp().EQ2() && C1245620iWG.LIZ()) {
            if (C289690BXb.LIZ()) {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                CampusFypAnchor campusFypAnchor = C1245620iWG.LIZ;
                CampusFypAnchor campusFypAnchor2 = (CampusFypAnchor) c0c64LJIILLIIL.LJJII(CampusFypAnchor.class, campusFypAnchor, "campus_fyp_anchor", false);
                if (campusFypAnchor2 != null) {
                    campusFypAnchor = campusFypAnchor2;
                }
                if (campusFypAnchor.shouldShowAddButtonInPostTab) {
                    View view2 = this.LLJZIJLIL;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    C197039127h c197039127h = this.LLJZ;
                    if (c197039127h != null) {
                        C786410Ut5.LLLLLLJ(c197039127h, 0);
                    }
                    View view3 = this.LLL;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                    this.LLLF = true;
                    return;
                }
            }
            Ep("feed_add_school_btn", false);
        }
    }

    public final void Ep(String str, boolean z) {
        Fragment fragmentLJI;
        Context context;
        C337950DMr c337950DMrIp;
        SchoolMutualStruct schoolMutualStruct;
        String quantityString;
        boolean z2;
        List listLL;
        List<String> urlList;
        User currentUser;
        LifecycleOwner viewLifecycleOwner;
        String str2;
        String str3;
        View view;
        View view2;
        LinearLayout.LayoutParams layoutParams;
        Fragment fragmentLJI2;
        C337950DMr c337950DMrIp2;
        SchoolMutualStruct schoolMutualStruct2;
        if (C291240BbG.LIZ()) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (fragmentLJI2 = C724240Sb0.LJI(this)) != null && (c337950DMrIp2 = ip()) != null && (schoolMutualStruct2 = c337950DMrIp2.LLIZ) != null) {
                C1245770iWV c1245770iWV = new C1245770iWV(schoolMutualStruct2.userList, schoolMutualStruct2.total, new AwS153S1100000_4(c19egLIZ, str, 3), new AwS153S1100000_4(this, str, 4), new AwS103S1000000_19(str, 3), null, null, z, 96);
                C1245760iWU c1245760iWU = C1245760iWU.LIZ;
                LifecycleOwner viewLifecycleOwner2 = fragmentLJI2.getViewLifecycleOwner();
                FragmentManager childFragmentManager = fragmentLJI2.getChildFragmentManager();
                c1245760iWU.getClass();
                C1245760iWU.LIZIZ(c19egLIZ, viewLifecycleOwner2, childFragmentManager, c1245770iWV);
                return;
            }
            return;
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (context = getContext()) != null && (c337950DMrIp = ip()) != null && (schoolMutualStruct = c337950DMrIp.LLIZ) != null) {
            String strOp = op(2131846948, AFwS228S0000000_1.get$arr$(405));
            String strOp2 = op(2131846949, AFwS228S0000000_1.get$arr$(402));
            String strOp3 = op(2131846961, AFwS228S0000000_1.get$arr$(403));
            C1391960mKI c1391960mKI = new C1391960mKI();
            String strOp4 = op(2131846958, AFwS228S0000000_1.get$arr$(404));
            SchoolPopupConfig schoolPopupConfig = schoolMutualStruct.popupConfig;
            if (schoolPopupConfig == null || (quantityString = schoolPopupConfig.socialProof) == null) {
                quantityString = "";
            }
            if (quantityString.length() <= 0) {
                List<MutualUser> list = schoolMutualStruct.userList;
                if (list != null && !list.isEmpty()) {
                    quantityString = context.getResources().getQuantityString(2131755144, schoolMutualStruct.total);
                } else {
                    Resources resources = context.getResources();
                    int i = schoolMutualStruct.total;
                    quantityString = resources.getQuantityString(2131755145, i, Integer.valueOf(i));
                }
            }
            View viewSd = C786410Ut5.Sd(R.layout.ec1, C786410Ut5.ne(context), null);
            C786410Ut5.W5(viewSd, new FrameLayout.LayoutParams(-1, -2));
            ImageView imageView = (ImageView) viewSd.findViewById(R.id.dai);
            ImageView imageView2 = (ImageView) viewSd.findViewById(R.id.daj);
            AvatarComponentView avatarComponentView = (AvatarComponentView) viewSd.findViewById(R.id.dag);
            ImageView imageView3 = (ImageView) viewSd.findViewById(R.id.dan);
            TuxTextView tuxTextView = (TuxTextView) viewSd.findViewById(R.id.dam);
            tuxTextView.setTuxFont(123);
            tuxTextView.setText(strOp4);
            TuxTextView tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.dal);
            tuxTextView2.setTuxFont(51);
            tuxTextView2.setText(quantityString);
            C427760Gpy c427760Gpy = (C427760Gpy) viewSd.findViewById(R.id.dah);
            c427760Gpy.setStacking(EnumC429060Gs4.LAST_ON_TOP);
            c427760Gpy.setTotalCount(schoolMutualStruct.total);
            c427760Gpy.setSize(EnumC428930Grr.X_SMALL);
            c427760Gpy.setMaxImageNum(2);
            List<MutualUser> list2 = schoolMutualStruct.userList;
            if (list2 != null && !list2.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                C786410Ut5.LJLLLLLL(8, c427760Gpy);
            } else {
                C786410Ut5.LJLLLLLL(0, c427760Gpy);
                List<MutualUser> list3 = schoolMutualStruct.userList;
                if (list3 != null && (listLL = C13LP.LL(list3, 2)) != null) {
                    int i2 = 0;
                    for (Object obj : listLL) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            UrlModel avatarMedium = ((MutualUser) obj).getAvatarMedium();
                            if (avatarMedium != null) {
                                urlList = avatarMedium.getUrlList();
                            } else {
                                urlList = null;
                            }
                            C427760Gpy.LIZ(c427760Gpy, i2, new C03IT(urlList), String.valueOf(i2), null, null, false, null, 2040);
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService != null) {
                currentUser = iUserService.getCurrentUser();
            } else {
                currentUser = null;
            }
            avatarComponentView.getConfig().LIZ(AFwS264S0000000_24.get$arr$(551));
            avatarComponentView.LJFF(avatarComponentView.getConfig());
            Fragment fragmentLJI3 = C724240Sb0.LJI(this);
            if (fragmentLJI3 != null) {
                viewLifecycleOwner = fragmentLJI3.getViewLifecycleOwner();
            } else {
                viewLifecycleOwner = null;
            }
            if (currentUser != null && currentUser.getUid() != null && viewLifecycleOwner != null) {
                C0S1B.LIZ(avatarComponentView, currentUser.getUid(), currentUser, viewLifecycleOwner, false, null, 56);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (C960203pA.LIZIZ(context)) {
                str2 = "_dark";
            } else {
                str2 = "_light";
            }
            int i4 = displayMetrics.densityDpi;
            if (i4 < 160) {
                str3 = "@1x.png";
            } else if (i4 < 640) {
                str3 = "@2x.png";
            } else {
                str3 = "@3x.png";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1246150iX7.LIZ.getClass();
            sbLIZ.append(C1246150iX7.LIZ().popupIllustrationBgUrl);
            sbLIZ.append(str2);
            sbLIZ.append(str3);
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_XY;
            c1331670kl3LJIIIZ.LJJI(imageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C1246150iX7.LIZ().popupIllustrationBottomUrl);
            sbLIZ2.append(str3);
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            EnumC1338240kve enumC1338240kve = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJIIIZ2.LJJ = enumC1338240kve;
            c1331670kl3LJIIIZ2.LJJI(imageView2);
            C786410Ut5.h3(c1331670kl3LJIIIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(C1246150iX7.LIZ().popupIllustrationTopUrl);
            sbLIZ3.append(str3);
            C1331670kl3 c1331670kl3LJIIIZ3 = C1331660kl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
            c1331670kl3LJIIIZ3.LJJ = enumC1338240kve;
            c1331670kl3LJIIIZ3.LJJI(imageView3);
            C786410Ut5.h3(c1331670kl3LJIIIZ3);
            if (viewSd.isAttachedToWindow()) {
                Object parent = viewSd.getParent();
                if ((parent instanceof View) && (view = (View) parent) != null) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.topMargin = 0;
                        C786410Ut5.W5(view, layoutParams);
                    }
                    Object parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup) && (view2 = (View) parent2) != null) {
                        View viewFindViewById = view2.findViewById(R.id.bsc);
                        if (viewFindViewById != null) {
                            C786410Ut5.LJLLLLLL(8, viewFindViewById);
                        }
                        View viewFindViewById2 = view2.findViewById(R.id.bs9);
                        if (viewFindViewById2 != null) {
                            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                        }
                    }
                }
            } else {
                viewSd.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC346330Dhv(viewSd, 2));
            }
            c1391960mKI.LJFF = viewSd;
            c1391960mKI.LJI = -1;
            c1391960mKI.LJIIIZ = C13LQ.LJJLL(new C1391890mKB[]{new C1391890mKB(strOp, Integer.valueOf(R.raw.icon_person_phd), null, 4), new C1391890mKB(strOp2, Integer.valueOf(R.raw.icon_two_same_person), null, 4), new C1391890mKB(strOp3, Integer.valueOf(R.raw.icon_medal_tick), null, 4)});
            c1391960mKI.LIZIZ(context.getString(2131828954), new C338790DPx(c19egLIZ2, str, z));
            if (!z) {
                c1391960mKI.LIZJ(context.getString(2131828955), new AwS187S1100000_4(this, str, 0));
            }
            c1391960mKI.LJIILJJIL = true;
            c1391960mKI.LIZ = z;
            C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
            Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(600)));
            TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
            tuxPanel.LLIZ = numValueOf;
            if (!z) {
                tuxPanel.LLJI = false;
                tuxPanel.LLJIJIL = false;
                tuxPanel.LLJILJIL = false;
            } else {
                tuxPanel.LLJI = true;
                tuxPanel.LLJIJIL = true;
                tuxPanel.LLJILJIL = true;
            }
            Lifecycle lifecycle = tuxPanel.getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new FindSchoolFriendsPageContainerAssem$showFypAnchorAddCollegePopup$2());
            }
            tuxPanel.show(fragmentLJI.getChildFragmentManager(), "FypAnchorAddCollegePopup");
            C0DOO.LIZ.getClass();
            C0DOO.LIZIZ("school_community_page", str, null);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    public final void X11(EnumC346100DhY enumC346100DhY, String str) {
        Pair<Integer, Integer> pairYo2;
        boolean zVm0;
        SchoolUsersAbility schoolUsersAbility = (SchoolUsersAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SchoolUsersAbility.class, null);
        if (schoolUsersAbility != null) {
            pairYo2 = schoolUsersAbility.Yo2();
        } else {
            pairYo2 = null;
        }
        SchoolUsersAbility schoolUsersAbility2 = (SchoolUsersAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SchoolUsersAbility.class, null);
        if (schoolUsersAbility2 != null) {
            zVm0 = schoolUsersAbility2.vm0();
        } else {
            zVm0 = false;
        }
        BS1(enumC346100DhY, pairYo2, zVm0, str);
    }

    public final String op(int i, Function1 function1) {
        SchoolMutualStruct schoolMutualStruct;
        SchoolPopupConfig schoolPopupConfig;
        String str;
        C337950DMr c337950DMrIp = ip();
        if (c337950DMrIp != null && (schoolMutualStruct = c337950DMrIp.LLIZ) != null && (schoolPopupConfig = schoolMutualStruct.popupConfig) != null && (str = (String) function1.invoke(schoolPopupConfig)) != null && str.length() != 0) {
            return str;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return "";
        }
        return c19egLIZ.getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tp(int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem.Tp(int, int, boolean):void");
    }

    public static void Jp(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, Boolean bool, boolean z, int i) {
        boolean zBooleanValue;
        EnumC19356710o9 enumC19356710o9;
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            z = ((Boolean) findSchoolFriendsPageContainerAssem.LLLLIILL.getValue()).booleanValue();
        }
        C481090Itn c481090Itn = findSchoolFriendsPageContainerAssem.LLJLIL;
        if (c481090Itn != null && !c481090Itn.LLLFF) {
            C1245630iWH c1245630iWH = findSchoolFriendsPageContainerAssem.LLJLILLLLZIIL;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else if (c1245630iWH != null && c1245630iWH.getScrollTarget() != null && !c1245630iWH.canScrollVertically(-1)) {
                zBooleanValue = true;
            } else {
                zBooleanValue = false;
            }
            if (!z && zBooleanValue) {
                enumC19356710o9 = EnumC19356710o9.ONLY_TOP;
            } else {
                enumC19356710o9 = EnumC19356710o9.NONE;
            }
            if (c481090Itn.getOverScrollMode() != enumC19356710o9) {
                c481090Itn.setOverScrollMode(enumC19356710o9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BS1(X.EnumC346100DhY r11, kotlin.Pair<java.lang.Integer, java.lang.Integer> r12, boolean r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem.BS1(X.0DhY, kotlin.Pair, boolean, java.lang.String):void");
    }
}
