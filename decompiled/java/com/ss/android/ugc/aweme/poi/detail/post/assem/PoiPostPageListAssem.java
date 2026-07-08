package com.ss.android.ugc.aweme.poi.detail.post.assem;

import X.AbstractC329610Cw3;
import X.C01GW;
import X.C0DXR;
import X.C1187970h1H;
import X.C1188090h1T;
import X.C19252910Tv;
import X.C20603715jn;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C452501pT;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailLoadingFooterCellV2;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.poi.detail.post.cell.PoiPostPageWaterFallItemCell;
import com.ss.android.ugc.aweme.poi.detail.videolist.WrapStaggeredGridLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPageListAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1179));
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;

    public final boolean Go() {
        C1187970h1H c1187970h1H;
        C1188090h1T c1188090h1T;
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        Integer poiPostTagStyle;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLIZLLLIL.getValue();
        return (assemViewModel == null || (c1187970h1H = (C1187970h1H) assemViewModel.getState()) == null || (c1188090h1T = c1187970h1H.LLILLJJLI) == null || (poiMergedListResponse = c1188090h1T.poiInitPostModule) == null || (poiPostTagStyle = poiMergedListResponse.getPoiPostTagStyle()) == null || poiPostTagStyle.intValue() != 1) ? false : true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        final PoiPostPageShareVM poiPostPageShareVM;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.r72);
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = true;
            c20603715jn.LIZLLL = PoiDetailLoadingFooterCellV2.class;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (poiPostPageShareVM = (PoiPostPageShareVM) this.LLIZLLLIL.getValue()) != null) {
                poiPostPageShareVM.setListState(viewOnAttachStateChangeListenerC20604515jv2.getState());
                viewOnAttachStateChangeListenerC20604515jv2.LJIIL((AbstractC329610Cw3) new C2217401BqU(poiPostPageShareVM) { // from class: X.0Cqs
                    @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                    public final Object get() {
                        return ((AssemListViewModel) this.receiver).getConfig();
                    }
                }.get());
            }
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiPostPageWaterFallItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new WrapStaggeredGridLayoutManager(C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(2, 0)));
            viewOnAttachStateChangeListenerC20604515jv.getContext();
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.0GmS
                public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
                public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int headerCount;
                    C21681819tI c21681819tI;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = null;
                    if (recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                        viewOnAttachStateChangeListenerC20604515jv3 = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView;
                    }
                    int iLIZIZ = 0;
                    if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                        headerCount = viewOnAttachStateChangeListenerC20604515jv3.getHeaderCount();
                    } else {
                        headerCount = 0;
                    }
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    if (childAdapterPosition < headerCount) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
                        int iLIZ = c21681819tI.LIZ();
                        if (childAdapterPosition < headerCount + 2) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                        }
                        if (iLIZ == 0) {
                            rect.set(this.LL, iLIZIZ, this.LLILLJJLI, this.LLILLL);
                        } else {
                            rect.set(this.LLILLJJLI, iLIZIZ, this.LL, this.LLILLL);
                        }
                    }
                }
            });
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLIZLLLIL.getValue();
        if (assemViewModel != null) {
            AssemViewModel.asyncSubscribe$default(assemViewModel, new C2217381BqS() { // from class: X.0h4I
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C1187970h1H c1187970h1H = (C1187970h1H) obj;
                    c1187970h1H.getClass();
                    return C627260Oiy.LIZLLL(c1187970h1H);
                }
            }, this, null, new AwS597S0100000_18(this, 1), new AwS562S0100000_18(this, 1), new AwS597S0100000_18(this, 2), 4, null);
        }
    }
}
