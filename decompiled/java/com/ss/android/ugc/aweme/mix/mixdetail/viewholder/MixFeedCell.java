package com.ss.android.ugc.aweme.mix.mixdetail.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C05FU;
import X.C05FZ;
import X.C09R3;
import X.C0M3E;
import X.C0ZP4;
import X.C1166800gT8;
import X.C1169140gWu;
import X.C1169160gWw;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1321305Fb;
import X.C1324840ka2;
import X.C1360500lVY;
import X.C1360520lVa;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C297010BkZ;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C596990NbF;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC0148002o;
import X.InterfaceC1167900gUu;
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
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS11S1100000_6;
import android.content.res.Resources;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistConsumptionViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.PlaylistInfoViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class MixFeedCell extends PowerCell<C1166800gT8> implements InterfaceC724530SbT, InterfaceC1167900gUu {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final C736950SvV LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixFeedCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/MixVideosViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MixFeedCell.class, "playlistInfoViewModel", "getPlaylistInfoViewModel()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/PlaylistInfoViewModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.do9;
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        LJIIJ();
        if (C297010BkZ.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLILLL.getValue(), new C2217381BqS() { // from class: X.0gWd
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1165760gRS) obj).LLILLL;
                }
            }, null, new AwS632S0100000_18(this, 64), 6);
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 40), this.itemView);
        } else {
            C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.0gWj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1164120gOo) obj).LLILLJJLI;
                }
            }, null, new AwS632S0100000_18(this, 63), 6);
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 39), this.itemView);
        }
    }

    public MixFeedCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixVideosViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 631);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(185);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 618), awS562S0100000_18, AFwS206S0000000_18.get$arr$(205), new AwS562S0100000_18((C03K6) this, 608), new AwS562S0100000_18((C03K6) this, 619), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 622), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 625), null, new AwS562S0100000_18((C03K6) this, 628));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 604);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 606);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 609);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 46));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 614);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 617);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 620);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 623);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 626);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 629), awS562S0100000_18, AFwS206S0000000_18.get$arr$(210), new AwS562S0100000_18((C03K6) this, 633), new AwS562S0100000_18((C03K6) this, 635), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 637), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 639), null, new AwS562S0100000_18((C03K6) this, 641));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 587), awS562S0100000_18, AFwS206S0000000_18.get$arr$(206), new AwS562S0100000_18((C03K6) this, 591), new AwS562S0100000_18((C03K6) this, 592), new AwS562S0100000_18((C03K6) this, 595), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 597));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PlaylistInfoViewModel.class);
        AwS562S0100000_18 awS562S0100000_1810 = new AwS562S0100000_18(c19719912DlLIZ2, 599);
        AFwS256S0000000_18 aFwS256S0000000_182 = AFwS256S0000000_18.get$arr$(186);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ2, 603), awS562S0100000_1810, AFwS206S0000000_18.get$arr$(209), new AwS562S0100000_18((C03K6) this, 607), new AwS562S0100000_18((C03K6) this, 610), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 612), aFwS256S0000000_182, new AwS562S0100000_18((C03K6) this, 615), null, new AwS562S0100000_18((C03K6) this, 621));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_1811 = new AwS562S0100000_18((C03K6) this, 624);
            AwS562S0100000_18 awS562S0100000_1812 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 627);
            AwS562S0100000_18 awS562S0100000_1813 = new AwS562S0100000_18(c19719912DlLIZ2, 630);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_1811, 47));
            AwS562S0100000_18 awS562S0100000_1814 = new AwS562S0100000_18(c01gwLIZIZ2, 632);
            AwS562S0100000_18 awS562S0100000_1815 = new AwS562S0100000_18(c01gwLIZIZ2, 634);
            AwS562S0100000_18 awS562S0100000_1816 = new AwS562S0100000_18(c01gwLIZIZ2, 636);
            AwS562S0100000_18 awS562S0100000_1817 = new AwS562S0100000_18(c01gwLIZIZ2, 638);
            AwS562S0100000_18 awS562S0100000_1818 = new AwS562S0100000_18(c01gwLIZIZ2, 640);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS562S0100000_1813, awS562S0100000_1810, new C452080Ho6(), awS562S0100000_1814, awS562S0100000_1815, awS562S0100000_1812, aFwS256S0000000_182, awS562S0100000_1816, awS562S0100000_1817, awS562S0100000_1818);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ2, 589), awS562S0100000_1810, AFwS206S0000000_18.get$arr$(207), new AwS562S0100000_18((C03K6) this, 593), new AwS562S0100000_18((C03K6) this, 594), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 596), aFwS256S0000000_182, new AwS562S0100000_18((C03K6) this, 598), null, new AwS562S0100000_18((C03K6) this, 600));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ2, 601), awS562S0100000_1810, AFwS206S0000000_18.get$arr$(208), new AwS562S0100000_18((C03K6) this, 605), new AwS562S0100000_18((C03K6) this, 611), new AwS562S0100000_18((C03K6) this, 613), aFwS256S0000000_182, null, null, new AwS562S0100000_18((C03K6) this, 616));
        }
        this.LLILLJJLI = assemVMLazy2;
        AwS562S0100000_18 awS562S0100000_1819 = new AwS562S0100000_18(this, 602);
        this.LLILLL = new C736950SvV(C13LE.LIZ(PlaylistConsumptionViewModel.class), awS562S0100000_1819, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(187), null, null, null);
        this.LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 588));
        this.LLILZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 590));
    }

    public final MixVideosViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (MixVideosViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1167900gUu
    public final void LJIIJ() {
        this.itemView.setBackgroundColor(0);
    }

    @Override // X.InterfaceC1167900gUu
    public final void LJIIZILJ() {
        Integer num = (Integer) this.LLILZ.getValue();
        if (num != null) {
            this.itemView.setBackgroundColor(num.intValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C05FZ c05fz = C05FZ.LIZ;
        C2097608Jq.LJ();
        c05fz.getClass();
        if (C1321305Fb.LIZ()) {
            C05FU.LIZ(C05FU.LIZ, "playlist_launch_performance", "playlist_dialog_ready");
        }
    }

    public final String I5(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, 2));
        }
        return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)}, 3));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String mixId;
        Integer index;
        boolean z;
        int duration;
        int playCount;
        String strLIZIZ;
        int playCount2;
        String strLIZ;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        String mixId2;
        int iLJJJ;
        int i3;
        String mixId3;
        C1166800gT8 c1166800gT8 = (C1166800gT8) interfaceC1891350zJl;
        if (!C297010BkZ.LIZ()) {
            C736680Sv4.LJIJJ(L5(), new AwS384S0200000_18(c1166800gT8, this, 181));
            C1169160gWw c1169160gWw = C1169160gWw.LIZ;
            Aweme aweme = c1166800gT8.LL;
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null) {
                mixId3 = playListInfo.getMixId();
            } else {
                mixId3 = null;
            }
            String str = L5().LLJJJIL;
            c1169160gWw.getClass();
            C1169160gWw.LJJI(mixId3, str, aweme);
        } else {
            C736680Sv4.LJIJJ((AssemViewModel) this.LLILLL.getValue(), new AwS384S0200000_18(c1166800gT8, this, 182));
            C1169160gWw c1169160gWw2 = C1169160gWw.LIZ;
            Aweme aweme2 = c1166800gT8.LL;
            PlayListInfo playListInfo2 = aweme2.playlist_info;
            if (playListInfo2 != null) {
                mixId = playListInfo2.getMixId();
            } else {
                mixId = null;
            }
            AssemVMLazy assemVMLazy = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
            String str2 = ((C1169140gWu) assemVMLazy.getValue().getState()).LLILLJJLI;
            c1169160gWw2.getClass();
            C1169160gWw.LJJI(mixId, str2, aweme2);
        }
        ((C0M3E) this.LLILZIL.getValue()).LJ(c1166800gT8.LL);
        C1324840ka2.LJFF((RemoteImageView) this.itemView.findViewById(R.id.f5b), c1166800gT8.LLILZ);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ohl);
        View viewFindViewById = this.itemView.findViewById(R.id.ohn);
        View viewFindViewById2 = this.itemView.findViewById(R.id.wg6);
        int i4 = 0;
        if (viewFindViewById2 != null) {
            if (c1166800gT8.LL.isSubOnlyVideo()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, viewFindViewById2);
        }
        if (c1166800gT8.LL.isSubOnlyVideo() && viewFindViewById2 != null) {
            viewFindViewById2.setBackgroundColor(C960203pA.LIZ(R.attr.a03, this.itemView.getContext()));
        }
        PlayListInfo playListInfo3 = c1166800gT8.LL.playlist_info;
        if (playListInfo3 != null) {
            index = playListInfo3.getIndex();
        } else {
            index = null;
        }
        String str3 = c1166800gT8.LLILZIL;
        if (str3 != null && str3.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            if (index != null) {
                Integer numValueOf = Integer.valueOf(index.intValue() + 1);
                String string = this.itemView.getContext().getString(2131848665);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1p, this.itemView.getContext()));
                String string2 = C20642515q3.LJFF().getString(2131839683, numValueOf);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string2);
                sbLIZ.append(string);
                sbLIZ.append('|');
                sbLIZ.append(string);
                sbLIZ.append(c1166800gT8.LLILZIL);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZ.append((CharSequence) strLIZIZ2);
                C1360500lVY c1360500lVY = c1360520lVa.LIZ;
                if (a0.LJJJ(strLIZIZ2, "|", 0, false, 6) < 0) {
                    iLJJJ = 0;
                } else {
                    iLJJJ = a0.LJJJ(strLIZIZ2, "|", 0, false, 6);
                }
                C786410Ut5.r2(c1360500lVY, new StyleSpan(1), 0, string2.length() + 1, 33);
                C786410Ut5.r2(c1360500lVY, foregroundColorSpan, iLJJJ + 1, iLJJJ + 2, 33);
                tuxTextView.setText(c1360500lVY);
            } else {
                C1360520lVa c1360520lVa2 = new C1360520lVa();
                String str4 = c1166800gT8.LLILZIL;
                if (str4 == null) {
                    str4 = "";
                }
                c1360520lVa2.LIZ.append((CharSequence) str4);
                tuxTextView.setText(c1360520lVa2.LIZ);
            }
        } else if (index != null) {
            Integer numValueOf2 = Integer.valueOf(index.intValue() + 1);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            String string3 = C20642515q3.LJFF().getString(2131839683, numValueOf2);
            C1360520lVa c1360520lVa3 = new C1360520lVa();
            c1360520lVa3.LIZ.append((CharSequence) string3);
            C1360500lVY c1360500lVY2 = c1360520lVa3.LIZ;
            C786410Ut5.r2(c1360500lVY2, new StyleSpan(1), 0, string3.length() + 1, 33);
            Unit.LIZ.getClass();
            tuxTextView.setText(c1360500lVY2);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        Video video = c1166800gT8.LL.getVideo();
        if (video != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        if (duration > 0) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohm), 0);
            ((TextView) this.itemView.findViewById(R.id.ohm)).setText(I5(duration));
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohm), 8);
        }
        if (c1166800gT8.LL.isSubOnlyVideo()) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohq), 8);
        } else {
            TextView textView = (TextView) this.itemView.findViewById(R.id.ohq);
            Resources resourcesLJFF = C20642515q3.LJFF();
            AwemeStatistics statistics = c1166800gT8.LL.getStatistics();
            if (statistics != null) {
                playCount = (int) statistics.getPlayCount();
            } else {
                playCount = 0;
            }
            textView.setText(resourcesLJFF.getQuantityString(2131755488, playCount, c1166800gT8.LLILZLL));
        }
        if (this.itemView.findViewById(R.id.ohq).getVisibility() == 0 && this.itemView.findViewById(R.id.ohm).getVisibility() == 0) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohf), 0);
        }
        if (duration <= 0) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(I5(duration));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        Resources resourcesLJFF2 = C20642515q3.LJFF();
        AwemeStatistics statistics2 = c1166800gT8.LL.getStatistics();
        if (statistics2 != null) {
            playCount2 = (int) statistics2.getPlayCount();
        } else {
            playCount2 = 0;
        }
        sbLIZ3.append(resourcesLJFF2.getQuantityString(2131755488, playCount2, c1166800gT8.LLILZLL));
        C2188811AlT.LIZIZ(sbLIZ3);
        PlayListInfo playListInfo4 = c1166800gT8.LL.playlist_info;
        if (playListInfo4 != null && (mixId2 = playListInfo4.getMixId()) != null) {
            C596990NbF c596990NbF = C596990NbF.LIZ;
            strLIZ = C596990NbF.LIZ(mixId2);
        } else {
            strLIZ = null;
        }
        if (!C297010BkZ.LIZ()) {
            z2 = L5().LLIZ;
        } else {
            z2 = ((PlaylistConsumptionViewModel) this.LLILLL.getValue()).LLJI;
        }
        if (strLIZ != null && strLIZ.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 && Intrinsics.LJFF(strLIZ, c1166800gT8.LL.getAid()) && z2) {
            String string4 = C20642515q3.LJFF().getString(2131840539);
            ((TextView) this.itemView.findViewById(R.id.oho)).setText("");
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.oho), 8);
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohp), 4);
            ((TextView) this.itemView.findViewById(R.id.ohp)).setText(string4);
            HandlerHook.viewPost(this.itemView.findViewById(R.id.ohp), new ARunnableS11S1100000_6(this, string4, 4));
        } else {
            ((TextView) this.itemView.findViewById(R.id.ohp)).setText("");
            ((TuxTextView) this.itemView.findViewById(R.id.ohp)).setTuxFont(61);
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.ohp), 4);
            ((TextView) this.itemView.findViewById(R.id.oho)).setText("");
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.oho), 8);
        }
        View viewFindViewById3 = this.itemView.findViewById(R.id.ohm);
        View viewFindViewById4 = this.itemView.findViewById(R.id.ohq);
        View viewFindViewById5 = this.itemView.findViewById(R.id.ohp);
        View viewFindViewById6 = this.itemView.findViewById(R.id.oho);
        if ((viewFindViewById3 != null && viewFindViewById3.getVisibility() == 0) || ((viewFindViewById4 != null && viewFindViewById4.getVisibility() == 0) || ((viewFindViewById5 != null && viewFindViewById5.getVisibility() == 0) || (viewFindViewById6 != null && viewFindViewById6.getVisibility() == 0)))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (viewFindViewById != null) {
            if (z4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById);
        }
        if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
            i = 4;
        } else {
            i = 0;
        }
        N5(i, viewFindViewById);
        if (viewFindViewById2 != null && viewFindViewById2.getVisibility() == 0 && viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
            i4 = 4;
        }
        N5(i4, viewFindViewById2);
    }

    public final void N5(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.topMargin != (i2 = (int) (i * this.itemView.getContext().getResources().getDisplayMetrics().density))) {
            marginLayoutParams.topMargin = i2;
            C786410Ut5.W5(view, marginLayoutParams);
        }
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
