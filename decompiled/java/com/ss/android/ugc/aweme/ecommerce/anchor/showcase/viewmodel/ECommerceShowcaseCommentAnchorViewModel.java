package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.viewmodel;

import X.C18NJ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class ECommerceShowcaseCommentAnchorViewModel extends ViewModel {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final Map<String, Object> LLILLL = new LinkedHashMap();
    public final MutableLiveData<ECommerceShowcaseAnchorState> LLILZ = new MutableLiveData<>();
    public final AnchorCommonStruct LLILZIL;
    public final ShowcaseContent LLILZLL;

    public ECommerceShowcaseCommentAnchorViewModel(Aweme aweme, String str) {
        AnchorCommonStruct anchorCommonStruct;
        AnchorCommonStruct next;
        this.LL = aweme;
        this.LLILLJJLI = str;
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        AnchorCommonStruct anchorCommonStruct2 = null;
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AnchorBizUtils.LIZ.getClass();
                    if (AnchorBizUtils.LJIIZILJ().contains(Integer.valueOf(next.getType()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            anchorCommonStruct = next;
        } else {
            anchorCommonStruct = null;
        }
        this.LLILZIL = anchorCommonStruct;
        C18NJ c18nj = C18NJ.LIZ;
        List<AnchorCommonStruct> anchors2 = this.LL.getAnchors();
        if (anchors2 != null) {
            Iterator<AnchorCommonStruct> it3 = anchors2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AnchorCommonStruct next2 = it3.next();
                AnchorBizUtils.LIZ.getClass();
                if (AnchorBizUtils.LJIIZILJ().contains(Integer.valueOf(next2.getType()))) {
                    anchorCommonStruct2 = next2;
                    break;
                }
            }
            anchorCommonStruct2 = anchorCommonStruct2;
        }
        c18nj.getClass();
        this.LLILZLL = C18NJ.LIZIZ(anchorCommonStruct2);
    }
}
