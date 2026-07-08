package com.ss.android.ugc.aweme.shortvideo.record;

import android.content.Context;
import bfk.b0;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class RecordBottomTabConfigurePreloader {
    public static volatile boolean loaded;
    public static int viewIndex;
    public static final RecordBottomTabConfigurePreloader INSTANCE = new RecordBottomTabConfigurePreloader();
    public static final List<b0> itemList = new ArrayList();
    public static final int $stable = 8;

    public final void reset() {
        viewIndex = 0;
        itemList.clear();
    }

    public final b0 get() {
        List<b0> list = itemList;
        if ((!list.isEmpty()) && loaded) {
            int size = list.size();
            int i = viewIndex;
            if (size > i) {
                b0 b0Var = (b0) ListProtector.get(list, i);
                ListProtector.set(list, viewIndex, null);
                viewIndex++;
                return b0Var;
            }
        }
        return null;
    }

    public final void asyncRace(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context == null) {
            return;
        }
        int i = 0;
        viewIndex = 0;
        itemList.clear();
        loaded = false;
        do {
            itemList.add(new b0(context));
            i++;
        } while (i < 2);
        loaded = true;
    }
}
