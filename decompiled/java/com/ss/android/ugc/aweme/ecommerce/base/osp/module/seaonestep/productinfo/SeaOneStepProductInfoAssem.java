package com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.productinfo;

import X.C01D1;
import X.C04J9;
import X.C09R3;
import X.C0H1U;
import X.C10515049h;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1748720vbi;
import X.C1763620vzk;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C430120Gtm;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C950403na;
import X.C953803o8;
import X.EnumC1763640vzm;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS162S0400000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaOneStepProductInfoAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public C950403na LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaOneStepProductInfoAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SeaOneStepProductInfoAssem.class, "skuSpecViewModel", "getSkuSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SeaOneStepProductInfoAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS545S0100000_1(c19719912DlLIZ, 469), AFwS228S0000000_1.get$arr$(96), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SeaSkuSpecViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS545S0100000_1(c19719912DlLIZ2, 470), AFwS228S0000000_1.get$arr$(97), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.avn;
    }

    public final SeaSkuSpecViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    public final OrderSubmitAssemViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.u4l);
        if (this.LLJJIJI == null && (view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            C950403na c950403na = new C950403na(view.getContext(), null, 6);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c950403na);
            c950403na.setLayoutParams(layoutParams);
            C0H1U.LIZIZ(c950403na);
            this.LLJJIJI = c950403na;
            viewGroup.addView(c950403na, 0);
        }
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        viewFindViewById.setClipToOutline(true);
        viewFindViewById.setOutlineProvider(new C04J9(fLIZIZ, 0));
        C786410Ut5.I7(new AjS60S0100000_1(this, 18), viewFindViewById);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.u4m);
        C1763620vzk c1763620vzk = (C1763620vzk) view.findViewById(R.id.u4q);
        C953803o8 c953803o8 = (C953803o8) view.findViewById(R.id.u4o);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.u4s);
        C430120Gtm c430120Gtm = (C430120Gtm) view.findViewById(R.id.u4r);
        EnumC1763640vzm enumC1763640vzm = EnumC1763640vzm.FORCE_WRAP;
        int i = C1763620vzk.LLJILLL;
        c1763620vzk.B0(enumC1763640vzm, null);
        C786410Ut5.I7(new AjS20S0300000_1(this, smartImageView, view, 8), smartImageView);
        C1748720vbi.LJI(smartImageView, new C10515049h(), AFwS185S0000000_1.get$arr$(42), "c5555.d0", PageFinder.via(view), new AwS580S0100000_1(this, 102));
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.03lN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C936903lP) obj).LLILLL;
            }
        }, null, new AwS615S0100000_1(smartImageView, 30), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.03o6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C936903lP) obj).LL;
            }
        }, null, new AwS437S0200000_1(this, tuxTextView, 10), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.03JX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).b;
            }
        }, null, new AwS162S0400000_1(this, c1763620vzk, c953803o8, c430120Gtm, 1), 6);
    }
}
