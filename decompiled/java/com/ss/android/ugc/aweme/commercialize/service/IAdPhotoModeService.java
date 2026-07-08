package com.ss.android.ugc.aweme.commercialize.service;

import X.C1264004x4;
import X.EnumC1002140cBY;
import X.EnumC1019010ccl;
import X.InterfaceC665370Q7z;
import android.content.Context;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ad.feed.adexperience.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public interface IAdPhotoModeService {
    void LIZ(InterfaceC665370Q7z interfaceC665370Q7z);

    String LIZIZ();

    void LIZJ(Aweme aweme);

    Map<String, Object> LIZLLL(Aweme aweme);

    void LJ(String str, int i, String str2, int i2, String str3, String str4, Integer num, Long l, AwemeRawAd awemeRawAd);

    void LJFF(int i, int i2, int i3, Aweme aweme, String str, String str2);

    String LJI();

    boolean LJII(Aweme aweme);

    boolean LJIIIIZZ(Context context, Aweme aweme, int i);

    void LJIIIZ(int i, int i2, int i3, Aweme aweme, String str, String str2);

    void LJIIJ(InterfaceC665370Q7z interfaceC665370Q7z);

    void LJIIJJI(Aweme aweme, int i, String str, int i2, int i3);

    Pair<String, String> LJIIL(Aweme aweme);

    boolean LJIILIIL(Aweme aweme, IPhotoSlidesAbility iPhotoSlidesAbility, Object obj);

    List<ImageInfo> LJIILJJIL(Aweme aweme);

    long LJIILL();

    void LJIILLIIL(int i, String str, int i2, String str2, int i3, String str3, boolean z, String str4, Integer num, Long l, AwemeRawAd awemeRawAd);

    void LJIIZILJ(int i, long j, Aweme aweme);

    void LJIJ(EnumC1019010ccl enumC1019010ccl);

    boolean LJIJI();

    Integer LJIJJ(int i, Aweme aweme);

    void LJIJJLI(boolean z, long j, Integer num);

    void LJIL(int i, int i2, long j, Aweme aweme);

    void LJJ(int i, String str, int i2, String str2, int i3, String str3, String str4, Integer num, Long l, AwemeRawAd awemeRawAd);

    void LJJI(EnumC1002140cBY enumC1002140cBY);

    boolean LJJIFFI(int i, Aweme aweme, Context context, Integer num, C1264004x4 c1264004x4);

    long LJJII();

    void LJJIII(long j);

    Map<String, Object> LJJIIJ(Aweme aweme);

    void LJJIIJZLJL(int i, int i2, Aweme aweme, String str, String str2);

    void LJJIIZ(Aweme aweme);

    void LJJIIZI(Aweme aweme);

    void LJJIJ(int i, int i2, int i3, Long l, AwemeRawAd awemeRawAd);

    void LJJIJIIJI(int i, int i2, int i3, Aweme aweme);

    int LJJIJIIJIL();

    void LJJIJIL(int i, Aweme aweme);

    void LJJIJL(Aweme aweme);

    int LJJIJLIJ(Aweme aweme);

    void LJJIL(int i);

    String getEnterMethod();

    void reset();

    void setEnterMethod(String str);
}
