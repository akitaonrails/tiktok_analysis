package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal;

import X.C03H5;
import X.C13IQ;
import X.C660780Pvw;
import X.EnumC660450PvP;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchVideoBottomAnchorProtocol extends ISearchVideoAnchorPriorityProtocol {
    void Bk1(View view);

    int CB1(View view);

    C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> gN2();

    EnumC660450PvP gz0();

    Object qX1(Aweme aweme, SearchMixFeed searchMixFeed);

    Integer qe2(View view);

    Map<String, String> wV0(Aweme aweme, C660780Pvw c660780Pvw);

    void xg2(View view, Function0<Unit> function0);
}
