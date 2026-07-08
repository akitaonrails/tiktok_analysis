package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login;

import X.C09R3;
import X.C13IQ;
import X.C13LE;
import X.C1555940qam;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2174271A7l;
import X.C2217401BqU;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.EnumC2174261A7k;
import X.InterfaceC19211810Ea;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.LogoutVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.SwitchAccountVM;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LoginGroupVM extends BaseGroupSettingsVM<EnumC2174261A7k, C1555940qam> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final List<String> LL = ComplianceServiceProvider.LJJI().LJI();

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(LoginGroupVM.class, "switchAccountVM", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(LoginGroupVM.class, "logoutVM", "<v#1>", 0);
        c09r3.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2};
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.LL
            java.util.Iterator r2 = r0.iterator()
        L6:
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = "switch_account"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6
        L19:
            r3 = 1
            if (r1 != 0) goto L81
            boolean r0 = X.C2174281A7m.LIZ()
            if (r0 == 0) goto L81
            r2 = 1
        L23:
            java.util.List<java.lang.String> r0 = r5.LL
            java.util.Iterator r4 = r0.iterator()
        L29:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r1 = r4.next()
            java.lang.String r0 = "logout"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L29
            if (r1 != 0) goto L7f
        L3d:
            boolean r0 = X.C2174281A7m.LIZ()
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.ILoginService r0 = X.C0XQ7.LIZJ()
            boolean r0 = r0.isEnableMultiAccountLogin()
            if (r0 == 0) goto L7f
        L4d:
            boolean r0 = X.C1204004nO.LIZ
            if (r0 == 0) goto L5b
            X.07zh r1 = X.EnumC2174261A7k.getEntries()
        L55:
            X.0qam r0 = new X.0qam
            r0.<init>(r1, r2, r3)
            return r0
        L5b:
            X.13DV r1 = X.C1697820uHc.LIZIZ()
            X.1A7k r0 = X.EnumC2174261A7k.SECTION_HEADER
            r1.add(r0)
            if (r3 == 0) goto L6b
            X.1A7k r0 = X.EnumC2174261A7k.SWITCH_ACCOUNT
            r1.add(r0)
        L6b:
            if (r2 == 0) goto L72
            X.1A7k r0 = X.EnumC2174261A7k.LOGOUT
            r1.add(r0)
        L72:
            java.util.List r0 = X.C1697820uHc.LIZ(r1)
            java.util.List r0 = X.C19328610jc.LIZ(r0)
            java.util.List r1 = X.C19328610jc.LIZIZ(r0)
            goto L55
        L7f:
            r3 = 0
            goto L4d
        L81:
            r2 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.LoginGroupVM.defaultState():X.002o");
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM
    public final BaseCellSettingsVM vQ2(Fragment fragment, InterfaceC19211810Ea interfaceC19211810Ea) {
        int i = C2174271A7l.LIZ[((EnumC2174261A7k) interfaceC19211810Ea).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                throw new C1954807lC();
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(LogoutVM.class);
            AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 631), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4181), AFwS279S0000000_33.get$arr$(434));
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
            return (BaseCellSettingsVM) assemVMLazy.getValue();
        }
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SwitchAccountVM.class);
        AssemVMLazy assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), new C5182020e((C13IQ) c19719912DlLIZ2, 630), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4180), AFwS279S0000000_33.get$arr$(433));
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILLJJLI;
        return (BaseCellSettingsVM) assemVMLazy2.getValue();
    }
}
