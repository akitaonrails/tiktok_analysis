package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.AbstractViewOnTouchListenerC446430Hez;
import X.C01GW;
import X.C07E5;
import X.C1558520qew;
import X.C2188811AlT;
import X.C452501pT;
import X.C631370Opb;
import X.C644060POa;
import X.C652430PiT;
import X.C661470Px3;
import X.C661490Px5;
import X.C723830SaL;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import wh6.AbS501S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoVideoRootAssem extends ReusedUISlotAssem<SearchTakoVideoRootAssem> implements InterfaceC712990Rxx<C652430PiT> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 411));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 410));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 412));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f09;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 178));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C652430PiT c652430PiT) {
        View viewLLLLLLLZIL;
        C661470Px3 c661470Px3;
        C652430PiT c652430PiT2 = c652430PiT;
        C786410Ut5.I7(new AbS501S0200000_10(this, c652430PiT2, 4), LJJIJL());
        View viewLJJIJL = LJJIJL();
        final Context context = LJJIJL().getContext();
        AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0PfG
            @Override // X.AbstractViewOnTouchListenerC446430Hez
            public final void LIZ(boolean z) {
                int iIntValue;
                View viewLJJIJL2 = this.LLJIJIL.LJJIJL();
                if ((viewLJJIJL2 instanceof FrameLayout) && viewLJJIJL2 != null) {
                    if (z) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, viewLJJIJL2.getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        viewLJJIJL2.setForeground(new ColorDrawable(iIntValue));
                        return;
                    }
                    viewLJJIJL2.setForeground(null);
                }
            }
        };
        abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS444S0100000_10(this, 5);
        viewLJJIJL.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
        if (c652430PiT2.LLILLL == null) {
            Long l = null;
            SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
            if (searchComponentCenter$Player$PlayerControlAbility != null) {
                viewLLLLLLLZIL = searchComponentCenter$Player$PlayerControlAbility.LLLLLLLZIL();
            } else {
                viewLLLLLLLZIL = null;
            }
            if ((viewLLLLLLLZIL instanceof C661470Px3) && (c661470Px3 = (C661470Px3) viewLLLLLLLZIL) != null && C631370Opb.LIZIZ(this) == 0) {
                C644060POa.LIZ.getClass();
                if (!C644060POa.LIZJ) {
                    C661490Px5 dataProvider = c661470Px3.getDataProvider();
                    if (dataProvider != null) {
                        dataProvider.LJJIJIIJIL = Long.valueOf(C644060POa.LIZIZ);
                    }
                    C661490Px5 dataProvider2 = c661470Px3.getDataProvider();
                    if (dataProvider2 != null) {
                        dataProvider2.LJJIJLIJ = "SearchTakoVideoRootAssem";
                    }
                    C644060POa.LIZJ = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clickSearchTime:");
                    C661490Px5 dataProvider3 = c661470Px3.getDataProvider();
                    if (dataProvider3 != null) {
                        l = dataProvider3.LJJIJIIJIL;
                    }
                    sbLIZ.append(l);
                    sbLIZ.append(" clearCreateActivityTime");
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C652430PiT c652430PiT) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C652430PiT c652430PiT) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
