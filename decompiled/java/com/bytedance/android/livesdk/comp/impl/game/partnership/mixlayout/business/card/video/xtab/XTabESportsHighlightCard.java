package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab;

import X.AbstractC1585810rMx;
import X.AbstractC1882890z67;
import X.C098200Yq;
import X.C1104200eqA;
import X.C1155600gB4;
import X.C1308910kAL;
import X.C1385040m98;
import X.C1388190mED;
import X.C16FZ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1882380z5I;
import X.C1883760z7W;
import X.C1885470zAH;
import X.C1885540zAO;
import X.C189200o6;
import X.C1893080zMY;
import X.C19EG;
import X.C20441214yg;
import X.C23250099c;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1572870r25;
import X.InterfaceC1881340z3c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class XTabESportsHighlightCard extends AbstractC1882890z67<Object> {
    public View LLJJIJI;
    public C16FZ LLJJIJIIJIL;
    public C1749280vcc LLJJIJIL;
    public RecyclerView LLJJJ;
    public SwipeRefreshLayout LLJJJIL;
    public View LLJJJJ;
    public C1104200eqA LLJJJJJIL;
    public XtabESportshighlightCardVM LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;

    public final void LJJJJLI() {
        String strLJFF = C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "room_id");
        if (strLJFF == null) {
            strLJFF = "";
        }
        String strLJFF2 = C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "author_id");
        String str = strLJFF2 != null ? strLJFF2 : "";
        XtabESportshighlightCardVM xtabESportshighlightCardVM = this.LLJJJJLIIL;
        if (xtabESportshighlightCardVM != null) {
            xtabESportshighlightCardVM.getClass();
            xtabESportshighlightCardVM.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(xtabESportshighlightCardVM), null, null, new C1885540zAO(xtabESportshighlightCardVM, strLJFF, str, null), 3);
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJ() {
        super.LJJ();
        C500260Jjc.LJIILIIL(this.LLJJIJIL);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJI() {
        super.LJJI();
        C500260Jjc.LJIILIIL(this.LLJJIJIIJIL);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJJI() {
        super.LJJJJI();
        C500260Jjc.LLFFF(this.LLJJIJIL);
        C1749280vcc c1749280vcc = this.LLJJIJIL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LJFF(c1722300uv6, new C1883760z7W(this));
            c1749280vcc.setStatus(c1722300uv6);
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJJIZL() {
        super.LJJJJIZL();
        C500260Jjc.LLFFF(this.LLJJIJIIJIL);
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(C1385040m98.LIZ(this.LL, true)), R.layout.h60, viewGroup, false);
        this.LLJJIJI = viewTd;
        return viewTd;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIZ(int i) {
        super.LJJIZ(i);
        if (this.LLJJL == 2) {
            LJJJJLI();
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        Object c098200Yq;
        LifecycleCoroutineScope lifecycleScope;
        int iIntValue;
        this.LLILZLL = view;
        this.LLJJIJIIJIL = (C16FZ) view.findViewById(R.id.nnp);
        this.LLJJIJIL = (C1749280vcc) view.findViewById(R.id.tf5);
        this.LLJJJ = (RecyclerView) view.findViewById(R.id.t0h);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.ws6);
        this.LLJJJIL = swipeRefreshLayout;
        int iIntValue2 = 0;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        this.LLJJJJ = view.findViewById(R.id.h1p);
        TextView textView = (TextView) view.findViewById(R.id.h3e);
        if (textView != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, C1385040m98.LIZ(textView.getContext(), true));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            textView.setTextColor(iIntValue);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.h3d);
        if (textView2 != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ezt, C1385040m98.LIZ(textView2.getContext(), true));
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            textView2.setTextColor(iIntValue2);
        }
        RecyclerView recyclerView = this.LLJJJ;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0z3o
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                    XTabESportsHighlightCard xTabESportsHighlightCard = this.LL;
                    int i2 = xTabESportsHighlightCard.LLJJLIIIJLLLLLLLZ;
                    if (i2 != 1) {
                        if (i == 1) {
                            xTabESportsHighlightCard.LLJJLIIIJLLLLLLLZ = 1;
                            return;
                        } else if (i2 == 0) {
                            return;
                        }
                    }
                    if (i != 0) {
                        return;
                    }
                    xTabESportsHighlightCard.LLJJLIIIJLLLLLLLZ = 0;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_program_live_tab_subpage_action");
                    String strLJFF = C1882380z5I.LJFF(C1882380z5I.LIZJ(xTabESportsHighlightCard.LLILLL), "biz_name");
                    String str = "";
                    if (strLJFF == null) {
                        strLJFF = "";
                    }
                    c474500IjALIZ.LJJII(strLJFF, "tab_name");
                    String strLJFF2 = C1882380z5I.LJFF(C1882380z5I.LIZJ(xTabESportsHighlightCard.LLILLL), "room_id");
                    if (strLJFF2 == null) {
                        strLJFF2 = "";
                    }
                    c474500IjALIZ.LJJII(strLJFF2, "room_id");
                    String strLJFF3 = C1882380z5I.LJFF(C1882380z5I.LIZJ(xTabESportsHighlightCard.LLILLL), "author_id");
                    if (strLJFF3 != null) {
                        str = strLJFF3;
                    }
                    c474500IjALIZ.LJJII(str, "anchor_id");
                    c474500IjALIZ.LJJII("draw", "action_type");
                    c474500IjALIZ.LIZ();
                }
            });
        }
        Object c098200Yq2 = null;
        try {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLL.getContext());
            if (c19egLIZIZ != null) {
                this.LLJJJJLIIL = (XtabESportshighlightCardVM) new ViewModelProvider(c19egLIZIZ).get(XtabESportshighlightCardVM.class);
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("XTabESportsHighlightCard", "initViewModel failed", thM5exceptionOrNullimpl);
        }
        this.LLJJJJJIL = new C1104200eqA(this);
        RecyclerView recyclerView2 = this.LLJJJ;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new GridLayoutManager(this.LL, 2));
        }
        RecyclerView recyclerView3 = this.LLJJJ;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.LLJJJJJIL);
        }
        RecyclerView recyclerView4 = this.LLJJJ;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0zAK
                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView5, int i, int i2) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView5.getLayoutManager();
                    int itemCount = linearLayoutManager.getItemCount();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    if (itemCount > 0 && iFindLastVisibleItemPosition >= itemCount - 4) {
                        this.LL.getClass();
                    }
                }
            });
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.LLJJJIL;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setOnRefreshListener(new InterfaceC1572870r25() { // from class: X.0zAL
                @Override // X.InterfaceC1572870r25
                public final void LJFF() {
                    this.LIZ.LJJJJLI();
                }
            });
        }
        try {
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(this.LLILLL.getContext());
            if (c19egLIZIZ2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ2)) != null) {
                C23250099c.LIZLLL(lifecycleScope, null, null, new C1885470zAH(this, null), 3);
            }
            String strLJFF = C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "room_id");
            String str = "";
            if (strLJFF == null) {
                strLJFF = "";
            }
            String strLJFF2 = C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "author_id");
            if (strLJFF2 != null) {
                str = strLJFF2;
            }
            XtabESportshighlightCardVM xtabESportshighlightCardVM = this.LLJJJJLIIL;
            if (xtabESportshighlightCardVM != null) {
                xtabESportshighlightCardVM.getClass();
                xtabESportshighlightCardVM.getClass();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(xtabESportshighlightCardVM), null, null, new C1885540zAO(xtabESportshighlightCardVM, strLJFF, str, null), 3);
                c098200Yq2 = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null) {
            C20441214yg.LJFF("XTabESportsHighlightCard", "loadInitialData failed", thM5exceptionOrNullimpl2);
        }
        LJJIJIL();
    }

    public XTabESportsHighlightCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
    }
}
