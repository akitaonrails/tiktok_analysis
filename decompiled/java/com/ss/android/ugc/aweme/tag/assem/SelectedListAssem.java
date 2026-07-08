package com.ss.android.ugc.aweme.tag.assem;

import X.C019F;
import X.C13LE;
import X.C15NZ;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.tag.SelectedListCell;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SelectedListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectedListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tag/viewmodel/VideoTagFriendsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SelectedListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTagFriendsListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1210), AFwS276S0000000_31.get$arr$(218), null, true);
    }

    public final VideoTagFriendsListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (VideoTagFriendsListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.ume);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SelectedListCell.class);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext());
        linearLayoutManager.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.15NU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 64), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.15NV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 65), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.15NW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 66), 4);
    }

    public final void Ho(IMUser iMUser, boolean z) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = null;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
        if (z) {
            C20600815jK.LIZJ(state, new C15NZ(iMUser));
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv3;
            }
            viewOnAttachStateChangeListenerC20604515jv2.scrollToPosition(viewOnAttachStateChangeListenerC20604515jv2.getState().LJIIIIZZ() - 1);
            return;
        }
        C20600815jK.LJIIL(state, new C15NZ(iMUser));
    }
}
