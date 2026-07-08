package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support;

import X.C09R3;
import X.C0C64;
import X.C1204004nO;
import X.C13DV;
import X.C13IQ;
import X.C13LE;
import X.C1555870qaf;
import X.C1697820uHc;
import X.C19328610jc;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2018907vX;
import X.C2174281A7m;
import X.C2174431A8b;
import X.C2174441A8c;
import X.C2217401BqU;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.C844470XAv;
import X.EnumC2174421A8a;
import X.InterfaceC0148002o;
import X.InterfaceC19211810Ea;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.AboutCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.AccountDeletionVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.BetaCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.FeedbackCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.OpenDebugCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PolicyUpdateVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PrivacyCenterVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PrivacyCheckupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.SupportCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.WhatsNewCellVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SupportGroupVM extends BaseGroupSettingsVM<EnumC2174421A8a, C1555870qaf> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final boolean LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(SupportGroupVM.class, "aboutVM", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(SupportGroupVM.class, "baseSettingsVM", "<v#1>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU3 = new C2217401BqU(SupportGroupVM.class, "feedbackVM", "<v#2>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU4 = new C2217401BqU(SupportGroupVM.class, "privacyCenterVM", "<v#3>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU5 = new C2217401BqU(SupportGroupVM.class, "privacyCheckupVM", "<v#4>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU6 = new C2217401BqU(SupportGroupVM.class, "openDebugVM", "<v#5>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU7 = new C2217401BqU(SupportGroupVM.class, "supportVM", "<v#6>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU8 = new C2217401BqU(SupportGroupVM.class, "whatsNewVM", "<v#7>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU9 = new C2217401BqU(SupportGroupVM.class, "accountDeletionVM", "<v#8>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU10 = new C2217401BqU(SupportGroupVM.class, "policyUpdateVM", "<v#9>", 0);
        c09r3.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2, c2217401BqU3, c2217401BqU4, c2217401BqU5, c2217401BqU6, c2217401BqU7, c2217401BqU8, c2217401BqU9, c2217401BqU10};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        List listLIZIZ;
        if (C1204004nO.LIZ) {
            listLIZIZ = EnumC2174421A8a.getEntries();
        } else {
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            c13dvLIZIZ.add(EnumC2174421A8a.SECTION_HEADER);
            c13dvLIZIZ.add(EnumC2174421A8a.ABOUT);
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "policy_update_entrance_enable", true, false) && !C2174281A7m.LIZ()) {
                c13dvLIZIZ.add(EnumC2174421A8a.POLICY_UPDATE);
            }
            BetaAppExperiment.LIZ.getClass();
            if (BetaAppExperiment.LIZJ()) {
                long j = BetaAppExperiment.LJI.getInt(BetaAppExperiment.LIZLLL, -1);
                C844470XAv.LIZ.getClass();
                if (j > C844470XAv.LJ() || BetaAppExperiment.LJIIIIZZ) {
                    c13dvLIZIZ.add(EnumC2174421A8a.BASE_SETTINGS);
                }
            }
            c13dvLIZIZ.add(EnumC2174421A8a.FEEDBACK);
            boolean z = C2018907vX.LIZ;
            if (z) {
                c13dvLIZIZ.add(EnumC2174421A8a.PRIVACY_CENTER);
                if (ComplianceServiceProvider.LJIJJ().LJIL()) {
                    c13dvLIZIZ.add(EnumC2174421A8a.PRIVACY_CHECKUP);
                }
            }
            if (!z) {
                c13dvLIZIZ.add(EnumC2174421A8a.SUPPORT);
            }
            if (ComplianceServiceProvider.LJIJJ().LJIIJ()) {
                c13dvLIZIZ.add(EnumC2174421A8a.ACCOUNT_DELETION);
            }
            if (this.LL && C2174441A8c.LIZIZ.LJ(EnumC2174421A8a.WHATS_NEW.getTag())) {
                c13dvLIZIZ.add(EnumC2174421A8a.WHATS_NEW);
            }
            listLIZIZ = C19328610jc.LIZIZ(C19328610jc.LIZ(C1697820uHc.LIZ(c13dvLIZIZ)));
        }
        return new C1555870qaf(listLIZIZ);
    }

    public SupportGroupVM() {
        C844470XAv.LIZ.getClass();
        this.LL = Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM
    public final BaseCellSettingsVM vQ2(Fragment fragment, InterfaceC19211810Ea interfaceC19211810Ea) {
        switch (C2174431A8b.LIZ[((EnumC2174421A8a) interfaceC19211810Ea).ordinal()]) {
            case 1:
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(AboutCellVM.class);
                AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 10), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 18), AFwS279S0000000_33.get$arr$(9));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy.getValue();
            case 2:
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BetaCellVM.class);
                AssemVMLazy assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), new C5182020e((C13IQ) c19719912DlLIZ2, 14), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 9), AFwS279S0000000_33.get$arr$(0));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy2.getValue();
            case 3:
                C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(FeedbackCellVM.class);
                AssemVMLazy assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ3), new C5182020e((C13IQ) c19719912DlLIZ3, 6), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 11), AFwS279S0000000_33.get$arr$(2));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy3.getValue();
            case 4:
                C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PrivacyCenterVM.class);
                AssemVMLazy assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ4), new C5182020e((C13IQ) c19719912DlLIZ4, 5), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 10), AFwS279S0000000_33.get$arr$(1));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy4.getValue();
            case 5:
                C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(PrivacyCheckupVM.class);
                AssemVMLazy assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ5), new C5182020e((C13IQ) c19719912DlLIZ5, 7), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 12), AFwS279S0000000_33.get$arr$(3));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr5 = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy5.getValue();
            case 6:
                C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(OpenDebugCellVM.class);
                AssemVMLazy assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ6), new C5182020e((C13IQ) c19719912DlLIZ6, 8), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 13), AFwS279S0000000_33.get$arr$(4));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr6 = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy6.getValue();
            case 7:
                C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(SupportCellVM.class);
                AssemVMLazy assemVMLazy7 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ7), new C5182020e((C13IQ) c19719912DlLIZ7, 9), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 14), AFwS279S0000000_33.get$arr$(5));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr7 = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy7.getValue();
            case 8:
                C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(WhatsNewCellVM.class);
                AssemVMLazy assemVMLazy8 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ8), new C5182020e((C13IQ) c19719912DlLIZ8, 11), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 15), AFwS279S0000000_33.get$arr$(6));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr8 = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy8.getValue();
            case BdTuring.TYPE_ECAF /* 9 */:
                C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(AccountDeletionVM.class);
                AssemVMLazy assemVMLazy9 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ9), new C5182020e((C13IQ) c19719912DlLIZ9, 12), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 16), AFwS279S0000000_33.get$arr$(7));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr9 = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy9.getValue();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C19719912Dl c19719912DlLIZ10 = C13LE.LIZ(PolicyUpdateVM.class);
                AssemVMLazy assemVMLazy10 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ10), new C5182020e((C13IQ) c19719912DlLIZ10, 13), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 17), AFwS279S0000000_33.get$arr$(8));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr10 = LLILLJJLI;
                return (BaseCellSettingsVM) assemVMLazy10.getValue();
            case BdTuring.TYPE_EMAIL /* 11 */:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
