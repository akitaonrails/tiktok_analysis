package com.lynx.tasm.behavior.shadow.text;

import X.AbstractC1315160kKQ;
import X.AbstractC1315450kKt;
import X.C0WZX;
import X.C1310290kCZ;
import X.C1311130kDv;
import X.C1311920kFC;
import X.C1312230kFh;
import X.C1312250kFj;
import X.C1312260kFk;
import X.C1312280kFm;
import X.C1313270kHN;
import X.C1313360kHW;
import X.C1314000kIY;
import X.C1315130kKN;
import X.C1315140kKO;
import X.C1315150kKP;
import X.C1316710kMv;
import X.C1316720kMw;
import X.C1316760kN0;
import X.C1316860kNA;
import X.C1316900kNE;
import X.C1317660kOS;
import X.C1317670kOT;
import X.C2188811AlT;
import X.C2204961BRm;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.featurecount.LynxFeatureCounter;
import j27.s;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class BaseTextShadowNode extends ShadowNode {
    public static Method LJJIJIL = null;
    public static Object LJJIJL = null;
    public static boolean LJJIJLIJ = true;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public int LJJIIJZLJL;
    public boolean LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public String LJJIJIIJIL;
    public float LJJIFFI = 1.0E21f;
    public final C1316720kMw LJIJJLI = new C1316720kMw();

    public boolean LJJIJIIJIL() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public void LJIJJLI(s sVar) {
        boolean z;
        boolean z2;
        boolean z3;
        this.LJIIL = sVar;
        C1310290kCZ c1310290kCZ = sVar.LLLIIII;
        boolean z4 = false;
        if (c1310290kCZ != null) {
            z = c1310290kCZ.LJIJI;
        } else {
            z = false;
        }
        this.LJJII = z;
        if (c1310290kCZ != null) {
            z2 = c1310290kCZ.LJIL;
        } else {
            z2 = false;
        }
        this.LJJIII = z2;
        if (c1310290kCZ != null) {
            z3 = c1310290kCZ.LJIJJLI;
        } else {
            z3 = false;
        }
        this.LJJIIJ = z3;
        C1316720kMw c1316720kMw = this.LJIJJLI;
        if (c1310290kCZ != null) {
            z4 = c1310290kCZ.LJJI;
        }
        c1316720kMw.LJIJI = z4;
        c1316720kMw.LJIILIIL = Math.round(C1311130kDv.LIZIZ(14.0f, sVar.LLJJJ.density));
    }

    public final void LJJIJL(boolean z) {
        this.LJIL = z;
        setFontSize(this.LJIJJLI.LJIILIIL);
        for (int i = 0; i < LJIIJ(); i++) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(i);
            if (shadowNodeLJIIIZ instanceof BaseTextShadowNode) {
                ((BaseTextShadowNode) shadowNodeLJIIIZ).LJJIJL(this.LJIL);
            }
        }
    }

    public final void LJJIJLIJ(float f) {
        s sVar;
        this.LJJIFFI = f;
        if (this.LJIL && (sVar = this.LJIIL) != null) {
            if (sVar.LLLFZ == null) {
                sVar.LLLFZ = Float.valueOf(sVar.getResources().getConfiguration().fontScale);
            }
            f *= sVar.LLLFZ.floatValue();
        }
        C1316720kMw c1316720kMw = this.LJIJJLI;
        if (c1316720kMw.LJIIJ != f) {
            c1316720kMw.LJIIJ = f;
            LJIILLIIL();
        }
    }

    @InterfaceC1312540kGC(name = "custom-baseline-shift")
    public void setBaselineShift(String str) {
        try {
            try {
                if (str.contains("px")) {
                    float f = Float.parseFloat(str.substring(0, str.indexOf("px")).trim());
                    this.LJIJJLI.LJIILL = C1311130kDv.LIZIZ(f, 0.0f);
                    this.LJIJJLI.LJFF = 3;
                } else if (str.contains("%")) {
                    String strTrim = str.substring(0, str.indexOf("%")).trim();
                    C1316720kMw c1316720kMw = this.LJIJJLI;
                    float f2 = Float.parseFloat(strTrim) * 0.01f;
                    C1316720kMw c1316720kMw2 = this.LJIJJLI;
                    c1316720kMw.LJIILL = f2 * c1316720kMw2.LJIILIIL;
                    c1316720kMw2.LJFF = 3;
                } else {
                    float f3 = Float.parseFloat(str.trim());
                    C1316720kMw c1316720kMw3 = this.LJIJJLI;
                    c1316720kMw3.LJIILL = f3 * c1316720kMw3.LJIILIIL;
                    c1316720kMw3.LJFF = 3;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.e("BaseTextShadowNode", e.toString());
                C1316720kMw c1316720kMw4 = this.LJIJJLI;
                c1316720kMw4.LJIILL = 0.0f;
                c1316720kMw4.LJFF = -1;
            }
            LJIILLIIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIILLIIL();
            throw th;
        }
    }

    @InterfaceC1312540kGC(name = "color")
    public void setColor(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        ReadableType readableType = ReadableType.Array;
        if (type == readableType) {
            this.LJIJJLI.LIZJ = null;
            ReadableArray readableArrayAsArray = interfaceC1298070jsr.asArray();
            if (readableArrayAsArray.size() >= 2 && readableArrayAsArray.getType(1) == readableType) {
                long j = readableArrayAsArray.getLong(0);
                if (j == 2) {
                    this.LJIJJLI.LJJJ = new C1315150kKP(readableArrayAsArray.getArray(1));
                    if (this.LJJIIZ) {
                        this.LJIJJLI.LJJJ.LJIIIIZZ(true);
                    }
                } else if (j == 3) {
                    this.LJIJJLI.LJJJ = new C1315130kKN(readableArrayAsArray.getArray(1));
                } else if (j == 4) {
                    this.LJIJJLI.LJJJ = new C1315140kKO(readableArrayAsArray.getArray(1));
                } else {
                    this.LJIJJLI.LJJJ = null;
                }
            } else {
                this.LJIJJLI.LJJJ = null;
            }
        } else if (type == ReadableType.Int) {
            this.LJIJJLI.LIZJ = Integer.valueOf(interfaceC1298070jsr.asInt());
            this.LJIJJLI.LJJJ = null;
        } else if (type == ReadableType.Long) {
            this.LJIJJLI.LIZJ = Integer.valueOf((int) interfaceC1298070jsr.asLong());
            this.LJIJJLI.LJJJ = null;
        } else {
            C1316720kMw c1316720kMw = this.LJIJJLI;
            c1316720kMw.LIZJ = null;
            c1316720kMw.LJJJ = null;
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "direction")
    public void setDirection(int i) {
        this.LJIJJLI.LJ = i;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "bitmap-gradient")
    public void setEnableBitmapGradient(boolean z) {
        this.LJJIIZ = z;
        AbstractC1315160kKQ abstractC1315160kKQ = this.LJIJJLI.LJJJ;
        if (abstractC1315160kKQ != null) {
            abstractC1315160kKQ.LJIIIIZZ(z);
        }
    }

    @InterfaceC1312540kGC(name = "android-emoji-compat")
    public void setEnableEmojiCompat(boolean z) {
        this.LJJIJIIJI = z;
        if (z && LJJIJLIJ && LJJIJIL == null) {
            try {
                Class<?> cls = Class.forName("androidx.emoji2.text.e");
                LJJIJL = cls.getDeclaredMethod("get", new Class[0]).invoke(null, new Object[0]);
                LJJIJIL = cls.getDeclaredMethod("process", CharSequence.class);
                cls.getDeclaredMethod("setEmojiSpanIndicatorColor", Integer.TYPE).invoke(LJJIJL, 0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJJIJLIJ = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enable emoji e: ");
                sbLIZ.append(e);
                LynxLog.e("lynx_BaseTextShadowNode", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "enable-font-scaling")
    public void setEnableFontScaling(String str) {
        s sVar = this.LJIIL;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(88, sVar.LLJLILLLLZIIL);
        }
        LJJIJL(Boolean.parseBoolean(str));
    }

    @InterfaceC1312540kGC(name = "font-family")
    public void setFontFamily(String str) {
        if (str == null) {
            if (!TextUtils.isEmpty(this.LJIJJLI.LJIJJ)) {
                this.LJIJJLI.LJIJJ = null;
                LJIILLIIL();
                return;
            }
            return;
        }
        if (!str.equals(this.LJIJJLI.LJIJJ)) {
            this.LJIJJLI.LJIJJ = str;
            LJIILLIIL();
        }
    }

    @InterfaceC1312540kGC(name = "font-feature-settings")
    public void setFontFeatureSettings(ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < readableArray.size() / 2; i++) {
                int i2 = i * 2;
                String string = readableArray.getString(i2);
                int i3 = readableArray.getInt(i2 + 1);
                sb.append("'");
                sb.append(string);
                sb.append("' ");
                sb.append(i3);
                sb.append(",");
            }
            this.LJIJJLI.LJJIIZ = sb.toString();
        } else {
            this.LJIJJLI.LJJIIZ = null;
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(defaultFloat = 1.0E21f, name = "font-size")
    public void setFontSize(float f) {
        s sVar;
        if (this.LJIL && (sVar = this.LJIIL) != null) {
            if (sVar.LLLFZ == null) {
                sVar.LLLFZ = Float.valueOf(sVar.getResources().getConfiguration().fontScale);
            }
            f *= sVar.LLLFZ.floatValue();
        }
        if (!C1314000kIY.LIZ(this.LJIJJLI.LJIILIIL, f)) {
            this.LJIJJLI.LJIILIIL = f;
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "font-style")
    public void setFontStyle(int i) {
        if (i == 0) {
            C1316720kMw c1316720kMw = this.LJIJJLI;
            if (c1316720kMw.LJII != 0) {
                c1316720kMw.LJII = 0;
                LJIILLIIL();
                return;
            }
            return;
        }
        if (i != 1 && i != 2) {
            return;
        }
        C1316720kMw c1316720kMw2 = this.LJIJJLI;
        if (c1316720kMw2.LJII == 2) {
            return;
        }
        c1316720kMw2.LJII = 2;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "font-variation-settings")
    public void setFontVariationSettings(ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < readableArray.size() / 2; i++) {
                int i2 = i * 2;
                String string = readableArray.getString(i2);
                double d = readableArray.getDouble(i2 + 1);
                sb.append("'");
                sb.append(string);
                sb.append("' ");
                sb.append(d);
                sb.append(",");
            }
            this.LJIJJLI.LJJIIJZLJL = sb.toString();
        } else {
            this.LJIJJLI.LJJIIJZLJL = null;
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "font-weight")
    public void setFontWeight(int i) {
        C1316720kMw c1316720kMw = this.LJIJJLI;
        if (i != c1316720kMw.LJI) {
            c1316720kMw.LJI = i;
            LJIILLIIL();
        }
    }

    @InterfaceC1312540kGC(name = "include-font-padding")
    public void setIncludeFontPadding(boolean z) {
        this.LJIJJLI.LJIJI = z;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(defaultFloat = 1.0E21f, name = "letter-spacing")
    public void setLetterSpacing(float f) {
        this.LJIJJLI.LJIIJJI = f;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(defaultFloat = 1.0E21f, name = "line-height")
    public void setLineHeight(float f) {
        if (!this.LJJII) {
            LJJIJLIJ(f);
        }
    }

    @InterfaceC1312540kGC(defaultFloat = 0.0f, name = "line-spacing")
    public void setLineSpacing(float f) {
        this.LJIJJLI.LJIIL = f;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "text")
    public void setText(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LJJIJIIJIL = C1316710kMv.LIZIZ(interfaceC1298070jsr);
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(defaultInt = 3, name = "text-align")
    public void setTextAlign(int i) {
        this.LJIJJLI.LIZLLL = i;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "text-decoration")
    public void setTextDecoration(ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 3) {
            int i = readableArray.getInt(0);
            int i2 = readableArray.getInt(1);
            int i3 = readableArray.getInt(2);
            C1316720kMw c1316720kMw = this.LJIJJLI;
            c1316720kMw.LJJIJIL = i;
            c1316720kMw.LJJIJL = i2;
            c1316720kMw.LJJIJLIJ = i3;
            LJIILLIIL();
            return;
        }
        C1316720kMw c1316720kMw2 = this.LJIJJLI;
        c1316720kMw2.LJJIJIL = 0;
        c1316720kMw2.LJJIJL = 4;
        c1316720kMw2.LJJIJLIJ = 0;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "text-fake-bold")
    public void setTextFakeBold(boolean z) {
        this.LJJ = z;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "text-indent")
    public void setTextIndent(ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 2) {
            this.LJIJJLI.LJIILJJIL = new C1316860kNA(readableArray);
        } else {
            this.LJIJJLI.LJIILJJIL = null;
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "text-maxlength")
    public void setTextMaxLength(String str) {
        C1316720kMw c1316720kMw;
        try {
            this.LJIJJLI.LIZIZ = Integer.valueOf(str).intValue();
            LJIILLIIL();
            c1316720kMw = this.LJIJJLI;
            if (c1316720kMw.LIZIZ >= 0) {
                return;
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                this.LJIJJLI.LIZIZ = -1;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setTextMaxLength with invalid value:");
                sbLIZ.append(str);
                LynxLog.e("lynx_BaseTextShadowNode", C2188811AlT.LIZIZ(sbLIZ));
                c1316720kMw = this.LJIJJLI;
                if (c1316720kMw.LIZIZ >= 0) {
                    return;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1316720kMw c1316720kMw2 = this.LJIJJLI;
                if (c1316720kMw2.LIZIZ < 0) {
                    c1316720kMw2.LIZIZ = -1;
                }
                throw th2;
            }
        }
        c1316720kMw.LIZIZ = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[PHI: r1
      0x0033: PHI (r1v3 X.0kMw) = (r1v2 X.0kMw), (r1v5 X.0kMw) binds: [B:10:0x0031, B:5:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    @X.InterfaceC1312540kGC(name = "text-maxline")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTextMaxLine(java.lang.String r5) {
        /*
            r4 = this;
            r3 = -1
            X.0kMw r1 = r4.LJIJJLI     // Catch: java.lang.Throwable -> L10
            int r0 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L10
            r1.LIZ = r0     // Catch: java.lang.Throwable -> L10
            X.0kMw r1 = r4.LJIJJLI
            int r0 = r1.LIZ
            if (r0 >= 0) goto L35
            goto L33
        L10:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L39
            X.0kMw r0 = r4.LJIJJLI     // Catch: java.lang.Throwable -> L39
            r0.LIZ = r3     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "lynx_BaseTextShadowNode"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "setTextMaxLine with invalid value:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L39
            r1.append(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L39
            com.lynx.base.log.LynxLog.e(r2, r0)     // Catch: java.lang.Throwable -> L39
            X.0kMw r1 = r4.LJIJJLI
            int r0 = r1.LIZ
            if (r0 >= 0) goto L35
        L33:
            r1.LIZ = r3
        L35:
            r4.LJIILLIIL()
            return
        L39:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0kMw r1 = r4.LJIJJLI
            int r0 = r1.LIZ
            if (r0 >= 0) goto L45
            r1.LIZ = r3
        L45:
            r4.LJIILLIIL()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.setTextMaxLine(java.lang.String):void");
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "text-overflow")
    public void setTextOverflow(int i) {
        this.LJIJJLI.LJIIIZ = i;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "text-shadow")
    public void setTextShadow(ReadableArray readableArray) {
        this.LJIJJLI.LJJIJIIJIL = null;
        if (readableArray == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) C1313360kHW.LIZIZ(readableArray);
        if (arrayList.size() == 0) {
            return;
        }
        this.LJIJJLI.LJJIJIIJIL = (C1313360kHW) ListProtector.get(arrayList, 0);
    }

    @InterfaceC1312540kGC(name = "text-stroke-color")
    public void setTextStrokeColor(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type == ReadableType.Int) {
            this.LJIJJLI.LJJIL = interfaceC1298070jsr.asInt();
        } else if (type == ReadableType.Long) {
            this.LJIJJLI.LJJIL = (int) interfaceC1298070jsr.asLong();
        } else {
            this.LJIJJLI.LJJIL = 0;
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(defaultFloat = 0.0f, name = "text-stroke-width")
    public void setTextStrokeWidth(float f) {
        this.LJIJJLI.LJJIZ = f;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "text-vertical-align")
    public void setTextVerticalAlign(String str) {
        if ("top".equals(str)) {
            this.LJIJJLI.LJFF = 0;
        } else if ("center".equals(str)) {
            this.LJIJJLI.LJFF = 1;
        } else if ("bottom".equals(str)) {
            this.LJIJJLI.LJFF = 2;
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "use-web-line-height")
    public void setUseWebLineHeight(boolean z) {
        if (this.LJJI != z) {
            this.LJJI = z;
            float f = this.LJJIFFI;
            if (f != 1.0E21f) {
                setLineHeight(f);
            }
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "white-space")
    public void setWhiteSpace(int i) {
        this.LJIJJLI.LJIIIIZZ = i;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "word-break")
    public void setWordBreakStrategy(int i) {
        if (i != 2 && i != 1) {
            if (i == 0) {
                this.LJJIIZI = 2;
            } else {
                this.LJJIIZI = 0;
            }
        } else if (this.LJJIII) {
            this.LJJIIJZLJL = i;
        } else {
            this.LJJIIZI = 1;
        }
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "font-optical-sizing")
    public void setFontFeatureSettings(int i) {
        C1316720kMw c1316720kMw = this.LJIJJLI;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c1316720kMw.LJJIIZI = z;
        LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIIIIZZ(ShadowNode shadowNode, int i) {
        super.LJIIIIZZ(shadowNode, i);
        if (shadowNode instanceof BaseTextShadowNode) {
            ((BaseTextShadowNode) shadowNode).LJJIJL(this.LJIL);
        }
    }

    public void LJJIIZ(SpannableStringBuilder spannableStringBuilder, List<C1316900kNE> list) {
        T t;
        String str;
        C1316720kMw c1316720kMw = this.LJIJJLI;
        c1316720kMw.LJIILLIIL = false;
        c1316720kMw.LJIIZILJ = false;
        this.LJJIJ = false;
        int length = spannableStringBuilder.length();
        if (LJIIJ() == 0 && (str = this.LJJIJIIJIL) != null) {
            LJJIIJ(spannableStringBuilder, str, false);
        }
        int iLJIIJ = LJIIJ();
        for (int i = 0; i < iLJIIJ; i++) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(i);
            if (shadowNodeLJIIIZ instanceof RawTextShadowNode) {
                RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) shadowNodeLJIIIZ;
                String str2 = rawTextShadowNode.LJIJJLI;
                if (str2 != null) {
                    LJJIIJ(spannableStringBuilder, str2, rawTextShadowNode.LJIL);
                }
            } else if (shadowNodeLJIIIZ instanceof AbsInlineImageShadowNode) {
                spannableStringBuilder.append("I");
                AbsInlineImageShadowNode absInlineImageShadowNode = (AbsInlineImageShadowNode) shadowNodeLJIIIZ;
                int length2 = spannableStringBuilder.length() - 1;
                int length3 = spannableStringBuilder.length();
                AbstractC1315450kKt abstractC1315450kKtLJJIL = absInlineImageShadowNode.LJJIL();
                absInlineImageShadowNode.LJJJIL(abstractC1315450kKtLJJIL);
                C1313270kHN c1313270kHN = absInlineImageShadowNode.LJJJI;
                if (c1313270kHN != null && (t = c1313270kHN.LIZIZ) != 0) {
                    LayoutNode layoutNode = absInlineImageShadowNode.LJII.LIZ;
                    int iCeil = (int) Math.ceil(layoutNode.LIZ.LIZLLL(layoutNode.LIZIZ));
                    LayoutNode layoutNode2 = absInlineImageShadowNode.LJII.LIZ;
                    t.setBounds(0, 0, iCeil, (int) Math.ceil((int) layoutNode2.LIZ.LIZIZ(layoutNode2.LIZIZ)));
                    absInlineImageShadowNode.LJJJI.LJIILIIL(absInlineImageShadowNode.LJJJ);
                    abstractC1315450kKtLJJIL.LLJILLL = absInlineImageShadowNode.LJJJI;
                } else {
                    abstractC1315450kKtLJJIL.LLJILJIL = absInlineImageShadowNode.LJJJ;
                }
                abstractC1315450kKtLJJIL.LLJILJILJ = absInlineImageShadowNode.LJIJJLI.LJIILL;
                ArrayList arrayList = (ArrayList) list;
                arrayList.add(new C1316900kNE(length2, length3, abstractC1315450kKtLJJIL));
                if (absInlineImageShadowNode.LJIIZILJ()) {
                    arrayList.add(new C1316900kNE(length2, length3, absInlineImageShadowNode.LJJIFFI()));
                }
                this.LJIJJLI.LJIILLIIL = true;
            } else if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                spannableStringBuilder.append("B");
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) shadowNodeLJIIIZ;
                int length4 = spannableStringBuilder.length() - 1;
                int length5 = spannableStringBuilder.length();
                nativeLayoutNodeRef.LJJ = length4;
                nativeLayoutNodeRef.LJIJJLI = length4;
                nativeLayoutNodeRef.LJJI = length5;
                nativeLayoutNodeRef.LJIL = length5;
                C1316760kN0 c1316760kN0 = new C1316760kN0();
                C1311920kFC c1311920kFC = nativeLayoutNodeRef.LJIILIIL;
                if (c1311920kFC != null) {
                    int i2 = c1311920kFC.LIZ;
                    float f = c1311920kFC.LIZIZ;
                    c1316760kN0.LL = i2;
                    c1316760kN0.LLILLJJLI = f;
                }
                C1316900kNE c1316900kNE = new C1316900kNE(length4, length5, c1316760kN0);
                ArrayList arrayList2 = (ArrayList) list;
                arrayList2.add(c1316900kNE);
                arrayList2.add(new C1316900kNE(length4, length5, nativeLayoutNodeRef.LJJIFFI()));
                this.LJIJJLI.LJIIZILJ = true;
            } else if (shadowNodeLJIIIZ instanceof BaseTextShadowNode) {
                if (!(shadowNodeLJIIIZ instanceof InlineTruncationShadowNode)) {
                    BaseTextShadowNode baseTextShadowNode = (BaseTextShadowNode) shadowNodeLJIIIZ;
                    C1316720kMw c1316720kMw2 = baseTextShadowNode.LJIJJLI;
                    if (c1316720kMw2.LIZJ == null && c1316720kMw2.LJJIZ > 0.0f) {
                        Integer num = this.LJIJJLI.LIZJ;
                        if (num != null) {
                            c1316720kMw2.LIZJ = Integer.valueOf(num.intValue());
                        } else {
                            c1316720kMw2.LIZJ = -16777216;
                        }
                    }
                    baseTextShadowNode.LJJIIZ(spannableStringBuilder, list);
                    C1316720kMw c1316720kMw3 = this.LJIJJLI;
                    boolean z = c1316720kMw3.LJIILLIIL;
                    C1316720kMw c1316720kMw4 = baseTextShadowNode.LJIJJLI;
                    c1316720kMw3.LJIILLIIL = z | c1316720kMw4.LJIILLIIL;
                    c1316720kMw3.LJIIZILJ |= c1316720kMw4.LJIIZILJ;
                    this.LJJIJ = baseTextShadowNode.LJJIJ | this.LJJIJ;
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unexpected view type nested under text node: ");
                sbLIZ.append(shadowNodeLJIIIZ.getClass());
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        int length6 = spannableStringBuilder.length();
        if (length6 > length) {
            LJJIIJZLJL(length, length6, list);
        }
    }

    public final CharSequence LJJIIZI(String str, boolean z) {
        if (this.LJJIJIIJI && LJJIJLIJ) {
            try {
                return (CharSequence) C2204961BRm.a0(LJJIJIL, LJJIJL, new Object[]{LJJIJ(str, z)}, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezc0E+0nJQUZXSfo2OS2MCqPJbz2iasgt1OZh1t88E=", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("process emoji: ");
                sbLIZ.append(e);
                LynxLog.w("lynx_BaseTextShadowNode", C2188811AlT.LIZIZ(sbLIZ));
                return LJJIJ(str, z);
            }
        }
        return LJJIJ(str, z);
    }

    public final CharSequence LJJIJ(String str, boolean z) {
        int i;
        int i2 = 2;
        int length = 0;
        if (z) {
            int i3 = this.LJJIIJZLJL;
            if (i3 != 1) {
                if (i3 != 2) {
                    i2 = 0;
                }
            } else {
                i2 = 1;
            }
            C1317670kOT c1317670kOT = null;
            if (str == null) {
                return null;
            }
            if (i2 == 0 && str.indexOf(92) < 0) {
                return str;
            }
            int length2 = str.length();
            StringBuilder sb = new StringBuilder(length2);
            if (i2 != 0) {
                c1317670kOT = new C1317670kOT();
            }
            while (length < length2) {
                if (str.charAt(length) == '\\' && (i = length + 1) < length2) {
                    StringBuilder sb2 = new StringBuilder();
                    for (i = length + 1; i < length2 && i < length + 5; i++) {
                        char cCharAt = str.charAt(i);
                        if ((cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                            sb2.append(cCharAt);
                        }
                    }
                    try {
                        sb.append((char) CastIntegerProtector.parseInt(sb2.toString(), 16));
                        length += sb2.length();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        sb.append(str.charAt(length));
                    }
                } else {
                    sb.append(str.charAt(length));
                }
                if (i2 != 0) {
                    c1317670kOT.LIZ(sb, i2);
                }
                length++;
            }
            return sb.toString();
        }
        int i4 = this.LJJIIJZLJL;
        if (i4 != 1) {
            if (i4 == 2) {
            }
            return C1317660kOS.LIZ(length, str);
        }
        i2 = 1;
        length = i2;
        return C1317660kOS.LIZ(length, str);
    }

    public final void LJJIII(Layout layout, SpannableStringBuilder spannableStringBuilder, PointF pointF) {
        C1316760kN0 c1316760kN0;
        int i;
        for (int i2 = 0; i2 < LJIIJ(); i2++) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(i2);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) shadowNodeLJIIIZ;
                C1312260kFk c1312260kFk = new C1312260kFk();
                if (nativeLayoutNodeRef.LJIJJLI >= layout.getText().length()) {
                    nativeLayoutNodeRef.LJJIII(c1312260kFk);
                } else {
                    C1316760kN0[] c1316760kN0Arr = (C1316760kN0[]) spannableStringBuilder.getSpans(nativeLayoutNodeRef.LJIJJLI, nativeLayoutNodeRef.LJIL, C1316760kN0.class);
                    if (c1316760kN0Arr.length == 1) {
                        c1316760kN0 = c1316760kN0Arr[0];
                    } else {
                        c1316760kN0 = null;
                    }
                    int lineForOffset = layout.getLineForOffset(nativeLayoutNodeRef.LJIJJLI);
                    float primaryHorizontal = layout.getPrimaryHorizontal(nativeLayoutNodeRef.LJIJJLI) + pointF.x;
                    if (layout.isRtlCharAt(nativeLayoutNodeRef.LJIJJLI)) {
                        if (c1316760kN0 == null) {
                            i = 0;
                        } else {
                            i = c1316760kN0.LLIZ;
                        }
                        primaryHorizontal -= i;
                    }
                    c1312260kFk.LIZ = primaryHorizontal;
                    if (c1316760kN0 != null) {
                        c1312260kFk.LIZIZ = c1316760kN0.LIZIZ(layout.getLineTop(lineForOffset), layout.getLineBottom(lineForOffset), layout.getLineAscent(lineForOffset), layout.getLineDescent(lineForOffset)) + pointF.y;
                    }
                    nativeLayoutNodeRef.LJJIII(c1312260kFk);
                }
            } else if ((shadowNodeLJIIIZ instanceof InlineTextShadowNode) || (shadowNodeLJIIIZ instanceof InlineTruncationShadowNode)) {
                ((BaseTextShadowNode) shadowNodeLJIIIZ).LJJIII(layout, spannableStringBuilder, pointF);
            }
        }
    }

    public void LJJIIJ(SpannableStringBuilder spannableStringBuilder, String str, boolean z) {
        spannableStringBuilder.append(LJJIIZI(str, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJIIJZLJL(int r12, int r13, java.util.List<X.C1316900kNE> r14) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.LJJIIJZLJL(int, int, java.util.List):void");
    }

    public final void LJJIJIIJI(CharSequence charSequence, Set set, int i) {
        int i2;
        for (int i3 = 0; i3 < LJIIJ(); i3++) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(i3);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) shadowNodeLJIIIZ;
                if (nativeLayoutNodeRef.LJIJJLI >= charSequence.length() || (i2 = nativeLayoutNodeRef.LJIJJLI) >= i || charSequence.charAt(i2) != "B".charAt(0)) {
                    ((HashSet) set).add(Integer.valueOf(nativeLayoutNodeRef.LIZIZ));
                }
            } else if ((shadowNodeLJIIIZ instanceof BaseTextShadowNode) && !(shadowNodeLJIIIZ instanceof InlineTruncationShadowNode)) {
                ((BaseTextShadowNode) shadowNodeLJIIIZ).LJJIJIIJI(charSequence, set, i);
            }
        }
    }

    public final void LJJIJIL(SpannableStringBuilder spannableStringBuilder, C1312230kFh c1312230kFh, C1312280kFm c1312280kFm) {
        for (int i = 0; i < LJIIJ(); i++) {
            ShadowNode shadowNodeLJIIIZ = LJIIIZ(i);
            if (shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) {
                NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) shadowNodeLJIIIZ;
                C1312250kFj c1312250kFjLJJIIJ = nativeLayoutNodeRef.LJJIIJ(c1312280kFm, c1312230kFh);
                for (C1316760kN0 c1316760kN0 : (C1316760kN0[]) spannableStringBuilder.getSpans(nativeLayoutNodeRef.LJIJJLI, nativeLayoutNodeRef.LJIL, C1316760kN0.class)) {
                    int iFloor = (int) Math.floor(c1312250kFjLJJIIJ.LIZ[0]);
                    int iCeil = (int) Math.ceil(c1312250kFjLJJIIJ.LIZ[1]);
                    int iCeil2 = (int) Math.ceil(c1312250kFjLJJIIJ.LIZ[2]);
                    c1316760kN0.LLIZ = iFloor;
                    c1316760kN0.LLILZLL = iCeil;
                    c1316760kN0.LLIZLLLIL = iCeil2;
                }
            } else if ((shadowNodeLJIIIZ instanceof BaseTextShadowNode) && !(shadowNodeLJIIIZ instanceof InlineTruncationShadowNode)) {
                ((BaseTextShadowNode) shadowNodeLJIIIZ).LJJIJIL(spannableStringBuilder, c1312230kFh, c1312280kFm);
            }
        }
    }
}
