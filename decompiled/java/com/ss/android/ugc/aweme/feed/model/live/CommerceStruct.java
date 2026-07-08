package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CommerceStruct implements Serializable {

    @C09CT("use_async_load")
    public boolean asyncLoad;

    @C09CT("commerce_permission")
    public int commercePermission;

    @C09CT("oec_live_enter_room_init_data")
    public String oecInitDataString;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceStruct{commercePermission=");
        sbLIZ.append(this.commercePermission);
        sbLIZ.append(", commercePack=");
        sbLIZ.append(this.oecInitDataString);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean getAsyncLoad() {
        return this.asyncLoad;
    }

    public int getCommercePermission() {
        return this.commercePermission;
    }

    public String getOecInitDataString() {
        return this.oecInitDataString;
    }

    public void setAsyncLoad(boolean z) {
        this.asyncLoad = z;
    }

    public void setCommercePermission(int i) {
        this.commercePermission = i;
    }

    public void setOecInitDataString(String str) {
        this.oecInitDataString = str;
    }
}
