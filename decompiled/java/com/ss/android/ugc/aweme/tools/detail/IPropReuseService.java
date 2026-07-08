package com.ss.android.ugc.aweme.tools.detail;

import X.AbstractC1255880imo;
import X.C116F;
import X.C116L;
import X.C11NZ;
import X.C1606590ruT;
import X.C2189821An6;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.prop.fragment.EffectDiscoverAwemeListFragment;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public interface IPropReuseService {
    boolean LIZ(Activity activity);

    String LIZIZ(Context context);

    C1606590ruT LIZJ(AbstractC1255880imo abstractC1255880imo, C2189821An6 c2189821An6);

    C116F LIZLLL();

    void LJ(Activity activity, ArrayList arrayList, Music music, String str, String str2, String str3, Integer num, int i, boolean z, String str4, Aweme aweme, String str5, String str6, String str7, boolean z2, boolean z3, String str8, String str9, ShootExtraData shootExtraData);

    void LJFF(Context context, List<String> list, C116L c116l, boolean z);

    Class<? extends Activity> LJI();

    void LJII(String str);

    EffectDiscoverAwemeListFragment LJIIIIZZ(Bundle bundle, int i, C11NZ c11nz);

    boolean LJIIIZ(Aweme aweme);

    NewFaceStickerListBean LJIIJ(String str);

    void LJIIJJI(Activity activity, ArrayList arrayList, Music music, String str, String str2, int i, Aweme aweme, Map map);

    Object LJIIL(int i, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn);
}
