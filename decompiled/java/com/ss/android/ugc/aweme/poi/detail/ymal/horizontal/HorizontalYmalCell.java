package com.ss.android.ugc.aweme.poi.detail.ymal.horizontal;

import X.C1173300gdc;
import X.C1173340gdg;
import X.C1174830gg5;
import X.C1180600gpO;
import X.C1185600gxS;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C123100dR;
import X.C12ES;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LP;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C438710HIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1203020hPY;
import X.EnumC1338240kve;
import X.InterfaceC1181010gq3;
import X.InterfaceC1891350zJl;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagContent;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class HorizontalYmalCell extends PowerCell<C1173340gdg> {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public float LLILZLL;
    public C1185600gxS LLIZ;
    public C1173340gdg LLIZLLLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dzy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcQr0;
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.jrt);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.jrw);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.jrs);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.jru);
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(getParent());
        this.LLIZ = (fragmentLJIIJ == null || (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ)) == null || (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) == null) ? null : (C1185600gxS) c1173300gdcQr0.LIZ;
        this.itemView.findViewById(R.id.ymal_tag);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.jwv);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 36));
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 5), this.itemView);
    }

    public final int I5(Context context) {
        if (this.LLILZLL <= 0.0f) {
            this.LLILZLL = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 3) + ((((C12ES.LJIIJ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 8)) * 4) / 9.0f);
        }
        return (int) this.LLILZLL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        List<PoiDetailTag> list;
        PoiDetailTag poiDetailTag;
        PoiDetailTagContent poiDetailTagContent;
        String str4;
        List<PoiDetailTag> list2;
        PoiDetailTag poiDetailTag2;
        PoiDetailTagContent poiDetailTagContent2;
        String str5;
        PoiDiscoveryCard poiDiscoveryCard;
        String str6;
        String str7;
        int iIntValue;
        String str8;
        PoiDiscoveryCard poiDiscoveryCard2;
        Integer numLIZJ;
        C1173340gdg c1173340gdg = (C1173340gdg) interfaceC1891350zJl;
        super.onBindItemView(c1173340gdg);
        this.LLIZLLLIL = c1173340gdg;
        PoiDiscoveryCard poiDiscoveryCard3 = c1173340gdg.LL;
        String str9 = "";
        String str10 = null;
        if (poiDiscoveryCard3 != null && (str7 = poiDiscoveryCard3.poiHeaderImg) != null) {
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
            Context context = this.itemView.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c1331750klB.LIZJ = iIntValue;
            c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_horizontal_ymal_img", null);
            C1173340gdg item = getItem();
            if (item == null || (poiDiscoveryCard2 = item.LL) == null || (str8 = poiDiscoveryCard2.poiId) == null) {
                str8 = "";
            }
            c1180600gpO.LIZLLL = new C1202680hP0(str8, null, null, null, null, 30);
            C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZJ(str7));
            c1189360h3WLIZ.LJI(I5(this.itemView.getContext()), (I5(this.itemView.getContext()) * 3) / 4);
            c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
            c1189360h3WLIZ.LIZLLL(this.LL);
            c1189360h3WLIZ.LIZ.LIZLLL("poi_detail_ymal_img");
            c1189360h3WLIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1189360h3WLIZ.LIZIZ();
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            PoiDiscoveryCard poiDiscoveryCard4 = c1173340gdg.LL;
            if (poiDiscoveryCard4 != null) {
                str6 = poiDiscoveryCard4.poiName;
            } else {
                str6 = null;
            }
            tuxTextView.setText(str6);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            PoiDiscoveryCard poiDiscoveryCard5 = c1173340gdg.LL;
            if (poiDiscoveryCard5 != null) {
                str5 = poiDiscoveryCard5.poiDistanceFromCenter;
            } else {
                str5 = null;
            }
            if ((!C123100dR.LIZ(str5) || str5 == null) && ((poiDiscoveryCard = c1173340gdg.LL) == null || (str5 = poiDiscoveryCard.formattedAddress) == null)) {
                str5 = "";
            }
            tuxTextView2.setText(str5);
        }
        PoiDiscoveryCard poiDiscoveryCard6 = c1173340gdg.LL;
        if (poiDiscoveryCard6 != null) {
            str = poiDiscoveryCard6.reviewScore;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            PoiDiscoveryCard poiDiscoveryCard7 = c1173340gdg.LL;
            if (poiDiscoveryCard7 == null || (list2 = poiDiscoveryCard7.poiTags) == null || (poiDetailTag2 = (PoiDetailTag) C13LP.LJJJLL(list2)) == null || (poiDetailTagContent2 = poiDetailTag2.tagContent) == null || (str4 = poiDetailTagContent2.commonText) == null) {
                PoiDiscoveryCard poiDiscoveryCard8 = c1173340gdg.LL;
                if (poiDiscoveryCard8 != null) {
                    str4 = poiDiscoveryCard8.categoryName;
                } else {
                    str4 = null;
                }
            }
            if (C123100dR.LIZ(str4)) {
                TuxTextView tuxTextView3 = this.LLILZ;
                if (tuxTextView3 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    PoiDiscoveryCard poiDiscoveryCard9 = c1173340gdg.LL;
                    if (poiDiscoveryCard9 != null) {
                        str10 = poiDiscoveryCard9.reviewScore;
                    }
                    sbLIZ.append(str10);
                    sbLIZ.append(" · ");
                    sbLIZ.append(str4);
                    tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 == null) {
                return;
            }
            PoiDiscoveryCard poiDiscoveryCard10 = c1173340gdg.LL;
            if (poiDiscoveryCard10 != null) {
                str10 = poiDiscoveryCard10.reviewScore;
            }
            tuxTextView4.setText(String.valueOf(str10));
            return;
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        TuxTextView tuxTextView5 = this.LLILZ;
        if (tuxTextView5 == null) {
            return;
        }
        PoiDiscoveryCard poiDiscoveryCard11 = c1173340gdg.LL;
        if (poiDiscoveryCard11 == null || (list = poiDiscoveryCard11.poiTags) == null || (poiDetailTag = (PoiDetailTag) C13LP.LJJJLL(list)) == null || (poiDetailTagContent = poiDetailTag.tagContent) == null || (str2 = poiDetailTagContent.commonText) == null) {
            PoiDiscoveryCard poiDiscoveryCard12 = c1173340gdg.LL;
            if (poiDiscoveryCard12 != null && (str3 = poiDiscoveryCard12.categoryName) != null) {
                str9 = str3;
            }
            str2 = str9;
        }
        tuxTextView5.setText(str2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        C786410Ut5.W5(viewOnCreateItemView, new ViewGroup.LayoutParams(I5(viewGroup.getContext()), -2));
        return viewOnCreateItemView;
    }
}
