package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C01GW;
import X.C13LQ;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ug_task_detail_page_list_settings")
public final class UgTaskDetailPageSourceSettings {
    public static final UgTaskDetailPageSourceSettings INSTANCE = new UgTaskDetailPageSourceSettings();
    public static final String[] DEFAULT = {"heartme_ug_task_detail_page"};
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(85));

    private final String[] getValue() {
        return (String[]) value$delegate.getValue();
    }

    public final boolean contains(String str) {
        if (str == null) {
            return false;
        }
        return C13LQ.LJIILLIIL(str, getValue());
    }
}
