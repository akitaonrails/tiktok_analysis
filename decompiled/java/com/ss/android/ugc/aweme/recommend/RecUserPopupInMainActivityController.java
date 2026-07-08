package com.ss.android.ugc.aweme.recommend;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0AJT;
import X.C0BLU;
import X.C0XQ7;
import X.C1072350e0n;
import X.C1072880e1e;
import X.C1072890e1f;
import X.C1072900e1g;
import X.C1073210e2B;
import X.C1075800e6M;
import X.C1076010e6h;
import X.C1251130if9;
import X.C1483410ohn;
import X.C1668306g5;
import X.C1720106oR;
import X.C19359410oa;
import X.C1954807lC;
import X.C19EG;
import X.C1AJ0;
import X.C1E7L;
import X.C20621815mi;
import X.C20621915mj;
import X.C2177271AIz;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2209401Bda;
import X.C2228708oH;
import X.C2246021CvY;
import X.C2246071Cvd;
import X.C2276131E7f;
import X.C2487409ou;
import X.C452501pT;
import X.C740400T2o;
import X.C786410Ut5;
import X.C816940W2y;
import X.C849850XVn;
import X.EnumC1072790e1V;
import X.EnumC1073320e2M;
import X.EnumC1262370ixH;
import X.EnumC19359310oZ;
import X.InterfaceC1072780e1U;
import X.InterfaceC1264610j0t;
import X.InterfaceC1603120ros;
import X.InterfaceC20621715mh;
import Y.AObserverS236S0100000_34;
import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.hox.Hox;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.services.IRelationDebugService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.RecUserPopupInMainActivityController;
import com.ss.android.ugc.aweme.relation.service.ISocialMonoFreqControlService;
import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS243S0300000_34;
import kotlin.jvm.internal.AwS33S1400000_34;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class RecUserPopupInMainActivityController implements InterfaceC1603120ros, LifecycleEventObserver {
    public static InterfaceC1072780e1U LLIZ;
    public static InterfaceC1072780e1U LLIZLLLIL;
    public static boolean LLJIJIL;
    public final C19EG LL;
    public final EnumC19359310oZ LLILLJJLI;
    public final Aweme LLILLL;
    public final RecUserInMainActivityViewModel LLILZ;
    public final LifecycleOwner LLILZIL;
    public static final Map<EnumC19359310oZ, RecUserPopupInMainActivityController> LLILZLL = new LinkedHashMap();
    public static final C01GW<InterfaceC20621715mh> LLJ = C452501pT.LIZIZ(new C2177271AIz());
    public static final C01GW<InterfaceC20621715mh> LLJI = C452501pT.LIZIZ(new C1AJ0());

    @Override // X.InterfaceC1603120ros
    public final void LIZ() {
        Boolean bool;
        RecUserInMainActivityViewModel recUserInMainActivityViewModel = this.LLILZ;
        Aweme aweme = this.LLILLL;
        recUserInMainActivityViewModel.getClass();
        ISocialMonoFreqControlService iSocialMonoFreqControlServiceLIZIZ = SocialMonoFreqControlService.LIZIZ();
        C1E7L c1e7l = C1E7L.REC_POP;
        if (iSocialMonoFreqControlServiceLIZIZ.LIZ(c1e7l) && (((bool = C1251130if9.LIZ().disableFYPRecUserPopup) == null || !bool.booleanValue()) && !C816940W2y.LIZ() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin())) {
            IRelationDebugService iRelationDebugService = (IRelationDebugService) ServiceManager.get().getService(IRelationDebugService.class);
            if (iRelationDebugService != null) {
                iRelationDebugService.LIZ();
            }
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            int friendCount = curUser != null ? curUser.getFriendCount() : 0;
            C01GW c01gw = C0AJT.LIZ;
            if (friendCount > ((Number) c01gw.getValue()).intValue()) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("friend count > ");
                sbLIZ.append(((Number) c01gw.getValue()).intValue());
                C1720106oR.LJI("rec user in FYP/Inbox/Profile", C2188811AlT.LIZIZ(sbLIZ));
            } else if (!((Boolean) C0BLU.LIZIZ.getValue()).booleanValue()) {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("rec user in FYP/Inbox/Profile", "disable exp");
            } else if (aweme != null && aweme.isAd()) {
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LJI("rec user in FYP/Inbox/Profile", "is ad aweme");
            } else if (C740400T2o.LIZ) {
                InterfaceC1264610j0t interfaceC1264610j0tLIZJ = C1072350e0n.LIZJ(EnumC1073320e2M.FYP, AFwS281S0000000_34.get$arr$(47));
                boolean zCheck = interfaceC1264610j0tLIZJ != null ? ((C1073210e2B) interfaceC1264610j0tLIZJ).check() : false;
                boolean zLIZJ = C1076010e6h.LIZJ.LJFF().LIZJ();
                if (zCheck || zLIZJ) {
                    int i4 = C2187451AjH.LIZ;
                    C1720106oR.LJI("rec user in FYP/Inbox/Profile", "avoid higher popup");
                } else if (C2276131E7f.LIZ(c1e7l, null)) {
                    String str = C1072890e1f.LIZIZ;
                    if (C1072880e1e.LIZ().LIZ.getBoolean("show_rec_user_pop_up_in_fyp", false)) {
                        C2209401Bda c2209401Bda = C2209401Bda.LIZIZ;
                        if (c2209401Bda.LIZIZ("follow_your_friends_dialog")) {
                            int i5 = C2187451AjH.LIZ;
                            C2487409ou.LIZJ(new ARunnableS112S0100000_12(recUserInMainActivityViewModel, 317));
                            return;
                        } else {
                            int i6 = C2187451AjH.LIZ;
                            C1720106oR.LJI("rec user in FYP/Inbox/Profile", "popup disabled by new user popup reverse experiment");
                            c2209401Bda.LIZ("follow_your_friends_dialog");
                        }
                    } else {
                        int i7 = C2187451AjH.LIZ;
                        C1720106oR.LJI("rec user in FYP/Inbox/Profile", "show in fyp key is false");
                        C1072880e1e.LIZ().LIZ.storeBoolean("show_rec_user_pop_up_in_fyp", true);
                    }
                }
            } else {
                int i8 = C2187451AjH.LIZ;
                C1720106oR.LJI("rec user in FYP/Inbox/Profile", "swipe up show");
            }
        }
        if (SocialMonoFreqControlService.LIZIZ().LIZ(c1e7l)) {
            Boolean bool2 = C1251130if9.LIZ().disableInboxProfileRecUserPopup;
            if ((bool2 == null || !bool2.booleanValue()) && !C816940W2y.LIZ() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                if (!((Boolean) C0BLU.LIZIZ.getValue()).booleanValue()) {
                    int i9 = C2187451AjH.LIZ;
                    C1720106oR.LJI("rec user in FYP/Inbox/Profile", "disable exp");
                } else if (C2276131E7f.LIZ(c1e7l, null)) {
                    int i10 = C2187451AjH.LIZ;
                    C2487409ou.LIZJ(new ARunnableS112S0100000_12(recUserInMainActivityViewModel, 318));
                }
            }
        }
    }

    @Override // X.InterfaceC1603120ros
    public final boolean LIZIZ() {
        return this.LLILZ.LL;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            ((LinkedHashMap) LLILZLL).clear();
            lifecycleOwner.getLifecycle().removeObserver(this);
            InterfaceC1072780e1U interfaceC1072780e1U = LLIZ;
            if (interfaceC1072780e1U != null) {
                interfaceC1072780e1U.destroy();
            }
            LLIZ = null;
            InterfaceC1072780e1U interfaceC1072780e1U2 = LLIZLLLIL;
            if (interfaceC1072780e1U2 != null) {
                interfaceC1072780e1U2.destroy();
            }
            LLIZLLLIL = null;
        }
    }

    public RecUserPopupInMainActivityController(C19EG c19eg, EnumC19359310oZ enumC19359310oZ, Aweme aweme, RecUserInMainActivityViewModel recUserInMainActivityViewModel, LifecycleOwner lifecycleOwner) {
        this.LL = c19eg;
        this.LLILLJJLI = enumC19359310oZ;
        this.LLILLL = aweme;
        this.LLILZ = recUserInMainActivityViewModel;
        this.LLILZIL = lifecycleOwner;
        IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false).getLifecycle().addObserver(this);
        int i = C19359410oa.LIZ[enumC19359310oZ.ordinal()];
        LifecycleOwner lifecycleOwner2 = c19eg;
        if (i != 1) {
            LifecycleOwner lifecycleOwner3 = c19eg;
            if (i == 2) {
                recUserInMainActivityViewModel.LLIZ.observe(lifecycleOwner != null ? lifecycleOwner : lifecycleOwner3, new AObserverS236S0100000_34(this, 11));
                return;
            }
            throw new C1954807lC();
        }
        lifecycleOwner2 = lifecycleOwner != null ? lifecycleOwner : lifecycleOwner2;
        recUserInMainActivityViewModel.LLILZ.observe(lifecycleOwner2, new Observer() { // from class: X.1CvZ
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C01GW<InterfaceC20621715mh> c01gw = RecUserPopupInMainActivityController.LLJ;
                    InterfaceC20621715mh value = c01gw.getValue();
                    if (value != null) {
                        value.M71(new C20621515mf(0));
                    }
                    RecUserPopupInMainActivityController recUserPopupInMainActivityController = this.LL;
                    InterfaceC1072780e1U interfaceC1072780e1ULIZJ = RecUserPopupInMainActivityController.LLIZ;
                    if (interfaceC1072780e1ULIZJ == null) {
                        interfaceC1072780e1ULIZJ = C2277891EDz.LIZIZ.LIZJ();
                        RecUserPopupInMainActivityController.LLIZ = interfaceC1072780e1ULIZJ;
                    }
                    recUserPopupInMainActivityController.LIZJ(interfaceC1072780e1ULIZJ, c01gw.getValue(), this.LL.LL, EnumC1262370ixH.FYP_POPUP, "homepage_hot");
                }
            }
        });
        recUserInMainActivityViewModel.LLILZLL.observe(lifecycleOwner2, new Observer() { // from class: X.1Cva
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C01GW<InterfaceC20621715mh> c01gw = RecUserPopupInMainActivityController.LLJI;
                    InterfaceC20621715mh value = c01gw.getValue();
                    if (value != null) {
                        value.M71(new C20621515mf(0));
                    }
                    RecUserPopupInMainActivityController recUserPopupInMainActivityController = this.LL;
                    InterfaceC1072780e1U interfaceC1072780e1ULIZJ = RecUserPopupInMainActivityController.LLIZLLLIL;
                    if (interfaceC1072780e1ULIZJ == null) {
                        interfaceC1072780e1ULIZJ = C2277891EDz.LIZIZ.LIZJ();
                        RecUserPopupInMainActivityController.LLIZLLLIL = interfaceC1072780e1ULIZJ;
                    }
                    recUserPopupInMainActivityController.LIZJ(interfaceC1072780e1ULIZJ, c01gw.getValue(), this.LL.LL, EnumC1262370ixH.INBOX_PROFILE_POPUP, "");
                }
            }
        });
        recUserInMainActivityViewModel.LLILZIL.observe(lifecycleOwner2, new Observer() { // from class: X.1Cvb
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    RecUserPopupInMainActivityController recUserPopupInMainActivityController = this.LL;
                    InterfaceC1072780e1U interfaceC1072780e1ULIZJ = RecUserPopupInMainActivityController.LLIZ;
                    if (interfaceC1072780e1ULIZJ == null) {
                        interfaceC1072780e1ULIZJ = C2277891EDz.LIZIZ.LIZJ();
                        RecUserPopupInMainActivityController.LLIZ = interfaceC1072780e1ULIZJ;
                    }
                    recUserPopupInMainActivityController.LIZLLL(interfaceC1072780e1ULIZJ, RecUserPopupInMainActivityController.LLJ.getValue(), this.LL.LL, EnumC1262370ixH.FYP_POPUP, "homepage_hot");
                }
            }
        });
    }

    public final void LIZJ(InterfaceC1072780e1U interfaceC1072780e1U, InterfaceC20621715mh interfaceC20621715mh, C19EG c19eg, EnumC1262370ixH enumC1262370ixH, String str) {
        this.LLILZ.getClass();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", "auto_pop_up", bundle);
        C786410Ut5.LJJIZ(bundle, "maf_scene_key", enumC1262370ixH);
        C786410Ut5.LJJJI("light_interaction_enter_method", "suggested_account", bundle);
        C786410Ut5.LJJJI("light_interaction_position", "pop_up", bundle);
        interfaceC1072780e1U.LJIIJ(c19eg, bundle);
        if (interfaceC20621715mh != null) {
            interfaceC1072780e1U.LJ(interfaceC20621715mh);
        }
        interfaceC1072780e1U.LJI();
        interfaceC1072780e1U.LJIIJJI(new AwS243S0300000_34(this, enumC1262370ixH, interfaceC20621715mh, 0));
        interfaceC1072780e1U.LJIIIIZZ(new AwS578S0100000_34(this, 61));
    }

    public final void LIZLLL(InterfaceC1072780e1U interfaceC1072780e1U, InterfaceC20621715mh interfaceC20621715mh, C19EG c19eg, EnumC1262370ixH enumC1262370ixH, String str) {
        Long lValueOf;
        Long lValueOf2;
        int iLIZIZ;
        Long lValueOf3;
        Long lValueOf4;
        EnumC1262370ixH enumC1262370ixH2 = EnumC1262370ixH.FYP_POPUP;
        if (enumC1262370ixH == enumC1262370ixH2 && !Hox.LLJILJIL.LIZ(c19eg).LQ2("For You")) {
            if (interfaceC20621715mh != null) {
                interfaceC20621715mh.M71(new C20621815mi(1));
            }
            C2246021CvY.LIZ(interfaceC1072780e1U, this.LLILLJJLI);
            return;
        }
        if (!this.LLILZ.LLJ && !C816940W2y.LIZ()) {
            RecUserInMainActivityViewModel recUserInMainActivityViewModel = this.LLILZ;
            C2246071Cvd c2246071CvdWQ2 = recUserInMainActivityViewModel.wQ2();
            if (!c2246071CvdWQ2.LIZJ) {
                c2246071CvdWQ2.LIZJ = true;
                c2246071CvdWQ2.LIZ = 0L;
                c2246071CvdWQ2.LIZLLL = System.currentTimeMillis();
            }
            String str2 = C1072890e1f.LIZIZ;
            C1072880e1e.LIZ().LIZ.erase("show_rec_user_pop_up_in_fyp");
            if (enumC1262370ixH == enumC1262370ixH2) {
                C1483410ohn.LJLJJI().LIZ();
                recUserInMainActivityViewModel.LL = true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            EnumC1072790e1V enumC1072790e1V = EnumC1072790e1V.AUTO;
            long j = C1072880e1e.LIZ().LIZ.getLong("dialog_last_shown_timestamp", 0L);
            if (j != 0 && (lValueOf4 = Long.valueOf(j)) != null) {
                lValueOf = Long.valueOf(jCurrentTimeMillis - lValueOf4.longValue());
            } else {
                lValueOf = null;
            }
            long j2 = C1072880e1e.LIZ().LIZ.getLong("dialog_last_negative_feedback_timestamp", 0L);
            if (j2 != 0 && (lValueOf3 = Long.valueOf(j2)) != null) {
                lValueOf2 = Long.valueOf(jCurrentTimeMillis - lValueOf3.longValue());
            } else {
                lValueOf2 = null;
            }
            new C2228708oH(str, enumC1072790e1V, lValueOf, lValueOf2).LIZLLL(null);
            C2276131E7f.LIZLLL(C1E7L.REC_POP);
            this.LLILZ.LLJ = true;
            C1075800e6M c1075800e6MLJII = interfaceC1072780e1U.LJII();
            if (c1075800e6MLJII != null) {
                iLIZIZ = c1075800e6MLJII.LIZIZ();
            } else {
                iLIZIZ = 0;
            }
            if (interfaceC20621715mh != null) {
                interfaceC20621715mh.M71(new C20621915mj(iLIZIZ));
            }
            if (C849850XVn.LIZIZ.LIZJ().LJJ("follow_your_friends_dialog")) {
                PopupManager.LJIJ(new C1072900e1g(c19eg, interfaceC1072780e1U, str, new AwS578S0100000_34(interfaceC20621715mh, 62), new AwS33S1400000_34(interfaceC20621715mh, this, enumC1262370ixH, str, interfaceC1072780e1U, 0)), "follow_your_friends_dialog", new C1668306g5("social_follow_your_friends_dialog_trigger"));
                return;
            } else {
                PopupManager.LJIJI(new C1072900e1g(c19eg, interfaceC1072780e1U, str, new AwS578S0100000_34(interfaceC20621715mh, 63), new AwS33S1400000_34(interfaceC20621715mh, this, enumC1262370ixH, str, interfaceC1072780e1U, 1)), true);
                return;
            }
        }
        if (interfaceC20621715mh != null) {
            interfaceC20621715mh.cancel();
        }
        C2246021CvY.LIZ(interfaceC1072780e1U, this.LLILLJJLI);
    }
}
