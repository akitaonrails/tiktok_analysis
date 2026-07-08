package com.ss.android.ugc.profile.platform.business.tabs.container;

import X.AbstractC712240Rwk;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C00AS;
import X.C019F;
import X.C01GW;
import X.C0B9G;
import X.C0BI9;
import X.C0P0T;
import X.C0PEM;
import X.C0QSJ;
import X.C0XQ7;
import X.C1075590e61;
import X.C10EU;
import X.C117P;
import X.C1245340iVo;
import X.C1248210iaR;
import X.C1248840ibS;
import X.C1249040ibm;
import X.C1249090ibr;
import X.C1249560icc;
import X.C1250680ieQ;
import X.C1252230igv;
import X.C1252550ihR;
import X.C1252570ihT;
import X.C1252710ihh;
import X.C1253010iiB;
import X.C1253220iiW;
import X.C1253780ijQ;
import X.C1253900ijc;
import X.C1253930ijf;
import X.C1253940ijg;
import X.C1256020in2;
import X.C1256070in7;
import X.C1257500ipQ;
import X.C1257610ipb;
import X.C1257900iq4;
import X.C1258000iqE;
import X.C1258050iqJ;
import X.C1258150iqT;
import X.C1259870itF;
import X.C1260280itu;
import X.C1260300itw;
import X.C1266190j3R;
import X.C12ES;
import X.C1336205Ku;
import X.C1359600lU6;
import X.C1366690lfX;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C14EU;
import X.C14KQ;
import X.C14LC;
import X.C1533610q0l;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C15O7;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1720106oR;
import X.C19252910Tv;
import X.C19393710u7;
import X.C19719912Dl;
import X.C19EG;
import X.C19U0;
import X.C20632315oP;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21546519Tz;
import X.C21594419fC;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2537109wv;
import X.C259800zU;
import X.C267700AeO;
import X.C267740AeS;
import X.C267800AeY;
import X.C268250AfH;
import X.C283630B9t;
import X.C296260BjM;
import X.C299970BpL;
import X.C300140Bpc;
import X.C309690CBz;
import X.C339190DRl;
import X.C452070Ho5;
import X.C452501pT;
import X.C487280J9a;
import X.C673150Qan;
import X.C687700QyG;
import X.C723580SZw;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1153620g7s;
import X.EnumC1248370iah;
import X.EnumC1253850ijX;
import X.InterfaceC1146704e9;
import X.InterfaceC1249220ic4;
import X.InterfaceC1251830igH;
import X.InterfaceC1252070igf;
import X.InterfaceC1257980iqC;
import X.InterfaceC1258060iqK;
import X.InterfaceC1258470iqz;
import X.InterfaceC1260330itz;
import X.InterfaceC1603190roz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import X.InterfaceC687730QyJ;
import X.InterfaceC737090Svj;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACallableS5S1101100_19;
import Y.ARunnableS119S0100000_19;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.appdiff.IProfileAppDiffProtocol;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.service.IMPerformanceService;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;
import com.ss.android.ugc.aweme.profile.model.BATab;
import com.ss.android.ugc.aweme.profile.model.RepostTab;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener;
import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ProfileTabBarScope;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.upvote.ability.IRepostProfileListAbility;
import com.ss.android.ugc.profile.business.effect.EffectProfileListFragment;
import com.ss.android.ugc.profile.business.feed.CollectProfileListFragment;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS46S0001000_35;
import kotlin.jvm.internal.AwS47S0010000_35;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AwemePagerAssem extends UIContentAssem implements InterfaceC1251830igH, InterfaceC1258060iqK, InterfaceC487330J9f, C0QSJ, InterfaceC1146704e9 {
    public static final C1258050iqJ LLLIZZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJ;
    public static final int LLLJIL;
    public C21594419fC LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final String LLJIJIL;
    public String LLJILJIL;
    public final C1559260qg8 LLJILJILJ;
    public List<ProfileListFragment> LLJILLL;
    public List<Integer> LLJJ;
    public C1258150iqT<ProfileListFragment> LLJJI;
    public C1257610ipb<ProfileListFragment> LLJJIII;
    public C1260280itu LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final User LLJL;
    public final String LLJLIL;
    public final String LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public C1257500ipQ LLJLLL;
    public C117P LLJZ;
    public C20632315oP LLJZIJLIL;
    public LinearLayout LLL;
    public C1253900ijc LLLF;
    public C0P0T LLLFF;
    public ProfileViewModel LLLFFI;
    public int LLLFZ;
    public boolean LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public ProfileListFragment LLLIIIIL;
    public ProfileListFragment LLLIIIL;
    public ProfileListFragment LLLIIL;
    public ProfileListFragment LLLIILIL;
    public final C01GW LLLIL;
    public InterfaceC1258470iqz LLLILZ;
    public long LLLILZJ;
    public long LLLILZLLLI;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0iqJ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AwemePagerAssem.class, "pagerVM", "getPagerVM()Lcom/ss/android/ugc/profile/platform/framework/aweme/profile/widget/awemepager/AwemePagerVM;", 0);
        C13LE.LIZ.getClass();
        LLLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AwemePagerAssem.class, "profilePlatformVM", "getProfilePlatformVM()Lcom/ss/android/ugc/profile/platform/base/viewmodel/ProfilePlatformViewModel;", 0)};
        LLLIZZ = new Object() { // from class: X.0iqJ
        };
        LLLJIL = 8;
    }

    public void Dr() {
    }

    public final void Jq() {
        if (LJIL() == qq() || qq() == -1) {
            return;
        }
        Vr(this, qq(), true, false, 4, null);
    }

    @Override // X.InterfaceC1251830igH, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public void Nq() {
    }

    public abstract boolean Pq(int i);

    public abstract void So(int i);

    public void Xs() {
        if (this.LLLILZJ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLILZJ;
            if (jCurrentTimeMillis > 0) {
                C15O7.LIZIZ(new ACallableS5S1101100_19(this, jr() ? "personal_homepage" : "others_homepage", jCurrentTimeMillis, this.LLJJIJIIJIL, 0), C20684815ws.LJFF(), null);
            }
            this.LLLILZJ = -1L;
        }
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ProfileTabBarScope.class});
    }

    @Override // X.C0QSJ
    public Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProfileTabBarScope.class);
        return arrayList;
    }

    public abstract String getPreviousPage();

    @Override // X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProfileTabBarScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public boolean jr() {
        return false;
    }

    public boolean kr() {
        return true;
    }

    @Override // X.C0QSJ
    public void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public abstract void zr();

    public AwemePagerAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AwemePagerVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2557);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(497);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 2554), aFwS257S0000000_19, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJ = assemVMLazy;
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ProfilePlatformViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ2, 2555), AFwS257S0000000_19.get$arr$(498), null, true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(R.id.u3m);
        sbLIZ.append(':');
        this.LLJIJIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJILJILJ = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "profile_tab"), checkSupervisorPrepared());
        this.LLJJJJ = true;
        this.LLLFZ = EnumC1153620g7s.UNINITIALIZED.getValue();
        this.LLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2556));
        this.LLLIIII = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(569));
        this.LLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(570));
        this.LLLILZ = new InterfaceC1258470iqz() { // from class: X.0ipl
            @Override // X.InterfaceC1258470iqz
            public final void LIZ(int i) {
                C1260280itu c1260280itu = this.LIZ.LLJJIJI;
                if (c1260280itu != null) {
                    c1260280itu.setCanScrollUp(true);
                }
                if (i == 0) {
                    ProfileViewModel profileViewModelLq = this.LIZ.lq();
                    profileViewModelLq.getClass();
                    profileViewModelLq.setState(new AwS47S0010000_35(false, 32));
                    ProfileViewModel profileViewModelLq2 = this.LIZ.lq();
                    profileViewModelLq2.getClass();
                    profileViewModelLq2.setState(new AwS47S0010000_35(false, 31));
                }
            }

            @Override // X.InterfaceC1258470iqz
            public final void LIZIZ(int i) {
                if (i == 0) {
                    ProfileViewModel profileViewModelLq = this.LIZ.lq();
                    profileViewModelLq.getClass();
                    profileViewModelLq.setState(new AwS47S0010000_35(30));
                }
            }

            @Override // X.InterfaceC1258470iqz
            public final void LIZJ(int i, boolean z) {
                C1260280itu c1260280itu = this.LIZ.LLJJIJI;
                if (c1260280itu != null) {
                    c1260280itu.setCanScrollUp(true);
                }
                if (i == 0) {
                    ProfileViewModel profileViewModelLq = this.LIZ.lq();
                    profileViewModelLq.getClass();
                    profileViewModelLq.setState(new AwS47S0010000_35(true, 32));
                    ProfileViewModel profileViewModelLq2 = this.LIZ.lq();
                    profileViewModelLq2.getClass();
                    profileViewModelLq2.setState(new AwS47S0010000_35(true, 31));
                }
            }
        };
        this.LLLILZJ = -1L;
    }

    private final void Uq() {
        int iLJ;
        int iLJ2;
        int iIntValue;
        boolean z = C14LC.LJIIIZ;
        Rect rect = C309690CBz.LIZ.LJ.LIZJ;
        Integer numValueOf = rect != null ? Integer.valueOf(rect.top) : null;
        if (!jr()) {
            iLJ = numValueOf != null ? (C14KQ.LJ(C724240Sb0.LIZ(this)) - numValueOf.intValue()) - C14LC.LIZIZ() : 0;
            iLJ2 = C14KQ.LJ(C724240Sb0.LIZ(this));
        } else if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
            this.LLLFZ = iIntValue;
        } else {
            iLJ2 = C14KQ.LJ(C724240Sb0.LIZ(this));
            iLJ = C14LC.LIZIZ();
        }
        iIntValue = iLJ2 - iLJ;
        this.LLLFZ = iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05f4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Zq() {
        /*
            Method dump skipped, instruction units count: 2207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem.Zq():void");
    }

    private final C1249090ibr<ProfileComponents> iq() {
        return (C1249090ibr) this.LLJILJILJ.getValue();
    }

    private final boolean lr() {
        return ((Boolean) this.LLLIIII.getValue()).booleanValue();
    }

    private final void mr() {
        Intent intent;
        Intent intent2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        String strHo = null;
        c2344009Gk.LJIIIIZZ("enter_from", (c19egLIZ == null || (intent2 = c19egLIZ.getIntent()) == null) ? null : Ho(intent2, "enter_from"));
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null && (intent = c19egLIZ2.getIntent()) != null) {
            strHo = Ho(intent, "effect_notification_type");
        }
        c2344009Gk.LJIIIIZZ("effect_notification_type", strHo);
        C20684815ws.LJIILLIIL("enter_profile_effect_tab", c2344009Gk.LIZ);
    }

    public final void Bm() {
        List<Integer> list = this.LLJJ;
        if ((list == null || list.isEmpty()) && C1253010iiB.LIZJ.LJIL()) {
            return;
        }
        Vo(getUser());
        Zq();
    }

    public final C21594419fC Fq() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.viewpager) : null;
            this.LLIZLLLIL = (C21594419fC) viewFindViewById;
        }
        return (C21594419fC) viewFindViewById;
    }

    @Override // X.InterfaceC1251830igH
    public void HH() {
        ComponentCallbacks componentCallbacks;
        List<ProfileListFragment> list = this.LLJILLL;
        if (list == null || (componentCallbacks = (ProfileListFragment) C13LP.LJJJLZIJ(this.LLJJIJIIJIL, list)) == null) {
            return;
        }
        if (componentCallbacks instanceof InterfaceC1257980iqC) {
            ((InterfaceC1257980iqC) componentCallbacks).LJFF();
        } else if (componentCallbacks instanceof InterfaceC737090Svj) {
            ((InterfaceC737090Svj) componentCallbacks).W0();
        } else if (componentCallbacks instanceof ProfileBaseAwemeListFragment) {
            ((ProfileBaseAwemeListFragment) componentCallbacks).XS("fresh_aweme_pager_assem_refresh");
        }
    }

    public final IProfileMusicTabService Jp() {
        return (IProfileMusicTabService) this.LLLIL.getValue();
    }

    public final int LJIL() {
        Integer numValueOf;
        C117P c117p = this.LLJZ;
        if (c117p != null) {
            numValueOf = Integer.valueOf(c117p.getCurrentItem());
        } else {
            C20632315oP c20632315oP = this.LLJZIJLIL;
            if (c20632315oP == null) {
                return -1;
            }
            numValueOf = Integer.valueOf(c20632315oP.getCurrentItem());
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return -1;
    }

    public final List<ProfileListFragment> Wp() {
        C1258150iqT<ProfileListFragment> c1258150iqT = this.LLJJI;
        if (c1258150iqT != null) {
            return c1258150iqT.LLIZ;
        }
        C1257610ipb<ProfileListFragment> c1257610ipb = this.LLJJIII;
        if (c1257610ipb != null) {
            return c1257610ipb.LLJI;
        }
        return null;
    }

    public final AwemePagerVM Xp() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJ;
        return (AwemePagerVM) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1251830igH
    public void cc() {
        if (((Boolean) C268250AfH.LIZ.getValue()).booleanValue()) {
            C1257500ipQ c1257500ipQ = this.LLJLLL;
            if (c1257500ipQ == null || c1257500ipQ.getTabCount() <= 1) {
                ns(false);
            } else {
                ns(true);
            }
        }
    }

    public final void cp() {
        C1260280itu c1260280itu = this.LLJJIJI;
        if (c1260280itu != null) {
            c1260280itu.setMinY(0);
        }
    }

    public final int getItemCount() {
        Integer numValueOf;
        C1258150iqT<ProfileListFragment> c1258150iqT = this.LLJJI;
        if (c1258150iqT != null) {
            numValueOf = Integer.valueOf(c1258150iqT.getCount());
        } else {
            C1257610ipb<ProfileListFragment> c1257610ipb = this.LLJJIII;
            if (c1257610ipb == null) {
                return 0;
            }
            numValueOf = Integer.valueOf(c1257610ipb.getItemCount());
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final ProfilePlatformViewModel jq() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLJ;
        return (ProfilePlatformViewModel) assemVMLazy.getValue();
    }

    public final ProfileViewModel lq() {
        ProfileViewModel profileViewModel = this.LLLFFI;
        if (profileViewModel != null) {
            return profileViewModel;
        }
        return null;
    }

    public final List<ITabBusinessListener> pq() {
        return (List) this.LLLII.getValue();
    }

    public int qq() {
        List<Integer> list = this.LLJJ;
        if (list != null) {
            return list.indexOf(0);
        }
        return -1;
    }

    public int up() {
        ProfileListFragment profileListFragment;
        List<ProfileListFragment> list = this.LLJILLL;
        if (list == null || ListProtector.get(list, this.LLJJIJIIJIL) == null) {
            return EnumC1153620g7s.UNINITIALIZED.getValue();
        }
        List<ProfileListFragment> list2 = this.LLJILLL;
        return (list2 == null || (profileListFragment = (ProfileListFragment) ListProtector.get(list2, this.LLJJIJIIJIL)) == null) ? EnumC1153620g7s.UNINITIALIZED.getValue() : profileListFragment.UR();
    }

    private final boolean Rs() {
        User user = getUser();
        if (user == null) {
            return false;
        }
        IProfileMusicTabService iProfileMusicTabServiceJp = Jp();
        return Intrinsics.LJFF(iProfileMusicTabServiceJp != null ? Boolean.valueOf(iProfileMusicTabServiceJp.LJFF(user)) : null, Boolean.TRUE);
    }

    private final void er() {
        View view;
        if (!C10EU.LJIIIIZZ() || (view = this.LLJLL) == null) {
            return;
        }
        view.setPadding(0, 0, 0, 0);
    }

    private final boolean ft() {
        ProfileComponents profileComponents;
        List<? extends ProfileComponents> list;
        float fLJIIIIZZ = C14KQ.LJIIIIZZ(getContext()) - C339190DRl.LIZ(32);
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        return fLJIIIIZZ > ((float) ((c1249090ibrIq == null || (profileComponents = c1249090ibrIq.LL) == null || (list = profileComponents.components) == null) ? 0 : list.size())) * C339190DRl.LIZ((float) 50);
    }

    private final Aweme hp() {
        ProfileBaseAbility profileBaseAbility;
        C1253220iiW c1253220iiWRP2;
        Aweme aweme = jq().getState().LLJILJILJ;
        if (aweme != null) {
            return aweme;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ProfileBaseAbility.class, null)) == null || (c1253220iiWRP2 = profileBaseAbility.rP2()) == null) {
            return null;
        }
        return c1253220iiWRP2.LIZJ;
    }

    private final List<Integer> ht() {
        int[] iArr = (int[]) SettingsManager.LIZLLL().LJIIIIZZ("profile_tabs_order", int[].class, null);
        return iArr != null ? C13LQ.LJJZZIII(iArr) : C1697810uHb.LJIIJJI(3, 0, 14, 12, 17, 4, 10, 6, 15, 2);
    }

    private final String lp() {
        Intent intent;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        String strHo = (c19egLIZ == null || (intent = c19egLIZ.getIntent()) == null) ? null : Ho(intent, "favorite_auto_landing_method");
        return this.LLLI ? "click" : C1533610q0l.LIZIZ(strHo) ? strHo == null ? "" : strHo : "slide";
    }

    public final boolean Ss() {
        IProfileMusicTabService iProfileMusicTabServiceJp;
        User user = getUser();
        if (user == null || (iProfileMusicTabServiceJp = Jp()) == null) {
            return false;
        }
        return iProfileMusicTabServiceJp.LJJIIJZLJL(user);
    }

    public final boolean Us() {
        IProfileMusicTabService iProfileMusicTabServiceJp;
        User user = getUser();
        if (user == null || (iProfileMusicTabServiceJp = Jp()) == null) {
            return false;
        }
        return iProfileMusicTabServiceJp.LJJIIZ(user);
    }

    public void Ws() {
        this.LLLILZJ = System.currentTimeMillis();
    }

    public void Xq() {
        List<? extends ProfileComponents> list;
        if (getUser() == null) {
            Zo(Bq());
        } else {
            Vo(getUser());
        }
        C1257500ipQ c1257500ipQ = this.LLJLLL;
        if (c1257500ipQ != null) {
            AwemePagerVM awemePagerVMXp = Xp();
            List<ITabBusinessListener> listPq = pq();
            c1257500ipQ.LLJIJIL = listPq;
            if (listPq != null) {
                for (ITabBusinessListener iTabBusinessListener : listPq) {
                    iTabBusinessListener.Hv0(awemePagerVMXp);
                    ProfileComponents profileComponents = c1257500ipQ.LLJI;
                    if (profileComponents != null && (list = profileComponents.components) != null) {
                        Iterator<? extends ProfileComponents> it2 = list.iterator();
                        while (it2.hasNext() && !Intrinsics.LJFF(it2.next().componentName, iTabBusinessListener.getName())) {
                        }
                    }
                    iTabBusinessListener.hl0();
                }
            }
        }
        Uq();
        C1257500ipQ c1257500ipQ2 = this.LLJLLL;
        if (c1257500ipQ2 != null) {
            HandlerHook.viewPost(c1257500ipQ2, new ARunnableS119S0100000_19(this, 118));
        }
    }

    public final String dq() {
        ProfileBaseAbility profileBaseAbility;
        C1253220iiW c1253220iiWRP2;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ProfileBaseAbility.class, null)) == null || (c1253220iiWRP2 = profileBaseAbility.rP2()) == null) {
            return null;
        }
        return c1253220iiWRP2.LIZIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        boolean zLJI = MethodIDManager.LJI(202432);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            ws(C1075590e61.LIZ(fragmentLJI));
        }
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        if (lr()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJJLI(this.LLJLLIL, null, null, null);
    }

    public final int op() {
        ProfileComponents profileComponents;
        n nVar;
        k kVarLJJIIZ;
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq == null || (profileComponents = c1249090ibrIq.LL) == null || (nVar = profileComponents.bizData) == null || (kVarLJJIIZ = nVar.LJJIIZ("default_landing_tab_id")) == null) {
            return 0;
        }
        return kVarLJJIIZ.LJIIJJI();
    }

    @Override // X.InterfaceC1251830igH
    public AwemePagerVM wE() {
        return Xp();
    }

    public final void xr() {
        if (!C300140Bpc.LIZ() || this.LLJJL) {
            return;
        }
        this.LLJJL = true;
        User user = getUser();
        if (user != null) {
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            final String uid = user.getUid();
            final String enterFrom = getEnterFrom();
            final String previousPage = getPreviousPage();
            final String strLIZ = C1259870itF.LIZ(jt(C10EU.LJFF(user)));
            Aweme awemeHp = hp();
            final String aid = awemeHp != null ? awemeHp.getAid() : null;
            Aweme awemeHp2 = hp();
            final String requestId = awemeHp2 != null ? awemeHp2.getRequestId() : null;
            final String strDq = dq();
            c1253930ijf.getClass();
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.0DU8
                public final void LIZ() {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LIZIZ(C1256070in7.LIZ, "profile_entrance_id");
                    c0lab.LJ("homepage_uid", uid);
                    c0lab.LJ("enter_from", enterFrom);
                    c0lab.LJ("previous_page", previousPage);
                    c0lab.LJ("tab_name", strLIZ);
                    c0lab.LJ("group_id", aid);
                    c0lab.LJ("request_id", requestId);
                    c0lab.LJ("enter_method", strDq);
                    C20684815ws.LJIILLIIL("profile_landing", c0lab.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ProfileStatistics@a865.reportProfileLanding$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ProfileStatistics@a865.reportProfileLanding$1");
                }
            });
        }
    }

    private final List<Integer> Ep() {
        return this.LLJJ;
    }

    public final View Aq() {
        return this.LLJLLIL;
    }

    public final List<Integer> Bp() {
        return this.LLJJ;
    }

    public String Bq() {
        return this.LLJLIL;
    }

    public final C117P Dq() {
        return this.LLJZ;
    }

    public final C20632315oP Eq() {
        return this.LLJZIJLIL;
    }

    public final List<ProfileListFragment> Fp() {
        return this.LLJILLL;
    }

    public final ProfileListFragment Ip() {
        return this.LLLIILIL;
    }

    public final C1258150iqT<ProfileListFragment> Up() {
        return this.LLJJI;
    }

    public final C1257610ipb<ProfileListFragment> Vp() {
        return this.LLJJIII;
    }

    public final View fq() {
        return this.LLJLL;
    }

    public String getEnterFrom() {
        return this.LLJILJIL;
    }

    public User getUser() {
        return this.LLJL;
    }

    public InterfaceC1258470iqz ip() {
        return this.LLLILZ;
    }

    public final boolean ir() {
        return this.LLJJJJJIL;
    }

    public final ProfileListFragment kp() {
        return this.LLLIIIL;
    }

    public final C1257500ipQ kq() {
        return this.LLJLLL;
    }

    public final int mp() {
        return this.LLJJIJIIJIL;
    }

    public final ProfileListFragment tq() {
        return this.LLLIIL;
    }

    public final C1260280itu vq() {
        return this.LLJJIJI;
    }

    public String wq() {
        return this.LLJLILLLLZIIL;
    }

    public final ProfileListFragment xq() {
        return this.LLLIIIIL;
    }

    public final boolean yq() {
        return this.LLJJL;
    }

    public final String zp() {
        return this.LLJIJIL;
    }

    private final void Zo(String str) {
        List<Integer> listCt = ct(str);
        if (listCt != null) {
            this.LLJILLL = new ArrayList(listCt.size());
            this.LLJJ = new ArrayList(listCt.size());
            Iterator<Integer> it2 = listCt.iterator();
            while (it2.hasNext()) {
                So(it2.next().intValue());
            }
        }
    }

    private final void ap(int i) {
        C1257500ipQ c1257500ipQ;
        int iIndexOf;
        C21546519Tz c21546519Tz;
        if (((Boolean) C268250AfH.LIZ.getValue()).booleanValue() && (c1257500ipQ = this.LLJLLL) != null) {
            List<Integer> list = this.LLJJ;
            if (list != null) {
                iIndexOf = list.indexOf(Integer.valueOf(i));
            } else {
                iIndexOf = 0;
            }
            C19U0 tabAt = c1257500ipQ.getTabAt(iIndexOf);
            if (tabAt != null && (c21546519Tz = tabAt.LJIIIIZZ) != null) {
                c21546519Tz.setClickable(false);
            }
        }
    }

    private final void bp(int i) {
        if (this.LLILZ && C10EU.LJIILL(getUser(), C10EU.LJIILLIIL(getUser()))) {
            ap(i);
        }
    }

    private final void ns(boolean z) {
        C1257500ipQ c1257500ipQ;
        int i;
        if (((Boolean) C268250AfH.LIZ.getValue()).booleanValue() && (c1257500ipQ = this.LLJLLL) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            int visibility = c1257500ipQ.getVisibility();
            c1257500ipQ.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c1257500ipQ);
        }
    }

    private final void yr(int i) {
        String str;
        if (System.currentTimeMillis() - this.LLLILZLLLI > 1000) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (jr()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("to_user_id", Bq());
            c2344009Gk.LJIIIIZZ("tab_name", C1259870itF.LIZ(i));
            c2344009Gk.LIZLLL(C1256070in7.LIZ, "profile_entrance_id");
            C20684815ws.LJIILLIIL("profile_video_cover_show_first_screen", c2344009Gk.LIZ);
        }
        this.LLLILZLLLI = System.currentTimeMillis();
    }

    public final int Ap(int i) {
        Integer numValueOf;
        int iIntValue;
        C1258150iqT<ProfileListFragment> c1258150iqT;
        C1258150iqT<ProfileListFragment> c1258150iqT2 = this.LLJJI;
        if (c1258150iqT2 != null) {
            if (i >= 0 && i < c1258150iqT2.getCount() && (c1258150iqT = this.LLJJI) != null) {
                iIntValue = ((Integer) ListProtector.get(c1258150iqT.LLIZLLLIL, i)).intValue();
            } else {
                iIntValue = 0;
            }
            numValueOf = Integer.valueOf(iIntValue);
        } else {
            C1257610ipb<ProfileListFragment> c1257610ipb = this.LLJJIII;
            if (c1257610ipb == null) {
                return 0;
            }
            numValueOf = Integer.valueOf(c1257610ipb.LLLJ(i));
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    public final void Ds(C1260280itu c1260280itu) {
        this.LLJJIJI = c1260280itu;
    }

    public final Fragment Gp(int i) {
        C1258150iqT<ProfileListFragment> c1258150iqT = this.LLJJI;
        if (c1258150iqT != null) {
            return c1258150iqT.LJJIJIL(i);
        }
        C1257610ipb<ProfileListFragment> c1257610ipb = this.LLJJIII;
        if (c1257610ipb == null) {
            return null;
        }
        return c1257610ipb.LLLILZLLLI(i);
    }

    public final void Gs(ProfileListFragment profileListFragment) {
        this.LLLIIIIL = profileListFragment;
    }

    public final void Hs(boolean z) {
        this.LLJJL = z;
    }

    public void Kq(int i) {
        List<ProfileListFragment> listWp = Wp();
        if (listWp != null) {
            Iterator<ProfileListFragment> it2 = listWp.iterator();
            while (it2.hasNext()) {
                it2.next().MR(i);
            }
        }
    }

    public void Kr(InterfaceC1258470iqz interfaceC1258470iqz) {
        this.LLLILZ = interfaceC1258470iqz;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // X.InterfaceC1258060iqK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIJJI(int r9) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem.LJIIJJI(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lo(com.ss.android.ugc.aweme.profile.model.User r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem.Lo(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void Ls(View view) {
        this.LLJLLIL = view;
    }

    public void Mq(int i) {
        int iIntValue;
        C1253900ijc c1253900ijc;
        C1260280itu c1260280itu;
        ProfileListFragment profileListFragment;
        ProfileListFragment profileListFragment2;
        boolean z;
        C1260300itw helper;
        List<ProfileListFragment> list = this.LLJILLL;
        if (list != null && i >= 0 && i < list.size() && this.LLJJIJI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleOnPageSelected position=");
            sbLIZ.append(i);
            sbLIZ.append(", tabName=");
            sbLIZ.append(zq(i));
            C1248210iaR.LJ("AwemePagerAssem", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.BUSINESS, "TabSwitch");
            Xs();
            this.LLJJIJIIJIL = i;
            ProfileViewModel profileViewModelLq = lq();
            List<Integer> list2 = this.LLJJ;
            if (list2 != null) {
                iIntValue = ((Number) ListProtector.get(list2, this.LLJJIJIIJIL)).intValue();
            } else {
                iIntValue = 0;
            }
            profileViewModelLq.getClass();
            profileViewModelLq.setState(new AwS46S0001000_35(iIntValue, 15));
            Ws();
            C1260280itu c1260280itu2 = this.LLJJIJI;
            ProfileListFragment profileListFragment3 = null;
            if (c1260280itu2 != null && (helper = c1260280itu2.getHelper()) != null) {
                List<ProfileListFragment> list3 = this.LLJILLL;
                if (list3 != null) {
                    profileListFragment3 = (ProfileListFragment) ListProtector.get(list3, i);
                }
                helper.LIZIZ = profileListFragment3;
            }
            C1260280itu c1260280itu3 = this.LLJJIJI;
            if (c1260280itu3 != null) {
                c1260280itu3.setCanScrollUp(true);
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 && kr()) {
                        getContext();
                        C20684815ws.LJIIIZ(0L, 0L, "slide_right", "personal_homepage");
                    }
                } else if (kr()) {
                    getContext();
                    C20684815ws.LJIIIZ(0L, 0L, "slide_right", "personal_homepage");
                }
            } else if (kr()) {
                getContext();
                C20684815ws.LJIIIZ(0L, 0L, "slide_left", "personal_homepage");
            }
            if (!C0BI9.LIZ()) {
                int itemCount = getItemCount();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    Fragment fragmentGp = Gp(i2);
                    if ((fragmentGp instanceof ProfileListFragment) && (profileListFragment2 = (ProfileListFragment) fragmentGp) != null && profileListFragment2.getFragmentManager() != null) {
                        if ((profileListFragment2 instanceof CollectProfileListFragment) && i2 == i) {
                            String strLp = lp();
                            CollectProfileListFragment collectProfileListFragment = (CollectProfileListFragment) profileListFragment2;
                            collectProfileListFragment.LLJILJILJ = strLp;
                            IFavoriteService iFavoriteServiceWS = collectProfileListFragment.wS();
                            if (iFavoriteServiceWS != null) {
                                iFavoriteServiceWS.LJJIJ(collectProfileListFragment.LLILZLL, strLp);
                            }
                            this.LLLI = false;
                        }
                        if (i2 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        profileListFragment2.uS(z);
                        profileListFragment2.Bp();
                    }
                }
            }
            if (((Boolean) C283630B9t.LIZ.getValue()).booleanValue() && (c1260280itu = this.LLJJIJI) != null && !c1260280itu.LLLF) {
                Fragment fragmentGp2 = Gp(i);
                if ((fragmentGp2 instanceof ProfileListFragment) && (profileListFragment = (ProfileListFragment) fragmentGp2) != null) {
                    profileListFragment.cS(false);
                }
            }
            if (C19252910Tv.LIZIZ.LIZLLL().LJI().LLLII() && (c1253900ijc = this.LLLF) != null) {
                c1253900ijc.setCurrentTab(this.LLJJIJIIJIL);
            }
        }
    }

    public final void Ms(C117P c117p) {
        this.LLJZ = c117p;
    }

    public final void Ns(C20632315oP c20632315oP) {
        this.LLJZIJLIL = c20632315oP;
    }

    public final void Os(C21594419fC c21594419fC) {
        this.LLIZLLLIL = c21594419fC;
    }

    public boolean Ps(User user) {
        if (!C10EU.LJIILLIIL(user) || user == null || user.getTabSetting() == null || !user.getTabSetting().isHideLikeTab()) {
            return true;
        }
        return false;
    }

    public final void Qq(boolean z) throws Throwable {
        Integer numValueOf;
        String str;
        Fragment fragment;
        List<ProfileListFragment> list = this.LLJILLL;
        if (list != null) {
            int i = this.LLJJIJIIJIL;
            if (i >= 0 && i < list.size()) {
                List<ProfileListFragment> list2 = this.LLJILLL;
                if (list2 != null && (fragment = (Fragment) ListProtector.get(list2, this.LLJJIJIIJIL)) != null) {
                    fragment.setUserVisibleHint(z);
                }
            } else {
                return;
            }
        }
        if (z && !this.LLJJJJ) {
            C1252570ihT.LIZ.getClass();
            C1252570ihT.LJ();
        }
        List<Integer> list3 = this.LLJJ;
        Integer numValueOf2 = null;
        if (list3 != null) {
            numValueOf2 = Integer.valueOf(list3.indexOf(18));
        }
        if (numValueOf2 != null && numValueOf2.intValue() != -1 && z) {
            if (jr()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            getContext();
            String strBq = Bq();
            c1253930ijf.getClass();
            C1253930ijf.LJIJI("repost_history_show", str, strBq, "");
        }
        this.LLJJLIIIJLLLLLLLZ = !z;
        if (!z) {
            this.LLJJL = false;
        } else if (!this.LLJJJJ) {
            xr();
        }
        List<Integer> list4 = this.LLJJ;
        if (list4 != null && (numValueOf = Integer.valueOf(list4.indexOf(8))) != null && numValueOf.intValue() != -1) {
            C1253930ijf c1253930ijf2 = C1253930ijf.LIZ;
            Context context = getContext();
            int iIntValue = numValueOf.intValue();
            c1253930ijf2.getClass();
            if (context instanceof InterfaceC1603190roz) {
                C20684815ws.LJIILLIIL("tiktokec_list_entrance_show", C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("page_name", "personal_homepage"), new Pair("enter_from", "personal_homepage"), new Pair("list_name", "favorite"), new Pair("list_num", String.valueOf(iIntValue + 1)), new Pair("previous_page", "personal_homepage")));
            }
        }
        this.LLJJJJ = false;
    }

    public final void Tr(ProfileListFragment profileListFragment) {
        this.LLLIIIL = profileListFragment;
    }

    public final void Ur(int i) {
        this.LLJJIJIIJIL = i;
    }

    public void Vo(User user) {
        C1252230igv c1252230igv;
        C1260280itu c1260280itu;
        int privateTabStyle;
        List<Integer> listBt = bt(user);
        if (listBt == null) {
            return;
        }
        if (C10EU.LJIILLIIL(user)) {
            boolean zContains = listBt.contains(10);
            if (zContains && user != null && user.getTabSetting() != null && user.getTabSetting().getPrivateTab() != null && (privateTabStyle = user.getTabSetting().getPrivateTab().getPrivateTabStyle()) >= 1 && privateTabStyle <= 3 && privateTabStyle == 3) {
                int iLastIndexOf = listBt.lastIndexOf(2);
                int iLastIndexOf2 = listBt.lastIndexOf(10);
                if (iLastIndexOf != -1 && iLastIndexOf2 != -1) {
                    ListProtector.set(listBt, iLastIndexOf, 10);
                    ListProtector.set(listBt, iLastIndexOf2, 2);
                }
            }
            C1256020in2.LIZ = zContains;
        }
        ArrayList arrayList = new ArrayList();
        List<ProfileListFragment> list = this.LLJILLL;
        if (list == null) {
            this.LLJILLL = new ArrayList(listBt.size());
        } else {
            arrayList.addAll(list);
            List<ProfileListFragment> list2 = this.LLJILLL;
            if (list2 != null) {
                list2.clear();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<Integer> list3 = this.LLJJ;
        if (list3 == null) {
            this.LLJJ = new ArrayList(listBt.size());
        } else {
            arrayList2.addAll(list3);
            List<Integer> list4 = this.LLJJ;
            if (list4 != null) {
                list4.clear();
            }
            C1245340iVo c1245340iVo = C1245340iVo.LIZ;
            EnumC1248370iah enumC1248370iah = EnumC1248370iah.TAB;
            c1245340iVo.getClass();
            Set<String> set = C1245340iVo.LJIIL.get(enumC1248370iah);
            if (set != null) {
                set.clear();
            }
        }
        Iterator<Integer> it2 = listBt.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (arrayList2.contains(Integer.valueOf(jt(iIntValue)))) {
                int iIndexOf = arrayList2.indexOf(Integer.valueOf(jt(iIntValue)));
                Jo((ProfileListFragment) ListProtector.get(arrayList, iIndexOf), (Integer) ListProtector.get(arrayList2, iIndexOf));
                dt(iIntValue);
            } else {
                So(iIntValue);
            }
        }
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq != null && (c1252230igv = c1249090ibrIq.LLIZLLLIL) != null && c1252230igv.LLJIJIL && (c1260280itu = this.LLJJIJI) != null) {
            HandlerHook.viewPost(c1260280itu, new ARunnableS119S0100000_19(c1260280itu, 117));
        }
    }

    public int Vs(User user) {
        int privateTabStyle;
        if (user == null || user.getTabSetting() == null || user.getTabSetting().getPrivateTab() == null || (privateTabStyle = user.getTabSetting().getPrivateTab().getPrivateTabStyle()) < 1 || privateTabStyle > 3) {
            return 1;
        }
        return privateTabStyle;
    }

    public final void Wr(boolean z) {
        this.LLJJJJJIL = z;
    }

    public void Xr(String str) {
        this.LLJILJIL = str;
    }

    public final void Yr(List<Integer> list) {
        this.LLJJ = list;
    }

    public final int aq(int i) {
        int iIndexOf;
        Integer numValueOf;
        C1258150iqT<ProfileListFragment> c1258150iqT = this.LLJJI;
        if (c1258150iqT != null) {
            numValueOf = Integer.valueOf(c1258150iqT.LLIZLLLIL.indexOf(Integer.valueOf(i)));
        } else {
            C1257610ipb<ProfileListFragment> c1257610ipb = this.LLJJIII;
            if (c1257610ipb == null) {
                return -1;
            }
            List<Integer> list = c1257610ipb.LLJIJIL;
            if (list != null) {
                iIndexOf = list.indexOf(Integer.valueOf(i));
            } else {
                iIndexOf = -1;
            }
            numValueOf = Integer.valueOf(iIndexOf);
        }
        if (numValueOf == null) {
            return -1;
        }
        return numValueOf.intValue();
    }

    public List<Integer> bt(User user) {
        List<Integer> listHt = ht();
        if (listHt != null) {
            ArrayList arrayList = new ArrayList(listHt);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!Ys(user, ((Number) it2.next()).intValue())) {
                    it2.remove();
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void cs(List<ProfileListFragment> list) {
        this.LLJILLL = list;
    }

    public List<Integer> ct(String str) {
        List<Integer> listHt = ht();
        ArrayList arrayList = null;
        if (listHt != null) {
            arrayList = new ArrayList(listHt);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!at(str, ((Number) it2.next()).intValue())) {
                    it2.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    @Override // X.InterfaceC1251830igH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dI(boolean r4) {
        /*
            r3 = this;
            X.0ipQ r2 = r3.LLJLLL
            if (r2 == 0) goto L2e
            java.util.List<java.lang.Integer> r1 = r3.LLJJ
            if (r1 == 0) goto L2c
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r1.indexOf(r0)
        L11:
            X.19U0 r0 = r2.getTabAt(r0)
            if (r0 == 0) goto L2e
            android.view.View r1 = r0.LJFF
        L19:
            boolean r0 = r1 instanceof X.C1257550ipV
            if (r0 == 0) goto L27
            X.0ipV r1 = (X.C1257550ipV) r1
            if (r4 == 0) goto L28
            r0 = 2130773954(0x7f0107c2, float:1.715107E38)
        L24:
            r1.setImageResource(r0)
        L27:
            return
        L28:
            r0 = 2130774120(0x7f010868, float:1.7151406E38)
            goto L24
        L2c:
            r0 = 0
            goto L11
        L2e:
            r1 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem.dI(boolean):void");
    }

    public void dp(int i) {
        bp(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    public final void dt(int i) {
        T next;
        String uid;
        ProfileComponents profileComponents;
        List<? extends ProfileComponents> list;
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        C1249040ibm.LIZ.getClass();
        c259800zU.element = C1249040ibm.LIZ().get(Integer.valueOf(jt(i)));
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        if (c1249090ibrIq != null && (profileComponents = c1249090ibrIq.LL) != null && (list = profileComponents.components) != null) {
            Iterator<? extends ProfileComponents> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((ProfileComponents) next).componentName, c259800zU.element)) {
                        break;
                    }
                } else {
                    next = 0;
                    break;
                }
            }
        } else {
            next = 0;
        }
        c259800zU2.element = next;
        C1248840ibS c1248840ibS = C1248840ibS.LIZ;
        boolean zJr = jr();
        ProfileComponents profileComponents2 = (ProfileComponents) c259800zU2.element;
        User user = getUser();
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c1248840ibS.getClass();
        C1248840ibS.LIZJ(profileComponents2, uid, zJr, true);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1249560icc(c259800zU2, this, c259800zU, null), 3);
    }

    public void ep(int i) {
        bp(1);
    }

    public final void js(ProfileListFragment profileListFragment) {
        this.LLLIILIL = profileListFragment;
    }

    public int jt(int i) {
        if (i != 0) {
            if (i != 6) {
                if (i != 10) {
                    if (i != 12) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    return 6;
                                }
                                switch (i) {
                                    case 14:
                                        return 20;
                                    case 15:
                                        return 18;
                                    case 16:
                                        return 19;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        return 21;
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                        return 22;
                                    case 19:
                                        return 23;
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        return 26;
                                    case 21:
                                        return 24;
                                    default:
                                        return -1;
                                }
                            }
                            if (Ss()) {
                                return 17;
                            }
                            return 3;
                        }
                        return 1;
                    }
                    return 16;
                }
                return 14;
            }
            return 8;
        }
        return 0;
    }

    public final void ks(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNavPosition: position = ");
        sbLIZ.append(i);
        C1720106oR.LJI("AwemePagerAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (C0BI9.LIZ()) {
            Cl2(i, false, true);
            return;
        }
        C1257500ipQ c1257500ipQ = this.LLJLLL;
        if (c1257500ipQ == null) {
            return;
        }
        C19U0 tabAt = c1257500ipQ.getTabAt(i);
        if (tabAt != null) {
            tabAt.LIZIZ();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("select current pos: ");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void nr(int i) {
        String str;
        String aid;
        ProfileComponents profileComponents;
        List<? extends ProfileComponents> list;
        if (jr()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C1248840ibS c1248840ibS = C1248840ibS.LIZ;
        Aweme awemeHp = hp();
        String str2 = "";
        if (awemeHp == null || (aid = awemeHp.getAid()) == null) {
            aid = "";
        }
        String strBq = Bq();
        if (strBq != null) {
            str2 = strBq;
        }
        C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
        ProfileComponents profileComponents2 = null;
        if (c1249090ibrIq != null && (profileComponents = c1249090ibrIq.LL) != null && (list = profileComponents.components) != null) {
            Iterator<? extends ProfileComponents> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ProfileComponents next = it2.next();
                String str3 = next.componentName;
                C1249040ibm.LIZ.getClass();
                if (Intrinsics.LJFF(str3, C1249040ibm.LIZ().get(Integer.valueOf(i)))) {
                    profileComponents2 = next;
                    break;
                }
            }
            profileComponents2 = profileComponents2;
        }
        int iAq = aq(i);
        AFwS303S0000000_19 aFwS303S0000000_19 = AFwS303S0000000_19.get$arr$(36);
        c1248840ibS.getClass();
        C1248840ibS.LIZIZ(str, aid, str2, profileComponents2, null, iAq, aFwS303S0000000_19);
    }

    @C14EU
    public void onNeedScrollToTop(C1258000iqE c1258000iqE) {
        boolean z;
        if (C0XQ7.LJFF().isLogin() && C10EU.LJIILLIIL(getUser())) {
            z = true;
        } else {
            z = false;
        }
        C1260280itu c1260280itu = this.LLJJIJI;
        if (c1260280itu != null && z == c1258000iqE.LIZ) {
            c1260280itu.LJI(0L);
        }
    }

    @C14EU
    public void onProfilePageScrollToPosition(C1257900iq4 c1257900iq4) {
        boolean z;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && C10EU.LJIILLIIL(getUser())) {
            z = true;
        } else {
            z = false;
        }
        C1260280itu c1260280itu = this.LLJJIJI;
        if (c1260280itu != null && z == c1257900iq4.LIZ) {
            float f = c1257900iq4.LIZIZ;
            Float fValueOf = Float.valueOf(1.0f);
            C19393710u7.LIZ(c1260280itu, new Pair(fValueOf, fValueOf), new Pair(fValueOf, Float.valueOf(f)), 0L);
            c1260280itu.LLILLJJLI.abortAnimation();
        }
    }

    @Override // X.InterfaceC1258060iqK
    public void onSelect(int i) {
        String str;
        boolean z;
        Integer numValueOf;
        IMPerformanceService performanceService;
        C1366690lfX c1366690lfXLIZIZ;
        Integer numValueOf2;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tab onSelect, type=");
        sbLIZ.append(i);
        C1720106oR.LJI("AwemePagerAssem", C2188811AlT.LIZIZ(sbLIZ));
        String strLIZ = C1259870itF.LIZ(i);
        C1252550ihR.LIZ.getClass();
        String str2 = C1252550ihR.LIZJ;
        C1252550ihR.LIZJ = strLIZ;
        String str3 = "personal_homepage";
        String str4 = "sticker_set_details_page";
        Integer numValueOf3 = null;
        String str5 = null;
        if (this.LLJJJ) {
            this.LLJJJ = false;
            if (!jr()) {
                str3 = "others_homepage";
            }
            List<Integer> list = this.LLJJ;
            if (list != null) {
                numValueOf2 = Integer.valueOf(list.indexOf(Integer.valueOf(i)));
            } else {
                numValueOf2 = null;
            }
            if (i == 18 && numValueOf2 != null && numValueOf2.intValue() != -1) {
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                getContext();
                String strBq = Bq();
                c1253930ijf.getClass();
                C1253930ijf.LJIJI("repost_history_click", str3, strBq, "click");
            }
            C1249090ibr<ProfileComponents> c1249090ibrIq = iq();
            if (c1249090ibrIq != null) {
                str5 = c1249090ibrIq.LLILLL;
            }
            if (!Intrinsics.LJFF(str5, "sticker_set_details_page")) {
                str4 = str3;
            }
            C1250680ieQ.LJIILLIIL(Long.valueOf(C1256070in7.LIZ), str4, "click", strLIZ, Bq(), str2, getPreviousPage());
            z = false;
        } else {
            if (!jr()) {
                str3 = "others_homepage";
            }
            C1249090ibr<ProfileComponents> c1249090ibrIq2 = iq();
            if (c1249090ibrIq2 != null) {
                str = c1249090ibrIq2.LLILLL;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, "sticker_set_details_page")) {
                str4 = str3;
            }
            IProfileAppDiffProtocol.LIZ.getClass();
            C1253780ijQ.LIZ().LIZLLL();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str4);
            C1253780ijQ.LIZ().LJIIIZ();
            c2344009Gk.LJIIIIZZ("enter_method", "click");
            c2344009Gk.LJIIIIZZ("tab_name", strLIZ);
            c2344009Gk.LJIIIIZZ("to_user_id", Bq());
            C20684815ws.LJIILLIIL("change_profile_tab", c2344009Gk.LIZ);
            if (this.LLJJJIL) {
                this.LLJJJIL = false;
                String str6 = Xp().LLILLL;
                if (i == 17 && Rs()) {
                    strLIZ = "ghost_entrance";
                }
                z = false;
                C1250680ieQ.LJIILLIIL(Long.valueOf(C1256070in7.LIZ), str4, str6, strLIZ, Bq(), str2, getPreviousPage());
            } else {
                z = false;
            }
            List<Integer> list2 = this.LLJJ;
            if (list2 != null && (numValueOf = Integer.valueOf(list2.indexOf(8))) != null && numValueOf.intValue() != -1 && i == 8) {
                C1253930ijf c1253930ijf2 = C1253930ijf.LIZ;
                Context context = getContext();
                int iIntValue = numValueOf.intValue();
                String str7 = Xp().LLILLL;
                c1253930ijf2.getClass();
                C1253930ijf.LJIJJ(context, str2, iIntValue, str7);
            }
            List<Integer> list3 = this.LLJJ;
            if (list3 != null) {
                numValueOf3 = Integer.valueOf(list3.indexOf(Integer.valueOf(i)));
            }
            if (i == 18 && numValueOf3 != null && numValueOf3.intValue() != -1) {
                C1253930ijf c1253930ijf3 = C1253930ijf.LIZ;
                getContext();
                String strBq2 = Bq();
                c1253930ijf3.getClass();
                C1253930ijf.LJIJI("repost_history_click", str4, strBq2, "");
            }
            Xp().LLILLL = "slide";
        }
        if (i == 19 && (performanceService = C1336205Ku.LIZ(z).getPerformanceService()) != null && (c1366690lfXLIZIZ = performanceService.LIZIZ()) != null) {
            c1366690lfXLIZIZ.LIZIZ(IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJIJJLI(), true);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TabSetting tabSetting;
        BATab bATab;
        this.LLJJIJI = (C1260280itu) view.findViewById(R.id.u30);
        this.LLJLL = view.findViewById(R.id.s5p);
        this.LLJLLIL = view.findViewById(R.id.py2);
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJI().LJJLI(this.LLJLLIL, null, null, null);
        if (lr()) {
            C487280J9a.LIZ(-hashCode(), this);
        }
        er();
        if (!c19252910Tv.LIZLLL().LJI().LLLII()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            C1260280itu c1260280itu = this.LLJJIJI;
            if (c1260280itu != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1260280itu);
                c1260280itu.setLayoutParams(layoutParams);
            }
        }
        C1260280itu c1260280itu2 = this.LLJJIJI;
        if (c1260280itu2 != null) {
            c1260280itu2.setOnScrollListener(new InterfaceC1260330itz() { // from class: X.0ipU
                public float LL;

                @Override // X.InterfaceC1260330itz
                public final boolean onScrollEnd() {
                    AwemePagerAssem awemePagerAssem = this.LLILLJJLI;
                    if (awemePagerAssem.LLILZ) {
                        awemePagerAssem.Pq((int) this.LL);
                        this.LL = 0.0f;
                        if (C300140Bpc.LIZ()) {
                            AwemePagerAssem awemePagerAssem2 = this.LLILLJJLI;
                            if (!awemePagerAssem2.LLJJLIIIJLLLLLLLZ && awemePagerAssem2.LLJJJJLIIL) {
                                awemePagerAssem2.LLJJLIIIJLLLLLLLZ = true;
                                awemePagerAssem2.LLJJJJLIIL = false;
                                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                                User user = awemePagerAssem2.getUser();
                                final String uid = user != null ? user.getUid() : null;
                                final String enterFrom = this.LLILLJJLI.getEnterFrom();
                                final String previousPage = this.LLILLJJLI.getPreviousPage();
                                AwemePagerAssem awemePagerAssem3 = this.LLILLJJLI;
                                final String strZq = awemePagerAssem3.zq(awemePagerAssem3.LLJJIJIIJIL);
                                c1253930ijf.getClass();
                                C20684815ws.LJFF().execute(new Runnable() { // from class: X.0DU9
                                    public final void LIZ() {
                                        C0LAB c0lab = new C0LAB();
                                        c0lab.LIZIZ(C1256070in7.LIZ, "profile_entrance_id");
                                        c0lab.LJ("homepage_uid", uid);
                                        c0lab.LJ("enter_from", enterFrom);
                                        c0lab.LJ("previous_page", previousPage);
                                        c0lab.LJ("tab_name", strZq);
                                        C20684815ws.LJIILLIIL("profile_slide", c0lab.LIZ);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("ProfileStatistics@a865.reportProfileSlide$1");
                                        try {
                                            LIZ();
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("ProfileStatistics@a865.reportProfileSlide$1");
                                    }
                                });
                            }
                        }
                    }
                    return false;
                }

                @Override // X.InterfaceC1260330itz
                public final void onScroll(int i, int i2) {
                    C1260280itu c1260280itu3;
                    List<ProfileListFragment> list = this.LLILLJJLI.LLJILLL;
                    if (list != null && !list.isEmpty() && (c1260280itu3 = this.LLILLJJLI.LLJJIJI) != null) {
                        c1260280itu3.setCanScrollUp(true);
                        AwemePagerAssem awemePagerAssem = this.LLILLJJLI;
                        if (awemePagerAssem.LLJJIJIIJIL == awemePagerAssem.aq(0)) {
                            this.LLILLJJLI.Nq();
                        }
                    }
                }

                @Override // X.InterfaceC1260330itz
                public final void onScrolled(float f, float f2) {
                    List<ProfileListFragment> list;
                    AwemePagerAssem awemePagerAssem;
                    C1260280itu c1260280itu3;
                    this.LL += f2;
                    AwemePagerAssem awemePagerAssem2 = this.LLILLJJLI;
                    if (awemePagerAssem2.LLILZ && (list = awemePagerAssem2.LLJILLL) != null && !list.isEmpty() && (c1260280itu3 = (awemePagerAssem = this.LLILLJJLI).LLJJIJI) != null) {
                        awemePagerAssem.LLJJJJLIIL = true;
                        c1260280itu3.setCanScrollUp(true);
                    }
                }
            });
        }
        this.LLJLLL = (C1257500ipQ) view.findViewById(R.id.xp8);
        if (c19252910Tv.LIZLLL().LJI().LLLII()) {
            this.LLL = (LinearLayout) view.findViewById(R.id.s5r);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return;
        }
        Xq();
        hr(view, fragmentLJI);
        Zq();
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC1252070igf.class), new C2217381BqS() { // from class: X.0ikk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251330ifT) obj).LIZIZ;
            }
        }, new AwS598S0100000_19(this, 490));
        C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0iq1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158970gGV) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 172), 4);
        C736680Sv4.LJIIIIZZ(this, Xp(), new C2217381BqS() { // from class: X.0iq2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158970gGV) obj).LLILLL;
            }
        }, null, new AwS633S0100000_19(this, 173), 6);
        C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC1252070igf.class), new C2217381BqS() { // from class: X.0ifU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251330ifT) obj).LJII;
            }
        }, new AwS598S0100000_19(this, 491));
        User user = getUser();
        if (user != null && (tabSetting = user.getTabSetting()) != null && (bATab = tabSetting.baTab) != null && Intrinsics.LJFF(bATab.getShowBATab(), Boolean.TRUE)) {
            BAProfilePageServiceImpl.LJIIL().LIZJ();
        }
    }

    public final void os(C1258150iqT<ProfileListFragment> c1258150iqT) {
        this.LLJJI = c1258150iqT;
    }

    public final void qs(C1257610ipb<ProfileListFragment> c1257610ipb) {
        this.LLJJIII = c1257610ipb;
    }

    public EffectProfileListFragment sp(int i) {
        Fragment fragmentLJJJJZI;
        FragmentManager childFragmentManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append('4');
            fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            fragmentLJJJJZI = null;
        }
        if (fragmentLJJJJZI instanceof EffectProfileListFragment) {
            return (EffectProfileListFragment) fragmentLJJJJZI;
        }
        String strBq = Bq();
        String strWq = wq();
        boolean zJr = jr();
        EffectProfileListFragment effectProfileListFragment = new EffectProfileListFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("user_id", strBq, bundle);
        C786410Ut5.LJJJI("sec_user_id", strWq, bundle);
        bundle.putBoolean("is_me", zJr);
        bundle.putInt("bottom_bar_height", i);
        effectProfileListFragment.setArguments(bundle);
        return effectProfileListFragment;
    }

    public final void ss(View view) {
        this.LLJLL = view;
    }

    public final void us(C1257500ipQ c1257500ipQ) {
        this.LLJLLL = c1257500ipQ;
    }

    public final void ws(ProfileViewModel profileViewModel) {
        this.LLLFFI = profileViewModel;
    }

    public final Fragment yp(int i) {
        int iIndexOf;
        C1258150iqT<ProfileListFragment> c1258150iqT = this.LLJJI;
        if (c1258150iqT != null) {
            int iIndexOf2 = c1258150iqT.LLIZLLLIL.indexOf(Integer.valueOf(i));
            if (iIndexOf2 >= 0 && iIndexOf2 < c1258150iqT.LLIZ.size()) {
                return (Fragment) ListProtector.get(c1258150iqT.LLIZ, iIndexOf2);
            }
            return null;
        }
        C1257610ipb<ProfileListFragment> c1257610ipb = this.LLJJIII;
        if (c1257610ipb != null) {
            List<Integer> list = c1257610ipb.LLJIJIL;
            if (list != null) {
                iIndexOf = list.indexOf(Integer.valueOf(i));
            } else {
                iIndexOf = -1;
            }
            return c1257610ipb.LLLILZLLLI(iIndexOf);
        }
        return null;
    }

    public String zq(int i) {
        int iIntValue;
        List<Integer> list = this.LLJJ;
        if (list != null) {
            int size = 0;
            if (!list.isEmpty()) {
                List<Integer> list2 = this.LLJJ;
                if (list2 != null) {
                    size = list2.size();
                }
                if (i < size) {
                    List<Integer> list3 = this.LLJJ;
                    if (list3 != null) {
                        iIntValue = ((Number) ListProtector.get(list3, i)).intValue();
                    } else {
                        iIntValue = -1;
                    }
                    return C1259870itF.LIZ(iIntValue);
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public final void zs(ProfileListFragment profileListFragment) {
        this.LLLIIL = profileListFragment;
    }

    public static Object Go(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static String Ho(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final void gs(C20632315oP c20632315oP, int i) {
        View childAt = c20632315oP.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setItemViewCacheSize(i);
        }
    }

    private final void hr(View view, Fragment fragment) {
        int iIntValue;
        C1257500ipQ c1257500ipQ = this.LLJLLL;
        if (c1257500ipQ != null) {
            c1257500ipQ.setMode(0);
        }
        C1257500ipQ c1257500ipQ2 = this.LLJLLL;
        if (c1257500ipQ2 != null) {
            int visibility = c1257500ipQ2.getVisibility();
            c1257500ipQ2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1257500ipQ2);
        }
        if (!C0BI9.LIZ()) {
            C117P c117p = (C117P) view.findViewById(R.id.u3m);
            this.LLJZ = c117p;
            if (c117p != null) {
                c117p.setOffscreenPageLimit(2);
            }
            C1258150iqT<ProfileListFragment> c1258150iqT = new C1258150iqT<>(fragment.getChildFragmentManager(), this.LLJILLL, this.LLJJ);
            this.LLJJI = c1258150iqT;
            C117P c117p2 = this.LLJZ;
            if (c117p2 != null) {
                c117p2.setAdapter(c1258150iqT);
            }
            C117P c117p3 = this.LLJZ;
            if (c117p3 != null) {
                c117p3.addOnPageChangeListener(new C1266190j3R(this, 5));
            }
            Mq(this.LLJJIJIIJIL);
            C117P c117p4 = this.LLJZ;
            if (c117p4 != null) {
                c117p4.setCurrentItem(this.LLJJIJIIJIL);
                return;
            }
            return;
        }
        C20632315oP c20632315oP = (C20632315oP) view.findViewById(R.id.u3m);
        this.LLJZIJLIL = c20632315oP;
        if (c20632315oP != null) {
            if (jr()) {
                iIntValue = ((Number) C267800AeY.LIZ.getValue()).intValue();
            } else {
                iIntValue = ((Number) C267700AeO.LIZ.getValue()).intValue();
            }
            gs(c20632315oP, iIntValue);
        }
        C1257610ipb<ProfileListFragment> c1257610ipb = new C1257610ipb<>(fragment, this.LLJILLL, this.LLJJ);
        this.LLJJIII = c1257610ipb;
        C20632315oP c20632315oP2 = this.LLJZIJLIL;
        if (c20632315oP2 != null) {
            c20632315oP2.setAdapter(c1257610ipb);
        }
        C20632315oP c20632315oP3 = this.LLJZIJLIL;
        if (c20632315oP3 != null) {
            c20632315oP3.setSaveEnabled(false);
        }
        C20632315oP c20632315oP4 = this.LLJZIJLIL;
        if (c20632315oP4 != null) {
            c20632315oP4.LIZIZ(new AbstractC712240Rwk() { // from class: X.0ipa
                public int LL = -1;

                @Override // X.AbstractC712240Rwk
                public final void onPageScrollStateChanged(int i) {
                    this.LLILLJJLI.Kq(i);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPageScrollStateChanged: ");
                    sbLIZ.append(i);
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC712240Rwk
                public final void onPageSelected(int i) throws Throwable {
                    ProfileListFragment profileListFragment;
                    this.LLILLJJLI.Mq(i);
                    C1257610ipb<ProfileListFragment> c1257610ipb2 = this.LLILLJJLI.LLJJIII;
                    ProfileListFragment profileListFragment2 = null;
                    if (c1257610ipb2 != null) {
                        profileListFragment = (ProfileListFragment) c1257610ipb2.LLLILZLLLI(this.LL);
                    } else {
                        profileListFragment = null;
                    }
                    C1257610ipb<ProfileListFragment> c1257610ipb3 = this.LLILLJJLI.LLJJIII;
                    if (c1257610ipb3 != null) {
                        profileListFragment2 = (ProfileListFragment) c1257610ipb3.LLLILZLLLI(i);
                    }
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPageSelected: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", lastSelectedPosition: ");
                    sbLIZ.append(this.LL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.LLILLJJLI.Gq(this.LL, i, profileListFragment, profileListFragment2, true);
                    this.LL = i;
                }

                @Override // X.AbstractC712240Rwk
                public final void onPageScrolled(int i, float f, int i2) {
                    this.LLILLJJLI.P5(i, f, i2);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPageScrolled: ");
                    sbLIZ.append(i);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            });
        }
        Vr(this, this.LLJJIJIIJIL, false, false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Jo(ProfileListFragment profileListFragment, Integer num) {
        List<Integer> list;
        List<ProfileListFragment> list2;
        List<Integer> list3;
        int iIndexOf;
        User user;
        String uid;
        String uid2;
        if (profileListFragment instanceof AwemeListFragmentImpl) {
            AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) profileListFragment;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            awemeListFragmentImpl.LLLLZIL = fragmentLJI;
            Bundle arguments = fragmentLJI.getArguments();
            if (arguments != null && arguments.containsKey("is_from_push")) {
                Bundle arguments2 = awemeListFragmentImpl.getArguments();
                if (arguments2 != null) {
                    C786410Ut5.LJJIJIIJI(arguments2, "is_from_push", "1");
                }
                Bundle arguments3 = awemeListFragmentImpl.getArguments();
                if (arguments3 != null) {
                    C786410Ut5.LJJIJIIJI(arguments3, "push_type", String.valueOf(Go(arguments, "push_type")));
                }
                Bundle arguments4 = awemeListFragmentImpl.getArguments();
                if (arguments4 != null) {
                    C786410Ut5.LJJIJIIJI(arguments4, "push_id", String.valueOf(Go(arguments, "push_id")));
                }
            }
        }
        if (profileListFragment instanceof CollectProfileListFragment) {
            CollectProfileListFragment collectProfileListFragment = (CollectProfileListFragment) profileListFragment;
            User user2 = getUser();
            collectProfileListFragment.getClass();
            if (((Boolean) C0B9G.LIZ.getValue()).booleanValue()) {
                User user3 = collectProfileListFragment.LLIZ;
                if (user3 != null) {
                    uid = user3.getUid();
                } else {
                    uid = null;
                }
                if (user2 != null) {
                    uid2 = user2.getUid();
                } else {
                    uid2 = null;
                }
                if (!Intrinsics.LJFF(uid, uid2)) {
                    collectProfileListFragment.LLIZ = user2;
                    collectProfileListFragment.LLILZLL = null;
                }
            }
        }
        if (profileListFragment instanceof ProfileBaseAwemeListFragment) {
            C724240Sb0.LJI(this);
            profileListFragment.getClass();
        }
        if (profileListFragment instanceof IRepostProfileListAbility) {
            ((IRepostProfileListAbility) profileListFragment).qE();
        }
        if (this.LLJJ == null) {
            return;
        }
        if (!jr() && ((num == null || (num.intValue() != 0 && num.intValue() != 1 && num.intValue() != 24)) && (user = getUser()) != null && user.isBlock)) {
            return;
        }
        List<Integer> list4 = this.LLJJ;
        if (list4 != null && C13LP.LJJJJ(num, list4)) {
            List<Integer> list5 = this.LLJJ;
            if (list5 != null) {
                iIndexOf = list5.indexOf(num);
            } else {
                iIndexOf = -1;
            }
            List<ProfileListFragment> list6 = this.LLJILLL;
            if (list6 != null) {
                ListProtector.remove(list6, iIndexOf);
            }
            List<Integer> list7 = this.LLJJ;
            if (list7 != null) {
                ListProtector.remove(list7, iIndexOf);
            }
        }
        if (((Boolean) C267740AeS.LIZ.getValue()).booleanValue()) {
            if (profileListFragment != 0) {
                List<ProfileListFragment> list8 = this.LLJILLL;
                if (list8 != null) {
                    list8.add(profileListFragment);
                }
                if (num != null && (list3 = this.LLJJ) != null) {
                    list3.add(num);
                    return;
                }
                return;
            }
            return;
        }
        if (profileListFragment != 0 && (list2 = this.LLJILLL) != null) {
            list2.add(profileListFragment);
        }
        if (num == null || (list = this.LLJJ) == null) {
            return;
        }
        list.add(num);
    }

    public final void No(final int i, final boolean z) throws Throwable {
        AwemeListFragmentImpl awemeListFragmentImpl;
        ProfileListFragment profileListFragment;
        int i2;
        boolean z2;
        Resources resources;
        Configuration configuration;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeTab: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        List<Integer> list = this.LLJJ;
        if (list == null) {
            return;
        }
        int iIndexOf = list.indexOf(Integer.valueOf(i));
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        int iMin = Math.min(getItemCount() - 1, iIndexOf);
        if (LJIL() != iMin) {
            InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
                i2 = configuration.orientation;
            } else {
                i2 = 1;
            }
            if (interfaceC1249220ic4LJI.LJZI(i2) && !C0BI9.LIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            Cl2(iMin, z2, true);
            if (C299970BpL.LIZ()) {
                C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                final boolean zJr = jr();
                c1250680ieQ.getClass();
                C20684815ws.LJFF().execute(new Runnable() { // from class: X.01Wq
                    public final void LIZ() {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJ(Boolean.valueOf(zJr), "is_my_profile");
                        c2344009Gk.LIZJ(i, "landing_tab_type");
                        c2344009Gk.LJ(Boolean.valueOf(z), "from_default_change_tab_landing");
                        C20684815ws.LJIILLIIL("profile_landing_tab", c2344009Gk.LIZ);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ProfilePlatformStatistics@1051.reportLandingTab$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ProfilePlatformStatistics@1051.reportLandingTab$1");
                    }
                });
            }
        }
        Mq(iMin);
        if (C0BI9.LIZ()) {
            C1257610ipb<ProfileListFragment> c1257610ipb = this.LLJJIII;
            if (c1257610ipb != null) {
                profileListFragment = (ProfileListFragment) c1257610ipb.LLLILZLLLI(iMin);
            } else {
                profileListFragment = null;
            }
            Iq(this, -1, iMin, null, profileListFragment, false, 16, null);
        }
        if (C2537109wv.LJIIJ() && i != 0) {
            int itemCount = getItemCount();
            for (int i4 = 0; i4 < itemCount; i4++) {
                Fragment fragmentGp = Gp(i4);
                if ((fragmentGp instanceof AwemeListFragmentImpl) && (awemeListFragmentImpl = (AwemeListFragmentImpl) fragmentGp) != null) {
                    awemeListFragmentImpl.r = true;
                }
            }
        }
    }

    public ProfileListFragment Qp(int i, String str) {
        Fragment fragmentLJJJJZI;
        FragmentManager childFragmentManager;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append('0');
            fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            fragmentLJJJJZI = null;
        }
        IProfileMusicTabService iProfileMusicTabServiceJp = Jp();
        if (iProfileMusicTabServiceJp == null) {
            return null;
        }
        return iProfileMusicTabServiceJp.LJIJ(fragmentLJJJJZI, new OriginMusicArg(getUser(), jr(), Bq(), wq(), i, getPreviousPage(), str, C0BI9.LIZ()));
    }

    public boolean Ys(User user, int i) {
        TabSetting tabSetting;
        ShopTab shopTab;
        Boolean boolValueOf;
        TabSetting tabSetting2;
        RepostTab repostTab;
        TabSetting tabSetting3;
        RepostTab repostTab2;
        TabSetting tabSetting4;
        RepostTab repostTab3;
        TabSetting tabSetting5;
        BATab bATab;
        ShopTab shopTab2;
        TabSetting tabSetting6;
        StickerTab stickerTab;
        TabSetting tabSetting7;
        ShopTab shopTab3;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    String uid = null;
                    String uid2 = null;
                    numValueOf = null;
                    numValueOf = null;
                    Integer numValueOf = null;
                    if (i != 6) {
                        if (i != 10) {
                            if (i != 12) {
                                switch (i) {
                                    case 14:
                                        if (user == null || (tabSetting7 = user.getTabSetting()) == null || (shopTab3 = tabSetting7.shopTab) == null || !shopTab3.showShopTab || !(!a0.LJJJIL(shopTab3.shopSchemaV2))) {
                                            return false;
                                        }
                                        return true;
                                    case 15:
                                        boolean zLIZJ = C1359600lU6.LIZJ();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("forbidCreateAndConsumeRepost=[");
                                        sbLIZ.append(zLIZJ);
                                        sbLIZ.append("] block=[");
                                        if (user != null) {
                                            boolValueOf = Boolean.valueOf(user.isBlock);
                                        } else {
                                            boolValueOf = null;
                                        }
                                        sbLIZ.append(boolValueOf);
                                        sbLIZ.append("]  showRepostSelf=[");
                                        if (user != null && (tabSetting4 = user.getTabSetting()) != null && (repostTab3 = tabSetting4.repostTab) != null) {
                                            numValueOf = Integer.valueOf(repostTab3.getShowRepostSelf());
                                        }
                                        sbLIZ.append(numValueOf);
                                        sbLIZ.append("] ");
                                        C1720106oR.LJI("repost_biz", C2188811AlT.LIZIZ(sbLIZ));
                                        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || zLIZJ || (user != null && user.isBlock)) {
                                            return false;
                                        }
                                        if (jr()) {
                                            if (user == null || (tabSetting3 = user.getTabSetting()) == null || (repostTab2 = tabSetting3.repostTab) == null || repostTab2.getShowRepostSelf() != C00AS.SHOW_TAB.ordinal()) {
                                                return false;
                                            }
                                            return true;
                                        }
                                        if (Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE) || user == null || (tabSetting2 = user.getTabSetting()) == null || (repostTab = tabSetting2.repostTab) == null || repostTab.getShowRepostOther() != C00AS.SHOW_TAB.ordinal()) {
                                            return false;
                                        }
                                        if (!user.getTabSetting().repostTab.getRepostShowForPublic() && !user.isAcquaintance && user.getFollowStatus() != 2) {
                                            return false;
                                        }
                                        return true;
                                    case 16:
                                        if (user == null || (tabSetting6 = user.getTabSetting()) == null || (stickerTab = tabSetting6.stickerTab) == null || !Intrinsics.LJFF(stickerTab.showStickerTab, Boolean.TRUE) || C19252910Tv.LIZIZ.LIZLLL().block().LIZIZ()) {
                                            return false;
                                        }
                                        return true;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        if (user == null) {
                                            return false;
                                        }
                                        TabSetting tabSetting8 = user.getTabSetting();
                                        if ((tabSetting8 != null && (shopTab2 = tabSetting8.shopTab) != null && shopTab2.showShopTab) || (tabSetting5 = user.getTabSetting()) == null || (bATab = tabSetting5.baTab) == null || !Intrinsics.LJFF(bATab.getShowBATab(), Boolean.TRUE)) {
                                            return false;
                                        }
                                        return true;
                                    default:
                                        if (user != null) {
                                            uid2 = user.getUid();
                                        }
                                        return at(uid2, i);
                                }
                            }
                            if (user == null || (tabSetting = user.getTabSetting()) == null || (shopTab = tabSetting.shopTab) == null || !shopTab.showShopTab || !a0.LJJJIL(shopTab.shopSchemaV2)) {
                                return false;
                            }
                            return true;
                        }
                        if (Vs(user) != 2 && Vs(user) != 3) {
                            return false;
                        }
                        return true;
                    }
                    if (jr() && C296260BjM.LIZ()) {
                        return false;
                    }
                    if (TextUtils.equals(Bq(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                        if (user != null) {
                            uid = user.getUid();
                        }
                        return at(uid, i);
                    }
                    if (user == null || !user.hasOpenFavorite || user.isBlock) {
                        return false;
                    }
                    return true;
                }
                if (user == null) {
                    return false;
                }
                return user.isShowEffectList();
            }
            return Us();
        }
        return Ps(user);
    }

    public boolean at(String str, int i) {
        if (C13LQ.LJJIJIIJI(Integer.valueOf(i), new Integer[]{0, 2, 6}) < 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC487330J9f
    public void onConfigurationChanged(Activity activity, Configuration configuration) {
        C0P0T sortToolTips;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJI().LJI()) {
            c19252910Tv.LIZLLL().LJI().LJJLI(this.LLJLLIL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp), Integer.valueOf(configuration.orientation));
        }
        if (c19252910Tv.LIZLLL().LJI().LLLII()) {
            C1257500ipQ c1257500ipQ = this.LLJLLL;
            if (c1257500ipQ != null && (sortToolTips = c1257500ipQ.getSortToolTips()) != null) {
                sortToolTips.dismiss();
            }
            C0P0T c0p0t = this.LLLFF;
            if (c0p0t != null) {
                c0p0t.dismiss();
            }
        }
    }

    public final void Cl2(final int i, final boolean z, boolean z2) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCurrentItem: position = ");
        sbLIZ.append(i);
        sbLIZ.append(", smoothScroll = ");
        sbLIZ.append(z);
        sbLIZ.append(", async = ");
        sbLIZ.append(z2);
        C1720106oR.LJI("AwemePagerAssem", C2188811AlT.LIZIZ(sbLIZ));
        C117P c117p = this.LLJZ;
        if (c117p != null) {
            c117p.setCurrentItem(i, z);
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.0ipk
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AwemePagerAssem@c9ce.setCurrentItem$runnable$1");
                try {
                    C20632315oP c20632315oP = this.LL.LLJZIJLIL;
                    if (c20632315oP != null) {
                        c20632315oP.LJ(i, z);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AwemePagerAssem@c9ce.setCurrentItem$runnable$1");
            }
        };
        if (z2) {
            C20632315oP c20632315oP = this.LLJZIJLIL;
            if (c20632315oP == null) {
                return;
            }
            HandlerHook.viewPost(c20632315oP, runnable);
            return;
        }
        runnable.run();
    }

    public void P5(int i, float f, int i2) {
        if (f != 0.0f) {
            this.LLJJIJIL = C12ES.LJIIJ(getContext()) / 3;
        }
        ProfileListFragment profileListFragment = this.LLLIILIL;
        if (profileListFragment != null) {
            profileListFragment.P5(i, f, i2);
        }
        this.LLJJJIL = true;
    }

    public static /* synthetic */ EffectProfileListFragment tp(AwemePagerAssem awemePagerAssem, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = -1;
            }
            return awemePagerAssem.sp(i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEffectFragment");
    }

    public static /* synthetic */ void Oo(AwemePagerAssem awemePagerAssem, int i, boolean z, int i2, Object obj) throws Throwable {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            awemePagerAssem.No(i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeTab");
    }

    public static /* synthetic */ ProfileListFragment Tp(AwemePagerAssem awemePagerAssem, int i, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return awemePagerAssem.Qp(i, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOriginalMusicListFragment");
    }

    public void Gq(int i, int i2, ProfileListFragment profileListFragment, ProfileListFragment profileListFragment2, boolean z) throws Throwable {
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleLegacyTabSelected: lastSelectedPosition = ");
        sbLIZ.append(i);
        sbLIZ.append(", selectedPosition = ");
        sbLIZ.append(i2);
        sbLIZ.append(", fromCallback = ");
        sbLIZ.append(z);
        C1720106oR.LJI("AwemePagerAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (profileListFragment2 instanceof CollectProfileListFragment) {
            String strLp = lp();
            CollectProfileListFragment collectProfileListFragment = (CollectProfileListFragment) profileListFragment2;
            collectProfileListFragment.LLJILJILJ = strLp;
            IFavoriteService iFavoriteServiceWS = collectProfileListFragment.wS();
            if (iFavoriteServiceWS != null) {
                iFavoriteServiceWS.LJJIJ(collectProfileListFragment.LLILZLL, strLp);
            }
            this.LLLI = false;
        }
        if (z) {
            if (profileListFragment != null) {
                profileListFragment.setUserVisibleHint(false);
                profileListFragment.uS(false);
                profileListFragment.Bp();
            }
        } else if (profileListFragment != null) {
            profileListFragment.uS(false);
            profileListFragment.Bp();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1253940ijg(profileListFragment2, z, null), 3);
    }

    public static /* synthetic */ void Vr(AwemePagerAssem awemePagerAssem, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            awemePagerAssem.Cl2(i, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCurrentItem");
    }

    public static /* synthetic */ void Iq(AwemePagerAssem awemePagerAssem, int i, int i2, ProfileListFragment profileListFragment, ProfileListFragment profileListFragment2, boolean z, int i3, Object obj) throws Throwable {
        if (obj == null) {
            if ((i3 & 16) != 0) {
                z = false;
            }
            awemePagerAssem.Gq(i, i2, profileListFragment, profileListFragment2, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleLegacyTabSelected");
    }
}
