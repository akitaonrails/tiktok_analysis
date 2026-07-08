package com.ss.android.ugc.aweme.shortvideo.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class BusinessGoodsPublishSetting implements Serializable {
    public List<BusinessGoodsPublishModel> goodsPublishModels;
    public String userId;

    public int hashCode() {
        String str = this.userId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public List<BusinessGoodsPublishModel> getGoodsPublishModels() {
        return this.goodsPublishModels;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.userId;
        String str2 = ((BusinessGoodsPublishSetting) obj).userId;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public void setGoodsPublishModels(List<BusinessGoodsPublishModel> list) {
        this.goodsPublishModels = list;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
