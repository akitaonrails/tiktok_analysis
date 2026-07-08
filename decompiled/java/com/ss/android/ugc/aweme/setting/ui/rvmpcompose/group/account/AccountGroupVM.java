package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1204004nO;
import X.C1207504nx;
import X.C1253840ijW;
import X.C13DV;
import X.C13IQ;
import X.C13LE;
import X.C1555930qal;
import X.C1697820uHc;
import X.C1865390ydt;
import X.C19328610jc;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2174281A7m;
import X.C2174501A8i;
import X.C2174541A8m;
import X.C2174551A8n;
import X.C2217401BqU;
import X.C289300BVo;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.C844470XAv;
import X.EnumC2174511A8j;
import X.InterfaceC0148002o;
import X.InterfaceC1253830ijV;
import X.InterfaceC19211810Ea;
import X.InterfaceC2027807wy;
import X.InterfaceC2217461Bqa;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.AccountGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AccountVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AnalyticsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.MyQrCodeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.OrdersVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.PrivacyVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.ReferralInviteFriendsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.SecurityAndPermissionsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.ShareProfileVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.SignUpVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.TiktokPlusVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.WalletVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS45S0010000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class AccountGroupVM extends BaseGroupSettingsVM<EnumC2174511A8j, C1555930qal> {
    public static final C2174551A8n LLILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public boolean LL;
    public final C2174541A8m LLILLJJLI = new InterfaceC2027807wy() { // from class: X.1A8m
        @Override // X.InterfaceC2027807wy
        public final void LIZ(String str, String str2, String str3, String str4, boolean z) {
            AccountGroupVM accountGroupVM = this.LIZ;
            accountGroupVM.LL = z;
            accountGroupVM.setState(new AwS45S0010000_33(z, 5));
        }
    };

    /* JADX WARN: Type inference failed for: r0v23, types: [X.1A8n] */
    static {
        C2217401BqU c2217401BqU = new C2217401BqU(AccountGroupVM.class, "accountVM", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217401BqU, new C2217401BqU(AccountGroupVM.class, "analyticsVM", "<v#1>", 0), new C2217401BqU(AccountGroupVM.class, "ordersVM", "<v#2>", 0), new C2217401BqU(AccountGroupVM.class, "privacyVM", "<v#3>", 0), new C2217401BqU(AccountGroupVM.class, "myQrCodeCell", "<v#4>", 0), new C2217401BqU(AccountGroupVM.class, "referralInviteFriendsCell", "<v#5>", 0), new C2217401BqU(AccountGroupVM.class, "securityAndPermissionsCell", "<v#6>", 0), new C2217401BqU(AccountGroupVM.class, "shareProfileCell", "<v#7>", 0), new C2217401BqU(AccountGroupVM.class, "signUpCell", "<v#8>", 0), new C2217401BqU(AccountGroupVM.class, "tiktokPlusCell", "<v#9>", 0), new C2217401BqU(AccountGroupVM.class, "walletCell", "<v#10>", 0)};
        LLILLL = new Object() { // from class: X.1A8n
        };
    }

    public final C1555930qal xQ2() {
        List listLIZIZ;
        if (C1204004nO.LIZ) {
            listLIZIZ = EnumC2174511A8j.getEntries();
        } else {
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            c13dvLIZIZ.add(EnumC2174511A8j.SECTION_HEADER);
            if (C2174281A7m.LIZ()) {
                c13dvLIZIZ.add(EnumC2174511A8j.ACCOUNT_ITEM);
            }
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (SharePrefCache.inst().getCanCreateInsights().LIZ().booleanValue() && curUser != null && curUser.getIsCreater()) {
                C1865390ydt.LIZ.getClass();
                if (C1865390ydt.LIZ()) {
                    c13dvLIZIZ.add(EnumC2174511A8j.ANALYTICS);
                }
            }
            if (this.LL) {
                c13dvLIZIZ.add(EnumC2174511A8j.ORDERS);
            }
            if (!C1207504nx.LIZ() && ComplianceServiceProvider.LJIJJ().LJJIII()) {
                c13dvLIZIZ.add(EnumC2174511A8j.PRIVACY);
            }
            if (C2174281A7m.LIZ() && ((Number) C289300BVo.LIZ.getValue()).intValue() == 0 && C0XQ7.LIZJ().isEnableMultiAccountLogin()) {
                c13dvLIZIZ.add(EnumC2174511A8j.QRCODE);
            }
            if (!TextUtils.isEmpty(SharePrefCache.inst().getReferralEntrance().LIZ())) {
                c13dvLIZIZ.add(EnumC2174511A8j.REFERRAL_INVITE_FRIENDS);
            }
            if (C2174281A7m.LIZ()) {
                c13dvLIZIZ.add(EnumC2174511A8j.SECURITY_AND_PERMISSIONS);
            }
            if (C2174281A7m.LIZ()) {
                c13dvLIZIZ.add(EnumC2174511A8j.SHARE_PROFILE);
            }
            if (!C2174281A7m.LIZ()) {
                c13dvLIZIZ.add(EnumC2174511A8j.SIGNUP);
            }
            if (ComplianceServiceProvider.LJIILIIL().LJII()) {
                c13dvLIZIZ.add(EnumC2174511A8j.TIKTOK_PLUS);
            }
            LLILLL.getClass();
            InterfaceC1253830ijV interfaceC1253830ijVLJJL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJL();
            boolean zLJIIIZ = interfaceC1253830ijVLJJL != null ? interfaceC1253830ijVLJJL.LJIIIZ() : false;
            if (C1253840ijW.LIZJ()) {
                C844470XAv.LIZ.getClass();
                if (!TextUtils.equals(C844470XAv.LJIILL, "amazon") && !zLJIIIZ && C2174281A7m.LIZ()) {
                    c13dvLIZIZ.add(EnumC2174511A8j.WALLET);
                }
            }
            listLIZIZ = C19328610jc.LIZIZ(C19328610jc.LIZ(C1697820uHc.LIZ(c13dvLIZIZ)));
        }
        return new C1555930qal(listLIZIZ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return xQ2();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C2174501A8i.LIZIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setState(new AwS612S0100000_33(this, 204));
                return;
            }
            return;
        }
        ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).orderCenterService().LJ().LIZIZ(getLifecycle(), this.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM
    public final BaseCellSettingsVM vQ2(Fragment fragment, InterfaceC19211810Ea interfaceC19211810Ea) {
        switch (C2174501A8i.LIZ[((EnumC2174511A8j) interfaceC19211810Ea).ordinal()]) {
            case 1:
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(AccountVM.class);
                AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 426), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4034), AFwS279S0000000_33.get$arr$(379));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy.getValue();
            case 2:
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AnalyticsVM.class);
                AssemVMLazy assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), new C5182020e((C13IQ) c19719912DlLIZ2, 421), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4036), AFwS279S0000000_33.get$arr$(371));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy2.getValue();
            case 3:
                C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(OrdersVM.class);
                AssemVMLazy assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ3), new C5182020e((C13IQ) c19719912DlLIZ3, 423), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4038), AFwS279S0000000_33.get$arr$(373));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy3.getValue();
            case 4:
                C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PrivacyVM.class);
                AssemVMLazy assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ4), new C5182020e((C13IQ) c19719912DlLIZ4, 420), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4035), AFwS279S0000000_33.get$arr$(370));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy4.getValue();
            case 5:
                C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(MyQrCodeVM.class);
                AssemVMLazy assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ5), new C5182020e((C13IQ) c19719912DlLIZ5, 422), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4037), AFwS279S0000000_33.get$arr$(372));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr5 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy5.getValue();
            case 6:
                C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(ReferralInviteFriendsVM.class);
                AssemVMLazy assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ6), new C5182020e((C13IQ) c19719912DlLIZ6, 424), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4039), AFwS279S0000000_33.get$arr$(374));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr6 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy6.getValue();
            case 7:
                C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(SecurityAndPermissionsVM.class);
                AssemVMLazy assemVMLazy7 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ7), new C5182020e((C13IQ) c19719912DlLIZ7, 425), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4040), AFwS279S0000000_33.get$arr$(375));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr7 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy7.getValue();
            case 8:
                C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(ShareProfileVM.class);
                AssemVMLazy assemVMLazy8 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ8), new C5182020e((C13IQ) c19719912DlLIZ8, 427), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4041), AFwS279S0000000_33.get$arr$(376));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr8 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy8.getValue();
            case BdTuring.TYPE_ECAF /* 9 */:
                C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(SignUpVM.class);
                AssemVMLazy assemVMLazy9 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ9), new C5182020e((C13IQ) c19719912DlLIZ9, 428), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4042), AFwS279S0000000_33.get$arr$(377));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr9 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy9.getValue();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C19719912Dl c19719912DlLIZ10 = C13LE.LIZ(TiktokPlusVM.class);
                AssemVMLazy assemVMLazy10 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ10), new C5182020e((C13IQ) c19719912DlLIZ10, 429), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4043), AFwS279S0000000_33.get$arr$(378));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr10 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy10.getValue();
            case BdTuring.TYPE_EMAIL /* 11 */:
                C19719912Dl c19719912DlLIZ11 = C13LE.LIZ(WalletVM.class);
                AssemVMLazy assemVMLazy11 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ11), new C5182020e((C13IQ) c19719912DlLIZ11, 430), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4033), AFwS279S0000000_33.get$arr$(380));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr11 = LLILZ;
                return (BaseCellSettingsVM) assemVMLazy11.getValue();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
