package com.ss.android.ugc.aweme.search.df.api.incentivetask.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SearchIncentiveUIScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SearchIncentiveUIScene[] $VALUES;
    public final String type;
    public static final SearchIncentiveUIScene SCENE_PENDANT = new SearchIncentiveUIScene("SCENE_PENDANT", 0, "pendant");
    public static final SearchIncentiveUIScene SCENE_BANNER = new SearchIncentiveUIScene("SCENE_BANNER", 1, "banner");

    public static final /* synthetic */ SearchIncentiveUIScene[] $values() {
        return new SearchIncentiveUIScene[]{SCENE_PENDANT, SCENE_BANNER};
    }

    public static InterfaceC2044707zh<SearchIncentiveUIScene> getEntries() {
        return $ENTRIES;
    }

    static {
        SearchIncentiveUIScene[] searchIncentiveUISceneArr$values = $values();
        $VALUES = searchIncentiveUISceneArr$values;
        $ENTRIES = new C2254308sP(searchIncentiveUISceneArr$values);
    }

    public static SearchIncentiveUIScene[] values() {
        return (SearchIncentiveUIScene[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    public static SearchIncentiveUIScene valueOf(String str) {
        return (SearchIncentiveUIScene) C08FF.LIZ(SearchIncentiveUIScene.class, str);
    }

    public SearchIncentiveUIScene(String str, int i, String str2) {
        this.type = str2;
    }
}
