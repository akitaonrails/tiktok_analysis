package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C08JS;
import X.C0QEC;
import X.C0XQ7;
import X.C1051660dTQ;
import X.C19EG;
import X.C663340Q0e;
import X.C670690QSl;
import X.C670720QSo;
import X.C679340Qkm;
import X.EnumC663360Q0g;
import X.InterfaceC1210900hcG;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowSearchRSReportPanelMethod extends BaseBridgeMethod {
    public C19EG activity;
    public String groupId;
    public final C663340Q0e helper;
    public String imprId;
    public final String name;
    public String searchId;
    public String searchKeyWord;
    public String wordSource;
    public String wordsContent;
    public int wordsPosition;
    public static final C670720QSo Companion = new Object() { // from class: X.0QSo
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public ShowSearchRSReportPanelMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.searchKeyWord = "";
        this.searchId = "";
        this.wordsContent = "";
        this.imprId = "";
        this.groupId = "";
        this.wordSource = "";
        this.name = "showSearchRSReportPanel";
        this.helper = new C663340Q0e(c1051660dTQ, getName(), EnumC663360Q0g.STABLE);
    }

    private final void mobRelatedSearchReportLaunch(String str) {
        C670690QSl c670690QSl = new C670690QSl();
        c670690QSl.LJIIZILJ("raw_query", this.searchKeyWord);
        c670690QSl.LJIIZILJ("words_content", this.wordsContent);
        c670690QSl.LJJJJL(Integer.valueOf(this.wordsPosition));
        c670690QSl.LJIIZILJ("impr_id", this.imprId);
        c670690QSl.LJIIZILJ("group_id", this.groupId);
        c670690QSl.LJIIZILJ("words_source", this.wordSource);
        c670690QSl.LJFF("feedback_id", str, InterfaceC1210900hcG.LIZ);
        c670690QSl.LJIILJJIL();
    }

    public final void openReportPage(String str) {
        String strLIZLLL;
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "sug_recommend").appendQueryParameter("object_id", this.groupId).appendQueryParameter("owner_id", C0XQ7.LJFF().getCurUserId()).appendQueryParameter("sug_content", this.wordsContent);
        n nVar = new n();
        try {
            nVar.LJJIIJ("raw_query", this.searchKeyWord);
            nVar.LJJIIJ("words_content", this.wordsContent);
            nVar.LJJIII(Integer.valueOf(this.wordsPosition), "words_position");
            nVar.LJJIIJ("impr_id", this.imprId);
            nVar.LJJIIJ("group_id", this.groupId);
            nVar.LJJIIJ("words_source", this.wordSource);
            nVar.LJJIIJ("feedback_id", str);
            strLIZLLL = C08JS.LIZLLL(nVar);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZLLL = "";
        }
        builderAppendQueryParameter.appendQueryParameter("extra", strLIZLLL);
        ComplianceServiceProvider.LJJ().LIZIZ(this.activity, builderAppendQueryParameter);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:6:0x000a, B:8:0x0015, B:10:0x001d, B:11:0x0021, B:13:0x002b, B:14:0x002f, B:19:0x0040, B:22:0x0045, B:24:0x0049, B:27:0x004e, B:29:0x007a, B:31:0x0092, B:32:0x0095, B:34:0x00fa), top: B:39:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:6:0x000a, B:8:0x0015, B:10:0x001d, B:11:0x0021, B:13:0x002b, B:14:0x002f, B:19:0x0040, B:22:0x0045, B:24:0x0049, B:27:0x004e, B:29:0x007a, B:31:0x0092, B:32:0x0095, B:34:0x00fa), top: B:39:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r11, X.InterfaceC1019840ce6 r12) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.ShowSearchRSReportPanelMethod.handle(org.json.JSONObject, X.0ce6):void");
    }

    public final void mobRelatedSearchReportConfirm(String str, String str2) {
        C0QEC c0qec = new C0QEC();
        c0qec.LJIIZILJ("raw_query", this.searchKeyWord);
        c0qec.LJIIZILJ("words_content", this.wordsContent);
        c0qec.LJJJJL(Integer.valueOf(this.wordsPosition));
        c0qec.LJIIZILJ("impr_id", this.imprId);
        c0qec.LJIIZILJ("group_id", this.groupId);
        c0qec.LJIIZILJ("button_type", str);
        c0qec.LJIIZILJ("words_source", this.wordSource);
        c0qec.LJFF("feedback_id", str2, InterfaceC1210900hcG.LIZ);
        c0qec.LJIILJJIL();
    }

    public final void shouldBlockMediaPlay(C19EG c19eg, Fragment fragment, boolean z) {
        ((SearchStateViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchStateViewModel.class)).setShouldBlockMediaPlay(z);
    }
}
