package com.squareup.wire;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    public final int LL;

    /* JADX INFO: renamed from: com.squareup.wire.FieldEncoding$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] LIZ;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            LIZ = iArr;
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                LIZ[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                LIZ[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                LIZ[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    public ProtoAdapter<?> rawProtoAdapter() {
        int i = AnonymousClass1.LIZ[ordinal()];
        if (i == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i == 4) {
            return ProtoAdapter.BYTES;
        }
        throw new AssertionError();
    }

    public static FieldEncoding valueOf(String str) {
        return (FieldEncoding) C08FF.LIZ(FieldEncoding.class, str);
    }

    FieldEncoding(int i) {
        this.LL = i;
    }
}
