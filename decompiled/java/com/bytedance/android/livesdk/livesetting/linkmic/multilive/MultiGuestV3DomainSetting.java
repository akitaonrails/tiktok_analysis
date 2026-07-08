package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("linkmic_multiguestv3_domain")
public final class MultiGuestV3DomainSetting {
    public static final MultiGuestV3DomainSetting INSTANCE = new MultiGuestV3DomainSetting();
    public static final String[] DEFAULT = {"/linkmic_multi_guest/layout_update"};

    private final Set<String> getAllowListSet() {
        return C13LQ.LJLIIL(SettingsManager.INSTANCE.getStringArrayValue("linkmic_multiguestv3_domain", DEFAULT));
    }

    public final boolean isInWebcast(String str) {
        if (str == null) {
            return false;
        }
        Set<String> allowListSet = getAllowListSet();
        if (!(allowListSet instanceof Collection) || !allowListSet.isEmpty()) {
            Iterator<T> it2 = allowListSet.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str, (String) it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
