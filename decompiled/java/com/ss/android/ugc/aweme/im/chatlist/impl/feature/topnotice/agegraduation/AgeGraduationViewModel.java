package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation;

import X.C054G;
import X.C0I0B;
import X.C0PEM;
import X.C1231704rr;
import X.C1477105qL;
import X.C15557067f;
import X.C15558067g;
import X.C1734106qh;
import X.C1770006wU;
import X.C1DFB;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C342440Dbe;
import X.C461720I8s;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class AgeGraduationViewModel extends ViewModel {
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final TikTokImApi LLILLL;
    public volatile boolean LLILZ;
    public final C054G LLILZIL;
    public final C1770006wU LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final MutableLiveData<C15558067g> LLJ;
    public final MutableLiveData LLJI;
    public final Map<String, Boolean> LLJIJIL;

    public AgeGraduationViewModel() {
        throw null;
    }

    public final void refresh() {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationViewModel refresh isGraduateUser = ");
        C342440Dbe.LIZ.getClass();
        sbLIZ.append(C342440Dbe.LIZIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        if (!C342440Dbe.LIZIZ()) {
            this.LLJ.setValue(null);
            return;
        }
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!this.LLJIJIL.containsKey(strLIZIZ)) {
            C23250099c.LIZLLL(this.LLILZIL, this.LLILZLL, null, new C15557067f(this, strLIZIZ, null), 2);
            return;
        }
        Boolean bool = (Boolean) ((LinkedHashMap) this.LLJIJIL).get(strLIZIZ);
        if (bool == null || !bool.booleanValue()) {
            this.LLJ.postValue(null);
        } else {
            this.LLJ.postValue(new C15558067g(true));
        }
    }

    public final void vQ2() {
        C1734106qh.LIZ.LIZIZ();
        this.LLJ.setValue(new C15558067g(false));
        C342440Dbe.LIZ.getClass();
        C342440Dbe.LIZJ.put(C342440Dbe.LIZLLL, Boolean.FALSE);
    }

    public final void wQ2() {
        C15558067g value;
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationViewModel reportShowEvent canReportShow = ");
        sbLIZ.append(this.LLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        if (this.LLIZ && (value = this.LLJ.getValue()) != null && value.LL) {
            this.LLIZ = false;
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("graduation_notification_show", C2097608Jq.LJIIJ(new Pair("enter_from", "notification_page")));
        }
        if (this.LLIZLLLIL) {
            return;
        }
        C342440Dbe.LIZ.getClass();
        ((IAgeGradService) ServiceManager.get().getService(IAgeGradService.class)).LIZ("dm");
        this.LLIZLLLIL = true;
    }

    public AgeGraduationViewModel(Function0 function0, Function0 function02) {
        C1DFB c1dfb = C0PEM.LIZJ;
        TikTokImApi tikTokImApiLIZJ = C1477105qL.LIZJ();
        this.LL = function0;
        this.LLILLJJLI = function02;
        this.LLILLL = tikTokImApiLIZJ;
        this.LLILZIL = C2296808zG.LIZ(c1dfb.plus(C2296908zH.LIZ()));
        this.LLILZLL = new C1770006wU(CoroutineExceptionHandler.LJJLIL, 18);
        this.LLIZ = true;
        MutableLiveData<C15558067g> mutableLiveData = new MutableLiveData<>();
        this.LLJ = mutableLiveData;
        this.LLJI = mutableLiveData;
        this.LLJIJIL = new LinkedHashMap();
    }
}
