package com.ss.ugc.android.editor.base.bottombar;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class FunctionItemModel {
    public List<FunctionItemModel> children;

    @C09CT("edit_mode_func_list")
    public List<FunctionItemModel> editModeList;

    @C09CT("enable_strategy")
    public int enableStrategy;
    public String type;

    public final List<FunctionItemModel> getChildren() {
        return this.children;
    }

    public final List<FunctionItemModel> getEditModeList() {
        return this.editModeList;
    }

    public final int getEnableStrategy() {
        return this.enableStrategy;
    }

    public final String getType() {
        return this.type;
    }

    public final void setChildren(List<FunctionItemModel> list) {
        this.children = list;
    }

    public final void setEditModeList(List<FunctionItemModel> list) {
        this.editModeList = list;
    }

    public final void setEnableStrategy(int i) {
        this.enableStrategy = i;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
