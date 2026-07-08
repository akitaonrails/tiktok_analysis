package com.ss.android.ugc.aweme.commercialize.widget;

import X.C01GW;
import X.C03IT;
import X.C1035130d2l;
import X.C1052840dVK;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C341940Daq;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS119S0200000_16;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdFakeUserProfileNewBottomBarWidget extends AbsAdProfileWidget {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 216));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 218));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 217));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 215));

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIJ() {
        View view = (View) this.LLJIJIL.getValue();
        if (view != null) {
            view.animate().translationY(C341940Daq.LIZ(100.0d)).setDuration(0L).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIILIIL(View view) {
        super.LJIILIIL(view);
        LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILL(C1035130d2l c1035130d2l) {
        String openUrl;
        String buttonText;
        AwemeRawAd awemeRawAd;
        FakeAuthor fakeAuthor;
        AwemeRawAd awemeRawAd2;
        String buttonText2;
        AwemeRawAd awemeRawAd3;
        super.LJIILL(c1035130d2l);
        TextView textView = (TextView) this.LLJILJILJ.getValue();
        User author = null;
        if (textView != null) {
            Aweme aweme = this.LLIZLLLIL;
            if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
                buttonText2 = awemeRawAd3.getButtonText();
            } else {
                buttonText2 = null;
            }
            textView.setText(buttonText2);
        }
        Aweme aweme2 = this.LLIZLLLIL;
        if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null) {
            openUrl = awemeRawAd2.getOpenUrl();
        } else {
            openUrl = null;
        }
        if (openUrl != null && openUrl.length() != 0) {
            TextView textView2 = (TextView) this.LLJILLL.getValue();
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 8);
            }
        } else {
            TextView textView3 = (TextView) this.LLJILLL.getValue();
            if (textView3 != null) {
                C786410Ut5.LLIL(textView3, 0);
            }
            TextView textView4 = (TextView) this.LLJILLL.getValue();
            if (textView4 != null) {
                Aweme aweme3 = this.LLIZLLLIL;
                if (aweme3 != null && (awemeRawAd = aweme3.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd.getFakeAuthor()) != null) {
                    buttonText = fakeAuthor.getButtonText();
                } else {
                    buttonText = null;
                }
                textView4.setText(buttonText);
            }
        }
        Aweme aweme4 = this.LLIZLLLIL;
        if (aweme4 != null) {
            author = aweme4.getAuthor();
        }
        C03IT c03itLIZ = C1052840dVK.LIZ(author);
        if (c03itLIZ != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03itLIZ);
            c1331670kl3LJIIJ.LJJ((SmartImageView) this.LLJILJIL.getValue());
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        ViewGroup viewGroup = (ViewGroup) this.LLJIJIL.getValue();
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS119S0200000_16(this, c1035130d2l, 7));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIIZILJ(boolean z) {
        if (z) {
            View view = (View) this.LLJIJIL.getValue();
            if (view != null) {
                view.animate().translationY(C341940Daq.LIZ(0.0d)).setDuration(300L).start();
                return;
            }
            return;
        }
        LJIJ();
    }
}
