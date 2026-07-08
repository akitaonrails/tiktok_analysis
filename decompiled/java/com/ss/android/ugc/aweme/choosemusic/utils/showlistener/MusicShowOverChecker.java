package com.ss.android.ugc.aweme.choosemusic.utils.showlistener;

import X.C15HO;
import X.C15M8;
import X.C20684815ws;
import X.C2157108cj;
import X.C2344009Gk;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes32.dex */
public abstract class MusicShowOverChecker {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final boolean LLILZIL;
    public final C15HO LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;

    public abstract boolean LIZ();

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public final void LJ() {
        if (this.LLIZ) {
            return;
        }
        LJFF(LIZ());
    }

    public final void LIZLLL(LifecycleOwner lifecycleOwner) {
        LIZJ();
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker$startListen$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (this.LL.LLIZ) {
                    return;
                }
                int i = C2157108cj.LIZ[event.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    return;
                }
                this.LL.LJFF(false);
                MusicShowOverChecker musicShowOverChecker = this.LL;
                musicShowOverChecker.LLIZ = true;
                musicShowOverChecker.LIZIZ();
            }
        });
    }

    public final void LJFF(boolean z) {
        if (this.LLIZLLLIL == z) {
            return;
        }
        if (z) {
            this.LLJ = SystemClock.elapsedRealtime();
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJ;
            long j = this.LL;
            String str = this.LLILLJJLI;
            Integer num = this.LLILZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jElapsedRealtime, "display_duration");
            c2344009Gk.LIZLLL(j, "music_id");
            c2344009Gk.LJIIIIZZ("music_name", str);
            c2344009Gk.LJ(num, "commercial_music_order");
            c2344009Gk.LJIIIIZZ("ai_recommend_tag", this.LLILLL);
            c2344009Gk.LJII(new C15M8().LJFF("page", "commercial_music_suggestion_id", "is_commercial"));
            C15HO c15ho = this.LLILZLL;
            if (c15ho != null && c15ho.LJIILIIL != null) {
                c2344009Gk.LJFF("tab_name", c15ho.LJIILIIL);
            }
            C15HO c15ho2 = this.LLILZLL;
            if (c15ho2 != null && c15ho2.LJIILLIIL != null) {
                c2344009Gk.LJFF("page_name", c15ho2.LJIILLIIL);
            }
            C20684815ws.LJIILLIIL("show_music_over", c2344009Gk.LIZ);
            if (!this.LLILZIL) {
                this.LLIZ = true;
                LIZIZ();
            }
        }
        this.LLIZLLLIL = z;
    }

    public /* synthetic */ MusicShowOverChecker(long j, String str, String str2, Integer num, C15HO c15ho, int i) {
        this(j, str, str2, num, false, (i & 32) != 0 ? null : c15ho);
    }

    public MusicShowOverChecker(long j, String str, String str2, Integer num, boolean z, C15HO c15ho) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = num;
        this.LLILZIL = z;
        this.LLILZLL = c15ho;
    }
}
