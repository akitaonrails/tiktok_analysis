package com.bytedance.android.livesdk.viewerwishestmp.queue;

import X.C05JH;
import X.C0PEM;
import X.C1125770fOx;
import X.C13LP;
import X.C15438062q;
import X.C16F5;
import X.C19719612Di;
import X.C1AHS;
import X.C1AHW;
import X.C20337914i1;
import X.C2176821AHg;
import X.C2176831AHh;
import X.C2176861AHk;
import X.C2176871AHl;
import X.C2176881AHm;
import X.C23250099c;
import X.C481090Itn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1094160eZy;
import X.InterfaceC19341710lj;
import Y.AsS58S0100000_33;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksOrder;
import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS51S0100100_17;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS682S0100000_33;
import wh6.AbS517S0200000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ViewerWishesQueuePage extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PiwpPiohPyHELIOSw/ISogPCg8Zz4mLTApZxk6LTIpOxg6Oy0pOh4mLTApGS40LQ==";
    public C2176871AHl LLJLLL;
    public DataChannel LLJZ;
    public boolean LLJZIJLIL;
    public C1AHS LLL;
    public View LLLF;
    public View LLLFF;
    public RecyclerView LLLFFI;
    public C481090Itn LLLFZ;
    public View LLLI;
    public View LLLII;
    public View LLLIIII;
    public C16F5 LLLIIIIL;
    public View LLLIIIL;
    public View LLLIIL;
    public View LLLIILIL;
    public boolean LLLILZ;
    public boolean LLLILZLLLI;
    public final AwS612S0100000_33 LLLIL = new AwS612S0100000_33(this, 33);
    public final AsS58S0100000_33 LLLILZJ = new AsS58S0100000_33(this, 1);

    public final boolean uS() {
        if (!this.LLLILZLLLI) {
            return false;
        }
        C2176871AHl c2176871AHl = this.LLJLLL;
        return (c2176871AHl != null ? c2176871AHl.LIZJ : 0L) <= C2176861AHk.LIZ();
    }

    public final void wS() {
        List<ViewerPicksOrder> list;
        C2176871AHl c2176871AHl = this.LLJLLL;
        if (c2176871AHl == null || (list = c2176871AHl.LIZIZ) == null || list.isEmpty()) {
            C500260Jjc.LLFFF(this.LLLIIII);
            C500260Jjc.LLFFF(this.LLLIIIIL);
            if (!this.LLJZIJLIL) {
                C500260Jjc.LLFFF(this.LLLIIIL);
            }
            C500260Jjc.LJIILIIL(this.LLLFZ);
        } else {
            C500260Jjc.LJIILIIL(this.LLLIIII);
            C500260Jjc.LJIILIIL(this.LLLIIIIL);
            C500260Jjc.LJIILIIL(this.LLLIIIL);
            C500260Jjc.LLFFF(this.LLLFZ);
        }
        BS();
    }

    public final void BS() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (uS() || (recyclerView = this.LLLFFI) == null || recyclerView.canScrollVertically(1) || (recyclerView2 = this.LLLFFI) == null) {
            return;
        }
        recyclerView2.smoothScrollBy(0, -((int) C497740JfY.LIZIZ(1.0f)));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        DataChannel dataChannel = this.LLJZ;
        if (dataChannel != null) {
            dataChannel.GQ2(this, ViewerWishesStatus.class, this.LLLIL);
        }
    }

    public final void ES(List<ViewerPicksOrder> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (ViewerPicksOrder viewerPicksOrder : list) {
                arrayList.add(new C1AHW(viewerPicksOrder.id, viewerPicksOrder.orderer, viewerPicksOrder.giftPick, 56));
            }
        } else {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC1094160eZy.q1;
            if (c20337914i1.LIZIZ().booleanValue()) {
                c20337914i1.LJFF(Boolean.FALSE);
                ((C1AHW) ListProtector.get(arrayList, 0)).LJFF = true;
            }
        }
        C1AHS c1ahs = this.LLL;
        if (c1ahs != null) {
            c1ahs.LLLI(arrayList, new C2176821AHg(this));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.dimBehindType = 2;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    public final void yS(List<ViewerPicksOrder> list) {
        this.LLLILZ = false;
        RecyclerView recyclerView = this.LLLFFI;
        if (recyclerView != null) {
            recyclerView.stopScroll();
        }
        if (list.isEmpty()) {
            BS();
        }
        C1AHS c1ahs = this.LLL;
        if (c1ahs != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (ViewerPicksOrder viewerPicksOrder : list) {
                arrayList.add(new C1AHW(viewerPicksOrder.id, viewerPicksOrder.orderer, viewerPicksOrder.giftPick, 56));
            }
            C2176831AHh c2176831AHh = new C2176831AHh(this);
            List<C1AHW> listLLLFZ = c1ahs.LLLFZ();
            C1AHW c1ahw = (C1AHW) C13LP.LJJLIIIJL(c1ahs.LL);
            if (c1ahw != null && c1ahw.LIZ == -1) {
                C19719612Di.LJJIJIIJI(listLLLFZ);
            }
            ((ArrayList) listLLLFZ).addAll(arrayList);
            c1ahs.LLLI(listLLLFZ, c2176831AHh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zS(java.lang.String r51) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage.zS(java.lang.String):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long jLongValue;
        String str;
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        List<Long> list;
        Long l;
        super.onViewCreated(view, bundle);
        this.LLLFF = view.findViewById(R.id.vw_queue_faq_btn);
        this.LLLF = view.findViewById(R.id.vw_queue_settings_btn);
        this.LLLFFI = (RecyclerView) view.findViewById(R.id.vw_queue_recycler_view);
        this.LLLFZ = (C481090Itn) view.findViewById(R.id.vw_queue_refresh_layout);
        this.LLLI = view.findViewById(R.id.vw_queue_init_loading);
        this.LLLII = view.findViewById(R.id.vw_queue_delete_loading);
        this.LLLIIII = view.findViewById(R.id.vw_queue_empty_image);
        this.LLLIIIIL = (C16F5) view.findViewById(R.id.vw_queue_empty_text);
        this.LLLIIIL = view.findViewById(R.id.vw_queue_empty_text_btn);
        this.LLLIIL = view.findViewById(R.id.vw_queue_loading_error_text);
        this.LLLIILIL = view.findViewById(R.id.vw_queue_loading_error_retry_btn);
        DataChannel dataChannel = this.LLJZ;
        if (dataChannel != null) {
            dataChannel.EQ2(this, ViewerWishesStatus.class, this.LLLIL);
        }
        if (this.LLJZIJLIL) {
            C500260Jjc.LLFFF(this.LLLF);
            View view2 = this.LLLF;
            if (view2 != null) {
                C786410Ut5.I7(new AbS517S0200000_33(view2, (Function1) new AwS596S0100000_17(this, 442), 1), view2);
            }
            View view3 = this.LLLFF;
            if (view3 != null) {
                C500260Jjc.LJIILIIL(view3);
            }
        } else {
            C500260Jjc.LLFFF(this.LLLFF);
            View view4 = this.LLLFF;
            if (view4 != null) {
                C786410Ut5.I7(new AbS517S0200000_33(view4, new AwS596S0100000_17(this, 443), 2), view4);
            }
            C500260Jjc.LJIILIIL(this.LLLF);
        }
        C481090Itn c481090Itn = this.LLLFZ;
        if (c481090Itn != null) {
            c481090Itn.setOnRefreshListener(new InterfaceC19341710lj() { // from class: X.1AHj
                @Override // X.InterfaceC19341710lj
                public final void LJFF() {
                    C481090Itn c481090Itn2 = this.LL.LLLFZ;
                    if (c481090Itn2 != null) {
                        c481090Itn2.setRefreshing(true);
                    }
                    ViewerWishesQueuePage viewerWishesQueuePage = this.LL;
                    C2176871AHl c2176871AHl = viewerWishesQueuePage.LLJLLL;
                    if (c2176871AHl != null) {
                        c2176871AHl.LIZ(EnumC20674115v9.REFRESH, new AwS612S0100000_33(viewerWishesQueuePage, 34), new AwS577S0100000_33(this.LL, 330), new AwS577S0100000_33(this.LL, 331));
                    }
                }
            });
        }
        if (this.LLJZIJLIL) {
            C16F5 c16f5 = this.LLLIIIIL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131857016));
            }
        } else {
            DataChannel dataChannel2 = this.LLJZ;
            if (dataChannel2 != null && (c2176881AHm = (C2176881AHm) dataChannel2.gg0(ViewerWishesStatus.class)) != null && (c1125770fOx = c2176881AHm.LIZIZ) != null && (list = c1125770fOx.LIZ) != null && (l = (Long) C13LP.LJJJLL(list)) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Gift giftFindGiftById = GiftManager.inst().findGiftById(jLongValue);
            C16F5 c16f52 = this.LLLIIIIL;
            if (c16f52 != null) {
                Object[] objArr = new Object[1];
                if (giftFindGiftById == null || (str = giftFindGiftById.name) == null) {
                    str = "";
                }
                objArr[0] = str;
                c16f52.setText(C497740JfY.LJIJJ(2131857017, objArr));
            }
            View view5 = this.LLLIIIL;
            if (view5 != null) {
                C786410Ut5.I7(new AbS517S0200000_33(view5, new AwS51S0100100_17(this, jLongValue, 5), 1), view5);
            }
        }
        C500260Jjc.LLFFF(this.LLLI);
        C500260Jjc.LJIILIIL(this.LLLIIL);
        C500260Jjc.LJIILIIL(this.LLLIILIL);
        C500260Jjc.LJIILIIL(this.LLLFZ);
        View view6 = this.LLLIILIL;
        if (view6 != null) {
            C786410Ut5.I7(new AbS517S0200000_33(view6, new AwS612S0100000_33(this, 157), 1), view6);
        }
        C1AHS c1ahs = new C1AHS(new ArrayList(), new AwS682S0100000_33(this, 11), this.LLJZIJLIL, this.LLJZ, this.LLJLLL);
        this.LLL = c1ahs;
        RecyclerView recyclerView = this.LLLFFI;
        if (recyclerView != null) {
            recyclerView.setAdapter(c1ahs);
        }
        RecyclerView recyclerView2 = this.LLLFFI;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this.LLLILZJ);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C05JH(this, null), 2);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hww, viewGroup, false);
    }
}
