package com.ss.android.ugc.aweme.poi.detail.container.dynamicbutton;

import X.AbstractC1181640gr4;
import X.C1173300gdc;
import X.C1180620gpQ;
import X.C1183670guL;
import X.C1185600gxS;
import X.EnumC1181510gqr;
import X.EnumC1184160gv8;
import X.InterfaceC1181010gq3;
import X.InterfaceC1181380gqe;
import X.InterfaceC1184300gvM;
import X.InterfaceC1184310gvN;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDynamicButtonActionPlugin extends AbstractC1181640gr4 implements InterfaceC1181380gqe, IDynamicButtonClickAbility, IDynamicButtonShowAbility {
    public final Fragment LLILLJJLI;
    public final InterfaceC665370Q7z LLILLL;
    public final Map<String, InterfaceC1184310gvN> LLILZ = new LinkedHashMap();
    public final Map<Integer, InterfaceC1184300gvM> LLILZIL = new LinkedHashMap();
    public PoiListApi.PoiDetailResponse LLILZLL;

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIIJ() {
        this.LL = null;
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.container.dynamicbutton.PoiDynamicButtonActionPlugin for r10v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIJJLI(X.InterfaceC1181010gq3 r11) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.dynamicbutton.PoiDynamicButtonActionPlugin.LJIJJLI(X.0gq3):void");
    }

    public PoiDynamicButtonActionPlugin(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILLJJLI = fragment;
        this.LLILLL = interfaceC665370Q7z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.dynamicbutton.IDynamicButtonShowAbility
    public final void Zv2(Integer num, EnumC1184160gv8 enumC1184160gv8) {
        C1185600gxS c1185600gxS;
        C1173300gdc c1173300gdcQr0;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (c1173300gdcQr0 = interfaceC1181010gq3.qr0()) != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
        } else {
            c1185600gxS = null;
        }
        InterfaceC1184300gvM interfaceC1184300gvM = (InterfaceC1184300gvM) ((LinkedHashMap) this.LLILZIL).get(num);
        if (interfaceC1184300gvM != null) {
            interfaceC1184300gvM.LIZ(c1185600gxS, this.LLILZLL, this.LLILLL, PageFinder.via(this.LLILLJJLI));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.dynamicbutton.IDynamicButtonClickAbility
    public final void dg2(String str, EnumC1184160gv8 enumC1184160gv8, Map<String, ? extends Object> map) {
        C1185600gxS c1185600gxS;
        C1173300gdc c1173300gdcQr0;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (c1173300gdcQr0 = interfaceC1181010gq3.qr0()) != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
        } else {
            c1185600gxS = null;
        }
        InterfaceC1184310gvN interfaceC1184310gvN = (InterfaceC1184310gvN) ((LinkedHashMap) this.LLILZ).get(str);
        if (interfaceC1184310gvN != null) {
            interfaceC1184310gvN.LIZ(enumC1184160gv8, c1185600gxS, this.LLILZLL);
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
        PoiListApi.PoiDetailResponse poiDetailResponseLIZIZ;
        if (c1180620gpQ != null && (poiDetailResponseLIZIZ = C1183670guL.LIZIZ(c1180620gpQ)) != null) {
            this.LLILZLL = poiDetailResponseLIZIZ;
        }
    }
}
