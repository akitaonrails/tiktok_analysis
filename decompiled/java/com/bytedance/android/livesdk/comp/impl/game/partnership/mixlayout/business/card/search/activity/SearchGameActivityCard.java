package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.activity;

import X.AbstractC1882890z67;
import X.C1155600gB4;
import X.C13LP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.InterfaceC1881340z3c;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.activity.SearchGameActivityCard;
import com.bytedance.android.livesdk.game.model.GameStationOuterActivityInfo;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class SearchGameActivityCard extends AbstractC1882890z67<SearchActivityCardModel> {
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.hyv, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        List<GameStationOuterActivityInfo> list;
        final GameStationOuterActivityInfo gameStationOuterActivityInfo;
        this.LLILZLL = view;
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.title);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.a0x);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zr);
        view.setBackground(c384050F3z.LIZ(this.LL));
        SearchActivityCardModel searchActivityCardModel = (SearchActivityCardModel) this.LLILZIL;
        if (searchActivityCardModel != null && (list = searchActivityCardModel.activityList) != null && (gameStationOuterActivityInfo = (GameStationOuterActivityInfo) C13LP.LJJJLL(list)) != null && gameStationOuterActivityInfo.name.length() > 0 && gameStationOuterActivityInfo.linkText.length() > 0) {
            TuxTextView tuxTextView = this.LLJJIJI;
            if (tuxTextView != null) {
                tuxTextView.setText(gameStationOuterActivityInfo.name);
            }
            TuxTextView tuxTextView2 = this.LLJJIJIIJIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(gameStationOuterActivityInfo.linkText);
            }
            TuxTextView tuxTextView3 = this.LLJJIJIIJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.h9(tuxTextView3, new View.OnClickListener() { // from class: X.0z1b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SearchGameActivityCard searchGameActivityCard = this.LL;
                        GameStationOuterActivityInfo gameStationOuterActivityInfo2 = gameStationOuterActivityInfo;
                        searchGameActivityCard.getClass();
                        searchGameActivityCard.LJJJI(null, "didClickSearchGameActivityLink");
                        C1879890z1H.LIZ(searchGameActivityCard.LLILLL, "game_task", "join_activity", C2097608Jq.LJIIIIZZ(new Pair("task_id", gameStationOuterActivityInfo2.outerId), new Pair("task_type", gameStationOuterActivityInfo2.outerSourceDesc)), null);
                        int i = gameStationOuterActivityInfo2.linkType;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 10) {
                                    return;
                                }
                            } else {
                                String str = gameStationOuterActivityInfo2.link;
                                IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                                if (iHostAction == null) {
                                    return;
                                }
                                iHostAction.handleSchema(searchGameActivityCard.LL, str, new Bundle());
                                return;
                            }
                        }
                        new C828330WeV(new ThirdPartyBizCert(402653197)).LIZIZ(searchGameActivityCard.LL, gameStationOuterActivityInfo2.link, new InterfaceC828360WeY() { // from class: X.0dUq
                            @Override // X.InterfaceC828360WeY
                            public final void LIZ(Context context, String str2) {
                                C20441214yg.LIZIZ("handleCTAClickJump", "openWebInApp fallback");
                                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                                sparkThirdContext.url = str2;
                                sparkThirdContext.bizCert = new ThirdPartyBizCert(402653197);
                                C1554300qY8.LIZIZ(context, sparkThirdContext);
                            }
                        }, null);
                    }
                });
            }
            LJJIJL();
            final View view2 = this.LLILZLL;
            if (view2 != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view2, new Runnable() { // from class: X.0z1X
                    public final void LIZ() {
                        SearchGameActivityCard searchGameActivityCard = this;
                        GameStationOuterActivityInfo gameStationOuterActivityInfo2 = gameStationOuterActivityInfo;
                        searchGameActivityCard.getClass();
                        C1879890z1H.LIZIZ(searchGameActivityCard.LLILLL, "game_task", C2097608Jq.LJIIIIZZ(new Pair("task_id", gameStationOuterActivityInfo2.outerId), new Pair("task_type", gameStationOuterActivityInfo2.outerSourceDesc)), null);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SearchGameActivityCard@9e1f.bindData$$inlined$doOnPreDraw$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SearchGameActivityCard@9e1f.bindData$$inlined$doOnPreDraw$1");
                    }
                });
                return;
            }
            return;
        }
        LJJJJ(3995, "");
        LJJIJIIJIL();
    }

    public SearchGameActivityCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
    }
}
