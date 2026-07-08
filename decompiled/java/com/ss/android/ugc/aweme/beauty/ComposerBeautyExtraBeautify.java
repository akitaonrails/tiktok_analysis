package com.ss.android.ugc.aweme.beauty;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes30.dex */
public final class ComposerBeautyExtraBeautify {
    public List<ItemsBean> items;
    public String resource;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposerBeautyExtraBeautify() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<ItemsBean> getItems() {
        return this.items;
    }

    public final String getResource() {
        return this.resource;
    }

    public static final class ItemsBean {
        public boolean doubleDirection;
        public int max;
        public int min;
        public String name;
        public String tag;
        public int value;

        /* JADX WARN: Multi-variable type inference failed */
        public ItemsBean() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }

        public final void setDoubleDirection(boolean z) {
            this.doubleDirection = z;
        }

        public final void setMax(int i) {
            this.max = i;
        }

        public final void setMin(int i) {
            this.min = i;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setTag(String str) {
            this.tag = str;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        public ItemsBean(boolean z, int i, int i2, int i3, String str, String str2) {
            this.doubleDirection = z;
            this.min = i;
            this.max = i2;
            this.value = i3;
            this.tag = str;
            this.name = str2;
        }

        public /* synthetic */ ItemsBean(boolean z, int i, int i2, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? "" : str, (i4 & 32) == 0 ? str2 : "");
        }
    }

    public final void setItems(List<ItemsBean> list) {
        this.items = list;
    }

    public final void setResource(String str) {
        this.resource = str;
    }

    public ComposerBeautyExtraBeautify(String str, List<ItemsBean> list) {
        this.resource = str;
        this.items = list;
    }

    public /* synthetic */ ComposerBeautyExtraBeautify(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
