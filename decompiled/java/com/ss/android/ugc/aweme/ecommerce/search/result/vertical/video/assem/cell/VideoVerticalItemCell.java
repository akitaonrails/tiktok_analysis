package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.cell;

import X.C01GW;
import X.C1018703yb;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C294600Bgg;
import X.C452501pT;
import X.C660320PvC;
import X.C662660Pyy;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.EnhancedProduct;
import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoVerticalItemCell extends PowerCell<C660320PvC> {
    public static final /* synthetic */ int LLJJ = 0;
    public C660320PvC LL;
    public boolean LLJI;
    public EnhancedProduct LLJILJIL;
    public ProductAnchor LLJILJILJ;
    public Product LLJILLL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 139));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 141));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 136));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 140));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 138));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 143));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 137));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 142));
    public String LLJIJIL = "";

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bpc;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.itemView.setPadding(10, 10, 10, 10);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String str;
        String groupId;
        String groupId2;
        String str2;
        Aweme aweme;
        AwemeCommerceStruct commerceVideoAuthInfo;
        Aweme aweme2;
        Aweme aweme3;
        super.onViewAttachedToWindow();
        C660320PvC c660320PvC = this.LL;
        boolean z = false;
        if (c660320PvC == null || c660320PvC.LLIZ) {
            return;
        }
        String ecSearchBoBcLabelText = null;
        if (1 != 0) {
            SearchResultParam searchResultParam = c660320PvC != null ? c660320PvC.LLILZLL : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C660320PvC c660320PvC2 = this.LL;
            if (c660320PvC2 == null || (str = c660320PvC2.LLILLL) == null) {
                str = "";
            }
            linkedHashMap.put("search_id", str);
            C660320PvC c660320PvC3 = this.LL;
            if (c660320PvC3 == null || (aweme3 = c660320PvC3.LLILLJJLI) == null || (groupId = aweme3.getGroupId()) == null) {
                groupId = "";
            }
            linkedHashMap.put("search_result_id", groupId);
            C660320PvC c660320PvC4 = this.LL;
            if (c660320PvC4 == null || (aweme2 = c660320PvC4.LLILLJJLI) == null || (groupId2 = aweme2.getGroupId()) == null) {
                groupId2 = "";
            }
            linkedHashMap.put("group_id", groupId2);
            C660320PvC c660320PvC5 = this.LL;
            if (c660320PvC5 == null || (str2 = c660320PvC5.LLILZIL) == null) {
                str2 = "";
            }
            linkedHashMap.put("impr_id", str2);
            C660320PvC c660320PvC6 = this.LL;
            linkedHashMap.put("rank", String.valueOf(c660320PvC6 != null ? c660320PvC6.LLILZ : -1));
            C660320PvC c660320PvC7 = this.LL;
            if (c660320PvC7 != null && c660320PvC7.LL) {
                z = true;
            }
            linkedHashMap.put("is_first_screen", z ? "1" : CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("anchor_info", this.LLJILLL != null ? "search_video_single_anchor" : "");
            C660320PvC c660320PvC8 = this.LL;
            if (c660320PvC8 != null && (aweme = c660320PvC8.LLILLJJLI) != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
            }
            linkedHashMap.put("compliance_certification", C294600Bgg.LIZ(ecSearchBoBcLabelText) ? "1" : CardStruct.IStatusCode.DEFAULT);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("a2270.b0080.c8864.d7693_i");
            C660320PvC c660320PvC9 = this.LL;
            sbLIZ.append(c660320PvC9 != null ? c660320PvC9.LLILZ : -1);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            PageFinder pageFinderVia = PageFinder.via(this.itemView);
            C2097608Jq.LJ();
            Map mapLIZ = C662660Pyy.LIZ(searchResultParam);
            mapLIZ.putAll(linkedHashMap);
            C1018703yb.LIZ(pageFinderVia, "search_result_show_video", strLIZIZ, mapLIZ);
            C660320PvC c660320PvC10 = this.LL;
            if (c660320PvC10 != null) {
                c660320PvC10.LLIZ = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.search.ecom.data.Product r31) {
        /*
            Method dump skipped, instruction units count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.cell.VideoVerticalItemCell.I5(com.ss.android.ugc.aweme.search.ecom.data.Product):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e2  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r14) {
        /*
            Method dump skipped, instruction units count: 1511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.cell.VideoVerticalItemCell.onBindItemView(X.0zJl):void");
    }
}
