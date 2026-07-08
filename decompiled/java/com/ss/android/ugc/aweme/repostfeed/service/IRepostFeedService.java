package com.ss.android.ugc.aweme.repostfeed.service;

import X.C03H5;
import X.C1360650lVn;
import X.C13IQ;
import X.EnumC1360550lVd;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentMeta;
import defpackage.RepostFeedEntranceVM;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public interface IRepostFeedService {
    boolean LIZ();

    void LIZIZ(RepostFeedEntranceVM.e eVar);

    Object LIZJ(View view, Fragment fragment);

    C1360650lVn LIZLLL(RepostFeedEntranceVM.e eVar);

    void LJ();

    void LJFF(boolean z);

    boolean LJI(String str, String str2);

    void LJII();

    boolean LJIIIIZZ();

    void LJIIIZ(int i);

    void LJIIJ(View view, Fragment fragment);

    void LJIIJJI(Context context, String str, Map<String, String> map);

    boolean LJIIL();

    boolean LJIILIIL(String str, String str2);

    void LJIILJJIL(EnumC1360550lVd enumC1360550lVd);

    void LJIILL();

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIILLIIL();

    long LJIIZILJ(long j);

    boolean LJIJ(Aweme aweme);

    void LJIJI(List<String> list);

    void LJIJJ();

    void LJIJJLI(List<RepostNewContentMeta> list);

    View LJIL(Context context);

    void LJJ();

    void LJJI(String str);

    void LJJIFFI(Aweme aweme, int i, Fragment fragment);

    long LJJII(boolean z);

    boolean LJJIII();
}
