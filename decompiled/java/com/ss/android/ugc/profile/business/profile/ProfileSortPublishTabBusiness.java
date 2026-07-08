package com.ss.android.ugc.profile.business.profile;

import X.C09R7;
import X.C1252710ihh;
import X.C1253930ijf;
import X.C1257500ipQ;
import X.C1257530ipT;
import X.C1257950iq9;
import X.C1258010iqF;
import X.C13LE;
import X.C19719912Dl;
import X.C19U0;
import X.C2217381BqS;
import X.C724710Sbl;
import X.EnumC1248370iah;
import X.EnumC1257740ipo;
import X.EnumC2666011k;
import X.InterfaceC1252070igf;
import X.InterfaceC724720Sbm;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS88S0200000_19;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM;
import java.util.Locale;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileSortPublishTabBusiness extends ProfileTabBaseBusiness {
    public final C1257500ipQ LLILLL;
    public final View LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final String getName() {
        return "profile_tab_public_post";
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final boolean iI0() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void Oq(C19U0 c19u0) {
        if (c19u0 != null && c19u0.LIZ != null) {
            HandlerHook.viewPostDelay(c19u0.LJIIIIZZ, new ARunnableS88S0200000_19(this, c19u0, 25), 50L);
            return;
        }
        this.LLILZIL = false;
        C1257500ipQ c1257500ipQ = this.LLILLL;
        boolean z = true;
        if (c1257500ipQ == null || c1257500ipQ.getLandingTabType() != 0 || !this.LLILZLL) {
            z = false;
        }
        this.LLIZ = z;
        this.LLILZLL = false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void Yn(C19U0 c19u0) {
        if (c19u0 != null && c19u0.LIZ != null && Intrinsics.LJFF(c19u0.LIZ, 0)) {
            HandlerHook.viewPostDelay(c19u0.LJIIIIZZ, new ARunnableS119S0100000_19(this, 101), 50L);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void st2(View view) {
        AwemePagerVM awemePagerVM;
        User user;
        AwemePagerVM awemePagerVM2;
        boolean z;
        String str;
        String aid;
        String uid;
        IAwemePagerVM iAwemePagerVMLIZ = LIZ();
        if ((iAwemePagerVMLIZ == null || !iAwemePagerVMLIZ.wQ2()) && (awemePagerVM = this.LL) != null && (user = awemePagerVM.LLILZ) != null && user.getAwemeCount() > 0) {
            IAwemePagerVM iAwemePagerVMLIZ2 = LIZ();
            if ((iAwemePagerVMLIZ2 instanceof AwemePagerVM) && (awemePagerVM2 = (AwemePagerVM) iAwemePagerVMLIZ2) != null) {
                C1257530ipT c1257530ipT = (C1257530ipT) view;
                if (this.LLILZIL || this.LLIZ) {
                    Context context = c1257530ipT.getContext();
                    IAwemePagerVM iAwemePagerVMLIZ3 = LIZ();
                    if (iAwemePagerVMLIZ3 != null && iAwemePagerVMLIZ3.isMyProfile()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str2 = "personal_homepage";
                    if (z) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    C1258010iqF c1258010iqF = new C1258010iqF(awemePagerVM2, c1257530ipT, context, str, awemePagerVM2.LLILZ, awemePagerVM2.LLIZ);
                    c1258010iqF.LIZ();
                    C1257500ipQ c1257500ipQ = this.LLILLL;
                    if (c1257500ipQ != null) {
                        c1257500ipQ.setSortToolTips(c1258010iqF.LLIZLLLIL);
                    }
                    c1257530ipT.setSupportIconState(EnumC1257740ipo.TOGGLED);
                    Aweme aweme = awemePagerVM2.LLIZ;
                    String str3 = "";
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        aid = "";
                    }
                    C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                    IAwemePagerVM iAwemePagerVMLIZ4 = LIZ();
                    if (iAwemePagerVMLIZ4 == null || !iAwemePagerVMLIZ4.isMyProfile()) {
                        str2 = "others_homepage";
                    }
                    User user2 = awemePagerVM2.LLILZ;
                    if (user2 != null && (uid = user2.getUid()) != null) {
                        str3 = uid;
                    }
                    C1253930ijf.LJJIII(c1253930ijf, str2, str3, aid, a0.LJJJJZ("HAS_", EnumC2666011k.HAS_OUTPUT_TAB_VV_RANKING.name()).toLowerCase(Locale.ROOT), EnumC1248370iah.TAB, null, null, 96);
                }
            }
            this.LLILZIL = true;
        }
    }

    public ProfileSortPublishTabBusiness(AwemePagerVM awemePagerVM, C1257500ipQ c1257500ipQ, View view) {
        super(awemePagerVM);
        this.LLILLL = c1257500ipQ;
        this.LLILZ = view;
        this.LLILZLL = true;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void WQ(C1257950iq9 c1257950iq9, int i, View view) {
        Integer numVQ2;
        IAwemePagerVM iAwemePagerVMLIZ;
        String string;
        Resources resources;
        ProfileTabBaseBusiness.LIZJ(view);
        InterfaceC724720Sbm interfaceC724720SbmLIZIZ = null;
        if (view != null) {
            Context context = view.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                string = resources.getString(2131822944);
            } else {
                string = null;
            }
            view.setContentDescription(string);
        }
        IAwemePagerVM iAwemePagerVMLIZ2 = LIZ();
        boolean z = false;
        if (iAwemePagerVMLIZ2 != null && (numVQ2 = iAwemePagerVMLIZ2.vQ2()) != null && numVQ2.intValue() == 1 && (iAwemePagerVMLIZ = LIZ()) != null) {
            C1252710ihh.LJIIL(iAwemePagerVMLIZ, C13LE.LIZ(InterfaceC1252070igf.class), new C2217381BqS() { // from class: X.0ilZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251330ifT) obj).LIZIZ;
                }
            }, new AwS228S0300000_19(view, this, c1257950iq9, 14));
        }
        IAwemePagerVM iAwemePagerVMLIZ3 = LIZ();
        if (iAwemePagerVMLIZ3 != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1252070igf.class);
            C724710Sbl c724710Sbl = iAwemePagerVMLIZ3.hierarchyServiceStore;
            if (c724710Sbl != null) {
                interfaceC724720SbmLIZIZ = c724710Sbl.LIZIZ(C09R7.LIZ(c19719912DlLIZ), null);
            }
            InterfaceC1252070igf interfaceC1252070igf = (InterfaceC1252070igf) interfaceC724720SbmLIZIZ;
            if (interfaceC1252070igf != null) {
                IAwemePagerVM iAwemePagerVMLIZ4 = LIZ();
                if (iAwemePagerVMLIZ4 != null && iAwemePagerVMLIZ4.isMyProfile()) {
                    z = true;
                }
                interfaceC1252070igf.hF(z, EnumC1248370iah.TAB, "HAS_OUTPUT_TAB_VV_RANKING".toLowerCase(Locale.ROOT), true);
            }
        }
    }
}
