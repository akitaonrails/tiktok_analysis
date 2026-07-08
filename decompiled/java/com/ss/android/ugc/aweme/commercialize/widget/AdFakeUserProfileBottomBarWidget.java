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
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdFakeUserProfileBottomBarWidget extends AbsAdProfileWidget {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 212));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 214));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 213));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 211));

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
        AwemeRawAd awemeRawAd;
        String learnMoreBgColor;
        String buttonText;
        AwemeRawAd awemeRawAd2;
        FakeAuthor fakeAuthor;
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
        TextView textView2 = (TextView) this.LLJILLL.getValue();
        if (textView2 != null) {
            Aweme aweme2 = this.LLIZLLLIL;
            if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd2.getFakeAuthor()) != null) {
                buttonText = fakeAuthor.getButtonText();
            } else {
                buttonText = null;
            }
            textView2.setText(buttonText);
        }
        Aweme aweme3 = this.LLIZLLLIL;
        if (aweme3 != null) {
            author = aweme3.getAuthor();
        }
        C03IT c03itLIZ = C1052840dVK.LIZ(author);
        if (c03itLIZ != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03itLIZ);
            c1331670kl3LJIIJ.LJJ((SmartImageView) this.LLJILJIL.getValue());
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        Aweme aweme4 = this.LLIZLLLIL;
        if (aweme4 != null && (awemeRawAd = aweme4.getAwemeRawAd()) != null && (learnMoreBgColor = awemeRawAd.getLearnMoreBgColor()) != null && learnMoreBgColor.length() > 0) {
            int color = ColorProtector.parseColor(learnMoreBgColor);
            View view = (View) this.LLJIJIL.getValue();
            if (view != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(color);
                gradientDrawable.setCornerRadius(C341940Daq.LIZ(4.0d));
                view.setBackground(gradientDrawable);
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.LLJIJIL.getValue();
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS119S0200000_16(this, c1035130d2l, 6));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIIZILJ(boolean z) {
        if (z) {
            View view = (View) this.LLJIJIL.getValue();
            if (view != null) {
                view.animate().translationY(C341940Daq.LIZ(-16.0d)).setDuration(300L).start();
                return;
            }
            return;
        }
        LJIJ();
    }
}
