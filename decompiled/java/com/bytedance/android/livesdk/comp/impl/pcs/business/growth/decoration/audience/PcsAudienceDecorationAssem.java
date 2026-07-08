package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience;

import X.C019F;
import X.C1078550eAn;
import X.C1145200fuI;
import X.C1145370fuZ;
import X.C1145380fua;
import X.C1145390fub;
import X.C1145400fuc;
import X.C1159704gF;
import X.C1161920gLG;
import X.C12963055l;
import X.C1339905Mf;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.PcsAudienceDecorationAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.virtual.AudienceDecorationStateViewModel;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes18.dex */
public final class PcsAudienceDecorationAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1145200fuI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public LiveData<C1078550eAn> LLJI;
    public int LLJIJIL;
    public final C1145400fuc LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsAudienceDecorationAssem.class, "stateViewModel", "getStateViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/audience/virtual/AudienceDecorationStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0fuc] */
    public PcsAudienceDecorationAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AudienceDecorationStateViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12963055l(c19719912DlLIZ), new C1145380fua(), null, true);
        this.LLJILJIL = new Observer() { // from class: X.0fuc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AbstractC1145470fuj c1145430fuf;
                Board board;
                C1078550eAn c1078550eAn = (C1078550eAn) obj;
                if (c1078550eAn != null) {
                    Board board2 = c1078550eAn.LIZ;
                    Board boardLIZ = null;
                    if (board2 != null && !C1152620g6G.LIZIZ(board2)) {
                        long j = ((C1145200fuI) this.LL.LLIZLLLIL.getValue()).LL;
                        long j2 = board2.id;
                        try {
                            C1145500fum c1145500fumLJI = C1145410fud.LJI(j, j2);
                            if (c1145500fumLJI != null) {
                                c1145500fumLJI.LJI(null);
                            }
                            C1145410fud.LJ(j, j2);
                        } catch (Throwable th) {
                        }
                        this.LL.Go().setState(new C1145370fuZ(C1145390fub.LIZ));
                        return;
                    }
                    if (c1078550eAn.LIZIZ == 3 && (board = c1078550eAn.LIZ) != null) {
                        long j3 = board.id;
                        long j4 = ((C1145200fuI) this.LL.LLIZLLLIL.getValue()).LL;
                        try {
                            C1145500fum c1145500fumLJI2 = C1145410fud.LJI(j4, j3);
                            if (c1145500fumLJI2 != null) {
                                synchronized (c1145500fumLJI2.LJI) {
                                    try {
                                        c1145500fumLJI2.LJIIL = true;
                                        c1145500fumLJI2.LJFF(c1145500fumLJI2.LIZIZ(EnumC1145490ful.ERROR, "deleted_before_completion", -54));
                                    } finally {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                            C1145410fud.LJ(j4, j3);
                        } catch (Throwable th2) {
                        }
                    }
                    Board board3 = c1078550eAn.LIZ;
                    if (board3 != null) {
                        boardLIZ = C125700dr.LIZ(board3);
                    }
                    PcsAudienceDecorationAssem pcsAudienceDecorationAssem = this.LL;
                    int i = c1078550eAn.LIZIZ;
                    pcsAudienceDecorationAssem.getClass();
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                c1145430fuf = C1145390fub.LIZ;
                            } else {
                                c1145430fuf = C1145390fub.LIZ;
                            }
                        } else if (boardLIZ != null) {
                            if (pcsAudienceDecorationAssem.Go().getState().LL.LIZ instanceof C1145390fub) {
                                c1145430fuf = new C1145430fuf(boardLIZ);
                            } else {
                                c1145430fuf = new C1145440fug(boardLIZ);
                            }
                        } else {
                            c1145430fuf = C1145390fub.LIZ;
                        }
                    } else if (boardLIZ != null) {
                        c1145430fuf = new C1145430fuf(boardLIZ);
                    } else {
                        c1145430fuf = C1145390fub.LIZ;
                    }
                    this.LL.Go().setState(new C1145370fuZ(c1145430fuf));
                    return;
                }
                this.LL.Go().setState(new C1145370fuZ(C1145390fub.LIZ));
            }
        };
    }

    public final AudienceDecorationStateViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (AudienceDecorationStateViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        LiveData<C1078550eAn> liveData = this.LLJI;
        if (liveData != null) {
            liveData.removeObserver(this.LLJILJIL);
        }
        this.LLJI = null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().setState(new C1145370fuZ(C1145390fub.LIZ));
        C723850SaN.LIZLLL(this, new C1159704gF(this));
        long j = ((C1145200fuI) this.LLIZLLLIL.getValue()).LL;
        if (j > 0) {
            LiveData<C1078550eAn> liveData = this.LLJI;
            if (liveData != null) {
                liveData.removeObserver(this.LLJILJIL);
            }
            MutableLiveData mutableLiveDataLJII = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ZI2().LJII(((C1145200fuI) this.LLIZLLLIL.getValue()).LLILLJJLI, String.valueOf(j));
            if (mutableLiveDataLJII != null) {
                mutableLiveDataLJII.observe(this, this.LLJILJIL);
            } else {
                mutableLiveDataLJII = null;
            }
            this.LLJI = mutableLiveDataLJII;
        }
        DataChannel dataChannel = ((C1145200fuI) this.LLIZLLLIL.getValue()).LLILLL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, FullScreenSurveyShowing.class, new C1339905Mf(this, view));
        }
    }
}
