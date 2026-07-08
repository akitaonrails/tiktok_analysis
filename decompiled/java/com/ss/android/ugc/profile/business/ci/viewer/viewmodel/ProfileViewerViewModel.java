package com.ss.android.ugc.profile.business.ci.viewer.viewmodel;

import X.AbstractC1387030mCL;
import X.AbstractC20660815t0;
import X.C01GW;
import X.C0O8X;
import X.C0TMQ;
import X.C0XIR;
import X.C11NJ;
import X.C11S5;
import X.C1253930ijf;
import X.C1386920mCA;
import X.C1386940mCC;
import X.C1386980mCG;
import X.C1386990mCH;
import X.C1387000mCI;
import X.C1494450ozb;
import X.C1494690ozz;
import X.C1701940uOG;
import X.C1720106oR;
import X.C19EG;
import X.C20642515q3;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C736460Sui;
import X.C897520ZIw;
import X.EnumC1261800iwM;
import X.EnumC1261810iwN;
import X.EnumC1261820iwO;
import X.InterfaceC742660TBg;
import Y.AfS181S0100000_12;
import Y.AfS86S0101000_21;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher;
import com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ProfileViewerViewModel extends ViewModel {
    public static final /* synthetic */ int LLJJIII = 0;
    public final MutableLiveData<C1386940mCC> LL = new MutableLiveData<>();
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(412));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(411));
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(413));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(414));
    public final Keva LLIZLLLIL;
    public final boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public int LLJILLL;
    public final C0O8X LLJJ;
    public final C01GW LLJJI;

    public final C897520ZIw wQ2() {
        return (C897520ZIw) this.LLILZ.getValue();
    }

    public final MutableLiveData<AbstractC1387030mCL> xQ2() {
        return (MutableLiveData) this.LLIZ.getValue();
    }

    public ProfileViewerViewModel() {
        Keva repo = Keva.getRepo("keva_repo_profile_viewer");
        this.LLIZLLLIL = repo;
        C0TMQ.LIZ.getClass();
        this.LLJ = repo.getBoolean(C0TMQ.LIZ("viewer_page_float_notice_has_show"), false);
        this.LLJILJILJ = "";
        this.LLJILLL = -1;
        this.LLJJ = new C0O8X();
        this.LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1159));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLJJLI.dispose();
    }

    public final boolean zQ2() {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIZ(0, "viewer_history");
        return (privacySettingsRestrictionItemLJIIIZ == null || privacySettingsRestrictionItemLJIIIZ.showType == 2) ? false : true;
    }

    public static void AQ2(boolean z) {
        C1253930ijf.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(z ? 1 : 0, "profile_visitor_empty");
        C20684815ws.LJIILLIIL("profile_visitor_list_num", c2344009Gk.LIZ);
    }

    public final void yQ2(Throwable th) {
        String strLJI;
        if (th instanceof C0XIR) {
            strLJI = ((C0XIR) th).getErrorMsg();
        } else if (!(th instanceof C1494450ozb) && !(th instanceof C1494690ozz)) {
            strLJI = "";
        } else {
            xQ2().postValue(new C1387000mCI(0));
            this.LL.postValue(new C1386920mCA());
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleException other exception= ");
            sbLIZ.append(th);
            C1720106oR.LJI("PVViewModel", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!C736460Sui.LIZIZ(strLJI)) {
            strLJI = C20642515q3.LJI(2131845510);
        }
        xQ2().postValue(new C1386980mCG(strLJI, 1));
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleException notSupportMessage=");
        sbLIZ2.append(strLJI);
        sbLIZ2.append("  ");
        sbLIZ2.append(th);
        C1720106oR.LJI("PVViewModel", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void BQ2(final C19EG c19eg, final ProfileViewerFragment profileViewerFragment) {
        final EnumC1261800iwM enumC1261800iwM;
        final EnumC1261820iwO enumC1261820iwO;
        if (!this.LLJI) {
            this.LLJI = true;
            if (Intrinsics.LJFF(this.LLJILJILJ, "notification_page")) {
                enumC1261800iwM = EnumC1261800iwM.NOTIFICATION_PAGE;
            } else {
                enumC1261800iwM = EnumC1261800iwM.PERSONAL_HOMEPAGE;
            }
            if (Intrinsics.LJFF(this.LLJILJILJ, "notification_page")) {
                enumC1261820iwO = EnumC1261820iwO.NEW_ACTIVITIES;
            } else {
                enumC1261820iwO = null;
            }
            if (c19eg != null) {
                final EnumC1261810iwN enumC1261810iwN = EnumC1261810iwN.PROFILE_VIEWER_LIST;
                PopupManager.LJIJI(new AbstractC20660815t0(c19eg, enumC1261800iwM, enumC1261820iwO, enumC1261810iwN, profileViewerFragment) { // from class: X.0iwP
                    public final Activity LL;
                    public final EnumC1261800iwM LLILLJJLI;
                    public final EnumC1261820iwO LLILLL;
                    public final EnumC1261810iwN LLILZ;
                    public final int LLILZIL;

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return this.LLILZIL;
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                        if (!((UpdateProfilePopupLauncher) ServiceManager.get().getService(UpdateProfilePopupLauncher.class)).LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ)) {
                            c20656615sK.LIZ();
                        }
                    }

                    {
                        super(profileViewerFragment);
                        this.LL = c19eg;
                        this.LLILLJJLI = enumC1261800iwM;
                        this.LLILLL = enumC1261820iwO;
                        this.LLILZ = enumC1261810iwN;
                        this.LLILZIL = 10;
                    }
                }, true);
            }
        }
    }

    public final void CQ2(BaseResponse baseResponse, boolean z) {
        String str;
        this.LLJJ.LIZ();
        C0O8X c0o8x = this.LLJJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0o8x.LIZJ(str, "is_empty");
        this.LLJJ.LIZLLL(baseResponse);
        this.LLJJ.LJFF();
    }

    public final void DQ2(int i, boolean z) {
        String str;
        this.LLJJ.LJ();
        C0O8X c0o8x = this.LLJJ;
        c0o8x.LIZLLL = "ttk_user_profile_view_record_get_api_monitor";
        c0o8x.LIZJ(Integer.valueOf(i), "source");
        C0O8X c0o8x2 = this.LLJJ;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0o8x2.LIZIZ(str, "is_first_page");
    }

    public final void vQ2(String str, String str2) {
        String str3;
        int i;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkProfileViewerSetting currentProfileViewerSetting=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append("  toProfileViewerSetting=");
        sbLIZ.append(this.LLJILJIL);
        C1720106oR.LJI("PVViewModel", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = this.LLJIJIL;
        boolean z2 = this.LLJILJIL;
        if (z != z2) {
            if (z2) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            String str4 = this.LLJILJILJ;
            if (str4 == null) {
                str4 = "";
            }
            c1253930ijf.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "profile_visitor_list");
            c2344009Gk.LJIIIIZZ("previous_page", str4);
            c2344009Gk.LJIIIIZZ("to_status", str3);
            c2344009Gk.LJIIIIZZ("position", str);
            c2344009Gk.LJIIIIZZ("action_type", str2);
            C20684815ws.LJIILLIIL("change_profile_visitor_status", c2344009Gk.LIZ);
            xQ2().postValue(new C1386990mCH(0));
            boolean z3 = this.LLJILJIL;
            this.LLJIJIL = z3;
            this.LLJILJIL = z3;
            InterfaceC742660TBg interfaceC742660TBgLIZIZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZIZ();
            if (this.LLJIJIL) {
                i = 1;
            } else {
                i = 2;
            }
            if (interfaceC742660TBgLIZIZ != null) {
                this.LLILLJJLI.LIZ(interfaceC742660TBgLIZIZ.LIZLLL(i).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS86S0101000_21(i, this, 0), new AfS181S0100000_12(this, 142)));
            }
        }
    }
}
