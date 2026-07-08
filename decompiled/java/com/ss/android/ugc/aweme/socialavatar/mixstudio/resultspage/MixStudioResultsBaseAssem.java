package com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage;

import X.AbstractC440540HPg;
import X.AnonymousClass0951;
import X.C019F;
import X.C01GW;
import X.C05YD;
import X.C0HGY;
import X.C0HKU;
import X.C0HQR;
import X.C0HSG;
import X.C0ZP4;
import X.C1308910kAL;
import X.C1372505Yt;
import X.C1372805Yw;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1910890zpH;
import X.C197039127h;
import X.C19719912Dl;
import X.C20642515q3;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C435650H6l;
import X.C440370HOp;
import X.C440830HQj;
import X.C440930HQt;
import X.C441660HTo;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1910860zpE;
import X.EnumC440380HOq;
import X.EnumC440390HOr;
import X.EnumC440890HQp;
import X.EnumC440980HQy;
import X.EnumC441640HTm;
import X.InterfaceC2217461Bqa;
import X.InterfaceC440090HNn;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import irm.AkS52S0200000_6;
import irm.AkS78S0100000_6;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0001000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MixStudioResultsBaseAssem extends MixStudioPageAssem {
    public static final C0HQR LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final C1910890zpH LLLII;
    public static final String LLLIIII;
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 633));
    public boolean LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public C197039127h LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public C0ZP4 LLLF;
    public C0ZP4 LLLFF;
    public final EnumC440890HQp LLLFFI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0HQR] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixStudioResultsBaseAssem.class, "resultsVM", "getResultsVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/resultspage/MixStudioResultsPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFZ = new Object() { // from class: X.0HQR
        };
        LLLII = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.SOCIAL_AVATAR);
        LLLIIII = "MixStudioResultsPageAssem";
    }

    public MixStudioResultsBaseAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioResultsPageViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 634), AFwS236S0000000_6.get$arr$(325), null, true);
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(285));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 632));
        this.LLJJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(280));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(281));
        this.LLJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(282));
        this.LLJLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(286));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(287));
        this.LLJLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(284));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(283));
        this.LLJLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(288));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 631));
        this.LLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 630));
        this.LLLFFI = EnumC440890HQp.RESULTS;
    }

    public abstract void Bp(List<C440830HQj> list, boolean z);

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    public abstract void Gp();

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public void LLFF() {
        C05YD<List<C440830HQj>> c05ydLJFF;
        List<C440830HQj> value;
        C440830HQj c440830HQj;
        StickerItem stickerItem;
        StickerBase stickerBase;
        C05YD<List<C440830HQj>> c05ydLJFF2;
        List<C440830HQj> value2;
        C05YD<AbstractC440540HPg> taskStatus;
        MixStudioStatusRepository mixStudioStatusRepositoryUp = up();
        AbstractC440540HPg value3 = (mixStudioStatusRepositoryUp == null || (taskStatus = mixStudioStatusRepositoryUp.getTaskStatus()) == null) ? null : taskStatus.getValue();
        MixStudioStatusRepository mixStudioStatusRepositoryUp2 = up();
        Integer numValueOf = (mixStudioStatusRepositoryUp2 == null || (c05ydLJFF2 = mixStudioStatusRepositoryUp2.LJFF()) == null || (value2 = c05ydLJFF2.getValue()) == null) ? null : Integer.valueOf(value2.size());
        int i = tp().getState().LLILLL;
        InterfaceC440090HNn interfaceC440090HNnOp = op();
        MixStudioStatusRepository mixStudioStatusRepositoryUp3 = up();
        Long l = (mixStudioStatusRepositoryUp3 == null || (c05ydLJFF = mixStudioStatusRepositoryUp3.LJFF()) == null || (value = c05ydLJFF.getValue()) == null || (c440830HQj = (C440830HQj) C13LP.LJJJLZIJ(i, value)) == null || (stickerItem = c440830HQj.LIZ) == null || (stickerBase = stickerItem.stickerBase) == null) ? null : stickerBase.id;
        if (interfaceC440090HNnOp != null && value3 != null && numValueOf != null && l != null) {
            long jLongValue = l.longValue();
            int iIntValue = numValueOf.intValue();
            C440370HOp c440370HOp = C440370HOp.LIZ;
            EnumC441640HTm enumC441640HTmVQ2 = hp().vQ2();
            EnumC440380HOq enumC440380HOq = hp().getState().LLILLL;
            boolean zIsNewUser = hp().isNewUser();
            c440370HOp.getClass();
            C0HGY c0hgyLJIILIIL = C440370HOp.LJIILIIL(interfaceC440090HNnOp);
            String strLJIIL = C440370HOp.LJIIL(interfaceC440090HNnOp);
            EnumC440390HOr enumC440390HOrLJIILJJIL = C440370HOp.LJIILJJIL(value3);
            String strValueOf = String.valueOf(jLongValue);
            FriendsIDInfo friendsIDInfo = hp().wQ2().LLJ;
            String str = friendsIDInfo != null ? friendsIDInfo.chatType : null;
            String strLIZLLL = tp().xQ2().LIZLLL();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C441660HTo.LIZ(c2344009Gk, enumC441640HTmVQ2);
            c2344009Gk.LJIIIIZZ("enter_method", enumC440380HOq.getParam());
            c2344009Gk.LIZJ(zIsNewUser ? 1 : 0, "is_new_user");
            c2344009Gk.LJIIIIZZ("element", c0hgyLJIILIIL.getParam());
            c2344009Gk.LJIIIIZZ("panel_status", enumC440390HOrLJIILJJIL.getParam());
            c2344009Gk.LJIIIIZZ("sticker_id", strValueOf);
            c2344009Gk.LIZJ(iIntValue, "sticker_cnt");
            if (strLJIIL != null) {
                c2344009Gk.LJFF("element_id", strLJIIL);
            }
            if (str != null) {
                c2344009Gk.LJFF("chat_type", str);
            }
            if (strLIZLLL != null) {
                c2344009Gk.LJFF("selected_id", strLIZLLL);
            }
            C20684815ws.LJIILLIIL("imagine_studio_enter_result_panel", c2344009Gk.LIZ);
        }
        if ((tp().xQ2() instanceof C1372805Yw) && (((AnonymousClass0951) new C0HKU(ViewModelKt.getViewModelScope(tp())).getState()).getValue() instanceof C1372505Yt) && hp().getState().LLILLL != EnumC440380HOq.GENERATION_HISTORY) {
            C0HSG.LIZ.getClass();
            C0HSG.LIZIZ().storeInt("generate_mix_sticker_without_social_avatar", C0HSG.LIZIZ().getInt("generate_mix_sticker_without_social_avatar", 0) + 1);
        }
        MixStudioResultsPageViewModel mixStudioResultsPageViewModelTp = tp();
        mixStudioResultsPageViewModelTp.withState(new AwS585S0100000_6(mixStudioResultsPageViewModelTp, 340));
        this.LLLF = C736680Sv4.LJIIIZ(this, tp(), new C2217381BqS() { // from class: X.0HQP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HQU) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0HQM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0HQU) obj).LLILLJJLI);
            }
        }, null, new AwS655S0100000_6(this, 5), 12);
        this.LLLFF = C736680Sv4.LJIIIZ(this, tp(), new C2217381BqS() { // from class: X.0HQQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HQU) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0HQL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0HQU) obj).LLILLL);
            }
        }, null, new AwS655S0100000_6(this, 6), 12);
        this.LLJJJIL = false;
    }

    public final int kp() {
        return ((Number) this.LLJJL.getValue()).intValue();
    }

    public final LinearLayout lp() {
        return (LinearLayout) this.LLL.getValue();
    }

    public final int mp() {
        return ((Number) this.LLJLIL.getValue()).intValue();
    }

    public final InterfaceC440090HNn op() {
        return (InterfaceC440090HNn) this.LLJJJJLIIL.getValue();
    }

    public final C440930HQt sp() {
        return (C440930HQt) this.LLJJJ.getValue();
    }

    public final MixStudioResultsPageViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        return (MixStudioResultsPageViewModel) assemVMLazy.getValue();
    }

    public final MixStudioStatusRepository up() {
        return (MixStudioStatusRepository) this.LLJJJJJIL.getValue();
    }

    public final LinearLayout yp() {
        return (LinearLayout) this.LLJZIJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public void onPagePause() {
        Gp();
        C0ZP4 c0zp4 = this.LLLF;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        C0ZP4 c0zp42 = this.LLLFF;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
        MixStudioResultsPageViewModel mixStudioResultsPageViewModelTp = tp();
        if (mixStudioResultsPageViewModelTp.yQ2().LLIZLLLIL.isInDM()) {
            ((AssemViewModel) mixStudioResultsPageViewModelTp.LLILLL.getValue()).setState(new AwS21S0001000_6(16));
        }
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public void xo() {
        Zo(yp());
        super.xo();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final EnumC440890HQp ip() {
        return this.LLLFFI;
    }

    public final void Ep(EnumC440980HQy enumC440980HQy) {
        tp().BQ2(enumC440980HQy, hp().vQ2(), hp().getState().LLILLL, hp().isNewUser());
    }

    public final View Fp(Context context) {
        int iIntValue;
        int iIntValue2;
        AttributeSet attributeSet = null;
        int i = 6;
        int i2 = 0;
        C197039127h c197039127h = new C197039127h(context, attributeSet, i, i2);
        c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_down_to_line));
        c197039127h.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h.setButtonVariant(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c197039127h.setBackgroundColor(iIntValue);
        C786410Ut5.I7(new AkS78S0100000_6(this, 9), c197039127h);
        C197039127h c197039127h2 = new C197039127h(context, attributeSet, i, i2);
        c197039127h2.setButtonVariant(1);
        c197039127h2.setButtonStartIcon(Integer.valueOf(R.raw.icon_paperplane_fill));
        String strLJI = C20642515q3.LJI(2131835867);
        SpannableString spannableString = new SpannableString(strLJI);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e1, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue2), 0, strLJI.length(), 33);
        c197039127h2.setText(spannableString);
        c197039127h2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h2.setIconTintColorRes(R.attr.e1);
        C786410Ut5.I7(new AkS78S0100000_6(this, 10), c197039127h2);
        c197039127h2.LJJJJL(new AwS372S0200000_6(context, this, 30));
        C197039127h c197039127h3 = new C197039127h(context, attributeSet, i, i2);
        c197039127h3.setButtonStartIcon(Integer.valueOf(R.raw.icon_star));
        c197039127h3.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h3.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h3.setButtonVariant(1);
        C786410Ut5.I7(new AkS52S0200000_6(c197039127h3, this, 2), c197039127h3);
        this.LLJZ = c197039127h3;
        C197039127h c197039127h4 = new C197039127h(context, attributeSet, i, i2);
        c197039127h4.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_turn_up_right));
        c197039127h4.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h4.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c197039127h4.setButtonVariant(1);
        C786410Ut5.I7(new AkS52S0200000_6(context, this, 3), c197039127h4);
        if (tp().yQ2().LLIZLLLIL.isFromStory()) {
            c197039127h2 = new C197039127h(context, attributeSet, i, i2);
            c197039127h2.setText(C20642515q3.LJI(2131849125));
            c197039127h2.setButtonVariant(1);
            c197039127h2.setTextColorRes(R.attr.e1);
            C786410Ut5.I7(new AkS52S0200000_6(context, this, 4), c197039127h2);
            c197039127h2.LJJJJL(new AwS372S0200000_6(context, this, 29));
            C440370HOp c440370HOp = C440370HOp.LIZ;
            String str = hp().wQ2().LLJI;
            c440370HOp.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("enter_method", "mix_studio_share_panel");
            C20684815ws.LJIILLIIL("share_to_story_show", c2344009Gk.LIZ);
        }
        LinearLayout linearLayoutLp = lp();
        C197039127h c197039127h5 = this.LLJZ;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        linearLayoutLp.addView(c197039127h5, layoutParams);
        LinearLayout linearLayoutLp2 = lp();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), 1.0f);
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        linearLayoutLp2.addView(c197039127h2, layoutParams2);
        LinearLayout linearLayoutLp3 = lp();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        layoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        linearLayoutLp3.addView(c197039127h4, layoutParams3);
        return lp();
    }

    public final FrameLayout zp(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_chevron_left_ltr);
        tuxIconView.setIconWidth(kp());
        tuxIconView.setIconHeight(kp());
        tuxIconView.setTintColorRes(R.attr.a1h);
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 71));
        frameLayout.addView(tuxIconView, C435650H6l.LIZ(kp(), kp(), 0, ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue(), ((Number) this.LLJL.getValue()).intValue(), 204));
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView2.setIconRes(R.raw.icon_x_mark);
        tuxIconView2.setIconWidth(mp());
        tuxIconView2.setIconHeight(mp());
        tuxIconView2.setTintColorRes(R.attr.a1h);
        C786410Ut5.a9(tuxIconView2, new ACListenerS141S0100000_6(this, 72));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mp(), mp(), 8388661);
        layoutParams.topMargin = ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
        layoutParams.setMarginEnd(((Number) this.LLJLL.getValue()).intValue());
        frameLayout.addView(tuxIconView2, layoutParams);
        return frameLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r1.contains(r3) == true) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ap(int r5, java.util.List r6) {
        /*
            r4 = this;
            int r0 = r6.size()
            if (r5 >= r0) goto L48
            if (r5 < 0) goto L48
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r6)
            X.0HQj r0 = (X.C440830HQj) r0
            r3 = 0
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.im.common.model.StickerItem r2 = r0.LIZ
            if (r2 == 0) goto L19
            java.lang.Long r0 = r2.favoriteTime
            if (r0 != 0) goto L3a
        L19:
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository r0 = r4.up()
            if (r0 == 0) goto L49
            X.0WQx r1 = r0.LIZLLL()
            if (r1 == 0) goto L49
            if (r2 == 0) goto L33
            com.ss.android.ugc.aweme.im.common.model.StickerBase r0 = r2.stickerBase
            if (r0 == 0) goto L33
            java.lang.Long r0 = r0.id
            if (r0 == 0) goto L33
            java.lang.String r3 = r0.toString()
        L33:
            boolean r1 = r1.contains(r3)
            r0 = 1
            if (r1 != r0) goto L49
        L3a:
            X.127h r1 = r4.LLJZ
            if (r1 == 0) goto L48
            r0 = 2130774733(0x7f010acd, float:1.715265E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setButtonStartIcon(r0)
        L48:
            return
        L49:
            X.127h r1 = r4.LLJZ
            if (r1 == 0) goto L48
            r0 = 2130774732(0x7f010acc, float:1.7152647E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setButtonStartIcon(r0)
            return
        L58:
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem.Ap(int, java.util.List):void");
    }
}
