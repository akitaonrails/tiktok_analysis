package com.ss.android.ugc.aweme.slash.cell.list.horizontal;

import X.AbstractC1585810rMx;
import X.C1197200hGA;
import X.C19M4;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1197210hGB;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS118S0100000_18;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.slash.cell.arc.BasePowerListSlashCellGroup;
import com.ss.android.ugc.aweme.slash.cell.arc.Padding;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCommonAction;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCommonEvent;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashTrackConfig;
import com.ss.android.ugc.aweme.slash.cell.list.horizontal.SlashHorizontalListCellGroup;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashHorizontalListCellGroup extends BasePowerListSlashCellGroup<SlashHorizontalListCellModel> {
    public C1197200hGA LLJJJ;
    public View LLJJJIL;
    public C19M4 LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f96;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.BasePowerListSlashCellGroup
    public final int Ip() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void Bp() {
        getContentView().setPadding(0, 0, 0, 0);
        Padding paddingAp = Ap();
        if (paddingAp == null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.setPadding(0, 0, 0, 0);
                return;
            }
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null) {
            return;
        }
        if (C426750GoL.LIZLLL(getContentView().getContext())) {
            viewOnAttachStateChangeListenerC20604515jv2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.right))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.top))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.left))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.bottom))));
        } else {
            viewOnAttachStateChangeListenerC20604515jv2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.left))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.top))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.right))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.bottom))));
        }
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.BasePowerListSlashCellGroup, com.ss.android.ugc.aweme.slash.cell.arc.SlashCell, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJ = (C1197200hGA) view.findViewById(R.id.view_more_container);
        this.LLJJJIL = view.findViewById(R.id.view_more_button_area);
        this.LLJJJJ = (C19M4) view.findViewById(R.id.view_more_text);
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.BasePowerListSlashCellGroup, com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void zp(SlashCellModel slashCellModel) {
        C1197200hGA c1197200hGA;
        C19M4 c19m4;
        super.zp(slashCellModel);
        List<SlashCellModel> list = slashCellModel.cells;
        if (list == null || list.size() < 3) {
            getContentView().getLayoutParams().width = -2;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS118S0100000_18(this, 49));
        }
        final SlashTrackConfig slashTrackConfigEp = Ep("slide_cell");
        if (!this.LLJJJJJIL && slashTrackConfigEp != null) {
            this.LLJJJJJIL = true;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv2.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0gmp
                    public int LL;

                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIJ(RecyclerView recyclerView, int i) {
                        if (i != 0) {
                            return;
                        }
                        if (this.LL != 0) {
                            this.LLILLJJLI.up(slashTrackConfigEp);
                        }
                        this.LL = 0;
                    }

                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                        this.LL = i;
                    }
                });
            }
        }
        SlashHorizontalListCellModel slashHorizontalListCellModel = (SlashHorizontalListCellModel) this.LLJJIII;
        if (slashHorizontalListCellModel != null) {
            ViewMoreConfig viewMoreConfig = slashHorizontalListCellModel.viewMoreConfig;
            if (viewMoreConfig == null) {
                C1197200hGA c1197200hGA2 = this.LLJJJ;
                if (c1197200hGA2 != null) {
                    c1197200hGA2.LLILZLL = false;
                }
                View view = this.LLJJJIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                    return;
                }
                return;
            }
            View view2 = this.LLJJJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C1197200hGA c1197200hGA3 = this.LLJJJ;
            if (c1197200hGA3 != null) {
                c1197200hGA3.LLILZLL = true;
            }
            String str = viewMoreConfig.text;
            if (str != null && (c19m4 = this.LLJJJJ) != null) {
                c19m4.setText(str);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIJIIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null && (c1197200hGA = this.LLJJJ) != null) {
                c1197200hGA.setPowerList(viewOnAttachStateChangeListenerC20604515jv3);
            }
            C1197200hGA c1197200hGA4 = this.LLJJJ;
            if (c1197200hGA4 == null) {
                return;
            }
            c1197200hGA4.setScrollAction(new InterfaceC1197210hGB() { // from class: X.0gml
                @Override // X.InterfaceC1197210hGB
                public final void LIZ() {
                }

                @Override // X.InterfaceC1197210hGB
                public final void LIZJ(float f) {
                }

                @Override // X.InterfaceC1197210hGB
                public final void LIZIZ() {
                    List<SlashCommonEvent> list2;
                    C1186840gzS c1186840gzSLw1;
                    SlashHorizontalListCellGroup slashHorizontalListCellGroup = this.LIZ;
                    View contentView = slashHorizontalListCellGroup.LLJJJ;
                    if (contentView == null) {
                        contentView = slashHorizontalListCellGroup.getContentView();
                    }
                    SlashCellModel slashCellModelLp = slashHorizontalListCellGroup.lp();
                    if (slashCellModelLp == null || (list2 = slashCellModelLp.events) == null) {
                        return;
                    }
                    Iterator<SlashCommonEvent> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        List<SlashCommonAction> list3 = it2.next().actions;
                        if (list3 != null) {
                            for (SlashCommonAction slashCommonAction : list3) {
                                if (slashCommonAction.isTrackEvent()) {
                                    slashHorizontalListCellGroup.op(slashCommonAction);
                                } else {
                                    InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(slashHorizontalListCellGroup);
                                    if (interfaceC1181010gq3LIZIZ != null && (c1186840gzSLw1 = interfaceC1181010gq3LIZIZ.lw1()) != null) {
                                        String strIp = slashHorizontalListCellGroup.ip();
                                        if (strIp == null) {
                                            strIp = "";
                                        }
                                        c1186840gzSLw1.LIZ(C1157910gEn.LIZ(slashCommonAction, contentView, strIp));
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
    }
}
