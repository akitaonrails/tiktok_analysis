package com.ss.android.ugc.aweme.tako.camera.record.pageui;

import X.AbstractC1177930gl5;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0F7E;
import X.C0OGR;
import X.C127G;
import X.C1308910kAL;
import X.C1322110kVd;
import X.C1385040m98;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1848410yCV;
import X.C1853190yKD;
import X.C1854220yLs;
import X.C189200o6;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C23031090r;
import X.C2400609au;
import X.C2400709av;
import X.C384050F3z;
import X.C418440Gaw;
import X.C445120Hcs;
import X.C452501pT;
import X.C540120LGg;
import X.C687700QyG;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1854210yLr;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS129S0200000_27;
import Y.ACListenerS144S0100000_9;
import Y.ACListenerS161S0100000_27;
import Y.ACListenerS91S0300000_27;
import Y.ALAdapterS9S0100000_12;
import Y.AObjectS77S0000000_27;
import Y.ARunnableS127S0100000_27;
import Y.AUListenerS259S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.Size;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import avg.f;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.camera.record.TakoRecordCoreViewModel;
import com.ss.android.ugc.aweme.tako.camera.record.TakoSurfaceScope;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;
import com.ss.android.vesdk.VECameraCapture;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS623S0100000_9;
import mf.a;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoRecordUIAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public View LLJJJ;
    public TuxTextView LLJJJIL;
    public C0F7E LLJJJJ;
    public ValueAnimator LLJJJJJIL;
    public float LLJJJJLIIL;
    public boolean LLJJL;
    public ARunnableS127S0100000_27 LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public boolean LLJLIL;
    public TakoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1 LLJLILLLLZIIL;
    public InterfaceC420801kM LLJLL;
    public final C1559260qg8 LLJLLIL;
    public C127G LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoRecordUIAssem.class, "recordFragmentVM", "getRecordFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoRecordFragmentViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoRecordUIAssem.class, "coreVM", "getCoreVM()Lcom/ss/android/ugc/aweme/tako/camera/record/TakoRecordCoreViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TakoRecordUIAssem.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fr0;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoSurfaceScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoSurfaceScope.class);
        return arrayList;
    }

    public TakoRecordUIAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoRecordFragmentViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1292), AFwS269S0000000_27.get$arr$(240), null, true);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoRecordCoreViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1293), AFwS269S0000000_27.get$arr$(241), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c01d1, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ3, 1294), AFwS269S0000000_27.get$arr$(242), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1291));
        this.LLJJJJLIIL = -1.0f;
        this.LLJLLIL = new C1559260qg8(new C723580SZw(this, C0OGR.class, null), checkSupervisorPrepared());
    }

    public final void ip() {
        ValueAnimator valueAnimator = this.LLJJJJJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJJJJIL = null;
    }

    public final TakoRecordCoreViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (TakoRecordCoreViewModel) assemVMLazy.getValue();
    }

    public final C0OGR mp() {
        return (C0OGR) this.LLJLLIL.getValue();
    }

    public final TakoRecordFragmentViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (TakoRecordFragmentViewModel) assemVMLazy.getValue();
    }

    public final void sp() {
        C19EG c19egLIZ;
        Window window;
        if (this.LLJJL || (c19egLIZ = C724240Sb0.LIZ(this)) == null || (window = c19egLIZ.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.LLJJJJLIIL = attributes.screenBrightness;
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        this.LLJJL = true;
    }

    public final void up() {
        Window window;
        if (this.LLJJL) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = this.LLJJJJLIIL;
                window.setAttributes(attributes);
            }
            this.LLJJL = false;
        }
    }

    public final void zp() {
        C0F7E c0f7e = this.LLJJJJ;
        if (c0f7e == null) {
            return;
        }
        ip();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0f7e);
        c0f7e.setAlpha(0.0f);
        C786410Ut5.b1(c0f7e, 8);
        up();
    }

    public final void Ap() {
        int i = C1854220yLs.LIZ[(lp().LLILZIL == EnumC1854210yLr.AUTO ? EnumC1854210yLr.OFF : lp().LLILZIL).ordinal()];
        int i2 = R.raw.icon_flash_slash_fill;
        if (i != 1) {
            if (i == 2) {
                i2 = R.raw.icon_flash_fill;
            } else if (i != 3) {
                throw new C1954807lC();
            }
        }
        TuxIconView tuxIconView = this.LLJJIJIL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i2);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{TakoRecordCoreViewModel.class, new AObjectS77S0000000_27(this, 0)}, defaultViewModelProviderFactory);
                    this.LLJLLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C19EG c19egLIZ;
        Lifecycle lifecycle;
        super.onDestroy();
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLJJLIIIJLLLLLLLZ;
        if (aRunnableS127S0100000_27 != null) {
            HandlerHook.viewRemoveCallbacks(getContentView(), aRunnableS127S0100000_27);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        VECameraCapture vECameraCapture = lp().LLILLJJLI;
        if (vECameraCapture != null) {
            vECameraCapture.LJJLIIIJJI(false);
        }
        ip();
        up();
        TakoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1 takoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1 = this.LLJLILLLLZIIL;
        if (takoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1 != null && (c19egLIZ = C724240Sb0.LIZ(this)) != null && (lifecycle = c19egLIZ.getLifecycle()) != null) {
            lifecycle.removeObserver(takoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1);
        }
        this.LLJLILLLLZIIL = null;
        this.LLJL = null;
        this.LLJLIL = false;
    }

    public static MediaModel kp(Context context) {
        MediaModel c098200Yq;
        C2400709av c2400709av;
        MediaModel next;
        Object obj = null;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                c2400709av = new C2400709av(null, null, 0L, 0L, null, "is_trashed = ?", new String[]{CardStruct.IStatusCode.DEFAULT}, false, false, false, 927);
            } else {
                c2400709av = null;
            }
            List<MediaModel> listLIZIZ = C2400609au.LIZIZ(context, false, -1, -1, c2400709av, true, true, false, -1);
            if (i < 29) {
                c098200Yq = (MediaModel) C13LP.LJJJLL(listLIZIZ);
            } else if (listLIZIZ.isEmpty()) {
                c098200Yq = null;
            } else {
                C1853190yKD c1853190yKD = new C1853190yKD();
                Iterator<MediaModel> it2 = listLIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (c1853190yKD.LIZ(next)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                c098200Yq = next;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (MediaModel) obj;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        boolean z;
        C19EG c19egLIZ;
        int i;
        int i2;
        int iIntValue;
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new AwS603S0100000_24(this, 318));
        this.LLJL = view;
        C0F7E c0f7e = (C0F7E) view.findViewById(R.id.in2);
        if (c0f7e != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zl, C1385040m98.LIZ(c0f7e.getContext(), true));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1;
            }
            c0f7e.LL = 0.0f;
            c0f7e.LLILLJJLI = 0.0f;
            c0f7e.LLILLL = iIntValue;
            c0f7e.invalidate();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0f7e);
            c0f7e.setAlpha(0.0f);
            C786410Ut5.b1(c0f7e, 8);
        } else {
            c0f7e = null;
        }
        this.LLJJJJ = c0f7e;
        View viewFindViewById = view.findViewById(R.id.xbi);
        if (viewFindViewById != null) {
            View.OnClickListener aCListenerS161S0100000_27 = new ACListenerS161S0100000_27(this, 118);
            if (C1848410yCV.LIZ) {
                aCListenerS161S0100000_27 = new f(aCListenerS161S0100000_27);
            }
            a aVar = new a(aCListenerS161S0100000_27);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(viewFindViewById);
            }
            viewFindViewById.setOnClickListener(aVar);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.yzd);
        if (tuxIconView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a02, C1385040m98.LIZ(tuxIconView.getContext(), true));
            tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
            C786410Ut5.a9(tuxIconView, new ACListenerS161S0100000_27(this, 119));
        }
        boolean zLIZLLL = C540120LGg.LIZLLL();
        boolean zLJ = C540120LGg.LJ();
        if (!zLIZLLL && !zLJ) {
            z = false;
        } else {
            z = true;
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.pnz);
        if (frameLayout != null) {
            if (((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LJZ(i2, frameLayout);
            C786410Ut5.O7(frameLayout, new ACListenerS91S0300000_27(this, view, frameLayout, 8));
        }
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.po1);
        if (tuxIconView2 != null) {
            if (z) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            } else {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z2.LIZ = C1308910kAL.LIZJ(R.attr.a02, C1385040m98.LIZ(tuxIconView2.getContext(), true));
                tuxIconView2.setBackground(c384050F3z2.LIZ(tuxIconView2.getContext()));
            }
        }
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.po0);
        if (frameLayout2 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZ(i, frameLayout2);
        }
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.pny);
        if (c1322110kVd != null) {
            if (z) {
                C786410Ut5.LLZZLLIL(c1322110kVd, 0);
                MediaModel mediaModelKp = kp(c1322110kVd.getContext());
                if (mediaModelKp != null) {
                    C01GW c01gw = C23031090r.LIZ;
                    this.LLJLL = C23031090r.LIZIZ(c1322110kVd, mediaModelKp, new Size(C445120Hcs.LIZ(48), C445120Hcs.LIZ(48)), new AwS606S0100000_27(this, 360));
                }
            } else {
                C786410Ut5.LLZZLLIL(c1322110kVd, 8);
            }
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zoom_btn);
        this.LLJJJIL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText("1x");
        }
        TuxTextView tuxTextView2 = this.LLJJJIL;
        if (tuxTextView2 != null) {
            C384050F3z c384050F3z3 = new C384050F3z();
            c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
            c384050F3z3.LIZ = C1308910kAL.LIZJ(R.attr.a0w, C1385040m98.LIZ(tuxTextView2.getContext(), true));
            tuxTextView2.setBackground(c384050F3z3.LIZ(tuxTextView2.getContext()));
            C786410Ut5.h9(tuxTextView2, new ACListenerS129S0200000_27(tuxTextView2, this, 25));
        }
        TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.e21);
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS144S0100000_9(this, 98));
        }
        TuxIconView tuxIconView4 = (TuxIconView) view.findViewById(R.id.ibp);
        this.LLJJIJIL = tuxIconView4;
        if (tuxIconView4 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
        }
        Ap();
        yp(false);
        zp();
        TuxIconView tuxIconView5 = this.LLJJIJIL;
        if (tuxIconView5 != null) {
            C786410Ut5.a9(tuxIconView5, new ACListenerS161S0100000_27(this, 117));
        }
        View viewFindViewById2 = view.findViewById(R.id.qd4);
        this.LLJJJ = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS144S0100000_9(this, 102), view2);
        }
        View viewFindViewById3 = view.findViewById(R.id.qd3);
        C786410Ut5.LJLLLLLL(4, viewFindViewById3);
        op().LLILLJJLI = BottomSheetBehavior.from(viewFindViewById3);
        BottomSheetBehavior<View> bottomSheetBehavior = op().LLILLJJLI;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(5);
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = op().LLILLJJLI;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setDraggable(true);
        }
        BottomSheetBehavior<View> bottomSheetBehavior3 = op().LLILLJJLI;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0yLt
                @Override // X.AbstractC1177930gl5
                public final void LIZJ(View view3, float f) {
                    float fLIZLLL = C13LZ.LIZLLL(1 + f, 0.0f, 1.0f);
                    View view4 = this.LLJJJ;
                    if (view4 != null) {
                        C786410Ut5.T4(view4, fLIZLLL);
                    }
                    View view5 = this.LLJJJ;
                    if (view5 != null) {
                        C786410Ut5.LJLLLLLL(0, view5);
                    }
                }

                @Override // X.AbstractC1177930gl5
                public final void LIZLLL(int i3, View view3) {
                    if (i3 != 3 && i3 != 4) {
                        if (i3 == 5) {
                            View viewFindViewById4 = view.findViewById(R.id.cb0);
                            if (viewFindViewById4 != null) {
                                C786410Ut5.LJLLLLLL(8, viewFindViewById4);
                            }
                            View view4 = this.LLJJJ;
                            if (view4 != null) {
                                C786410Ut5.LJLLLLLL(8, view4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    View view5 = this.LLJJJ;
                    if (view5 == null) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(0, view5);
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0OEb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NPX) obj).LLILZ;
            }
        }, null, new AwS623S0100000_9(this, 174), 6);
        if (this.LLJLILLLLZIIL == null && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            TakoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1 takoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1 = new TakoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1(this);
            c19egLIZ.getLifecycle().addObserver(takoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1);
            this.LLJLILLLLZIIL = takoRecordUIAssem$registerGalleryEntrancePermissionObserverIfNeeded$observer$1;
        }
    }

    public final void tp(View view) {
        boolean z;
        int i;
        if (!C540120LGg.LIZLLL() && !C540120LGg.LJ()) {
            z = false;
        } else {
            z = true;
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.po1);
        if (tuxIconView != null) {
            if (z) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            } else {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a02, C1385040m98.LIZ(tuxIconView.getContext(), true));
                tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
            }
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.po0);
        if (frameLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZ(i, frameLayout);
        }
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.pny);
        if (c1322110kVd != null) {
            if (z) {
                C786410Ut5.LLZZLLIL(c1322110kVd, 0);
                MediaModel mediaModelKp = kp(c1322110kVd.getContext());
                if (mediaModelKp != null) {
                    InterfaceC420801kM interfaceC420801kM = this.LLJLL;
                    if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                        interfaceC420801kM.dispose();
                    }
                    C01GW c01gw = C23031090r.LIZ;
                    this.LLJLL = C23031090r.LIZIZ(c1322110kVd, mediaModelKp, new Size(C445120Hcs.LIZ(48), C445120Hcs.LIZ(48)), new AwS606S0100000_27(this, 254));
                    return;
                }
                return;
            }
            C786410Ut5.LLZZLLIL(c1322110kVd, 8);
            InterfaceC420801kM interfaceC420801kM2 = this.LLJLL;
            if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed()) {
                interfaceC420801kM2.dispose();
            }
            this.LLJLL = null;
        }
    }

    public final void yp(boolean z) {
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLJJLIIIJLLLLLLLZ;
        if (aRunnableS127S0100000_27 != null) {
            HandlerHook.viewRemoveCallbacks(getContentView(), aRunnableS127S0100000_27);
        }
        ARunnableS127S0100000_27 aRunnableS127S0100000_272 = new ARunnableS127S0100000_27(this, 30);
        this.LLJJLIIIJLLLLLLLZ = aRunnableS127S0100000_272;
        if (z) {
            HandlerHook.viewPostDelay(getContentView(), aRunnableS127S0100000_272, 120L);
        } else {
            HandlerHook.viewPost(getContentView(), aRunnableS127S0100000_272);
        }
    }

    public final void hp(C0F7E c0f7e, float f, long j, Function0 function0) {
        ip();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c0f7e.getAlpha(), f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS259S0100000_9(c0f7e, 3));
        valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(function0, 27));
        valueAnimatorOfFloat.start();
        this.LLJJJJJIL = valueAnimatorOfFloat;
    }
}
