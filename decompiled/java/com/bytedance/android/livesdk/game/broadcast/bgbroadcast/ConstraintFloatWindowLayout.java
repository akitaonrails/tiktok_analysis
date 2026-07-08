package com.bytedance.android.livesdk.game.broadcast.bgbroadcast;

import X.AbstractC780060Uiq;
import X.C19O2;
import X.C19O6;
import X.C19O9;
import X.C19OA;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.util.SparseArray;
import android.view.WindowManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
public final class ConstraintFloatWindowLayout {
    public static final /* synthetic */ int LJIIL = 0;
    public final C19O9 LIZ;
    public final C19O2 LIZIZ;
    public int LIZJ;
    public final ArrayList<AbstractC780060Uiq> LIZLLL;
    public final SparseArray<C19OA> LJ;
    public final SparseArray<C19OA> LJFF;
    public final int LJI;
    public final int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final WindowManager LJIIJ;
    public boolean LJIIJJI;

    public ConstraintFloatWindowLayout() {
        Context contextLJII = C497740JfY.LJII();
        C19O9 c19o9 = new C19O9();
        this.LIZ = c19o9;
        C19O2 c19o2 = new C19O2(this, this);
        this.LIZIZ = c19o2;
        this.LIZLLL = new ArrayList<>(4);
        this.LJ = new SparseArray<>();
        this.LJFF = new SparseArray<>();
        this.LJI = Integer.MAX_VALUE;
        this.LJII = Integer.MAX_VALUE;
        c19o9.mCompanionWidget = this;
        c19o9.LIZLLL = c19o2;
        c19o9.LIZJ.LJFF = c19o2;
        Object objH2 = C786410Ut5.H2(contextLJII, "window");
        this.LJIIJ = objH2 instanceof WindowManager ? (WindowManager) objH2 : null;
    }

    public static final class LayoutParams extends WindowManager.LayoutParams {
        public int baselineToBaseline;
        public int bottomMargin;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String constraintTag;
        public String dimensionRatio;
        public int dimensionRatioSide;
        public float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public float horizontalBias;
        public int horizontalChainStyle;
        public boolean horizontalDimensionFixed;
        public float horizontalWeight;
        public boolean isGuideline;
        public boolean isHelper;
        public boolean isInPlaceholder;
        public boolean isMainWidget;
        public boolean isVirtualGroup;
        public int leftMargin;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        public boolean needsBaseline;
        public int orientation;
        public final WindowManager.LayoutParams params;
        public int resolveGoneLeftMargin;
        public int resolveGoneRightMargin;
        public int resolvedGuideBegin;
        public int resolvedGuideEnd;
        public float resolvedGuidePercent;
        public float resolvedHorizontalBias;
        public int resolvedLeftToLeft;
        public int resolvedLeftToRight;
        public int resolvedRightToLeft;
        public int resolvedRightToRight;
        public int rightMargin;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topMargin;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public boolean verticalDimensionFixed;
        public float verticalWeight;
        public C19OA widget;
        public static final C19O6 Companion = new Object() { // from class: X.19O6
        };
        public static final int $stable = 8;

        public LayoutParams() {
            this(null);
        }

        public LayoutParams(WindowManager.LayoutParams layoutParams) {
            this.params = layoutParams;
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new C19OA();
            if (layoutParams != null) {
                ((WindowManager.LayoutParams) this).width = layoutParams.width;
                ((WindowManager.LayoutParams) this).height = layoutParams.height;
                copyFrom(layoutParams);
            }
        }
    }

    public final void LIZ(AbstractC780060Uiq abstractC780060Uiq) {
        abstractC780060Uiq.LJI();
        new LayoutParams(null).isHelper = true;
        if (!this.LIZLLL.contains(abstractC780060Uiq)) {
            this.LIZLLL.add(abstractC780060Uiq);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x051d, code lost:
    
        if (r2.isGuideline != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0521, code lost:
    
        if (r2.isHelper != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0525, code lost:
    
        if (r2.isVirtualGroup != false) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04a7 A[PHI: r6
      0x04a7: PHI (r6v7 X.19O3) = (r6v6 X.19O3), (r6v3 X.19O3) binds: [B:209:0x049e, B:192:0x03fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.view.View r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 1533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout.LIZIZ(android.view.View, boolean):void");
    }
}
