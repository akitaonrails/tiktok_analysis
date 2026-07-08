package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget;

import X.AbstractC1338480kw2;
import X.AbstractC1585810rMx;
import X.AnonymousClass0317;
import X.AnonymousClass0378;
import X.C013C;
import X.C01GW;
import X.C01R7;
import X.C034S;
import X.C037C;
import X.C03NI;
import X.C04CV;
import X.C04FG;
import X.C04GW;
import X.C04I6;
import X.C04IE;
import X.C04IH;
import X.C09AE;
import X.C0DXR;
import X.C0H9H;
import X.C0PEM;
import X.C0QSJ;
import X.C10287040n;
import X.C1034540d1o;
import X.C10515049h;
import X.C1054104Ah;
import X.C1056204Bc;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11EA;
import X.C12ES;
import X.C1308910kAL;
import X.C1338430kvx;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C13LP;
import X.C1406730mi7;
import X.C1440005kM;
import X.C14EU;
import X.C1558360qeg;
import X.C1701430uNR;
import X.C1713070ugD;
import X.C1741890vQh;
import X.C1745060vVo;
import X.C1748720vbi;
import X.C1749280vcc;
import X.C1749340vci;
import X.C1755030vlt;
import X.C1755050vlv;
import X.C1755140vm4;
import X.C1755150vm5;
import X.C1755360vmQ;
import X.C1755420vmW;
import X.C1755480vmc;
import X.C1755530vmh;
import X.C1755600vmo;
import X.C1756030vnV;
import X.C1756520voI;
import X.C1758040vqk;
import X.C1760500vui;
import X.C1764030w0P;
import X.C1766860w4y;
import X.C19719512Dh;
import X.C19719612Di;
import X.C19719912Dl;
import X.C19EG;
import X.C1AQS;
import X.C1DFH;
import X.C20466080a;
import X.C2107308Nj;
import X.C2130208We;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C23250099c;
import X.C2371409Qy;
import X.C289730BXf;
import X.C300330Bpv;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C687700QyG;
import X.C703502or;
import X.C732802ta;
import X.C785860UsC;
import X.C786410Ut5;
import X.C7879035x;
import X.C814420VxA;
import X.C838410Wul;
import X.C958103op;
import X.C959603p4;
import X.C960203pA;
import X.C987903td;
import X.EnumC1755520vmg;
import X.EnumC1756020vnU;
import X.ExecutorC10416045m;
import X.InterfaceC1146704e9;
import X.InterfaceC1164530gPT;
import X.InterfaceC1338440kvy;
import X.InterfaceC1740480vOQ;
import X.InterfaceC1748810vbr;
import X.InterfaceC1755100vm0;
import X.InterfaceC1755330vmN;
import X.InterfaceC1755350vmP;
import X.InterfaceC1755490vmd;
import X.InterfaceC1755830vnB;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775940wJc;
import Y.ACListenerS105S0200000_1;
import Y.AsS35S0200000_26;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.register.CardRegisterProvider;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.goda.SeaGodaManagerV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpInflaterOptExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaOfficialShopProfileVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.IPdpTriggerService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS12S0000000_26;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.AwS488S0200000_26;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpBodyWidget extends JediBaseWidget implements InterfaceC1164530gPT, InterfaceC713360RyY, InterfaceC1755830vnB, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public static final int LLLIILIL;
    public final SeaPdpFragment LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(125));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 440));
    public LinearLayout LLJILJIL;
    public TuxIconView LLJILJILJ;
    public C1338430kvx LLJILLL;
    public FrameLayout LLJJ;
    public C959603p4 LLJJI;
    public final C01GW LLJJIII;
    public final float LLJJIJI;
    public final float LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public Map<String, Object> LLJJL;
    public C1755420vmW LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final Set<String> LLJLILLLLZIIL;
    public final BPEAHandler LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public final C01GW LLJZ;
    public C1749280vcc LLJZIJLIL;
    public C09AE LLL;
    public boolean LLLF;
    public final ViewTreeObserverOnGlobalLayoutListenerC1775940wJc LLLFF;
    public C1764030w0P LLLFFI;
    public volatile boolean LLLFZ;
    public volatile boolean LLLI;
    public final C01GW LLLII;
    public volatile CardRegisterProvider LLLIIII;
    public InterfaceC665370Q7z LLLIIIIL;
    public C0QSJ LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaPdpBodyWidget.class, "cardRegister", "getCardRegister()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/sea/container/register/CardRegisterProvider;", 0);
        C13LE.LIZ.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIILIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.aw6;
    }

    @Override // X.InterfaceC1755830vnB
    public final void LJJLIIIJJIZ() {
    }

    @Override // X.InterfaceC1755830vnB
    public final void R4() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SeaPdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        return arrayList;
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        View viewFindViewById;
        Context context;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        C1338430kvx c1338430kvx;
        C1338430kvx c1338430kvx2;
        AnonymousClass0317 anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin;
        C1749280vcc c1749280vcc;
        this.LLILLJJLI = false;
        View view = this.LLILZ;
        if (view != null && (context = view.getContext()) != null) {
            if (EcSeaPdpInflaterOptExperiment.LJ) {
                View view2 = this.LLILZ;
                if (view2 != null && (c1749280vcc = (C1749280vcc) view2.findViewById(R.id.w0t)) != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc, 8);
                }
            } else {
                LJIIJ();
            }
            View view3 = this.LLILZ;
            if (view3 != null && (c1338430kvx2 = (C1338430kvx) view3.findViewById(R.id.t0h)) != null) {
                c1338430kvx2.setItemAnimator(null);
                SeaPdpFragment seaPdpFragment = this.LLJ;
                Integer num = seaPdpFragment.LLJJIJIIJIL;
                C987903td c987903td = LJIIIZ().LLLJIL;
                CardRegisterProvider cardRegisterProviderLJI = this.LLLIIII;
                if (cardRegisterProviderLJI == null) {
                    synchronized (this) {
                        cardRegisterProviderLJI = this.LLLIIII;
                        if (cardRegisterProviderLJI == null) {
                            cardRegisterProviderLJI = LJI();
                            this.LLLIIII = cardRegisterProviderLJI;
                        }
                    }
                }
                C1755420vmW c1755420vmW = new C1755420vmW(seaPdpFragment, num, c987903td, cardRegisterProviderLJI, new C1755150vm5(this));
                c1755420vmW.setShowFooter(false);
                this.LLJJLIIIJLLLLLLLZ = c1755420vmW;
                c1338430kvx2.setAdapter(c1755420vmW);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.o9);
                ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
                scrollTopLinearLayoutManager.LL = dimensionPixelSize;
                c1338430kvx2.setLayoutManager(scrollTopLinearLayoutManager);
                final int iLIZ = C960203pA.LIZ(R.attr.ng, context);
                final int iLIZJ = (int) C12ES.LIZJ(0.5f, context);
                final float fLIZJ = C12ES.LIZJ(16.0f, context);
                c1338430kvx2.addItemDecoration(new C0DXR(iLIZ, iLIZJ, fLIZJ) { // from class: X.0cXr
                    public static final /* synthetic */ int LLILZ = 0;
                    public final int LL;
                    public final float LLILLJJLI;
                    public final Paint LLILLL;

                    {
                        this.LL = iLIZJ;
                        this.LLILLJJLI = fLIZJ;
                        Paint paint = new Paint();
                        this.LLILLL = paint;
                        paint.setColor(iLIZ);
                    }

                    @Override // X.C0DXR
                    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        Iterator it2 = new C1077420e8y(recyclerView, 19).iterator();
                        while (true) {
                            C1077410e8x c1077410e8x = (C1077410e8x) it2;
                            if (c1077410e8x.hasNext()) {
                                View view4 = (View) c1077410e8x.next();
                                if (view4.getTag(R.id.egk) != null) {
                                    int left = view4.getLeft();
                                    int right = view4.getRight();
                                    int bottom = view4.getBottom();
                                    int bottom2 = view4.getBottom() + this.LL;
                                    float f = this.LLILLJJLI;
                                    canvas.drawRect(left + f, bottom, right - f, bottom2, this.LLILLL);
                                }
                            } else {
                                return;
                            }
                        }
                    }

                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view4, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        C1015980cXs c1015980cXs;
                        Object c098200Yq;
                        Object tag = view4.getTag(R.id.eh2);
                        if (tag instanceof C1015980cXs) {
                            c1015980cXs = (C1015980cXs) tag;
                        } else {
                            c1015980cXs = null;
                        }
                        if (c1015980cXs != null) {
                            try {
                                if (c1015980cXs.LIZ.size() >= 4) {
                                    List<Integer> list = c1015980cXs.LIZ;
                                    rect.set(list.get(3).intValue(), list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue());
                                }
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                            if (thM5exceptionOrNullimpl != null) {
                                C1AF0.LJFF(thM5exceptionOrNullimpl, "PDPDividerItemDecoration getItemOffsets");
                                return;
                            }
                            return;
                        }
                        if (view4.getTag(R.id.egk) != null) {
                            rect.set(0, 0, 0, this.LL);
                        }
                    }
                });
                final int iGR2 = dimensionPixelSize + LJIIIZ().GR2();
                c1338430kvx2.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0vjw
                    public int LL;
                    public int LLILLJJLI;

                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIJ(RecyclerView recyclerView, int i) {
                        IPdpTriggerService iPdpTriggerService;
                        String str;
                        if (this.LL > C958103op.LJ) {
                            this.LLILLL.LJIIIZ().AR2("glide");
                            boolean zES2 = this.LLILLL.LJIIIZ().eS2();
                            int i2 = !this.LLILLL.LJIIIZ().fS2() ? 1 : 0;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("is_live", Integer.valueOf(zES2 ? 1 : 0));
                            linkedHashMap.put("mini_window_on", Integer.valueOf(i2));
                            C1054104Ah c1054104Ah = this.LLILLL.LJIIIZ().LLJLIL;
                            if (c1054104Ah != null) {
                                if (this.LL > this.LLILLJJLI) {
                                    str = "down";
                                } else {
                                    str = "up";
                                }
                                C1054104Ah.LJJIFFI(c1054104Ah, "fulltodetail", str, null, null, linkedHashMap, 12);
                            }
                            this.LLILLJJLI = this.LL;
                        }
                        if (i == 0) {
                            this.LLILLL.LJIIIZ().MS2(iGR2, recyclerView);
                            if (!recyclerView.canScrollVertically(-1)) {
                                new C1753830vjx(this.LLILLL.LJIIIZ().getProductId()).LIZIZ();
                                this.LL = 0;
                                SeaPdpViewModel seaPdpViewModelLJIIIZ = this.LLILLL.LJIIIZ();
                                int i3 = this.LL;
                                seaPdpViewModelLJIIIZ.getClass();
                                seaPdpViewModelLJIIIZ.setState(new AwS38S0001000_26(i3, 7));
                            }
                        } else {
                            if (i == 1) {
                            }
                            if (i != 1 && (iPdpTriggerService = (IPdpTriggerService) this.LLILLL.LLJJJ.getValue()) != null) {
                                iPdpTriggerService.qQ0();
                                return;
                            }
                        }
                        this.LLILLL.LJIIIZ().LLZLLIL = false;
                        if (i != 1) {
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
                    @Override // X.AbstractC1585810rMx
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJJIIZI(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
                        /*
                            Method dump skipped, instruction units count: 299
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1753820vjw.LJJIIZI(androidx.recyclerview.widget.RecyclerView, int, int):void");
                    }
                });
                final C1755360vmQ c1755360vmQ = (C1755360vmQ) this.LLJJJJJIL.getValue();
                InterfaceC1755350vmP interfaceC1755350vmP = new InterfaceC1755350vmP() { // from class: X.0vlV
                    @Override // X.InterfaceC1755350vmP
                    public final void LIZ() {
                        Type type;
                        Map<String, Object> map;
                        C1754810vlX c1754810vlX = new C1754810vlX(this.LIZ.LJIIIZ().getProductId());
                        c1754810vlX.LIZJ(EnumC1754800vlW.DRAG, null);
                        c1754810vlX.LIZIZ();
                        this.LIZ.LJIIIZ().LLLLJI.LLILLJJLI.LIZ(this.LIZ.LJIIIZ().TR2(), true);
                        C1073204Hq c1073204Hq = this.LIZ.LJIIIZ().LLLLLJLJLL;
                        if (c1073204Hq.LIZLLL == null) {
                            ProductPackStruct productPackStruct = c1073204Hq.LIZ.LLJIJIL;
                            c1073204Hq.LIZLLL = productPackStruct != null ? productPackStruct.review : null;
                        }
                        C09YH c09yh = this.LIZ.LJIIIZ().LLLLLLLLLL;
                        String str = c09yh.LIZIZ;
                        if (str == null || (c09yh.LIZJ instanceof C1623706Xj) || (c09yh.LIZJ instanceof C1623606Xi)) {
                            return;
                        }
                        c09yh.LIZIZ(C090P.START_SCROLL, null);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C259800zU c259800zU = new C259800zU();
                        C259800zU c259800zU2 = new C259800zU();
                        C259800zU c259800zU3 = new C259800zU();
                        HashMap mapLJIIJ = C1741890vQh.LJIIJ(str);
                        if (mapLJIIJ == null) {
                            mapLJIIJ = new LinkedHashMap();
                        } else {
                            String strPR2 = c09yh.LIZ.PR2();
                            if (strPR2 != null) {
                                try {
                                    Gson gsonLJFF = C1741890vQh.LJFF();
                                    C1120604Zw.LIZ.getClass();
                                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                                    if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                                        type = new TypeToken<HashMap<String, Object>>() { // from class: X.04YQ
                                        }.getType();
                                    } else {
                                        C13JX c13jx = KTypeProjection.LIZJ;
                                        C13JW c13jwLJII = C13LE.LJII(String.class);
                                        c13jx.getClass();
                                        type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class))));
                                    }
                                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strPR2, type);
                                    if (!(objFromJson instanceof HashMap)) {
                                        objFromJson = null;
                                    }
                                    HashMap map2 = (HashMap) objFromJson;
                                    if (map2 != null) {
                                        map2.put("source_previous_page", "pdp_creator_video");
                                        mapLJIIJ.put("entrance_info", C1741890vQh.LJIIIIZZ(map2));
                                    }
                                } catch (s e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                        if (mapLJIIJ.isEmpty()) {
                            C1AF0.LIZJ("sea pdp creator video video , request map is empty!");
                        }
                        c09yh.LIZJ = new C1623706Xj();
                        IPdpStarter.PdpEnterParam pdpEnterParam = c09yh.LIZ.LLIZ;
                        Object obj = (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null) ? null : map.get("source_page_type");
                        c09yh.LIZ.withState(new C09Y8(c09yh, mapLJIIJ, c259800zU, c259800zU2, c259800zU3, jCurrentTimeMillis, obj instanceof String ? (String) obj : null));
                    }

                    @Override // X.InterfaceC1755350vmP
                    public final void LIZIZ() {
                        C1754810vlX c1754810vlX = new C1754810vlX(this.LIZ.LJIIIZ().getProductId());
                        c1754810vlX.LIZJ(EnumC1754800vlW.STOP, null);
                        c1754810vlX.LIZIZ();
                        this.LIZ.LJIIIZ().LLLLJI.LLILLJJLI.LIZ(this.LIZ.LJIIIZ().TR2(), false);
                    }

                    @Override // X.InterfaceC1755350vmP
                    public final void LIZJ(boolean z) {
                        C1754810vlX c1754810vlX = new C1754810vlX(this.LIZ.LJIIIZ().getProductId());
                        c1754810vlX.LIZJ(EnumC1754800vlW.FLING, Boolean.valueOf(z));
                        c1754810vlX.LIZIZ();
                    }
                };
                c1755360vmQ.LIZIZ = c1338430kvx2;
                c1755360vmQ.LIZJ = interfaceC1755350vmP;
                c1338430kvx2.setMFlingListener(new AbstractC1338480kw2() { // from class: X.0vmC
                    @Override // X.AbstractC1338480kw2
                    public final boolean LIZ(int i, int i2) {
                        boolean z;
                        InterfaceC1755350vmP interfaceC1755350vmP2 = c1755360vmQ.LIZJ;
                        if (interfaceC1755350vmP2 != null) {
                            if (i2 >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            interfaceC1755350vmP2.LIZJ(z);
                        }
                        return false;
                    }
                });
                c1338430kvx2.addOnScrollListener(new AsS35S0200000_26(c1755360vmQ, c1338430kvx2, 4));
                C786410Ut5.x3(c1338430kvx2.getViewTreeObserver(), this.LLLFF);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = PerformanceOptDependencyService.createIPerformanceOptDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IPerformanceOptDependencyService.class.getName(), anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
                }
                ((IPerformanceOptDependencyService) anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin).createFpsMonitor("tiktokec_anchor_product_detail").LIZIZ(c1338430kvx2);
            }
            View view4 = this.LLILZ;
            if (view4 != null && (c1338430kvx = (C1338430kvx) view4.findViewById(R.id.t0h)) != null) {
                LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vjE
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((SeaPdpMainState) obj).getContentList();
                    }
                }, new AwS392S0200000_26(this, c1338430kvx, 88));
                LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vhW
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Integer.valueOf(((SeaPdpMainState) obj).getScrollOffset());
                    }
                }, new AwS367S0200000_1(this, new C013C(), 151));
                C11EA.LJIIIIZZ(this, LJIIIZ(), new C2217381BqS() { // from class: X.0vjs
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Float.valueOf(((SeaPdpMainState) obj).getBottomSheetSlideOffset());
                    }
                }, new C2217381BqS() { // from class: X.0vhX
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Integer.valueOf(((SeaPdpMainState) obj).getScrollOffset());
                    }
                }, new AwS488S0200000_26(this, c1338430kvx, 2));
                LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vjt
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Float.valueOf(((SeaPdpMainState) obj).getBottomSheetSlideOffset());
                    }
                }, new AwS605S0100000_26(this, 451));
                SeaPdpViewModel seaPdpViewModelLJIIIZ = LJIIIZ();
                AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 446);
                if (!((ArrayList) seaPdpViewModelLJIIIZ.LLJJ).contains(awS605S0100000_26)) {
                    ((ArrayList) seaPdpViewModelLJIIIZ.LLJJ).add(awS605S0100000_26);
                }
                C11EA.LJIIIIZZ(this, LJIIIZ(), new C2217381BqS() { // from class: X.0vhO
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Integer.valueOf(((SeaPdpMainState) obj).getLoadingStatus());
                    }
                }, new C2217381BqS() { // from class: X.0vmB
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((SeaPdpMainState) obj).getBlockInfo();
                    }
                }, new AwS675S0100000_26(this, 12));
                if (C289730BXf.LIZ()) {
                    LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vjC
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((SeaPdpMainState) obj).getSeaFocusTabActionNew();
                        }
                    }, new AwS605S0100000_26(this, 452));
                } else {
                    LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vjB
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((SeaPdpMainState) obj).getSeaFocusTabAction();
                        }
                    }, new AwS605S0100000_26(this, 450));
                }
                LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vmM
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((SeaPdpMainState) obj).getSlideToPaymentModule();
                    }
                }, new AwS605S0100000_26(this, 454));
                LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vmJ
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((SeaPdpMainState) obj).getFlashSaleState();
                    }
                }, new AwS605S0100000_26(this, 461));
                LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vmE
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((SeaPdpMainState) obj).getShowLoadingDialog());
                    }
                }, new AwS580S0100000_1(this, 366));
                LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vmF
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((SeaPdpMainState) obj).getSelectedTabName();
                    }
                }, new AwS605S0100000_26(this, 440));
                LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vmD
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((SeaPdpMainState) obj).getBottomFloatingState();
                    }
                }, new AwS605S0100000_26(this, 443));
                LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vmH
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((SeaPdpMainState) obj).getSeaEntranceBubble();
                    }
                }, new AwS580S0100000_1(this, 361));
                C1713070ugD.LIZ(this);
            }
            if (Build.VERSION.SDK_INT >= 34) {
                Object value = this.LLLII.getValue();
                if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null) {
                    C1745060vVo.LIZ(this).registerScreenCaptureCallback(C838410Wul.LIZJ(C1745060vVo.LIZ(this)), screenCaptureCallback);
                }
            }
        }
        View view5 = this.LLILZ;
        if (view5 != null) {
            this.LLJJ = (FrameLayout) view5.findViewById(R.id.cd9);
            this.LLJJI = (C959603p4) view5.findViewById(R.id.h7k);
            ((C1338430kvx) view5.findViewById(R.id.t0h)).setDownListener(new InterfaceC1338440kvy() { // from class: X.0vm9
                @Override // X.InterfaceC1338440kvy
                public final void LIZ() {
                    this.LIZ.LJIIIZ().LLLZL = true;
                }
            });
            CardView cardView = (CardView) view5.findViewById(R.id.y_0);
            if (cardView != null) {
                C786410Ut5.LLILLL(cardView, 8);
            }
            View view6 = this.LLILZ;
            if (view6 != null && (viewFindViewById = view6.findViewById(R.id.y_0)) != null) {
                C786410Ut5.I7(new ACListenerS105S0200000_1(this, view5, 6), viewFindViewById);
            }
            ((C1755480vmc) view5.findViewById(R.id.c8_)).setListener(new InterfaceC1755490vmd() { // from class: X.0vlC
                @Override // X.InterfaceC1755490vmd
                public final boolean LIZ() {
                    return this.LIZ.LJIIIZ().iS2();
                }

                @Override // X.InterfaceC1755490vmd
                public final void LIZIZ() {
                    String string;
                    ProductUnavailableInfo productUnavailableInfo;
                    if (this.LIZ.LLJJJIL) {
                        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ.LLJ);
                        ProductPackStruct productPackStruct = this.LIZ.LJIIIZ().LLJIJIL;
                        if (productPackStruct == null || (productUnavailableInfo = productPackStruct.productUnavailableInfo) == null || (string = productUnavailableInfo.text) == null || string.length() <= 0) {
                            string = C7879035x.LIZ().getString(2131845266);
                        }
                        c1389890mGx.LJIIJ(string);
                        c1389890mGx.LJIIJJI();
                        C1054104Ah c1054104Ah = this.LIZ.LJIIIZ().LLJLIL;
                        if (c1054104Ah != null) {
                            String strPR2 = this.LIZ.LJIIIZ().PR2();
                            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                            if (interfaceC1748810vbrLJJIZ != null) {
                                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new AnonymousClass0481(), new AwS45S2100000_26(c1054104Ah, strPR2, 15));
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1755490vmd
                public final void LIZJ() {
                    SeaPdpBodyWidget seaPdpBodyWidget = this.LIZ;
                    if (seaPdpBodyWidget.LLJJJIL) {
                        return;
                    }
                    SeaPdpViewModel seaPdpViewModelLJIIIZ2 = seaPdpBodyWidget.LJIIIZ();
                    C1745060vVo.LIZ(this.LIZ);
                    seaPdpViewModelLJIIIZ2.uR2(this.LIZ.LLJ, false);
                }

                @Override // X.InterfaceC1755490vmd
                public final void LJI() {
                    this.LIZ.LLJJJIL = true;
                }
            });
        }
        View view7 = this.LLJILJIL;
        if (view7 == null) {
            View view8 = this.LLILZ;
            View viewFindViewById2 = view8 != null ? view8.findViewById(R.id.id1) : null;
            this.LLJILJIL = (LinearLayout) viewFindViewById2;
            view7 = viewFindViewById2;
        }
        C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), view7);
        TuxIconView tuxIconViewLJIIIIZZ = LJIIIIZZ();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_to_top;
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1h, C1745060vVo.LIZ(this));
        tuxIconViewLJIIIIZZ.setTuxIcon(c419910GdJ);
        LJIIIIZZ().setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        LJIIIIZZ().setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        ViewGroup.LayoutParams layoutParams = LJIIIIZZ().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
            C786410Ut5.M6(LJIIIIZZ(), layoutParams);
        }
        AnonymousClass0378.LIZ().LIZLLL("ec_live_shop_widget_on_destroy", this);
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        String str;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        String str2;
        this.LLILLJJLI = true;
        C19719612Di.LJJIIJ(LJIIIZ().LLLLJI.LLILLJJLI.LIZ.LIZ, new AwS605S0100000_26((InterfaceC1755830vnB) this, 679), true);
        C1764030w0P c1764030w0P = this.LLLFFI;
        if (c1764030w0P != null) {
            c1764030w0P.LIZJ();
        }
        this.LLLFFI = null;
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        C19EG c19egLIZ = C1745060vVo.LIZ(this);
        c1755600vmo.getClass();
        if (!EcSeaPdpInflaterOptExperiment.LIZJ) {
            C01R7.LIZ.getClass();
            C1701430uNR.LIZLLL(c19egLIZ);
        }
        C1054104Ah c1054104Ah = LJIIIZ().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJII.clear();
        }
        ProductPackStruct productPackStruct = LJIIIZ().LLJIJIL;
        String str3 = "";
        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
            str = "";
        }
        C1760500vui.LIZ(str);
        LJIILIIL();
        C1713070ugD.LIZIZ(this);
        ((LinkedHashMap) C732802ta.LIZ).clear();
        ProductPackStruct productPackStruct2 = LJIIIZ().LLJIJIL;
        if (productPackStruct2 != null && (str2 = productPackStruct2.productId) != null) {
            str3 = str2;
        }
        boolean z = LJIIIZ().LLJI;
        IPdpStarter.PdpEnterParam pdpEnterParam = LJIIIZ().LLIZ;
        String str4 = pdpEnterParam != null ? pdpEnterParam.awemeId : null;
        IPdpStarter.PdpEnterParam pdpEnterParam2 = LJIIIZ().LLIZ;
        C1440005kM.LIZ(new C1034540d1o(4, str3, str4, pdpEnterParam2 != null ? pdpEnterParam2.clickFrom : null, Integer.valueOf(z ? 2 : 3)));
        C1755360vmQ c1755360vmQ = (C1755360vmQ) this.LLJJJJJIL.getValue();
        c1755360vmQ.LIZIZ = null;
        c1755360vmQ.LIZJ = null;
        AnonymousClass0378.LIZ().LIZJ("ec_live_shop_widget_on_destroy", this);
        C1755140vm4 c1755140vm4LR2 = LJIIIZ().LR2();
        c1755140vm4LR2.getClass();
        try {
            C785860UsC c785860UsC = c1755140vm4LR2.LJI;
            if (c785860UsC != null) {
                c785860UsC.cancel();
            }
            ((Timer) c1755140vm4LR2.LJFF.getValue()).cancel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            Object value = this.LLLII.getValue();
            if (!(value instanceof Activity.ScreenCaptureCallback) || (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) == null) {
                return;
            }
            C1745060vVo.LIZ(this).unregisterScreenCaptureCallback(screenCaptureCallback);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final CardRegisterProvider LJI() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLIIIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIIIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLIIIIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{SeaPdpFragmentScope.class});
            this.LLLIIIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        CardRegisterProvider cardRegisterProvider = (CardRegisterProvider) c0qsjLIZLLL.getAbility(CardRegisterProvider.class);
        C687700QyG.LJ(cardRegisterProvider, CardRegisterProvider.class);
        return cardRegisterProvider;
    }

    public final C1749280vcc LJII() {
        if (this.LLJZIJLIL == null) {
            LJIIJ();
            View view = this.LLILZ;
            this.LLJZIJLIL = view != null ? (C1749280vcc) view.findViewById(R.id.w0t) : null;
        }
        return this.LLJZIJLIL;
    }

    public final TuxIconView LJIIIIZZ() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.y_1) : null;
            this.LLJILJILJ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final SeaPdpViewModel LJIIIZ() {
        return (SeaPdpViewModel) this.LLJJIII.getValue();
    }

    public final void LJIILIIL() {
        View viewFindViewById;
        ViewTreeObserver viewTreeObserver;
        View view = this.LLILZ;
        if (view == null || (viewFindViewById = view.findViewById(R.id.t0h)) == null || (viewTreeObserver = viewFindViewById.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = this.LLLFF;
        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ() {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget.LJIJ():void");
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1558360qeg.LJFF(this.LLJ, null);
    }

    @Override // com.bytedance.widget.Widget
    public final void onPause() {
        C1764030w0P c1764030w0P = this.LLLFFI;
        if (c1764030w0P != null) {
            C1764030w0P.LJ(c1764030w0P, false, false, 3);
        }
        LJIJ();
    }

    @Override // com.bytedance.widget.Widget
    public final void onResume() {
        C1764030w0P c1764030w0P;
        Type type;
        C1755050vlv c1755050vlv = new C1755050vlv(LJIIIZ().getProductId());
        c1755050vlv.LIZ.put("enter_from_merge", LJIIIZ().OR2());
        c1755050vlv.LIZIZ();
        LJIIIZ().LLZIL.LIZJ(this.LLJ, LJIIIZ(), LJIIIZ().getProductId());
        C1766860w4y.LIZ.getClass();
        String strLIZIZ = C1766860w4y.LIZIZ("search_query_data");
        Map<String, Object> map = null;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                type = new TypeToken<Map<String, Object>>() { // from class: X.0vm7
                }.getType();
            } else {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class)))));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLIZIZ, type);
            if (!C19719512Dh.LJII(objFromJson)) {
                objFromJson = null;
            }
            map = (Map) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJJL = map;
        C1755140vm4 c1755140vm4LR2 = LJIIIZ().LR2();
        c1755140vm4LR2.LIZJ = 0L;
        ((Set) c1755140vm4LR2.LIZLLL.getValue()).clear();
        ((Set) c1755140vm4LR2.LIZLLL.getValue()).addAll(c1755140vm4LR2.LIZJ());
        if (!c1755140vm4LR2.LIZJ().isEmpty()) {
            try {
                c1755140vm4LR2.LJI = new C785860UsC(c1755140vm4LR2, 4);
                ((Timer) c1755140vm4LR2.LJFF.getValue()).schedule(c1755140vm4LR2.LJI, 0L, 1000L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LJIIIZ().hR2(new C2217381BqS() { // from class: X.0vmG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getLynxAirItemName();
            }
        }, new AwS605S0100000_26(this, 441));
        if (this.LLLFZ && this.LLLI && (c1764030w0P = this.LLLFFI) != null) {
            c1764030w0P.LIZLLL();
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void onStop() {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        C1764030w0P c1764030w0P = this.LLLFFI;
        if (c1764030w0P != null) {
            C1764030w0P.LJ(c1764030w0P, false, false, 3);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        if (((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround()) {
            C1054104Ah c1054104Ah = LJIIIZ().LLJLIL;
            if (c1054104Ah != null) {
                c1054104Ah.LJJIFFI = "close";
            }
            C1755530vmh c1755530vmh = new C1755530vmh(LJIIIZ().getProductId());
            c1755530vmh.LIZJ(this.LLJ.SR());
            EnumC1755520vmg enumC1755520vmg = EnumC1755520vmg.CLOSE;
            c1755530vmh.LIZLLL(enumC1755520vmg);
            c1755530vmh.LIZIZ();
            C1054104Ah c1054104Ah2 = LJIIIZ().LLJLIL;
            if (c1054104Ah2 != null) {
                c1054104Ah2.LJJIIZ(enumC1755520vmg);
            }
        }
        C1054104Ah c1054104Ah3 = LJIIIZ().LLJLIL;
        final long jElapsedRealtime2 = 0;
        if (c1054104Ah3 != null) {
            long j = c1054104Ah3.LJ;
            if (j != 0) {
                jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
            }
        }
        C785860UsC c785860UsC = LJIIIZ().LR2().LJI;
        if (c785860UsC != null) {
            c785860UsC.cancel();
        }
        ExecutorC10416045m.LLILLJJLI.execute(new Runnable() { // from class: X.04A4
            /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[PHI: r2
              0x001e: PHI (r2v27 com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO) = 
              (r2v1 com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO)
              (r2v28 com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO)
             binds: [B:9:0x001c, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:131:0x0367  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x0372 A[PHI: r20
              0x0372: PHI (r20v1 java.lang.Float) = (r20v0 java.lang.Float), (r20v3 java.lang.Float) binds: [B:134:0x036e, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 886
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C04A4.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SeaPdpBodyWidget@e6ac.onStop$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SeaPdpBodyWidget@e6ac.onStop$1");
            }
        });
    }

    public final void LJIIJ() {
        C1749280vcc c1749280vcc;
        ImageView imageView;
        Context context;
        Integer numLIZJ;
        View viewFindViewById;
        View view;
        View viewFindViewById2;
        if (!LJIIIZ().LLIZLLLIL && (view = this.LLILZ) != null && (viewFindViewById2 = view.findViewById(R.id.w0t)) != null) {
            C426750GoL.LJIIL(viewFindViewById2, null, null, null, Integer.valueOf((int) this.LLJJIJI), 23);
        }
        View view2 = this.LLILZ;
        if (view2 == null || (c1749280vcc = (C1749280vcc) view2.findViewById(R.id.w0t)) == null) {
            return;
        }
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context2 = c1749280vcc.getContext();
        c1755600vmo.getClass();
        c1749280vcc.LIZIZ(C1755600vmo.LIZ(R.layout.aw7, context2, c1749280vcc, false, true));
        View view3 = this.LLILZ;
        if (view3 != null && (context = view3.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            View view4 = this.LLILZ;
            if (view4 != null && (viewFindViewById = view4.findViewById(R.id.ver)) != null) {
                viewFindViewById.setBackgroundColor(iIntValue);
            }
        }
        View view5 = this.LLILZ;
        if (view5 != null && (imageView = (ImageView) view5.findViewById(R.id.ves)) != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        C786410Ut5.I7(new AjS12S0000000_26(3), c1749280vcc);
    }

    @Override // com.bytedance.widget.Widget
    public final void onStart() {
        C1054104Ah c1054104Ah = LJIIIZ().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJ = SystemClock.elapsedRealtime();
            c1054104Ah.LJFF = System.currentTimeMillis();
        }
        LJIJ();
        this.LLJLIL = false;
    }

    public SeaPdpBodyWidget(SeaPdpFragment seaPdpFragment) {
        this.LLJ = seaPdpFragment;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJIII = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 9));
        this.LLJJIJI = C958103op.LIZJ() - C958103op.LJ();
        this.LLJJIJIIJIL = C12ES.LIZJ(44.0f, C7879035x.LIZ());
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 439));
        this.LLJJJIL = true;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 438));
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(124));
        this.LLJLILLLLZIIL = new LinkedHashSet();
        this.LLJLL = new BPEAHandler(Looper.getMainLooper());
        this.LLJLLL = true;
        this.LLJZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 437));
        this.LLLF = true;
        this.LLLFF = new ViewTreeObserverOnGlobalLayoutListenerC1775940wJc(this, 2);
        this.LLLI = true;
        this.LLLII = C452501pT.LIZIZ(new C04I6(this));
    }

    @Override // X.InterfaceC1755830vnB
    public final void F0(boolean z) {
        this.LLLI = z;
        if (this.LLLFZ) {
            if (!z) {
                C1764030w0P c1764030w0P = this.LLLFFI;
                if (c1764030w0P != null) {
                    C1764030w0P.LJ(c1764030w0P, true, false, 2);
                    return;
                }
                return;
            }
            C1764030w0P c1764030w0P2 = this.LLLFFI;
            if (c1764030w0P2 == null) {
                return;
            }
            c1764030w0P2.LIZLLL();
        }
    }

    public final void LJIIJJI(int i) {
        C04FG c04fg;
        C04CV c04cv;
        IPdpTriggerService iPdpTriggerService;
        SeaGodaManagerV2 seaGodaManagerV2 = LJIIIZ().LLZLI;
        if (seaGodaManagerV2 != null && (c04fg = seaGodaManagerV2.LLILZIL) != null && (c04cv = c04fg.LJFF) != null && !c04cv.LIZ() && (iPdpTriggerService = (IPdpTriggerService) this.LLJJJ.getValue()) != null) {
            iPdpTriggerService.GA0(i);
        }
    }

    public final void LJIIL(boolean z) {
        C1764030w0P c1764030w0P;
        if (z) {
            if (this.LLLFZ && this.LLLI && (c1764030w0P = this.LLLFFI) != null) {
                c1764030w0P.LIZLLL();
                return;
            }
            return;
        }
        C1764030w0P c1764030w0P2 = this.LLLFFI;
        if (c1764030w0P2 == null) {
            return;
        }
        C1764030w0P.LJ(c1764030w0P2, false, false, 3);
    }

    public final void LJIILL(RecyclerView recyclerView) {
        ProductPackStruct productPackStruct;
        ProductPackStruct productPackStruct2;
        Integer num;
        int i;
        C1755030vlt c1755030vlt;
        int height;
        int i2;
        ProductPackStruct productPackStruct3;
        ProductUnavailableInfo productUnavailableInfo;
        String str;
        Resources resources = recyclerView.getContext().getResources();
        SeaPdpViewModel seaPdpViewModelLJIIIZ = LJIIIZ();
        seaPdpViewModelLJIIIZ.getClass();
        if (!C300330Bpv.LIZ() ? !(((productPackStruct = seaPdpViewModelLJIIIZ.LLJIJIL) == null || (num = productPackStruct.status) == null || num.intValue() != 1) && (productPackStruct2 = seaPdpViewModelLJIIIZ.LLJIJIL) != null && productPackStruct2.unavailableInfo != null) : !((productPackStruct3 = seaPdpViewModelLJIIIZ.LLJIJIL) != null && (productUnavailableInfo = productPackStruct3.unavailableInfo) != null && (str = productUnavailableInfo.text) != null && !a0.LJJJIL(str))) {
            i = R.dimen.o3;
        } else {
            i = R.dimen.o4;
        }
        float dimension = resources.getDimension(i);
        int[] iArr = new int[2];
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition == null) {
                return;
            }
            Object tag = viewFindViewByPosition.getTag(R.id.ei0);
            if ((tag instanceof C1755030vlt) && (c1755030vlt = (C1755030vlt) tag) != null) {
                viewFindViewByPosition.getLocationInWindow(iArr);
                int i3 = iArr[1];
                View view = this.LLILZ;
                if (view != null) {
                    height = view.getHeight();
                } else {
                    height = 0;
                }
                int i4 = (int) (height - dimension);
                if (1 <= i3 && i3 < i4) {
                    if (!c1755030vlt.LIZIZ) {
                        c1755030vlt.LIZIZ = true;
                        Object obj = c1755030vlt.LIZ;
                        if (obj instanceof C04GW) {
                            C1054104Ah c1054104Ah = LJIIIZ().LLJLIL;
                            if (c1054104Ah != null) {
                                C04GW c04gw = (C04GW) c1755030vlt.LIZ;
                                if (!c1054104Ah.LJJJIL) {
                                    c1054104Ah.LJJJIL = true;
                                    InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                                    if (interfaceC1748810vbrLJJIZ != null) {
                                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10515049h(), new AwS367S0200000_1(c1054104Ah, c04gw, 203));
                                    }
                                }
                            }
                        } else if (obj instanceof C1056204Bc) {
                            C1054104Ah c1054104Ah2 = LJIIIZ().LLJLIL;
                            if (c1054104Ah2 != null) {
                                C1056204Bc c1056204Bc = (C1056204Bc) c1755030vlt.LIZ;
                                if (!c1054104Ah2.LJJJJ) {
                                    c1054104Ah2.LJJJJ = true;
                                    InterfaceC1748810vbr interfaceC1748810vbrLJJIZ2 = c1054104Ah2.LJJIZ();
                                    if (interfaceC1748810vbrLJJIZ2 != null) {
                                        C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ2, new C10515049h(), new AwS367S0200000_1(c1054104Ah2, c1056204Bc, 202));
                                    }
                                }
                            }
                        } else if ((obj instanceof C1406730mi7) && Intrinsics.LJFF(((C1406730mi7) obj).LLILLJJLI, "title")) {
                            if (i3 < i4 / 2) {
                                c1755030vlt.LIZIZ = true;
                            }
                        } else if (obj instanceof C703502or) {
                            if (LJIIIZ().LLJLIL != null) {
                                new AwS402S0200000_1(this, obj, 28).invoke();
                            }
                        } else if (obj instanceof SeaOfficialShopProfileVO) {
                            if (LJIIIZ().LLJLIL != null) {
                                new AwS402S0200000_1(this, obj, 29).invoke();
                            }
                        } else if (obj instanceof RankInfo) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            RankInfo rankInfo = (RankInfo) obj;
                            String str2 = rankInfo.tpp;
                            if (str2 != null && !a0.LJJJIL(str2)) {
                                linkedHashMap.put("ranking_name", str2);
                            }
                            String str3 = rankInfo.rankId;
                            if (str3 != null) {
                                linkedHashMap.put("ranking_id", str3);
                            }
                            Integer num2 = rankInfo.rankLevelNum;
                            if (num2 != null) {
                                linkedHashMap.put("ranking_num", Integer.valueOf(num2.intValue()));
                            }
                            String str4 = rankInfo.schema;
                            if (str4 != null && !a0.LJJJIL(str4)) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            linkedHashMap.put("is_clickable", Integer.valueOf(i2 ^ 1));
                            C1054104Ah c1054104Ah3 = LJIIIZ().LLJLIL;
                            if (c1054104Ah3 != null) {
                                c1054104Ah3.LJJIII("product_ranking", false, null, null, linkedHashMap, null, null, null);
                            }
                        } else {
                            Object obj2 = c1755030vlt.LIZ;
                            if (!(obj2 instanceof C04IE) && !(obj2 instanceof ReviewItemStruct)) {
                                if (obj2 instanceof C04IH) {
                                    if (LJIIIZ().LLJLIL != null) {
                                        new AwS545S0100000_1(this, 1368).invoke();
                                    }
                                } else if ((obj2 instanceof InterfaceC1755100vm0) && LJIIIZ().LLJLIL != null) {
                                    new AwS427S0200000_26(this, c1755030vlt, 25).invoke();
                                }
                            } else if (LJIIIZ().LLJLIL != null) {
                                new AwS402S0200000_1(this, c1755030vlt, 30).invoke();
                            }
                        }
                    }
                } else if (c1755030vlt.LIZIZ) {
                    c1755030vlt.LIZIZ = false;
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    public final void LJIILLIIL(List<? extends Object> list) {
        Object next;
        Image image;
        boolean z;
        String str;
        C1758040vqk c1758040vqkLIZ;
        String uri;
        List<Image> images;
        if (!LJIIIZ().LLLFF) {
            Iterator<? extends Object> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof InterfaceC1755330vmN) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1755330vmN interfaceC1755330vmN = (InterfaceC1755330vmN) next;
            if (interfaceC1755330vmN != null && (images = interfaceC1755330vmN.getImages()) != null) {
                image = (Image) C13LP.LJJJLL(images);
            } else {
                image = null;
            }
            ArrayList arrayList = new ArrayList();
            if (image != null && (uri = image.getUri()) != null) {
                arrayList.add(uri);
            }
            SeaPdpFragment seaPdpFragment = this.LLJ;
            if ((seaPdpFragment instanceof InterfaceC1740480vOQ) && seaPdpFragment != null) {
                C1756030vnV.LIZIZ(seaPdpFragment, arrayList, LJIIIZ().LLLLIILLL, null, 4);
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = LJIIIZ().LLIZ;
            if (pdpEnterParam != null && (str = pdpEnterParam.trackId) != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
                c1758040vqkLIZ.LJFF("t_meaningful_rendered_trigger", true);
            }
            if (!this.LLJJJJLIIL) {
                C2130208We c2130208WeLIZ = C20466080a.LIZ();
                String productId = LJIIIZ().getProductId();
                if (LJIIIZ().LLLLIILLL != EnumC1756020vnU.PREFETCH_FULL && LJIIIZ().LLLLIILLL != EnumC1756020vnU.PREFETCH_PART && LJIIIZ().LLLLIILLL != EnumC1756020vnU.LAST_USED_CACHE) {
                    z = false;
                } else {
                    z = true;
                }
                c2130208WeLIZ.getClass();
                C2130208We.LIZJ(productId, z);
            }
            C09AE c09aeLIZLLL = this.LLL;
            if (c09aeLIZLLL == null) {
                InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(LJIIIZ());
                C1DFH c1dfh = C0PEM.LIZ;
                c09aeLIZLLL = C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1749340vci(this, null), 2);
            }
            this.LLL = c09aeLIZLLL;
            this.LLJJJJLIIL = true;
        }
    }

    public final void LJIIZILJ(C1756520voI c1756520voI) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayout = this.LLJJ;
        if (frameLayout != null) {
            int i = 0;
            if (frameLayout.getVisibility() == 0 && 1 != 0) {
                int iIntValue = LLLIILIL;
                Integer num = c1756520voI.LIZIZ;
                if (num != null) {
                    iIntValue += num.intValue();
                }
                Integer num2 = c1756520voI.LIZ;
                if (num2 != null) {
                    iIntValue += num2.intValue();
                }
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i = marginLayoutParams.bottomMargin;
                }
                if (i != iIntValue) {
                    C0H9H.LIZJ(iIntValue, frameLayout);
                }
            }
        }
    }

    @C14EU
    public final void onRefreshPdp(C037C c037c) {
        String str;
        String str2 = c037c.LIZ;
        ProductPackStruct productPackStruct = LJIIIZ().LLJIJIL;
        if (productPackStruct != null) {
            str = productPackStruct.productId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            SeaPdpViewModel.vS2(LJIIIZ(), false, true, null, false, false, 252);
        }
    }

    public final void LJIILJJIL(int i, Boolean bool) {
        View view;
        RecyclerView recyclerView;
        if (i >= 0 && (view = this.LLILZ) != null && (recyclerView = (RecyclerView) view.findViewById(R.id.t0h)) != null) {
            C03NI c03ni = new C03NI(recyclerView.getContext(), false, Intrinsics.LJFF(bool, Boolean.TRUE), null, 10);
            c03ni.LIZ = i;
            if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                    layoutManager.scrollToPosition(i);
                    return;
                }
                return;
            }
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            if (!(layoutManager2 instanceof LinearLayoutManager) || layoutManager2 == null) {
                return;
            }
            layoutManager2.startSmoothScroll(c03ni);
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        Map<String, Object> map;
        if (Intrinsics.LJFF(str, "ec_live_shop_widget_on_destroy")) {
            Boolean bool = null;
            try {
                Object obj2 = new JSONObject(str2).get("room_id");
                if (obj2 != null) {
                    IPdpStarter.PdpEnterParam pdpEnterParam = LJIIIZ().LLIZ;
                    if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                        obj = map.get("lineup_room_id");
                    } else {
                        obj = null;
                    }
                    if (Intrinsics.LJFF(obj2, obj)) {
                        bool = Boolean.TRUE;
                    }
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                SeaPdpViewModel seaPdpViewModelLJIIIZ = LJIIIZ();
                C1745060vVo.LIZ(this);
                seaPdpViewModelLJIIIZ.uR2(this.LLJ, false);
            }
        }
    }
}
