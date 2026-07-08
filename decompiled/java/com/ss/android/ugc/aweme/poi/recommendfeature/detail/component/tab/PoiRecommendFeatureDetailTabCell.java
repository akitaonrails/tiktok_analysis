package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab;

import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1181100gqC;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C1308910kAL;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C438710HIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1203020hPY;
import X.EnumC1338240kve;
import X.InterfaceC1891350zJl;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailTabCell extends PowerCell<C1181100gqC> {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.r_j);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.r_k);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 69), this.itemView);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 441));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        C1181100gqC c1181100gqC = (C1181100gqC) interfaceC1891350zJl;
        super.onBindItemView(c1181100gqC);
        this.itemView.setActivated(c1181100gqC.LLILLJJLI);
        UrlModel urlModel = c1181100gqC.LL.cover;
        SmartImageView smartImageView = this.LL;
        if (smartImageView != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = fLIZIZ;
            c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
            c1331750klB.LIZJ = iIntValue;
            c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
            C1180600gpO c1180600gpO = new C1180600gpO("poi_recommend_feature_detail", "poi_recommend_feature_detail_tab", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(fLIZIZ)), null));
            c1180600gpO.LIZLLL = new C1202680hP0(null, null, null, null, null, 31);
            C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(urlModel));
            C1331670kl3 c1331670kl3 = c1189360h3WLIZ.LIZ;
            c1331670kl3.LJJI = c1331730kl9;
            c1331670kl3.LJJ = EnumC1338240kve.CENTER_CROP;
            c1189360h3WLIZ.LIZLLL(smartImageView);
            c1189360h3WLIZ.LIZIZ();
        }
        String str = c1181100gqC.LL.name;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            if (str == null) {
                str = "";
            }
            tuxTextView.setText(str);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e6u, viewGroup, false);
    }
}
