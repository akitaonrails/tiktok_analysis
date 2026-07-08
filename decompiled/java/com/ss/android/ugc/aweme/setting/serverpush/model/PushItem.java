package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PushItem {

    @C09CT("action_type")
    public final int actionType;

    @C09CT("client_control_flags")
    public final int clientControlFlags;

    @C09CT("dependency_field")
    public final String dependencyFiled;

    @C09CT("display")
    public final PushItemDisplay display;

    @C09CT("field")
    public final String itemId;

    @C09CT("schema")
    public final String schema;

    @C09CT("select_field")
    public final String selectField;

    @C09CT("action_display")
    public final PushSelectedSubPage selectSubPage;

    @C09CT("sub_page")
    public final PushSettingDynamicUI subPage;

    public PushItem() {
        this("", 0, "", new PushItemDisplay(), 1, "", null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushItem)) {
            return false;
        }
        PushItem pushItem = (PushItem) obj;
        return Intrinsics.LJFF(this.itemId, pushItem.itemId) && this.clientControlFlags == pushItem.clientControlFlags && Intrinsics.LJFF(this.dependencyFiled, pushItem.dependencyFiled) && Intrinsics.LJFF(this.display, pushItem.display) && this.actionType == pushItem.actionType && Intrinsics.LJFF(this.schema, pushItem.schema) && Intrinsics.LJFF(this.subPage, pushItem.subPage) && Intrinsics.LJFF(this.selectField, pushItem.selectField) && Intrinsics.LJFF(this.selectSubPage, pushItem.selectSubPage);
    }

    public final boolean LIZ() {
        return (this.clientControlFlags & 1) == 0;
    }

    public PushItem(String str, int i, String str2, PushItemDisplay pushItemDisplay, int i2, String str3, PushSettingDynamicUI pushSettingDynamicUI, String str4, PushSelectedSubPage pushSelectedSubPage) {
        this.itemId = str;
        this.clientControlFlags = i;
        this.dependencyFiled = str2;
        this.display = pushItemDisplay;
        this.actionType = i2;
        this.schema = str3;
        this.subPage = pushSettingDynamicUI;
        this.selectField = str4;
        this.selectSubPage = pushSelectedSubPage;
    }
}
