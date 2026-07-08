package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed;

import X.C1183170gtX;
import X.C21373318kd;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C734160Sr0;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.text.a0;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailVideoCell extends PowerCell<C1183170gtX> {
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * 3;
    public SmartImageView LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public C427660Gpo LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public LinearLayout LLIZ;
    public C21373318kd LLIZLLLIL;
    public TuxTextView LLJ;
    public C734160Sr0 LLJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02da A[PHI: r25 r26 r27 r28 r29 r30 r32
      0x02da: PHI (r25v3 java.lang.String) = (r25v5 java.lang.String), (r25v6 java.lang.String) binds: [B:117:0x01de, B:115:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x02da: PHI (r26v1 java.lang.String) = (r26v3 java.lang.String), (r26v4 java.lang.String) binds: [B:117:0x01de, B:115:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x02da: PHI (r27v1 java.lang.String) = (r27v3 java.lang.String), (r27v4 java.lang.String) binds: [B:117:0x01de, B:115:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x02da: PHI (r28v1 java.lang.String) = (r28v3 java.lang.String), (r28v4 java.lang.String) binds: [B:117:0x01de, B:115:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x02da: PHI (r29v1 java.lang.String) = (r29v3 java.lang.String), (r29v4 java.lang.String) binds: [B:117:0x01de, B:115:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x02da: PHI (r30v1 java.lang.String) = (r30v3 java.lang.String), (r30v4 java.lang.String) binds: [B:117:0x01de, B:115:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x02da: PHI (r32v0 java.lang.String) = (r32v2 java.lang.String), (r32v3 java.lang.String) binds: [B:117:0x01de, B:115:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5() {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailVideoCell.I5():void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.r_n);
        this.LLILLJJLI = (TuxIconView) this.itemView.findViewById(R.id.r_t);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.r_o);
        this.LLILZ = (C427660Gpo) this.itemView.findViewById(R.id.r_v);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.r_w);
        this.LLILZLL = (TuxIconView) this.itemView.findViewById(R.id.r_m);
        this.LLIZ = (LinearLayout) this.itemView.findViewById(R.id.r_p);
        this.LLIZLLLIL = (C21373318kd) this.itemView.findViewById(R.id.r_r);
        this.LLJ = (TuxTextView) this.itemView.findViewById(R.id.r_s);
        this.LLJI = new C734160Sr0(this.itemView.getContext(), null, null, new AwS667S0100000_18(this, 19));
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 28, 42), linearLayout);
        }
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 440));
    }

    public static UrlModel L5(UrlModel urlModel) {
        String uri;
        if (urlModel == null) {
            return null;
        }
        List<String> urlList = urlModel.getUrlList();
        if (urlList != null && !urlList.isEmpty()) {
            for (String str : urlList) {
                if (str != null && !a0.LJJJIL(str)) {
                    break;
                }
            }
            uri = urlModel.getUri();
            if (uri != null) {
            }
            return null;
        }
        uri = urlModel.getUri();
        if (uri != null || a0.LJJJIL(uri)) {
            return null;
        }
        return urlModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0223 A[PHI: r5
      0x0223: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v6 java.lang.String) binds: [B:108:0x021f, B:67:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r24) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailVideoCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e6v, viewGroup, false);
    }
}
