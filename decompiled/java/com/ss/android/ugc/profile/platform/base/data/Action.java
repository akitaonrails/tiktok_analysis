package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import X.C1248620ib6;
import X.C1248630ib7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class Action implements Serializable {

    @C09CT("dialog")
    public DialogInfo dialog;

    @C09CT("router")
    public RouterInfo router;

    @C09CT("sheet")
    public SheetInfo sheet;

    @C09CT("toast")
    public C1248630ib7 toast;

    @C09CT("type")
    public String type;

    public static final class RouterInfo implements Serializable {

        @C09CT("url")
        public String url;

        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(String str) {
            this.url = str;
        }
    }

    public static final class SheetInfo implements Serializable {
        public static final C1248620ib6 Companion = new Object() { // from class: X.0ib6
        };

        @C09CT("type")
        public Integer sheetType;

        public final Integer getSheetType() {
            return this.sheetType;
        }

        public final void setSheetType(Integer num) {
            this.sheetType = num;
        }
    }

    public final DialogInfo getDialog() {
        return this.dialog;
    }

    public final RouterInfo getRouter() {
        return this.router;
    }

    public final SheetInfo getSheet() {
        return this.sheet;
    }

    public final C1248630ib7 getToast() {
        return this.toast;
    }

    public final String getType() {
        return this.type;
    }

    public final void setDialog(DialogInfo dialogInfo) {
        this.dialog = dialogInfo;
    }

    public final void setRouter(RouterInfo routerInfo) {
        this.router = routerInfo;
    }

    public final void setSheet(SheetInfo sheetInfo) {
        this.sheet = sheetInfo;
    }

    public final void setToast(C1248630ib7 c1248630ib7) {
        this.toast = c1248630ib7;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
