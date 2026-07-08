package com.ss.android.ugc.aweme.ecommerce.base.sku.powercells;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1326490kch;
import X.C13LE;
import X.C1546290qLD;
import X.C1755400vmU;
import X.C1775730wJH;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2341109Fh;
import X.C356901a3;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C827203La;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS46S0200100_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SkuLynxPowerCell extends PowerCell<C1755400vmU> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final ViewGroup LL;
    public C1546290qLD LLILLJJLI;
    public boolean LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuLynxPowerCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/vm/SkuPanelAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SkuLynxPowerCell() {
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 533);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(253);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 544), awS570S0100000_26, AFwS215S0000000_26.get$arr$(145), new AwS570S0100000_26((C03K6) this, 519), new AwS570S0100000_26((C03K6) this, 521), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 523), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 525), null, new AwS570S0100000_26((C03K6) this, 526));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 520);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 522);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 524);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 31));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 527);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 528);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 529);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 530);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 531);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 532), awS570S0100000_26, AFwS215S0000000_26.get$arr$(143), new AwS570S0100000_26((C03K6) this, 534), new AwS570S0100000_26((C03K6) this, 535), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 536), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 537), null, new AwS570S0100000_26((C03K6) this, 538));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 539), awS570S0100000_26, AFwS215S0000000_26.get$arr$(144), new AwS570S0100000_26((C03K6) this, 540), new AwS570S0100000_26((C03K6) this, 541), new AwS570S0100000_26((C03K6) this, 542), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 543));
        }
        FrameLayout frameLayout = new FrameLayout(this.itemView.getContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        this.LL = frameLayout;
        getLifecycle().addObserver(new AnonymousClass2());
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuLynxPowerCell$2, reason: invalid class name */
    public final class AnonymousClass2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
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

        public AnonymousClass2() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            C1546290qLD c1546290qLD = SkuLynxPowerCell.this.LLILLJJLI;
            if (c1546290qLD != null) {
                c1546290qLD.LIZ();
            }
            C1326490kch.LJI("PdpLynxCardHolder, released");
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1755400vmU c1755400vmU = (C1755400vmU) interfaceC1891350zJl;
        super.onBindItemView(c1755400vmU);
        C1775730wJH c1775730wJH = new C1775730wJH(1);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1546290qLD c1546290qLD = this.LLILLJJLI;
        if (c1546290qLD == null) {
            c1546290qLD = new C1546290qLD(this.LL, new AwS605S0100000_26(this, 25));
        }
        this.LLILLJJLI = c1546290qLD;
        C1326490kch c1326490kch = C1326490kch.LIZ;
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c1755400vmU, 27);
        c1326490kch.getClass();
        C1326490kch.LIZIZ(awS570S0100000_26);
        Context context = C827203La.LIZIZ(getCurrentLifecycleOwner()).getContext();
        if (context == null) {
            context = this.itemView.getContext();
        }
        String str = c1755400vmU.LL;
        ViewGroup viewGroup = this.LL;
        String str2 = c1755400vmU.LLILLJJLI;
        TemplateData templateDataLJIIIIZZ = null;
        if (str2 != null) {
            templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str2);
        }
        LynxView lynxViewLIZIZ = c1546290qLD.LIZIZ(context, str, c1775730wJH, viewGroup, templateDataLJIIIIZZ, c1755400vmU.LLILZIL);
        if (lynxViewLIZIZ == null || lynxViewLIZIZ.getParent() == null) {
            this.LL.addView(lynxViewLIZIZ);
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS46S0200100_26 awS46S0200100_26 = new AwS46S0200100_26(c1755400vmU, this, jElapsedRealtime, 0);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(awS46S0200100_26);
        if (!this.LLILLL) {
            this.LLILLL = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return this.LL;
    }
}
