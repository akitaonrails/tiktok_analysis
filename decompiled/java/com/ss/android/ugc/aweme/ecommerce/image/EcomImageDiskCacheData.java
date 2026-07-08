package com.ss.android.ugc.aweme.ecommerce.image;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomImageDiskCacheData {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_clear_zero_size_disk_cache")
    public final boolean enableClearZeroSizeDiskCache;

    @C09CT("enable_composite_main_cache_migration_fallback")
    public final boolean enableCompositeMainCacheMigrationFallback;

    @C09CT("enable_first_screen_operation_cache")
    public final boolean enableFirstScreenOperationCache;

    @C09CT("enable_main_cache_migration_fallback")
    public final boolean enableMainCacheMigrationFallback;

    @C09CT("first_screen_operation_api_list")
    public final List<String> firstScreenOperationApiList;

    @C09CT("low_storage_main_disk_size")
    public final int lowStorageMainSize;

    @C09CT("low_storage_opera_disk_size")
    public final int lowStorageOperaSize;

    @C09CT("main_disk_size")
    public final int mainDiskSize;

    @C09CT("main_safe_check")
    public final boolean mainSafeCheck;

    @C09CT("operation_disk_size")
    public final int operationDiskSize;

    @C09CT("operation_list")
    public final List<String> operationList;

    public EcomImageDiskCacheData() {
        this(false, 0, 0, 0, 0, null, false, false, false, false, false, null, 4095, null);
    }

    public EcomImageDiskCacheData(boolean z, int i, int i2, int i3, int i4, List<String> list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<String> list2) {
        this.enable = z;
        this.mainDiskSize = i;
        this.operationDiskSize = i2;
        this.lowStorageMainSize = i3;
        this.lowStorageOperaSize = i4;
        this.operationList = list;
        this.mainSafeCheck = z2;
        this.enableClearZeroSizeDiskCache = z3;
        this.enableFirstScreenOperationCache = z4;
        this.enableMainCacheMigrationFallback = z5;
        this.enableCompositeMainCacheMigrationFallback = z6;
        this.firstScreenOperationApiList = list2;
    }

    public EcomImageDiskCacheData(boolean z, int i, int i2, int i3, int i4, List list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? 30 : i, (i5 & 4) != 0 ? 10 : i2, (i5 & 8) != 0 ? 12 : i3, (i5 & 16) != 0 ? 5 : i4, (i5 & 32) != 0 ? C13BV.INSTANCE : list, (i5 & 64) != 0 ? false : z2, (i5 & 128) != 0 ? false : z3, (i5 & 256) != 0 ? false : z4, (i5 & 512) != 0 ? false : z5, (i5 & 1024) == 0 ? z6 : false, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list2);
    }
}
