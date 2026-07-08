package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.preregister;

import X.AbstractC1882890z67;
import X.C013C;
import X.C09AY;
import X.C1155600gB4;
import X.C1880150z1h;
import X.C1880350z21;
import X.C1880370z23;
import X.C1880430z29;
import X.C1880470z2D;
import X.C1880480z2E;
import X.C1882380z5I;
import X.C197039127h;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1880290z1v;
import X.InterfaceC1880710z2b;
import X.InterfaceC1880780z2i;
import X.InterfaceC1880940z2y;
import X.InterfaceC1881340z3c;
import X.ViewTreeObserverOnPreDrawListenerC1880030z1V;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GamePreRegisterCard extends AbstractC1882890z67<GamePreRegisterCardModel> {
    public C197039127h LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public C09AY LLJJJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1882890z67, X.InterfaceC1883030z6L
    public final boolean LIZ() {
        GameStationGameInfo gameStationGameInfo;
        GameCTAInfo gameCTAInfo;
        GamePreRegisterCardModel gamePreRegisterCardModel = (GamePreRegisterCardModel) this.LLILZIL;
        boolean z = false;
        if (gamePreRegisterCardModel != null && (gameStationGameInfo = gamePreRegisterCardModel.gameInfo) != null && (gameCTAInfo = gameStationGameInfo.gameCtaInfo) != null && gameCTAInfo.gameCtaStatus == 0) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLL() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.preregister.GamePreRegisterCard.LJJJJLL():void");
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJLIJ() {
        super.LJJIJLIJ();
        C20441214yg.LIZIZ("GamePreRegisterCard", "onDateModelUpdated");
        LJJJJLI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJLI() {
        String str;
        C197039127h c197039127h;
        GameStationGameInfo gameStationGameInfo;
        GameCTAInfo gameCTAInfo;
        GameStationGameInfo gameStationGameInfo2;
        GameStationGameInfo gameStationGameInfo3;
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
        GamePreRegisterCardModel gamePreRegisterCardModel = (GamePreRegisterCardModel) this.LLILZIL;
        final GameCTAInfo gameCTAInfo2 = (gamePreRegisterCardModel == null || (gameStationGameInfo3 = gamePreRegisterCardModel.gameInfo) == null) ? null : gameStationGameInfo3.gameCtaInfo;
        boolean z = gameCTAInfo2 != null && gameCTAInfo2.isRegisteredUser;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isRegisteredUser = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("GamePreRegisterCard", C2188811AlT.LIZIZ(sbLIZ));
        if (gameCTAInfo2 == null || (str = gameCTAInfo2.registerTimeText) == null) {
            str = "";
        }
        TextView textView = this.LLJJIJIL;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.LLJJIJIL;
        if (textView2 != null) {
            C500260Jjc.LJLJLJ(textView2, str.length() > 0);
        }
        if (gameCTAInfo2 == null || gameCTAInfo2.gameCtaStatus != 2) {
            C197039127h c197039127h2 = this.LLJJIJI;
            if (c197039127h2 != null) {
                c197039127h2.setEnabled(false);
            }
            TextView textView3 = this.LLJJIJIL;
            if (textView3 != null) {
                textView3.setText(gameCTAInfo2 != null ? gameCTAInfo2.gameCtaCloseReasonText : null);
            }
            C197039127h c197039127h3 = this.LLJJIJI;
            if (c197039127h3 != null) {
                c197039127h3.setText(gameCTAInfo2 != null ? gameCTAInfo2.ctaText : null);
            }
            TextView textView4 = this.LLJJIJIL;
            if (textView4 != null) {
                C500260Jjc.LLFFF(textView4);
            }
            C197039127h c197039127h4 = this.LLJJIJIIJIL;
            if (c197039127h4 != null) {
                C500260Jjc.LJIILIIL(c197039127h4);
                return;
            }
            return;
        }
        C197039127h c197039127h5 = this.LLJJIJI;
        if (c197039127h5 != null) {
            c197039127h5.setEnabled(true);
        }
        C197039127h c197039127h6 = this.LLJJIJI;
        if (c197039127h6 != null) {
            C786410Ut5.U8(c197039127h6, new View.OnClickListener() { // from class: X.0z2B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.LL.LJJJJLL();
                }
            });
        }
        InterfaceC1880290z1v interfaceC1880290z1v = (InterfaceC1880290z1v) this.LLILLL.LJIILJJIL().LIZ(InterfaceC1880290z1v.class);
        if (interfaceC1880290z1v != null) {
            interfaceC1880290z1v.LJ(true);
            C197039127h c197039127hLJIIIZ = interfaceC1880290z1v.LJIIIZ();
            if (c197039127hLJIIIZ != null) {
                C786410Ut5.U8(c197039127hLJIIIZ, new View.OnClickListener() { // from class: X.0z2C
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.LL.LJJJJLL();
                    }
                });
            }
        }
        InterfaceC1880290z1v interfaceC1880290z1v2 = (InterfaceC1880290z1v) this.LLILLL.LJIILJJIL().LIZ(InterfaceC1880290z1v.class);
        C197039127h c197039127hLJIIIZ2 = interfaceC1880290z1v2 != null ? interfaceC1880290z1v2.LJIIIZ() : null;
        GamePreRegisterCardModel gamePreRegisterCardModel2 = (GamePreRegisterCardModel) this.LLILZIL;
        GameCTAInfo gameCTAInfo3 = (gamePreRegisterCardModel2 == null || (gameStationGameInfo2 = gamePreRegisterCardModel2.gameInfo) == null) ? null : gameStationGameInfo2.gameCtaInfo;
        if (z) {
            C197039127h c197039127h7 = this.LLJJIJI;
            if (c197039127h7 != null) {
                c197039127h7.setButtonVariant(1);
            }
            if (c197039127hLJIIIZ2 != null) {
                c197039127hLJIIIZ2.setButtonVariant(1);
                c197039127hLJIIIZ2.setText(gameCTAInfo3 != null ? gameCTAInfo3.ctaTopBarTextRegistered : null);
            }
            C197039127h c197039127h8 = this.LLJJIJI;
            if (c197039127h8 != null) {
                c197039127h8.setText(gameCTAInfo3 != null ? gameCTAInfo3.ctaTextRegistered : null);
            }
            if (gameCTAInfo3 == null || gameCTAInfo3.jumpLinkType == 0 || !gameCTAInfo3.isSubButtonVisible) {
                C500260Jjc.LJIILIIL(this.LLJJIJIIJIL);
            } else {
                C500260Jjc.LLFFF(this.LLJJIJIIJIL);
                C197039127h c197039127h9 = this.LLJJIJIIJIL;
                if (c197039127h9 != null) {
                    c197039127h9.setButtonVariant(1);
                }
            }
            C197039127h c197039127h10 = this.LLJJIJI;
            if (c197039127h10 != null) {
                c197039127h10.setButtonStartIcon(Integer.valueOf(R.raw.icon_tick_fill_small));
            }
            if (c197039127hLJIIIZ2 != null) {
                c197039127hLJIIIZ2.setText(gameCTAInfo3 != null ? gameCTAInfo3.ctaTextRegistered : null);
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLJJIJIIJIL);
            C197039127h c197039127h11 = this.LLJJIJI;
            if (c197039127h11 != null) {
                c197039127h11.setText(gameCTAInfo3 != null ? gameCTAInfo3.ctaText : null);
            }
            if (c197039127hLJIIIZ2 != null) {
                c197039127hLJIIIZ2.setText(gameCTAInfo3 != null ? gameCTAInfo3.ctaText : null);
            }
            C197039127h c197039127h12 = this.LLJJIJI;
            if (c197039127h12 != null) {
                c197039127h12.setButtonVariant(0);
            }
            C197039127h c197039127h13 = this.LLJJIJI;
            if (c197039127h13 != null) {
                c197039127h13.setButtonStartIcon(null);
            }
            if (c197039127hLJIIIZ2 != null) {
                c197039127hLJIIIZ2.setText(gameCTAInfo3 != null ? gameCTAInfo3.ctaTopBarText : null);
                c197039127hLJIIIZ2.setButtonVariant(0);
            }
        }
        GamePreRegisterCardModel gamePreRegisterCardModel3 = (GamePreRegisterCardModel) this.LLILZIL;
        if ((gamePreRegisterCardModel3 == null || (gameStationGameInfo = gamePreRegisterCardModel3.gameInfo) == null || (gameCTAInfo = gameStationGameInfo.gameCtaInfo) == null || gameCTAInfo.jumpLinkType != 0) && (c197039127h = this.LLJJIJIIJIL) != null) {
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0z22
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i;
                    String strLJIILLIIL = this.LL.LLILLL.LJIILLIIL();
                    if (Intrinsics.LJFF(strLJIILLIIL, "game_detail_page")) {
                        i = 5;
                    } else if (Intrinsics.LJFF(strLJIILLIIL, "game_profile")) {
                        i = 13;
                    } else {
                        i = 0;
                    }
                    C1880070z1Z.LJI(this.LL.LLILLL, true, null);
                    InterfaceC1880940z2y interfaceC1880940z2y = (InterfaceC1880940z2y) this.LL.LLILLL.LJIILJJIL().LIZ(InterfaceC1880940z2y.class);
                    if (interfaceC1880940z2y != null) {
                        C1880720z2c c1880720z2c = InterfaceC1880710z2b.LIZ;
                        GameCTAInfo gameCTAInfo4 = gameCTAInfo2;
                        c1880720z2c.getClass();
                        interfaceC1880940z2y.LJII(new C1880150z1h(gameCTAInfo4, i), new C1880490z2F(), new C1880500z2G());
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gn7, viewGroup, false);
    }

    @Override // X.AbstractC1882890z67, X.InterfaceC1882930z6B
    public final void LJIJ(int i) {
        super.LJIJ(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // X.AbstractC1882890z67
    public final void LJJIZ(int i) {
        super.LJJIZ(i);
        ?? r0 = this.LLJJJ;
        if (r0 != 0) {
            r0.invoke();
        }
        this.LLJJJ = null;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        this.LLILZLL = view;
        this.LLJJIJI = (C197039127h) view.findViewById(R.id.cti);
        this.LLJJIJIL = (TextView) view.findViewById(R.id.zl4);
        this.LLJJIJIIJIL = (C197039127h) view.findViewById(R.id.cro);
        LJJJJLI();
        C786410Ut5.y3(view.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC1880030z1V(view, this));
        LJJIJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJZ(boolean z) {
        C197039127h c197039127hLJIIIZ;
        GamePreRegisterCardModel gamePreRegisterCardModel;
        GameStationGameInfo gameStationGameInfo;
        GameCTAInfo gameCTAInfo;
        Lifecycle lifecycle;
        C197039127h c197039127h = this.LLJJIJI;
        int i = 0;
        if (c197039127h != null && c197039127h.LLLII) {
            return;
        }
        String strLJIILLIIL = this.LLILLL.LJIILLIIL();
        if (Intrinsics.LJFF(strLJIILLIIL, "game_detail_page")) {
            i = 5;
        } else if (Intrinsics.LJFF(strLJIILLIIL, "game_profile")) {
            i = 13;
        }
        C013C c013c = new C013C();
        C197039127h c197039127h2 = this.LLJJIJI;
        if (c197039127h2 != null) {
            c197039127h2.setLoading(true);
        }
        if (!z && (gamePreRegisterCardModel = (GamePreRegisterCardModel) this.LLILZIL) != null && (gameStationGameInfo = gamePreRegisterCardModel.gameInfo) != null && (gameCTAInfo = gameStationGameInfo.gameCtaInfo) != null) {
            if (gameCTAInfo.jumpLinkType != 0) {
                c013c.element = true;
            }
            LifecycleOwner lifecycleOwner = this.LLILLL.getLifecycleOwner();
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(new GamePreRegisterCard$requestRegister$1$1(this, c013c));
            }
            InterfaceC1880940z2y interfaceC1880940z2y = (InterfaceC1880940z2y) this.LLILLL.LJIILJJIL().LIZ(InterfaceC1880940z2y.class);
            if (interfaceC1880940z2y != null) {
                InterfaceC1880710z2b.LIZ.getClass();
                interfaceC1880940z2y.LJII(new C1880150z1h(gameCTAInfo, i), new C1880470z2D(), new C1880480z2E());
            }
        }
        Fragment fragment = this.LLILLL.getHost().getFragment();
        if (fragment == null) {
            return;
        }
        InterfaceC1880290z1v interfaceC1880290z1v = (InterfaceC1880290z1v) this.LLILLL.LJIILJJIL().LIZ(InterfaceC1880290z1v.class);
        if (interfaceC1880290z1v != null && (c197039127hLJIIIZ = interfaceC1880290z1v.LJIIIZ()) != null) {
            c197039127hLJIIIZ.setLoading(true);
        }
        String strLJFF = C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "game_id");
        InterfaceC1880780z2i interfaceC1880780z2i = (InterfaceC1880780z2i) this.LLILLL.LJIILJJIL().LIZ(InterfaceC1880780z2i.class);
        if (interfaceC1880780z2i != null) {
            interfaceC1880780z2i.LIZJ(strLJFF, new C1880350z21(z, this, c013c, fragment), new C1880370z23(c013c, this, fragment), z);
        }
    }

    public GamePreRegisterCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
        this.LLJJJ = new C1880430z29();
    }
}
