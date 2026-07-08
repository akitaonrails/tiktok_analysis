package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AnonymousClass0801;
import X.C01GW;
import X.C0MGD;
import X.C0MGE;
import X.C0QTN;
import X.C0WZX;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C1443030nef;
import X.C14EU;
import X.C1630980sXo;
import X.C1648640t0I;
import X.C1648660t0K;
import X.C1649060t0y;
import X.C1655390tBB;
import X.C1655440tBG;
import X.C1656650tDD;
import X.C1701330uNH;
import X.C19221910Hx;
import X.C19286810cs;
import X.C19A3;
import X.C19IH;
import X.C2204961BRm;
import X.C2487409ou;
import X.C452501pT;
import X.C569770MWh;
import X.C960203pA;
import X.InterfaceC1452540nu0;
import X.InterfaceC1648600t0E;
import X.InterfaceC1649070t0z;
import X.InterfaceC1649080t10;
import X.InterfaceC1650070t2b;
import X.InterfaceC1650230t2r;
import X.InterfaceC1655330tB5;
import X.InterfaceC1655340tB6;
import X.InterfaceC1655620tBY;
import X.InterfaceC1655690tBf;
import X.InterfaceC1655700tBg;
import X.InterfaceC1655990tC9;
import X.InterfaceC1674890tgd;
import X.InterfaceC1888407aU;
import X.InterfaceC362610EJn;
import X.InterfaceC376620Epg;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC530790Krl;
import X.InterfaceC535600KzW;
import X.InterfaceC577370Mkh;
import Y.ARunnableS125S0100000_25;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS569S0100000_25;
import lth.o;
import nv7.c0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes26.dex */
public abstract class TikTokCameraBaseGroupScene extends RecordSessionScene implements InterfaceC524950KiL, InterfaceC1648600t0E, InterfaceC577370Mkh, InterfaceC1649070t0z, InterfaceC1655990tC9, InterfaceC1649080t10, C0MGE, InterfaceC1650070t2b, InterfaceC535600KzW, InterfaceC530790Krl, C0MGD, InterfaceC1452540nu0 {
    public static final /* synthetic */ int LLJZ = 0;
    public final C1655440tBG LLJJLIIIJLLLLLLLZ;
    public final List<InterfaceC362610EJn> LLJL;
    public final List<InterfaceC484050IyZ> LLJLIL;
    public final List<InterfaceC1655330tB5> LLJLILLLLZIIL;
    public final List<InterfaceC1655340tB6> LLJLL;
    public final C01GW LLJLLIL;
    public final C19IH LLJLLL;

    public TikTokCameraBaseGroupScene() {
        this(0);
    }

    @Override // X.InterfaceC577370Mkh
    public final void LJIIZILJ(InterfaceC1655690tBf interfaceC1655690tBf) {
        this.LLJJLIIIJLLLLLLLZ.LJIIZILJ(interfaceC1655690tBf);
    }

    @Override // X.InterfaceC577370Mkh
    public final void LJIJ(InterfaceC1655700tBg interfaceC1655700tBg) {
        this.LLJJLIIIJLLLLLLLZ.LJIJ(interfaceC1655700tBg);
    }

    @Override // X.InterfaceC1655990tC9
    public final void LJIJI(InterfaceC1655620tBY interfaceC1655620tBY) {
        this.LLJJLIIIJLLLLLLLZ.LJIJI(interfaceC1655620tBY);
    }

    @Override // X.InterfaceC1649080t10
    public final void LJJJZ(C1649060t0y c1649060t0y) {
        this.LLJJLIIIJLLLLLLLZ.LJJJZ(c1649060t0y);
    }

    @Override // X.InterfaceC1649070t0z
    public final void LJJLIL(InterfaceC1888407aU interfaceC1888407aU) {
        this.LLJJLIIIJLLLLLLLZ.LJJLIL(interfaceC1888407aU);
    }

    @Override // X.InterfaceC577370Mkh
    public final void LJLJJL(InterfaceC1655690tBf interfaceC1655690tBf) {
        this.LLJJLIIIJLLLLLLLZ.LJLJJL(interfaceC1655690tBf);
    }

    @Override // X.InterfaceC1655990tC9
    public final void LJLLL(InterfaceC1655620tBY interfaceC1655620tBY) {
        this.LLJJLIIIJLLLLLLLZ.LJLLL(interfaceC1655620tBY);
    }

    @Override // X.InterfaceC1649080t10
    public final void LJLLLLLL(C1649060t0y c1649060t0y) {
        this.LLJJLIIIJLLLLLLLZ.LJLLLLLL(c1649060t0y);
    }

