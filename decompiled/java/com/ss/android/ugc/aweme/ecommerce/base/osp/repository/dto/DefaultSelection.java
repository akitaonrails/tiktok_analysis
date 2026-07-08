package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultSelection {

    @C09CT("default_pre_select_type")
    public String defaultPreSelectType;

    @C09CT("is_fully_selected")
    public Boolean isFullySelected;

    @C09CT("selected_props")
    public Map<String, String> selectedProps;

    public DefaultSelection() {
        this(null, null, null);
    }

    public DefaultSelection(Map<String, String> map, String str, Boolean bool) {
        this.selectedProps = map;
        this.defaultPreSelectType = str;
        this.isFullySelected = bool;
    }
}
