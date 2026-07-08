package com.bytedance.router;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface IMappingInitializer {
    int getMapSize();

    void init(Map<String, String> map);

    void initInterceptorMap(Map<String, List<String>> map);

    void initVersionMap(Map<String, String> map);
}
