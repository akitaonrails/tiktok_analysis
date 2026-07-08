package com.ss.android.ugc.aweme.poi.anchor.component;

import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C0SZ8;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C123100dR;
import X.C189200o6;
import X.C18JG;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23250099c;
import X.C452501pT;
import X.C613000O2o;
import X.InterfaceC1616070s9l;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiTrace;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class PoiAnchorPanelComponent extends BasePanelComponent implements InterfaceC1616070s9l {
    public final C01GW LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1435));
    public AnonymousClass0956 LLILLJJLI;

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this);
        }
        bo("onParentViewCreated");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final void bo(String str) {
        String str2;
        Aweme awemeLJIIIIZZ;
        String str3;
        Aweme awemeLJIIIIZZ2;
        PoiDataStruct poiDataStruct;
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", poi_id: ");
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null && (awemeLJIIIIZZ2 = iViewPagerComponentAbility.LJIIIIZZ()) != null && (poiDataStruct = awemeLJIIIIZZ2.getPoiDataStruct()) != null) {
            str2 = poiDataStruct.poiId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility2 != null && (awemeLJIIIIZZ = iViewPagerComponentAbility2.LJIIIIZZ()) != null) {
            PoiTrace poiTrace = awemeLJIIIIZZ.getPoiTrace();
            if (poiTrace != null && (str3 = poiTrace.poiId) != null && str3.length() != 0) {
                this.LLILLJJLI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C613000O2o(this, awemeLJIIIIZZ, str, poiTrace, null), 2);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(", poi_id is empty");
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected ");
        sbLIZ.append(i);
        bo(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m305do(Aweme aweme, String str, String str2, boolean z, boolean z2, boolean z3) {
        String eventType;
        String str3;
        boolean z4;
        LinkedHashMap linkedHashMap;
        String strLIZLLL;
        Object obj;
        Object obj2;
        Object obj3;
        Object c098200Yq;
        Object objOpt;
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String aid = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        if (poiDataStruct != null) {
            str3 = poiDataStruct.poiId;
        } else {
            str3 = null;
        }
        String requestId = aweme.getRequestId();
        if (poiDataStruct != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z4);
        Boolean boolValueOf2 = Boolean.valueOf(z);
        Boolean boolValueOf3 = Boolean.valueOf(z2);
        Boolean boolValueOf4 = Boolean.valueOf(z3);
        PageFinder pageFinderVia = PageFinder.via(getPanelContext().LJ);
        c1185430gxB.getClass();
        if (pageFinderVia != null) {
            Map mapLIZIZ = C18JG.LIZIZ("c0.d0", pageFinderVia);
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZIZ.size()));
            for (Map.Entry entry : mapLIZIZ.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        } else {
            linkedHashMap = null;
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap2.put("event_info", str2);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        linkedHashMap2.put(next, objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        C1189060h32.LJJ("type", "poi_anchor_invisible", linkedHashMap2);
        C1189060h32.LJJ("group_id", aid, linkedHashMap2);
        C1189060h32.LJJ("author_id", authorUid, linkedHashMap2);
        C1189060h32.LJJ("enter_from", eventType, linkedHashMap2);
        C1189060h32.LJJ("poi_id", str3, linkedHashMap2);
        C1189060h32.LJJ("log_id", requestId, linkedHashMap2);
        C1189060h32.LJJ("reason", str, linkedHashMap2);
        String str4 = "1";
        if (boolValueOf != null) {
            if (boolValueOf.booleanValue()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("has_poi_data", obj3);
        }
        if (boolValueOf2 != null) {
            if (boolValueOf2.booleanValue()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("has_poi_anchor", obj2);
        }
        if (boolValueOf3 != null) {
            if (boolValueOf3.booleanValue()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("has_poi_tag", obj);
        }
        if (boolValueOf4 != null) {
            if (!boolValueOf4.booleanValue()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("has_poi_blocked", str4);
        }
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
        if (pageFinderVia != null && (strLIZLLL = C18JG.LIZLLL(pageFinderVia, "c0.d0", null)) != null) {
            C1189060h32.LJJ("bcm_chain", strLIZLLL, linkedHashMap2);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_rd_poi_exception", linkedHashMap2, c1185050gwZ);
    }
}
