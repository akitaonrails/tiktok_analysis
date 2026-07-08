package com.ss.android.ugc.aweme.services;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C07GX;
import X.C0A21;
import X.C0A23;
import X.C0XQ7;
import X.C13LQ;
import X.C376710Epp;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C814420VxA;
import X.C815900VzY;
import X.C844470XAv;
import X.EnumC815990Vzh;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IClearCacheService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes22.dex */
public final class ClearCacheService implements IClearCacheService {
    public final C01GW keva$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(631));
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;

    public static final class Companion {
    }

    private final void clearClearCacheShortcutState() {
        try {
            updateShouldShowShortcut(false);
            IShortcutService iShortcutService = (IShortcutService) PluggableExtentionKt.pluggableSpi$default(IShortcutService.class, false, false, false, 14, null);
            if (iShortcutService == null) {
                return;
            }
            EnumC815990Vzh enumC815990Vzh = EnumC815990Vzh.CLEAN_MEMORY;
            if (iShortcutService.LIZLLL(enumC815990Vzh.getShortcutId())) {
                iShortcutService.LJII(Collections.singletonList(enumC815990Vzh));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private final Keva getKeva() {
        return (Keva) this.keva$delegate.getValue();
    }

    private final boolean isClearCacheShortcutEnabled() {
        return ((Boolean) C0A23.LIZ.getValue()).booleanValue() && ((Boolean) C07GX.LIZIZ.getValue()).booleanValue();
    }

    private final boolean shouldShowShortcut() {
        return Keva.getRepo("clear_cache_service").getBoolean("should_add_shortcut", false);
    }

    public void removeFreeUpSpaceShortcut() {
        if (Build.VERSION.SDK_INT < 25) {
            return;
        }
        ((IShortcutService) ServiceManager.get().getService(IShortcutService.class)).LJII(Collections.singletonList(EnumC815990Vzh.CLEAN_MEMORY));
    }

    @Override // com.ss.android.ugc.aweme.IClearCacheService
    public boolean retryAddClearCacheShortcut() {
        if (Build.VERSION.SDK_INT < 25 || !shouldShowShortcut()) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        return addClearCacheShortcut(C844470XAv.LIZ());
    }

    private final boolean isInFirstDayWindow() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = getKeva().getLong("initial_timestamp", 0L);
        if (j != 0) {
            return jCurrentTimeMillis - j < 86400000;
        }
        getKeva().storeLong("initial_timestamp", jCurrentTimeMillis);
        return true;
    }

    private final boolean isInRestrictedRegions() {
        return C13LQ.LJLIIL(new String[]{"US", "AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "EL", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK"}).contains(((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase());
    }

    private final boolean shouldShowTcpConsent() {
        return ((ITpcConsentService) ServiceManager.get().getService(ITpcConsentService.class)).LJ();
    }

    private final boolean addClearCacheShortcut(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            return false;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_3pt_broom;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        List listSingletonList = Collections.singletonList(new C815900VzY(EnumC815990Vzh.CLEAN_MEMORY, getClearCacheShortcutLabel(context), Icon.createWithBitmap(C376710Epp.LIZIZ(c419910GdJ.LIZ(context))), Collections.singletonList("//setting/diskmanager_compose"), isInRestrictedRegions(), (Integer) 3));
        if (((IShortcutService) ServiceManager.get().getService(IShortcutService.class)).LJFF(listSingletonList).size() != listSingletonList.size()) {
            return false;
        }
        return true;
    }

    private final String getClearCacheShortcutLabel(Context context) {
        int i;
        if (!isInRestrictedRegions() && ((Boolean) C0A21.LIZ.getValue()).booleanValue()) {
            i = 2131834888;
        } else {
            i = R.string.uninstall_longpress_clear_cache;
        }
        return context.getString(i);
    }

    private final void updateShouldShowShortcut(boolean z) {
        Keva.getRepo("clear_cache_service").storeBoolean("should_add_shortcut", z);
    }

    @Override // com.ss.android.ugc.aweme.IClearCacheService
    public boolean tryAddClearCacheShortcut(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            return false;
        }
        if (isInRestrictedRegions()) {
            if (!isClearCacheShortcutEnabled()) {
                clearClearCacheShortcutState();
                return false;
            }
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                clearClearCacheShortcutState();
                return false;
            }
        }
        if (isInFirstDayWindow() && !((Boolean) C07GX.LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        if (shouldShowTcpConsent()) {
            updateShouldShowShortcut(true);
            return true;
        }
        return addClearCacheShortcut(context);
    }
}
