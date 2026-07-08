package com.ss.android.ugc.aweme.commercialize.widget;

import X.C01GW;
import X.C423090GiR;
import X.C452501pT;
import X.C721010SPz;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AdFakeUserProfileVideoNewDescWidget extends AbsAdProfileWidget {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 113));
    public C721010SPz LLJILJIL;
    public View LLJILJILJ;
    public TextView LLJILLL;
    public C423090GiR LLJJ;

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final int LJIJI() {
        AwemeRawAd awemeRawAd;
        FakeAuthor fakeAuthor;
        String totalRatingsReviews;
        AwemeRawAd awemeRawAd2;
        FakeAuthor fakeAuthor2;
        String rankLabel;
        AwemeRawAd awemeRawAd3;
        FakeAuthor fakeAuthor3;
        String categoryLabel;
        AwemeRawAd awemeRawAd4;
        FakeAuthor fakeAuthor4;
        Aweme aweme = this.LLIZLLLIL;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null || (totalRatingsReviews = fakeAuthor.getTotalRatingsReviews()) == null || totalRatingsReviews.length() == 0) {
            return 3;
        }
        Aweme aweme2 = this.LLIZLLLIL;
        if (aweme2 != null && (awemeRawAd4 = aweme2.getAwemeRawAd()) != null && (fakeAuthor4 = awemeRawAd4.getFakeAuthor()) != null && fakeAuthor4.getRating() != null) {
            return 1;
        }
        Aweme aweme3 = this.LLIZLLLIL;
        if (aweme3 != null && (awemeRawAd3 = aweme3.getAwemeRawAd()) != null && (fakeAuthor3 = awemeRawAd3.getFakeAuthor()) != null && (categoryLabel = fakeAuthor3.getCategoryLabel()) != null && categoryLabel.length() != 0) {
            return 2;
        }
        Aweme aweme4 = this.LLIZLLLIL;
        return (aweme4 == null || (awemeRawAd2 = aweme4.getAwemeRawAd()) == null || (fakeAuthor2 = awemeRawAd2.getFakeAuthor()) == null || (rankLabel = fakeAuthor2.getRankLabel()) == null || rankLabel.length() == 0) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(X.C1035130d2l r18) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoNewDescWidget.LJIILL(X.0d2l):void");
    }

    public final boolean LJIJ(TextExtraStruct textExtraStruct, String str) {
        if (str != null && textExtraStruct.getStart() >= 0 && textExtraStruct.getEnd() >= 0 && textExtraStruct.getEnd() <= str.length() && textExtraStruct.getStart() < str.length() && textExtraStruct.getStart() < textExtraStruct.getEnd()) {
            return true;
        }
        return false;
    }
}
