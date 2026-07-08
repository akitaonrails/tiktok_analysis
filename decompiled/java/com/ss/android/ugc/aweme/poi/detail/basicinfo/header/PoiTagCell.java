package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C1179140gn2;
import X.C1179160gn4;
import X.C13LP;
import X.C1697810uHb;
import X.C19M4;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1179480gna;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import irm.AkS28S0300000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiTagCell extends PowerCell<C1179160gn4> {
    public static final C1179140gn2 LLILLJJLI = new C1179140gn2();
    public C1179160gn4 LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 297));
    }

    public static String I5(C1179160gn4 c1179160gn4) {
        Integer numValueOf;
        PoiDetailTag poiDetailTag;
        if (c1179160gn4 != null && (poiDetailTag = c1179160gn4.LLILLJJLI) != null) {
            numValueOf = Integer.valueOf(poiDetailTag.tagType);
        } else {
            numValueOf = null;
        }
        int value = EnumC1179480gna.POI_DETAIL_TAG_CONTENT_TYPE_FAV_CNT.getValue();
        if (numValueOf == null || numValueOf.intValue() != value) {
            int value2 = EnumC1179480gna.POI_DETAIL_TAG_CONTENT_TYPE_POST_CNT.getValue();
            if (numValueOf == null || numValueOf.intValue() != value2) {
                int value3 = EnumC1179480gna.POI_DETAIL_TAG_CONTENT_TYPE_DEAL_CNT.getValue();
                if (numValueOf != null && numValueOf.intValue() == value3) {
                    return "business";
                }
                int value4 = EnumC1179480gna.POI_DETAIL_TAG_TYPE_HOTEL_RATING.getValue();
                if (numValueOf != null && numValueOf.intValue() == value4) {
                    return "hotel_stars";
                }
                return "ordinary";
            }
            return "business";
        }
        return "business";
    }

    public static boolean L5(Integer num) {
        return C13LP.LJJJJ(num, C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1179480gna.POI_DETAIL_TAG_CONTENT_TYPE_FAV_CNT.getValue()), Integer.valueOf(EnumC1179480gna.POI_DETAIL_TAG_CONTENT_TYPE_POST_CNT.getValue()), Integer.valueOf(EnumC1179480gna.POI_DETAIL_TAG_CONTENT_TYPE_DEAL_CNT.getValue())));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C19M4 c19m4;
        int i;
        PoiDetailTag poiDetailTag;
        C1179160gn4 c1179160gn4 = (C1179160gn4) interfaceC1891350zJl;
        super.onBindItemView(c1179160gn4);
        this.LL = c1179160gn4;
        View view = this.itemView;
        Integer numValueOf = null;
        if ((view instanceof C19M4) && (c19m4 = (C19M4) view) != null) {
            C1179160gn4 item = getItem();
            if (item != null && (poiDetailTag = item.LLILLJJLI) != null) {
                numValueOf = Integer.valueOf(poiDetailTag.tagType);
            }
            if (L5(numValueOf)) {
                i = 81;
            } else {
                i = 61;
            }
            c19m4.setTuxFont(i);
            C786410Ut5.I7(new AkS28S0300000_18(c19m4, this, c1179160gn4, 18), c19m4);
            LLILLJJLI.LIZ(c19m4, c1179160gn4);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C19M4 c19m4 = new C19M4(viewGroup.getContext(), null, 6);
        C786410Ut5.O6(c19m4, new ViewGroup.MarginLayoutParams(-2, -2));
        c19m4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c19m4.setTuxFont(61);
        return c19m4;
    }
}
