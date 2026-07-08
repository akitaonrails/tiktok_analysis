package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro;

import X.AbstractC1882890z67;
import X.C013C;
import X.C09AY;
import X.C1155600gB4;
import X.C1161920gLG;
import X.C1880070z1Z;
import X.C1880150z1h;
import X.C1880590z2P;
import X.C1880600z2Q;
import X.C1880610z2R;
import X.C1880650z2V;
import X.C1880660z2W;
import X.C1880790z2j;
import X.C1882380z5I;
import X.C1884390z8X;
import X.C197039127h;
import X.C2097608Jq;
import X.C782110Um9;
import X.C786410Ut5;
import X.InterfaceC1880710z2b;
import X.InterfaceC1880780z2i;
import X.InterfaceC1880940z2y;
import X.InterfaceC1881340z3c;
import X.InterfaceC743640TFa;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.common.model.GameInfoCardModel;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipReserveOpenStoreConfig;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class GameProfileIntroCard extends AbstractC1882890z67<GameInfoCardModel> {
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public C197039127h LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public C09AY LLJJL;

    public final void LJJJJZ() throws Throwable {
        String string;
        JSONObject jSONObjectLIZ = this.LLILLJJLI.LLILLL.LIZ();
        if (jSONObjectLIZ == null || (string = JSONObjectProtectorUtils.getString(jSONObjectLIZ, "jump_link")) == null) {
            return;
        }
        C1880070z1Z.LJIILIIL(this.LLILLL, "view", null);
        C1884390z8X c1884390z8XV01 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).V01();
        if (c1884390z8XV01 != null) {
            c1884390z8XV01.LIZ(this.LL, string, C2097608Jq.LJ());
        }
    }

    @Override // X.AbstractC1882890z67
    public final void LJJIJLIJ() {
        super.LJJIJLIJ();
        LJJJJLI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLI() {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameProfileIntroCard.LJJJJLI():void");
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        LJJIJIL();
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gn8, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // X.AbstractC1882890z67
    public final void LJJIZ(int i) {
        super.LJJIZ(i);
        ?? r0 = this.LLJJL;
        if (r0 != 0) {
            r0.invoke();
        }
        this.LLJJL = null;
    }

    @Override // X.AbstractC1882890z67
    public final void LJJJ(View view) {
        this.LLILLL.getEventCenter().LIZJ("GameProfilePageShow", this);
        this.LLILZLL = view;
        this.LLJJIJIL = (C197039127h) view.findViewById(R.id.ipu);
        this.LLJJJJ = view.findViewById(R.id.iqv);
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.is_);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.isa);
        this.LLJJJJJIL = view.findViewById(R.id.isb);
        C197039127h c197039127h = this.LLJJIJIL;
        if (c197039127h != null) {
            c197039127h.LJJJJL(new C1880790z2j());
        }
        LJJJJLI();
        LJJIJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJLL(boolean z) {
        boolean z2;
        GameStationGameInfo gameStationGameInfo;
        GameCTAInfo gameCTAInfo;
        InterfaceC1881340z3c interfaceC1881340z3c = this.LLILLL;
        GameInfoCardModel gameInfoCardModel = (GameInfoCardModel) this.LLILZIL;
        if (gameInfoCardModel != null && (gameStationGameInfo = gameInfoCardModel.gameInfo) != null && (gameCTAInfo = gameStationGameInfo.gameCtaInfo) != null && gameCTAInfo.jumpLinkType == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1880070z1Z.LJI(interfaceC1881340z3c, false, Boolean.valueOf(!z2));
        if (z) {
            C782110Um9 c782110Um9 = new C782110Um9(this.LL);
            c782110Um9.LJIIZILJ(2131852547);
            c782110Um9.LJII(2131852546);
            c782110Um9.LJIIJ(2131852544, new InterfaceC743640TFa() { // from class: X.0z2N
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    C1880070z1Z.LJII(this.LIZ.LLILLL, "double_check_cancel_register", "not_now", C2097608Jq.LJ());
                }
            });
            c782110Um9.LJIILIIL(2131852545, new InterfaceC743640TFa() { // from class: X.0z2O
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    C1880070z1Z.LJII(this.LIZ.LLILLL, "double_check_cancel_register", "turn_off", C2097608Jq.LJ());
                    this.LIZ.LJJJJZI(true);
                }
            });
            c782110Um9.LJIJ = new DialogInterface.OnDismissListener() { // from class: X.0z2S
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                }
            };
            C786410Ut5.E4(c782110Um9.LIZ());
            C1880070z1Z.LJIIIZ(this.LLILLL, "double_check_cancel_register");
            return;
        }
        LJJJJZI(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJJZI(boolean z) {
        InterfaceC1880780z2i interfaceC1880780z2i;
        GameInfoCardModel gameInfoCardModel;
        GameStationGameInfo gameStationGameInfo;
        GameCTAInfo gameCTAInfo;
        Lifecycle lifecycle;
        C197039127h c197039127h = this.LLJJIJIL;
        if (c197039127h != null && c197039127h.LLLII) {
            return;
        }
        C013C c013c = new C013C();
        C197039127h c197039127h2 = this.LLJJIJIL;
        if (c197039127h2 != null) {
            c197039127h2.setLoading(true);
        }
        if (!z && GameLivePartnershipReserveOpenStoreConfig.INSTANCE.getEnable() && (gameInfoCardModel = (GameInfoCardModel) this.LLILZIL) != null && (gameStationGameInfo = gameInfoCardModel.gameInfo) != null && (gameCTAInfo = gameStationGameInfo.gameCtaInfo) != null) {
            if (gameCTAInfo.jumpLinkType != 0) {
                c013c.element = true;
            }
            LifecycleOwner lifecycleOwner = this.LLILLL.getLifecycleOwner();
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(new GameProfileIntroCard$requestRegister$1$1(this, c013c));
            }
            InterfaceC1880940z2y interfaceC1880940z2y = (InterfaceC1880940z2y) this.LLILLL.LJIILJJIL().LIZ(InterfaceC1880940z2y.class);
            if (interfaceC1880940z2y != null) {
                InterfaceC1880710z2b.LIZ.getClass();
                interfaceC1880940z2y.LJII(new C1880150z1h(gameCTAInfo, 13), new C1880650z2V(), new C1880660z2W());
            }
        }
        Fragment fragment = this.LLILLL.getHost().getFragment();
        if (fragment != null && (interfaceC1880780z2i = (InterfaceC1880780z2i) this.LLILLL.LJIILJJIL().LIZ(InterfaceC1880780z2i.class)) != null) {
            interfaceC1880780z2i.LIZJ(C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LLILLL), "game_id"), new C1880600z2Q(this, z, c013c, fragment), new C1880590z2P(this, c013c, fragment), z);
        }
    }

    public final void LJJJLIIL(int i) {
        String string;
        this.LLJJIJIIJIL = i;
        C197039127h c197039127h = this.LLJJIJIL;
        if (c197039127h != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        string = this.LL.getString(2131856915);
                    } else {
                        string = this.LL.getString(2131855149);
                    }
                } else {
                    string = this.LL.getString(2131852539);
                }
            } else {
                string = this.LL.getString(2131855693);
            }
            c197039127h.setText(string);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    @Override // X.AbstractC1882890z67
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(java.lang.Object r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameProfileIntroCard.LJJIII(java.lang.Object, java.lang.String):void");
    }

    public GameProfileIntroCard(Context context, C1155600gB4 c1155600gB4, InterfaceC1881340z3c interfaceC1881340z3c) {
        super(context, c1155600gB4, interfaceC1881340z3c);
        this.LLJJIJIIJIL = 1;
        this.LLJJL = new C1880610z2R();
    }
}
