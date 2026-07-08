package com.ss.android.ugc.aweme.filter.repository.internal.utils;

import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class FilterConfig {
    public List<FilterConfigItem> items;
    public String resource;

    public static final class FilterConfigItem {
        public int max;
        public int min;
        public String name;
        public String tag;
        public int value;

        public FilterConfigItem() {
            this(0, 0, 0, "", "");
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

        public FilterConfigItem(int i, int i2, int i3, String str, String str2) {
            this.min = i;
            this.max = i2;
            this.value = i3;
            this.tag = str;
            this.name = str2;
        }
    }

    public FilterConfig() {
        this(null, null);
    }

    public final void setItems(List<FilterConfigItem> list) {
        this.items = list;
    }

    public final void setResource(String str) {
        this.resource = str;
    }

    public FilterConfig(String str, List<FilterConfigItem> list) {
        this.resource = str;
        this.items = list;
    }
}
