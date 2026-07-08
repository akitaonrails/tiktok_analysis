package com.bytedance.pipo.stellar.base.model.prop;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class ToastContentDO implements Serializable {

    @C09CT("duration")
    public final Integer duration;

    @C09CT("icon")
    public final ImageDO icon;

    @C09CT("message")
    public final String message;

    @C09CT("position")
    public final String position;

    public ToastContentDO() {
        this(null, null, null, null);
    }

    public ToastContentDO(String str, Integer num, ImageDO imageDO, String str2) {
        this.message = str;
        this.duration = num;
        this.icon = imageDO;
        this.position = str2;
    }
}
