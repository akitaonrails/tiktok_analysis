package com.ss.android.ugc.aweme.pipo.cashier.common.address;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class Region implements Serializable {

    @C09CT("asci_name")
    public final String asciName;

    @C09CT("code")
    public final String code;

    @C09CT("description")
    public final String description;

    @C09CT("geoname_id")
    public final String geoNameId;

    @C09CT("level")
    public final String level;

    @C09CT("name")
    public final String name;

    @C09CT("sub_region")
    public final List<Region> subRegion;

    public Region() {
        this(null, null, null, null, null, null, null);
    }

    public Region(String str, String str2, String str3, String str4, String str5, String str6, List<Region> list) {
        this.name = str;
        this.geoNameId = str2;
        this.code = str3;
        this.asciName = str4;
        this.level = str5;
        this.description = str6;
        this.subRegion = list;
    }
}
