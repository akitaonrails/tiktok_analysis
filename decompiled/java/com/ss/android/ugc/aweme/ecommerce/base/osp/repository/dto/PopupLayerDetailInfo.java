package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C13BV;
import X.C15438062q;
import X.C1697810uHb;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PopupLayerDetailInfo {

    @C09CT("desc")
    public String desc;

    @C09CT("popup_layer_items")
    public List<PopupLayerItem> popupLayerItems;

    @C09CT("title")
    public String title;

    public PopupLayerDetailInfo() {
    }

    public final List<BillItem> LIZ() {
        List<PopupLayerItem> list = this.popupLayerItems;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (PopupLayerItem popupLayerItem : list) {
            int i2 = i + 1;
            Boolean bool = null;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            PopupLayerItem popupLayerItem2 = popupLayerItem;
            Price price = new Price(popupLayerItem2.itemVal, null, null, null, null, null, 1, null, null, 1, null);
            String str = popupLayerItem2.itemName;
            if (i == 0) {
                bool = Boolean.TRUE;
            }
            arrayList.add(new BillItem(null, str, price, null, 1, 1, null, null, null, null, null, null, bool, null, null, null, null, null, null, null, null));
            i = i2;
        }
        return arrayList;
    }

    public PopupLayerDetailInfo(String str, String str2, List<PopupLayerItem> list) {
        this.title = str;
        this.desc = str2;
        this.popupLayerItems = list;
    }
}
