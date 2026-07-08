package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.download;

import X.AbstractC1882890z67;
import X.C1155600gB4;
import X.C16F5;
import X.C197039127h;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1880290z1v;
import X.InterfaceC1881340z3c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.download.DownloadCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.download.GameDownloadCardModel;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class DownloadCard extends AbstractC1882890z67<GameDownloadCardModel> {
    public C197039127h LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1882890z67, X.InterfaceC1883030z6L
    public final boolean LIZ() {
        GameStationGameInfo gameStationGameInfo;
        GameDownloadCardModel gameDownloadCardModel = (GameDownloadCardModel) this.LLILZIL;
        GameCTAInfo gameCTAInfo = (gameDownloadCardModel == null || (gameStationGameInfo = gameDownloadCardModel.gameInfo) == null) ? null : gameStationGameInfo.gameCtaInfo;
        return gameCTAInfo != null && gameCTAInfo.gameCtaStatus > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJLI() {
        GameStationGameInfo gameStationGameInfo;
        GameCTAInfo gameCTAInfo;
        String str;
        GameStationGameInfo gameStationGameInfo2;
        GameCTAInfo gameCTAInfo2;
        GameStationGameInfo gameStationGameInfo3;
        GameCTAInfo gameCTAInfo3;
        String str2;
        GameStationGameInfo gameStationGameInfo4;
        GameCTAInfo gameCTAInfo4;
        if (this.LLJJIJI == null) {
            return;
        }
        if (!LIZ()) {
            View view = this.LLILZLL;
            if (view != null) {
                C500260Jjc.LJIILIIL(view);
                return;
            }
            return;
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C500260Jjc.LLFFF(view2);
        }
        C197039127h c197039127h = this.LLJJIJI;
        if (c197039127h != null) {
            C500260Jjc.LLFFF(c197039127h);
        }
        C197039127h c197039127h2 = this.LLJJIJI;
        String str3 = "";
        if (c197039127h2 != null) {
            GameDownloadCardModel gameDownloadCardModel = (GameDownloadCardModel) this.LLILZIL;
            if (gameDownloadCardModel == null || (gameStationGameInfo4 = gameDownloadCardModel.gameInfo) == null || (gameCTAInfo4 = gameStationGameInfo4.gameCtaInfo) == null || (str2 = gameCTAInfo4.ctaText) == null) {
                str2 = "";
            }
            c197039127h2.setText(str2);
        }
        GameDownloadCardModel gameDownloadCardModel2 = (GameDownloadCardModel) this.LLILZIL;
        if (gameDownloadCardModel2 == null || (gameStationGameInfo3 = gameDownloadCardModel2.gameInfo) == null || (gameCTAInfo3 = gameStationGameInfo3.gameCtaInfo) == null || gameCTAInfo3.gameCtaStatus != 2) {
            this.LLJJIJIL = true;
            C197039127h c197039127h3 = this.LLJJIJI;
            if (c197039127h3 != null) {
                c197039127h3.setEnabled(false);
            }
            C500260Jjc.LLFFF(this.LLJJIJIIJIL);
            C16F5 c16f5 = this.LLJJIJIIJIL;
            if (c16f5 != null) {
                GameDownloadCardModel gameDownloadCardModel3 = (GameDownloadCardModel) this.LLILZIL;
                if (gameDownloadCardModel3 != null && (gameStationGameInfo = gameDownloadCardModel3.gameInfo) != null && (gameCTAInfo = gameStationGameInfo.gameCtaInfo) != null && (str = gameCTAInfo.gameCtaCloseReasonText) != null) {
                    str3 = str;
                }
                c16f5.setText(str3);
            }
        } else {
            this.LLJJIJIL = false;
            C197039127h c197039127h4 = this.LLJJIJI;
            if (c197039127h4 != null) {
                c197039127h4.setEnabled(true);
            }
            C500260Jjc.LJIILIIL(this.LLJJIJIIJIL);
        }
        InterfaceC1880290z1v interfaceC1880290z1v = (InterfaceC1880290z1v) this.LLILLL.LJIILJJIL().LIZ(InterfaceC1880290z1v.class);
        if (interfaceC1880290z1v != null) {
            interfaceC1880290z1v.LJ(!this.LLJJIJIL);
            C197039127h c197039127hLJIIIZ = interfaceC1880290z1v.LJIIIZ();
            if (c197039127hLJIIIZ != null) {
                GameDownloadCardModel gameDownloadCardModel4 = (GameDownloadCardModel) this.LLILZIL;
                c197039127hLJIIIZ.setText((gameDownloadCardModel4 == null || (gameStationGameInfo2 = gameDownloadCardModel4.gameInfo) == null || (gameCTAInfo2 = gameStationGameInfo2.gameCtaInfo) == null) ? null : gameCTAInfo2.ctaTopBarText);
            }
            C197039127h c197039127hLJIIIZ2 = interfaceC1880290z1v.LJIIIZ();
            if (c197039127hLJIIIZ2 != null) {
                C786410Ut5.U8(c197039127hLJIIIZ2, new View.OnClickListener() { // from class: X.0z1u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        DownloadCard downloadCard = this.LL;
                        if (!downloadCard.LLJJIJIL) {
                            downloadCard.LJJJI(null, "didClickDownloadBtn");
                        }
                    }
                });
            }
        }
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

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gmz, viewGroup, false);
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        this.LLILZLL = view;
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.g40);
        this.LLJJIJI = c197039127h;
        if (c197039127h != null) {
            C500260Jjc.LJIILIIL(c197039127h);
        }
        this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.zdw);
        C197039127h c197039127h2 = this.LLJJIJI;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new View.OnClickListener() { // from class: X.0z1t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DownloadCard downloadCard = this.LL;
                    if (!downloadCard.LLJJIJIL) {
                        downloadCard.LJJJI(null, "didClickDownloadBtn");
                    }
                }
            });
        }
        LJJJJLI();
        LJJIJL();
        C197039127h c197039127h3 = this.LLJJIJI;
        if (c197039127h3 != null) {
            HandlerHook.viewPost(c197039127h3, new Runnable() { // from class: X.0z1O
                /* JADX WARN: Multi-variable type inference failed */
                public final void LIZ() {
                    GameStationGameInfo gameStationGameInfo;
                    GameCTAInfo gameCTAInfo;
                    GameStationGameInfo gameStationGameInfo2;
                    GameCTAInfo gameCTAInfo2;
                    C197039127h c197039127h4 = this.LL.LLJJIJI;
                    if (c197039127h4 == null || c197039127h4.getParent() == null || !C500260Jjc.LJJJJIZL(this.LL.LLJJIJI)) {
                        return;
                    }
                    DownloadCard downloadCard = this.LL;
                    if (downloadCard.LLJJJ) {
                        return;
                    }
                    String strLJFF = C1882380z5I.LJFF(C1882380z5I.LIZJ(downloadCard.LLILLL), "host_id");
                    String strLJFF2 = C1882380z5I.LJFF(C1882380z5I.LIZJ(downloadCard.LLILLL), "task_id");
                    GameDownloadCardModel gameDownloadCardModel = (GameDownloadCardModel) downloadCard.LLILZIL;
                    Integer numValueOf = (gameDownloadCardModel == null || (gameStationGameInfo2 = gameDownloadCardModel.gameInfo) == null || (gameCTAInfo2 = gameStationGameInfo2.gameCtaInfo) == null) ? null : Integer.valueOf(gameCTAInfo2.gameCtaStatus);
                    InterfaceC1881340z3c interfaceC1881340z3c = downloadCard.LLILLL;
                    GameDownloadCardModel gameDownloadCardModel2 = (GameDownloadCardModel) downloadCard.LLILZIL;
                    String str = (gameDownloadCardModel2 == null || (gameStationGameInfo = gameDownloadCardModel2.gameInfo) == null || (gameCTAInfo = gameStationGameInfo.gameCtaInfo) == null) ? null : gameCTAInfo.ctaLogExtra;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_show");
                    C1880070z1Z.LIZ(c474500IjALIZ, interfaceC1881340z3c);
                    c474500IjALIZ.LJJII("download", "btn_name");
                    c474500IjALIZ.LJJII(strLJFF, "host_id");
                    c474500IjALIZ.LJJII((numValueOf == null || numValueOf.intValue() != 1) ? CardStruct.IStatusCode.DEFAULT : "1", "is_grey");
                    c474500IjALIZ.LJJII(strLJFF2, "game_task_id");
                    if (str != null && str.length() != 0) {
                        try {
                            c474500IjALIZ.LJJIIJZLJL(new JSONObject(str));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(interfaceC1881340z3c != null ? C1882380z5I.LIZLLL(interfaceC1881340z3c) : null)));
                    c474500IjALIZ.LIZ();
                    this.LL.LLJJJ = true;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DownloadCard@3353.onViewCreated$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DownloadCard@3353.onViewCreated$2");
                }
            });
        }
    }

    public DownloadCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
    }
}
