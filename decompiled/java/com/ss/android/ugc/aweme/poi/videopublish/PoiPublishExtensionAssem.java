package com.ss.android.ugc.aweme.poi.videopublish;

import X.AbstractC1200170hKx;
import X.AbstractC1201400hMw;
import X.AbstractC20627515nd;
import X.AbstractC20628015ni;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C09RD;
import X.C0C64;
import X.C0CZT;
import X.C0QSJ;
import X.C0XF1;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1194630hC1;
import X.C1197920hHK;
import X.C1198600hIQ;
import X.C1198840hIo;
import X.C1199110hJF;
import X.C1199400hJi;
import X.C1199940hKa;
import X.C1199950hKb;
import X.C1199960hKc;
import X.C11VU;
import X.C1200000hKg;
import X.C1200200hL0;
import X.C1200260hL6;
import X.C1200270hL7;
import X.C1200280hL8;
import X.C1200430hLN;
import X.C1200530hLX;
import X.C1207340hWW;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1220000hqw;
import X.C127L;
import X.C12827050f;
import X.C1388190mED;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1541950qED;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C20136513qd;
import X.C20600815jK;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C23250099c;
import X.C23271099x;
import X.C2344009Gk;
import X.C262350APx;
import X.C289340BVs;
import X.C290950Ban;
import X.C297510BlN;
import X.C300190Bph;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C444910HcX;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C769700UHg;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1200180hKy;
import X.EnumC1205470hTV;
import X.InterfaceC1146704e9;
import X.InterfaceC1199830hKP;
import X.InterfaceC1199990hKf;
import X.InterfaceC1200240hL4;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterpolatorC21388318n3;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AAListenerS270S0200000_18;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS87S0200000_18;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.creative.model.poi.PoiPublishInfoModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.experiment.AddLocationGpsAuthGuideExperiment;
import com.ss.android.ugc.aweme.poi.experiment.PoiExpandScopeMetaDataExp;
import com.ss.android.ugc.aweme.poi.experiment.PoiPostGenPolicyConfig;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;
import com.ss.android.ugc.aweme.poi.videopublish.eventtrack.PoiPublishCreationProvider;
import com.ss.android.ugc.aweme.poi.videopublish.eventtrack.PoiPublishPoiDetailProvider;
import com.ss.android.ugc.aweme.poi.videopublish.rcmdcell.PoiPublishUiOptExperiment;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.publish.IPublishOptionCustomViewFactory;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishExtensionAssem extends UIContentAssem implements IPoiPublishUpdateUiStatusAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final int LLJLLL;
    public static final int LLJZ;
    public View LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C736950SvV LLJI;
    public final C01GW LLJIJIL;
    public View LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C1559260qg8 LLJJIJIL;
    public int LLJJJ;
    public AbstractC1200170hKx LLJJJIL;
    public final AnchorLock$IAnchorStateService LLJJJJ;
    public final C1200280hL8 LLJJJJJIL;
    public EnumC1200180hKy LLJJJJLIIL;
    public final C20136513qd LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public PoiPublishCreationProvider LLJL;
    public PoiPublishPoiDetailProvider LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiPublishExtensionAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/videopublish/PoiPublishExtensionVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR = new C2217371BqR(PoiPublishExtensionAssem.class, "addLocationCellShowTs", "getAddLocationCellShowTs()J", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217371BqR};
        LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(236));
        LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(182));
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PoiPublishExtensionScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiPublishExtensionScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiPublishExtensionScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public PoiPublishExtensionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiPublishExtensionVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2083), AFwS256S0000000_18.get$arr$(723), null, true);
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(548);
        this.LLJI = new C736950SvV(C13LE.LIZ(PoiSearchVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(724), new AwS562S0100000_18((AbstractC738140SxQ) this, 2085), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(549));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2081));
        this.LLJILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2080));
        this.LLJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2079));
        this.LLJJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2086));
        this.LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2084));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2087));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2082));
        this.LLJJIJIL = new C1559260qg8(new C723590SZx(this, C1200260hL6.class, "PoiPublishExtensionDataV2"), checkSupervisorPrepared());
        this.LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        this.LLJJJJ = (AnchorLock$IAnchorStateService) ServiceManager.get().getService(AnchorLock$IAnchorStateService.class);
        this.LLJJJJJIL = C1199950hKb.LIZ();
        C769700UHg.LIZ.getClass();
        this.LLJJL = new C20136513qd();
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJLILLLLZIIL = true;
    }

    public final C1200260hL6 Zo() {
        return (C1200260hL6) this.LLJJIJIL.getValue();
    }

    public final LinearLayout ap() {
        return (LinearLayout) this.LLJJIJI.getValue();
    }

    public final InterfaceC1200240hL4 bp() {
        return (InterfaceC1200240hL4) this.LLJILJILJ.getValue();
    }

    public final IAVPublishPageUIRefactorService cp() {
        return (IAVPublishPageUIRefactorService) this.LLJIJIL.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv dp() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJIIJIL.getValue();
    }

    public final PoiPublishExtensionVM ip() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (PoiPublishExtensionVM) assemVMLazy.getValue();
    }

    public final boolean So() {
        if (!C300190Bph.LIZ()) {
            return true;
        }
        ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
        EnumC1205470hTV enumC1205470hTVLIZ = null;
        if (iLocationServiceForLS != null) {
            View view = this.LLIZLLLIL;
            enumC1205470hTVLIZ = iLocationServiceForLS.LIZ((view != null ? view : null).getContext(), C1198600hIQ.LIZJ(), "video_post_page");
        }
        return enumC1205470hTVLIZ == EnumC1205470hTV.SUCCESS;
    }

    public final String hp() {
        Resources resources;
        int i = C297510BlN.LIZ() ? 2131857068 : 2131844832;
        if (((Boolean) C262350APx.LIZ.getValue()).booleanValue() && !C297510BlN.LIZ()) {
            i = 2131829760;
        }
        View view = this.LLIZLLLIL;
        if (view == null) {
            view = null;
        }
        Context context = view.getContext();
        if (context == null || (resources = context.getResources()) == null) {
            return null;
        }
        return resources.getString(i);
    }

    public final boolean mp() {
        if (!C300190Bph.LIZ()) {
            C1207340hWW.LIZ.getClass();
            return C1207340hWW.LJI("poi", "add_location");
        }
        ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
        EnumC1205470hTV enumC1205470hTVLIZ = null;
        if (iLocationServiceForLS != null) {
            View view = this.LLIZLLLIL;
            if (view == null) {
                view = null;
            }
            Context context = view.getContext();
            TokenCert tokenCertLIZJ = C1198600hIQ.LIZJ();
            AbstractC1200170hKx abstractC1200170hKx = this.LLJJJIL;
            enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(context, tokenCertLIZJ, (abstractC1200170hKx != null ? abstractC1200170hKx : null).LIZJ());
        }
        return enumC1205470hTVLIZ == EnumC1205470hTV.SUCCESS;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((InterfaceC1199830hKP) ip().LLJILJIL.getValue().getOperator()).LJJJI();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null), IPoiPublishUpdateUiStatusAbility.class, null);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PoiPublishCreationProvider poiPublishCreationProvider = this.LLJL;
        if (poiPublishCreationProvider != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PoiPublishCreationProvider.class, poiPublishCreationProvider);
        }
        PoiPublishPoiDetailProvider poiPublishPoiDetailProvider = this.LLJLIL;
        if (poiPublishPoiDetailProvider != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PoiPublishPoiDetailProvider.class, poiPublishPoiDetailProvider);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp = dp();
        if (viewOnAttachStateChangeListenerC20604515jvDp != null) {
            C2211751BhN.LIZIZ(viewOnAttachStateChangeListenerC20604515jvDp);
        }
        ip().LLJJIII = 0;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
    }

    public final View.OnClickListener Go(EnumC1200180hKy enumC1200180hKy) {
        int i = C1200200hL0.LIZ[enumC1200180hKy.ordinal()];
        if (i != 1) {
            if (i != 4) {
                if (i != 10) {
                    if (i != 11) {
                        return null;
                    }
                    return new ACListenerS153S0100000_18(this, 113);
                }
                return new ACListenerS153S0100000_18(this, 115);
            }
            return new ACListenerS153S0100000_18(this, 114);
        }
        return new AbS699S0100000_18(this, 34);
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiPublishUpdateUiStatusAbility
    public final void NO(View view) {
        if (view instanceof AbstractC20627515nd) {
            if (this.LLJJJJLIIL == EnumC1200180hKy.STATUS_POI_REFRESHING) {
                ((AbstractC20628015ni) view).setLoading(true);
                view.invalidate();
                return;
            }
            AbstractC20628015ni abstractC20628015ni = (AbstractC20628015ni) view;
            if (!abstractC20628015ni.LIZJ()) {
                return;
            }
            abstractC20628015ni.setLoading(false);
            view.invalidate();
        }
    }

    public final void Vo(Function0<Unit> function0) {
        final boolean zBooleanValue;
        long j;
        PoiPublishUiOptExperiment.Config config = PoiPublishUiOptExperiment.LIZ;
        Boolean bool = PoiPublishUiOptExperiment.LIZ.poiPublishAnimationOpt;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        if (Zo().LLILLJJLI.isImageNewStyleUi()) {
            j = 0;
        } else if (zBooleanValue) {
            j = 200;
        } else {
            j = 400;
        }
        valueAnimator.setDuration(j);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        if (zBooleanValue) {
            valueAnimator.setInterpolator(new InterpolatorC21388318n3() { // from class: X.18n1
                {
                    PointF pointF = this.LIZIZ;
                    pointF.x = 0.25f;
                    pointF.y = 0.0f;
                    PointF pointF2 = this.LIZJ;
                    pointF2.x = 0.25f;
                    pointF2.y = 1.0f;
                }
            });
        }
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0hL3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LinearLayout linearLayoutAp;
                ViewGroup.LayoutParams layoutParams;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp;
                if (zBooleanValue) {
                    LinearLayout linearLayoutAp2 = this.ap();
                    if (linearLayoutAp2 != null) {
                        PoiPublishExtensionAssem poiPublishExtensionAssem = this;
                        ViewGroup.LayoutParams layoutParams2 = linearLayoutAp2.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = (int) (valueAnimator2.getAnimatedFraction() * poiPublishExtensionAssem.LLJJJ);
                        }
                        C786410Ut5.W4(linearLayoutAp2, valueAnimator2.getAnimatedFraction());
                    }
                    if (valueAnimator2.getAnimatedFraction() >= 0.01d && (viewOnAttachStateChangeListenerC20604515jvDp = this.dp()) != null) {
                        C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jvDp);
                    }
                } else {
                    if (valueAnimator2.getAnimatedFraction() <= 0.75f && (linearLayoutAp = this.ap()) != null && (layoutParams = linearLayoutAp.getLayoutParams()) != null) {
                        layoutParams.height = (int) (((valueAnimator2.getAnimatedFraction() * this.LLJJJ) * 4) / 3);
                    }
                    if (valueAnimator2.getAnimatedFraction() > 0.25f) {
                        LinearLayout linearLayoutAp3 = this.ap();
                        if (linearLayoutAp3 != null) {
                            C786410Ut5.W4(linearLayoutAp3, ((valueAnimator2.getAnimatedFraction() - 0.25f) * 4) / 3);
                        }
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp2 = this.dp();
                        if (viewOnAttachStateChangeListenerC20604515jvDp2 != null) {
                            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jvDp2);
                        }
                    }
                }
                LinearLayout linearLayoutAp4 = this.ap();
                if (linearLayoutAp4 != null) {
                    linearLayoutAp4.requestLayout();
                }
            }
        });
        valueAnimator.addListener(new AAListenerS270S0200000_18(this, function0, 0));
        valueAnimator.start();
    }

    public final C444910HcX ep(String str) {
        C444910HcX c444910HcX = new C444910HcX(str);
        c444910HcX.LIZ(42);
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorServiceCp = cp();
        if (iAVPublishPageUIRefactorServiceCp != null && iAVPublishPageUIRefactorServiceCp.enableRefactorPublishUI()) {
            c444910HcX.LIZ(42);
        }
        return c444910HcX;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem for r22v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem.onViewCreated(android.view.View):void");
    }

    public final void sp(boolean z) {
        if (dp() == null) {
            return;
        }
        for (View view : new C09RD(dp())) {
            if (view instanceof AbstractC20627515nd) {
                ((AbstractC20628015ni) view).setLoading(z);
                view.invalidate();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object up(X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem.up(X.05Vn):java.lang.Object");
    }

    public final void yp(Boolean bool) {
        boolean z;
        PoiExpandScopeMetaDataExp.LIZ.getClass();
        if (((PoiExpandScopeMetaDataExp.MetadataConfig) PoiExpandScopeMetaDataExp.LIZJ.getValue()).showMetaDisclaimerPanel) {
            return;
        }
        if (!PoiPostGenPolicyConfig.LIZ() && Intrinsics.LJFF(bool, Boolean.TRUE)) {
            z = false;
        } else {
            z = true;
        }
        InterfaceC1200240hL4 interfaceC1200240hL4Bp = bp();
        AbstractC1200170hKx abstractC1200170hKx = this.LLJJJIL;
        if (abstractC1200170hKx == null) {
            abstractC1200170hKx = null;
        }
        interfaceC1200240hL4Bp.LLJJIJIIJIL(abstractC1200170hKx.LIZJ(), z);
    }

    public final void zp(boolean z) {
        C127L c127l;
        TuxTextView titleTvFromXml;
        ConstraintLayout constraintLayout;
        int iLIZIZ;
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorServiceCp = cp();
        if (iAVPublishPageUIRefactorServiceCp != null && iAVPublishPageUIRefactorServiceCp.isRefactorPublishPoiOption()) {
            InterfaceC1200240hL4 interfaceC1200240hL4Bp = bp();
            if ((interfaceC1200240hL4Bp instanceof C127L) && (c127l = (C127L) interfaceC1200240hL4Bp) != null && (titleTvFromXml = c127l.getTitleTvFromXml()) != null) {
                int iLJ = C11VU.LJ(getContext());
                int width = titleTvFromXml.getWidth();
                int iLIZIZ2 = (((iLJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                if (!z) {
                    titleTvFromXml.setSingleLine(true);
                    titleTvFromXml.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(124)) + iLIZIZ2);
                } else {
                    titleTvFromXml.setSingleLine(false);
                    titleTvFromXml.setMaxLines(2);
                    titleTvFromXml.setMaxWidth(iLIZIZ2);
                }
                View view = this.LLJILJIL;
                if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                    if (width < iLIZIZ2) {
                        iLIZIZ = (iLIZIZ2 - width) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                    }
                    constraintLayout.setMaxWidth(iLIZIZ);
                }
            }
        }
    }

    public final void Ho(boolean z, C1200260hL6 c1200260hL6) {
        PoiPublishInfoModel poiPublishInfoModel;
        View cellContainer;
        CharSequence text;
        String string;
        ExtensionMisc extensionMisc;
        if (c1200260hL6 != null && (extensionMisc = c1200260hL6.LLILLJJLI) != null) {
            poiPublishInfoModel = extensionMisc.poiPublishModel;
        } else {
            poiPublishInfoModel = null;
        }
        if (!C289340BVs.LIZ(poiPublishInfoModel)) {
            TuxIconView tuxIconViewLLJLL = bp().LLJLL();
            if (tuxIconViewLLJLL != null) {
                C786410Ut5.I7(new AbS699S0100000_18(this, 35), tuxIconViewLLJLL);
            }
            bp().setShowArrow(false);
            IAVPublishPageUIRefactorService iAVPublishPageUIRefactorServiceCp = cp();
            if (iAVPublishPageUIRefactorServiceCp != null && iAVPublishPageUIRefactorServiceCp.isRefactorPublishPoiOption()) {
                View view = this.LLJILJIL;
                if (view != null) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.tv_title);
                    if (appCompatTextView != null) {
                        text = appCompatTextView.getText();
                    } else {
                        text = null;
                    }
                    Context context = getContext();
                    if (context != null) {
                        if (text != null) {
                            string = text.toString();
                        } else {
                            string = null;
                        }
                        this.LLJILJIL = No(context, string, false, null);
                        bp().setCustomView(this.LLJILJIL);
                    }
                }
                View view2 = this.LLJILJIL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                View view3 = this.LLJILJIL;
                if (view3 != null) {
                    HandlerHook.viewPost(view3, new ARunnableS87S0200000_18(view3, this, 15));
                }
                View cellContainer2 = bp().getCellContainer();
                if (cellContainer2 != null) {
                    C426750GoL.LJIIL(cellContainer2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 26);
                    return;
                }
                return;
            }
            View view4 = this.LLJILJIL;
            if (view4 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, view4);
            return;
        }
        if (z) {
            bp().setShowArrow(true);
            View view5 = this.LLJILJIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            View cellContainer3 = bp().getCellContainer();
            if (cellContainer3 != null) {
                C426750GoL.LJIIL(cellContainer3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 26);
            }
            IAVPublishPageUIRefactorService iAVPublishPageUIRefactorServiceCp2 = cp();
            if (iAVPublishPageUIRefactorServiceCp2 != null && iAVPublishPageUIRefactorServiceCp2.isRefactorPublishPoiOption() && (cellContainer = bp().getCellContainer()) != null) {
                HandlerHook.viewPost(cellContainer, new ARunnableS87S0200000_18(cellContainer, this, 16));
                return;
            }
            return;
        }
        bp().setShowArrow(false);
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorServiceCp3 = cp();
        if (iAVPublishPageUIRefactorServiceCp3 != null && iAVPublishPageUIRefactorServiceCp3.isRefactorPublishPoiOption()) {
            View view6 = this.LLJILJIL;
            if (view6 != null) {
                HandlerHook.viewPost(view6, new ARunnableS87S0200000_18(view6, this, 17));
            }
            View cellContainer4 = bp().getCellContainer();
            if (cellContainer4 == null) {
                return;
            }
            C426750GoL.LJIIL(cellContainer4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 26);
            return;
        }
        View view7 = this.LLJILJIL;
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(0, view7);
        }
        View cellContainer5 = bp().getCellContainer();
        if (cellContainer5 == null) {
            return;
        }
        C426750GoL.LJIIL(cellContainer5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 26);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lp(com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiSearchResultWrapper r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem.lp(com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PoiSearchResultWrapper, X.05Vn):java.lang.Object");
    }

    public final void Ap(EnumC1200180hKy enumC1200180hKy, boolean z, Function0<Unit> function0) {
        boolean z2;
        EnumC1200180hKy enumC1200180hKy2;
        String string;
        String string2;
        String string3;
        C20600815jK<InterfaceC1891350zJl> state;
        List<InterfaceC1891350zJl> listLJII;
        String string4;
        Resources resources;
        String string5;
        Resources resources2;
        String string6;
        LinearLayout linearLayoutAp;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateUiVisibility] status=");
        sbLIZ.append(enumC1200180hKy);
        C2188811AlT.LIZIZ(sbLIZ);
        TuxIconView tuxIconViewLLJLL = bp().LLJLL();
        if (tuxIconViewLLJLL != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 116), tuxIconViewLLJLL);
        }
        View subtitleTv = bp().getSubtitleTv();
        AbstractC1200170hKx abstractC1200170hKx = null;
        String string7 = null;
        if (subtitleTv != null) {
            C786410Ut5.I7(null, subtitleTv);
        }
        View subtitleContainer = bp().getSubtitleContainer();
        if (subtitleContainer != null) {
            C786410Ut5.I7(null, subtitleContainer);
        }
        View subtitleIcon = bp().getSubtitleIcon();
        if (subtitleIcon != null) {
            C786410Ut5.LJLLLLLL(8, subtitleIcon);
        }
        if (PoiPostGenPolicyConfig.LIZ() && enumC1200180hKy != EnumC1200180hKy.STATUS_POI_SELECTED) {
            InterfaceC1200240hL4 interfaceC1200240hL4Bp = bp();
            AbstractC1200170hKx abstractC1200170hKx2 = this.LLJJJIL;
            if (abstractC1200170hKx2 == null) {
                abstractC1200170hKx2 = null;
            }
            interfaceC1200240hL4Bp.LLJJIJIIJIL(abstractC1200170hKx2.LIZJ(), true);
        } else {
            InterfaceC1200240hL4 interfaceC1200240hL4Bp2 = bp();
            AbstractC1200170hKx abstractC1200170hKx3 = this.LLJJJIL;
            if (abstractC1200170hKx3 == null) {
                abstractC1200170hKx3 = null;
            }
            interfaceC1200240hL4Bp2.LLJJIJIIJIL(abstractC1200170hKx3.LIZJ(), false);
        }
        AddLocationGpsAuthGuideExperiment.LIZ.getClass();
        boolean zLJFF = Intrinsics.LJFF(Boolean.TRUE, AddLocationGpsAuthGuideExperiment.LIZIZ.addFindNearbyPlacesInPostPage);
        C1198840hIo c1198840hIo = new AbstractC1201400hMw() { // from class: X.0hIo
            @Override // X.AbstractC1201400hMw
            public final long LIZJ() {
                return 0L;
            }

            @Override // X.AbstractC1201400hMw
            public final String LIZLLL() {
                return "add_location_gps_auth_guide";
            }

            @Override // X.AbstractC1201400hMw
            public final int LJ() {
                AddLocationGpsAuthGuideExperiment.LIZ.getClass();
                Integer num = AddLocationGpsAuthGuideExperiment.LIZIZ.addFindNearbyPlacesShowTimes;
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            }
        };
        boolean z3 = !c1198840hIo.LIZIZ();
        boolean z4 = !this.LLJJJJJIL.LIZJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkIfShowFindNearbyPlaces showFindNearbyPlaces=");
        sbLIZ2.append(zLJFF);
        sbLIZ2.append(", notHitFrequency=");
        sbLIZ2.append(z3);
        sbLIZ2.append(", notGpsGranted=");
        sbLIZ2.append(z4);
        sbLIZ2.append(", uiStatus=");
        sbLIZ2.append(enumC1200180hKy);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (zLJFF && z3 && z4 && So()) {
            z2 = true;
        } else {
            z2 = false;
        }
        EnumC1200180hKy enumC1200180hKy3 = EnumC1200180hKy.STATUS_POI_ERROR;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(EnumC1200180hKy.STATUS_POI_LIST_SHOW, enumC1200180hKy3);
        if (z2 && listLJIILJJIL.contains(enumC1200180hKy)) {
            enumC1200180hKy2 = EnumC1200180hKy.STATUS_FIND_NEARBY_PLACES;
        } else {
            enumC1200180hKy2 = enumC1200180hKy;
        }
        C0CZT.LIZ.getClass();
        if (C0CZT.LIZ() && !C1200430hLN.LIZIZ.LIZIZ() && C290950Ban.LIZ() && enumC1200180hKy == enumC1200180hKy3) {
            enumC1200180hKy2 = EnumC1200180hKy.STATUS_AGE_GRADUATION_REMINDER;
        }
        switch (C1200200hL0.LIZ[enumC1200180hKy2.ordinal()]) {
            case 1:
                Ho(true, null);
                LinearLayout linearLayoutAp2 = ap();
                if (linearLayoutAp2 != null) {
                    C786410Ut5.LJZL(8, linearLayoutAp2);
                }
                c1198840hIo.LJI(true);
                C1185430gxB.LIZ.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "video_post_page");
                C20684815ws.LJIILLIIL("location_guide_text_show", linkedHashMap);
                InterfaceC1200240hL4 interfaceC1200240hL4Bp3 = bp();
                Context context = getContext();
                if (context != null) {
                    string7 = context.getString(2131824966);
                }
                interfaceC1200240hL4Bp3.setSubtitle(string7);
                TuxIconView tuxIconViewLLJLL2 = bp().LLJLL();
                if (tuxIconViewLLJLL2 != null) {
                    C786410Ut5.I7((View.OnClickListener) this.LLJJIII.getValue(), tuxIconViewLLJLL2);
                }
                View subtitleTv2 = bp().getSubtitleTv();
                if (subtitleTv2 != null) {
                    C786410Ut5.I7((View.OnClickListener) this.LLJJIII.getValue(), subtitleTv2);
                }
                break;
            case 2:
                Ho(true, null);
                LinearLayout linearLayoutAp3 = ap();
                if (linearLayoutAp3 != null) {
                    C786410Ut5.LJZL(8, linearLayoutAp3);
                }
                InterfaceC1200240hL4 interfaceC1200240hL4Bp4 = bp();
                Context context2 = getContext();
                if (context2 != null) {
                    string6 = context2.getString(2131844757);
                } else {
                    string6 = null;
                }
                interfaceC1200240hL4Bp4.setSubtitle(string6);
                View subtitleTv3 = bp().getSubtitleTv();
                if (subtitleTv3 != null) {
                    C427690Gpr.LJI(subtitleTv3, null);
                }
                View subtitleTv4 = bp().getSubtitleTv();
                if (subtitleTv4 != null) {
                    C786410Ut5.I7((View.OnClickListener) this.LLJJ.getValue(), subtitleTv4);
                }
                break;
            case 3:
                Ho(true, null);
                InterfaceC1200240hL4 interfaceC1200240hL4Bp5 = bp();
                Context context3 = getContext();
                if (context3 != null && (resources2 = context3.getResources()) != null) {
                    string5 = resources2.getString(2131825252);
                } else {
                    string5 = null;
                }
                interfaceC1200240hL4Bp5.setSubtitle(string5);
                LinearLayout linearLayoutAp4 = ap();
                if (linearLayoutAp4 != null) {
                    C786410Ut5.LJZL(8, linearLayoutAp4);
                }
                C1200430hLN.LIZIZ.LJI(true);
                View subtitleTv5 = bp().getSubtitleTv();
                if (subtitleTv5 != null) {
                    C427690Gpr.LJI(subtitleTv5, null);
                }
                View subtitleTv6 = bp().getSubtitleTv();
                if (subtitleTv6 != null) {
                    C786410Ut5.I7(new ACListenerS153S0100000_18(this, 117), subtitleTv6);
                }
                break;
            case 4:
                Ho(true, null);
                LinearLayout linearLayoutAp5 = ap();
                if (linearLayoutAp5 != null) {
                    C786410Ut5.LJZL(8, linearLayoutAp5);
                }
                if (mp()) {
                    InterfaceC1200240hL4 interfaceC1200240hL4Bp6 = bp();
                    Context context4 = getContext();
                    if (context4 != null && (resources = context4.getResources()) != null) {
                        string4 = resources.getString(2131829994);
                    } else {
                        string4 = null;
                    }
                    interfaceC1200240hL4Bp6.setSubtitle(string4);
                    C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                    AbstractC1200170hKx abstractC1200170hKx4 = this.LLJJJIL;
                    if (abstractC1200170hKx4 == null) {
                        abstractC1200170hKx4 = null;
                    }
                    String strLIZJ = abstractC1200170hKx4.LIZJ();
                    Map<String, String> map = C1200270hL7.LIZ(Zo()).LL;
                    c1185430gxB.getClass();
                    C1185430gxB.LJJIIJZLJL(strLIZJ, "turn_on_location", map);
                    View subtitleTv7 = bp().getSubtitleTv();
                    if (subtitleTv7 != null) {
                        C427690Gpr.LJI(subtitleTv7, null);
                    }
                    View subtitleTv8 = bp().getSubtitleTv();
                    if (subtitleTv8 != null) {
                        C786410Ut5.I7((View.OnClickListener) this.LLJILLL.getValue(), subtitleTv8);
                    }
                }
                break;
            case 5:
                PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapperLIZ = ip().getState().LL.LIZ();
                if (dp().getState().LJIIIIZZ() == 0) {
                    Jo(poiSearchResultWrapperLIZ, false, true, "enter_page");
                } else {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp = dp();
                    if (viewOnAttachStateChangeListenerC20604515jvDp != null && (state = viewOnAttachStateChangeListenerC20604515jvDp.getState()) != null && (listLJII = state.LJII()) != null && !listLJII.isEmpty()) {
                        Jo(poiSearchResultWrapperLIZ, false, false, "exit_search");
                    }
                    Ho(true, null);
                    yp(ip().getState().LLILLL);
                    PoiExpandScopeMetaDataExp.LIZ.getClass();
                    if (((PoiExpandScopeMetaDataExp.MetadataConfig) PoiExpandScopeMetaDataExp.LIZJ.getValue()).showMetaDisclaimerPanel) {
                        InterfaceC1200240hL4 interfaceC1200240hL4Bp7 = bp();
                        AbstractC1200170hKx abstractC1200170hKx5 = this.LLJJJIL;
                        if (abstractC1200170hKx5 == null) {
                            abstractC1200170hKx5 = null;
                        }
                        interfaceC1200240hL4Bp7.LLJJIJIIJIL(abstractC1200170hKx5.LIZJ(), true);
                    }
                    bp().setSubtitle(null);
                    if (this.LLJJJJ.LIZJ(2)) {
                        if (!z) {
                            Vo(function0);
                        } else {
                            HandlerHook.viewPostDelay(bp().getProvideView(), new ARunnableS87S0200000_18(this, function0, 18), 0L);
                        }
                    }
                }
                break;
            case 6:
                Ho(true, null);
                yp(ip().getState().LLILLL);
                PoiExpandScopeMetaDataExp.LIZ.getClass();
                if (((PoiExpandScopeMetaDataExp.MetadataConfig) PoiExpandScopeMetaDataExp.LIZJ.getValue()).showMetaDisclaimerPanel) {
                    InterfaceC1200240hL4 interfaceC1200240hL4Bp8 = bp();
                    AbstractC1200170hKx abstractC1200170hKx6 = this.LLJJJIL;
                    if (abstractC1200170hKx6 == null) {
                        abstractC1200170hKx6 = null;
                    }
                    interfaceC1200240hL4Bp8.LLJJIJIIJIL(abstractC1200170hKx6.LIZJ(), true);
                }
                bp().setSubtitle(null);
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp2 = dp();
                if (viewOnAttachStateChangeListenerC20604515jvDp2 != null) {
                    viewOnAttachStateChangeListenerC20604515jvDp2.scrollToPosition(0);
                }
                sp(false);
                break;
            case 7:
                Ho(false, Zo());
                Boolean bool = PoiPostGenPolicyConfig.LIZ.showRuleBanner;
                if (bool != null && bool.booleanValue() && !new AbstractC1201400hMw() { // from class: X.0hLM
                    @Override // X.AbstractC1201400hMw
                    public final long LIZJ() {
                        return 0L;
                    }

                    @Override // X.AbstractC1201400hMw
                    public final String LIZLLL() {
                        return "poi_publish_gen_show_subtitle";
                    }

                    @Override // X.AbstractC1201400hMw
                    public final int LJ() {
                        return 1;
                    }
                }.LIZIZ()) {
                    InterfaceC1200240hL4 interfaceC1200240hL4Bp9 = bp();
                    Context context5 = getContext();
                    if (context5 != null) {
                        string3 = context5.getString(2131857062);
                    } else {
                        string3 = null;
                    }
                    interfaceC1200240hL4Bp9.setSubtitle(string3);
                    View subtitleIcon2 = bp().getSubtitleIcon();
                    if (subtitleIcon2 != null) {
                        C786410Ut5.LJLLLLLL(0, subtitleIcon2);
                    }
                    View subtitleContainer2 = bp().getSubtitleContainer();
                    if (subtitleContainer2 != null) {
                        C427690Gpr.LJI(subtitleContainer2, null);
                    }
                    View subtitleTv9 = bp().getSubtitleTv();
                    if (subtitleTv9 != null) {
                        subtitleTv9.setClickable(false);
                    }
                    View subtitleTv10 = bp().getSubtitleTv();
                    if (subtitleTv10 != null) {
                        subtitleTv10.setOnTouchListener(null);
                    }
                    View subtitleContainer3 = bp().getSubtitleContainer();
                    if (subtitleContainer3 != null) {
                        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 118), subtitleContainer3);
                    }
                    new AbstractC1201400hMw() { // from class: X.0hLM
                        @Override // X.AbstractC1201400hMw
                        public final long LIZJ() {
                            return 0L;
                        }

                        @Override // X.AbstractC1201400hMw
                        public final String LIZLLL() {
                            return "poi_publish_gen_show_subtitle";
                        }

                        @Override // X.AbstractC1201400hMw
                        public final int LJ() {
                            return 1;
                        }
                    }.LJI(true);
                    C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
                    AbstractC1200170hKx abstractC1200170hKx7 = this.LLJJJIL;
                    if (abstractC1200170hKx7 == null) {
                        abstractC1200170hKx7 = null;
                    }
                    String strLIZJ2 = abstractC1200170hKx7.LIZJ();
                    c1185430gxB2.getClass();
                    C1185430gxB.LJJIIJZLJL(strLIZJ2, "policy_banner", null);
                } else {
                    bp().setSubtitle(null);
                    View subtitleIcon3 = bp().getSubtitleIcon();
                    if (subtitleIcon3 != null) {
                        C786410Ut5.LJLLLLLL(8, subtitleIcon3);
                    }
                }
                LinearLayout linearLayoutAp6 = ap();
                if (linearLayoutAp6 != null) {
                    C786410Ut5.LJZL(8, linearLayoutAp6);
                }
                break;
            case 8:
                Ho(true, null);
                bp().setSubtitle(null);
                LinearLayout linearLayoutAp7 = ap();
                if (linearLayoutAp7 != null) {
                    C786410Ut5.LJZL(0, linearLayoutAp7);
                }
                sp(true);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                Ho(true, null);
                bp().setSubtitle(null);
                LinearLayout linearLayoutAp8 = ap();
                if (linearLayoutAp8 != null) {
                    C786410Ut5.LJZL(8, linearLayoutAp8);
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                Ho(true, null);
                LinearLayout linearLayoutAp9 = ap();
                if (linearLayoutAp9 != null) {
                    C786410Ut5.LJZL(8, linearLayoutAp9);
                }
                InterfaceC1200240hL4 interfaceC1200240hL4Bp10 = bp();
                Context context6 = getContext();
                if (context6 != null) {
                    string2 = context6.getString(2131844693);
                } else {
                    string2 = null;
                }
                interfaceC1200240hL4Bp10.setSubtitle(string2);
                C1185430gxB c1185430gxB3 = C1185430gxB.LIZ;
                AbstractC1200170hKx abstractC1200170hKx8 = this.LLJJJIL;
                if (abstractC1200170hKx8 == null) {
                    abstractC1200170hKx8 = null;
                }
                String strLIZJ3 = abstractC1200170hKx8.LIZJ();
                Map<String, String> map2 = C1200270hL7.LIZ(Zo()).LL;
                c1185430gxB3.getClass();
                C1185430gxB.LJJIIJZLJL(strLIZJ3, "try_search", map2);
                View subtitleTv11 = bp().getSubtitleTv();
                if (subtitleTv11 != null) {
                    C427690Gpr.LJI(subtitleTv11, null);
                }
                View subtitleTv12 = bp().getSubtitleTv();
                if (subtitleTv12 != null) {
                    C786410Ut5.I7((View.OnClickListener) this.LLJJ.getValue(), subtitleTv12);
                }
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                Ho(true, null);
                LinearLayout linearLayoutAp10 = ap();
                if (linearLayoutAp10 != null) {
                    C786410Ut5.LJZL(8, linearLayoutAp10);
                }
                if (mp()) {
                    InterfaceC1200240hL4 interfaceC1200240hL4Bp11 = bp();
                    Context context7 = getContext();
                    if (context7 != null) {
                        string = context7.getString(2131828347);
                    } else {
                        string = null;
                    }
                    interfaceC1200240hL4Bp11.setSubtitle(string);
                    View subtitleTv13 = bp().getSubtitleTv();
                    if (subtitleTv13 != null) {
                        subtitleTv13.setClickable(false);
                    }
                    TuxIconView tuxIconViewLLJLL3 = bp().LLJLL();
                    if (tuxIconViewLLJLL3 != null) {
                        C786410Ut5.I7((View.OnClickListener) this.LLJJI.getValue(), tuxIconViewLLJLL3);
                    }
                    C1185430gxB c1185430gxB4 = C1185430gxB.LIZ;
                    AbstractC1200170hKx abstractC1200170hKx9 = this.LLJJJIL;
                    if (abstractC1200170hKx9 != null) {
                        abstractC1200170hKx = abstractC1200170hKx9;
                    }
                    String strLIZJ4 = abstractC1200170hKx.LIZJ();
                    Map<String, String> map3 = C1200270hL7.LIZ(Zo()).LL;
                    c1185430gxB4.getClass();
                    C1185430gxB.LJJIIJZLJL(strLIZJ4, "tap_here_for_suggestions", map3);
                }
                break;
            default:
                throw new C1954807lC();
        }
        if (Zo().LLILLJJLI.isImageMode() && (linearLayoutAp = ap()) != null && linearLayoutAp.getVisibility() == 0) {
            C426750GoL.LJIIL(bp().getProvideView().findViewById(R.id.y0w), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 23);
        }
        this.LLJJJJLIIL = enumC1200180hKy2;
    }

    public final void kp(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, boolean z, String str) {
        boolean zLJIILIIL;
        List<PoiData> list;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        if (poiSearchResultWrapper != null) {
            zLJIILIIL = poiSearchResultWrapper.LJIILIIL();
        } else {
            zLJIILIIL = false;
        }
        Integer numValueOf = null;
        AbstractC1200170hKx abstractC1200170hKx = null;
        View view = null;
        if (poiSearchResultWrapper != null && (poiSearchResult = poiSearchResultWrapper.poiSearchResult) != null) {
            list = poiSearchResult.poiList;
        } else {
            list = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handlePoiResult, success=");
        sbLIZ.append(zLJIILIIL);
        sbLIZ.append(", poilist=");
        sbLIZ.append(list);
        C2188811AlT.LIZIZ(sbLIZ);
        C0CZT.LIZ.getClass();
        if (C0CZT.LIZ() && !C1200430hLN.LIZIZ.LIZIZ() && C290950Ban.LIZ()) {
            Ap(EnumC1200180hKy.STATUS_AGE_GRADUATION_REMINDER, false, null);
            InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(str);
            interfaceC1199990hKfLIZIZ.LJIJI("age_graduation");
            interfaceC1199990hKfLIZIZ.LJJIFFI();
            return;
        }
        if (zLJIILIIL) {
            if (list != null && !list.isEmpty()) {
                AbstractC1200170hKx abstractC1200170hKx2 = this.LLJJJIL;
                if (abstractC1200170hKx2 != null) {
                    abstractC1200170hKx = abstractC1200170hKx2;
                }
                if (abstractC1200170hKx.LJIIJJI()) {
                    C1200000hKg.LIZIZ(str).LJJ(dp());
                    Jo(poiSearchResultWrapper, C0C64.LJIILLIIL().LJIIIZ(31744, "poi_recommendpoi_refresh", true, false), true, "enter_page");
                    return;
                }
                return;
            }
            if (this.LLJJJJJIL.LIZJ()) {
                withState(ip(), new AwS597S0100000_18(this, 533));
            } else if (mp()) {
                Ap(EnumC1200180hKy.STATUS_TURN_ON_LOCATION, false, null);
            } else {
                Ap(EnumC1200180hKy.STATUS_POI_ERROR, false, null);
            }
            op(0, 0, ip().LLIZ, "poi list is empty");
            InterfaceC1199990hKf interfaceC1199990hKfLIZIZ2 = C1200000hKg.LIZIZ(str);
            interfaceC1199990hKfLIZIZ2.LJIJJLI();
            interfaceC1199990hKfLIZIZ2.LJJIFFI();
            return;
        }
        C1200000hKg.LIZIZ(str).LJJIFFI();
        if (this.LLJJJJJIL.LIZJ()) {
            withState(ip(), new AwS597S0100000_18(this, 534));
        } else if (mp()) {
            Ap(EnumC1200180hKy.STATUS_TURN_ON_LOCATION, false, null);
        } else {
            Ap(EnumC1200180hKy.STATUS_POI_ERROR, false, null);
        }
        if (z) {
            View view2 = this.LLIZLLLIL;
            if (view2 != null) {
                view = view2;
            }
            if (C0XF1.LIZLLL(view.getContext())) {
                op(0, 0, ip().LLIZ, "network is available");
                return;
            } else {
                op(0, 0, ip().LLIZ, "search_poi response is empty");
                return;
            }
        }
        long j = ip().LLIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("status code = ");
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapperLIZ = ip().getState().LL.LIZ();
        if (poiSearchResultWrapperLIZ != null) {
            numValueOf = Integer.valueOf(poiSearchResultWrapperLIZ.status_code);
        }
        sbLIZ2.append(numValueOf);
        op(0, 0, j, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiPublishUpdateUiStatusAbility
    public final void qg2(EnumC1200180hKy enumC1200180hKy, boolean z, Function0<Unit> function0) {
        Ap(enumC1200180hKy, z, function0);
    }

    public static View No(Context context, String str, boolean z, Function1 function1) {
        String str2 = str;
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService == null) {
            return null;
        }
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_anchor_map_thumbtack;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        tuxIconView.setTuxIcon(c419910GdJ);
        IPublishOptionCustomViewFactory publishOptionCustomViewFactory = iAVPublishPageUIRefactorService.getPublishOptionCustomViewFactory();
        if (publishOptionCustomViewFactory == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return IPublishOptionCustomViewFactory.DefaultImpls.createCustomView$default(publishOptionCustomViewFactory, context, str2, tuxIconView, null, 0, z, null, function1, 88, null);
    }

    public static void Oo(PoiPublishExtensionAssem poiPublishExtensionAssem, boolean z, boolean z2, int i) {
        String str;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        Context context = poiPublishExtensionAssem.getContext();
        if (context != null) {
            poiPublishExtensionAssem.ip().setState(AFwS256S0000000_18.get$arr$(735));
            PoiData poiData = poiPublishExtensionAssem.ip().getState().LLILLJJLI;
            AbstractC1200170hKx abstractC1200170hKx = null;
            if (poiData != null && C1199400hJi.LIZIZ(poiData)) {
                C1194630hC1 c1194630hC1 = C1194630hC1.LIZ;
                String str2 = poiData.poiId;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                PoiMobParam poiMobParam = ((PoiSearchVM) poiPublishExtensionAssem.LLJI.getValue()).LLJJJJJIL;
                if (poiMobParam != null && (str = poiMobParam.creationId) != null) {
                    str3 = str;
                }
                Double dValueOf = Double.valueOf(poiData.latitude);
                Double dValueOf2 = Double.valueOf(poiData.longitude);
                String str4 = poiData.ugcPoiCreateDetail;
                c1194630hC1.getClass();
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=poi_submission");
                sparkContext.LJJJZ("page_type", "edit");
                sparkContext.LJJJZ("poi_id", str2);
                sparkContext.LJJJZ("enter_from", "poi_post_page_edit");
                sparkContext.LJJJZ("creation_id", str3);
                if (dValueOf != null) {
                    sparkContext.LJJJLL(dValueOf.doubleValue(), "lat");
                }
                if (dValueOf2 != null) {
                    sparkContext.LJJJLL(dValueOf2.doubleValue(), "lng");
                }
                sparkContext.LJJJZ("source", "post");
                if (str4 != null) {
                    sparkContext.LJJJZ("detail", Uri.encode(str4));
                }
                sparkContext.LJJJLZIJ(1, "roma_enable_with_param");
                C1541950qED.LIZJ.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                C1197920hHK c1197920hHK = C1197920hHK.LIZ;
                AbstractC1200170hKx abstractC1200170hKx2 = poiPublishExtensionAssem.LLJJJIL;
                if (abstractC1200170hKx2 != null) {
                    abstractC1200170hKx = abstractC1200170hKx2;
                }
                String strLIZJ = abstractC1200170hKx.LIZJ();
                PageFinder pageFinderVia = PageFinder.via(poiPublishExtensionAssem.ip().LLJJIJIL);
                c1197920hHK.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("current_page", strLIZJ);
                c2344009Gk.LJIIIIZZ("enable_location", C1197920hHK.LIZ());
                Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c0.d0", pageFinderVia, null, 4, null);
                if (!mapCreateReportParams$default.isEmpty()) {
                    for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                        c2344009Gk.LJFF((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                Map<String, String> map = c2344009Gk.LIZ;
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
                c1185040gwY.getClass();
                C1185040gwY.LJFF("ttls_post_update_poi_click", map, c1185050gwZ);
                return;
            }
            AbstractC1200170hKx abstractC1200170hKx3 = poiPublishExtensionAssem.LLJJJIL;
            if (abstractC1200170hKx3 != null) {
                abstractC1200170hKx = abstractC1200170hKx3;
            }
            PoiSearchVM poiSearchVM = (PoiSearchVM) poiPublishExtensionAssem.LLJI.getValue();
            if (poiSearchVM.LLJJJJLIIL.LIZ.get(C1199110hJF.LIZ(poiSearchVM.LLJJJ, poiSearchVM.LLJJJIL, null, poiSearchVM.LLJJJJ)) != null) {
                z3 = true;
            }
            abstractC1200170hKx.LIZIZ(!z3, z, z2);
        }
    }

    public final void Jo(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, boolean z, boolean z2, String str) {
        List<InterfaceC1891350zJl> listItems;
        List<PoiData> list;
        ArrayList arrayList;
        List<InterfaceC1891350zJl> listItems2;
        C20600815jK<InterfaceC1891350zJl> state;
        String str2;
        C1199940hKa c1199940hKa;
        PoiData poiData;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        if (this.LLJJJJLIIL == EnumC1200180hKy.STATUS_POI_LIST_SHOW && !z) {
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp = dp();
        List listLL = null;
        if (viewOnAttachStateChangeListenerC20604515jvDp != null) {
            listItems = viewOnAttachStateChangeListenerC20604515jvDp.getListItems();
        } else {
            listItems = null;
        }
        if (listItems != null && !listItems.isEmpty() && ip().LLJJIII >= C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_recommendpoi_refresh_max_times", true)) {
            return;
        }
        if (poiSearchResultWrapper != null && (poiSearchResult = poiSearchResultWrapper.poiSearchResult) != null) {
            list = poiSearchResult.poiList;
        } else {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PoiData> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().poiId);
            }
        } else {
            arrayList = null;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp2 = dp();
        if (viewOnAttachStateChangeListenerC20604515jvDp2 != null && (state = viewOnAttachStateChangeListenerC20604515jvDp2.getState()) != null) {
            List<InterfaceC1891350zJl> listLJII = state.LJII();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) listLJII) {
                if ((interfaceC1891350zJl instanceof C1199940hKa) && (c1199940hKa = (C1199940hKa) interfaceC1891350zJl) != null && (poiData = c1199940hKa.LL) != null) {
                    str2 = poiData.poiId;
                } else {
                    str2 = null;
                }
                arrayList2.add(str2);
            }
            List listLJJJJLI = C13LP.LJJJJLI(arrayList2);
            if (listLJJJJLI != null && !listLJJJJLI.isEmpty()) {
                if (arrayList != null) {
                    listLL = C13LP.LL(arrayList, listLJJJJLI.size());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cachePoiDifferentFromShowing subData=");
                sbLIZ.append(listLL);
                sbLIZ.append(", showingPoiList=");
                sbLIZ.append(listLJJJJLI);
                C2188811AlT.LIZIZ(sbLIZ);
                if (!(!Intrinsics.LJFF(listLL, listLJJJJLI))) {
                    return;
                }
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp3 = dp();
        if (viewOnAttachStateChangeListenerC20604515jvDp3 != null && (listItems2 = viewOnAttachStateChangeListenerC20604515jvDp3.getListItems()) != null && !listItems2.isEmpty()) {
            ip().LLJJIII++;
            ip().LLJJIJI++;
        }
        C23250099c.LJ(C23271099x.INSTANCE, new C1199960hKc(poiSearchResultWrapper, this, z2, str, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public final void op(int i, int i2, long j, String str) {
        ?? arrayList;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        List<PoiData> list;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchApi.PoiSearchResultWrapper) withState(ip(), AFwS256S0000000_18.get$arr$(963));
        if (poiSearchResultWrapper != null && (poiSearchResult = poiSearchResultWrapper.poiSearchResult) != null && (list = poiSearchResult.poiList) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PoiData> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().poiId;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(str2);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it3.hasNext()) {
            it3.next();
            int i5 = i4 + 1;
            if (i4 >= 0) {
                arrayList2.add(String.valueOf(i4));
                i4 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Object objWithState = withState(ip(), AFwS256S0000000_18.get$arr$(962));
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        Map<String, String> map = C1200270hL7.LIZ(Zo()).LL;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapperLIZ = ip().getState().LL.LIZ();
        if (poiSearchResultWrapperLIZ != null) {
            i3 = poiSearchResultWrapperLIZ.useSessionCache;
        }
        c1185430gxB.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("poi_number", String.valueOf(i));
        linkedHashMap.put("enter_from", "video_post_page");
        linkedHashMap.put("duration", String.valueOf(j));
        linkedHashMap.put("is_success", String.valueOf(i2));
        if (str != null) {
            linkedHashMap.put("reason", str);
        }
        linkedHashMap.put("poi_id", arrayList.toString());
        linkedHashMap.put("index", arrayList2.toString());
        if (objWithState != null) {
            linkedHashMap.put("log_id", objWithState);
        }
        linkedHashMap.put("use_session_cache", String.valueOf(i3));
        C1189060h32.LJIJJ(linkedHashMap, map);
        linkedHashMap.putAll(C1200530hLX.LIZIZ(null, "poi_recommendation_result"));
        C20684815ws.LJIILLIIL("poi_recommendation_result", linkedHashMap);
    }

    public final void tp(Function1<? super Integer, Unit> function1, Function0<Unit> function0, Function2<? super Integer, ? super String, Unit> function2, C1207520hWo c1207520hWo) {
        C1200280hL8 c1200280hL8 = this.LLJJJJJIL;
        View view = this.LLIZLLLIL;
        if (view == null) {
            view = null;
        }
        Context context = view.getContext();
        TokenCert tokenCertLIZJ = C1198600hIQ.LIZJ();
        c1200280hL8.getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C1207450hWh.LIZ.LJIJJ("poi", "add_location", tokenCertLIZJ, c19egLIZIZ, c1207520hWo, new C12827050f(function1, function0, function2), null);
        }
    }
}
