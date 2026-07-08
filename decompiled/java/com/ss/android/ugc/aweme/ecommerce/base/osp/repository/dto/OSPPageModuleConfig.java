package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OSPPageModuleConfig {

    @C09CT("group_id")
    public final int groupId;

    @C09CT("module_name")
    public final String name;

    @C09CT("split_type")
    public final int splitType;

    @C09CT("module_visible_type")
    public final int visibleType;

    public OSPPageModuleConfig(String str, int i, int i2, int i3) {
        this.name = str;
        this.visibleType = i;
        this.groupId = i2;
        this.splitType = i3;
    }
}
