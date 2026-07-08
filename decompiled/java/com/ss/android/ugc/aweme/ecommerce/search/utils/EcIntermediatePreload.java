package com.ss.android.ugc.aweme.ecommerce.search.utils;

import X.C0QER;
import X.C11NZ;
import X.C1499810p8F;
import X.C671380QVc;
import X.C671400QVe;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class EcIntermediatePreload implements InterfaceC727570SgN<EcSuggestWordsApi.SuggestApi, C11NZ<String>> {
    public static String ecomUserActions;
    public static boolean hasPreloading;
    public static String suggestPreResponseStr;
    public boolean isFirstRequest = true;
    public static final C671400QVe Companion = new C671400QVe();
    public static final int $stable = 8;

    public final boolean isFirstRequest() {
        return this.isFirstRequest;
    }

    private final String obtainBusinessId(C0QER c0qer) {
        ECSearchEntranceData ecSearchEntranceData;
        String stringStrategy;
        if (c0qer == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || (stringStrategy = ecSearchEntranceData.getStringStrategy("middle_guess_business_id")) == null) {
            return "100011";
        }
        return stringStrategy;
    }

    private final String obtainReqSource(C0QER c0qer) {
        ECSearchEntranceData ecSearchEntranceData;
        String stringStrategy;
        if (c0qer == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || (stringStrategy = ecSearchEntranceData.getStringStrategy("middle_req_source")) == null) {
            return "";
        }
        return stringStrategy;
    }

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        Serializable serializable;
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        String keyword = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("search_enter_param");
        } else {
            serializable = null;
        }
        SearchResultParam searchResultParam = (SearchResultParam) serializable;
        if (searchResultParam != null) {
            searchEnterParam = searchResultParam.getSearchEnterParam();
            keyword = searchResultParam.getKeyword();
        } else {
            searchEnterParam = null;
        }
        if (!TextUtils.isEmpty(keyword) || searchEnterParam == null || (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) == null || !ecSearchEntranceData.getBooleanStrategy("middle_request_preload")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 0, false, 29);
    }

    public final void setFirstRequest(boolean z) {
        this.isFirstRequest = z;
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    private final void appendHintHolderIfHave(C671380QVc c671380QVc, C0QER c0qer) {
        ECSearchEntranceData ecSearchEntranceData;
        if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("entrance_hint_word_in_top_once") && this.isFirstRequest) {
            this.isFirstRequest = false;
            c671380QVc.LJFF = c0qer.getSearchHint();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Can't wrap try/catch for region: R(47:0|2|(1:4)|5|(1:7)(1:137)|8|(1:10)(1:136)|(1:12)(1:135)|13|(1:15)(1:134)|(37:17|(1:19)|20|(1:22)|23|(1:131)(1:27)|28|(1:(2:(1:32)(1:122)|33)(1:123))(4:124|(1:126)(1:130)|127|(1:129))|34|(11:98|(1:102)|103|(1:107)|108|(1:112)|113|(1:115)(1:121)|116|(1:118)(1:120)|119)(11:38|(1:40)(1:97)|41|(1:43)(1:96)|44|(1:46)(1:95)|47|(1:49)(1:94)|50|(1:52)(1:93)|53)|54|(1:56)(1:(1:92))|57|(1:61)|62|(1:66)|67|(1:71)|72|(1:74)(1:88)|75|(1:77)(1:87)|78|(1:80)(1:86)|81|(1:83)(1:85)|84|152|138|(1:140)|141|144|(1:146)|147|(1:149)|150|151)(1:132)|133|20|(0)|23|(2:25|131)(0)|28|(0)(0)|34|(3:36|98|(4:100|102|103|(4:105|107|108|(7:110|112|113|(0)(0)|116|(0)(0)|119)(0))(0))(0))(0)|54|(0)(0)|57|(2:59|61)(0)|62|(2:64|66)(0)|67|(2:69|71)(0)|72|(0)(0)|75|(0)(0)|78|(0)(0)|81|(0)(0)|84|152|138|(0)|141|144|(0)|147|(0)|150|151) */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x033d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x033e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r1 = new X.C098200Yq(r0);
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0330 A[Catch: all -> 0x033d, TryCatch #0 {all -> 0x033d, blocks: (B:138:0x0322, B:140:0x0330, B:141:0x0335), top: B:152:0x0322 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0280  */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C11NZ<java.lang.String> preload2(android.os.Bundle r63, kotlin.jvm.functions.Function1<? super java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi.SuggestApi>, ? extends com.ss.android.ugc.aweme.ecommerce.search.suggest.api.EcSuggestWordsApi.SuggestApi> r64) {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.utils.EcIntermediatePreload.preload2(android.os.Bundle, kotlin.jvm.functions.Function1):X.11NZ");
    }
}
