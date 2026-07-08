package com.ss.android.ugc.aweme.comment.exposedcmt;

import X.C01GW;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C729780Sjw;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ExposedCommentRepo implements IExposedCommentDataAbility {
    public final C01GW LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(51));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(53));
    public final Set<String> LLILLL = new LinkedHashSet();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(52));
    public Boolean LLILZIL;

    @Override // com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility
    public final void tZ0() {
        ((Set) this.LLILLJJLI.getValue()).clear();
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility
    public final Set<String> po0() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility
    public final boolean Lw0(String str) {
        boolean zContains = ((Set) this.LLILLJJLI.getValue()).contains(str);
        if (!zContains) {
            ((Set) this.LLILLJJLI.getValue()).add(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check before request: aid = ");
        sbLIZ.append(str);
        sbLIZ.append(", shouldReq = ");
        boolean z = !zContains;
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility
    public final void Mz0(String str) {
        if (str == null) {
            return;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZ.getValue(), null, null, new C729780Sjw(this, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility
    public final CommentItemList Vz(String str) {
        if (str == null) {
            return null;
        }
        CommentItemList commentItemList = (CommentItemList) ((LinkedHashMap) this.LL.getValue()).get(str);
        synchronized (this) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return commentItemList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    @Override // com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gg1(int r29, final com.ss.android.ugc.aweme.feed.model.Aweme r30, java.lang.String r31, final kotlin.jvm.internal.AwS377S0200000_11 r32) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.exposedcmt.ExposedCommentRepo.gg1(int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, kotlin.jvm.internal.AwS377S0200000_11):void");
    }
}
