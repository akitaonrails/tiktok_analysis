package defpackage;

import X.C1360650lVn;
import X.C15438062q;
import X.C1558520qew;
import X.C1587150rP7;
import X.C1602160rnK;
import X.C1848410yCV;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C298720BnK;
import X.C418440Gaw;
import X.C626620Ohw;
import X.C814420VxA;
import X.InterfaceC0148002o;
import X.InterfaceC1360660lVo;
import X.InterfaceC665370Q7z;
import android.view.View;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS128S0101000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostFeedEntranceVM extends AssemViewModel<b8> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public InterfaceC665370Q7z LL;
    public String LLILLJJLI;
    public Aweme LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final e LLIZ = new e();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new b8(0);
    }

    public final void vQ2() {
        IButtonEntranceView iButtonEntranceView;
        int[] iArrNi;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IListEntranceView iListEntranceView;
        int[] iArrNi2;
        if (!C1587150rP7.LIZIZ.LJI(this.LLILLJJLI, this.LLILZ)) {
            setState(AFwS259S0000000_21.get$arr$(1));
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7z2 = this.LL;
        if (interfaceC665370Q7z2 == null || (iButtonEntranceView = (IButtonEntranceView) C1558520qew.LIZ(interfaceC665370Q7z2, IButtonEntranceView.class, null)) == null || (iArrNi = iButtonEntranceView.Ni()) == null || (interfaceC665370Q7z = this.LL) == null || (iListEntranceView = (IListEntranceView) C1558520qew.LIZ(interfaceC665370Q7z, IListEntranceView.class, null)) == null || (iArrNi2 = iListEntranceView.Ni()) == null) {
            return;
        }
        int i = iArrNi[1];
        int i2 = iArrNi2[1];
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (this.LLILZIL == i && this.LLILZLL == i2) {
            return;
        }
        if (i - i2 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))) {
            setState(new AwS128S0101000_21(this, i2, 0));
        } else {
            setState(AFwS259S0000000_21.get$arr$(2));
        }
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1587150rP7.LIZIZ.LIZIZ(this.LLIZ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        setState(new AwS600S0100000_21(C1587150rP7.LIZIZ.LIZLLL(this.LLIZ), 2));
    }

    public final class e implements InterfaceC1360660lVo {
        public e() {
        }

        @Override // X.InterfaceC1360660lVo
        public final void LIZ(C1360650lVn c1360650lVn) {
            RepostFeedEntranceVM.this.setState(new AwS600S0100000_21(c1360650lVn, 1));
        }
    }

    public static final class a {
        public static void LIZ(a8 a8Var, Aweme aweme, C1360650lVn c1360650lVn, C626620Ohw c626620Ohw, String str) {
            List<RepostNewContentUser> list;
            ArrayList arrayList = null;
            if (C298720BnK.LIZIZ()) {
                if (c626620Ohw != null) {
                    if (c1360650lVn != null && (list = c1360650lVn.LIZIZ) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (RepostNewContentUser repostNewContentUser : list) {
                            User user = new User();
                            user.setUid(repostNewContentUser.userId);
                            user.setUniqueId(repostNewContentUser.uniqueId);
                            user.setNickname(repostNewContentUser.nickName);
                            user.setAvatarThumb(repostNewContentUser.avatarThumb);
                            user.setAvatar168(repostNewContentUser.avatar168);
                            arrayList.add(user);
                        }
                    }
                    c626620Ohw.LIZ(1, arrayList);
                } else {
                    return;
                }
            } else if (((Number) C298720BnK.LIZ.getValue()).intValue() == 1) {
                if (c626620Ohw != null) {
                    c626620Ohw.LIZ(0, null);
                } else {
                    return;
                }
            } else {
                if (c626620Ohw == null) {
                    return;
                }
                int visibility = c626620Ohw.getVisibility();
                c626620Ohw.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c626620Ohw);
            }
            View.OnClickListener c8Var = new c8(a8Var, aweme, c1360650lVn, c626620Ohw, str);
            if (C1848410yCV.LIZ) {
                c8Var = new f(c8Var);
            }
            View.OnClickListener aVar = new mf.a(c8Var);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c626620Ohw);
            }
            c626620Ohw.setOnClickListener(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void LIZIZ(java.lang.String r13, X.C1360650lVn r14, java.lang.String r15, java.lang.String r16, com.ss.android.ugc.aweme.feed.model.Aweme r17) {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: RepostFeedEntranceVM.a.LIZIZ(java.lang.String, X.0lVn, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
        }
    }
}
