package com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell;

import X.C01GW;
import X.C0DXR;
import X.C1613170s55;
import X.C1615590s8z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1615580s8y;
import X.EnumC1615630s93;
import X.EnumC1615660s96;
import X.InterfaceC1614500s7E;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell.SeriesPanelSquareListCell;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.model.PaidCollectionEpisode;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class SeriesPanelSquareListCell extends PowerCell<C1613170s55> {
    public ViewOnAttachStateChangeListenerC20604515jv LL;
    public C1615590s8z LLILLJJLI;
    public boolean LLILZIL;
    public int LLILLL = -1;
    public int LLILZ = 24;
    public boolean LLILZLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 742));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.itemView.findViewById(R.id.q2i);
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SeriesPanelSquareItemCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new GridLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext(), 6));
        }
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C0DXR c0dxr = new C0DXR(iLIZIZ, iLIZIZ2) { // from class: X.0DXg
            public final int LL = 6;
            public final int LLILLJJLI;
            public final int LLILLL;

            {
                this.LLILLJJLI = iLIZIZ;
                this.LLILLL = iLIZIZ2;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view) % this.LL;
                if (recyclerView.getLayoutDirection() == 1) {
                    int i = this.LLILLJJLI;
                    int i2 = this.LL;
                    rect.right = (childAdapterPosition * i) / i2;
                    rect.left = i - (((childAdapterPosition + 1) * i) / i2);
                } else {
                    int i3 = this.LLILLJJLI;
                    int i4 = this.LL;
                    rect.left = (childAdapterPosition * i3) / i4;
                    rect.right = i3 - (((childAdapterPosition + 1) * i3) / i4);
                }
                rect.top = this.LLILLL;
            }
        };
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.addItemDecoration(c0dxr);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.setItemAnimator(null);
        }
        C1615590s8z c1615590s8z = (C1615590s8z) this.itemView.findViewById(R.id.q2h);
        this.LLILLJJLI = c1615590s8z;
        if (c1615590s8z != null) {
            c1615590s8z.setVariant(EnumC1615630s93.RECTANGLE);
            c1615590s8z.setWidthRule(EnumC1615580s8y.FIXED_WIDTH);
            c1615590s8z.setSize(EnumC1615660s96.X_SMALL);
            c1615590s8z.setOnSelectedChangeListener(new InterfaceC1614500s7E() { // from class: X.0s4Z
                @Override // X.InterfaceC1614500s7E
                public final void LIZ(int i, boolean z) {
                    C20600815jK<InterfaceC1891350zJl> state;
                    String strLJIJJ;
                    boolean zBooleanValue;
                    boolean zBooleanValue2;
                    C1613170s55 item = this.LIZ.getItem();
                    if (item != null && z) {
                        SeriesPanelSquareListCell seriesPanelSquareListCell = this.LIZ;
                        if (seriesPanelSquareListCell.LLILLL != i) {
                            if (seriesPanelSquareListCell.LLILZLL) {
                                seriesPanelSquareListCell.LLILZIL = true;
                                C1612860s4a c1612860s4a = (C1612860s4a) seriesPanelSquareListCell.LLIZ.getValue();
                                if (c1612860s4a != null) {
                                    C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                                    long j = c1612860s4a.LLILZLL;
                                    String str = c1612860s4a.LLJIJIL;
                                    String str2 = c1612860s4a.LLILZIL;
                                    Boolean boolValueOf = Boolean.valueOf(c1612860s4a.LLJILJIL);
                                    Boolean boolValueOf2 = Boolean.valueOf(c1612860s4a.LLJILJILJ);
                                    Boolean boolValueOf3 = Boolean.valueOf(c1612860s4a.LLJILLL);
                                    C1612600s4A c1612600s4A = c1612860s4a.LLJJ;
                                    SeriesCategory seriesCategory = c1612860s4a.LLJ;
                                    Boolean boolValueOf4 = Boolean.valueOf(c1612860s4a.LLJJI);
                                    Boolean boolValueOf5 = Boolean.valueOf(c1612860s4a.LLJJIII);
                                    String str3 = c1612860s4a.LLJJIJI;
                                    C1612570s47 c1612570s47 = c1612860s4a.LLJJIJIIJIL;
                                    String str4 = c1612860s4a.LLJJIJIL;
                                    DramaExtraTrackingParams dramaExtraTrackingParams = c1612860s4a.LLJJJ;
                                    c1581520rG2.getClass();
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    C1612480s3y.LJFF(c2344009Gk, String.valueOf(j));
                                    c2344009Gk.LJFF("collection_user_id", str);
                                    C1612480s3y.LJIIL(c2344009Gk, str2, false);
                                    if (boolValueOf3 != null) {
                                        strLJIJJ = C1612480s3y.LJIJJ(boolValueOf3.booleanValue());
                                    } else {
                                        strLJIJJ = null;
                                    }
                                    c2344009Gk.LJFF("is_from_drama_component", strLJIJJ);
                                    if (boolValueOf != null) {
                                        zBooleanValue = boolValueOf.booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                    c2344009Gk.LJFF("is_from_bottom_banner", C1612480s3y.LJIJJ(zBooleanValue));
                                    if (boolValueOf2 != null) {
                                        zBooleanValue2 = boolValueOf2.booleanValue();
                                    } else {
                                        zBooleanValue2 = false;
                                    }
                                    c2344009Gk.LJFF("is_from_anchor", C1612480s3y.LJIJJ(zBooleanValue2));
                                    C1612480s3y.LJIIZILJ(c2344009Gk, c1612600s4A);
                                    c2344009Gk.LJFF("click_tab_content", "navigation_bar");
                                    C1612480s3y.LJIJI(c2344009Gk, seriesCategory);
                                    c1581520rG2.LJJIIJZLJL(c2344009Gk, boolValueOf4, String.valueOf(j));
                                    c1581520rG2.LJJIII(c2344009Gk, boolValueOf5);
                                    c1581520rG2.LJJIIZ(c2344009Gk, str3);
                                    C1611660s2e.LJJ(c1581520rG2, c2344009Gk);
                                    C1612480s3y.LJIJ(c2344009Gk, c1612570s47);
                                    c1581520rG2.LJJIFFI(c2344009Gk, dramaExtraTrackingParams);
                                    if (str4 != null) {
                                        c2344009Gk.LJIIIIZZ("group_id", str4);
                                    }
                                    MiniDramaETInjectService.LIZ.getClass();
                                    MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
                                    if (miniDramaETInjectServiceLIZ != null) {
                                        miniDramaETInjectServiceLIZ.onEventV3("click_series_shortcuts_navigation_bar", c2344009Gk.LIZ);
                                    }
                                }
                            }
                            SeriesPanelSquareListCell seriesPanelSquareListCell2 = this.LIZ;
                            seriesPanelSquareListCell2.LLILLL = i;
                            int i2 = seriesPanelSquareListCell2.LLILZ * i;
                            int size = item.LL.size() - 1;
                            if (i2 > size) {
                                i2 = size;
                            }
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            int i3 = (i + 1) * this.LIZ.LLILZ;
                            int size2 = item.LL.size();
                            if (i3 > size2) {
                                i3 = size2;
                            }
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LIZ.LL;
                            if (viewOnAttachStateChangeListenerC20604515jv5 != null && (state = viewOnAttachStateChangeListenerC20604515jv5.getState()) != null) {
                                List<PaidCollectionEpisode> listSubList = item.LL.subList(i2, i3);
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
                                for (PaidCollectionEpisode paidCollectionEpisode : listSubList) {
                                    arrayList.add(new C1612900s4e(paidCollectionEpisode, item.LLILLJJLI, Intrinsics.LJFF(paidCollectionEpisode.vid, item.LLILLL)));
                                }
                                state.LJIILL(arrayList, null);
                            }
                            this.LIZ.LLILZLL = true;
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a1, code lost:
    
        r2 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(X.C1613170s55 r13) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell.SeriesPanelSquareListCell.I5(X.0s55):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        I5((C1613170s55) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bc0, viewGroup, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.cell.SeriesPanelSquareListCell.onBindItemView(X.0zJl, java.util.List):void");
    }
}
