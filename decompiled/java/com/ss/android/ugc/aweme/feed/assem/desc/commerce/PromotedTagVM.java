package com.ss.android.ugc.aweme.feed.assem.desc.commerce;

import X.C717510SCn;
import X.InterfaceC0148002o;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Boost;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes12.dex */
public final class PromotedTagVM extends FeedBaseViewModel<C717510SCn> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C717510SCn(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        String str;
        int color;
        int color2;
        boolean z;
        C717510SCn c717510SCn = (C717510SCn) interfaceC0148002o;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            Boost boost = aweme.getBoost();
            if (boost != null) {
                str = boost.text;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                if (c717510SCn.LL != 8 || c717510SCn.LLILLJJLI != 8) {
                    return new C717510SCn(8, 8, c717510SCn.LLILLL, c717510SCn.LLILZ, c717510SCn.LLILZIL, c717510SCn.LLILZLL);
                }
                return c717510SCn;
            }
            try {
                color = Color.parseColor(boost.bgColor);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                color = ColorProtector.parseColor("#C0FFFFFF");
            }
            try {
                color2 = Color.parseColor(boost.textColor);
                z = false;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                color2 = 16777215;
                z = true;
            }
            String str2 = boost.text;
            Integer numValueOf = Integer.valueOf(color);
            Integer numValueOf2 = Integer.valueOf(color2);
            c717510SCn.getClass();
            return new C717510SCn(0, 0, numValueOf, numValueOf2, str2, z);
        }
        return c717510SCn;
    }
}
