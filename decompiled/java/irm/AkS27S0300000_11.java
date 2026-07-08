package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0DII;
import X.C0SQ1;
import X.C1388190mED;
import X.C1440005kM;
import X.C19EG;
import X.C214878197k;
import X.C453940Hr6;
import X.C631370Opb;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICollabEventTrackingService;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public class AkS27S0300000_11 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS27S0300000_11 akS27S0300000_11, View view) {
        C19EG c19egLIZIZ;
        Context context = ((LinearLayout) akS27S0300000_11.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C1440005kM.LIZ(new C453940Hr6(true, false, 6));
            ((VideoAuthorInfoRelationAssem) akS27S0300000_11.l1).Qp().wQ2(c19egLIZIZ, (Aweme) akS27S0300000_11.l2, AFwS198S0000000_11.get$arr$(352));
        }
        ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
        String str = ((VideoItemParams) C631370Opb.LIZ((VideoAuthorInfoRelationAssem) akS27S0300000_11.l1)).mEventType;
        String authorUid = AwemeExtKt.getAuthorUid((Aweme) akS27S0300000_11.l2);
        String aid = ((Aweme) akS27S0300000_11.l2).getAid();
        if (aid == null) {
            aid = "";
        }
        iCollabEventTrackingServiceLJII.reportCollabAnchor(str, authorUid, aid, ((VideoAuthorInfoRelationAssem) akS27S0300000_11.l1).Tp(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(irm.AkS27S0300000_11 r12, android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS27S0300000_11.LIZ$1(irm.AkS27S0300000_11, android.view.View):void");
    }

    public static final void LIZ$2(AkS27S0300000_11 akS27S0300000_11, View view) {
        String str;
        String authorUid;
        String aid;
        C19EG c19egLIZIZ;
        String str2;
        String str3 = "";
        if (((Aweme) akS27S0300000_11.l0) != null && (c19egLIZIZ = C1388190mED.LIZIZ(((C0DII) akS27S0300000_11.l1).getContext())) != null) {
            C214878197k c214878197k = C214878197k.LIZIZ;
            C0SQ1 c0sq1 = (C0SQ1) akS27S0300000_11.l2;
            if (c0sq1 == null || (str2 = c0sq1.LIZIZ) == null) {
                str2 = "";
            }
            Aweme aweme = (Aweme) akS27S0300000_11.l0;
            ((C0DII) akS27S0300000_11.l1).getClass();
            c214878197k.LJIIJ(str2, c19egLIZIZ, aweme, C0DII.LIZ(aweme), null, "");
        }
        ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
        C0SQ1 c0sq12 = (C0SQ1) akS27S0300000_11.l2;
        if (c0sq12 == null || (str = c0sq12.LIZIZ) == null) {
            str = "";
        }
        Aweme aweme2 = (Aweme) akS27S0300000_11.l0;
        if (aweme2 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
            authorUid = "";
        }
        Aweme aweme3 = (Aweme) akS27S0300000_11.l0;
        if (aweme3 != null && (aid = aweme3.getAid()) != null) {
            str3 = aid;
        }
        C0DII c0dii = (C0DII) akS27S0300000_11.l1;
        Aweme aweme4 = (Aweme) akS27S0300000_11.l0;
        c0dii.getClass();
        iCollabEventTrackingServiceLJII.reportCollabAnchor(str, authorUid, str3, C0DII.LIZ(aweme4), false);
    }

    public AkS27S0300000_11(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
