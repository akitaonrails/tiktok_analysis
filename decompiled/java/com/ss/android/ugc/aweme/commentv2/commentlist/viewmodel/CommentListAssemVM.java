package com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel;

import X.AbstractC1049450dPr;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C0BUL;
import X.C0HD9;
import X.C1075920e6Y;
import X.C10EU;
import X.C1107104Ur;
import X.C1157350gDt;
import X.C1220590hrt;
import X.C1222210huV;
import X.C1222220huW;
import X.C123100dR;
import X.C1340400kz8;
import X.C1340410kz9;
import X.C1340430kzB;
import X.C1340440kzC;
import X.C1340450kzD;
import X.C1340550kzN;
import X.C1340820kzo;
import X.C1341920l1a;
import X.C1342030l1l;
import X.C1342260l28;
import X.C1342360l2I;
import X.C1342380l2K;
import X.C1342400l2M;
import X.C1342440l2Q;
import X.C1342510l2X;
import X.C1342530l2Z;
import X.C1342910l3B;
import X.C1342970l3H;
import X.C1344030l4z;
import X.C1344210l5H;
import X.C1344540l5o;
import X.C1344890l6N;
import X.C1345700l7g;
import X.C1345760l7m;
import X.C1346420l8q;
import X.C1346920l9e;
import X.C1347490lAZ;
import X.C1348690lCV;
import X.C1349280lDS;
import X.C1350920lG6;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1601690rmZ;
import X.C1697810uHb;
import X.C19EG;
import X.C20600815jK;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C295120BhW;
import X.C295480Bi6;
import X.C326990Crp;
import X.C452501pT;
import X.C523420Kfs;
import X.C729510SjV;
import X.C985403tE;
import X.EnumC1341680l1C;
import X.EnumC1342430l2P;
import X.EnumC1342450l2R;
import X.EnumC1342610l2h;
import X.EnumC1346360l8k;
import X.EnumC725960Sdm;
import X.InterfaceC0148002o;
import X.InterfaceC1342370l2J;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737440SwI;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentIntentStruct;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.CommentListModel;
import com.ss.android.ugc.aweme.comment.model.PollInfo;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.util.CommentIntentionCellUtil;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AwS135S1100000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentListAssemVM extends AssemViewModel<C326990Crp> implements ICommentListVMAbility {
    public static final C1342380l2K LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1342260l28 LL = new C1342260l28(new AwS565S0100000_21(this, 502));
    public final C1344210l5H LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final List<C1344210l5H> LLILZLL;
    public boolean LLIZ;
    public WeakReference<Fragment> LLIZLLLIL;
    public InterfaceC665370Q7z LLJ;
    public Aweme LLJI;
    public C20600815jK<InterfaceC1891350zJl> LLJIJIL;
    public C20600815jK<InterfaceC1891350zJl> LLJILJIL;
    public C20600815jK<InterfaceC1891350zJl> LLJILJILJ;
    public boolean LLJILLL;
    public AwS600S0100000_21 LLJJ;
    public final C1342910l3B LLJJI;
    public boolean LLJJIII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0l2K] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentListAssemVM.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = new Object() { // from class: X.0l2K
        };
    }

    public final CommentContextSource AQ2() {
        C1342260l28 c1342260l28 = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return c1342260l28.LIZIZ();
    }

    public final C1344210l5H BQ2() {
        return (C1344210l5H) this.LLILZIL.getValue();
    }

    public final C1344210l5H FQ2() {
        return (C1344210l5H) this.LLILZ.getValue();
    }

    public final C1344210l5H GQ2() {
        return (C1344210l5H) this.LLILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void Gj() {
        getOperator().refresh();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void I71() {
        C1157350gDt c1157350gDt;
        EnumC1342430l2P enumC1342430l2P;
        for (C1344210l5H c1344210l5H : this.LLILZLL) {
            if (c1344210l5H != null && !c1344210l5H.LJIILLIIL() && (c1157350gDt = c1344210l5H.LJIJJ) != null && (enumC1342430l2P = c1157350gDt.LIZ) != null) {
                int i = C1342400l2M.LIZ[enumC1342430l2P.ordinal()];
                if (i == 1) {
                    c1344210l5H.LJJIIZI(EnumC1342430l2P.COMMENT_CLOSE, EnumC1342610l2h.MATCH_PARENT, null);
                } else if (i == 5) {
                    c1344210l5H.LJJIIZI(EnumC1342430l2P.FILTER_STATUS, EnumC1342610l2h.MATCH_PARENT, null);
                } else if (i == 9 || i == 12) {
                    if (c1344210l5H.LJI && ((Number) C1107104Ur.LIZ.getValue()).intValue() == 1) {
                        c1344210l5H.LJJIIZI(EnumC1342430l2P.COMMENT_DISLIKE, EnumC1342610l2h.MATCH_PARENT, null);
                    } else {
                        c1344210l5H.LJJIIZI(EnumC1342430l2P.COMMENT_EMPTY, EnumC1342610l2h.MATCH_PARENT, null);
                    }
                }
            }
        }
    }

    public final void OQ2() {
        getOperator().refresh();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326990Crp(0);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void f70() {
        C1157350gDt c1157350gDt;
        EnumC1342430l2P enumC1342430l2P;
        for (C1344210l5H c1344210l5H : this.LLILZLL) {
            if (c1344210l5H != null && (c1157350gDt = c1344210l5H.LJIJJ) != null && (enumC1342430l2P = c1157350gDt.LIZ) != null) {
                int i = C1342400l2M.LIZ[enumC1342430l2P.ordinal()];
                if (i == 2) {
                    c1344210l5H.LJJIIZI(EnumC1342430l2P.DEFAULT, EnumC1342610l2h.DEFAULT, null);
                } else if (i == 3) {
                    c1344210l5H.LJJIIZI(EnumC1342430l2P.DEFAULT, EnumC1342610l2h.DEFAULT, null);
                } else if (i == 4) {
                    c1344210l5H.LJJIIZI(EnumC1342430l2P.FILTER_FOOTER, EnumC1342610l2h.NORMAL_FOOTER, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void qI0() {
        for (C1344210l5H c1344210l5H : this.LLILZLL) {
            if (c1344210l5H != null) {
                c1344210l5H.LIZIZ.runOnUIThread(new AwS600S0100000_21(c1344210l5H, 216));
            }
        }
    }

    public final void yQ2() {
        C20600815jK<InterfaceC1891350zJl> c20600815jK = this.LLJILJILJ;
        if (c20600815jK != null) {
            c20600815jK.LJIILL(C13BV.INSTANCE, null);
        }
        I71();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0l3B] */
    public CommentListAssemVM() {
        C1344210l5H c1344210l5H = new C1344210l5H(EnumC1342450l2R.DEFAULT_SORT, this);
        this.LLILLJJLI = c1344210l5H;
        this.LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 505));
        this.LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 504));
        this.LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 503));
        this.LLILZLL = C1697810uHb.LJIIJJI(c1344210l5H, GQ2(), FQ2(), BQ2());
        final C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        this.LLJJI = new AbstractC329610Cw3<C1220590hrt>(c20603715jn) { // from class: X.0l3B
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn) {
                EnumC1342450l2R currSortType;
                CommentListAssemVM commentListAssemVM;
                InterfaceC665370Q7z interfaceC665370Q7z;
                Fragment fragment;
                CommentContextSource commentContextSourceAQ2 = this.LIZIZ.AQ2();
                if (commentContextSourceAQ2 != null && CommentContextSourceKt.videoDescOnly(commentContextSourceAQ2)) {
                    return;
                }
                CommentContextSource commentContextSourceAQ22 = this.LIZIZ.AQ2();
                if (commentContextSourceAQ22 != null) {
                    currSortType = commentContextSourceAQ22.getCurrSortType();
                } else {
                    currSortType = null;
                }
                if (currSortType == EnumC1342450l2R.DEFAULT_SORT && (interfaceC665370Q7z = (commentListAssemVM = this.LIZIZ).LLJ) != null) {
                    WeakReference<Fragment> weakReference = commentListAssemVM.LLIZLLLIL;
                    if (weakReference != null) {
                        fragment = weakReference.get();
                    } else {
                        fragment = null;
                    }
                    ICommentExposureAbility iCommentExposureAbilityLIZIZ = C1345760l7m.LIZIZ(fragment, interfaceC665370Q7z);
                    if (iCommentExposureAbilityLIZIZ != null) {
                        iCommentExposureAbilityLIZIZ.reset();
                    }
                }
                this.LIZIZ.DQ2().LJJII(interfaceC1364105Vn, null);
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) throws Exception {
                this.LIZIZ.DQ2().LJJIFFI(interfaceC1364105Vn, (C1220590hrt) obj);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final boolean B9() {
        ICommentPageContainer iCommentPageContainer;
        InterfaceC665370Q7z interfaceC665370Q7z = DQ2().LJIIZILJ;
        if (interfaceC665370Q7z == null || (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7z, ICommentPageContainer.class, null)) == null) {
            return false;
        }
        return iCommentPageContainer.B9();
    }

    public final C1157350gDt CQ2() {
        return DQ2().LJIJJ;
    }

    public final C1344210l5H DQ2() {
        EnumC1342450l2R currSortType;
        CommentContextSource commentContextSourceAQ2 = AQ2();
        if (commentContextSourceAQ2 != null && (currSortType = commentContextSourceAQ2.getCurrSortType()) != null) {
            int i = C1342440l2Q.LIZ[currSortType.ordinal()];
            if (i == 1) {
                return this.LLILLJJLI;
            }
            if (i == 2) {
                C1344210l5H c1344210l5HGQ2 = GQ2();
                return c1344210l5HGQ2 == null ? this.LLILLJJLI : c1344210l5HGQ2;
            }
            if (i == 3) {
                C1344210l5H c1344210l5HFQ2 = FQ2();
                return c1344210l5HFQ2 == null ? this.LLILLJJLI : c1344210l5HFQ2;
            }
            if (i == 4) {
                C1344210l5H c1344210l5HBQ2 = BQ2();
                return c1344210l5HBQ2 == null ? this.LLILLJJLI : c1344210l5HBQ2;
            }
        }
        return this.LLILLJJLI;
    }

    public final boolean EQ2() {
        return DQ2().LJFF;
    }

    public final boolean HQ2() {
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.getClass();
        if (!C1342970l3H.LIZIZ.LJII() || !C1348690lCV.LIZ(c1344210l5HDQ2.LJIILL)) {
            return false;
        }
        Aweme aweme = c1344210l5HDQ2.LJIILL;
        return !C10EU.LJIIZILJ(aweme != null ? AwemeExtKt.getAuthorUid(aweme) : null);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final boolean isLoading() {
        return DQ2().LJIJJLI;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.LJJIJIIJIL.removeMessages(1001);
        c1344210l5HDQ2.LJJIJIIJIL.removeMessages(1002);
    }

    public final void xQ2() {
        if (DQ2().LJIL) {
            return;
        }
        getOperator().LIZ(new C1220590hrt(DQ2().LJII, 0, null, null, null, 0, 62));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void Ak1(String str) {
        String aid;
        PollInfo pollInfo;
        Fragment fragment;
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.getClass();
        if (str.length() != 0) {
            Aweme aweme = c1344210l5HDQ2.LJIILL;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            if (aid.length() != 0 && (pollInfo = ((C1342030l1l) ((AssemViewModel) c1344210l5HDQ2.LJJI.getValue()).getState()).LL.get(aid)) != null && Intrinsics.LJFF(String.valueOf(pollInfo.pollId), str)) {
                ((AssemViewModel) c1344210l5HDQ2.LJJI.getValue()).setStateImmediate(new AwS135S1100000_21(aid, new C1075920e6Y(aid, null, null, 6), 0));
                WeakReference<Fragment> weakReference = c1344210l5HDQ2.LIZIZ.LLIZLLLIL;
                if (weakReference != null && (fragment = weakReference.get()) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                    c1389890mGx.LJIIIZ(2131829097);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final Comment BK(Comment comment) {
        Object next;
        AbstractC1049450dPr abstractC1049450dPr;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = DQ2().LJI();
        if (c20600815jKLJI != null && comment != null) {
            if (comment.getCommentType() != 1) {
                String rootCommentId = comment.getRootCommentId();
                if (rootCommentId != null && C123100dR.LIZ(rootCommentId) && !Intrinsics.LJFF(comment.getRootCommentId(), CardStruct.IStatusCode.DEFAULT)) {
                    String rootCommentId2 = comment.getRootCommentId();
                    Iterator it2 = ((ArrayList) c20600815jKLJI.LJII()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
                            if ((interfaceC1891350zJl instanceof C1340400kz8) && Intrinsics.LJFF(((AbstractC1049450dPr) interfaceC1891350zJl).LIZ().getCid(), rootCommentId2)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) next;
                    if ((interfaceC1891350zJl2 instanceof C1340400kz8) && (abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl2) != null) {
                        return abstractC1049450dPr.LIZ();
                    }
                }
            } else {
                return comment;
            }
        }
        return null;
    }

    public final void JQ2(Aweme aweme) {
        this.LLJI = aweme;
        for (C1344210l5H c1344210l5H : this.LLILZLL) {
            if (c1344210l5H != null) {
                c1344210l5H.LJIILL = aweme;
                c1344210l5H.LIZIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void JT0(String str) {
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.LIZIZ.runOnUIThread(new AwS135S1100000_21(c1344210l5HDQ2, str, 4));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void KD1(C1220590hrt c1220590hrt) {
        if (!DQ2().LJIL) {
            getOperator().LIZ(c1220590hrt);
        }
    }

    public final void LQ2(Integer num) {
        DQ2().LJJIJLIJ = num;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final boolean M62(String str) {
        Object next;
        C1340400kz8 c1340400kz8;
        C1344210l5H c1344210l5HDQ2 = DQ2();
        if (str == null) {
            c1344210l5HDQ2.getClass();
        } else {
            C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = c1344210l5HDQ2.LJI();
            if (c20600815jKLJI != null) {
                Iterator it2 = ((ArrayList) c20600815jKLJI.LJII()).iterator();
                while (true) {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    next = it2.next();
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
                    if (interfaceC1891350zJl instanceof C1340400kz8) {
                        AbstractC1049450dPr abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl;
                        if (Intrinsics.LJFF(abstractC1049450dPr.LIZ().getCid(), str) || Intrinsics.LJFF(abstractC1049450dPr.LIZ().getFakeId(), str)) {
                            break;
                        }
                    }
                }
                if ((next instanceof C1340400kz8) && (c1340400kz8 = (C1340400kz8) next) != null && c1340400kz8.LIZIZ().LJIL != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void MQ2(Integer num) {
        DQ2().LJJIL = num;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void MS0(Comment comment) {
        for (C1344210l5H c1344210l5H : this.LLILZLL) {
            if (c1344210l5H != null) {
                c1344210l5H.LIZIZ.runOnUIThread(new AwS387S0200000_21(c1344210l5H, comment, 46));
            }
        }
    }

    public final void NQ2(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLJ = interfaceC665370Q7z;
        for (C1344210l5H c1344210l5H : this.LLILZLL) {
            if (c1344210l5H != null) {
                c1344210l5H.LJIIZILJ = interfaceC665370Q7z;
                c1344210l5H.LJJIJIL = AQ2();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final int PD(Comment comment) {
        return DQ2().LJII(comment);
    }

    public final void PQ2(String str) {
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI;
        Cloneable cloneableLJ;
        int i = 0;
        if (str != null && str.length() != 0 && (c20600815jKLJI = DQ2().LJI()) != null) {
            for (Object obj : (ArrayList) c20600815jKLJI.LJII()) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if (interfaceC1891350zJl instanceof C1340400kz8) {
                        AbstractC1049450dPr abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl;
                        if (Intrinsics.LJFF(abstractC1049450dPr.LIZ().getCid(), str)) {
                            abstractC1049450dPr.LIZ().setNeedHint(true);
                            if (abstractC1049450dPr instanceof C1340430kzB) {
                                C1340430kzB c1340430kzB = (C1340430kzB) interfaceC1891350zJl;
                                cloneableLJ = C1340430kzB.LJ(c1340430kzB, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, true, 0, 0.0f, null, false, false, false, null, null, 16777151));
                            } else if (abstractC1049450dPr instanceof C1340440kzC) {
                                C1340440kzC c1340440kzC = (C1340440kzC) interfaceC1891350zJl;
                                cloneableLJ = C1340440kzC.LJ(c1340440kzC, C1340410kz9.LIZ(c1340440kzC.LLILZLL, false, true, 0, 0.0f, null, false, false, false, null, null, 16777151));
                            }
                            if (cloneableLJ != null) {
                                c20600815jKLJI.LJIILJJIL(i, cloneableLJ);
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void RI0(EnumC725960Sdm enumC725960Sdm) {
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.getClass();
        if (C1342400l2M.LIZIZ[enumC725960Sdm.ordinal()] == 1 && (((Number) C295480Bi6.LIZ.getValue()).intValue() & 1) == 1) {
            C1344540l5o c1344540l5o = C1344540l5o.LIZ;
            Activity activityLJFF = C2214201BlK.LJFF();
            Aweme aweme = c1344210l5HDQ2.LJIILL;
            c1344540l5o.getClass();
            C1344540l5o.LIZJ(activityLJFF, aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final int fg2(String str) {
        Object next;
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        C1344210l5H c1344210l5HDQ2 = DQ2();
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = c1344210l5HDQ2.LJI();
        if (c20600815jKLJI == null) {
            return -1;
        }
        Iterator it2 = ((ArrayList) c20600815jKLJI.LJII()).iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
            if ((interfaceC1891350zJl instanceof C1340400kz8) && Intrinsics.LJFF(((AbstractC1049450dPr) interfaceC1891350zJl).LIZ().getCid(), str)) {
                break;
            }
        }
        InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) next;
        if (!(interfaceC1891350zJl2 instanceof C1340400kz8) || (abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl2) == null || (commentLIZ = abstractC1049450dPr.LIZ()) == null) {
            return -1;
        }
        return c1344210l5HDQ2.LJII(commentLIZ);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void qZ0(String str) {
        String uid;
        User user;
        for (C1344210l5H c1344210l5H : this.LLILZLL) {
            if (c1344210l5H != null) {
                Comment comment = c1344210l5H.LJIILLIIL;
                if (comment != null && (user = comment.getUser()) != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(str, uid)) {
                    c1344210l5H.LJIILLIIL = null;
                }
            }
        }
    }

    public final void wQ2(CommentItemList commentItemList) {
        if (!C1344890l6N.LIZIZ()) {
            return;
        }
        PollInfo pollInfo = commentItemList.pollInfo;
        AwS600S0100000_21 awS600S0100000_21 = this.LLJJ;
        if (awS600S0100000_21 != null) {
            awS600S0100000_21.invoke(pollInfo);
        }
        if (pollInfo == null) {
            yQ2();
        } else {
            vQ2(this, pollInfo, 0, null, 6);
        }
    }

    public final void zQ2(C1340820kzo c1340820kzo) {
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI;
        String str;
        C1340820kzo c1340820kzo2;
        String cid;
        CommentIntentStruct intentStruct;
        Fragment fragment;
        String str2;
        CommentContextSource commentContextSource;
        CommentListModel listModel;
        String cid2;
        Fragment fragment2;
        Aweme aweme;
        String aid;
        C1340820kzo c1340820kzo3;
        boolean zLJI = MethodIDManager.LJI(196657);
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.getClass();
        Fragment fragment3 = null;
        if (c1340820kzo != null) {
            C1342970l3H.LIZJ = c1340820kzo;
            if (!C1342970l3H.LIZIZ.LIZLLL(C1342970l3H.LJ, new WeakReference(C2214201BlK.LJFF())) && (c20600815jKLJI = c1344210l5HDQ2.LJI()) != null) {
                String str3 = c1340820kzo.LLILLJJLI;
                Map<String, C1222220huW> map = C1222210huV.LIZ;
                int iLJIILL = 0;
                if (((LinkedHashMap) map).get(str3) == null) {
                    C1222220huW c1222220huW = new C1222220huW(System.currentTimeMillis());
                    c1222220huW.LIZIZ = false;
                    map.put(str3, c1222220huW);
                }
                int i = c1340820kzo.LLILZ.LIZLLL;
                int i2 = c1340820kzo.LL;
                if (i2 < 0) {
                    i2 = 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clickViewMoreButton ");
                sbLIZ.append(c1340820kzo);
                C1344030l4z.LIZJ("CommentSortListVM", C2188811AlT.LIZIZ(sbLIZ));
                int i3 = -1;
                if (((ArrayList) c1340820kzo.LLILZ.LIZJ).size() > i2) {
                    int i4 = i + i2;
                    int size = ((ArrayList) c1340820kzo.LLILZ.LIZJ).size();
                    if (i4 > size) {
                        i4 = size;
                    }
                    List listSubList = ((ArrayList) c1340820kzo.LLILZ.LIZJ).subList(i2, i4);
                    Iterator it2 = ((ArrayList) c20600815jKLJI.LJII()).iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                        if ((interfaceC1891350zJl instanceof C1340820kzo) && (c1340820kzo3 = (C1340820kzo) interfaceC1891350zJl) != null) {
                            str2 = c1340820kzo3.LLILLJJLI;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str2, c1340820kzo.LLILLJJLI)) {
                            if (i5 >= 0) {
                                C1340820kzo c1340820kzoLIZIZ = C1340820kzo.LIZIZ(c1340820kzo, i4, 0, 30);
                                ArrayList arrayList = new ArrayList(C1344210l5H.LJIIJJI(listSubList));
                                CommentContextSource commentContextSource2 = c1344210l5HDQ2.LJJIJIL;
                                if (commentContextSource2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSource2)) != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                                    C1344210l5H.LJFF(aid, arrayList);
                                }
                                c1344210l5HDQ2.LIZ(arrayList, c1340820kzoLIZIZ);
                                arrayList.size();
                                InterfaceC665370Q7z interfaceC665370Q7z = c1344210l5HDQ2.LJIIZILJ;
                                if (interfaceC665370Q7z != null) {
                                    WeakReference<Fragment> weakReference = c1344210l5HDQ2.LIZIZ.LLIZLLLIL;
                                    if (weakReference != null) {
                                        fragment2 = weakReference.get();
                                    } else {
                                        fragment2 = null;
                                    }
                                    ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(fragment2, interfaceC665370Q7z);
                                    if (iCommentListAssemAbilityLIZLLL != null) {
                                        iCommentListAssemAbilityLIZLLL.JB0(2);
                                    }
                                }
                                c20600815jKLJI.LJIILJJIL(i5, c1340820kzoLIZIZ);
                                C20600815jK.LJ(c20600815jKLJI, i5, arrayList);
                                C1222210huV.LIZ(c1340820kzo.LLILLJJLI, true);
                                if (C1601690rmZ.LIZJ() && (commentContextSource = c1344210l5HDQ2.LJJIJIL) != null && (listModel = commentContextSource.getListModel()) != null) {
                                    Comment comment = (Comment) C13LP.LJJJLL(listSubList);
                                    if (comment != null) {
                                        cid2 = comment.getCid();
                                    } else {
                                        cid2 = null;
                                    }
                                    listModel.setNeedPerformAccessibilityCid(cid2);
                                }
                                c1344210l5HDQ2.LJJIZ(false);
                                c1344210l5HDQ2.LJIL(c1340820kzo, c1340820kzo.LLILZ.LJ - ((long) i2));
                            }
                        } else {
                            i5++;
                        }
                    }
                    C1222210huV.LIZ.remove(c1340820kzo.LLILLJJLI);
                } else {
                    Iterator it3 = ((ArrayList) c20600815jKLJI.LJII()).iterator();
                    int i6 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) it3.next();
                        if ((interfaceC1891350zJl2 instanceof C1340820kzo) && (c1340820kzo2 = (C1340820kzo) interfaceC1891350zJl2) != null) {
                            str = c1340820kzo2.LLILLJJLI;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, c1340820kzo.LLILLJJLI)) {
                            i3 = i6;
                            break;
                        }
                        i6++;
                    }
                    C1340820kzo c1340820kzoLIZIZ2 = C1340820kzo.LIZIZ(c1340820kzo, 0, 3, 27);
                    if (i3 < 0) {
                        C1222210huV.LIZ.remove(c1340820kzo.LLILLJJLI);
                    } else {
                        c20600815jKLJI.LJIILJJIL(i3, c1340820kzoLIZIZ2);
                        c1344210l5HDQ2.LJ(c1340820kzo, false);
                        if (C295120BhW.LIZ()) {
                            Comment comment2 = c1340820kzo.LLILZ.LJI;
                            CommentIntentionCellUtil commentIntentionCellUtil = CommentIntentionCellUtil.LL;
                            InterfaceC665370Q7z interfaceC665370Q7z2 = c1344210l5HDQ2.LJIIZILJ;
                            CommentContextSource commentContextSource3 = c1344210l5HDQ2.LJJIJIL;
                            if (comment2 != null) {
                                cid = comment2.getCid();
                                intentStruct = comment2.getIntentStruct();
                                iLJIILL = C1345700l7g.LJIILL(comment2, c20600815jKLJI);
                            } else {
                                cid = null;
                                intentStruct = null;
                            }
                            int i7 = iLJIILL + 1;
                            WeakReference<Fragment> weakReference2 = c1344210l5HDQ2.LIZIZ.LLIZLLLIL;
                            if (weakReference2 != null) {
                                fragment = weakReference2.get();
                            } else {
                                fragment = null;
                            }
                            commentIntentionCellUtil.getClass();
                            CommentIntentionCellUtil.LJIIIIZZ(interfaceC665370Q7z2, commentContextSource3, cid, intentStruct, i7, "view_comment_details", "", fragment);
                        }
                    }
                }
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7z3 = this.LLJ;
        if (interfaceC665370Q7z3 != null) {
            WeakReference<Fragment> weakReference3 = this.LLIZLLLIL;
            if (weakReference3 != null) {
                fragment3 = weakReference3.get();
            }
            ICommentListAssemAbility iCommentListAssemAbilityLIZLLL2 = C1345760l7m.LIZLLL(fragment3, interfaceC665370Q7z3);
            if (iCommentListAssemAbilityLIZLLL2 != null) {
                iCommentListAssemAbilityLIZLLL2.qA1(true, true);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void AL(Context context, String str) {
        CommentContextSource commentContextSource;
        Aweme aweme;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI;
        Boolean boolValueOf;
        Object next;
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        C19EG c19egLIZIZ;
        Fragment fragment;
        String strEventType;
        String strEnterMethod;
        String strFromPage;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        EnumC1346360l8k enumC1346360l8k;
        CommentKeyboardModel keyboardModel;
        CommentKeyboardModel keyboardModel2;
        CommentKeyboardModel keyboardModel3;
        String cid;
        AbstractC1049450dPr abstractC1049450dPr2;
        Comment commentLIZ2;
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.getClass();
        if (str != null && (commentContextSource = c1344210l5HDQ2.LJJIJIL) != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null && (c20600815jKLJI = c1344210l5HDQ2.LJI()) != null) {
            Iterator it2 = ((ArrayList) c20600815jKLJI.LJII()).iterator();
            while (true) {
                boolValueOf = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
                    if ((interfaceC1891350zJl instanceof C1340400kz8) && (abstractC1049450dPr2 = (AbstractC1049450dPr) interfaceC1891350zJl) != null && (commentLIZ2 = abstractC1049450dPr2.LIZ()) != null) {
                        cid = commentLIZ2.getCid();
                    } else {
                        cid = null;
                    }
                    if (Intrinsics.LJFF(cid, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) next;
            if (interfaceC1891350zJl2 != null && (interfaceC1891350zJl2 instanceof C1340400kz8) && (abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl2) != null && (commentLIZ = abstractC1049450dPr.LIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                CommentService.LIZ.getClass();
                CommentService commentServiceLIZ = C523420Kfs.LIZ();
                WeakReference<Fragment> weakReference = c1344210l5HDQ2.LIZIZ.LLIZLLLIL;
                if (weakReference != null) {
                    fragment = weakReference.get();
                } else {
                    fragment = null;
                }
                CommentContextSource commentContextSource2 = c1344210l5HDQ2.LJJIJIL;
                if (commentContextSource2 != null) {
                    strEventType = CommentContextSourceKt.eventType(commentContextSource2);
                } else {
                    strEventType = null;
                }
                CommentContextSource commentContextSource3 = c1344210l5HDQ2.LJJIJIL;
                if (commentContextSource3 != null) {
                    strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSource3);
                } else {
                    strEnterMethod = null;
                }
                CommentContextSource commentContextSource4 = c1344210l5HDQ2.LJJIJIL;
                if (commentContextSource4 != null) {
                    strFromPage = CommentContextSourceKt.fromPage(commentContextSource4);
                } else {
                    strFromPage = null;
                }
                CommentContextSource commentContextSource5 = c1344210l5HDQ2.LJJIJIL;
                if (commentContextSource5 != null && (keyboardModel3 = commentContextSource5.getKeyboardModel()) != null) {
                    boolValueOf2 = Boolean.valueOf(keyboardModel3.isLandscapeMode());
                } else {
                    boolValueOf2 = null;
                }
                boolean zLIZJ = C1346420l8q.LIZJ(boolValueOf2);
                CommentContextSource commentContextSource6 = c1344210l5HDQ2.LJJIJIL;
                if (commentContextSource6 != null && (keyboardModel2 = commentContextSource6.getKeyboardModel()) != null) {
                    boolValueOf3 = Boolean.valueOf(keyboardModel2.getForceDisableExposedEmoji());
                } else {
                    boolValueOf3 = null;
                }
                boolean zLIZJ2 = C1346420l8q.LIZJ(boolValueOf3);
                CommentContextSource commentContextSource7 = c1344210l5HDQ2.LJJIJIL;
                if (commentContextSource7 != null && (keyboardModel = commentContextSource7.getKeyboardModel()) != null) {
                    boolValueOf = Boolean.valueOf(keyboardModel.getForceDisableMention());
                }
                boolean zLIZJ3 = C1346420l8q.LIZJ(boolValueOf);
                if (Intrinsics.LJFF(CommentContextSourceKt.fromPage(c1344210l5HDQ2.LJJIJIL), "graphic_detail")) {
                    enumC1346360l8k = EnumC1346360l8k.POST_MODE_FULL_PAGE;
                } else {
                    enumC1346360l8k = EnumC1346360l8k.COMMENT_PANEL;
                }
                InterfaceC737440SwI interfaceC737440SwILJLJJL = commentServiceLIZ.LJLJJL(c19egLIZIZ, fragment, aweme, commentLIZ, strEventType, strEnterMethod, strFromPage, new C1346920l9e(false, zLIZJ, false, false, zLIZJ2, zLIZJ3, enumC1346360l8k, 0, EnumC1341680l1C.TEXT, false, null, false), c1344210l5HDQ2.LJJIJIL);
                if (interfaceC737440SwILJLJJL != null) {
                    interfaceC737440SwILJLJJL.e6(new AwS412S0200000_11(c19egLIZIZ, aweme, 46));
                    interfaceC737440SwILJLJJL.sp(new AwS412S0200000_11(c19egLIZIZ, aweme, 45));
                }
            }
        }
    }

    public final CharSequence IQ2(Context context, EnumC1342430l2P enumC1342430l2P) {
        int i;
        CommentListModel listModel;
        String string;
        Aweme aweme;
        Story story;
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.getClass();
        Long lValueOf = null;
        String authorUid = null;
        String authorUid2 = null;
        lValueOf = null;
        switch (C1342400l2M.LIZ[enumC1342430l2P.ordinal()]) {
            case 1:
                Aweme aweme2 = c1344210l5HDQ2.LJIILL;
                if (aweme2 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme2);
                }
                if (C10EU.LJIIZILJ(authorUid)) {
                    string = context.getString(2131829191);
                } else if (C729510SjV.LJJIJIL(c1344210l5HDQ2.LJIILL) && (aweme = c1344210l5HDQ2.LJIILL) != null && (story = aweme.getStory()) != null && StoryKt.isStoryV2(story)) {
                    string = context.getString(2131830722);
                } else {
                    string = context.getString(2131829236);
                }
                return C1349280lDS.LJII(c1344210l5HDQ2.LJIILL, string);
            case 2:
                if (!C1348690lCV.LIZ(c1344210l5HDQ2.LJIILL)) {
                    return context.getResources().getString(2131829188);
                }
                Aweme aweme3 = c1344210l5HDQ2.LJIILL;
                if (aweme3 != null) {
                    authorUid2 = AwemeExtKt.getAuthorUid(aweme3);
                }
                if (C10EU.LJIIZILJ(authorUid2)) {
                    return context.getString(2131829188);
                }
                Aweme aweme4 = c1344210l5HDQ2.LJIILL;
                if (aweme4 != null && AwemeExtKt.isPhotoMode(aweme4)) {
                    return context.getString(2131829172);
                }
                return context.getString(2131829185);
            case 3:
                return context.getString(2131829039);
            case 4:
            case 5:
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    Aweme aweme5 = c1344210l5HDQ2.LJIILL;
                    int i2 = c1344210l5HDQ2.LJIIIZ;
                    int i3 = c1344210l5HDQ2.LJIIJ;
                    CommentContextSource commentContextSource = c1344210l5HDQ2.LJJIJIL;
                    if (commentContextSource != null && (listModel = commentContextSource.getListModel()) != null) {
                        lValueOf = Long.valueOf(listModel.getCommentCount());
                    }
                    return C1347490lAZ.LIZ(activityLIZ, aweme5, i2, i3, C1346420l8q.LJFF(lValueOf), null);
                }
                return "";
            case 6:
                if (((Number) C0BUL.LIZ.getValue()).intValue() == 2) {
                    i = 2131836751;
                } else {
                    i = 2131845625;
                }
                return context.getString(i);
            default:
                return context.getString(2131829188);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void K21(final InterfaceC1342370l2J interfaceC1342370l2J, final Fragment fragment) {
        String aid;
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.getClass();
        C1342360l2I c1342360l2I = C1342360l2I.LIZ;
        CommentListAssemVM commentListAssemVM = c1344210l5HDQ2.LIZIZ;
        Aweme aweme = c1344210l5HDQ2.LJIILL;
        final AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(c1344210l5HDQ2, 206);
        final C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = c1344210l5HDQ2.LJI();
        String strEventType = CommentContextSourceKt.eventType(c1344210l5HDQ2.LJJIJIL);
        c1342360l2I.getClass();
        interfaceC1342370l2J.LIZLLL(false);
        final MutableLiveData mutableLiveDataLIZJ = interfaceC1342370l2J.LIZJ();
        if (mutableLiveDataLIZJ != null) {
            mutableLiveDataLIZJ.observe(commentListAssemVM, new Observer<C1342530l2Z>() { // from class: X.0l2W
                @Override // androidx.lifecycle.Observer
                public final void onChanged(C1342530l2Z c1342530l2Z) {
                    String cid;
                    C1340430kzB c1340430kzB;
                    C1340430kzB c1340430kzB2;
                    Comment comment;
                    EnumC1342540l2a enumC1342540l2a = c1342530l2Z.LIZ;
                    if (enumC1342540l2a == EnumC1342540l2a.SUCCESS) {
                        Comment comment2 = interfaceC1342370l2J.getComment();
                        comment2.setAuthorPin(false);
                        C20600815jK<InterfaceC1891350zJl> c20600815jK = c20600815jKLJI;
                        if (c20600815jK != null) {
                            for (Object obj : (ArrayList) c20600815jK.LJII()) {
                                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                                if ((interfaceC1891350zJl instanceof C1340430kzB) && (c1340430kzB2 = (C1340430kzB) interfaceC1891350zJl) != null && (comment = c1340430kzB2.LLILZIL) != null) {
                                    cid = comment.getCid();
                                } else {
                                    cid = null;
                                }
                                if (Intrinsics.LJFF(cid, comment2.getCid())) {
                                    if ((obj instanceof C1340430kzB) && (c1340430kzB = (C1340430kzB) obj) != null) {
                                        c20600815jK.LJIILJJIL(((ArrayList) c20600815jK.LJII()).indexOf(c1340430kzB), C1340430kzB.LJ(c1340430kzB, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, null, 16777087)));
                                    }
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        awS600S0100000_21.invoke(null);
                        interfaceC1342370l2J.LIZ(false);
                        C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                        c1389890mGx.LJIIIZ(2131829242);
                        c1389890mGx.LJIIJJI();
                    } else if (enumC1342540l2a == EnumC1342540l2a.FAIL) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(fragment);
                        c1389890mGx2.LJIIIZ(2131829240);
                        c1389890mGx2.LJIIJJI();
                    }
                    interfaceC1342370l2J.LJJJJL();
                    mutableLiveDataLIZJ.removeObserver(this);
                }
            });
            Comment comment = interfaceC1342370l2J.getComment();
            String authorUid = null;
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            }
            String str = "";
            if (authorUid == null) {
                authorUid = "";
            }
            if (aweme != null && (aid = aweme.getAid()) != null) {
                str = aid;
            }
            C1350920lG6.LJJJJL(false, comment, strEventType, authorUid, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0194  */
    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MV(java.util.List r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM.MV(java.util.List, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void Qy1(InterfaceC1342370l2J interfaceC1342370l2J, Fragment fragment) {
        String aid;
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.getClass();
        C1342360l2I c1342360l2I = C1342360l2I.LIZ;
        CommentListAssemVM commentListAssemVM = c1344210l5HDQ2.LIZIZ;
        Comment comment = c1344210l5HDQ2.LJIILLIIL;
        final Aweme aweme = c1344210l5HDQ2.LJIILL;
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(c1344210l5HDQ2, 215);
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = c1344210l5HDQ2.LJI();
        final String strEventType = CommentContextSourceKt.eventType(c1344210l5HDQ2.LJJIJIL);
        if (comment != null) {
            c1342360l2I.getClass();
            Context context = fragment.getContext();
            if (context != null) {
                Resources resources = fragment.getResources();
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJI(resources.getString(2131829199));
                c1397580mTM.LIZIZ(resources.getString(2131829198));
                C985403tE.LIZ(c1397580mTM, new C1342510l2X(resources, commentListAssemVM, comment, interfaceC1342370l2J, aweme, awS600S0100000_21, c20600815jKLJI, fragment, strEventType));
                c1397580mTM.LJ = new DialogInterface.OnCancelListener() { // from class: X.0THU
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        String aid2;
                        String str = strEventType;
                        Aweme aweme2 = aweme;
                        String authorUid = null;
                        if (aweme2 != null) {
                            authorUid = AwemeExtKt.getAuthorUid(aweme2);
                        }
                        String str2 = "";
                        if (authorUid == null) {
                            authorUid = "";
                        }
                        Aweme aweme3 = aweme;
                        if (aweme3 != null && (aid2 = aweme3.getAid()) != null) {
                            str2 = aid2;
                        }
                        C1350920lG6.LJII(str, "cancel", authorUid, str2);
                    }
                };
                new C1397510mTF(c1397580mTM).LIZLLL();
                String authorUid = null;
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                }
                String str = "";
                if (authorUid == null) {
                    authorUid = "";
                }
                if (aweme != null && (aid = aweme.getAid()) != null) {
                    str = aid;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", strEventType);
                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                c2344009Gk.LJIIIIZZ("group_id", str);
                C1350920lG6.LJJJ(c2344009Gk, "pin_comment_popup_show");
                return;
            }
            return;
        }
        c1342360l2I.getClass();
        C1342360l2I.LIZ(commentListAssemVM, comment, interfaceC1342370l2J, false, aweme, awS600S0100000_21, c20600815jKLJI, fragment, strEventType);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void Vi1(Comment comment, String str) {
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI;
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        AbstractC1049450dPr abstractC1049450dPr2;
        Comment commentLIZ2;
        for (C1344210l5H c1344210l5H : this.LLILZLL) {
            if (c1344210l5H != null && (c20600815jKLJI = c1344210l5H.LJI()) != null) {
                int i = 0;
                for (InterfaceC1891350zJl interfaceC1891350zJl : c20600815jKLJI.LJII()) {
                    int i2 = i + 1;
                    String cid = null;
                    if (i >= 0) {
                        InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                        boolean z = interfaceC1891350zJl2 instanceof C1340400kz8;
                        if (z && (abstractC1049450dPr2 = (AbstractC1049450dPr) interfaceC1891350zJl2) != null && (commentLIZ2 = abstractC1049450dPr2.LIZ()) != null) {
                            cid = commentLIZ2.getCid();
                        }
                        if (Intrinsics.LJFF(cid, str) && z && (abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl2) != null && (commentLIZ = abstractC1049450dPr.LIZ()) != null) {
                            commentLIZ.setUserDigged(comment.getUserDigged());
                            commentLIZ.setDiggCount(comment.getDiggCount());
                            commentLIZ.isAuthorDigged = comment.isAuthorDigged;
                            commentLIZ.setUserBuried(comment.getUserBuried());
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void aV(String str, C0HD9 c0hd9) {
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI;
        C1340400kz8 c1340400kz8LJ;
        for (C1344210l5H c1344210l5H : this.LLILZLL) {
            if (c1344210l5H != null) {
                int i = 0;
                if (str != null && str.length() != 0 && (c20600815jKLJI = c1344210l5H.LJI()) != null) {
                    for (Object obj : (ArrayList) c20600815jKLJI.LJII()) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                            if (interfaceC1891350zJl instanceof C1340400kz8) {
                                AbstractC1049450dPr abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl;
                                if (Intrinsics.LJFF(abstractC1049450dPr.LIZ().getCid(), str) || Intrinsics.LJFF(abstractC1049450dPr.LIZ().getFakeId(), str)) {
                                    if (abstractC1049450dPr instanceof C1340430kzB) {
                                        C1340430kzB c1340430kzB = (C1340430kzB) interfaceC1891350zJl;
                                        c1340400kz8LJ = C1340430kzB.LJ(c1340430kzB, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9, 12582911));
                                    } else if (abstractC1049450dPr instanceof C1340440kzC) {
                                        C1340440kzC c1340440kzC = (C1340440kzC) interfaceC1891350zJl;
                                        c1340400kz8LJ = C1340440kzC.LJ(c1340440kzC, C1340410kz9.LIZ(c1340440kzC.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9, 12582911));
                                    } else if (abstractC1049450dPr instanceof C1340450kzD) {
                                        C1340450kzD c1340450kzD = (C1340450kzD) interfaceC1891350zJl;
                                        c1340400kz8LJ = C1340450kzD.LIZLLL(c1340450kzD, C1340410kz9.LIZ(c1340450kzD.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9, 12582911));
                                    }
                                    if (c1340400kz8LJ != null) {
                                        c20600815jKLJI.LJIILJJIL(i, c1340400kz8LJ);
                                    }
                                }
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0008, code lost:
    
        continue;
     */
    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cE1(java.lang.String r21, boolean r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM.cE1(java.lang.String, boolean):void");
    }

    public static void KQ2(CommentListAssemVM commentListAssemVM, EnumC1342430l2P enumC1342430l2P, EnumC1342610l2h enumC1342610l2h, boolean z) {
        if (z) {
            commentListAssemVM.LLILLJJLI.LJJIIZI(enumC1342430l2P, enumC1342610l2h, null);
            C1344210l5H c1344210l5HGQ2 = commentListAssemVM.GQ2();
            if (c1344210l5HGQ2 != null) {
                c1344210l5HGQ2.LJJIIZI(enumC1342430l2P, enumC1342610l2h, null);
                return;
            }
            return;
        }
        commentListAssemVM.DQ2().LJJIIZI(enumC1342430l2P, enumC1342610l2h, null);
    }

    public static void vQ2(CommentListAssemVM commentListAssemVM, PollInfo pollInfo, int i, Long l, int i2) {
        boolean z = false;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        commentListAssemVM.getClass();
        int i3 = pollInfo.pollStatus;
        if (i3 != 3 && i3 != 4) {
            C20600815jK<InterfaceC1891350zJl> c20600815jK = commentListAssemVM.LLJILJILJ;
            if (c20600815jK != null) {
                c20600815jK.LJIILL(Collections.singletonList(new C1341920l1a(pollInfo, i, l, null)), null);
            }
            if (z) {
                commentListAssemVM.f70();
                return;
            }
            return;
        }
        commentListAssemVM.yQ2();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void aX1(Comment comment, String str, Context context, int i, float f, boolean z) {
        C1344210l5H c1344210l5HDQ2 = DQ2();
        c1344210l5HDQ2.LIZIZ.runOnUIThread(new C1340550kzN(comment, context, i, f, z, str, c1344210l5HDQ2));
    }
}
