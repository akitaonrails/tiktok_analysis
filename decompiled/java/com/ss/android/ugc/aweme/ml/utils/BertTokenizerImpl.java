package com.ss.android.ugc.aweme.ml.utils;

import X.C018M;
import X.C0T1N;
import X.C0VSJ;
import X.C1337780kuu;
import X.C13LQ;
import X.C1553670qX7;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.api.BertTokenizerService;
import com.tiktok.clientai.android.bytenn.bridge.TokenizerNative;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS232S0300000_23;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class BertTokenizerImpl implements BertTokenizerService {
    public final Map<String, C018M> LIZIZ = new LinkedHashMap();
    public final Keva LIZJ = Keva.getRepo("tars_tokenizer_file_path");
    public boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.ml.api.BertTokenizerService
    public final void LJII() {
        ((LinkedHashMap) this.LIZIZ).clear();
        TokenizerNative.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.BertTokenizerService
    public final void LIZ(Function1<? super File, Unit> function1) {
        LIZLLL(new Pair<>("client_ai_bert_vocab_zip", "vocab.txt"), function1);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.BertTokenizerService
    public final List<Integer> LIZIZ(String str) {
        return LJFF(str, true);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.BertTokenizerService
    public final List LIZJ(int i, List list) {
        int i2;
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 < list.size()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.BertTokenizerService
    public final void LIZLLL(Pair<String, String> pair, Function1<? super File, Unit> function1) {
        try {
            Forest forestLIZ = C0T1N.LIZ();
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.channel = pair.getFirst();
            requestParams.bundle = pair.getSecond();
            requestParams.accessKey = C1553670qX7.LIZ();
            requestParams.waitGeckoUpdate = true;
            forestLIZ.fetchResourceAsync("", requestParams, new AwS232S0300000_23(this, (BertTokenizerImpl) pair, (Pair<String, String>) function1, (Function1<? super File, Unit>) 5));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    @Override // com.ss.android.ugc.aweme.ml.api.BertTokenizerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.Integer> LJFF(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            java.util.Map<java.lang.String, X.018M> r0 = r6.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.String r1 = "client_ai_bert_vocab_zip"
            java.lang.Object r0 = r0.get(r1)
            X.018M r0 = (X.C018M) r0
            if (r0 != 0) goto L6f
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r0 = "vocab.txt"
            r4.<init>(r1, r0)
            com.bytedance.keva.Keva r2 = r6.LIZJ
            java.lang.Object r0 = r4.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ""
            java.lang.String r0 = r2.getString(r0, r1)
            X.0VSJ r5 = new X.0VSJ
            if (r0 == 0) goto L28
            r1 = r0
        L28:
            r5.<init>(r1)
            if (r0 == 0) goto L55
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L55
        L36:
            r3 = 0
            if (r1 == 0) goto L57
            boolean r0 = r5.exists()
            if (r0 == 0) goto L57
            X.018M r2 = new X.018M
            X.C1BWL.LIZ()
            r2.<init>(r5)
            java.util.Map<java.lang.String, X.018M> r1 = r6.LIZIZ
            java.lang.Object r0 = r4.getFirst()
            r1.put(r0, r2)
            java.util.List r3 = r2.LIZ(r7, r8)
            return r3
        L55:
            r1 = 0
            goto L36
        L57:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Object r1 = r4.getFirst()
            java.lang.Object r0 = r4.getSecond()
            r2.<init>(r1, r0)
            kotlin.jvm.internal.AwS389S0200000_23 r1 = new kotlin.jvm.internal.AwS389S0200000_23
            r0 = 11
            r1.<init>(r6, r4, r0)
            r6.LIZLLL(r2, r1)
            return r3
        L6f:
            java.util.List r0 = r0.LIZ(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.utils.BertTokenizerImpl.LJFF(java.lang.String, boolean):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.BertTokenizerService
    public final List LJI(int i, List list) {
        int iIntValue;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < list.size()) {
                iIntValue = ((Number) ListProtector.get(list, i2)).intValue();
            } else {
                iIntValue = 0;
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.BertTokenizerService
    public final List<Integer> LJ(String str, String str2, String str3, boolean z) {
        String str4 = "";
        String string = this.LIZJ.getString(str, "");
        if (string != null) {
            str4 = string;
        }
        C0VSJ c0vsj = new C0VSJ(str4);
        if (!a0.LJJJIL(string) && c0vsj.exists()) {
            if (!this.LIZLLL) {
                Pair<String, String> pair = new Pair<>(str, str2);
                LIZLLL(pair, new AwS369S0200000_3(this, pair, 5));
                this.LIZLLL = true;
            }
            int[] iArrLIZJ = TokenizerNative.LIZ.LIZJ(str, string, str3, z);
            if (iArrLIZJ == null) {
                return null;
            }
            return C13LQ.LJJLJ(iArrLIZJ);
        }
        Pair<String, String> pair2 = new Pair<>(str, str2);
        LIZLLL(pair2, new AwS369S0200000_3(this, pair2, 5));
        return null;
    }
}
