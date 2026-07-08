package com.ss.android.ugc.aweme.dummyspi;

import X.C03H5;
import X.C08CX;
import X.C0PGI;
import X.C0PQX;
import X.C0PR3;
import X.C11H7;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C645620PUa;
import X.C645630PUb;
import X.EnumC645610PTz;
import X.EnumC646330PWt;
import X.InterfaceC594520NTm;
import X.InterfaceC653600PkM;
import X.InterfaceC655050Pmh;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class DummyEcomGeneralSearchService implements IEcomGeneralSearchService {

    public static final class DummyVMReceiver extends ReusedUISlotAssem<C03H5> {
        @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
        public final int Oo() {
            return R.layout.boq;
        }

        @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
        public final void onViewCreated(View view) {
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LIZ(Product product) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final List<?> LIZIZ() {
        return Collections.singletonList(null);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final ISearchShowcaseEntranceProvider LIZJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final InterfaceC653600PkM LIZLLL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJ(SearchResultParam searchResultParam) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJI(String str, String str2, String str3, String str4) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJII() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIIIZ(String str, String str2, String str3, String str4) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIIJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJIIL(Product product) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIILIIL(String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C0PR3 LJIILJJIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIILL(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJIILLIIL(C645630PUb c645630PUb) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIIZILJ(SearchMixFeedBase searchMixFeedBase, DynamicPatch dynamicPatch, String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIJ(int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C11H7<Integer, String, EnumC645610PTz> LJIJI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJIJJ() {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJIJJLI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJ(EnumC645610PTz enumC645610PTz, String str, String str2, String str3, Boolean bool) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final ITopLiveProductViewProvider LJJI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJIFFI(int i) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJJII(int i, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJIII(EnumC645610PTz enumC645610PTz, String str, String str2, int i, String str3, String str4, Map<String, ? extends Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final Integer LJJIIJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJIIZ(SearchMixFeedBase searchMixFeedBase, DynamicPatch dynamicPatch, String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final void LJJIIZI(DynamicPatch dynamicPatch, String str, Map<String, Object> map) {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final boolean LJJIJ(EnumC645610PTz enumC645610PTz) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJIJIIJIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C19719912Dl LJJIJIL() {
        return C13LE.LIZ(C645620PUa.class);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final C0PR3 LJJIJL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final InterfaceC594520NTm LJIIIIZZ(C0PQX c0pqx) {
        return new InterfaceC594520NTm() { // from class: X.0PUa
            public final int LL = C321460Ciu.LIZ();

            @Override // X.InterfaceC594520NTm
            public final int retrieveIncrementalId() {
                return this.LL;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final ReusedUISlotAssem<? extends C03H5> LJJIIJZLJL(EnumC646330PWt enumC646330PWt) {
        return new DummyVMReceiver();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final Set<String> LJIIJJI(C0PGI c0pgi, String str) {
        return C08CX.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService
    public final InterfaceC655050Pmh LJJIJIIJI(SearchMixFeedBase searchMixFeedBase, Aweme aweme, EnumC646330PWt enumC646330PWt) {
        return new InterfaceC655050Pmh() { // from class: X.0PUZ
            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return null;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }
        };
    }
}
