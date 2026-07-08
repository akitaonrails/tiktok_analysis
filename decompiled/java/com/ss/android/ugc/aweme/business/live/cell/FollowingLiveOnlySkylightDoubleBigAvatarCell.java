package com.ss.android.ugc.aweme.business.live.cell;

import X.C01GW;
import X.C0I9C;
import X.C0IVT;
import X.C1243240iSQ;
import X.C1322110kVd;
import X.C1597740rgC;
import X.C1597850rgN;
import X.C1607470rvt;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C1720106oR;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C294120Bfu;
import X.C341940Daq;
import X.C418440Gaw;
import X.C426750GoL;
import X.C444960Hcc;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1605560rso;
import X.EnumC1610470s0j;
import X.InterfaceC1891350zJl;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingLiveOnlySkylightDoubleBigAvatarCell extends BaseFollowingLiveOnlySkylightCell<C1597850rgN> {
    public C1610740s1A LLJILJILJ;
    public C1610740s1A LLJILLL;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 170));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 165));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 164));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 171));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 169));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 168));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 172));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 167));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 166));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 163));
    public final EnumC1605560rso LLJJ = EnumC1605560rso.MUTE_LIVES;
    public final Map<String, String> LLJJI = C2097608Jq.LJ();

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c7x;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    public final View Hy1() {
        return (View) this.LLILZ.getValue();
    }

    public final C1322110kVd a6() {
        return (C1322110kVd) this.LLILZIL.getValue();
    }

    public final View b6() {
        return (View) this.LLILLL.getValue();
    }

    public final TuxTextView c6() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup viewGroup;
        super.onItemViewCreated();
        if (C1607470rvt.LIZ().followingSkyFixVersion <= 0) {
            View viewB6 = b6();
            if ((viewB6 instanceof ConstraintLayout) && (viewGroup = (ViewGroup) viewB6) != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.LLJILJIL.getValue();
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
        }
        View view = (View) this.LLJI.getValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        layoutParams.height += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C786410Ut5.W5(view, layoutParams);
        C426750GoL.LJIIL(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), 16);
        View view2 = (View) this.LLJIJIL.getValue();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        layoutParams2.height += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C786410Ut5.W5(view2, layoutParams2);
        C426750GoL.LJIIL(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), 16);
        C1322110kVd c1322110kVdA6 = a6();
        ViewGroup.LayoutParams layoutParams3 = a6().getLayoutParams();
        Integer numValueOf = Integer.valueOf((layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        ViewGroup.LayoutParams layoutParams4 = a6().getLayoutParams();
        Integer numValueOf2 = Integer.valueOf((!(layoutParams4 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4) == null) ? 0 : marginLayoutParams2.topMargin);
        ViewGroup.LayoutParams layoutParams5 = a6().getLayoutParams();
        Integer numValueOf3 = Integer.valueOf(layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd() : 0);
        ViewGroup.LayoutParams layoutParams6 = a6().getLayoutParams();
        C426750GoL.LJIIIZ(c1322110kVdA6, numValueOf, numValueOf2, numValueOf3, Integer.valueOf((!(layoutParams6 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6) == null) ? 0 : marginLayoutParams.bottomMargin), false, 16);
        EnumC1610470s0j enumC1610470s0j = EnumC1610470s0j.SKYLIGHT;
        this.LLJILJILJ = new C1610740s1A(enumC1610470s0j, (View) this.LLILZ.getValue(), (View) this.LLILZ.getValue(), (C1610770s1D) this.LLJI.getValue());
        C1610740s1A c1610740s1A = new C1610740s1A(enumC1610470s0j, a6(), a6(), (C1610770s1D) this.LLJIJIL.getValue());
        this.LLJILLL = c1610740s1A;
        C1610740s1A c1610740s1A2 = this.LLJILJILJ;
        if (c1610740s1A2 != null) {
            c1610740s1A2.LJIIIIZZ = false;
        }
        c1610740s1A.LJIIIIZZ = false;
        TuxTextView tuxTextViewC6 = c6();
        if (!(tuxTextViewC6 instanceof TuxTextView) || tuxTextViewC6 == null) {
            return;
        }
        tuxTextViewC6.setTuxFont(82);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        super.onPause();
        C1610740s1A c1610740s1A = this.LLJILJILJ;
        if (c1610740s1A != null) {
            c1610740s1A.Ir();
        }
        C1610740s1A c1610740s1A2 = this.LLJILLL;
        if (c1610740s1A2 != null) {
            c1610740s1A2.Ir();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1610740s1A c1610740s1A = this.LLJILJILJ;
        if (c1610740s1A != null) {
            c1610740s1A.LIZ();
        }
        C1610740s1A c1610740s1A2 = this.LLJILLL;
        if (c1610740s1A2 != null) {
            c1610740s1A2.LIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1610740s1A c1610740s1A = this.LLJILJILJ;
        if (c1610740s1A != null) {
            c1610740s1A.LJIIJ();
        }
        C1610740s1A c1610740s1A2 = this.LLJILLL;
        if (c1610740s1A2 != null) {
            c1610740s1A2.LJIIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return this.LLJJI;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        List<com.bytedance.android.live.base.model.user.User> list;
        com.bytedance.android.live.base.model.user.User user;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user2;
        super.onBindItemView(interfaceC1891350zJl);
        interfaceC1891350zJl.getClass();
        C1597740rgC.LIZ.getClass();
        SlimRoom slimRoomLJII = C1597740rgC.LJII(null);
        if (slimRoomLJII != null) {
            C786410Ut5.Ob(this.itemView, 1.0f);
            C786410Ut5.pc(this.itemView, 1.0f);
            if (C294120Bfu.LIZJ()) {
                C426750GoL.LJIIIZ(c6(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19))), false, 16);
                ((C1610770s1D) this.LLJI.getValue()).setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
                ((C1610770s1D) this.LLJIJIL.getValue()).setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
            }
            if (slimRoomLJII.getLinkMic().followedList.size() >= 2) {
                SlimRoom.LinkMic linkMic = slimRoomLJII.getLinkMic();
                if (linkMic != null && (list2 = linkMic.followedList) != null && (user2 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list2, 0)) != null) {
                    C0I9C.LIZ(a6(), user2.getAvatarThumb());
                    TuxTextView tuxTextViewC6 = c6();
                    C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                    String username = user2.getUsername();
                    String nickName = user2.getNickName();
                    c1243240iSQ.getClass();
                    tuxTextViewC6.setText(C1243240iSQ.LIZLLL(username, nickName));
                    boolean zLIZLLL = C1597740rgC.LIZLLL();
                    ViewGroup.LayoutParams layoutParams = ((View) this.LLIZ.getValue()).getLayoutParams();
                    if (zLIZLLL) {
                        layoutParams.width = C341940Daq.LIZ(80);
                    } else {
                        layoutParams.width = C341940Daq.LIZ(72);
                    }
                    C786410Ut5.W5((View) this.LLIZ.getValue(), layoutParams);
                    if (C1597740rgC.LJ()) {
                        c6().setTuxFont(71);
                        ((TuxTextView) this.LLJ.getValue()).setTuxFont(71);
                    } else {
                        c6().setTuxFont(72);
                        ((TuxTextView) this.LLJ.getValue()).setTuxFont(72);
                    }
                }
                SlimRoom.LinkMic linkMic2 = slimRoomLJII.getLinkMic();
                if (linkMic2 != null && (list = linkMic2.followedList) != null && (user = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 1)) != null) {
                    C0I9C.LIZ((C1322110kVd) this.LLILZ.getValue(), user.getAvatarThumb());
                }
            }
            TuxTextView tuxTextView = (TuxTextView) this.LLJ.getValue();
            if (slimRoomLJII.getLinkMic().followedCount > 1) {
                if (C444960Hcc.LIZIZ()) {
                    TextView textView = (TextView) this.LLJ.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(slimRoomLJII.getLinkMic().followedCount - 1);
                    sbLIZ.append('+');
                    textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    TextView textView2 = (TextView) this.LLJ.getValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('+');
                    sbLIZ2.append(slimRoomLJII.getLinkMic().followedCount - 1);
                    textView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            W5((TextView) this.LLIZLLLIL.getValue());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b6().getLayoutParams();
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.height = C341940Daq.LIZ(130);
            if (getPosition() == 0) {
                marginLayoutParams.width = C341940Daq.LIZ(96);
                b6().setPaddingRelative(0, 0, 0, 0);
            } else {
                marginLayoutParams.width = C341940Daq.LIZ(88);
                b6().setPaddingRelative(0, 0, 0, 0);
            }
            C786410Ut5.W5(b6(), marginLayoutParams);
            C2271391DvN.LIZ(b6(), C2271381DvM.LIZ());
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 104), b6());
            C1610740s1A c1610740s1A = this.LLJILJILJ;
            if (c1610740s1A != null) {
                c1610740s1A.LJFF(null, FollowingLiveOnlySkylightDoubleBigAvatarCell.class, null, null, null);
            }
            C1610740s1A c1610740s1A2 = this.LLJILLL;
            if (c1610740s1A2 != null) {
                c1610740s1A2.LJFF(null, FollowingLiveOnlySkylightDoubleBigAvatarCell.class, null, null, null);
            }
            try {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().T8(C0IVT.LIZ("homepage_follow", "live_cover", C1597740rgC.LJII(null)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LIZJ("FollowLiveSkyLightDoubleBigHeaderViewHolder", e);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        C1610740s1A c1610740s1A = this.LLJILJILJ;
        if (c1610740s1A != null) {
            c1610740s1A.xs();
        }
        C1610740s1A c1610740s1A2 = this.LLJILLL;
        if (c1610740s1A2 != null) {
            c1610740s1A2.xs();
        }
    }
}
