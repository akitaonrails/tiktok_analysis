package com.bytedance.pia.core.bridge.protocol;

import X.C08FF;
import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import X.C1BQ2;
import X.C2204551BPx;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import android.text.TextUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes35.dex */
public final class ProtocolMessage {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("data")
    public final n data;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Integer id;

    @C09CT("err_msg")
    public final String message;

    @C09CT("name")
    public final String name;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("type")
    public final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Type {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ Type[] $VALUES;

        @C09CT("invocation")
        public static final Type Invocation = new Type("Invocation", 0);

        @C09CT("callback")
        public static final Type Callback = new Type("Callback", 1);

        public static final /* synthetic */ Type[] $values() {
            return new Type[]{Invocation, Callback};
        }

        public static InterfaceC2044707zh<Type> getEntries() {
            return $ENTRIES;
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = new C2254308sP(typeArr$values);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public static Type valueOf(String str) {
            return (Type) C08FF.LIZ(Type.class, str);
        }

        public Type(String str, int i) {
        }
    }

    public static final n LIZ(C2204551BPx c2204551BPx) {
        Object c098200Yq;
        int i = c2204551BPx.LIZ;
        Object obj = null;
        if (i == 0) {
            return null;
        }
        try {
            c098200Yq = (n) GsonUtils.LIZ().LJIJJLI(new ProtocolMessage(Type.Callback, Integer.valueOf(i), c2204551BPx.LIZJ, null, Integer.valueOf(c2204551BPx.LIZIZ), c2204551BPx.LIZLLL));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (n) obj;
    }

    public static final n LIZIZ(C1BQ2 c1bq2) {
        Object c098200Yq;
        Object obj = null;
        if (TextUtils.isEmpty(c1bq2.LIZIZ)) {
            return null;
        }
        try {
            c098200Yq = (n) GsonUtils.LIZ().LJIJJLI(new ProtocolMessage(Type.Invocation, Integer.valueOf(c1bq2.LIZ), c1bq2.LIZJ, c1bq2.LIZIZ, null, null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (n) obj;
    }

    public ProtocolMessage(Type type, Integer num, n nVar, String str, Integer num2, String str2) {
        this.type = type;
        this.id = num;
        this.data = nVar;
        this.name = str;
        this.status = num2;
        this.message = str2;
    }
}
