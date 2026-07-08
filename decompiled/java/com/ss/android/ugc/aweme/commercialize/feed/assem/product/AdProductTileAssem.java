package com.ss.android.ugc.aweme.commercialize.feed.assem.product;

import X.C01GW;
import X.C0DXR;
import X.C0RP1;
import X.C1017070cZd;
import X.C12ES;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C444960Hcc;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C823050WQl;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS100S0200000_31;
import Y.AsS56S0100000_31;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class AdProductTileAssem extends BaseCellSlotComponent<AdProductTileAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public boolean LLL;
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdProductTileAssem.class, "tileVM", "getTileVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/product/AdProductTileVM;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AdProductTileAssem() {
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdProductTileVM.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0rp1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 239), null, AFwS276S0000000_31.get$arr$(65));
        this.LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS276S0000000_31.get$arr$(66));
        this.LLLII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 344));
        this.LLLIIII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 345));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b4g;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Bp() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLLII.getValue();
    }

    public final FrameLayout Ep() {
        return (FrameLayout) this.LLLIIII.getValue();
    }

    public final AdProductTileVM Fp() {
        return (AdProductTileVM) this.LLJLLIL.getValue(this, LLLIIIIL[0]);
    }

    public final boolean Ip() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AdProductTile productTile;
        VideoItemParams item = Fp().getItem();
        return (item == null || (aweme = item.getAweme()) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (productTile = awemeRawAd.getProductTile()) == null || productTile.getShowSeconds() != 0) ? false : true;
    }

    public final void reset() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) Bp().getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        C786410Ut5.U4(Ep(), 1.0f);
        this.LLLF = 0;
        this.LLLFF = 0;
        this.LLLFFI = getContentView().getWidth();
        this.LLLFZ = false;
        this.LLL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        Aweme aweme;
        Bp().getState().LJFF(null);
        if (Bp().getItemDecorationCount() > 0) {
            Bp().removeItemDecorationAt(Bp().getItemDecorationCount() - 1);
        }
        this.LLJZ = 0;
        this.LLJZIJLIL = 0;
        this.LLLI = false;
        VideoItemParams item = Fp().getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            AwemeBizExtKt.setAdDescMaxLines(aweme, 4);
        }
        reset();
    }

    public final void Gp(int i) {
        C786410Ut5.LJLLLLLL(i, getContentView());
        C786410Ut5.LJLLLLLL(i, LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Bp().addOnScrollListener(new AsS56S0100000_31(this, 1));
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.165Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C232300v3) obj).LL;
            }
        }, C736820SvI.LJ(), AFwS319S0000000_31.get$arr$(7), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.1650
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LJ(), AFwS319S0000000_31.get$arr$(8), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.1651
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LJ(), AFwS319S0000000_31.get$arr$(9), 4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        if (aweme == null || !C1017070cZd.LLLILZLLLI(aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        AdProductTile productTile;
        List<AdNativeProduct> productList;
        VideoItemParams videoItemParams2 = videoItemParams;
        Bp().LJIILJJIL(AdProductTileCell.class);
        Bp().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvBp = Bp();
        final int iLIZJ = (int) C12ES.LIZJ(4.0f, getContext());
        viewOnAttachStateChangeListenerC20604515jvBp.addItemDecoration(new C0DXR(iLIZJ) { // from class: X.0DXd
            public final int LL;

            {
                this.LL = iLIZJ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (C444960Hcc.LIZIZ()) {
                    if (childAdapterPosition != 0) {
                        rect.right = this.LL;
                    }
                } else {
                    if (childAdapterPosition == 0) {
                        return;
                    }
                    rect.left = this.LL;
                }
            }
        });
        C786410Ut5.LJZ(8, Ep());
        if (C444960Hcc.LIZJ(getContext())) {
            C786410Ut5.Pb(Ep(), -1.0f);
        } else {
            C786410Ut5.Pb(Ep(), 1.0f);
        }
        if (Ip()) {
            Gp(0);
        } else {
            Gp(8);
        }
        AwemeRawAd awemeRawAd = videoItemParams2.getAweme().getAwemeRawAd();
        if (awemeRawAd != null && (productTile = awemeRawAd.getProductTile()) != null && (productList = productTile.getProductList()) != null && (!productList.isEmpty())) {
            productList.size();
            C823050WQl.LIZLLL().execute(new ARunnableS100S0200000_31(productList, this, 82));
            if (Ip()) {
                Gp(0);
            } else {
                Gp(8);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
