package com.ss.android.ugc.aweme.friends.service;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.AnonymousClass0988;
import X.C01GW;
import X.C036E;
import X.C09JN;
import X.C0ACS;
import X.C0SY1;
import X.C0TNP;
import X.C0XQ7;
import X.C1056700dbY;
import X.C1070750dyD;
import X.C1071540dzU;
import X.C1071780dzs;
import X.C1071790dzt;
import X.C1071800dzu;
import X.C1072570e19;
import X.C1072630e1F;
import X.C1072730e1P;
import X.C1072930e1j;
import X.C1072950e1l;
import X.C1072960e1m;
import X.C1074030e3V;
import X.C1076010e6h;
import X.C1078104Jn;
import X.C11NZ;
import X.C11O8;
import X.C11S5;
import X.C1220000hqw;
import X.C1239330iM7;
import X.C1252360ih8;
import X.C13IQ;
import X.C13LE;
import X.C1590150rTx;
import X.C15O7;
import X.C1701940uOG;
import X.C1908720zlm;
import X.C19487811Me;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C338980DQq;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1070340dxY;
import X.EnumC1074240e3q;
import X.EnumC1262450ixP;
import X.InterfaceC1070270dxR;
import X.InterfaceC1070570dxv;
import X.InterfaceC1070980dya;
import X.InterfaceC1071740dzo;
import X.InterfaceC1073770e35;
import X.InterfaceC1074380e44;
import X.InterfaceC1294060jmO;
import X.InterfaceC1487280oo2;
import X.InterfaceC1582690rHv;
import X.InterfaceC1908760zlq;
import X.InterfaceC2385309Wh;
import X.InterfaceC800130Va7;
import Y.AfS35S1000000_16;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.friends.assem.MainPageFriendsAssem;
import com.ss.android.ugc.aweme.friends.lego.ContactsUploadRequest;
import com.ss.android.ugc.aweme.friends.lego.MafFollowBackBootRequest;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ContactResponse;
import com.ss.android.ugc.aweme.relation.dialog.SocialRecFriendsConditionViewModel;
import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.relation.fp.ContactFriendsPage;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS101S1000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class FriendsServiceImpl implements IFriendsService, IFriendSaasService {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1078104Jn());

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJIIJJI(Activity activity) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIL() {
        return C13LE.LIZ(MainPageFriendsAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIII(String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1908760zlq LIZ() {
        return (C1908720zlm) C1072960e1m.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final RelationService LIZIZ() {
        return (RelationServiceImpl) C1072960e1m.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJ() {
        return C1072630e1F.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1070270dxR LJFF() {
        String str = C1071790dzt.LIZIZ;
        return C1071800dzu.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final C0SY1 LJIIIIZZ() {
        return new C1252360ih8();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIIIZ() {
        C1072570e19.LIZ.LJFF(true);
        FriendApi.LIZ.getClass();
        C11NZ<BaseResponse> c11nzLIZ = C1239330iM7.LIZ().LIZ(2, Boolean.TRUE, Boolean.FALSE, false, false);
        if (c11nzLIZ != null) {
            c11nzLIZ.LJJIJIIJI(new AfS35S1000000_16(2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS35S1000000_16(3));
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIILJJIL() {
        C1056700dbY.LIZ.getClass();
        if (C1056700dbY.LIZ().getBoolean("upload_status", false) || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ() && C1072630e1F.LIZ.LIZJ()) {
                C15O7.LIZJ(new Callable() { // from class: X.0daP
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("ContactUploadUtil@889d.uploadContactWhenFetchABConfig$1");
                        if (((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C1055950daL(null))).booleanValue()) {
                            C1056700dbY.LIZ.getClass();
                            C1056700dbY.LIZ().storeBoolean("upload_status", true);
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ContactUploadUtil@889d.uploadContactWhenFetchABConfig$1");
                        return unit;
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJIILLIIL() {
        return C1072630e1F.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final ISocialFriendsService LJIIZILJ() {
        return (SocialFriendsService) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJIJI() {
        return ((Number) C0ACS.LIZ.getValue()).intValue() == 2;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIJJLI() {
        C1072930e1j c1072930e1j = C1072930e1j.LIZ;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C1072930e1j.LIZJ()) {
            return;
        }
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("obtain_friends_strategy_when_upgrading", 3);
        Keva keva = C1072930e1j.LIZIZ;
        if (keva.getBoolean("key_new_version", false) && iLJ == 3) {
            keva.storeInt("key_display_strategy", iLJ);
            SettingsManager.LIZLLL().getClass();
            keva.storeLong("key_rec_friends_frequency", SettingsManager.LJFF("obtain_friends_strategy_when_upgrading_frequency", 30L));
            boolean zLJ = C1072930e1j.LJ();
            boolean zLIZLLL = C1072930e1j.LIZLLL();
            keva.storeString("key_check_status", "value_check_start");
            if (!zLJ && !zLIZLLL) {
                C1072930e1j.LIZ.getClass();
                C1072930e1j.LIZ();
            }
            keva.storeString("key_check_status", "value_check_hasdata");
            if (zLJ || zLIZLLL) {
                C1072930e1j.LIZ.getClass();
                C1072930e1j.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJ() {
        C1056700dbY.LIZIZ(EnumC1074240e3q.UNKNOWN);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1073770e35 LJJI() {
        String str = C1072950e1l.LIZIZ;
        if (C1072950e1l.LIZJ == null || !Intrinsics.LJFF(C1072950e1l.LIZIZ, C0XQ7.LJFF().getCurUserId())) {
            synchronized (C1072950e1l.class) {
                try {
                    C1072950e1l.LIZIZ = C0XQ7.LJFF().getCurUserId();
                    C1072950e1l.LIZJ = new C1072950e1l();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1072950e1l c1072950e1l = C1072950e1l.LIZJ;
        if (c1072950e1l != null) {
            return c1072950e1l;
        }
        "Require instance of BindPhonePopKeva must not be null".toString();
        throw new IllegalArgumentException("Require instance of BindPhonePopKeva must not be null");
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJII() {
        C338980DQq.LIZ.getClass();
        if (!C338980DQq.LIZIZ()) {
            return false;
        }
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        if (c1076010e6h.LJIIJ().LIZJ() || C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.EMAIL).LJ()) {
            return c1076010e6h.LJIIJ().LIZJ() && C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.CONTACT).LJ();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC800130Va7 LJJIIJZLJL() {
        return new MafFollowBackBootRequest();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJIJIIJI() {
        C0TNP.LIZ.getClass();
        if (!C0TNP.LIZ()) {
            return false;
        }
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        if (c1076010e6h.LJIIJ().LIZJ()) {
            C1071540dzU c1071540dzU = C1071540dzU.LIZIZ;
            if (c1071540dzU.LJ(EnumC1070340dxY.EMAIL).LJ() && !c1071540dzU.LJ(EnumC1070340dxY.CONTACT).LJ()) {
                return true;
            }
        }
        return !c1076010e6h.LJIIJ().LIZJ() && C1071540dzU.LIZIZ.LJ(EnumC1070340dxY.EMAIL).LJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC800130Va7 LJJIJIIJIL() {
        return new ContactsUploadRequest();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1071740dzo LJII() {
        return C1072570e19.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1070570dxv LJIIJ() {
        return C1072630e1F.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final C11NZ<ShortenUrlModel> LIZJ(String str) {
        FriendApi.LIZ.getClass();
        return C1239330iM7.LIZ().LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Intent LIZLLL(Activity activity) {
        return C1074030e3V.LIZ.LIZ(activity, ContactFriendsPage.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJI(final String str) {
        C1070750dyD.LIZ.getClass();
        FriendApi.LIZ.getClass();
        final String str2 = "";
        C1239330iM7.LIZ().LIZLLL(1, Boolean.TRUE, Boolean.FALSE).LJ(new InterfaceC2385309Wh() { // from class: X.0dyB
            public final /* synthetic */ boolean LIZIZ = true;
            public final /* synthetic */ String LIZLLL = "";
            public final /* synthetic */ String LJ = "";

            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                SyncContactStatusEvent syncContactStatusEvent;
                Activity activityLIZIZ;
                C1C7U.LIZ("ContactPermissionUtils@2dc2.sycnContactStatus$1");
                if (C09UZ.LIZLLL(c15o7) && !u.LJIJI("error", ((BaseResponse) c15o7.LJIIL()).message, true)) {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                        boolean z = this.LIZIZ;
                        String str3 = str;
                        C1070750dyD.LIZ.getClass();
                        if (C1070750dyD.LIZIZ && z && ("homepage_hot".equals(str3) || "homepage_follow".equals(str3))) {
                            C2487409ou.LIZJ(new RunnableC514801zW(activityLIZIZ, 90));
                            C1070750dyD.LIZIZ = false;
                        }
                    }
                    C1076010e6h.LIZJ.LJJIIJ(this.LIZIZ);
                    if (this.LIZIZ) {
                        C1075950e6b.LIZJ();
                    }
                    if (str2.length() > 0) {
                        C1071780dzs.LIZIZ(C1071780dzs.LIZ, str, str2, "contact", this.LIZLLL, this.LJ, "process", null, 448);
                    }
                    syncContactStatusEvent = new SyncContactStatusEvent(str, true, !this.LIZIZ);
                    C1440005kM.LIZ(syncContactStatusEvent);
                } else {
                    syncContactStatusEvent = new SyncContactStatusEvent(str, false, true ^ this.LIZIZ);
                    C1440005kM.LIZ(syncContactStatusEvent);
                }
                C1C7U.LIZIZ("ContactPermissionUtils@2dc2.sycnContactStatus$1");
                return syncContactStatusEvent;
            }
        }, C15O7.LJI, null);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1582690rHv LJIILIIL(C19EG c19eg) {
        return (SocialRecFriendsConditionViewModel) ViewModelProviders.of(c19eg).get(SocialRecFriendsConditionViewModel.class);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJIJ(User user) {
        if (user != null && user.getFollowerCount() >= 1000 && (user == null || user.getMutualStruct() == null)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIIJ(boolean z) {
        List<SocialPlatformSetting> socialPlatformSettings = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    socialPlatformSetting.setSyncStatus(z);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIIZI(final boolean z) {
        C11NZ<R> c11nzLJJJ;
        C11NZ c11nzLJJJ2;
        C1072630e1F.LIZ.LJFF(true);
        FriendApi.LIZ.getClass();
        C11NZ<BaseResponse> c11nzLIZ = C1239330iM7.LIZ().LIZ(1, Boolean.TRUE, Boolean.FALSE, false, false);
        if (c11nzLIZ != null && (c11nzLJJJ = c11nzLIZ.LJJIJIIJI(new C09JN() { // from class: X.0dzx
            public final /* synthetic */ String LL = "cold_start";

            @Override // X.C09JN
            public final void accept(Object obj) {
                String str;
                C1C7U.LIZ("FriendsServiceImpl@dabe.syncContactUidSwitchWithoutDialog$1");
                C1071780dzs c1071780dzs = C1071780dzs.LIZ;
                String str2 = this.LL;
                String str3 = "";
                if (z) {
                    str = "";
                } else {
                    str = "guide";
                    str3 = "did";
                }
                C1071780dzs.LIZ(c1071780dzs, str2, str, "contact", str3);
                C1C7U.LIZIZ("FriendsServiceImpl@dabe.syncContactUidSwitchWithoutDialog$1");
            }
        }).LJJJ(new InterfaceC1487280oo2() { // from class: X.0dy3
            public final /* synthetic */ String LLILLJJLI = "cold_start";

            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String str;
                C1071780dzs c1071780dzs = C1071780dzs.LIZ;
                String str2 = "";
                if (z) {
                    str = "";
                } else {
                    str2 = "guide";
                    str = "did";
                }
                C1071780dzs.LIZIZ(c1071780dzs, this.LLILLJJLI, str2, "contact", "", str, "auto", null, 448);
                C1075950e6b.LIZJ();
                C1072640e1G c1072640e1G = C1072640e1G.LIZ;
                EnumC1074240e3q enumC1074240e3q = EnumC1074240e3q.UNKNOWN;
                c1072640e1G.getClass();
                return C1072640e1G.LIZJ(enumC1074240e3q).LJJIJIIJIL(new AfS35S1000000_16(this.LLILLJJLI, 0)).LJJIJIIJI(new AfS35S1000000_16(this.LLILLJJLI, 1));
            }
        }, false)) != 0 && (c11nzLJJJ2 = c11nzLJJJ.LJJJ(new InterfaceC1487280oo2() { // from class: X.00ip
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return C11NZ.LJJJJZ(new ContactResponse());
            }
        }, false)) != null) {
            C11O8 c11o8LJJJLZIJ = c11nzLJJJ2.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
            AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
            c11o8LJJJLZIJ.LJJLL(anonymousClass0988, anonymousClass0988);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIJJ(String str, Map map) {
        Integer numLIZLLL;
        C1071780dzs.LIZ.getClass();
        String strLIZJ = C1071780dzs.LIZJ(str);
        String strLIZLLL = C1071780dzs.LIZLLL(str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_friends");
        c2344009Gk.LJIIIIZZ("platform", str);
        c2344009Gk.LJIIIIZZ("is_auth", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("previous_page", "");
        c2344009Gk.LJIIIIZZ("did_status", strLIZJ);
        c2344009Gk.LJIIIIZZ("uid_status", strLIZLLL);
        if (map != null) {
            c2344009Gk.LJII(map);
        }
        if (Intrinsics.LJFF(str, "facebook") && (numLIZLLL = C1072570e19.LIZ.LIZLLL()) != null) {
            c2344009Gk.LIZJ(numLIZLLL.intValue(), "server_fb_token");
        }
        C20684815ws.LJIILLIIL("authorize_card_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1070980dya LJJIFFI(String str, LifecycleOwner lifecycleOwner) {
        return (InterfaceC1070980dya) new C736950SvV(C13LE.LIZ(FindFriendsPageVM.class), new AwS101S1000000_16(str, 0), new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ((HasDefaultViewModelProviderFactory) lifecycleOwner), AFwS252S0000000_16.get$arr$(22), null, null, null).getValue();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    @InterfaceC1294060jmO
    public final Intent LJJIIZ(Context context, int i) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) FindFriendsPageActivity.class);
        intent.putExtra("previous_page", "push");
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIJ(String str, Map map) {
        Integer numLIZLLL;
        C1071780dzs.LIZ.getClass();
        String strLIZJ = C1071780dzs.LIZJ(str);
        String strLIZLLL = C1071780dzs.LIZLLL(str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_friends");
        c2344009Gk.LJIIIIZZ("platform", str);
        c2344009Gk.LJIIIIZZ("previous_page", "");
        c2344009Gk.LIZJ(0, "is_auth");
        c2344009Gk.LJIIIIZZ("did_status", strLIZJ);
        c2344009Gk.LJIIIIZZ("uid_status", strLIZLLL);
        c2344009Gk.LJII(map);
        if (Intrinsics.LJFF(str, "facebook") && (numLIZLLL = C1072570e19.LIZ.LIZLLL()) != null) {
            c2344009Gk.LIZJ(numLIZLLL.intValue(), "server_fb_token");
        }
        C20684815ws.LJIILLIIL("find_friends", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1074380e44 LJIL(Fragment fragment, HomePageDataViewModel homePageDataViewModel, C1590150rTx c1590150rTx) {
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            ViewModelProviders.of(activity).get(SocialRecFriendsConditionViewModel.class);
            return new C1072730e1P(fragment, c1590150rTx);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Fragment LJIILL(EnumC1262450ixP enumC1262450ixP, MufPageTrackInfo mufPageTrackInfo, int i, Function0<Unit> function0) {
        MufListPageFragment.LLJZIJLIL.getClass();
        Bundle bundle = new Bundle();
        String json = GsonProtectorUtils.toJson(MufListPageFragment.LLLF, mufPageTrackInfo);
        bundle.putInt(Scene.SCENE_SERVICE, enumC1262450ixP.getValue());
        C786410Ut5.LJJJI("track_info", json, bundle);
        MufListPageFragment mufListPageFragment = new MufListPageFragment();
        mufListPageFragment.setArguments(bundle);
        mufListPageFragment.LLJLLL = i;
        mufListPageFragment.LLJZ = function0;
        return mufListPageFragment;
    }
}
