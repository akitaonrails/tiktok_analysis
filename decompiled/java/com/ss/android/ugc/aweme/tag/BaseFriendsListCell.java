package com.ss.android.ugc.aweme.tag;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C08CX;
import X.C09R3;
import X.C0HZQ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1324840ka2;
import X.C13LE;
import X.C13LP;
import X.C15NZ;
import X.C16H8;
import X.C1770850wBP;
import X.C1908030zkf;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20509315Nb;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1778700wO4;
import X.EnumC20509615Ne;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class BaseFriendsListCell<T extends C15NZ> extends PowerCell<T> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public EnumC20509615Ne LLILZIL;
    public final EnumC1778700wO4 LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseFriendsListCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tag/viewmodel/VideoTagFriendsListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BaseFriendsListCell.class, "searchListVM", "getSearchListVM()Lcom/ss/android/ugc/aweme/tag/viewmodel/VideoTagSearchListViewModel;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 86), this.itemView);
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.15NX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 61), 4);
    }

    public BaseFriendsListCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTagFriendsListViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 1119);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(214);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1106), awS575S0100000_31, AFwS221S0000000_31.get$arr$(277), new AwS575S0100000_31((C03K6) this, 1096), new AwS575S0100000_31((C03K6) this, 1107), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1110), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 1113), null, new AwS575S0100000_31((C03K6) this, 1116));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 1092);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1094);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 1097);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 73));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 1102);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 1105);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 1108);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 1111);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 1114);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1117), awS575S0100000_31, AFwS221S0000000_31.get$arr$(276), new AwS575S0100000_31((C03K6) this, 1121), new AwS575S0100000_31((C03K6) this, 1123), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1125), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 1127), null, new AwS575S0100000_31((C03K6) this, 1129));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 1130), awS575S0100000_31, AFwS221S0000000_31.get$arr$(278), new AwS575S0100000_31((C03K6) this, 1132), new AwS575S0100000_31((C03K6) this, 1134), new AwS575S0100000_31((C03K6) this, 1084), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 1086));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoTagSearchListViewModel.class);
        AwS575S0100000_31 awS575S0100000_3110 = new AwS575S0100000_31(c19719912DlLIZ2, 1088);
        AFwS276S0000000_31 aFwS276S0000000_312 = AFwS276S0000000_31.get$arr$(215);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ2, 1091), awS575S0100000_3110, AFwS221S0000000_31.get$arr$(275), new AwS575S0100000_31((C03K6) this, 1095), new AwS575S0100000_31((C03K6) this, 1098), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1100), aFwS276S0000000_312, new AwS575S0100000_31((C03K6) this, 1103), null, new AwS575S0100000_31((C03K6) this, 1109));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_3111 = new AwS575S0100000_31((C03K6) this, 1112);
            AwS575S0100000_31 awS575S0100000_3112 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1115);
            AwS575S0100000_31 awS575S0100000_3113 = new AwS575S0100000_31(c19719912DlLIZ2, 1118);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_3111, 74));
            AwS575S0100000_31 awS575S0100000_3114 = new AwS575S0100000_31(c01gwLIZIZ2, 1120);
            AwS575S0100000_31 awS575S0100000_3115 = new AwS575S0100000_31(c01gwLIZIZ2, 1122);
            AwS575S0100000_31 awS575S0100000_3116 = new AwS575S0100000_31(c01gwLIZIZ2, 1124);
            AwS575S0100000_31 awS575S0100000_3117 = new AwS575S0100000_31(c01gwLIZIZ2, 1126);
            AwS575S0100000_31 awS575S0100000_3118 = new AwS575S0100000_31(c01gwLIZIZ2, 1128);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS575S0100000_3113, awS575S0100000_3110, new C452080Ho6(), awS575S0100000_3114, awS575S0100000_3115, awS575S0100000_3112, aFwS276S0000000_312, awS575S0100000_3116, awS575S0100000_3117, awS575S0100000_3118);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ2, 1131), awS575S0100000_3110, AFwS221S0000000_31.get$arr$(279), new AwS575S0100000_31((C03K6) this, 1133), new AwS575S0100000_31((C03K6) this, 1083), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 1085), aFwS276S0000000_312, new AwS575S0100000_31((C03K6) this, 1087), null, new AwS575S0100000_31((C03K6) this, 1089));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ2, 1090), awS575S0100000_3110, AFwS221S0000000_31.get$arr$(274), new AwS575S0100000_31((C03K6) this, 1093), new AwS575S0100000_31((C03K6) this, 1099), new AwS575S0100000_31((C03K6) this, 1101), aFwS276S0000000_312, null, null, new AwS575S0100000_31((C03K6) this, 1104));
        }
        this.LLILLJJLI = assemVMLazy2;
        this.LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(273));
        this.LLILZIL = EnumC20509615Ne.NONE;
        this.LLILZLL = EnumC1778700wO4.ANY;
    }

    public final VideoTagSearchListViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (VideoTagSearchListViewModel) assemVMLazy.getValue();
    }

    public final VideoTagFriendsListViewModel N5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (VideoTagFriendsListViewModel) assemVMLazy.getValue();
    }

    public EnumC1778700wO4 I5() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        int i;
        C786410Ut5.T4(this.itemView, 1.0f);
        View view = this.itemView;
        C1324840ka2.LJFF((RemoteImageView) view.findViewById(R.id.biz), t.LL.getDisplayAvatar());
        TextView textView = (TextView) view.findViewById(R.id.p0w);
        String nickName = t.LL.getNickName();
        boolean z = true;
        if (nickName != null) {
            if (nickName.length() == 0) {
                nickName = t.LL.getUniqueId();
            }
        } else {
            nickName = null;
        }
        textView.setText(nickName);
        C1908030zkf.LJI(this.itemView.getContext(), t.LL.getCustomVerify(), t.LL.getEnterpriseVerifyReason(), (TextView) view.findViewById(R.id.p0w));
        ((TextView) view.findViewById(R.id.fs0)).setText(t.LL.getUniqueId());
        if (t instanceof C20509315Nb) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.h7a);
            if (((C20509315Nb) t).LLILLJJLI.getSearchIsBusinessAccount()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
        if (((ISearchUserService) this.LLILLL.getValue()).LIZLLL() && t.LL.getFollowStatus() == 2) {
            C786410Ut5.LLLLLLZZ((TuxIconView) view.findViewById(R.id.t4p), 0);
        } else {
            C786410Ut5.LLLLLLZZ((TuxIconView) view.findViewById(R.id.t4p), 8);
        }
        view.addOnAttachStateChangeListener(new C16H8(this, t, 1));
        IMUser iMUser = t.LL;
        VideoTagFriendsListViewModel videoTagFriendsListViewModelN5 = N5();
        if (videoTagFriendsListViewModelN5.xQ2().size() == 0 || !videoTagFriendsListViewModelN5.xQ2().contains(iMUser)) {
            z = false;
        }
        if (this.LLILZ != z) {
            this.LLILZ = z;
            ((C0HZQ) this.itemView.findViewById(R.id.ilj)).setChecked(z);
        }
        R5(t.LL);
    }

    public final void R5(IMUser iMUser) {
        if (!this.LLILZ) {
            if (iMUser.getVideoTagBlockStatus() != 3) {
                if (!C13LP.LJJJJ(iMUser.getUid(), N5().LLJILJILJ)) {
                    Set<String> set = N5().LLJILLL.get(3);
                    if (set == null) {
                        set = C08CX.INSTANCE;
                    }
                    if (!C13LP.LJJJJ(iMUser.getUid(), set)) {
                        if (((Number) N5().LLILLL.getValue()).intValue() != 1 && ((((Number) N5().LLILLL.getValue()).intValue() != 2 || iMUser.getFollowStatus() == 2) && ((Number) N5().LLILLL.getValue()).intValue() != 4)) {
                            if (iMUser.getVideoTagBlockStatus() != 1 && iMUser.getVideoTagBlockStatus() != 2 && (!((Boolean) N5().LLILZLL.getValue()).booleanValue() || iMUser.getFollowStatus() == 2 || iMUser.getFollowerStatus() == 1)) {
                                Set<String> set2 = N5().LLJILLL.get(1);
                                if (set2 == null) {
                                    set2 = C08CX.INSTANCE;
                                }
                                if (!C13LP.LJJJJ(iMUser.getUid(), set2)) {
                                    Set<String> set3 = N5().LLJILLL.get(2);
                                    if (set3 == null) {
                                        set3 = C08CX.INSTANCE;
                                    }
                                    if (!C13LP.LJJJJ(iMUser.getUid(), set3)) {
                                        if (N5().xQ2().size() >= 15) {
                                            S5(EnumC20509615Ne.EXCEED_SIZE);
                                            return;
                                        } else {
                                            S5(EnumC20509615Ne.NONE);
                                            return;
                                        }
                                    }
                                }
                            }
                            S5(EnumC20509615Ne.PRIVACY);
                            return;
                        }
                        S5(EnumC20509615Ne.VISIBILITY);
                        return;
                    }
                }
            }
            S5(EnumC20509615Ne.SELF_REMOVE);
        }
    }

    public final void S5(EnumC20509615Ne enumC20509615Ne) {
        boolean z;
        float f;
        this.LLILZIL = enumC20509615Ne;
        if (enumC20509615Ne != EnumC20509615Ne.NONE) {
            z = true;
        } else {
            z = false;
        }
        View view = this.itemView;
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(view, f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dlo, viewGroup, false);
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
