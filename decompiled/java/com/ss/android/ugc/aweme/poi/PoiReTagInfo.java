package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C13LP;
import X.C15438062q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReTagInfo implements Serializable {

    @C09CT("edit_post_show_rec_poi")
    public final int editPostShowRecPoi;

    @C09CT("model_rec_poi_list")
    public final List<RecPoiItemModel> poiReTagRecPoiList;

    @C09CT("show_rec_poi_re_tag_banner")
    public final int showRecPoiReTagBanner;

    public PoiReTagInfo() {
        this(0, 0, null);
    }

    public final String getFirstCollectInfo() {
        RecPoiItemModel recPoiItemModel;
        List<RecPoiItemModel> list = this.poiReTagRecPoiList;
        if (list == null || (recPoiItemModel = (RecPoiItemModel) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return recPoiItemModel.getCollectInfo();
    }

    public final String getFirstPoiId() {
        RecPoiItemModel recPoiItemModel;
        List<RecPoiItemModel> list = this.poiReTagRecPoiList;
        if (list == null || (recPoiItemModel = (RecPoiItemModel) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return recPoiItemModel.getPoiId();
    }

    public final String getFirstPoiName() {
        RecPoiItemModel recPoiItemModel;
        List<RecPoiItemModel> list = this.poiReTagRecPoiList;
        if (list == null || (recPoiItemModel = (RecPoiItemModel) C13LP.LJJJLL(list)) == null) {
            return null;
        }
        return recPoiItemModel.getPoiName();
    }

    public final String getRecPoiIdList() {
        List<RecPoiItemModel> list = this.poiReTagRecPoiList;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<RecPoiItemModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getPoiId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
    }

    public final boolean showPoiReTagBanner() {
        return this.showRecPoiReTagBanner == 1;
    }

    public final int getEditPostShowRecPoi() {
        return this.editPostShowRecPoi;
    }

    public final List<RecPoiItemModel> getPoiReTagRecPoiList() {
        return this.poiReTagRecPoiList;
    }

    public final int getShowRecPoiReTagBanner() {
        return this.showRecPoiReTagBanner;
    }

    public PoiReTagInfo(int i, int i2, List<RecPoiItemModel> list) {
        this.showRecPoiReTagBanner = i;
        this.editPostShowRecPoi = i2;
        this.poiReTagRecPoiList = list;
    }
}
