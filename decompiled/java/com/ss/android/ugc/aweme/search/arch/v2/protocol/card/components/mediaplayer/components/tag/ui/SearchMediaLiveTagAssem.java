package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.tag.ui;

import X.C01GW;
import X.C1954807lC;
import X.C21565319aV;
import X.C337180DJs;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C652290PiF;
import X.C655540PnU;
import X.C656400Pos;
import X.C666750QDh;
import X.C814420VxA;
import X.InterfaceC655790Pnt;
import X.InterfaceC657240PqE;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaLiveTagAssem extends BaseSearchMediaOptionalAssem {
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public LinearLayout LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(148));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.euc;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        op(view);
        C426750GoL.LJIIIZ(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 24);
        C21565319aV.LIZIZ(getContentView(), Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final void op(View view) {
        this.LLJJLIIIJLLLLLLLZ = (ViewGroup) view.findViewById(R.id.njs);
        this.LLJL = (TuxTextView) view.findViewById(R.id.tv_watching_count);
        this.LLJLIL = (LinearLayout) view.findViewById(R.id.neu);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC657240PqE interfaceC657240PqE) {
        up(interfaceC657240PqE);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    /* JADX INFO: renamed from: tp */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        C652290PiF c652290PiF;
        super.up(interfaceC657240PqE);
        InterfaceC655790Pnt tag = interfaceC657240PqE.getTag();
        if ((tag instanceof C652290PiF) && (c652290PiF = (C652290PiF) tag) != null) {
            ITopLiveProductViewProvider iTopLiveProductViewProvider = (ITopLiveProductViewProvider) this.LLJLILLLLZIIL.getValue();
            if (iTopLiveProductViewProvider != null) {
                iTopLiveProductViewProvider.addBagIconIfNeed(this.LLJLIL, Boolean.valueOf(interfaceC657240PqE.getAweme().getIsLiveHasProduct()), true);
            }
            int i = C655540PnU.LIZ[c652290PiF.LIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (C666750QDh.LIZ()) {
                        C337180DJs.LIZ(this.LLJJLIIIJLLLLLLLZ);
                    } else {
                        C337180DJs.LIZJ(this.LLJJLIIIJLLLLLLLZ);
                    }
                    Aweme aweme = interfaceC657240PqE.getAweme();
                    String str = c652290PiF.LIZIZ;
                    if (str != null) {
                        TuxTextView tuxTextView = this.LLJL;
                        if (tuxTextView != null) {
                            tuxTextView.setText(str);
                            return;
                        }
                        return;
                    }
                    TuxTextView tuxTextView2 = this.LLJL;
                    if (tuxTextView2 == null) {
                        return;
                    }
                    tuxTextView2.setText(C656400Pos.LIZ(aweme));
                    return;
                }
                throw new C1954807lC();
            }
            C337180DJs.LIZ(this.LLJJLIIIJLLLLLLLZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final boolean up(InterfaceC657240PqE interfaceC657240PqE) {
        return interfaceC657240PqE.getTag() instanceof C652290PiF;
    }
}
