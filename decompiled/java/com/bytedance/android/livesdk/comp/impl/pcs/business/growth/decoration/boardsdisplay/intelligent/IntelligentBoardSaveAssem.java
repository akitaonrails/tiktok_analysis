package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent;

import X.C019F;
import X.C01GW;
import X.C0PEM;
import X.C0QSJ;
import X.C125800ds;
import X.C12966055o;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1814000xJ0;
import X.C1814100xJA;
import X.C1814240xJO;
import X.C1814250xJP;
import X.C1814260xJQ;
import X.C1814340xJY;
import X.C1814370xJb;
import X.C1814480xJm;
import X.C1814500xJo;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C290801As;
import X.C291301Ax;
import X.C452501pT;
import X.C488201vE;
import X.C673150Qan;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1146704e9;
import X.InterfaceC1814440xJi;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.IntelligentDecorationBoardUpsertEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.BoardSaveScope;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class IntelligentBoardSaveAssem extends UIContentAssem implements C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public volatile boolean LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C1559260qg8 LLJI;
    public final C01GW LLJIJIL;
    public InterfaceC1814440xJi LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IntelligentBoardSaveAssem.class, "upsertVM", "getUpsertVM()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardsdisplay/intelligent/LiveIntelligentBoardUpsertViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IntelligentBoardSaveAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveIntelligentBoardUpsertViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12966055o(c19719912DlLIZ), new C1814340xJY(), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C291301Ax.class, "intelligent_save_data"), checkSupervisorPrepared());
        this.LLJIJIL = C452501pT.LIZIZ(new C1814250xJP(this));
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1814440xJi.class) {
            this.LLJILJIL = (InterfaceC1814440xJi) obj;
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
            return this.LLJILJIL;
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
            this.LLJILJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final C291301Ax Go() {
        return (C291301Ax) this.LLJI.getValue();
    }

    public final LiveIntelligentBoardUpsertViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (LiveIntelligentBoardUpsertViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        DataChannel dataChannel = Go().LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.BQ2(this, IntelligentDecorationBoardUpsertEvent.class, new C1814240xJO(this));
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0xJR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159750gHl) obj).LLILLL;
            }
        }, null, new C290801As(this), 6);
        Ho().asyncSubscribe(new C2217381BqS() { // from class: X.0xJS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159750gHl) obj).LL;
            }
        }, this, C736820SvI.LIZLLL(), new C1814500xJo(this), new C1814260xJQ(this), new C1814480xJm(this));
    }

    public final void Jo(Board board, Bitmap bitmap, int i) {
        Board boardLIZ;
        boolean z;
        if (this.LLIZLLLIL || LJJIJL().getContext() == null) {
            return;
        }
        this.LLIZLLLIL = true;
        if (board != null && (boardLIZ = C125800ds.LIZ(board)) != null) {
            LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModelHo = Ho();
            if (i == 4) {
                z = false;
            } else {
                z = true;
            }
            if (bitmap == null) {
                liveIntelligentBoardUpsertViewModelHo.wQ2(boardLIZ, false, false, i);
                liveIntelligentBoardUpsertViewModelHo.setState(new C1814100xJA());
            } else {
                Iterator<BoardItem> it2 = boardLIZ.boardItemList.iterator();
                while (it2.hasNext()) {
                    C488201vE.LJI(it2.next());
                }
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveIntelligentBoardUpsertViewModelHo), C0PEM.LIZJ, null, new C1814000xJ0(liveIntelligentBoardUpsertViewModelHo, new C1814370xJb(boardLIZ, bitmap, i), z, i, boardLIZ, null), 2);
            }
        }
    }
}
