package com.ss.android.ugc.aweme.poi.detail.nearby.cards;

import X.C1173300gdc;
import X.C1173930ged;
import X.C1174830gg5;
import X.C1180560gpK;
import X.C1180580gpM;
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
import X.C426750GoL;
import X.C438710HIf;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1177490gkN;
import X.EnumC1179480gna;
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
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiDistance;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyCardCell extends PowerCell<C1173930ged> {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public float LLILZLL;
    public C1185600gxS LLIZ;
    public C1173930ged LLIZLLLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcQr0;
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.df2);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.dg9);
        Context context = getContext();
        if (context == null || !C426750GoL.LIZLLL(context)) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.setGravity(3);
            }
        } else {
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (tuxTextView2 != null) {
                tuxTextView2.setGravity(5);
            }
        }
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.de2);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.df6);
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(getParent());
        this.LLIZ = (fragmentLJIIJ == null || (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJIIJ)) == null || (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) == null) ? null : (C1185600gxS) c1173300gdcQr0.LIZ;
        this.itemView.findViewById(R.id.dg8);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.jwv);
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 958));
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 191), this.itemView);
    }

    public static String L5(C1173930ged c1173930ged) {
        List<PoiDetailTag> list;
        PoiDetailTag next;
        PoiDetailTagContent poiDetailTagContent;
        List<PoiDetailTag> list2;
        PoiDetailTag poiDetailTag;
        PoiDetailTagContent poiDetailTagContent2;
        String str;
        List<PoiDetailTag> list3;
        PoiDetailTag poiDetailTag2;
        PoiDetailTagContent poiDetailTagContent3;
        String str2;
        PoiDiscoveryCard poiDiscoveryCard = c1173930ged.LL;
        if (poiDiscoveryCard == null || (list3 = poiDiscoveryCard.highlightTags) == null || (poiDetailTag2 = (PoiDetailTag) C13LP.LJJJLL(list3)) == null || (poiDetailTagContent3 = poiDetailTag2.tagContent) == null || (str2 = poiDetailTagContent3.commonText) == null) {
            PoiDiscoveryCard poiDiscoveryCard2 = c1173930ged.LL;
            if (poiDiscoveryCard2 == null || (list2 = poiDiscoveryCard2.poiTags) == null || (poiDetailTag = (PoiDetailTag) C13LP.LJJJLL(list2)) == null || (poiDetailTagContent2 = poiDetailTag.tagContent) == null || (str = poiDetailTagContent2.commonText) == null) {
                PoiDiscoveryCard poiDiscoveryCard3 = c1173930ged.LL;
                if (poiDiscoveryCard3 != null && (list = poiDiscoveryCard3.poiTags) != null) {
                    Iterator<PoiDetailTag> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.tagType == EnumC1179480gna.POI_DETAIL_TAG_TYPE_HOTEL_RATING.getValue()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    PoiDetailTag poiDetailTag3 = next;
                    if (poiDetailTag3 != null && (poiDetailTagContent = poiDetailTag3.tagContent) != null) {
                        return poiDetailTagContent.commonText;
                    }
                }
                return null;
            }
            return str;
        }
        return str2;
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
        int iIntValue;
        String str2;
        String str3;
        String str4;
        PoiDiscoveryCard poiDiscoveryCard;
        PoiDiscoveryCard poiDiscoveryCard2;
        PoiDistance poiDistance;
        String str5;
        PoiDiscoveryCard poiDiscoveryCard3;
        String str6;
        PoiDiscoveryCard poiDiscoveryCard4;
        Integer numLIZJ;
        C1173930ged c1173930ged = (C1173930ged) interfaceC1891350zJl;
        super.onBindItemView(c1173930ged);
        this.LLIZLLLIL = c1173930ged;
        PoiDiscoveryCard poiDiscoveryCard5 = c1173930ged.LL;
        String str7 = null;
        if (poiDiscoveryCard5 != null) {
            str = poiDiscoveryCard5.poiHeaderImg;
        } else {
            str = null;
        }
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
        C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "poi_detail_nearby_card_img", new C1180560gpK(this.itemView.getContext(), EnumC1177490gkN.FALLBACK_32_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(8))), null));
        C1173930ged item = getItem();
        if (item != null && (poiDiscoveryCard4 = item.LL) != null) {
            str2 = poiDiscoveryCard4.poiId;
        } else {
            str2 = null;
        }
        String str8 = "";
        if (str2 == null) {
            str2 = "";
        }
        c1180600gpO.LIZLLL = new C1202680hP0(str2, null, null, null, null, 30);
        C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZJ(str));
        c1189360h3WLIZ.LJI(I5(this.itemView.getContext()), (I5(this.itemView.getContext()) * 3) / 4);
        c1189360h3WLIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
        c1189360h3WLIZ.LIZLLL(this.LL);
        c1189360h3WLIZ.LIZ.LIZLLL("poi_detail_nearby_card");
        c1189360h3WLIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1189360h3WLIZ.LIZIZ();
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            PoiDiscoveryCard poiDiscoveryCard6 = c1173930ged.LL;
            if (poiDiscoveryCard6 != null) {
                str6 = poiDiscoveryCard6.poiName;
            } else {
                str6 = null;
            }
            tuxTextView.setText(str6);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            PoiDiscoveryCard poiDiscoveryCard7 = c1173930ged.LL;
            if (poiDiscoveryCard7 != null) {
                poiDistance = poiDiscoveryCard7.poiDistance;
                if (poiDistance != null) {
                    str5 = poiDistance.distanceShowText;
                }
                if ((C123100dR.LIZ(str5) || poiDistance == null || (str = poiDistance.distanceShowText) == null) && ((poiDiscoveryCard3 = c1173930ged.LL) == null || (str = poiDiscoveryCard3.formattedAddress) == null)) {
                    String str9 = "";
                }
                tuxTextView2.setText(str9);
            } else {
                poiDistance = null;
            }
            str5 = null;
            if (C123100dR.LIZ(str5)) {
                String str92 = "";
                tuxTextView2.setText(str92);
            } else {
                String str922 = "";
                tuxTextView2.setText(str922);
            }
        }
        PoiDiscoveryCard poiDiscoveryCard8 = c1173930ged.LL;
        if (poiDiscoveryCard8 != null) {
            str3 = poiDiscoveryCard8.reviewScore;
        } else {
            str3 = null;
        }
        if (C123100dR.LIZ(str3) && ((poiDiscoveryCard = c1173930ged.LL) == null || !Intrinsics.LJFF(poiDiscoveryCard.noRating, Boolean.TRUE))) {
            String strL5 = L5(c1173930ged);
            if (strL5 != null || ((poiDiscoveryCard2 = c1173930ged.LL) != null && (strL5 = poiDiscoveryCard2.categoryName) != null)) {
                str8 = strL5;
            }
            if (C123100dR.LIZ(str8)) {
                TuxTextView tuxTextView3 = this.LLILZ;
                if (tuxTextView3 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    PoiDiscoveryCard poiDiscoveryCard9 = c1173930ged.LL;
                    if (poiDiscoveryCard9 != null) {
                        str7 = poiDiscoveryCard9.reviewScore;
                    }
                    sbLIZ.append(str7);
                    sbLIZ.append(" · ");
                    sbLIZ.append(str8);
                    tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                TuxTextView tuxTextView4 = this.LLILZ;
                if (tuxTextView4 != null) {
                    PoiDiscoveryCard poiDiscoveryCard10 = c1173930ged.LL;
                    if (poiDiscoveryCard10 != null) {
                        str7 = poiDiscoveryCard10.reviewScore;
                    }
                    tuxTextView4.setText(String.valueOf(str7));
                }
            }
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                C1189060h32.LJJII(tuxTextView5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, null);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLILZIL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        TuxTextView tuxTextView6 = this.LLILZ;
        if (tuxTextView6 != null) {
            C1189060h32.LJJII(tuxTextView6, 0, null, null, null);
        }
        TuxTextView tuxTextView7 = this.LLILZ;
        if (tuxTextView7 == null) {
            return;
        }
        String strL52 = L5(c1173930ged);
        if (strL52 == null) {
            PoiDiscoveryCard poiDiscoveryCard11 = c1173930ged.LL;
            if (poiDiscoveryCard11 != null && (str4 = poiDiscoveryCard11.categoryName) != null) {
                str8 = str4;
            }
            strL52 = str8;
        }
        tuxTextView7.setText(strL52);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        C786410Ut5.W5(viewOnCreateItemView, new ViewGroup.LayoutParams(I5(viewGroup.getContext()), -2));
        return viewOnCreateItemView;
    }
}
