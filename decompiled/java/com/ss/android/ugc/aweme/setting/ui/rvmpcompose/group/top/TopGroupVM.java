package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top;

import X.C09R3;
import X.C13IQ;
import X.C13LE;
import X.C1555880qag;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2174451A8d;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217401BqU;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.EnumC2174461A8e;
import X.InterfaceC19211810Ea;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ActivityCenterVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContentPreferenceVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.FamilyPairingVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LiveVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.NotificationVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ScreenTimeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top.cell.ManagePostsVM;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class TopGroupVM extends BaseGroupSettingsVM<EnumC2174461A8e, C1555880qag> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(TopGroupVM.class, "activityCenterVM", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(TopGroupVM.class, "managePostsVM", "<v#1>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU3 = new C2217401BqU(TopGroupVM.class, "notificationVM", "<v#2>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU4 = new C2217401BqU(TopGroupVM.class, "contentPreferenceVM", "<v#3>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU5 = new C2217401BqU(TopGroupVM.class, "liveVM", "<v#4>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU6 = new C2217401BqU(TopGroupVM.class, "screenTimeVM", "<v#5>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU7 = new C2217401BqU(TopGroupVM.class, "familyPairingVM", "<v#6>", 0);
        c09r3.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2, c2217401BqU3, c2217401BqU4, c2217401BqU5, c2217401BqU6, c2217401BqU7};
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:7|(1:15)|16|(1:20)|21|(1:23)|24|(1:26)|27|(1:32)(1:31)|(2:72|33)|(14:35|38|(1:40)|(1:43)|70|45|(1:52)(1:49)|53|(1:60)|61|(1:65)|66|(1:68)|69)|44|(1:43)|70|45|(9:47|52|53|(2:55|60)|61|(2:63|65)|66|(0)|69)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00aa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top.TopGroupVM.defaultState():X.002o");
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM
    public final BaseCellSettingsVM vQ2(Fragment fragment, InterfaceC19211810Ea interfaceC19211810Ea) {
        switch (C2174451A8d.LIZ[((EnumC2174461A8e) interfaceC19211810Ea).ordinal()]) {
            case 1:
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(ActivityCenterVM.class);
                AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 163), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3789), AFwS279S0000000_33.get$arr$(275));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LL;
                return (BaseCellSettingsVM) assemVMLazy.getValue();
            case 2:
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ManagePostsVM.class);
                AssemVMLazy assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), new C5182020e((C13IQ) c19719912DlLIZ2, 164), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3790), AFwS274S0000000_30.get$arr$(235));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LL;
                return (BaseCellSettingsVM) assemVMLazy2.getValue();
            case 3:
                C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(NotificationVM.class);
                AssemVMLazy assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ3), new C5182020e((C13IQ) c19719912DlLIZ3, 165), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3791), AFwS279S0000000_33.get$arr$(276));
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getCellVM NotificationVM ");
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LL;
                sbLIZ.append(assemVMLazy3.getValue());
                C2188811AlT.LIZIZ(sbLIZ);
                return (BaseCellSettingsVM) assemVMLazy3.getValue();
            case 4:
                C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ContentPreferenceVM.class);
                AssemVMLazy assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ4), new C5182020e((C13IQ) c19719912DlLIZ4, 159), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3785), AFwS279S0000000_33.get$arr$(271));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = LL;
                return (BaseCellSettingsVM) assemVMLazy4.getValue();
            case 5:
                C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(LiveVM.class);
                AssemVMLazy assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ5), new C5182020e((C13IQ) c19719912DlLIZ5, 160), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3786), AFwS279S0000000_33.get$arr$(272));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr5 = LL;
                return (BaseCellSettingsVM) assemVMLazy5.getValue();
            case 6:
                C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(ScreenTimeVM.class);
                AssemVMLazy assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ6), new C5182020e((C13IQ) c19719912DlLIZ6, 161), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3787), AFwS279S0000000_33.get$arr$(273));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr6 = LL;
                return (BaseCellSettingsVM) assemVMLazy6.getValue();
            case 7:
                C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(FamilyPairingVM.class);
                AssemVMLazy assemVMLazy7 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ7), new C5182020e((C13IQ) c19719912DlLIZ7, 162), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 3788), AFwS279S0000000_33.get$arr$(274));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr7 = LL;
                return (BaseCellSettingsVM) assemVMLazy7.getValue();
            case 8:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
