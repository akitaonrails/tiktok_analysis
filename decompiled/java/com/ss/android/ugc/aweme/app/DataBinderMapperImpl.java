package com.ss.android.ugc.aweme.app;

import X.AbstractC1842050y2F;
import X.C03GW;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class DataBinderMapperImpl extends AbstractC1842050y2F {
    public static final SparseIntArray LIZ = new SparseIntArray(0);

    @Override // X.AbstractC1842050y2F
    public final List<AbstractC1842050y2F> LIZ() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bytedance.android.livesdk.DataBinderMapperImpl());
        arrayList.add(new com.ss.android.ugc.aweme.ecommerce.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // X.AbstractC1842050y2F
    public final ViewDataBinding LIZIZ(C03GW c03gw, View view, int i) {
        if (LIZ.get(i) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // X.AbstractC1842050y2F
    public final ViewDataBinding LIZJ(C03GW c03gw, View[] viewArr, int i) {
        if (viewArr.length != 0 && LIZ.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
