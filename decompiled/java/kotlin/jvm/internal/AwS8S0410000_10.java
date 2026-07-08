package kotlin.jvm.internal;

import X.C09AY;
import X.C0QA9;
import X.C0QAG;
import X.C13BV;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.ImageLoadMoreData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS8S0410000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S0410000_10 awS8S0410000_10, Object obj) {
        LinkedHashMap linkedHashMap;
        int iIntValue;
        int size;
        C0QA9 c0qa9 = (C0QA9) obj;
        ArrayList arrayList = new ArrayList(c0qa9.LLILLL);
        arrayList.addAll((List) awS8S0410000_10.l3);
        ArrayList arrayList2 = new ArrayList(c0qa9.LLILZ);
        List<? extends Map<?, ?>> list = ((ImageLoadMoreData) awS8S0410000_10.l1).validImageListRawData;
        if (list != null) {
            arrayList2.addAll(list);
        }
        Map map = (Map) awS8S0410000_10.l0;
        if (!(map instanceof LinkedHashMap) || (linkedHashMap = (LinkedHashMap) map) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        boolean z = awS8S0410000_10.z4;
        Integer num = ((ImageLoadMoreData) awS8S0410000_10.l1).total;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = c0qa9.LLIZ;
        }
        C0QAG c0qag = c0qa9.LLIZLLLIL;
        Integer num2 = ((SearchLoadMoreV2Response) awS8S0410000_10.l2).offset;
        if (num2 != null) {
            size = num2.intValue();
        } else {
            size = arrayList.size();
        }
        return C0QA9.LIZ(c0qa9, null, false, arrayList, arrayList2, linkedHashMap, z, iIntValue, C0QAG.LIZ(c0qag, size, 0, 14), null, 259);
    }

    public static final Object invoke$1(AwS8S0410000_10 awS8S0410000_10, Object obj) {
        LinkedHashMap linkedHashMap;
        int iIntValue;
        int size;
        C0QA9 c0qa9 = (C0QA9) obj;
        List list = (List) awS8S0410000_10.l0;
        List list2 = ((ImageLoadMoreData) awS8S0410000_10.l1).validImageListRawData;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        Map map = (Map) awS8S0410000_10.l2;
        if (!(map instanceof LinkedHashMap) || (linkedHashMap = (LinkedHashMap) map) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        boolean z = awS8S0410000_10.z4;
        Integer num = ((ImageLoadMoreData) awS8S0410000_10.l1).total;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = c0qa9.LLIZ;
        }
        C0QAG c0qag = c0qa9.LLIZLLLIL;
        Integer num2 = ((SearchLoadMoreV2Response) awS8S0410000_10.l3).offset;
        if (num2 != null) {
            size = num2.intValue();
        } else {
            size = ((List) awS8S0410000_10.l0).size();
        }
        return C0QA9.LIZ(c0qa9, null, true, list, list2, linkedHashMap, z, iIntValue, C0QAG.LIZ(c0qag, size, 0, 14), null, 257);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS8S0410000_10(com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.ImageLoadMoreData r3, com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response r4, java.util.List r5, java.util.Map r6, boolean r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r6
            r1.z4 = r7
            r1.l3 = r4
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l0 = r6
            r1.z4 = r7
            r1.l1 = r3
            r1.l2 = r4
            r1.l3 = r5
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS8S0410000_10.<init>(com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.ImageLoadMoreData, com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response, java.util.List, java.util.Map, boolean, int):void");
    }
}
