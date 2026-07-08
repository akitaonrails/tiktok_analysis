package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp;

import X.AnonymousClass0951;
import X.C09IC;
import X.C0D27;
import X.C0D4T;
import X.C1BNE;
import X.C2252321DDq;
import X.C331480Cz4;
import X.C331490Cz5;
import X.C331530Cz9;
import X.C331540CzA;
import X.C331730CzT;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewsDto;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS118S1100000_4;
import kotlin.jvm.internal.AwS153S1100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewListViewModel extends ViewModel {
    public final C331730CzT LL;
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public String LLILZ;
    public final List<C0D4T> LLILZIL;
    public String LLILZLL;
    public C0D27<ReviewsDto> LLIZ;

    public final void vQ2() {
        String str = this.LLILZLL;
        if (str == null || str.length() == 0) {
            this.LLILLJJLI.setValue(new C331490Cz5("channel_name not available"));
            return;
        }
        String str2 = this.LLILZ;
        C0D27<ReviewsDto> c0d27 = new C0D27<>(ViewModelKt.getViewModelScope(this), new C331530Cz9(this, str, str2, null), new AwS153S1100000_4(str2, this, 1), new AwS583S0100000_4(this, 59), new AwS118S1100000_4(str2, this, 2), 0, "ReviewListFetcher", new C331540CzA(str, str2), Mp4ScreenVideoLoadTimeout.CONTROL, 0L, false, 3168);
        this.LLIZ = c0d27;
        c0d27.LIZIZ(false);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0D27<ReviewsDto> c0d27 = this.LLIZ;
        if (c0d27 != null) {
            c0d27.LIZ();
        }
    }

    public ReviewListViewModel(C331730CzT c331730CzT) {
        this.LL = c331730CzT;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C331480Cz4.LIZ);
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILZ = CardStruct.IStatusCode.DEFAULT;
        this.LLILZIL = new ArrayList();
    }
}
