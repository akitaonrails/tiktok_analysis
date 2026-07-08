package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gameinfo;

import X.AbstractC1882890z67;
import X.C1155600gB4;
import X.C1324720kZq;
import X.C1723806p2;
import X.C1882650z5j;
import X.C197039127h;
import X.C786410Ut5;
import X.InterfaceC1881340z3c;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class SearchGameInfoCard extends AbstractC1882890z67<SearchGameInfoCardModel> {
    public C1324720kZq LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public C197039127h LLJJJ;
    public Runnable LLJJJIL;

    @Override // X.AbstractC1882890z67
    public final void LJJIII(Object obj, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gameinfo.SearchGameInfoCard.LJJJJLI():void");
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJ() {
        C1882650z5j.LIZLLL(this);
        super.LJJIJ();
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJLIJ() {
        super.LJJIJLIJ();
        LJJJJLI();
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.hyw, viewGroup, false);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIZ(int i) {
        super.LJJIZ(i);
        Runnable runnable = this.LLJJJIL;
        if (runnable != null) {
            runnable.run();
        }
        this.LLJJJIL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        this.LLILZLL = view;
        this.LLJJIJI = (C1324720kZq) view.findViewById(R.id.jxe);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.title);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.wgz);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.a0x);
        this.LLJJJ = c197039127h;
        if (c197039127h != null) {
            c197039127h.LJJJJL(new C1723806p2());
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0z1e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C1879890z1H.LIZJ(this.LL.LLILLL, "card", null, null);
                    this.LL.LJJJI(null, "didClickSearchGameInfoBg");
                    this.LL.LJJJI(null, "open_game_detail");
                }
            }, view2);
        }
        SearchGameInfoCardModel searchGameInfoCardModel = (SearchGameInfoCardModel) this.LLILZIL;
        if (searchGameInfoCardModel != null && searchGameInfoCardModel.gameInfo != null) {
            LJJJJLI();
            LJJIJL();
            final View view3 = this.LLILZLL;
            if (view3 != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view3, new Runnable() { // from class: X.0z1W
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() {
                        /*
                            r6 = this;
                            com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gameinfo.SearchGameInfoCard r5 = r2
                            M r0 = r5.LLILZIL
                            com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gameinfo.SearchGameInfoCardModel r0 = (com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gameinfo.SearchGameInfoCardModel) r0
                            if (r0 == 0) goto Lab
                            com.bytedance.android.livesdk.game.model.GameStationGameInfo r0 = r0.gameInfo
                            if (r0 == 0) goto Lab
                            com.bytedance.android.livesdk.game.model.GameCTAInfo r4 = r0.gameCtaInfo
                            if (r4 == 0) goto Lab
                            int r1 = r4.gameCtaStatus
                            r0 = 2
                            r3 = 0
                            if (r1 == r0) goto L2c
                            java.lang.String r1 = "view"
                            r0 = r3
                            r3 = r1
                        L1a:
                            X.0z3c r5 = r5.LLILLL
                            java.lang.String r2 = r4.ctaLogExtra
                            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                            r4.<init>()
                            if (r2 == 0) goto L9f
                            boolean r1 = X.C476770Imp.LIZLLL(r2)
                            if (r1 == 0) goto L9f
                            goto L7b
                        L2c:
                            int r0 = r4.ctaType
                            r2 = 1
                            if (r0 != r2) goto L79
                            X.0z3c r0 = r5.LLILLL
                            X.0z5L r1 = X.C1882380z5I.LJIIIIZZ(r0)
                            if (r1 == 0) goto L76
                            X.0z3c r0 = r1.LIZ
                            java.lang.String r1 = r1.LIZIZ
                            if (r0 == 0) goto L74
                            X.0z5U r0 = r0.LJJIIZI()
                            java.lang.Object r1 = r0.LIZ(r1)
                            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
                            if (r0 != 0) goto L4c
                            r1 = r3
                        L4c:
                            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
                            if (r1 == 0) goto L74
                            java.lang.String r0 = "is_registered_user"
                            java.lang.Object r1 = r1.get(r0)
                        L56:
                            boolean r0 = r1 instanceof java.lang.Boolean
                            if (r0 == 0) goto L5b
                            r3 = r1
                        L5b:
                            java.lang.Boolean r3 = (java.lang.Boolean) r3
                            if (r3 == 0) goto L76
                            boolean r0 = r3.booleanValue()
                        L63:
                            if (r0 == 0) goto L71
                            java.lang.String r3 = "registered"
                        L67:
                            int r0 = r4.jumpLinkType
                            if (r0 != 0) goto L6c
                            r2 = 0
                        L6c:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                            goto L1a
                        L71:
                            java.lang.String r3 = "pre_register"
                            goto L67
                        L74:
                            r1 = r3
                            goto L56
                        L76:
                            boolean r0 = r4.isRegisteredUser
                            goto L63
                        L79:
                            r0 = r3
                            goto L1a
                        L7b:
                            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L88
                            r1.<init>(r2)     // Catch: java.lang.Throwable -> L88
                            java.util.Map r2 = X.C500260Jjc.LLF(r1)     // Catch: java.lang.Throwable -> L88
                            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L88
                            goto L94
                        L88:
                            r1 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                            X.00Yq r2 = new X.00Yq
                            r2.<init>(r1)
                            X.C189200o6.m2constructorimpl(r2)
                        L94:
                            boolean r1 = X.C189200o6.m8isSuccessimpl(r2)
                            if (r1 == 0) goto L9f
                            java.util.Map r2 = (java.util.Map) r2
                            r4.putAll(r2)
                        L9f:
                            if (r3 == 0) goto La6
                            java.lang.String r1 = "btn_name"
                            r4.put(r1, r3)
                        La6:
                            java.lang.String r1 = "game_card"
                            X.C1879890z1H.LIZIZ(r5, r1, r4, r0)
                        Lab:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1880040z1W.LIZ():void");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SearchGameInfoCard@d14.onViewCreated$$inlined$doOnPreDraw$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SearchGameInfoCard@d14.onViewCreated$$inlined$doOnPreDraw$1");
                    }
                });
                return;
            }
            return;
        }
        LJJJJ(3996, "");
        LJJIJIIJIL();
    }

    public SearchGameInfoCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
    }
}
