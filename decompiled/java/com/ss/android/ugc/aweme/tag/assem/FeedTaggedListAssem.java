package com.ss.android.ugc.aweme.tag.assem;

import X.C019F;
import X.C10EU;
import X.C13LE;
import X.C15438062q;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1876607Wq;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C298690BnH;
import X.C298710BnJ;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737470SwL;
import X.C737490SwN;
import X.C737500SwO;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.FeedTaggedEditCell;
import com.ss.android.ugc.aweme.tag.FeedTaggedListCell;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedTaggedListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public final C1559260qg8 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedTaggedListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tag/viewmodel/FeedTaggedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedTaggedListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedTaggedListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 836), AFwS243S0000000_11.get$arr$(484), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C737500SwO.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.hv8);
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(FeedTaggedListCell.class, FeedTaggedEditCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        ArrayList<User> arrayList = ((C737500SwO) this.LLJI.getValue()).LLILLJJLI;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (User user : arrayList) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJ;
                if (viewOnAttachStateChangeListenerC20604515jv3 == null) {
                    viewOnAttachStateChangeListenerC20604515jv3 = null;
                }
                C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20604515jv3.getState(), new C737490SwN(user, new C737470SwL(((C737500SwO) this.LLJI.getValue()).LL, ((C737500SwO) this.LLJI.getValue()).LLILLL)));
                arrayList2.add(Unit.LIZ);
            }
        }
        Aweme aweme = ((C737500SwO) this.LLJI.getValue()).LL;
        if (aweme != null && ((C298710BnJ.LIZ() || C298690BnH.LIZIZ()) && C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)))) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv4;
            }
            C20600815jK.LIZJ(viewOnAttachStateChangeListenerC20604515jv2.getState(), new C1876607Wq(new C737470SwL(aweme, ((C737500SwO) this.LLJI.getValue()).LLILLL)));
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0SwP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C231000uq) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(140), 6);
    }
}