    @Override // X.InterfaceC577370Mkh
    public final void LLI(InterfaceC1655700tBg interfaceC1655700tBg) {
        this.LLJJLIIIJLLLLLLLZ.LLI(interfaceC1655700tBg);
    }

    @Override // X.InterfaceC1649070t0z
    public final void LLJJ(InterfaceC1888407aU interfaceC1888407aU) {
        this.LLJJLIIIJLLLLLLLZ.LLJJ(interfaceC1888407aU);
    }

    @Override // X.AbstractC214814194y
    public final boolean LLLLIILL() {
        return true;
    }

    public abstract void LLLLLLJ(MvChoosePhotoScene mvChoosePhotoScene);

    public abstract void LLLLLLL();

    public abstract InterfaceC1650230t2r LLLLLLLLL();

    public abstract NavigationScene LLLLLLLLLL();

    public C19A3 LLLLLLLZIL() {
        return null;
    }

    public abstract x2 LLLLLLZ();

    public abstract ShortVideoContext LLLLLLZZ();

    public abstract void LLLLLZ(boolean z, boolean z2);

    public abstract void LLLLLZL();

    @Override // X.InterfaceC1650070t2b
    public String getTag() {
        return "VideoRecordNewActivity";
    }

    public abstract void onEvent(AnonymousClass0801 anonymousClass0801);

