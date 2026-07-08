package com.ss.android.ugc.aweme.search.df.api.incentivetask.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class SearchIncentiveTaskScene {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SearchIncentiveTaskScene[] $VALUES;
    public static final SearchIncentiveTaskScene MIDDLE_PAGE = new SearchIncentiveTaskScene("MIDDLE_PAGE", 0);
    public static final SearchIncentiveTaskScene RESULT_PAGE = new SearchIncentiveTaskScene("RESULT_PAGE", 1);

    public static final /* synthetic */ SearchIncentiveTaskScene[] $values() {
        return new SearchIncentiveTaskScene[]{MIDDLE_PAGE, RESULT_PAGE};
    }

    public static InterfaceC2044707zh<SearchIncentiveTaskScene> getEntries() {
        return $ENTRIES;
    }

    static {
        SearchIncentiveTaskScene[] searchIncentiveTaskSceneArr$values = $values();
        $VALUES = searchIncentiveTaskSceneArr$values;
        $ENTRIES = new C2254308sP(searchIncentiveTaskSceneArr$values);
    }

    public static SearchIncentiveTaskScene[] values() {
        return (SearchIncentiveTaskScene[]) $VALUES.clone();
    }

    public static SearchIncentiveTaskScene valueOf(String str) {
        return (SearchIncentiveTaskScene) C08FF.LIZ(SearchIncentiveTaskScene.class, str);
    }

    public SearchIncentiveTaskScene(String str, int i) {
    }
}
