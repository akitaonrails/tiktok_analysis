package com.bytedance.ies.abmock.debugtool.mock;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IMockComponent {

    public interface HostInfo {
        String chineseDesc();

        String englishDesc();

        int hostId();
    }

    Object get(String str);

    Map<String, Object> getExtendInfo(String str);

    Class<?> getFiledType(String str);

    HostInfo hostInfo();

    String mockInfoListJson();
}
