package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy;

import X.C01D1;
import X.C08CP;
import X.C103F;
import X.C1207504nx;
import X.C13BV;
import X.C13DA;
import X.C13IQ;
import X.C13LE;
import X.C1548820qPI;
import X.C1555920qak;
import X.C1622206Wu;
import X.C191871104n;
import X.C191879104v;
import X.C19205510Bp;
import X.C19205610Bq;
import X.C19334410kY;
import X.C19719912Dl;
import X.C20684815ws;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.C987103tV;
import X.EnumC1672210tcJ;
import X.InterfaceC0148002o;
import X.InterfaceC1688870u3B;
import X.InterfaceC19211810Ea;
import X.InterfaceC2044707zh;
import X.InterfaceC989510brB;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.PrivacyGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.BlockedAccountsVM;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class PrivacyGroupVM extends BaseGroupSettingsVM<InterfaceC1688870u3B, C1555920qak> {
    public static final AtomicBoolean LLILZ = new AtomicBoolean(false);
    public static final AtomicBoolean LLILZIL = new AtomicBoolean(false);
    public static Long LLILZLL;
    public static Long LLIZ;
    public C19205510Bp LL;
    public C19205610Bq LLILLJJLI;
    public C19334410kY LLILLL;

    public abstract InterfaceC2044707zh yQ2();

    public final void AQ2() {
        C19205510Bp c19205510Bp = this.LL;
        if (c19205510Bp != null) {
            C191871104n.LIZIZ().getClass();
            ((CopyOnWriteArrayList) C191879104v.LIZIZ).remove(c19205510Bp);
        }
        this.LL = null;
        C19205610Bq c19205610Bq = this.LLILLJJLI;
        if (c19205610Bq != null) {
            C191871104n.LJFF.getValue().getClass();
            C103F.LIZIZ.remove(c19205610Bq);
        }
        this.LLILLJJLI = null;
        C19334410kY c19334410kY = this.LLILLL;
        if (c19334410kY != null) {
            C1548820qPI.LJIIIIZZ("privacy-settings-refresh", c19334410kY);
        }
        this.LLILLL = null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1555920qak(xQ2());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        AQ2();
        super.onCleared();
    }

    public final List<InterfaceC1688870u3B> xQ2() {
        IAccountUserService iAccountUserService;
        List listLJIIZILJ;
        if (!C1207504nx.LIZ() || ((iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null)) != null && !iAccountUserService.isLogin())) {
            return C13BV.INSTANCE;
        }
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        if (iPrivacySettingAPIService == null || (listLJIIZILJ = iPrivacySettingAPIService.LJIIZILJ()) == null || listLJIIZILJ.isEmpty()) {
            return C13BV.INSTANCE;
        }
        InterfaceC2044707zh interfaceC2044707zhYQ2 = yQ2();
        ArrayList arrayList = new ArrayList();
        for (Object obj : interfaceC2044707zhYQ2) {
            InterfaceC19211810Ea interfaceC19211810Ea = (InterfaceC19211810Ea) obj;
            if (interfaceC19211810Ea.getHeadingItem() || listLJIIZILJ.contains(interfaceC19211810Ea.getKey())) {
                arrayList.add(obj);
            }
        }
        return (arrayList.size() == 1 && ((InterfaceC19211810Ea) ListProtector.get(arrayList, 0)).getHeadingItem()) ? C13BV.INSTANCE : arrayList;
    }

    public static void zQ2(String str, Map map) {
        C13DA c13da = new C13DA();
        c13da.put("page_tag", "settings");
        c13da.put("page_type", "page");
        c13da.put("enter_from", "settings_page");
        if (map != null) {
            c13da.putAll(map);
        }
        C20684815ws.LJIILLIIL(str, c13da.build());
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.10Bq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.10Bp, java.lang.Object] */
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!C1207504nx.LIZ()) {
            return;
        }
        int i = C08CP.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (LLILZ.compareAndSet(true, false)) {
                            C13DA c13da = new C13DA();
                            Long l = LLILZLL;
                            if (l != null) {
                                c13da.put("stay_time", String.valueOf(System.currentTimeMillis() - l.longValue()));
                            }
                            zQ2("pns_tpsc_page_exit", c13da.build());
                            LLILZLL = null;
                            ComplianceServiceProvider.LJIJJ().LJJIJIIJIL();
                            IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
                            if (iPrivacySettingAPIService != null) {
                                iPrivacySettingAPIService.LJIJI();
                            }
                        }
                        AQ2();
                        return;
                    }
                    return;
                }
                if (!LLILZIL.compareAndSet(true, false)) {
                    return;
                }
                C13DA c13da2 = new C13DA();
                Long l2 = LLIZ;
                if (l2 != null) {
                    c13da2.put("stay_time", String.valueOf(System.currentTimeMillis() - l2.longValue()));
                }
                zQ2("pns_tpsc_page_hide", c13da2.build());
                LLIZ = null;
                return;
            }
            if (!LLILZIL.compareAndSet(false, true)) {
                return;
            }
            zQ2("pns_tpsc_page_show", null);
            LLIZ = Long.valueOf(System.currentTimeMillis());
            return;
        }
        if (this.LL == null) {
            ?? r1 = new InterfaceC989510brB<PrivacySettingsRestriction>() { // from class: X.10Bp
                @Override // X.InterfaceC989510brB
                public final void LLZZLLIL(PrivacySettingsRestriction privacySettingsRestriction) {
                    PrivacyGroupVM privacyGroupVM = this.LL;
                    privacyGroupVM.getClass();
                    privacyGroupVM.setState(new AwS607S0100000_28(privacyGroupVM, 405));
                }
            };
            this.LL = r1;
            C191871104n.LIZIZ().getClass();
            ((CopyOnWriteArrayList) C191879104v.LIZIZ).add(r1);
        }
        if (this.LLILLJJLI == null) {
            ?? r12 = new InterfaceC989510brB<Unit>() { // from class: X.10Bq
                @Override // X.InterfaceC989510brB
                public final void LLZZLLIL(Unit unit) {
                    PrivacyGroupVM privacyGroupVM = this.LL;
                    privacyGroupVM.getClass();
                    privacyGroupVM.setState(new AwS607S0100000_28(privacyGroupVM, 405));
                }
            };
            this.LLILLJJLI = r12;
            C191871104n.LJFF.getValue().getClass();
            C103F.LIZIZ.add((InterfaceC989510brB<Unit>) r12);
        }
        if (this.LLILLL == null) {
            C19334410kY c19334410kY = new C19334410kY(new WeakReference(lifecycleOwner), 1);
            this.LLILLL = c19334410kY;
            C1548820qPI.LIZLLL("privacy-settings-refresh", c19334410kY);
        }
        if (!LLILZ.compareAndSet(false, true)) {
            return;
        }
        IPrivacySettingAPIService iPrivacySettingAPIService2 = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        if (iPrivacySettingAPIService2 != null) {
            iPrivacySettingAPIService2.LJIIJJI(lifecycleOwner, "settings");
        }
        zQ2("pns_tpsc_page_enter", null);
        LLILZLL = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM
    public final BaseCellSettingsVM vQ2(Fragment fragment, InterfaceC19211810Ea interfaceC19211810Ea) {
        AssemVMLazy assemVMLazy;
        InterfaceC1688870u3B interfaceC1688870u3B = (InterfaceC1688870u3B) interfaceC19211810Ea;
        if (!C1207504nx.LIZ() || interfaceC1688870u3B.getHeadingItem()) {
            return null;
        }
        if (interfaceC1688870u3B == EnumC1672210tcJ.BLOCKED_ACCOUNT) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(BlockedAccountsVM.class);
            C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 646);
            AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(456);
            if (Intrinsics.LJFF(null, C01D1.LIZ)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) fragment, 1107), aFwS271S0000000_28, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
            } else {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS572S0100000_28((HasDefaultViewModelProviderFactory) fragment, 1108), aFwS271S0000000_28, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
            }
        } else {
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(interfaceC1688870u3B, 1109);
            AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28(interfaceC1688870u3B, 1110);
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BlockedAccountsVM.class);
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), awS572S0100000_28, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), awS572S0100000_282, AFwS271S0000000_28.get$arr$(457));
        }
        return (BaseCellSettingsVM) assemVMLazy.getValue();
    }
}
