package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.assem;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0GXW;
import X.C0PEM;
import X.C13LE;
import X.C1421105hJ;
import X.C1637806bA;
import X.C1731670vAD;
import X.C1731720vAI;
import X.C1749260vca;
import X.C1749280vcc;
import X.C1775780wJM;
import X.C19719912Dl;
import X.C1DFH;
import X.C20603715jn;
import X.C20642515q3;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C23250099c;
import X.C452070Ho5;
import X.C452501pT;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC459810I1j;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS160S0100000_26;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.powerlist.ProductListCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.viewmodel.ProductListViewModel;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductListAssem extends UIListContentAssem<ProductListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final String LLJJJIL;
    public static final String LLJJJJ;
    public static final String LLJJJJJIL;
    public C1749280vcc LLIZLLLIL;
    public C1749260vca LLJ;
    public C0GXW LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProductListAssem.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ProductListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/productlist/viewmodel/ProductListViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJJIL = C20642515q3.LJI(2131832869);
        LLJJJJ = C20642515q3.LJI(2131838156);
        LLJJJJJIL = C20642515q3.LJI(2131833136);
    }

    public ProductListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BillboardGlobalViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS570S0100000_26(c19719912DlLIZ, 906), AFwS268S0000000_26.get$arr$(380), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 904));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 901));
        this.LLJJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(214));
        this.LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 909));
        this.LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 905));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 903));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 902));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ProductListViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ2, 907);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(381);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ2);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((AbstractC738140SxQ) this, 908), aFwS268S0000000_26, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIJIL = assemVMLazy;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 0;
        c20603715jn.LIZJ = false;
        c20603715jn.LJIIJ = false;
        return c20603715jn;
    }

    public final C1749260vca No() {
        return (C1749260vca) this.LLJJIII.getValue();
    }

    public final C1749280vcc Oo() {
        return (C1749280vcc) this.LLJJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public final ProductListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (ProductListViewModel) assemVMLazy.getValue();
    }

    public final void Lo(boolean z) {
        ProductListViewModel productListViewModelJo = Jo();
        RootData rootData = (RootData) this.LLJILJILJ.getValue();
        productListViewModelJo.setState(AFwS268S0000000_26.get$arr$(527));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1731670vAD.LIZIZ = jCurrentTimeMillis;
        C1421105hJ.LIZLLL("rd_ec_live_request_send", new Pair("page_name", "template_product_list"), new Pair("previous_page", "notice_board_edit"), new Pair("start_click_to_now", Long.valueOf(jCurrentTimeMillis - C1731670vAD.LIZ)), new Pair("api_path", "/aweme/v1/oec/affiliate/live/product/list"), new Pair("request_method", "get"), new Pair("request_type", 1), new Pair("is_retry", Boolean.valueOf(z)));
        if (!z) {
            C1731670vAD.LIZ(C1731670vAD.LIZIZ - C1731670vAD.LIZ, "init", "did_load");
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(productListViewModelJo);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1731720vAI(productListViewModelJo, rootData, z, jCurrentTimeMillis2, null), 2);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        No().getEditTextView().setHint(LLJJJIL);
        No().setOnClickClearListener(new ACListenerS160S0100000_26(this, 82));
        No().getEditTextView().setOnEditorActionListener(new C1775780wJM(this, 2));
        ((C0GXW) this.LLJJIJI.getValue()).setHideKeyBoard$ecommerce_influencer_release(new AwS605S0100000_26(this, 921));
        new KeyBoardMonitor(this).LIZ(No().getEditTextView(), new InterfaceC459810I1j() { // from class: X.0vAK
            @Override // X.InterfaceC459810I1j
            public final void V3() {
                ((C0GXW) this.LL.LLJJIJI.getValue()).setInterceptTouchEvent$ecommerce_influencer_release(true);
            }

            @Override // X.InterfaceC459810I1j
            public final void ub() {
                ((C0GXW) this.LL.LLJJIJI.getValue()).setInterceptTouchEvent$ecommerce_influencer_release(false);
                this.LL.No().getEditTextView().clearFocus();
            }
        });
        Go().LJIILJJIL(ProductListCell.class);
        Go().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0vAL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1731710vAH) obj).LLILLJJLI;
            }
        }, null, new AwS605S0100000_26(this, 922), new AwS562S0100000_18(this, 2746), new AwS605S0100000_26(this, 923), 2, null);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0vAM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1731710vAH) obj).LLILZ;
            }
        }, null, new AwS632S0100000_18(this, 314), 6);
        Lo(false);
    }
}
