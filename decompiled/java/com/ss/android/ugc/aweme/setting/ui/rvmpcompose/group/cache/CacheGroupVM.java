package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache;

import X.C09R3;
import X.C0C64;
import X.C0CLW;
import X.C1204004nO;
import X.C131300el;
import X.C13DV;
import X.C13IQ;
import X.C13LE;
import X.C1555890qah;
import X.C1697820uHc;
import X.C1905290zgF;
import X.C19328610jc;
import X.C19328810je;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1EE1;
import X.C2174281A7m;
import X.C2174531A8l;
import X.C2217401BqU;
import X.C2413209cw;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import X.C844470XAv;
import X.EnumC2174521A8k;
import X.InterfaceC0148002o;
import X.InterfaceC19211810Ea;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.CheckUpdateSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.ClearCacheVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.DataSaverVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.LiteModeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.LocalLiveWallpaperVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.OfflineVideosVM;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class CacheGroupVM extends BaseGroupSettingsVM<EnumC2174521A8k, C1555890qah> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(CacheGroupVM.class, "checkUpdateSettingsVM", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(CacheGroupVM.class, "clearCacheVM", "<v#1>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU3 = new C2217401BqU(CacheGroupVM.class, "dataSaverVM", "<v#2>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU4 = new C2217401BqU(CacheGroupVM.class, "localLiveWallpaperVM", "<v#3>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU5 = new C2217401BqU(CacheGroupVM.class, "offlineVideosVM", "<v#4>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU6 = new C2217401BqU(CacheGroupVM.class, "liteModeVM", "<v#5>", 0);
        c09r3.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2, c2217401BqU3, c2217401BqU4, c2217401BqU5, c2217401BqU6};
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        List listLIZIZ;
        if (C1204004nO.LIZ) {
            listLIZIZ = EnumC2174521A8k.getEntries();
        } else {
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            c13dvLIZIZ.add(EnumC2174521A8k.SECTION_HEADER);
            Integer inappUpdateSwitchStrategy = C0CLW.LIZIZ.LIZ.getInappUpdateSwitchStrategy();
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF("googleplay", C844470XAv.LJIILL) && inappUpdateSwitchStrategy != null && ((inappUpdateSwitchStrategy.intValue() == 3 || inappUpdateSwitchStrategy.intValue() == 2) && ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIIZILJ())) {
                c13dvLIZIZ.add(EnumC2174521A8k.CHECK_UPDATE);
            }
            c13dvLIZIZ.add(EnumC2174521A8k.CLEAR_CACHE);
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "data_saver_mode", true) != 0) {
                c13dvLIZIZ.add(EnumC2174521A8k.DATA_SAVER);
            }
            C2413209cw.LIZ.getClass();
            IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
            if (iWallpaperServiceApiLIZ != null && !iWallpaperServiceApiLIZ.LJIIJJI() && iWallpaperServiceApiLIZ != null && iWallpaperServiceApiLIZ.LIZIZ()) {
                c13dvLIZIZ.add(EnumC2174521A8k.LOCAL_LIVE_WALLPAPER);
            }
            if (!C131300el.LIZ && C2174281A7m.LIZ() && C1EE1.LIZIZ.LJJIZ()) {
                EnumC2174521A8k enumC2174521A8k = EnumC2174521A8k.OFFLINE_VIDEOS;
                C19328810je.LIZIZ(enumC2174521A8k.getKey());
                c13dvLIZIZ.add(enumC2174521A8k);
            }
            if (C1905290zgF.LIZIZ()) {
                c13dvLIZIZ.add(EnumC2174521A8k.LITE_MODE);
            }
            listLIZIZ = C19328610jc.LIZIZ(C19328610jc.LIZ(C1697820uHc.LIZ(c13dvLIZIZ)));
        }
        return new C1555890qah(listLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseGroupSettingsVM
    public final BaseCellSettingsVM vQ2(Fragment fragment, InterfaceC19211810Ea interfaceC19211810Ea) {
        switch (C2174531A8l.LIZ[((EnumC2174521A8k) interfaceC19211810Ea).ordinal()]) {
            case 1:
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(CheckUpdateSettingsVM.class);
                AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 543), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4114), AFwS279S0000000_33.get$arr$(404));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LL;
                return (BaseCellSettingsVM) assemVMLazy.getValue();
            case 2:
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ClearCacheVM.class);
                AssemVMLazy assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), new C5182020e((C13IQ) c19719912DlLIZ2, 544), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4115), AFwS279S0000000_33.get$arr$(405));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LL;
                return (BaseCellSettingsVM) assemVMLazy2.getValue();
            case 3:
                C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(DataSaverVM.class);
                AssemVMLazy assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ3), new C5182020e((C13IQ) c19719912DlLIZ3, 545), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4116), AFwS279S0000000_33.get$arr$(406));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LL;
                return (BaseCellSettingsVM) assemVMLazy3.getValue();
            case 4:
                C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(LocalLiveWallpaperVM.class);
                AssemVMLazy assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ4), new C5182020e((C13IQ) c19719912DlLIZ4, 540), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4111), AFwS279S0000000_33.get$arr$(401));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = LL;
                return (BaseCellSettingsVM) assemVMLazy4.getValue();
            case 5:
                C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(OfflineVideosVM.class);
                AssemVMLazy assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ5), new C5182020e((C13IQ) c19719912DlLIZ5, 541), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4112), AFwS279S0000000_33.get$arr$(402));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr5 = LL;
                return (BaseCellSettingsVM) assemVMLazy5.getValue();
            case 6:
                C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(LiteModeVM.class);
                AssemVMLazy assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ6), new C5182020e((C13IQ) c19719912DlLIZ6, 542), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) fragment, 4113), AFwS279S0000000_33.get$arr$(403));
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr6 = LL;
                return (BaseCellSettingsVM) assemVMLazy6.getValue();
            case 7:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
