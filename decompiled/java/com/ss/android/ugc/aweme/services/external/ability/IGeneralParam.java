package com.ss.android.ugc.aweme.services.external.ability;

import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public interface IGeneralParam {
    String getParamByKey(String str);

    void setNetWorkInfoCallback();

    void setParamWithKey(String str, String str2);

    void setParams(HashMap<String, String> map);
}
