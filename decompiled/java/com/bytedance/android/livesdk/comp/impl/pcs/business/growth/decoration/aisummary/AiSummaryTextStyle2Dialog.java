package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary;

import X.AbstractC1700910uMb;
import X.AbstractC1812500xGa;
import X.AbstractC1812590xGj;
import X.AbstractC1812820xH6;
import X.AnonymousClass0951;
import X.C049900Gb;
import X.C0HTI;
import X.C1161920gLG;
import X.C1390410mHn;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C16F5;
import X.C1700890uMZ;
import X.C1812240xGA;
import X.C1812520xGc;
import X.C1812600xGk;
import X.C1812650xGp;
import X.C1812670xGr;
import X.C1812750xGz;
import X.C1812850xH9;
import X.C1812880xHC;
import X.C1813080xHW;
import X.C1813280xHq;
import X.C1834150xpV;
import X.C1838450xwR;
import X.C1954807lC;
import X.C197039127h;
import X.C20736316Cj;
import X.C344190DeT;
import X.C344200DeU;
import X.C344310Def;
import X.C475510Ikn;
import X.C497700JfU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1180504jb;
import X.InterfaceC1813000xHO;
import X.InterfaceC1813270xHp;
import X.InterfaceC1814530xJr;
import X.InterfaceC775640Ubi;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryTextStyle2Dialog;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AiSummaryTextStyle2Dialog extends LiveSheetFragment implements InterfaceC1813270xHp<C1812670xGr, AbstractC1812500xGa, AbstractC1812820xH6, AiSummaryViewModel>, InterfaceC1813000xHO {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE0HELIOSOio7PSd9LCAvJj0yPCwjJ2EyITY5JCIyOjxiCCYAPSghKD0qHCA0PRwnMSkpews6KSkjLg==";
    public int LLJLLL;
    public C197039127h LLJZ;
    public C197039127h LLJZIJLIL;
    public ViewGroup LLL;
    public C1390410mHn LLLF;
    public LiveIconView LLLFF;
    public C16F5 LLLFFI;
    public ViewGroup LLLFZ;
    public ViewGroup LLLI;
    public ViewGroup LLLII;
    public ViewGroup LLLIIII;
    public C1838450xwR LLLIIIIL;
    public C1838450xwR LLLIIIL;
    public C1838450xwR LLLIIL;
    public List<C1812850xH9> LLLIILIL = C13BV.INSTANCE;
    public int LLLIL;

    @Override // X.InterfaceC1813000xHO
    public final String getEntrance() {
        return null;
    }

    public final AiSummaryViewModel uS() {
        return (AiSummaryViewModel) ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createViewModel(AiSummaryViewModel.class);
    }

    public final void yS() {
        ViewGroup viewGroup = this.LLLFZ;
        if (viewGroup != null) {
            C500260Jjc.LJIILIIL(viewGroup);
        }
        ViewGroup viewGroup2 = this.LLL;
        if (viewGroup2 != null) {
            C500260Jjc.LLFFF(viewGroup2);
        }
        C1390410mHn c1390410mHn = this.LLLF;
        if (c1390410mHn != null) {
            C500260Jjc.LJIILIIL(c1390410mHn);
        }
        C1390410mHn c1390410mHn2 = this.LLLF;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZLLL();
        }
        LiveIconView liveIconView = this.LLLFF;
        if (liveIconView != null) {
            C500260Jjc.LLFFF(liveIconView);
        }
        C16F5 c16f5 = this.LLLFFI;
        if (c16f5 != null) {
            C500260Jjc.LLFFF(c16f5);
        }
        C197039127h c197039127h = this.LLJZIJLIL;
        if (c197039127h != null) {
            c197039127h.LJJJJL(new C344310Def(C1834150xpV.LJII(c197039127h.getContext())));
            c197039127h.setEnabled(false);
        }
    }

    public final void zS() {
        ViewGroup viewGroup = this.LLLI;
        int i = R.drawable.ajp;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(this.LLLIL == 0 ? R.drawable.ajp : R.drawable.ajo);
        }
        ViewGroup viewGroup2 = this.LLLII;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(this.LLLIL == 1 ? R.drawable.ajp : R.drawable.ajo);
        }
        ViewGroup viewGroup3 = this.LLLIIII;
        if (viewGroup3 != null) {
            if (this.LLLIL != 2) {
                i = R.drawable.ajo;
            }
            viewGroup3.setBackgroundResource(i);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.c5n, context);
    }

    @Override // X.InterfaceC1813270xHp
    public final void Xh(InterfaceC775640Ubi interfaceC775640Ubi) throws Throwable {
        List<C1812850xH9> list;
        AbstractC1700910uMb abstractC1700910uMb;
        Board board;
        BoardItem boardItem;
        RichTextContent richTextContent;
        String strLIZIZ;
        C1700890uMZ c1700890uMZ;
        AnonymousClass0951 anonymousClass0951LJIIL;
        C1812670xGr c1812670xGr = (C1812670xGr) interfaceC775640Ubi;
        int i = C1812650xGp.LIZ[c1812670xGr.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        yS();
                        return;
                    }
                    throw new C1954807lC();
                }
                ViewGroup viewGroup = this.LLLFZ;
                if (viewGroup != null) {
                    C500260Jjc.LJIILIIL(viewGroup);
                }
                ViewGroup viewGroup2 = this.LLL;
                if (viewGroup2 != null) {
                    C500260Jjc.LLFFF(viewGroup2);
                }
                C1390410mHn c1390410mHn = this.LLLF;
                if (c1390410mHn != null) {
                    C500260Jjc.LLFFF(c1390410mHn);
                }
                C1390410mHn c1390410mHn2 = this.LLLF;
                if (c1390410mHn2 != null) {
                    c1390410mHn2.LIZJ();
                }
                LiveIconView liveIconView = this.LLLFF;
                if (liveIconView != null) {
                    C500260Jjc.LJIILIIL(liveIconView);
                }
                C16F5 c16f5 = this.LLLFFI;
                if (c16f5 == null) {
                    return;
                }
                C500260Jjc.LJIILIIL(c16f5);
                return;
            }
            yS();
            return;
        }
        ViewGroup viewGroup3 = this.LLL;
        if (viewGroup3 != null) {
            C500260Jjc.LJIILIIL(viewGroup3);
        }
        C1390410mHn c1390410mHn3 = this.LLLF;
        if (c1390410mHn3 != null) {
            C500260Jjc.LJIILIIL(c1390410mHn3);
        }
        C1390410mHn c1390410mHn4 = this.LLLF;
        if (c1390410mHn4 != null) {
            c1390410mHn4.LIZLLL();
        }
        LiveIconView liveIconView2 = this.LLLFF;
        if (liveIconView2 != null) {
            C500260Jjc.LJIILIIL(liveIconView2);
        }
        C16F5 c16f52 = this.LLLFFI;
        if (c16f52 != null) {
            C500260Jjc.LJIILIIL(c16f52);
        }
        ViewGroup viewGroup4 = this.LLLFZ;
        if (viewGroup4 != null) {
            C500260Jjc.LLFFF(viewGroup4);
        }
        AbstractC1812590xGj abstractC1812590xGj = c1812670xGr.LIZ;
        if (abstractC1812590xGj instanceof C1812600xGk) {
            list = abstractC1812590xGj.LL;
        } else {
            list = abstractC1812590xGj.LL;
        }
        this.LLLIILIL = list;
        InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
        if (boardsDisplayStateManager != null && (anonymousClass0951LJIIL = boardsDisplayStateManager.LJIIL()) != null) {
            abstractC1700910uMb = (AbstractC1700910uMb) anonymousClass0951LJIIL.getValue();
        } else {
            abstractC1700910uMb = null;
        }
        if ((abstractC1700910uMb instanceof C1700890uMZ) && (c1700890uMZ = (C1700890uMZ) abstractC1700910uMb) != null) {
            board = c1700890uMZ.LIZ;
        } else {
            board = null;
        }
        Iterator<C1812850xH9> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1812850xH9 next = it2.next();
            if (board != null) {
                Board board2 = next.LIZLLL;
                String strLIZIZ2 = C1812880xHC.LIZIZ(board);
                if (board2 == null) {
                    strLIZIZ = null;
                } else {
                    strLIZIZ = C1812880xHC.LIZIZ(board2);
                }
                if (Intrinsics.LJFF(strLIZIZ2, strLIZIZ)) {
                    if (i2 != -1) {
                        this.LLLIL = i2;
                    }
                }
            }
            i2++;
        }
        int i3 = 0;
        for (Object obj : C1697810uHb.LJIIJJI(this.LLLIIIIL, this.LLLIIIL, this.LLLIIL)) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C1838450xwR c1838450xwR = (C1838450xwR) obj;
                C1812850xH9 c1812850xH9 = (C1812850xH9) C13LP.LJJJLZIJ(i3, list);
                if (c1812850xH9 != null && (boardItem = c1812850xH9.LIZJ) != null && (richTextContent = boardItem.richTextContent) != null && c1838450xwR != null) {
                    c1838450xwR.i0(new C049900Gb(richTextContent).LIZ(), false);
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        zS();
        if (list.size() == 2) {
            C500260Jjc.LJIILIIL(this.LLLIIII);
            return;
        }
        if (list.size() == 1) {
            C500260Jjc.LJIILIIL(this.LLLII);
            C500260Jjc.LJIILIIL(this.LLLIIII);
        } else {
            if (!list.isEmpty()) {
                return;
            }
            C500260Jjc.LJIILIIL(this.LLLI);
            C500260Jjc.LJIILIIL(this.LLLII);
            C500260Jjc.LJIILIIL(this.LLLIIII);
            yS();
        }
    }

    @Override // X.InterfaceC1813270xHp
    public final void gn(InterfaceC1180504jb interfaceC1180504jb) {
        DataChannel dataChannelLJ;
        Context context;
        AbstractC1812820xH6 abstractC1812820xH6 = (AbstractC1812820xH6) interfaceC1180504jb;
        if (abstractC1812820xH6.LIZ() && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (context = getContext()) != null) {
            C1812880xHC.LIZJ(abstractC1812820xH6, this, context, dataChannelLJ);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(16.0f);
        return sheetOptions;
    }

    public final void wS(int i) {
        if (i >= 0 && i < this.LLLIILIL.size() && i != this.LLLIL) {
            this.LLLIL = i;
            zS();
            uS().vQ2(new C1812240xGA(new C1812750xGz((C1812850xH9) ListProtector.get(this.LLLIILIL, i), "click", "headline_select", "design_2", "", i)));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        if (i == 2) {
            C1813080xHW.LJ(null);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String strValueOf = String.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this)));
        C197039127h c197039127h = this.LLJZ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0xHG
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.close(1);
                    if (C497700JfU.LIZ.LIZ().isBroadcast()) {
                        C1813080xHW.LJ(null);
                    }
                }
            });
        }
        C197039127h c197039127h2 = this.LLJZIJLIL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new View.OnClickListener() { // from class: X.0xHD
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ViewGroup viewGroup;
                    if (!this.LL.LLLIILIL.isEmpty()) {
                        int size = this.LL.LLLIILIL.size();
                        AiSummaryTextStyle2Dialog aiSummaryTextStyle2Dialog = this.LL;
                        int i = aiSummaryTextStyle2Dialog.LLLIL;
                        if (i >= 0 && i < size) {
                            C1812850xH9 c1812850xH9 = (C1812850xH9) ListProtector.get(aiSummaryTextStyle2Dialog.LLLIILIL, i);
                            AiSummaryTextStyle2Dialog aiSummaryTextStyle2Dialog2 = this.LL;
                            int i2 = aiSummaryTextStyle2Dialog2.LLLIL;
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    viewGroup = aiSummaryTextStyle2Dialog2.LLLIIII;
                                } else {
                                    viewGroup = aiSummaryTextStyle2Dialog2.LLLII;
                                }
                            } else {
                                viewGroup = aiSummaryTextStyle2Dialog2.LLLI;
                            }
                            aiSummaryTextStyle2Dialog2.uS().vQ2(new C1812480xGY(c1812850xH9, viewGroup, true));
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_in_live_ai_board_capsule_page_close");
                            c474500IjALIZ.LJJII(Integer.valueOf(this.LL.LLLIL + 1), "sub_position");
                            c474500IjALIZ.LIZ();
                        }
                    }
                }
            });
        }
        ViewGroup viewGroup = this.LLLI;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0xHK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.wS(0);
                }
            });
        }
        ViewGroup viewGroup2 = this.LLLII;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0xHL
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.wS(1);
                }
            });
        }
        ViewGroup viewGroup3 = this.LLLIIII;
        if (viewGroup3 != null) {
            C786410Ut5.K7(viewGroup3, new View.OnClickListener() { // from class: X.0xHM
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.wS(2);
                }
            });
        }
        final ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.dwm);
        if (constraintLayout != null) {
            HandlerHook.viewPost(constraintLayout, new Runnable() { // from class: X.0FNi
                public final void LIZ() {
                    if (constraintLayout.getParent() != null) {
                        int i = (int) (this.getResources().getDisplayMetrics().heightPixels * 0.6f);
                        int paddingTop = constraintLayout.getPaddingTop() + constraintLayout.getPaddingBottom();
                        C197039127h c197039127h3 = this.LLJZ;
                        int height = i - ((paddingTop + (c197039127h3 != null ? c197039127h3.getHeight() : 0)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
                        if (height > 0) {
                            C19MB c19mb = new C19MB();
                            ConstraintLayout constraintLayout2 = constraintLayout;
                            c19mb.LJII(constraintLayout2);
                            c19mb.LJIIL(R.id.wrt, height);
                            c19mb.LIZIZ(constraintLayout2);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AiSummaryTextStyle2Dialog@8d81.limitScrollViewMaxHeight$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AiSummaryTextStyle2Dialog@8d81.limitScrollViewMaxHeight$1");
                }
            });
        }
        C1813280xHq.LIZ(this, uS(), this);
        uS().vQ2(new C1812520xGc(C497700JfU.LIZ.LIZ(), this.LLJLLL, strValueOf, "live_capsule", 2));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C1834150xpV.LIZJ(layoutInflater), R.layout.fy8, viewGroup, false);
        Context contextLJII = C1834150xpV.LJII(viewTd.getContext());
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.cny);
        LiveIconView liveIconView = null;
        if (c197039127h != null) {
            c197039127h.LJJJJL(new C344190DeT(contextLJII));
        } else {
            c197039127h = null;
        }
        this.LLJZ = c197039127h;
        C197039127h c197039127h2 = (C197039127h) viewTd.findViewById(R.id.cwg);
        if (c197039127h2 != null) {
            c197039127h2.LJJJJL(new C344200DeU(contextLJII));
        } else {
            c197039127h2 = null;
        }
        this.LLJZIJLIL = c197039127h2;
        this.LLL = (ViewGroup) viewTd.findViewById(R.id.w28);
        this.LLLF = (C1390410mHn) viewTd.findViewById(R.id.nnp);
        LiveIconView liveIconView2 = (LiveIconView) viewTd.findViewById(R.id.h2p);
        if (liveIconView2 != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n4;
            liveIconView2.setIcon(c0hti.LIZ(liveIconView2.getContext()));
            liveIconView2.setIconTint(C20736316Cj.LIZIZ(R.attr.eoc, contextLJII));
            liveIconView = liveIconView2;
        }
        this.LLLFF = liveIconView;
        this.LLLFFI = (C16F5) viewTd.findViewById(R.id.h3c);
        this.LLLFZ = (ViewGroup) viewTd.findViewById(R.id.ndr);
        this.LLLI = (ViewGroup) viewTd.findViewById(R.id.ndo);
        this.LLLII = (ViewGroup) viewTd.findViewById(R.id.ndq);
        this.LLLIIII = (ViewGroup) viewTd.findViewById(R.id.ndp);
        this.LLLIIIIL = (C1838450xwR) viewTd.findViewById(R.id.zp8);
        this.LLLIIIL = (C1838450xwR) viewTd.findViewById(R.id.zp_);
        this.LLLIIL = (C1838450xwR) viewTd.findViewById(R.id.zp9);
        return viewTd;
    }
}
