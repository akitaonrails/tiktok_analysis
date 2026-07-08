package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DeleteRequest {

    @C09CT("address_entrance_scene")
    public final Integer addressEntranceScene;

    @C09CT("ids")
    public final List<String> ids;

    @C09CT("pre_log_id")
    public final String preLogId;

    public DeleteRequest(List<String> list, Integer num, String str) {
        this.ids = list;
        this.addressEntranceScene = num;
        this.preLogId = str;
    }
}
