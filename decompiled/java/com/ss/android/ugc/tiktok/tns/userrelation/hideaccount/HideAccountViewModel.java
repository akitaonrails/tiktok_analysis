package com.ss.android.ugc.tiktok.tns.userrelation.hideaccount;

import X.C01GW;
import X.C1166730gT1;
import X.C1393080mM6;
import X.C1610870s1N;
import X.C1954807lC;
import X.C20573115er;
import X.C452501pT;
import X.EnumC1392960mLu;
import X.InterfaceC0148002o;
import X.InterfaceC20573215es;
import Y.AfS187S0100000_18;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class HideAccountViewModel extends AssemViewModel<C1166730gT1> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(647));
    public String LLILLJJLI = "";
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1166730gT1(0);
    }

    public final Context vQ2() {
        return (Context) this.LL.getValue();
    }

    public final void xQ2() {
        this.LLILLJJLI = "";
        setState(AFwS256S0000000_18.get$arr$(828));
        C20573115er c20573115er = InterfaceC20573215es.LIZ;
        String str = this.LLILLJJLI;
        c20573115er.getClass();
        C20573115er.LIZ(str).LJJLL(new AfS187S0100000_18(this, 49), new AfS187S0100000_18(this, 50));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        xQ2();
    }

    public final String wQ2(EnumC1392960mLu enumC1392960mLu, String str, boolean z) {
        int i;
        C1610870s1N.LIZ.getClass();
        if (C1610870s1N.LIZLLL()) {
            int i2 = C1393080mM6.LIZ[enumC1392960mLu.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (z) {
                                i = 2131848321;
                            } else {
                                i = 2131848326;
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else if (z) {
                        i = 2131848317;
                    } else {
                        i = 2131848322;
                    }
                } else if (z) {
                    i = 2131848318;
                } else {
                    i = 2131848323;
                }
            } else if (z) {
                i = 2131848320;
            } else {
                i = 2131848325;
            }
        } else if (z) {
            i = 2131848319;
        } else {
            i = 2131848324;
        }
        return vQ2().getString(i, str);
    }
}
