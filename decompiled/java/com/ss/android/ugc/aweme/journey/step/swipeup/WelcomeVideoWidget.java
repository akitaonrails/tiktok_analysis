package com.ss.android.ugc.aweme.journey.step.swipeup;

import X.C1911410zq7;
import X.C1AT9;
import X.C1ATA;
import X.C1ATF;
import X.C1ATH;
import X.C2107908Np;
import X.C2188811AlT;
import X.C23250099c;
import X.C786410Ut5;
import X.C817503Hh;
import X.C844470XAv;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.player.sdk.impl.SimplifyAsyncPlayer;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public final class WelcomeVideoWidget extends Widget implements C1ATH {
    public final String LLIZLLLIL;
    public final Integer LLJ;
    public final boolean LLJI;
    public final float LLJIJIL;
    public final boolean LLJILJIL;
    public final Function0<Unit> LLJILJILJ;
    public final int LLJILLL;
    public RemoteImageView LLJJ;
    public View LLJJI;
    public C1ATA LLJJIII;
    public boolean LLJJIJI;
    public final String LLJJIJIIJIL;
    public boolean LLJJIJIL;

    public WelcomeVideoWidget() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJIJIL) {
            C1ATA c1ata = this.LLJJIII;
            if (c1ata == null) {
                c1ata = null;
            }
            c1ata.getClass();
            C1911410zq7.LIZ("WelcomeVideoViewHolder", "on stop");
            c1ata.LJII = false;
            int i = c1ata.LJI.LIZ;
            if (i == 1 || i == 2 || i == 4) {
                C1ATF c1atf = c1ata.LJFF;
                if (c1atf == null) {
                    c1atf = null;
                }
                c1atf.LIZ.H1(c1atf.LIZIZ);
                SimplifyAsyncPlayer simplifyAsyncPlayer = c1atf.LIZ.LLILLJJLI;
                if (simplifyAsyncPlayer != null) {
                    simplifyAsyncPlayer.LJJIIZI();
                }
                c1atf.LIZ.LJIIJJI();
                c1atf.LIZ.release();
                c1ata.LJI.LIZ = 0;
                RemoteImageView remoteImageView = c1ata.LJ;
                C786410Ut5.l(remoteImageView != null ? remoteImageView : null, 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        if (!(this.LLJILJIL && this.LLJJIJI) && this.LLJJIJIL) {
            C1ATA c1ata = this.LLJJIII;
            if (c1ata == null) {
                c1ata = null;
            }
            c1ata.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        if (!(this.LLJILJIL && this.LLJJIJI) && this.LLJJIJIL) {
            C1ATA c1ata = this.LLJJIII;
            if (c1ata == null) {
                c1ata = null;
            }
            c1ata.LIZIZ();
        }
    }

    public WelcomeVideoWidget(Integer num) {
        String strLIZIZ;
        this.LLIZLLLIL = "welcome_screen_video4.mp4";
        this.LLJ = num;
        this.LLJI = false;
        this.LLJIJIL = 1.7777778f;
        this.LLJILJIL = false;
        this.LLJILJILJ = null;
        this.LLJILLL = 10;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (C786410Ut5.x2(contextLIZ) == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.x2(contextLIZ).getAbsolutePath());
            sbLIZ.append(File.separator);
            sbLIZ.append("welcome_screen_video4.mp4");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LLJJIJIIJIL = strLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIILIIL(View view) {
        C786410Ut5.Sd(R.layout.ibj, C786410Ut5.ne(this.LL), (ViewGroup) view);
        C23250099c.LIZLLL(C817503Hh.LL, C2107908Np.LIZ, null, new C1AT9(this, view, null), 2);
    }

    @Override // X.C1ATH
    public final void aw(String str) {
        this.LLJJIJI = true;
    }
}
