package com.ss.android.ugc.aweme.feed.assem.desc;

import X.C01GW;
import X.C0SD8;
import X.C0SXF;
import X.C13LE;
import X.C1ER1;
import X.C20684815ws;
import X.C2217371BqR;
import X.C2344009Gk;
import X.C291001Au;
import X.C452501pT;
import X.C717590SCv;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeVideoDescVM extends FeedBaseViewModel<C0SD8> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public int LLILLL;
    public boolean LLILZIL;
    public int LLILZLL;
    public final C717590SCv LL = new C717590SCv(AFwS198S0000000_11.get$arr$(81));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(82));
    public String LLILZ = "click_hide";
    public String LLIZ = "";
    public final int LLIZLLLIL = 7;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(LandscapeVideoDescVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0SD8(null, null);
    }

    public final boolean vQ2() {
        Aweme aweme;
        String contentDesc;
        VideoItemParams item = getItem();
        return !(item == null || (aweme = item.getAweme()) == null || (contentDesc = aweme.getContentDesc()) == null || contentDesc.length() == 0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        this.LLILZIL = false;
        C291001Au c291001Au = new C291001Au(Unit.LIZ);
        interfaceC0148002o.getClass();
        return new C0SD8(c291001Au, null);
    }

    public final void wQ2(String str, Map<String, String> map) {
        String str2;
        String aid;
        int iLJJIII;
        Aweme aweme;
        String desc;
        Aweme aweme2;
        Aweme aweme3;
        String authorUid;
        Aweme aweme4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        VideoItemParams item = getItem();
        String str3 = "";
        if (item == null || (str2 = item.mEventType) == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        VideoItemParams item2 = getItem();
        if (item2 == null || (aweme4 = item2.getAweme()) == null || (aid = aweme4.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        VideoItemParams item3 = getItem();
        if (item3 != null && (aweme3 = item3.getAweme()) != null && (authorUid = AwemeExtKt.getAuthorUid(aweme3)) != null) {
            str3 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        c2344009Gk.LJIIIIZZ("action_type", str);
        C717590SCv c717590SCv = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        int length = 0;
        Context context = (Context) c717590SCv.LIZ();
        if (context != null) {
            VideoItemParams item4 = getItem();
            if (item4 != null) {
                aweme2 = item4.getAweme();
            } else {
                aweme2 = null;
            }
            iLJJIII = C0SXF.LJJIII(context, aweme2);
        } else {
            iLJJIII = 1;
        }
        c2344009Gk.LIZJ(iLJJIII, "is_landscape_screen");
        c2344009Gk.LIZJ(this.LLIZ.length(), "title_without_hashtag_length");
        VideoItemParams item5 = getItem();
        if (item5 != null && (aweme = item5.getAweme()) != null && (desc = aweme.getDesc()) != null) {
            length = desc.length();
        }
        c2344009Gk.LIZJ(length, "title_length");
        c2344009Gk.LIZJ(this.LLILZLL, "spread_line_cnt");
        c2344009Gk.LJII(map);
        c2344009Gk.LJII(C1ER1.LIZIZ.LLZ());
        C20684815ws.LJIILLIIL("video_title", c2344009Gk.LIZ);
    }
}
