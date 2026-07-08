package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera;

import X.AnonymousClass0987;
import X.C01GW;
import X.C05RH;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C09IC;
import X.C155000ia;
import X.C1C7U;
import X.C356901a3;
import X.C457420Hwi;
import X.C457640Hx4;
import X.C457780HxI;
import X.C736950SvV;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC456770Hvf;
import X.InterfaceC457470Hwn;
import X.InterfaceC497601wk;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$triggerAlbumUpdateGuidePopupView$1", f = "InputCameraExt.kt", l = {337}, m = "invokeSuspend")
public final class InputCameraExtKt$triggerAlbumUpdateGuidePopupView$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC456770Hvf LLILLJJLI;
    public final /* synthetic */ C457780HxI LLILLL;
    public final /* synthetic */ UIAssem LLILZ;
    public final /* synthetic */ C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> LLILZIL;
    public final /* synthetic */ AssemVMLazy<InterfaceC0148002o, PanelStateViewModel> LLILZLL;
    public final /* synthetic */ AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> LLIZ;
    public final /* synthetic */ C01GW<InterfaceC457470Hwn> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputCameraExtKt$triggerAlbumUpdateGuidePopupView$1(InterfaceC456770Hvf interfaceC456770Hvf, C457780HxI c457780HxI, UIAssem uIAssem, C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> c736950SvV, AssemVMLazy<InterfaceC0148002o, PanelStateViewModel> assemVMLazy, AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> assemVMLazy2, C01GW<? extends InterfaceC457470Hwn> c01gw, InterfaceC1364105Vn<? super InputCameraExtKt$triggerAlbumUpdateGuidePopupView$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC456770Hvf;
        this.LLILLL = c457780HxI;
        this.LLILZ = uIAssem;
        this.LLILZIL = c736950SvV;
        this.LLILZLL = assemVMLazy;
        this.LLIZ = assemVMLazy2;
        this.LLIZLLLIL = c01gw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new InputCameraExtKt$triggerAlbumUpdateGuidePopupView$1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$triggerAlbumUpdateGuidePopupView$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final /* synthetic */ C01GW<InterfaceC457470Hwn> LL;
        public final /* synthetic */ C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> LLILLJJLI;

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C01GW<InterfaceC457470Hwn> c01gw = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457420Hwi.LIZ;
            InterfaceC457470Hwn value = c01gw.getValue();
            if (value != null) {
                value.dismiss();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            InterfaceC457470Hwn value;
            C356901a3.LIZLLL(this, lifecycleOwner);
            C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> c736950SvV = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457420Hwi.LIZ;
            if (((IAlbumUpdateGuideViewModel) c736950SvV.getValue()).xQ2() && (value = this.LL.getValue()) != null) {
                value.dismiss();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C01GW<? extends InterfaceC457470Hwn> c01gw, C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> c736950SvV) {
            this.LL = c01gw;
            this.LLILLJJLI = c736950SvV;
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputCameraExtKt@82ab.triggerAlbumUpdateGuidePopupView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> c736950SvV = this.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457420Hwi.LIZ;
            C05RH c05rh = new C05RH(((IAlbumUpdateGuideViewModel) c736950SvV.getValue()).wQ2());
            this.LL = 1;
            obj = C09IC.LJIIZILJ(c05rh, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InputCameraExtKt@82ab.triggerAlbumUpdateGuidePopupView$1");
                return objLJFF;
            }
        }
        AnonymousClass0987 anonymousClass0987 = (AnonymousClass0987) obj;
        AssemVMLazy<InterfaceC0148002o, PanelStateViewModel> assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C457420Hwi.LIZ;
        if (!((PanelStateViewModel) assemVMLazy.getValue()).Ld() && this.LLILLJJLI.LIZIZ().getValue().LIZLLL && this.LLILLJJLI.LIZIZ().getValue().LJ && ((Boolean) ((InputPanelSizeViewModel) this.LLIZ.getValue()).LL.LL.getValue()).booleanValue()) {
            InterfaceC457470Hwn value = this.LLIZLLLIL.getValue();
            if (value != null) {
                value.LIZ(anonymousClass0987.LIZ, anonymousClass0987.LIZIZ);
            }
            ((IAlbumUpdateGuideViewModel) this.LLILZIL.getValue()).yQ2(this.LLILLL.LL);
            this.LLILZ.getLifecycle().addObserver(new AnonymousClass1(this.LLIZLLLIL, this.LLILZIL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InputCameraExtKt@82ab.triggerAlbumUpdateGuidePopupView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
