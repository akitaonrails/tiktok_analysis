package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell;

import X.C01GW;
import X.C0PBO;
import X.C0PCY;
import X.C0PRC;
import X.C0Q3E;
import X.C1440005kM;
import X.C21681819tI;
import X.C452501pT;
import X.C584850Mwl;
import X.C643130PKl;
import X.C668900QLo;
import X.C678950Qk9;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchQueryCorrectCell extends PowerCell<C0PBO> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 820));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 821));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.evu;
    }

    public final TuxTextView I5() {
        return (TuxTextView) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r31) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell.SearchQueryCorrectCell.onBindItemView(X.0zJl):void");
    }

    public final void N5(QueryCorrectComponentInfo queryCorrectComponentInfo, String str, boolean z) {
        String str2;
        String str3;
        Map<String, String> map;
        C1440005kM.LIZ(new C668900QLo(str));
        if (z) {
            str2 = "origin";
        } else {
            str2 = "correct";
        }
        QueryDesc queryDescLIZIZ = C643130PKl.LIZIZ(queryCorrectComponentInfo, str2);
        if (queryDescLIZIZ != null && (map = queryDescLIZIZ.eventParam) != null) {
            str3 = map.get("click_type");
        } else {
            str3 = null;
        }
        int i = queryCorrectComponentInfo.correctLevel;
        String str4 = queryCorrectComponentInfo.correctedQuery;
        String str5 = queryCorrectComponentInfo.originalQuery;
        if (str3 == null) {
            if (z) {
                str3 = "original_keyword";
            } else {
                str3 = "corrected_keyword";
            }
        }
        L5(i, "click", str4, str5, str3);
    }

    public final void L5(int i, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        if (i == 2) {
            str5 = "strong";
        } else {
            str5 = "weak";
        }
        ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(this.itemView);
        if (iSearchContextAbilityLIZ != null && (c0pcyPh1 = iSearchContextAbilityLIZ.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
            str6 = c0prc.LLILLL;
        } else {
            str6 = null;
        }
        C678950Qk9 c678950Qk9 = new C678950Qk9();
        c678950Qk9.LJIIZILJ("action_type", str);
        c678950Qk9.LJIIZILJ("log_pb", C584850Mwl.LIZ.LJ(str6));
        c678950Qk9.LJIIZILJ("correction_type", str5);
        c678950Qk9.LJIIZILJ("impr_id", str6);
        c678950Qk9.LJIIZILJ("corrected_keyword", str2);
        c678950Qk9.LJIIZILJ("original_keyword", str3);
        c678950Qk9.LJIIZILJ("click_type", str4);
        c678950Qk9.LJIILJJIL();
    }
}
