package com.ss.android.ugc.aweme.kids.common.ui.awemegrid;

import X.C11JF;
import X.C151T;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes32.dex */
public final class KidsAwemeGridViewModel extends ViewModel {
    public final C151T LL;
    public C11JF LLILZIL;
    public C11JF LLILZLL;
    public boolean LLIZ;
    public final MutableLiveData<List<Aweme>> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLILZ = new MutableLiveData<>();
    public final IReportAwemeManager LLIZLLLIL = ReportAwemeManager.LIZJ();

    public KidsAwemeGridViewModel(C151T c151t) {
        this.LL = c151t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<List<Aweme>, Integer> vQ2(Pair<? extends List<? extends Aweme>, Integer> pair) {
        int i;
        if (((Number) pair.getSecond()).intValue() == 0) {
            List<Aweme> listLIZIZ = this.LLIZLLLIL.LIZIZ((List) pair.getFirst());
            if (listLIZIZ.isEmpty()) {
                i = -1;
            } else {
                i = 0;
            }
            return new Pair<>(listLIZIZ, Integer.valueOf(i));
        }
        return pair;
    }
}
