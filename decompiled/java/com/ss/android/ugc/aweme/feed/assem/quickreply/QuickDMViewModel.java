package com.ss.android.ugc.aweme.feed.assem.quickreply;

import X.AbstractC714580S1g;
import X.C01GW;
import X.C0I08;
import X.C0S1X;
import X.C0S1Z;
import X.C0Y8T;
import X.C0ZH0;
import X.C1336205Ku;
import X.C1388190mED;
import X.C1954807lC;
import X.C19EG;
import X.C452501pT;
import X.C714550S1d;
import X.C714560S1e;
import X.C714570S1f;
import X.EnumC896890ZGl;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class QuickDMViewModel extends FeedBaseViewModel<C714560S1e> {
    public final Map<String, Integer> LL = new LinkedHashMap();
    public final int LLILLJJLI = 3;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 239));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C714560S1e(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public final void wQ2(C714560S1e c714560S1e) {
        setState(new AwS590S0100000_11(c714560S1e, 97));
    }

    public final void vQ2(C714560S1e c714560S1e, VideoItemParams videoItemParams, Context context) {
        AbstractC714580S1g abstractC714580S1g = c714560S1e.LL;
        String str = "";
        if (abstractC714580S1g instanceof C714570S1f) {
            C714570S1f c714570S1f = (C714570S1f) abstractC714580S1g;
            User user = c714570S1f.LIZ;
            String str2 = c714560S1e.LLILZLL;
            String str3 = c714560S1e.LLIZ;
            String strInvoke = c714570S1f.LIZIZ.invoke();
            C714570S1f c714570S1f2 = (C714570S1f) c714560S1e.LL;
            C0ZH0 c0zh0 = c714570S1f2.LIZJ;
            String str4 = c714570S1f2.LIZLLL;
            C0I08 c0i08 = (C0I08) this.LLILLL.getValue();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                Aweme aweme = videoItemParams.getAweme();
                String str5 = videoItemParams.mEventType;
                if (str5 == null) {
                    str5 = "";
                }
                imChatService.LIZIZ(c19egLIZIZ, supportFragmentManager, user, aweme, str5, "feed", null, null, true, false, EnumC896890ZGl.TYPE_MAIN_FEED_MUF_ENTRANCE, null, str2, str3, null, c0i08, c0zh0, str4, strInvoke, null, false, null, null);
                return;
            }
            return;
        }
        if (abstractC714580S1g instanceof C0S1X) {
            C0S1X c0s1x = (C0S1X) abstractC714580S1g;
            User user2 = c0s1x.LIZ;
            String str6 = c714560S1e.LLILZLL;
            String str7 = c714560S1e.LLIZ;
            String strInvoke2 = c0s1x.LIZIZ.invoke();
            C0I08 c0i082 = (C0I08) this.LLILLL.getValue();
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ2 == null) {
                return;
            }
            IIMChatService imChatService2 = C1336205Ku.LIZ(false).getImChatService();
            FragmentManager supportFragmentManager2 = c19egLIZIZ2.getSupportFragmentManager();
            Aweme aweme2 = videoItemParams.getAweme();
            String str8 = videoItemParams.mEventType;
            if (str8 != null) {
                str = str8;
            }
            imChatService2.LIZIZ(c19egLIZIZ2, supportFragmentManager2, user2, aweme2, str, null, null, null, false, false, EnumC896890ZGl.TYPE_FEED_QUICK_ENTRANCE, null, str6, str7, null, c0i082, null, null, strInvoke2, null, true, null, null);
            return;
        }
        if (abstractC714580S1g instanceof C0S1Z) {
            C0S1Z c0s1z = (C0S1Z) abstractC714580S1g;
            User user3 = c0s1z.LIZ;
            C0Y8T c0y8t = c0s1z.LIZIZ;
            String str9 = c714560S1e.LLILZLL;
            String str10 = c714560S1e.LLIZ;
            c0s1z.LIZJ.invoke();
            C0I08 c0i083 = (C0I08) this.LLILLL.getValue();
            C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ3 == null) {
                return;
            }
            IIMChatService imChatService3 = C1336205Ku.LIZ(false).getImChatService();
            FragmentManager supportFragmentManager3 = c19egLIZIZ3.getSupportFragmentManager();
            Aweme aweme3 = videoItemParams.getAweme();
            String str11 = videoItemParams.mEventType;
            if (str11 != null) {
                str = str11;
            }
            imChatService3.LJJIIJZLJL(c19egLIZIZ3, supportFragmentManager3, c0y8t, user3, aweme3, str, null, null, null, false, EnumC896890ZGl.TYPE_FEED_QUICK_ENTRANCE, null, c0i083, null, str9, str10, true);
            return;
        }
        if (abstractC714580S1g instanceof C714550S1d) {
        } else {
            throw new C1954807lC();
        }
    }
}
