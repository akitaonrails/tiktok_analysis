package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public interface IEnsure extends IService {
    boolean ensureFalse(boolean z);

    boolean ensureFalse(boolean z, String str);

    boolean ensureFalse(boolean z, String str, Map<String, String> map);

    boolean ensureNotEmpty(Collection collection);

    boolean ensureNotNull(Object obj);

    boolean ensureNotNull(Object obj, String str);

    void ensureNotReachHere();

    void ensureNotReachHere(String str);

    void ensureNotReachHere(String str, Map<String, String> map);

    void ensureNotReachHere(Throwable th);

    void ensureNotReachHere(Throwable th, String str);

    void ensureNotReachHere(Throwable th, String str, Map<String, String> map);

    boolean ensureTrue(boolean z);

    boolean ensureTrue(boolean z, String str);

    boolean ensureTrue(boolean z, String str, Map<String, String> map);

    void reportLogException(int i, Throwable th, String str);

    void reportLogException(Throwable th);

    void reportLogException(Throwable th, String str);
}
