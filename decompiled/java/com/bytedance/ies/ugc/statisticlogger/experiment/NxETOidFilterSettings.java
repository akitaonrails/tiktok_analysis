package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C452501pT;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class NxETOidFilterSettings {
    public static final NxETOidFilterSettings INSTANCE = new NxETOidFilterSettings();
    public static final String[] DEFAULT = {"page_btm_b7360", "page_btm_b8269", "page_btm_b0226", "page_btm_SearchResultActivity", "page_auto_DefaultCommentPageContainerFragment"};
    public static final C01GW filterSet$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(771));

    public final Set<String> getFilterSet() {
        return (Set) filterSet$delegate.getValue();
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
