package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live;

import X.AbstractC1882890z67;
import X.C041J;
import X.C0IJT;
import X.C1155600gB4;
import X.C13LP;
import X.C16F5;
import X.C16FZ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1882380z5I;
import X.C1883130z6V;
import X.C1883480z74;
import X.C1883500z76;
import X.C1885160z9m;
import X.C1885170z9n;
import X.C1893080zMY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C476770Imp;
import X.C497740JfY;
import X.C500260Jjc;
import X.C741020T4y;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.InterfaceC1881340z3c;
import X.InterfaceC1883720z7S;
import X.InterfaceC1885180z9o;
import X.InterfaceC485370J1r;
import X.RunnableC781530UlD;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.game.model.DropsRoomInfo;
import com.bytedance.android.livesdk.game.model.GameDetailLiveInfo;
import com.bytedance.android.livesdk.game.model.GameDetailLiveTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GameLiveCard extends AbstractC1882890z67<GameLiveCardModel> implements InterfaceC485370J1r, InterfaceC1883720z7S {
    public static final int LLLF = (int) C497740JfY.LIZIZ(4.0f);
    public static final int LLLFF = (int) C497740JfY.LIZIZ(20.0f);
    public C1885160z9m LLJJIJI;
    public RunnableC781530UlD LLJJIJIIJIL;
    public RelativeLayout LLJJIJIL;
    public final List<Room> LLJJJ;
    public final AtomicBoolean LLJJJIL;
    public final HashSet<String> LLJJJJ;
    public boolean LLJJJJJIL;
    public int LLJJJJLIIL;
    public C16F5 LLJJL;
    public C1749280vcc LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public RadioGroup LLJLIL;
    public HorizontalScrollView LLJLILLLLZIIL;
    public C16FZ LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public GameDetailLiveTabInfo LLJZ;
    public boolean LLJZIJLIL;
    public C1883480z74 LLL;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJJJLI() {
        /*
            r3 = this;
            X.0z3c r0 = r3.LLILLL
            X.0z5M r1 = X.C1882380z5I.LIZJ(r0)
            r2 = 0
            if (r1 == 0) goto L3a
            X.0z3c r0 = r1.LIZ
            java.lang.String r1 = r1.LIZIZ
            if (r0 == 0) goto L38
            X.0z5U r0 = r0.LJJIIZI()
            java.lang.Object r1 = r0.LIZ(r1)
            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
            if (r0 != 0) goto L1c
            r1 = r2
        L1c:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L38
            java.lang.String r0 = "screen_layout_type"
            java.lang.Object r1 = r1.get(r0)
        L26:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L2b
            r2 = r1
        L2b:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L3a
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L44
            r1 = 5
        L37:
            return r1
        L38:
            r1 = r2
            goto L26
        L3a:
            r1 = 2
            if (r2 == 0) goto L37
            int r0 = r2.intValue()
            if (r0 != r1) goto L37
            goto L4b
        L44:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L3a
        L4b:
            r1 = 4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live.GameLiveCard.LJJJJLI():int");
    }

    public final void LJJJJZI() {
        LinearLayoutManager linearLayoutManager;
        String str;
        String str2;
        ArrayList arrayList = (ArrayList) this.LLJJJ;
        if (arrayList.isEmpty() || arrayList.size() <= this.LLJJJJ.size()) {
            return;
        }
        RunnableC781530UlD runnableC781530UlD = this.LLJJIJIIJIL;
        RecyclerView.LayoutManager layoutManager = runnableC781530UlD != null ? runnableC781530UlD.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition < 0 || arrayList.size() < iFindLastVisibleItemPosition || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            Room room = (Room) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, arrayList);
            if (room != null && !this.LLJJJJ.contains(room.getIdStr())) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null) {
                    int[] iArr = new int[2];
                    viewFindViewByPosition.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    Size sizeLIZIZ = C1883130z6V.LIZIZ(this);
                    if (sizeLIZIZ == null) {
                        sizeLIZIZ = new Size(0, 0);
                    }
                    if (i >= 0 && i < sizeLIZIZ.getWidth() && i2 >= 0 && i2 < sizeLIZIZ.getHeight()) {
                        this.LLJJJJ.add(room.getIdStr());
                        String strLIZ = C1883130z6V.LIZ(this);
                        GameDetailLiveTabInfo gameDetailLiveTabInfo = this.LLJZ;
                        String strLJJJJLL = LJJJJLL(gameDetailLiveTabInfo != null ? gameDetailLiveTabInfo.tabType : 0);
                        InterfaceC1881340z3c interfaceC1881340z3c = this.LLILLL;
                        boolean zLIZIZ = C1883500z76.LIZIZ(this);
                        DropsRoomInfo dropsRoomInfo = room.dropsInfo;
                        boolean z = dropsRoomInfo != null && dropsRoomInfo.showDropsTag;
                        PartnershipInfo partnershipInfo = room.partnershipInfo;
                        String str3 = partnershipInfo != null ? partnershipInfo.promotingDropsId : null;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_live_card_show");
                        String idStr = room.getIdStr();
                        if (idStr == null) {
                            idStr = "";
                        }
                        c474500IjALIZ.LJJII(idStr, "room_id");
                        LiveMode streamType = room.getStreamType();
                        if (streamType == null || (str = streamType.logStreamingType) == null) {
                            str = "";
                        }
                        c474500IjALIZ.LJJII(str, "live_type");
                        c474500IjALIZ.LJJII(strLIZ, "tab_name");
                        c474500IjALIZ.LJJII("live_cell", "enter_method");
                        c474500IjALIZ.LJJII("draw", "action_type");
                        c474500IjALIZ.LJJII(zLIZIZ ? "gamecp_page_home_tab" : "gamecp_page_live_tab", "enter_from_merge");
                        if (zLIZIZ) {
                            strLJJJJLL = "";
                        }
                        c474500IjALIZ.LJJII(strLJJJJLL, "sub_tab_name");
                        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(interfaceC1881340z3c != null ? C1882380z5I.LIZLLL(interfaceC1881340z3c) : null)));
                        c474500IjALIZ.LJJII(z ? "1" : CardStruct.IStatusCode.DEFAULT, "is_gamecp_drops_tag");
                        if (C041J.LIZ(str3)) {
                            c474500IjALIZ.LJJII(str3, "drops_id");
                        }
                        c474500IjALIZ.LIZ();
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_show");
                        String idStr2 = room.getIdStr();
                        if (idStr2 == null) {
                            idStr2 = "";
                        }
                        c474500IjALIZ2.LJJII(idStr2, "room_id");
                        LiveMode streamType2 = room.getStreamType();
                        if (streamType2 == null || (str2 = streamType2.logStreamingType) == null) {
                            str2 = "";
                        }
                        c474500IjALIZ2.LJJII(str2, "live_type");
                        c474500IjALIZ2.LJJII("draw", "action_type");
                        c474500IjALIZ2.LJJII("live_cell", "enter_method");
                        c474500IjALIZ2.LJJII(zLIZIZ ? "gamecp_page_home_tab" : "gamecp_page_live_tab", "enter_from_merge");
                        c474500IjALIZ2.LJJII(z ? "1" : CardStruct.IStatusCode.DEFAULT, "is_gamecp_drops_tag");
                        if (C041J.LIZ(str3)) {
                            c474500IjALIZ2.LJJII(str3, "drops_id");
                        }
                        c474500IjALIZ2.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(interfaceC1881340z3c != null ? C1882380z5I.LIZLLL(interfaceC1881340z3c) : null)));
                        c474500IjALIZ2.LIZ();
                    }
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    @Override // X.InterfaceC1883720z7S
    public final void LJ() {
        RunnableC781530UlD runnableC781530UlD;
        if (C1883500z76.LIZIZ(this) || (runnableC781530UlD = this.LLJJIJIIJIL) == null) {
            return;
        }
        runnableC781530UlD.scrollToPosition(0);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJ() {
        super.LJJ();
        LJJJLL(false);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIIZI() {
        super.LJJIIZI();
        LJJJIL("on_action_up");
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJ() {
        Pair<? extends View, ? extends ViewTreeObserver.OnScrollChangedListener> pair;
        super.LJJIJ();
        C1883480z74 c1883480z74 = this.LLL;
        if (c1883480z74 != null && (pair = c1883480z74.LIZIZ) != null) {
            C786410Ut5.E3(pair.getFirst().getViewTreeObserver(), pair.getSecond());
            c1883480z74.LIZIZ = null;
        }
        this.LLL = null;
        C1885160z9m c1885160z9m = this.LLJJIJI;
        if (c1885160z9m != null) {
            Iterator<WeakReference<InterfaceC1885180z9o>> it2 = c1885160z9m.LLILLL.iterator();
            while (it2.hasNext()) {
                InterfaceC1885180z9o interfaceC1885180z9o = it2.next().get();
                if (interfaceC1885180z9o != null) {
                    interfaceC1885180z9o.release();
                }
            }
            c1885160z9m.LLILLL.clear();
        }
        this.LLJJIJI = null;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJIIJI() {
        super.LJJIJIIJI();
        LJJJJJ("on_action_up");
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIL() {
        super.LJJIL();
        LJJIJIL();
        LJJJLIIL(false);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJJI() {
        super.LJJJJI();
        LJJJLL(true);
    }

    @Override // X.InterfaceC485370J1r
    public final boolean isAutoPlay() {
        return C1883500z76.LIZIZ(this);
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gn6, viewGroup, false);
    }

    @Override // X.InterfaceC485370J1r
    public final void LJIILIIL(float f) {
        C1885170z9n c1885170z9n;
        InterfaceC1885180z9o interfaceC1885180z9oI5;
        if (!C1883500z76.LIZIZ(this)) {
            return;
        }
        this.LLJZIJLIL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onContainerScroll ratio=");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("GameLiveCard", C2188811AlT.LIZIZ(sbLIZ));
        if (0.0f <= f && f <= 1.0f) {
            LJJJJZ((int) (f * 4));
        } else {
            C1885160z9m c1885160z9m = this.LLJJIJI;
            if (c1885160z9m != null && (c1885170z9n = c1885160z9m.LLILLJJLI) != null && (interfaceC1885180z9oI5 = c1885170z9n.I5()) != null) {
                interfaceC1885180z9oI5.LIZIZ();
            }
        }
        LJJJJZI();
    }

    @Override // X.AbstractC1882890z67, X.InterfaceC1882930z6B
    public final void LJIJ(int i) {
        C1885170z9n c1885170z9n;
        InterfaceC1885180z9o interfaceC1885180z9oI5;
        super.LJIJ(i);
        this.LLJZIJLIL = false;
        C1885160z9m c1885160z9m = this.LLJJIJI;
        if (c1885160z9m != null && (c1885170z9n = c1885160z9m.LLILLJJLI) != null && (interfaceC1885180z9oI5 = c1885170z9n.I5()) != null) {
            interfaceC1885180z9oI5.LIZIZ();
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIZ(int i) {
        super.LJJIZ(i);
        this.LLJZIJLIL = true;
        if (this.LLJLLIL) {
            this.LLJLLIL = false;
        }
        C1885160z9m c1885160z9m = this.LLJJIJI;
        if (c1885160z9m != null) {
            C1885170z9n c1885170z9n = c1885160z9m.LLILLJJLI;
            if (c1885170z9n != null) {
                c1885170z9n.L5();
                return;
            }
            return;
        }
        LJJJJZ(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e4  */
    @Override // X.AbstractC1882890z67
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live.GameLiveCard.LJJJ(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LJJJJLL(int i) {
        int size;
        GameDetailLiveInfo gameDetailLiveInfo;
        List<GameDetailLiveTabInfo> list;
        GameLiveCardModel gameLiveCardModel = (GameLiveCardModel) this.LLILZIL;
        if (gameLiveCardModel != null && (gameDetailLiveInfo = gameLiveCardModel.liveInfo) != null && (list = gameDetailLiveInfo.liveTabs) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size <= 1) {
            return "";
        }
        if (i != 0) {
            if (i != 1) {
                return "";
            }
            return "GameRewards";
        }
        return "ForYou";
    }

    public final void LJJJJZ(int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        RunnableC781530UlD runnableC781530UlD = this.LLJJIJIIJIL;
        if (runnableC781530UlD != null) {
            viewHolderFindViewHolderForAdapterPosition = runnableC781530UlD.findViewHolderForAdapterPosition(i);
        } else {
            viewHolderFindViewHolderForAdapterPosition = null;
        }
        if (viewHolderFindViewHolderForAdapterPosition instanceof C1885170z9n) {
            C1885170z9n c1885170z9n = (C1885170z9n) viewHolderFindViewHolderForAdapterPosition;
            if (c1885170z9n.I5() != null) {
                if (this.LLJJIJI != null) {
                    C1885160z9m.LLLI(c1885170z9n.LLJIJIL, InterfaceC1106030et7.v4.LIZIZ().booleanValue());
                }
                c1885170z9n.L5();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playLiveRoomByIndex index=");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("GameLiveCard", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL(final boolean r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live.GameLiveCard.LJJJLIIL(boolean):void");
    }

    public final void LJJJLL(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LLJL;
            if (viewGroup != null) {
                C500260Jjc.LLFFF(viewGroup);
            }
            C1749280vcc c1749280vcc = this.LLJJLIIIJLLLLLLLZ;
            if (c1749280vcc != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LJFF(c1722300uv6, new C741020T4y(this));
                c1749280vcc.setStatus(c1722300uv6);
            }
            C1749280vcc c1749280vcc2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1749280vcc2 != null) {
                c1749280vcc2.setButtonTopMargin(C497740JfY.LIZIZ(24.0f));
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLJL;
        if (viewGroup2 == null) {
            return;
        }
        C476770Imp.LIZJ(viewGroup2, new Runnable() { // from class: X.0T4m
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GameLiveCard@6636.showPageRetryStatusView$2");
                try {
                    ViewGroup viewGroup3 = this.LL.LLJL;
                    if (viewGroup3 != null) {
                        C500260Jjc.LJIILIIL(viewGroup3);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GameLiveCard@6636.showPageRetryStatusView$2");
            }
        });
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIII(Object obj, String str) {
        if (Intrinsics.LJFF(str, "on_action_up")) {
            LJJJJZI();
        }
    }

    public GameLiveCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
        this.LLJJJ = new ArrayList();
        this.LLJJJIL = new AtomicBoolean(false);
        this.LLJJJJ = new HashSet<>();
        this.LLJJJJJIL = true;
        this.LLJLLL = true;
    }
}
