package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.AbstractC1906720ziY;
import X.AbstractC2211791BhR;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03H5;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0H1U;
import X.C0H9H;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1326790kdB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C1738910vLt;
import X.C1750690vet;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19ME;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426770GoN;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C801270Vbx;
import X.EnumC1338240kve;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerConversationViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.StoreSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes34.dex */
public final class SellerConversationViewHolder extends PowerCell<C1750690vet> implements InterfaceC724530SbT, C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C426770GoN LLILZ;
    public TuxTextView LLILZIL;
    public LinearLayout LLILZLL;
    public SmartImageView LLIZ;
    public View LLIZLLLIL;
    public FrameLayout LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public C1738910vLt LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SellerConversationViewHolder.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/base/messagecenter/MessageCenterViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SellerConversationViewHolder.class, "sellerMsgVM", "getSellerMsgVM()Lcom/ss/android/ugc/aweme/ecommerce/base/messagecenter/SellerMessageListViewModel;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public SellerConversationViewHolder() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageCenterViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 454);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(35);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 441), awS577S0100000_33, AFwS224S0000000_33.get$arr$(92), new AwS577S0100000_33((C03K6) this, 431), new AwS577S0100000_33((C03K6) this, 442), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 445), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 448), null, new AwS577S0100000_33((C03K6) this, 451));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 427);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 429);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 432);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 16));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 437);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 440);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 443);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 446);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 449);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 452), awS577S0100000_33, AFwS224S0000000_33.get$arr$(91), new AwS577S0100000_33((C03K6) this, 456), new AwS577S0100000_33((C03K6) this, 458), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 460), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 462), null, new AwS577S0100000_33((C03K6) this, 464));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 465), awS577S0100000_33, AFwS224S0000000_33.get$arr$(93), new AwS577S0100000_33((C03K6) this, 467), new AwS577S0100000_33((C03K6) this, 469), new AwS577S0100000_33((C03K6) this, 472), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 474));
        }
        this.LLJI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SellerMessageListViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 476);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(34);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 426), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(90), new AwS577S0100000_33((C03K6) this, 430), new AwS577S0100000_33((C03K6) this, 433), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 435), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 438), null, new AwS577S0100000_33((C03K6) this, 444));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 447);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 450);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 453);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 17));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 455);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 457);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 459);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 461);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 463);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 466), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(94), new AwS577S0100000_33((C03K6) this, 468), new AwS577S0100000_33((C03K6) this, 470), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 471), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 473), null, new AwS577S0100000_33((C03K6) this, 475));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 425), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(89), new AwS577S0100000_33((C03K6) this, 428), new AwS577S0100000_33((C03K6) this, 434), new AwS577S0100000_33((C03K6) this, 436), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 439));
        }
        this.LLJIJIL = assemVMLazy2;
    }

    public final FrameLayout I5() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.pij) : null;
            this.LLJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final TuxTextView L5() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.time) : null;
            this.LLILLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView N5() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ze_) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView P5() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.zym) : null;
            this.LL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        int i2;
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        C20600815jK<InterfaceC1891350zJl> c20600815jK2;
        StoreSellingPoint storeSellingPoint;
        IECommerceShowcaseService iECommerceShowcaseService;
        View viewLJIIIZ;
        String string;
        C1750690vet c1750690vet = (C1750690vet) interfaceC1891350zJl;
        C786410Ut5.LJJJJJL((LinearLayout) this.itemView.findViewById(R.id.sri));
        P5().setText(c1750690vet.LLILLL);
        View viewFindViewById = this.LLILLJJLI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.eu1);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(c1750690vet.LLILZ);
        Long l = c1750690vet.LLILZIL;
        int i3 = 0;
        if (l != null) {
            long jLongValue = l.longValue();
            TuxTextView tuxTextViewL5 = L5();
            Context context = this.itemView.getContext();
            SimpleDateFormat simpleDateFormat = C801270Vbx.LIZ;
            long timeInMillis = Calendar.getInstance().getTimeInMillis() - jLongValue;
            if (timeInMillis < 60000) {
                long j = timeInMillis / 1000;
                Object[] objArr = new Object[1];
                if (j <= 0) {
                    j = 1;
                }
                objArr[0] = Long.valueOf(j);
                string = context.getString(2131846489, objArr);
            } else if (timeInMillis < 3600000) {
                string = context.getString(2131850408, Long.valueOf(timeInMillis / 60000));
            } else if (timeInMillis < 86400000) {
                string = context.getString(2131850406, Long.valueOf(timeInMillis / 3600000));
            } else if (timeInMillis < 604800000) {
                string = context.getString(2131850404, Long.valueOf(timeInMillis / 86400000));
            } else {
                long j2 = timeInMillis - 604800000;
                if (j2 > 0 && j2 <= 86400000) {
                    string = context.getString(2131850411, 1);
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(jLongValue);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(6, 0);
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    if (jLongValue >= calendar2.getTimeInMillis() + 86400000) {
                        string = C801270Vbx.LIZIZ.format(calendar.getTime());
                    } else {
                        string = C801270Vbx.LIZ.format(calendar.getTime());
                    }
                }
            }
            tuxTextViewL5.setText(string);
        }
        TuxTextView tuxTextViewL52 = L5();
        if (c1750690vet.LLILZIL != null) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextViewL52, i);
        Integer num = c1750690vet.LLILZLL;
        if (num != null) {
            int iIntValue = num.intValue();
            View viewFindViewById3 = this.LLILZ;
            if (viewFindViewById3 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById3 = viewLJJIJL.findViewById(R.id.unread_count_badge);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILZ = (C426770GoN) viewFindViewById3;
            }
            ((C426770GoN) viewFindViewById3).setCount(iIntValue);
        }
        String str = c1750690vet.LLJILJIL;
        String str2 = c1750690vet.LLJILJILJ;
        if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
            C786410Ut5.LJJJJIZL(I5());
            SmartImageView smartImageView = new SmartImageView(this.itemView.getContext());
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str2);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_INSIDE;
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            if (Intrinsics.LJFF(str, "official_logo_mall")) {
                C786410Ut5.G6(smartImageView, new ViewGroup.LayoutParams(C0H9H.LIZIZ(40), C0H9H.LIZIZ(15)));
            } else if (Intrinsics.LJFF(str, "official_logo_v")) {
                int iLIZIZ = C0H9H.LIZIZ(12);
                C786410Ut5.G6(smartImageView, new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ));
            }
            I5().addView(smartImageView);
        } else {
            C786410Ut5.LJJJJIZL(I5());
        }
        if (c1750690vet.LLJ) {
            ((C19ME) P5().getLayoutParams()).endToStart = N5().getId();
            C03DZ.LIZJ(N5());
        } else {
            C0H1U.LIZIZ(N5());
        }
        C1738910vLt c1738910vLt = this.LLJILJIL;
        if (c1738910vLt != null && c1738910vLt.LLILZIL && (storeSellingPoint = c1750690vet.LLJI) != null && (iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null)) != null && (viewLJIIIZ = iECommerceShowcaseService.LJIIIZ(this.itemView.findViewById(R.id.nfm), storeSellingPoint.rateDisplayStyle, storeSellingPoint.shopRatingDisplay, storeSellingPoint.expRatePercentile, storeSellingPoint.showRateNotApplicable)) != null) {
            C19ME c19me = (C19ME) P5().getLayoutParams();
            View viewFindViewById4 = this.LLILZLL;
            if (viewFindViewById4 == null) {
                View view2 = this.itemView;
                if (view2 != null) {
                    viewFindViewById4 = view2.findViewById(R.id.sri);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZLL = (LinearLayout) viewFindViewById4;
            }
            c19me.endToStart = viewFindViewById4.getId();
            ((ViewGroup) this.itemView.findViewById(R.id.sri)).addView(viewLJIIIZ);
            C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.sri));
        }
        View viewFindViewById5 = this.LLILZ;
        if (viewFindViewById5 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById5 = viewLJJIJL2.findViewById(R.id.unread_count_badge);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILZ = (C426770GoN) viewFindViewById5;
        }
        C426770GoN c426770GoN = (C426770GoN) viewFindViewById5;
        Integer num2 = c1750690vet.LLILZLL;
        if (num2 != null && num2.intValue() > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLLLIL(c426770GoN, i2);
        String str3 = c1750690vet.LLILLJJLI;
        if (str3 != null) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str3));
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C0H9H.LIZ(28);
            c1331750klB.LIZ = false;
            float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
            c1331750klB.LIZJ = R.attr.ng;
            c1331750klB.LIZIZ = fLIZIZ;
            c1331670kl3LJI.LJJI = new C1331730kl9(c1331750klB);
            View viewFindViewById6 = this.LLIZ;
            if (viewFindViewById6 == null) {
                View view3 = this.itemView;
                if (view3 != null) {
                    viewFindViewById6 = view3.findViewById(R.id.bh2);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLIZ = (SmartImageView) viewFindViewById6;
            }
            c1331670kl3LJI.LJJ((SmartImageView) viewFindViewById6);
            C786410Ut5.h3(c1331670kl3LJI);
        }
        this.itemView.setTag(Integer.valueOf(getBindingAdapterPosition()));
        AbstractC1906720ziY chunk = getChunk();
        if (chunk != null && (c20600815jK = chunk.LLILZLL) != null) {
            int size = ((ArrayList) c20600815jK.LJII()).size();
            View view4 = this.LLIZLLLIL;
            if (view4 == null) {
                View view5 = this.itemView;
                if (view5 != null) {
                    viewFindViewById2 = view5.findViewById(R.id.fyx);
                }
                this.LLIZLLLIL = viewFindViewById2;
                view4 = viewFindViewById2;
            }
            AbstractC1906720ziY chunk2 = getChunk();
            if (chunk2 != null && (c20600815jK2 = chunk2.LLILZLL) != null && c20600815jK2.LJIIIZ(c1750690vet) == size - 1) {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, view4);
        }
        C786410Ut5.I7(new AjS44S0200000_26(c1750690vet, this, 32), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ao5, viewGroup, false);
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        this.LLJILJIL = ((MessageCenterViewModel) assemVMLazy.getValue()).LLIZLLLIL;
        C2211751BhN.LIZ(viewTd, new AbstractC2211791BhR() { // from class: X.0ves
            public Function0<String> LJ;
            public final AFwS215S0000000_26 LJFF = AFwS215S0000000_26.get$arr$(87);
            public final int LJI = 50;

            @Override // X.AbstractC2211791BhR
            public final Map LJII() {
                String str;
                String string;
                Map<String, String> map;
                Long l;
                String string2;
                Integer num;
                Integer num2;
                Long l2;
                Pair[] pairArr = new Pair[12];
                int iIntValue = 0;
                pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
                C1738910vLt c1738910vLt = this.LJII.LLJILJIL;
                if (c1738910vLt == null || (str = c1738910vLt.LLILLJJLI) == null) {
                    str = "notification_page";
                }
                int i = 1;
                pairArr[1] = new Pair("enter_from", str);
                pairArr[2] = new Pair("page_name", "shop_message");
                C1750690vet item = this.LJII.getItem();
                pairArr[3] = new Pair("account_type", (item == null || !item.LLJ) ? "tiktok shops" : "collaborator_message");
                pairArr[4] = new Pair("notification_type", "official");
                pairArr[5] = new Pair("action_type", "show");
                int bindingAdapterPosition = this.LJII.getBindingAdapterPosition();
                C1738910vLt c1738910vLt2 = this.LJII.LLJILJIL;
                pairArr[6] = new Pair("client_order", String.valueOf(bindingAdapterPosition - ((c1738910vLt2 == null || !c1738910vLt2.LLILZIL) ? 5 : 2)));
                C1750690vet item2 = this.LJII.getItem();
                String str2 = "";
                if (item2 == null || (l2 = item2.LLIZLLLIL) == null || (string = l2.toString()) == null) {
                    string = "";
                }
                pairArr[7] = new Pair("message_time", string);
                C1750690vet item3 = this.LJII.getItem();
                if (item3 != null && (num2 = item3.LLILZLL) != null && num2.intValue() > 0) {
                    i = 0;
                }
                pairArr[8] = new Pair("is_read", String.valueOf(i));
                pairArr[9] = new Pair("timeline", this.LJII.L5().getText().toString());
                C1750690vet item4 = this.LJII.getItem();
                if (item4 != null && (num = item4.LLILZLL) != null) {
                    iIntValue = num.intValue();
                }
                pairArr[10] = new Pair("notice_number", String.valueOf(iIntValue));
                C1750690vet item5 = this.LJII.getItem();
                if (item5 != null && (l = item5.LL) != null && (string2 = l.toString()) != null) {
                    str2 = string2;
                }
                pairArr[11] = new Pair("content_id", str2);
                HashMap mapLJI = C2097608Jq.LJI(pairArr);
                SellerConversationViewHolder sellerConversationViewHolder = this.LJII;
                C1738910vLt c1738910vLt3 = sellerConversationViewHolder.LLJILJIL;
                if (c1738910vLt3 != null) {
                    mapLJI.putAll(c1738910vLt3.LIZ());
                }
                C1750690vet item6 = sellerConversationViewHolder.getItem();
                if (item6 != null && (map = item6.LLJILLL) != null) {
                    mapLJI.putAll(map);
                }
                return mapLJI;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZIZ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            {
                this.LJ = new AwS570S0100000_26(this.LJII, 249);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
