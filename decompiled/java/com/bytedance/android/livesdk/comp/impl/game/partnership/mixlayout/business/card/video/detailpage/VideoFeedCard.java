package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage;

import X.AbstractC1882890z67;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C09JN;
import X.C09RD;
import X.C09RE;
import X.C0IJT;
import X.C0T50;
import X.C0UO0;
import X.C1155600gB4;
import X.C1161920gLG;
import X.C13BV;
import X.C13LP;
import X.C16F5;
import X.C16FZ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1833330xoB;
import X.C1880070z1Z;
import X.C1881810z4N;
import X.C1882020z4i;
import X.C1882380z5I;
import X.C1882420z5M;
import X.C1883100z6S;
import X.C1883130z6V;
import X.C1883480z74;
import X.C1883500z76;
import X.C1883550z7B;
import X.C1883570z7D;
import X.C1885000z9W;
import X.C1885060z9c;
import X.C1885110z9h;
import X.C1885120z9i;
import X.C1885150z9l;
import X.C1885210z9r;
import X.C1885220z9s;
import X.C1885230z9t;
import X.C1885250z9v;
import X.C1885280z9y;
import X.C1885310zA1;
import X.C1885330zA3;
import X.C1885370zA7;
import X.C1885390zA9;
import X.C1885560zAQ;
import X.C1885570zAR;
import X.C1893080zMY;
import X.C20441214yg;
import X.C20603715jn;
import X.C2188811AlT;
import X.C452501pT;
import X.C474500IjA;
import X.C476770Imp;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.InterfaceC1881340z3c;
import X.InterfaceC1882450z5P;
import X.InterfaceC1883040z6M;
import X.InterfaceC1883720z7S;
import X.InterfaceC1885100z9g;
import X.InterfaceC1885140z9k;
import X.InterfaceC1885700zAe;
import X.InterfaceC485370J1r;
import X.RunnableC781530UlD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game_station.GameDetailVideosRequest;
import webcast.api.game_station.GameDetailVideosTabResponse;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoFeedCard extends AbstractC1882890z67<Object> implements InterfaceC485370J1r, InterfaceC1883720z7S {
    public static final int LLLIIIIL = (int) C497740JfY.LIZIZ(4.0f);
    public static final int LLLIIIL = (int) C497740JfY.LIZIZ(4.0f);
    public static final int LLLIIL = (int) C497740JfY.LIZIZ(20.0f);
    public boolean LLJJIJI;
    public C1885000z9W LLJJIJIIJIL;
    public C1885150z9l LLJJIJIL;
    public RunnableC781530UlD LLJJJ;
    public RelativeLayout LLJJJIL;
    public final List<C1885390zA9> LLJJJJ;
    public final AtomicBoolean LLJJJJJIL;
    public final HashSet<String> LLJJJJLIIL;
    public boolean LLJJL;
    public C16F5 LLJJLIIIJLLLLLLLZ;
    public C16F5 LLJL;
    public C1749280vcc LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public RadioGroup LLJLL;
    public HorizontalScrollView LLJLLIL;
    public boolean LLJLLL;
    public C16FZ LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public int LLLF;
    public boolean LLLFF;
    public C1885220z9s LLLFFI;
    public C1885560zAQ LLLFZ;
    public C1883480z74 LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;

    public final void LJJJJLL() {
        this.LLJJL = false;
        C1885150z9l c1885150z9l = this.LLJJIJIL;
        if (c1885150z9l != null) {
            c1885150z9l.LLILZ = false;
            c1885150z9l.notifyItemChanged(((ArrayList) this.LLJJJJ).size());
        }
    }

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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard.LJJJJLI():int");
    }

    public final void LJJJLL() {
        List list;
        LinearLayoutManager linearLayoutManager;
        View viewFindViewByPosition;
        C1885150z9l c1885150z9l = this.LLJJIJIL;
        if (c1885150z9l == null || (list = c1885150z9l.LLILLJJLI) == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty() || list.size() <= this.LLJJJJLIIL.size()) {
            return;
        }
        RunnableC781530UlD runnableC781530UlD = this.LLJJJ;
        RecyclerView.LayoutManager layoutManager = runnableC781530UlD != null ? runnableC781530UlD.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition <= 0 || list.size() < iFindLastVisibleItemPosition || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            C1885390zA9 c1885390zA9 = (C1885390zA9) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, list);
            if (c1885390zA9 != null && !this.LLJJJJLIIL.contains(c1885390zA9.LIZ.id) && linearLayoutManager != null && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                int[] iArr = new int[2];
                viewFindViewByPosition.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                Size sizeLIZIZ = C1883130z6V.LIZIZ(this);
                if (sizeLIZIZ == null) {
                    sizeLIZIZ = new Size(0, 0);
                }
                if (i >= 0 && i < sizeLIZIZ.getWidth() && i2 >= 0 && i2 < sizeLIZIZ.getHeight()) {
                    this.LLJJJJLIIL.add(c1885390zA9.LIZ.id);
                    String str = c1885390zA9.LIZ.id;
                    String strLIZ = C1883130z6V.LIZ(this);
                    InterfaceC1881340z3c interfaceC1881340z3c = this.LLILLL;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_rec_video_show");
                    c474500IjALIZ.LJJII(str, "video_id");
                    c474500IjALIZ.LJJII(strLIZ, "tab_name");
                    String strLJFF = C1882380z5I.LJFF(interfaceC1881340z3c != null ? C1882380z5I.LJIIIIZZ(interfaceC1881340z3c) : null, "sub_tab_name");
                    if (strLJFF == null) {
                        strLJFF = "";
                    }
                    c474500IjALIZ.LJJII(strLJFF, "sub_tab_name");
                    c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(interfaceC1881340z3c != null ? C1882380z5I.LIZLLL(interfaceC1881340z3c) : null)));
                    c474500IjALIZ.LIZ();
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public final void LJJJLZIJ() {
        ((GameDetailPageApi) C1881810z4N.LIZ(this, GameDetailPageApi.class)).requestGameDetailVideosTab(C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "game_id"), C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "game_tag_id")).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0z9U
            /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 223
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1884980z9U.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.0z6F
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("VideoFeedCard@7810.requestInitTags$2");
                Throwable th = (Throwable) obj;
                C20441214yg.LJI("VideoFeedCard", th);
                this.LL.LJJJJ(3007, C1883500z76.LIZ(th));
                if (Intrinsics.LJFF(C1883130z6V.LIZ(this.LL), "videos")) {
                    this.LL.LJJIJIIJIL();
                } else if (Intrinsics.LJFF(C1883130z6V.LIZ(this.LL), "home")) {
                    this.LL.LJJIJL();
                    VideoFeedCard videoFeedCard = this.LL;
                    videoFeedCard.LJJIIJZLJL(true);
                    videoFeedCard.LLJJ = true;
                    this.LL.LJJJLIIL();
                }
                C1CC2.LIZ("VideoFeedCard.requestInitTags", th);
                C1C7U.LIZIZ("VideoFeedCard@7810.requestInitTags$2");
            }
        });
    }

    public final void LJJL() {
        C1885560zAQ c1885560zAQ = this.LLLFZ;
        if (c1885560zAQ == null || c1885560zAQ.LIZ.getWidth() <= 0) {
            return;
        }
        C786410Ut5.bd(0.0f, c1885560zAQ.LIZ);
        ViewGroup viewGroup = c1885560zAQ.LIZ;
        viewGroup.layout(0, 0, viewGroup.getWidth(), c1885560zAQ.LIZ.getHeight());
    }

    @Override // X.InterfaceC1883720z7S
    public final void LJ() {
        RunnableC781530UlD runnableC781530UlD;
        if (C1883500z76.LIZIZ(this) || (runnableC781530UlD = this.LLJJJ) == null) {
            return;
        }
        runnableC781530UlD.scrollToPosition(0);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJ() {
        super.LJJ();
        LJJLI(false);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIIZI() {
        C1883100z6S c1883100z6S;
        C1883550z7B c1883550z7B;
        super.LJJIIZI();
        LJJJIL("on_action_up");
        if (C1883500z76.LIZIZ(this)) {
            return;
        }
        LJJJIL("scroll_to_bottom");
        LJJJIL("hashTagLoading");
        LJJJIL("hashTagSelect");
        InterfaceC1883040z6M interfaceC1883040z6M = this.LLIZ;
        if (!(interfaceC1883040z6M instanceof C1883100z6S) || (c1883100z6S = (C1883100z6S) interfaceC1883040z6M) == null) {
            return;
        }
        c1883100z6S.LLJJI = (View) this.LLLII.getValue();
        c1883100z6S.LLJJIII = 1;
        InterfaceC1883040z6M interfaceC1883040z6M2 = c1883100z6S.LLILLJJLI;
        if (!(interfaceC1883040z6M2 instanceof C1883550z7B) || (c1883550z7B = (C1883550z7B) interfaceC1883040z6M2) == null) {
            return;
        }
        c1883550z7B.LJJI(c1883100z6S.LLILLL.LIZ, true);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJ() {
        C1883100z6S c1883100z6S;
        Pair<? extends View, ? extends ViewTreeObserver.OnScrollChangedListener> pair;
        InterfaceC1885140z9k interfaceC1885140z9k;
        super.LJJIJ();
        this.LLJJIJI = true;
        C1885000z9W c1885000z9W = this.LLJJIJIIJIL;
        if (c1885000z9W != null) {
            c1885000z9W.LJIIJJI = null;
        }
        this.LLJJIJIIJIL = null;
        C1885560zAQ c1885560zAQ = this.LLLFZ;
        if (c1885560zAQ != null) {
            C1885570zAR c1885570zAR = c1885560zAQ.LIZJ;
            if (c1885570zAR != null) {
                c1885560zAQ.LIZIZ.removeOnScrollListener(c1885570zAR);
            }
            c1885560zAQ.LJ = null;
        }
        C1885110z9h c1885110z9h = (C1885110z9h) this.LLLIIII.getValue();
        InterfaceC1885100z9g interfaceC1885100z9g = (InterfaceC1885100z9g) ((Map) c1885110z9h.LIZIZ.getValue()).remove(this.LLJ);
        if (interfaceC1885100z9g != null) {
            interfaceC1885100z9g.Et1(null);
            interfaceC1885100z9g.Lz1(null);
            interfaceC1885100z9g.gZ0(null);
        }
        ((Map) c1885110z9h.LIZJ.getValue()).remove(this.LLJ);
        this.LLJJJJLIIL.clear();
        C1885220z9s c1885220z9s = this.LLLFFI;
        if (c1885220z9s != null && (interfaceC1885140z9k = c1885220z9s.LIZLLL) != null) {
            interfaceC1885140z9k.pause();
        }
        C1885220z9s c1885220z9s2 = this.LLLFFI;
        if (c1885220z9s2 != null) {
            Iterator it2 = ((ArrayList) c1885220z9s2.LIZJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1885140z9k) it2.next()).release();
            }
            ((ArrayList) c1885220z9s2.LIZJ).clear();
        }
        C1883480z74 c1883480z74 = this.LLLI;
        if (c1883480z74 != null && (pair = c1883480z74.LIZIZ) != null) {
            C786410Ut5.E3(pair.getFirst().getViewTreeObserver(), pair.getSecond());
            c1883480z74.LIZIZ = null;
        }
        this.LLLI = null;
        if (C1883500z76.LIZIZ(this)) {
            return;
        }
        InterfaceC1883040z6M interfaceC1883040z6M = this.LLIZ;
        if (!(interfaceC1883040z6M instanceof C1883100z6S) || (c1883100z6S = (C1883100z6S) interfaceC1883040z6M) == null) {
            return;
        }
        c1883100z6S.LJIJJLI((View) this.LLLII.getValue());
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJIIJI() {
        InterfaceC1885140z9k interfaceC1885140z9k;
        super.LJJIJIIJI();
        LJJJJJ("scroll_to_bottom");
        LJJJJJ("on_action_up");
        LJJJJJ("hashTagSelect");
        LJJJJJ("hashTagLoading");
        C1885220z9s c1885220z9s = this.LLLFFI;
        if (c1885220z9s == null || (interfaceC1885140z9k = c1885220z9s.LIZLLL) == null) {
            return;
        }
        interfaceC1885140z9k.pause();
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIL() {
        super.LJJIL();
        LJJIJIL();
        LJJJLZIJ();
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJJI() {
        super.LJJJJI();
        LJJLI(true);
    }

    public final void LJJJLIIL() {
        if (C1883500z76.LIZIZ(this) && this.LLLI == null) {
            this.LLLI = new C1883480z74(this);
            View view = this.LLILZLL;
            if (view != null) {
                C476770Imp.LIZIZ(view, new Runnable() { // from class: X.0z77
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VideoFeedCard@7810.registerHomeAutoPlayTrigger$1");
                        try {
                            C1883480z74 c1883480z74 = this.LL.LLLI;
                            if (c1883480z74 != null) {
                                c1883480z74.LIZIZ();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VideoFeedCard@7810.registerHomeAutoPlayTrigger$1");
                    }
                }, 500L);
            }
        }
    }

    @Override // X.InterfaceC485370J1r
    public final boolean isAutoPlay() {
        return C1883500z76.LIZIZ(this);
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gn_, viewGroup, false);
    }

    @Override // X.InterfaceC485370J1r
    public final void LJIILIIL(float f) {
        InterfaceC1885140z9k interfaceC1885140z9k;
        if (!C1883500z76.LIZIZ(this)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onContainerScroll ratio=");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("VideoFeedCard", C2188811AlT.LIZIZ(sbLIZ));
        if (0.0f <= f && f <= 1.0f) {
            LJJJJZI((int) (f * 4), -1L);
            return;
        }
        C1885220z9s c1885220z9s = this.LLLFFI;
        if (c1885220z9s == null || (interfaceC1885140z9k = c1885220z9s.LIZLLL) == null) {
            return;
        }
        interfaceC1885140z9k.pause();
    }

    @Override // X.AbstractC1882890z67, X.InterfaceC1882930z6B
    public final void LJIJ(int i) {
        InterfaceC1885140z9k interfaceC1885140z9k;
        super.LJIJ(i);
        C1885220z9s c1885220z9s = this.LLLFFI;
        if (c1885220z9s != null && (interfaceC1885140z9k = c1885220z9s.LIZLLL) != null) {
            interfaceC1885140z9k.pause();
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIZ(int i) {
        C1882420z5M c1882420z5MLIZLLL;
        InterfaceC1885140z9k interfaceC1885140z9k;
        super.LJJIZ(i);
        C1885220z9s c1885220z9s = this.LLLFFI;
        if (c1885220z9s != null && (interfaceC1885140z9k = c1885220z9s.LIZLLL) != null) {
            interfaceC1885140z9k.play();
        }
        if (C1883500z76.LIZIZ(this) && !this.LLL) {
            InterfaceC1881340z3c interfaceC1881340z3c = this.LLILLL;
            String strLIZ = C1883130z6V.LIZ(this);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_module_show");
            if (interfaceC1881340z3c != null) {
                c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
            } else {
                c1882420z5MLIZLLL = null;
            }
            c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
            c474500IjALIZ.LJJII(strLIZ, "tab_name");
            c474500IjALIZ.LJJII("video", "module_name");
            c474500IjALIZ.LIZ();
            this.LLL = true;
        }
        if (!C1883500z76.LIZIZ(this) && this.LLJLLL) {
            this.LLJLLL = false;
            C1880070z1Z.LJIIJJI(this.LLILLL, 1);
        }
        LJJJLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [X.0zAc] */
    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        C1885250z9v c1885250z9v;
        InterfaceC1881340z3c interfaceC1881340z3c;
        Context context;
        InterfaceC1881340z3c interfaceC1881340z3c2;
        InterfaceC1882450z5P host;
        Fragment fragment;
        InterfaceC1885100z9g interfaceC1885100z9g;
        this.LLILZLL = view;
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.ire);
        this.LLJJJ = runnableC781530UlD;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setHasFixedSize(true);
        }
        this.LLJJJIL = (RelativeLayout) view.findViewById(R.id.y0w);
        this.LLJJLIIIJLLLLLLLZ = (C16F5) view.findViewById(R.id.y38);
        this.LLJL = (C16F5) view.findViewById(R.id.y1d);
        this.LLJZ = (C16FZ) view.findViewById(R.id.irh);
        this.LLJLIL = (C1749280vcc) view.findViewById(R.id.tf5);
        this.LLJLILLLLZIIL = (ViewGroup) view.findViewById(R.id.tei);
        this.LLJLLIL = (HorizontalScrollView) view.findViewById(R.id.ira);
        this.LLJLL = (RadioGroup) view.findViewById(R.id.irb);
        C1885210z9r c1885210z9r = new C1885210z9r(this);
        if (!C1883500z76.LIZIZ(this)) {
            c1885250z9v = new C1885250z9v(this);
        } else {
            c1885250z9v = null;
        }
        final C1885060z9c c1885060z9c = new C1885060z9c(this);
        C1885110z9h c1885110z9h = (C1885110z9h) this.LLLIIII.getValue();
        int height = 0;
        if (c1885110z9h.LIZ(this) == null && (interfaceC1881340z3c = this.LLILLL) != null && (context = interfaceC1881340z3c.getContext()) != null && (interfaceC1881340z3c2 = this.LLILLL) != null && (host = interfaceC1881340z3c2.getHost()) != null && (fragment = host.getFragment()) != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = false;
            c20603715jn.LIZ = 5;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            Object gameMixAwemeVideosModel = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getGameMixAwemeVideosModel(fragment.getLifecycle(), C1883500z76.LIZIZ(this));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("awemeVideosModel, lifecycle =");
            sbLIZ.append(fragment);
            sbLIZ.append(", model =");
            sbLIZ.append(gameMixAwemeVideosModel);
            C20441214yg.LIZIZ("GameDetailVideoFeedService", C2188811AlT.LIZIZ(sbLIZ));
            if ((gameMixAwemeVideosModel instanceof InterfaceC1885100z9g) && (interfaceC1885100z9g = (InterfaceC1885100z9g) gameMixAwemeVideosModel) != 0) {
                interfaceC1885100z9g.Fl1(new C1882020z4i(this));
                interfaceC1885100z9g.pQ(fragment, viewOnAttachStateChangeListenerC20604515jv.getState());
                AbstractC329610Cw3<?> abstractC329610Cw3G12 = interfaceC1885100z9g.G12();
                if (abstractC329610Cw3G12 != null) {
                    viewOnAttachStateChangeListenerC20604515jv.LJIIL(abstractC329610Cw3G12);
                }
                interfaceC1885100z9g.Et1(new C1885310zA1(c1885210z9r));
                interfaceC1885100z9g.gZ0(c1885250z9v);
                interfaceC1885100z9g.Lz1(new InterfaceC1885700zAe() { // from class: X.0zAc
                    @Override // X.InterfaceC1885700zAe
                    public final void LIZ(C1885690zAd c1885690zAd) {
                        InterfaceC1631620sYq<String, Float, Long, Unit> interfaceC1631620sYq = c1885060z9c;
                        if (interfaceC1631620sYq != null) {
                            interfaceC1631620sYq.invoke(c1885690zAd.LIZ, Float.valueOf(c1885690zAd.LIZIZ), Long.valueOf(c1885690zAd.LIZJ));
                        }
                    }
                });
                ((Map) c1885110z9h.LIZIZ.getValue()).put(this.LLJ, interfaceC1885100z9g);
            }
            ((Map) c1885110z9h.LIZJ.getValue()).put(this.LLJ, new GameDetailVideosRequest());
        }
        LJJJIL("on_action_up");
        if (C1883500z76.LIZIZ(this)) {
            HorizontalScrollView horizontalScrollView = this.LLJLLIL;
            if (horizontalScrollView != null) {
                C500260Jjc.LJIILIIL(horizontalScrollView);
            }
            LJJJZ(null);
            return;
        }
        HorizontalScrollView horizontalScrollView2 = this.LLJLLIL;
        if (horizontalScrollView2 != null) {
            C500260Jjc.LLFFF(horizontalScrollView2);
        }
        LJJJIL("scroll_to_bottom");
        LJJJIL("hashTagLoading");
        LJJJIL("hashTagSelect");
        LJJJLZIJ();
        RunnableC781530UlD runnableC781530UlD2 = this.LLJJJ;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setTag(Integer.valueOf(R.id.yv8));
        }
        Size sizeLIZIZ = C1883130z6V.LIZIZ(this);
        if (sizeLIZIZ != null) {
            height = sizeLIZIZ.getHeight();
        }
        LJJJJJL(height);
    }

    public final void LJJJJZ(String str) {
        if (!LJJIIZ()) {
            return;
        }
        if (this.LLJZIJLIL) {
            if (this.LLJJL) {
                if (this.LLJJJJJIL.get()) {
                    C20441214yg.LIZIZ("VideoFeedCard", "has loading");
                    return;
                }
                this.LLJJJJJIL.set(true);
                C20441214yg.LIZIZ("VideoFeedCard", "loadingMoreVideo");
                LJJJI(Boolean.TRUE, "hashTagLoading");
                C1885110z9h c1885110z9h = (C1885110z9h) this.LLLIIII.getValue();
                GameDetailVideosRequest gameDetailVideosRequest = (GameDetailVideosRequest) ((Map) c1885110z9h.LIZJ.getValue()).get(LIZLLL());
                if (gameDetailVideosRequest == null) {
                    return;
                }
                gameDetailVideosRequest.pullType = 1;
                InterfaceC1885100z9g interfaceC1885100z9gLIZ = c1885110z9h.LIZ(this);
                if (interfaceC1885100z9gLIZ == null) {
                    return;
                }
                interfaceC1885100z9gLIZ.nT1(gameDetailVideosRequest);
                interfaceC1885100z9gLIZ.G12().getOperator().LIZ(null);
                return;
            }
            return;
        }
        C1885000z9W c1885000z9W = this.LLJJIJIIJIL;
        if (c1885000z9W == null) {
            return;
        }
        c1885000z9W.LIZIZ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJZ(webcast.api.game_station.GameDetailVideosTabResponse.ResponseData.GameDetailVideosTab r7) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.detailpage.VideoFeedCard.LJJJZ(webcast.api.game_station.GameDetailVideosTabResponse$ResponseData$GameDetailVideosTab):void");
    }

    public final void LJJLI(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LLJLILLLLZIIL;
            if (viewGroup != null) {
                C500260Jjc.LLFFF(viewGroup);
            }
            C1749280vcc c1749280vcc = this.LLJLIL;
            if (c1749280vcc != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LJFF(c1722300uv6, new C0T50(this));
                c1749280vcc.setStatus(c1722300uv6);
            }
            C1749280vcc c1749280vcc2 = this.LLJLIL;
            if (c1749280vcc2 != null) {
                c1749280vcc2.setButtonTopMargin(C497740JfY.LIZIZ(24.0f));
            }
            LJJLIIIIJ(false);
            return;
        }
        ViewGroup viewGroup2 = this.LLJLILLLLZIIL;
        if (viewGroup2 == null) {
            return;
        }
        C476770Imp.LIZJ(viewGroup2, new Runnable() { // from class: X.0T4r
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoFeedCard@7810.showPageRetryStatusView$2");
                try {
                    ViewGroup viewGroup3 = this.LL.LLJLILLLLZIIL;
                    if (viewGroup3 != null) {
                        C500260Jjc.LJIILIIL(viewGroup3);
                    }
                    VideoFeedCard videoFeedCard = this.LL;
                    if (videoFeedCard.LLJZIJLIL) {
                        videoFeedCard.LJJLIIIIJ(true);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoFeedCard@7810.showPageRetryStatusView$2");
            }
        });
    }

    public final void LJJLIIIIJ(boolean z) {
        C1883100z6S c1883100z6S;
        C1883550z7B c1883550z7B;
        InterfaceC1883040z6M interfaceC1883040z6M = this.LLIZ;
        if ((interfaceC1883040z6M instanceof C1883100z6S) && (c1883100z6S = (C1883100z6S) interfaceC1883040z6M) != null) {
            InterfaceC1883040z6M interfaceC1883040z6M2 = c1883100z6S.LLILLJJLI;
            if ((interfaceC1883040z6M2 instanceof C1883550z7B) && (c1883550z7B = (C1883550z7B) interfaceC1883040z6M2) != null) {
                int i = c1883100z6S.LLILLL.LIZ;
                C1883570z7D c1883570z7D = c1883550z7B.LLJILJILJ;
                if (c1883570z7D != null && !Intrinsics.LJFF(((HashMap) c1883570z7D.LLILZLL.getValue()).get(Integer.valueOf(i)), Boolean.valueOf(z))) {
                    ((HashMap) c1883570z7D.LLILZLL.getValue()).put(Integer.valueOf(i), Boolean.valueOf(z));
                    c1883570z7D.LJJIJIL(i);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1882890z67
    public final void LJJIII(Object obj, String str) {
        switch (str.hashCode()) {
            case -1403061264:
                if (str.equals("hashTagLoading") && (obj instanceof Boolean)) {
                    final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    RadioGroup radioGroup = this.LLJLL;
                    if (radioGroup != null) {
                        Iterator<View> it2 = new C09RD(radioGroup).iterator();
                        while (true) {
                            C09RE c09re = (C09RE) it2;
                            if (c09re.hasNext()) {
                                final View view = (View) c09re.next();
                                C476770Imp.LIZJ(view, new Runnable() { // from class: X.01vo
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("VideoFeedCard@7810.disableTagClick$1$1");
                                        try {
                                            view.setClickable(!zBooleanValue);
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("VideoFeedCard@7810.disableTagClick$1$1");
                                    }
                                });
                            }
                        }
                    }
                    break;
                }
                break;
            case -823594040:
                if (str.equals("hashTagSelect")) {
                    C20441214yg.LIZIZ("VideoFeedCard", "ON HASH_TAG_SELECT");
                    LJJLI(false);
                    this.LLJJJJLIIL.clear();
                    if (obj instanceof GameDetailVideosTabResponse.ResponseData.GameDetailVideosTab) {
                        GameDetailVideosTabResponse.ResponseData.GameDetailVideosTab gameDetailVideosTab = (GameDetailVideosTabResponse.ResponseData.GameDetailVideosTab) obj;
                        if (gameDetailVideosTab.tabType == 4) {
                            this.LLJZIJLIL = false;
                            LJJLIIIIJ(false);
                            if (this.LLJJIJIIJIL == null) {
                                this.LLJJIJIIJIL = new C1885000z9W();
                            }
                            C1885000z9W c1885000z9W = this.LLJJIJIIJIL;
                            if (c1885000z9W != null) {
                                String strLJFF = C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "game_id");
                                String strLJFF2 = C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "game_tag_id");
                                RunnableC781530UlD runnableC781530UlD = this.LLJJJ;
                                C16FZ c16fz = this.LLJZ;
                                C1749280vcc c1749280vcc = this.LLJLIL;
                                ViewGroup viewGroup = this.LLJLILLLLZIIL;
                                C1885330zA3 c1885330zA3 = c1885000z9W.LIZ;
                                c1885330zA3.LIZ = strLJFF;
                                c1885330zA3.LIZIZ = strLJFF2;
                                c1885330zA3.LIZJ = 30;
                                c1885330zA3.LIZLLL = 0;
                                c1885000z9W.LJIIJ.clear();
                                c1885000z9W.LJFF = runnableC781530UlD;
                                c1885000z9W.LIZIZ = c16fz;
                                c1885000z9W.LJII = c1749280vcc;
                                c1885000z9W.LJIIIIZZ = viewGroup;
                                c1885000z9W.LJIIIZ = this;
                                c1885000z9W.LJI = new C1833330xoB(c1885000z9W, c1885000z9W.LIZLLL);
                                c1885000z9W.LIZJ();
                            }
                            C1885000z9W c1885000z9W2 = this.LLJJIJIIJIL;
                            if (c1885000z9W2 != null) {
                                c1885000z9W2.LJIIJJI = new C1885370zA7(this);
                            }
                        } else {
                            this.LLJZIJLIL = true;
                            LJJLIIIIJ(true);
                            LJJJZ(gameDetailVideosTab);
                        }
                    }
                }
                break;
            case 56508132:
                if (str.equals("on_action_up") && LJJIIZ()) {
                    if (!this.LLJZIJLIL && !Intrinsics.LJFF("home", C1883130z6V.LIZ(this))) {
                        C1885000z9W c1885000z9W3 = this.LLJJIJIIJIL;
                        if (c1885000z9W3 != null) {
                            c1885000z9W3.LIZIZ(str);
                        }
                    } else {
                        LJJJLL();
                    }
                    break;
                }
                break;
            case 1397022077:
                if (str.equals("scroll_to_bottom")) {
                    LJJJJZ(str);
                }
                break;
        }
    }

    public final void LJJJJZI(int i, long j) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C1885120z9i c1885120z9i;
        InterfaceC1885140z9k interfaceC1885140z9k;
        RunnableC781530UlD runnableC781530UlD = this.LLJJJ;
        if (runnableC781530UlD != null) {
            viewHolderFindViewHolderForAdapterPosition = runnableC781530UlD.findViewHolderForAdapterPosition(i);
        } else {
            viewHolderFindViewHolderForAdapterPosition = null;
        }
        if ((viewHolderFindViewHolderForAdapterPosition instanceof C1885120z9i) && (interfaceC1885140z9k = (c1885120z9i = (C1885120z9i) viewHolderFindViewHolderForAdapterPosition).LLILLL) != null) {
            if (this.LLJJIJIL != null) {
                C1885150z9l.LLLIIIIL(c1885120z9i.LLJIJIL, InterfaceC1106030et7.v4.LIZIZ().booleanValue());
            }
            C1885220z9s c1885220z9s = this.LLLFFI;
            if (c1885220z9s != null && (!Intrinsics.LJFF(interfaceC1885140z9k, c1885220z9s.LIZLLL) || !interfaceC1885140z9k.isPlaying())) {
                InterfaceC1885140z9k interfaceC1885140z9k2 = c1885220z9s.LIZLLL;
                if (interfaceC1885140z9k2 != null) {
                    interfaceC1885140z9k2.pause();
                }
                c1885220z9s.LIZLLL = interfaceC1885140z9k;
                interfaceC1885140z9k.LIZ(InterfaceC1106030et7.v4.LIZIZ().booleanValue());
                if (j > 0) {
                    InterfaceC1885140z9k interfaceC1885140z9k3 = c1885220z9s.LIZLLL;
                    if (interfaceC1885140z9k3 != null) {
                        interfaceC1885140z9k3.LIZLLL(j);
                    }
                } else {
                    InterfaceC1885140z9k interfaceC1885140z9k4 = c1885220z9s.LIZLLL;
                    if (interfaceC1885140z9k4 != null) {
                        interfaceC1885140z9k4.play();
                    }
                }
            }
            TuxIconView tuxIconView = c1885120z9i.LLJIJIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
        }
    }

    public VideoFeedCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
        this.LLJJJJ = new ArrayList();
        this.LLJJJJJIL = new AtomicBoolean(false);
        this.LLJJJJLIIL = new HashSet<>();
        this.LLJJL = true;
        this.LLJLLL = true;
        this.LLLII = C452501pT.LIZIZ(new C1885230z9t(context));
        this.LLLIIII = C452501pT.LIZIZ(new C1885280z9y(this));
    }
}
