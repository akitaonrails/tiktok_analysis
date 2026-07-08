package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0BTW;
import X.C0HD5;
import X.C0SUC;
import X.C1095904Qj;
import X.C1096004Qk;
import X.C1132404bq;
import X.C1209980ham;
import X.C1235900iGa;
import X.C1340330kz1;
import X.C1340350kz3;
import X.C1340510kzJ;
import X.C1340820kzo;
import X.C1340830kzp;
import X.C1340880kzu;
import X.C1341170l0N;
import X.C1341780l1M;
import X.C1344210l5H;
import X.C1344540l5o;
import X.C1346420l8q;
import X.C1350920lG6;
import X.C1372520low;
import X.C13IQ;
import X.C13LE;
import X.C1402430mbB;
import X.C14EU;
import X.C1601690rmZ;
import X.C19719912Dl;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C292290Bcx;
import X.C294200Bg2;
import X.C296020Biy;
import X.C452080Ho6;
import X.C452501pT;
import X.C563400M7u;
import X.C622680Oba;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1341650l19;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentExposureVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.experiment.ReplyCommentLoadNumConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import g1c.AjS67S0100000_21;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes22.dex */
public class CommentMoreItemCell<T> extends PowerCell<C1340820kzo> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LL;
    public View LLILLJJLI;
    public View LLILLL;
    public LinearLayout LLILZ;
    public C1235900iGa LLILZIL;
    public TextView LLILZLL;
    public LinearLayout LLIZ;
    public ViewGroup LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxIconView LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public final C1340330kz1 LLJJ;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentMoreItemCell.class, "commentVM", "getCommentVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentMoreItemCell.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommentMoreItemCell.class, "commentExposureVM", "getCommentExposureVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentExposureVM;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public CommentMoreItemCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 112);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(108);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 347), awS560S0100000_16, AFwS209S0000000_21.get$arr$(184), new AwS560S0100000_16((C03K6) this, 96), new AwS560S0100000_16((C03K6) this, 104), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 348), aFwS259S0000000_21, new AwS560S0100000_16((C03K6) this, 109), null, new AwS560S0100000_16((C03K6) this, 111));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C03K6) this, 93);
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 344);
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(c19719912DlLIZ, 345);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS560S0100000_162, 26));
            AwS560S0100000_16 awS560S0100000_163 = new AwS560S0100000_16(c01gwLIZIZ, 100);
            AwS560S0100000_16 awS560S0100000_164 = new AwS560S0100000_16(c01gwLIZIZ, 103);
            AwS560S0100000_16 awS560S0100000_165 = new AwS560S0100000_16(c01gwLIZIZ, 105);
            AwS560S0100000_16 awS560S0100000_166 = new AwS560S0100000_16(c01gwLIZIZ, 107);
            AwS560S0100000_16 awS560S0100000_167 = new AwS560S0100000_16(c01gwLIZIZ, 110);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_212, awS560S0100000_16, new C452080Ho6(), awS560S0100000_163, awS560S0100000_164, awS565S0100000_21, aFwS259S0000000_21, awS560S0100000_165, awS560S0100000_166, awS560S0100000_167);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 350), awS560S0100000_16, AFwS209S0000000_21.get$arr$(183), new AwS560S0100000_16((C03K6) this, 114), new AwS560S0100000_16((C03K6) this, 116), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 352), aFwS259S0000000_21, new AwS560S0100000_16((C03K6) this, 119), null, new AwS560S0100000_16((C03K6) this, 121));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 353), awS560S0100000_16, AFwS209S0000000_21.get$arr$(179), new AwS560S0100000_16((C03K6) this, 84), new AwS560S0100000_16((C03K6) this, 85), new AwS560S0100000_16((C03K6) this, 88), aFwS259S0000000_21, null, null, new AwS560S0100000_16((C03K6) this, 89));
        }
        this.LL = assemVMLazy;
        this.LLJJ = new C1340330kz1();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentExposureVM.class);
        AwS560S0100000_16 awS560S0100000_168 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 91);
        AFwS259S0000000_21 aFwS259S0000000_212 = AFwS259S0000000_21.get$arr$(109);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ2, 343), awS560S0100000_168, AFwS209S0000000_21.get$arr$(182), new AwS560S0100000_16((C03K6) this, 95), new AwS560S0100000_16((C03K6) this, 97), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 346), aFwS259S0000000_212, new AwS560S0100000_16((C03K6) this, 101), null, new AwS560S0100000_16((C03K6) this, 106));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS560S0100000_16 awS560S0100000_169 = new AwS560S0100000_16((C03K6) this, 108);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 349);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ2, 351);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS560S0100000_169, 27));
            AwS560S0100000_16 awS560S0100000_1610 = new AwS560S0100000_16(c01gwLIZIZ2, 113);
            AwS560S0100000_16 awS560S0100000_1611 = new AwS560S0100000_16(c01gwLIZIZ2, 115);
            AwS560S0100000_16 awS560S0100000_1612 = new AwS560S0100000_16(c01gwLIZIZ2, 117);
            AwS560S0100000_16 awS560S0100000_1613 = new AwS560S0100000_16(c01gwLIZIZ2, 118);
            AwS560S0100000_16 awS560S0100000_1614 = new AwS560S0100000_16(c01gwLIZIZ2, 120);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS565S0100000_214, awS560S0100000_168, new C452080Ho6(), awS560S0100000_1610, awS560S0100000_1611, awS565S0100000_213, aFwS259S0000000_212, awS560S0100000_1612, awS560S0100000_1613, awS560S0100000_1614);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ2, 340), awS560S0100000_168, AFwS209S0000000_21.get$arr$(180), new AwS560S0100000_16((C03K6) this, 86), new AwS560S0100000_16((C03K6) this, 87), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 341), aFwS259S0000000_212, new AwS560S0100000_16((C03K6) this, 90), null, new AwS560S0100000_16((C03K6) this, 92));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ2, 342), awS560S0100000_168, AFwS209S0000000_21.get$arr$(181), new AwS560S0100000_16((C03K6) this, 94), new AwS560S0100000_16((C03K6) this, 98), new AwS560S0100000_16((C03K6) this, 99), aFwS259S0000000_212, null, null, new AwS560S0100000_16((C03K6) this, 102));
        }
        this.LLJJI = assemVMLazy2;
    }

    public final CommentContextSource L5() {
        C1340330kz1 c1340330kz1 = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return c1340330kz1.LIZ(this);
    }

    public final View N5() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final void P5() {
        C1340820kzo item = getItem();
        if (item == null || !item.LLILZIL) {
            return;
        }
        TextView textView = this.LLILZLL;
        if (textView == null) {
            textView = null;
        }
        if (TextUtils.equals(textView.getText(), this.itemView.getContext().getResources().getString(2131829132))) {
            C1350920lG6.LJJIL("comment_batch_management_view_more_ck");
        } else {
            C1350920lG6.LJJIL("comment_batch_management_view_replies_ck");
        }
    }

    public final void T5() {
        C1340820kzo item;
        C1340820kzo item2;
        C1340820kzo item3;
        C1340830kzp c1340830kzp;
        if ((!C292290Bcx.LIZJ() || (!(C292290Bcx.LIZ() == 2 || C292290Bcx.LIZ() == 7) || (item3 = getItem()) == null || (c1340830kzp = item3.LLILZ) == null || c1340830kzp.LJIIJ < 2)) && (item = getItem()) != null && item.LLILZ.LJIIJJI && (item2 = getItem()) != null) {
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
            C1344210l5H c1344210l5HDQ2 = ((CommentListAssemVM) assemVMLazy.getValue()).DQ2();
            if (c1344210l5HDQ2.LJJIFFI.contains(item2.LLILLJJLI)) {
                return;
            }
            int i = item2.LL;
            if (((ArrayList) item2.LLILZ.LIZJ).size() <= (i >= 0 ? i : 0)) {
                c1344210l5HDQ2.LJ(item2, true);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = this.itemView.findViewById(R.id.tqy);
        this.LLILLL = this.itemView.findViewById(R.id.hg3);
        this.LLILZ = (LinearLayout) this.itemView.findViewById(R.id.me9);
        this.LLJILLL = this.itemView.findViewById(R.id.ml4);
        this.LLILZIL = (C1235900iGa) this.itemView.findViewById(R.id.me_);
        this.LLILZLL = (TextView) this.itemView.findViewById(R.id.tv_reply_comment_title);
        this.LLIZ = (LinearLayout) this.itemView.findViewById(R.id.e62);
        this.LLJILJIL = this.itemView.findViewById(R.id.view_more_comment_divider);
        this.LLJ = (TuxIconView) this.itemView.findViewById(R.id.kh9);
        this.LLJI = (TuxIconView) this.itemView.findViewById(R.id.e5z);
        this.LLJIJIL = this.itemView.findViewById(R.id.vro);
        this.LLIZLLLIL = (ViewGroup) this.itemView.findViewById(R.id.fzh);
        TuxIconView tuxIconView = this.LLJ;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        TuxIconView tuxIconView2 = this.LLJI;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        C1341780l1M c1341780l1M = C1341780l1M.LIZ;
        View viewN5 = N5();
        EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.BUTTON;
        C1341780l1M.LIZIZ(c1341780l1M, viewN5, enumC1341650l19, 0.0f, null, 8);
        C786410Ut5.I7(new AjS67S0100000_21(this, 12), N5());
        View view = this.LLJILLL;
        if (view != null) {
            C786410Ut5.I7(null, view);
        }
        ViewGroup viewGroup = this.LLIZLLLIL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.K7(viewGroup, null);
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C1341780l1M.LIZIZ(c1341780l1M, linearLayout, enumC1341650l19, 0.0f, null, 8);
        LinearLayout linearLayout2 = this.LLIZ;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        C786410Ut5.I7(new AjS67S0100000_21(this, 13), linearLayout2);
        C1235900iGa c1235900iGa = this.LLILZIL;
        if (c1235900iGa == null) {
            c1235900iGa = null;
        }
        C1235900iGa c1235900iGa2 = this.LLILZIL;
        if (c1235900iGa2 == null) {
            c1235900iGa2 = null;
        }
        c1235900iGa.setProgressBarInfo(C0HD5.LIZ(c1235900iGa2, 28));
        C1235900iGa c1235900iGa3 = this.LLILZIL;
        if (c1235900iGa3 == null) {
            c1235900iGa3 = null;
        }
        View viewFindViewById = c1235900iGa3.findViewById(R.id.g3w);
        this.LLJILJILJ = viewFindViewById;
        if (viewFindViewById != null) {
            Context context = viewFindViewById.getContext();
            viewFindViewById.setContentDescription(context != null ? context.getString(2131824454) : null);
        }
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            view2.setFocusable(true);
        }
        TextView textView = this.LLILZLL;
        if (textView == null) {
            textView = null;
        }
        q0.LJIJ(textView, new C1402430mbB(1));
        View view3 = this.LLJIJIL;
        if (view3 == null) {
            view3 = null;
        }
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            layoutParams = null;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.weight = 0.0f;
            layoutParams2.width = C0HD5.LIZ(this.itemView, 8);
            C786410Ut5.W5(view3, layoutParams2);
        }
        LinearLayout linearLayout3 = this.LLIZ;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        linearLayout3.setGravity(0);
        ViewGroup viewGroup2 = this.LLIZLLLIL;
        C786410Ut5.LJLZ(0, viewGroup2 != null ? viewGroup2 : null);
    }

    public final void I5(C1340820kzo c1340820kzo) {
        c1340820kzo.LLILLL = 4;
        S5(c1340820kzo, true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        CommentCommonModel commonModel;
        Aweme aweme;
        User author;
        C1340820kzo c1340820kzo = (C1340820kzo) interfaceC1891350zJl;
        super.onBindItemView(c1340820kzo);
        C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
        CommentContextSource commentContextSourceL5 = L5();
        c1340510kzJ.getClass();
        if (C1340510kzJ.LIZIZ(commentContextSourceL5)) {
            c1340820kzo.LLILLL = 4;
            S5(c1340820kzo, true);
            return;
        }
        C2189821An6 c2189821An6LIZ = C0SUC.LIZ(this.itemView.getContext());
        CommentContextSource commentContextSourceL52 = L5();
        if (commentContextSourceL52 != null && (commonModel = commentContextSourceL52.getCommonModel()) != null && (aweme = commonModel.aweme) != null && (author = aweme.getAuthor()) != null) {
            String userRecType = c2189821An6LIZ.getUserRecType();
            String userRelationType = c2189821An6LIZ.getUserRelationType();
            if (userRecType != null && userRelationType != null) {
                if (author.getMatchedFriendStruct() == null) {
                    author.setMatchedFriendStruct(new MatchedFriendStruct(null, userRecType, userRelationType, null, null, "", null, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, 0, null, null, 0, 0, Boolean.FALSE));
                } else {
                    String str = author.getMatchedFriendStruct().recType;
                    if (str == null || str.length() == 0) {
                        author.getMatchedFriendStruct().setRecType(userRecType);
                        author.getMatchedFriendStruct().setRelationType(userRelationType);
                    }
                }
            }
        }
        S5(c1340820kzo, false);
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LJ();
    }

    @C14EU
    public final void onCommentEvent(C1209980ham c1209980ham) {
        if (c1209980ham.LIZ == 12) {
            T5();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZIZ = C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a31, viewGroup, false);
        C1344540l5o c1344540l5o = C1344540l5o.LIZ;
        Context context = viewGroup.getContext();
        c1344540l5o.getClass();
        if (C294200Bg2.LIZJ()) {
            int iLIZIZ = ((C563400M7u) C1344540l5o.LJIILIIL.getValue()).LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReplyButtonCreated  ");
            sbLIZ.append(iLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (iLIZIZ <= 1) {
                C786410Ut5.LJJZZIII((Handler) C1344540l5o.LJIILJJIL.getValue(), new ARunnableS121S0100000_21(context, 129));
            }
        }
        return viewLIZIZ;
    }

    public final void R5(boolean z, boolean z2) {
        boolean z3;
        View view;
        C01GW c01gw = C1095904Qj.LIZ;
        if (((Number) c01gw.getValue()).intValue() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        LinearLayout linearLayout = null;
        if (z3 && !z2) {
            ViewGroup viewGroup = this.LLIZLLLIL;
            if (viewGroup == null) {
                viewGroup = null;
            }
            C786410Ut5.I7(new AjS67S0100000_21(this, 14), viewGroup);
            if (((Number) c01gw.getValue()).intValue() == 2) {
                View view2 = this.LLJILLL;
                if (view2 != null) {
                    C786410Ut5.I7(new AjS67S0100000_21(this, 15), view2);
                }
            } else {
                View view3 = this.LLJILLL;
                if (view3 != null) {
                    C786410Ut5.I7(null, view3);
                }
            }
            if (z) {
                LinearLayout linearLayout2 = this.LLILZ;
                if (linearLayout2 != null) {
                    linearLayout = linearLayout2;
                }
                C786410Ut5.I7(new AjS67S0100000_21(this, 16), linearLayout);
                if (((Number) c01gw.getValue()).intValue() != 2 && (view = this.LLJILLL) != null) {
                    C786410Ut5.I7(new View.OnClickListener() { // from class: X.0kzt
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                        }
                    }, view);
                    return;
                }
                return;
            }
            LinearLayout linearLayout3 = this.LLILZ;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            C786410Ut5.R7(linearLayout3, null);
            return;
        }
        View view4 = this.LLJILLL;
        if (view4 != null) {
            C786410Ut5.I7(null, view4);
        }
        ViewGroup viewGroup2 = this.LLIZLLLIL;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        C786410Ut5.K7(viewGroup2, null);
        LinearLayout linearLayout4 = this.LLILZ;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        C786410Ut5.R7(linearLayout4, null);
    }

    public final void S5(C1340820kzo c1340820kzo, boolean z) {
        boolean z2;
        String quantityString;
        C1340830kzp c1340830kzp;
        C1340830kzp c1340830kzp2;
        String quantityString2;
        View view;
        ViewGroup.LayoutParams layoutParams;
        int i = 4;
        if (C1346420l8q.LJFF(Long.valueOf(c1340820kzo.LLILZ.LJ)) <= C1346420l8q.LJ(Integer.valueOf(c1340820kzo.LLILZ.LIZ)) && c1340820kzo.LLILLL != 4) {
            I5(c1340820kzo);
            return;
        }
        int iLIZIZ = 0;
        if (((Number) C1096004Qk.LIZ.getValue()).intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        LinearLayout linearLayout = null;
        C1235900iGa c1235900iGa = null;
        LinearLayout linearLayout2 = null;
        TextView textView = null;
        TextView textView2 = null;
        TextView textView3 = null;
        TextView textView4 = null;
        if (z2 && c1340820kzo.LIZ() != 4 && (layoutParams = this.itemView.getLayoutParams()) != null && layoutParams.height == 0) {
            View view2 = this.itemView;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.LayoutParams) && layoutParams2 != null) {
                layoutParams2.height = -2;
                C786410Ut5.W5(view2, layoutParams2);
            }
        }
        int iLIZ = c1340820kzo.LIZ();
        int i2 = 8;
        int i3 = 3;
        if (iLIZ != 0) {
            if (iLIZ != 1) {
                if (iLIZ != 2) {
                    if (iLIZ != 3) {
                        if (iLIZ == 4) {
                            this.itemView.getLayoutParams().height = 0;
                            this.itemView.requestLayout();
                        }
                    } else {
                        LinearLayout linearLayout3 = this.LLILZ;
                        if (linearLayout3 == null) {
                            linearLayout3 = null;
                        }
                        C786410Ut5.LJZL(8, linearLayout3);
                        C1235900iGa c1235900iGa2 = this.LLILZIL;
                        if (c1235900iGa2 != null) {
                            c1235900iGa = c1235900iGa2;
                        }
                        C786410Ut5.LLLLIIL(c1235900iGa, 0);
                        if (C1601690rmZ.LIZJ() && (view = this.LLJILJILJ) != null) {
                            HandlerHook.viewPost(view, new ARunnableS116S0100000_16(this, 216));
                        }
                    }
                } else {
                    P5();
                    int i4 = c1340820kzo.LL;
                    C1340830kzp c1340830kzp3 = c1340820kzo.LLILZ;
                    c1340830kzp3.LJ = i4;
                    if (i4 <= c1340830kzp3.LIZ) {
                        I5(c1340820kzo);
                    } else {
                        R5(false, true);
                        LinearLayout linearLayout4 = this.LLILZ;
                        if (linearLayout4 == null) {
                            linearLayout4 = null;
                        }
                        C786410Ut5.LJZL(0, linearLayout4);
                        C1235900iGa c1235900iGa3 = this.LLILZIL;
                        if (c1235900iGa3 == null) {
                            c1235900iGa3 = null;
                        }
                        C786410Ut5.LLLLIIL(c1235900iGa3, 8);
                        C786410Ut5.LJLLLLLL(8, N5());
                        TuxIconView tuxIconView = this.LLJI;
                        if (tuxIconView == null) {
                            tuxIconView = null;
                        }
                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                        LinearLayout linearLayout5 = this.LLIZ;
                        if (linearLayout5 == null) {
                            linearLayout5 = null;
                        }
                        linearLayout5.setPaddingRelative(C0HD5.LIZ(this.itemView, 4), linearLayout5.getPaddingTop(), linearLayout5.getPaddingEnd(), linearLayout5.getPaddingBottom());
                        ViewGroup viewGroup = this.LLIZLLLIL;
                        if (viewGroup == null) {
                            viewGroup = null;
                        }
                        C786410Ut5.LJLZ(0, viewGroup);
                        ViewGroup viewGroup2 = this.LLIZLLLIL;
                        if (viewGroup2 == null) {
                            viewGroup2 = null;
                        }
                        C786410Ut5.R4(1.0f, viewGroup2);
                        View view3 = this.LLJIJIL;
                        if (view3 == null) {
                            view3 = null;
                        }
                        C786410Ut5.LJLLLLLL(8, view3);
                        LinearLayout linearLayout6 = this.LLIZ;
                        if (linearLayout6 != null) {
                            linearLayout2 = linearLayout6;
                        }
                        C786410Ut5.LJZL(0, linearLayout2);
                    }
                }
            } else {
                P5();
                LinearLayout linearLayout7 = this.LLILZ;
                if (linearLayout7 == null) {
                    linearLayout7 = null;
                }
                C786410Ut5.LJZL(0, linearLayout7);
                C1235900iGa c1235900iGa4 = this.LLILZIL;
                if (c1235900iGa4 == null) {
                    c1235900iGa4 = null;
                }
                C786410Ut5.LLLLIIL(c1235900iGa4, 8);
                C786410Ut5.LJLLLLLL(0, N5());
                ViewGroup viewGroup3 = this.LLIZLLLIL;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                C786410Ut5.LJLZ(0, viewGroup3);
                TuxIconView tuxIconView2 = this.LLJ;
                if (tuxIconView2 == null) {
                    tuxIconView2 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                TuxIconView tuxIconView3 = this.LLJI;
                if (tuxIconView3 == null) {
                    tuxIconView3 = null;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                View view4 = this.LLJIJIL;
                if (view4 == null) {
                    view4 = null;
                }
                C786410Ut5.LJLLLLLL(0, view4);
                LinearLayout linearLayout8 = this.LLIZ;
                if (linearLayout8 == null) {
                    linearLayout8 = null;
                }
                linearLayout8.setPaddingRelative(C0HD5.LIZ(this.itemView, 8), linearLayout8.getPaddingTop(), linearLayout8.getPaddingEnd(), linearLayout8.getPaddingBottom());
                if (!C296020Biy.LIZ()) {
                    i = 3;
                }
                C1340350kz3.LJFF(i, N5(), z);
                ViewGroup viewGroup4 = this.LLIZLLLIL;
                if (viewGroup4 == null) {
                    viewGroup4 = null;
                }
                C1340350kz3.LJFF(i, viewGroup4, z);
                LinearLayout linearLayout9 = this.LLIZ;
                if (linearLayout9 == null) {
                    linearLayout9 = null;
                }
                C1340350kz3.LJFF(i, linearLayout9, z);
                LinearLayout linearLayout10 = this.LLIZ;
                if (linearLayout10 == null) {
                    linearLayout10 = null;
                }
                if (((Number) C1132404bq.LIZIZ.getValue()).intValue() < 3) {
                    i2 = 0;
                }
                C786410Ut5.LJZL(i2, linearLayout10);
                R5(false, false);
                long j = c1340820kzo.LLILZ.LJ - ((long) c1340820kzo.LL);
                if (j > 0) {
                    TextView textView5 = this.LLILZLL;
                    if (textView5 == null) {
                        textView5 = null;
                    }
                    C1341170l0N c1341170l0N = C1341170l0N.LIZ;
                    Aweme aweme = CommentContextSourceKt.aweme(L5());
                    c1341170l0N.getClass();
                    if (C1341170l0N.LIZ(aweme)) {
                        TextView textView6 = this.LLILZLL;
                        if (textView6 != null) {
                            textView = textView6;
                        }
                        quantityString2 = textView.getContext().getString(2131845759);
                    } else if (C0BTW.LIZ()) {
                        TextView textView7 = this.LLILZLL;
                        if (textView7 != null) {
                            textView2 = textView7;
                        }
                        quantityString2 = textView2.getContext().getResources().getQuantityString(2131756049, (int) j, C1372520low.LIZ(j));
                    } else {
                        TextView textView8 = this.LLILZLL;
                        if (textView8 != null) {
                            textView3 = textView8;
                        }
                        quantityString2 = textView3.getContext().getResources().getQuantityString(2131755136, (int) j, Long.valueOf(j));
                    }
                    textView5.setText(quantityString2);
                } else {
                    TextView textView9 = this.LLILZLL;
                    if (textView9 != null) {
                        textView4 = textView9;
                    }
                    textView4.setText(2131829132);
                }
                T5();
                ReplyCommentLoadNumConfig replyCommentLoadNumConfig = (ReplyCommentLoadNumConfig) C1340880kzu.LIZIZ.getValue();
                if (replyCommentLoadNumConfig != null) {
                    iLIZIZ = replyCommentLoadNumConfig.replyCommentNonFirstPageLoadNum;
                }
                C1340820kzo item = getItem();
                if (item != null && (c1340830kzp2 = item.LLILZ) != null) {
                    if (iLIZIZ <= 0) {
                        iLIZIZ = C292290Bcx.LIZIZ();
                    }
                    c1340830kzp2.LIZLLL = iLIZIZ;
                }
            }
        } else {
            ViewGroup viewGroup5 = this.LLIZLLLIL;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            C786410Ut5.LJLZ(0, viewGroup5);
            TuxIconView tuxIconView4 = this.LLJ;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
            TuxIconView tuxIconView5 = this.LLJI;
            if (tuxIconView5 == null) {
                tuxIconView5 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            View view5 = this.LLJIJIL;
            if (view5 == null) {
                view5 = null;
            }
            C786410Ut5.LJLLLLLL(0, view5);
            LinearLayout linearLayout11 = this.LLIZ;
            if (linearLayout11 == null) {
                linearLayout11 = null;
            }
            linearLayout11.setPaddingRelative(C0HD5.LIZ(this.itemView, 8), linearLayout11.getPaddingTop(), linearLayout11.getPaddingEnd(), linearLayout11.getPaddingBottom());
            LinearLayout linearLayout12 = this.LLILZ;
            if (linearLayout12 == null) {
                linearLayout12 = null;
            }
            C786410Ut5.LJZL(0, linearLayout12);
            C1235900iGa c1235900iGa5 = this.LLILZIL;
            if (c1235900iGa5 == null) {
                c1235900iGa5 = null;
            }
            C786410Ut5.LLLLIIL(c1235900iGa5, 8);
            C786410Ut5.LJLLLLLL(0, N5());
            LinearLayout linearLayout13 = this.LLIZ;
            if (linearLayout13 == null) {
                linearLayout13 = null;
            }
            C786410Ut5.LJZL(8, linearLayout13);
            long j2 = c1340820kzo.LLILZ.LJ - ((long) c1340820kzo.LL);
            TextView textView10 = this.LLILZLL;
            if (textView10 == null) {
                textView10 = null;
            }
            C1341170l0N c1341170l0N2 = C1341170l0N.LIZ;
            Aweme aweme2 = CommentContextSourceKt.aweme(L5());
            c1341170l0N2.getClass();
            if (C1341170l0N.LIZ(aweme2)) {
                TextView textView11 = this.LLILZLL;
                if (textView11 == null) {
                    textView11 = null;
                }
                quantityString = textView11.getContext().getString(2131845759);
            } else if (C0BTW.LIZ()) {
                TextView textView12 = this.LLILZLL;
                if (textView12 == null) {
                    textView12 = null;
                }
                quantityString = textView12.getContext().getResources().getQuantityString(2131756050, (int) j2, C1372520low.LIZ(j2));
            } else {
                TextView textView13 = this.LLILZLL;
                if (textView13 == null) {
                    textView13 = null;
                }
                quantityString = textView13.getContext().getResources().getQuantityString(2131755137, (int) j2, Long.valueOf(j2));
            }
            textView10.setText(quantityString);
            R5(true, false);
            if (!C296020Biy.LIZ()) {
                if (c1340820kzo.LL == 0) {
                    i = 2;
                } else {
                    i = 3;
                }
            }
            C1340350kz3.LJFF(i, N5(), z);
            ViewGroup viewGroup6 = this.LLIZLLLIL;
            if (viewGroup6 == null) {
                viewGroup6 = null;
            }
            C1340350kz3.LJFF(i, viewGroup6, z);
            LinearLayout linearLayout14 = this.LLIZ;
            if (linearLayout14 != null) {
                linearLayout = linearLayout14;
            }
            C1340350kz3.LJFF(i, linearLayout, z);
            T5();
            ReplyCommentLoadNumConfig replyCommentLoadNumConfig2 = (ReplyCommentLoadNumConfig) C1340880kzu.LIZIZ.getValue();
            if (replyCommentLoadNumConfig2 != null) {
                iLIZIZ = replyCommentLoadNumConfig2.replyCommentFirstPageLoadNum;
            }
            C1340820kzo item2 = getItem();
            if (item2 != null && (c1340830kzp = item2.LLILZ) != null) {
                if (iLIZIZ > 0) {
                    i3 = iLIZIZ;
                }
                c1340830kzp.LIZLLL = i3;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentMoreItemCell bind data = ");
        sbLIZ.append(c1340820kzo);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
