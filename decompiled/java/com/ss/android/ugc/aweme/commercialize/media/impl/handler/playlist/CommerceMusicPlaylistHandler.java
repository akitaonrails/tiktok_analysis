package com.ss.android.ugc.aweme.commercialize.media.impl.handler.playlist;

import X.C13BV;
import X.C15HA;
import X.C15M8;
import X.C15M9;
import X.C15MA;
import X.C15ME;
import X.C19719612Di;
import X.C2023207wE;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceMusicPlaylistHandler implements C15HA {
    public C15ME LL;

    @Override // X.C15HA
    public final void mM2(int i) {
        C15MA c15ma = C15MA.LL;
        C15MA.LJFF(Integer.valueOf(i));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2023207wE.LIZ[event.ordinal()] == 1) {
            C15MA.LL.getClass();
            C19719612Di.LJJIJIIJI(C15MA.LLJILJIL);
            C15MA.LJ(null);
            C15MA.LJFF(null);
            C15M9 c15m9 = C15MA.LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
            c15m9.LIZ(null);
            C15MA.LJI(null);
        }
    }

    @Override // X.C15HA
    public final void zK0(Long l, List list, boolean z) {
        String string;
        C15MA.LL.getClass();
        if (C15MA.LIZJ()) {
            if (l != null) {
                string = l.toString();
            } else {
                string = null;
            }
            C15MA.LJI(string);
            C15M8 c15m8 = new C15M8();
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            c15m8.LIZJ = list;
            c15m8.LIZLLL = true;
            c15m8.LJII("ttba_CSP_UID_recommended_music_candidate", "commercial_music_suggestion_id", "rec_candidate_clip_id");
        }
        C15ME c15me = this.LL;
        if (c15me != null) {
            c15me.LIZ = z;
        }
    }

    @Override // X.C15HA
    public final void tm1(int i, Integer num, String str, String str2, String str3, boolean z) {
        if (!(!z)) {
            str = null;
        }
        C15ME c15me = new C15ME(str3, z);
        C15MA.LL.getClass();
        ((ArrayList) C15MA.LLJILJIL).add(c15me);
        this.LL = c15me;
        if (num == null || num.intValue() < 0) {
            num = null;
        }
        C15M9 c15m9 = C15MA.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        c15m9.LIZ(num);
        C15MA.LJ(str);
    }
}
