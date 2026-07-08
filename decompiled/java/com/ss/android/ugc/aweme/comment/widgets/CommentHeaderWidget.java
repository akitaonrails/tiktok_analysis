package com.ss.android.ugc.aweme.comment.widgets;

import X.AbstractC1025070cmX;
import X.C09R3;
import X.C0OBG;
import X.C0RD4;
import X.C1017070cZd;
import X.C1019030ccn;
import X.C1022820ciu;
import X.C1029570ctn;
import X.C13LE;
import X.C1AF0;
import X.C2184171Adz;
import X.C2217381BqS;
import X.C988670bpp;
import X.C990310bsT;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommentHeaderWidget extends BaseCommentWidget implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final int LJIIJ() {
        return R.layout.ibd;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentHeaderWidget.class, "mLinkTag", "getMLinkTag()Landroid/view/View;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentHeaderWidget.class, "mLinkIcon", "getMLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommentHeaderWidget.class, "mLinkTitle", "getMLinkTitle()Landroid/widget/TextView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(CommentHeaderWidget.class, "mLinkAdTag", "getMLinkAdTag()Landroid/widget/TextView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(CommentHeaderWidget.class, "mLinkAdTagDivider", "getMLinkAdTagDivider()Landroid/view/View;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(CommentHeaderWidget.class, "mLinkDesc", "getMLinkDesc()Landroid/widget/TextView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(CommentHeaderWidget.class, "mCommerceArea", "getMCommerceArea()Landroid/view/View;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(CommentHeaderWidget.class, "mCommerceLogo", "getMCommerceLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(CommentHeaderWidget.class, "mCommerceTitle", "getMCommerceTitle()Landroid/widget/TextView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(CommentHeaderWidget.class, "mCommerceDescriptionLayout", "getMCommerceDescriptionLayout()Landroid/view/View;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(CommentHeaderWidget.class, "mCommercePrice", "getMCommercePrice()Landroid/widget/TextView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(CommentHeaderWidget.class, "mCommerceBottomDivider", "getMCommerceBottomDivider()Landroid/view/View;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(CommentHeaderWidget.class, "mCommerceSales", "getMCommerceSales()Landroid/widget/TextView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(CommentHeaderWidget.class, "mCommerceBottomDivider2", "getMCommerceBottomDivider2()Landroid/view/View;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(CommentHeaderWidget.class, "mPosCouponText", "getMPosCouponText()Landroid/widget/TextView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(CommentHeaderWidget.class, "mCommerceDivider", "getMCommerceDivider()Landroid/view/View;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS17 = new C2217381BqS(CommentHeaderWidget.class, "mCommerceLogoRight", "getMCommerceLogoRight()Landroid/widget/ImageView;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16, c2217381BqS17};
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    public final void LJIILLIIL() {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    /* JADX INFO: renamed from: LJIJ */
    public final void onChanged(C0RD4 c0rd4) {
        super.onChanged(c0rd4);
        String str = c0rd4.LIZ;
        if (str.hashCode() == 2016314694 && str.equals("comment_aweme_and_params") && LJIIZILJ() && this.LLJ != null && LJIIZILJ()) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C0RD4 c0rd4) {
        onChanged(c0rd4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        Aweme awemeLJIILL;
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (!C0OBG.LIZIZ(view) && view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.mrs) {
                LinkData linkDataLIZ = C990310bsT.LIZ(LJIILL());
                C988670bpp c988670bpp = new C988670bpp();
                c988670bpp.LIZ = "click";
                c988670bpp.LIZIZ = linkDataLIZ;
                c988670bpp.LIZJ = LJIILL();
                c988670bpp.LIZLLL = true;
                C1019030ccn.LJIJJ(this.LL, c988670bpp.LIZ());
                AbstractC1025070cmX.LJIJJ(this.LL, linkDataLIZ, LJIILL(), true);
                Aweme awemeLJIILL2 = LJIILL();
                if (awemeLJIILL2 != null && C1017070cZd.LJLJJLL(awemeLJIILL2)) {
                    C1019030ccn.LJIL("link_click", this.LL, linkDataLIZ, LJIILL(), true, false);
                }
                if (LJIIZILJ()) {
                    Aweme awemeLJIILL3 = LJIILL();
                    C1029570ctn.LIZ.getClass();
                    if (TextUtils.equals("company_link", C1029570ctn.LIZ(awemeLJIILL3, true)) && C990310bsT.LIZ(LJIILL()) != null && (awemeLJIILL = LJIILL()) != null && (commerceVideoAuthInfo = awemeLJIILL.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.getAdSource() == 1) {
                        Context context = this.LL;
                        Aweme awemeLJIILL4 = LJIILL();
                        JSONObject jSONObjectLJIIJJI = C1019030ccn.LJIIJJI(context, awemeLJIILL4, false, null);
                        if (!TextUtils.isEmpty("common_link")) {
                            try {
                                jSONObjectLJIIJJI.put("refer", "common_link");
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1AF0.LJ(e);
                            }
                        }
                        if (C1019030ccn.LJIJI(context, awemeLJIILL4)) {
                            C1019030ccn.LJJJJJ(context, awemeLJIILL4.getAwemeRawAd(), "comment_ad", "otherclick", jSONObjectLJIIJJI);
                        }
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("comment_ad", "otherclick", LJIILL().getAwemeRawAd());
                        c1022820ciuLIZLLL.LIZJ("common_link", "refer");
                        c1022820ciuLIZLLL.LJIIIIZZ();
                        return;
                    }
                    return;
                }
                return;
            }
            if (numValueOf.intValue() == R.id.eg1) {
                throw null;
            }
        }
    }
}
