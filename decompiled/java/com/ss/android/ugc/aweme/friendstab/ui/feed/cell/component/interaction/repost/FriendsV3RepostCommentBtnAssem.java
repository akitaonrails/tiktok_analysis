package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction.repost;

import X.C01GW;
import X.C0CNO;
import X.C1357800lRC;
import X.C1357810lRD;
import X.C1357840lRG;
import X.C1357870lRJ;
import X.C1359520lTy;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C705700RmC;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.friendstab.repo.RepostCommentStruct;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS146S0101000_6;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3RepostCommentBtnAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3RepostCommentBtnAssem, InterfaceC1361270lWn> implements IRepostInteractionSyncProtocol {
    public FriendsV3RepostModel LLJL;
    public C1357800lRC LLJLIL;
    public final Set<String> LLJLILLLLZIIL = new LinkedHashSet();
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(269));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 578));
    public final C630740Ooa LLJLLL = new C630740Ooa(EnumC452301pR.NONE, new AwS565S0100000_21(this, 575), null);
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(268));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 576));

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void E22(C1359520lTy c1359520lTy) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return ((Boolean) this.LLJZ.getValue()).booleanValue() ? R.layout.cal : R.layout.cak;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, Oo(), new AwS565S0100000_21(this, 577));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), IRepostInteractionSyncProtocol.class, this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IRepostInteractionSyncProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void PO(C1357870lRJ c1357870lRJ) {
        int i;
        String str;
        C1357800lRC c1357800lRC = this.LLJLIL;
        if (c1357800lRC != null && (i = c1357800lRC.LIZ) > 0) {
            RepostReplyStruct repostReplyStruct = c1357870lRJ.LIZ;
            String str2 = null;
            if (repostReplyStruct != null) {
                str = repostReplyStruct.repostId;
            } else {
                str = null;
            }
            FriendsV3RepostModel friendsV3RepostModel = this.LLJL;
            if (friendsV3RepostModel != null) {
                str2 = friendsV3RepostModel.realRepostId;
            }
            if (Intrinsics.LJFF(str, str2)) {
                int i2 = i - 1;
                C1357800lRC c1357800lRC2 = this.LLJLIL;
                if (c1357800lRC2 != null) {
                    c1357800lRC2.LIZ = i2;
                }
                sp(i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void Zc1(C1357810lRD c1357810lRD) {
        int i;
        String str;
        FriendsV3RepostModel friendsV3RepostModel = this.LLJL;
        String str2 = null;
        if (friendsV3RepostModel != null && friendsV3RepostModel.repostComments == null && friendsV3RepostModel != null) {
            friendsV3RepostModel.repostComments = new RepostCommentStruct(null, null, null);
        }
        C1357800lRC c1357800lRC = this.LLJLIL;
        if (c1357800lRC != null) {
            i = c1357800lRC.LIZ;
        } else {
            i = 0;
        }
        RepostReplyStruct repostReplyStruct = c1357810lRD.LIZIZ;
        if (repostReplyStruct != null) {
            str = repostReplyStruct.repostId;
        } else {
            str = null;
        }
        FriendsV3RepostModel friendsV3RepostModel2 = this.LLJL;
        if (friendsV3RepostModel2 != null) {
            str2 = friendsV3RepostModel2.realRepostId;
        }
        if (Intrinsics.LJFF(str, str2)) {
            int i2 = C1357840lRG.LIZ[c1357810lRD.LIZJ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i--;
                    }
                } else {
                    Set<String> set = this.LLJLILLLLZIIL;
                    String str3 = c1357810lRD.LJ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (!set.contains(str3)) {
                        i++;
                    }
                }
            } else {
                i++;
                String str4 = c1357810lRD.LJ;
                if (str4 != null) {
                    this.LLJLILLLLZIIL.add(str4);
                }
            }
            C1357800lRC c1357800lRC2 = this.LLJLIL;
            if (c1357800lRC2 != null) {
                c1357800lRC2.LIZ = i;
            }
            sp(i);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (((Boolean) this.LLJZ.getValue()).booleanValue()) {
            ((TextView) this.LLJLLL.getValue()).setMaxWidth(((Number) this.LLJZIJLIL.getValue()).intValue());
            LJJIJL().setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLLIL.getValue();
        if (assemViewModel != null) {
            C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.0lRH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1357900lRM) obj).LLILZ;
                }
            }, null, AFwS305S0000000_21.get$arr$(60), 6);
        }
        C786410Ut5.I7(new AbS701S0100000_21(this, 5), LJJIJL());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        FriendsV3RepostModel friendsV3RepostModelLLD;
        int i;
        InterfaceC1357880lRK interfaceC1357880lRK;
        InterfaceC1357880lRK interfaceC1357880lRK2;
        InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) obj;
        boolean z = interfaceC1361270lWn instanceof InterfaceC1357880lRK;
        C1357800lRC c1357800lRCLJLJL = null;
        if (z && (interfaceC1357880lRK2 = (InterfaceC1357880lRK) interfaceC1361270lWn) != null) {
            friendsV3RepostModelLLD = interfaceC1357880lRK2.LLD();
        } else {
            friendsV3RepostModelLLD = null;
        }
        this.LLJL = friendsV3RepostModelLLD;
        if (z && (interfaceC1357880lRK = (InterfaceC1357880lRK) interfaceC1361270lWn) != null) {
            c1357800lRCLJLJL = interfaceC1357880lRK.LJLJL();
        }
        this.LLJLIL = c1357800lRCLJLJL;
        if (c1357800lRCLJLJL != null) {
            i = c1357800lRCLJLJL.LIZ;
        } else {
            i = 0;
        }
        sp(i);
    }

    public final void sp(int i) {
        if (i < 0) {
            return;
        }
        C0CNO.LIZLLL(0L, new AwS146S0101000_6(this, i, 0));
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
