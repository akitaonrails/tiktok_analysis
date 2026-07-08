package com.bytedance.android.livesdk.billboard.ui.page;

import X.AbstractC1103960epm;
import X.AbstractC1119550fEv;
import X.C06MM;
import X.C1103880epe;
import X.C1103890epf;
import X.C1516000pYM;
import X.C19EG;
import X.C19FO;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2757014x;
import X.C439101nJ;
import X.InterfaceC1103990epp;
import X.InterfaceC1891350zJl;
import X.InterfaceC201500q5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC1119480fEo;
import Y.AObserverS221S0100000_17;
import Y.AsS44S0100000_17;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.billboard.ui.cell.DividerLineCell;
import com.bytedance.android.livesdk.billboard.ui.cell.ImageCell;
import com.bytedance.android.livesdk.billboard.ui.cell.LegendCell;
import com.bytedance.android.livesdk.billboard.ui.cell.TextCell;
import com.bytedance.android.livesdk.billboard.ui.cell.TextTrailingImageCell;
import com.bytedance.android.livesdk.billboard.ui.cell.TitleCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.host_board.BoardCell;
import webcast.data.host_board.HostBoard;
import webcast.data.host_board.Padding;

/* JADX INFO: loaded from: classes18.dex */
public final class BasicPageVH extends AbstractC1103960epm {
    public static final /* synthetic */ int LLIZ = 0;
    public final ViewOnAttachStateChangeListenerC20604515jv LL;
    public final ViewOnLayoutChangeListenerC1119480fEo LLILLJJLI;
    public final C1103890epf LLILLL;
    public List<? extends AbstractC1119550fEv> LLILZ;
    public boolean LLILZIL;
    public final AObserverS221S0100000_17 LLILZLL;

    @Override // X.AbstractC1103960epm
    public final void LJJJJLI() {
        this.LL.scrollToPosition(0);
    }

    @Override // X.AbstractC1103960epm
    public final void onAttach() {
        MutableLiveData<Boolean> mutableLiveData;
        C1103890epf c1103890epf = this.LLILLL;
        if (c1103890epf == null || (mutableLiveData = c1103890epf.LIZIZ) == null) {
            return;
        }
        mutableLiveData.observeForever(this.LLILZLL);
    }

    @Override // X.AbstractC1103960epm
    public final void onDetach() {
        MutableLiveData<Boolean> mutableLiveData;
        C1103890epf c1103890epf = this.LLILLL;
        if (c1103890epf == null || (mutableLiveData = c1103890epf.LIZIZ) == null) {
            return;
        }
        mutableLiveData.removeObserver(this.LLILZLL);
    }

