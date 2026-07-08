package com.ss.android.ugc.aweme.search.ecommerce;

import X.C03H5;
import X.C0PGI;
import X.C0PQX;
import X.C0PR3;
import X.C11H7;
import X.C13IQ;
import X.C19719912Dl;
import X.C645630PUb;
import X.EnumC645610PTz;
import X.EnumC646330PWt;
import X.InterfaceC594520NTm;
import X.InterfaceC653600PkM;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public interface IEcomGeneralSearchService {
    boolean LIZ(Product product);

    List<?> LIZIZ();

    ISearchShowcaseEntranceProvider LIZJ();

    InterfaceC653600PkM LIZLLL();

    void LJ(SearchResultParam searchResultParam);

    void LJFF();

    void LJI(String str, String str2, String str3, String str4);

    boolean LJII();

    InterfaceC594520NTm LJIIIIZZ(C0PQX c0pqx);

    void LJIIIZ(String str, String str2, String str3, String str4);

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIIJ();

    Set<String> LJIIJJI(C0PGI c0pgi, String str);

    boolean LJIIL(Product product);

    void LJIILIIL(String str, String str2, String str3);

    C0PR3 LJIILJJIL();

    void LJIILL(String str, String str2);

    boolean LJIILLIIL(C645630PUb c645630PUb);

    void LJIIZILJ(SearchMixFeedBase searchMixFeedBase, DynamicPatch dynamicPatch, String str, String str2, String str3);

    void LJIJ(int i, String str);

    C11H7<Integer, String, EnumC645610PTz> LJIJI();

    void LJIJJ();

    boolean LJIJJLI();

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIL();

    void LJJ(EnumC645610PTz enumC645610PTz, String str, String str2, String str3, Boolean bool);

    ITopLiveProductViewProvider LJJI();

    void LJJIFFI(int i);

    boolean LJJII(int i, String str);

    void LJJIII(EnumC645610PTz enumC645610PTz, String str, String str2, int i, String str3, String str4, Map<String, ? extends Object> map);

    Integer LJJIIJ();

    ReusedUISlotAssem<? extends C03H5> LJJIIJZLJL(EnumC646330PWt enumC646330PWt);

    void LJJIIZ(SearchMixFeedBase searchMixFeedBase, DynamicPatch dynamicPatch, String str, String str2);

    void LJJIIZI(DynamicPatch dynamicPatch, String str, Map<String, Object> map);

    boolean LJJIJ(EnumC645610PTz enumC645610PTz);

    InterfaceC655050Pmh LJJIJIIJI(SearchMixFeedBase searchMixFeedBase, Aweme aweme, EnumC646330PWt enumC646330PWt);

    C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJIJIIJIL();

    C19719912Dl LJJIJIL();

    C0PR3 LJJIJL();
}
