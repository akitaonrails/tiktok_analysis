package com.bytedance.xelement.markdown;

import X.C1285920jZG;
import X.C1289620jfE;
import X.C1299120juY;
import X.C1312230kFh;
import X.C1312280kFm;
import X.C1315200kKU;
import X.C1315260kKa;
import X.C1315280kKc;
import X.C1315300kKe;
import X.C1315330kKh;
import X.C1315840kLW;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1298880juA;
import X.InterfaceC1312240kFi;
import X.InterfaceC1312540kGC;
import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.service.ILynxTrailService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class MarkdownShadowNode extends ShadowNode implements InterfaceC1312240kFi, InterfaceC1298880juA {
    public static final float[] LJJZZIII = {0.0f, 0.0f};
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public boolean LJJIFFI;
    public ReadableMap LJJII;
    public C1315260kKa LJJIII;
    public MarkdownDocument LJJIIJ;
    public C1315280kKc LJJIIJZLJL;
    public HashMap<String, C1315330kKh> LJJIIZ;
    public HashSet<String> LJJIIZI;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public float LJJIJLIJ;
    public boolean LJJIZ;
    public int LJJJ;
    public int LJJJI;
    public int LJJJIL;
    public boolean LJJJJ;
    public int LJJJJI;
    public C1312230kFh LJJJJJ;
    public C1312280kFm LJJJJJL;
    public float LJJJJL;
    public float LJJJJLI;
    public float LJJJJLL;
    public float LJJJJZ;
    public float LJJJJZI;
    public int LJJJLL;
    public boolean LJJJZ;
    public boolean LJJL;
    public boolean LJJLI;
    public final Looper LJJLIIIIJ;
    public final BPEAHandler LJJLIIIJ;
    public float LJJLIIIJILLIZJL;
    public C1315200kKU LJJLIIIJJI;
    public boolean LJJLIIIJJIZ;
    public final boolean LJJLIIIJL;
    public boolean LJJLIIIJLJLI;
    public boolean LJJLIIIJLLLLLLLZ;
    public long LJJLIIJ;
    public int LJJLIL;
    public float[] LJJLJ;
    public boolean LJJI = true;
    public float LJJIJ = 1.0f;
    public float LJJIJL = 15.0f;
    public boolean LJJIL = true;
    public int LJJJJIZL = -1;
    public float LJJJLIIL = Float.MAX_VALUE;
    public int LJJJLZIJ = Integer.MAX_VALUE;
    public final C1315300kKe LJJLJLI = new C1315300kKe();
    public boolean LJJLL = true;
    public boolean LJJZ = false;
    public final Map<String, C1315840kLW> LJJZZI = new HashMap();

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void LJFF() {
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIILLIIL() {
        if (this.LJIILJJIL) {
            return;
        }
        super.LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void LJIJI() {
        LJJIJIIJI(new ARunnableS120S0100000_20(this, 163));
    }

    public final void LJJIIJ() {
        float[] fArrFindCursorPosition;
        float[] fArrFindCursorPosition2 = this.LJJIIJ.findCursorPosition(this.LJJIJIL, !this.LJJI);
        this.LJJLJ = fArrFindCursorPosition2;
        if (!this.LJJIFFI) {
            this.LJJJJZI = this.LJJJJZ;
            return;
        }
        float f = this.LJJIJLIJ;
        if (f <= 0.0f) {
            this.LJJJJZI = fArrFindCursorPosition2[3];
            return;
        }
        if (!this.LJJIL) {
            this.LJJJJZI = fArrFindCursorPosition2[3];
            return;
        }
        if (this.LJJIJIIJIL == 2) {
            int i = ((int) (f * this.LJJIJ)) + 1;
            int iLJJIIZ = this.LJJJIL;
            if (iLJJIIZ <= 0) {
                iLJJIIZ = LJJIIZ(this.LJJIJIL);
            }
            fArrFindCursorPosition = this.LJJIIJ.findCursorPosition(LJJIIZI(Math.min(iLJJIIZ + i, this.LJJJI)), !this.LJJI);
        } else {
            fArrFindCursorPosition = this.LJJIIJ.findCursorPosition(this.LJJIJIL + ((int) (f * this.LJJIJ)) + 1, !this.LJJI);
        }
        this.LJJJJZI = fArrFindCursorPosition[3];
    }

    public MarkdownShadowNode() {
        this.LJJLIIIJL = true;
        LJI(this);
        Looper looperMyLooper = Looper.myLooper();
        this.LJJLIIIIJ = looperMyLooper;
        if (looperMyLooper != null) {
            this.LJJLIIIJ = new BPEAHandler(looperMyLooper);
        }
        ILynxTrailService iLynxTrailService = (ILynxTrailService) C1285920jZG.LIZJ().LIZ(ILynxTrailService.class);
        if (iLynxTrailService != null) {
            String strStringValueForTrailKey = iLynxTrailService.stringValueForTrailKey("enable_markdown_density_update");
            if ("true".equals(strStringValueForTrailKey)) {
                this.LJJLIIIJL = true;
            } else if ("false".equals(strStringValueForTrailKey)) {
                this.LJJLIIIJL = false;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final Object LJIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getExtraBundle: hasBundle=");
        sbLIZ.append(this.LJJIII != null);
        sbLIZ.append(", contentUpdated=");
        C1315260kKa c1315260kKa = this.LJJIII;
        sbLIZ.append(c1315260kKa != null && c1315260kKa.LJIIJ);
        LynxLog.d("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ));
        C1315260kKa c1315260kKa2 = this.LJJIII;
        if (c1315260kKa2 == null) {
            return null;
        }
        C1315260kKa c1315260kKa3 = new C1315260kKa(c1315260kKa2);
        c1315260kKa2.LJIIJ = false;
        return c1315260kKa3;
    }

    public final String LJJIII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type=");
        sbLIZ.append(this.LJJIJIIJIL);
        sbLIZ.append(", step=");
        sbLIZ.append(this.LJJIJIL);
        sbLIZ.append("/");
        sbLIZ.append(this.LJJJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJJIJ() {
        C1315200kKU c1315200kKU;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetAnimationState: initialStep=");
        sbLIZ.append(this.LJJIJIIJI);
        sbLIZ.append(", ");
        sbLIZ.append(LJJIII());
        LynxLog.i("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJLIIIJJIZ && (c1315200kKU = this.LJJLIIIJJI) != null) {
            c1315200kKU.LJI(this.LJJIJIIJI);
        }
        LJJIJIIJI(new ARunnableS120S0100000_20(this, 165));
    }

    public final boolean LJJIIJZLJL(String str) {
        Map<String, C1299120juY> map = this.LJIILL;
        if (map != null && map.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final int LJJIIZ(int i) {
        int iMax;
        int i2 = 0;
        if (this.LJJIIJ == null || i <= 0 || (iMax = Math.max(0, this.LJJJI)) == 0) {
            return 0;
        }
        int lineIndexByCharIndex = this.LJJIIJ.getLineIndexByCharIndex(i) + 1;
        if (lineIndexByCharIndex >= 0) {
            i2 = lineIndexByCharIndex;
        }
        return Math.min(i2, iMax);
    }

    public final int LJJIIZI(int i) {
        int iMax;
        int i2 = 0;
        if (this.LJJIIJ == null || i <= 0 || (iMax = Math.max(0, this.LJJJI)) == 0) {
            return 0;
        }
        int charIndexByLineIndex = this.LJJIIJ.getCharIndexByLineIndex(Math.min(i - 1, iMax - 1));
        if (charIndexByLineIndex >= 0) {
            i2 = charIndexByLineIndex;
        }
        return Math.min(i2, this.LJJJ);
    }

    public final void LJJIJIIJI(Runnable runnable) {
        if (this.LJJLIIIIJ != null) {
            C786410Ut5.LJJZZIII(this.LJJLIIIJ, runnable);
        } else {
            C1289620jfE.LIZJ(runnable);
        }
    }

    @InterfaceC1312540kGC(name = "allow-break-around-punctuation")
    public void setAllowBreakAroundPunctuation(boolean z) {
        this.LJJJZ = z;
    }

    @InterfaceC1312540kGC(name = "animation-frame-rate")
    public void setAnimationFrameRate(float f) {
        this.LJJIJL = f;
    }

    @InterfaceC1312540kGC(name = "animation-type")
    public void setAnimationType(String str) {
        int i = this.LJJIJIIJIL;
        if (str.equals("typewriter")) {
            this.LJJIJIIJIL = 1;
        } else if (str.equals("line-expand")) {
            this.LJJIJIIJIL = 2;
        } else {
            this.LJJIJIIJIL = 0;
        }
        int i2 = this.LJJIJIIJIL;
        if (i != i2 && i2 == 2) {
            this.LJJJJ = true;
        }
        this.LJJLL = true;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "animation-velocity")
    public void setAnimationVelocity(float f) {
        if (f < 0.0f) {
            f = 1.0f;
        }
        this.LJJIJ = f;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "content")
    public void setContent(String str) {
        this.LJIJJLI = str;
        this.LJJZ = true;
        this.LJJLL = true;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "content-complete")
    public void setContentComplete(boolean z) {
        this.LJJI = z;
        this.LJJLL = true;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "content-id")
    public void setContentID(String str) {
        this.LJIL = str;
    }

    @InterfaceC1312540kGC(name = "exposure-tags")
    public void setExposureTags(ReadableArray readableArray) {
        this.LJJIIZI = new HashSet<>();
        for (int i = 0; i < readableArray.size(); i++) {
            this.LJJIIZI.add(readableArray.getString(i));
        }
    }

    @InterfaceC1312540kGC(name = "image-downsampling")
    public void setImageDownSampling(boolean z) {
        this.LJJL = z;
    }

    @InterfaceC1312540kGC(name = "image-sync-load")
    public void setImageSyncLoad(boolean z) {
        this.LJJLI = z;
    }

    @InterfaceC1312540kGC(name = "initial-animation-step")
    public void setInitialAnimationStep(int i) {
        this.LJJIJIIJI = i;
        this.LJJIJIL = i;
        if (this.LJJIJIIJIL == 2) {
            this.LJJJJ = true;
        }
        this.LJJLL = true;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "content-range")
    public void setMarkdownContentRange(ReadableArray readableArray) {
        if (readableArray.size() > 0) {
            this.LJJJLL = readableArray.getInt(0);
        }
        if (readableArray.size() > 1) {
            this.LJJJLZIJ = readableArray.getInt(1);
        }
    }

    @InterfaceC1312540kGC(name = "markdown-max-height")
    public void setMarkdownMaxHeight(float f) {
        this.LJJJLIIL = f * LJIIJJI().LLJJJ.density;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "markdown-style")
    public void setStyleSheet(ReadableMap readableMap) {
        this.LJJII = readableMap;
        this.LJJLL = true;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "text-maxline")
    public void setTextMaxLine(int i) {
        this.LJJJJIZL = i;
        this.LJJLL = true;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "typewriter-dynamic-height")
    public void setTypewriterAutoHeight(boolean z) {
        this.LJJIFFI = z;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "typewriter-height-transition-duration")
    public void setTypewriterHeightTransitionDuration(float f) {
        this.LJJIJLIJ = f;
    }

    @InterfaceC1312540kGC(name = "typewriter-height-transition-prefetch")
    public void setTypewriterHeightTransitionPrefetch(boolean z) {
        this.LJJIL = z;
        LJIILLIIL();
    }

    @InterfaceC1312540kGC(name = "enable-region-view")
    public void setVSyncAnimation(boolean z) {
        this.LJJLIIIJJIZ = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    @Override // X.InterfaceC1312240kFi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1312250kFj LIZ(X.C1312280kFm r18, X.C1312230kFh r19) {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.xelement.markdown.MarkdownShadowNode.LIZ(X.0kFm, X.0kFh):X.0kFj");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    @Override // X.InterfaceC1312240kFi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C1312290kFn r7, X.C1312260kFk r8) {
        /*
            r6 = this;
            r5 = 0
            r4 = 0
        L2:
            int r0 = r6.LJIIJ()
            if (r4 >= r0) goto L4d
            com.lynx.tasm.behavior.shadow.ShadowNode r3 = r6.LJIIIZ(r4)
            boolean r0 = r3 instanceof com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef
            if (r0 == 0) goto L43
            com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef r3 = (com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef) r3
            java.lang.String r1 = r3.LJJIFFI
            if (r1 == 0) goto L30
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L30
            com.bytedance.xelement.markdown.MarkdownDocument r0 = r6.LJJIIJ
            if (r0 == 0) goto L30
            java.lang.String r0 = r6.LJJ
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L46
            float[] r2 = r6.LJJLJ
        L2a:
            if (r2 == 0) goto L30
            int r1 = r2.length
            r0 = 2
            if (r1 >= r0) goto L32
        L30:
            float[] r2 = com.bytedance.xelement.markdown.MarkdownShadowNode.LJJZZIII
        L32:
            X.0kFk r1 = new X.0kFk
            r1.<init>()
            r0 = r2[r5]
            r1.LIZ = r0
            r0 = 1
            r0 = r2[r0]
            r1.LIZIZ = r0
            r3.LJJIII(r1)
        L43:
            int r4 = r4 + 1
            goto L2
        L46:
            com.bytedance.xelement.markdown.MarkdownDocument r0 = r6.LJJIIJ
            float[] r2 = r0.getInlineViewOrigin(r1)
            goto L2a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.xelement.markdown.MarkdownShadowNode.LIZJ(X.0kFn, X.0kFk):void");
    }

    public final void LJJIJIIJIL(long j, boolean z) {
        if (this.LJJIJLIJ > 0.0f) {
            if (this.LJJLJLI.LIZ()) {
                this.LJJLJLI.LJFF = j;
            }
            if (Float.compare(this.LJJJJZI, this.LJJLJLI.LIZIZ) != 0) {
                if (z) {
                    C1315300kKe c1315300kKe = this.LJJLJLI;
                    float f = this.LJJJJZI;
                    c1315300kKe.LIZ = c1315300kKe.LJ;
                    c1315300kKe.LIZIZ = f;
                    c1315300kKe.LIZJ = 0L;
                    c1315300kKe.LIZLLL = c1315300kKe.LJFF;
                    c1315300kKe.LJ = f;
                } else {
                    C1315300kKe c1315300kKe2 = this.LJJLJLI;
                    float f2 = this.LJJJJZI;
                    long j2 = (long) (this.LJJIJLIJ * 1000.0f);
                    c1315300kKe2.LIZ = c1315300kKe2.LJ;
                    c1315300kKe2.LIZIZ = f2;
                    c1315300kKe2.LIZJ = j2;
                    c1315300kKe2.LIZLLL = c1315300kKe2.LJFF;
                }
            }
            this.LJJLJLI.LIZIZ(j);
            this.LJJJJZI = this.LJJLJLI.LJ;
        }
    }
}
