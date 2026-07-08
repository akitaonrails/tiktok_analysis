package com.ss.android.ugc.aweme.inbox.shop;

import X.C13BV;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MoveFullEntryAssetsData;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ShopFullMigrationViewModel extends ViewModel {
    public MoveFullEntryAssetsData LL;
    public Integer LLILLJJLI;
    public final MutableLiveData<List<MoveFullEntryAssetsItemData>> LLILLL = new MutableLiveData<>();

    public final void vQ2(Integer num, MoveFullEntryAssetsData moveFullEntryAssetsData) {
        if (moveFullEntryAssetsData == null) {
            this.LLILLL.postValue(C13BV.INSTANCE);
            return;
        }
        if (!((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).inboxService().LJI()) {
            this.LLILLL.postValue(C13BV.INSTANCE);
        } else if (num != null && num.intValue() == 3) {
            this.LLILLL.postValue(Collections.singletonList(new MoveFullEntryAssetsItemData(moveFullEntryAssetsData.content, moveFullEntryAssetsData.actionAreaText, moveFullEntryAssetsData.lightIconUrl, moveFullEntryAssetsData.darkIconUrl, moveFullEntryAssetsData.schemaLink)));
        } else {
            this.LLILLL.postValue(C13BV.INSTANCE);
        }
    }
}
