package com.ss.android.ugc.aweme.commerce.tools.tcm;

import X.AbstractC856620Xj2;
import X.C01GW;
import X.C09R3;
import X.C1001130c9v;
import X.C1010170cOV;
import X.C1388190mED;
import X.C13LE;
import X.C1428470nHB;
import X.C1446650nkV;
import X.C20506715Mb;
import X.C20508815Mw;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C452501pT;
import X.C856500Xiq;
import X.C856510Xir;
import X.C997320c3m;
import X.InterfaceC1003940cES;
import X.InterfaceC1010530cP5;
import X.InterfaceC1065900dqO;
import X.InterfaceC20507515Mj;
import X.InterfaceC20507615Mk;
import X.InterfaceC20507715Ml;
import X.InterfaceC20508415Ms;
import X.InterfaceC2217461Bqa;
import Y.AObserverS233S0100000_31;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BCPageModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC1003940cES(service = {InterfaceC20507715Ml.class})
public final class CommerceTcmPublishModule implements InterfaceC20507715Ml {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final InterfaceC20508415Ms LL;
    public boolean LLIZ;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS276S0000000_31.get$arr$(336));
    public final C997320c3m LLILLL = new C997320c3m(AFwS276S0000000_31.get$arr$(335));
    public final C997320c3m LLILZ = new C997320c3m(AFwS276S0000000_31.get$arr$(339));
    public final C997320c3m LLILZIL = new C997320c3m(AFwS276S0000000_31.get$arr$(338));
    public final C997320c3m LLILZLL = new C997320c3m(AFwS276S0000000_31.get$arr$(337));
    public final BrandedContentSwitchStatus LLIZLLLIL = new BrandedContentSwitchStatus();
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS560S0100000_16((InterfaceC1010530cP5) this, 912));
    public final ICommerceToolsTcmService LLJI = (ICommerceToolsTcmService) ServiceManager.get().getService(ICommerceToolsTcmService.class);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceTcmPublishModule.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommerceTcmPublishModule.class, "fragment", "getFragment()Landroidx/fragment/app/Fragment;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommerceTcmPublishModule.class, "tcmModel", "getTcmModel()Lcom/ss/android/ugc/aweme/commerce/tools/tcm/CommerceToolsTcmModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(CommerceTcmPublishModule.class, "structList", "getStructList()Ljava/util/List;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(CommerceTcmPublishModule.class, "postContent", "getPostContent()Ljava/lang/String;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.InterfaceC856520Xis
    public final void IS() {
    }

    @Override // X.InterfaceC856250XiR
    public final void LIZJ() {
    }

    @Override // X.InterfaceC20507715Ml
    public final JSONArray K81() throws JSONException {
        C997320c3m c997320c3m = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        if (Intrinsics.LJFF(c997320c3m.LIZ(this), "")) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        for (AVTextExtraStruct aVTextExtraStruct : (List) this.LLILZIL.LIZ(this)) {
            String str = aVTextExtraStruct.userId;
            if (str != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uid", str);
                C997320c3m c997320c3m2 = this.LLILZLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJIJIL;
                jSONObject.put("name", ((String) c997320c3m2.LIZ(this)).substring(aVTextExtraStruct.start, aVTextExtraStruct.end));
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public final Fragment LIZ() {
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (Fragment) c997320c3m.LIZ(this);
    }

    public final VideoPublishEditModel LIZIZ() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (VideoPublishEditModel) c997320c3m.LIZ(this);
    }

    public final CommerceToolsTcmModel LIZLLL() {
        C997320c3m c997320c3m = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (CommerceToolsTcmModel) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC20507715Ml
    public final JSONArray Xe() {
        C997320c3m c997320c3m = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        if (Intrinsics.LJFF(c997320c3m.LIZ(this), "")) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = ((List) this.LLILZIL.LIZ(this)).iterator();
        while (it2.hasNext()) {
            String str = ((AVTextExtraStruct) it2.next()).hashTagName;
            if (str != null) {
                jSONArray.put(str);
            }
        }
        return jSONArray;
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        ((InterfaceC1065900dqO) Mh()).LJIIIZ(this);
        ((InterfaceC20507615Mk) Mh()).getLifecycleOwner().getLifecycle().addObserver(this);
        C1010170cOV.LIZJ(this);
    }

    @Override // X.InterfaceC20507715Ml, X.InterfaceC1057310dcX
    public final void onResume() {
        C20506715Mb.onResume(this);
        if (this.LL.LJIJ() || this.LLJI.LJIIJ() || (C20508815Mw.LIZLLL() && C1428470nHB.LJJZZI(LIZIZ()))) {
            String brandedContentSwitch = LIZLLL().getBrandedContentSwitch();
            if (brandedContentSwitch == null) {
                brandedContentSwitch = CardStruct.IStatusCode.DEFAULT;
            }
            LJ(brandedContentSwitch);
            if (LIZLLL().getTcmPreventSelfSee() == 2) {
                this.LL.LJIILL(true);
            } else if (LIZLLL().getTcmPreventSelfSee() == 1) {
                this.LL.LJIILL(false);
            }
            this.LL.LJ(LIZLLL().isTcmOrder());
        }
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    @Override // X.InterfaceC20507715Ml, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C20506715Mb.onCreate(this);
    }

    @Override // X.InterfaceC20507715Ml, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C20506715Mb.onDestroy(this);
    }

    @Override // X.InterfaceC20507715Ml, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C20506715Mb.onPause(this);
    }

    @Override // X.InterfaceC20507715Ml, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C20506715Mb.onStart(this);
    }

    @Override // X.InterfaceC20507715Ml, X.InterfaceC1057310dcX
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C20506715Mb.onStop(this);
    }

    public CommerceTcmPublishModule(AbstractC856620Xj2 abstractC856620Xj2) {
        this.LL = abstractC856620Xj2;
    }

    @Override // X.InterfaceC20507715Ml
    public final void KC(boolean z) {
        LIZLLL().setHasTaggedBA(z);
    }

    public final void LJ(String str) {
        Integer numLJIIJJI;
        boolean z = false;
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && numLJIIJJI.intValue() > 0) {
            z = true;
        }
        this.LLJI.LJI(C1001130c9v.LIZ(this), str);
        this.LL.LJIIJJI(z);
        this.LL.LJII().setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC20507715Ml
    public final void Tv1(Fragment fragment) {
        this.LLJI.LJIJI((BCPageModel) this.LLJ.getValue());
        ((BCPageModel) this.LLJ.getValue()).LL.observe(fragment, new AObserverS233S0100000_31(this, 11));
    }

    @Override // X.InterfaceC856520Xis
    public final boolean np0(InterfaceC20507515Mj interfaceC20507515Mj) {
        C856500Xiq c856500Xiq = new C856500Xiq(new AwS575S0100000_31(interfaceC20507515Mj, 342), new AwS575S0100000_31(interfaceC20507515Mj, 343));
        c856500Xiq.LIZ(new AwS610S0100000_31(this, 145));
        c856500Xiq.LIZ(new AwS610S0100000_31(this, 146));
        c856500Xiq.LIZ(new AwS610S0100000_31(this, 147));
        c856500Xiq.LIZ(new AwS593S0100000_14(c856500Xiq, 198));
        C856510Xir c856510Xir = c856500Xiq.LIZJ;
        if (c856510Xir != null) {
            c856510Xir.LIZLLL();
        }
        interfaceC20507515Mj.getIntercepted();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    @Override // X.InterfaceC20507715Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oi1(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule.oi1(java.lang.String):void");
    }

    @Override // X.InterfaceC20507715Ml
    public final void or2(Context context) {
        Activity activityLIZ;
        ICommerceToolsTcmService iCommerceToolsTcmService = (ICommerceToolsTcmService) ServiceManager.get().getService(ICommerceToolsTcmService.class);
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        iCommerceToolsTcmService.LJIIIIZZ(activityLIZ, C1446650nkV.LIZIZ(LIZIZ()), LIZLLL(), C1446650nkV.LIZ(LIZIZ()), C1428470nHB.LJIIJJI(LIZIZ()));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @Override // X.InterfaceC20507715Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Ob1(androidx.fragment.app.Fragment r13, X.InterfaceC1364105Vn<? super java.lang.Integer> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C20508315Mr
            if (r0 == 0) goto L62
            r11 = r14
            X.15Mr r11 = (X.C20508315Mr) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r11.LLILLL = r2
        L12:
            java.lang.Object r1 = r11.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r11.LLILLL
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L68
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
        L28:
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel r2 = r12.LIZLLL()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.LIZIZ()
            int r1 = r0.getCreationMode()
            r0 = 2
            if (r1 != r0) goto L41
            r0 = 0
            goto L28
        L41:
            com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService r5 = r12.LLJI
            r7 = 0
            java.lang.String r1 = r2.getBrandedContentSwitch()
            java.lang.String r0 = "0"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r8 = r0 ^ 1
            boolean r9 = r2.getAdsAuthorizationSwitch()
            boolean r10 = r2.getHasTaggedBA()
            r11.LLILLL = r3
            r6 = r13
            java.lang.Object r1 = r5.LIZJ(r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L22
            return r4
        L62:
            X.15Mr r11 = new X.15Mr
            r11.<init>(r12, r14)
            goto L12
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule.Ob1(androidx.fragment.app.Fragment, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC20507715Ml
    public final void c12(boolean z, boolean z2) {
        String brandOrganicType;
        C20508815Mw c20508815Mw = C20508815Mw.LIZ;
        CommerceToolsTcmModel commerceToolsTcmModelLIZLLL = LIZLLL();
        BrandedContentSwitchStatus brandedContentSwitchStatus = this.LLIZLLLIL;
        c20508815Mw.getClass();
        if (z) {
            if (z2) {
                brandedContentSwitchStatus.LLILLJJLI.setValue("1002");
                return;
            } else {
                brandedContentSwitchStatus.LLILLJJLI.setValue("1001");
                return;
            }
        }
        if (commerceToolsTcmModelLIZLLL != null) {
            brandOrganicType = commerceToolsTcmModelLIZLLL.getBrandOrganicType();
        } else {
            brandOrganicType = null;
        }
        if (!TextUtils.equals(brandOrganicType, "1002")) {
            return;
        }
        brandedContentSwitchStatus.LLILLJJLI.setValue(CardStruct.IStatusCode.DEFAULT);
    }

    @Override // X.InterfaceC856250XiR
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        CommerceToolsTcmModel commerceToolsTcmModelLIZLLL = LIZLLL();
        if (commerceToolsTcmModelLIZLLL != null && (commerceToolsTcmModelLIZLLL.getTcmPreventSelfSee() == 2 || commerceToolsTcmModelLIZLLL.getTcmPreventSelfSee() == 1)) {
            this.LL.LJIJJ();
        }
        ICommerceToolsTcmService iCommerceToolsTcmService = this.LLJI;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.buj);
        boolean zLIZ = C1446650nkV.LIZ(LIZIZ());
        boolean zLIZLLL = C1446650nkV.LIZLLL(LIZIZ());
        this.LL.getDelegate();
        iCommerceToolsTcmService.LJIILLIIL(viewStub, zLIZ, zLIZLLL);
        ICommerceToolsTcmService iCommerceToolsTcmService2 = this.LLJI;
        Fragment fragmentLIZ = LIZ();
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.xfw);
        CommerceToolsTcmModel commerceToolsTcmModelLIZLLL2 = LIZLLL();
        boolean zLJJZZI = C1428470nHB.LJJZZI(LIZIZ());
        boolean zLIZIZ = C1446650nkV.LIZIZ(LIZIZ());
        boolean zLIZ2 = C1446650nkV.LIZ(LIZIZ());
        int iLJIIJJI = C1428470nHB.LJIIJJI(LIZIZ());
        this.LL.getDelegate();
        iCommerceToolsTcmService2.LJIJ(fragmentLIZ, viewStub2, commerceToolsTcmModelLIZLLL2, zLJJZZI, zLIZIZ, zLIZ2, iLJIIJJI, this.LL.LJI());
        this.LLIZLLLIL.LL.observe(LIZ(), new AObserverS233S0100000_31(this, 12));
        this.LLIZLLLIL.LLILLJJLI.observe(LIZ(), new AObserverS233S0100000_31(this, 13));
        this.LLIZLLLIL.LLILLL.observe(LIZ(), new AObserverS233S0100000_31(this, 14));
        Tv1(LIZ());
        AutoSelectedAnchorInfos autoSelectedAnchorInfos = LIZIZ().getCreativeFlowData().getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos != null) {
            str = autoSelectedAnchorInfos.openPlatFormExtra;
        } else {
            str = null;
        }
        oi1(str);
    }

    @Override // X.InterfaceC20507715Ml
    public final void mg1(int i, boolean z, boolean z2) {
        String brandedContentSwitch;
        C20508815Mw c20508815Mw = C20508815Mw.LIZ;
        CommerceToolsTcmModel commerceToolsTcmModelLIZLLL = LIZLLL();
        BrandedContentSwitchStatus brandedContentSwitchStatus = this.LLIZLLLIL;
        c20508815Mw.getClass();
        if (z) {
            if (z2) {
                brandedContentSwitchStatus.LL.setValue("7");
            } else {
                brandedContentSwitchStatus.LL.setValue("1");
            }
        } else {
            if (commerceToolsTcmModelLIZLLL != null) {
                brandedContentSwitch = commerceToolsTcmModelLIZLLL.getBrandedContentSwitch();
            } else {
                brandedContentSwitch = null;
            }
            if (Intrinsics.LJFF(brandedContentSwitch, "7")) {
                brandedContentSwitchStatus.LL.setValue(CardStruct.IStatusCode.DEFAULT);
            }
        }
        if (commerceToolsTcmModelLIZLLL != null) {
            commerceToolsTcmModelLIZLLL.setBcCustomAlertTerminology(i);
        }
    }
}
