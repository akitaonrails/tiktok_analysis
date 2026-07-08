package com.ss.android.ugc.aweme.poi.detail.postcard.assem;

import X.AbstractC214823195h;
import X.C0DXR;
import X.C0Q4Y;
import X.C0T47;
import X.C1173300gdc;
import X.C1174830gg5;
import X.C1178990gmn;
import X.C1181890grT;
import X.C1185450gxD;
import X.C1185600gxS;
import X.C1186740gzI;
import X.C1187500h0W;
import X.C1187600h0g;
import X.C1187970h1H;
import X.C1188300h1o;
import X.C1188410h1z;
import X.C14EU;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C18JG;
import X.C19M4;
import X.C20600815jK;
import X.C20603715jn;
import X.C339190DRl;
import X.C418440Gaw;
import X.C622680Oba;
import X.C723580SZw;
import X.C724240Sb0;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1173990gej;
import X.InterfaceC1181010gq3;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageFragment;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.poi.detail.postcard.IPoiLimitedPostAbility;
import com.ss.android.ugc.aweme.poi.detail.postcard.cell.PoiLimitedPostVerticalCell;
import com.ss.android.ugc.aweme.poi.detail.postcard.cell.PoiLimitedPostVerticalReuseAssem;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailLimitedPostVerticalListAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1186740gzI.class, "PoiLimitedPostHierarchyData"), checkSupervisorPrepared());
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public LinearLayout LLJJIJI;
    public View LLJJIJIIJIL;
    public C19M4 LLJJIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e37;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hp() {
        IPoiLimitedPostAbility iPoiLimitedPostAbility;
        PoiPostPageShareVM poiPostPageShareVMLLLLLLZ;
        C1187970h1H c1187970h1H;
        PoiListApi.PostTag postTag;
        C1185600gxS c1185600gxS;
        C1185450gxD c1185450gxD;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(C724240Sb0.LJI(this));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        String str = null;
        C1173300gdc c1173300gdcQr0 = (fragmentLJI == null || (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI)) == null) ? null : interfaceC1181010gq3LIZ.qr0();
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        C1185450gxD c1185450gxD2 = (fragmentLJI2 == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentLJI2, null), "source_default_key", C1185450gxD.class, null)) == null) ? null : (C1185450gxD) interfaceC1555100qZQLIZIZ.getSource();
        String str2 = PoiPostPageFragment._pnsPageId;
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        C1185600gxS c1185600gxS2 = c1173300gdcQr0 != null ? (C1185600gxS) c1173300gdcQr0.LIZ : null;
        String strLIZ = C18JG.LIZ("c7535.d8692", PageFinder.via((View) this.LLJJIII), null);
        String sessionId = (c1173300gdcQr0 == null || (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) == null || (c1185450gxD = c1185600gxS.LJIILIIL) == null) ? null : c1185450gxD.getSessionId();
        InterfaceC1173990gej<?> interfaceC1173990gejLIZ = C1178990gmn.LIZ(this);
        C1187500h0W.LIZ(fragmentLJI3, null, poiDetailResponseLIZ, c1185600gxS2, c1185450gxD2, strLIZ, sessionId, interfaceC1173990gejLIZ != null ? interfaceC1173990gejLIZ.S2() : null);
        PageFinder pageFinderVia = PageFinder.via(this);
        Fragment fragmentLJI4 = C724240Sb0.LJI(this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = fragmentLJI4 != null ? C1558360qeg.LJFF(fragmentLJI4, null) : null;
        Fragment fragmentLJI5 = C724240Sb0.LJI(this);
        if (fragmentLJI5 != null && (iPoiLimitedPostAbility = (IPoiLimitedPostAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI5, null), IPoiLimitedPostAbility.class, null)) != null && (poiPostPageShareVMLLLLLLZ = iPoiLimitedPostAbility.LLLLLLZ()) != null && (c1187970h1H = (C1187970h1H) poiPostPageShareVMLLLLLLZ.getState()) != null && (postTag = c1187970h1H.LL) != null) {
            str = postTag.tagCode;
        }
        C1188410h1z.LIZ(pageFinderVia, interfaceC665370Q7zLJFF, "bottom", str);
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
        C20600815jK<InterfaceC1891350zJl> state;
        Aweme aweme;
        Aweme awemeLLILZ;
        C1185600gxS c1185600gxS;
        PoiListApi.PoiMergedListResponse poiMergedListResponse2;
        PoiListApi.PoiMergedListResponse poiMergedListResponse3;
        Integer scrollType;
        int i;
        PoiListApi.PoiMergedListResponse poiMergedListResponse4;
        Integer scrollType2;
        super.onViewCreated(view);
        C622680Oba.LIZJ(this);
        this.LLJJIII = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.r44);
        this.LLJJIJI = (LinearLayout) view.findViewById(R.id.r40);
        this.LLJJIJIIJIL = view.findViewById(R.id.r41);
        C19M4 c19m4 = (C19M4) view.findViewById(R.id.r48);
        this.LLJJIJIL = c19m4;
        int i2 = 8;
        if (c19m4 != null) {
            C1186740gzI c1186740gzI = (C1186740gzI) this.LLJJI.getValue();
            if (c1186740gzI != null && (poiMergedListResponse4 = c1186740gzI.LL) != null && (scrollType2 = poiMergedListResponse4.getScrollType()) != null && scrollType2.intValue() == 1) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLZIL(c19m4, i);
        }
        LinearLayout linearLayout = this.LLJJIJI;
        if (linearLayout != null) {
            C1186740gzI c1186740gzI2 = (C1186740gzI) this.LLJJI.getValue();
            if (c1186740gzI2 != null && (poiMergedListResponse3 = c1186740gzI2.LL) != null && (scrollType = poiMergedListResponse3.getScrollType()) != null && scrollType.intValue() == 1) {
                i2 = 0;
            }
            C786410Ut5.LJZL(i2, linearLayout);
        }
        C19M4 c19m42 = this.LLJJIJIL;
        if (c19m42 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 50), c19m42);
        }
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 51), view2);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
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
                viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PoiLimitedPostVerticalCell.class);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
                gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0h1n
                    @Override // X.AbstractC214823195h
                    public final int LJFF(int i3) {
                        return 1;
                    }
                };
                viewOnAttachStateChangeListenerC20604515jv3.setLayoutManager(gridLayoutManager);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                C1188300h1o.LIZ(viewOnAttachStateChangeListenerC20604515jv4);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
                viewOnAttachStateChangeListenerC20604515jv5.addItemDecoration(new C0DXR() { // from class: X.06Wz
                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view3, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view3);
                        if (childAdapterPosition < 0) {
                            return;
                        }
                        if (childAdapterPosition % 2 == 0) {
                            if (C426750GoL.LIZLLL(view3.getContext())) {
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            } else {
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            }
                            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            return;
                        }
                        if (C426750GoL.LIZLLL(view3.getContext())) {
                            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        } else {
                            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        }
                        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    }
                });
            }
            Context context = getContext();
            if (context != null) {
                PoiLimitedPostVerticalReuseAssem.LLJLIL.getClass();
                int iIntValue = ((Number) C0T47.LIZ(context).getSecond()).intValue() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                int iIntValue2 = ((Number) C0T47.LIZ(context).getSecond()).intValue();
                if (iIntValue > 0 && iIntValue2 > 0) {
                    double dLIZ = ((double) (iIntValue * 2)) + (((double) iIntValue2) * 0.4d) + ((double) (C339190DRl.LIZ(16) * 2));
                    ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) dLIZ;
                    }
                }
            }
        }
        C1186740gzI c1186740gzI3 = (C1186740gzI) this.LLJJI.getValue();
        if (c1186740gzI3 != null && (poiMergedListResponse2 = c1186740gzI3.LL) != null) {
            postBottomBarStyle = poiMergedListResponse2.getPostBottomBarStyle();
        } else {
            postBottomBarStyle = 0;
        }
        C1186740gzI c1186740gzI4 = (C1186740gzI) this.LLJJI.getValue();
        if (c1186740gzI4 != null && (c1185600gxS = c1186740gzI4.LLILLL) != null) {
            str = c1185600gxS.LIZ;
        } else {
            str = null;
        }
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        C1186740gzI c1186740gzI5 = (C1186740gzI) this.LLJJI.getValue();
        if (c1186740gzI5 != null && (poiMergedListResponse = c1186740gzI5.LL) != null && (mergedListItems = poiMergedListResponse.getMergedListItems()) != null) {
            ArrayList arrayList = new ArrayList();
            for (PoiListApi.PoiMergedListItem poiMergedListItem : mergedListItems) {
                if (poiMergedListItem != null && (aweme = poiMergedListItem.getAweme()) != null) {
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
                    arrayList.add(new C1187600h0g(str, aweme, 0, postBottomBarStyle, 12));
                }
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJJIII;
            if (viewOnAttachStateChangeListenerC20604515jv6 != null && (state = viewOnAttachStateChangeListenerC20604515jv6.getState()) != null) {
                state.LJIILL(arrayList, null);
            }
        }
    }
}
