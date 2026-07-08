package com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend;

import X.C01GW;
import X.C0H9H;
import X.C0PEM;
import X.C1309550kBN;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19471811Ga;
import X.C19471911Gb;
import X.C19675411yS;
import X.C19676011yY;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C675940QfI;
import X.C675950QfJ;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C948503nH;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.Extra;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendProduct;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.ISysRecommendAbility;
import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import g1c.AjS71S0100000_29;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS52S0301000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class SysRecommendAssem extends UISlotAssem implements ISysRecommendAbility, InterfaceC1554640qYg {
    public View LLJJI;
    public View LLJJIII;
    public GridLayout LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 103));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 102));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bs9;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.ISysRecommendAbility
    public final void dismiss() {
        this.LLJJIJIIJIL = false;
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -710652070) {
            return null;
        }
        return this;
    }

    public final PhotoSearchEnterParams hp() {
        return (PhotoSearchEnterParams) this.LLJJJ.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.ISysRecommendAbility
    public final boolean isShown() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = view.findViewById(R.id.pa8);
        this.LLJJIII = view.findViewById(R.id.sxn);
        this.LLJJIJI = (GridLayout) view.findViewById(R.id.sx4);
        View view2 = this.LLJJI;
        if (view2 != null) {
            C786410Ut5.I7(new AjS71S0100000_29(this, 0), view2);
        }
        View view3 = this.LLJJIII;
        if (view3 != null) {
            C786410Ut5.I7(new AjS71S0100000_29(this, 1), view3);
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.ISysRecommendAbility
    public final void Ex(SysRecommendModel sysRecommendModel, boolean z) {
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        String str;
        BcmStandardTrackEvent bcmStandardTrackEvent;
        BcmStandardTrackEvent bcmStandardTrackEvent2;
        String str2;
        Context context = getContext();
        if (context == null) {
            return;
        }
        List<SysRecommendFeedItem> list = sysRecommendModel.feedList;
        int i = 4;
        char c = 1;
        char c2 = 0;
        if (list != null && list.size() == 4) {
            this.LLJJIJIIJIL = true;
            GridLayout gridLayout = this.LLJJIJI;
            if (gridLayout != null) {
                C786410Ut5.LJJJJJ(gridLayout);
            }
            List<SysRecommendFeedItem> list2 = sysRecommendModel.feedList;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<SysRecommendFeedItem> it2 = list2.iterator();
            int i2 = 0;
            while (true) {
                String str3 = "";
                if (it2.hasNext()) {
                    SysRecommendFeedItem next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        SysRecommendFeedItem sysRecommendFeedItem = next;
                        C19675411yS c19675411yS = new C19675411yS(context, sysRecommendFeedItem, new AwS52S0301000_29(this, sysRecommendModel, i2, sysRecommendFeedItem, 0));
                        c19675411yS.setRoundedCornerRadius(C0H9H.LIZ(i));
                        PhotoSearchEnterParams photoSearchEnterParamsHp = hp();
                        Pair[] pairArr = new Pair[2];
                        pairArr[c2] = new Pair("product_id", sysRecommendFeedItem.id);
                        pairArr[c] = new Pair("item_order", String.valueOf(i3));
                        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                        SysRecommendProduct sysRecommendProduct = sysRecommendFeedItem.product;
                        if (sysRecommendProduct != null) {
                            bcmStandardTrackEvent = sysRecommendProduct.bcmStandardTrackEvent;
                        } else {
                            bcmStandardTrackEvent = null;
                        }
                        C675940QfI.LIZJ("photo_search_recom_product_show", photoSearchEnterParamsHp, new AwS376S0200000_10(mapLJIIJ, (Map<String, String>) bcmStandardTrackEvent, (BcmStandardTrackEvent) 79));
                        PhotoSearchEnterParams photoSearchEnterParamsHp2 = hp();
                        Pair[] pairArr2 = new Pair[8];
                        pairArr2[0] = new Pair("page_name", "photo_search_page_view");
                        pairArr2[1] = new Pair("source_page_type", "photo_search_page_view");
                        pairArr2[2] = new Pair("source_module", "rec_photo_search_page_view_outer_maybe_you_like_module");
                        pairArr2[3] = new Pair("item_order", String.valueOf(i3));
                        pairArr2[4] = new Pair("product_id", sysRecommendFeedItem.id);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(sysRecommendModel.requestId);
                        sbLIZ.append('_');
                        sbLIZ.append(sysRecommendFeedItem.id);
                        sbLIZ.append('_');
                        sbLIZ.append(i3);
                        pairArr2[5] = new Pair("track_id", C2188811AlT.LIZIZ(sbLIZ));
                        String str4 = sysRecommendModel.requestId;
                        if (str4 == null) {
                            str4 = "";
                        }
                        pairArr2[6] = new Pair("request_id", str4);
                        Extra extra = sysRecommendFeedItem.extra;
                        if (extra != null && (str2 = extra.recommendInfo) != null) {
                            str3 = str2;
                        }
                        pairArr2[7] = new Pair("rec_params", str3);
                        Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
                        SysRecommendProduct sysRecommendProduct2 = sysRecommendFeedItem.product;
                        if (sysRecommendProduct2 != null) {
                            bcmStandardTrackEvent2 = sysRecommendProduct2.bcmStandardTrackEvent;
                        } else {
                            bcmStandardTrackEvent2 = null;
                        }
                        C19676011yY.LIZJ(photoSearchEnterParamsHp2, mapLJIIJ2, bcmStandardTrackEvent2);
                        arrayList.add(c19675411yS);
                        i = 4;
                        i2 = i3;
                        c = 1;
                        c2 = 0;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    int i4 = 0;
                    for (Object obj : arrayList) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            View view = (View) obj;
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(((Size) this.LLJJIJIL.getValue()).getWidth(), ((Size) this.LLJJIJIL.getValue()).getHeight());
                            if (i4 == 0) {
                                marginLayoutParams.setMargins(0, 0, C0H9H.LIZIZ(1), 0);
                            } else if (i4 == sysRecommendModel.feedList.size() - 1) {
                                marginLayoutParams.setMargins(C0H9H.LIZIZ(1), 0, 0, 0);
                            } else {
                                marginLayoutParams.setMargins(C0H9H.LIZIZ(1), 0, C0H9H.LIZIZ(1), 0);
                            }
                            GridLayout gridLayout2 = this.LLJJIJI;
                            if (gridLayout2 != null) {
                                gridLayout2.addView(view, marginLayoutParams);
                            }
                            i4 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    C786410Ut5.LJLLLLLL(0, LJJIJL());
                    if (z) {
                        PhotoSearchEnterParams photoSearchEnterParamsHp3 = hp();
                        Pair[] pairArr3 = new Pair[2];
                        PhotoSearchEnterParams photoSearchEnterParamsHp4 = hp();
                        if (photoSearchEnterParamsHp4 != null && (photoSearchBusinessEnterParams = photoSearchEnterParamsHp4.businessParams) != null && (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) != null) {
                            str3 = str;
                        }
                        pairArr3[0] = new Pair("current_page", str3);
                        pairArr3[1] = new Pair("item_num", "4");
                        C675940QfI.LIZJ("photo_search_recom_module_show", photoSearchEnterParamsHp3, new AwS608S0100000_29(C2097608Jq.LJIIJ(pairArr3), (Map<String, String>) 515));
                        C19471811Ga.LIZ.getClass();
                        C675950QfJ.LIZ.getClass();
                        C675950QfJ.LIZ().storeInt("recommend_module_show_count", C675950QfJ.LIZ().getInt("recommend_module_show_count", 0) + 1);
                        C675950QfJ.LIZ().storeLong("recommend_module_recent_time", System.currentTimeMillis());
                    }
                    EcPhotoSearchAlbumVM ecPhotoSearchAlbumVMLIZ = C19471911Gb.LIZ(C724240Sb0.LIZ(this));
                    if (ecPhotoSearchAlbumVMLIZ != null) {
                        C948503nH.LJFF(ecPhotoSearchAlbumVMLIZ, C0PEM.LIZJ, new C1309550kBN(sysRecommendModel, null));
                        return;
                    }
                    return;
                }
            }
        }
    }
}
