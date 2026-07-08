package com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment;

import X.C1353500lKG;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EH;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ARunnableS75S0200000_6;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardEditAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleCommentCommonKeyboard extends CommonCommentKeyboard implements ISingleCommentKeyboardAbility, InterfaceC737790Swr {
    public final SingleCommentCommonKeyboard LLJLILLLLZIIL = this;

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1558520qew.LJI(this, SingleCommentKeyboardVScope.class, this, ISingleCommentKeyboardAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.ISingleCommentKeyboardAbility
    public final int ZR1() {
        View view = this.LLJJIJI;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.ISingleCommentKeyboardAbility
    public final void Yr0() {
        SingleKeyboardFragment singleKeyboardFragment;
        FrameLayout frameLayout;
        PollCreateFragment pollCreateFragment;
        View viewFindViewById;
        C1353500lKG c1353500lKGZy1;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (!(fragmentLJI instanceof SingleKeyboardFragment) || (singleKeyboardFragment = (SingleKeyboardFragment) fragmentLJI) == null || !singleKeyboardFragment.isViewValid() || singleKeyboardFragment.getChildFragmentManager().LJLJJI() || singleKeyboardFragment.LLJJIJIL || (frameLayout = singleKeyboardFragment.LLJJIII) == null) {
            return;
        }
        IKeyboardEditAbility iKeyboardEditAbility = (IKeyboardEditAbility) C1558520qew.LIZ(C1558360qeg.LJFF(singleKeyboardFragment, null), IKeyboardEditAbility.class, null);
        if (iKeyboardEditAbility != null && (c1353500lKGZy1 = iKeyboardEditAbility.Zy1()) != null) {
            int selectionStart = c1353500lKGZy1.getSelectionStart();
            if (selectionStart < 0) {
                selectionStart = 0;
            }
            singleKeyboardFragment.LLJJIJI = selectionStart;
            int selectionEnd = c1353500lKGZy1.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            singleKeyboardFragment.LLJJIJIIJIL = selectionEnd;
        }
        C786410Ut5.LJZ(0, frameLayout);
        Fragment fragmentLJJJJZI = singleKeyboardFragment.getChildFragmentManager().LJJJJZI("comment_poll_create");
        if (!(fragmentLJJJJZI instanceof PollCreateFragment) || (pollCreateFragment = (PollCreateFragment) fragmentLJJJJZI) == null) {
            pollCreateFragment = new PollCreateFragment();
        }
        if (!pollCreateFragment.isAdded()) {
            C19EH c19ehLJIIJ = singleKeyboardFragment.getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.rfh, pollCreateFragment, "comment_poll_create");
            c19ehLJIIJ.LJIIL();
        }
        singleKeyboardFragment.LLJJIJIL = true;
        View view = singleKeyboardFragment.getView();
        if (view != null && (viewFindViewById = view.findViewById(R.id.qvp)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View view2 = pollCreateFragment.LLJI;
        if (view2 != null) {
            view2.animate().cancel();
            C786410Ut5.LJLLLLLL(4, view2);
            HandlerHook.viewPost(view2, new ARunnableS75S0200000_6(view2, pollCreateFragment, 28));
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.ISingleCommentKeyboardAbility
    public final boolean fH0() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        SingleKeyboardFragment singleKeyboardFragment = fragmentLJI instanceof SingleKeyboardFragment ? (SingleKeyboardFragment) fragmentLJI : null;
        return singleKeyboardFragment != null && singleKeyboardFragment.LLJJIJIL;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SingleCommentKeyboardVScope.class}).unbindAbility(this.LLJLILLLLZIIL, ISingleCommentKeyboardAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard
    public final void kp(boolean z) {
        SingleKeyboardFragment singleKeyboardFragment;
        boolean z2 = true;
        if (!z) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (!(fragmentLJI instanceof SingleKeyboardFragment) || (singleKeyboardFragment = (SingleKeyboardFragment) fragmentLJI) == null || !singleKeyboardFragment.LLJJIJIL) {
                z2 = false;
            }
        }
        super.kp(z2);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SingleCommentKeyboardVScope.class}).bindAbility(this.LLJLILLLLZIIL, ISingleCommentKeyboardAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.ISingleCommentKeyboardAbility
    public final void tD2(Boolean bool) {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), IKeyboardProtocol.class, false);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if (listLIZIZ != null) {
                Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                while (it2.hasNext()) {
                    ((IKeyboardProtocol) it2.next()).p50();
                }
            } else {
                return;
            }
        } else if (listLIZIZ != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                if (obj instanceof PortraitInputKeyboard) {
                    arrayList.add(obj);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((PortraitInputKeyboard) it3.next()).kq();
            }
        } else {
            return;
        }
        Iterator it4 = ((ArrayList) listLIZIZ).iterator();
        while (it4.hasNext()) {
            ((IKeyboardProtocol) it4.next()).g20();
        }
    }
}
