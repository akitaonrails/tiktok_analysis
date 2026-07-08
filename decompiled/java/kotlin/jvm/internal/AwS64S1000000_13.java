package kotlin.jvm.internal;

import X.C09AY;
import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C807000VlC;
import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AwS64S1000000_13 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S1000000_13(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS64S1000000_13 awS64S1000000_13, Object obj) {
        WebView webView = new WebView((Context) obj);
        String str = awS64S1000000_13.s0;
        C786410Ut5.te(webView, new WebViewClient());
        C786410Ut5.ue(webView, str);
        return webView;
    }

    public static final Object invoke$1(AwS64S1000000_13 awS64S1000000_13, Object obj) throws JSONException {
        int length;
        ((Number) obj).longValue();
        C0VSJ c0vsj = new C0VSJ(awS64S1000000_13.s0);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles != null) {
                length = fileArrListFiles.length;
            } else {
                length = -1;
            }
        } else {
            length = -2;
        }
        C807000VlC c807000VlC = C807000VlC.LIZ;
        JSONObject jSONObject = new JSONObject();
        String str = awS64S1000000_13.s0;
        jSONObject.put("t_biz", "trace_log");
        jSONObject.put("t_m_cgy", "f_size");
        jSONObject.put("t_s_cgy", String.valueOf(length));
        c807000VlC.getClass();
        jSONObject.put("t_sc", C807000VlC.LIZIZ(str));
        C807000VlC.LIZLLL(jSONObject);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS64S1000000_13 awS64S1000000_13, Object obj) {
        Pair pair = (Pair) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("('");
        sbLIZ.append(awS64S1000000_13.s0);
        sbLIZ.append("', '");
        sbLIZ.append((String) pair.getFirst());
        sbLIZ.append("', '");
        sbLIZ.append((String) pair.getSecond());
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS64S1000000_13 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel r4 = (com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.aweme
            r2 = 0
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L35
            java.lang.String r1 = r0.getUid()
        L11:
            java.lang.String r0 = r3.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L33
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel r0 = r4.repostItem
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.reposter
            if (r0 == 0) goto L25
            java.lang.String r2 = r0.getUid()
        L25:
            java.lang.String r0 = r3.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L33
            r0 = 0
        L2e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L33:
            r0 = 1
            goto L2e
        L35:
            r1 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS64S1000000_13.invoke$3(kotlin.jvm.internal.AwS64S1000000_13, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS64S1000000_13 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel r4 = (com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.aweme
            r2 = 0
            if (r0 == 0) goto L2f
            java.lang.String r1 = r0.getAid()
        Lb:
            java.lang.String r0 = r3.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L2d
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel r0 = r4.repostItem
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.repostedAweme
            if (r0 == 0) goto L1f
            java.lang.String r2 = r0.getAid()
        L1f:
            java.lang.String r0 = r3.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L2d
            r0 = 0
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2d:
            r0 = 1
            goto L28
        L2f:
            r1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS64S1000000_13.invoke$4(kotlin.jvm.internal.AwS64S1000000_13, java.lang.Object):java.lang.Object");
    }
}
