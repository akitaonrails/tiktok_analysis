package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class LiveCnySetting {

    @C09CT("force_update_room")
    public Boolean forceUpdateRoom = Boolean.TRUE;

    public Boolean getForceUpdateRoom() throws C316660CbA {
        Boolean bool = this.forceUpdateRoom;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }
}
