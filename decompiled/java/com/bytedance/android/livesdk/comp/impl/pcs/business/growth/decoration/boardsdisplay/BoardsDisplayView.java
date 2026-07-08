package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay;

import X.AbstractC1700910uMb;
import X.AbstractC1817020xNs;
import X.AnonymousClass0956;
import X.C01GW;
import X.C05YD;
import X.C09JN;
import X.C09RD;
import X.C0KPJ;
import X.C0PEM;
import X.C0TFO;
import X.C1092200eWo;
import X.C1161504gX;
import X.C1161920gLG;
import X.C11KS;
import X.C11RD;
import X.C13LE;
import X.C1700880uMY;
import X.C1700890uMZ;
import X.C1700900uMa;
import X.C1700920uMc;
import X.C1701940uOG;
import X.C1705700uUK;
import X.C1733930vDr;
import X.C1777850wMh;
import X.C1814550xJt;
import X.C1814570xJv;
import X.C1814860xKO;
import X.C1814870xKP;
import X.C1814880xKQ;
import X.C1814900xKS;
import X.C1814910xKT;
import X.C1814930xKV;
import X.C1814940xKW;
import X.C1814970xKZ;
import X.C1814980xKa;
import X.C1815520xLS;
import X.C1816520xN4;
import X.C1816530xN5;
import X.C1816550xN7;
import X.C1816570xN9;
import X.C1816590xNB;
import X.C1816670xNJ;
import X.C1816930xNj;
import X.C1817010xNr;
import X.C1818740xQe;
import X.C1954807lC;
import X.C1EOY;
import X.C2188811AlT;
import X.C23250099c;
import X.C329901Pt;
import X.C394501g7;
import X.C418440Gaw;
import X.C452501pT;
import X.C465520INi;
import X.C470401sM;
import X.C482301uH;
import X.C487201v4;
import X.C488201vE;
import X.C488301vF;
import X.C488601vI;
import X.C500260Jjc;
import X.C723850SaN;
import X.C758470Tp7;
import X.C758510TpB;
import X.C770220UJg;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC389301fH;
import X.InterfaceC1815550xLV;
import X.InterfaceC1816560xN8;
import X.InterfaceC1816580xNA;
import X.InterfaceC390601fU;
import X.InterfaceC395901gL;
import X.InterfaceC500100JjM;
import X.RunnableC1160830gJV;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.CameraResumeEvent;
import com.bytedance.android.live.DecorationEditLogDataEvent;
import com.bytedance.android.live.NativeDecorationOperationEvent;
import com.bytedance.android.live.PreviewBoardRenderDoneEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.PreviewSchemaCreateBoardEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.PlaybookBoardEntityStatusChannel;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsClickableBulletSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SmbLiveKickstarterSetting;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.setting.LiveDecorationNativeBoardConflictCheckSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.PreviewEditingDecorationToolsEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.dataChannel.PreviewBulletinEditVisibilityChannel;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemLayout;
import com.bytedance.android.livesdk.model.LastUsedLiveBoardsModel;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public final class BoardsDisplayView extends FrameLayout implements InterfaceC1816580xNA {
    public final View LL;
    public AnonymousClass0956 LLILLJJLI;
    public final C01GW LLILLL;
    public ConstraintLayout LLILZ;
    public ConstraintLayout LLILZIL;
    public final InterfaceC390601fU LLILZLL;
    public LifecycleOwner LLIZ;
    public DataChannel LLIZLLLIL;
    public final int LLJ;
    public String LLJI;
    public C482301uH LLJIJIL;
    public final C1818740xQe LLJILJIL;
    public final C1816520xN4 LLJILJILJ;
    public final C1705700uUK LLJILLL;
    public final BoardsDisplayView$viewLifecycleObserver$1 LLJJ;

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    public final C482301uH getBulletRenderer() {
        if (!LivePcsClickableBulletSetting.INSTANCE.getValue()) {
            return null;
        }
        C482301uH c482301uH = this.LLJIJIL;
        if (c482301uH != null) {
            return c482301uH;
        }
        C482301uH c482301uH2 = new C482301uH(this.LLIZLLLIL, this.LLIZ, new C1814930xKV(getViewModel()), new C1814940xKW(getViewModel()), new C487201v4(this));
        this.LLJIJIL = c482301uH2;
        return c482301uH2;
    }

    public final BoardsDisplayViewModel getViewModel() {
        return (BoardsDisplayViewModel) this.LLILLL.getValue();
    }

    public final DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    public final int getHorizontalTextPadding() {
        return this.LLJ;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LLIZ;
    }

    public static boolean LJI(Board board) {
        SceneryContent sceneryContent;
        C758470Tp7 c758470Tp7LIZ = C758510TpB.LIZ();
        if (c758470Tp7LIZ != null && c758470Tp7LIZ.LJI && (!board.boardItemList.isEmpty())) {
            List<BoardItem> list = board.boardItemList;
            ArrayList arrayList = new ArrayList();
            for (BoardItem boardItem : list) {
                BoardItem boardItem2 = boardItem;
                if (boardItem2.boardItemType != 6 || (sceneryContent = boardItem2.sceneryContent) == null || sceneryContent.sceneryType != 3) {
                    arrayList.add(boardItem);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!(!((BoardItem) it2.next()).matting)) {
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void LIZLLL(ConstraintLayout constraintLayout) {
        if (constraintLayout == null) {
            return;
        }
        for (View view : new C09RD(constraintLayout)) {
            if (view instanceof AbstractC1817020xNs) {
                this.LLJILJIL.LIZIZ(((AbstractC1817020xNs) view).getCurrentBoardIdentifier());
            }
        }
        C786410Ut5.LJJJJL(constraintLayout);
    }

    public final void LJIIIIZZ(AbstractC1700910uMb abstractC1700910uMb) {
        C11KS c11ksLJI;
        InterfaceC500100JjM interfaceC500100JjM;
        final boolean z;
        C11KS c11ksLJI2;
        InterfaceC500100JjM interfaceC500100JjM2;
        if (abstractC1700910uMb == null) {
            return;
        }
        InterfaceC390601fU interfaceC390601fU = this.LLILZLL;
        if (interfaceC390601fU != null) {
            interfaceC390601fU.LJ();
        }
        LIZLLL(this.LLILZIL);
        C0TFO.LIZ("BoardDisplayView", " resetData sceneryBoardPlaceholderContainer?.removeAllViews()");
        LIZLLL(this.LLILZ);
        C482301uH bulletRenderer = getBulletRenderer();
        if (bulletRenderer != null) {
            bulletRenderer.LIZIZ();
        }
        if (abstractC1700910uMb instanceof C1700920uMc) {
            IPerformanceManager iPerformanceManager = C465520INi.LIZ;
            iPerformanceManager.sx0(false);
            iPerformanceManager.YR(false);
            C1EOY c1eoy = C1EOY.LIZ;
            RunnableC1160830gJV runnableC1160830gJVLJFF = c1eoy.LJFF("board_applying_period");
            if (runnableC1160830gJVLJFF != null) {
                C1EOY.LJ().removeCallbacks(runnableC1160830gJVLJFF);
            }
            RunnableC1160830gJV runnableC1160830gJVLJFF2 = c1eoy.LJFF("board_editing_period");
            if (runnableC1160830gJVLJFF2 != null) {
                C1EOY.LJ().removeCallbacks(runnableC1160830gJVLJFF2);
            }
            DataChannel dataChannel = this.LLIZLLLIL;
            if (dataChannel != null) {
                dataChannel.zW(PlaybookBoardEntityStatusChannel.class, Boolean.FALSE);
                return;
            }
            return;
        }
        if (abstractC1700910uMb instanceof C1700890uMZ) {
            final C1700890uMZ c1700890uMZ = (C1700890uMZ) abstractC1700910uMb;
            final Board board = c1700890uMZ.LIZ;
            if (board.version < 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("renderBoard board.version=");
                sbLIZ.append(board.version);
                sbLIZ.append(" required>=2 boardId=");
                sbLIZ.append(board.id);
                C470401sM.LIZIZ(-5009, 5, C2188811AlT.LIZIZ(sbLIZ));
                c1700890uMZ.LIZIZ.invoke(Boolean.FALSE);
            } else if (LJI(board) && LiveDecorationNativeBoardConflictCheckSetting.INSTANCE.getValue()) {
                z = true;
                InterfaceC390601fU interfaceC390601fU2 = this.LLILZLL;
                if (interfaceC390601fU2 != null) {
                    c11ksLJI2 = interfaceC390601fU2.LIZJ(getContext(), EnumC389301fH.WIDGET);
                    if (c11ksLJI2 != null) {
                        interfaceC500100JjM2.LIZ(new C09JN() { // from class: X.0uMR
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("BoardsDisplayView@e00c.renderBoard$1");
                                if (!((Boolean) obj).booleanValue()) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("renderBoard.effect onSuccess(false) bypassEffectApply=");
                                    sbLIZ2.append(z);
                                    sbLIZ2.append(" boardId=");
                                    sbLIZ2.append(board.id);
                                    C470401sM.LIZIZ(-5010, 5, C2188811AlT.LIZIZ(sbLIZ2));
                                    c1700890uMZ.LIZIZ.invoke(Boolean.FALSE);
                                } else {
                                    C0TFO.LIZ("BoardsDisplayView", "renderBoardAfterApply");
                                    this.LJII(board, false, new C1700820uMS(c1700890uMZ));
                                    C1790620whI.LJIIIIZZ();
                                    C1780220wQW c1780220wQW = C1790620whI.LIZJ;
                                    if (c1780220wQW != null) {
                                        c1780220wQW.LJI = System.currentTimeMillis();
                                        C1790620whI.LJIIJJI();
                                    }
                                }
                                C1C7U.LIZIZ("BoardsDisplayView@e00c.renderBoard$1");
                            }
                        }, new C09JN() { // from class: X.0uMT
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                String message;
                                C1C7U.LIZ("BoardsDisplayView@e00c.renderBoard$2");
                                Throwable th = (Throwable) obj;
                                C20441214yg.LJI("BoardsDisplayView", th);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("renderBoard.effect onError bypassEffectApply=");
                                sbLIZ2.append(z);
                                sbLIZ2.append(": ");
                                String string = null;
                                if (th != null) {
                                    message = th.getMessage();
                                } else {
                                    message = null;
                                }
                                sbLIZ2.append(message);
                                C470401sM.LIZIZ(-5002, 5, C2188811AlT.LIZIZ(sbLIZ2));
                                c1700890uMZ.LIZIZ.invoke(Boolean.FALSE);
                                if (!z) {
                                    C1790620whI c1790620whI = C1790620whI.LIZ;
                                    C1790620whI.LJIIIIZZ();
                                    C1790620whI.LJI("effect");
                                    if (th != null) {
                                        string = th.toString();
                                    }
                                    c1790620whI.LIZIZ(-1, string);
                                    DataChannel dataChannel2 = this.getDataChannel();
                                    if (dataChannel2 != null) {
                                        dataChannel2.LC0(PreviewBoardRenderDoneEvent.class, Boolean.TRUE);
                                    }
                                }
                                C1C7U.LIZIZ("BoardsDisplayView@e00c.renderBoard$2");
                            }
                        });
                    }
                }
            } else {
                z = false;
                InterfaceC390601fU interfaceC390601fU3 = this.LLILZLL;
                if (interfaceC390601fU3 != null) {
                    c11ksLJI2 = interfaceC390601fU3.LJI(getContext(), EnumC389301fH.WIDGET);
                    if (c11ksLJI2 != null && (interfaceC500100JjM2 = (InterfaceC500100JjM) c11ksLJI2.LJJ(C1701940uOG.LIZIZ()).LIZLLL(C11RD.LIZJ(this))) != null) {
                        interfaceC500100JjM2.LIZ(new C09JN() { // from class: X.0uMR
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("BoardsDisplayView@e00c.renderBoard$1");
                                if (!((Boolean) obj).booleanValue()) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("renderBoard.effect onSuccess(false) bypassEffectApply=");
                                    sbLIZ2.append(z);
                                    sbLIZ2.append(" boardId=");
                                    sbLIZ2.append(board.id);
                                    C470401sM.LIZIZ(-5010, 5, C2188811AlT.LIZIZ(sbLIZ2));
                                    c1700890uMZ.LIZIZ.invoke(Boolean.FALSE);
                                } else {
                                    C0TFO.LIZ("BoardsDisplayView", "renderBoardAfterApply");
                                    this.LJII(board, false, new C1700820uMS(c1700890uMZ));
                                    C1790620whI.LJIIIIZZ();
                                    C1780220wQW c1780220wQW = C1790620whI.LIZJ;
                                    if (c1780220wQW != null) {
                                        c1780220wQW.LJI = System.currentTimeMillis();
                                        C1790620whI.LJIIJJI();
                                    }
                                }
                                C1C7U.LIZIZ("BoardsDisplayView@e00c.renderBoard$1");
                            }
                        }, new C09JN() { // from class: X.0uMT
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                String message;
                                C1C7U.LIZ("BoardsDisplayView@e00c.renderBoard$2");
                                Throwable th = (Throwable) obj;
                                C20441214yg.LJI("BoardsDisplayView", th);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("renderBoard.effect onError bypassEffectApply=");
                                sbLIZ2.append(z);
                                sbLIZ2.append(": ");
                                String string = null;
                                if (th != null) {
                                    message = th.getMessage();
                                } else {
                                    message = null;
                                }
                                sbLIZ2.append(message);
                                C470401sM.LIZIZ(-5002, 5, C2188811AlT.LIZIZ(sbLIZ2));
                                c1700890uMZ.LIZIZ.invoke(Boolean.FALSE);
                                if (!z) {
                                    C1790620whI c1790620whI = C1790620whI.LIZ;
                                    C1790620whI.LJIIIIZZ();
                                    C1790620whI.LJI("effect");
                                    if (th != null) {
                                        string = th.toString();
                                    }
                                    c1790620whI.LIZIZ(-1, string);
                                    DataChannel dataChannel2 = this.getDataChannel();
                                    if (dataChannel2 != null) {
                                        dataChannel2.LC0(PreviewBoardRenderDoneEvent.class, Boolean.TRUE);
                                    }
                                }
                                C1C7U.LIZIZ("BoardsDisplayView@e00c.renderBoard$2");
                            }
                        });
                    }
                }
            }
            IPerformanceManager iPerformanceManager2 = C465520INi.LIZ;
            iPerformanceManager2.sx0(true);
            iPerformanceManager2.YR(false);
            C1EOY c1eoy2 = C1EOY.LIZ;
            RunnableC1160830gJV runnableC1160830gJVLJFF3 = c1eoy2.LJFF("board_editing_period");
            if (runnableC1160830gJVLJFF3 != null) {
                C1EOY.LJ().removeCallbacks(runnableC1160830gJVLJFF3);
            }
            RunnableC1160830gJV runnableC1160830gJVLJFF4 = c1eoy2.LJFF("board_applying_period");
            if (runnableC1160830gJVLJFF4 == null) {
                return;
            }
            C1EOY.LJ().removeCallbacks(runnableC1160830gJVLJFF4);
            C786410Ut5.LJJZZIII(C1EOY.LJ(), runnableC1160830gJVLJFF4);
            return;
        }
        if (abstractC1700910uMb instanceof C1700880uMY) {
            final C1700880uMY c1700880uMY = (C1700880uMY) abstractC1700910uMb;
            final Board board2 = c1700880uMY.LIZ;
            if (board2.version < 2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("renderPreviewBoard board.version=");
                sbLIZ2.append(board2.version);
                sbLIZ2.append(" required>=2 boardId=");
                sbLIZ2.append(board2.id);
                C470401sM.LIZIZ(-5007, 5, C2188811AlT.LIZIZ(sbLIZ2));
                c1700880uMY.LIZJ.invoke(Boolean.FALSE);
                return;
            }
            final boolean zLJI = LJI(board2);
            if (zLJI) {
                InterfaceC390601fU interfaceC390601fU4 = this.LLILZLL;
                if (interfaceC390601fU4 == null) {
                    return;
                } else {
                    c11ksLJI = interfaceC390601fU4.LIZJ(getContext(), EnumC389301fH.WIDGET);
                }
            } else {
                InterfaceC390601fU interfaceC390601fU5 = this.LLILZLL;
                if (interfaceC390601fU5 == null) {
                    return;
                } else {
                    c11ksLJI = interfaceC390601fU5.LJI(getContext(), EnumC389301fH.WIDGET);
                }
            }
            if (c11ksLJI == null || (interfaceC500100JjM = (InterfaceC500100JjM) c11ksLJI.LJJ(C1701940uOG.LIZIZ()).LIZLLL(C11RD.LIZJ(this))) == null) {
                return;
            }
            interfaceC500100JjM.LIZ(new C09JN() { // from class: X.0uMQ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BoardsDisplayView@e00c.renderPreviewBoard$1");
                    if (!((Boolean) obj).booleanValue()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("renderPreviewBoard.effect onSuccess(false) isNativeBoard=");
                        sbLIZ3.append(zLJI);
                        sbLIZ3.append(" boardId=");
                        sbLIZ3.append(board2.id);
                        C470401sM.LIZIZ(-5008, 5, C2188811AlT.LIZIZ(sbLIZ3));
                        c1700880uMY.LIZJ.invoke(Boolean.FALSE);
                    } else {
                        C0TFO.LIZ("BoardsDisplayView", "renderBoardAfterApply");
                        this.LJII(board2, false, new C1700790uMP(c1700880uMY));
                    }
                    C1C7U.LIZIZ("BoardsDisplayView@e00c.renderPreviewBoard$1");
                }
            }, new C09JN() { // from class: X.0uMO
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String message;
                    C1C7U.LIZ("BoardsDisplayView@e00c.renderPreviewBoard$2");
                    Throwable th = (Throwable) obj;
                    C20441214yg.LJI("BoardsDisplayView", th);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("renderPreviewBoard.effect onError isNativeBoard=");
                    sbLIZ3.append(zLJI);
                    sbLIZ3.append(": ");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ3.append(message);
                    C470401sM.LIZIZ(-5001, 5, C2188811AlT.LIZIZ(sbLIZ3));
                    c1700880uMY.LIZJ.invoke(Boolean.FALSE);
                    C1C7U.LIZIZ("BoardsDisplayView@e00c.renderPreviewBoard$2");
                }
            });
            return;
        }
        if (abstractC1700910uMb instanceof C1700900uMa) {
            C1700900uMa c1700900uMa = (C1700900uMa) abstractC1700910uMb;
            InterfaceC1815550xLV interfaceC1815550xLV = c1700900uMa.LIZ;
            if (interfaceC1815550xLV instanceof C1777850wMh) {
                if (((C1777850wMh) interfaceC1815550xLV).LIZ) {
                    C770220UJg c770220UJg = C770220UJg.LIZ;
                    C770220UJg.LJ(C13LE.LIZ(PreviewBulletinEditVisibilityChannel.class));
                    IPerformanceManager iPerformanceManager3 = C465520INi.LIZ;
                    iPerformanceManager3.sx0(false);
                    iPerformanceManager3.YR(true);
                    C1EOY c1eoy3 = C1EOY.LIZ;
                    RunnableC1160830gJV runnableC1160830gJVLJFF5 = c1eoy3.LJFF("board_applying_period");
                    if (runnableC1160830gJVLJFF5 != null) {
                        C1EOY.LJ().removeCallbacks(runnableC1160830gJVLJFF5);
                    }
                    RunnableC1160830gJV runnableC1160830gJVLJFF6 = c1eoy3.LJFF("board_editing_period");
                    if (runnableC1160830gJVLJFF6 != null) {
                        C1EOY.LJ().removeCallbacks(runnableC1160830gJVLJFF6);
                        C786410Ut5.LJJZZIII(C1EOY.LJ(), runnableC1160830gJVLJFF6);
                    }
                }
                LJII(c1700900uMa.LIZIZ, true, null);
            } else if (!(interfaceC1815550xLV instanceof C329901Pt)) {
                if (interfaceC1815550xLV instanceof C1815520xLS) {
                    Board board3 = c1700900uMa.LIZIZ;
                    BoardItem boardItem = ((C1815520xLS) interfaceC1815550xLV).LIZ;
                    if (boardItem != null) {
                        ConstraintLayout constraintLayout = this.LLILZIL;
                        if (constraintLayout != null) {
                            C786410Ut5.LJJJJL(constraintLayout);
                        }
                        C0TFO.LIZ("BoardDisplayView", "sceneryBoardPlaceholderContainer?.removeAllViews()");
                        C1817010xNr c1817010xNr = new C1817010xNr(getContext());
                        ConstraintLayout constraintLayout2 = this.LLILZIL;
                        if (constraintLayout2 != null) {
                            constraintLayout2.addView(c1817010xNr);
                        }
                        c1817010xNr.LJIIJ(LJ(board3, boardItem, false, null, null), this.LLIZLLLIL);
                    }
                } else {
                    throw new C1954807lC();
                }
            }
            DataChannel dataChannel2 = this.LLIZLLLIL;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.LC0(PreviewEditingDecorationToolsEvent.class, interfaceC1815550xLV);
            return;
        }
        throw new C1954807lC();
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLIZLLLIL = dataChannel;
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LLIZ = lifecycleOwner;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0xN4] */
    public BoardsDisplayView(Context context, AttributeSet attributeSet) {
        InterfaceC390601fU effectBoardService;
        super(context, attributeSet, 0);
        this.LL = FrameLayout.inflate(context, R.layout.g0v, this);
        this.LLILLL = C452501pT.LIZIZ(new C1814900xKS());
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (iEffectService != null) {
            effectBoardService = iEffectService.getEffectBoardService("anchor", "");
        } else {
            effectBoardService = null;
        }
        this.LLILZLL = effectBoardService;
        this.LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLJI = "";
        this.LLJILJIL = new C1818740xQe();
        this.LLJILJILJ = new InterfaceC1816560xN8() { // from class: X.0xN4
            @Override // X.InterfaceC1816560xN8
            public final C1817100xO0 LIZ(Board board, BoardItem boardItem, boolean z, C1733900vDo c1733900vDo, C1705740uUO c1705740uUO) {
                Function1 c07s4;
                BoardsDisplayView boardsDisplayView = this.LIZ;
                boardsDisplayView.getClass();
                C1816540xN6 c1816540xN6 = new C1816540xN6(c1733900vDo, boardsDisplayView);
                if (z) {
                    c07s4 = new C1706770uW3(boardsDisplayView, boardItem);
                } else {
                    c07s4 = new C07S4();
                }
                C1816650xNH c1816650xNH = new C1816650xNH(c1705740uUO);
                C1814950xKX c1814950xKX = new C1814950xKX(boardsDisplayView.getViewModel());
                C1814920xKU c1814920xKU = new C1814920xKU(boardsDisplayView.getViewModel());
                C1814980xKa c1814980xKaLIZJ = boardsDisplayView.LIZJ(board, boardItem, z);
                C758510TpB.LIZ();
                return new C1817100xO0(boardItem, c1816540xN6, c07s4, c1816650xNH, c1814950xKX, c1814920xKU, c1814980xKaLIZJ);
            }

            @Override // X.InterfaceC1816560xN8
            public final C1816930xNj LIZIZ(Board board, BoardItem boardItem, boolean z, C1733900vDo c1733900vDo, C1705740uUO c1705740uUO) {
                return this.LIZ.LJ(board, boardItem, z, c1733900vDo, c1705740uUO);
            }
        };
        this.LLJILLL = new C1705700uUK();
        this.LLJJ = new BoardsDisplayView$viewLifecycleObserver$1(this);
    }

    @Override // X.InterfaceC1816580xNA
    public final Pair<Float, Float> LIZ(InterfaceC395901gL interfaceC395901gL, BoardItem boardItem) {
        Long lValueOf;
        View view = interfaceC395901gL.getView();
        if (view == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[VirtualCanvas-BoardsDisplay] boardId=");
            if (boardItem != null) {
                lValueOf = Long.valueOf(boardItem.id);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(" | EARLY RETURN: boardView is null");
            C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (boardItem == null) {
            C1092200eWo.LIZ("[VirtualCanvas-BoardsDisplay] EARLY RETURN: boardItem is null");
            return null;
        }
        BoardItemLayout boardItemLayoutLIZ = C488201vE.LIZ(boardItem, C488601vI.LIZ());
        if (boardItemLayoutLIZ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[VirtualCanvas-BoardsDisplay] boardId=");
            sbLIZ2.append(boardItem.id);
            sbLIZ2.append(" | EARLY RETURN: getUnifiedItemLayout() is null | canvasItemLayout=");
            sbLIZ2.append(boardItem.canvasItemLayout);
            sbLIZ2.append(" | boardItemLayout=");
            sbLIZ2.append(boardItem.boardItemLayout);
            C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        C488301vF c488301vFLIZ = C488601vI.LIZ();
        float f = c488301vFLIZ.LIZ;
        float f2 = C488301vF.LJ;
        float f3 = f / f2;
        float measuredWidth = view.getMeasuredWidth();
        C394501g7 config = interfaceC395901gL.getConfig();
        float f4 = measuredWidth * config.LJJ * config.LJJIIZ;
        float measuredHeight = view.getMeasuredHeight();
        C394501g7 config2 = interfaceC395901gL.getConfig();
        float f5 = measuredHeight * config2.LJJ * config2.LJJIIZ;
        float f6 = f4 / f3;
        float f7 = f5 / f3;
        Pair<Float, Float> pairLIZ = this.LLJILJIL.LIZ(boardItem.id, f6, f7, boardItemLayoutLIZ);
        float fFloatValue = pairLIZ.getFirst().floatValue();
        float fFloatValue2 = pairLIZ.getSecond().floatValue();
        float f8 = (f6 / 2.0f) + fFloatValue;
        float f9 = (f7 / 2.0f) + fFloatValue2;
        StringBuilder sb = new StringBuilder("[VirtualCanvas-BoardsDisplay] boardId=");
        sb.append(boardItem.id);
        sb.append(" | viewMeasured=(");
        sb.append(view.getMeasuredWidth());
        sb.append(", ");
        sb.append(view.getMeasuredHeight());
        sb.append(") | effectiveScale=");
        C394501g7 config3 = interfaceC395901gL.getConfig();
        sb.append(config3.LJJ * config3.LJJIIZ);
        sb.append(" | scaleFactor=");
        sb.append(f3);
        sb.append(" | visual=(");
        sb.append(f4);
        sb.append(", ");
        sb.append(f5);
        sb.append(") | logical390=(");
        sb.append(f6);
        sb.append(", ");
        sb.append(f7);
        sb.append(") | topLeft390=(");
        sb.append(fFloatValue);
        sb.append(", ");
        sb.append(fFloatValue2);
        sb.append(") | center390=(");
        sb.append(f8);
        sb.append(", ");
        sb.append(f9);
        sb.append(") | anchor=(h=");
        sb.append(boardItemLayoutLIZ.horizontalAnchor);
        sb.append(", v=");
        sb.append(boardItemLayoutLIZ.verticalAnchor);
        sb.append(") | offset=(x=");
        sb.append(boardItemLayoutLIZ.offsetX);
        sb.append(", y=");
        sb.append(boardItemLayoutLIZ.offsetY);
        sb.append(") | canvasCfg=(devW=");
        sb.append(c488301vFLIZ.LIZ);
        sb.append(", devH=");
        sb.append(c488301vFLIZ.LIZIZ);
        sb.append(", topOffsetPx=");
        sb.append(c488301vFLIZ.LIZJ);
        sb.append(", L=");
        sb.append(f2);
        sb.append(')');
        C1092200eWo.LIZ(sb.toString());
        return new Pair<>(Float.valueOf(f8), Float.valueOf(f9));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List r6, X.InterfaceC1364105Vn r7, X.C1733890vDn r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1733910vDp
            if (r0 == 0) goto L5c
            r4 = r7
            X.0vDp r4 = (X.C1733910vDp) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L4a
            if (r0 != r1) goto L6a
            kotlin.jvm.functions.Function2 r8 = r4.LLILLJJLI
            java.lang.Object r6 = r4.LL
            java.util.List r6 = (java.util.List) r6
            X.C155000ia.LIZIZ(r3)
        L28:
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r4 = r3.iterator()
            r3 = 0
        L2f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 < 0) goto L62
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r3)
            X.0uUM r0 = (X.C1705720uUM) r0
            com.bytedance.android.livesdk.model.BoardItem r0 = r0.LIZ
            r8.invoke(r0, r2)
            r3 = r1
            goto L2f
        L4a:
            X.C155000ia.LIZIZ(r3)
            X.0uUK r0 = r5.LLJILLL
            r4.LL = r6
            r4.LLILLJJLI = r8
            r4.LLILZIL = r1
            java.lang.Object r3 = r0.LIZ(r6, r4)
            if (r3 != r2) goto L28
            return r2
        L5c:
            X.0vDp r4 = new X.0vDp
            r4.<init>(r5, r7)
            goto L12
        L62:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L67:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView.LIZIZ(java.util.List, X.05Vn, X.0vDn):java.lang.Object");
    }

    public final C1814980xKa LIZJ(Board board, BoardItem boardItem, boolean z) {
        String string;
        String string2;
        String string3;
        String str;
        String str2;
        String string4;
        Room roomLJJLIIIIJ;
        Room roomLJJLIIIIJ2;
        User owner;
        long j = board.id;
        long j2 = boardItem.id;
        DataChannel dataChannel = this.LLIZLLLIL;
        String str3 = "";
        if (dataChannel == null || (roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel)) == null || (owner = roomLJJLIIIIJ2.getOwner()) == null || (string = Long.valueOf(owner.getId()).toString()) == null) {
            string = "";
        }
        DataChannel dataChannel2 = this.LLIZLLLIL;
        if (dataChannel2 == null || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) == null || (string2 = Long.valueOf(roomLJJLIIIIJ.getId()).toString()) == null) {
            string2 = "";
        }
        RecommendBoardInfo recommendBoardInfo = board.recommendBoardInfo;
        if (recommendBoardInfo == null || (string3 = Integer.valueOf(recommendBoardInfo.boardSource).toString()) == null) {
            string3 = CardStruct.IStatusCode.DEFAULT;
        }
        RecommendBoardInfo recommendBoardInfo2 = board.recommendBoardInfo;
        if (recommendBoardInfo2 != null && (string4 = Long.valueOf(recommendBoardInfo2.recommendBoardId).toString()) != null) {
            str3 = string4;
        }
        int i = boardItem.boardItemType;
        if (i != 5) {
            if (i != 6) {
                if (i != 8) {
                    str = "board";
                } else {
                    str = "overlay_image";
                }
            } else {
                str = "scenery";
            }
        } else {
            str = "text";
        }
        if (z) {
            str2 = "decoration_editor";
        } else {
            str2 = this.LLJI;
        }
        return new C1814980xKa(j, j2, string, string2, "rich_text_decoration", string3, recommendBoardInfo, str, str3, str2);
    }

    public final void LJFF(Fragment fragment, DataChannel dataChannel, String str) {
        AbstractC1700910uMb value;
        boolean z;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        LifecycleCoroutineScope lifecycleScope;
        this.LLIZ = fragment;
        this.LLIZLLLIL = dataChannel;
        this.LLJI = str;
        this.LLILZ = (ConstraintLayout) this.LL.findViewById(R.id.gaj);
        this.LLILZIL = (ConstraintLayout) this.LL.findViewById(R.id.u1c);
        BoardsDisplayViewModel viewModel = getViewModel();
        C05YD<AbstractC1700910uMb> c05yd = viewModel.LLILZ;
        if (c05yd != null) {
            value = c05yd.getValue();
        } else {
            value = null;
        }
        if ((value instanceof C1700920uMc) || value == null) {
            LastUsedLiveBoardsModel lastUsedLiveBoardsModelLIZIZ = C0KPJ.pf.LIZIZ();
            long j = lastUsedLiveBoardsModelLIZIZ.boardId;
            if (lastUsedLiveBoardsModelLIZIZ.needRestore && j != 0 && j != viewModel.LLIZLLLIL) {
                z = true;
            } else {
                z = false;
            }
            if (SmbLiveKickstarterSetting.INSTANCE.isEnabled() && !z) {
                dataChannel.LC0(PreviewBoardRenderDoneEvent.class, Boolean.TRUE);
            } else {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(viewModel), C0PEM.LIZJ, null, new C1814550xJt(viewModel, z, dataChannel, null), 2);
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LifecycleOwner lifecycleOwner = this.LLIZ;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C1816670xNJ(this, null), 3);
        } else {
            anonymousClass0956LIZLLL = null;
        }
        this.LLILLJJLI = anonymousClass0956LIZLLL;
        LifecycleOwner lifecycleOwner2 = this.LLIZ;
        if (lifecycleOwner2 != null) {
            DataChannel dataChannel2 = this.LLIZLLLIL;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(lifecycleOwner2, CameraResumeEvent.class, new C1814570xJv(this));
                dataChannel2.BQ2(lifecycleOwner2, NativeDecorationOperationEvent.class, new C1733930vDr(this));
            }
            if (C500260Jjc.LJJ()) {
                getViewModel().LLILZIL = "live_detail";
            } else {
                DataChannelGlobal.LLILZ.BQ2(this, lifecycleOwner2, PreviewSchemaCreateBoardEvent.class, new C1814970xKZ(this));
                DataChannel dataChannel3 = this.LLIZLLLIL;
                if (dataChannel3 != null) {
                    dataChannel3.BQ2(lifecycleOwner2, DecorationEditLogDataEvent.class, new C1814910xKT(this));
                }
            }
        }
        fragment.getLifecycle().addObserver(this.LLJJ);
        LifecycleOwner lifecycleOwner3 = this.LLIZ;
        if (lifecycleOwner3 instanceof Fragment) {
            Fragment fragment2 = (Fragment) lifecycleOwner3;
            C723850SaN.LIZ(fragment2, false, null, new C1161504gX(fragment2, this), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.android.livesdk.model.Board r26, boolean r27, kotlin.jvm.functions.Function1 r28) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView.LJII(com.bytedance.android.livesdk.model.Board, boolean, kotlin.jvm.functions.Function1):void");
    }

    public final C1816930xNj LJ(Board board, BoardItem boardItem, boolean z, Function1<? super InterfaceC395901gL, Unit> function1, Function0<Unit> function0) {
        boolean z2;
        Function0 c1816590xNB;
        C758470Tp7 c758470Tp7LIZ = C758510TpB.LIZ();
        if (c758470Tp7LIZ != null && c758470Tp7LIZ.LJI && (boardItem.boardItemType != 6 || !boardItem.matting)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1816530xN5 c1816530xN5 = new C1816530xN5(boardItem, function1, this);
        if (z) {
            c1816590xNB = new C1816550xN7(this, boardItem);
        } else {
            c1816590xNB = new C1816590xNB();
        }
        return new C1816930xNj(boardItem, z, true, z2, c1816530xN5, c1816590xNB, new C1816570xN9(function0), new C1814870xKP(z, this, board), new C1814880xKQ(this, board), new C1814860xKO(getViewModel()), LIZJ(board, boardItem, z), 0L);
    }
}
