package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C0N58;
import X.C0SY7;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C1388190mED;
import X.C1609500rzA;
import X.C19EG;
import X.C2188811AlT;
import X.C304890BxH;
import X.C418440Gaw;
import X.C426750GoL;
import X.C428150Gqb;
import X.C447550Hgn;
import X.C486860J7k;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1605470rsf;
import X.EnumC1606080rte;
import X.EnumC428940Grs;
import X.InterfaceC1398730mVD;
import X.InterfaceC1508640pMU;
import Y.ALAdapterS15S0100000_19;
import Y.AUListenerS268S0100000_19;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS455S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public class RectRecUserCell<ITEM extends C1261650iw7> extends BaseRectRecUserCell<C1261650iw7> implements InterfaceC1508640pMU {
    public TuxTag LLJJI;

    @Override // X.InterfaceC1508640pMU
    public String T() {
        return "RectRecUserCell";
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public int a6() {
        return R.layout.elf;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        C428150Gqb.LIZ(this.itemView, EnumC428940Grs.LIGHT_MASK, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void f6(C0SY7 c0sy7) {
        super.f6(c0sy7);
        ITEM item = getItem();
        if (item == null) {
            return;
        }
        C1262090iwp c1262090iwp = item.LLILLL;
        C1261860iwS c1261860iwS = item.LLILZIL;
        if (c1262090iwp.LJJJJJL) {
            a7(c1261860iwS, c1262090iwp);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void h6(C1261650iw7 c1261650iw7) {
        super.h6(c1261650iw7);
        if (C304890BxH.LIZIZ() && c1261650iw7.LIZLLL()) {
            C0N58.LIZ().clear();
            C0N58.LIZIZ().clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void q6(int i) {
        Animator animator;
        int paddingBottom = this.itemView.getPaddingBottom();
        if (paddingBottom != i) {
            Object tag = this.itemView.getTag(R.id.svc);
            if ((tag instanceof Animator) && (animator = (Animator) tag) != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(paddingBottom, i);
            valueAnimatorOfInt.setDuration(340L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS268S0100000_19(this, 22));
            valueAnimatorOfInt.addListener(new ALAdapterS15S0100000_19(this, 3));
            this.itemView.setTag(R.id.svc, valueAnimatorOfInt);
            valueAnimatorOfInt.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void D6(C1262090iwp c1262090iwp, C1261650iw7 c1261650iw7) {
        C19EG c19eg;
        super.D6(c1262090iwp, c1261650iw7);
        if (c1262090iwp.LJJIJ) {
            Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
            Fragment fragmentVQ2 = null;
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                fragmentVQ2 = C486860J7k.LIZIZ(c19eg).vQ2();
            }
            ((RelationButton) this.itemView.findViewById(R.id.t4f)).setRequestListener(new AwS455S0200000_19((RectRecUserCell) this, fragmentVQ2, (Fragment) 14));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void J6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        String str;
        ViewStub viewStub;
        super.J6(c1261860iwS, c1262090iwp);
        MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
        if (matchedFriendStruct != null && (str = matchedFriendStruct.videoItemReason) != null && str.length() != 0) {
            TuxTag tuxTag = null;
            if (0 == 0 && (viewStub = (ViewStub) this.itemView.findViewById(R.id.video_reason_stub)) != null) {
                TuxTag tuxTag2 = (TuxTag) C786410Ut5.LJLLLL(viewStub);
                this.LLJJI = tuxTag2;
                tuxTag2.setText(str);
                TuxTag tuxTag3 = this.LLJJI;
                if (tuxTag3 != null) {
                    tuxTag = tuxTag3;
                }
                C786410Ut5.LJLLLLLL(0, tuxTag);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void L6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        EnumC1606080rte enumC1606080rteLJII;
        boolean z;
        a7(c1261860iwS, c1262090iwp);
        InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJILLL.getValue();
        if (interfaceC1398730mVD != null) {
            enumC1606080rteLJII = interfaceC1398730mVD.LJII();
        } else {
            enumC1606080rteLJII = null;
        }
        if (enumC1606080rteLJII == EnumC1606080rte.INBOX_SUGGESTED_ACCOUNT) {
            if (getSocPubAvatarFrameLayout().getMode() != EnumC1605470rsf.ON && getSocPubAvatarFrameLayout().getMode() != EnumC1605470rsf.OFF) {
                U6().setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
            } else {
                U6().setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
            }
            C1609500rzA socPubAvatarFrameLayout = getSocPubAvatarFrameLayout();
            C447550Hgn.LJFF(socPubAvatarFrameLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))));
            socPubAvatarFrameLayout.setRingStrokeWidthByAvatarSize(52);
            boolean zV6 = V6(c1261860iwS, c1262090iwp);
            if (c1262090iwp.LIZLLL == 201) {
                z = true;
            } else {
                z = false;
            }
            View viewFindViewById = this.itemView.findViewById(R.id.t4f);
            if (c1262090iwp.LJ == 501) {
                if (z && !zV6) {
                    C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
                    C426750GoL.LJIIIZ(viewFindViewById, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, false, 16);
                    return;
                } else {
                    C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
                    C426750GoL.LJIIIZ(viewFindViewById, 0, 0, 0, 0, false, 16);
                    return;
                }
            }
            return;
        }
        switch (c1262090iwp.LIZ) {
            case 100:
                U6().setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                int iB7 = b7(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                C447550Hgn.LJFF(getSocPubAvatarFrameLayout(), Integer.valueOf(iB7), Integer.valueOf(iB7));
                break;
            case 101:
            case 102:
                U6().setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                int iB72 = b7(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                C447550Hgn.LJFF(getSocPubAvatarFrameLayout(), Integer.valueOf(iB72), Integer.valueOf(iB72));
                break;
            case 103:
            case 104:
                U6().setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                int iB73 = b7(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
                C447550Hgn.LJFF(getSocPubAvatarFrameLayout(), Integer.valueOf(iB73), Integer.valueOf(iB73));
                break;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("not supported current variant: ");
                sbLIZ.append(c1262090iwp.LIZ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        Integer num = c1262090iwp.LJIIJ;
        if (num != null) {
            ((TuxTextView) this.itemView.findViewById(R.id.p93)).setTuxFont(num.intValue());
        }
        Typeface typeface = c1262090iwp.LJJIJIIJIL;
        if (typeface != null) {
            ((TuxTextView) this.itemView.findViewById(R.id.p93)).setTypeface(typeface);
        }
        Integer num2 = c1262090iwp.LJJJJIZL;
        if (num2 == null) {
            return;
        }
        ((TuxTextView) this.itemView.findViewById(R.id.t4q)).setTuxFont(num2.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x02a8  */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S6(X.C1261860iwS r20, X.C1262090iwp r21) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell.S6(X.0iwS, X.0iwp):void");
    }

    public final void a7(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        boolean z;
        boolean zV6 = V6(c1261860iwS, c1262090iwp);
        if (c1262090iwp.LIZLLL == 201) {
            z = true;
        } else {
            z = false;
        }
        View viewFindViewById = this.itemView.findViewById(R.id.t4f);
        int i = c1262090iwp.LJ;
        if (i != 501) {
            if (i == 502) {
                C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
            }
        } else if (z && !zV6) {
            C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
        } else {
            C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
        }
    }

    public final int b7(int i, int i2) {
        if (getSocPubAvatarFrameLayout().getMode() == EnumC1605470rsf.NONE) {
            return i2;
        }
        return i;
    }
}
