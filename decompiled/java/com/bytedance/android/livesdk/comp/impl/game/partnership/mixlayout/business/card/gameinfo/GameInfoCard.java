package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameinfo;

import X.AbstractC1882890z67;
import X.C1155600gB4;
import X.C1324720kZq;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1881340z3c;
import X.ViewTreeObserverOnPreDrawListenerC1908040zkg;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.common.model.GameInfoCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameinfo.GameInfoCard;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class GameInfoCard extends AbstractC1882890z67<GameInfoCardModel> {
    public C1324720kZq LLJJIJI;
    public C1324720kZq LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public TextView LLJJJ;
    public TextView LLJJJIL;
    public TextView LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b5, code lost:
    
        if (r2 != null) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI() {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameinfo.GameInfoCard.LJJJJLI():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJJJJLL() {
        GameStationGameInfo gameStationGameInfo;
        GameInfoCardModel gameInfoCardModel = (GameInfoCardModel) this.LLILZIL;
        return (gameInfoCardModel == null || (gameStationGameInfo = gameInfoCardModel.gameInfo) == null || gameStationGameInfo.gameSource != 0) ? false : true;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJLIJ() {
        super.LJJIJLIJ();
        LJJJJLI();
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIIZI() {
        super.LJJIIZI();
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJIIJI() {
        super.LJJIJIIJI();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0z7U] */
    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.hyt, viewGroup, false);
        new ViewTreeObserverOnPreDrawListenerC1908040zkg(viewTd, new Runnable() { // from class: X.0z7U
            public final void LIZ() {
                GameInfoCard gameInfoCard = this.LL;
                InterfaceC1881340z3c interfaceC1881340z3c = gameInfoCard.LLILLL;
                String strLIZ = C1883130z6V.LIZ(gameInfoCard);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_module_show");
                c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(interfaceC1881340z3c != null ? C1882380z5I.LIZLLL(interfaceC1881340z3c) : null)));
                c474500IjALIZ.LJJII("info", "module_name");
                c474500IjALIZ.LJJII(strLIZ, "tab_name");
                c474500IjALIZ.LIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GameInfoCard@8f9d.onCreateView$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GameInfoCard@8f9d.onCreateView$1$1");
            }
        });
        return viewTd;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        Drawable drawableLIZIZ;
        this.LLILZLL = view;
        this.LLJJIJI = (C1324720kZq) view.findViewById(R.id.iqx);
        this.LLJJIJIIJIL = (C1324720kZq) view.findViewById(R.id.iqy);
        this.LLJJIJIL = (FrameLayout) view.findViewById(R.id.iqw);
        this.LLJJJ = (TextView) view.findViewById(R.id.irk);
        this.LLJJJIL = (TextView) view.findViewById(R.id.zn3);
        this.LLJJJJ = (TextView) view.findViewById(R.id.tv_tags);
        this.LLJJJJJIL = (ViewGroup) view.findViewById(R.id.vg_tag_container);
        this.LLJJJJLIIL = (ViewGroup) view.findViewById(R.id.b8k);
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout != null) {
            if (LJJJJLL()) {
                drawableLIZIZ = C800330VaR.LIZIZ(this.LL, R.drawable.f6x);
            } else {
                drawableLIZIZ = C800330VaR.LIZIZ(this.LL, R.drawable.f6w);
            }
            frameLayout.setBackground(drawableLIZIZ);
        }
        LJJJJLI();
        LJJIJL();
    }

    public GameInfoCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
    }
}
