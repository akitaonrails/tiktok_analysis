package com.ss.android.ugc.aweme.ecommerce.pictureinpicture;

import X.AbstractC738140SxQ;
import X.C1038610d8N;
import X.C13LE;
import X.C13LP;
import X.C1508320pLy;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1757130vpH;
import X.C19719912Dl;
import X.C19EG;
import X.C204744159q;
import X.C20738716Dh;
import X.C20738916Dj;
import X.C20739116Dl;
import X.C20750516Hv;
import X.C2217381BqS;
import X.C2249291D1z;
import X.C425120Gli;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1757150vpJ;
import X.InterfaceC1508380pM4;
import X.InterfaceC20738816Di;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS165S0100000_31;
import Y.ARunnableS131S0100000_31;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.AwS680S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class EcPiPAssem extends UIContentAssem implements IEcPiPAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLIZLLLIL;
    public SurfaceView LLJ;
    public View LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxIconView LLJJ;
    public C204744159q LLJJI;
    public C425120Gli LLJJIII;
    public Function0<Unit> LLJJIJI;
    public EnumC1757150vpJ LLJJIJIIJIL;
    public C20738916Dj LLJJIJIL;
    public boolean LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcPiPAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/pictureinpicture/EcPiPViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final EcPiPViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (EcPiPViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pictureinpicture.IEcPiPAbility
    public final C1757130vpH cf() {
        return new C1757130vpH(LJJIJL().getVisibility() == 0, this.LLJJIJIIJIL, Go().getState().LLJI, 4);
    }

    public EcPiPAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcPiPViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 345);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(77);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 346), aFwS276S0000000_31, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLIZLLLIL = assemVMLazy;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C19EG c19egLIZ;
        super.onDestroy();
        if (LJJIJL().getVisibility() == 0 && (c19egLIZ = C724240Sb0.LIZ(this)) != null && c19egLIZ.isFinishing()) {
            Go().VI(EnumC1757150vpJ.QUIT_APP, true);
        }
        IECommerceFYPPlayerService iECommerceFYPPlayerService = (IECommerceFYPPlayerService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceFYPPlayerService.class));
        if (iECommerceFYPPlayerService != null) {
            iECommerceFYPPlayerService.LIZJ(Go());
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IEcPiPAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pictureinpicture.IEcPiPAbility
    public final void pause() {
        Go().pause(true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pictureinpicture.IEcPiPAbility
    public final void play() {
        Go();
        WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
        InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
        if (interfaceC1508380pM4LIZ != null) {
            interfaceC1508380pM4LIZ.LJIILLIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pictureinpicture.IEcPiPAbility
    public final void Nj(InterfaceC20738816Di interfaceC20738816Di) {
        Go().LLILZIL.remove(interfaceC20738816Di);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pictureinpicture.IEcPiPAbility
    public final void Sq(C2249291D1z c2249291D1z) {
        Go().LLILZIL.add(c2249291D1z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pictureinpicture.IEcPiPAbility
    public final void Yy(C1038610d8N c1038610d8N) {
        Go().LLILLJJLI = c1038610d8N;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C20739116Dl c20739116Dl;
        SurfaceHolder holder;
        C204744159q c204744159q;
        super.onViewCreated(view);
        C20738716Dh c20738716Dh = C20738716Dh.LJIIIIZZ.get();
        if (c20738716Dh != null) {
            c20739116Dl = c20738716Dh.LIZJ;
        } else {
            c20739116Dl = null;
        }
        this.LLJJIJIL = new C20738916Dj(c20739116Dl);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IEcPiPAbility.class, null, null);
        }
        this.LLJ = (SurfaceView) LJJIJL().findViewById(R.id.video_surface_view);
        this.LLJI = LJJIJL().findViewById(R.id.gf4);
        this.LLJIJIL = LJJIJL().findViewById(R.id.e1g);
        this.LLJILJIL = LJJIJL().findViewById(R.id.j2r);
        this.LLJILLL = (TuxIconView) LJJIJL().findViewById(R.id.qns);
        this.LLJJ = (TuxIconView) LJJIJL().findViewById(R.id.vqs);
        this.LLJILJILJ = LJJIJL().findViewById(R.id.nnd);
        this.LLJJI = (C204744159q) LJJIJL().findViewById(R.id.gfg);
        this.LLJJIII = (C425120Gli) LJJIJL().findViewById(R.id.gfh);
        TuxIconView tuxIconView = this.LLJILLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS165S0100000_31(this, 224));
        }
        TuxIconView tuxIconView2 = this.LLJJ;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS165S0100000_31(this, 225));
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 226), view2);
        }
        View view3 = this.LLJILJIL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 227), view3);
        }
        C204744159q c204744159q2 = (C204744159q) LJJIJL().findViewById(R.id.gfg);
        if (c204744159q2 != null) {
            c204744159q2.setOnMoveCallback(new AwS610S0100000_31(this, 545));
            if (s1.LIZ() && (c204744159q = this.LLJJI) != null) {
                c204744159q.setOnUnhideCallback(new AwS610S0100000_31(this, 546));
            }
        }
        SurfaceView surfaceView = this.LLJ;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.addCallback(new SurfaceHolder.Callback() { // from class: X.16Do
                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                }

                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    this.LL.Go().setState(new AwS43S0010000_31(true, 21));
                }

                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    this.LL.Go().setState(new AwS43S0010000_31(false, 21));
                }
            });
        }
        SurfaceView surfaceView2 = this.LLJ;
        if (surfaceView2 != null) {
            C786410Ut5.H7(surfaceView2, new ACListenerS165S0100000_31(this, 228));
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.16Dr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20739016Dk) obj).LL);
            }
        }, null, new AwS645S0100000_31(this, 125), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.16Dt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20739016Dk) obj).LLILLJJLI);
            }
        }, null, new AwS645S0100000_31(this, 126), 6);
        C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.12Q4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20739016Dk) obj).LLILLL);
            }
        }, new C2217381BqS() { // from class: X.0dqh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20739016Dk) obj).LLILZ);
            }
        }, null, new AwS680S0100000_31(this, 13), 12);
        EcPiPViewModel ecPiPViewModelGo = Go();
        selectSubscribe(ecPiPViewModelGo, new C2217381BqS() { // from class: X.16Dn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20739016Dk) obj).LLILZIL);
            }
        }, new C2217381BqS() { // from class: X.16Ds
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20739016Dk) obj).LL);
            }
        }, new C2217381BqS() { // from class: X.16Dq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20739016Dk) obj).LLJ);
            }
        }, C736820SvI.LIZIZ(ecPiPViewModelGo.usedInReusedScene), null, new C20750516Hv(this, 3));
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.16Dp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20739016Dk) obj).LLIZ);
            }
        }, null, new AwS638S0100000_24(this, 209), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.16Dm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20739016Dk) obj).LLILZIL);
            }
        }, null, new AwS638S0100000_24(this, 210), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.16Du
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20739016Dk) obj).LLIZLLLIL;
            }
        }, null, new AwS645S0100000_31(this, 124), 6);
        if (s1.LIZ()) {
            C204744159q c204744159q3 = this.LLJJI;
            if (c204744159q3 != null) {
                c204744159q3.setOnMoveCallback(new AwS610S0100000_31(this, 547));
                c204744159q3.setOnHiddenCallback(new AwS645S0100000_31(this, 26));
            }
            C425120Gli c425120Gli = this.LLJJIII;
            if (c425120Gli != null) {
                c425120Gli.setOnRequestRestore(new AwS645S0100000_31(this, 27));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pictureinpicture.IEcPiPAbility
    public final void q0(Function0<Unit> function0) {
        SurfaceView surfaceView;
        this.LLJJIJI = function0;
        C20738916Dj c20738916Dj = this.LLJJIJIL;
        if (c20738916Dj != null) {
            c20738916Dj.LIZLLL(false);
        }
        this.LLJJJ = false;
        this.LLJJIJIIJIL = null;
        SurfaceView surfaceView2 = this.LLJ;
        if ((surfaceView2 == null || surfaceView2.getVisibility() != 0) && (surfaceView = this.LLJ) != null) {
            C786410Ut5.LLIIII(surfaceView, 0);
        }
        HandlerHook.viewPost(LJJIJL(), new ARunnableS131S0100000_31(this, 52));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pictureinpicture.IEcPiPAbility
    public final void VI(EnumC1757150vpJ enumC1757150vpJ, boolean z) {
        if (LJJIJL().getVisibility() == 0) {
            this.LLJJJ = true;
            this.LLJJIJIIJIL = enumC1757150vpJ;
            C20738916Dj c20738916Dj = this.LLJJIJIL;
            if (c20738916Dj != null) {
                c20738916Dj.LIZ(enumC1757150vpJ);
            }
            SurfaceView surfaceView = this.LLJ;
            if (surfaceView != null) {
                C786410Ut5.LLIIII(surfaceView, 8);
            }
            Go().VI(enumC1757150vpJ, z);
        }
    }
}
