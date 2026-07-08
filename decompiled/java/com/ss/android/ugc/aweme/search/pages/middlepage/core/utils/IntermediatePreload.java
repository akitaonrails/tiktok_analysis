package com.ss.android.ugc.aweme.search.pages.middlepage.core.utils;

import X.C0BRR;
import X.C0PS4;
import X.C0PYE;
import X.C0Q2M;
import X.C0Q47;
import X.C0Q8L;
import X.C0QEE;
import X.C0QER;
import X.C0QF6;
import X.C0QIP;
import X.C0QJN;
import X.C0QPJ;
import X.C1150504el;
import X.C11NZ;
import X.C1203000hPW;
import X.C123100dR;
import X.C1499810p8F;
import X.C1741890vQh;
import X.C1ER1;
import X.C2097608Jq;
import X.C2452309jF;
import X.C271100Ajs;
import X.C293280BeY;
import X.C645950PVh;
import X.C650940Pg4;
import X.C650960Pg6;
import X.C661140PwW;
import X.C664000Q2s;
import X.C664030Q2v;
import X.C667700QGy;
import X.C667720QHa;
import X.C667750QHd;
import X.C667760QHe;
import X.C667770QHf;
import X.C667800QHi;
import X.C669560QOc;
import X.C670650QSh;
import X.C672110QXx;
import X.C786410Ut5;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import android.util.LruCache;
import com.bytedance.ies.powerpreload.task.TaskTraceMetric;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.SuggestWordsApi;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class IntermediatePreload implements InterfaceC727570SgN<SuggestWordsApi.SuggestApi, C11NZ<String>> {
    public static long startTime;
    public boolean isFirstRequest = true;
    public static final C0QIP Companion = new C0QIP();
    public static final int $stable = 8;

    public final boolean isFirstRequest() {
        return this.isFirstRequest;
    }

    private final void appendHintHolderByHotWords(C645950PVh c645950PVh) {
        String strLIZIZ = C670650QSh.LIZIZ(C670650QSh.LIZ, false, false, 3);
        if (strLIZIZ.length() > 0) {
            c645950PVh.LJFF = strLIZIZ;
            c645950PVh.LJIIL = C1741890vQh.LJIIIIZZ(C2097608Jq.LJI(new Pair("caption_type", "bubble")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    @Override // X.InterfaceC20153313tL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean enable(android.os.Bundle r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 == 0) goto L53
            java.lang.String r0 = "search_enter_param"
            java.io.Serializable r5 = r8.getSerializable(r0)
        L9:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r5 = (com.ss.android.ugc.aweme.search.model.SearchResultParam) r5
            if (r5 == 0) goto L51
            X.0QER r4 = r5.getSearchEnterParam()
        L11:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "IntermediatePreload is enable:"
            r3.append(r0)
            if (r5 == 0) goto L4f
            java.lang.String r0 = r5.getKeyword()
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 == 0) goto L4d
            if (r4 == 0) goto L4b
            java.lang.String r1 = r4.getEnterSearchFrom()
        L2d:
            java.lang.String r0 = "mall"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L4d
            r0 = 1
        L36:
            r3.append(r0)
            X.C2188811AlT.LIZIZ(r3)
            if (r5 == 0) goto L49
            java.lang.String r0 = r5.getKeyword()
        L42:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L55
            return r2
        L49:
            r0 = r6
            goto L42
        L4b:
            r1 = r6
            goto L2d
        L4d:
            r0 = 0
            goto L36
        L4f:
            r0 = r6
            goto L20
        L51:
            r4 = r6
            goto L11
        L53:
            r5 = r6
            goto L9
        L55:
            X.01GW r0 = X.C0BC8.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
            if (r4 == 0) goto L69
            java.lang.String r6 = r4.getEnterType()
        L69:
            boolean r0 = X.C0BC8.LIZ(r6)
            if (r0 == 0) goto L70
            return r2
        L70:
            X.0QGn r0 = X.C667590QGn.LIZ
            r0.getClass()
            boolean r0 = X.C293280BeY.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.middlepage.core.utils.IntermediatePreload.enable(android.os.Bundle):boolean");
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, C1ER1.LIZIZ.LJIILJJIL(), null, 0, false, 25);
    }

    public final void setFirstRequest(boolean z) {
        this.isFirstRequest = z;
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    private final void appendHintHolderIfHave(C645950PVh c645950PVh, C0QER c0qer) {
        if (c0qer == null) {
            return;
        }
        boolean zLJFF = Intrinsics.LJFF("1", c0qer.obtainLogData("is_from_video"));
        boolean zLIZ = C123100dR.LIZ(c0qer.getEnterFromMusicId());
        if ((zLJFF || zLIZ) && this.isFirstRequest) {
            this.isFirstRequest = false;
            c645950PVh.LJFF = c0qer.getSearchHint();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<String> preload2(Bundle bundle, Function1<? super Class<SuggestWordsApi.SuggestApi>, ? extends SuggestWordsApi.SuggestApi> function1) {
        Serializable serializable;
        C0PS4 c0ps4;
        Serializable serializable2;
        C0QER searchEnterParam;
        String groupId;
        String enterSearchFrom;
        if (bundle != null) {
            LruCache<String, TaskTraceMetric> lruCache = C1203000hPW.LIZ;
            C786410Ut5.LJJJI("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", "intermediate_preload", bundle);
        }
        String groupId2 = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("search_global_param");
        } else {
            serializable = null;
        }
        if (serializable instanceof C0PS4) {
            c0ps4 = (C0PS4) serializable;
        } else {
            c0ps4 = null;
        }
        if (bundle != null) {
            serializable2 = bundle.getSerializable("search_enter_param");
        } else {
            serializable2 = null;
        }
        SearchResultParam searchResultParam = (SearchResultParam) serializable2;
        if (searchResultParam != null) {
            searchEnterParam = searchResultParam.getSearchEnterParam();
        } else {
            searchEnterParam = null;
        }
        C0QF6 c0qf6LJIJI = C0QPJ.LJIJI(null);
        List<SearchHistory> listLJIIL = c0qf6LJIJI.LJIIL(C0QPJ.LJIJJLI());
        C0QEE.LIZ.getClass();
        C0QEE.LJI(listLJIIL);
        if (C2452309jF.LIZ()) {
            C0QEE.LJII(c0qf6LJIJI.LJ(C0QPJ.LJIJJLI(), true));
        }
        String str = "";
        if (searchEnterParam == null || (groupId = searchEnterParam.getGroupId()) == null) {
            groupId = "";
        }
        C0Q2M c0q2m = C0Q2M.LIZ;
        if (searchEnterParam != null) {
            groupId2 = searchEnterParam.getGroupId();
            enterSearchFrom = searchEnterParam.getEnterSearchFrom();
        } else {
            enterSearchFrom = null;
        }
        c0q2m.getClass();
        String strLJIIJ = C0Q2M.LJIIJ(groupId2, enterSearchFrom);
        if (strLJIIJ != null) {
            str = strLJIIJ;
        }
        Integer num = null;
        if (!((Boolean) C271100Ajs.LIZ.getValue()).booleanValue()) {
            groupId = str;
        }
        C667750QHd c667750QHd = new C667750QHd(new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, groupId, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)));
        if (c0ps4 != null) {
            c667750QHd.LIZ(new C667800QHi(System.currentTimeMillis() - C1150504el.LIZ().LJJII, System.currentTimeMillis(), c0ps4.blankPageEnterForm, c0ps4.blankPageEnterMethod));
        }
        C645950PVh c645950PVh = new C645950PVh();
        c645950PVh.LIZ = "100011";
        c645950PVh.LIZIZ = str;
        c645950PVh.LJ = Integer.valueOf(C293280BeY.LIZ(AFwS196S0000000_10.get$arr$(270), AFwS196S0000000_10.get$arr$(271)));
        appendHintHolderIfHave(c645950PVh, searchEnterParam);
        appendHintHolderByHotWords(c645950PVh);
        c667750QHd.LIZ(new C667720QHa(true));
        c645950PVh.LJI = C786410Ut5.J3(C667750QHd.LJI(null, (C667770QHf) c667750QHd.LIZIZ().LIZIZ(), (C667760QHe) ((C0Q47) c667750QHd.LJIIIIZZ.getValue()).LIZIZ()));
        c645950PVh.LJII = Integer.valueOf(c667750QHd.LIZLLL() ? 1 : 0);
        c645950PVh.LJIIIIZZ = ((C667700QGy) c667750QHd.LIZJ().LIZIZ()).LIZIZ();
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        }
        c645950PVh.LJIIIZ = num;
        startTime = System.currentTimeMillis();
        return function1.invoke(SuggestWordsApi.SuggestApi.class).getSuggestWordsWithRawStringSingle(c645950PVh.LIZ, c645950PVh.LIZIZ, null, c645950PVh.LJFF, c645950PVh.LJ, null, C0QEE.LJFF(false), C1ER1.LIZIZ.LLLFFI(true, false), c645950PVh.LJI, c645950PVh.LJII, c645950PVh.LJIIIIZZ, "", "", "", "qrec", c645950PVh.LJIIIZ, c645950PVh.LJIIL, Integer.valueOf(C0BRR.LIZ()), C661140PwW.LIZIZ());
    }
}
