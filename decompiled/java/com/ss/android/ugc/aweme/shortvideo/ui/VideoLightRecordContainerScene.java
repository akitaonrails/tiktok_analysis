package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C01GW;
import X.C0LE3;
import X.C0MGD;
import X.C0MGE;
import X.C0MWS;
import X.C0MWV;
import X.C0QTN;
import X.C0WZX;
import X.C1192870h9B;
import X.C11JF;
import X.C1202330hOR;
import X.C1402840mbq;
import X.C1429380nIe;
import X.C1443030nef;
import X.C1443540nfU;
import X.C1443590nfZ;
import X.C1447800nmM;
import X.C1448130nmt;
import X.C1448150nmv;
import X.C1453870nw9;
import X.C1642810sqt;
import X.C1654320t9S;
import X.C1655390tBB;
import X.C1655440tBG;
import X.C1655630tBZ;
import X.C1655660tBc;
import X.C1659630tI1;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1688700u2u;
import X.C1701330uNH;
import X.C19221910Hx;
import X.C19286810cs;
import X.C19A3;
import X.C19GS;
import X.C1DI6;
import X.C1DPV;
import X.C1DRG;
import X.C201955140j;
import X.C20622515mp;
import X.C214871197d;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C290640BaI;
import X.C294080Bfq;
import X.C297290Bl1;
import X.C452501pT;
import X.C536720L3e;
import X.C786410Ut5;
import X.C799570VYd;
import X.C960203pA;
import X.EnumC1641390sob;
import X.InterfaceC1649070t0z;
import X.InterfaceC1655330tB5;
import X.InterfaceC1655340tB6;
import X.InterfaceC1655690tBf;
import X.InterfaceC1655700tBg;
import X.InterfaceC1674890tgd;
import X.InterfaceC1888407aU;
import X.InterfaceC362610EJn;
import X.InterfaceC376620Epg;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC530790Krl;
import X.InterfaceC535600KzW;
import X.InterfaceC569720MWc;
import Y.ARunnableS133S0100000_33;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordMobModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.gamora.PageFactory;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import joo.f;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS604S0100000_25;
import lgo.a;
import lth.o;
import nv7.c0;

/* JADX INFO: loaded from: classes26.dex */
public final class VideoLightRecordContainerScene extends BaseScreenAdaptScene implements C0MGE, InterfaceC524950KiL, InterfaceC1649070t0z, C0MGD, InterfaceC530790Krl, C0MWS, InterfaceC535600KzW {
    public final C1655440tBG LLJJL;
    public C1DRG LLJJLIIIJLLLLLLLZ;
    public ShortVideoContext LLJL;
    public final C01GW LLJLIL;
    public final List<InterfaceC362610EJn> LLJLILLLLZIIL;
    public final List<InterfaceC484050IyZ> LLJLL;
    public final List<InterfaceC1655330tB5> LLJLLIL;
    public final List<InterfaceC1655340tB6> LLJLLL;
    public final C01GW LLJZ;

    public VideoLightRecordContainerScene() {
        this(0);
    }

