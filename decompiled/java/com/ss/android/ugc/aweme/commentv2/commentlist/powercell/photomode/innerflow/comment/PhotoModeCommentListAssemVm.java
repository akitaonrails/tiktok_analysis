package com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment;

import X.AbstractC1049450dPr;
import X.C0HD9;
import X.C0O1Y;
import X.C1220590hrt;
import X.C1340400kz8;
import X.C1340410kz9;
import X.C1340430kzB;
import X.C1340440kzC;
import X.C1340470kzF;
import X.C1340820kzo;
import X.C1697810uHb;
import X.C20600815jK;
import X.C291001Au;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1342370l2J;
import X.InterfaceC1343830l4f;
import X.InterfaceC1891350zJl;
import X.InterfaceC738070SxJ;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoModeCommentListAssemVm extends AssemViewModel<C0O1Y> implements ICommentListVMAbility, InterfaceC738070SxJ<C0O1Y, InterfaceC1343830l4f> {
    public C20600815jK<InterfaceC1891350zJl> LL;
    public Aweme LLILLJJLI;
    public final C1340470kzF LLILLL = new C1340470kzF();

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void AL(Context context, String str) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void Ak1(String str) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final boolean B9() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final Comment BK(Comment comment) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void Gj() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void I71() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void JT0(String str) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void K21(InterfaceC1342370l2J interfaceC1342370l2J, Fragment fragment) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void KD1(C1220590hrt c1220590hrt) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void MS0(Comment comment) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void MV(List list, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void Qy1(InterfaceC1342370l2J interfaceC1342370l2J, Fragment fragment) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void Vi1(Comment comment, String str) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void aX1(Comment comment, String str, Context context, int i, float f, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void cE1(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void f70() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final boolean isLoading() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void qI0() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void qZ0(String str) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0O1Y(0);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final boolean M62(String str) {
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        InterfaceC1891350zJl next;
        C1340400kz8 c1340400kz8;
        if (str == null || (c20600815jK = this.LL) == null) {
            return false;
        }
        Iterator<InterfaceC1891350zJl> it2 = c20600815jK.LJII().iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            InterfaceC1891350zJl interfaceC1891350zJl = next;
            if (interfaceC1891350zJl instanceof C1340400kz8) {
                AbstractC1049450dPr abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl;
                if (Intrinsics.LJFF(abstractC1049450dPr.LIZ().getCid(), str) || Intrinsics.LJFF(abstractC1049450dPr.LIZ().getFakeId(), str)) {
                    break;
                }
            }
        }
        if (!(next instanceof C1340400kz8) || (c1340400kz8 = (C1340400kz8) next) == null || c1340400kz8.LIZIZ().LJIL == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final int PD(Comment comment) {
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        C1340440kzC c1340440kzC;
        Comment comment2;
        if (comment == null || (c20600815jK = this.LL) == null) {
            return -1;
        }
        int i = 0;
        if (comment.getCommentType() == 2) {
            int i2 = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) c20600815jK.LJII()) {
                if ((interfaceC1891350zJl instanceof C1340400kz8) && Intrinsics.LJFF(((AbstractC1049450dPr) interfaceC1891350zJl).LIZ().getCid(), comment.getRootCommentId())) {
                    if (i2 == -1) {
                        return -1;
                    }
                    int iLJIIIIZZ = c20600815jK.LJIIIIZZ() - 1;
                    for (int i3 = i2 + 1; i3 < iLJIIIIZZ; i3++) {
                        InterfaceC1891350zJl interfaceC1891350zJlLJI = c20600815jK.LJI(i3);
                        String cid = null;
                        if ((interfaceC1891350zJlLJI instanceof C1340440kzC) && (c1340440kzC = (C1340440kzC) interfaceC1891350zJlLJI) != null && (comment2 = c1340440kzC.LLILZIL) != null) {
                            cid = comment2.getCid();
                        }
                        if (Intrinsics.LJFF(cid, comment.getCid())) {
                            return (i3 - i2) - 1;
                        }
                        if (c20600815jK.LJI(i3) instanceof C1340820kzo) {
                            return -1;
                        }
                    }
                    return -1;
                }
                i2++;
            }
            return -1;
        }
        List<InterfaceC1891350zJl> listLJII = c20600815jK.LJII();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl2 : listLJII) {
            if (interfaceC1891350zJl2 instanceof C1340400kz8) {
                arrayList.add(interfaceC1891350zJl2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(obj instanceof C1340440kzC)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((AbstractC1049450dPr) it2.next()).LIZ().getCid(), comment.getCid())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final int fg2(String str) {
        InterfaceC1891350zJl next;
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        C20600815jK<InterfaceC1891350zJl> c20600815jK = this.LL;
        if (c20600815jK == null) {
            return -1;
        }
        Iterator<InterfaceC1891350zJl> it2 = c20600815jK.LJII().iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            InterfaceC1891350zJl interfaceC1891350zJl = next;
            if ((interfaceC1891350zJl instanceof C1340400kz8) && Intrinsics.LJFF(((AbstractC1049450dPr) interfaceC1891350zJl).LIZ().getCid(), str)) {
                break;
            }
        }
        InterfaceC1891350zJl interfaceC1891350zJl2 = next;
        if (!(interfaceC1891350zJl2 instanceof C1340400kz8) || (abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl2) == null || (commentLIZ = abstractC1049450dPr.LIZ()) == null) {
            return -1;
        }
        return PD(commentLIZ);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility
    public final void aV(String str, C0HD9 c0hd9) {
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        Cloneable cloneableLJ;
        int i = 0;
        if (str != null && str.length() != 0 && (c20600815jK = this.LL) != null) {
            for (Object obj : (ArrayList) c20600815jK.LJII()) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if (interfaceC1891350zJl instanceof C1340400kz8) {
                        AbstractC1049450dPr abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl;
                        if (Intrinsics.LJFF(abstractC1049450dPr.LIZ().getCid(), str)) {
                            if (abstractC1049450dPr instanceof C1340430kzB) {
                                C1340430kzB c1340430kzB = (C1340430kzB) interfaceC1891350zJl;
                                cloneableLJ = C1340430kzB.LJ(c1340430kzB, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9, 12582911));
                            } else {
                                if (!(abstractC1049450dPr instanceof C1340440kzC)) {
                                    return;
                                }
                                C1340440kzC c1340440kzC = (C1340440kzC) interfaceC1891350zJl;
                                cloneableLJ = C1340440kzC.LJ(c1340440kzC, C1340410kz9.LIZ(c1340440kzC.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9, 12582911));
                            }
                            if (cloneableLJ != null) {
                                c20600815jK.LJIILJJIL(i, cloneableLJ);
                                return;
                            }
                            return;
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

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC1343830l4f state2ItemAccept(InterfaceC0148002o interfaceC0148002o, InterfaceC1343830l4f interfaceC1343830l4f) {
        return interfaceC1343830l4f;
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, InterfaceC1343830l4f interfaceC1343830l4f, List list) {
        C0O1Y c0o1y = (C0O1Y) interfaceC0148002o;
        C291001Au<Boolean> c291001Au = c0o1y.LL;
        C627660Ojc<InterfaceC1891350zJl> c627660Ojc = c0o1y.LLILLJJLI;
        C291001Au<Boolean> c291001Au2 = c0o1y.LLILLL;
        c0o1y.getClass();
        return new C0O1Y(c291001Au, c291001Au2, c627660Ojc);
    }
}
