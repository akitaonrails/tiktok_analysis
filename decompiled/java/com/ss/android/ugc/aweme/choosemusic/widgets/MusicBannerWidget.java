package com.ss.android.ugc.aweme.choosemusic.widgets;

import X.C0RD4;
import X.C11EU;
import X.C11F8;
import X.C19466811Ec;
import X.C19466911Ed;
import X.C21595819fQ;
import X.C2211631BhB;
import X.C444960Hcc;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.discover.model.Banner;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public class MusicBannerWidget extends Widget implements Observer<C0RD4> {
    public final long LLIZLLLIL;
    public final long LLJ;
    public C11F8 LLJI;
    public int LLJIJIL;
    public final int LLJILJIL;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        this.LLILZ.yQ2("data_banner", this, false);
        this.LLJIJIL = ((Integer) this.LLILZ.get("key_choose_music_type")).intValue();
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIILIIL(View view) {
        this.LLJI = new C11F8(view, this.LLJIJIL, this.LLJILJIL, this.LLIZLLLIL, this.LLJ);
        LJIILL((List) this.LLILZ.get("data_banner"));
    }

    public final void LJIILL(List<Banner> list) {
        if (list != null && list.size() > 0) {
            C786410Ut5.LJLLLLLL(0, this.LLILLL);
            C11F8 c11f8 = this.LLJI;
            Context context = c11f8.LJI;
            if (!C11F8.LJIIJJI.equals(list)) {
                if (c11f8.LJ == null) {
                    c11f8.LJ = new C11EU(C786410Ut5.ne(context), c11f8.LJII, c11f8.LJIIIIZZ, c11f8.LJIIIZ, c11f8.LJIIJ);
                    c11f8.LIZ.setAdapter(new C21595819fQ(c11f8.LJ));
                }
                boolean zLIZJ = C444960Hcc.LIZJ(context);
                if (zLIZJ) {
                    Collections.reverse(list);
                }
                C11EU c11eu = c11f8.LJ;
                if (c11eu.LLILZIL != list) {
                    c11eu.LLILZIL = list;
                    c11eu.notifyDataSetChanged();
                }
                c11f8.LIZIZ.setUpViewPager(c11f8.LIZ);
                if (zLIZJ) {
                    c11f8.LIZ.setCurrentItem(list.size() - 1);
                }
                C19466911Ed c19466911Ed = c11f8.LJFF;
                c19466911Ed.getClass();
                if (!list.isEmpty()) {
                    C19466811Ec c19466811Ec = (C19466811Ec) c19466911Ed.LIZIZ.getValue();
                    if (c19466811Ec != null) {
                        c19466811Ec.LLILLL = list.size();
                    }
                    ViewPager viewPager = c19466911Ed.LIZ;
                    if (viewPager != null) {
                        C2211631BhB.LJ(viewPager, new AwS608S0100000_29(c19466911Ed, 460));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.LLILLL);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        C0RD4 c0rd42 = c0rd4;
        if (this.LLJI != null && c0rd42 != null) {
            Object obj = c0rd42.LIZIZ;
            if (obj == null) {
                obj = null;
            }
            LJIILL((List) obj);
        }
    }

    public MusicBannerWidget(int i, long j, long j2) {
        this.LLJILJIL = i;
        this.LLIZLLLIL = j;
        this.LLJ = j2;
    }
}
