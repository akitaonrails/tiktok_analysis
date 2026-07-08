package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class PersonInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("clothing_desc")
    public final String clothingDescription;

    @C09CT("images")
    public final List<String> images;

    @C09CT("name")
    public final String name;

    @C09CT("physical_desc")
    public final String physicalDescription;

    public PersonInfo() {
        this(null, null, null, null, 15, null);
    }

    public PersonInfo(String str, String str2, String str3, List<String> list) {
        this.name = str;
        this.physicalDescription = str2;
        this.clothingDescription = str3;
        this.images = list;
    }

    public PersonInfo(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
