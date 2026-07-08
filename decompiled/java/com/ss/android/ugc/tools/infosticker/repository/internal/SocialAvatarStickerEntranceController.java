package com.ss.android.ugc.tools.infosticker.repository.internal;

import X.C01GW;
import X.C03IT;
import X.C1331660kl2;
import X.C1640790snd;
import X.C1662850tND;
import X.C2022107w3;
import X.C21647019ng;
import X.C452501pT;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes26.dex */
public final class SocialAvatarStickerEntranceController {
    public final FrameLayout LIZ;
    public final C1662850tND LIZIZ;
    public final C1640790snd LIZJ;
    public SmartImageView LIZLLL;
    public boolean LJ;
    public final List<C21647019ng> LJFF = new ArrayList();
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;

    public SocialAvatarStickerEntranceController(LifecycleOwner lifecycleOwner, FrameLayout frameLayout, C1662850tND c1662850tND, C1640790snd c1640790snd) {
        this.LIZ = frameLayout;
        this.LIZIZ = c1662850tND;
        this.LIZJ = c1640790snd;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(374));
        this.LJI = c01gwLIZIZ;
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.tools.infosticker.repository.internal.SocialAvatarStickerEntranceController.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (C2022107w3.LIZ[event.ordinal()] == 1) {
                    Iterator it2 = ((ArrayList) SocialAvatarStickerEntranceController.this.LJFF).iterator();
                    while (it2.hasNext()) {
                        ((C21647019ng) it2.next()).LIZ();
                    }
                }
            }
        });
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        C1331660kl2.LJIIJ(new C03IT((List) c01gwLIZIZ.getValue())).LJJIII();
        this.LJII = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(372));
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(373));
        this.LJIIIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(172));
    }
}
