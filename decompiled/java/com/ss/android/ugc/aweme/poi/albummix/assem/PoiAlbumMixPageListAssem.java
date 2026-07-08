package com.ss.android.ugc.aweme.poi.albummix.assem;

import X.AbstractC329610Cw3;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1157090gDT;
import X.C1183810guZ;
import X.C1185370gx5;
import X.C1187230h05;
import X.C1187250h07;
import X.C1192290h8F;
import X.C1220000hqw;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1723500ux2;
import X.C20600815jK;
import X.C20603715jn;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C2255108sX;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723580SZw;
import X.C723700Sa8;
import X.C723830SaL;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS32S0200000_18;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.albummix.cell.PoiAlbumMixAccCategoryLargeCell;
import com.ss.android.ugc.aweme.poi.albummix.cell.PoiAlbumMixAccCategoryMediumCell;
import com.ss.android.ugc.aweme.poi.albummix.cell.PoiAlbumMixAccCategoryTitleCell;
import com.ss.android.ugc.aweme.poi.albummix.cell.PoiAlbumMixFooterCell;
import com.ss.android.ugc.aweme.poi.albummix.cell.PoiAlbumMixPageItemCell;
import com.ss.android.ugc.aweme.poi.albummix.cell.PoiAlbumMixSmallHorizontalCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMixPageListAssem extends ReusedUISlotAssem<PoiAlbumMixPageListAssem> implements InterfaceC712990Rxx<C1157090gDT> {
    public static final AtomicLong LLLFZ = new AtomicLong(System.currentTimeMillis());
    public final long LLJJLIIIJLLLLLLLZ = LLLFZ.incrementAndGet();
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 857));
    public final C736950SvV LLJLIL;
    public final C1559260qg8 LLJLILLLLZIIL;
    public int LLJLL;
    public final C01GW LLJLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dyf;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final PoiHeaderTopVideosSharedViewModel U32() {
        return (PoiHeaderTopVideosSharedViewModel) this.LLJLIL.getValue();
    }

    public final PoiHeaderTopVideosSharedViewModel sp() {
        return (PoiHeaderTopVideosSharedViewModel) this.LLJL.getValue();
    }

    public PoiAlbumMixPageListAssem() {
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2560);
        this.LLJLIL = new C736950SvV(C13LE.LIZ(PoiHeaderTopVideosSharedViewModel.class), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(263), new AwS562S0100000_18((AbstractC738140SxQ) this, 856), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJLILLLLZIIL = new C1559260qg8(new C723580SZw(this, C1185370gx5.class, "PoiAlbumMixHierarchyData"), checkSupervisorPrepared());
        this.LLJLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 855));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel r0 = r7.U32()
            X.0h0C r2 = r0.BQ2()
            java.lang.String r5 = r7.LLL
            if (r5 != 0) goto Le
            java.lang.String r5 = ""
        Le:
            int r0 = r7.LLJLL
            int r0 = r0 + 1
            r7.LLJLL = r0
            r1 = 0
            if (r2 == 0) goto L58
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiTopVideosLoadMoreResponse r0 = r2.LL
            if (r0 == 0) goto L58
            java.util.List r0 = r0.getListItems()
            if (r0 == 0) goto L58
            java.util.List r0 = X.C13LP.LJJJJLI(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r6 = r0.size()
        L2b:
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiTopVideosLoadMoreResponse r0 = r2.LL
            if (r0 == 0) goto L5c
            java.util.List r0 = r0.getCategories()
            if (r0 == 0) goto L5c
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L3a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PoiCategoryItems r0 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PoiCategoryItems) r0
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiMergedListItem> r0 = r0.itemList
            if (r0 == 0) goto L56
            java.util.List r0 = X.C13LP.LJJJJLI(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
        L54:
            int r1 = r1 + r0
            goto L3a
        L56:
            r0 = 0
            goto L54
        L58:
            r6 = 0
            if (r2 == 0) goto L5c
            goto L2b
        L5c:
            int r6 = r6 + r1
            X.0h09 r2 = X.C1187270h09.LIZ
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r7)
            r1 = 0
            if (r0 == 0) goto L6a
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r1)
        L6a:
            X.01GW r0 = r7.LLJLLIL
            java.lang.Object r4 = r0.getValue()
            com.bytedance.android.btm.api.model.PageFinder r4 = (com.bytedance.android.btm.api.model.PageFinder) r4
            int r3 = r7.LLJLL
            r2.getClass()
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            X.C1182410gsJ.LIZIZ(r2, r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "album_page"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "num"
            r2.LIZJ(r6, r0)
            java.lang.String r0 = "tab_code"
            r2.LJIIIIZZ(r0, r5)
            java.lang.String r0 = "load_num"
            r2.LIZJ(r3, r0)
            X.0gwY r0 = X.C1185040gwY.LIZ
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.LIZ
            X.0gwZ r1 = new X.0gwZ
            r1.<init>(r4)
            r0.getClass()
            java.lang.String r0 = "ttls_poi_gallery_recall_result"
            X.C1185040gwY.LJFF(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageListAssem.tp():void");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1187230h05 c1187230h05Copy;
        PoiInnerPageMobData poiInnerPageMobData;
        C1187230h05 c1187230h05;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.qwq);
        this.LLJLLL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = true;
            c20603715jn.LIZLLL = PoiAlbumMixFooterCell.class;
            c20603715jn.LIZ = 4;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJLLL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PoiAlbumMixPageItemCell.class);
                viewOnAttachStateChangeListenerC20604515jv2.LJIJ(new C1723500ux2(52601, PoiAlbumMixSmallHorizontalCell.class), new C1723500ux2(52700, PoiAlbumMixAccCategoryLargeCell.class), new C1723500ux2(52701, PoiAlbumMixAccCategoryMediumCell.class), new C1723500ux2(52702, PoiAlbumMixAccCategoryTitleCell.class));
            }
            final PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelU32 = U32();
            poiHeaderTopVideosSharedViewModelU32.setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
            viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(poiHeaderTopVideosSharedViewModelU32) { // from class: X.0Cqt
                @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((AssemListViewModel) this.receiver).getConfig();
                }
            }.get());
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS32S0200000_18(this, viewOnAttachStateChangeListenerC20604515jv, 3));
        }
        AssemViewModel.asyncSubscribe$default(U32(), new C2217381BqS() { // from class: X.0h0H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1187300h0C c1187300h0C = (C1187300h0C) obj;
                c1187300h0C.getClass();
                return C627260Oiy.LIZLLL(c1187300h0C);
            }
        }, this, null, new AwS597S0100000_18(this, 889), new AwS562S0100000_18(this, 2561), new AwS597S0100000_18(this, 891), 4, null);
        AssemViewModel.asyncSubscribe$default(U32(), new C2217381BqS() { // from class: X.0h0I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1187300h0C c1187300h0C = (C1187300h0C) obj;
                c1187300h0C.getClass();
                return C627260Oiy.LIZJ(c1187300h0C);
            }
        }, this, null, null, null, new AwS597S0100000_18(this, 892), 28, null);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        IPoiAlbumMixPageListAbility iPoiAlbumMixPageListAbility = new IPoiAlbumMixPageListAbility() { // from class: com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageListAssem$initAbility$1
            @Override // com.ss.android.ugc.aweme.poi.albummix.assem.IPoiAlbumMixPageListAbility
            public final PoiHeaderTopVideosSharedViewModel U32() {
                return this.LL.U32();
            }
        };
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IPoiAlbumMixPageListAbility.class, null);
        if (interfaceC494301wDLIZ == null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIIL, iPoiAlbumMixPageListAbility, IPoiAlbumMixPageListAbility.class, null, null);
        } else {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiAlbumMixPageListAbility);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiAlbumMixPageListAbility);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiAlbumMixPageListAbility.class.getClassLoader(), new Class[]{IPoiAlbumMixPageListAbility.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJIIL, (InterfaceC494301wD) objNewProxyInstance, IPoiAlbumMixPageListAbility.class, null, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.albummix.assem.IPoiAlbumMixPageListAbility");
                }
            }
        }
        C1192290h8F.LIZ(this, "poi_mix_album", null, true, null, this.LLJLLL, 10);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 888));
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelU322 = U32();
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelSp = sp();
        if (poiHeaderTopVideosSharedViewModelSp != null && (c1187230h05 = poiHeaderTopVideosSharedViewModelSp.LLILZIL) != null) {
            c1187230h05Copy = c1187230h05.copy(c1187230h05.poiId, this.LLJJLIIIJLLLLLLLZ, c1187230h05.poiDetailParams, c1187230h05.poiDetailResponse, c1187230h05.poiAnchorData, c1187230h05.poiAnchorMobData, c1187230h05.poiDetailSessionModel, c1187230h05.cachedBasicInfoForCollect, c1187230h05.poiCommonMobParams);
        } else {
            c1187230h05Copy = null;
        }
        poiHeaderTopVideosSharedViewModelU322.LLILZIL = c1187230h05Copy;
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelU323 = U32();
        PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelSp2 = sp();
        if (poiHeaderTopVideosSharedViewModelSp2 != null) {
            poiInnerPageMobData = poiHeaderTopVideosSharedViewModelSp2.LLILZLL;
        } else {
            poiInnerPageMobData = null;
        }
        poiHeaderTopVideosSharedViewModelU323.LLILZLL = poiInnerPageMobData;
        C723830SaL.LIZ(this, null, new AwS597S0100000_18(this, 230));
    }

    public final int op(String str) {
        C20600815jK<InterfaceC1891350zJl> state;
        C1183810guZ c1183810guZ;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            int i = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) state.LJII()) {
                String aid = null;
                if ((interfaceC1891350zJl instanceof C1183810guZ) && (c1183810guZ = (C1183810guZ) interfaceC1891350zJl) != null) {
                    Aweme aweme = c1183810guZ.LLILLJJLI.getAweme();
                    if (aweme != null) {
                        aid = aweme.getAid();
                    }
                    if (Intrinsics.LJFF(aid, str) || Intrinsics.LJFF(C1187250h07.LIZ(c1183810guZ.LLILLJJLI), str)) {
                        return i;
                    }
                }
                i++;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4 A[EDGE_INSN: B:65:0x00c4->B:51:0x00c4 BREAK  A[LOOP:0: B:43:0x00a8->B:66:?], SYNTHETIC] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1157090gDT r22) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageListAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1157090gDT c1157090gDT) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1157090gDT c1157090gDT) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
