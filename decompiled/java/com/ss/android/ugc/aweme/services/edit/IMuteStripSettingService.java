package com.ss.android.ugc.aweme.services.edit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public interface IMuteStripSettingService {
    CachedAutoMuteStripSettingStatus getCachedAutoMuteStripSetting(boolean z);

    String getProfileSnackType();

    void setAutoMuteStripSetting(boolean z, Function1<? super Integer, Unit> function1);

    void storeAutoMuteStripSetting(int i);

    public static final class DefaultImpls {
        public static /* synthetic */ CachedAutoMuteStripSettingStatus getCachedAutoMuteStripSetting$default(IMuteStripSettingService iMuteStripSettingService, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return iMuteStripSettingService.getCachedAutoMuteStripSetting(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCachedAutoMuteStripSetting");
        }
    }
}
