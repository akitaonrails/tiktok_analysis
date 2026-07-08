package com.ss.android.ugc.aweme.search.df.api.top1;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface Top1NimbleTemplateContextPool {
    Object getNimbleTemplateContext(int i);

    Object getReusedItem(Map<String, ? extends Object> map, Class<?> cls, String str);

    void preloadNimbleTemplateContext(int i, Context context);

    void preloadNimbleTemplateContext(String str, Fragment fragment);

    void preloadNimbleTemplateContextForPreload(String str, Fragment fragment);
}
