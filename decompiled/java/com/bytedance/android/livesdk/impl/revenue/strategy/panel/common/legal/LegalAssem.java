package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.legal;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C0GY9;
import X.C0QSJ;
import X.C1143850fs7;
import X.C1146870fwz;
import X.C1150190g2L;
import X.C1244080iTm;
import X.C127G;
import X.C13LE;
import X.C13LN;
import X.C1637806bA;
import X.C16F5;
import X.C189200o6;
import X.C19719912Dl;
import X.C1A12;
import X.C1A14;
import X.C2217381BqS;
import X.C431260Gvc;
import X.C452501pT;
import X.C500260Jjc;
import X.C635860Owq;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1151250g43;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ACListenerS158S0100000_24;
import Y.AObjectS407S0100000_33;
import Y.AObserverS221S0100000_17;
import Y.ARunnableS102S0200000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS160S0110000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import webcast.data.TPText;
import webcast.data.TouchPointBackground;

/* JADX INFO: loaded from: classes34.dex */
public final class LegalAssem extends UIContentAssem implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final C1150190g2L LLJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public static volatile long LLJJJJJIL;
    public final AssemVMLazy LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public volatile TouchPointAbility LLJJI;
    public volatile PackageListAbility LLJJIII;
    public C127G LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0g2L] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LegalAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/legal/LegalViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(LegalAssem.class, "touchPointAbility", "getTouchPointAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/TouchPointAbility;", 0), new C2217381BqS(LegalAssem.class, "packageAbility", "getPackageAbility()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/common/communication/PackageListAbility;", 0)};
        LLJJJ = new Object() { // from class: X.0g2L
        };
        LLJJJJ = R.id.fve;
    }

    public LegalAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LegalViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 25), AFwS279S0000000_33.get$arr$(22), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 217));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 216));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 24));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 23));
        this.LLJILLL = true;
        this.LLJJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(31));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).unbindAbility(Oo(), LegalViewModel.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CampaignPanelScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampaignPanelScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CampaignPanelScope.class}).bindAbility(Oo(), LegalViewModel.class);
    }

    public final C0QSJ Ho() {
        C0QSJ c0qsj = this.LLJJIJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIJIIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CampaignPanelScope.class});
        this.LLJJIJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final C16F5 Jo() {
        return (C16F5) this.LLJIJIL.getValue();
    }

    public final LiveIconView Lo() {
        return (LiveIconView) this.LLJI.getValue();
    }

    public final PackageListAbility No() {
        PackageListAbility packageListAbility;
        PackageListAbility packageListAbility2 = this.LLJJIII;
        if (packageListAbility2 == null) {
            synchronized (this) {
                packageListAbility2 = this.LLJJIII;
                if (packageListAbility2 == null) {
                    C0QSJ c0qsjHo = Ho();
                    if (c0qsjHo != null) {
                        packageListAbility = (PackageListAbility) c0qsjHo.getAbility(PackageListAbility.class);
                        C687700QyG.LJ(packageListAbility, PackageListAbility.class);
                    } else {
                        packageListAbility = null;
                    }
                    this.LLJJIII = packageListAbility;
                    return packageListAbility;
                }
            }
        }
        return packageListAbility2;
    }

    public final LegalViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (LegalViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{LegalViewModel.class, new AObjectS407S0100000_33(this, 3)}, defaultViewModelProviderFactory);
                    this.LLJJIJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final CharSequence Go(CharSequence charSequence) {
        if (charSequence.length() != 0 && Jo().getWidth() > 0) {
            C16F5 c16f5Jo = Jo();
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), c16f5Jo.getPaint(), Jo().getWidth()).setIncludePad(c16f5Jo.getIncludeFontPadding()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(c16f5Jo.getLineSpacingExtra(), c16f5Jo.getLineSpacingMultiplier()).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).build();
            int iMin = Math.min(staticLayoutBuild.getLineCount() - 1, 1);
            if (iMin >= 0 && staticLayoutBuild.getEllipsisCount(iMin) != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, 0, staticLayoutBuild.getLineStart(iMin) + staticLayoutBuild.getEllipsisStart(iMin));
                while (spannableStringBuilder.length() > 0 && C1244080iTm.LJ(C13LN.LJLLL(spannableStringBuilder))) {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                }
                spannableStringBuilder.append((char) 8230);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public final void So(int i) {
        C16F5 c16f5Jo = Jo();
        ViewGroup.LayoutParams layoutParams = Jo().getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.y6(c16f5Jo, layoutParams);
    }

    public final void Vo(C1A12 c1a12) {
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        if (c1a12.LIZ == null) {
            C500260Jjc.LJIILIIL(Jo());
            return;
        }
        C500260Jjc.LLFFF(Jo());
        Jo().setMaxLines(2);
        So(Jo().getLineHeight() * 2);
        TPText tPText = c1a12.LIZ;
        if (tPText != null && (spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText)) != null) {
            if (Jo().getWidth() > 0) {
                Jo().setText(Go(spannableStringBuilderLIZLLL));
            } else {
                HandlerHook.viewPost(Jo(), new ARunnableS102S0200000_33(spannableStringBuilderLIZLLL, this, 16));
            }
        }
    }

    public final void Zo(C1A12 c1a12) {
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        if (c1a12.LIZ == null) {
            C500260Jjc.LJIILIIL(Jo());
            return;
        }
        C500260Jjc.LLFFF(Jo());
        Jo().setMaxLines(Integer.MAX_VALUE);
        So(-2);
        C16F5 c16f5Jo = Jo();
        TPText tPText = c1a12.LIZ;
        if (tPText != null) {
            spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText);
        } else {
            spannableStringBuilderLIZLLL = null;
        }
        c16f5Jo.setText(spannableStringBuilderLIZLLL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        InterfaceC1151250g43 interfaceC1151250g43O5;
        TouchPointBackground touchPointBackgroundLJFF;
        View view2;
        Object c098200Yq;
        boolean zBooleanValue;
        super.onViewCreated(view);
        Jo().setMovementMethod(C431260Gvc.LIZ);
        LegalViewModel legalViewModelOo = Oo();
        C16F5 c16f5Jo = Jo();
        Integer num = (Integer) C723850SaN.LJFF(this, "disclaimer_width");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = ((Number) this.LLJJ.getValue()).intValue();
        }
        legalViewModelOo.wQ2(c16f5Jo, iIntValue);
        C635860Owq.LIZ.LIZJ(5, Lo());
        C786410Ut5.g8(Lo(), new ACListenerS158S0100000_24(this, 94));
        TouchPointAbility touchPointAbility = this.LLJJI;
        Object obj = null;
        if (touchPointAbility == null) {
            synchronized (this) {
                touchPointAbility = this.LLJJI;
                if (touchPointAbility == null) {
                    C0QSJ c0qsjHo = Ho();
                    if (c0qsjHo != null) {
                        touchPointAbility = (TouchPointAbility) c0qsjHo.getAbility(TouchPointAbility.class);
                    } else {
                        touchPointAbility = null;
                    }
                    this.LLJJI = touchPointAbility;
                    if (touchPointAbility != null) {
                    }
                }
            }
            interfaceC1151250g43O5 = touchPointAbility.O5();
            if (interfaceC1151250g43O5 != null && (touchPointBackgroundLJFF = interfaceC1151250g43O5.LJFF()) != null && (view2 = (View) this.LLJILJIL.getValue()) != null) {
                C1146870fwz.LIZIZ(view2, touchPointBackgroundLJFF);
            }
        } else {
            interfaceC1151250g43O5 = touchPointAbility.O5();
            if (interfaceC1151250g43O5 != null) {
                C1146870fwz.LIZIZ(view2, touchPointBackgroundLJFF);
            }
        }
        MutableLiveData mutableLiveDataPV1 = No().pV1();
        getActualLifecycleOwner();
        mutableLiveDataPV1.observe(this, new AObserverS221S0100000_17(this, 37));
        MutableLiveData mutableLiveDataRT1 = No().rT1();
        getActualLifecycleOwner();
        mutableLiveDataRT1.observe(this, new AObserverS221S0100000_17(this, 38));
        boolean zBooleanValue2 = false;
        try {
            Boolean bool = (Boolean) C723850SaN.LJFF(this, "hide_boundary_line");
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c098200Yq = Boolean.valueOf(zBooleanValue);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        }
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.1A11
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1A13) obj2).LL;
            }
        }, null, new AwS160S0110000_33(this, zBooleanValue2, 0), 6);
    }

    public final void ap(int i, int i2, final C1A14 c1a14, final C1A12 c1a12) {
        ValueAnimator duration = ValueAnimator.ofInt(Jo().getLineHeight() * i, Jo().getLineHeight() * i2).setDuration(250L);
        duration.setInterpolator(C0GY9.LIZIZ(0.03f, 0.59f, 0.76f, 0.99f));
        duration.addUpdateListener(new AUListenerS280S0100000_33(this, 5));
        duration.addListener(new AnimatorListenerAdapter() { // from class: X.1A10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (c1a14 == C1A14.FOLD) {
                    this.Vo(c1a12);
                }
                if (c1a14 == C1A14.UNFOLD) {
                    this.Zo(c1a12);
                }
            }
        });
        duration.start();
    }
}
