package com.ss.android.ugc.aweme.feed.assem.usercard;

import X.C1073610e2p;
import X.C1075800e6M;
import X.C1075880e6U;
import X.C1261270ivV;
import X.C20685815x2;
import X.C2228708oH;
import X.EnumC1072790e1V;
import X.EnumC1073720e30;
import X.InterfaceC0148002o;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class VideoUserCardVM extends FeedBaseViewModel<C20685815x2> {
    public static final /* synthetic */ int LLIZ = 0;
    public boolean LL;
    public int LLILZ;
    public boolean LLILZLL;
    public long LLILLJJLI = -1;
    public int LLILLL = -1;
    public long LLILZIL = -1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C20685815x2(0);
    }

    public final void vQ2(C1075800e6M c1075800e6M) {
        String str;
        Aweme aweme;
        String authorUid;
        if (c1075800e6M.LJ() && !this.LLILZLL) {
            this.LLILZLL = true;
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LLILZIL;
            VideoItemParams item = getItem();
            if (item != null) {
                str = item.mEventType;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            C1261270ivV c1261270ivV = new C1261270ivV(str, "related_pop_up", null, null, false, null, null, null, 0, 33554428);
            VideoItemParams item2 = getItem();
            if (item2 != null && (aweme = item2.getAweme()) != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
                str2 = authorUid;
            }
            new C1075880e6U(c1261270ivV, "item", str2, jUptimeMillis, c1075800e6M.LIZIZ(), c1075800e6M.LIZIZ(), 1).LIZLLL(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        this.LLILLL = -1;
        this.LLILLJJLI = -1L;
        return C20685815x2.LIZ((C20685815x2) interfaceC0148002o, false, false, null, null, true, false, false, 78);
    }

    public final void wQ2(boolean z, EnumC1073720e30 enumC1073720e30) {
        String str;
        EnumC1073720e30 enumC1073720e302 = enumC1073720e30;
        VideoItemParams item = getItem();
        if (item == null || (str = item.mEventType) == null) {
            str = "";
        }
        if (z) {
            this.LLILLJJLI = SystemClock.uptimeMillis();
            new C2228708oH(str, EnumC1072790e1V.RELATED, null, null).LIZLLL(null);
        } else {
            if (this.LLILLJJLI <= 0) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LLILLJJLI;
            EnumC1072790e1V enumC1072790e1V = EnumC1072790e1V.RELATED;
            if (enumC1073720e302 == null) {
                enumC1073720e302 = EnumC1073720e30.AUTO;
            }
            new C1073610e2p(str, jUptimeMillis, enumC1073720e302, enumC1072790e1V, null, 16).LIZLLL(null);
            this.LLILLJJLI = -1L;
        }
    }

    public final boolean xQ2(C1075800e6M c1075800e6M, boolean z, boolean z2) {
        if (c1075800e6M.LJ() && !c1075800e6M.LIZLLL() && z && z2) {
            this.LLILLL = c1075800e6M.LIZIZ();
            setStateImmediate(AFwS252S0000000_16.get$arr$(140));
            wQ2(true, null);
            return true;
        }
        return false;
    }
}
