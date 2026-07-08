package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.surpriseset;

import X.AbstractC212300186g;
import X.C1217030hm9;
import X.C212301186h;
import X.C212306186m;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.CustomizePanel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class UsMaxBidNonPicFragment extends UsMaxBidFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLCM6PiBiKiA+JSoiZy06Mms5OmHELIOSEjJzUvKD03ZiclLSs6JiJiOjohODclOiogLTFiHDweKT0OICsdJyscICwVOiQrJCo9PA==";
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public String LLJJJ = "";
    public String LLJJJIL = "";

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment
    public final int getLayoutId() {
        return R.layout.bxi;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment
    public final void RR() {
        TuxTextView tuxTextView = this.LLJJIJIL;
        if (tuxTextView != null) {
            tuxTextView.setText("");
            AbstractC212300186g abstractC212300186g = this.LLIZ;
            C1217030hm9 c1217030hm9 = new C1217030hm9(tuxTextView);
            if (abstractC212300186g instanceof C212301186h) {
                ((C212301186h) abstractC212300186g).setExtendedAddTimeHelper(c1217030hm9);
            } else if (abstractC212300186g instanceof C212306186m) {
                ((C212306186m) abstractC212300186g).setExtendedAddTimeHelper(c1217030hm9);
            }
        }
        super.RR();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment
    public final void NR(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bzf);
        C212301186h c212301186h = new C212301186h(view.getContext());
        c212301186h.setId(R.id.bzg);
        viewGroup.addView(c212301186h, new ViewGroup.LayoutParams(-1, -2));
        super.NR(view);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.yb_);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.hib);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment
    public final void PR(AuctionData auctionData) {
        String str;
        CustomizePanel customizePanel;
        String str2;
        CustomizePanel customizePanel2;
        super.PR(auctionData);
        String str3 = "";
        if (auctionData == null || (customizePanel2 = auctionData.customizePanel) == null || (str = customizePanel2.topTitleWithCountdown) == null) {
            str = "";
        }
        this.LLJJJ = str;
        if (auctionData != null && (customizePanel = auctionData.customizePanel) != null && (str2 = customizePanel.topTitle) != null) {
            str3 = str2;
        }
        this.LLJJJIL = str3;
        AbstractC212300186g abstractC212300186g = this.LLIZ;
        AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 20);
        if (abstractC212300186g instanceof C212301186h) {
            ((C212301186h) abstractC212300186g).setCountDownUpdateCallback(awS643S0100000_29);
        } else {
            if (!(abstractC212300186g instanceof C212306186m)) {
                return;
            }
            ((C212306186m) abstractC212300186g).setCountDownUpdateCallback(awS643S0100000_29);
        }
    }
}
