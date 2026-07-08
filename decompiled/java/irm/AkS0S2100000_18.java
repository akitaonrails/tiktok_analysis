package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1189060h32;
import X.C1191580h76;
import X.C2344009Gk;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class AkS0S2100000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS0S2100000_18 akS0S2100000_18, View view) {
        C1191580h76 c1191580h76 = C1191580h76.LIZ;
        String str = akS0S2100000_18.s0;
        Map map = (Map) ((PoiGalleryActivity) akS0S2100000_18.l2).LLJJJJLIIL.getValue();
        PageFinder pageFinder = (PageFinder) ((PoiGalleryActivity) akS0S2100000_18.l2).LLJLIL.getValue();
        c1191580h76.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1189060h32.LJJIFFI(c2344009Gk, "bcm_chain", str);
        for (Map.Entry entry : map.entrySet()) {
            C1189060h32.LJJIFFI(c2344009Gk, (String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map2 = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_inner_detail_page_btn_click", map2, c1185050gwZ);
        SmartRouter.buildRoute((PoiGalleryActivity) akS0S2100000_18.l2, akS0S2100000_18.s1).open();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138 A[PHI: r7
      0x0138: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v6 java.lang.String), (r7v6 java.lang.String) binds: [B:45:0x0134, B:19:0x0095, B:21:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d A[PHI: r7 r14
      0x013d: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v5 java.lang.String) binds: [B:48:0x0139, B:24:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v4 java.lang.String) binds: [B:48:0x0139, B:24:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(irm.AkS0S2100000_18 r20, android.view.View r21) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS0S2100000_18.LIZ$1(irm.AkS0S2100000_18, android.view.View):void");
    }

    public AkS0S2100000_18(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
