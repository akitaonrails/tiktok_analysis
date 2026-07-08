package com.ss.android.ugc.profile.business.commerce.menu;

import X.C01GW;
import X.C098200Yq;
import X.C09CT;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1227904rF;
import X.C1891540zK4;
import X.C189200o6;
import X.C2249131D1j;
import X.C452501pT;
import X.InterfaceC1891550zK5;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.business.cd.IMenuAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class CommercePromoteCellContentProtocol extends ContentCellProtocol {
    public PromoteBizData LLL;
    public n LLLF;
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2079));

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_commerce_promote";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        String str;
        PromoteBizData.Cell cell;
        ProfileComponents profileComponents = this.LLJILJILJ;
        LJZI(profileComponents != null ? profileComponents.bizData : null);
        PromoteBizData promoteBizData = this.LLL;
        if (promoteBizData == null || (cell = promoteBizData.getCell()) == null || (str = cell.tailText) == null) {
            str = "";
        }
        LJLL(str);
        return false;
    }

    public final Map<String, Object> LJLLLL() {
        IMenuAbility iMenuAbility;
        String strVf2;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer numValueOf = Integer.valueOf(this.LLJL ? 1 : 0);
        C2249131D1j.LIZ.getClass();
        linkedHashMap.put(C2249131D1j.LJIILL.LIZ, numValueOf);
        if (this.LLJL && (iMenuAbility = (IMenuAbility) this.LLLFF.getValue()) != null && (strVf2 = iMenuAbility.vf2()) != null) {
            int iHashCode = strVf2.hashCode();
            if (iHashCode != -1378241396) {
                if (iHashCode != -1034364087) {
                    if (iHashCode == -934889704 && strVf2.equals("reddot")) {
                        str = "basic_reddot";
                        linkedHashMap.put(C2249131D1j.LJIILLIIL.LIZ, str);
                    }
                } else if (strVf2.equals("number")) {
                    str = "number_reddot";
                    linkedHashMap.put(C2249131D1j.LJIILLIIL.LIZ, str);
                }
            } else if (strVf2.equals("bubble")) {
                str = "popup_reddot";
                linkedHashMap.put(C2249131D1j.LJIILLIIL.LIZ, str);
            }
        }
        return linkedHashMap;
    }

    public static final class PromoteBizData extends AdvancedFeatureBaseData {
        public static final int $stable = 8;

        @C09CT("cell")
        public final Cell cell;

        public PromoteBizData() {
            this(null);
        }

        public final Cell getCell() {
            return this.cell;
        }

        public PromoteBizData(Cell cell) {
            this.cell = cell;
        }

        public static final class Cell {

            @C09CT("tail_red_dot")
            public final Boolean tailRedDot;

            @C09CT("tail_text")
            public final String tailText;

            public Cell() {
                this(null, null);
            }

            public Cell(String str, Boolean bool) {
                this.tailText = str;
                this.tailRedDot = bool;
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        final Context context;
        C1891540zK4 c1891540zK4LJJIJ;
        if (view == null || (context = view.getContext()) == null) {
            return false;
        }
        ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
        if (iCommercePromoteLogger != null) {
            iCommercePromoteLogger.LJIIIIZZ(null, "feature_center", "myself", null, null, null, null, new AwS598S0100000_19(this, 305));
        }
        final Map<String, Object> mapLJLLLL = LJLLLL();
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
        if (iCommercePromoteService == null || (c1891540zK4LJJIJ = iCommercePromoteService.LJJIJ(new InterfaceC1891550zK5() { // from class: X.0hbH
            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return "myself";
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return "feature_center";
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                return context;
            }

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                return mapLJLLLL;
            }
        })) == null) {
            return false;
        }
        c1891540zK4LJJIJ.preload();
        c1891540zK4LJJIJ.open();
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        LJZI(nVar);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJI(boolean z) {
        ICommercePromoteLogger iCommercePromoteLogger;
        if (z && (iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null)) != null) {
            iCommercePromoteLogger.LJIIJ(null, null, "feature_center", "myself", null, null, null, null, new AwS598S0100000_19(this, 306));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final boolean LJLJLLL(n nVar) {
        PromoteBizData.Cell cell;
        Boolean bool;
        LJZI(nVar);
        PromoteBizData promoteBizData = this.LLL;
        if (promoteBizData != null && (cell = promoteBizData.getCell()) != null && (bool = cell.tailRedDot) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void LJLLL(C1023640ckE c1023640ckE) {
        Map<String, Object> mapLJLLLL = LJLLLL();
        C2249131D1j.LIZ.getClass();
        C1002190cBd c1002190cBd = C2249131D1j.LJIILL;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJLLLL;
        Object obj = linkedHashMap.get(c1002190cBd.LIZ);
        Object obj2 = null;
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        c1023640ckE.withParam(c1002190cBd, obj);
        C1002190cBd c1002190cBd2 = C2249131D1j.LJIILLIIL;
        Object obj3 = linkedHashMap.get(c1002190cBd2.LIZ);
        if (obj3 instanceof String) {
            obj2 = obj3;
        }
        c1023640ckE.withParam(c1002190cBd2, obj2);
    }

    public final void LJZI(n nVar) {
        Object c098200Yq;
        if (nVar == null) {
            return;
        }
        if (Intrinsics.LJFF(nVar, this.LLLF)) {
            this.LLLF = nVar;
            return;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (PromoteBizData) C1227904rF.LIZ(nVar, PromoteBizData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        PromoteBizData promoteBizData = (PromoteBizData) c098200Yq;
        if (promoteBizData == null) {
            return;
        }
        this.LLLF = nVar;
        this.LLL = promoteBizData;
        this.LLJILJIL = promoteBizData;
    }
}
