package com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo;

import X.C01GW;
import X.C0C64;
import X.C14EU;
import X.C1519280pde;
import X.C15438062q;
import X.C1593970ra7;
import X.C1914170zuZ;
import X.C1914230zuf;
import X.C1914620zvI;
import X.C1914700zvQ;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C484220Iyq;
import X.C696580RUa;
import X.C786410Ut5;
import X.InterfaceC1059280dfi;
import X.InterfaceC1519250pdb;
import X.InterfaceC1914220zue;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntryType;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.whythisvideo.IWhyThisVideoService;
import com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.AdjustableWhyThisVideoManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes29.dex */
public final class AdjustableWhyThisVideoManager implements IWhyThisVideoService {
    public static final /* synthetic */ int LJIIIZ = 0;
    public Context LIZ;
    public Aweme LIZIZ;
    public BaseSharePackage LIZJ;
    public RecReasonsStruct LIZLLL;
    public SparkContext LJFF;
    public String LJ = "share";
    public final C01GW LJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(431));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 626));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(432));

    public final C1914170zuZ LIZLLL() {
        return (C1914170zuZ) this.LJI.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.whythisvideo.IWhyThisVideoService
    public final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_algo_refresh_on_wtv", true, false);
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.whythisvideo.IWhyThisVideoService
    public final void LIZ(Context context) {
        this.LIZ = context;
        this.LIZLLL = new RecReasonsStruct(Collections.singletonList(new RecReasonEntry(RecReasonEntryType.ALGO_REFRESH.getType(), "", "")), null, null, null, null, null, null, null);
        LJ(false, true);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        try {
            if (TextUtils.equals("videoReportSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                if (LIZLLL() != null) {
                    C1914170zuZ.LIZ();
                }
            } else if (TextUtils.equals("algo_reset_feedback_sheet_dismiss", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                SparkContext sparkContext = this.LJFF;
                if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
                    interfaceC1059280dfiLJJIJLIJ.close();
                }
                this.LJFF = null;
                if (LIZLLL() != null) {
                    C1914170zuZ.LIZ();
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJFF(String str, String str2) {
        C20684815ws.LJIILLIIL("refresh_in_progress_halfsheet_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str2), new Pair("action", str)));
    }

    public final void LJ(boolean z, boolean z2) {
        boolean z3;
        final InterfaceC1914220zue c1914230zuf;
        final String str;
        Context context = this.LIZ;
        int i = 0;
        if (context == null) {
            C20684815ws.LJIILLIIL("why_this_post_runtime_issue", C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LJ), new Pair("reasons", "context_missing")));
            return;
        }
        RecReasonsStruct recReasonsStruct = this.LIZLLL;
        if (recReasonsStruct == null) {
            C20684815ws.LJIILLIIL("why_this_post_runtime_issue", C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LJ), new Pair("reasons", "reasons_missing")));
            return;
        }
        C1914620zvI c1914620zvI = new C1914620zvI(context, recReasonsStruct, z, z2);
        C1519280pde c1519280pde = InterfaceC1914220zue.LIZ;
        C1914700zvQ c1914700zvQ = (C1914700zvQ) this.LJII.getValue();
        C1593970ra7.LIZ.getClass();
        C696580RUa.LIZ.getClass();
        if (C696580RUa.LIZ() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        InterfaceC1914220zue interfaceC1914220zue = null;
        if (z3) {
            if (z2) {
                str = "refreshing_feed_toast";
            } else {
                str = "why_this_video";
            }
            interfaceC1914220zue = new InterfaceC1914220zue() { // from class: X.0zvN
                @Override // X.InterfaceC1914220zue
                public final void LIZIZ(String str2, C1519370pdn c1519370pdn) {
                }

                @Override // X.InterfaceC1914220zue
                public final void LIZJ(Boolean bool, String str2) {
                }

                @Override // X.InterfaceC1914220zue
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1914220zue
                public final void LIZ(C1519370pdn c1519370pdn) {
                    AdjustableWhyThisVideoManager adjustableWhyThisVideoManager = this.LIZIZ;
                    String str2 = str;
                    adjustableWhyThisVideoManager.getClass();
                    AdjustableWhyThisVideoManager.LJFF("close", str2);
                }

                @Override // X.InterfaceC1914220zue
                public final void LJFF(C1519370pdn c1519370pdn) {
                    List<RecReasonEntry> list;
                    AdjustableWhyThisVideoManager adjustableWhyThisVideoManager = this.LIZIZ;
                    String str2 = str;
                    RecReasonsStruct recReasonsStruct2 = adjustableWhyThisVideoManager.LIZLLL;
                    if (recReasonsStruct2 != null && (list = recReasonsStruct2.reasons) != null) {
                        Iterator<RecReasonEntry> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().type == RecReasonEntryType.ALGO_REFRESH.getType()) {
                                C20684815ws.LJIILLIIL("refresh_in_progress_halfsheet_show", C2097908Jt.LIZJ(new Pair("enter_from", str2)));
                                return;
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1914220zue
                public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
                    if (Intrinsics.LJFF(universalPopupAction.actionId, "stopRefresh")) {
                        AdjustableWhyThisVideoManager adjustableWhyThisVideoManager = this.LIZIZ;
                        String str2 = str;
                        adjustableWhyThisVideoManager.getClass();
                        AdjustableWhyThisVideoManager.LJFF("stop_refresh", str2);
                        this.LIZIZ.getClass();
                        IAlgoRefreshService iAlgoRefreshService = (IAlgoRefreshService) PluggableExtentionKt.pluggableSpi$default(IAlgoRefreshService.class, false, false, false, 14, null);
                        if (iAlgoRefreshService != null) {
                            iAlgoRefreshService.LIZ();
                        }
                    }
                }
            };
        }
        c1519280pde.getClass();
        if (c1914700zvQ == null && interfaceC1914220zue == null) {
            c1914230zuf = (C1914700zvQ) this.LJII.getValue();
        } else {
            c1914230zuf = new C1914230zuf(c1914700zvQ, interfaceC1914220zue);
        }
        if (LIZLLL() != null) {
            C1914170zuZ.LIZJ(c1914620zvI, context, new InterfaceC1519250pdb() { // from class: X.0zvO
                @Override // X.InterfaceC1519250pdb
                public final InterfaceC1519200pdW LIZ() {
                    return null;
                }

                @Override // X.InterfaceC1519250pdb
                public final Map<String, String> LIZIZ() {
                    return C2097908Jt.LIZJ(new Pair("enter_from", this.LJ));
                }

                @Override // X.InterfaceC1519250pdb
                public final InterfaceC1914220zue LIZJ() {
                    return c1914230zuf;
                }
            });
        }
        String str2 = this.LJ;
        List<RecReasonEntry> list = recReasonsStruct.reasons;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<RecReasonEntry> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().type));
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str2), new Pair("reasons", arrayList.toString()));
        int iMin = Math.min(recReasonsStruct.reasons.size(), 3);
        while (i < iMin) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reason_");
            int i2 = i + 1;
            sbLIZ.append(i2);
            mapLJIIJ.put(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(((Number) ListProtector.get(arrayList, i)).intValue()));
            i = i2;
        }
        C20684815ws.LJIILLIIL("show_why_this_post_reason", mapLJIIJ);
    }

    public static void LJI(int i, long j, boolean z) {
        String str;
        Bundle bundle = new Bundle();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("isSuccess", str, bundle);
        C786410Ut5.LJJJI("service", "/tiktok/pns/why_this_video/validate", bundle);
        C786410Ut5.LJJJI("code", String.valueOf(i), bundle);
        C786410Ut5.LJJJI("duration", String.valueOf(j), bundle);
        C20684815ws.LJIILL("compliance_api_status", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029 A[PHI: r1
      0x0029: PHI (r1v9 java.lang.String) = (r1v8 java.lang.String), (r1v10 java.lang.String) binds: [B:5:0x001f, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.whythisvideo.IWhyThisVideoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r15, com.ss.android.ugc.aweme.feed.model.Aweme r16, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r17, com.ss.android.ugc.aweme.feed.model.RecReasonsStruct r18) {
        /*
            r14 = this;
            r14.LIZ = r15
            r0 = r16
            r14.LIZIZ = r0
            r1 = r17
            r14.LIZJ = r1
            r0 = r18
            r14.LIZLLL = r0
            android.os.Bundle r1 = r1.extras
            java.lang.String r0 = "panel_source"
            java.lang.String r2 = r1.getString(r0)
            r4 = 0
            if (r2 == 0) goto L62
            java.lang.String r1 = "share"
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r1, r4)
            if (r0 != 0) goto L29
            java.lang.String r1 = "long_press"
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r1, r4)
            if (r0 == 0) goto L2a
        L29:
            r2 = r1
        L2a:
            r14.LJ = r2
            com.ss.android.ugc.aweme.feed.model.RecReasonsStruct r0 = r14.LIZLLL
            if (r0 != 0) goto L40
            com.ss.android.ugc.aweme.feed.model.RecReasonsStruct r5 = new com.ss.android.ugc.aweme.feed.model.RecReasonsStruct
            X.13BV r6 = X.C13BV.INSTANCE
            r7 = 0
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.LIZLLL = r5
        L40:
            com.ss.android.ugc.aweme.feed.model.RecReasonsStruct r0 = r14.LIZLLL
            if (r0 == 0) goto L65
            com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.models.WTVValidationRequest r1 = new com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.models.WTVValidationRequest
            r1.<init>(r0)
            long r2 = java.lang.System.currentTimeMillis()
            X.01GW r0 = r14.LJIIIIZZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.api.WhyThisVideoApi r0 = (com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.api.WhyThisVideoApi) r0
            X.0X9S r1 = r0.validateWhyThisVideo(r1)
            X.0zvM r0 = new X.0zvM
            r0.<init>()
            r1.enqueue(r0)
            return
        L62:
            java.lang.String r2 = ""
            goto L2a
        L65:
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            java.lang.String r2 = r14.LJ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_from"
            r1.<init>(r0, r2)
            r3[r4] = r1
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "reasons"
            java.lang.String r0 = "reasons_missing"
            r2.<init>(r1, r0)
            r0 = 1
            r3[r0] = r2
            java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r3)
            java.lang.String r0 = "why_this_post_runtime_issue"
            X.C20684815ws.LJIILLIIL(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "recReasons must be set before calling validateAndShow()"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo.AdjustableWhyThisVideoManager.LIZJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, com.ss.android.ugc.aweme.feed.model.RecReasonsStruct):void");
    }
}
