package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel;

import X.C123100dR;
import X.C1728230v4f;
import X.C1728950v5p;
import X.C1728960v5q;
import X.C1728990v5t;
import X.C1729070v61;
import X.C1730290v7z;
import X.C1745680vWo;
import X.C2126308Ur;
import X.C23250099c;
import X.C324380Cnc;
import X.InterfaceC0148002o;
import X.InterfaceC1728700v5Q;
import X.InterfaceC1729810v7D;
import X.InterfaceC20673515v3;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.settings.TtecLiveBannerResourceIdSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.settings.TtecLiveMultiBillboardResourceIdSettings;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardGlobalViewModel extends AssemViewModel<C1728990v5t> implements InterfaceC1729810v7D {
    public final C1728950v5p LL = new C1728950v5p();
    public final C1728230v4f LLILLJJLI = new C1728230v4f();
    public final InterfaceC1728700v5Q LLILLL;

    @Override // X.InterfaceC1729810v7D
    public final boolean UG0() {
        C1730290v7z.LIZ.getClass();
        return C1730290v7z.LJIILIIL();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1728990v5t(0);
    }

    @Override // X.InterfaceC1729810v7D
    public final void oQ() {
        setStateImmediate(AFwS268S0000000_26.get$arr$(370));
    }

    public final void vQ2() {
        this.LL.LL.getClass();
        C1729070v61.LIZ().storeBoolean("key_is_first_show_auto_display", false);
        setState(AFwS268S0000000_26.get$arr$(371));
    }

    public final void xQ2() {
        InterfaceC1728700v5Q interfaceC1728700v5Q = this.LLILLL;
        if (interfaceC1728700v5Q == null) {
            return;
        }
        setStateImmediate(new AwS605S0100000_26(interfaceC1728700v5Q.LJI(interfaceC1728700v5Q.LIZ()), 329));
        TtecLiveMultiBillboardResourceIdSettings.MultiBillboardResourceIdConfig multiBillboardResourceIdConfigLIZ = TtecLiveMultiBillboardResourceIdSettings.LIZ();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ttec_live_multi_billboard_request_effect_opt", false)) {
            interfaceC1728700v5Q.LJIIIZ(multiBillboardResourceIdConfigLIZ.templateResourceId, multiBillboardResourceIdConfigLIZ.photoResourceId, new AwS640S0100000_26(this, 48));
        } else {
            String str = multiBillboardResourceIdConfigLIZ.templateResourceId;
            if (str != null) {
                interfaceC1728700v5Q.LIZ();
                interfaceC1728700v5Q.LIZJ(str, "greensceen", new AwS605S0100000_26(this, 330));
            }
            String str2 = multiBillboardResourceIdConfigLIZ.photoResourceId;
            if (str2 != null) {
                interfaceC1728700v5Q.LIZ();
                interfaceC1728700v5Q.LIZJ(str2, "greensceen", new AwS605S0100000_26(this, 331));
            }
        }
        TtecLiveBannerResourceIdSettings.BannerResourceIdConfig bannerResourceIdConfigLIZ = TtecLiveBannerResourceIdSettings.LIZ();
        if (Intrinsics.LJFF(bannerResourceIdConfigLIZ.preload, Boolean.TRUE)) {
            String str3 = bannerResourceIdConfigLIZ.resourceId;
            String str4 = bannerResourceIdConfigLIZ.panel;
            if (str4 == null) {
                str4 = "live_ec_top_atmosphere";
            }
            String str5 = bannerResourceIdConfigLIZ.categoryId;
            if (str5 == null) {
                str5 = "top_atmosphere";
            }
            if (C123100dR.LIZ(str3)) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C2126308Ur.LIZ, null, new C324380Cnc(interfaceC1728700v5Q, str4, str3, str5, null), 2);
            }
        }
    }

    public BillboardGlobalViewModel() {
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        this.LLILLL = interfaceC20673515v3K4 != null ? interfaceC20673515v3K4.LLI() : null;
    }

    @Override // X.InterfaceC1729810v7D
    public final C1728990v5t Um1() {
        return getState();
    }

    @Override // X.InterfaceC1729810v7D
    public final boolean d62() {
        return getState().LLIZLLLIL == 1 || getState().LLJILJIL.size() < getState().LLIZLLLIL;
    }

    @Override // X.InterfaceC1729810v7D
    public final void bz2(TemplateItem templateItem) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (TemplateItem templateItem2 : getState().LLJILJIL) {
            if (Intrinsics.LJFF(templateItem2.getTemplateId(), templateItem.getTemplateId())) {
                arrayList.add(templateItem);
                z = true;
            } else {
                arrayList.add(templateItem2);
            }
        }
        if (!z) {
            arrayList.add(templateItem);
        }
        setStateImmediate(new AwS605S0100000_26(arrayList, (List<C1745680vWo>) 327));
    }

    @Override // X.InterfaceC1729810v7D
    public final void jx0(List<? extends TemplateItem> list) {
        setStateImmediate(new AwS605S0100000_26(list, (List<C1745680vWo>) 333));
    }

    @Override // X.InterfaceC1729810v7D
    public final void tI1(TemplateItem templateItem) {
        List<TemplateItem> list = getState().LLJILJIL;
        ArrayList arrayList = new ArrayList();
        for (TemplateItem templateItem2 : list) {
            if (!Intrinsics.LJFF(templateItem2.getTemplateId(), templateItem.getTemplateId())) {
                arrayList.add(templateItem2);
            }
        }
        setStateImmediate(new AwS605S0100000_26(arrayList, (List<C1745680vWo>) 328));
    }

    @Override // X.InterfaceC1729810v7D
    public final void xx0(LiveEffect liveEffect) {
        setStateImmediate(new AwS605S0100000_26(liveEffect, 332));
    }

    public final void yQ2(int i) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C2126308Ur.LIZ, null, new C1728960v5q(this, i, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = r7.isNewUser
            if (r0 != 0) goto L2f
            X.0v5p r0 = r6.LL
            X.0v5o r0 = r0.LL
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C1729070v61.LIZ()
            java.lang.String r0 = "key_is_first_show_auto_display"
            r2 = 1
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L2f
        L18:
            X.0v7z r0 = X.C1730290v7z.LIZ
            r0.getClass()
            java.lang.String r5 = X.C1730290v7z.LJIIJ()
            r7.userId = r5
            kotlin.jvm.internal.AwS112S0110000_26 r1 = new kotlin.jvm.internal.AwS112S0110000_26
            r0 = 6
            r1.<init>(r7, r2, r0)
            r6.setStateImmediate(r1)
            if (r8 != 0) goto L31
            return
        L2f:
            r2 = 0
            goto L18
        L31:
            X.01wk r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            X.08Us r3 = X.C2126308Ur.LIZIZ
            X.0v5n r2 = new X.0v5n
            r1 = 0
            r2.<init>(r6, r7, r5, r1)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel.wQ2(com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData, boolean):void");
    }

    @Override // X.InterfaceC1729810v7D
    public final void wh1(LiveEffect liveEffect, boolean z) {
        if (z) {
            setStateImmediate(new AwS605S0100000_26(liveEffect, 334));
        } else {
            setStateImmediate(new AwS605S0100000_26(liveEffect, 335));
        }
    }
}
