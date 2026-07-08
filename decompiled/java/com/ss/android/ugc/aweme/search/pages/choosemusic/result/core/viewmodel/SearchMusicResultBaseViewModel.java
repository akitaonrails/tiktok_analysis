package com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel;

import X.C15HO;
import X.C15IK;
import X.C679990Qlp;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchMusicResultBaseViewModel extends ViewModel {
    public final C15HO LL = new C15HO("search_music", "", "", C15IK.LIZ);
    public C679990Qlp LLILLJJLI = new C679990Qlp();
    public boolean LLILLL;
    public Map<String, Object> LLILZ;

    public final String vQ2() {
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ()) {
            return "ad_music";
        }
        if (this.LLILLL) {
            return "unlimited_music";
        }
        C679990Qlp c679990Qlp = this.LLILLJJLI;
        return c679990Qlp.LJ != null ? "tab_search" : c679990Qlp.LIZ;
    }
}
