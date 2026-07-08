package com.ss.android.ugc.aweme.lemon.comment.viewmodel;

import X.AbstractC1343400l3y;
import X.AbstractC1387200mCc;
import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C09YA;
import X.C0DHG;
import X.C0P6P;
import X.C1157060gDQ;
import X.C1157330gDr;
import X.C1220000hqw;
import X.C1220460hrg;
import X.C1342550l2b;
import X.C1342920l3C;
import X.C1343280l3m;
import X.C1343340l3s;
import X.C1343370l3v;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1494450ozb;
import X.C189200o6;
import X.C1906580ziK;
import X.C1954807lC;
import X.C19719212De;
import X.C20600815jK;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C296150BjB;
import X.C316650Cb9;
import X.C317290CcB;
import X.C325890Cq3;
import X.C452070Ho5;
import X.C627300Oj2;
import X.C632670Orh;
import X.C724750Sbp;
import X.C736950SvV;
import X.C844470XAv;
import X.EnumC1343330l3r;
import X.EnumC2007007tc;
import X.EnumC325100Com;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentListAssemVM extends AssemViewModel<C325890Cq3> implements ICommentListVMAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public boolean LL;
    public long LLILLJJLI;
    public LinkedHashSet<String> LLILLL = new LinkedHashSet<>();
    public final C736950SvV LLILZ;
    public Aweme LLILZIL;
    public final C09YA LLILZLL;
    public C627300Oj2 LLIZ;
    public InterfaceC665370Q7z LLIZLLLIL;
    public C20600815jK<InterfaceC1891350zJl> LLJ;
    public C20600815jK<InterfaceC1891350zJl> LLJI;
    public C1343280l3m LLJIJIL;
    public boolean LLJILJIL;
    public final C1342920l3C LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentListAssemVM.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/lemon/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.lemon.comment.viewmodel.ICommentListVMAbility
    public final void Gj() {
        getOperator().refresh();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325890Cq3(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0l3C] */
    public CommentListAssemVM() {
        this.LLILZ = new C736950SvV(C13LE.LIZ(LemonCommentSyncSharedVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS259S0000000_21.get$arr$(184), null, null, null);
        final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 678);
        new AbstractC1343400l3y() { // from class: X.0l3w
        };
        this.LLILZLL = new C09YA(this, AFwS209S0000000_21.get$arr$(291));
        final C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        this.LLJILJILJ = new AbstractC329610Cw3<C1342550l2b>(c20603715jn) { // from class: X.0l3C
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1342550l2b>> interfaceC1364105Vn) {
                String aid;
                CommentListAssemVM commentListAssemVM = this.LIZIZ;
                commentListAssemVM.LL = false;
                commentListAssemVM.LLILLJJLI = 0L;
                commentListAssemVM.LLILLL = new LinkedHashSet<>();
                CommentListAssemVM commentListAssemVM2 = this.LIZIZ;
                Aweme aweme = commentListAssemVM2.LLILZIL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                commentListAssemVM2.vQ2(aid, new C1342550l2b(0), interfaceC1364105Vn);
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) {
                String aid;
                C1342550l2b c1342550l2b = (C1342550l2b) obj;
                CommentListAssemVM commentListAssemVM = this.LIZIZ;
                Aweme aweme = commentListAssemVM.LLILZIL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                commentListAssemVM.vQ2(aid, c1342550l2b, interfaceC1364105Vn);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r1 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(boolean r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L21
            X.15jK<X.0zJl> r0 = r4.LLJ
            if (r0 == 0) goto L35
            java.util.List r0 = r0.LJII()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C1340940l00
            if (r0 == 0) goto L11
            if (r1 == 0) goto L35
        L21:
            boolean r0 = r4.LL
            if (r0 != 0) goto L2d
            X.0l3r r1 = X.EnumC1343330l3r.POST_MODE_FULL_PAGE_LOAD_COMPLETE
            X.07tc r0 = X.EnumC2007007tc.DEFAULT
            r4.AQ2(r1, r3)
            return
        L2d:
            X.0l3r r1 = X.EnumC1343330l3r.DEFAULT
            X.07tc r0 = X.EnumC2007007tc.DEFAULT
            r4.AQ2(r1, r3)
            return
        L35:
            X.0l3r r1 = X.EnumC1343330l3r.COMMENT_EMPTY
            X.07tc r0 = X.EnumC2007007tc.MATCH_PARENT
            r0 = 0
            r4.AQ2(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM.xQ2(boolean):void");
    }

    public static CharSequence zQ2(Context context, EnumC1343330l3r enumC1343330l3r) {
        int i = C1343340l3s.LIZ[enumC1343330l3r.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return context.getString(2131829188);
            }
            return context.getString(2131845625);
        }
        return context.getString(2131829172);
    }

    public final void AQ2(EnumC1343330l3r enumC1343330l3r, C1343370l3v c1343370l3v) {
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        Exception exc;
        Exception exc2;
        Exception exc3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFooterStatus type=");
        sbLIZ.append(enumC1343330l3r);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJIJIL = new C1343280l3m(enumC1343330l3r);
        switch (C1343340l3s.LIZ[enumC1343330l3r.ordinal()]) {
            case 1:
            case 3:
            case 4:
                C20600815jK<InterfaceC1891350zJl> c20600815jK2 = this.LLJI;
                if (c20600815jK2 != null) {
                    C1157330gDr c1157330gDr = new C1157330gDr(enumC1343330l3r);
                    if (c1343370l3v != null) {
                        exc = c1343370l3v.LIZ;
                    } else {
                        exc = null;
                    }
                    c20600815jK2.LJIILL(Collections.singletonList(new C1157060gDQ(c1157330gDr, exc)), null);
                    return;
                }
                return;
            case 2:
                C20600815jK<InterfaceC1891350zJl> c20600815jK3 = this.LLJI;
                if (c20600815jK3 != null) {
                    C1157330gDr c1157330gDr2 = new C1157330gDr(enumC1343330l3r);
                    if (c1343370l3v != null) {
                        exc2 = c1343370l3v.LIZ;
                    } else {
                        exc2 = null;
                    }
                    c20600815jK3.LJIILL(Collections.singletonList(new C1157060gDQ(c1157330gDr2, exc2)), null);
                    return;
                }
                return;
            case 5:
                C20600815jK<InterfaceC1891350zJl> c20600815jK4 = this.LLJI;
                if (c20600815jK4 != null) {
                    C1157330gDr c1157330gDr3 = new C1157330gDr(enumC1343330l3r);
                    if (c1343370l3v != null) {
                        exc3 = c1343370l3v.LIZ;
                    } else {
                        exc3 = null;
                    }
                    c20600815jK4.LJIILL(Collections.singletonList(new C1157060gDQ(c1157330gDr3, exc3)), null);
                    return;
                }
                return;
            case 6:
                C20600815jK<InterfaceC1891350zJl> c20600815jK5 = this.LLJI;
                if (c20600815jK5 != null && c20600815jK5.LJIIIIZZ() > 0 && (c20600815jK = this.LLJI) != null) {
                    c20600815jK.LJFF(null);
                    return;
                }
                return;
            default:
                throw new C1954807lC();
        }
    }

    public final void yQ2(Throwable th, InterfaceC1364105Vn<? super AbstractC316870CbV<C1342550l2b>> interfaceC1364105Vn) {
        Exception exc;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        this.LLJILJIL = false;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
            exc = new Exception(th);
        }
        c317290CcB.getClass();
        C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
        C189200o6.m2constructorimpl(c316650Cb9);
        interfaceC1364105Vn.resumeWith(c316650Cb9);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                C632670Orh.LIZIZ(activityLIZ, new C19719212De(1887671763, new AwS668S0100000_19(th, 5), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
            c1397580mTM.LIZIZ("(debug) error: " + th);
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public final void vQ2(String str, C1342550l2b c1342550l2b, InterfaceC1364105Vn interfaceC1364105Vn) {
        EnumC325100Com networkStatus;
        this.LLJILJIL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchCommentList start ");
        sbLIZ.append(str);
        sbLIZ.append(" cursor:");
        sbLIZ.append(c1342550l2b.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
        if (iNetworkStateService != null) {
            networkStatus = iNetworkStateService.getNetworkStatus();
        } else {
            networkStatus = null;
        }
        if (networkStatus == EnumC325100Com.NOT_AVAILABLE && (((Number) C296150BjB.LIZ.getValue()).intValue() & 1) > 0) {
            yQ2(new C1494450ozb(), interfaceC1364105Vn);
        } else if (str == null) {
            yQ2(new Exception("aid is empty!"), interfaceC1364105Vn);
        } else {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1220460hrg(this, c1342550l2b, 20, str, interfaceC1364105Vn, null), 3);
        }
    }

    public final void wQ2(Exception exc, boolean z, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        if (z) {
            EnumC1343330l3r enumC1343330l3r = EnumC1343330l3r.REFRESH_ERR;
            EnumC2007007tc enumC2007007tc = EnumC2007007tc.DEFAULT;
            AQ2(enumC1343330l3r, new C1343370l3v(exc));
            return;
        }
        EnumC1343330l3r enumC1343330l3r2 = EnumC1343330l3r.LOAD_MORE_ERR;
        EnumC2007007tc enumC2007007tc2 = EnumC2007007tc.NORMAL_FOOTER;
        AQ2(enumC1343330l3r2, null);
        if (this.LLIZ == null) {
            this.LLIZ = new C627300Oj2(viewOnAttachStateChangeListenerC20604515jv, new C0P6P() { // from class: X.0l3u
                @Override // X.C0P6P
                public final void LJJIFFI() {
                    getOperator().LIZIZ(EnumC323450Cm7.Next);
                }
            });
        }
        C627300Oj2 c627300Oj2 = this.LLIZ;
        if (c627300Oj2 == null) {
            return;
        }
        c627300Oj2.LLILLL = true;
    }
}
