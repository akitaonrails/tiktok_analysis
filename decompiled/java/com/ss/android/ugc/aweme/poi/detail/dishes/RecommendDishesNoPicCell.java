package com.ss.android.ugc.aweme.poi.detail.dishes;

import X.C1181430gqj;
import X.C1191890h7b;
import X.C1308910kAL;
import X.C1843500y4a;
import X.C2211631BhB;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class RecommendDishesNoPicCell extends PowerCell<PoiDetailApi.RecommendedDish> {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dzv;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        Context context = this.itemView.getContext();
        c384050F3z.LIZ = context != null ? C1308910kAL.LIZJ(R.attr.a03, context) : null;
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.fxa);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.k1i);
        C1191890h7b.LIZ(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        C427690Gpr.LJIIIZ(tuxIconView);
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.fx6);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 330));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        PoiDetailApi.RecommendedDish recommendedDish = (PoiDetailApi.RecommendedDish) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(recommendedDish.getName());
        }
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            if (recommendedDish.getUserLiked()) {
                tuxIconView.setIconRes(R.raw.icon_thumbs_up_fill);
            } else {
                tuxIconView.setIconRes(R.raw.icon_thumbs_up);
            }
            C786410Ut5.I7(new AkS57S0200000_18(this, recommendedDish, 12), tuxIconView);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            if (recommendedDish.getLikeNum() > 0) {
                tuxTextView2.setText(C1843500y4a.LIZIZ(recommendedDish.getLikeNum()));
                C339190DRl.LIZLLL(tuxTextView2);
            } else {
                C786410Ut5.LJLLLLLL(8, tuxTextView2);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (SlashComponentUIPreloadExp.LIZ("poi_recommend_dish")) {
            return C1181430gqj.LIZIZ(viewGroup.getContext(), R.layout.dzv, viewGroup, false);
        }
        return super.onCreateItemView(viewGroup);
    }
}
