package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C09AY;
import X.C0XQ7;
import X.C1161920gLG;
import X.C13LC;
import X.C1558520qew;
import X.C1801410wyh;
import X.C1857170yQd;
import X.C1860520yW2;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C189200o6;
import X.C2188811AlT;
import X.C2276411E8h;
import X.C631370Opb;
import X.InterfaceC1848620yCq;
import X.InterfaceC1856750yPx;
import X.InterfaceC634840OvC;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.keva.Keva;
import com.bytedance.pitaya.api.feature.store.PTYFeatureStoreInstance;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailContentAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendBaseAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class AwS176S1100000_27 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS176S1100000_27 r6) {
        /*
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailContentAssem r0 = (com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailContentAssem) r0
            com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM r0 = r0.lp()
            java.lang.String r1 = "click"
            java.lang.String r2 = r6.s0
            r3 = 0
            r4 = 0
            r5 = 12
            com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM.zQ2(r0, r1, r2, r3, r4, r5)
            java.lang.Object r3 = r6.l1
            com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailContentAssem r3 = (com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.assem.CourseDetailContentAssem) r3
            X.0xty r0 = r3.kp()
            if (r0 == 0) goto L45
            boolean r0 = r0.LLIZLLLIL
            r1 = 1
            if (r0 != r1) goto L45
        L22:
            com.bytedance.android.livesdk.livesetting.pcs.PcsCoursePageFaqSetting r0 = com.bytedance.android.livesdk.livesetting.pcs.PcsCoursePageFaqSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.pcs.PcsCourseFaqSchemaMap r0 = r0.getValue()
            if (r1 == 0) goto L40
            java.lang.String r2 = r0.getCourseDetailFullScreenFaq()
        L2e:
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r1 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r1
            android.content.Context r0 = r3.getContext()
            r1.handle(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            java.lang.String r2 = r0.getCourseDetailFaq()
            goto L2e
        L45:
            r1 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS176S1100000_27.invoke$0(kotlin.jvm.internal.AwS176S1100000_27):java.lang.Object");
    }

    public static final Object invoke$1(AwS176S1100000_27 awS176S1100000_27) throws JSONException {
        ((JSONObject) awS176S1100000_27.l1).putOpt("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        PTYFeatureStoreInstance.INSTANCE.getFeatureStore().addFeature(awS176S1100000_27.s0, (JSONObject) awS176S1100000_27.l1, "global_live_basic");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS176S1100000_27 awS176S1100000_27) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1857170yQd) C631370Opb.LIZ((TakoSendBaseAssem) awS176S1100000_27.l1)).LL.LLILLL.uuid);
        sbLIZ.append('_');
        sbLIZ.append(awS176S1100000_27.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS176S1100000_27 awS176S1100000_27) {
        Context context;
        IHostHybrid iHostHybrid = (IHostHybrid) C1161920gLG.LIZJ(IHostHybrid.class);
        if (iHostHybrid != null) {
            String str = awS176S1100000_27.s0;
            InterfaceC634840OvC interfaceC634840OvC = ((C1801410wyh) awS176S1100000_27.l1).IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            iHostHybrid.prefetchSchema(str, context);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS176S1100000_27 awS176S1100000_27) {
        InterfaceC1848620yCq interfaceC1848620yCq = (InterfaceC1848620yCq) awS176S1100000_27.l1;
        try {
            C2276411E8h.LIZIZ.LJI(4, "explore_perf", interfaceC1848620yCq.getEventName(), awS176S1100000_27.s0);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS176S1100000_27 awS176S1100000_27) throws JSONException {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strLJJIJLIJ = null;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL((TakoAnswerImageListItemAssem) awS176S1100000_27.l1), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            TakoAnswerImageListItemAssem takoAnswerImageListItemAssem = (TakoAnswerImageListItemAssem) awS176S1100000_27.l1;
            String str = awS176S1100000_27.s0;
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LL;
            String str3 = c1863850ybP.LLILLJJLI;
            String str4 = c1863850ybP.LLILZIL;
            InterfaceC1856750yPx interfaceC1856750yPx = takoAnswerImageListItemAssem.LLLFF;
            if (interfaceC1856750yPx != null) {
                strLJJIJLIJ = interfaceC1856750yPx.LJJIJLIJ();
            }
            String str5 = "";
            if (strLJJIJLIJ == null) {
                strLJJIJLIJ = "";
            }
            String str6 = c1863850ybP.LLILZLL;
            if (str6 != null) {
                str5 = str6;
            }
            C1862330yYx.LJLJI(c1862330yYx, str2, str3, str4, "image_to_video_popup", strLJJIJLIJ, null, null, null, null, null, null, null, str, str5, c1863850ybP.LLIZ, 36832);
        }
        C1860520yW2.LIZ.getClass();
        int iLIZLLL = C1860520yW2.LIZLLL() + 1;
        Keva kevaLJIIL = C1860520yW2.LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_image_click_to_generate_video_show_tips_count_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        kevaLJIIL.storeInt(C2188811AlT.LIZIZ(sbLIZ), iLIZLLL);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS176S1100000_27(InterfaceC1848620yCq interfaceC1848620yCq, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC1848620yCq;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS176S1100000_27(CourseDetailContentAssem courseDetailContentAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = courseDetailContentAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS176S1100000_27(TakoAnswerImageListItemAssem takoAnswerImageListItemAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = takoAnswerImageListItemAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS176S1100000_27(TakoSendBaseAssem takoSendBaseAssem, TakoSendBaseAssem<C1857170yQd> takoSendBaseAssem2, String str) {
        super(0);
        this.$t = str;
        this.l1 = takoSendBaseAssem;
        this.s0 = takoSendBaseAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS176S1100000_27(String str, C1801410wyh c1801410wyh, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1801410wyh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS176S1100000_27(String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.l1 = jSONObject;
        this.s0 = str;
    }
}
