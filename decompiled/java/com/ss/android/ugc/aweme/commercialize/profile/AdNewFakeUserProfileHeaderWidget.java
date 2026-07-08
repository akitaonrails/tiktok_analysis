package com.ss.android.ugc.aweme.commercialize.profile;

import X.C01GW;
import X.C03IT;
import X.C1035110d2j;
import X.C1035130d2l;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C2187701Ajg;
import X.C452501pT;
import X.C786410Ut5;
import X.ViewTreeObserverOnGlobalLayoutListenerC1077390e8v;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdNewFakeUserProfileHeaderWidget extends AbsAdProfileWidget {
    public static final /* synthetic */ int LLJJ = 0;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 192));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 194));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 193));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 195));

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final TextView LJIJI() {
        return (TextView) this.LLJILJILJ.getValue();
    }

    public final void LJIJ() {
        User author;
        User author2;
        ViewTreeObserver viewTreeObserver;
        TextView textViewLJIJI = LJIJI();
        if (textViewLJIJI != null && (viewTreeObserver = textViewLJIJI.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1077390e8v viewTreeObserverOnGlobalLayoutListenerC1077390e8v = new ViewTreeObserverOnGlobalLayoutListenerC1077390e8v(this, 0);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1077390e8v);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1077390e8v, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        Aweme aweme = this.LLIZLLLIL;
        if (TextUtils.isEmpty((aweme == null || (author2 = aweme.getAuthor()) == null) ? null : author2.getAdAuthorDesc())) {
            TextView textViewLJIJI2 = LJIJI();
            if (textViewLJIJI2 != null) {
                Aweme aweme2 = this.LLIZLLLIL;
                textViewLJIJI2.setText(aweme2 != null ? aweme2.getDesc() : null);
                return;
            }
            return;
        }
        TextView textViewLJIJI3 = LJIJI();
        if (textViewLJIJI3 != null) {
            Aweme aweme3 = this.LLIZLLLIL;
            if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
                adAuthorDesc = author.getAdAuthorDesc();
            }
            textViewLJIJI3.setText(adAuthorDesc);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILL(C1035130d2l c1035130d2l) {
        String nickname;
        User author;
        super.LJIILL(c1035130d2l);
        TextView textView = (TextView) this.LLJILJIL.getValue();
        User author2 = null;
        if (textView != null) {
            Aweme aweme = this.LLIZLLLIL;
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            } else {
                nickname = null;
            }
            textView.setText(nickname);
        }
        Aweme aweme2 = this.LLIZLLLIL;
        if (aweme2 != null) {
            author2 = aweme2.getAuthor();
        }
        C03IT c03itLIZ = C1035110d2j.LIZ(author2);
        if (c03itLIZ != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03itLIZ);
            c1331670kl3LJIIJ.LJJ((SmartImageView) this.LLJIJIL.getValue());
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIIZILJ(boolean z) {
        if (!z) {
            TextView textViewLJIJI = LJIJI();
            if (textViewLJIJI != null) {
                textViewLJIJI.setGravity(8388627);
            }
            LJIJ();
        }
    }
}
