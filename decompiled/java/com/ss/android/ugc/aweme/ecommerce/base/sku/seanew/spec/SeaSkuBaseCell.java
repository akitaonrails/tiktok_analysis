package com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec;

import X.AbstractC756202xM;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C031C;
import X.C03IJ;
import X.C03K6;
import X.C049X;
import X.C04GK;
import X.C0H1U;
import X.C10515049h;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C1743690vTb;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C20449114zx;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C747202vu;
import X.C786410Ut5;
import X.C908703gr;
import X.EnumC1011903xV;
import X.InterfaceC1891350zJl;
import X.InterfaceC20511615Ny;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ATListenerS437S0100000_1;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell;
import com.zhiliaoapp.musically.R;
import g1c.AjS13S0000000_31;
import g1c.AjS40S0200000_1;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public abstract class SeaSkuBaseCell<T extends AbstractC756202xM> extends ECPowerCell<T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJILJIL;
    public ViewGroup LLJILJILJ;
    public View LLJILLL;
    public SaleProp LLJJ;
    public final C04GK LLJJI;
    public C20449114zx LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaSkuBaseCell.class, "skuSpecViewModel", "getSkuSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract void L5(T t, SaleProp saleProp);

    public abstract SaleProp N5(T t);

    public SizeGuide P5(T t) {
        return null;
    }

    public void S5(int i) {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.avq;
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [X.04GK] */
    public SeaSkuBaseCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaSkuSpecViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 382);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(69);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 367), awS575S0100000_31, AFwS221S0000000_31.get$arr$(132), new AwS575S0100000_31((C03K6) this, 368), new AwS575S0100000_31((C03K6) this, 370), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 372), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 374), null, new AwS575S0100000_31((C03K6) this, 375));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 369);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 371);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 373);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 40));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 376);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 377);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 378);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 379);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 380);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 381), awS575S0100000_31, AFwS221S0000000_31.get$arr$(133), new AwS575S0100000_31((C03K6) this, 383), new AwS575S0100000_31((C03K6) this, 384), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 385), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 386), null, new AwS575S0100000_31((C03K6) this, 387));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 388), awS575S0100000_31, AFwS221S0000000_31.get$arr$(134), new AwS575S0100000_31((C03K6) this, 389), new AwS575S0100000_31((C03K6) this, 390), new AwS575S0100000_31((C03K6) this, 391), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 392));
        }
        this.LLJ = assemVMLazy;
        this.LLJJI = new InterfaceC20511615Ny(this) { // from class: X.04GK
            public final /* synthetic */ SeaSkuBaseCell<T> LIZ;

            {
                this.LIZ = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
            @Override // X.InterfaceC20511615Ny
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r11, int r12, java.lang.String r13) {
                /*
                    r10 = this;
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell<T> r0 = r10.LIZ
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel r2 = r0.R5()
                    java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp> r0 = r2.LLILZ
                    if (r0 == 0) goto Lb4
                    java.lang.Object r1 = X.C13LP.LJJJLZIJ(r11, r0)
                    com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r1 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r1
                    if (r1 == 0) goto Lb4
                    X.002o r0 = r2.getState()
                    X.03lP r0 = (X.C936903lP) r0
                    java.util.List<java.lang.String> r0 = r0.LL
                    java.lang.Object r0 = X.C13LP.LJJJLZIJ(r11, r0)
                    if (r0 != 0) goto L22
                    java.lang.String r0 = ""
                L22:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r13)
                    if (r0 == 0) goto L80
                    java.lang.String r0 = "cancel"
                L2a:
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell<T> r1 = r10.LIZ
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel r3 = r1.R5()
                    kotlin.jvm.internal.AwS19S1101000_1 r2 = new kotlin.jvm.internal.AwS19S1101000_1
                    r1 = 1
                    r2.<init>(r11, r13, r3, r1)
                    r3.withState(r2)
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell<T> r1 = r10.LIZ
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel r1 = r1.R5()
                    X.03gr r3 = r1.LLJILJILJ
                    if (r3 == 0) goto L5d
                    java.lang.String r4 = "module_click"
                    X.049i r5 = new X.049i
                    r5.<init>()
                    kotlin.jvm.internal.AwS150S1100000_1 r6 = new kotlin.jvm.internal.AwS150S1100000_1
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell<T> r2 = r10.LIZ
                    r1 = 10
                    r6.<init>(r2, r0, r1)
                    X.03xV r7 = X.EnumC1011903xV.LOG_VIEW
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell<T> r1 = r10.LIZ
                    android.view.View r8 = r1.itemView
                    r9 = 0
                    r3.LIZLLL(r4, r5, r6, r7, r8, r9)
                L5d:
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell<T> r1 = r10.LIZ
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel r1 = r1.R5()
                    X.03gr r2 = r1.LLJILJILJ
                    if (r2 == 0) goto L7f
                    java.lang.String r3 = "tiktokec_button_click"
                    X.049Y r4 = new X.049Y
                    r4.<init>()
                    X.04GL r5 = new X.04GL
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell<T> r1 = r10.LIZ
                    r5.<init>(r1, r0, r11, r12)
                    X.03xV r6 = X.EnumC1011903xV.LOG_VIEW
                    com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.spec.SeaSkuBaseCell<T> r0 = r10.LIZ
                    android.view.View r7 = r0.itemView
                    r8 = 0
                    r2.LIZLLL(r3, r4, r5, r6, r7, r8)
                L7f:
                    return
                L80:
                    java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue> r0 = r1.salePropValueList
                    r4 = 0
                    if (r0 == 0) goto Lba
                    java.util.Iterator r3 = r0.iterator()
                L89:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto Lb8
                    java.lang.Object r2 = r3.next()
                    r0 = r2
                    com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue) r0
                    java.lang.Boolean r1 = r0.isDefaultSelected
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L89
                La0:
                    com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue r2 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue) r2
                    if (r2 == 0) goto Lba
                    java.lang.String r1 = r2.propValueId
                    if (r1 == 0) goto Lba
                    int r0 = r1.length()
                    if (r0 == 0) goto Lba
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r13)
                    if (r0 == 0) goto Lba
                Lb4:
                    java.lang.String r0 = "select"
                    goto L2a
                Lb8:
                    r2 = r4
                    goto La0
                Lba:
                    java.lang.String r0 = "reselect"
                    goto L2a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C04GK.LIZ(int, int, java.lang.String):void");
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC20511615Ny
            public final void LIZIZ(int i, int i2, TuxIconView tuxIconView, String str) {
                this.LIZ.S5(i2);
            }
        };
    }

    public final SeaSkuSpecViewModel R5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (SeaSkuSpecViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        this.itemView.findViewById(R.id.u55);
        this.LLJI = (TuxTextView) this.itemView.findViewById(R.id.u54);
        this.LLJIJIL = (TuxTextView) this.itemView.findViewById(R.id.u53);
        this.LLJILJIL = (ViewOnAttachStateChangeListenerC20604515jv) this.itemView.findViewById(R.id.u50);
        this.LLJILJILJ = (ViewGroup) this.itemView.findViewById(R.id.u52);
        this.LLJILLL = this.itemView.findViewById(R.id.u51);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setNestedScrollingEnabled(false);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.setOnTouchListener(new ATListenerS437S0100000_1(this, 3));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int size;
        TuxTextView tuxTextView;
        AbstractC756202xM abstractC756202xM = (AbstractC756202xM) interfaceC1891350zJl;
        if ((abstractC756202xM instanceof C031C) || (abstractC756202xM instanceof C747202vu)) {
            super.onBindItemView(abstractC756202xM);
            SaleProp salePropN5 = N5(abstractC756202xM);
            int iLIZIZ = (int) (C1743690vTb.LIZIZ() * 0.5f);
            if (iLIZIZ > 0 && (tuxTextView = this.LLJI) != null) {
                tuxTextView.setMaxWidth(iLIZIZ);
            }
            TuxTextView tuxTextView2 = this.LLJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
            }
            TuxTextView tuxTextView3 = this.LLJI;
            if (tuxTextView3 != null) {
                tuxTextView3.setLines(1);
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                TuxTextView tuxTextView4 = this.LLJI;
                if (tuxTextView4 != null) {
                    tuxTextView4.setTextColor(iIntValue);
                }
            }
            List<SalePropValue> list = salePropN5.salePropValueList;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            String strLIZIZ = salePropN5.propName;
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            TuxTextView tuxTextView5 = this.LLJI;
            if (tuxTextView5 != null) {
                if (size > 0 && Intrinsics.LJFF(salePropN5.hasImage, Boolean.TRUE)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(" (");
                    sbLIZ.append(size);
                    sbLIZ.append(')');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                tuxTextView5.setText(strLIZIZ);
            }
            SizeGuide sizeGuideP5 = P5(abstractC756202xM);
            if (sizeGuideP5 == null) {
                TuxTextView tuxTextView6 = this.LLJIJIL;
                if (tuxTextView6 != null) {
                    C0H1U.LIZIZ(tuxTextView6);
                }
                TuxTextView tuxTextView7 = this.LLJIJIL;
                if (tuxTextView7 != null) {
                    C786410Ut5.I7(new AjS13S0000000_31(0), tuxTextView7);
                }
            } else {
                String str = sizeGuideP5.skuSizeGuideButtonText;
                if ((str != null || (str = sizeGuideP5.skuSizeGuideTitle) != null) && str.length() != 0) {
                    TuxTextView tuxTextView8 = this.LLJIJIL;
                    if (tuxTextView8 != null) {
                        C12ES.LJIILL(0, tuxTextView8);
                    }
                    TuxTextView tuxTextView9 = this.LLJIJIL;
                    if (tuxTextView9 != null) {
                        tuxTextView9.setText(str);
                    }
                    TuxTextView tuxTextView10 = this.LLJIJIL;
                    if (tuxTextView10 != null) {
                        C1748720vbi.LJFF(tuxTextView10, new C049X(), AFwS185S0000000_1.get$arr$(9), AFwS268S0000000_26.get$arr$(2));
                    }
                    TuxTextView tuxTextView11 = this.LLJIJIL;
                    if (tuxTextView11 != null) {
                        C786410Ut5.I7(new AjS40S0200000_1(this, sizeGuideP5, 3), tuxTextView11);
                    }
                } else {
                    TuxTextView tuxTextView12 = this.LLJIJIL;
                    if (tuxTextView12 != null) {
                        C0H1U.LIZIZ(tuxTextView12);
                    }
                    TuxTextView tuxTextView13 = this.LLJIJIL;
                    if (tuxTextView13 != null) {
                        C786410Ut5.I7(new AjS13S0000000_31(1), tuxTextView13);
                    }
                }
            }
            L5(abstractC756202xM, salePropN5);
            C908703gr c908703gr = R5().LLJILJILJ;
            if (c908703gr != null) {
                C10515049h c10515049h = new C10515049h();
                EnumC1011903xV enumC1011903xV = EnumC1011903xV.LOG_WHEN_SHOW;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sku_module_show_");
                sbLIZ2.append(salePropN5.propId);
                c908703gr.LIZLLL("tiktokec_module_show", c10515049h, new AwS545S0100000_1(this, (SeaSkuBaseCell<AbstractC756202xM>) 7), enumC1011903xV, this.itemView, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }
}
