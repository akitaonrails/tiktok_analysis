package com.ss.android.ugc.aweme.share.improve.pkg;

import X.C1370940lmO;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1372780lpM;
import X.C1372910lpZ;
import X.C1373340lqG;
import X.C13LE;
import X.C2217371BqR;
import X.C621180OYa;
import X.C717590SCv;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.share.ShareService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class NowExternalContentSharePackage extends LinkDefaultSharePackage {
    public static final int $stable;
    public static final C1372910lpZ Companion;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;
    public final C717590SCv activity$delegate;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0lpZ] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(NowExternalContentSharePackage.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C13LE.LIZ.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217371BqR};
        Companion = new Object() { // from class: X.0lpZ
        };
        $stable = 8;
    }

    public final C1371590lnR LJJ() {
        C1371600lnS c1371600lnS = new C1371600lnS();
        c1371600lnS.LJJIIJ = this;
        ShareService shareService = C621180OYa.LIZ;
        C717590SCv c717590SCv = this.activity$delegate;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LL;
        shareService.LJIILIIL((Activity) c717590SCv.LIZ(), c1371600lnS, false, false);
        c1371600lnS.LJJIIJZLJL = true;
        c1371600lnS.LJJI = R.string.tba;
        c1371600lnS.LJJIII = R.string.f1_;
        c1371600lnS.LJJJJJL = false;
        return new C1371590lnR(c1371600lnS);
    }

    public NowExternalContentSharePackage(Activity activity, C1372780lpM c1372780lpM) {
        Companion.getClass();
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "now_link";
        c1370940lmO.LJFF = c1372780lpM.LJ;
        c1370940lmO.LIZLLL = c1372780lpM.LIZIZ;
        c1370940lmO.LJ = c1372780lpM.LIZJ;
        Resources resources = activity.getResources();
        c1370940lmO.LJIIIIZZ = new SendMessageTemplateTask("now_signup", new ImageCardTemplate(new ImageCardTitleBar(new ImageComponent(Collections.singletonList(c1372780lpM.LJFF), (String) null, (ResolutionComponent) null, (String) null, (IconTypeComponent) null, 62), new TextComponent(c1372780lpM.LIZIZ, null, null), new TextComponent(c1372780lpM.LIZJ, null, null), 8), new ActionLinkComponent(Collections.singletonList(c1372780lpM.LJ), ActionLinkType.H5_LINK), null, new PreviewHintComponent(new TextComponent(resources.getString(2131838376), null, null), new TextComponent(resources.getString(2131838375), null, null), new TextComponent(resources.getString(2131835762), null, null), null, null, null, 56), new BaseRequestComponent(new QueryDataComponent(null, C1373340lqG.LIZ(AFwS259S0000000_21.get$arr$(223)).LIZLLL(), 1)), 468), new SendMessageEventParcel("TTN_referral", null, null, null, null, null, 62), null, false, 24);
        super(c1370940lmO);
        this.activity$delegate = new C717590SCv(new AwS565S0100000_21(activity, 821));
        Bundle bundle = this.extras;
        String str = c1372780lpM.LIZ;
        if (str != null) {
            C786410Ut5.LJJJI("selected_uid", str, bundle);
        }
        C786410Ut5.LJJJI("thumb_url", c1372780lpM.LJFF, bundle);
        C786410Ut5.LJJJI("default_edit_text_msg", c1372780lpM.LIZLLL, bundle);
        bundle.putBoolean("friend_only", true);
        String str2 = c1372780lpM.LJI;
        if (str2 != null) {
            C786410Ut5.LJJJI("ttn_filter_scene", str2, bundle);
        }
    }
}
