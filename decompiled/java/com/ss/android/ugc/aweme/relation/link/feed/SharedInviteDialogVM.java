package com.ss.android.ugc.aweme.relation.link.feed;

import X.C0PEM;
import X.C1233440iCc;
import X.C1242620iRQ;
import X.C13LP;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23053091n;
import X.EnumC1233410iCZ;
import X.InterfaceC1294060jmO;
import X.InterfaceC497601wk;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC1294060jmO
public final class SharedInviteDialogVM extends ViewModel {
    public final InterfaceC497601wk LL;
    public C1242620iRQ LLILLJJLI;
    public final MutableLiveData<Pair<EnumC1233410iCZ, Aweme>> LLILLL;
    public final MutableLiveData LLILZ;
    public Bundle LLILZIL;

    public SharedInviteDialogVM() {
        this(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedInviteDialogVM(int i) {
        this(C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ())));
        C1DFH c1dfh = C0PEM.LIZ;
    }

    public SharedInviteDialogVM(InterfaceC497601wk interfaceC497601wk) {
        this.LL = interfaceC497601wk;
        MutableLiveData<Pair<EnumC1233410iCZ, Aweme>> mutableLiveData = new MutableLiveData<>();
        this.LLILLL = mutableLiveData;
        this.LLILZ = mutableLiveData;
    }

    public static Aweme vQ2(C1233440iCc c1233440iCc, String str) {
        boolean z;
        String strLIZIZ;
        Aweme aweme;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String imprId = null;
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(str);
            sbLIZ.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        BatchDetailList batchDetailListLIZ = C23053091n.LIZ(c1233440iCc.LJIIL, strLIZIZ, null, c1233440iCc.LJIIJ, c1233440iCc.LJIIJJI);
        List<Aweme> list = batchDetailListLIZ.items;
        if (list != null && (aweme = (Aweme) C13LP.LJJJJZI(list)) != null) {
            LogPbBean logPbBean = batchDetailListLIZ.logPbBean;
            if (logPbBean != null) {
                imprId = logPbBean.getImprId();
            }
            aweme.setRequestId(imprId);
            return aweme;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("response can't find target aweme(");
        sbLIZ2.append(str);
        sbLIZ2.append(")! logId: ");
        sbLIZ2.append(batchDetailListLIZ.requestId);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalStateException(strLIZIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(X.C1233440iCc r11, java.lang.String r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM.wQ2(X.0iCc, java.lang.String, X.05Vn):java.lang.Object");
    }
}
