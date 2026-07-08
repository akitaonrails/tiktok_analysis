package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C11NJ;
import X.C1813850xIl;
import X.C1814980xKa;
import X.C1816860xNc;
import X.C1816870xNd;
import X.C1816880xNe;
import X.C1818740xQe;
import X.C1836370xt5;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C452501pT;
import X.C488301vF;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes28.dex */
public final class RichTextPreviewView extends ConstraintLayout {
    public final C1818740xQe LL;
    public final View LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public final C11NJ LLIZ;
    public C1814980xKa LLIZLLLIL;

    private final C1836370xt5 getDescriptionBoardPreview() {
        return (C1836370xt5) this.LLILZIL.getValue();
    }

    private final CardView getDescriptionPreviewsContainer() {
        return (CardView) this.LLILZ.getValue();
    }

    public final ConstraintLayout getDslPreviewsContainer() {
        return (ConstraintLayout) this.LLILLL.getValue();
    }

    private final float getItemScale() {
        float width = getWidth();
        float f = C488301vF.LJ;
        return width / C488301vF.LJ;
    }

    private final float getItemScaleToScreenH() {
        return getHeight() / C497740JfY.LJIILLIIL();
    }

    public final ViewGroup getDslBoardContainer() {
        return getDslPreviewsContainer();
    }

    public final float getItemScaleToScreen() {
        return getWidth() / C497740JfY.LJIIZILJ();
    }

    public RichTextPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new C1818740xQe();
        this.LLILLJJLI = ViewGroup.inflate(context, R.layout.g0s, this);
        this.LLILLL = C452501pT.LIZIZ(new C1816870xNd(this));
        this.LLILZ = C452501pT.LIZIZ(new C1816860xNc(this));
        this.LLILZIL = C452501pT.LIZIZ(new C1816880xNe(this));
        this.LLIZ = new C11NJ();
    }

    public static void e0(View view, float f) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        C786410Ut5.Ob(view, f);
        C786410Ut5.pc(view, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> j0(com.bytedance.android.livesdk.model.BoardItem r14, android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView.j0(com.bytedance.android.livesdk.model.BoardItem, android.view.View):kotlin.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0040, code lost:
    
        r11 = getDescriptionPreviewsContainer();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e9  */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.view.ViewGroup, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r11v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.cardview.widget.CardView] */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.cardview.widget.CardView] */
    /* JADX WARN: Type inference failed for: r15v2, types: [android.view.View] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:12:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006f -> B:12:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d2 -> B:12:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d4 -> B:12:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0147 -> B:11:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x017a -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(com.bytedance.android.livesdk.model.Board r25, int r26, long r27, X.InterfaceC1364105Vn r29) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView.i0(com.bytedance.android.livesdk.model.Board, int, long, X.05Vn):java.lang.Object");
    }

    public final void h0(Board board, InterfaceC497601wk interfaceC497601wk, int i, long j, String str) {
        String string;
        String string2;
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZ.LJ();
        long j2 = board.id;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        RecommendBoardInfo recommendBoardInfo = board.recommendBoardInfo;
        if (recommendBoardInfo == null || (string = Integer.valueOf(recommendBoardInfo.boardSource).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        RecommendBoardInfo recommendBoardInfo2 = board.recommendBoardInfo;
        if (recommendBoardInfo2 == null || (string2 = Long.valueOf(recommendBoardInfo2.recommendBoardId).toString()) == null) {
            string2 = "";
        }
        this.LLIZLLLIL = new C1814980xKa(j2, 0L, strValueOf, (String) null, "rich_text_decoration", string, recommendBoardInfo2, string2, str, 138);
        C500260Jjc.LJIILLIIL(getDescriptionPreviewsContainer());
        ConstraintLayout dslPreviewsContainer = getDslPreviewsContainer();
        if (dslPreviewsContainer != null) {
            C786410Ut5.LJJJJL(dslPreviewsContainer);
        }
        ConstraintLayout dslPreviewsContainer2 = getDslPreviewsContainer();
        if (dslPreviewsContainer2 != null) {
            C500260Jjc.LJLJLLL(C497740JfY.LJIIZILJ(), dslPreviewsContainer2);
        }
        ((ArrayList) this.LL.LIZJ).clear();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZLL = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1813850xIl(this, board, i, j, null), 2);
    }
}
