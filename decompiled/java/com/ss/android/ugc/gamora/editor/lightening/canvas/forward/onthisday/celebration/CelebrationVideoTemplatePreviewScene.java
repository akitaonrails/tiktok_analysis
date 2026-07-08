package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration;

import X.C01GW;
import X.C03IT;
import X.C098200Yq;
import X.C0C64;
import X.C0CHQ;
import X.C0GTR;
import X.C0MHN;
import X.C0MHP;
import X.C0ML7;
import X.C0ML8;
import X.C0MLB;
import X.C0MLE;
import X.C0MLL;
import X.C0MMK;
import X.C0MQ1;
import X.C0MQC;
import X.C0MQJ;
import X.C0MQL;
import X.C0MQN;
import X.C0MQO;
import X.C0MQP;
import X.C0MQS;
import X.C0MQU;
import X.C0MS4;
import X.C0MS5;
import X.C1292030jj7;
import X.C1294250jmh;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C1322110kVd;
import X.C1324750kZt;
import X.C1378990lzN;
import X.C1383370m6R;
import X.C1438580nXU;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1697810uHb;
import X.C1766560w4U;
import X.C189200o6;
import X.C19292410dm;
import X.C19576911iZ;
import X.C1DRG;
import X.C201955140j;
import X.C2108108Nr;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2471909mP;
import X.C337180DJs;
import X.C368610Ecl;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C427870Gq9;
import X.C452501pT;
import X.C554890LpX;
import X.C568720MSg;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.InterfaceC1292040jj8;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.ViewOnLayoutChangeListenerC580890MqN;
import Y.ACListenerS143S0100000_8;
import Y.ARunnableS107S0100000_7;
import Y.ATListenerS441S0100000_7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.onthisday.OnThisDayService;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.story.celebration.CelebrationRenderedVideo;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.BaseOnThisDayPreviewScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS690S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationVideoTemplatePreviewScene extends BaseOnThisDayPreviewScene implements InterfaceC524950KiL {
    public static final /* synthetic */ int LLLIIIIL = 0;
    public C0MMK LLJL;
    public View LLJLL;
    public View LLJLLIL;
    public C427870Gq9 LLJLLL;
    public TuxTextView LLJZ;
    public C1295960jpS LLJZIJLIL;
    public C0MQS LLL;
    public TuxImmersionBar LLLF;
    public C0MQP LLLFF;
    public C0MHP LLLFFI;
    public C0MLL LLLFZ;
    public CreativeDialogWrapper LLLII;
    public boolean LLLIIII;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 650));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 649));
    public final List<InterfaceC484050IyZ> LLLI = new ArrayList();

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
    }

    public final boolean LLLLLIL() {
        return this.LLJJJJJIL == 2 && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_eoy_ui_preview_background", true, false);
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.BaseOnThisDayPreviewScene
    public final void LLLLJI() {
        if (LLLLLIL()) {
            return;
        }
        super.LLLLJI();
    }

    public final void LLLLLL() {
        if (LLLLLIL()) {
            this.LLJZIJLIL = (C1295960jpS) findViewById(R.id.nrk);
            String str = C0MQ1.LJ().background;
            C1322110kVd c1322110kVd = (C1322110kVd) findViewById(R.id.bnu);
            if (c1322110kVd == null) {
                return;
            }
            C1324750kZt.LJIIIZ(c1322110kVd, str, -1, -1);
            final C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.sgq);
            C201955140j.LIZLLL(C554890LpX.LIZIZ, "OnThisDayVideoPreviewScene", "start init publish btn anim");
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(requireContext(), C0MQ1.LJ().postBtnLottie);
            c1292030jj7LJIIJJI.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0JEZ
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C1294720jnS c1294720jnS = (C1294720jnS) obj;
                    C554890LpX c554890LpX = C554890LpX.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("finish init publish btn anim, cost = ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ.append(" ms");
                    C201955140j.LIZLLL(c554890LpX, "OnThisDayVideoPreviewScene", C2188811AlT.LIZIZ(sbLIZ));
                    C1295960jpS c1295960jpS2 = c1295960jpS;
                    if (c1295960jpS2 != null) {
                        C786410Ut5.LJLLLLLL(0, c1295960jpS2);
                    }
                    C1295960jpS c1295960jpS3 = c1295960jpS;
                    if (c1295960jpS3 != null) {
                        c1295960jpS3.setComposition(c1294720jnS);
                    }
                }
            });
            c1292030jj7LJIIJJI.LIZ(new InterfaceC1292040jj8() { // from class: X.0MQG
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C554890LpX c554890LpX = C554890LpX.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("play publish btn lottie, addFailureListener, e = ");
                    sbLIZ.append(obj);
                    C537680L6w.LIZ(c554890LpX, "OnThisDayVideoPreviewScene", C2188811AlT.LIZIZ(sbLIZ), null);
                }
            });
        }
    }

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        ((ArrayList) this.LLLI).clear();
        ((OnThisDayService) ServiceManager.get().getService(OnThisDayService.class)).cleanUpMaterialSelectScene(this);
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.BaseOnThisDayPreviewScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        if (this.LLLIIII) {
            HandlerHook.viewPost(this.mView, new ARunnableS107S0100000_7(this, 157));
        }
        if (LLLLLIL()) {
            TuxImmersionBar tuxImmersionBar = this.LLLF;
            if (tuxImmersionBar != null) {
                tuxImmersionBar.LJII();
            }
            super.LLLLJI();
        }
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause, ");
        sbLIZ.append(hashCode());
        C201955140j.LIZLLL(c554890LpX, "OnThisDayVideoPreviewScene", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.BaseOnThisDayPreviewScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        EditPreviewInfo editPreviewInfo;
        super.onResume();
        if (this.mView.getTranslationY() == 9000.0f) {
            C786410Ut5.ed(this.mView, 0.0f);
            this.LLLIIII = false;
        }
        if (LLLLLIL()) {
            TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(requireFragmentActivity());
            tuxImmersionBarLJ.LJIIJJI();
            tuxImmersionBarLJ.LIZIZ.LJIIJ(false);
            this.LLLF = tuxImmersionBarLJ;
            tuxImmersionBarLJ.LIZLLL();
        }
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume, ");
        sbLIZ.append(hashCode());
        C201955140j.LIZLLL(c554890LpX, "OnThisDayVideoPreviewScene", C2188811AlT.LIZIZ(sbLIZ));
        C0MLE c0mle = C0MLE.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJJJIL;
        c0mle.getClass();
        EditPreviewInfo editPreviewInfo2 = videoPublishEditModel.getEditPreviewInfo();
        if (editPreviewInfo2 == null || editPreviewInfo2.getPreviewVideoLength() != 0 || (editPreviewInfo = videoPublishEditModel.getEditPreviewInfo()) == null) {
            return;
        }
        editPreviewInfo.setPreviewVideoLength(15000);
    }

    public final void LLLLLILLIL(boolean z) {
        View viewFindViewById;
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableClickEvents, enabled = ");
        sbLIZ.append(z);
        C201955140j.LIZLLL(c554890LpX, "OnThisDayVideoPreviewScene", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mViewDestroyed || (viewFindViewById = this.mView.findViewById(R.id.e0t)) == null) {
            return;
        }
        if (z) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        } else {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            viewFindViewById.setOnTouchListener(new ATListenerS441S0100000_7(this, 8));
        }
    }

    public final void LLLLLJIL(String str) {
        Context sceneContext = getSceneContext();
        if (sceneContext == null) {
            return;
        }
        this.LLLIIII = true;
        this.LLJJJIL.creativeModel.onThisDayData.setLeftWay(str);
        C0MLE c0mle = C0MLE.LIZ;
        ShortVideoContext shortVideoContext = this.LLJJJJ;
        VideoPublishEditModel videoPublishEditModel = this.LLJJJIL;
        C0MHP c0mhp = this.LLLFFI;
        c0mle.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C2108108Nr.LIZ), C0MLE.LIZIZ, null, new C0MHN(this, shortVideoContext, videoPublishEditModel, c0mhp, sceneContext, null), 2);
    }

    public final void LLLLLJLJLL(boolean z) {
        if (LLLLLIL() && z) {
            C1295960jpS c1295960jpS = this.LLJZIJLIL;
            if (c1295960jpS != null) {
                C368610Ecl.LIZIZ(c1295960jpS);
            }
            LLLLLILLIL(true);
            ViewPager viewPager = this.LLJJIJIL;
            if (viewPager != null) {
                C786410Ut5.LJLLLLLL(0, viewPager);
                return;
            }
            return;
        }
        CreativeDialogWrapper creativeDialogWrapper = this.LLLII;
        if (creativeDialogWrapper == null) {
            return;
        }
        creativeDialogWrapper.dismiss();
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLLI).add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLLI).remove(interfaceC484050IyZ);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.BaseOnThisDayPreviewScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C427870Gq9 c427870Gq9;
        String string;
        String string2;
        String string3;
        C0GTR c0gtr;
        UrlModel avatarThumb;
        C0MS4 c0ms4;
        ShortVideoContext shortVideoContext;
        Serializable serializable;
        C0MMK c0mmk;
        String string4;
        super.onActivityCreated(bundle);
        Bundle bundle2 = this.mArguments;
        String str = "end_of_year";
        TuxTextView tuxTextView = null;
        C568720MSg c568720MSgLLLLIILL = null;
        if (bundle2 != null) {
            Object objCreateShortVideoContext = ((OnThisDayService) ServiceManager.get().getService(OnThisDayService.class)).createShortVideoContext(bundle2);
            if (objCreateShortVideoContext instanceof ShortVideoContext) {
                shortVideoContext = (ShortVideoContext) objCreateShortVideoContext;
            } else {
                shortVideoContext = null;
            }
            this.LLJJJJ = shortVideoContext;
            if (shortVideoContext != null) {
                shortVideoContext.creativeModel = this.LLJJJIL.creativeModel;
                shortVideoContext.creativeInfo = this.LLJJJIL.getCreativeInfo();
            }
            ShortVideoContext shortVideoContext2 = this.LLJJJJ;
            if (shortVideoContext2 != null) {
                Bundle bundle3 = this.mArguments;
                if (bundle3 == null || (string4 = bundle3.getString("shoot_way")) == null || string4.length() == 0) {
                    C0ML8 c0ml8 = C0ML8.LIZ;
                    int i = this.LLJJJJJIL;
                    c0ml8.getClass();
                    if (i == 2) {
                        string4 = "end_of_year";
                    } else {
                        string4 = "on_this_day";
                    }
                }
                shortVideoContext2.shootWay = string4;
            }
            ShortVideoContext shortVideoContext3 = this.LLJJJJ;
            if (shortVideoContext3 != null) {
                shortVideoContext3.shootMode = 17;
            }
            this.LLJJJIL.setEnterFrom("on_this_day_page");
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                serializable = bundle4.getSerializable("forward_config");
            } else {
                serializable = null;
            }
            if (serializable instanceof C0MMK) {
                c0mmk = (C0MMK) serializable;
            } else {
                c0mmk = null;
            }
            this.LLJL = c0mmk;
        }
        C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(244));
        C1664590tQ1.LIZLLL(this, "OnThisDayVideoPreviewScene", false, new AwS587S0100000_8(this, 526), 2);
        C1664600tQ2.LIZ(this, "OnThisDayVideoPreviewScene", new AwS587S0100000_8(this, 533));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            this.LLLFF = (C0MQP) c1drg.LJII(C0MQP.class, null);
            this.LLLFFI = (C0MHP) c1drg.LJII(C0MHP.class, null);
            this.LLLFZ = (C0MLL) c1drg.LJII(C0MLL.class, null);
        }
        super.LLLLL();
        if (!C0MQ1.LJFF(this.LLJJJJJIL) && !C0MQO.LIZ()) {
            c427870Gq9 = (C427870Gq9) requireViewById(R.id.l9h);
        } else {
            C337180DJs.LIZ(requireViewById(R.id.l9h));
            c427870Gq9 = (C427870Gq9) requireViewById(R.id.l9x);
        }
        this.LLJLLL = c427870Gq9;
        if (c427870Gq9 != null) {
            C786410Ut5.LJLLLLLL(0, c427870Gq9);
        }
        this.LLJLL = requireViewById(R.id.sh_);
        this.LLJLLIL = findViewById(R.id.sgp);
        C0GTR c0gtr2 = (C0GTR) findViewById(R.id.bhu);
        if (c0gtr2 != null) {
            c0gtr2.setRingWidth(C418440Gaw.LIZIZ(2));
        }
        View view = this.LLJLL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 110), view);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 111), view2);
        }
        View viewFindViewById = findViewById(R.id.cpt);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS690S0100000_8(this, 4), viewFindViewById);
        }
        C786410Ut5.I7(new AbS690S0100000_8(this, 5), requireViewById(R.id.uuu));
        ViewPager viewPager = this.LLJJIJIL;
        if (viewPager != null) {
            C0MQS c0mqs = new C0MQS(this, this.LLJJJIL, this.LLJJJJJIL);
            this.LLL = c0mqs;
            viewPager.setAdapter(c0mqs);
            if (C0MQ1.LJI(this.LLJJJJJIL)) {
                c0mqs.LJJIL().LLJL = new C0MQU() { // from class: X.0MQK
                    @Override // X.C0MQU
                    public final void LIZ() {
                        CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene = this.LIZ;
                        celebrationVideoTemplatePreviewScene.getClass();
                        C201955140j.LIZLLL(C554890LpX.LIZIZ, "OnThisDayVideoPreviewScene", "Template edit callback triggered");
                        celebrationVideoTemplatePreviewScene.LLLLLJIL("on_this_day_slider_cover");
                    }
                };
            }
            boolean z = viewPager instanceof C0MS5;
            if (z) {
                C0MS5 c0ms5 = (C0MS5) viewPager;
                if (c0ms5 != null) {
                    c0ms5.setHandleClickChange(false);
                }
                if (z && (c0ms4 = (C0MS4) viewPager) != null) {
                    c0ms4.setNoScroll(true);
                }
            }
            if (C0MQ1.LJI(this.LLJJJJJIL)) {
                final C0MQJ c0mqj = new C0MQJ(this);
                final int scaledTouchSlop = ViewConfiguration.get(viewPager.getContext()).getScaledTouchSlop();
                final C817403Hg c817403Hg = new C817403Hg();
                final C817403Hg c817403Hg2 = new C817403Hg();
                viewPager.setOnTouchListener(new View.OnTouchListener() { // from class: X.0MQI
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 0) {
                            if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    return false;
                                }
                                float x = motionEvent.getX() - c817403Hg.element;
                                motionEvent.getY();
                                if (Math.abs(x) <= scaledTouchSlop) {
                                    return false;
                                }
                                return true;
                            }
                            ((Function0) c0mqj).invoke();
                            return false;
                        }
                        c817403Hg.element = motionEvent.getX();
                        c817403Hg2.element = motionEvent.getY();
                        return false;
                    }
                });
            }
        }
        ViewPager viewPager2 = this.LLJJIJIL;
        if (viewPager2 != null) {
            viewPager2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC580890MqN(this, viewPager2, 2));
        }
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.view_all);
        if (tuxTextView2 != null) {
            C1378990lzN.LIZIZ(tuxTextView2, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))), null, null, null, null, 30);
            C0MHP c0mhp = this.LLLFFI;
            if (c0mhp != null) {
                c0mhp.PK();
            }
            C0MLL c0mll = this.LLLFZ;
            if (c0mll != null) {
                C0MQS c0mqs2 = this.LLL;
                if (c0mqs2 != null) {
                    c568720MSgLLLLIILL = c0mqs2.LJJIL().LLLLIILL();
                }
                c0mll.WU1(tuxTextView2, true, c568720MSgLLLLIILL, new C0MQL(this));
            }
            tuxTextView = tuxTextView2;
        }
        this.LLJZ = tuxTextView;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && (avatarThumb = currentUser.getAvatarThumb()) != null) {
            C427870Gq9 c427870Gq92 = this.LLJLLL;
            if (c427870Gq92 instanceof C427660Gpo) {
                C427660Gpo.LJIIJJI((C427660Gpo) c427870Gq92, new C03IT(avatarThumb.getUrlList()), false, null, null, false, false, null, null, false, null, 990);
            } else {
                C1324750kZt.LJI(c427870Gq92, avatarThumb, -1, -1);
            }
        }
        try {
            LLLLLL();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        Context contextRequireSceneContext = requireSceneContext();
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.loadingMessage(requireSceneContext().getString(2131847921));
        this.LLLII = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(contextRequireSceneContext, 1605, creativeLoadingDialogBuilder);
        if (C0MQ1.LJFF(this.LLJJJJJIL)) {
            C0GTR c0gtr3 = (C0GTR) findViewById(R.id.bhu);
            if (c0gtr3 != null) {
                c0gtr3.setRingWidth(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
            }
            disableSupportRestore();
            C2471909mP.LIZ.getClass();
            C2471909mP.LJJIJIL(true);
            C2471909mP.LJJIJIIJIL(true);
        }
        if (C0MQO.LIZ() && (c0gtr = (C0GTR) findViewById(R.id.bhu)) != null) {
            c0gtr.setRingWidth(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
        }
        C1438580nXU c1438580nXU = C1438580nXU.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJJJIL;
        c1438580nXU.getClass();
        C1438580nXU.LIZIZ(videoPublishEditModel);
        Bundle bundle5 = this.mArguments;
        String str2 = "";
        if (bundle5 == null || (string = bundle5.getString("shoot_way")) == null) {
            string = "";
        }
        Bundle bundle6 = this.mArguments;
        if (bundle6 == null || (string2 = bundle6.getString("entrance_type")) == null) {
            string2 = "";
        }
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null && (string3 = bundle7.getString("search_extra")) != null) {
            str2 = string3;
        }
        C0MLE c0mle = C0MLE.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LLJJJIL;
        String str3 = this.LLJJL;
        String str4 = this.LLJJJJLIIL;
        int i2 = this.LLJJJJJIL;
        boolean zLJFF = Intrinsics.LJFF(str3, "out_push");
        C0MLB c0mlb = (C0MLB) this.LLJLIL.getValue();
        if (!c0mlb.LJFF) {
            c0mlb.LIZLLL();
        }
        CelebrationRenderedVideo celebrationRenderedVideo = c0mlb.LJI;
        c0mle.getClass();
        if (string.length() <= 0) {
            C0ML8.LIZ.getClass();
            if (i2 != 2) {
                str = "on_this_day";
            }
            string = str;
        }
        videoPublishEditModel2.mShootWay = string;
        videoPublishEditModel2.setShootEnterMethod(str3);
        videoPublishEditModel2.setEditPreviewInfo(new EditPreviewInfo(C1697810uHb.LJIILJJIL(new EditVideoSegment("", null, new VideoFileInfo(0, 0, 0L, 0, 0, 0, 0, 0, 0.0f, 496, null), 2, null)), 0, 0, 0L, 0L, "", 30, null));
        EditPreviewInfo editPreviewInfo = videoPublishEditModel2.getEditPreviewInfo();
        if (editPreviewInfo != null) {
            editPreviewInfo.setPreviewVideoLength(15000);
        }
        videoPublishEditModel2.setCreationMode(1);
        C0MLE.LIZIZ(c0mle, videoPublishEditModel2, i2, str4, 0, zLJFF, string2, str2, celebrationRenderedVideo, 8);
        videoPublishEditModel2.creativeModel.ugcTemplateData.showOriginTemplateAnchor = Boolean.TRUE;
        t4(true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnThisDayVideoPreviewScene hashCode = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", [start] setVideoData");
        C201955140j.LJIILJJIL(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        C0MQC c0mqc = new C0MQC(jCurrentTimeMillis, this);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C0MHP c0mhp2 = this.LLLFFI;
        if (c0mhp2 != null) {
            c0mhp2.F40(true, new C0MQN(this, jCurrentTimeMillis2, true, c0mqc));
        }
        Qh(new InterfaceC484050IyZ() { // from class: X.0MQF
            @Override // X.InterfaceC484050IyZ
            public final boolean onActivityResult(int i3, int i4, Intent intent) {
                CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene = this.LL;
                celebrationVideoTemplatePreviewScene.getClass();
                C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("OnThisDayVideoPreviewScene on activity result, result code = ");
                sbLIZ2.append(i3);
                sbLIZ2.append(", hashCode = ");
                sbLIZ2.append(celebrationVideoTemplatePreviewScene.hashCode());
                C201955140j.LJIILJJIL(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
                if (i3 != 12356) {
                    return false;
                }
                if (celebrationVideoTemplatePreviewScene.LLLLLIL()) {
                    celebrationVideoTemplatePreviewScene.LLLIIII = false;
                }
                celebrationVideoTemplatePreviewScene.t4(false);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(celebrationVideoTemplatePreviewScene), null, null, new C0MQB(celebrationVideoTemplatePreviewScene, intent, null), 3);
                return true;
            }
        });
        C0ML7 c0ml7 = C0ML7.LIZ;
        VideoPublishEditModel videoPublishEditModel3 = this.LLJJJIL;
        c0ml7.getClass();
        C0ML7.LJIIJ(videoPublishEditModel3);
    }

    public final void t4(boolean z) {
        if (LLLLLIL() && z) {
            String str = C0MQ1.LJ().loadingLottie;
            if (str.length() <= 0) {
                str = null;
            }
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play loading lottie, celebrationType = ");
            sbLIZ.append(this.LLJJJJJIL);
            sbLIZ.append(", url = ");
            sbLIZ.append(str);
            C201955140j.LIZLLL(c554890LpX, "OnThisDayVideoPreviewScene", C2188811AlT.LIZIZ(sbLIZ));
            if (str != null) {
                C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(C1383370m6R.LIZ, str);
                c1292030jj7LJIIJJI.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0JEa
                    @Override // X.InterfaceC1292040jj8
                    public final void onResult(Object obj) {
                        C1294720jnS c1294720jnS = (C1294720jnS) obj;
                        if (c1294720jnS == null) {
                            C201955140j.LIZLLL(C554890LpX.LIZIZ, "OnThisDayVideoPreviewScene", "play loading lottie, composition is null");
                            return;
                        }
                        C201955140j.LIZLLL(C554890LpX.LIZIZ, "OnThisDayVideoPreviewScene", "play loading lottie, start");
                        C1295960jpS c1295960jpS = this.LL.LLJZIJLIL;
                        if (c1295960jpS == null) {
                            return;
                        }
                        C786410Ut5.LJLLLLLL(0, c1295960jpS);
                        c1295960jpS.setComposition(c1294720jnS);
                        c1295960jpS.playAnimation();
                    }
                });
                c1292030jj7LJIIJJI.LIZ(new InterfaceC1292040jj8() { // from class: X.0MQH
                    @Override // X.InterfaceC1292040jj8
                    public final void onResult(Object obj) {
                        C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("play loading lottie, addFailureListener, e = ");
                        sbLIZ2.append(obj);
                        C537680L6w.LIZ(c554890LpX2, "OnThisDayVideoPreviewScene", C2188811AlT.LIZIZ(sbLIZ2), null);
                    }
                });
            }
            LLLLLILLIL(false);
            ViewPager viewPager = this.LLJJIJIL;
            if (viewPager != null) {
                C368610Ecl.LIZIZ(viewPager);
                return;
            }
            return;
        }
        CreativeDialogWrapper creativeDialogWrapper = this.LLLII;
        if (creativeDialogWrapper == null) {
            return;
        }
        creativeDialogWrapper.show();
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.BaseOnThisDayPreviewScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.en0, viewGroup, false);
    }

    @Override // X.AbstractC214814194y
    public final boolean onInterceptActivityResult(int i, int i2, Intent intent) {
        Iterator it2 = ((ArrayList) this.LLLI).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
