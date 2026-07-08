package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.platforms;

import X.AbstractC1882890z67;
import X.C09RB;
import X.C09RD;
import X.C1155600gB4;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C1834150xpV;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1881340z3c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.platforms.GamePlatformsCard;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.game.model.GameStationSupportPlatformInfo;
import com.bytedance.android.livesdk.game.model.JumpLinkInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class GamePlatformsCard extends AbstractC1882890z67<GamePlatformsCardModel> {
    public ViewGroup LLJJIJI;

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gmb, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        View view2;
        GameStationGameInfo gameStationGameInfo;
        List<GameStationSupportPlatformInfo> list;
        int childCount;
        String str;
        this.LLILZLL = view;
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.b8n);
        GamePlatformsCardModel gamePlatformsCardModel = (GamePlatformsCardModel) this.LLILZIL;
        if (gamePlatformsCardModel != null && (gameStationGameInfo = gamePlatformsCardModel.gameInfo) != null && (list = gameStationGameInfo.supportPlatformList) != null) {
            for (final GameStationSupportPlatformInfo gameStationSupportPlatformInfo : list) {
                ViewGroup viewGroup = this.LLJJIJI;
                if (viewGroup != null) {
                    childCount = viewGroup.getChildCount();
                } else {
                    childCount = 0;
                }
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gmd, null, false);
                ((TextView) viewTd.findViewById(R.id.tv_platforms)).setText(gameStationSupportPlatformInfo.platformName);
                View viewFindViewById = viewTd.findViewById(R.id.k3w);
                if (viewFindViewById != null) {
                    if (C1834150xpV.LJI(this.LL)) {
                        str = gameStationSupportPlatformInfo.platformIconDark;
                    } else {
                        str = gameStationSupportPlatformInfo.platformIconLight;
                    }
                    C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
                    url.LJIL = true;
                    url.LJJI(viewFindViewById);
                }
                C786410Ut5.T7((TextView) viewTd.findViewById(R.id.cwj), new View.OnClickListener() { // from class: X.0z1m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C1882420z5M c1882420z5MLIZLLL;
                        InterfaceC1880940z2y interfaceC1880940z2y;
                        GamePlatformsCard gamePlatformsCard = this.LL;
                        GameStationSupportPlatformInfo gameStationSupportPlatformInfo2 = gameStationSupportPlatformInfo;
                        gamePlatformsCard.getClass();
                        InterfaceC1881340z3c interfaceC1881340z3c = gamePlatformsCard.LLILLL;
                        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("platforms_name", C1880070z1Z.LIZJ(gameStationSupportPlatformInfo2.platformType)));
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_about_click");
                        if (interfaceC1881340z3c != null) {
                            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
                        } else {
                            c1882420z5MLIZLLL = null;
                        }
                        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
                        c474500IjALIZ.LJJII("view", "btn_name");
                        c474500IjALIZ.LJJIIZI(mapLIZJ);
                        c474500IjALIZ.LIZ();
                        JumpLinkInfo jumpLinkInfo = gameStationSupportPlatformInfo2.jumpLinkInfo;
                        if (jumpLinkInfo != null && (interfaceC1880940z2y = (InterfaceC1880940z2y) gamePlatformsCard.LLILLL.LJIILJJIL().LIZ(InterfaceC1880940z2y.class)) != null) {
                            InterfaceC1880710z2b.LIZ.getClass();
                            interfaceC1880940z2y.LJII(new C1880160z1i(jumpLinkInfo, 9), new C1880220z1o(), new C1880230z1p());
                        }
                    }
                });
                ViewGroup viewGroup2 = this.LLJJIJI;
                if (viewGroup2 != null) {
                    viewGroup2.addView(viewTd);
                }
                if (childCount > 0) {
                    C500260Jjc.LJLJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), viewTd);
                }
            }
        }
        ViewGroup viewGroup3 = this.LLJJIJI;
        if (viewGroup3 != null && (view2 = (View) C09RB.LJIJ(new C09RD(viewGroup3))) != null) {
            C500260Jjc.LJJLJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), view2);
        }
        LJJIJL();
    }

    public GamePlatformsCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
    }
}
