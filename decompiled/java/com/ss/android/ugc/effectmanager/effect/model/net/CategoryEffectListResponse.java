package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* JADX INFO: loaded from: classes4.dex */
public class CategoryEffectListResponse extends BaseNetResponse {
    public CategoryPageModel data;

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        CategoryPageModel categoryPageModel = this.data;
        return (categoryPageModel == null || categoryPageModel.getCategoryEffects() == null) ? false : true;
    }

    public String getRecId() {
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel == null) {
            return null;
        }
        return categoryPageModel.getRecId();
    }

    public CategoryPageModel getData() {
        return this.data;
    }

    public void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }
}
