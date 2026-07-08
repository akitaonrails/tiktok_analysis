package com.ss.android.ugc.aweme.invitation.newdesign.assem;

import X.C019F;
import X.C01GW;
import X.C1231330i9D;
import X.C1231350i9F;
import X.C1231370i9H;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19MB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C898250ZLr;
import X.EnumC1231340i9E;
import X.EnumC994330byx;
import X.InterfaceC2217461Bqa;
import Y.AObserverS223S0100000_19;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMHostApiRelationService;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.publicgroup.data.GroupJoinCheckItemResult;
import com.ss.android.ugc.aweme.publicgroup.data.Placeholder;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitationAccessCriteriaAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupInvitationAccessCriteriaAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/invitation/newdesign/vm/GroupInvitationVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupInvitationAccessCriteriaAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupInvitationVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1570), AFwS257S0000000_19.get$arr$(215), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1569));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1568));
    }

    public final ConstraintLayout Jo() {
        return (ConstraintLayout) this.LLJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EventLiveData<FollowStatus> relationObservable;
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0i8L
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230460i7o) obj).LLILLL;
            }
        }, null, new C1231330i9D(this), 6);
        GroupInvitationVM groupInvitationVM = (GroupInvitationVM) this.LLIZLLLIL.getValue();
        for (GroupJoinCheckItemResult groupJoinCheckItemResult : groupInvitationVM.getState().LLILLL.LIZIZ) {
            if (groupJoinCheckItemResult.checkItemType == EnumC994330byx.GROUP_JOIN_CHECK_ITEM_TYPE_FOLLOW.getValue()) {
                if (groupJoinCheckItemResult != null) {
                    IMHostApiRelationService.LIZ.getClass();
                    IMHostApiRelationService iMHostApiRelationServiceLIZ = C898250ZLr.LIZ();
                    if (iMHostApiRelationServiceLIZ != null && (relationObservable = iMHostApiRelationServiceLIZ.getRelationObservable()) != null) {
                        relationObservable.observe(this, new AObserverS223S0100000_19(groupInvitationVM, 63));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void Ho(ConstraintLayout constraintLayout, GroupJoinCheckItemResult groupJoinCheckItemResult) {
        EnumC1231340i9E enumC1231340i9E;
        TuxIconView tuxIconView = (TuxIconView) constraintLayout.findViewById(R.id.zd);
        TextView textView = (TextView) constraintLayout.findViewById(R.id.zc);
        if (groupJoinCheckItemResult.meetCriteria) {
            tuxIconView.setIconRes(R.raw.icon_tick_fill_small);
            tuxIconView.setTintColorRes(R.attr.a1v);
        } else {
            tuxIconView.setIconRes(R.raw.icon_lock);
            tuxIconView.setTintColorRes(R.attr.a1j);
        }
        String strLJJIFFI = groupJoinCheckItemResult.desc;
        SpannableString spannableString = new SpannableString(groupJoinCheckItemResult.desc);
        if (!groupJoinCheckItemResult.placeHolders.isEmpty()) {
            for (Placeholder placeholder : groupJoinCheckItemResult.placeHolders) {
                String str = placeholder.name;
                if (placeholder.key.length() != 0 && str.length() != 0) {
                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, C786410Ut5.j4("{{%s}}", Arrays.copyOf(new Object[]{placeholder.key}, 1)), str, false);
                    spannableString = new SpannableString(strLJJIFFI);
                    AssemVMLazy assemVMLazy = this.LLIZLLLIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
                    GroupInvitationVM groupInvitationVM = (GroupInvitationVM) assemVMLazy.getValue();
                    View viewLJJIJL = LJJIJL();
                    String str2 = placeholder.name;
                    C1231370i9H c1231370i9H = EnumC1231340i9E.Companion;
                    int i = placeholder.action;
                    c1231370i9H.getClass();
                    EnumC1231340i9E[] enumC1231340i9EArrValues = EnumC1231340i9E.values();
                    int length = enumC1231340i9EArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            enumC1231340i9E = enumC1231340i9EArrValues[i2];
                            if (enumC1231340i9E.getValue() == i) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            enumC1231340i9E = EnumC1231340i9E.CLICK_ACTION_UNKNOWN;
                            break;
                        }
                    }
                    int i3 = C1231350i9F.LIZ[enumC1231340i9E.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    groupInvitationVM.vQ2(viewLJJIJL.getContext(), spannableString, str2, new AwS420S0200000_19(groupInvitationVM, viewLJJIJL, 149));
                                }
                            } else {
                                groupInvitationVM.vQ2(viewLJJIJL.getContext(), spannableString, str2, new AwS420S0200000_19(groupInvitationVM, viewLJJIJL, 148));
                            }
                        } else {
                            groupInvitationVM.vQ2(viewLJJIJL.getContext(), spannableString, str2, new AwS263S0300000_19(viewLJJIJL, placeholder, groupInvitationVM, 19));
                        }
                    } else {
                        groupInvitationVM.vQ2(viewLJJIJL.getContext(), spannableString, str2, new AwS420S0200000_19(groupInvitationVM, viewLJJIJL, 147));
                    }
                }
            }
            textView.setMovementMethod(new LinkMovementMethod());
            textView.setHighlightColor(0);
        }
        textView.setText(spannableString);
    }

    public static void Go(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Integer num) {
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIIZZ(constraintLayout2.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(constraintLayout2.getId(), 7, 0, 7);
        c19mb.LJIILL(constraintLayout2.getId(), 0);
        if (num == null) {
            c19mb.LJIIIZ(constraintLayout2.getId(), 3, R.id.j6y, 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        } else {
            c19mb.LJIIIZ(constraintLayout2.getId(), 3, num.intValue(), 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        c19mb.LIZIZ(constraintLayout);
    }
}
