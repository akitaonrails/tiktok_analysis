package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed;

import X.AbstractC738140SxQ;
import X.C0DXR;
import X.C0Q4Y;
import X.C1173300gdc;
import X.C1173980gei;
import X.C1174850gg7;
import X.C1183090gtP;
import X.C1183120gtS;
import X.C1183210gtb;
import X.C1220000hqw;
import X.C13LE;
import X.C1749280vcc;
import X.C20600815jK;
import X.C20603715jn;
import X.C418440Gaw;
import X.C444540Hbw;
import X.C444550Hbx;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444640Hc6;
import X.C444690HcB;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C786990Uu1;
import X.C814420VxA;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import X.InterfaceC1181010gq3;
import X.InterfaceC1891350zJl;
import Y.ARunnableS87S0200000_18;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.vm.PoiRecommendFeatureDetailSharedViewModel;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list.PoiRecommendFeatureListLoadingFooterCell;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent;
import com.ss.android.ugc.aweme.slash.data.SlashEvent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailFeedAssem extends BaseSlashGlueSlotAssemComponent<PoiRecommendFeatureDetailFeedModule> {
    public C786990Uu1 LLJJIJIIJIL;
    public C1749280vcc LLJJIJIL;
    public final C736950SvV LLJJJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e6q;
    }

    public final PoiRecommendFeatureDetailSharedViewModel lp() {
        return (PoiRecommendFeatureDetailSharedViewModel) this.LLJJJ.getValue();
    }

    public PoiRecommendFeatureDetailFeedAssem() {
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1720);
        this.LLJJJ = new C736950SvV(C13LE.LIZ(PoiRecommendFeatureDetailSharedViewModel.class), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(560), new AwS562S0100000_18((AbstractC738140SxQ) this, 1719), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        boolean z;
        C1183210gtb c1183210gtb;
        C1183120gtS c1183120gtS;
        C1749280vcc c1749280vcc;
        PoiRecommendFeatureDetailFeedModule poiRecommendFeatureDetailFeedModule = (PoiRecommendFeatureDetailFeedModule) baseComponentData;
        super.CG1(poiRecommendFeatureDetailFeedModule);
        List<PoiRecommendFeatureDetailFeedItemData> items = poiRecommendFeatureDetailFeedModule.getItems();
        if (items != null && !items.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786990Uu1 c786990Uu1 = this.LLJJIJIIJIL;
            if (c786990Uu1 != null && (c1749280vcc = this.LLJJIJIL) != null) {
                C786410Ut5.m0(c786990Uu1, 8);
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                EnumC444680HcA enumC444680HcA = EnumC444680HcA.NO_CONTENT;
                c1749280vcc.setStatus(C444600Hc2.LIZ(c1749280vcc.getContext(), c1749280vcc, C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.HUG, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), 4), new C444550Hbx(Boolean.TRUE, Integer.valueOf(R.drawable.n5), 4), 2131825338, null, null, new C444590Hc1(3))));
                C444690HcB.LIZ(enumC444680HcA, c1749280vcc);
                return;
            }
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLJJIJIL;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 8);
        }
        C786990Uu1 c786990Uu12 = this.LLJJIJIIJIL;
        if (c786990Uu12 != null) {
            C786410Ut5.m0(c786990Uu12, 0);
        }
        C786990Uu1 c786990Uu13 = this.LLJJIJIIJIL;
        if (c786990Uu13 == null) {
            return;
        }
        lp().LLILZIL = C1174850gg7.LIZ(this);
        PoiRecommendFeatureDetailSharedViewModel poiRecommendFeatureDetailSharedViewModelLp = lp();
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        List<SlashEvent> listL00 = null;
        if (c1173300gdcLJ != null && (c1183120gtS = (C1183120gtS) c1173300gdcLJ.LIZ) != null) {
            c1183210gtb = c1183120gtS.LIZ;
        } else {
            c1183210gtb = null;
        }
        poiRecommendFeatureDetailSharedViewModelLp.LLILZLL = c1183210gtb;
        PoiRecommendFeatureDetailSharedViewModel poiRecommendFeatureDetailSharedViewModelLp2 = lp();
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        String str = "";
        if (interfaceC1181010gq3LIZ != null) {
            String strLIZ = C1173980gei.LIZ(this);
            if (strLIZ == null) {
                strLIZ = "";
            }
            listL00 = interfaceC1181010gq3LIZ.l00(strLIZ);
        }
        poiRecommendFeatureDetailSharedViewModelLp2.LLIZ = listL00;
        PoiRecommendFeatureDetailSharedViewModel poiRecommendFeatureDetailSharedViewModelLp3 = lp();
        poiRecommendFeatureDetailSharedViewModelLp3.LLIZLLLIL = poiRecommendFeatureDetailFeedModule;
        String nextCursor = poiRecommendFeatureDetailFeedModule.getNextCursor();
        if (nextCursor != null) {
            str = nextCursor;
        }
        poiRecommendFeatureDetailSharedViewModelLp3.LLJ = new C1183090gtP(str, poiRecommendFeatureDetailFeedModule.getDataVersion(), Intrinsics.LJFF(poiRecommendFeatureDetailFeedModule.getHasMore(), Boolean.TRUE));
        poiRecommendFeatureDetailSharedViewModelLp3.setStateImmediate(new AwS597S0100000_18(poiRecommendFeatureDetailFeedModule, 1101));
        lp().setListState(c786990Uu13.getState());
        c786990Uu13.stopScroll();
        c786990Uu13.getState().LJFF(new ARunnableS87S0200000_18(c786990Uu13, this, 31));
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786990Uu1 c786990Uu1 = (C786990Uu1) view.findViewById(R.id.r_4);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.r_5);
        this.LLJJIJIIJIL = c786990Uu1;
        this.LLJJIJIL = c1749280vcc;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null) {
            interfaceC1181010gq3LIZ.iY0(c786990Uu1);
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        staggeredGridLayoutManager.LJJIL(0);
        c786990Uu1.setLayoutManager(staggeredGridLayoutManager);
        c786990Uu1.addItemDecoration(new C0DXR() { // from class: X.0GmQ
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
            public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int headerCount;
                C21681819tI c21681819tI;
                int i;
                int i2;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = null;
                if (recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                    viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView;
                }
                int i3 = 0;
                if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    headerCount = viewOnAttachStateChangeListenerC20604515jv.getHeaderCount();
                } else {
                    headerCount = 0;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (childAdapterPosition < headerCount) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null || c21681819tI.LLILLJJLI) {
                    return;
                }
                if (childAdapterPosition - headerCount < 2) {
                    i = 0;
                } else {
                    i = this.LLILLJJLI;
                }
                if (c21681819tI.LIZ() == 0) {
                    i2 = this.LL;
                } else {
                    i3 = this.LL;
                    i2 = 0;
                }
                rect.set(i3, i, i2, this.LLILLJJLI);
            }
        });
        c786990Uu1.setLifecycleOwner(this);
        c786990Uu1.setItemAnimator(null);
        C20600815jK<InterfaceC1891350zJl> state = c786990Uu1.getState();
        if (state != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZLLL = PoiRecommendFeatureListLoadingFooterCell.class;
        c786990Uu1.setListConfig(c20603715jn);
        c786990Uu1.LJIILJJIL(PoiRecommendFeatureDetailVideoCell.class, PoiRecommendFeatureDetailReviewWithImageCell.class, PoiRecommendFeatureDetailReviewNoImageCell.class);
    }
}
