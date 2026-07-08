package com.ss.android.ugc.aweme.sticker.ab;

import X.C0C64;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ShootingPanelCategoryConfigSettings {
    public static final ShootingPanelCategoryConfigSettings INSTANCE = new ShootingPanelCategoryConfigSettings();
    public static final List<String> DEFAULT = C13BV.INSTANCE;
    public static final int $stable = 8;

    public static final List<String> getKeys() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        List<String> list = DEFAULT;
        List<String> list2 = (List) c0c64LJIILLIIL.LJJII(List.class, list, "effects_panel_trending_category_identifier", true);
        return list2 != null ? list2 : list;
    }

    public final List<String> getDEFAULT() {
        return DEFAULT;
    }
}