    public abstract void receiveToast(C1630980sXo c1630980sXo);

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final C1202330hOR LLLLJI() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LJII;
    }

    public final void LLLLLL() {
        ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
        if (iCreativeSAAService != null) {
            iCreativeSAAService.invokeMethodsSafely(requireActivity(), new AwS569S0100000_25(this, 316));
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(requireActivity(), "aweme://main");
        smartRouteBuildRoute.addFlags(268468224);
        smartRouteBuildRoute.open();
    }

    public final void LLLLLLIL() {
        Activity activity = this.mActivity;
        setTheme((activity == null || !C960203pA.LIZIZ(activity)) ? R.style.xm : R.style.y0);
        C19IH c19ih = this.LLJLLL;
        Bundle bundle = this.mArguments;
        c19ih.LIZJ = bundle != null ? bundle.getString("enter_from") : null;
        this.LLJLLL.LIZIZ("video_record_activity_create");
    }

    @Override // X.InterfaceC530790Krl
    public final C0QTN getInflater() {
        return (C0QTN) this.LLJLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public void nm() {
        this.LLJJLIIIJLLLLLLLZ.LIZJ();
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        return this.LLJJLIIIJLLLLLLLZ.LIZ(LLLLLLLLLL());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, X.AbstractC214814194y, X.C198H
    public final void finish() throws Throwable {
        String string;
        MicroAppModel microAppModel;
        Bundle argumentsSafely = getArgumentsSafely();
        if (argumentsSafely == null || (string = argumentsSafely.getString("backurl")) == null) {
            string = "";
        }
        if ((argumentsSafely != null ? argumentsSafely.getSerializable("micro_app_info") : null) != null) {
            Serializable serializable = argumentsSafely != null ? argumentsSafely.getSerializable("micro_app_info") : null;
            if ((serializable instanceof MicroAppModel) && (microAppModel = (MicroAppModel) serializable) != null) {
                ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getMiniAppService();
                C19286810cs.LIZ(microAppModel.appId);
            }
        }
        super.finish();
        if (LLLLLLZ() != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                LLLLLLL();
            } else {
                C2487409ou.LIZJ(new ARunnableS125S0100000_25(this, 39));
            }
        }
        if (!TextUtils.isEmpty(string) && ((argumentsSafely == null || argumentsSafely.getSerializable("micro_app_info") == null) && !TextUtils.isEmpty(string) && !TextUtils.equals("__BACKURL__", string))) {
            try {
                Uri uri = UriProtector.parse(string);
                Intent intent = new Intent();
                intent.setData(uri);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
                Activity activity = this.mActivity;
                if (activity != null) {
                    C2204961BRm.LJIJI(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLvYUWPfXz9KmhzwPULOPQyDsKvMoxoVqQNWY=", null));
                    activity.moveTaskToBack(true);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1443030nef.LJII().LJIIIZ();
    }

    @Override // X.AbstractC214814194y
    public int getFinishAnimationType() {
        return C1655390tBB.LIZ(getArgumentsSafely(), LLLLLLZZ());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        C1656650tDD.LIZJ("record");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onResume() {
        super.onResume();
        C1656650tDD.LIZLLL("record");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionScene, com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final InterfaceC1674890tgd LLLLLILLIL() {
        return c0.LIZ;
    }

    public TikTokCameraBaseGroupScene(int i) {
        this.LLJJLIIIJLLLLLLLZ = new C1655440tBG();
        this.LLJL = new ArrayList();
        this.LLJLIL = new ArrayList();
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLL = new ArrayList();
        this.LLJLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 346));
        this.LLJLLL = new C19IH();
        LLLLJ(AFwS278S0000000_32.get$arr$(96));
    }

    @Override // X.InterfaceC524950KiL
    public void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJL, 0, interfaceC362610EJn);
    }

    @Override // X.InterfaceC1648600t0E
    public void LJJIJIL(C1648660t0K c1648660t0K) {
        ((ArrayList) this.LLJLILLLLZIIL).remove(c1648660t0K);
    }

    @Override // X.InterfaceC1648600t0E
    public void LJJLIIIJILLIZJL(C1648640t0I c1648640t0I) {
        ((ArrayList) this.LLJLL).add(c1648640t0I);
    }

    @Override // X.InterfaceC1648600t0E
    public void LLD(C1648640t0I c1648640t0I) {
        ((ArrayList) this.LLJLL).remove(c1648640t0I);
    }

    @Override // X.InterfaceC1648600t0E
    public void LLFII(C1648660t0K c1648660t0K) {
        ((ArrayList) this.LLJLILLLLZIIL).add(c1648660t0K);
    }

    @Override // X.InterfaceC524950KiL
    public void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJLIL).add(interfaceC484050IyZ);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public void S3(boolean z) {
        this.LLJJLIIIJLLLLLLLZ.LIZIZ(z);
    }

    @Override // X.InterfaceC524950KiL
    public void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJLIL).remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public void b8(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJL).remove(interfaceC362610EJn);
    }

    @Override // X.AbstractC214814194y
    public void dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ.LL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1655700tBg) it2.next()).dispatchTouchEvent(motionEvent);
        }
    }

    @Override // X.InterfaceC524950KiL
    public void kF(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJL).add(interfaceC362610EJn);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        C569770MWh.LIZLLL(getStartAnimationType(), requireActivity());
        super.onActivityCreated(bundle);
        C1656650tDD.LIZIZ("record");
    }

    @Override // X.AbstractC214814194y, X.AnonymousClass1995
    public void onConfigurationChanged(Configuration configuration) {
        Iterator it2 = ((ArrayList) this.LLJJLIIIJLLLLLLLZ.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1655690tBf) it2.next()).onConfigurationChanged(configuration);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveEvent(AnonymousClass0801 anonymousClass0801) {
        onEvent(anonymousClass0801);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public void p2(boolean z) {
        this.LLJJLIIIJLLLLLLLZ.LIZLLL(z);
    }

    @C14EU(sticky = true)
    public final void onReceiveEvent(C1630980sXo c1630980sXo) {
        receiveToast(c1630980sXo);
    }

    @Override // X.AbstractC214814194y
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLJL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC362610EJn) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i == 4 && onBackPressed()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AbstractC214814194y
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1655330tB5) it2.next()).onKeyLongPress(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // X.AbstractC214814194y
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLJLL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1655340tB6) it2.next()).onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // X.AbstractC214814194y
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            ShortVideoContext shortVideoContextLLLLLLZZ = LLLLLLZZ();
            if (shortVideoContextLLLLLLZZ != null && shortVideoContextLLLLLLZZ.microAppModel != null) {
                z = true;
            } else {
                z = false;
            }
            if (intent != null) {
                try {
                    if (intent.getExtras() != null && !z) {
                        Intent intent2 = new Intent();
                        Activity activityRequireActivity = requireActivity();
                        InterfaceC376620Epg interfaceC376620Epg = o.LIZJ;
                        intent2.setClass(activityRequireActivity, C19221910Hx.LIZJ());
                        intent2.addFlags(67108864);
                        try {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                intent2.putExtras(extras);
                                Activity activityRequireActivity2 = requireActivity();
                                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityRequireActivity2, intent2, "Context_startActivity_1");
                                C1701330uNH.LIZ(intent2, activityRequireActivity2);
                                C2204961BRm.LJIILLIIL(activityRequireActivity2, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLvYUWPfXz9KmhzwPULOPQyDsKvMoxoVqQNWY=", null));
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            finish();
        }
    }

    @Override // X.AbstractC214814194y
    public boolean onInterceptActivityResult(int i, int i2, Intent intent) {
        Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }
}
