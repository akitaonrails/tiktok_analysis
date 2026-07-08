package com.ss.android.ugc.aweme.biz.wallet.biz.landing.base;

import X.C1390410mHn;
import X.C1559260qg8;
import X.C1716470ulh;
import X.C1717240umw;
import X.C1749280vcc;
import X.C1776200wK2;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C723590SZx;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1749320vcg;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class BaseWalletLandingAssem extends UIContentAssem {
    public C1749280vcc LLIZLLLIL;
    public C1390410mHn LLJ;
    public WalletFlowDecision LLJI;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723590SZx(this, C1717240umw.class, "SOURCE_DATA"), checkSupervisorPrepared());
    public final long LLJILJIL = System.currentTimeMillis();
    public int LLJILJILJ = -1;

    public BaseWalletLandingViewModel Lo() {
        return null;
    }

    public final void So() {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, Go().LL);
        pairArr[1] = new Pair("duration", String.valueOf(System.currentTimeMillis() - this.LLJILJIL));
        pairArr[2] = new Pair("retry_count", String.valueOf(this.LLJILJILJ));
        pairArr[3] = new Pair("source_id", Go().LLILLJJLI);
        String str = Go().LLIZ;
        if (str == null) {
            str = "";
        }
        pairArr[4] = new Pair("enter_from", str);
        C1716470ulh.LIZ(Go().LL, "fp_sdk_entry_loading_jump", C2097608Jq.LJIIZILJ(C2097608Jq.LJIIJ(pairArr)));
    }

    public final C1717240umw Go() {
        return (C1717240umw) this.LLJIJIL.getValue();
    }

    public final C1390410mHn Ho() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z0t) : null;
            this.LLJ = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final C1749280vcc Jo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z18) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final void Oo() {
        this.LLJILJILJ++;
        BaseWalletLandingViewModel baseWalletLandingViewModelLo = Lo();
        if (baseWalletLandingViewModelLo != null) {
            baseWalletLandingViewModelLo.wQ2(Go().LL, Go().LLILLJJLI, false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    public void No(WalletFlowDecision walletFlowDecision) {
        So();
    }

    public final void Vo(String str) {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, Go().LL);
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("error_message", str);
        pairArr[2] = new Pair("source_id", Go().LLILLJJLI);
        String str3 = Go().LLIZ;
        if (str3 != null) {
            str2 = str3;
        }
        pairArr[3] = new Pair("enter_from", str2);
        C1716470ulh.LIZ(Go().LL, "fp_sdk_entry_request_error", C2097608Jq.LJIIZILJ(C2097608Jq.LJIIJ(pairArr)));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        Jo().LIZ(new InterfaceC1749320vcg() { // from class: X.0un2
            @Override // X.InterfaceC1749320vcg
            public final void hide() {
                C786410Ut5.LLLZZIL(this.LIZ.Ho(), 8);
                this.LIZ.Ho().LIZLLL();
            }

            @Override // X.InterfaceC1749320vcg
            public final void show() {
                C786410Ut5.LLLZZIL(this.LIZ.Ho(), 0);
                this.LIZ.Ho().LIZJ();
            }
        });
        BaseWalletLandingViewModel baseWalletLandingViewModelLo = Lo();
        if (baseWalletLandingViewModelLo != null) {
            selectSubscribe(baseWalletLandingViewModelLo, new C2217381BqS() { // from class: X.0umz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1717130uml) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0un3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1717130uml) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0un4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1717130uml) obj).LLILZ;
                }
            }, new C2217381BqS() { // from class: X.0un5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1717130uml) obj).LLILLL;
                }
            }, C736820SvI.LIZIZ(baseWalletLandingViewModelLo.usedInReusedScene), null, new C1776200wK2(this, 1));
        }
        BaseWalletLandingViewModel baseWalletLandingViewModelLo2 = Lo();
        if (baseWalletLandingViewModelLo2 != null) {
            C736680Sv4.LJIIIIZZ(this, baseWalletLandingViewModelLo2, new C2217381BqS() { // from class: X.0un0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1717130uml) obj).LLILZIL;
                }
            }, null, new AwS640S0100000_26(this, 3), 6);
        }
        Oo();
    }
}
