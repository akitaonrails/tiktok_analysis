package com.ss.android.ugc.aweme.ecommerce.mall.vm;

import X.AbstractC738140SxQ;
import X.C07B6;
import X.C0CXF;
import X.C0PEM;
import X.C0S4U;
import X.C1558520qew;
import X.C1768560w7i;
import X.C1768620w7o;
import X.C1768850w8B;
import X.C1769000w8Q;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C2421209eE;
import X.EnumC1768570w7j;
import X.EnumC1768950w8L;
import X.EnumC1768960w8M;
import X.EnumC1768980w8O;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.toptab.TopTabCustomDotHandler;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopIconServiceImpl implements IShopIconService {
    public CustomDotAssem LIZ;

    public static CustomDotAbilityCommon LIZIZ() {
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        Activity activityLIZ = C2421209eE.LIZ();
        if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) == null || (interfaceC665370Q7z = mainActivityScopeLIZJ.LL) == null) {
            return null;
        }
        return (CustomDotAbilityCommon) C1558520qew.LIZ(interfaceC665370Q7z, CustomDotAbilityCommon.class, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final AbstractC738140SxQ LIZ() {
        CustomDotAssem customDotAssem = null;
        if (C07B6.LIZ()) {
            C0CXF.LIZ.getClass();
            if (C0CXF.LJ()) {
                return new CustomDotAssem(new BottomTabCustomDotHandler());
            }
            if (C0CXF.LJFF()) {
                return new CustomDotAssem(new TopTabCustomDotHandler());
            }
            return null;
        }
        C0CXF.LIZ.getClass();
        if (C0CXF.LJ()) {
            customDotAssem = new CustomDotAssem(new BottomTabCustomDotHandler());
        } else if (C0CXF.LJFF()) {
            customDotAssem = new CustomDotAssem(new TopTabCustomDotHandler());
        }
        this.LIZ = customDotAssem;
        return customDotAssem;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final void cl() {
        if (C07B6.LIZ()) {
            CustomDotAbilityCommon customDotAbilityCommonLIZIZ = LIZIZ();
            if (customDotAbilityCommonLIZIZ != null) {
                customDotAbilityCommonLIZIZ.cl();
                return;
            }
            return;
        }
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null) {
            customDotAssem.cl();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final void vj() {
        if (C07B6.LIZ()) {
            CustomDotAbilityCommon customDotAbilityCommonLIZIZ = LIZIZ();
            if (customDotAbilityCommonLIZIZ != null) {
                customDotAbilityCommonLIZIZ.vj();
                return;
            }
            return;
        }
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null) {
            customDotAssem.vj();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final boolean xu() {
        if (C07B6.LIZ()) {
            CustomDotAbilityCommon customDotAbilityCommonLIZIZ = LIZIZ();
            return customDotAbilityCommonLIZIZ != null && customDotAbilityCommonLIZIZ.xu();
        }
        CustomDotAssem customDotAssem = this.LIZ;
        return customDotAssem != null && customDotAssem.xu();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final void Cs(int i, int i2) {
        if (C07B6.LIZ()) {
            CustomDotAbilityCommon customDotAbilityCommonLIZIZ = LIZIZ();
            if (customDotAbilityCommonLIZIZ != null) {
                customDotAbilityCommonLIZIZ.Cs(i, i2);
                return;
            }
            return;
        }
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem == null) {
            return;
        }
        customDotAssem.Cs(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final void Pv(EnumC1768950w8L enumC1768950w8L, C1768850w8B c1768850w8B, Map map) {
        Map linkedHashMap = map;
        if (C07B6.LIZ()) {
            CustomDotAbilityCommon customDotAbilityCommonLIZIZ = LIZIZ();
            if (customDotAbilityCommonLIZIZ != null) {
                customDotAbilityCommonLIZIZ.Pv(enumC1768950w8L, c1768850w8B, linkedHashMap);
                return;
            }
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            C1768560w7i c1768560w7i = C1768560w7i.LIZ;
            EnumC1768570w7j enumC1768570w7j = EnumC1768570w7j.TRIGGER_REQUEST;
            EnumC1768960w8M enumC1768960w8MLIZ = C1769000w8Q.LIZ(enumC1768950w8L);
            linkedHashMap.put("reason", EnumC1768980w8O.MAIN_ACTIVITY_SCOPE_ABILITY_EMPTY.getValue());
            c1768560w7i.getClass();
            C1768560w7i.LJ(enumC1768570w7j, enumC1768960w8MLIZ, false, linkedHashMap);
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C1768620w7o(this, enumC1768950w8L, c1768850w8B, linkedHashMap, null), 3);
    }
}
