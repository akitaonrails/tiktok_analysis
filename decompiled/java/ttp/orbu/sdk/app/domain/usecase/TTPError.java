package ttp.orbu.sdk.app.domain.usecase;

import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.constants.TTPErrorCode;
import ttpobfuscated.n0;

/* JADX INFO: loaded from: classes24.dex */
public final class TTPError {
    public final TTPErrorCode a;
    public final String b;

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTPError)) {
            return false;
        }
        TTPError tTPError = (TTPError) obj;
        return this.a == tTPError.a && Intrinsics.LJFF(this.b, tTPError.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TTPError(code=");
        sb.append(this.a);
        sb.append(", message=");
        return n0.a(sb, this.b, ')');
    }

    public final TTPErrorCode a() {
        return this.a;
    }

    public final TTPErrorCode c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public TTPError(TTPErrorCode tTPErrorCode, String str) {
        this.a = tTPErrorCode;
        this.b = str;
    }

    public final TTPError a(TTPErrorCode tTPErrorCode, String str) {
        return new TTPError(tTPErrorCode, str);
    }

    public static /* synthetic */ TTPError a(TTPError tTPError, TTPErrorCode tTPErrorCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            tTPErrorCode = tTPError.a;
        }
        if ((i & 2) != 0) {
            str = tTPError.b;
        }
        return tTPError.a(tTPErrorCode, str);
    }
}
