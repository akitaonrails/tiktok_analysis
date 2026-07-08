package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.vo.item;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallPadStyleItemBean {
    public int column;
    public Integer screen_max_width;
    public int screen_min_width;

    public final void setColumn(int i) {
        this.column = i;
    }

    public final void setScreen_max_width(Integer num) {
        this.screen_max_width = num;
    }

    public final void setScreen_min_width(int i) {
        this.screen_min_width = i;
    }

    public ECMixMallPadStyleItemBean(int i, Integer num, int i2) {
        this.screen_min_width = i;
        this.screen_max_width = num;
        this.column = i2;
    }
}
