package com.ss.android.storage;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20596015iY;
import android.content.Context;
import android.os.Build;
import com.ss.android.storage.AVCreativeCacheCleanTask;
import com.ss.android.storage.cleaner.ActiveClearLiveStorage;
import com.ss.android.storage.cleaner.AwemeCacheStorageCleaner;
import com.ss.android.storage.cleaner.ByteBenchStorageCleaner;
import com.ss.android.storage.cleaner.CTNetCacheStorageCleaner;
import com.ss.android.storage.cleaner.DFStorageCleaner;
import com.ss.android.storage.cleaner.DexStorageCleaner;
import com.ss.android.storage.cleaner.FaqListCacheStorage;
import com.ss.android.storage.cleaner.FilesDraftStorage;
import com.ss.android.storage.cleaner.FilesDuetStorage;
import com.ss.android.storage.cleaner.FilesMusicDownloadStorage;
import com.ss.android.storage.cleaner.FilesShareStorage;
import com.ss.android.storage.cleaner.FilesVideoPreloadStorage;
import com.ss.android.storage.cleaner.GeckoStorage;
import com.ss.android.storage.cleaner.HybridStorageCleaner;
import com.ss.android.storage.cleaner.LiveGeckoStorage;
import com.ss.android.storage.cleaner.LiveGiftStorage;
import com.ss.android.storage.cleaner.LynxQuickJSStorageCleaner;
import com.ss.android.storage.cleaner.OfflineModeStorage;
import com.ss.android.storage.cleaner.PitayaStorageCleaner;
import com.ss.android.storage.cleaner.TTNetStorageCleaner;
import com.ss.android.storage.cleaner.VideoResourceStorage;
import com.ss.android.storage.cleaner.VideoShareCacheStorageCleanerV2;
import com.ss.android.storage.cleaner.WebViewStorageCleaner;
import com.ss.android.ugc.aweme.base.storage.M2StorageCleanInterface;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.storage.IAVStorageService;
import com.ss.android.ugc.aweme.video.simpreloader.IVideoCacheStorageService;
import com.ss.android.ugc.aweme.video.simpreloader.VideoCacheStorage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class M2StorageCleanInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "M2StorageCleanInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1E8z] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        M2StorageCleanInterface m2StorageCleanInterface = (M2StorageCleanInterface) PluggableExtentionKt.pluggableSpi$default(M2StorageCleanInterface.class, false, false, false, 14, null);
        if (m2StorageCleanInterface != 0) {
            m2StorageCleanInterface.LIZ(new InterfaceC20596015iY() { // from class: X.1E8z
                @Override // X.InterfaceC20596015iY
                public final List<InterfaceC345370DgN> LIZ() {
                    ArrayList<InterfaceC345370DgN> storageList;
                    List<InterfaceC345370DgN> storageList2;
                    VideoCacheStorage videoCacheStorageLIZ;
                    List<InterfaceC345370DgN> listLJIILJJIL = C1697810uHb.LJIILJJIL(new GeckoStorage(), new LiveGiftStorage(), new VideoResourceStorage(), new AVCreativeCacheCleanTask(), new LiveGeckoStorage(), new ActiveClearLiveStorage(), new OfflineModeStorage(), new CTNetCacheStorageCleaner(), new FilesDraftStorage(), new FilesDuetStorage(), new FilesMusicDownloadStorage(), new FilesShareStorage(), new FilesVideoPreloadStorage(), new FaqListCacheStorage(), new TTNetStorageCleaner(), new LynxQuickJSStorageCleaner(), new VideoShareCacheStorageCleanerV2(), new AwemeCacheStorageCleaner(), new WebViewStorageCleaner(), new HybridStorageCleaner(), new ByteBenchStorageCleaner());
                    IVideoCacheStorageService iVideoCacheStorageService = (IVideoCacheStorageService) PluggableExtentionKt.pluggableSpi$default(IVideoCacheStorageService.class, false, false, false, 14, null);
                    if (iVideoCacheStorageService != null && (videoCacheStorageLIZ = iVideoCacheStorageService.LIZ()) != null) {
                        listLJIILJJIL.add(videoCacheStorageLIZ);
                    }
                    if (((Boolean) C2250131D5f.LJFF.getValue()).booleanValue()) {
                        listLJIILJJIL.add(new DFStorageCleaner());
                    }
                    if (((Boolean) C2250131D5f.LJI.getValue()).booleanValue()) {
                        listLJIILJJIL.add(new DexStorageCleaner());
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        listLJIILJJIL.add(new PitayaStorageCleaner());
                    }
                    listLJIILJJIL.addAll(C1E90.LIZIZ.LIZ());
                    IAVStorageService iAVStorageService = (IAVStorageService) PluggableExtentionKt.pluggableSpi$default(IAVStorageService.class, false, false, false, 14, null);
                    if (iAVStorageService != null && (storageList2 = iAVStorageService.getStorageList()) != null) {
                        listLJIILJJIL.addAll(storageList2);
                    }
                    ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                    if (iLiveOuterService != null && (storageList = iLiveOuterService.getStorageList()) != null) {
                        listLJIILJJIL.addAll(storageList);
                    }
                    C19719612Di.LJJIIJ(listLJIILJJIL, AFwS276S0000000_31.get$arr$(47), true);
                    return listLJIILJJIL;
                }
            });
        }
    }
}
