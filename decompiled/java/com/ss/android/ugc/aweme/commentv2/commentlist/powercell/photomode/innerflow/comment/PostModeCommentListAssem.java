package com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment;

import X.AbstractC1049450dPr;
import X.AbstractC1906720ziY;
import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0CNO;
import X.C0HD5;
import X.C0HD9;
import X.C0HHT;
import X.C0OAD;
import X.C0Q4Y;
import X.C1196320hEk;
import X.C1209980ham;
import X.C1220000hqw;
import X.C123100dR;
import X.C1284660jXE;
import X.C1308910kAL;
import X.C1340400kz8;
import X.C1340410kz9;
import X.C1340430kzB;
import X.C1340440kzC;
import X.C1340470kzF;
import X.C1343080l3S;
import X.C1343760l4Y;
import X.C1343840l4g;
import X.C1360460lVU;
import X.C1391600mJi;
import X.C13BV;
import X.C13LE;
import X.C14EU;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C20600815jK;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C450720Hlu;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C523420Kfs;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736820SvI;
import X.C737030Svd;
import X.C737910Sx3;
import X.C7839034j;
import X.C786410Ut5;
import X.C888460YtI;
import X.C960203pA;
import X.EnumC1235690iGF;
import X.EnumC1341670l1B;
import X.EnumC1342450l2R;
import X.InterfaceC1343830l4f;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeCellScope;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class PostModeCommentListAssem extends ReusedUIContentAssem<PostModeCommentListAssem> implements InterfaceC712990Rxx<InterfaceC1343830l4f>, ICommentListAssemAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PostModeCommentListAssem.class, "commentListVM", "getCommentListVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/powercell/photomode/innerflow/comment/PhotoModeCommentListAssemVm;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PostModeCommentListAssem.class, "commentDeleteVM", "getCommentDeleteVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentDeleteVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PostModeCommentListAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public PostModeCommentListAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PhotoModeCommentListAssemVm.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 787), null, AFwS259S0000000_21.get$arr$(117));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentDeleteVM.class);
        this.LLJJJJJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 788), null, AFwS259S0000000_21.get$arr$(118));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(203));
        C13LE.LIZ(CommentSyncSharedVM.class);
        AFwS259S0000000_21.get$arr$(119);
        new AwS565S0100000_21((AbstractC738140SxQ) this, 491);
        new C451610HnL(this, true, true);
        new C723700Sa8(this);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(CommentPublishViewModel.class);
        this.LLJJL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ3, c1637906bB, new C452230HoL(c19719912DlLIZ3), new C452250HoN(), (Function0) null, 59));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 490));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void B7() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void CK1() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void GZ(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void JB0(int i) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final C1343080l3S Ki2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void LLJ(int i) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final Map<EnumC1342450l2R, C20600815jK<InterfaceC1891350zJl>> Nk1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void Q10() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void SK0(Comment comment) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void UP2(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void Wm1() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void Xt1(Comment comment, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void Zd2(int i) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void if1() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void kd0(CommentContextSource commentContextSource, View view, boolean z, int i, int i2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = C1558520qew.LJIIL(this).getTree().LJIIIIZZ().getTree().LJIIIIZZ();
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJJJJJIL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJL;
        C1558520qew.LJI(this, PostModeCellScope.class, (CommentDeleteVM) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[1]), ICommentDeleteAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLJIIIIZZ, this, ICommentListAssemAbility.class, null, null);
        C1558520qew.LJI(this, PostModeCellScope.class, cp(), ICommentListVMAbility.class, null, null);
        ((CommentDeleteVM) this.LLJJJJJIL.getValue(this, interfaceC2217461BqaArr[1])).LLILLJJLI = new WeakReference<>(C724240Sb0.LJI(this));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void p21(int i) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void q21() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void qA1(boolean z, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void scrollToPositionWithOffset(int i, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void tq0() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void wV(float f) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final boolean xn2(Boolean bool) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void y40(EnumC1342450l2R enumC1342450l2R) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void yE1(EnumC1341670l1B enumC1341670l1B) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void yY0() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void yz2(long j) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void zE() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final C20600815jK<InterfaceC1891350zJl> ad0() {
        return ((AbstractC1906720ziY) this.LLJJJJLIIL.getValue()).LLILZLL;
    }

    public final PhotoModeCommentListAssemVm cp() {
        return (PhotoModeCommentListAssemVm) this.LLJJJJ.getValue(this, LLJL[0]);
    }

    public final ViewOnAttachStateChangeListenerC20604515jv dp() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final String getAid() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((InterfaceC1343830l4f) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme != null) {
            return aweme.getAid();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void nV1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void onDismiss() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final View Va() {
        return dp();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final List<Comment> XF2() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = dp().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return C13BV.INSTANCE;
        }
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition < 0 || iFindLastCompletelyVisibleItemPosition < 0) {
            return C13BV.INSTANCE;
        }
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd0 = ad0();
        if (c20600815jKAd0 == null) {
            return C13BV.INSTANCE;
        }
        List<InterfaceC1891350zJl> listLJII = c20600815jKAd0.LJII();
        ArrayList<InterfaceC1891350zJl> arrayList = new ArrayList();
        int i = 0;
        for (Object obj : (ArrayList) listLJII) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (iFindFirstCompletelyVisibleItemPosition <= i && i <= iFindLastCompletelyVisibleItemPosition) {
                arrayList.add(obj);
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : arrayList) {
            if ((interfaceC1891350zJl instanceof C1340400kz8) && interfaceC1891350zJl != null) {
                arrayList2.add(interfaceC1891350zJl);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AbstractC1049450dPr) it2.next()).LIZ());
        }
        return arrayList3;
    }

    public final void hp() {
        RelativeLayout relativeLayout;
        View viewFindViewById = LJJIJL().findViewById(R.id.mna);
        if (viewFindViewById != null) {
            View viewLJJIJL = LJJIJL();
            if (!(viewLJJIJL instanceof RelativeLayout) || (relativeLayout = (RelativeLayout) viewLJJIJL) == null) {
                return;
            }
            C786410Ut5.LJJLIIIJ(relativeLayout, viewFindViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void deleteItem(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void ep(String str) {
        Object obj;
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd0;
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd02;
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd03 = ad0();
        Object obj2 = null;
        if (c20600815jKAd03 != null) {
            List<InterfaceC1891350zJl> listLJII = c20600815jKAd03.LJII();
            int i = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) listLJII) {
                if (((interfaceC1891350zJl instanceof C1340430kzB) && Intrinsics.LJFF(((C1340430kzB) interfaceC1891350zJl).LLILZIL.getCid(), str)) || ((interfaceC1891350zJl instanceof C1340440kzC) && Intrinsics.LJFF(((C1340440kzC) interfaceC1891350zJl).LLILZIL.getCid(), str))) {
                    if (i >= 0) {
                        if (i == 0) {
                            if ((ListProtector.get(listLJII, i) instanceof C1340430kzB) && (c20600815jKAd02 = ad0()) != null) {
                                c20600815jKAd02.LJFF(null);
                            }
                        } else if ((ListProtector.get(listLJII, i) instanceof C1340440kzC) && (c20600815jKAd0 = ad0()) != null) {
                            C20600815jK.LJIILIIL(c20600815jKAd0, i);
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        List<Comment> exposeComments = ((InterfaceC1343830l4f) obj).getExposeComments();
        if (!exposeComments.isEmpty()) {
            Comment comment = (Comment) ListProtector.get(exposeComments, 0);
            if (Intrinsics.LJFF(comment.getCid(), str)) {
                exposeComments.clear();
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                ((InterfaceC1343830l4f) obj2).setExposeComments(exposeComments);
                return;
            }
            ArrayList arrayList = new ArrayList(comment.getReplyComments());
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((Comment) it2.next()).getCid(), str)) {
                    if (i2 < 0) {
                        return;
                    }
                    ListProtector.remove(arrayList, 0);
                    comment.setReplyComments(arrayList);
                    long replyCommentTotal = 0;
                    if (comment.getReplyCommentTotal() > 0) {
                        replyCommentTotal = comment.getReplyCommentTotal() - 1;
                    }
                    comment.setReplyCommentTotal(replyCommentTotal);
                    return;
                }
                i2++;
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentRepostBatchClearEvent(C7839034j c7839034j) {
        Object obj;
        String aid;
        String cid;
        Cloneable cloneableLJ;
        Aweme aweme;
        String str = c7839034j.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        InterfaceC1343830l4f interfaceC1343830l4f = (InterfaceC1343830l4f) obj;
        if (interfaceC1343830l4f != null && (aweme = interfaceC1343830l4f.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return;
        }
        PhotoModeCommentListAssemVm photoModeCommentListAssemVmCp = cp();
        String str2 = c7839034j.LIZ;
        C20600815jK<InterfaceC1891350zJl> c20600815jK = photoModeCommentListAssemVmCp.LL;
        if (c20600815jK != null) {
            int i = 0;
            for (Object obj2 : (ArrayList) c20600815jK.LJII()) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj2;
                    if (interfaceC1891350zJl instanceof C1340400kz8) {
                        C1340400kz8 c1340400kz8 = (C1340400kz8) interfaceC1891350zJl;
                        if (c1340400kz8.LIZIZ().LJIL != null && (cid = c1340400kz8.LIZ().getCid()) != null) {
                            C0HD9 c0hd9LJIL = C1360460lVU.LIZIZ.LJIL(str2, cid);
                            if (!Intrinsics.LJFF(c0hd9LJIL, c1340400kz8.LIZIZ().LJIL)) {
                                if (c1340400kz8 instanceof C1340430kzB) {
                                    C1340430kzB c1340430kzB = (C1340430kzB) interfaceC1891350zJl;
                                    cloneableLJ = C1340430kzB.LJ(c1340430kzB, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9LJIL, 12582911));
                                } else if (c1340400kz8 instanceof C1340440kzC) {
                                    C1340440kzC c1340440kzC = (C1340440kzC) interfaceC1891350zJl;
                                    cloneableLJ = C1340440kzC.LJ(c1340440kzC, C1340410kz9.LIZ(c1340440kzC.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9LJIL, 12582911));
                                }
                                if (cloneableLJ != null) {
                                    c20600815jK.LJIILJJIL(i, cloneableLJ);
                                }
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

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentRepostNoteEvent(C1343840l4g c1343840l4g) {
        Object obj;
        Aweme aweme;
        String str = c1343840l4g.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        InterfaceC1343830l4f interfaceC1343830l4f = (InterfaceC1343830l4f) obj;
        if (interfaceC1343830l4f != null && (aweme = interfaceC1343830l4f.getAweme()) != null) {
            aid = aweme.getAid();
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return;
        }
        cp().aV(c1343840l4g.LIZIZ, C1360460lVU.LIZIZ.LJIL(c1343840l4g.LIZ, c1343840l4g.LIZIZ));
    }

    @C14EU
    public final void onEvent(C1209980ham c1209980ham) {
        Object[] objArr;
        Object obj;
        String str;
        if (c1209980ham != null && ad0() != null && c1209980ham.LIZ == 4) {
            Object obj2 = c1209980ham.LIZIZ;
            String aid = null;
            if (!(obj2 instanceof Object[]) || (objArr = (Object[]) obj2) == null || objArr.length != 2) {
                return;
            }
            Object obj3 = objArr[0];
            if ((obj3 instanceof String) && obj3 != null) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Aweme aweme = ((InterfaceC1343830l4f) obj).getAweme();
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                if (!Intrinsics.LJFF(obj3, aid)) {
                    return;
                }
                Object obj4 = objArr[1];
                if ((obj4 instanceof String) && (str = (String) obj4) != null) {
                    ep(str);
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserBlockedEvent(C888460YtI c888460YtI) {
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd0;
        String cid;
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        User user = c888460YtI.LIZ;
        if (user != null && (c20600815jKAd0 = ad0()) != null) {
            List<InterfaceC1891350zJl> listLJII = c20600815jKAd0.LJII();
            ArrayList<InterfaceC1891350zJl> arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : listLJII) {
                InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                if ((interfaceC1891350zJl2 instanceof C1340400kz8) && Intrinsics.LJFF(((AbstractC1049450dPr) interfaceC1891350zJl2).LIZ().getUser().getUid(), user.getUid())) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
            if (!arrayList.isEmpty()) {
                for (InterfaceC1891350zJl interfaceC1891350zJl3 : arrayList) {
                    if ((interfaceC1891350zJl3 instanceof C1340400kz8) && (abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl3) != null && (commentLIZ = abstractC1049450dPr.LIZ()) != null) {
                        cid = commentLIZ.getCid();
                    } else {
                        cid = null;
                    }
                    if (C123100dR.LIZ(cid)) {
                        ep(cid);
                    }
                }
            }
        }
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Object obj;
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!commentServiceLIZ.LJIILLIIL(((InterfaceC1343830l4f) obj).getAweme())) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            if (!C0OAD.LIZIZ(((InterfaceC1343830l4f) obj2).getAweme())) {
                C0CNO.LIZLLL(0L, new AwS422S0200000_21(c737030Svd, this, 34));
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AbstractC21674919sB abstractC21674919sB;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp = dp();
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 0;
        c20603715jn.LIZJ = false;
        viewOnAttachStateChangeListenerC20604515jvDp.setListConfig(c20603715jn);
        ((AbstractC1906720ziY) this.LLJJJJLIIL.getValue()).LLILZLL.LIZLLL = C0Q4Y.BUFFER;
        cp().LL = ((AbstractC1906720ziY) this.LLJJJJLIIL.getValue()).LLILZLL;
        dp().LIZJ((AbstractC1906720ziY) this.LLJJJJLIIL.getValue());
        final Context context = viewOnAttachStateChangeListenerC20604515jvDp.getContext();
        viewOnAttachStateChangeListenerC20604515jvDp.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment.PostModeCommentListAssem$onViewCreated$1$linearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return false;
            }
        });
        AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jvDp.getItemAnimator();
        if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = true;
        }
        AbstractC21673719rz itemAnimator2 = viewOnAttachStateChangeListenerC20604515jvDp.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.LJIJJ(300L);
            itemAnimator2.LJIJJLI(300L);
            itemAnimator2.LJIL(300L);
            itemAnimator2.LJJ(300L);
        }
        C1196320hEk.LIZIZ(dp(), C1558520qew.LJIIL(this));
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJL.getValue();
        subscribe(assemViewModel, C736820SvI.LIZIZ(assemViewModel.usedInReusedScene), null, AFwS305S0000000_21.get$arr$(28));
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(InterfaceC1343830l4f interfaceC1343830l4f) {
        InterfaceC1343830l4f interfaceC1343830l4f2 = interfaceC1343830l4f;
        cp().LLILLJJLI = interfaceC1343830l4f2.getAweme();
        ArrayList arrayList = new ArrayList();
        List<Comment> exposeComments = interfaceC1343830l4f2.getExposeComments();
        PhotoModeCommentListAssemVm photoModeCommentListAssemVmCp = cp();
        photoModeCommentListAssemVmCp.getClass();
        ArrayList arrayList2 = new ArrayList();
        C1340470kzF c1340470kzF = photoModeCommentListAssemVmCp.LLILLL;
        Aweme aweme = photoModeCommentListAssemVmCp.LLILLJJLI;
        if (aweme != null) {
            aweme.getAid();
        }
        c1340470kzF.LJ(exposeComments, arrayList2, false);
        arrayList.addAll(arrayList2);
        ((AbstractC1906720ziY) this.LLJJJJLIIL.getValue()).LLILZLL.LJIILL(arrayList, null);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final boolean tA1(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1343830l4f interfaceC1343830l4f) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1343830l4f interfaceC1343830l4f) {
    }

    @C14EU
    public final void onEvent(C1343760l4Y c1343760l4Y) {
        Object obj;
        if (c1343760l4Y == null) {
            return;
        }
        String str = c1343760l4Y.LIZIZ;
        List<String> list = c1343760l4Y.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((InterfaceC1343830l4f) obj).getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            ep(it2.next());
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility
    public final void Zy0(View view, int i, EnumC1235690iGF enumC1235690iGF) {
        int i2;
        if (view == null) {
            return;
        }
        if (enumC1235690iGF == null) {
            int[] iArr = new int[2];
            dp().getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            if (Math.abs(iArr2[1] - iArr[1]) < C0HD5.LIZ(view, Double.valueOf(52.0d))) {
                enumC1235690iGF = EnumC1235690iGF.BOTTOM;
            } else {
                enumC1235690iGF = EnumC1235690iGF.TOP;
            }
        }
        Context context = getContext();
        if (context != null) {
            if (C960203pA.LIZIZ(context)) {
                i2 = R.attr.acd;
            } else {
                i2 = R.attr.aqm;
            }
            C450720Hlu c450720Hlu = new C450720Hlu(context);
            c450720Hlu.LLILLJJLI.LJII = 3000L;
            c450720Hlu.LJIIJ(i);
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZLLL = enumC1235690iGF;
            c1391600mJi.LIZIZ = view;
            int iIntValue = 0;
            c450720Hlu.LJIIIZ(false, null);
            c450720Hlu.LLILLJJLI.LJIJJ = true;
            c450720Hlu.LIZJ(new AwS598S0100000_19(this, 113));
            c450720Hlu.LJ(new AwS563S0100000_19(this, 786));
            Integer numLIZJ = C1308910kAL.LIZJ(i2, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            c450720Hlu.LJI(iIntValue);
            c450720Hlu.LIZIZ().show();
        }
    }
}
