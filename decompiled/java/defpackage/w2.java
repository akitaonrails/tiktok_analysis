package defpackage;

import X.C08FF;
import X.C2188811AlT;
import X.C2254308sP;
import X.C786410Ut5;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w2 {
    public final a LIZ;
    public final List<Message> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final Exception LJI;
    public final d8 LJII;
    public final k9 LJIIIIZZ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a DELETE;
        public static final a FAILED;
        public static final a FULL;
        public static final a GUIDE;
        public static final a HISTORY;
        public static final /* synthetic */ a[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;
        public static final a NEW;
        public static final a PULL_NEW_COMPLETE;
        public static final a SELECT_RESPONSE;
        public static final a SWITCH;
        public static final a SWITCH_RESPONSE;
        public static final a SYNC_COMPLETE;
        public static final a UPDATE;

        public static InterfaceC2044707zh<a> getEntries() {
            return LLILLJJLI;
        }

        static {
            a aVar = new a("FAILED", 0);
            FAILED = aVar;
            a aVar2 = new a("FULL", 1);
            FULL = aVar2;
            a aVar3 = new a("HISTORY", 2);
            HISTORY = aVar3;
            a aVar4 = new a("NEW", 3);
            NEW = aVar4;
            a aVar5 = new a("DELETE", 4);
            DELETE = aVar5;
            a aVar6 = new a("SYNC_COMPLETE", 5);
            SYNC_COMPLETE = aVar6;
            a aVar7 = new a("PULL_NEW_COMPLETE", 6);
            PULL_NEW_COMPLETE = aVar7;
            a aVar8 = new a("UPDATE", 7);
            UPDATE = aVar8;
            a aVar9 = new a("SWITCH", 8);
            SWITCH = aVar9;
            a aVar10 = new a("SWITCH_RESPONSE", 9);
            SWITCH_RESPONSE = aVar10;
            a aVar11 = new a("SELECT_RESPONSE", 10);
            SELECT_RESPONSE = aVar11;
            a aVar12 = new a("GUIDE", 11);
            GUIDE = aVar12;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
            LL = aVarArr;
            LLILLJJLI = new C2254308sP(aVarArr);
        }

        public static a[] values() {
            return (a[]) LL.clone();
        }

        public static a valueOf(String str) {
            return (a) C08FF.LIZ(a.class, str);
        }

        public a(String str, int i) {
        }
    }

    public w2() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return this.LIZ == w2Var.LIZ && Intrinsics.LJFF(this.LIZIZ, w2Var.LIZIZ) && this.LIZJ == w2Var.LIZJ && this.LIZLLL == w2Var.LIZLLL && this.LJ == w2Var.LJ && this.LJFF == w2Var.LJFF && Intrinsics.LJFF(this.LJI, w2Var.LJI) && Intrinsics.LJFF(this.LJII, w2Var.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, w2Var.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31;
        Exception exc = this.LJI;
        int iHashCode2 = (iHashCode + (exc == null ? 0 : exc.hashCode())) * 31;
        d8 d8Var = this.LJII;
        return ((iHashCode2 + (d8Var != null ? d8Var.hashCode() : 0)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageListUpdate(updateType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messages=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loadingMore=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loadFailed=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", e=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", retryMessageConfig=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", commonInfo=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w2(a aVar, List list, boolean z, boolean z2, boolean z3, int i, Exception exc, d8 d8Var, k9 k9Var, int i2) {
        z = (i2 & 4) != 0 ? true : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        z3 = (i2 & 16) != 0 ? false : z3;
        i = (i2 & 32) != 0 ? 0 : i;
        p2 p2Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        exc = (i2 & 64) != 0 ? null : exc;
        d8Var = (i2 & 128) != 0 ? null : d8Var;
        k9Var = (i2 & 256) != 0 ? new k9(p2Var, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 127) : k9Var;
        this.LIZ = aVar;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = i;
        this.LJI = exc;
        this.LJII = d8Var;
        this.LJIIIIZZ = k9Var;
    }
}
