package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLynxEntryData implements Serializable {

    @C09CT("entry_type")
    public int entryType;

    @C09CT("gecko_channel")
    public List<String> geckoChannel;

    @C09CT("lynx_scheme")
    public String lynxScheme;

    public AdLynxEntryData() {
        this(0, null, null);
    }

    public final void setEntryType(int i) {
        this.entryType = i;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setLynxScheme(String str) {
        this.lynxScheme = str;
    }

    public AdLynxEntryData(int i, String str, List<String> list) {
        this.entryType = i;
        this.lynxScheme = str;
        this.geckoChannel = list;
    }
}
