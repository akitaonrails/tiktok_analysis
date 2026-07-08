package com.ss.android.ugc.aweme.translation.ui;

import X.AnonymousClass0075;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0270007g;
import X.C0HU6;
import X.C0HUY;
import X.C0QSJ;
import X.C0RJN;
import X.C0RR7;
import X.C0RT2;
import X.C0S50;
import X.C0S51;
import X.C0S56;
import X.C0S57;
import X.C0S5A;
import X.C0S5G;
import X.C0S5K;
import X.C0S5L;
import X.C0S5M;
import X.C0S5N;
import X.C0S5P;
import X.C0S5R;
import X.C0SKK;
import X.C0SKM;
import X.C0SKN;
import X.C0SXF;
import X.C1308910kAL;
import X.C1342130l1v;
import X.C13LE;
import X.C1485670olR;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C160B;
import X.C1697810uHb;
import X.C19746312Np;
import X.C19746412Nq;
import X.C19EG;
import X.C21647019ng;
import X.C2217381BqS;
import X.C23250099c;
import X.C2521809uS;
import X.C2547809ye;
import X.C257590A7p;
import X.C2797016l;
import X.C299210Bo7;
import X.C341940Daq;
import X.C452501pT;
import X.C631370Opb;
import X.C673150Qan;
import X.C687700QyG;
import X.C698920RbG;
import X.C700100RdA;
import X.C704420Rk8;
import X.C709290Rrz;
import X.C709420RsC;
import X.C709430RsD;
import X.C710270RtZ;
import X.C710480Rtu;
import X.C715430S4n;
import X.C715440S4o;
import X.C715490S4t;
import X.C715500S4u;
import X.C715530S4x;
import X.C715540S4y;
import X.C715550S4z;
import X.C720370SNn;
import X.C724270Sb3;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC19746112Nn;
import X.EnumC715590S5d;
import X.InterfaceC0241006d;
import X.InterfaceC1146704e9;
import X.InterfaceC1282004zy;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC417310GXx;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC710220RtU;
import Y.ALAdapterS1S0300000_6;
import Y.ARunnableS39S0300000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS140S0400000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class TranslationStatusAssem extends BaseCellSlotComponent<TranslationStatusAssem> implements InterfaceC417310GXx, TranslationAbility, View.OnAttachStateChangeListener, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLJI;
    public ViewGroup LLJLLIL;
    public LinearLayout LLJLLL;
    public TuxTextView LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public ImageView LLLF;
    public ObjectAnimator LLLFF;
    public View LLLFFI;
    public boolean LLLFZ;
    public AnonymousClass0956 LLLII;
    public C0S5A LLLIIIIL;
    public C0S5P LLLIIL;
    public C0S50 LLLJIL;
    public C0S51 LLLJL;
    public boolean LLLLII;
    public C715430S4n LLLLIIIILLL;
    public C715440S4o LLLLIIL;
    public C715550S4z LLLLIILLL;
    public final C01GW LLLI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C0S56());
    public int LLLIIII = -1;
    public final C704420Rk8 LLLIIIL = new C704420Rk8(this);
    public final C01GW LLLIILIL = C452501pT.LIZIZ(new C715540S4y(this));
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 961));
    public final C01GW LLLILZ = C452501pT.LIZIZ(new C715500S4u(this));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 960));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new C715490S4t(this));
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new C715530S4x(this));
    public final C01GW LLLJ = C452501pT.LIZIZ(new C709420RsC(this));
    public final C01GW LLLL = C452501pT.LIZIZ(new C0S57());
    public final C01GW LLLLIILL = C452501pT.LIZIZ(new C709430RsD(this));
    public final TranslationStatusAssem$translationParamsProvider$1 LLLLIL = new ETParamsProvider<C0270007g>() { // from class: com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem$translationParamsProvider$1
        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final InterfaceC0241006d Mb0() {
            this.LL.getClass();
            return new C0270007g();
        }

        @Override // com.ss.android.tracker.event.EventParamsProtocol
        public final InterfaceC1282004zy getParam() {
            if (!lt2(C0270007g.class)) {
                return null;
            }
            this.LL.getClass();
            return new C0270007g();
        }

        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
            if (!Intrinsics.LJFF(cls, C0270007g.class)) {
                return false;
            }
            return true;
        }
    };
    public final TranslationStatusAssem$photoTextItemParamsProvider$1 LLLLILI = new ETParamsProvider<AnonymousClass0075>() { // from class: com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem$photoTextItemParamsProvider$1
        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final InterfaceC0241006d Mb0() {
            return C720370SNn.LIZ(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme());
        }

        @Override // com.ss.android.tracker.event.EventParamsProtocol
        public final InterfaceC1282004zy getParam() {
            return C720370SNn.LIZ(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme());
        }

        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
            return Intrinsics.LJFF(cls, AnonymousClass0075.class);
        }
    };
    public final TranslationStatusAssem$photoTextSlideParamsProvider$1 LLLLJ = new ETParamsProvider<C2797016l>() { // from class: com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem$photoTextSlideParamsProvider$1
        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
        public final C2797016l Mb0() {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
            IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LL.LLLIL.getValue();
            return C720370SNn.LIZIZ(iPhotoSlidesAbility != null ? iPhotoSlidesAbility.xt0() : 0, aweme);
        }

        @Override // com.ss.android.tracker.event.EventParamsProtocol
        public final InterfaceC1282004zy getParam() {
            return Mb0();
        }

        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
            return Intrinsics.LJFF(cls, C2797016l.class);
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TranslationStatusAssem.class, "translationStatusViewModel", "getTranslationStatusViewModel()Lcom/ss/android/ugc/aweme/translation/viewmodel/TranslationStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9o;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final boolean Vo() {
        return false;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class, TranslationStatusScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        arrayList.add(TranslationStatusScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TranslationStatusScope.class);
        return arrayList;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -574489147) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void Bp() {
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            tuxTextView.setPaddingRelative(C341940Daq.LIZ(0.0d), C341940Daq.LIZ(4.0d), C341940Daq.LIZ(40.0d), C341940Daq.LIZ(4.0d));
        }
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setPaddingRelative(C341940Daq.LIZ(0.0d), C341940Daq.LIZ(4.0d), C341940Daq.LIZ(40.0d), C341940Daq.LIZ(4.0d));
        }
        LinearLayout linearLayout = this.LLJLLL;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(C341940Daq.LIZ(0.0d), C341940Daq.LIZ(4.0d), C341940Daq.LIZ(40.0d), C341940Daq.LIZ(4.0d));
        }
    }

    public final void Ep() {
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            tuxTextView.setPaddingRelative(C341940Daq.LIZ(0.0d), C341940Daq.LIZ(0.0d), C341940Daq.LIZ(40.0d), C341940Daq.LIZ(0.0d));
        }
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setPaddingRelative(C341940Daq.LIZ(0.0d), C341940Daq.LIZ(0.0d), C341940Daq.LIZ(40.0d), C341940Daq.LIZ(0.0d));
        }
        LinearLayout linearLayout = this.LLJLLL;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(C341940Daq.LIZ(0.0d), C341940Daq.LIZ(0.0d), C341940Daq.LIZ(40.0d), C341940Daq.LIZ(0.0d));
        }
    }

    public final TranslationStatusViewModel Gp() {
        return (TranslationStatusViewModel) this.LLLIIIL.getValue(this, LLLLJI[0]);
    }

    public final InterfaceC665370Q7z LLIIJLIL() {
        return (InterfaceC665370Q7z) this.LLLIILIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final boolean SJ0() {
        return !(this.LLLIIL instanceof C709290Rrz);
    }

    public final void Vp() {
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, C257590A7p.LIZ());
        }
        TuxTextView tuxTextView2 = this.LLJZ;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        TuxTextView tuxTextView3 = this.LLJZIJLIL;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        LinearLayout linearLayout = this.LLJLLL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final C0SKK bQ() {
        C0SKK c0skk;
        C0S5P c0s5p = this.LLLIIL;
        return (c0s5p == null || (c0skk = c0s5p.LIZ) == null) ? C0SKK.INITIALIZED : c0skk;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    public final boolean tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        return aweme != null && AwemeExtKt.isPhotoMode(aweme) && C0SKM.LJIIIIZZ().blockCheckColor;
    }

    public final void Qp() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final void Up() {
        ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        CLACaptionAbility cLACaptionAbility = (CLACaptionAbility) this.LLLILZJ.getValue();
        C160B c160bVf = cLACaptionAbility != null ? cLACaptionAbility.vf() : null;
        WeakReference<Context> weakReference = new WeakReference<>(getContext());
        C724270Sb3 c724270Sb32 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
        if (str == null) {
            str = "";
        }
        iCLAPerfETServiceLIZ.LJIJJ(aweme, c160bVf, false, weakReference, str);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        HomeTabAbility homeTabAbility;
        HomeTabAbility homeTabAbility2;
        EventBus.LIZLLL().LJJI(this);
        C1485670olR.LIZ().onDestroy();
        Gp();
        C715430S4n c715430S4n = this.LLLLIIIILLL;
        if (c715430S4n != null && (homeTabAbility2 = (HomeTabAbility) this.LLLLIILL.getValue()) != null) {
            homeTabAbility2.tx0(c715430S4n);
        }
        C715440S4o c715440S4o = this.LLLLIIL;
        if (c715440S4o == null || (homeTabAbility = (HomeTabAbility) this.LLLLIILL.getValue()) == null) {
            return;
        }
        homeTabAbility.Ik0(c715440S4o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void eo2() {
        TranslationStatusViewModel translationStatusViewModelGp = Gp();
        if (translationStatusViewModelGp != null) {
            TranslationStatusViewModel.LLILZIL = ((C0S5G) translationStatusViewModelGp.getState()).LL;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        Qp();
        C715550S4z c715550S4z = this.LLLLIILLL;
        if (c715550S4z != null) {
            EnumC715590S5d enumC715590S5d = EnumC715590S5d.COMBINE_ENTRANCE_MASTER_TOGGLE;
            if (c715550S4z.LIZIZ) {
                Tp(enumC715590S5d, true);
            } else {
                Gp().wQ2(enumC715590S5d, true, false);
            }
            this.LLLLIILLL = null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1554610qYd.LIZJ(LLIIJLIL(), ETParamsProvider.class, C1697810uHb.LJIILJJIL(this.LLLLIL));
        C1554610qYd.LIZJ(LLIIJLIL(), ETParamsProvider.class, C1697810uHb.LJIILJJIL(this.LLLLILI));
        C1554610qYd.LIZJ(LLIIJLIL(), ETParamsProvider.class, C1697810uHb.LJIILJJIL(this.LLLLJ));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        InteractAreaCommonAbility interactAreaCommonAbility;
        C698920RbG c698920RbGRy0;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        C19EG c19egLIZ = c0rjnLIZIZ != null ? c0rjnLIZIZ.LIZ() : null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        boolean zLIZIZ = C0RR7.LIZIZ(c19egLIZ, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), str);
        if (zLIZIZ || C2521809uS.LIZ) {
            Bp();
            if (!zLIZIZ || (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLLILZLLLI.getValue()) == null || (c698920RbGRy0 = interactAreaCommonAbility.Ry0()) == null) {
                return;
            }
            c698920RbGRy0.LIZLLL(this.LLJZ);
            c698920RbGRy0.LIZLLL(this.LLJZIJLIL);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void hp() {
        Qp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        if (C2521809uS.LIZ) {
            Ep();
        } else {
            Bp();
        }
        InteractAreaSizeMobAbility interactAreaSizeMobAbility = (InteractAreaSizeMobAbility) this.LLLJ.getValue();
        if (interactAreaSizeMobAbility != null) {
            interactAreaSizeMobAbility.ik2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void HI(Pair<Integer, ? extends Drawable> pair) {
        this.LLLIIII = pair.getFirst().intValue();
        Drawable second = pair.getSecond();
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(this.LLLIIII);
        }
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(this.LLLIIII);
        }
        TuxTextView tuxTextView3 = this.LLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(this.LLLIIII);
        }
        if (second != null) {
            ImageView imageView = this.LLLF;
            if (imageView != null) {
                imageView.setImageDrawable(second);
                return;
            }
            return;
        }
        ImageView imageView2 = this.LLLF;
        if (imageView2 == null) {
            return;
        }
        imageView2.setImageResource(R.drawable.awf);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void JX0(boolean z) {
        TranslationStatusViewModel translationStatusViewModelGp = Gp();
        boolean z2 = !z;
        translationStatusViewModelGp.getClass();
        if (z2) {
            translationStatusViewModelGp.setState(AFwS243S0000000_11.get$arr$(708));
        }
    }

    public final void Jp(C0S5L c0s5l) {
        HashMap<String, String> map;
        C0S5M c0s5m = c0s5l.LJ;
        if (c0s5m != null && c0s5m.LIZ != null) {
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLLILZ.getValue();
            if (iVideoCellAbility != null) {
                iVideoCellAbility.Es(true);
            }
            HashMap<String, String> map2 = new HashMap<>();
            C0S5M c0s5m2 = c0s5l.LJ;
            if (c0s5m2 != null && (map = c0s5m2.LIZ) != null) {
                map2.putAll(map);
            }
            IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLLILZ.getValue();
            if (iVideoCellAbility2 != null) {
                iVideoCellAbility2.td(map2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void Ol(EnumC715590S5d enumC715590S5d) {
        Tp(enumC715590S5d, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final boolean R2(Aweme aweme) {
        Object obj;
        ICLACaptionService iCLACaptionServiceLIZ = C0RT2.LIZ();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (iCLACaptionServiceLIZ.R2(((VideoItemParams) obj).getAweme())) {
            return true;
        }
        ICommerceAdExperienceService iCommerceAdExperienceService = (ICommerceAdExperienceService) this.LLLL.getValue();
        if (iCommerceAdExperienceService != null && iCommerceAdExperienceService.R2(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void gh(boolean z) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C710480Rtu(this, z, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void ix0(String str) {
        ViewGroup viewGroup = this.LLJLLIL;
        if (viewGroup != null) {
            viewGroup.setTag(C700100RdA.LJI, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShowCaptionPanelEvent(X.C715480S4s r11) {
        /*
            r10 = this;
            java.lang.String r1 = r11.LIZ
            X.0Sb3 r0 = r10.LLJI
            r2 = 0
            if (r0 == 0) goto L92
            java.lang.Object r0 = r0.LL
        L9:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L82
            java.lang.String r1 = r11.LIZIZ
            if (r1 == 0) goto L2d
            X.0Sb3 r0 = r10.LLJI
            if (r0 == 0) goto L90
            java.lang.Object r0 = r0.LL
        L23:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r0 = r0.mEventType
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L82
        L2d:
            android.content.Context r0 = r10.getContext()
            if (r0 == 0) goto L8e
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
        L37:
            int r1 = java.lang.System.identityHashCode(r0)
            int r0 = r11.LIZLLL
            if (r1 != r0) goto L82
            boolean r0 = r10.LLLFZ
            if (r0 == 0) goto L82
            X.0S5A r1 = r10.LLLIIIIL
            if (r1 != 0) goto L85
            X.19EG r4 = X.C724240Sb0.LIZ(r10)
            if (r4 == 0) goto L6a
            X.0S5A r3 = new X.0S5A
            X.0Q7z r5 = r10.LLIIJLIL()
            X.0Sb3 r0 = r10.LLJI
            if (r0 == 0) goto L59
            java.lang.Object r2 = r0.LL
        L59:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.getAweme()
            java.lang.String r7 = r11.LIZIZ
            X.0mIQ r8 = r11.LIZJ
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r9 = r11.LJ
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.LLLIIIIL = r3
        L6a:
            X.0S5A r3 = r10.LLLIIIIL
            if (r3 == 0) goto L82
            com.ss.android.ugc.aweme.service.ICLACaptionService r2 = X.C0RT2.LIZ()
            X.19EG r0 = X.C724240Sb0.LIZ(r10)
            if (r0 == 0) goto L83
            boolean r1 = X.C0SXG.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L83
        L7f:
            r2.LIZLLL(r3, r0)
        L82:
            return
        L83:
            r0 = 0
            goto L7f
        L85:
            java.lang.String r0 = r11.LIZIZ
            r1.LLJI = r0
            X.0mIQ r0 = r11.LIZJ
            r1.LLJIJIL = r0
            goto L6a
        L8e:
            r0 = r2
            goto L37
        L90:
            r0 = r2
            goto L23
        L92:
            r0 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem.onShowCaptionPanelEvent(X.0S4s):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0S50] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0S51] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.0S4n, X.0rLx] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.0S4o, X.0rLx] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void rA2(int i) {
        Gp().LLILZ = i;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C19EG c19egLIZ;
        InteractAreaCommonAbility interactAreaCommonAbility;
        C698920RbG c698920RbGRy0;
        Object obj;
        Integer numLIZJ;
        Drawable second;
        InterfaceC710220RtU interfaceC710220RtUYn;
        Integer first;
        VideoItemParams videoItemParams2 = videoItemParams;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        Pair<Integer, Drawable> pairLJJII = null;
        if (c0rjnLIZIZ != null) {
            c19egLIZ = c0rjnLIZIZ.LIZ();
        } else {
            c19egLIZ = null;
        }
        boolean zLIZIZ = C0RR7.LIZIZ(c19egLIZ, videoItemParams2.getAweme(), videoItemParams2.mEventType);
        if (zLIZIZ || C2521809uS.LIZ) {
            Ep();
            if (zLIZIZ && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLLILZLLLI.getValue()) != null && (c698920RbGRy0 = interactAreaCommonAbility.Ry0()) != null) {
                c698920RbGRy0.LIZIZ(this.LLJZ, this.LLLJIL);
                c698920RbGRy0.LIZIZ(this.LLJZIJLIL, this.LLLJL);
            }
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        int iIntValue = -1;
        if (C0SKN.LJFF((VideoItemParams) obj)) {
            IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLLIL.getValue();
            if (iPhotoSlidesAbility != null && (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) != null && (pairLJJII = interfaceC710220RtUYn.LJJII()) != null && (first = pairLJJII.getFirst()) != null) {
                iIntValue = first.intValue();
            }
            this.LLLIIII = iIntValue;
            if (pairLJJII != null && (second = pairLJJII.getSecond()) != null) {
                ImageView imageView = this.LLLF;
                if (imageView != null) {
                    imageView.setImageDrawable(second);
                }
            } else {
                ImageView imageView2 = this.LLLF;
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.awf);
                }
            }
        } else {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            this.LLLIIII = iIntValue;
            ImageView imageView3 = this.LLLF;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.awf);
            }
        }
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(this.LLLIIII);
        }
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(this.LLLIIII);
        }
        TuxTextView tuxTextView3 = this.LLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(this.LLLIIII);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void updateCaptionTranslation(C715550S4z c715550S4z) {
        Object obj;
        String str = c715550S4z.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid()) && !C0SXF.LJIL(getContext())) {
            this.LLLLIILLL = c715550S4z;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility
    public final void ww0(EnumC715590S5d enumC715590S5d) {
        Gp().wQ2(enumC715590S5d, true, true);
    }

    public final void Tp(EnumC715590S5d enumC715590S5d, boolean z) {
        if (this.LLLIIL instanceof C0S5K) {
            Gp().wQ2(enumC715590S5d, false, !z);
        } else {
            Gp().LL.LJIIIIZZ(enumC715590S5d, false);
        }
    }

    public final View Fp(C0S5P c0s5p, C0S5R c0s5r, C0S5N c0s5n) {
        if ((c0s5p instanceof C0S5L) || ((c0s5r != null && c0s5r.LIZJ) || (c0s5n != null && c0s5n.LIZJ))) {
            return this.LLJZIJLIL;
        }
        if (c0s5p instanceof C0S5K) {
            return this.LLJZ;
        }
        if (c0s5p instanceof C710270RtZ) {
            return this.LLJLLL;
        }
        return null;
    }

    public final void Ip(C0S5P c0s5p, boolean z, C0S5R c0s5r, C0S5N c0s5n, View view) {
        View viewFp;
        Object obj = null;
        if (z) {
            viewFp = null;
        } else {
            viewFp = Fp(c0s5p, c0s5r, c0s5n);
        }
        this.LLLFFI = viewFp;
        if (c0s5p instanceof C0S5L) {
        }
        this.LLLIIL = c0s5p;
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        c299210Bo7.getClass();
        if ((!C299210Bo7.LIZ(aweme, false) || this.LLLLII) && !Intrinsics.LJFF(viewFp, view)) {
            if (viewFp == null) {
                Vp();
                return;
            }
            if (view == null) {
                C786410Ut5.LJLLLLLL(0, viewFp);
                return;
            }
            if (Intrinsics.LJFF(viewFp, view)) {
                return;
            }
            AwS140S0400000_11 awS140S0400000_11 = new AwS140S0400000_11(view, viewFp, this, new AwS625S0100000_11(this, 78), 7);
            if (C2547809ye.LIZ) {
                C786410Ut5.T4(viewFp, 0.0f);
                C786410Ut5.LJLLLLLL(0, viewFp);
                C0HU6 c0hu6 = new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f));
                EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.SPRING;
                C21647019ng c21647019ng = new C21647019ng(view.getContext(), view, new C19746312Np(enumC19746112Nn, c0hu6, Collections.singletonList(new C19746412Nq("fadeOut", new C0HUY(C257590A7p.LIZ(), 0.0f)))), false);
                C21647019ng c21647019ng2 = new C21647019ng(viewFp.getContext(), viewFp, new C19746312Np(enumC19746112Nn, c0hu6, Collections.singletonList(new C19746412Nq("fadeIn", new C0HUY(0.0f, C257590A7p.LIZ())))), false);
                c21647019ng.LJI(true);
                HandlerHook.viewPostDelay(view, new ARunnableS39S0300000_6(view, c21647019ng2, awS140S0400000_11, 5), 300L);
                return;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 0.0f).setDuration(150L);
            duration.setInterpolator(new LinearInterpolator());
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(viewFp, "alpha", 0.0f, C257590A7p.LIZ()).setDuration(150L);
            duration2.setInterpolator(new LinearInterpolator());
            duration.addListener(new ALAdapterS1S0300000_6(view, viewFp, awS140S0400000_11, 5));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2);
            animatorSet.start();
        }
    }
}
