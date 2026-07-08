package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item;

import X.InterfaceC1483820oiS;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.player.AudioPlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchInflowProductShopCardService {
    void LIZ(String str);

    void LIZIZ(AwemeRawAd awemeRawAd);

    Aweme LIZJ(SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct);

    void LIZLLL(Aweme aweme, InterfaceC1483820oiS interfaceC1483820oiS);

    List<Aweme> LJ();

    AudioPlayerController LJFF();

    boolean LJI(Aweme aweme, String str);

    void LJJIII();

    void onDestroyView();
}
