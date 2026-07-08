package com.ss.android.ugc.aweme.inbox.bulletin.view;

import X.AbstractC1250290idn;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0A1F;
import X.C0C64;
import X.C0DTR;
import X.C0OLV;
import X.C0OM2;
import X.C0OM3;
import X.C0OPQ;
import X.C0PEM;
import X.C1220000hqw;
import X.C1250280idm;
import X.C1251150ifB;
import X.C12ES;
import X.C13LE;
import X.C14EU;
import X.C1548820qPI;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1982307pd;
import X.C2217381BqS;
import X.C23250099c;
import X.C415480GQw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C479910Irt;
import X.C605480Now;
import X.C617220OIu;
import X.C638910P4f;
import X.C639100P4y;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC311470CIv;
import X.EnumC617010OHz;
import X.EnumC617060OIe;
import X.EnumC618000OLu;
import X.EnumC619900OTc;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS25S0110000_6;
import Y.ARunnableS9S0210000_6;
import Y.AUListenerS216S0200000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinAutoPlayViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBubbleStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseBulletinBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final AssemVMLazy LLJI;
    public TuxNavBar LLJIJIL;
    public C0OM2 LLJILJIL;
    public C0OM3 LLJILJILJ;
    public int LLJILLL;
    public String LLJJ;
    public int LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public BulletinBubbleStruct LLJJIJIIJIL;
    public View LLJJIJIL;
    public C617220OIu LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public int LLJJJJLIIL;
    public Boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C415480GQw LLJL;
    public ValueAnimator LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public boolean LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseBulletinBarAssem.class, "playStateVM", "getPlayStateVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinAutoPlayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public BaseBulletinBarAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 517);
        this.LLJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(317), new AwS553S0100000_9((AbstractC738140SxQ) this, 520), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinAutoPlayViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 519), AFwS240S0000000_9.get$arr$(316), null, true);
        this.LLJILLL = EnumC618000OLu.BAR_ENTRANCE_TYPE_UNKNOWN.getType();
        this.LLJJI = EnumC311470CIv.BAR_ENTRANCE_REFRESH_TYPE_NONE.getType();
        this.LLJJIII = C452501pT.LIZIZ(new AwS553S0100000_9(this, 514));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 515));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 516));
        this.LLJLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 513));
    }

    public final C415480GQw Jo() {
        ImageView imageView;
        Drawable drawable;
        TuxIconDrawable tuxIconDrawable;
        Integer num;
        C415480GQw c415480GQw = this.LLJL;
        if (c415480GQw != null) {
            return c415480GQw;
        }
        View view = this.LLJJIJIL;
        if (!(view instanceof TuxIconView) || (imageView = (ImageView) view) == null) {
            return null;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width == 0 || height == 0 || (drawable = imageView.getDrawable()) == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            float f = imageView.getContext().getResources().getDisplayMetrics().density;
            int iIntValue = (!(drawable instanceof TuxIconDrawable) || (tuxIconDrawable = (TuxIconDrawable) drawable) == null || (num = tuxIconDrawable.LJIILL) == null) ? -16777216 : num.intValue();
            int i = (width - intrinsicWidth) / 2;
            int i2 = (height - intrinsicHeight) / 2;
            C415480GQw c415480GQw2 = new C415480GQw(f, iIntValue);
            c415480GQw2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            imageView.getOverlay().add(c415480GQw2);
            this.LLJL = c415480GQw2;
            return c415480GQw2;
        }
        return null;
    }

    public final C0OLV Lo() {
        return (C0OLV) this.LLIZLLLIL.getValue();
    }

    public final BulletinProfileViewModel No() {
        return (BulletinProfileViewModel) this.LLJ.getValue();
    }

    public final BulletinTooltipAbility Oo() {
        return (BulletinTooltipAbility) this.LLJJIII.getValue();
    }

    public final void So() {
        if (C0A1F.LIZ()) {
            TuxNavBar tuxNavBar = this.LLJIJIL;
            View viewLJII = tuxNavBar != null ? tuxNavBar.LJII("bulletin_info_bar_entrance") : null;
            C0OM2 c0om2 = viewLJII instanceof C0OM2 ? (C0OM2) viewLJII : null;
            this.LLJILJIL = c0om2;
            if (c0om2 != null) {
                c0om2.LIZ();
            }
        }
        if (!C1982307pd.LIZIZ()) {
            TuxNavBar tuxNavBar2 = this.LLJIJIL;
            View viewLJII2 = tuxNavBar2 != null ? tuxNavBar2.LJII("bulletin_info_bar_icon_entrance") : null;
            C0OM3 c0om3 = viewLJII2 instanceof C0OM3 ? (C0OM3) viewLJII2 : null;
            this.LLJILJILJ = c0om3;
            if (c0om3 != null) {
                C0DTR.LIZIZ(c0om3);
            }
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "bb_home_mute_button_visible", true, false)) {
            TuxNavBar tuxNavBar3 = this.LLJIJIL;
            View viewLJII3 = tuxNavBar3 != null ? tuxNavBar3.LJII("bulletin_mute_button") : null;
            this.LLJJIJIL = viewLJII3;
            if (viewLJII3 != null) {
                C0DTR.LIZIZ(viewLJII3);
            }
        }
    }

    public final void Zo() {
        if (C1982307pd.LIZIZ()) {
            BulletinTooltipAbility bulletinTooltipAbilityOo = Oo();
            if (bulletinTooltipAbilityOo != null) {
                bulletinTooltipAbilityOo.WK0(EnumC619900OTc.ANALYTICS_TOOLTIP);
            }
            C736680Sv4.LJIIIZ(this, No(), new C2217381BqS() { // from class: X.0OLv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLJJIJI;
                }
            }, new C2217381BqS() { // from class: X.0OLr
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLIZLLLIL;
                }
            }, null, new AwS658S0100000_9(this, 8), 12);
            return;
        }
        BulletinProfileViewModel bulletinProfileViewModelNo = No();
        selectSubscribe(bulletinProfileViewModelNo, new C2217381BqS() { // from class: X.0OLw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJIJI;
            }
        }, new C2217381BqS() { // from class: X.0OLZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJIJIIJIL;
            }
        }, new C2217381BqS() { // from class: X.0OLs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLIZLLLIL;
            }
        }, new C2217381BqS() { // from class: X.0OLt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZIZ(bulletinProfileViewModelNo.usedInReusedScene), null, new C639100P4y(this, 0));
    }

    public final void ap() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "bb_home_mute_button_visible", true, false)) {
            C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OKm
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLJJ;
                }
            }, null, new AwS623S0100000_9(this, 64), 6);
            AssemViewModel.asyncSubscribe$default(No(), new C2217381BqS() { // from class: X.0OLp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLILLJJLI;
                }
            }, this, null, null, null, new AwS588S0100000_9(this, 184), 28, null);
            C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OKp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLILLL;
                }
            }, null, new AwS623S0100000_9(this, 65), 6);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C1548820qPI.LIZLLL("bulletin_analysis_tooltip_js_event", (C638910P4f) this.LLJLILLLLZIIL.getValue());
        C1548820qPI.LIZLLL("bulletin_tooltip_js_event", (C638910P4f) this.LLJLL.getValue());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.LLJLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C1548820qPI.LJIIIIZZ("bulletin_analysis_tooltip_js_event", (C638910P4f) this.LLJLILLLLZIIL.getValue());
        C1548820qPI.LJIIIIZZ("bulletin_tooltip_js_event", (C638910P4f) this.LLJLL.getValue());
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C0OM2 c0om2;
        super.onPause();
        if (C0A1F.LIZ() && this.LLJILLL == EnumC618000OLu.BAR_ENTRANCE_TYPE_LIVE.getType() && (c0om2 = this.LLJILJIL) != null) {
            c0om2.getBulletinPageBarEntranceLiveIconFromXml().LIZIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C0OM2 c0om2;
        BulletinProfileViewModel bulletinProfileViewModelNo;
        Long l;
        super.onResume();
        if (C0A1F.LIZ()) {
            if (this.LLJJI == EnumC311470CIv.BAR_ENTRANCE_REFRESH_TYPE_APPEAR.getType() && (l = (bulletinProfileViewModelNo = No()).LLILLJJLI) != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinProfileViewModelNo), C0PEM.LIZJ, null, new C605480Now(bulletinProfileViewModelNo, l.longValue(), null), 2);
            }
            if (this.LLJILLL != EnumC618000OLu.BAR_ENTRANCE_TYPE_LIVE.getType() || (c0om2 = this.LLJILJIL) == null) {
                return;
            }
            c0om2.getBulletinPageBarEntranceLiveIconFromXml().LJFF();
        }
    }

    public void Go(int i) {
        this.LLJJJJLIIL = i;
    }

    public final void Ho(boolean z) {
        TuxIconView tuxIconView;
        int iIntValue;
        float f;
        TuxIconDrawable tuxIconDrawable;
        Integer num;
        ValueAnimator valueAnimator = this.LLJLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.LLJJIJIL;
        if ((view instanceof TuxIconView) && (tuxIconView = (TuxIconView) view) != null) {
            C415480GQw c415480GQwJo = Jo();
            if (c415480GQwJo == null) {
                HandlerHook.viewPost(tuxIconView, new ARunnableS25S0110000_6(this, z, 0));
                return;
            }
            Drawable drawable = tuxIconView.getDrawable();
            if ((drawable instanceof TuxIconDrawable) && (tuxIconDrawable = (TuxIconDrawable) drawable) != null && (num = tuxIconDrawable.LJIILL) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -16777216;
            }
            c415480GQwJo.LIZ = iIntValue;
            float f2 = c415480GQwJo.LIZIZ;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (f2 == f) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS216S0200000_6(c415480GQwJo, tuxIconView, 2));
            valueAnimatorOfFloat.start();
            this.LLJLIL = valueAnimatorOfFloat;
        }
    }

    public final void cp(EnumC617060OIe enumC617060OIe) {
        boolean z;
        boolean z2;
        String str;
        View view;
        if (No().JQ2() == EnumC617010OHz.CHANNEL_SUBSCRIBED.getStatus()) {
            z = true;
        } else {
            z = false;
        }
        if (enumC617060OIe != EnumC617060OIe.IDENTITY_CREATOR && z) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = this.LLJJJJ;
        if (z2 || (!this.LLJJLIIIJLLLLLLLZ && this.LLJJL == null)) {
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                C0DTR.LIZIZ(view2);
            }
            this.LLJJJJ = false;
        } else {
            if (!z3 && this.LLJJL == null && (view = this.LLJJIJIL) != null) {
                C786410Ut5.T4(view, 0.0f);
            }
            View view3 = this.LLJJIJIL;
            if (view3 != null) {
                C12ES.LJIILL(0, view3);
            }
            this.LLJJJJ = true;
            bp(this.LLJJJIL, false);
            if (!this.LLJJJJJIL) {
                this.LLJJJJJIL = true;
                C0OPQ c0opq = C0OPQ.LIZ;
                C0OLV c0olvLo = Lo();
                if (c0olvLo == null || (str = c0olvLo.LL) == null) {
                    str = "";
                }
                boolean z4 = this.LLJJJIL;
                c0opq.getClass();
                C0OPQ.LJJIIJ(z4 ? 1 : 0, "show", str);
            }
        }
        if (z3 != this.LLJJJJ) {
            int i = this.LLJJJJLIIL;
            if (i > 0) {
                Go(i);
                return;
            }
            View view4 = this.LLJJIJIL;
            if (view4 == null) {
                return;
            }
            HandlerHook.viewPost(view4, new ARunnableS109S0100000_9(this, 90));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveStatusChange(C479910Irt c479910Irt) {
        if (c479910Irt.LIZJ) {
            BulletinProfileViewModel bulletinProfileViewModelNo = No();
            bulletinProfileViewModelNo.getClass();
            bulletinProfileViewModelNo.setState(AFwS240S0000000_9.get$arr$(848));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TuxNavBar tuxNavBar;
        super.onViewCreated(view);
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof TuxNavBar) {
            tuxNavBar = (TuxNavBar) viewLJJIJL;
        } else {
            tuxNavBar = null;
        }
        this.LLJIJIL = tuxNavBar;
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OLx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618040OLy) obj).LLILLJJLI;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 185), 28, null);
        AssemViewModel.asyncSubscribe$default(No(), new C2217381BqS() { // from class: X.0OLq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILLJJLI;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 186), 28, null);
    }

    public final void Vo(Context context, List<AbstractC1250290idn> list) {
        if (C0A1F.LIZ()) {
            C1250280idm c1250280idm = new C1250280idm();
            c1250280idm.LIZJ = new C0OM2(context);
            c1250280idm.LIZLLL = true;
            c1250280idm.LIZIZ = "bulletin_info_bar_entrance";
            ((ArrayList) list).add(c1250280idm);
        }
        if (!C1982307pd.LIZIZ()) {
            C1250280idm c1250280idm2 = new C1250280idm();
            c1250280idm2.LIZJ = new C0OM3(context);
            c1250280idm2.LIZLLL = true;
            c1250280idm2.LIZIZ = "bulletin_info_bar_icon_entrance";
            ((ArrayList) list).add(c1250280idm2);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "bb_home_mute_button_visible", true, false)) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_bell;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZIZ = "bulletin_mute_button";
            c1251150ifB.LIZJ(new AwS553S0100000_9(this, 518));
            ((ArrayList) list).add(c1251150ifB);
        }
    }

    public final void bp(boolean z, boolean z2) {
        if (Intrinsics.LJFF(this.LLJJL, Boolean.valueOf(z))) {
            return;
        }
        this.LLJJL = Boolean.valueOf(z);
        if (z2) {
            Ho(z);
            return;
        }
        ValueAnimator valueAnimator = this.LLJLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.LLJJIJIL;
        if (view == null || view.getParent() == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS9S0210000_6(this, view, z, 0));
    }
}
