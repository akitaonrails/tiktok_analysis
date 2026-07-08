package com.ss.android.ugc.aweme.feed.model;

import X.C09R3;
import X.C13LE;
import X.C2217371BqR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC608270NtR;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeBizOptExtKt {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final InterfaceC608270NtR awemeCacheType$delegate;
    public static final InterfaceC608270NtR fcpProtocol$delegate;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(AwemeBizOptExtKt.class, "awemeCacheType", "getAwemeCacheType(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        final boolean z = false;
        C2217371BqR c2217371BqR2 = new C2217371BqR(AwemeBizOptExtKt.class, "fcpProtocol", "getFcpProtocol(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        c09r3.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2};
        final String str = "awemeCacheType";
        final int i = 0;
        final boolean z2 = false;
        awemeCacheType$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt$special$$inlined$associatePropertyNonNull$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str, new AwemeBizData(z, z, z, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str2 = "fcp_protocol";
        fcpProtocol$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt$special$$inlined$associatePropertyNullable$1
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str3;
                if (z2) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str2);
                if (awemeBizData != null) {
                    str3 = awemeBizData.fieldData;
                } else {
                    str3 = 0;
                }
                if (!(str3 instanceof String)) {
                    return null;
                }
                return str3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z2) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str2, new AwemeBizData(z2, z2, z2, str3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str3);
            }
        };
    }

    public static final int getAwemeCacheType(Aweme aweme) {
        return ((Number) awemeCacheType$delegate.getValue(aweme, $$delegatedProperties[0])).intValue();
    }

    public static final String getFcpProtocol(Aweme aweme) {
        return (String) fcpProtocol$delegate.getValue(aweme, $$delegatedProperties[1]);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt$associatePropertyNonNull$1, reason: invalid class name */
    public final class AnonymousClass1<R> implements InterfaceC608270NtR<Aweme, R> {
        public final /* synthetic */ String $associateName;
        public final /* synthetic */ R $defaultValue;
        public final /* synthetic */ boolean $isTransient;
        public final /* synthetic */ boolean $joinClone;
        public final /* synthetic */ boolean $joinEquals;
        public final /* synthetic */ boolean $joinToString;

        public R getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
            ConcurrentHashMap<String, AwemeBizData> normalBizFields;
            if (this.$isTransient) {
                normalBizFields = aweme.getTransientBizFields();
            } else {
                normalBizFields = aweme.getNormalBizFields();
            }
            normalBizFields.get(this.$associateName);
            Intrinsics.LJIILIIL();
            throw null;
        }

        @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
        public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
            return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
        }

        /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
        public void setValue2(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, R r) {
            ConcurrentHashMap<String, AwemeBizData> normalBizFields;
            if (this.$isTransient) {
                normalBizFields = aweme.getTransientBizFields();
            } else {
                normalBizFields = aweme.getNormalBizFields();
            }
            normalBizFields.put(this.$associateName, new AwemeBizData(this.$joinClone, this.$joinEquals, this.$joinToString, r));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC608270NtR
        public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj) {
            setValue2(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, obj);
        }

        public AnonymousClass1(boolean z, String str, R r, boolean z2, boolean z3, boolean z4) {
            this.$isTransient = z;
            this.$associateName = str;
            this.$defaultValue = r;
            this.$joinClone = z2;
            this.$joinEquals = z3;
            this.$joinToString = z4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt$associatePropertyNonNullExt$1, reason: invalid class name and case insensitive filesystem */
    public final class C2325551<R> implements InterfaceC608270NtR<Aweme, R> {
        public final /* synthetic */ String $associateName;
        public final /* synthetic */ Function1<Aweme, R> $defaultValueProvider;
        public final /* synthetic */ boolean $isTransient;
        public final /* synthetic */ boolean $joinClone;
        public final /* synthetic */ boolean $joinEquals;
        public final /* synthetic */ boolean $joinToString;

        public R getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
            ConcurrentHashMap<String, AwemeBizData> normalBizFields;
            if (this.$isTransient) {
                normalBizFields = aweme.getTransientBizFields();
            } else {
                normalBizFields = aweme.getNormalBizFields();
            }
            normalBizFields.get(this.$associateName);
            Intrinsics.LJIILIIL();
            throw null;
        }

        @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
        public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
            return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
        }

        /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
        public void setValue2(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, R r) {
            ConcurrentHashMap<String, AwemeBizData> normalBizFields;
            if (this.$isTransient) {
                normalBizFields = aweme.getTransientBizFields();
            } else {
                normalBizFields = aweme.getNormalBizFields();
            }
            normalBizFields.put(this.$associateName, new AwemeBizData(this.$joinClone, this.$joinEquals, this.$joinToString, r));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC608270NtR
        public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj) {
            setValue2(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2325551(boolean z, String str, Function1<? super Aweme, ? extends R> function1, boolean z2, boolean z3, boolean z4) {
            this.$isTransient = z;
            this.$associateName = str;
            this.$defaultValueProvider = function1;
            this.$joinClone = z2;
            this.$joinEquals = z3;
            this.$joinToString = z4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt$associatePropertyNullable$1, reason: invalid class name and case insensitive filesystem */
    public final class C2325561<R> implements InterfaceC608270NtR<Aweme, R> {
        public final /* synthetic */ String $associateName;
        public final /* synthetic */ boolean $isTransient;
        public final /* synthetic */ boolean $joinClone;
        public final /* synthetic */ boolean $joinEquals;
        public final /* synthetic */ boolean $joinToString;

        public R getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
            ConcurrentHashMap<String, AwemeBizData> normalBizFields;
            if (this.$isTransient) {
                normalBizFields = aweme.getTransientBizFields();
            } else {
                normalBizFields = aweme.getNormalBizFields();
            }
            normalBizFields.get(this.$associateName);
            Intrinsics.LJIILIIL();
            throw null;
        }

        @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
        public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
            return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
        }

        /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
        public void setValue2(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, R r) {
            ConcurrentHashMap<String, AwemeBizData> normalBizFields;
            if (this.$isTransient) {
                normalBizFields = aweme.getTransientBizFields();
            } else {
                normalBizFields = aweme.getNormalBizFields();
            }
            normalBizFields.put(this.$associateName, new AwemeBizData(this.$joinClone, this.$joinEquals, this.$joinToString, r));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC608270NtR
        public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj) {
            setValue2(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, obj);
        }

        public C2325561(boolean z, String str, boolean z2, boolean z3, boolean z4) {
            this.$isTransient = z;
            this.$associateName = str;
            this.$joinClone = z2;
            this.$joinEquals = z3;
            this.$joinToString = z4;
        }
    }

    public static final void setAwemeCacheType(Aweme aweme, int i) {
        awemeCacheType$delegate.setValue(aweme, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public static final void setFcpProtocol(Aweme aweme, String str) {
        fcpProtocol$delegate.setValue(aweme, $$delegatedProperties[1], str);
    }

    public static final <R> InterfaceC608270NtR<Aweme, R> associatePropertyNullable(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.LJIILIIL();
        throw null;
    }

    public static final <R> InterfaceC608270NtR<Aweme, R> associatePropertyNonNull(String str, R r, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.LJIILIIL();
        throw null;
    }

    public static final <R> InterfaceC608270NtR<Aweme, R> associatePropertyNonNullExt(String str, Function1<? super Aweme, ? extends R> function1, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.LJIILIIL();
        throw null;
    }

    public static InterfaceC608270NtR associatePropertyNullable$default(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        Intrinsics.LJIILIIL();
        throw null;
    }

    public static InterfaceC608270NtR associatePropertyNonNull$default(String str, Object obj, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj2) {
        Intrinsics.LJIILIIL();
        throw null;
    }

    public static InterfaceC608270NtR associatePropertyNonNullExt$default(String str, Function1 function1, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        Intrinsics.LJIILIIL();
        throw null;
    }
}
