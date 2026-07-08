package com.ss.android.ugc.aweme.minidrama.common.component.eventlog.staytime;

import X.C01GW;
import X.C1163504gr;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS108S1000000_24;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class DramaStayTimeComponent implements GenericLifecycleObserver {
    public final Fragment LL;
    public final String LLILLJJLI;
    public final String LLILZ;
    public final String LLILZIL;
    public final Function0<String> LLILZLL;
    public final String LLILLL = "innerfeed";
    public long LLIZ = -1;
    public boolean LLIZLLLIL = true;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 114));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LIZ() {
        if (this.LLIZ != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
            if (jCurrentTimeMillis > 100) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("duration", String.valueOf(jCurrentTimeMillis));
                c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
                c2344009Gk.LJIIIIZZ("current_page", this.LLILLL);
                c2344009Gk.LJIIIIZZ("series_enter_entrance", this.LLILZ);
                c2344009Gk.LJIIIIZZ("series_session_id", this.LLILZLL.invoke());
                Map map = (Map) this.LLJ.getValue();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                C1163504gr.LIZIZ.onEventV3("stay_time", c2344009Gk.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((char) 12304);
                sbLIZ.append(this.LL.getClass().getSimpleName());
                sbLIZ.append("】   stopCalTime() called with: ");
                sbLIZ.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LLIZ = -1L;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LLIZLLLIL) {
            LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLIZLLLIL) {
            this.LLIZ = System.currentTimeMillis();
        }
    }

    public DramaStayTimeComponent(Fragment fragment, String str, String str2, String str3, AwS108S1000000_24 awS108S1000000_24) {
        this.LL = fragment;
        this.LLILLJJLI = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = awS108S1000000_24;
        fragment.getLifecycle().addObserver(this);
    }
}
