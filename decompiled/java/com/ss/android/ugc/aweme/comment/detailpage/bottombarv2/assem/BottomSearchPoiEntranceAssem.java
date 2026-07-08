package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C0QSJ;
import X.C1188890h2l;
import X.C1227904rF;
import X.C1554610qYd;
import X.C1558520qew;
import X.C21246818Cs;
import X.C2188811AlT;
import X.C2189821An6;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC687730QyJ;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.search.detail.bottom.SearchDetailBottomBarProtocol;
import com.ss.android.ugc.aweme.search.detail.bottom.SearchDetailBottomBarScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BottomSearchPoiEntranceAssem extends AbstractBottomPriorityComponent implements C0QSJ {
    public String LLJ;
    public Boolean LLJI;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchDetailBottomBarScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(SearchDetailBottomBarScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchDetailBottomBarScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "search_poi_entry";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIL() {
        /*
            r6 = this;
            X.1An6 r0 = r6.xp0()
            if (r0 == 0) goto Lc
            java.lang.String r5 = r0.getEventType()
            if (r5 != 0) goto Le
        Lc:
            java.lang.String r5 = ""
        Le:
            X.1An6 r0 = r6.xp0()
            r1 = 0
            if (r0 == 0) goto L68
            java.util.Map r4 = r0.getExtra()
            if (r4 == 0) goto L69
            java.lang.String r0 = "is_show_poi_bottom_bar"
            java.lang.Object r2 = r4.get(r0)
        L21:
            java.lang.String r0 = "1"
            boolean r3 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.Ho()
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r0.getPoiDataStruct()
            if (r0 == 0) goto L4e
            r1 = r0
        L34:
            java.lang.String r0 = "general_search"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "search_result"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L6b
        L44:
            if (r3 == 0) goto L6b
            if (r1 == 0) goto L6b
            java.lang.String r0 = r1.poiId
            if (r0 == 0) goto L6b
            r0 = 1
            return r0
        L4e:
            if (r4 == 0) goto L34
            java.lang.String r0 = "poi_data"
            java.lang.Object r2 = r4.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L34
            X.04rF r1 = X.C1227904rF.LIZ
            java.lang.Class<com.ss.android.ugc.aweme.poi.PoiDataStruct> r0 = com.ss.android.ugc.aweme.poi.PoiDataStruct.class
            r1.getClass()
            java.lang.Object r1 = X.C1227904rF.LIZIZ(r2, r0)
            com.ss.android.ugc.aweme.poi.PoiDataStruct r1 = (com.ss.android.ugc.aweme.poi.PoiDataStruct) r1
            goto L34
        L68:
            r4 = r1
        L69:
            r2 = r1
            goto L21
        L6b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomSearchPoiEntranceAssem.LJJLIL():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[PHI: r2
      0x001a: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String), (r2v3 java.lang.String) binds: [B:6:0x000a, B:8:0x0010, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c A[PHI: r2
      0x000c: PHI (r2v3 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:6:0x000a, B:4:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Go(X.C2189821An6 r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L8
            java.lang.String r2 = r4.getEventType()
            if (r2 != 0) goto Lc
        L8:
            java.lang.String r2 = ""
            if (r4 == 0) goto L1a
        Lc:
            java.util.Map r1 = r4.getExtra()
            if (r1 == 0) goto L1a
            java.lang.String r0 = "is_show_poi_bottom_bar"
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L1c
        L1a:
            java.lang.String r1 = "0"
        L1c:
            java.lang.String r0 = "1"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r4 == 0) goto L30
            com.ss.android.ugc.aweme.feed.param.DetailNavArgModel r0 = r4.getNavArgModel()
            if (r0 == 0) goto L30
            java.lang.Boolean r0 = r0.isShowSearchCollectionBottomBar()
            if (r0 != 0) goto L32
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L32:
            r3.LLJI = r0
            java.lang.String r0 = "general_search"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L44
            java.lang.String r0 = "search_result"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L48
        L44:
            if (r1 == 0) goto L48
            r0 = 1
            return r0
        L48:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomSearchPoiEntranceAssem.Go(X.1An6):boolean");
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void No(ViewGroup viewGroup) {
        String aid;
        Integer numValueOf;
        Map<String, String> extra;
        PoiDataStruct poiDataStruct;
        String eventType;
        String enterMethodValue;
        String str;
        boolean zBooleanValue;
        String searchTabShowName;
        DetailNavArgModel navArgModel;
        String searchTabShowCount;
        DetailNavArgModel navArgModel2;
        DetailNavArgModel navArgModel3;
        String str2;
        Boolean bool;
        Aweme awemeHo = Ho();
        if (awemeHo == null || (aid = awemeHo.getAid()) == null) {
            return;
        }
        if (!Intrinsics.LJFF(aid, this.LLJ) || ((bool = this.LLJI) != null && Intrinsics.LJFF(bool, Boolean.TRUE))) {
            this.LLJ = aid;
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), SearchDetailBottomBarProtocol.class, false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAttach: ");
            sbLIZ.append(aid);
            sbLIZ.append(", protocolList: ");
            if (listLIZIZ != null) {
                numValueOf = Integer.valueOf(((ArrayList) listLIZIZ).size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            C2189821An6 c2189821An6Xp0 = xp0();
            if (c2189821An6Xp0 != null) {
                extra = c2189821An6Xp0.getExtra();
            } else {
                extra = null;
            }
            if (listLIZIZ != null) {
                for (SearchDetailBottomBarProtocol searchDetailBottomBarProtocol : (ArrayList) listLIZIZ) {
                    try {
                        C1227904rF c1227904rF = C1227904rF.LIZ;
                        if (extra != null) {
                            str2 = extra.get("poi_data");
                        } else {
                            str2 = null;
                        }
                        c1227904rF.getClass();
                        poiDataStruct = (PoiDataStruct) C1227904rF.LIZIZ(str2, PoiDataStruct.class);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        poiDataStruct = null;
                    }
                    Objects.toString(poiDataStruct);
                    C2189821An6 c2189821An6Xp02 = xp0();
                    if (c2189821An6Xp02 != null && (navArgModel3 = c2189821An6Xp02.getNavArgModel()) != null) {
                        navArgModel3.isShowSearchCollectionBottomBar();
                    }
                    C2189821An6 c2189821An6Xp03 = xp0();
                    String str3 = "";
                    if (c2189821An6Xp03 == null || (eventType = c2189821An6Xp03.getEventType()) == null) {
                        eventType = "";
                    }
                    C2189821An6 c2189821An6Xp04 = xp0();
                    if (c2189821An6Xp04 == null || (enterMethodValue = c2189821An6Xp04.getEnterMethodValue()) == null) {
                        enterMethodValue = "";
                    }
                    if (extra != null) {
                        extra.get("enter_inner_flow_method");
                    }
                    C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(PageFinder.via(this));
                    if (btmPageInfoV2 != null) {
                        str = btmPageInfoV2.LIZJ;
                    } else {
                        str = null;
                    }
                    C1188890h2l c1188890h2l = new C1188890h2l(awemeHo, eventType, enterMethodValue, poiDataStruct, str);
                    Boolean bool2 = this.LLJI;
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    c1188890h2l.LJFF = zBooleanValue;
                    C2189821An6 c2189821An6Xp05 = xp0();
                    if (c2189821An6Xp05 == null || (navArgModel2 = c2189821An6Xp05.getNavArgModel()) == null || (searchTabShowName = navArgModel2.getSearchTabShowName()) == null) {
                        searchTabShowName = "";
                    }
                    c1188890h2l.LJI = searchTabShowName;
                    C2189821An6 c2189821An6Xp06 = xp0();
                    if (c2189821An6Xp06 != null && (navArgModel = c2189821An6Xp06.getNavArgModel()) != null && (searchTabShowCount = navArgModel.getSearchTabShowCount()) != null) {
                        str3 = searchTabShowCount;
                    }
                    c1188890h2l.LJII = str3;
                    searchDetailBottomBarProtocol.rD2(viewGroup, c1188890h2l);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            C786410Ut5.Sd(R.layout.a1w, C786410Ut5.ne(viewGroup.getContext()), viewGroup).setId(R.id.fq5);
            C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 57));
        }
    }
}
