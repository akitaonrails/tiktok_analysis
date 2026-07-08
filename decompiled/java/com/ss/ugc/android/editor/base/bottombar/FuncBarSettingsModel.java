package com.ss.ugc.android.editor.base.bottombar;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public class FuncBarSettingsModel {

    @C09CT("function_item_tree")
    public FunctionItemModel functionItemTree;

    @C09CT("is_settings_enable")
    public boolean isSettingsEnable;

    public final FunctionItemModel getFunctionItemTree() {
        return this.functionItemTree;
    }

    public final boolean isSettingsEnable() {
        return this.isSettingsEnable;
    }

    public final void setFunctionItemTree(FunctionItemModel functionItemModel) {
        this.functionItemTree = functionItemModel;
    }

    public final void setSettingsEnable(boolean z) {
        this.isSettingsEnable = z;
    }
}
