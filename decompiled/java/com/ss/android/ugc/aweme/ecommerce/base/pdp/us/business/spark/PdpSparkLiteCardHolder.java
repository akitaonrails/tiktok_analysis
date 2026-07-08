package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark;

import X.AnonymousClass0449;
import X.C01GW;
import X.C1061704Df;
import X.C1326490kch;
import X.C1508550pML;
import X.C1508560pMM;
import X.C1508570pMN;
import X.C1508580pMO;
import X.C1546290qLD;
import X.C1743750vTh;
import X.C1751700vgW;
import X.C1755400vmU;
import X.C1775730wJH;
import X.C452501pT;
import X.C599290Nex;
import X.EnumC1752690vi7;
import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.PdpLynxLazyLoadConfig;
import kotlin.jvm.internal.AwS46S0200100_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpSparkLiteCardHolder extends AbsFullSpanVH<C1755400vmU> {
    public final ViewGroup LLJJIJIL;
    public final ViewGroup LLJJJ;
    public final C01GW LLJJJIL;
    public C1546290qLD LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel c6() {
        return (PdpViewModel) this.LLJJJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C599290Nex.LIZ(c6().LLIZLLLIL, this, AnonymousClass0449.OPEN_COUPON_DETAILS.toString(), new C1508560pMM(this, null));
        C599290Nex.LIZ(c6().LLIZLLLIL, this, AnonymousClass0449.GET_SHOP_SCHEMA.toString(), new C1751700vgW(this, null));
        C599290Nex.LIZ(c6().LLIZLLLIL, this, AnonymousClass0449.FAVORITE_ACTION.toString(), new C1508580pMO(this, null));
        C599290Nex.LIZ(c6().LLIZLLLIL, this, AnonymousClass0449.SHARE_ACTION.toString(), new C1508570pMN(this, null));
        C599290Nex.LIZ(c6().LLIZLLLIL, this, AnonymousClass0449.PICTURE_IN_PICTURE_ACTION.toString(), new C1508550pML(this, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        c6().LLIZLLLIL.jb(this);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C1755400vmU c1755400vmU = (C1755400vmU) obj;
        if (c1755400vmU.LLILZ == EnumC1752690vi7.REVIEW.getValue()) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PdpLynxLazyLoadConfig pdpLynxLazyLoadConfig = C1061704Df.LIZ;
            PdpLynxLazyLoadConfig pdpLynxLazyLoadConfig2 = (PdpLynxLazyLoadConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_pdp_lynx_lazy_load_framework", PdpLynxLazyLoadConfig.class, pdpLynxLazyLoadConfig);
            if (pdpLynxLazyLoadConfig2 != null) {
                pdpLynxLazyLoadConfig = pdpLynxLazyLoadConfig2;
            }
            if (!pdpLynxLazyLoadConfig.reviewModuleEnable) {
                c6().LLLLLILLIL.LIZ();
            }
        }
        C1775730wJH c1775730wJH = new C1775730wJH(2);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1546290qLD c1546290qLD = this.LLJJJJ;
        if (c1546290qLD == null) {
            c1546290qLD = new C1546290qLD(this.LLJJJ, new AwS605S0100000_26(this, 463));
        }
        this.LLJJJJ = c1546290qLD;
        C1326490kch c1326490kch = C1326490kch.LIZ;
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c1755400vmU, 1207);
        c1326490kch.getClass();
        C1326490kch.LIZIZ(awS570S0100000_26);
        C1326490kch.LIZIZ(new AwS570S0100000_26(c1755400vmU, 1208));
        C1326490kch.LIZIZ(new AwS570S0100000_26(c1755400vmU, 1209));
        Context context = this.LLJJIJIL.getContext();
        String str = c1755400vmU.LL;
        ViewGroup viewGroup = this.LLJJJ;
        String str2 = c1755400vmU.LLILLJJLI;
        TemplateData templateDataLJIIIIZZ = null;
        if (str2 != null) {
            templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str2);
        }
        LynxView lynxViewLIZIZ = c1546290qLD.LIZIZ(context, str, c1775730wJH, viewGroup, templateDataLJIIIIZZ, c1755400vmU.LLILZIL);
        if (lynxViewLIZIZ == null || lynxViewLIZIZ.getParent() == null) {
            this.LLJJJ.addView(lynxViewLIZIZ);
        }
        C1326490kch.LIZIZ(new AwS46S0200100_26(c1755400vmU, this, jElapsedRealtime, 1));
        if (!this.LLJJJJJIL) {
            this.LLJJJJJIL = true;
            c6().a.LLJ++;
        }
    }

    public PdpSparkLiteCardHolder(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup2);
        this.LLJJIJIL = viewGroup;
        this.LLJJJ = viewGroup2;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 463));
    }
}
