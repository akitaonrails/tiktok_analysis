package com.ss.android.ugc.xtrace;

import X.EnumC1998307sD;
import android.content.Context;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public interface IXtrace {
    void LIZ(EnumC1998307sD enumC1998307sD);

    Method LIZIZ(Class<?> cls, String str, Object... objArr);

    Object LIZJ(Member member, Object obj, Object... objArr);

    Method LIZLLL(Object... objArr);

    void LJ(Member member, Member member2);

    Boolean init(Context context);
}
