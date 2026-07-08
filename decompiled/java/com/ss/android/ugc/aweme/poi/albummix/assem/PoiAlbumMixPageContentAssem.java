package com.ss.android.ugc.aweme.poi.albummix.assem;

import X.AbstractC471570IeR;
import X.C01GW;
import X.C1157090gDT;
import X.C1173220gdU;
import X.C1187300h0C;
import X.C1208680hYg;
import X.C20600815jK;
import X.C2217381BqS;
import X.C452501pT;
import X.C736680Sv4;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.poi.albummix.cell.PoiAlbumMixPageListCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMixPageContentAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 852));
    public ViewOnAttachStateChangeListenerC20631115oD LLJ;

    public final PoiHeaderTopVideosSharedViewModel Go() {
        return (PoiHeaderTopVideosSharedViewModel) this.LLIZLLLIL.getValue();
    }

    public final void Ho() {
        C1187300h0C c1187300h0CBQ2;
        PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        List<InterfaceC1891350zJl> listLJII;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2;
        C1157090gDT c1157090gDT;
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelGo = Go();
        if (poiHeaderTopVideosSharedViewModelGo == null || (c1187300h0CBQ2 = poiHeaderTopVideosSharedViewModelGo.BQ2()) == null || (poiMultiMediumTab = c1187300h0CBQ2.LLILLJJLI) == null || (viewOnAttachStateChangeListenerC20631115oD = this.LLJ) == null || (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) == null || (state = viewItemOperator.getState()) == null || (listLJII = state.LJII()) == null) {
            return;
        }
        Iterator<InterfaceC1891350zJl> it2 = listLJII.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            InterfaceC1891350zJl next = it2.next();
            if (Intrinsics.LJFF((!(next instanceof C1157090gDT) || (c1157090gDT = (C1157090gDT) next) == null) ? null : c1157090gDT.LL, poiMultiMediumTab.getTabCode())) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null || numValueOf.intValue() <= 0 || (viewOnAttachStateChangeListenerC20631115oD2 = this.LLJ) == null) {
            return;
        }
        viewOnAttachStateChangeListenerC20631115oD2.setCurrentItem(numValueOf.intValue(), false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        InterfaceC1733780vDc viewItemOperator2;
        PoiDetailApi.PoiTopVideosLoadMoreResponse poiTopVideosLoadMoreResponse;
        List<PoiDetailApi.PoiMultiMediumTab> tabList;
        InterfaceC1733780vDc viewItemOperator3;
        C20600815jK<InterfaceC1891350zJl> state2;
        String tabCode;
        super.onViewCreated(view);
        if (view instanceof ViewOnAttachStateChangeListenerC20631115oD) {
            viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) view;
        } else {
            viewOnAttachStateChangeListenerC20631115oD = null;
        }
        this.LLJ = viewOnAttachStateChangeListenerC20631115oD;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            InterfaceC1733780vDc viewItemOperator4 = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator();
            C1173220gdU c1173220gdU = new C1173220gdU();
            c1173220gdU.LIZ = 0;
            viewItemOperator4.LIZLLL(c1173220gdU);
            viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator().LIZJ(PoiAlbumMixPageListCell.class);
            viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new C1208680hYg(viewOnAttachStateChangeListenerC20631115oD, this, 0));
        }
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelGo = Go();
        if (poiHeaderTopVideosSharedViewModelGo != null && (poiTopVideosLoadMoreResponse = poiHeaderTopVideosSharedViewModelGo.LLIZLLLIL) != null && (tabList = poiTopVideosLoadMoreResponse.getTabList()) != null && !tabList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab : tabList) {
                if (poiMultiMediumTab != null && (tabCode = poiMultiMediumTab.getTabCode()) != null) {
                    arrayList.add(new C1157090gDT(tabCode, poiMultiMediumTab.getTabName()));
                }
            }
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator3 = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null && (state2 = viewItemOperator3.getState()) != null) {
                state2.LIZLLL(arrayList, null);
            }
        } else {
            C1157090gDT c1157090gDT = new C1157090gDT(null, null);
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20631115oD3 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD3.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                state.LIZLLL(Collections.singletonList(c1157090gDT), null);
            }
        }
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelGo2 = Go();
        if (poiHeaderTopVideosSharedViewModelGo2 != null) {
            C736680Sv4.LJIIIIZZ(this, poiHeaderTopVideosSharedViewModelGo2, new C2217381BqS() { // from class: X.0h0J
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1187300h0C) obj).LLILLJJLI;
                }
            }, null, new AwS632S0100000_18(this, 87), 6);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20631115oD4 != null && (viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oD4.getViewItemOperator()) != null) {
            viewItemOperator2.LJI(new AbstractC471570IeR() { // from class: X.0h0G
                @Override // X.AbstractC471570IeR
                public final void LIZ() {
                    InterfaceC1733780vDc viewItemOperator5;
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD5 = this.LIZ.LLJ;
                    if (viewOnAttachStateChangeListenerC20631115oD5 != null && (viewItemOperator5 = viewOnAttachStateChangeListenerC20631115oD5.getViewItemOperator()) != null) {
                        viewItemOperator5.LJ(this);
                    }
                    this.LIZ.Ho();
                }

                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    InterfaceC1733780vDc viewItemOperator5;
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD5 = this.LIZ.LLJ;
                    if (viewOnAttachStateChangeListenerC20631115oD5 != null && (viewItemOperator5 = viewOnAttachStateChangeListenerC20631115oD5.getViewItemOperator()) != null) {
                        viewItemOperator5.LJ(this);
                    }
                    this.LIZ.Ho();
                }
            });
        }
    }
}
