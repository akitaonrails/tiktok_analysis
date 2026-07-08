package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shoprecommend;

import X.AnonymousClass0497;
import X.C01GW;
import X.C04AG;
import X.C1071004Gu;
import X.C13LE;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1750140ve0;
import X.C1751440vg6;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import X.C952003nq;
import X.InterfaceC1748810vbr;
import Y.AsS52S0100000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpShopRecommendVH extends AbsFullSpanVH<SeaShopRecommendVO> implements InterfaceC1748810vbr {
    public final ECBaseFragment LLJJIJIL;
    public C1751440vg6 LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public int LLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJJJLIIL.getValue();
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C1748730vbj.LIZ(this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        this.LLJJJ = new C1751440vg6(c6(), this.LLJJIJIL);
        ((RecyclerView) this.itemView.findViewById(R.id.twj)).setAdapter(this.LLJJJ);
        ((RecyclerView) this.itemView.findViewById(R.id.twj)).addOnScrollListener(new AsS52S0100000_26(this, 1));
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26(this, 208));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean z;
        int i;
        List<Feed> list;
        SeaShopRecommendVO seaShopRecommendVO = (SeaShopRecommendVO) obj;
        String str = seaShopRecommendVO.modelTitle;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ((TextView) this.itemView.findViewById(R.id.tv_title)).setText(this.itemView.getContext().getResources().getString(2131832950));
        } else {
            ((TextView) this.itemView.findViewById(R.id.tv_title)).setText(seaShopRecommendVO.modelTitle);
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.tv_title);
        if (C1071004Gu.LIZIZ().LIZ()) {
            i = 102;
        } else {
            i = 62;
        }
        tuxTextView.setTuxFont(i);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_viewMore);
        String str2 = seaShopRecommendVO.enterName;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
        CommonFeedData commonFeedData = seaShopRecommendVO.shopRecommendData;
        if (commonFeedData != null) {
            list = commonFeedData.feedList;
        } else {
            list = null;
        }
        if (list != null) {
            C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.twj));
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.vev));
            C1751440vg6 c1751440vg6 = this.LLJJJ;
            if (c1751440vg6 != null) {
                CommonFeedData commonFeedData2 = seaShopRecommendVO.shopRecommendData;
                List<Feed> list2 = commonFeedData2.feedList;
                String str3 = commonFeedData2.requestId;
                c1751440vg6.LLILLL = list2;
                c1751440vg6.LLILZ = str3;
                c1751440vg6.notifyDataSetChanged();
            }
        } else {
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.twj));
            C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.vev));
            C04AG c04ag = c6().LLLLLL;
            View view = this.itemView;
            SeaPdpViewModel seaPdpViewModel = c04ag.LIZ;
            if (!seaPdpViewModel.k) {
                seaPdpViewModel.k = true;
                seaPdpViewModel.withState(new AwS367S0200000_1(view, c04ag, 356));
            }
        }
        if (!C952003nq.LIZ()) {
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.yax));
        } else {
            C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.yax));
        }
        C786410Ut5.I7(new AjS44S0200000_26(seaShopRecommendVO, this, 50), this.itemView.findViewById(R.id.yax));
        if (!this.LLJJJJ && C952003nq.LIZ()) {
            this.LLJJJJ = true;
            C1748720vbi.LJFF(this.itemView, new AnonymousClass0497(), AFwS215S0000000_26.get$arr$(524), new AwS605S0100000_26(this, 854));
        }
        C1750140ve0.LIZ(this.itemView, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpShopRecommendVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.ax6, context, viewGroup, false, true));
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJIL = "";
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 77));
    }
}
