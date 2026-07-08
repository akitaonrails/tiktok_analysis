package com.ss.android.ugc.aweme.feed.model.live;

import X.C09C2;
import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class PreviewPromotionInfo implements Serializable {

    @C09CT("benefit")
    public final Integer benefit;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("first_line")
    public final PreviewBenefitPoint firstLine;

    @C09CT("icon")
    public final ProductImage icon;

    @C09CT("icons")
    public final List<ProductImage> icons;

    @C09CT("second_line_with_sep")
    public final PreviewBenefitLine previewBenefitLine;

    @C09CT("preview_card_icon_style")
    public final Integer previewCardIconStyle;

    @C09CT("preview_price_info")
    public final SinglePriceItem previewPriceInfo;

    @C09CT("second_line")
    public final PreviewBenefitPoint secondLine;

    @C09CT("with_mask")
    public final int withMask;

    public PreviewPromotionInfo() {
        this(null, null, 0, null, null, null, null, null, Integer.valueOf(Benefit.UNKNOWN.getValue()), 0);
    }

    public final Map<String, String> getDaInfoMap() {
        HashMap map;
        String str = this.daInfo;
        if (str != null) {
            try {
                map = (HashMap) C09C2.LIZ().LJIIIIZZ(str, new TypeToken<HashMap<String, String>>() { // from class: com.ss.android.ugc.aweme.feed.model.live.PreviewPromotionInfo$getDaInfoMap$1$1
                }.getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                map = null;
            }
            if (map != null) {
                return map;
            }
        }
        return new HashMap();
    }

    public PreviewPromotionInfo(SinglePriceItem singlePriceItem, ProductImage productImage, int i, PreviewBenefitPoint previewBenefitPoint, PreviewBenefitPoint previewBenefitPoint2, String str, List<ProductImage> list, PreviewBenefitLine previewBenefitLine, Integer num, Integer num2) {
        this.previewPriceInfo = singlePriceItem;
        this.icon = productImage;
        this.withMask = i;
        this.firstLine = previewBenefitPoint;
        this.secondLine = previewBenefitPoint2;
        this.daInfo = str;
        this.icons = list;
        this.previewBenefitLine = previewBenefitLine;
        this.benefit = num;
        this.previewCardIconStyle = num2;
    }
}
