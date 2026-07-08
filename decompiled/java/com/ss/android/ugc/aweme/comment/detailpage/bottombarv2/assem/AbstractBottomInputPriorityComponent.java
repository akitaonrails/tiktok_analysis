package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C1345170l6p;
import X.C1348730lCZ;
import X.C1348830lCj;
import X.C1353500lKG;
import X.C13LE;
import X.C1602160rnK;
import X.C199499133x;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C735370Ssx;
import X.C736950SvV;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractBottomInputPriorityComponent extends AbstractBottomPriorityComponent {
    public boolean LLJI;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 109));
    public String LLJIJIL = "";
    public final C736950SvV LLJILJIL = new C736950SvV(C13LE.LIZ(CommentSyncSharedVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(61), new AwS565S0100000_21((AbstractC738140SxQ) this, 111), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 110));

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void Oo(ViewGroup viewGroup) {
    }

    public abstract C1348830lCj Vo();

    public final C1348730lCZ So() {
        return (C1348730lCZ) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void Lo(String str, ViewGroup viewGroup) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttach: ");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        No(null);
        C1348830lCj c1348830lCj = (C1348830lCj) this.LLJILJILJ.getValue();
        if (c1348830lCj != null) {
            if (!Intrinsics.LJFF(str, "music_shoot_comment")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("commentInputManager.bindView: ");
                sbLIZ2.append(getClass().getSimpleName());
                C2188811AlT.LIZIZ(sbLIZ2);
                C1348730lCZ c1348730lCZSo = So();
                if (c1348730lCZSo != null) {
                    c1348730lCZSo.LJFF(c1348830lCj);
                }
            }
            if (!ComplianceServiceProvider.LJFF().LIZJ(3) && !ComplianceServiceProvider.LJFF().LJFF()) {
                z = false;
            } else {
                z = true;
            }
            if (this.LLJI != z) {
                this.LLJI = z;
                C1348730lCZ c1348730lCZSo2 = So();
                if (c1348730lCZSo2 != null) {
                    boolean z2 = this.LLJI;
                    c1348730lCZSo2.LLJJL = z2;
                    if (z2) {
                        TextView textView = c1348730lCZSo2.LLJJJJLIIL;
                        if (textView != null) {
                            C786410Ut5.LLIL(textView, 0);
                        }
                        C1353500lKG c1353500lKG = c1348730lCZSo2.LLILLL;
                        if (c1353500lKG != null) {
                            int visibility = c1353500lKG.getVisibility();
                            c1353500lKG.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, c1353500lKG);
                        }
                        c1348730lCZSo2.LJJIL(c1348730lCZSo2.LLJJJJ, false);
                        View view = c1348730lCZSo2.LLJJJJJIL;
                        if (view != null) {
                            C786410Ut5.LJLLLLLL(8, view);
                        }
                        C20684815ws.LJIILLIIL("tns_ags_float_comment_ban", new C2344009Gk().LIZ);
                        return;
                    }
                    TextView textView2 = c1348730lCZSo2.LLJJJJLIIL;
                    if (textView2 != null) {
                        C786410Ut5.LLIL(textView2, 8);
                    }
                    C1353500lKG c1353500lKG2 = c1348730lCZSo2.LLILLL;
                    if (c1353500lKG2 != null) {
                        int visibility2 = c1353500lKG2.getVisibility();
                        c1353500lKG2.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility2, 0, c1353500lKG2);
                    }
                    c1348730lCZSo2.LJJIL(c1348730lCZSo2.LLJJJJ, true);
                    View view2 = c1348730lCZSo2.LLJJJJJIL;
                    if (view2 == null) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(0, view2);
                }
            }
        }
    }

    public final void Zo(int i, Comment comment, boolean z) {
        String enterFrom;
        long id;
        int i2;
        boolean z2;
        String str;
        String str2;
        C1348730lCZ c1348730lCZSo;
        Object objValueOf;
        if (Ho() != null && comment != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            DetailBottomBarAbility detailBottomBarAbilityJo = Jo();
            if (detailBottomBarAbilityJo == null || (enterFrom = detailBottomBarAbilityJo.getEnterFrom()) == null) {
                enterFrom = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
            c2344009Gk.LJIIIIZZ("group_id", getAid());
            c2344009Gk.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(Ho()));
            c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
            if (comment.getGift() == null) {
                id = comment.getFakeGiftId();
            } else {
                id = comment.getGift().getId();
            }
            c2344009Gk.LIZLLL(id, "gift_id");
            c2344009Gk.LIZJ(C1345170l6p.LIZ(Ho()), "is_follow");
            Aweme awemeHo = Ho();
            if (awemeHo != null && awemeHo.isLike()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_like");
            c2344009Gk.LIZJ(!C199499133x.LIZ(comment.getText()) ? 1 : 0, "is_comment");
            if (i != 0) {
                c2344009Gk.LIZJ(i, "error_code");
                c2344009Gk.LJ(C786410Ut5.e3(getContext()), "newtork_condition");
            }
            if (this.LLJIJIL.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objValueOf2 = null;
            if (z2) {
                c2344009Gk.LJFF("enter_method", this.LLJIJIL);
            } else {
                C1348730lCZ c1348730lCZSo2 = So();
                if (c1348730lCZSo2 != null && (str = c1348730lCZSo2.LLJJLIIIJLLLLLLLZ) != null && str.length() != 0) {
                    C1348730lCZ c1348730lCZSo3 = So();
                    if (c1348730lCZSo3 != null) {
                        str2 = c1348730lCZSo3.LLJJLIIIJLLLLLLLZ;
                    } else {
                        str2 = null;
                    }
                    c2344009Gk.LJFF("enter_method", str2);
                } else {
                    c2344009Gk.LJFF("enter_method", "send_button");
                }
            }
            this.LLJIJIL = "";
            C1348730lCZ c1348730lCZSo4 = So();
            if ((c1348730lCZSo4 == null || c1348730lCZSo4.LLLFFI != -1) && ((c1348730lCZSo = So()) == null || c1348730lCZSo.LLLFZ != -1)) {
                C1348730lCZ c1348730lCZSo5 = So();
                if (c1348730lCZSo5 != null) {
                    objValueOf = Integer.valueOf(c1348730lCZSo5.LLLFFI);
                } else {
                    objValueOf = null;
                }
                c2344009Gk.LJ(objValueOf, "gift_value");
                C1348730lCZ c1348730lCZSo6 = So();
                if (c1348730lCZSo6 != null) {
                    objValueOf2 = Integer.valueOf(c1348730lCZSo6.LLLFZ);
                }
                c2344009Gk.LJ(objValueOf2, "gift_position");
            }
            C20684815ws.LJIILLIIL("send_gift", c2344009Gk.LIZ);
            C1348730lCZ c1348730lCZSo7 = So();
            if (c1348730lCZSo7 != null) {
                c1348730lCZSo7.LLLFFI = -1;
            }
            C1348730lCZ c1348730lCZSo8 = So();
            if (c1348730lCZSo8 != null) {
                c1348730lCZSo8.LLLFZ = -1;
            }
        }
    }
}