    public BasicPageVH(View view, InterfaceC1103990epp interfaceC1103990epp) {
        C19FO c19fo;
        C1103880epe c1103880epe;
        super(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        ViewOnLayoutChangeListenerC1119480fEo viewOnLayoutChangeListenerC1119480fEo = new ViewOnLayoutChangeListenerC1119480fEo(interfaceC1103990epp);
        this.LLILLJJLI = viewOnLayoutChangeListenerC1119480fEo;
        C1103890epf viewState = null;
        if ((interfaceC1103990epp instanceof C1103880epe) && (c1103880epe = (C1103880epe) interfaceC1103990epp) != null) {
            viewState = c1103880epe.getViewState();
        }
        this.LLILLL = viewState;
        this.LLILZ = new ArrayList();
        this.LLILZLL = new AObserverS221S0100000_17(this, 7);
        final Context context = viewOnAttachStateChangeListenerC20604515jv.getContext();
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context) { // from class: com.bytedance.android.livesdk.billboard.ui.page.BasicPageVH$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                MutableLiveData<Boolean> mutableLiveData;
                C1103890epf c1103890epf = this.LL.LLILLL;
                if (c1103890epf == null || (mutableLiveData = c1103890epf.LIZ) == null) {
                    return false;
                }
                return Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
            }
        });
        viewOnAttachStateChangeListenerC20604515jv.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1119480fEo);
        Activity activityLIZ = C06MM.LIZ(viewOnAttachStateChangeListenerC20604515jv.getContext());
        if ((activityLIZ instanceof C19EG) && (c19fo = (C19FO) activityLIZ) != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(c19fo);
        }
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS44S0100000_17(this, 1));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TitleCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(DividerLineCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TextCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TextTrailingImageCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ImageCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(LegendCell.class);
    }

    public static List L5(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AbstractC1119550fEv abstractC1119550fEv = (AbstractC1119550fEv) obj;
            if (!z || abstractC1119550fEv.LL.nonfoldable) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() && (!list.isEmpty())) {
            return list.subList(0, 1);
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1103960epm
    public final void I5(C2757014x c2757014x, int i) {
        final HostBoard hostBoardLIZ;
        String strLIZJ;
        boolean zLJFF;
        MutableLiveData<Boolean> mutableLiveData;
        AbstractC1119550fEv abstractC1119550fEv;
        InterfaceC201500q5 interfaceC201500q5 = c2757014x.LIZJ;
        if (interfaceC201500q5 == null || (hostBoardLIZ = interfaceC201500q5.LIZ()) == null) {
            hostBoardLIZ = c2757014x.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BasicPageVH#bindData: pos=");
        sbLIZ.append(i);
        sbLIZ.append(" boardId=");
        sbLIZ.append(hostBoardLIZ.boardId);
        sbLIZ.append(" padding=");
        Padding padding = hostBoardLIZ.padding;
        if (padding != null) {
            strLIZJ = C1516000pYM.LIZJ(padding);
        } else {
            strLIZJ = null;
        }
        sbLIZ.append(strLIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        Padding padding2 = hostBoardLIZ.padding;
        if (padding2 != null) {
            this.itemView.setPadding(C439101nJ.LIZ(padding2.paddingLeft), C439101nJ.LIZ(padding2.paddingTop), C439101nJ.LIZ(padding2.paddingRight), C439101nJ.LIZ(padding2.paddingBottom));
        }
        ViewOnLayoutChangeListenerC1119480fEo viewOnLayoutChangeListenerC1119480fEo = this.LLILLJJLI;
        viewOnLayoutChangeListenerC1119480fEo.getClass();
        viewOnLayoutChangeListenerC1119480fEo.LLILLJJLI = hostBoardLIZ;
        List<BoardCell> list = hostBoardLIZ.cellList;
        ArrayList arrayList = new ArrayList();
        for (final BoardCell boardCell : list) {
            String str = boardCell.type;
            switch (str.hashCode()) {
                case -1210163878:
                    if (str.equals("divider_line")) {
                        abstractC1119550fEv = new AbstractC1119550fEv(boardCell, hostBoardLIZ) { // from class: X.0fEp
                        };
                        arrayList.add(abstractC1119550fEv);
                    }
                    break;
                case -1106574323:
                    if (str.equals("legend")) {
                        abstractC1119550fEv = new AbstractC1119550fEv(boardCell, hostBoardLIZ) { // from class: X.0fEr
                        };
                        arrayList.add(abstractC1119550fEv);
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        abstractC1119550fEv = new AbstractC1119550fEv(boardCell, hostBoardLIZ) { // from class: X.0fEs
                        };
                        arrayList.add(abstractC1119550fEv);
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        abstractC1119550fEv = new AbstractC1119550fEv(boardCell, hostBoardLIZ) { // from class: X.0fEq
                        };
                        arrayList.add(abstractC1119550fEv);
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        abstractC1119550fEv = new AbstractC1119550fEv(boardCell, hostBoardLIZ) { // from class: X.0fEu
                        };
                        arrayList.add(abstractC1119550fEv);
                    }
                    break;
                case 442773706:
                    if (str.equals("text_trailing_image")) {
                        abstractC1119550fEv = new AbstractC1119550fEv(boardCell, hostBoardLIZ) { // from class: X.0fEt
                        };
                        arrayList.add(abstractC1119550fEv);
                    }
                    break;
            }
        }
        this.LLILZ = arrayList;
        C20600815jK<InterfaceC1891350zJl> state = this.LL.getState();
        List<? extends AbstractC1119550fEv> list2 = this.LLILZ;
        C1103890epf c1103890epf = this.LLILLL;
        if (c1103890epf != null && (mutableLiveData = c1103890epf.LIZIZ) != null) {
            zLJFF = Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        state.LJIILL(L5(list2, zLJFF), null);
    }
}
