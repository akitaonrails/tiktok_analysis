package com.ss.android.ugc.aweme.services.external;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class RefreshQuotaScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ RefreshQuotaScene[] $VALUES;
    public final String scene;
    public static final RefreshQuotaScene INVALID_REFRESH = new RefreshQuotaScene("INVALID_REFRESH", 0, "invalid_refresh");
    public static final RefreshQuotaScene GENERATE = new RefreshQuotaScene("GENERATE", 1, "generate");
    public static final RefreshQuotaScene TASK_STATUS_CHANGE = new RefreshQuotaScene("TASK_STATUS_CHANGE", 2, "task_status_change");
    public static final RefreshQuotaScene ENTER_EDIT = new RefreshQuotaScene("ENTER_EDIT", 3, "enter_edit");
    public static final RefreshQuotaScene CLICK_EDIT_ENTRY = new RefreshQuotaScene("CLICK_EDIT_ENTRY", 4, "click_edit_entry");
    public static final RefreshQuotaScene FIRST_SHOW_ANCHOR = new RefreshQuotaScene("FIRST_SHOW_ANCHOR", 5, "first_anchor_show");
    public static final RefreshQuotaScene CLICK_ANCHOR = new RefreshQuotaScene("CLICK_ANCHOR", 6, "click_anchor");

    public static final /* synthetic */ RefreshQuotaScene[] $values() {
        return new RefreshQuotaScene[]{INVALID_REFRESH, GENERATE, TASK_STATUS_CHANGE, ENTER_EDIT, CLICK_EDIT_ENTRY, FIRST_SHOW_ANCHOR, CLICK_ANCHOR};
    }

    public static InterfaceC2044707zh<RefreshQuotaScene> getEntries() {
        return $ENTRIES;
    }

    static {
        RefreshQuotaScene[] refreshQuotaSceneArr$values = $values();
        $VALUES = refreshQuotaSceneArr$values;
        $ENTRIES = new C2254308sP(refreshQuotaSceneArr$values);
    }

    public static RefreshQuotaScene[] values() {
        return (RefreshQuotaScene[]) $VALUES.clone();
    }

    public final String getScene() {
        return this.scene;
    }

    public static RefreshQuotaScene valueOf(String str) {
        return (RefreshQuotaScene) C08FF.LIZ(RefreshQuotaScene.class, str);
    }

    public RefreshQuotaScene(String str, int i, String str2) {
        this.scene = str2;
    }
}
