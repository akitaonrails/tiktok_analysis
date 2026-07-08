package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class IBEInfo implements Serializable {

    @C09CT("ibe_type")
    public final int ibeType;

    @C09CT("lynx_schema")
    public final String lynxSchema;

    @C09CT("prop_id")
    public final String propId;

    public IBEInfo() {
        this(1, "", null);
    }

    public final String getGeckoChannel() {
        return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(this.lynxSchema), "channel");
    }

    public final boolean getHasGeckoChannel() {
        return getGeckoChannel() != null;
    }

    public IBEInfo(int i, String str, String str2) {
        this.ibeType = i;
        this.lynxSchema = str;
        this.propId = str2;
    }
}
