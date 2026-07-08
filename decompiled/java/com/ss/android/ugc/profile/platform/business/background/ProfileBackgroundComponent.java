package com.ss.android.ugc.profile.platform.business.background;

import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C01GW;
import X.C01TT;
import X.C0PEM;
import X.C0TS5;
import X.C0XQ7;
import X.C1058540deW;
import X.C1223370hwN;
import X.C1245290iVj;
import X.C1245340iVo;
import X.C1248210iaR;
import X.C1248230iaT;
import X.C1248840ibS;
import X.C1248950ibd;
import X.C1249090ibr;
import X.C1250210idf;
import X.C1250920ieo;
import X.C1250940ieq;
import X.C1250950ier;
import X.C1250960ies;
import X.C1251010iex;
import X.C1251350ifV;
import X.C1251390ifZ;
import X.C1252220igu;
import X.C1254890ilD;
import X.C1256200inK;
import X.C1260280itu;
import X.C1287400jbe;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LZ;
import X.C1479570obb;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1484680ojq;
import X.C1510050pOl;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1720106oR;
import X.C1888907aZ;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2441009hQ;
import X.C259800zU;
import X.C291001Au;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C597430Nbx;
import X.C723580SZw;
import X.C724240Sb0;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1046760dLW;
import X.EnumC1248370iah;
import X.EnumC1253850ijX;
import X.InterfaceC1245310iVl;
import X.InterfaceC1250930iep;
import X.InterfaceC1251040if0;
import X.InterfaceC1260330itz;
import X.InterfaceC1484830ok5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS16S0200100_19;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.avatar.IAvatarAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgBizData;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgVideoInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.background.ProfileBackgroundComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBackgroundComponent extends BaseUIComponent implements IProfileBackgroundAbility, InterfaceC1251040if0 {
    public ProfileBgBizData LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public FrameLayout LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public SmartImageView LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public TuxNavBar LLJZ;
    public View LLJZIJLIL;
    public Drawable LLL;
    public Drawable LLLF;
    public Drawable LLLFF;
    public View LLLFFI;
    public C1260280itu LLLFZ;
    public C1256200inK LLLI;
    public InterfaceC1484830ok5 LLLII;
    public C1250960ies LLLIIII;
    public FrameLayout LLLIIIIL;
    public C1251010iex LLLIIIL;
    public boolean LLLIIL;
    public long LLLIILIL;
    public String LLLIL;
    public String LLLILZ;
    public Runnable LLLILZJ;
    public boolean LLLILZLLLI;
    public int LLLIZZ;
    public boolean LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public AnonymousClass0956 LLLLIIIILLL;
    public C1254890ilD LLLLIIL;
    public C1245290iVj LLLLIILL;
    public boolean LLLJ = true;
    public boolean LLLJIL = true;
    public final C1250940ieq LLLLIILLL = new C0TS5() { // from class: X.0ieq
        @Override // X.C0TS5
        public final void LIZ(List<String> list) {
            C1248210iaR.LJ("ProfileBackgroundComponent", "Received background update notification from global listener", EnumC1253850ijX.OTHERS, "");
            this.LIZ.Gp(list);
        }
    };
    public final C1559260qg8 LLLLIL = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "profile_background"), checkSupervisorPrepared());
    public final C01GW LLLLILI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2467));
    public final List<InterfaceC1250930iep> LLLLJ = new ArrayList();
    public final C1250920ieo LLLLJI = new InterfaceC1260330itz() { // from class: X.0ieo
        @Override // X.InterfaceC1260330itz
        public final boolean onScrollEnd() {
            return false;
        }

        @Override // X.InterfaceC1260330itz
        public final void onScrolled(float f, float f2) {
        }

        @Override // X.InterfaceC1260330itz
        public final void onScroll(int i, int i2) {
            INavbarBaseAbility iNavbarBaseAbility;
            TuxNavBar tuxNavBarBp0;
            C1256200inK c1256200inK;
            C1287400jbe c1287400jbe;
            boolean z = true;
            if (this.LL.VR1() || (c1256200inK = this.LL.LLLI) == null || ((c1287400jbe = c1256200inK.LIZIZ) != null && c1287400jbe.getVisibility() == 0)) {
                FrameLayout frameLayout = this.LL.LLJJLIIIJLLLLLLLZ;
                if (frameLayout != null) {
                    C786410Ut5.fd(frameLayout, -i);
                }
                ProfileBackgroundComponent profileBackgroundComponent = this.LL;
                if (profileBackgroundComponent.LLLIZZ <= 0) {
                    profileBackgroundComponent.Ap().getClass();
                    profileBackgroundComponent.LLLIZZ = (int) (C1248230iaT.LJFF() * 0.272f);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("checkStickyState, currentY = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", stickyThreshold = ");
                    sbLIZ.append(profileBackgroundComponent.LLLIZZ);
                    C1248210iaR.LIZIZ("ProfileBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (i < profileBackgroundComponent.LLLIZZ) {
                    z = false;
                }
                if (z != profileBackgroundComponent.LLLILZLLLI) {
                    profileBackgroundComponent.LLLILZLLLI = z;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("notifyStickyStateChanged: isSticky=");
                    sbLIZ2.append(z);
                    C1248210iaR.LJ("ProfileBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ2), EnumC1253850ijX.OTHERS, "");
                    Iterator it2 = ((ArrayList) profileBackgroundComponent.LLLLJ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1250930iep) it2.next()).v6(z);
                    }
                }
                ProfileBackgroundComponent profileBackgroundComponent2 = this.LL;
                profileBackgroundComponent2.getClass();
                Fragment fragmentLJI = C724240Sb0.LJI(profileBackgroundComponent2);
                if (fragmentLJI != null && (iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), INavbarBaseAbility.class, null)) != null && (tuxNavBarBp0 = iNavbarBaseAbility.Bp0()) != null) {
                    if (z) {
                        C786410Ut5.C5(tuxNavBarBp0, 1.0f);
                        return;
                    }
                    profileBackgroundComponent2.Ap().getClass();
                    float fLJFF = C1248230iaT.LJFF();
                    if (fLJFF <= 0.0f) {
                        return;
                    }
                    C786410Ut5.C5(tuxNavBarBp0, C13LZ.LIZLLL(i / fLJFF, 0.0f, 1.0f));
                }
            }
        }
    };

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1251040if0
    public final void s7() {
        C01TT.LIZLLL(AFwS207S0000000_19.get$arr$(6));
    }

    public static boolean Ep() {
        Integer num;
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_bytebench", 0, 2, null);
        Object feature$default = producer$default != null ? FeatureProducer.getFeature$default(producer$default, "overall_score_level", (JSONObject) null, "profile_background", (ReturnCode) null, 10, (Object) null) : null;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isLowerDevice score: ");
        sbLIZ.append(feature$default);
        C1720106oR.LJI("ProfileBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ));
        return (feature$default instanceof Integer) && (num = (Integer) feature$default) != null && num.intValue() == 0;
    }

    public final C1248230iaT Ap() {
        return (C1248230iaT) this.LLLLILI.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        C1251350ifV state;
        C1251350ifV state2;
        C291001Au<Boolean> c291001Au;
        boolean z = true;
        if (this.LLJJIII) {
            ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
            this.LLLJIL = !((profilePlatformViewModelZo == null || (state2 = profilePlatformViewModelZo.getState()) == null || (c291001Au = state2.LL) == null) ? false : c291001Au.LIZ.booleanValue());
            ProfilePlatformViewModel profilePlatformViewModelZo2 = Zo();
            if (profilePlatformViewModelZo2 != null) {
                profilePlatformViewModelZo2.JQ2(new AwS598S0100000_19(this, 468));
                return;
            }
            return;
        }
        ProfilePlatformViewModel profilePlatformViewModelZo3 = Zo();
        if (profilePlatformViewModelZo3 != null && (state = profilePlatformViewModelZo3.getState()) != null) {
            z = state.LLJJIJIL;
        }
        this.LLLJ = z;
        ProfilePlatformViewModel profilePlatformViewModelZo4 = Zo();
        if (profilePlatformViewModelZo4 != null) {
            profilePlatformViewModelZo4.TQ2(new AwS598S0100000_19(this, 469));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility
    public final String Hn2() {
        ProfileBgInfo profileBgInfo;
        ProfileBgVideoInfo videoInfo;
        Aweme awemeInfo;
        ProfileBgBizData profileBgBizData = this.LLJJL;
        if (profileBgBizData == null || (profileBgInfo = profileBgBizData.getProfileBgInfo()) == null || (videoInfo = profileBgInfo.getVideoInfo()) == null || (awemeInfo = videoInfo.getAwemeInfo()) == null) {
            return null;
        }
        return awemeInfo.getAid();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View view = this.LLJJ;
        if (view != null) {
            ViewParent parent = view.getParent();
            getHost();
            if (parent != this) {
                ViewParent parent2 = view.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup2);
                }
                View viewLJJIJL = LJJIJL();
                if (!(viewLJJIJL instanceof FrameLayout) || (viewGroup = (ViewGroup) viewLJJIJL) == null) {
                    return;
                }
                viewGroup.addView(view);
            }
        }
    }

    public final void LJJLIIIJLLLLLLLZ() {
        this.LLLIILIL++;
        this.LLLIL = null;
        this.LLLILZ = null;
        yp(this.LLJL);
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLLII;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
            C1251010iex c1251010iex = this.LLLIIIL;
            if (c1251010iex != null) {
                interfaceC1484830ok5.LJJIIZ(c1251010iex);
            }
            C1250960ies c1250960ies = this.LLLIIII;
            if (c1250960ies != null) {
                interfaceC1484830ok5.LJIIJJI(c1250960ies);
            }
            interfaceC1484830ok5.release();
        }
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
        this.LLLIIL = false;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        Context context;
        C19EG c19eg;
        Fragment fragmentLJI;
        Integer numValueOf;
        ProfileBgBizData profileBgBizData = this.LLJJL;
        InterfaceC1245310iVl interfaceC1245310iVl = null;
        ProfileBgInfo profileBgInfo = profileBgBizData != null ? profileBgBizData.getProfileBgInfo() : null;
        boolean z = profileBgInfo != null && profileBgInfo.hasBackground();
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 == null) {
            return;
        }
        if (profileBgInfo != null && (numValueOf = Integer.valueOf(profileBgInfo.getMediaType())) != null) {
            if (numValueOf.intValue() == 1) {
                interfaceC1245310iVl = this.LLLLIIL;
            } else if (numValueOf.intValue() == 2) {
                interfaceC1245310iVl = this.LLLLIILL;
            }
        }
        boolean z2 = this.LLJJIII;
        if (!z2) {
            if (!z || interfaceC1245310iVl == null) {
                return;
            }
            interfaceC1245310iVl.LIZJ(fragmentLJI2, profileBgInfo, false, this.LLJLL);
            return;
        }
        if (z && interfaceC1245310iVl != null) {
            interfaceC1245310iVl.LIZJ(fragmentLJI2, profileBgInfo, true, this.LLJLL);
            return;
        }
        C1251390ifZ.LIZ.getClass();
        if (!C1251390ifZ.LIZIZ(z2) || (context = LJJIJL().getContext()) == null || !(context instanceof C19EG) || (c19eg = (C19EG) context) == null || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return;
        }
        C1223370hwN.LIZ(c19eg, c19eg.getString(2131845386), new AwS420S0200000_19(this, fragmentLJI, 13), new AwS420S0200000_19(this, fragmentLJI, 14), "personal_homepage", "Click Social Avatar Edit Action Sheet");
    }

    public final void Qp() {
        String str;
        InterfaceC1484830ok5 interfaceC1484830ok5;
        FrameLayout frameLayout;
        String str2 = this.LLLIL;
        if (str2 == null || (str = this.LLLILZ) == null || (interfaceC1484830ok5 = this.LLLII) == null || (frameLayout = this.LLJL) == null) {
            return;
        }
        yp(frameLayout);
        Xp(interfaceC1484830ok5, str2, str);
        Up(frameLayout, this.LLLIILIL);
    }

    public final void Tp() {
        View view = this.LLJLLL;
        if (view != null) {
            view.setBackground(this.LLL);
        }
        TuxNavBar tuxNavBar = this.LLJZ;
        if (tuxNavBar != null) {
            tuxNavBar.setBackground(this.LLLF);
        }
        View view2 = this.LLJZIJLIL;
        if (view2 != null) {
            view2.setBackground(this.LLLFF);
        }
        this.LLLL = false;
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility
    public final boolean VR1() {
        ProfileBgInfo profileBgInfo;
        ProfileBgBizData profileBgBizData = this.LLJJL;
        return (profileBgBizData == null || (profileBgInfo = profileBgBizData.getProfileBgInfo()) == null || !profileBgInfo.hasBackground()) ? false : true;
    }

    public final void aq() {
        this.LLLIILIL++;
        this.LLLIL = null;
        this.LLLILZ = null;
        yp(this.LLJL);
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLLII;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLLII;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.stop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void bp() {
        C1249090ibr c1249090ibr = (C1249090ibr) this.LLLLIL.getValue();
        ProfileComponents profileComponents = c1249090ibr != null ? (ProfileComponents) c1249090ibr.LL : null;
        this.LLJJJ = profileComponents;
        if (profileComponents == null) {
            profileComponents = new ProfileComponents();
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        this.LLJJI = new C1248950ibd(0, profileComponents, str);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IProfileBackgroundAbility.class, null, null);
            INavBarActionAbility iNavBarActionAbility = (INavBarActionAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), INavBarActionAbility.class, null);
            if (iNavBarActionAbility != null) {
                iNavBarActionAbility.sN0(this.assemTagInternal);
            } else {
                C1248210iaR.LIZJ("ProfileBackgroundComponent", "initBaseData: no nav bar action ability found", EnumC1253850ijX.OTHERS, "");
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initBaseData: hasBackground=");
        sbLIZ.append(VR1());
        C1248210iaR.LJ("ProfileBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void dp() {
        ProfileComponents profileComponents;
        n nVar;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd == null || (profileComponents = c1248950ibd.LLILLJJLI) == null || (nVar = profileComponents.bizData) == null) {
            this.LLLLII = false;
        } else {
            Jp(nVar);
        }
    }

    public final void dq() {
        Fragment fragmentLJI;
        IAvatarAbility iAvatarAbility;
        if (this.LLLJL || (fragmentLJI = C724240Sb0.LJI(this)) == null || (iAvatarAbility = (IAvatarAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IAvatarAbility.class, null)) == null) {
            return;
        }
        iAvatarAbility.z70(this);
        this.LLLJL = true;
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility
    public final void f2() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateComponentUIAndData isBizDataParsing ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C1720106oR.LJI("ProfileBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIII) {
            LJJLIIIJLLLLLLLZ();
        } else {
            aq();
        }
        FrameLayout frameLayout = this.LLJL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJLIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        SmartImageView smartImageView2 = this.LLJLILLLLZIIL;
        if (smartImageView2 != null) {
            smartImageView2.setImageDrawable(null);
        }
        iq(false);
        FrameLayout frameLayout3 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(8, frameLayout3);
        }
        Tp();
        this.LLJJL = null;
        Fp(false);
    }

    public final void fq() {
        ProfileBgBizData profileBgBizData;
        ProfileBgInfo profileBgInfo;
        boolean autoPlay;
        FrameLayout frameLayout;
        Boolean autoPlay2;
        if ((this.LLJJIII ? this.LLLJIL : this.LLLJ) && (profileBgBizData = this.LLJJL) != null && (profileBgInfo = profileBgBizData.getProfileBgInfo()) != null && profileBgInfo.isVideo()) {
            ProfileBgBizData profileBgBizData2 = this.LLJJL;
            if (profileBgBizData2 == null || (autoPlay2 = profileBgBizData2.getAutoPlay()) == null) {
                ProfileBgVideoInfo videoInfo = profileBgInfo.getVideoInfo();
                autoPlay = videoInfo != null ? videoInfo.getAutoPlay() : true;
            } else {
                autoPlay = autoPlay2.booleanValue();
            }
            if (this.LLJJIII) {
                if (!autoPlay) {
                    return;
                }
            } else if (Ep() || !autoPlay) {
                return;
            }
            if (!this.LLLIIL || this.LLLIL == null) {
                Wp(profileBgInfo);
                return;
            }
            InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLLII;
            if (interfaceC1484830ok5 == null || (frameLayout = this.LLJL) == null) {
                return;
            }
            yp(frameLayout);
            interfaceC1484830ok5.resume();
            Up(frameLayout, this.LLLIILIL);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        ProfileBgInfo profileBgInfo;
        FrameLayout frameLayout;
        UserProfileInfo userProfileInfo;
        C1252220igu otherParams;
        UserProfileInfo userProfileInfo2;
        String uid;
        Fragment fragmentLJI;
        View view;
        Fragment fragmentLJI2;
        View view2;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileBackgroundComponent", "updateComponentUIAndData");
        if (this.LLLLII) {
            C1720106oR.LJI("ProfileBackgroundComponent", "updateComponentUIAndData isBizDataParsing");
            return;
        }
        ProfileBgBizData profileBgBizData = this.LLJJL;
        final String curUserId = null;
        if (profileBgBizData == null || (profileBgInfo = profileBgBizData.getProfileBgInfo()) == null || !profileBgInfo.hasBackground()) {
            f2();
            return;
        }
        if (!this.LLLL && (fragmentLJI2 = C724240Sb0.LJI(this)) != null && (view2 = fragmentLJI2.getView()) != null) {
            this.LLJLLL = view2.findViewById(R.id.w0u);
            this.LLJZ = (TuxNavBar) view2.findViewById(R.id.p15);
            this.LLJZIJLIL = view2.findViewById(R.id.t25);
            if (this.LLL == null) {
                View view3 = this.LLJLLL;
                this.LLL = view3 != null ? view3.getBackground() : null;
            }
            if (this.LLLF == null) {
                TuxNavBar tuxNavBar = this.LLJZ;
                this.LLLF = tuxNavBar != null ? tuxNavBar.getBackground() : null;
            }
            if (this.LLLFF == null) {
                View view4 = this.LLJZIJLIL;
                this.LLLFF = view4 != null ? view4.getBackground() : null;
            }
            View view5 = this.LLJLLL;
            if (view5 != null) {
                view5.setBackgroundColor(0);
            }
            TuxNavBar tuxNavBar2 = this.LLJZ;
            if (tuxNavBar2 != null) {
                tuxNavBar2.setNavBackground(0);
            }
            TuxNavBar tuxNavBar3 = this.LLJZ;
            if (tuxNavBar3 != null) {
                tuxNavBar3.setBackground(null);
            }
            View view6 = this.LLJZIJLIL;
            if (view6 != null) {
                view6.setBackground(null);
            }
            this.LLLL = true;
        }
        C1260280itu c1260280itu = this.LLLFZ;
        if ((c1260280itu != null || ((fragmentLJI = C724240Sb0.LJI(this)) != null && (view = fragmentLJI.getView()) != null && (c1260280itu = (C1260280itu) view.findViewById(R.id.u30)) != null)) && (frameLayout = this.LLJJLIIIJLLLLLLLZ) != null) {
            C786410Ut5.fd(frameLayout, -c1260280itu.getCurScrollY());
        }
        FrameLayout frameLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        if (profileBgInfo.isVideo()) {
            Wp(profileBgInfo);
        } else if (profileBgInfo.isImage()) {
            Vp(profileBgInfo);
        } else {
            Bp();
        }
        Fp(true);
        if (this.LLJJIII) {
            ProfileCommonInfo profileCommonInfoVo = Vo();
            if (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null || (curUserId = userProfileInfo.getUid()) == null) {
                curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            }
        } else {
            ProfileCommonInfo profileCommonInfoVo2 = Vo();
            if (profileCommonInfoVo2 == null || (userProfileInfo2 = profileCommonInfoVo2.getUserProfileInfo()) == null || (uid = userProfileInfo2.getUid()) == null) {
                UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), UserProfileAbility.class, null);
                if (userProfileAbility != null && (otherParams = userProfileAbility.getOtherParams()) != null) {
                    curUserId = otherParams.LIZ;
                }
            } else {
                curUserId = uid;
            }
        }
        C1245340iVo c1245340iVo = C1245340iVo.LIZ;
        final boolean z = this.LLJJIII;
        final EnumC1248370iah enumC1248370iah = EnumC1248370iah.BACKGROUND;
        c1245340iVo.getClass();
        Runnable runnable = new Runnable() { // from class: X.0iVn
            public final void LIZ() {
                Set<String> set;
                if (z) {
                    C1245340iVo.LIZ.getClass();
                    Set<String> set2 = C1245340iVo.LJIIL.get(enumC1248370iah);
                    if (set2 == null) {
                        return;
                    }
                    set2.clear();
                    return;
                }
                String str = curUserId;
                if (str == null || str.length() == 0) {
                    return;
                }
                C1245340iVo.LIZ.getClass();
                ConcurrentHashMap<EnumC1248370iah, Set<String>> concurrentHashMap = C1245340iVo.LJIIIZ.get(curUserId);
                if (concurrentHashMap == null || (set = concurrentHashMap.get(enumC1248370iah)) == null) {
                    return;
                }
                set.clear();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resetInfoForFeature clear: ");
                sbLIZ.append(enumC1248370iah);
                sbLIZ.append(", uid: ");
                sbLIZ.append(curUserId);
                C1248210iaR.LJ("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ProfileInfoCollectHelper@dae2.resetInfoForFeature$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.resetInfoForFeature$runnable$1");
            }
        };
        if (Intrinsics.LJFF(C786410Ut5.u3().getName(), "report_collect_thread")) {
            runnable.run();
        } else {
            C1248840ibS.LIZ.getClass();
            C1248840ibS.LIZIZ.submit(new ARunnableS103S0100000_3((Object) runnable, 169));
        }
        op(Boolean.TRUE);
    }

    public final void Bp() {
        aq();
        FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideBackground: ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C1720106oR.LJI("ProfileBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ));
        FrameLayout frameLayout2 = this.LLJL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        FrameLayout frameLayout3 = this.LLJLIL;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(8, frameLayout3);
        }
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        SmartImageView smartImageView2 = this.LLJLL;
        if (smartImageView2 != null) {
            C786410Ut5.LLFF(8, smartImageView2);
        }
        View view = this.LLJLLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLLFFI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        SmartImageView smartImageView3 = this.LLJLILLLLZIIL;
        if (smartImageView3 != null) {
            smartImageView3.setImageDrawable(null);
        }
        iq(false);
        SmartImageView smartImageView4 = this.LLJLL;
        if (smartImageView4 != null) {
            smartImageView4.setImageDrawable(null);
        }
        Tp();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLLLIIIILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLLIIIILLL = null;
        this.LLLLII = false;
        LJJLIIIJLLLLLLLZ();
        Tp();
        C1260280itu c1260280itu = this.LLLFZ;
        if (c1260280itu != null) {
            c1260280itu.LJIIIIZZ(this.LLLLJI);
        }
        this.LLLFZ = null;
        Fp(false);
        C1256200inK c1256200inK = this.LLLI;
        if (c1256200inK != null) {
            C1287400jbe c1287400jbe = c1256200inK.LIZIZ;
            if (c1287400jbe != null) {
                C786410Ut5.LLLZIIL(c1287400jbe, 8);
            }
            c1256200inK.LIZJ = false;
            c1256200inK.LIZIZ = null;
            c1256200inK.LIZLLL = false;
            ((ArrayList) C1256200inK.LJ).clear();
        }
        C1254890ilD c1254890ilD = this.LLLLIIL;
        if (c1254890ilD != null) {
            c1254890ilD.LIZLLL();
            c1254890ilD.LLJI = null;
            c1254890ilD.LLILZIL = null;
        }
        ((ArrayList) C1254890ilD.LLJIJIL).remove(this.LLLLIILLL);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IProfileBackgroundAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        yp(this.LLJL);
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLLII;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        ProfileBgInfo profileBgInfo;
        InterfaceC1484830ok5 interfaceC1484830ok5;
        FrameLayout frameLayout;
        super.onResume();
        ProfileBgBizData profileBgBizData = this.LLJJL;
        if (profileBgBizData == null || (profileBgInfo = profileBgBizData.getProfileBgInfo()) == null || !profileBgInfo.isVideo() || !this.LLLIIL || this.LLLIL == null) {
            return;
        }
        if (!(this.LLJJIII ? this.LLLJIL : this.LLLJ) || (interfaceC1484830ok5 = this.LLLII) == null || (frameLayout = this.LLJL) == null) {
            return;
        }
        yp(frameLayout);
        interfaceC1484830ok5.resume();
        Up(frameLayout, this.LLLIILIL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        dq();
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility
    public final boolean Cw0() {
        return this.LLLILZLLLI;
    }

    public static ProfileBgBizData Ip(String str) {
        try {
            return (ProfileBgBizData) C1250210idf.LIZ(str, ProfileBgBizData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseComponentBizData failed: ");
            sbLIZ.append(e.getMessage());
            C1720106oR.LIZ("ProfileBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.07aZ] */
    public static C1888907aZ up(ProfileBgBizData profileBgBizData) {
        ProfileBgInfo profileBgInfo;
        final String aid;
        Aweme awemeInfo;
        final Integer numValueOf = null;
        if (profileBgBizData == null || (profileBgInfo = profileBgBizData.getProfileBgInfo()) == null) {
            return null;
        }
        final int mediaType = profileBgInfo.getMediaType();
        final Boolean autoPlay = profileBgBizData.getAutoPlay();
        if (autoPlay == null) {
            ProfileBgVideoInfo videoInfo = profileBgInfo.getVideoInfo();
            if (videoInfo != null) {
                autoPlay = Boolean.valueOf(videoInfo.getAutoPlay());
            } else {
                autoPlay = null;
            }
        }
        ProfileBgVideoInfo videoInfo2 = profileBgInfo.getVideoInfo();
        if (videoInfo2 != null && (awemeInfo = videoInfo2.getAwemeInfo()) != null) {
            aid = awemeInfo.getAid();
        } else {
            aid = null;
        }
        ProfileBgVideoInfo videoInfo3 = profileBgInfo.getVideoInfo();
        if (videoInfo3 != null) {
            numValueOf = Integer.valueOf((int) (C13LZ.LIZLLL(videoInfo3.getOffsetYRatio(), 0.0f, 1.0f) * 10000));
        }
        final List<String> imageUrlList = profileBgInfo.getImageUrlList();
        return new Object(mediaType, autoPlay, aid, numValueOf, imageUrlList) { // from class: X.07aZ
            public final int LIZ;
            public final Boolean LIZIZ;
            public final String LIZJ;
            public final Integer LIZLLL;
            public final List<String> LJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1888907aZ)) {
                    return false;
                }
                C1888907aZ c1888907aZ = (C1888907aZ) obj;
                return this.LIZ == c1888907aZ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1888907aZ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1888907aZ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1888907aZ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1888907aZ.LJ);
            }

            public final int hashCode() {
                int i = this.LIZ * 31;
                Boolean bool = this.LIZIZ;
                int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
                String str = this.LIZJ;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.LIZLLL;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                List<String> list = this.LJ;
                return iHashCode3 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BackgroundContentSignature(mediaType=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", autoPlay=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", awemeId=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", offsetRatio=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", imageUrls=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = mediaType;
                this.LIZIZ = autoPlay;
                this.LIZJ = aid;
                this.LIZLLL = numValueOf;
                this.LJ = imageUrlList;
            }
        };
    }

    public final void Fp(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyBackgroundChanged: hasBackground=");
        sbLIZ.append(z);
        C1248210iaR.LJ("ProfileBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
        Iterator it2 = ((ArrayList) this.LLLLJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1250930iep) it2.next()).me(z);
        }
    }

    public final void Gp(List<String> list) {
        ArrayList arrayList;
        C1248210iaR.LIZIZ("ProfileBackgroundComponent", "onBackgroundComplete");
        ProfileBgInfo profileBgInfo = new ProfileBgInfo();
        profileBgInfo.setMediaType(1);
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        profileBgInfo.setImageUrlList(arrayList);
        Vp(profileBgInfo);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        boolean z;
        boolean z2;
        boolean z3;
        FrameLayout frameLayout;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileBackgroundComponent", "updateDataWhenUserUpdate");
        this.LLJJJ = profileComponents;
        C1248950ibd c1248950ibd = this.LLJJI;
        if (c1248950ibd != null) {
            c1248950ibd.LLILLJJLI = profileComponents;
        }
        n nVar = profileComponents.bizData;
        if (nVar == null) {
            this.LLLLII = false;
            AnonymousClass0956 anonymousClass0956 = this.LLLLIIIILLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            f2();
            return;
        }
        if (Intrinsics.LJFF(up(Ip(nVar.toString())), up(this.LLJJL))) {
            SmartImageView smartImageView = this.LLJLL;
            if (smartImageView != null && smartImageView.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            SmartImageView smartImageView2 = this.LLJLILLLLZIIL;
            if (smartImageView2 != null && smartImageView2.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            FrameLayout frameLayout2 = this.LLJL;
            if (frameLayout2 != null && frameLayout2.getVisibility() == 0 && (frameLayout = this.LLJLIL) != null && frameLayout.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            FrameLayout frameLayout3 = this.LLJJLIIIJLLLLLLLZ;
            if (frameLayout3 != null && frameLayout3.getVisibility() == 0 && (z || z2 || z3)) {
                C1720106oR.LJI("ProfileBackgroundComponent", "updateDataWhenUserUpdate background signature unchanged");
                return;
            }
        }
        Jp(nVar);
    }

    public final void Jp(n nVar) {
        LifecycleCoroutineScope lifecycleScope;
        this.LLLLII = true;
        AnonymousClass0956 anonymousClass0956 = this.LLLLIIIILLL;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentLJI)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C597430Nbx(nVar, this, null), 2);
        }
        this.LLLLIIIILLL = anonymousClass0956LIZLLL;
    }

    @Override // X.InterfaceC1251040if0
    public final void Rj(C427660Gpo c427660Gpo) {
        C1248210iaR.LJ("ProfileBackgroundComponent", "onAvatarComplete", EnumC1253850ijX.OTHERS, "");
        C01TT.LIZLLL(new AwS420S0200000_19(this, c427660Gpo, 12));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        Ap().getClass();
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, C1248230iaT.LJFF()));
        C786410Ut5.LJZ(8, frameLayout);
        this.LLJJLIIIJLLLLLLLZ = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        Ap().getClass();
        C786410Ut5.a6(frameLayout2, new FrameLayout.LayoutParams(-1, C1248230iaT.LJ(), 48));
        frameLayout2.setClipChildren(true);
        frameLayout2.setClipToPadding(true);
        C786410Ut5.LJZ(8, frameLayout2);
        this.LLJL = frameLayout2;
        FrameLayout frameLayout3 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout3 != null) {
            frameLayout3.addView(frameLayout2);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        C786410Ut5.a6(frameLayout4, new FrameLayout.LayoutParams(-1, -1, 48));
        this.LLJLIL = frameLayout4;
        FrameLayout frameLayout5 = this.LLJL;
        if (frameLayout5 != null) {
            frameLayout5.addView(frameLayout4);
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Ap().getClass();
        C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(-1, C1248230iaT.LJ(), 48));
        smartImageView.setBackgroundColor(0);
        C786410Ut5.LLFF(8, smartImageView);
        this.LLJLILLLLZIIL = smartImageView;
        FrameLayout frameLayout6 = this.LLJL;
        if (frameLayout6 != null) {
            frameLayout6.addView(smartImageView);
        }
        SmartImageView smartImageView2 = new SmartImageView(context);
        smartImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Ap().getClass();
        C786410Ut5.G6(smartImageView2, new FrameLayout.LayoutParams(-1, C1248230iaT.LJ(), 48));
        this.LLJLL = smartImageView2;
        FrameLayout frameLayout7 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout7 != null) {
            frameLayout7.addView(smartImageView2);
        }
        View view = new View(context);
        Ap().getClass();
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(190)), 48));
        view.setBackground(zp(this, null, null, 7));
        this.LLJLLIL = view;
        FrameLayout frameLayout8 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout8 != null) {
            frameLayout8.addView(view);
        }
        View view2 = new View(getContext());
        view2.setBackground(zp(this, new float[]{0.0f, 0.3f, 0.6f, 1.0f}, new float[]{0.1f, 0.1f, 1.0f, 1.0f}, 4));
        Ap().getClass();
        C786410Ut5.W5(view2, new FrameLayout.LayoutParams(-1, C1248230iaT.LJFF(), 80));
        if (Build.VERSION.SDK_INT >= 31) {
            Ap().getClass();
            Ap().getClass();
            view2.setRenderEffect(RenderEffect.createBlurEffect(100.0f, 100.0f, Shader.TileMode.CLAMP));
        }
        this.LLLFFI = view2;
        FrameLayout frameLayout9 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout9 != null) {
            frameLayout9.addView(view2);
        }
        Ap().getClass();
        int iLJFF = C1248230iaT.LJFF();
        C1256200inK c1256200inK = new C1256200inK(context, iLJFF);
        this.LLLI = c1256200inK;
        FrameLayout frameLayout10 = this.LLJJLIIIJLLLLLLLZ;
        if (frameLayout10 != null) {
            C1287400jbe c1287400jbe = new C1287400jbe(context, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iLJFF);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1287400jbe);
            c1287400jbe.setLayoutParams(layoutParams);
            C786410Ut5.LLLZIIL(c1287400jbe, 8);
            c1256200inK.LIZIZ = c1287400jbe;
            frameLayout10.addView(c1287400jbe);
        }
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final void Vp(ProfileBgInfo profileBgInfo) {
        aq();
        iq(false);
        FrameLayout frameLayout = this.LLJL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJLIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        SmartImageView smartImageView2 = this.LLJLL;
        if (smartImageView2 != null) {
            C786410Ut5.LLFF(0, smartImageView2);
        }
        View view = this.LLJLLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLLFFI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        SmartImageView smartImageView3 = this.LLJLL;
        if (smartImageView3 != null) {
            Ap().getClass();
            C786410Ut5.G6(smartImageView3, new FrameLayout.LayoutParams(-1, C1248230iaT.LJ(), 48));
        }
        SmartImageView smartImageView4 = this.LLJLL;
        if (smartImageView4 != null) {
            smartImageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        SmartImageView smartImageView5 = this.LLJLL;
        if (smartImageView5 != null) {
            C786410Ut5.td(smartImageView5, 0.0f);
        }
        SmartImageView smartImageView6 = this.LLJLL;
        if (smartImageView6 != null) {
            smartImageView6.setImageMatrix(new Matrix());
        }
        FrameLayout frameLayout3 = this.LLJL;
        if (frameLayout3 != null) {
            C786410Ut5.fd(frameLayout3, 0.0f);
        }
        FrameLayout frameLayout4 = this.LLJLIL;
        if (frameLayout4 != null) {
            C786410Ut5.fd(frameLayout4, 0.0f);
        }
        List<String> imageUrlList = profileBgInfo.getImageUrlList();
        if (imageUrlList != null && !imageUrlList.isEmpty()) {
            try {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel("", imageUrlList));
                c1331670kl3LJIIIIZZ.LJJ(this.LLJLL);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showImageBackground failed: ");
                sbLIZ.append(e.getMessage());
                C1248210iaR.LIZJ("ProfileBackgroundComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wp(final com.ss.android.ugc.profile.platform.base.data.ProfileBgInfo r23) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.background.ProfileBackgroundComponent.Wp(com.ss.android.ugc.profile.platform.base.data.ProfileBgInfo):void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility
    public final void Z00(InterfaceC1250930iep interfaceC1250930iep) {
        ((ArrayList) this.LLLLJ).remove(interfaceC1250930iep);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility
    public final void cR(InterfaceC1250930iep interfaceC1250930iep) {
        if (!((ArrayList) this.LLLLJ).contains(interfaceC1250930iep)) {
            ((ArrayList) this.LLLLJ).add(interfaceC1250930iep);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            Jp(nVar);
            return;
        }
        this.LLLLII = false;
        ProfileBgBizData profileBgBizDataIp = Ip(nVar.toString());
        this.LLJJL = profileBgBizDataIp;
        this.LLJJIJIIJIL = profileBgBizDataIp;
    }

    public final void iq(boolean z) {
        Context context;
        Integer numLIZJ;
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            int iIntValue = 0;
            if (z && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            smartImageView.setBackgroundColor(iIntValue);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1260280itu c1260280itu;
        View viewCP;
        View viewFindViewById;
        View viewCP2;
        super.onViewCreated(view);
        dq();
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null && (viewCP2 = iProfileBaseAbility.cP()) != null) {
            c1260280itu = (C1260280itu) viewCP2.findViewById(R.id.u30);
        } else {
            c1260280itu = null;
        }
        this.LLLFZ = c1260280itu;
        if (c1260280itu != null) {
            c1260280itu.LJ(this.LLLLJI);
        }
        IProfileBaseAbility iProfileBaseAbility2 = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility2 != null && (viewCP = iProfileBaseAbility2.cP()) != null && (viewFindViewById = viewCP.findViewById(R.id.s5p)) != null) {
            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 5), viewFindViewById);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            this.LLLLIIL = new C1254890ilD(fragmentLJI, null, false, new AwS598S0100000_19(this, 39), 6);
            this.LLLLIILL = new C1245290iVj();
            C1250940ieq c1250940ieq = this.LLLLIILLL;
            ArrayList arrayList = (ArrayList) C1254890ilD.LLJIJIL;
            if (!arrayList.contains(c1250940ieq)) {
                arrayList.add(c1250940ieq);
            }
        }
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            AssemViewModel.selectSubscribe$default(profilePlatformViewModelZo, new C2217381BqS() { // from class: X.0iet
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLLF;
                }
            }, C736820SvI.LIZLLL(), null, null, new AwS598S0100000_19(new AwS598S0100000_19(this, 470), 5), 12, null);
        }
        ProfilePlatformViewModel profilePlatformViewModelZo2 = Zo();
        if (profilePlatformViewModelZo2 != null) {
            profilePlatformViewModelZo2.IQ2(new AwS598S0100000_19(this, 471));
        }
    }

    public final void yp(FrameLayout frameLayout) {
        Runnable runnable = this.LLLILZJ;
        if (runnable != null && frameLayout != null) {
            HandlerHook.viewRemoveCallbacks(frameLayout, runnable);
        }
        this.LLLILZJ = null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, Y.ARunnableS16S0200100_19, java.lang.Runnable] */
    public final void Up(FrameLayout frameLayout, long j) {
        C259800zU c259800zU = new C259800zU();
        ?? aRunnableS16S0200100_19 = new ARunnableS16S0200100_19(j, this, c259800zU, 0);
        c259800zU.element = aRunnableS16S0200100_19;
        this.LLLILZJ = aRunnableS16S0200100_19;
        HandlerHook.viewPostDelay(frameLayout, aRunnableS16S0200100_19, 15000L);
    }

    public static void Xp(InterfaceC1484830ok5 interfaceC1484830ok5, String str, String str2) {
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = str;
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZLLL = Collections.singletonList(str2);
        C1482580ogS c1482580ogSLIZ = c1058540deW.LIZ();
        C1482570ogR c1482570ogRLIZ = c1482580ogSLIZ.LIZ();
        c1482570ogRLIZ.LIZ(EnumC1046760dLW.VIDEO);
        C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
        c1479570obb.LIZIZ = false;
        c1479570obb.LJJ = true;
        c1482570ogRLIZ.LIZ.LJ = c1482570ogRLIZ;
        interfaceC1484830ok5.stop();
        interfaceC1484830ok5.LJ(new C1484680ojq(c1482580ogSLIZ).LIZ());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, int[]] */
    public static PaintDrawable zp(ProfileBackgroundComponent profileBackgroundComponent, final float[] fArr, float[] fArr2, int i) {
        int iIntValue;
        Integer numLIZJ;
        if ((i & 1) != 0) {
            fArr = C1250950ier.LIZ;
        }
        if ((i & 2) != 0) {
            fArr2 = C1250950ier.LIZIZ;
        }
        Context context = profileBackgroundComponent.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = null;
        int length = fArr.length;
        ?? r3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            r3[i2] = C2441009hQ.LJIIL(iIntValue, (int) (fArr2[i2] * 255));
        }
        c259800zU.element = r3;
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.0GtS
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public final Shader resize(int i3, int i4) {
                return new LinearGradient(0.0f, 0.0f, 0.0f, i4, c259800zU.element, fArr, Shader.TileMode.CLAMP);
            }
        });
        return paintDrawable;
    }
}
