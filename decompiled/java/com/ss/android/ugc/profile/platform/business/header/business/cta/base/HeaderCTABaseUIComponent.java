package com.ss.android.ugc.profile.platform.business.header.business.cta.base;

import X.C01GW;
import X.C1250210idf;
import X.C1388190mED;
import X.C1558520qew;
import X.C19252910Tv;
import X.C452501pT;
import X.C487280J9a;
import X.EnumC1249860id6;
import X.EnumC1249910idB;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class HeaderCTABaseUIComponent extends BaseUIComponent implements InterfaceC487330J9f {
    public Integer LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public BizBaseData LLJLLL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(558));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(559));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2514));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(560));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2515));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void Oo() {
    }

    public final View Bp() {
        return (View) this.LLJZ.getValue();
    }

    public final int Ep() {
        return ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
    }

    public final int Fp() {
        return ((Number) this.LLJLLIL.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void Go() {
        if (Intrinsics.LJFF(this.assemTagInternal, "cta_base_item")) {
            Ip();
        }
    }

    public Integer up() {
        Icon icon;
        BizBaseData bizBaseData = this.LLJLLL;
        if (bizBaseData == null || (icon = bizBaseData.getIcon()) == null) {
            return null;
        }
        return Icon.getIconInt$default(icon, null, null, 3, null);
    }

    public String yp() {
        Describe describe;
        String text;
        BizBaseData bizBaseData = this.LLJLLL;
        return (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null || (text = describe.getText()) == null) ? "" : text;
    }

    public final int zp() {
        return ((Number) this.LLJLL.getValue()).intValue();
    }

    public final EnumC1249860id6 Ap() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility == null) {
            return null;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        return iHeaderCTAAbility.CJ2(str);
    }

    public final void Gp() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.ky2(str);
        }
    }

    public final void Ip() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.Bn2(str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void Jo() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.k82(this.LLJILLL, str);
        }
    }

    public final String getText() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility == null) {
            return null;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        return iHeaderCTAAbility.L92(str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1 || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
            C487280J9a.LIZJ(this);
        }
        Gp();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void tp() {
        Integer numUp = up();
        if (!Intrinsics.LJFF(this.LLJJL, numUp)) {
            String str = this.assemTagInternal;
            Integer numUp2 = up();
            IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
            if (iHeaderCTAAbility != null) {
                if (str == null && (str = this.assemTagInternal) == null) {
                    str = "";
                }
                iHeaderCTAAbility.N90(numUp2, str);
            }
            this.LLJJL = numUp;
        }
        String strYp = yp();
        if (!Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, strYp)) {
            String str2 = this.assemTagInternal;
            String strYp2 = yp();
            IHeaderCTAAbility iHeaderCTAAbility2 = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
            if (iHeaderCTAAbility2 != null) {
                iHeaderCTAAbility2.w90((str2 == null && (str2 = this.assemTagInternal) == null) ? "" : str2, strYp2);
            }
            this.LLJJLIIIJLLLLLLLZ = strYp;
        }
        Pc1(this.assemTagInternal, new AwS563S0100000_19(this, 2516));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public void Hj(ProfileComponents profileComponents) {
        String string;
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            string = nVar.toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(this.LLJL, string)) {
            return;
        }
        n nVar2 = profileComponents.bizData;
        if (nVar2 != null) {
            ep(nVar2);
        }
        tp();
        this.LLJL = string;
    }

    public final void Jp(EnumC1249910idB enumC1249910idB) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.fX0(str, enumC1249910idB);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View So(ProfileComponentUIConfig profileComponentUIConfig) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility == null) {
            return null;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        return iHeaderCTAAbility.cC2(str);
    }

    public final void Up(Integer num) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        String str = "";
        if (iHeaderCTAAbility != null) {
            String str2 = this.assemTagInternal;
            if (str2 == null) {
                str2 = "";
            }
            iHeaderCTAAbility.R91(str2, EnumC1249860id6.ICON);
        }
        IHeaderCTAAbility iHeaderCTAAbility2 = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility2 != null) {
            String str3 = this.assemTagInternal;
            if (str3 != null) {
                str = str3;
            }
            iHeaderCTAAbility2.N90(num, str);
        }
    }

    public final void Vp(String str) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        String str2 = "";
        if (iHeaderCTAAbility != null) {
            String str3 = this.assemTagInternal;
            if (str3 == null) {
                str3 = "";
            }
            iHeaderCTAAbility.R91(str3, EnumC1249860id6.TEXT);
        }
        IHeaderCTAAbility iHeaderCTAAbility2 = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility2 != null) {
            String str4 = this.assemTagInternal;
            if (str4 != null) {
                str2 = str4;
            }
            iHeaderCTAAbility2.w90(str2, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void ep(n nVar) {
        this.LLJLLL = (BizBaseData) C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
    }

    public final void Pc1(String str, Function0<Unit> function0) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            if (str == null && (str = this.assemTagInternal) == null) {
                str = "";
            }
            iHeaderCTAAbility.Pc1(str, function0);
        }
    }

    public final void Wp(int i, boolean z) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.um2(i, str, z);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        if (((Boolean) this.LLJLIL.getValue()).booleanValue()) {
            String str = this.assemTagInternal;
            Integer numValueOf = Integer.valueOf(configuration.orientation);
            IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
            if (iHeaderCTAAbility != null) {
                if (str == null && (str = this.assemTagInternal) == null) {
                    str = "";
                }
                iHeaderCTAAbility.HL1(numValueOf, str);
            }
            tp();
        }
    }

    public final void Qp(String str, int i, int i2, boolean z, Integer num) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        String str2 = "";
        if (iHeaderCTAAbility != null) {
            String str3 = this.assemTagInternal;
            if (str3 == null) {
                str3 = "";
            }
            iHeaderCTAAbility.R91(str3, EnumC1249860id6.ICON_TEXT);
        }
        IHeaderCTAAbility iHeaderCTAAbility2 = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility2 != null) {
            String str4 = this.assemTagInternal;
            if (str4 != null) {
                str2 = str4;
            }
            iHeaderCTAAbility2.jO1(str2, str, num, z, i, i2);
        }
    }
}
