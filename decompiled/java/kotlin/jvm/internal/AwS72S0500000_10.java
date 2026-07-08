package kotlin.jvm.internal;

import X.C09AY;
import X.C09UZ;
import X.C0QNF;
import X.C21415018rM;
import X.C444830HcP;
import X.C669090QMh;
import X.C671660QWe;
import X.InterfaceC497601wk;
import Y.ARunnableS3S0600000_10;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config.SearchMarkdownContentCacheVM;
import com.ss.android.ugc.aweme.search.df.api.top1.ISearchMarkdownNimblePreloadPlugin;
import com.ss.android.ugc.aweme.search.model.EComWordRichExpression;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS72S0500000_10 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS72S0500000_10 awS72S0500000_10) {
        boolean z;
        boolean z2;
        EComWordRichExpression eComWordRichExpression;
        EComWordRichExpression eComWordRichExpression2;
        CharSequence charSequenceLIZIZ = C0QNF.LIZIZ((SearchSugEntity) awS72S0500000_10.l0, ((C21415018rM) awS72S0500000_10.l1).getContext());
        CharSequence charSequenceLIZ = C0QNF.LIZ((SearchSugEntity) awS72S0500000_10.l0, ((C21415018rM) awS72S0500000_10.l1).getContext());
        if (((SpannableStringBuilder) charSequenceLIZIZ).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        Layout layoutLJ = null;
        if (z) {
            C444830HcP c444830HcP = new C444830HcP();
            c444830HcP.LJIILIIL(charSequenceLIZIZ);
            c444830HcP.LIZLLL = false;
            Layout layoutLIZIZ = c444830HcP.LIZIZ();
            C669090QMh c669090QMh = C669090QMh.LIZ;
            SearchSugEntity searchSugEntity = (SearchSugEntity) awS72S0500000_10.l0;
            Context context = ((C21415018rM) awS72S0500000_10.l1).getContext();
            c669090QMh.getClass();
            int iLJFF = C669090QMh.LJFF(searchSugEntity, context) - layoutLIZIZ.getWidth();
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append(C669090QMh.LIZJ((SearchSugEntity) awS72S0500000_10.l0, charSequenceLIZ, ((C21415018rM) awS72S0500000_10.l1).getContext(), iLJFF, true).getText()).append(charSequenceLIZIZ);
            SearchSugEntity searchSugEntity2 = (SearchSugEntity) awS72S0500000_10.l0;
            Context context2 = ((C21415018rM) awS72S0500000_10.l1).getContext();
            c669090QMh.getClass();
            Layout layoutLIZJ = C669090QMh.LIZJ(searchSugEntity2, spannableStringBuilderAppend, context2, -1, true);
            if (((C671660QWe) awS72S0500000_10.l2) == null || (eComWordRichExpression2 = ((SearchSugEntity) awS72S0500000_10.l0).wordRichExpression) == null || !eComWordRichExpression2.LIZ()) {
                layoutLJ = C669090QMh.LJ((SearchSugEntity) awS72S0500000_10.l0, ((C21415018rM) awS72S0500000_10.l1).getContext(), iLJFF);
            }
            C09UZ.LIZJ(new ARunnableS3S0600000_10((LinearLayout) awS72S0500000_10.l3, (C21415018rM) awS72S0500000_10.l1, layoutLIZJ, layoutLJ, (C21415018rM) awS72S0500000_10.l4, (C671660QWe) awS72S0500000_10.l2, 1));
        } else {
            if (((C671660QWe) awS72S0500000_10.l2) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C669090QMh c669090QMh2 = C669090QMh.LIZ;
            SearchSugEntity searchSugEntity3 = (SearchSugEntity) awS72S0500000_10.l0;
            Context context3 = ((C21415018rM) awS72S0500000_10.l1).getContext();
            c669090QMh2.getClass();
            Layout layoutLIZJ2 = C669090QMh.LIZJ(searchSugEntity3, charSequenceLIZ, context3, -1, z2);
            if (((C671660QWe) awS72S0500000_10.l2) == null || (eComWordRichExpression = ((SearchSugEntity) awS72S0500000_10.l0).wordRichExpression) == null || !eComWordRichExpression.LIZ()) {
                layoutLJ = C669090QMh.LJ((SearchSugEntity) awS72S0500000_10.l0, ((C21415018rM) awS72S0500000_10.l1).getContext(), -1);
            }
            C09UZ.LIZJ(new ARunnableS3S0600000_10((LinearLayout) awS72S0500000_10.l3, (C21415018rM) awS72S0500000_10.l1, layoutLIZJ2, layoutLJ, (C21415018rM) awS72S0500000_10.l4, (C671660QWe) awS72S0500000_10.l2, 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS72S0500000_10 awS72S0500000_10) {
        Layout layoutLJ;
        System.currentTimeMillis();
        CharSequence charSequenceLIZ = C0QNF.LIZ((SearchSugEntity) awS72S0500000_10.l0, ((C21415018rM) awS72S0500000_10.l1).getContext());
        C669090QMh c669090QMh = C669090QMh.LIZ;
        SearchSugEntity searchSugEntity = (SearchSugEntity) awS72S0500000_10.l0;
        Context context = ((C21415018rM) awS72S0500000_10.l1).getContext();
        c669090QMh.getClass();
        Layout layoutLIZJ = C669090QMh.LIZJ(searchSugEntity, charSequenceLIZ, context, -1, false);
        if (layoutLIZJ.getLineCount() > 1) {
            layoutLJ = null;
        } else {
            layoutLJ = C669090QMh.LJ((SearchSugEntity) awS72S0500000_10.l0, ((C21415018rM) awS72S0500000_10.l1).getContext(), -1);
        }
        C09UZ.LIZJ(new ARunnableS3S0600000_10(layoutLIZJ, layoutLJ, (View) awS72S0500000_10.l3, (LinearLayout) awS72S0500000_10.l2, (C21415018rM) awS72S0500000_10.l1, (C21415018rM) awS72S0500000_10.l4, 3));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS72S0500000_10 r21) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS72S0500000_10.invoke$2(kotlin.jvm.internal.AwS72S0500000_10):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS72S0500000_10(InterfaceC497601wk interfaceC497601wk, InterfaceC497601wk interfaceC497601wk2, Fragment fragment, List<? extends SearchMixFeed> list, SearchMarkdownContentCacheVM searchMarkdownContentCacheVM, ISearchMarkdownNimblePreloadPlugin iSearchMarkdownNimblePreloadPlugin) {
        super(0);
        this.$t = iSearchMarkdownNimblePreloadPlugin;
        this.l0 = interfaceC497601wk;
        this.l1 = interfaceC497601wk2;
        this.l2 = fragment;
        this.l3 = list;
        this.l4 = searchMarkdownContentCacheVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S0500000_10(View view, LinearLayout linearLayout, C21415018rM c21415018rM, C21415018rM c21415018rM2, SearchSugEntity searchSugEntity, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchSugEntity;
        this.l1 = c21415018rM;
        this.l2 = linearLayout;
        this.l3 = view;
        this.l4 = c21415018rM2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS72S0500000_10(LinearLayout linearLayout, C21415018rM c21415018rM, C21415018rM c21415018rM2, SearchSugEntity searchSugEntity, C671660QWe c671660QWe, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchSugEntity;
        this.l1 = c21415018rM;
        this.l2 = c671660QWe;
        this.l3 = linearLayout;
        this.l4 = c21415018rM2;
    }
}
