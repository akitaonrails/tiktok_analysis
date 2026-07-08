package com.ss.android.ugc.aweme.search.df.api.visualsearch;

import X.C009N;
import X.C03H5;
import X.C0C8S;
import X.C0R1M;
import X.C1278304zN;
import X.C1278404zO;
import X.C13IQ;
import X.C16BC;
import X.C19EG;
import X.EnumC0308008s;
import X.EnumC180200me;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.SmartSearchInfoStruct;
import com.ss.android.ugc.aweme.feed.model.search.VisualSearchInfoStruct;
import com.ss.android.ugc.aweme.search.model.VisualSearchEnterModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.smartsearch.model.RectangleF;
import com.ss.android.ugc.aweme.search.visualsearch.history.model.VisualSearchHistoryDataItem;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS600S0100000_21;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public interface ISearchVisualSearchService {
    boolean LIZ();

    void LIZIZ();

    void LIZJ();

    void LJI(String str, String str2, String str3, String str4, boolean z);

    Aweme LJII(InterfaceC665370Q7z interfaceC665370Q7z);

    void LJIIIIZZ();

    boolean LJIIIZ(Aweme aweme, C19EG c19eg, Fragment fragment, String str, SmartSearchInfoStruct smartSearchInfoStruct);

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIIJ();

    boolean LJIIJJI(Aweme aweme, C19EG c19eg, Fragment fragment, String str, C1278304zN c1278304zN, String str2, C1278404zO c1278404zO, SmartSearchInfoStruct smartSearchInfoStruct, VisualSearchInfoStruct visualSearchInfoStruct, EnumC180200me enumC180200me);

    void LJIIL(long j, Bitmap bitmap, String str);

    boolean LJIILIIL(Fragment fragment);

    void LJIILJJIL(List<String> list, int i, int i2, C0R1M c0r1m);

    void LJIILL(boolean z);

    ReusedUISlotAssem<? extends C03H5> LJIILLIIL();

    void LJIIZILJ(AwS600S0100000_21 awS600S0100000_21);

    void LJIJ(long j, String str, byte[] bArr);

    boolean LJIJI(String str);

    Pair<Integer, Integer> LJIJJ(C0R1M c0r1m);

    void LJIJJLI(C19EG c19eg, C19EG c19eg2, Bitmap bitmap, double d, double d2, double d3, double d4, String str, String str2, String str3, VisualSearchHistoryDataItem visualSearchHistoryDataItem, Integer num, C0C8S c0c8s, Integer num2, String str4);

    boolean LJIL(Fragment fragment);

    boolean LJJ(Context context);

    void LJJI(C009N c009n, String str, boolean z, boolean z2, EnumC0308008s enumC0308008s);

    String LJJIFFI();

    void LJJII(boolean z, JSONObject jSONObject, int i, String str, Integer num, String str2, boolean z2, boolean z3, float f, int i2, String str3, String str4, Map<String, String> map);

    boolean LJJIII(long j, String str);

    void LJJIIJ(Fragment fragment, Aweme aweme, String str, String str2, Long l, String str3, List list);

    boolean LJJIIJZLJL(String str);

    C16BC LJJIIZ();

    void LJJIIZI(C19EG c19eg, VisualSearchEnterModel visualSearchEnterModel, String str);

    boolean LJJIJ();

    void LJJIJIIJI(String str, String str2, String str3);

    Object LJJIJIIJIL();

    void LJJIJIL(EcTakePhotoActivity ecTakePhotoActivity, EcTakePhotoActivity ecTakePhotoActivity2, Bitmap bitmap, String str, C0R1M c0r1m, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, Map map);

    boolean LJJIJL(Aweme aweme, C19EG c19eg, Fragment fragment, SmartSearchInfoStruct smartSearchInfoStruct);

    void LJJIJLIJ(C19EG c19eg, Bitmap bitmap, Aweme aweme, String str, String str2, String str3, boolean z, Long l, List list, Integer num, Integer num2, Integer num3, Integer num4, Long l2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z2, boolean z3, String str12, RectangleF rectangleF, int i, String str13, boolean z4, boolean z5, Integer num5, String str14, boolean z6, Boolean bool);

    boolean LJJIL();

    String LJJIZ(String str, String str2);

    boolean LJJJ();

    boolean LJJJI(Context context);

    void LJJJIL(C19EG c19eg, Bitmap bitmap, Aweme aweme, String str, String str2, boolean z, String str3, Long l, Integer num, Integer num2, Integer num3, Integer num4, Long l2, String str4, boolean z2, Integer num5, String str5);

    boolean LJJJJ(SearchMixFeed searchMixFeed);

    void LJJJJI(String str, String str2, String str3);

    void LJJJJIZL();

    String LJJJJJ();

    Float LJJJJJL(int i, int i2);
}
