package com.ss.android.ugc.aweme.footnote.detail.ui;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0OCC;
import X.C1220000hqw;
import X.C1235870iGX;
import X.C13LE;
import X.C1749280vcc;
import X.C2217381BqS;
import X.C339190DRl;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736820SvI;
import X.C736950SvV;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.footnote.detail.viewmodel.FootNoteFeedListVM;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class FootNoteDetailPageComponent extends DetailPageComponent {
    public final C736950SvV LLLJIL;
    public final C01GW LLLJL;

    public final FootNoteFeedListVM Bp() {
        return (FootNoteFeedListVM) this.LLLJIL.getValue();
    }

    public FootNoteDetailPageComponent() {
        AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(116);
        this.LLLJIL = new C736950SvV(C13LE.LIZ(FootNoteFeedListVM.class), aFwS216S0000000_27, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS269S0000000_27.get$arr$(61), new AwS571S0100000_27((AbstractC738140SxQ) this, 258), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 256));
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper = this.LLLILZLLLI;
        if (loadMorePanelComponentTempHelper != null) {
            loadMorePanelComponentTempHelper.setLoadEmptyText(view.getContext().getString(2131834856));
        }
        LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper2 = this.LLLILZLLLI;
        if (loadMorePanelComponentTempHelper2 != null) {
            loadMorePanelComponentTempHelper2.p41(new C0OCC() { // from class: X.0y7p
                public boolean LL;
                public boolean LLILLJJLI;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C0OCC, X.InterfaceC1603270rp7
                public final void onHide() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onHide!!!, hasMore ");
                    sbLIZ.append(((C1845500y7o) this.LLILLL.Bp().getState()).LLILLJJLI);
                    sbLIZ.append(", size ");
                    C1845500y7o c1845500y7o = (C1845500y7o) this.LLILLL.Bp().getState();
                    c1845500y7o.getClass();
                    List<C207800r6> list = c1845500y7o.getListState().LLILZ;
                    sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (this.LL && !this.LLILLJJLI && !((C1845500y7o) this.LLILLL.Bp().getState()).LLILLJJLI) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        C1845500y7o c1845500y7o2 = (C1845500y7o) this.LLILLL.Bp().getState();
                        c1845500y7o2.getClass();
                        List<C207800r6> list2 = c1845500y7o2.getListState().LLILZ;
                        c2344009Gk.LJ(list2 != null ? Integer.valueOf(list2.size()) : null, "num_scrolls");
                        C20684815ws.LJIILLIIL("footnote_come_back_later_shown", c2344009Gk.LIZ);
                        this.LLILLJJLI = true;
                    }
                    this.LL = false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C0OCC, X.InterfaceC1603270rp7
                public final void onShow() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onShow!!!, ");
                    C1845500y7o c1845500y7o = (C1845500y7o) this.LLILLL.Bp().getState();
                    c1845500y7o.getClass();
                    List listLIZ = C627260Oiy.LIZ(c1845500y7o);
                    sbLIZ.append(listLIZ != null ? Integer.valueOf(listLIZ.size()) : null);
                    C2188811AlT.LIZIZ(sbLIZ);
                    this.LL = true;
                }
            });
        }
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.z18);
        C1235870iGX c1235870iGXAp = ap();
        if (c1235870iGXAp != null) {
            C339190DRl.LIZIZ(c1235870iGXAp);
        }
        Bp().asyncSubscribe(new C2217381BqS() { // from class: X.0y7q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1845500y7o c1845500y7o = (C1845500y7o) obj;
                c1845500y7o.getClass();
                return C627260Oiy.LIZLLL(c1845500y7o);
            }
        }, getFragment(), C736820SvI.LIZLLL(), new AwS393S0200000_27(c1749280vcc, this, 31), new AwS571S0100000_27(c1749280vcc, 257), new AwS393S0200000_27(c1749280vcc, this, 32));
    }
}
