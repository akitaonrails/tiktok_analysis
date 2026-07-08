package com.ss.android.ugc.aweme.social.thought.ui;

import X.AbstractC848400XPy;
import X.AnonymousClass0951;
import X.C05YD;
import X.C05YW;
import X.C09IC;
import X.C09IR;
import X.C0XQ7;
import X.C1370905Yd;
import X.C1BNE;
import X.C2252331DDr;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class SocialThoughtAuthorPanelVM extends ViewModel {
    public String LL = "";
    public String LLILLJJLI = "";
    public final C05YD<ThoughtInfo> LLILLL;
    public final C2252331DDr LLILZ;

    public SocialThoughtAuthorPanelVM() {
        C05YD<ThoughtInfo> c05ydLIZ;
        AnonymousClass0951 anonymousClass0951LJI;
        ISocialThoughtDataCenterService iSocialThoughtDataCenterService = (ISocialThoughtDataCenterService) PluggableExtentionKt.pluggableSpi$default(ISocialThoughtDataCenterService.class, false, false, false, 14, null);
        if (iSocialThoughtDataCenterService == null || (anonymousClass0951LJI = iSocialThoughtDataCenterService.LJI(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), false)) == null) {
            c05ydLIZ = C1BNE.LIZ(null);
        } else {
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
            C05YW.LIZ.getClass();
            c05ydLIZ = C09IC.LJJIJIL(anonymousClass0951LJI, viewModelScope, C1370905Yd.LIZIZ, null);
        }
        this.LLILLL = c05ydLIZ;
        this.LLILZ = C09IR.LIZIZ(0, 1, null, 5);
    }
}
