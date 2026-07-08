package com.ss.android.ugc.aweme.nimblecard.tako.api;

import X.C1860930yWh;
import X.C1920507ff;
import X.C689500R2u;
import X.InterfaceC494301wD;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nimblecard.tako.component.video.NimbleVideoItemAssem;
import com.ss.android.ugc.aweme.nimblecard.tako.component.video.NimbleVideoListAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
public interface INimbleVideoListDependAbility extends InterfaceC494301wD {
    boolean Ad2();

    void CT0(NimbleVideoListAssem nimbleVideoListAssem);

    void GH(NimbleVideoItemAssem nimbleVideoItemAssem);

    void Gt();

    void JS1(View view);

    RecyclerView.RecycledViewPool Nr();

    void U62(List<? extends Aweme> list);

    C689500R2u Xo2(Object obj);

    boolean Yr1(TakoVideoItem takoVideoItem, Integer num);

    String ZA0(TakoVideoItem takoVideoItem);

    void fW(NimbleVideoItemAssem nimbleVideoItemAssem);

    C1920507ff fy2(Integer num);

    String getMessageId();

    List<TakoVideoItem> getVideoList();

    boolean isVisible();

    Drawable jO(Context context);

    void ma1();

    void n62(C1860930yWh c1860930yWh);

    void oz2(String str, List<Pair<String, Long>> list, View view, Aweme aweme, List<TakoVideoItem> list2);

    void te2(TakoVideoItem takoVideoItem, SmartImageView smartImageView);

    void ur1(C1860930yWh c1860930yWh);
}
