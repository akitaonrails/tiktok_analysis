package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileComponentUIConfig {
    public static final int $stable = 8;

    @C09CT("padding")
    public final List<Integer> padding;

    public ProfileComponentUIConfig() {
        this(C1697810uHb.LJIIJJI(0, 0, 0, 0));
    }

    public final int getPaddingBottom() {
        List<Integer> list = this.padding;
        if (list != null) {
            return ((Number) ListProtector.get(list, 2)).intValue();
        }
        return 0;
    }

    public final int getPaddingLeft() {
        List<Integer> list = this.padding;
        if (list != null) {
            return ((Number) ListProtector.get(list, 1)).intValue();
        }
        return 0;
    }

    public final int getPaddingRight() {
        List<Integer> list = this.padding;
        if (list != null) {
            return ((Number) ListProtector.get(list, 3)).intValue();
        }
        return 0;
    }

    public final int getPaddingTop() {
        List<Integer> list = this.padding;
        if (list != null) {
            return ((Number) ListProtector.get(list, 0)).intValue();
        }
        return 0;
    }

    public ProfileComponentUIConfig(List<Integer> list) {
        this.padding = list;
    }
}
