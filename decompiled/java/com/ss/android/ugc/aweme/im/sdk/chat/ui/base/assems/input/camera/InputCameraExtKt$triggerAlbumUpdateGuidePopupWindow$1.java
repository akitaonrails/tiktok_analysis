package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera;

import X.C01GW;
import X.C09AX;
import X.C09DV;
import X.C1559260qg8;
import X.C16AZ;
import X.C356901a3;
import X.C457420Hwi;
import X.C457640Hx4;
import X.C457780HxI;
import X.C736950SvV;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC456770Hvf;
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
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$triggerAlbumUpdateGuidePopupWindow$1", f = "InputCameraExt.kt", l = {399}, m = "invokeSuspend")
public final class InputCameraExtKt$triggerAlbumUpdateGuidePopupWindow$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC456770Hvf LLILLJJLI;
    public final /* synthetic */ UIAssem LLILLL;
    public final /* synthetic */ C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> LLILZ;
    public final /* synthetic */ AssemVMLazy<InterfaceC0148002o, PanelStateViewModel> LLILZIL;
    public final /* synthetic */ AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> LLILZLL;
    public final /* synthetic */ C01GW<C16AZ> LLIZ;
    public final /* synthetic */ C1559260qg8<C457780HxI> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCameraExtKt$triggerAlbumUpdateGuidePopupWindow$1(InterfaceC456770Hvf interfaceC456770Hvf, UIAssem uIAssem, C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> c736950SvV, AssemVMLazy<InterfaceC0148002o, PanelStateViewModel> assemVMLazy, AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> assemVMLazy2, C01GW<C16AZ> c01gw, C1559260qg8<C457780HxI> c1559260qg8, InterfaceC1364105Vn<? super InputCameraExtKt$triggerAlbumUpdateGuidePopupWindow$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC456770Hvf;
        this.LLILLL = uIAssem;
        this.LLILZ = c736950SvV;
        this.LLILZIL = assemVMLazy;
        this.LLILZLL = assemVMLazy2;
        this.LLIZ = c01gw;
        this.LLIZLLLIL = c1559260qg8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new InputCameraExtKt$triggerAlbumUpdateGuidePopupWindow$1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$triggerAlbumUpdateGuidePopupWindow$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final /* synthetic */ C01GW<C16AZ> LL;
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
            C01GW<C16AZ> c01gw = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457420Hwi.LIZ;
            c01gw.getValue().dismiss();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
            C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> c736950SvV = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457420Hwi.LIZ;
            if (((IAlbumUpdateGuideViewModel) c736950SvV.getValue()).xQ2()) {
                this.LL.getValue().dismiss();
            }
        }

        public AnonymousClass1(C01GW<C16AZ> c01gw, C736950SvV<InterfaceC0148002o, IAlbumUpdateGuideViewModel> c736950SvV) {
            this.LL = c01gw;
            this.LLILLJJLI = c736950SvV;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$triggerAlbumUpdateGuidePopupWindow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
