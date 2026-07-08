package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.C06X8;
import X.C0DXR;
import X.C15438062q;
import X.C1697810uHb;
import X.C418440Gaw;
import X.C607880Nso;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC684740QtU;
import X.InterfaceC684820Qtc;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchPovCardDocAssemPowerCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardMarkDownWithMultiDocAssem extends SearchMarkDownWithMultiDocBaseAssem implements InterfaceC684820Qtc {
    public static final int LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(85));

    @Override // X.InterfaceC684820Qtc
    public final Class<? extends PowerCell<?>>[] rd() {
        return new Class[]{SearchPovCardDocAssemPowerCell.class};
    }

    @Override // X.InterfaceC684820Qtc
    public final C0DXR W5() {
        return new C06X8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
    }

    @Override // X.InterfaceC684820Qtc
    public final int el() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    @Override // X.InterfaceC684820Qtc
    public final int wm() {
        return LLJZ;
    }

    @Override // X.InterfaceC684820Qtc
    public final List<InterfaceC1891350zJl> Jf(InterfaceC684740QtU interfaceC684740QtU) {
        List<Aweme> videoList = interfaceC684740QtU.getVideoList();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(videoList, 10));
        int i = 0;
        for (Aweme aweme : videoList) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme2 = aweme;
                arrayList.add(new C607880Nso(interfaceC684740QtU.LJJLIIJ() + i, aweme2.getUserDigg(), aweme2));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC684820Qtc
    public final ViewOnAttachStateChangeListenerC20604515jv r8(View view) {
        return (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.tw2);
    }
}
