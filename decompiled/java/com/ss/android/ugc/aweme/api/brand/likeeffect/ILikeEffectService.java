package com.ss.android.ugc.aweme.api.brand.likeeffect;

import X.C731940SnQ;
import X.InterfaceC1018470cbt;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.commercialize.model.AlphaVideoData;
import com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public interface ILikeEffectService {
    void LIZ(Context context, String str, String str2);

    void LIZIZ(Aweme aweme);

    Drawable LIZJ(Context context, Aweme aweme);

    void LIZLLL(Aweme aweme);

    void LJ(Context context, Aweme aweme, boolean z, Function1 function1);

    void LJFF(Aweme aweme);

    List<SimpleUriAndUrl> LJI(Aweme aweme);

    void LJII(Aweme aweme, String str);

    void LJIIIIZZ(Aweme aweme, String str);

    Drawable LJIIIZ(Context context, Aweme aweme);

    void LJIIJ(Context context, String str, String str2, InterfaceC1018470cbt interfaceC1018470cbt);

    void LJIIJJI(Aweme aweme, String str);

    AlphaVideoData LJIIL(Aweme aweme);

    String LJIILIIL(String str, List<String> list);

    AnimatorSet LJIILJJIL(Context context, C731940SnQ c731940SnQ);

    void LJIILL(Context context, Aweme aweme);

    boolean LJIILLIIL();

    void LJIIZILJ(boolean z);
}
