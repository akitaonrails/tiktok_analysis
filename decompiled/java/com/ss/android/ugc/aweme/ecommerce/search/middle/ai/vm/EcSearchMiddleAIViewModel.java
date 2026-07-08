package com.ss.android.ugc.aweme.ecommerce.search.middle.ai.vm;

import X.AnonymousClass0956;
import X.C01GW;
import X.C13LP;
import X.C1935207i2;
import X.C19719612Di;
import X.C23250099c;
import X.C452501pT;
import X.C674260Qca;
import X.C674270Qcb;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchAIHistoryWord;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS61S1000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchMiddleAIViewModel extends ViewModel {
    public final C01GW LL = C1935207i2.LIZ(AFwS196S0000000_10.get$arr$(81));
    public final C01GW LLILLJJLI = C1935207i2.LIZ(AFwS196S0000000_10.get$arr$(80));
    public final C01GW LLILLL = C1935207i2.LIZ(AFwS196S0000000_10.get$arr$(79));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(78));
    public AnonymousClass0956 LLILZIL;

    public final C674270Qcb vQ2() {
        return (C674270Qcb) this.LLILZ.getValue();
    }

    public final List<EcSearchAIHistoryWord> Oe1(String str) {
        C674270Qcb c674270QcbVQ2 = vQ2();
        EcSearchAIHistoryWord ecSearchAIHistoryWord = new EcSearchAIHistoryWord(str);
        c674270QcbVQ2.getClass();
        String str2 = ecSearchAIHistoryWord.word;
        ArrayList arrayList = new ArrayList(c674270QcbVQ2.LIZJ);
        C19719612Di.LJJIIJ(arrayList, new AwS61S1000000_10(str2, 21), true);
        ListProtector.add(arrayList, 0, ecSearchAIHistoryWord);
        c674270QcbVQ2.LIZJ = C13LP.LL(arrayList, 20);
        C23250099c.LIZLLL(c674270QcbVQ2.LIZ, null, null, new C674260Qca(c674270QcbVQ2, null), 3);
        return c674270QcbVQ2.LIZJ;
    }
}
