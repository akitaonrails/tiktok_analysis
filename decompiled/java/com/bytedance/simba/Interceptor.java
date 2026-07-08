package com.bytedance.simba;

import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes4.dex */
public interface Interceptor {
    boolean intercept(Member member, Object obj, Object[] objArr);
}
