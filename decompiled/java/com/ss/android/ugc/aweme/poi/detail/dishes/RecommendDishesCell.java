package com.ss.android.ugc.aweme.poi.detail.dishes;

import X.C01GW;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1181430gqj;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C12ES;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1843500y4a;
import X.C19ME;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1203020hPY;
import X.EnumC1338240kve;
import X.EnumC452301pR;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.zhiliaoapp.musically.R;
import irm.AkS28S0300000_18;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class RecommendDishesCell extends PowerCell<PoiDetailApi.RecommendedDish> {
    public float LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dzu;
    }

    public final boolean FE1() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    public RecommendDishesCell() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 1123));
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 1122));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 329));
    }

    public final int I5(Context context) {
        float fLJIIJ;
        int iLJIIJ;
        int iLIZIZ;
        float f = this.LL;
        if (f > 0.0f) {
            return (int) f;
        }
        if (FE1()) {
            if (((Number) this.LLILLL.getValue()).intValue() > 3) {
                iLJIIJ = C12ES.LJIIJ(context);
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            } else {
                iLJIIJ = C12ES.LJIIJ(context);
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            }
            fLJIIJ = (iLJIIJ - iLIZIZ) / 3.0f;
        } else {
            fLJIIJ = ((((C12ES.LJIIJ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 8)) * 4) / 9.0f) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 3);
        }
        this.LL = fLJIIJ;
        return (int) fLJIIJ;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C19ME c19me;
        int i;
        UrlModel urlModel;
        int iIntValue;
        String poiId;
        int i2;
        int i3;
        String priceCurrency;
        String priceNum;
        IRecommendDishesAbility iRecommendDishesAbility;
        Integer numLIZJ;
        PoiDetailApi.RecommendedDish recommendedDish = (PoiDetailApi.RecommendedDish) interfaceC1891350zJl;
        super.onBindItemView(recommendedDish);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.fx5);
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            c19me = (C19ME) layoutParams;
        } else {
            c19me = null;
        }
        if (FE1()) {
            if (c19me != null) {
                c19me.dimensionRatio = "1:1";
            }
        } else if (c19me != null) {
            c19me.dimensionRatio = "4:3";
        }
        int iI5 = I5(this.itemView.getContext());
        if (FE1()) {
            i = iI5;
        } else {
            i = (iI5 * 3) / 4;
        }
        List<UrlModel> cropImages = recommendedDish.getCropImages();
        if (cropImages == null || (urlModel = (UrlModel) C13LP.LJJJLL(cropImages)) == null) {
            List<UrlModel> images = recommendedDish.getImages();
            if (images != null) {
                urlModel = (UrlModel) C13LP.LJJJLL(images);
            } else {
                urlModel = null;
            }
        }
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
        Context context = this.itemView.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1331750klB.LIZJ = iIntValue;
        c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (iRecommendDishesAbility = (IRecommendDishesAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IRecommendDishesAbility.class, null)) != null) {
            poiId = iRecommendDishesAbility.getPoiId();
        } else {
            poiId = null;
        }
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_dishes_img", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)))), null));
        c1180600gpO.LIZLLL = new C1202680hP0(poiId, null, null, null, null, 30);
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(urlModel));
        c1189360h3WLIZ.LJI(iI5, i);
        c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
        c1189360h3WLIZ.LIZLLL(smartImageView);
        c1189360h3WLIZ.LIZ.LIZLLL("poi_detail_dishes_img");
        c1189360h3WLIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1189360h3WLIZ.LIZIZ();
        TextView textView = (TextView) this.itemView.findViewById(R.id.fxa);
        textView.setText(recommendedDish.getName());
        int i4 = 3;
        if (C426750GoL.LIZLLL(textView.getContext())) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2);
        if (FE1()) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        textView.setMaxLines(i3);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.fx8);
        if (FE1() || (((priceCurrency = recommendedDish.getPriceCurrency()) == null || priceCurrency.length() == 0) && ((priceNum = recommendedDish.getPriceNum()) == null || priceNum.length() == 0))) {
            C339190DRl.LIZIZ(textView2);
        } else {
            C339190DRl.LIZLLL(textView2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(recommendedDish.getPriceCurrency());
            sbLIZ.append(recommendedDish.getPriceNum());
            textView2.setText(C2188811AlT.LIZIZ(sbLIZ));
            if (C426750GoL.LIZLLL(textView2.getContext())) {
                i4 = 5;
            }
            textView2.setGravity(i4);
        }
        if (recommendedDish.getLikeNum() >= 10) {
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.mob);
            C339190DRl.LIZLLL(tuxTextView);
            tuxTextView.setMinTextSize(10.0f);
            tuxTextView.setText(this.itemView.getContext().getResources().getQuantityString(2131755621, (int) recommendedDish.getLikeNum(), C1843500y4a.LIZIZ(recommendedDish.getLikeNum())));
        } else {
            C339190DRl.LIZIZ(this.itemView.findViewById(R.id.mob));
        }
        C786410Ut5.I7(new AkS28S0300000_18(recommendedDish, this, smartImageView, 13), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewOnCreateItemView;
        if (SlashComponentUIPreloadExp.LIZ("poi_recommend_dish")) {
            viewOnCreateItemView = C1181430gqj.LIZIZ(viewGroup.getContext(), R.layout.dzu, viewGroup, false);
        } else {
            viewOnCreateItemView = super.onCreateItemView(viewGroup);
        }
        C786410Ut5.W5(viewOnCreateItemView, new ViewGroup.LayoutParams(I5(viewGroup.getContext()), -2));
        return viewOnCreateItemView;
    }
}
