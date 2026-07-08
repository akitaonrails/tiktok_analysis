package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.sparklite;

import X.C01GW;
import X.C044V;
import X.C1151550g4X;
import X.C13LE;
import X.C1546290qLD;
import X.C1743750vTh;
import X.C1755410vmV;
import X.C19719912Dl;
import X.C356901a3;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpSparkLiteCardHolder extends AbsFullSpanVH<C1755410vmV> {
    public final ViewGroup LLJJIJIL;
    public final ViewGroup LLJJJ;
    public final C01GW LLJJJIL;
    public C1546290qLD LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C044V.LJIIIZ(C044V.LIZ, "SeaPdpSparkLiteCardHolder");
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C1743750vTh.LIZ(this);
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR2 = ((SeaPdpViewModel) this.LLJJJIL.getValue()).TR2();
        if (iSeaPdpCommunicationServiceTR2 != null) {
            iSeaPdpCommunicationServiceTR2.jb(this);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.sparklite.SeaPdpSparkLiteCardHolder$2, reason: invalid class name */
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
            C1546290qLD c1546290qLD = SeaPdpSparkLiteCardHolder.this.LLJJJJ;
            if (c1546290qLD != null) {
                c1546290qLD.LIZ();
            }
        }
    }

    public SeaPdpSparkLiteCardHolder(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        super(frameLayout);
        this.LLJJIJIL = viewGroup;
        this.LLJJJ = frameLayout;
        getLifecycle().addObserver(new AnonymousClass2());
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 113));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C1755410vmV c1755410vmV = (C1755410vmV) obj;
        C1151550g4X c1151550g4X = new C1151550g4X(0);
        SystemClock.elapsedRealtime();
        C1546290qLD c1546290qLD = this.LLJJJJ;
        if (c1546290qLD == null) {
            c1546290qLD = new C1546290qLD(this.LLJJJ, new AwS605S0100000_26(this, 512));
        }
        this.LLJJJJ = c1546290qLD;
        Context context = this.LLJJIJIL.getContext();
        String str = c1755410vmV.LL;
        ViewGroup viewGroup = this.LLJJJ;
        String str2 = c1755410vmV.LLILLJJLI;
        TemplateData templateDataLJIIIIZZ = null;
        if (str2 != null) {
            templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str2);
        }
        LynxView lynxViewLIZIZ = c1546290qLD.LIZIZ(context, str, c1151550g4X, viewGroup, templateDataLJIIIIZZ, c1755410vmV.LLILZIL);
        if (lynxViewLIZIZ == null || lynxViewLIZIZ.getParent() == null) {
            this.LLJJJ.addView(lynxViewLIZIZ);
        }
        if (!this.LLJJJJJIL) {
            this.LLJJJJJIL = true;
            ((SeaPdpViewModel) this.LLJJJIL.getValue()).LLZIL.LLJ++;
        }
    }
}
