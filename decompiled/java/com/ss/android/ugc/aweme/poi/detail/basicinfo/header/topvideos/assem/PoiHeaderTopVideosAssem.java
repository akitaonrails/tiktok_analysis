package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1180060goW;
import X.C1180600gpO;
import X.C1183810guZ;
import X.C1183820gua;
import X.C1185600gxS;
import X.C1187400h0M;
import X.C1187470h0T;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1197200hGA;
import X.C1220000hqw;
import X.C12KQ;
import X.C12P3;
import X.C12P5;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C13LZ;
import X.C14K4;
import X.C14NM;
import X.C1509340pNc;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19EG;
import X.C19ME;
import X.C20244914Jj;
import X.C20246014Ju;
import X.C2217381BqS;
import X.C259800zU;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1181950grZ;
import X.EnumC197015126j;
import X.EnumC1987807qW;
import X.InterfaceC1181010gq3;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS87S0200000_18;
import android.content.Context;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.cell.PoiHeaderTopVideosViewMoreCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.popup.IPoiHeaderPopTextAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.slash.common.component.transparent.PoiSlashHeaderLayoutViewModel;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS6S0410000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderTopVideosAssem extends PoiDetailBaseUiSlotComponent<PoiHeaderTopVideosModule> implements ContainerEventDispatcher$PageScrollCallBackAbility {
    public static final C1187400h0M LLLIIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public static final int LLLIILIL;
    public static final int LLLIL;
    public static final int LLLILZ;
    public static final int LLLILZJ;
    public static final int LLLILZLLLI;
    public static final int LLLIZZ;
    public static final int LLLJ;
    public static final int LLLJIL;
    public static final int LLLJL;
    public static final int LLLL;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJ;
    public SmartImageView LLJJJIL;
    public C1197200hGA LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public SmartImageView LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1048));
    public final Set<String> LLJLIL = Collections.synchronizedSet(new LinkedHashSet());
    public final AssemVMLazy LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;
    public final C736950SvV LLJLLIL;
    public final C736950SvV LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public C1187470h0T LLL;
    public List<? extends C14NM> LLLF;
    public List<? extends C14NM> LLLFF;
    public PoiHeaderTopVideosViewMoreCell LLLFFI;
    public float LLLFZ;
    public int LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0h0M] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiHeaderTopVideosAssem.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(PoiHeaderTopVideosAssem.class, "slashHeaderLayoutVm", "getSlashHeaderLayoutVm()Lcom/ss/android/ugc/aweme/slash/common/component/transparent/PoiSlashHeaderLayoutViewModel;", 0)};
        LLLIIIL = new Object() { // from class: X.0h0M
        };
        LLLIILIL = 24;
        LLLIL = 52;
        LLLILZ = 4;
        LLLILZJ = 10;
        LLLILZLLLI = 9;
        LLLIZZ = 6;
        LLLJ = 16;
        LLLJIL = 20;
        LLLJL = 54;
        LLLL = 64;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e0c;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final boolean mp() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void oq(int i) {
    }

    public PoiHeaderTopVideosAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1049), AFwS256S0000000_18.get$arr$(359), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiSlashHeaderLayoutViewModel.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1050), AFwS256S0000000_18.get$arr$(360), null, true);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1053);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PoiHeaderTopVideosSharedViewModel.class);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(361);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((AbstractC738140SxQ) this, 1051);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJLLIL = new C736950SvV(c19719912DlLIZ3, awS562S0100000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, awS562S0100000_182, c451610HnL, c723700Sa8);
        AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18(this, 1047);
        this.LLJLLL = new C736950SvV(C13LE.LIZ(PoiHeaderTopVideosSharedViewModel.class), awS562S0100000_183, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(362), new AwS562S0100000_18((AbstractC738140SxQ) this, 1052), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLFZ = 0.85f;
    }

    public final PoiDetailInfoViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIL;
        return (PoiDetailInfoViewModel) assemVMLazy.getValue();
    }

    public final int zp() {
        List<C14NM> list = this.LLLF;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C14NM c14nm : list) {
                if ((c14nm instanceof C1183820gua) || ((c14nm instanceof C1183810guZ) && ((C1183810guZ) c14nm).LLILLL == 52500)) {
                    return LLLIZZ;
                }
            }
        }
        return LLLILZLLLI;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        sp().vQ2(EnumC1181950grZ.TOP_VIDEOS);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1187470h0T c1187470h0T = this.LLL;
        if (c1187470h0T != null) {
            c1187470h0T.LIZJ.removeCallbacksAndMessages(null);
            c1187470h0T.LIZ.removeOnScrollListener(c1187470h0T.LJ);
            c1187470h0T.LIZ.removeOnChildAttachStateChangeListener(c1187470h0T.LJFF);
            c1187470h0T.LIZJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1187470h0T c1187470h0T = this.LLL;
        if (c1187470h0T != null) {
            c1187470h0T.LIZJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C1187470h0T c1187470h0T;
        super.onResume();
        if (this.LLLIIIIL || (c1187470h0T = this.LLL) == null) {
            return;
        }
        c1187470h0T.LIZ();
    }

    public final int tp() {
        Window window;
        View decorView;
        C20246014Ju c20246014JuLIZ;
        C20244914Jj c20244914JjLIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (window = c19egLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null || (c20246014JuLIZ = C14K4.LIZ(decorView)) == null || (c20244914JjLIZ = c20246014JuLIZ.LIZ(1)) == null) {
            return 0;
        }
        return c20244914JjLIZ.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        C1185600gxS c1185600gxS;
        String str;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C1173300gdc c1173300gdcQr0;
        float f;
        int iLIZIZ;
        int iLIZIZ2;
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        PoiHeaderTopVideosModule poiHeaderTopVideosModule = (PoiHeaderTopVideosModule) baseComponentData;
        super.CG1(poiHeaderTopVideosModule);
        String str2 = null;
        if (!this.LLLII) {
            Context context = LJJIJL().getContext();
            if (context != null) {
                int iLIZLLL = C418440Gaw.LIZLLL(context);
                String topHeightStyle = poiHeaderTopVideosModule.getTopHeightStyle();
                int iLIZIZ3 = (int) (((iLIZLLL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) / 2.8f);
                this.LLJJIJI = iLIZIZ3;
                float f2 = iLIZIZ3;
                LLLIIIL.getClass();
                if (!Intrinsics.LJFF(topHeightStyle, "1") && Intrinsics.LJFF(topHeightStyle, "2")) {
                    f = 1.0f;
                } else {
                    f = 1.3384615f;
                }
                this.LLJJIJIIJIL = (int) (f2 * f);
                this.LLJJIJIL = (int) ((((iLIZLLL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - this.LLJJIJI) / 0.88f);
                PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel = (PoiHeaderTopVideosSharedViewModel) this.LLJLLIL.getValue();
                int i = this.LLJJIJI;
                int i2 = this.LLJJIJIIJIL;
                poiHeaderTopVideosSharedViewModel.LLJILJILJ = i;
                poiHeaderTopVideosSharedViewModel.LLJILLL = i2;
                PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel2 = (PoiHeaderTopVideosSharedViewModel) this.LLJLLL.getValue();
                int i3 = this.LLJJIJI;
                int i4 = this.LLJJIJIIJIL;
                poiHeaderTopVideosSharedViewModel2.LLJILJILJ = i3;
                poiHeaderTopVideosSharedViewModel2.LLJILLL = i4;
                View view = this.LLJJJJJIL;
                if (view != null && (layoutParams3 = view.getLayoutParams()) != null) {
                    layoutParams3.height = this.LLJJIJIIJIL;
                }
                Boolean boolIsWorldCup = poiHeaderTopVideosModule.isWorldCup();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(boolIsWorldCup, bool)) {
                    iLIZIZ = this.LLJJIJIIJIL;
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLJ + LLLILZJ + LLLJIL + LLLJL + LLLL)));
                } else {
                    iLIZIZ = this.LLJJIJIIJIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLILZ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLILZJ))) + tp() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLIL)));
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLIILIL)));
                }
                int i5 = iLIZIZ + iLIZIZ2;
                ConstraintLayout constraintLayout = this.LLJJL;
                if (constraintLayout != null && (layoutParams2 = constraintLayout.getLayoutParams()) != null) {
                    layoutParams2.height = i5;
                }
                C1197200hGA c1197200hGA = this.LLJJJJ;
                if (c1197200hGA != null && (layoutParams = c1197200hGA.getLayoutParams()) != null) {
                    layoutParams.height = this.LLJJIJIIJIL;
                }
                boolean zLJFF = Intrinsics.LJFF(poiHeaderTopVideosModule.isWorldCup(), bool);
                C1197200hGA c1197200hGA2 = this.LLJJJJ;
                if (c1197200hGA2 != null) {
                    ViewGroup.LayoutParams layoutParams4 = c1197200hGA2.getLayoutParams();
                    if ((layoutParams4 instanceof C19ME) && (c19me = (C19ME) layoutParams4) != null) {
                        if (zLJFF) {
                            c19me.topToTop = -1;
                            c19me.bottomToBottom = 0;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1197200hGA2);
                            c1197200hGA2.setLayoutParams(c19me);
                            C1189060h32.LJJII(c1197200hGA2, null, 0, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLILZJ))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLJ)))));
                        } else {
                            c19me.topToTop = 0;
                            c19me.bottomToBottom = -1;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1197200hGA2);
                            c1197200hGA2.setLayoutParams(c19me);
                            C1189060h32.LJJII(c1197200hGA2, null, Integer.valueOf(tp() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLIL))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLILZ)))), null, 0);
                        }
                    }
                }
                this.LLJZIJLIL = ((i5 - tp()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLIL)))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLIILIL)));
                sp().LLILZ = this.LLJZIJLIL;
                AssemVMLazy assemVMLazy = this.LLJLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIL;
                ((PoiSlashHeaderLayoutViewModel) assemVMLazy.getValue()).LL = i5 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LLLJ)));
                ConstraintLayout constraintLayout2 = this.LLJJL;
                if (constraintLayout2 != null) {
                    constraintLayout2.requestLayout();
                }
                this.LLLII = true;
            } else {
                C339190DRl.LIZIZ(LJJIJL());
            }
            Context context2 = getContext();
            if (context2 != null) {
                C12P5 c12p5 = new C12P5();
                c12p5.LIZJ = C1308910kAL.LIZJ(R.attr.zc, context2);
                C12KQ c12kq = C12KQ.VERTICAL;
                c12p5.LJI = c12kq;
                EnumC197015126j enumC197015126j = EnumC197015126j.LINEAR;
                c12p5.LJII = enumC197015126j;
                c12p5.LJ = Float.valueOf(1.0f);
                c12p5.LJFF = Float.valueOf(0.0f);
                C12P3 c12p3LIZ = c12p5.LIZ(context2);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(context2), c12p3LIZ});
                final int[] iArr = {ColorProtector.parseColor("#1C3D41"), ColorProtector.parseColor("#301B2D"), ColorProtector.parseColor("#330B16")};
                final float[] fArr = {0.0f, 0.6f, 1.0f};
                ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: X.0GQe
                    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                    public final Shader resize(int i6, int i7) {
                        int i8 = i7 / 2;
                        return new RadialGradient(i6, 0.0f, (float) Math.sqrt((i6 * i6) + (i8 * i8)), iArr, fArr, Shader.TileMode.CLAMP);
                    }
                };
                PaintDrawable paintDrawable = new PaintDrawable();
                paintDrawable.setShape(new RectShape());
                paintDrawable.setShaderFactory(shaderFactory);
                paintDrawable.setIntrinsicWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(390)));
                paintDrawable.setIntrinsicHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(310)));
                C12P5 c12p52 = new C12P5();
                c12p52.LIZJ = Integer.valueOf(ColorProtector.parseColor("#000000"));
                c12p52.LJI = c12kq;
                c12p52.LJII = enumC197015126j;
                c12p52.LJ = Float.valueOf(0.0f);
                c12p52.LJFF = Float.valueOf(0.8f);
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{paintDrawable, c12p52.LIZ(context2)});
                boolean zLJFF2 = Intrinsics.LJFF(poiHeaderTopVideosModule.isWorldCup(), Boolean.TRUE);
                SmartImageView smartImageView = this.LLJJJIL;
                if (smartImageView != null) {
                    smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                SmartImageView smartImageView2 = this.LLJJJIL;
                if (smartImageView2 != null) {
                    smartImageView2.setImageDrawable(layerDrawable);
                }
                SmartImageView smartImageView3 = this.LLJJJIL;
                if (smartImageView3 != null) {
                    C1180060goW.LJIILL(smartImageView3, new AwS6S0410000_6(poiHeaderTopVideosModule, context2, this, zLJFF2, layerDrawable2, 1));
                }
            }
            SmartImageView smartImageView4 = this.LLJJLIIIJLLLLLLLZ;
            if (smartImageView4 != null) {
                String worldCupLogo = poiHeaderTopVideosModule.getWorldCupLogo();
                if (Intrinsics.LJFF(poiHeaderTopVideosModule.isWorldCup(), Boolean.TRUE) && worldCupLogo != null) {
                    C786410Ut5.LLFF(0, smartImageView4);
                    C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_detail", "poi_header_wc_logo", null).LIZ(C438710HIf.LIZJ(worldCupLogo));
                    c1189360h3WLIZ.LIZLLL(smartImageView4);
                    c1189360h3WLIZ.LIZIZ();
                } else {
                    C339190DRl.LIZIZ(smartImageView4);
                }
            }
        }
        if (Intrinsics.LJFF(poiHeaderTopVideosModule.updateType, "append")) {
            yp(poiHeaderTopVideosModule);
            C1197200hGA c1197200hGA3 = this.LLJJJJ;
            if (c1197200hGA3 != null) {
                c1197200hGA3.LLILZLL = up(poiHeaderTopVideosModule, zp());
            }
            InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
            if (interfaceC1181010gq3LIZ != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZ.qr0()) != null) {
                c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
            } else {
                c1185600gxS = null;
            }
            PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel3 = (PoiHeaderTopVideosSharedViewModel) this.LLJLLIL.getValue();
            if (c1185600gxS != null) {
                str = c1185600gxS.LIZ;
            } else {
                str = null;
            }
            poiHeaderTopVideosSharedViewModel3.FQ2(str, poiHeaderTopVideosModule.getDataVersion(), poiHeaderTopVideosModule, EnumC1987807qW.POI_HEADER_TOP_VIDEOS);
            PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel4 = (PoiHeaderTopVideosSharedViewModel) this.LLJLLL.getValue();
            if (c1185600gxS != null) {
                str2 = c1185600gxS.LIZ;
            }
            poiHeaderTopVideosSharedViewModel4.FQ2(str2, poiHeaderTopVideosModule.getDataVersion(), poiHeaderTopVideosModule, EnumC1987807qW.POI_TOP_VIDEOS_PAGE);
            if (!C1509340pNc.LIZ() && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJJ) != null) {
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS87S0200000_18(viewOnAttachStateChangeListenerC20604515jv, this, 23));
            }
            this.LLJZ = true;
            return;
        }
        this.LLJZ = false;
        yp(poiHeaderTopVideosModule);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PageScrollCallBackAbility
    public final void bq(int i) {
        boolean z;
        IPoiHeaderPopTextAbility iPoiHeaderPopTextAbility;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLLIIIIL = z;
        if (i > 0) {
            this.LLLIIII = false;
            C1187470h0T c1187470h0T = this.LLL;
            if (c1187470h0T != null) {
                c1187470h0T.LIZJ();
            }
        } else if (!this.LLLIIII) {
            this.LLLIIII = true;
            C1187470h0T c1187470h0T2 = this.LLL;
            if (c1187470h0T2 != null) {
                c1187470h0T2.LIZ();
            }
        }
        ConstraintLayout constraintLayout = this.LLJJL;
        if (constraintLayout != null) {
            C786410Ut5.jd(constraintLayout, (-i) / 1.5f);
        }
        int i2 = this.LLJZIJLIL;
        if (i2 > 0) {
            float fLIZLLL = 1.0f;
            float fLIZLLL2 = C13LZ.LIZLLL(i / i2, 0.0f, 1.0f);
            float f = fLIZLLL2 * fLIZLLL2;
            View view = this.LLJJJJLIIL;
            if (view != null) {
                C786410Ut5.T4(view, f);
            }
            if (f > 0.7f) {
                fLIZLLL = C13LZ.LIZLLL((1.0f - f) / 0.3f, 0.0f, 1.0f);
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (iPoiHeaderPopTextAbility = (IPoiHeaderPopTextAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IPoiHeaderPopTextAbility.class, null)) != null) {
                iPoiHeaderPopTextAbility.AI(fLIZLLL);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem for r11v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<? extends X.14NM>] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yp(com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule r29) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem.yp(com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.PoiHeaderTopVideosModule):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160 A[PHI: r20
      0x0160: PHI (r20v1 java.lang.String) = (r20v0 java.lang.String), (r20v7 java.lang.String) binds: [B:67:0x015c, B:32:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166 A[PHI: r20 r21
      0x0166: PHI (r20v2 java.lang.String) = (r20v1 java.lang.String), (r20v6 java.lang.String) binds: [B:70:0x0162, B:35:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r21v1 java.lang.String) = (r21v0 java.lang.String), (r21v5 java.lang.String) binds: [B:70:0x0162, B:35:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016c A[PHI: r20 r21 r22
      0x016c: PHI (r20v3 java.lang.String) = (r20v2 java.lang.String), (r20v5 java.lang.String) binds: [B:73:0x0168, B:38:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r21v2 java.lang.String) = (r21v1 java.lang.String), (r21v4 java.lang.String) binds: [B:73:0x0168, B:38:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r22v1 java.lang.String) = (r22v0 java.lang.String), (r22v3 java.lang.String) binds: [B:73:0x0168, B:38:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VC1(java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem.VC1(java.lang.String, java.lang.String):void");
    }

    public final boolean up(PoiHeaderTopVideosModule poiHeaderTopVideosModule, int i) {
        if (!Intrinsics.LJFF(poiHeaderTopVideosModule.getHasMore(), Boolean.TRUE)) {
            List list = this.LLLF;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            if (list.size() <= i) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final void Bp(C259800zU<Pair<PoiListApi.PoiMergedListItem, Integer>> c259800zU, List<Object> list, String str, PoiHeaderTopVideosAssem poiHeaderTopVideosAssem, Integer num) {
        Pair<PoiListApi.PoiMergedListItem, Integer> pair = c259800zU.element;
        if (pair == null) {
            return;
        }
        Ap(list, str, poiHeaderTopVideosAssem, num, pair.getFirst(), pair.getSecond().intValue());
        c259800zU.element = null;
    }

    public static final void Ap(List<Object> list, String str, PoiHeaderTopVideosAssem poiHeaderTopVideosAssem, Integer num, PoiListApi.PoiMergedListItem poiMergedListItem, int i) {
        ((ArrayList) list).add(new C1183810guZ(str, poiMergedListItem, 52500, poiHeaderTopVideosAssem.LLJJIJIL, poiHeaderTopVideosAssem.LLJJIJIIJIL, num, null, Integer.valueOf(i), 64));
    }
}
