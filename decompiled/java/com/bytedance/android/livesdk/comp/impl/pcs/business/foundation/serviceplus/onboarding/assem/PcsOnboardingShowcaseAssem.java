package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem;

import X.AbstractC1321260kUG;
import X.AbstractC1327750kej;
import X.AbstractC1823860xYu;
import X.AbstractC1824710xaH;
import X.AbstractC447090Hg3;
import X.C01GW;
import X.C056D;
import X.C0JLW;
import X.C0TGC;
import X.C1143680frq;
import X.C127G;
import X.C1295870jpJ;
import X.C1295960jpS;
import X.C1322200kVm;
import X.C1323050kX9;
import X.C1325700kbQ;
import X.C13LE;
import X.C1546210qL5;
import X.C1637806bA;
import X.C1824730xaJ;
import X.C1824860xaW;
import X.C1824970xah;
import X.C1825380xbM;
import X.C1835860xsG;
import X.C1842040y2E;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C822700WPc;
import X.InterfaceC1143790fs1;
import X.InterfaceC1296230jpt;
import X.InterfaceC1320200kSY;
import X.InterfaceC2217461Bqa;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingShowcaseAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class PcsOnboardingShowcaseAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public AbstractC1824710xaH LLJJIJI;
    public C127G LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsOnboardingShowcaseAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/onboarding/viewmodel/PcsOnboardingVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1546210qL5.LIZ.getClass();
        LLJJJ = C814420VxA.LIZIZ(C1546210qL5.LIZ(411));
    }

    public PcsOnboardingShowcaseAssem() {
        C1825380xbM c1825380xbM = new C1825380xbM();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsOnboardingVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1825380xbM, C1637806bA.LIZ, new C056D(c19719912DlLIZ), new C1824970xah(), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new C1824860xaW(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fys;
    }

    public void kp() {
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0xaV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1411350mpZ) obj).LL;
            }
        }, null, new C1824730xaJ(this), 6);
    }

    public final AbstractC1824710xaH hp() {
        AbstractC1824710xaH abstractC1824710xaH = this.LLJJIJI;
        if (abstractC1824710xaH != null) {
            return abstractC1824710xaH;
        }
        "Fragment binding is only available between onCreateView and onDestroyView.".toString();
        throw new IllegalArgumentException("Fragment binding is only available between onCreateView and onDestroyView.");
    }

    public final PcsOnboardingVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PcsOnboardingVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJIIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJIIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PcsOnboardingVM.class, new Function0(this) { // from class: X.0xaX
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsOnboardingShowcaseAssem.LLJJIJIL;
                            return new PcsOnboardingVM(new C518640KVq(C1807670x8n.LJJIIJZLJL()));
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJJIJIIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        C1835860xsG c1835860xsG = hp().LLJLIL;
        AbstractC1823860xYu abstractC1823860xYu = c1835860xsG.LLILLL;
        if (abstractC1823860xYu != null && (frameLayout2 = abstractC1823860xYu.LLJJLIIIJLLLLLLLZ) != null && (viewPropertyAnimatorAnimate = frameLayout2.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        AbstractC1823860xYu abstractC1823860xYu2 = c1835860xsG.LLILLL;
        if (abstractC1823860xYu2 != null && (frameLayout = abstractC1823860xYu2.LLJJLIIIJLLLLLLLZ) != null) {
            C786410Ut5.fd(frameLayout, 0.0f);
        }
        this.LLJJIJI = null;
        super.onDestroy();
    }

    public void lp(View view) {
        DataBinderMapperImpl dataBinderMapperImpl = C1842040y2E.LIZ;
        this.LLJJIJI = (AbstractC1824710xaH) ViewDataBinding.LIZIZ(R.layout.fys, view);
        IPcsOnboardingShowcaseAbility iPcsOnboardingShowcaseAbility = (IPcsOnboardingShowcaseAbility) this.LLJJIII.getValue();
        if (iPcsOnboardingShowcaseAbility != null) {
            iPcsOnboardingShowcaseAbility.tz2(hp());
        }
        hp().LLJLIL.LIZIZ();
        View view2 = hp().LLJJJJJIL;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            float fLJIIZILJ = C497740JfY.LJIIZILJ() * 1.128f;
            int i = LLJJJ;
            if (fLJIIZILJ < i) {
                i = (int) fLJIIZILJ;
            }
            layoutParams.height = i;
            C786410Ut5.W5(view2, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void mp(final String str) {
        final AbstractC1824710xaH abstractC1824710xaHHp = hp();
        C500260Jjc.LJIILLIIL(abstractC1824710xaHHp.LLJLIL);
        C500260Jjc.LLFFF(abstractC1824710xaHHp.LLJJJJLIIL);
        abstractC1824710xaHHp.LLJJJJLIIL.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0y5q
            @Override // X.InterfaceC1296230jpt
            public final void LIZ(C1294720jnS c1294720jnS) {
                C1295960jpS c1295960jpS = abstractC1824710xaHHp.LLJJJJLIIL;
                C1295090jo3 c1295090jo3 = new C1295090jo3("**", "Fill my form");
                CharSequence charSequence = InterfaceC1295080jo2.LJJJ;
                final String str2 = str;
                c1295960jpS.addValueCallback(c1295090jo3, charSequence, (InterfaceC1296040jpa<CharSequence>) new InterfaceC1296040jpa() { // from class: X.0y5r
                    @Override // X.InterfaceC1296040jpa
                    public final Object LIZ(C1295570jop c1295570jop) {
                        return str2;
                    }
                });
            }
        });
        abstractC1824710xaHHp.LLJJJJLIIL.setFontAssetDelegate(new C1295870jpJ() { // from class: X.0xaj
        });
        final String str2 = null;
        String strLIZJ = C0JLW.LIZJ(null);
        if (strLIZJ != null) {
            final C1295960jpS c1295960jpS = abstractC1824710xaHHp.LLJJJJLIIL;
            final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(C1325700kbQ.LIZLLL(UriProtector.parse(strLIZJ)).LIZ(), null);
            ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0Hg6
                public final /* synthetic */ String LIZJ = CardStruct.IStatusCode.DEFAULT;

                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    interfaceC1320200kSY.close();
                }

                @Override // X.AbstractC447090Hg3
                public final void LJI(Bitmap bitmap) {
                    if (bitmap == null) {
                        interfaceC1320200kSYLJI.close();
                        return;
                    }
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setColor(-16777216);
                    canvas.drawCircle(width / 2.0f, height / 2.0f, Math.min(width, height) / 2.0f, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    final C1295960jpS c1295960jpS2 = c1295960jpS;
                    final String str3 = this.LIZJ;
                    HandlerHook.viewPost(c1295960jpS2, new Runnable() { // from class: X.0Hg7
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PcsOnboardingShowcaseAssem@78a3.replaceImageAssetWithFresco$1$onNewResultImpl$1");
                            try {
                                if (c1295960jpS2.getComposition() != null) {
                                    c1295960jpS2.updateBitmap(str3, bitmapCreateBitmap);
                                } else {
                                    final C1295960jpS c1295960jpS3 = c1295960jpS2;
                                    final String str4 = str3;
                                    final Bitmap bitmap2 = bitmapCreateBitmap;
                                    c1295960jpS3.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0Hg8
                                        @Override // X.InterfaceC1296230jpt
                                        public final void LIZ(C1294720jnS c1294720jnS) {
                                            c1295960jpS3.updateBitmap(str4, bitmap2);
                                        }
                                    });
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PcsOnboardingShowcaseAssem@78a3.replaceImageAssetWithFresco$1$onNewResultImpl$1");
                        }
                    });
                    interfaceC1320200kSYLJI.close();
                }
            }, C822700WPc.LL);
        }
        final C1295960jpS c1295960jpS2 = hp().LLJJJJLIIL;
        String strLJ = C0TGC.LJ("tiktok_live_pcs_onboarding_1");
        if (LivePcsOnboardingPerfOptSetting.INSTANCE.enabledDotLottieWebp() && !Intrinsics.LJFF(strLJ, "tiktok_live_pcs_onboarding_1")) {
            str2 = strLJ;
        }
        if (str2 == null) {
            C1143680frq.LJIILJJIL(c1295960jpS2, "tiktok_live_pcs_onboarding_1", "live_smb_opt_in_showcase.lottie", true);
        } else {
            C1143680frq.LJIILL(c1295960jpS2, str2, "live_smb_opt_in_showcase.lottie", true, new InterfaceC1143790fs1() { // from class: X.0TGD
                public final /* synthetic */ String LIZ = "live_smb_opt_in_showcase.lottie";
                public final /* synthetic */ String LIZLLL = "tiktok_live_pcs_onboarding_1";
                public final /* synthetic */ boolean LJ = true;

                @Override // X.InterfaceC1143790fs1
                public final void onFinish(boolean z) {
                    if (z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("loadGeckoLottie webp success file=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(" channel=");
                        sbLIZ.append(str2);
                        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    C0TGC.LJ.incrementAndGet();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("webp lottie load failed, fallback to original: ");
                    sbLIZ2.append(this.LIZ);
                    C20441214yg.LIZIZ("PcsOnboardingGeckoImageLoader", C2188811AlT.LIZIZ(sbLIZ2));
                    C1143680frq.LJIILJJIL(c1295960jpS2, this.LIZLLL, this.LIZ, this.LJ);
                }
            });
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        lp(view);
        kp();
    }
}
