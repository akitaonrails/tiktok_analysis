package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CommerceStruct implements Serializable {

    @C09CT("use_async_load")
    public boolean asyncLoad;

    @C09CT("bottom_button_layout")
    public int bottomButtonLayout;

    @C09CT("commerce_permission")
    public int commercePermission;

    @C09CT("oec_live_enter_room_init_data")
    public String oecInitDataString;

    @C09CT("product_num")
    public long productNum;

    @C09CT("use_new_promotion")
    public int useNewPromotion;

    public boolean isEcomShoppingMode() {
        return this.bottomButtonLayout == 1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceStruct{commercePermission=");
        sbLIZ.append(this.commercePermission);
        sbLIZ.append(", commercePack=");
        sbLIZ.append(this.oecInitDataString);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getCommercePermission() {
        return this.commercePermission;
    }

    public String getOecInitDataString() {
        return this.oecInitDataString;
    }

    public void setCommercePermission(int i) {
        this.commercePermission = i;
    }

    public void setOecInitDataString(String str) {
        this.oecInitDataString = str;
    }
}
