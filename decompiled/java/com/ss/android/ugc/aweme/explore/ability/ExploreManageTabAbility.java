package com.ss.android.ugc.aweme.explore.ability;

import X.InterfaceC494301wD;
import android.graphics.Rect;
import android.os.Bundle;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes32.dex */
public interface ExploreManageTabAbility extends InterfaceC494301wD {
    void A80(List<ExploreCustomTopicResponse> list);

    void GD(ExploreCustomTopicResponse exploreCustomTopicResponse);

    void OE1();

    void QC2(CopyOnWriteArrayList<ExploreCustomTopicResponse> copyOnWriteArrayList);

    ExploreCustomTopicResponse SC0();

    Rect TT0();

    void Z6();

    void cm2();

    void k00(long j, String str);

    boolean lT1(long j, String str);

    void mp2();

    void onNodeHide(Bundle bundle);

    void onNodeShow(Bundle bundle);

    void wK(long j, String str);

    ExploreCustomTopicResponse yB1();

    List<IExploreTopicTabProtocol> z02();

    String zR1();

    List<ExploreCustomTopicResponse> zV0();
}
