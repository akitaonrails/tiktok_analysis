package com.lynx.tasm.behavior.shadow.text;

import X.AbstractC1316910kNF;
import X.C1289620jfE;
import X.C1299120juY;
import X.C1300980jxY;
import X.C1301060jxg;
import X.C1310290kCZ;
import X.C1312230kFh;
import X.C1312250kFj;
import X.C1312260kFk;
import X.C1312280kFm;
import X.C1312290kFn;
import X.C1313920kIQ;
import X.C1314570kJT;
import X.C1316710kMv;
import X.C1316720kMw;
import X.C1316730kMx;
import X.C1316770kN1;
import X.C1316780kN2;
import X.C1316860kNA;
import X.C1316870kNB;
import X.C1316900kNE;
import X.InterfaceC1312240kFi;
import X.InterfaceC1312540kGC;
import Y.ARunnableS89S0200000_20;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import j27.s;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class TextShadowNode extends BaseTextShadowNode implements InterfaceC1312240kFi {
    public C1316730kMx LJJIL;
    public CharSequence LJJIZ;
    public CharSequence LJJJ;
    public CharSequence LJJJI;
    public InlineTruncationShadowNode LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public float LJJJJJL = Float.MIN_VALUE;
    public float LJJJJL = Float.MAX_VALUE;
    public float LJJJJLI = Float.MIN_VALUE;
    public int LJJJJLL;
    public C1312230kFh LJJJJZ;
    public C1312280kFm LJJJJZI;

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final boolean LJJIJIIJIL() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void LJFF() {
        if (this instanceof LynxInlineTruncationShadowNode) {
            return;
        }
        this.LJJIL = null;
        this.LJJJ = null;
        LJJJJI();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final Object LJIIL() {
        HashSet hashSet;
        C1316730kMx c1316730kMx;
        Layout layout;
        if (this.LJJIL == null) {
            return null;
        }
        DecimalFormat decimalFormat = C1316710kMv.LIZ;
        Map<String, C1299120juY> map = this.LJIILL;
        if (map != null && map.containsKey("layout") && (c1316730kMx = this.LJJIL) != null && (layout = c1316730kMx.LIZ) != null) {
            int i = this.LIZIZ;
            int i2 = this.LJIJJLI.LJIIIZ;
            int iLJII = c1316730kMx.LJII();
            int i3 = this.LJJJJLL;
            if (i3 == 0) {
                i3 = this.LJJIL.LIZJ;
            }
            C1289620jfE.LIZJ(new ARunnableS89S0200000_20(C1316710kMv.LJIIIZ(i, layout, i2, iLJII, i3, LJJJ(), this.LJJIL.LIZLLL(), !(this instanceof LynxTextShadowNode)), this, 163));
        }
        if (this.LJIJJLI.LJIIZILJ || this.LJJJIL != null) {
            hashSet = new HashSet();
            LJJIJIIJI(this.LJJIL.LIZ.getText(), hashSet, this.LJJIZ.length() - this.LJJJJLL);
            InlineTruncationShadowNode inlineTruncationShadowNode = this.LJJJIL;
            if (inlineTruncationShadowNode != null && this.LJJJJLL == 0) {
                LJJJI(inlineTruncationShadowNode, hashSet);
            }
        } else {
            hashSet = null;
        }
        C1316730kMx c1316730kMx2 = this.LJJIL;
        Layout layout2 = c1316730kMx2.LIZ;
        C1316720kMw c1316720kMw = this.LJIJJLI;
        C1316780kN2 c1316780kN2 = new C1316780kN2(layout2, c1316720kMw.LJIILLIIL, hashSet, this.LJJJJI && c1316720kMw.LIZLLL == 5);
        c1316780kN2.LJ = new PointF(c1316730kMx2.LIZLLL, c1316730kMx2.LJ);
        c1316780kN2.LJFF = this.LJJIJ;
        c1316780kN2.LJI = this.LJJIZ;
        this.LJJIL = null;
        return c1316780kN2;
    }

    public int LJJJ() {
        CharSequence charSequence = this.LJJIZ;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public void LJJJJI() {
        if (!this.LJJII) {
            ShadowNode shadowNodeLJIIIZ = this;
            int i = 3;
            while (shadowNodeLJIIIZ.LJIIJ() > 0) {
                shadowNodeLJIIIZ = shadowNodeLJIIIZ.LJIIIZ(0);
                if (!(shadowNodeLJIIIZ instanceof InlineTextShadowNode)) {
                    break;
                }
                int i2 = ((BaseTextShadowNode) shadowNodeLJIIIZ).LJIJJLI.LIZLLL;
                if (i2 != 3) {
                    i = i2;
                }
            }
            if (i != 3) {
                this.LJIJJLI.LIZLLL = i;
            }
        }
        boolean zLJJJJ = LJJJJ();
        this.LJIJJLI.LJIJ = zLJJJJ;
        if (zLJJJJ) {
            if (LJIIJ() == 0) {
                this.LJJIZ = LJJIIZI(this.LJJIJIIJIL, false);
            } else {
                RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) LJIIIZ(0);
                this.LJJIZ = LJJIIZI(rawTextShadowNode.LJIJJLI, rawTextShadowNode.LJIL);
            }
            if (this.LJJIZ == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.LJJIZ);
            LJJIIJZLJL(0, this.LJJIZ.length(), arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C1316900kNE) it2.next()).LIZ(spannableStringBuilder);
            }
            this.LJJIZ = spannableStringBuilder;
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        this.LJJIZ = spannableStringBuilder2;
        LJJIL(spannableStringBuilder2, this);
        this.LJJJIL = null;
        int i3 = 0;
        while (true) {
            if (i3 >= LJIIJ()) {
                break;
            }
            if (LJIIIZ(i3) instanceof InlineTruncationShadowNode) {
                this.LJJJIL = (InlineTruncationShadowNode) LJIIIZ(i3);
                break;
            }
            i3++;
        }
        if (this.LJJJIL != null) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            this.LJJJ = spannableStringBuilder3;
            LJJIL(spannableStringBuilder3, this.LJJJIL);
            C1316720kMw c1316720kMw = this.LJIJJLI;
            boolean z = c1316720kMw.LJIILLIIL;
            C1316720kMw c1316720kMw2 = this.LJJJIL.LJIJJLI;
            c1316720kMw.LJIILLIIL = z | c1316720kMw2.LJIILLIIL;
            c1316720kMw.LJIIZILJ |= c1316720kMw2.LJIIZILJ;
            c1316720kMw.LJIIIZ = 0;
        }
        this.LJJJJL = Float.MAX_VALUE;
        this.LJJJJLI = Float.MIN_VALUE;
        this.LJJJJJL = Float.MIN_VALUE;
        if (this.LJJJJJ || this.LJJJJIZL) {
            LJJIZ(this);
        }
        float f = this.LJIJJLI.LJIIJ;
        if (f == 1.0E21f) {
            f = 0.0f;
        }
        C1316870kNB c1316870kNB = new C1316870kNB(Arrays.asList(Float.valueOf(this.LJJJJL), Float.valueOf(this.LJJJJLI), Float.valueOf(this.LJJJJJL), Float.valueOf(f)));
        LJJJIL(this.LJJIZ, c1316870kNB);
        CharSequence charSequence = this.LJJJ;
        if (charSequence != null) {
            LJJJIL(charSequence, c1316870kNB);
        }
    }

    public TextShadowNode() {
        if (this instanceof LynxInlineTruncationShadowNode) {
            return;
        }
        LJI(this);
    }

    public boolean LJJJJ() {
        return ((LJIIJ() == 1 && (LJIIIZ(0) instanceof RawTextShadowNode)) || (LJIIJ() == 0 && this.LJJIJIIJIL != null)) && C1314570kJT.LIZ(this.LJIJJLI.LJIIJ);
    }

    public static void LJJJJIZL(BaseTextShadowNode baseTextShadowNode) {
        for (int i = 0; i < baseTextShadowNode.LJIIJ(); i++) {
            ShadowNode shadowNodeLJIIIZ = baseTextShadowNode.LJIIIZ(i);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) shadowNodeLJIIIZ;
                nativeLayoutNodeRef.LJIJJLI = nativeLayoutNodeRef.LJJ;
                nativeLayoutNodeRef.LJIL = nativeLayoutNodeRef.LJJI;
            } else if (shadowNodeLJIIIZ instanceof BaseTextShadowNode) {
                LJJJJIZL((BaseTextShadowNode) shadowNodeLJIIIZ);
            }
        }
    }

    public final void LJJIZ(BaseTextShadowNode baseTextShadowNode) {
        Typeface typefaceLJ;
        s sVarLJIIJJI = LJIIJJI();
        C1316720kMw c1316720kMw = baseTextShadowNode.LJIJJLI;
        DecimalFormat decimalFormat = C1316710kMv.LIZ;
        String str = c1316720kMw.LJIJJ;
        if (!TextUtils.isEmpty(str)) {
            typefaceLJ = C1300980jxY.LJ(c1316720kMw.LJ(), sVarLJIIJJI, str);
        } else {
            typefaceLJ = null;
        }
        TextPaint textPaintLJIIJJI = C1316710kMv.LJIIJJI(c1316720kMw, typefaceLJ);
        if (this.LJJJJJ) {
            this.LJJJJL = Math.min(textPaintLJIIJJI.getFontMetrics().ascent, this.LJJJJL);
            this.LJJJJLI = Math.max(textPaintLJIIJJI.getFontMetrics().descent, this.LJJJJLI);
        }
        if (this.LJJJJIZL) {
            textPaintLJIIJJI.getTextBounds("x", 0, 1, new Rect());
            this.LJJJJJL = Math.max(this.LJJJJJL, r2.height());
        }
        for (int i = 0; i < baseTextShadowNode.LJIIJ(); i++) {
            ShadowNode shadowNodeLJIIIZ = baseTextShadowNode.LJIIIZ(i);
            if ((shadowNodeLJIIIZ instanceof InlineTextShadowNode) || (shadowNodeLJIIIZ instanceof InlineTruncationShadowNode)) {
                LJJIZ((BaseTextShadowNode) shadowNodeLJIIIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @X.InterfaceC1312540kGC(name = "-x-auto-font-size")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAutoFontSize(com.lynx.react.bridge.ReadableArray r8) {
        /*
            r7 = this;
            X.0kMw r6 = r7.LJIJJLI
            r2 = 0
            if (r8 == 0) goto L31
            r6.getClass()
            int r1 = r8.size()
            r0 = 4
            if (r1 != r0) goto L31
            boolean r5 = r8.getBoolean(r2)
            r0 = 1
            double r0 = r8.getDouble(r0)
            float r4 = (float) r0
            r0 = 2
            double r0 = r8.getDouble(r0)
            float r3 = (float) r0
            r0 = 3
            double r1 = r8.getDouble(r0)
            float r0 = (float) r1
            r6.LJIJJLI = r5
            r6.LJJ = r4
            r6.LJIL = r3
            r6.LJJI = r0
        L2d:
            r7.LJIILLIIL()
            return
        L31:
            r6.LJIJJLI = r2
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.TextShadowNode.setAutoFontSize(com.lynx.react.bridge.ReadableArray):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @X.InterfaceC1312540kGC(name = "-x-auto-font-size-line-ranges")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAutoFontSizeLineRanges(com.lynx.react.bridge.ReadableArray r12) {
        /*
            r11 = this;
            X.0kMw r6 = r11.LJIJJLI
            r5 = 0
            if (r12 == 0) goto L5a
            r6.getClass()
            int r0 = r12.size()
            if (r0 == 0) goto L5a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = 0
            r3 = 0
        L15:
            int r0 = r12.size()
            if (r3 >= r0) goto L5d
            com.lynx.react.bridge.ReadableType r1 = r12.getType(r3)
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Array
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L57
            com.lynx.react.bridge.ReadableArray r9 = r12.getArray(r3)
            if (r9 == 0) goto L57
            int r1 = r9.size()
            r0 = 4
            if (r1 < r0) goto L57
            double r0 = r9.getDouble(r7)
            int r2 = (int) r0
            r0 = 1
            double r0 = r9.getDouble(r0)
            int r8 = (int) r0
            if (r2 <= 0) goto L57
            if (r8 < r2) goto L57
            r0 = 2
            double r0 = r9.getDouble(r0)
            float r10 = (float) r0
            r0 = 3
            double r0 = r9.getDouble(r0)
            float r9 = (float) r0
            X.0kN7 r0 = new X.0kN7
            r0.<init>(r10, r9, r2, r8)
            r4.add(r0)
        L57:
            int r3 = r3 + 1
            goto L15
        L5a:
            r6.LJJII = r5
            goto L66
        L5d:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L64
            r5 = r4
        L64:
            r6.LJJII = r5
        L66:
            r11.LJIILLIIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.TextShadowNode.setAutoFontSizeLineRanges(com.lynx.react.bridge.ReadableArray):void");
    }

    @InterfaceC1312540kGC(name = "-x-auto-font-size-preset-sizes")
    public void setAutoFontSizePresetSizes(ReadableArray readableArray) {
        C1316720kMw c1316720kMw = this.LJIJJLI;
        float[] fArr = null;
        if (readableArray != null) {
            c1316720kMw.getClass();
            if (readableArray.size() != 0) {
                int size = readableArray.size();
                float[] fArr2 = new float[size];
                for (int i = 0; i < readableArray.size(); i++) {
                    fArr2[i] = (float) readableArray.getDouble(i);
                }
                if (size != 0) {
                    fArr = fArr2;
                }
                c1316720kMw.LJJIFFI = fArr;
                return;
            }
        }
        c1316720kMw.LJJIFFI = null;
    }

    @InterfaceC1312540kGC(name = "enable-full-justify")
    public void setEnableFullJustify(boolean z) {
        if (this.LJJJJI != z) {
            LJIILLIIL();
            this.LJJJJI = z;
        }
    }

    @InterfaceC1312540kGC(name = "tail-color-convert")
    public void setEnableTailColorConvert(boolean z) {
        this.LJJJJ = z;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "hyphens")
    public void setHyphen(int i) {
        boolean z;
        C1316720kMw c1316720kMw = this.LJIJJLI;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        c1316720kMw.LJJIIJ = z;
        LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    @InterfaceC1312540kGC(defaultFloat = 1.0E21f, name = "line-height")
    public void setLineHeight(float f) {
        LJJIJLIJ(f);
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "text-single-line-vertical-align")
    public void setVerticalTextAlign(String str) {
        if ("center".equals(str)) {
            this.LJIJJLI.LJJIJ = 11;
        } else if ("top".equals(str)) {
            this.LJIJJLI.LJJIJ = 4;
        } else if ("bottom".equals(str)) {
            this.LJIJJLI.LJJIJ = 7;
        } else {
            this.LJIJJLI.LJJIJ = 0;
        }
        LJIILLIIL();
    }

    public static void LJJJI(BaseTextShadowNode baseTextShadowNode, Set set) {
        for (int i = 0; i < baseTextShadowNode.LJIIJ(); i++) {
            ShadowNode shadowNodeLJIIIZ = baseTextShadowNode.LJIIIZ(i);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                ((HashSet) set).add(Integer.valueOf(shadowNodeLJIIIZ.LIZIZ));
            } else if (shadowNodeLJIIIZ instanceof BaseTextShadowNode) {
                LJJJI((BaseTextShadowNode) shadowNodeLJIIIZ, set);
            }
        }
    }

    public static void LJJJJJ(int i, BaseTextShadowNode baseTextShadowNode) {
        for (int i2 = 0; i2 < baseTextShadowNode.LJIIJ(); i2++) {
            ShadowNode shadowNodeLJIIIZ = baseTextShadowNode.LJIIIZ(i2);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) shadowNodeLJIIIZ;
                nativeLayoutNodeRef.LJIJJLI += i;
                nativeLayoutNodeRef.LJIL += i;
            } else if (shadowNodeLJIIIZ instanceof BaseTextShadowNode) {
                LJJJJJ(i, (BaseTextShadowNode) shadowNodeLJIIIZ);
            }
        }
    }

    @Override // X.InterfaceC1312240kFi
    public final C1312250kFj LIZ(C1312280kFm c1312280kFm, C1312230kFh c1312230kFh) {
        this.LJJJJZ = c1312230kFh;
        this.LJJJJZI = c1312280kFm;
        this.LJJJJLL = 0;
        long jLIZLLL = LIZLLL(this, c1312230kFh.LIZ, c1312230kFh.LIZIZ, c1312230kFh.LIZJ, c1312230kFh.LIZLLL);
        return new C1312250kFj(Float.intBitsToFloat((int) ((jLIZLLL >> 32) & (-1))), Float.intBitsToFloat((int) (jLIZLLL & (-1))), this.LJIIIIZZ);
    }

    @Override // X.InterfaceC1312240kFi
    public final void LIZJ(C1312290kFn c1312290kFn, C1312260kFk c1312260kFk) {
        C1316730kMx c1316730kMx = this.LJJIL;
        if (c1316730kMx == null) {
            return;
        }
        Layout layout = c1316730kMx.LIZ;
        CharSequence charSequence = this.LJJJI;
        if (charSequence == null) {
            charSequence = this.LJJIZ;
        }
        LJJIII(layout, (SpannableStringBuilder) charSequence, new PointF(c1316730kMx.LIZLLL, c1316730kMx.LJ));
    }

    public final void LJJIL(SpannableStringBuilder spannableStringBuilder, BaseTextShadowNode baseTextShadowNode) {
        int i;
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        baseTextShadowNode.LJJIIZ(spannableStringBuilder, arrayList);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C1316900kNE) ListProtector.get(arrayList, size)).LIZ(spannableStringBuilder);
        }
        for (MetricAffectingSpan metricAffectingSpan : (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class)) {
            if (metricAffectingSpan instanceof AbstractC1316910kNF) {
                i = ((AbstractC1316910kNF) metricAffectingSpan).LL;
            } else if (metricAffectingSpan instanceof C1316770kN1) {
                i = ((C1316770kN1) metricAffectingSpan).LL;
            } else {
                i = 0;
            }
            if (!this.LJJJJJ && i != 5 && i != 8 && i != 4 && i != 7 && i != 11) {
                z = false;
            } else {
                z = true;
            }
            this.LJJJJJ = z;
            if (!this.LJJJJIZL && i != 6) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.LJJJJIZL = z2;
        }
    }

    public final void LJJJIL(CharSequence charSequence, C1316870kNB c1316870kNB) {
        boolean z;
        for (AbstractC1316910kNF abstractC1316910kNF : (AbstractC1316910kNF[]) ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), AbstractC1316910kNF.class)) {
            abstractC1316910kNF.LLILZ = c1316870kNB;
            C1310290kCZ c1310290kCZ = LJIIJJI().LLLIIII;
            if (c1310290kCZ != null) {
                z = c1310290kCZ.LJIJI;
            } else {
                z = false;
            }
            abstractC1316910kNF.LLILZIL = z;
        }
        for (C1316770kN1 c1316770kN1 : (C1316770kN1[]) ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), C1316770kN1.class)) {
            c1316770kN1.LLILZ = c1316870kNB;
            c1316770kN1.LLILZIL = this.LJIJJLI.LJIIJ;
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    public final void LJJIIJZLJL(int i, int i2, List<C1316900kNE> list) {
        if (this.LJIJJLI.LJIILJJIL != null) {
            C1316860kNA c1316860kNA = this.LJIJJLI.LJIILJJIL;
            LayoutNode layoutNode = this.LJII.LIZ;
            float fLIZLLL = layoutNode.LIZ.LIZLLL(layoutNode.LIZIZ);
            int i3 = c1316860kNA.LIZ;
            float f = c1316860kNA.LIZIZ;
            if (i3 != 0) {
                f *= fLIZLLL;
            }
            ((ArrayList) list).add(new C1316900kNE(i, i2, new LeadingMarginSpan.Standard((int) f, 0)));
        }
        super.LJJIIJZLJL(i, i2, list);
        if (!TextUtils.isEmpty(this.LJIJJLI.LJIJJ)) {
            C1316720kMw c1316720kMw = this.LJIJJLI;
            String str = c1316720kMw.LJIJJ;
            int iLJ = c1316720kMw.LJ();
            if (C1300980jxY.LJ(iLJ, LJIIJJI(), str) == null) {
                C1301060jxg.LIZ.LJ(LJIIJJI(), str, iLJ, new C1313920kIQ(this));
            } else {
                this.LJIJJLI.LJJIII = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x026b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0250 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long LIZLLL(com.lynx.tasm.behavior.shadow.LayoutNode r29, float r30, X.EnumC1300260jwO r31, float r32, X.EnumC1300260jwO r33) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.TextShadowNode.LIZLLL(com.lynx.tasm.behavior.shadow.LayoutNode, float, X.0jwO, float, X.0jwO):long");
    }
}
