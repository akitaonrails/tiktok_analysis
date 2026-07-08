package com.ss.android.ugc.aweme.feed.collection.collection.ability;

import X.C0RQI;
import X.C0SZ8;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface FeedCollectionViewPagerAbility extends IViewPagerAbility, IAdapterAbility {
    C0SZ8 D();

    boolean E30(String str);

    void Es0(C0RQI c0rqi);

    C0SZ8 F();

    List<Aweme> Fg();

    Aweme LJIIIIZZ();

    C0SZ8 LJJIJIL(String str);

    C0SZ8 LJLIL();

    Aweme LLLJ();

    void M32(int i, String str, Boolean bool);

    void QA(String str);

    void ee1(int i, Aweme aweme);

    Aweme getItem(int i);

    boolean oD0();

    void xd0(Map<String, ? extends Aweme> map);
}