    @Override // X.InterfaceC1649070t0z
    public final void LJJLIL(InterfaceC1888407aU interfaceC1888407aU) {
        this.LLJJL.LJJLIL(interfaceC1888407aU);
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LLIIZ() {
        return null;
    }

    @Override // X.InterfaceC1649070t0z
    public final void LLJJ(InterfaceC1888407aU interfaceC1888407aU) {
        this.LLJJL.LLJJ(interfaceC1888407aU);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final String LLLLL() {
        return "video_light_record_page";
    }

    @Override // X.C0MWS
    public final C0LE3 getType() {
        return null;
    }

    @Override // X.InterfaceC535600KzW
    public final FrameLayout LJLLLL() {
        View view = this.mView;
        if (view instanceof FrameLayout) {
            return (FrameLayout) view;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final C1202330hOR LLLLJI() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LJII;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final String getCreationId() {
        ShortVideoContext shortVideoContext = this.LLJL;
        if (shortVideoContext != null) {
            return shortVideoContext.getCreationId();
        }
        return null;
    }

    @Override // X.InterfaceC530790Krl
    public final C0QTN getInflater() {
        return (C0QTN) this.LLJLIL.getValue();
    }

    @Override // X.AbstractC214814194y
    public final int getStartAnimationType() {
        Bundle bundle = this.mArguments;
        return bundle == null ? super.getStartAnimationType() : C0MWV.LIZIZ(bundle);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void nm() {
        this.LLJJL.LIZJ();
    }

    @Override // X.AbstractC214814194y
    public final void onEnterAnimationComplete() {
        C201955140j.LIZJ(C1655660tBc.LIZIZ, "VideoPureRecordContainerScene onEnterAnimationComplete");
        if (this.mArguments == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        a.LIZIZ.LIZJ().onEnterAnimationComplete();
        C1453870nw9 c1453870nw9 = (C1453870nw9) this.LLJZ.getValue();
        if (c1453870nw9 != null) {
            c1453870nw9.LIZLLL = jCurrentTimeMillis;
        }
        C1453870nw9 c1453870nw92 = (C1453870nw9) this.LLJZ.getValue();
        if (c1453870nw92 != null) {
            c1453870nw92.LIZIZ(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END);
        }
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final void finish() throws Throwable {
        String string;
        MicroAppModel microAppModel;
        IAVServiceProxy iAVServiceProxy;
        Bundle argumentsSafely = getArgumentsSafely();
        if (argumentsSafely == null || (string = argumentsSafely.getString("backurl")) == null) {
            string = "";
        }
        if ((argumentsSafely != null ? argumentsSafely.getSerializable("micro_app_info") : null) != null) {
            Serializable serializable = argumentsSafely != null ? argumentsSafely.getSerializable("micro_app_info") : null;
            if ((serializable instanceof MicroAppModel) && (microAppModel = (MicroAppModel) serializable) != null && (iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null)) != null && iAVServiceProxy.getMiniAppService() != null) {
                C19286810cs.LIZ(microAppModel.appId);
            }
        }
        super.finish();
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
                    C2204961BRm.LJIJI(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLv4UZDPXU3q+knWkDh62EUqtzod5KpkVEj8hmFXlg", null));
                    activity.moveTaskToBack(true);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1443030nef.LJII().LJIIIZ();
    }

    @Override // X.AbstractC214814194y
    public final int getFinishAnimationType() {
        return C1655390tBB.LIZ(getArgumentsSafely(), this.LLJL);
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        InterfaceC569720MWc interfaceC569720MWc;
        C1DRG c1drgLJFF = C1664600tQ2.LJ(this).LJFF();
        if (c1drgLJFF == null || (interfaceC569720MWc = (InterfaceC569720MWc) c1drgLJFF.LJIIL(null, InterfaceC569720MWc.class)) == null) {
            return this.LLJJL.LIZ(null);
        }
        interfaceC569720MWc.MH("system_back_button", -1L);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C1DPV.LIZIZ.LIZ.getClass();
        C1DI6.LIZIZ = null;
        C19221910Hx c19221910Hx = (C19221910Hx) o.LIZJ;
        c19221910Hx.getClass();
        C786410Ut5.LJL(C799570VYd.LIZIZ(), new ARunnableS133S0100000_33(c19221910Hx, 60));
        this.LLJJLIIIJLLLLLLLZ = null;
        C11JF c11jf = C536720L3e.LIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C536720L3e.LIZ = null;
        C11JF c11jf2 = C536720L3e.LIZIZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        C536720L3e.LIZIZ = null;
        a.LIZIZ.LIZJ().onDestroyView();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C201955140j.LIZJ(C1655660tBc.LIZIZ, "VideoPureRecordContainerScene onPause");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        CreativeModel creativeModel;
        RecordMobModel recordMobModel;
        super.onResume();
        C201955140j.LIZJ(C1655660tBc.LIZIZ, "VideoPureRecordContainerScene onResume");
        ShortVideoContext shortVideoContext = this.LLJL;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (recordMobModel = creativeModel.recordMobModel) != null) {
            recordMobModel.onActivityResumeMillis = System.currentTimeMillis();
        }
        C1453870nw9 c1453870nw9 = (C1453870nw9) this.LLJZ.getValue();
        if (c1453870nw9 != null) {
            c1453870nw9.LIZIZ(EnumC1641390sob.ACTIVITY_RESUME);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        C201955140j.LIZJ(C1655660tBc.LIZIZ, "VideoPureRecordContainerScene onStart");
        if (this.mArguments == null) {
            return;
        }
        C1453870nw9 c1453870nw9 = (C1453870nw9) this.LLJZ.getValue();
        if (c1453870nw9 != null) {
            c1453870nw9.LIZIZ(EnumC1641390sob.ACTIVITY_STARTED);
        }
        View view = this.mView;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        C201955140j.LIZJ(C1655660tBc.LIZIZ, "VideoPureRecordContainerScene onStop");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final InterfaceC1674890tgd LLLLLILLIL() {
        return c0.LIZ;
    }

    public VideoLightRecordContainerScene(int i) {
        this.LLJJL = new C1655440tBG();
        this.LLJLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 327));
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLL = new ArrayList();
        this.LLJLLIL = new ArrayList();
        this.LLJLLL = new ArrayList();
        this.LLJZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 330));
        disableSupportRestore();
        LLLLJ(AFwS278S0000000_32.get$arr$(95));
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJLILLLLZIIL, 0, interfaceC362610EJn);
    }

    @Override // X.C0MWS
    public final void LJLL(boolean z) {
        View view = this.mView;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
    }

    public final void LLLLLL(Bundle bundle) {
        C1402840mbq c1402840mbq;
        boolean z;
        ShortVideoContext shortVideoContextLIZJ = this.LLJL;
        if (bundle != null) {
            shortVideoContextLIZJ = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            if (shortVideoContextLIZJ != null && C297290Bl1.LIZ()) {
                shortVideoContextLIZJ.isRestoreFromSaveInstance = true;
            }
            C1655660tBc c1655660tBc = C1655660tBc.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initData with outState, shortVideoContext is NULL: ");
            if (shortVideoContextLIZJ == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C201955140j.LIZJ(c1655660tBc, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.mArguments == null) {
            this.mArguments = new Bundle();
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            if (shortVideoContextLIZJ == null) {
                shortVideoContextLIZJ = C1443540nfU.LIZJ(bundle2, requireAppCompatActivity(), null);
                Serializable serializable = bundle2.getSerializable("share_model");
                if ((serializable instanceof C1402840mbq) && (c1402840mbq = (C1402840mbq) serializable) != null) {
                    shortVideoContextLIZJ.shareContext = c1402840mbq;
                }
                shortVideoContextLIZJ.creativeModel.recordData.lightRecordContainerMode = true;
                if (shortVideoContextLIZJ.mIsFromDraft && shortVideoContextLIZJ.shootMode == 16) {
                    C1443590nfZ c1443590nfZ = o.LJIIJJI;
                    c1443590nfZ.LIZ();
                    shortVideoContextLIZJ.cameraComponentModel.mVideoWidth = c1443590nfZ.LIZ;
                    C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
                    c1443590nfZ2.LIZ();
                    shortVideoContextLIZJ.cameraComponentModel.mVideoHeight = c1443590nfZ2.LIZIZ;
                    shortVideoContextLIZJ.creativeModel.nowsShootModel = null;
                }
                C201955140j.LIZJ(C1655660tBc.LIZIZ, "initData with arguments");
            }
            this.LLJL = shortVideoContextLIZJ;
            C1448150nmv.LIZIZ(shortVideoContextLIZJ, bundle2, requireAppCompatActivity());
            if (C1448130nmt.LIZIZ) {
                C1448130nmt.LIZIZ = false;
                shortVideoContextLIZJ.creativeModel.recordMobModel.isColdStart = true;
            }
            C1DPV.LIZIZ.LIZ(C1448150nmv.LIZ(shortVideoContextLIZJ));
            C1443030nef c1443030nefLJII = C1443030nef.LJII();
            String str = shortVideoContextLIZJ.shootWay;
            c1443030nefLJII.LIZIZ = str;
            c1443030nefLJII.LIZJ = str;
            C1443030nef.LJII().LIZLLL = shortVideoContextLIZJ.mShootFrom;
            ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class);
            shortVideoContextViewModel.LL = shortVideoContextLIZJ;
            shortVideoContextViewModel.wQ2(shortVideoContextLIZJ.shootMode);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJLL).add(interfaceC484050IyZ);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void S3(boolean z) {
        this.LLJJL.LIZIZ(z);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJLL).remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJLILLLLZIIL).remove(interfaceC362610EJn);
    }

    @Override // X.AbstractC214814194y
    public final void dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator it2 = ((ArrayList) this.LLJJL.LL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1655700tBg) it2.next()).dispatchTouchEvent(motionEvent);
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJLILLLLZIIL).add(interfaceC362610EJn);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String creationId;
        if (this.mArguments == null) {
            super.onActivityCreated(bundle);
            C201955140j.LJII(C1655660tBc.LIZIZ, "VideoPureRecordContainerScene onActivityCreated getArguments is null");
            ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
            if (iCreativeSAAService != null) {
                iCreativeSAAService.invokeMethodsSafely(requireActivity(), new AwS569S0100000_25(this, 329));
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(requireActivity(), "aweme://main");
            smartRouteBuildRoute.addFlags(268468224);
            smartRouteBuildRoute.open();
            return;
        }
        a.LIZIZ.LIZJ().LIZJ();
        if (C20622515mp.LJ(this) == null) {
            f fVar = f.LIZ;
            C19GS c19gsRequireAppCompatActivity = requireAppCompatActivity();
            Intent intent = requireActivity().getIntent();
            fVar.getClass();
            f.LIZJ(c19gsRequireAppCompatActivity, intent, bundle);
        }
        LLLLLL(bundle);
        String str = null;
        a6n.a aVar = new a6n.a(false, null, null, null);
        aVar.LJFF = requireAppCompatActivity();
        ShortVideoContext shortVideoContext = this.LLJL;
        if (shortVideoContext != null) {
            aVar.LJI = shortVideoContext;
            aVar.LJIIJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(164));
            C1447800nmM.LIZIZ(this).getScope().LJI("record_env_context", aVar);
            C1655660tBc c1655660tBc = C1655660tBc.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoPureRecordContainerScene => onCreate start, creationId: ");
            ShortVideoContext shortVideoContext2 = this.LLJL;
            if (shortVideoContext2 != null) {
                creationId = shortVideoContext2.getCreationId();
            } else {
                creationId = null;
            }
            sbLIZ.append(creationId);
            sbLIZ.append(" shootWay: ");
            ShortVideoContext shortVideoContext3 = this.LLJL;
            if (shortVideoContext3 != null) {
                str = shortVideoContext3.shootWay;
            }
            sbLIZ.append(str);
            C201955140j.LIZJ(c1655660tBc, C2188811AlT.LIZIZ(sbLIZ));
            ShortVideoContext shortVideoContext4 = this.LLJL;
            if (shortVideoContext4 != null) {
                C1453870nw9 c1453870nw9 = new C1453870nw9();
                boolean zLIZ = C294080Bfq.LIZ();
                C1654320t9S.LIZIZ(this, AFwS266S0000000_25.get$arr$(171));
                C1664590tQ1.LIZ(this, "VideoPureRecordContainerScene", zLIZ, new AwS217S0300000_8(this, (VideoLightRecordContainerScene) shortVideoContext4, (ShortVideoContext) c1453870nw9, (C1453870nw9<EnumC1641390sob>) 17));
                C1664600tQ2.LIZ(this, "VideoPureRecordContainerScene", new AwS601S0100000_22(this, 218));
                C1642810sqt.LIZ(C1664600tQ2.LJ(this), "light_record_container");
                this.LLJJLIIIJLLLLLLLZ = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
                C1453870nw9 c1453870nw92 = (C1453870nw9) this.LLJZ.getValue();
                if (c1453870nw92 != null) {
                    c1453870nw92.LIZIZ(EnumC1641390sob.ACTIVITY_CREATED);
                }
                C1429380nIe.LIZ = false;
                super.onActivityCreated(bundle);
                Window window = getWindow();
                if (window != null) {
                    window.addFlags(128);
                }
                if (!C1688700u2u.LIZ(requireAppCompatActivity())) {
                    C201955140j.LIZJ(c1655660tBc, "RecordConditionCheck.check() false");
                    finish();
                    return;
                } else {
                    final ShortVideoContext shortVideoContext5 = this.LLJL;
                    add(R.id.video_light_record_container_scene, C214871197d.LIZ(new C19A3(shortVideoContext5) { // from class: X.0sr0
                        public final ShortVideoContext LLJILLL;

                        {
                            this.LLJILLL = shortVideoContext5;
                        }

                        @Override // com.bytedance.scene.Scene
                        public final void onActivityCreated(Bundle bundle2) {
                            InterfaceC1642900sr2 interfaceC1642900sr2LIZ;
                            super.onActivityCreated(bundle2);
                            PageFactory pageFactory = (PageFactory) PluggableExtentionKt.pluggableSpi$default(PageFactory.class, false, false, false, 14, null);
                            if (pageFactory != null && (interfaceC1642900sr2LIZ = pageFactory.LIZ(this.LLJILLL)) != null) {
                                interfaceC1642900sr2LIZ.LIZ(this);
                            }
                        }

                        @Override // X.C19A3, com.bytedance.scene.Scene
                        public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle2) {
                            FrameLayout frameLayout = new FrameLayout(requireSceneContext());
                            frameLayout.setId(R.id.szh);
                            C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                            FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
                            frameLayout2.setId(R.id.sz6);
                            C786410Ut5.a6(frameLayout2, new ViewGroup.LayoutParams(-1, -1));
                            frameLayout.addView(frameLayout2);
                            FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
                            frameLayout3.setId(R.id.sz5);
                            C786410Ut5.a6(frameLayout3, new ViewGroup.LayoutParams(-1, -1));
                            frameLayout.addView(frameLayout3);
                            return frameLayout;
                        }

                        @Override // X.C19A3, com.bytedance.scene.Scene
                        public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle2) {
                            return onCreateView(layoutInflater, viewGroup, bundle2);
                        }
                    }), "VideoRecordContainerScene");
                    return;
                }
            }
            "bindPureComponents must be called after initData".toString();
            throw new IllegalArgumentException("bindPureComponents must be called after initData");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC214814194y, X.AnonymousClass1995
    public final void onConfigurationChanged(Configuration configuration) {
        a.LIZIZ.LIZJ().LIZ();
        Iterator it2 = ((ArrayList) this.LLJJL.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1655690tBf) it2.next()).onConfigurationChanged(configuration);
        }
    }

    @Override // X.AbstractC214814194y
    public final void onNewIntent(Intent intent) {
        Bundle extras;
        C201955140j.LIZJ(C1655660tBc.LIZIZ, "VideoPureRecordContainerScene onNewIntent");
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        processNewArguments(extras);
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJIJL(bundle, "save_state_short_video_context", this.LLJL);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void p2(boolean z) {
        this.LLJJL.LIZLLL(z);
    }

    @Override // X.AbstractC214814194y
    public final boolean processNewArguments(Bundle bundle) {
        C1655630tBZ c1655630tBZ;
        C1655660tBc c1655660tBc = C1655660tBc.LIZIZ;
        C201955140j.LIZJ(c1655660tBc, "VideoPureRecordContainerScene processNewArguments");
        if (bundle == null) {
            return true;
        }
        ShortVideoContext shortVideoContext = this.LLJL;
        if (shortVideoContext != null && C1688700u2u.LIZ(requireAppCompatActivity())) {
            C1DRG c1drg = this.LLJJLIIIJLLLLLLLZ;
            if (c1drg != null && (c1655630tBZ = (C1655630tBZ) c1drg.LJIIL(null, C1655630tBZ.class)) != null && C290640BaI.LIZ()) {
                c1655630tBZ.LIZ.LIZLLL(new AwS604S0100000_25(bundle, 784), true);
            }
            if (bundle.getBoolean("is_from_publish_after_draft_saved")) {
                CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
                shortVideoContext.creativeInfo = creativeInfo;
                shortVideoContext.creativeModel.creativeInfo = creativeInfo;
            }
            boolean z = false;
            boolean z2 = bundle.getBoolean("recreate_record_and_clear", false);
            boolean z3 = bundle.getBoolean("enter_record_from_other_platform", false);
            if (z2) {
                C201955140j.LIZJ(c1655660tBc, "VideoPureRecordContainerScene processNewArguments isClear");
                this.mArguments = bundle;
                LLLLLL(null);
            } else if (this.LLJL == null) {
                LLLLLL(null);
            }
            ShortVideoContext shortVideoContext2 = this.LLJL;
            if (shortVideoContext2 != null) {
                if (z3 || shortVideoContext2.microAppModel != null) {
                    z = true;
                }
                shortVideoContext2.mFromOtherPlatform = z;
            }
            return true;
        }
        C201955140j.LIZJ(c1655660tBc, "close page because of null shortVideoContext when invoking onNewIntent");
        finish();
        return true;
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL).iterator();
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
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLJLLIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1655330tB5) it2.next()).onKeyLongPress(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLJLLL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1655340tB6) it2.next()).onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            ShortVideoContext shortVideoContext = this.LLJL;
            if (shortVideoContext != null && shortVideoContext.microAppModel != null) {
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
                                C2204961BRm.LJIILLIIL(activityRequireActivity2, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLv4UZDPXU3q+knWkDh62EUqtzod5KpkVEj8hmFXlg", null));
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

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Activity activity = this.mActivity;
        if (activity != null && C960203pA.LIZIZ(activity)) {
            i = R.style.y0;
        } else {
            i = R.style.xm;
        }
        setTheme(i);
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        frameLayout.setId(R.id.video_light_record_container_scene);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // X.AbstractC214814194y
    public final boolean onInterceptActivityResult(int i, int i2, Intent intent) {
        Iterator it2 = ((ArrayList) this.LLJLL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }
}
