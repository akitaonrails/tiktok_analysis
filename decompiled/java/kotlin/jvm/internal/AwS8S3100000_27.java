package kotlin.jvm.internal;

import X.AbstractC1905540zge;
import X.C09AY;
import X.C1227904rF;
import X.C15438062q;
import X.C1697810uHb;
import X.C1862500yZE;
import X.C1AF0;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceLinkItemBridge;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS8S3100000_27 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS8S3100000_27 awS8S3100000_27, Object obj) {
        String strLIZIZ;
        ArrayList arrayList;
        String strLIZIZ2;
        Integer numLJIIJJI;
        String strLIZIZ3;
        String strLIZIZ4;
        List<String> list;
        List list2;
        TakoCarriedUpData takoCarriedUpData = (TakoCarriedUpData) obj;
        takoCarriedUpData.setSendMsgContent(awS8S3100000_27.s0);
        takoCarriedUpData.setSendInteractionType(awS8S3100000_27.s1);
        Uri uri = (Uri) awS8S3100000_27.l3;
        String strLIZIZ5 = null;
        if (uri != null) {
            strLIZIZ = C1862500yZE.LIZIZ(uri, "web_doc_list");
        } else {
            strLIZIZ = null;
        }
        try {
            C1227904rF.LIZ.getClass();
            list2 = (List) C1227904rF.LIZLLL().LJIIIIZZ(strLIZIZ, new AbstractC1905540zge<List<? extends ReferenceLinkItemBridge>>() { // from class: X.0zd6
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZLLL("tako web_doc_list parse error", C2097608Jq.LJI(new Pair("web_doc_list", strLIZIZ)));
        }
        if (list2 != null && (!list2.isEmpty())) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new ReferenceItemBridge(i2, 0, (ReferenceLinkItemBridge) obj2, null));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        Uri uri2 = (Uri) awS8S3100000_27.l3;
        if (uri2 != null) {
            strLIZIZ2 = C1862500yZE.LIZIZ(uri2, "message_content");
        } else {
            strLIZIZ2 = null;
        }
        takoCarriedUpData.setAnswerMsgContent(strLIZIZ2);
        if (arrayList != null && (!arrayList.isEmpty())) {
            numLJIIJJI = 50;
        } else {
            Uri uri3 = (Uri) awS8S3100000_27.l3;
            if (uri3 != null && (strLIZIZ3 = C1862500yZE.LIZIZ(uri3, "card_type")) != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ3);
            } else {
                numLJIIJJI = null;
            }
        }
        takoCarriedUpData.setAnswerCardType(numLJIIJJI);
        takoCarriedUpData.setAnswerReferenceList(arrayList);
        Uri uri4 = (Uri) awS8S3100000_27.l3;
        if (uri4 != null) {
            strLIZIZ4 = C1862500yZE.LIZIZ(uri4, "sug_list");
        } else {
            strLIZIZ4 = null;
        }
        try {
            C1227904rF.LIZ.getClass();
            list = (List) C1227904rF.LIZLLL().LJIIIIZZ(strLIZIZ4, new AbstractC1905540zge<List<? extends String>>() { // from class: X.0zcU
            }.getType());
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LIZLLL("tako sug_list parse error", C2097608Jq.LJI(new Pair("sug_list", strLIZIZ4)));
            list = null;
        }
        takoCarriedUpData.setSugList(list);
        String str = awS8S3100000_27.s2;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-1");
            takoCarriedUpData.setRepeatKey(C2188811AlT.LIZIZ(sbLIZ));
        }
        Uri uri5 = (Uri) awS8S3100000_27.l3;
        if (uri5 != null) {
            strLIZIZ5 = C1862500yZE.LIZIZ(uri5, "type");
        }
        takoCarriedUpData.setEnterActionType(strLIZIZ5);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ad A[PHI: r14
      0x01ad: PHI (r14v2 java.lang.String) = (r14v0 java.lang.String), (r14v3 java.lang.String) binds: [B:31:0x0084, B:29:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS8S3100000_27 r33, java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS8S3100000_27.invoke$1(kotlin.jvm.internal.AwS8S3100000_27, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S3100000_27(Uri uri, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = uri;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S3100000_27(MessageViewModel messageViewModel, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = messageViewModel;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
