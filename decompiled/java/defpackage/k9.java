package defpackage;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.tako.ccl.model.ActionEntryDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.EntryDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k9 {
    public final String LIZ;
    public final Message LIZIZ;
    public final String LIZJ;
    public final p2 LIZLLL;
    public final String LJ;
    public final EntryDoc LJFF;
    public final Message LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public k9() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9)) {
            return false;
        }
        k9 k9Var = (k9) obj;
        return Intrinsics.LJFF(this.LIZ, k9Var.LIZ) && Intrinsics.LJFF(this.LIZIZ, k9Var.LIZIZ) && Intrinsics.LJFF(this.LIZJ, k9Var.LIZJ) && Intrinsics.LJFF(this.LIZLLL, k9Var.LIZLLL) && Intrinsics.LJFF(this.LJ, k9Var.LJ) && Intrinsics.LJFF(this.LJFF, k9Var.LJFF) && Intrinsics.LJFF(this.LJI, k9Var.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Message message = this.LIZIZ;
        int iHashCode2 = (iHashCode + (message == null ? 0 : message.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        p2 p2Var = this.LIZLLL;
        int iHashCode4 = (((((iHashCode3 + (p2Var == null ? 0 : p2Var.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        Message message2 = this.LJI;
        return iHashCode4 + (message2 != null ? message2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateCommonInfo(logId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", answerMessageId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", takoSessionId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", entryDoc=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", originalMessage=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k9(p2 p2Var, String str, EntryDoc entryDoc, int i) {
        String str2;
        EntryDoc entryDoc2 = entryDoc;
        p2 p2Var2 = p2Var;
        if ((i & 1) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(str2, null, null, (i & 8) != 0 ? null : p2Var2, (i & 16) == 0 ? str : "", (i & 32) != 0 ? new EntryDoc("", new ActionEntryDoc(null, 1, null), "", new HashMap(), 0.0f, 0L, "", "", "", "", "", "", "", null, null, null, null, null) : entryDoc2, null);
    }

    public static k9 LIZ(k9 k9Var, String str, Message message, String str2, Message message2, int i) {
        p2 p2Var;
        String str3;
        Message message3 = message2;
        String str4 = str2;
        Message message4 = message;
        String str5 = str;
        if ((i & 1) != 0) {
            str5 = k9Var.LIZ;
        }
        if ((i & 2) != 0) {
            message4 = k9Var.LIZIZ;
        }
        if ((i & 4) != 0) {
            str4 = k9Var.LIZJ;
        }
        EntryDoc entryDoc = null;
        if ((i & 8) != 0) {
            p2Var = k9Var.LIZLLL;
        } else {
            p2Var = null;
        }
        if ((i & 16) != 0) {
            str3 = k9Var.LJ;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            entryDoc = k9Var.LJFF;
        }
        if ((i & 64) != 0) {
            message3 = k9Var.LJI;
        }
        return new k9(str5, message4, str4, p2Var, str3, entryDoc, message3);
    }

    public k9(String str, Message message, String str2, p2 p2Var, String str3, EntryDoc entryDoc, Message message2) {
        this.LIZ = str;
        this.LIZIZ = message;
        this.LIZJ = str2;
        this.LIZLLL = p2Var;
        this.LJ = str3;
        this.LJFF = entryDoc;
        this.LJI = message2;
    }
}
