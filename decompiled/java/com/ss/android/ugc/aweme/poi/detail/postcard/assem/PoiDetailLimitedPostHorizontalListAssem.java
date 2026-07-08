package com.ss.android.ugc.aweme.poi.detail.postcard.assem;

import X.C0DXR;
import X.C0Q4Y;
import X.C0T48;
import X.C1175120ggY;
import X.C1185600gxS;
import X.C1186740gzI;
import X.C1187600h0g;
import X.C1188300h1o;
import X.C1197200hGA;
import X.C13LP;
import X.C14EU;
import X.C1559260qg8;
import X.C1723500ux2;
import X.C20600815jK;
import X.C20603715jn;
import X.C497820Jfg;
import X.C622680Oba;
import X.C723580SZw;
import X.C737030Svd;
import X.C786410Ut5;
import X.InterfaceC1197210hGB;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageFragment;
import com.ss.android.ugc.aweme.poi.detail.postcard.cell.PoiLimitedPostHorizontal2Cell;
import com.ss.android.ugc.aweme.poi.detail.postcard.cell.PoiLimitedPostHorizontal2Dot3cell;
import com.ss.android.ugc.aweme.poi.detail.postcard.cell.PoiLimitedPostHorizontalBaseReuseAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailLimitedPostHorizontalListAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1186740gzI.class, "PoiLimitedPostHierarchyData"), checkSupervisorPrepared());
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public C1197200hGA LLJJIJI;
    public View LLJJIJIIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e36;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        String str;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        Object next;
        C20600815jK<InterfaceC1891350zJl> state2;
        C1187600h0g c1187600h0g;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2;
        C20600815jK<InterfaceC1891350zJl> state3;
        C1187600h0g c1187600h0g2;
        Aweme aweme;
        IAwemeService iAwemeService;
        Aweme awemeLLILZ;
        if (c737030Svd.LIZ == 13) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof String) && (str = (String) obj) != null && str.length() != 0 && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                Iterator it2 = ((ArrayList) state.LJII()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
                        if ((interfaceC1891350zJl instanceof C1187600h0g) && Intrinsics.LJFF(((C1187600h0g) interfaceC1891350zJl).LLILLJJLI.getAid(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) next;
                if (interfaceC1891350zJl2 != null) {
                    boolean z = interfaceC1891350zJl2 instanceof C1187600h0g;
                    if (z && (c1187600h0g2 = (C1187600h0g) interfaceC1891350zJl2) != null && (aweme = c1187600h0g2.LLILLJJLI) != null && (iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null)) != null && (awemeLLILZ = iAwemeService.LLILZ(str)) != null && awemeLLILZ != aweme) {
                        aweme.setUserDigg(awemeLLILZ.getUserDigg());
                        AwemeStatistics statistics = awemeLLILZ.getStatistics();
                        if (statistics != null) {
                            long jLongValue = Long.valueOf(statistics.getDiggCount()).longValue();
                            AwemeStatistics statistics2 = aweme.getStatistics();
                            if (statistics2 != null) {
                                statistics2.setDiggCount(jLongValue);
                            }
                        }
                    }
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIII;
                    if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                        Integer numValueOf = Integer.valueOf(((ArrayList) state2.LJII()).indexOf(interfaceC1891350zJl2));
                        if (numValueOf.intValue() >= 0) {
                            int iIntValue = numValueOf.intValue();
                            if (z && (c1187600h0g = (C1187600h0g) interfaceC1891350zJl2) != null && (viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIII) != null && (state3 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                                state3.LJIILJJIL(iIntValue, C1187600h0g.LIZ(c1187600h0g, c1187600h0g.LLILZ + 1));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int postBottomBarStyle;
        String str;
        PoiListApi.PoiMergedListResponse poiMergedListResponse;
        List<PoiListApi.PoiMergedListItem> mergedListItems;
        List<PoiListApi.PoiMergedListItem> listLL;
        boolean z;
        C20600815jK<InterfaceC1891350zJl> state;
        Aweme awemeLLILZ;
        C1185600gxS c1185600gxS;
        PoiListApi.PoiMergedListResponse poiMergedListResponse2;
        Integer numValueOf;
        boolean z2;
        PoiListApi.PoiMergedListResponse poiMergedListResponse3;
        List<PoiListApi.PoiMergedListItem> mergedListItems2;
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        this.LLJJIII = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.r44);
        this.LLJJIJI = (C1197200hGA) view.findViewById(R.id.r49);
        this.LLJJIJIIJIL = view.findViewById(R.id.r4_);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
        int i = 50002;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = true;
            c20603715jn.LJIIJ = true;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv2.LJIJ(new C1723500ux2(50001, PoiLimitedPostHorizontal2Cell.class));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                viewOnAttachStateChangeListenerC20604515jv3.LJIJ(new C1723500ux2(50002, PoiLimitedPostHorizontal2Dot3cell.class));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                viewOnAttachStateChangeListenerC20604515jv4.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                C1188300h1o.LIZ(viewOnAttachStateChangeListenerC20604515jv5);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
                viewOnAttachStateChangeListenerC20604515jv6.addItemDecoration(new C0DXR() { // from class: X.06X9
                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        Context context = view2.getContext();
                        if (context == null) {
                            return;
                        }
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                        int iLIZIZ = c21673919s1.LIZIZ();
                        if (childAdapterPosition < 0) {
                            return;
                        }
                        if (childAdapterPosition == 0) {
                            if (C426750GoL.LIZLLL(context)) {
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            } else {
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            }
                            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            return;
                        }
                        if (childAdapterPosition == iLIZIZ - 1) {
                            if (C426750GoL.LIZLLL(context)) {
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            } else {
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            }
                            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            return;
                        }
                        if (C426750GoL.LIZLLL(context)) {
                            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                        } else {
                            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                        }
                        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    }
                });
            }
        }
        final C1197200hGA c1197200hGA = this.LLJJIJI;
        if (c1197200hGA != null) {
            C1186740gzI c1186740gzI = (C1186740gzI) this.LLJJI.getValue();
            if (c1186740gzI != null && (poiMergedListResponse3 = c1186740gzI.LL) != null && (mergedListItems2 = poiMergedListResponse3.getMergedListItems()) != null) {
                numValueOf = Integer.valueOf(mergedListItems2.size());
            } else {
                numValueOf = null;
            }
            if (C1175120ggY.LIZJ(numValueOf) > 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1197200hGA.LLILZLL = z2;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv7 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv7 != null) {
                c1197200hGA.setPowerList(viewOnAttachStateChangeListenerC20604515jv7);
            }
            c1197200hGA.setTriggerLength(C497820Jfg.LIZIZ(c1197200hGA.getContext()) / 10);
            c1197200hGA.setScrollAction(new InterfaceC1197210hGB() { // from class: X.0h1F
                @Override // X.InterfaceC1197210hGB
                public final void LIZ() {
                }

                @Override // X.InterfaceC1197210hGB
                public final void LIZJ(float f) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1197210hGB
                public final void LIZIZ() {
                    C1185600gxS c1185600gxS2;
                    C1185450gxD c1185450gxD;
                    InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
                    InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
                    new C0ZDN(c1197200hGA.getContext()).LIZ(0);
                    PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(C724240Sb0.LJI(this));
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    C1173300gdc c1173300gdcQr0 = (fragmentLJI == null || (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI)) == null) ? null : interfaceC1181010gq3LIZ.qr0();
                    Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                    C1185450gxD c1185450gxD2 = (fragmentLJI2 == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentLJI2, null), "source_default_key", C1185450gxD.class, null)) == null) ? null : (C1185450gxD) interfaceC1555100qZQLIZIZ.getSource();
                    String str2 = PoiPostPageFragment._pnsPageId;
                    Fragment fragmentLJI3 = C724240Sb0.LJI(this);
                    C1185600gxS c1185600gxS3 = c1173300gdcQr0 != null ? (C1185600gxS) c1173300gdcQr0.LIZ : null;
                    String strLIZ = C18JG.LIZ("c7535.d8692", PageFinder.via((View) this.LLJJIII), null);
                    String sessionId = (c1173300gdcQr0 == null || (c1185600gxS2 = (C1185600gxS) c1173300gdcQr0.LIZ) == null || (c1185450gxD = c1185600gxS2.LJIILIIL) == null) ? null : c1185450gxD.getSessionId();
                    InterfaceC1173990gej<?> interfaceC1173990gejLIZ = C1178990gmn.LIZ(this);
                    C1187500h0W.LIZ(fragmentLJI3, null, poiDetailResponseLIZ, c1185600gxS3, c1185450gxD2, strLIZ, sessionId, interfaceC1173990gejLIZ != null ? interfaceC1173990gejLIZ.S2() : null);
                }
            });
        }
        C1186740gzI c1186740gzI2 = (C1186740gzI) this.LLJJI.getValue();
        if (c1186740gzI2 != null && (poiMergedListResponse2 = c1186740gzI2.LL) != null) {
            postBottomBarStyle = poiMergedListResponse2.getPostBottomBarStyle();
        } else {
            postBottomBarStyle = 0;
        }
        C1186740gzI c1186740gzI3 = (C1186740gzI) this.LLJJI.getValue();
        if (c1186740gzI3 != null && (c1185600gxS = c1186740gzI3.LLILLL) != null) {
            str = c1185600gxS.LIZ;
        } else {
            str = null;
        }
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        C1186740gzI c1186740gzI4 = (C1186740gzI) this.LLJJI.getValue();
        if (c1186740gzI4 != null && (poiMergedListResponse = c1186740gzI4.LL) != null && (mergedListItems = poiMergedListResponse.getMergedListItems()) != null && (listLL = C13LP.LL(mergedListItems, 8)) != null) {
            ArrayList arrayList = new ArrayList();
            for (PoiListApi.PoiMergedListItem poiMergedListItem : listLL) {
                if (poiMergedListItem != null && poiMergedListItem.getAweme() != null) {
                    arrayList.add(poiMergedListItem);
                }
            }
            if (arrayList.size() < 3) {
                i = 50001;
            }
            C0T48 c0t48 = PoiLimitedPostHorizontalBaseReuseAssem.LLJLIL;
            Context context = getContext();
            if (arrayList.size() >= 3) {
                z = true;
            } else {
                z = false;
            }
            c0t48.getClass();
            int iIntValue = ((Number) C0T48.LIZ(context, z).getSecond()).intValue();
            View view2 = this.LLJJIJIIJIL;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = iIntValue;
                } else {
                    layoutParams = null;
                }
                C786410Ut5.W5(view2, layoutParams);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Aweme aweme = ((PoiListApi.PoiMergedListItem) it2.next()).getAweme();
                if (aweme != null) {
                    if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(aweme.getAid())) != null && awemeLLILZ != aweme) {
                        aweme.setUserDigg(awemeLLILZ.getUserDigg());
                        AwemeStatistics statistics = awemeLLILZ.getStatistics();
                        if (statistics != null) {
                            long jLongValue = Long.valueOf(statistics.getDiggCount()).longValue();
                            AwemeStatistics statistics2 = aweme.getStatistics();
                            if (statistics2 != null) {
                                statistics2.setDiggCount(jLongValue);
                            }
                        }
                    }
                    arrayList2.add(new C1187600h0g(str, aweme, i, postBottomBarStyle, 8));
                }
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv8 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv8 != null && (state = viewOnAttachStateChangeListenerC20604515jv8.getState()) != null) {
                state.LJIILL(arrayList2, null);
            }
        }
    }
}
