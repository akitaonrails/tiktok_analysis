package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C01D1;
import X.C01GW;
import X.C1172330gc3;
import X.C1184530gvj;
import X.C1188450h23;
import X.C1188640h2M;
import X.C1257300ip6;
import X.C1388190mED;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C614900O9w;
import X.C622680Oba;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS153S0100000_18;
import Y.ALAdapterS2S0000000_18;
import Y.ALAdapterS8S0300000_18;
import Y.ATListenerS451S0100000_18;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryActivity;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiCollectStatusBaseActivityAssem extends PoiDetailBaseUiSlotComponent<Object> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public View LLJJIJI;
    public final boolean LLJJIJIIJIL = true;
    public final boolean LLJJIJIL = true;
    public final String LLJJJ = "";
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 903));
    public final AssemVMLazy LLJJJJ;
    public final C1559260qg8 LLJJJJJIL;
    public AwS419S0200000_18 LLJJJJLIIL;
    public boolean LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCollectStatusBaseActivityAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/collect/PoiCollectStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiCollectStatusBaseActivityAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCollectStatusViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 730), AFwS256S0000000_18.get$arr$(288), null, true);
        this.LLJJJJJIL = new C1559260qg8(new C723590SZx(this, C1184530gvj.class, "PoiCollectHierarchyData"), checkSupervisorPrepared());
    }

    public abstract TuxIconView Ap();

    public abstract void Ep(boolean z);

    public void Fp() {
    }

    public abstract void Ip(boolean z);

    public abstract View yp();

    public final PoiCollectStatusViewModel Bp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (PoiCollectStatusViewModel) assemVMLazy.getValue();
    }

    public final C1184530gvj zp() {
        return (C1184530gvj) this.LLJJJJJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    public final C1188640h2M tp() {
        Boolean boolLIZIZ;
        String str = zp().LL;
        return new C1188640h2M(zp().LL, zp().LLILZ, zp().LLILZIL, (str == null || (boolLIZIZ = C1188450h23.LIZIZ(str)) == null) ? zp().LLILLJJLI : boolLIZIZ.booleanValue());
    }

    public String getEnterFrom() {
        return this.LLJJJ;
    }

    public boolean up() {
        return this.LLJJIJIL;
    }

    public final void Gp(String str) {
        TuxIconView tuxIconViewAp = Ap();
        if (tuxIconViewAp != null) {
            AwS167S1100000_18 awS167S1100000_18 = new AwS167S1100000_18(this, str, 9);
            tuxIconViewAp.clearAnimation();
            this.LLJJL = false;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconViewAp, "scaleX", 1.0f, 1.08f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconViewAp, "scaleY", 1.0f, 1.08f);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat2.setDuration(100L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxIconViewAp, "scaleX", 1.08f, 0.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(tuxIconViewAp, "scaleY", 1.08f, 0.0f);
            objectAnimatorOfFloat3.setDuration(100L);
            objectAnimatorOfFloat4.setDuration(100L);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(tuxIconViewAp, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(tuxIconViewAp, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat6.setDuration(100L);
            objectAnimatorOfFloat5.setDuration(100L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat6).after(objectAnimatorOfFloat);
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(tuxIconViewAp, "scaleX", 0.0f, 1.08f);
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(tuxIconViewAp, "scaleY", 0.0f, 1.08f);
            objectAnimatorOfFloat7.setDuration(100L);
            objectAnimatorOfFloat8.setDuration(100L);
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(tuxIconViewAp, "scaleX", 1.08f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(tuxIconViewAp, "scaleY", 1.08f, 1.0f);
            objectAnimatorOfFloat9.setDuration(100L);
            objectAnimatorOfFloat9.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat5);
            animatorSet2.play(objectAnimatorOfFloat9).with(objectAnimatorOfFloat10).after(objectAnimatorOfFloat7);
            animatorSet.addListener(new ALAdapterS8S0300000_18(animatorSet2, awS167S1100000_18, this, 2));
            animatorSet2.addListener(new ALAdapterS2S0000000_18(0));
            animatorSet.start();
        }
        Ep(!Bp().getState().LL);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        String str = c614900O9w.LIZIZ;
        if (str == null) {
            str = "";
        }
        C1188450h23.LIZJ(str, c614900O9w.LIZ);
        if (!Intrinsics.LJFF(tp().LIZ, c614900O9w.LIZIZ)) {
            return;
        }
        if (!this.LLJJL) {
            Ip(c614900O9w.LIZ);
            View viewYp = yp();
            if (viewYp != null) {
                sp(c614900O9w, String.valueOf(hashCode()), viewYp, c614900O9w.LIZIZ, c614900O9w.LIZ);
            }
        } else {
            this.LLJJJJLIIL = new AwS419S0200000_18(this, c614900O9w, 58);
        }
        if (c614900O9w.LIZ != Bp().getState().LL) {
            Bp().setState(new AwS32S0010000_18(c614900O9w.LIZ, 5));
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = view;
        C2211631BhB.LJ(LJJIJL(), new AwS597S0100000_18(this, 249));
        View viewYp = yp();
        if (viewYp != null) {
            viewYp.setOnTouchListener(new ATListenerS451S0100000_18(this, 4));
        }
        View viewYp2 = yp();
        if (viewYp2 != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 44), viewYp2);
        }
        C1188640h2M c1188640h2MTp = tp();
        Ip(c1188640h2MTp.LIZLLL);
        Bp().setState(new AwS32S0010000_18(c1188640h2MTp.LIZLLL, 5));
    }

    public final void sp(C614900O9w c614900O9w, String str, View view, String str2, boolean z) {
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        Window window;
        if (Intrinsics.LJFF(c614900O9w.LJ, str) && z) {
            Context context = getContext();
            View decorView = null;
            if (context != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(context);
            } else {
                c19egLIZIZ = null;
            }
            if (c19egLIZIZ instanceof PoiGalleryActivity) {
                C1172330gc3 c1172330gc3 = C1172330gc3.LIZ;
                C1257300ip6 c1257300ip6 = C1257300ip6.LIZ;
                Context context2 = getContext();
                c1257300ip6.getClass();
                int iLIZ = C1257300ip6.LIZ(context2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                Context context3 = getContext();
                if (context3 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context3)) != null && (window = c19egLIZIZ2.getWindow()) != null) {
                    decorView = window.getDecorView();
                }
                C1172330gc3.LIZ(c1172330gc3, view, iLIZ, null, decorView, str2, null, (PageFinder) this.LLJJJIL.getValue(), C1558520qew.LJIIL(this), 36);
            }
        }
    }
}
