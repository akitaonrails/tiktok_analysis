package com.ss.android.ugc.aweme.inbox.bulletin.comment.vm;

import X.AbstractC1387200mCc;
import X.C036E;
import X.C09R9;
import X.C0OTL;
import X.C0OTS;
import X.C0OWY;
import X.C0PEM;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C1906580ziK;
import X.C19EG;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23250099c;
import X.C620930OXb;
import X.C623070OcD;
import X.InterfaceC0148002o;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentActionViewModel extends AssemViewModel<C0OWY> {
    public final C0OTL LL;
    public long LLILLJJLI;
    public long LLILLL;
    public boolean LLILZ;
    public UrlModel LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ = "";
    public Map<String, String> LLJI = C2097608Jq.LJ();
    public final C09R9 LLJIJIL = new C09R9(this, C13LE.LIZ(C623070OcD.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OWY(0);
    }

    public BulletinCommentActionViewModel(C0OTL c0otl) {
        this.LL = c0otl;
    }

    public static void vQ2(BulletinCommentActionViewModel bulletinCommentActionViewModel, Context context, C0OTS c0ots, boolean z, String str, String str2, int i) {
        Activity activityLIZ;
        Activity activityLIZIZ;
        String str3 = str2;
        C0OTS c0ots2 = c0ots;
        String str4 = str;
        boolean z2 = z;
        if ((i & 2) != 0) {
            c0ots2 = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            str4 = "bulletin_board_page";
        }
        if ((i & 16) != 0) {
            str3 = "comment_panel";
        }
        bulletinCommentActionViewModel.getClass();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            } else {
                activityLIZ = null;
            }
            if ((activityLIZ instanceof C19EG) && activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
            }
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(bulletinCommentActionViewModel);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C620930OXb(c0ots2, bulletinCommentActionViewModel, str4, context, z2, str3, null), 2);
    }
}
