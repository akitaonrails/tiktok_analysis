package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gift;

import X.AbstractC1585810rMx;
import X.AbstractC1882890z67;
import X.C01GW;
import X.C0DXR;
import X.C1155600gB4;
import X.C1324720kZq;
import X.C15438062q;
import X.C1879880z1G;
import X.C1879920z1K;
import X.C1879930z1L;
import X.C20600815jK;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1881340z3c;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gift.SearchGameGiftCard;
import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.android.livesdk.game.model.BriefGiftInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class SearchGameGiftCard extends AbstractC1882890z67<SearchGameGiftCardModel> {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    @Override // X.AbstractC1882890z67
    public final void LJJIJ() {
        super.LJJIJ();
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJLIJ() {
        super.LJJIJLIJ();
    }

    public static final class GiftCell extends PowerCell<C1879880z1G> {
        public C1324720kZq LL;
        public TuxTextView LLILLJJLI;
        public TuxTextView LLILLL;

        /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
        @Override // com.bytedance.ies.powerlist.PowerCell
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onBindItemView(X.InterfaceC1891350zJl r14) {
            /*
                r13 = this;
                X.0z1G r14 = (X.C1879880z1G) r14
                super.onBindItemView(r14)
                android.view.View r3 = r13.itemView
                android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
                if (r2 == 0) goto Laf
                int r1 = r13.getItemCount()
                r0 = 1
                if (r1 > r0) goto L92
                int r1 = X.C779350Uhh.LIZLLL()
                r0 = 32
                int r0 = X.C439101nJ.LIZ(r0)
                int r1 = r1 - r0
            L1f:
                r2.width = r1
                X.C786410Ut5.W5(r3, r2)
                X.0z1F r0 = new X.0z1F
                r0.<init>()
                X.C786410Ut5.I7(r0, r3)
                X.0JBN r1 = X.C1819620xS4.LIZ()
                com.bytedance.android.livesdk.game.model.BriefBenefitInfo r0 = r14.LL
                com.bytedance.android.livesdk.game.model.BriefGiftInfo r0 = r0.briefGiftInfo
                if (r0 == 0) goto L90
                java.lang.String r0 = r0.iconUrl
            L38:
                X.0kZf r1 = r1.setUrl(r0)
                X.0kZq r0 = r13.LL
                r1.LJJI(r0)
                com.bytedance.tux.input.TuxTextView r1 = r13.LLILLJJLI
                if (r1 == 0) goto L4c
                com.bytedance.android.livesdk.game.model.BriefBenefitInfo r0 = r14.LL
                java.lang.String r0 = r0.taskTypeDesc
                r1.setText(r0)
            L4c:
                com.bytedance.tux.input.TuxTextView r3 = r13.LLILLL
                if (r3 == 0) goto Lab
                com.bytedance.android.livesdk.game.model.BriefBenefitInfo r0 = r14.LL
                com.bytedance.android.livesdk.game.model.BriefGiftInfo r0 = r0.briefGiftInfo
                if (r0 == 0) goto Lac
                java.util.List<com.bytedance.android.livesdk.game.model.GiftItem> r1 = r0.items
                if (r1 == 0) goto Lac
                java.util.ArrayList r5 = new java.util.ArrayList
                r0 = 10
                int r0 = X.C15438062q.LJIJJ(r1, r0)
                r5.<init>(r0)
                java.util.Iterator r4 = r1.iterator()
            L69:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L99
                java.lang.Object r1 = r4.next()
                com.bytedance.android.livesdk.game.model.GiftItem r1 = (com.bytedance.android.livesdk.game.model.GiftItem) r1
                java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
                java.lang.String r0 = r1.name
                r2.append(r0)
                java.lang.String r0 = " x"
                r2.append(r0)
                long r0 = r1.count
                r2.append(r0)
                java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
                r5.add(r0)
                goto L69
            L90:
                r0 = 0
                goto L38
            L92:
                r0 = 262(0x106, float:3.67E-43)
                int r1 = X.C439101nJ.LIZ(r0)
                goto L1f
            L99:
                java.lang.String r6 = ", "
                r7 = 0
                r9 = 0
                r12 = 62
                r8 = r7
                r10 = r7
                r11 = r7
                java.lang.String r0 = X.C13LP.LJJLIIIJ(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r0 == 0) goto Lac
            La8:
                r3.setText(r0)
            Lab:
                return
            Lac:
                java.lang.String r0 = ""
                goto La8
            Laf:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gift.SearchGameGiftCard.GiftCell.onBindItemView(X.0zJl):void");
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup) {
            View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.hrp, false, 4, null);
            this.LL = (C1324720kZq) viewInflateItemView$default.findViewById(R.id.jxe);
            this.LLILLJJLI = (TuxTextView) viewInflateItemView$default.findViewById(R.id.title);
            this.LLILLL = (TuxTextView) viewInflateItemView$default.findViewById(R.id.wgz);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zr);
            viewInflateItemView$default.setBackground(c384050F3z.LIZ(viewInflateItemView$default.getContext()));
            return viewInflateItemView$default;
        }
    }

    public static boolean LJJJJLI(BriefBenefitInfo briefBenefitInfo) {
        BriefGiftInfo briefGiftInfo = briefBenefitInfo.briefGiftInfo;
        if (briefGiftInfo == null || briefBenefitInfo.activityIdStr.length() <= 0 || briefBenefitInfo.taskTypeDesc.length() <= 0 || briefGiftInfo.name.length() <= 0 || briefGiftInfo.iconUrl.length() <= 0 || briefGiftInfo.idStr.length() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.hyx, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        List<BriefBenefitInfo> list;
        List<BriefBenefitInfo> list2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        GameStationGameInfo gameStationGameInfo;
        this.LLILZLL = view;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.iyg);
        this.LLJJIJI = viewOnAttachStateChangeListenerC20604515jv2;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(GiftCell.class);
            viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(new C0DXR() { // from class: X.0DWu
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    super.LIZIZ(rect, view2, recyclerView, c21673919s1);
                    boolean z = true;
                    if (recyclerView.getLayoutDirection() != 1) {
                        z = false;
                    }
                    if (recyclerView.getChildAdapterPosition(view2) == 0) {
                        if (z) {
                            rect.right = 0;
                            return;
                        } else {
                            rect.left = 0;
                            return;
                        }
                    }
                    if (z) {
                        rect.right = (int) C418440Gaw.LIZIZ(8);
                    } else {
                        rect.left = (int) C418440Gaw.LIZIZ(8);
                    }
                }
            });
            viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0z1I
                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                    LinearLayoutManager linearLayoutManager;
                    int iFindFirstVisibleItemPosition;
                    int iFindLastVisibleItemPosition;
                    PowerCell powerCell;
                    C1879880z1G c1879880z1G;
                    String str;
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) > (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
                        return;
                    }
                    while (true) {
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                        if (viewFindViewByPosition != null) {
                            SearchGameGiftCard searchGameGiftCard = this.LL;
                            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(viewFindViewByPosition);
                            if ((childViewHolder instanceof SearchGameGiftCard.GiftCell) && (powerCell = (PowerCell) childViewHolder) != null && (c1879880z1G = (C1879880z1G) powerCell.getItem()) != null) {
                                searchGameGiftCard.getClass();
                                BriefGiftInfo briefGiftInfo = c1879880z1G.LL.briefGiftInfo;
                                if (briefGiftInfo == null || (str = briefGiftInfo.idStr) == null) {
                                    str = "";
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(iFindFirstVisibleItemPosition);
                                sbLIZ.append('-');
                                sbLIZ.append(str);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                if (!((Set) searchGameGiftCard.LLJJIJIIJIL.getValue()).contains(strLIZIZ)) {
                                    ((Set) searchGameGiftCard.LLJJIJIIJIL.getValue()).add(strLIZIZ);
                                    InterfaceC1881340z3c interfaceC1881340z3c = c1879880z1G.LLILLL;
                                    BriefBenefitInfo briefBenefitInfo = c1879880z1G.LL;
                                    C1879890z1H.LIZIZ(interfaceC1881340z3c, "benefits", C2097608Jq.LJIIIIZZ(new Pair("benefits_type", C1879890z1H.LJ(briefBenefitInfo.taskType)), new Pair("benefit_id", str), new Pair("activity_id", briefBenefitInfo.activityIdStr), new Pair("benefit_task_id", briefBenefitInfo.campaignTaskId)), null);
                                }
                            }
                        }
                        if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                            iFindFirstVisibleItemPosition++;
                        } else {
                            return;
                        }
                    }
                }
            });
        }
        SearchGameGiftCardModel searchGameGiftCardModel = (SearchGameGiftCardModel) this.LLILZIL;
        if (searchGameGiftCardModel != null && (list = searchGameGiftCardModel.rewardList) != null) {
            ArrayList arrayList = new ArrayList();
            for (BriefBenefitInfo briefBenefitInfo : list) {
                if (LJJJJLI(briefBenefitInfo)) {
                    arrayList.add(briefBenefitInfo);
                }
            }
            if (!arrayList.isEmpty()) {
                SearchGameGiftCardModel searchGameGiftCardModel2 = (SearchGameGiftCardModel) this.LLILZIL;
                if (searchGameGiftCardModel2 != null && (list2 = searchGameGiftCardModel2.rewardList) != null) {
                    ArrayList<BriefBenefitInfo> arrayList2 = new ArrayList();
                    for (BriefBenefitInfo briefBenefitInfo2 : list2) {
                        if (LJJJJLI(briefBenefitInfo2)) {
                            arrayList2.add(briefBenefitInfo2);
                        }
                    }
                    if (!arrayList2.isEmpty() && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJI) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        for (BriefBenefitInfo briefBenefitInfo3 : arrayList2) {
                            SearchGameGiftCardModel searchGameGiftCardModel3 = (SearchGameGiftCardModel) this.LLILZIL;
                            if (searchGameGiftCardModel3 != null) {
                                gameStationGameInfo = searchGameGiftCardModel3.gameInfo;
                            } else {
                                gameStationGameInfo = null;
                            }
                            arrayList3.add(new C1879880z1G(briefBenefitInfo3, gameStationGameInfo, this.LLILLL, (String) this.LLJJIJIL.getValue()));
                        }
                        state.LJIILL(arrayList3, null);
                    }
                }
                LJJIJL();
                return;
            }
        }
        LJJJJ(3994, "");
        LJJIJIIJIL();
    }

    public SearchGameGiftCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1879930z1L());
        this.LLJJIJIL = C452501pT.LIZIZ(new C1879920z1K());
    }
}
