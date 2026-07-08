package com.ss.android.ugc.aweme.tako.multipletemplate;

import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0I27;
import X.C0I28;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1561220qjI;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20189513zB;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C299020Bno;
import X.C335910DEv;
import X.C338530DOx;
import X.C452070Ho5;
import X.C452501pT;
import X.C540120LGg;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC1853160yKA;
import X.EnumC335920DEw;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel;
import com.ss.android.ugc.aweme.tako.vm.TakoChatBotSharedViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoTemplateActivity extends BaseActivity implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JTAgPSHELIOSYjJCA4LCIjJCQ4LGEHKS4jHSo+OCktPSoSKzElPyYnMQ==";
    public SmartImageView LLJJIII;
    public View LLJJIJIL;
    public SmartImageView LLJJJ;
    public TuxIconView LLJJJIL;
    public FrameLayout LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public ViewGroup LLJJL;
    public SmartImageView LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJLIL;
    public final AssemVMLazy LLJLILLLLZIIL;
    public final C736950SvV LLJLL;
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(346), "template_list", String.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(340), "background_dark", String.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(341), "background_light", String.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(348), "template_title_colors", List.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(350), "template_indicator_colors", List.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS269S0000000_27.get$arr$(251), "tako_page_context", TakoPageContext.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(343), "image_on_template", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(339), "image_on_album", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(347), "force_dark_mode", Boolean.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(352), "use_white_tako_icon", Boolean.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(349), "hashtags", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(338), "aid", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(344), "enter_from", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(351), "mode_source", String.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(345), "enter_method", String.class);
    public final C01GW LLJJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS252S0000000_16.get$arr$(342), "common_mob_params", Map.class);
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 838));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 584));
    public List<String> LLJL = C13BV.INSTANCE;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoTemplateActivity.class, "templateListViewModel", "getTemplateListViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/templatelist/TemplateListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoTemplateActivity.class, "takoChoosePhotoVM", "getTakoChoosePhotoVM()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final Map<String, String> LLLFZ() {
        return (Map) this.LLJJI.getValue();
    }

    public final TakoPhotoChooseViewModel LLLLLZL() {
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (TakoPhotoChooseViewModel) assemVMLazy.getValue();
    }

    public final TemplateListViewModel LLLLZI() {
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (TemplateListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity", "onResume", true);
        super.onResume();
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJIIIIZZ(R.attr.uk);
        tuxImmersionBar.LJ(R.attr.a0o);
        tuxImmersionBar.LIZLLL();
        EnumC1853160yKA enumC1853160yKA = C540120LGg.LIZLLL() ? EnumC1853160yKA.FULL_GRANTED : C540120LGg.LJ() ? EnumC1853160yKA.PARTIAL_GRANTED : EnumC1853160yKA.DENIED;
        EnumC1853160yKA enumC1853160yKA2 = LLLLLZL().getState().LLJIJIL;
        EnumC1853160yKA enumC1853160yKA3 = EnumC1853160yKA.DENIED;
        boolean z = enumC1853160yKA2 == enumC1853160yKA3 && enumC1853160yKA != enumC1853160yKA3;
        if (enumC1853160yKA != enumC1853160yKA2) {
            LLLLLZL().BQ2(enumC1853160yKA);
        }
        if (z) {
            LLLLLZL().wQ2(this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity", "onResume", false);
    }

    public TakoTemplateActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TemplateListViewModel.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 582);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(248);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJLIL = new AssemVMLazy(function0LJIIJ, awS560S0100000_16, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 835), aFwS269S0000000_27);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        this.LLJLILLLLZIIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 583), c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 836), AFwS269S0000000_27.get$arr$(249));
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 837);
        this.LLJLL = new C736950SvV(C13LE.LIZ(TakoChatBotSharedViewModel.class), awS571S0100000_27, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS269S0000000_27.get$arr$(250), new C0I27(this), new C0I28(this), new C338530DOx(this));
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws Throwable {
        super.onBackPressed();
        C2204961BRm.x(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0SeIG7CUfRSNWhLA3XSYnl/U6Vm6W/GXuAY4ybyx1pKTqKXSXQ==", null));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static boolean LLLLZIL(String str) {
        C1561220qjI.LIZ.getClass();
        if (!C1561220qjI.LIZ()) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "image_2_image") && !Intrinsics.LJFF(str, "image_2_video")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0276  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r35) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C20189513zB.LIZ.LJII(i, i2, this, intent);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        int iIntValue = i;
        int[] iArr2 = iArr;
        String[] strArr2 = strArr;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11051, "com/ss/android/ugc/aweme/tako/multipletemplate/TakoTemplateActivity", "onRequestPermissionsResult", this, new Object[]{Integer.valueOf(iIntValue), strArr2, iArr2}, "void", new C0WZW(false, "(I[Ljava/lang/String;[I)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0SeIG7CUfRSNWhLA3XSYnl/U6Vm6W/GXuAY4ybyx1pKTqKXSXQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                strArr2 = (String[]) obj2;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iArr2 = (int[]) obj3;
            }
        }
        super.onRequestPermissionsResult(iIntValue, strArr2, iArr2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
