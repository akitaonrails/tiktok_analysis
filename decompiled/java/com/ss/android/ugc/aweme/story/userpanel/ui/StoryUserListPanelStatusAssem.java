package com.ss.android.ugc.aweme.story.userpanel.ui;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C14MI;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListContainerViewModel;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryUserListPanelStatusAssem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    public final C1749280vcc Ho() {
        return (C1749280vcc) this.LLJ.getValue();
    }

    public StoryUserListPanelStatusAssem() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(262);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(StoryUserListContainerViewModel.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(205), new AwS575S0100000_31((AbstractC738140SxQ) this, 1067), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1068));
        this.LLJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(261));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1065));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1066));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.LLLZLZ(Ho(), 8);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.15lo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20614415lW) obj).LLILZ;
            }
        }, null, new AwS645S0100000_31(this, 58), 6);
    }

    public final C1722300uv6 Go(int i, int i2, int i3, int i4) {
        Context context = Ho().getContext();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        Drawable drawableLIZ = C14MI.LIZ(context, i);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJI = context.getString(i2);
        c1722300uv6.LJIIIIZZ = context.getString(i3);
        c1722300uv6.LIZLLL = i4;
        c1722300uv6.LJ = i4;
        return c1722300uv6;
    }
}
