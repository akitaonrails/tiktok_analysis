package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save;

import X.AbstractC1700910uMb;
import X.AnonymousClass0951;
import X.C019F;
import X.C01GW;
import X.C0QSJ;
import X.C1161920gLG;
import X.C13LE;
import X.C1558870qfV;
import X.C1558890qfX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1700900uMa;
import X.C1790620whI;
import X.C1790630whJ;
import X.C1814190xJJ;
import X.C1814220xJM;
import X.C1814310xJV;
import X.C1814320xJW;
import X.C1814330xJX;
import X.C1814350xJZ;
import X.C1814450xJj;
import X.C1814490xJn;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C291301Ax;
import X.C452501pT;
import X.C474500IjA;
import X.C665390Q8b;
import X.C673150Qan;
import X.C687700QyG;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1146704e9;
import X.InterfaceC1814440xJi;
import X.InterfaceC1814530xJr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import android.view.View;
import com.bytedance.android.live.BoardSaveEvent;
import com.bytedance.android.live.CustomizedBoardShowEntranceEvent;
import com.bytedance.android.live.GetDecorationBoardBitmapEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class SaveAssem extends UIContentAssem implements InterfaceC1814440xJi, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;
    public C474500IjA LLJIJIL;
    public final InterfaceC1814530xJr LLJILJIL;
    public final SaveAssem LLJILJILJ;
    public InterfaceC1814440xJi LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SaveAssem.class, "liveBoardUpsertViewModel", "getLiveBoardUpsertViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/upsert/LiveBoardUpsertViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SaveAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveBoardUpsertViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1558870qfV(c19719912DlLIZ), new C1814350xJZ(), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C291301Ax.class, "save_data"), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new C1814320xJW(this));
        this.LLJILJIL = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
        this.LLJILJILJ = this;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1814440xJi.class) {
            this.LLJILLL = (InterfaceC1814440xJi) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BoardSaveScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1814440xJi.class) {
            return this.LLJILLL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardSaveScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardSaveScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1814440xJi.class) {
            this.LLJILLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final LiveBoardUpsertViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (LiveBoardUpsertViewModel) assemVMLazy.getValue();
    }

    public final C291301Ax Ho() {
        return (C291301Ax) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1814440xJi
    public final void S1() {
        C1700900uMa c1700900uMa;
        Board board;
        DataChannel dataChannel;
        AnonymousClass0951 anonymousClass0951LJIIL;
        InterfaceC1814530xJr interfaceC1814530xJr = this.LLJILJIL;
        AbstractC1700910uMb abstractC1700910uMb = null;
        if (interfaceC1814530xJr != null && (anonymousClass0951LJIIL = interfaceC1814530xJr.LJIIL()) != null) {
            abstractC1700910uMb = (AbstractC1700910uMb) anonymousClass0951LJIIL.getValue();
        }
        if (!(abstractC1700910uMb instanceof C1700900uMa) || (c1700900uMa = (C1700900uMa) abstractC1700910uMb) == null || (board = c1700900uMa.LIZIZ) == null) {
            return;
        }
        C1790630whJ c1790630whJ = C1790620whI.LIZIZ;
        if (c1790630whJ != null) {
            c1790630whJ.LJIIJJI = System.currentTimeMillis();
        }
        C1814220xJM c1814220xJM = new C1814220xJM(this, board);
        C291301Ax c291301AxHo = Ho();
        if (c291301AxHo == null || (dataChannel = c291301AxHo.LLILLJJLI) == null) {
            return;
        }
        dataChannel.LC0(GetDecorationBoardBitmapEvent.class, c1814220xJM);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BoardSaveScope.class}).unbindAbility(this.LLJILJILJ, InterfaceC1814440xJi.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        C665390Q8b.LIZ(this);
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new C1558890qfX(this));
        C291301Ax c291301AxHo = Ho();
        if (c291301AxHo != null && (dataChannel2 = c291301AxHo.LLILLJJLI) != null) {
            dataChannel2.BQ2(this, BoardSaveEvent.class, new C1814190xJJ(this));
        }
        C291301Ax c291301AxHo2 = Ho();
        if (c291301AxHo2 != null && (dataChannel = c291301AxHo2.LLILLJJLI) != null) {
            dataChannel.BQ2(this, CustomizedBoardShowEntranceEvent.class, new C1814330xJX(this));
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0xJU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158950gGT) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new C1814310xJV(this), 4);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0xJT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158950gGT) obj).LL;
            }
        }, this, C736820SvI.LIZLLL(), new C1814490xJn(this), null, new C1814450xJj(this), 16, null);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BoardSaveScope.class}).bindAbility(this.LLJILJILJ, InterfaceC1814440xJi.class);
    }
}
