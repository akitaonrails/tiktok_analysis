package com.ss.android.ugc.aweme.commercialize.profile;

import X.C01GW;
import X.C03IT;
import X.C1035110d2j;
import X.C1035130d2l;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C14EU;
import X.C341940Daq;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C996100c1o;
import Y.ACListenerS151S0100000_16;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class AdNewFakeBottomDescBarWidget extends AbsAdProfileWidget {
    public final boolean LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    public AdNewFakeBottomDescBarWidget() {
        this(false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIJ() {
        View view = (View) this.LLJILJIL.getValue();
        if (view != null) {
            view.animate().translationY(C341940Daq.LIZ(100.0d)).setDuration(0L).start();
        }
    }

    public final void LJIJI() {
        View view = (View) this.LLJILJIL.getValue();
        if (view != null) {
            view.animate().translationY(C341940Daq.LIZ(0.0d)).setDuration(300L).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    public AdNewFakeBottomDescBarWidget(boolean z) {
        this.LLJIJIL = z;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 178));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 180));
        this.LLJILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 179));
        this.LLJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 177));
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
        TextView textView = (TextView) this.LLJILLL.getValue();
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
            TextView textView2 = (TextView) this.LLJJ.getValue();
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 8);
            }
            View view = (View) this.LLJILLL.getValue();
            if (view != null) {
                C426750GoL.LJIIIZ(view, 0, 0, 0, 0, false, 16);
            }
        } else {
            TextView textView3 = (TextView) this.LLJJ.getValue();
            if (textView3 != null) {
                C786410Ut5.LLIL(textView3, 0);
            }
            TextView textView4 = (TextView) this.LLJJ.getValue();
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
        C03IT c03itLIZ = C1035110d2j.LIZ(author);
        if (c03itLIZ != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03itLIZ);
            c1331670kl3LJIIJ.LJJ((SmartImageView) this.LLJILJILJ.getValue());
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        ViewGroup viewGroup = (ViewGroup) this.LLJILJIL.getValue();
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS151S0100000_16(this, 24));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIIZILJ(boolean z) {
        if (z && !this.LLJIJIL) {
            LJIJI();
        } else {
            LJIJ();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAdGPProfileWebViewHiddenEvent(C996100c1o c996100c1o) {
        LJIJI();
    }
}
