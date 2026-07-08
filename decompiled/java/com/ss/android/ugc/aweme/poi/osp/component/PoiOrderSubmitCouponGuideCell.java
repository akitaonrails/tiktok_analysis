package com.ss.android.ugc.aweme.poi.osp.component;

import X.C1194780hCG;
import X.C13LE;
import X.C166W;
import X.C2217381BqS;
import X.C2248361CzK;
import X.C698190Ra5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.osp.repo.model.CouponGuildCellData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitCouponGuideCell extends PowerCell<CouponGuildCellData> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final C166W LL = new C166W(new AwS597S0100000_18((PowerCell) this, 425));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiOrderSubmitCouponGuideCell.class, "binding", "getBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSubmitCouponGuildeSubitemBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.e5d;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Context context;
        C698190Ra5 c698190Ra5LJFF;
        CouponGuildCellData couponGuildCellData = (CouponGuildCellData) interfaceC1891350zJl;
        super.onBindItemView(couponGuildCellData);
        String iconResToken = couponGuildCellData.getIconResToken();
        if (iconResToken != null && (context = getContext()) != null && (c698190Ra5LJFF = C2248361CzK.LJFF(context, iconResToken)) != null) {
            C166W c166w = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
            ((C1194780hCG) c166w.LIZ(this)).LLILLL.setIconRes(c698190Ra5LJFF.LIZ);
            Integer num = c698190Ra5LJFF.LIZIZ;
            if (num != null) {
                ((C1194780hCG) this.LL.LIZ(this)).LLILLL.setTintColor(num.intValue());
            }
        }
        C166W c166w2 = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILLJJLI;
        ((C1194780hCG) c166w2.LIZ(this)).LLILLJJLI.setText(couponGuildCellData.getContent());
    }
}
