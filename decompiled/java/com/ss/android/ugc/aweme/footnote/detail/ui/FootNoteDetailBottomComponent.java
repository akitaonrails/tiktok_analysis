package com.ss.android.ugc.aweme.footnote.detail.ui;

import X.C01GW;
import X.C1548820qPI;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1871910yoP;
import X.C197039127h;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C262100zr;
import X.C339190DRl;
import X.C452501pT;
import X.C786130Usd;
import X.C786410Ut5;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FootNoteInfo;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS503S0200000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class FootNoteDetailBottomComponent extends BasePanelComponent implements IDetailBottomProtocol, InterfaceC1141530foN, InterfaceC1554640qYg {
    public View LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public C197039127h LLILZLL;
    public boolean LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 488));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 487));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(193));

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    public final void onPageSelected() {
        Resources resources;
        Aweme awemeLJIIIIZZ;
        FootNoteInfo footNoteInfo;
        Integer num;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILLJJLI.getValue();
        int iIntValue = (iFeedPanelPlatformAbility == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) == null || (footNoteInfo = awemeLJIIIIZZ.getFootNoteInfo()) == null || (num = footNoteInfo.pendingNum) == null) ? 0 : num.intValue();
        if (!this.LLIZ) {
            C339190DRl.LIZLLL(this.LLILLL);
            C339190DRl.LIZLLL(this.LLILZ);
            C339190DRl.LIZLLL(this.LLILZIL);
            C339190DRl.LIZLLL(this.LLILZLL);
            this.LLIZ = true;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("action_view_all", "show");
            c2344009Gk.LIZJ(iIntValue, "num_of_footnotes_pending");
            C20684815ws.LJIILLIIL("footnote_view_all_click", c2344009Gk.LIZ);
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            Context context = getContext();
            tuxTextView.setText((context == null || (resources = context.getResources()) == null) ? null : resources.getQuantityString(2131755324, iIntValue, Integer.valueOf(iIntValue)));
        }
        int i = iIntValue <= 1 ? 2131834855 : 2131834852;
        C197039127h c197039127h = this.LLILZLL;
        if (c197039127h != null) {
            Context context2 = getContext();
            c197039127h.setText(context2 != null ? context2.getString(i) : null);
        }
        C197039127h c197039127h2 = this.LLILZLL;
        if (c197039127h2 != null) {
            c197039127h2.setLoading(false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1548820qPI.LIZLLL("footnotes_add_success", this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("footnotes_add_success", this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C786130Usd(this, 1));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        Aweme awemeLJIIIIZZ;
        String strLJFF;
        String aid;
        FootNoteInfo footNoteInfo;
        Integer num;
        Map<String, Object> mapLIZ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "footnotes_add_success")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Footnote add success, JS EVENT RECEIVED!!, ");
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            Integer numValueOf = null;
            if (interfaceC1107590evd != null && (mapLIZ = interfaceC1107590evd.LIZ()) != null) {
                string = mapLIZ.toString();
            } else {
                string = null;
            }
            sbLIZ.append(string);
            C2188811AlT.LIZIZ(sbLIZ);
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILLJJLI.getValue();
            if (iFeedPanelPlatformAbility != null) {
                awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "awemeId", "");
            } else {
                strLJFF = null;
            }
            if (awemeLJIIIIZZ != null) {
                aid = awemeLJIIIIZZ.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(strLJFF, aid)) {
                return;
            }
            if (awemeLJIIIIZZ != null && (footNoteInfo = awemeLJIIIIZZ.getFootNoteInfo()) != null) {
                FootNoteInfo footNoteInfo2 = awemeLJIIIIZZ.getFootNoteInfo();
                if (footNoteInfo2 != null && (num = footNoteInfo2.pendingNum) != null) {
                    numValueOf = Integer.valueOf(num.intValue() + 1);
                }
                footNoteInfo.setPendingNum(numValueOf);
            }
            onPageSelected();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bl3, viewGroup, false);
        this.LLILLL = viewTd;
        this.LLILZ = (TuxIconView) viewTd.findViewById(R.id.ihr);
        this.LLILZIL = (TuxTextView) viewTd.findViewById(R.id.ihs);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.ihq);
        this.LLILZLL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbS503S0200000_12(c197039127h, this, 3), c197039127h);
        }
        return viewTd;
    }
}
