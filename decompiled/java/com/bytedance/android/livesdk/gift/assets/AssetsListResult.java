package com.bytedance.android.livesdk.gift.assets;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AssetsListResult {

    @C09CT("assets")
    public List<AssetsModel> assets;

    public AssetsListResult() {
        this(null);
    }

    public AssetsListResult(List<AssetsModel> list) {
        this.assets = list;
    }
}
