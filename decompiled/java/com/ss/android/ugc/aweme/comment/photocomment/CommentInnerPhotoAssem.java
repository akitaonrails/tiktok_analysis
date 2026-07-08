package com.ss.android.ugc.aweme.comment.photocomment;

import X.C019F;
import X.C09R3;
import X.C1058540deW;
import X.C12DM;
import X.C1340340kz2;
import X.C1344550l5p;
import X.C1350440lFK;
import X.C1350800lFu;
import X.C1350810lFv;
import X.C1350840lFy;
import X.C1350850lFz;
import X.C1350920lG6;
import X.C1351950lHl;
import X.C1355780lNw;
import X.C13LE;
import X.C13LZ;
import X.C1440005kM;
import X.C1478410oZj;
import X.C1479570obb;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1484680ojq;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1875607Wg;
import X.C19719912Dl;
import X.C19EG;
import X.C19ME;
import X.C2035907yH;
import X.C2188811AlT;
import X.C2208281Bbm;
import X.C2208301Bbo;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C276060Ars;
import X.C276100Arw;
import X.C294290BgB;
import X.C294430BgP;
import X.C418440Gaw;
import X.C424580Gkq;
import X.C582130MsN;
import X.C703302op;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C726120Se2;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1350830lFx;
import X.EnumC1355810lNz;
import X.InterfaceC1355840lO2;
import X.InterfaceC1482530ogN;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484830ok5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import X.ViewOnTouchListenerC1355770lNv;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS90S0200000_21;
import Y.AfS190S0100000_21;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentLivePhotoInfoModel;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInnerPhotoAssem extends ReusedUIContentAssem<CommentInnerPhotoAssem> implements InterfaceC712990Rxx<C1875607Wg>, InterfaceC1355840lO2 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIZZ;
    public C424580Gkq LLJJJJ;
    public ViewOnTouchListenerC1355770lNv LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public View LLJJL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJJLIIIJLLLLLLLZ;
    public final C1340340kz2 LLJL = new C1340340kz2();
    public final C726120Se2 LLJLIL = new C726120Se2();
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public String LLJLL;
    public CommentLivePhotoInfoModel LLJLLIL;
    public String LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public long LLL;
    public long LLLF;
    public C1350840lFy LLLFF;
    public C1350800lFu LLLFFI;
    public String LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public long LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public EnumC1350830lFx LLLIILIL;
    public boolean LLLIL;
    public int LLLILZ;
    public final boolean LLLILZJ;
    public final boolean LLLILZLLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentInnerPhotoAssem.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/photocomment/PhotoDetailContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentInnerPhotoAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommentInnerPhotoAssem.class, "commentActionMenuVM", "getCommentActionMenuVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentActionMenuVM;", 0);
        c09r3.getClass();
        LLLIZZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public CommentInnerPhotoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentActionMenuVM.class);
        this.LLJLILLLLZIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 619), null, AFwS259S0000000_21.get$arr$(89));
        this.LLLF = -1L;
        this.LLLIILIL = EnumC1350830lFx.LL;
        this.LLLILZJ = C276100Arw.LIZIZ;
        this.LLLILZLLLI = C276060Ars.LIZIZ;
    }

    @Override // X.InterfaceC1355840lO2
    public final void onScale(float f) {
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0lFy] */
    public final void sp() {
        CommentLivePhotoInfoModel commentLivePhotoInfoModel;
        final FrameLayout frameLayout;
        if (ip() && !this.LLLI) {
            C1344550l5p c1344550l5pHp = hp();
            if ((c1344550l5pHp != null && c1344550l5pHp.getDragState() == 1) || (commentLivePhotoInfoModel = this.LLJLLIL) == null || (frameLayout = this.LLJJJJLIIL) == null) {
                return;
            }
            String str = commentLivePhotoInfoModel.videoId;
            List<String> list = commentLivePhotoInfoModel.urlList;
            String str2 = commentLivePhotoInfoModel.localVideoPath;
            boolean z = (str == null || str.length() == 0 || list == null || list.isEmpty()) ? false : true;
            boolean z2 = !(str2 == null || str2.length() == 0);
            if (!z && !z2) {
                cp(false);
                return;
            }
            if (!this.LLJZ) {
                this.LLJZIJLIL = true;
                return;
            }
            long j = this.LLLF;
            long j2 = this.LLL;
            if (j == j2) {
                return;
            }
            this.LLLF = j2;
            this.LLLII = false;
            mp(false);
            this.LLLIIII = 0L;
            this.LLLIIIIL = false;
            this.LLLIIIL = false;
            this.LLLIIL = false;
            this.LLLIILIL = EnumC1350830lFx.LL;
            this.LLLIILIL = EnumC1350830lFx.LLILLJJLI;
            this.LLLIIL = true;
            C786410Ut5.LJZ(0, frameLayout);
            InterfaceC1484830ok5 interfaceC1484830ok5Ep = ep();
            if (interfaceC1484830ok5Ep == null) {
                cp(false);
                return;
            }
            ?? r9 = new InterfaceC1483820oiS() { // from class: X.0lFy
                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ boolean bn() {
                    return true;
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                    return null;
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ Surface getSurface() {
                    return null;
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ void hj() {
                }

                @Override // X.InterfaceC1483820oiS
                public final /* synthetic */ void pe() {
                }

                @Override // X.InterfaceC1483820oiS
                public final HashMap getParams() {
                    return new HashMap();
                }

                @Override // X.InterfaceC1483820oiS
                public final FrameLayout getPlayViewContainer() {
                    return frameLayout;
                }
            };
            this.LLLFF = r9;
            C424580Gkq c424580Gkq = this.LLJJJJ;
            if (c424580Gkq != null) {
                C1351950lHl.LJIILLIIL(c424580Gkq, new C1350810lFv(3, frameLayout, commentLivePhotoInfoModel, r9, this, interfaceC1484830ok5Ep));
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void Ap() {
        FrameLayout frameLayout;
        View view = this.LLJJL;
        if (view == null || (frameLayout = this.LLJJJJLIIL) == null) {
            return;
        }
        float left = frameLayout.getLeft() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        float fMax = Math.max(frameLayout.getTop() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        C786410Ut5.Jc(view, left - view.getLeft());
        C786410Ut5.ed(view, fMax - view.getTop());
        C786410Ut5.LJLLLLLL(this.LLJLLIL != null ? 0 : 8, view);
    }

    @Override // X.InterfaceC1355840lO2
    public final void LJJJIL() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        View view = this.LLJJL;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        View view2 = this.LLJJL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS121S0100000_21(this, 49));
    }

    @Override // X.InterfaceC1355840lO2
    public final void LJZL() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (this.LLLIILIL == EnumC1350830lFx.LLILLL) {
            View view = this.LLJJL;
            if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            View view2 = this.LLJJL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
        } else {
            lp(this);
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS121S0100000_21(this, 50));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    @Override // X.InterfaceC1355840lO2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O1() {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem.O1():void");
    }

    public final CommentContextSource dp() {
        C726120Se2 c726120Se2 = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIZZ;
        return c726120Se2.LIZ(this);
    }

    public final C1344550l5p hp() {
        C1340340kz2 c1340340kz2 = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIZZ;
        return c1340340kz2.LIZ(this);
    }

    public final void op() {
        Comment comment;
        Comment enterComment;
        if (C294430BgP.LIZIZ) {
            C1344550l5p c1344550l5pHp = hp();
            String cid = null;
            String cid2 = (c1344550l5pHp == null || (enterComment = c1344550l5pHp.getEnterComment()) == null) ? null : enterComment.getCid();
            C724270Sb3 c724270Sb3 = this.LLJI;
            C1875607Wg c1875607Wg = (C1875607Wg) (c724270Sb3 != null ? c724270Sb3.LL : null);
            if (c1875607Wg != null && (comment = c1875607Wg.LL) != null) {
                cid = comment.getCid();
            }
            if (Intrinsics.LJFF(cid2, cid)) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ == null || c19egLIZ.isFinishing() || c19egLIZ.isDestroyed()) {
                    return;
                }
                c19egLIZ.runOnUiThread(new ARunnableS90S0200000_21(this, c19egLIZ, 7));
                return;
            }
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 == null || c19egLIZ2.isFinishing() || c19egLIZ2.isDestroyed()) {
            return;
        }
        c19egLIZ2.runOnUiThread(new ARunnableS119S0100000_19(c19egLIZ2, 31));
    }

    @Override // X.InterfaceC1355840lO2
    public final void LLZZ() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZIZ(AFwS259S0000000_21.get$arr$(88));
        }
    }

    public final InterfaceC1484830ok5 ep() {
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        InterfaceC1484830ok5 interfaceC1484830ok5 = null;
        if (fragmentLJI == null || fragmentLJI.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || (interfaceC1484830ok5 = C1350440lFK.LIZIZ) != null) {
            return interfaceC1484830ok5;
        }
        synchronized (C1350440lFK.LIZ) {
            try {
                interfaceC1484830ok5LIZJ = C1350440lFK.LIZIZ;
                if (interfaceC1484830ok5LIZJ == null) {
                    C1478410oZj c1478410oZj = new C1478410oZj();
                    c1478410oZj.LIZIZ = true;
                    interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
                    C1350440lFK.LIZIZ = interfaceC1484830ok5LIZJ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC1484830ok5LIZJ;
    }

    public final boolean ip() {
        String cid;
        Comment enterComment;
        Comment curSelectedComment;
        C1344550l5p c1344550l5pHp = hp();
        if (c1344550l5pHp == null || (curSelectedComment = c1344550l5pHp.getCurSelectedComment()) == null || (cid = curSelectedComment.getCid()) == null) {
            C1344550l5p c1344550l5pHp2 = hp();
            cid = (c1344550l5pHp2 == null || (enterComment = c1344550l5pHp2.getEnterComment()) == null) ? null : enterComment.getCid();
        }
        String str = this.LLJLL;
        return !((str == null || str.length() == 0) && C703302op.LIZ(cid)) && Intrinsics.LJFF(str, cid);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void lp(com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem r4) {
        /*
            android.view.View r3 = r4.LLJJL
            if (r3 == 0) goto L26
            android.view.ViewPropertyAnimator r0 = r3.animate()
            r0.cancel()
            X.0lNv r0 = r4.LLJJJJJIL
            r2 = 0
            if (r0 == 0) goto L27
            android.graphics.Matrix r0 = r0.LL
            boolean r0 = r0.isIdentity()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L27
        L1b:
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L29
            X.C786410Ut5.T4(r3, r0)
            r0 = 4
            X.C786410Ut5.LJLLLLLL(r0, r3)
        L26:
            return
        L27:
            r1 = 0
            goto L1b
        L29:
            X.C786410Ut5.T4(r3, r0)
            com.ss.android.ugc.aweme.comment.model.CommentLivePhotoInfoModel r0 = r4.LLJLLIL
            if (r0 != 0) goto L32
            r2 = 8
        L32:
            X.C786410Ut5.LJLLLLLL(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem.lp(com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem):void");
    }

    @Override // X.InterfaceC1355840lO2
    public final void Oj(String str) {
        String str2;
        Object obj;
        Comment comment;
        if (this.LLJLLIL != null) {
            str2 = "live_once";
        } else {
            str2 = "static";
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String cid = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C1875607Wg c1875607Wg = (C1875607Wg) obj;
        if (c1875607Wg != null && (comment = c1875607Wg.LL) != null) {
            cid = comment.getCid();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (cid == null) {
            cid = "";
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        c2344009Gk.LJIIIIZZ("sub_photo_type", str2);
        c2344009Gk.LJIIIIZZ("action_type", str);
        C1350920lG6.LJJJ(c2344009Gk, "photo_comment_zoom");
    }

    @Override // X.InterfaceC1355840lO2
    public final void bb(boolean z) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            viewOnAttachStateChangeListenerC20631115oD.setUserInputEnabled(z);
        }
    }

    public final void cp(boolean z) {
        if (this.LLLIIIL) {
            return;
        }
        String str = this.LLJLLL;
        if (str != null) {
            C2208281Bbm.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("endLivePhotoVideoLoad ");
            sbLIZ.append(str);
            sbLIZ.append(" isSuccess=");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            C2208301Bbo c2208301Bbo = (C2208301Bbo) ((LinkedHashMap) C2208281Bbm.LIZJ).get(str);
            if (c2208301Bbo != null) {
                c2208301Bbo.LJFF = System.currentTimeMillis();
                c2208301Bbo.LJIIJ = Boolean.valueOf(z);
                C2208281Bbm.LJIIJ(c2208301Bbo);
            }
        }
        this.LLLIIIL = true;
    }

    public final void mp(boolean z) throws JSONException {
        InterfaceC1484830ok5 interfaceC1484830ok5Ep;
        this.LLLIL = false;
        kp("user_exit", false, null);
        if (z && this.LLLIIL && !this.LLLIIIL) {
            cp(false);
        }
        this.LLLIIL = false;
        lp(this);
        FrameLayout frameLayout = this.LLJJJJLIIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        ViewOnTouchListenerC1355770lNv viewOnTouchListenerC1355770lNv = this.LLJJJJJIL;
        if (viewOnTouchListenerC1355770lNv != null) {
            viewOnTouchListenerC1355770lNv.setPinchEnabled(this.LLLILZJ);
        }
        ViewOnTouchListenerC1355770lNv viewOnTouchListenerC1355770lNv2 = this.LLJJJJJIL;
        if (viewOnTouchListenerC1355770lNv2 != null) {
            viewOnTouchListenerC1355770lNv2.setLongPressEnabled(this.LLLILZLLLI);
        }
        C1350800lFu c1350800lFu = this.LLLFFI;
        C1350840lFy c1350840lFy = this.LLLFF;
        if (c1350800lFu != null && c1350840lFy != null && (interfaceC1484830ok5Ep = ep()) != null) {
            interfaceC1484830ok5Ep.LJJIIZ(c1350800lFu);
            interfaceC1484830ok5Ep.stop();
            interfaceC1484830ok5Ep.LJIIJJI(c1350840lFy);
        }
        this.LLLFFI = null;
        this.LLLFF = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        View rootView;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        this.LLJJJJ = (C424580Gkq) view.findViewById(R.id.eb6);
        ViewOnTouchListenerC1355770lNv viewOnTouchListenerC1355770lNv = (ViewOnTouchListenerC1355770lNv) view.findViewById(R.id.ecp);
        this.LLJJJJJIL = viewOnTouchListenerC1355770lNv;
        if (viewOnTouchListenerC1355770lNv != null) {
            viewOnTouchListenerC1355770lNv.setPinchEnabled(this.LLLILZJ);
        }
        ViewOnTouchListenerC1355770lNv viewOnTouchListenerC1355770lNv2 = this.LLJJJJJIL;
        if (viewOnTouchListenerC1355770lNv2 != null) {
            viewOnTouchListenerC1355770lNv2.setLongPressEnabled(this.LLLILZLLLI);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ec1);
        this.LLJJJJLIIL = frameLayout;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        View viewFindViewById5 = view.findViewById(R.id.i74);
        this.LLJJL = viewFindViewById5;
        if (viewFindViewById5 != null && (viewFindViewById4 = viewFindViewById5.findViewById(R.id.lnc)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById4);
        }
        View view2 = this.LLJJL;
        if (view2 != null && (viewFindViewById3 = view2.findViewById(R.id.zvr)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
        }
        View view3 = this.LLJJL;
        if (view3 != null && (viewFindViewById2 = view3.findViewById(R.id.lnd)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View view4 = this.LLJJL;
        if (view4 != null && (viewFindViewById = view4.findViewById(R.id.zvs)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View view5 = this.LLJJL;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 35), view5);
        }
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && viewLJJIJL != null) {
            viewLJJIJL.setOnTouchListener(this.LLJJJJJIL);
        }
        C424580Gkq c424580Gkq = this.LLJJJJ;
        if (c424580Gkq != null && (rootView = c424580Gkq.getRootView()) != null) {
            viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) rootView.findViewById(R.id.koh);
        } else {
            viewOnAttachStateChangeListenerC20631115oD = null;
        }
        this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20631115oD;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS190S0100000_21(this, 12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1875607Wg r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1875607Wg c1875607Wg) {
        return true;
    }

    public final void zp(boolean z) {
        C19ME c19me;
        float f;
        FrameLayout frameLayout = this.LLJJJJLIIL;
        ViewGroup.LayoutParams layoutParams = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
            if (z) {
                f = 0.0f;
            } else {
                f = 0.5f;
            }
            c19me.verticalBias = f;
            FrameLayout frameLayout2 = this.LLJJJJLIIL;
            if (frameLayout2 != null) {
                C786410Ut5.a6(frameLayout2, c19me);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1875607Wg c1875607Wg) {
    }

    public static final void tp(CommentInnerPhotoAssem commentInnerPhotoAssem, InterfaceC1484830ok5 interfaceC1484830ok5) {
        C1350800lFu c1350800lFu = commentInnerPhotoAssem.LLLFFI;
        C1350840lFy c1350840lFy = commentInnerPhotoAssem.LLLFF;
        if (c1350800lFu != null) {
            interfaceC1484830ok5.LJJIIZ(c1350800lFu);
        }
        if (c1350840lFy != null) {
            interfaceC1484830ok5.LJIIJJI(c1350840lFy);
        }
        commentInnerPhotoAssem.LLLFFI = null;
        commentInnerPhotoAssem.LLLFF = null;
    }

    public static final void up(FrameLayout frameLayout, CommentInnerPhotoAssem commentInnerPhotoAssem) {
        C786410Ut5.LJZ(8, frameLayout);
        ViewOnTouchListenerC1355770lNv viewOnTouchListenerC1355770lNv = commentInnerPhotoAssem.LLJJJJJIL;
        if (viewOnTouchListenerC1355770lNv != null) {
            viewOnTouchListenerC1355770lNv.setPinchEnabled(commentInnerPhotoAssem.LLLILZJ);
        }
        ViewOnTouchListenerC1355770lNv viewOnTouchListenerC1355770lNv2 = commentInnerPhotoAssem.LLJJJJJIL;
        if (viewOnTouchListenerC1355770lNv2 != null) {
            viewOnTouchListenerC1355770lNv2.setLongPressEnabled(commentInnerPhotoAssem.LLLILZLLLI);
        }
    }

    @Override // X.InterfaceC1355840lO2
    public final void ai(float f, float f2) {
        Object obj;
        C1355780lNw c1355780lNw;
        Pair pair;
        if (C294290BgB.LIZIZ()) {
            ViewOnTouchListenerC1355770lNv viewOnTouchListenerC1355770lNv = this.LLJJJJJIL;
            if (viewOnTouchListenerC1355770lNv != null && (c1355780lNw = viewOnTouchListenerC1355770lNv.LLILLJJLI) != null && c1355780lNw.LJIIJ <= 1.0f && !c1355780lNw.LJJIIJZLJL) {
                c1355780lNw.LJI = EnumC1355810lNz.DOUBLE_TAP_ZOOM;
                c1355780lNw.LJJIJIL = true;
                InterfaceC1355840lO2 interfaceC1355840lO2 = c1355780lNw.LJFF;
                if (interfaceC1355840lO2 != null) {
                    interfaceC1355840lO2.LJJJIL();
                }
                InterfaceC1355840lO2 interfaceC1355840lO22 = c1355780lNw.LJFF;
                if (interfaceC1355840lO22 != null) {
                    interfaceC1355840lO22.Oj("double_tap");
                }
                C1350850lFz c1350850lFz = (C1350850lFz) c1355780lNw.LJJIIJ.getValue();
                AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c1355780lNw, 1687);
                C1355780lNw c1355780lNw2 = c1350850lFz.LIZ;
                float f3 = 3.0f / c1355780lNw2.LJIIJ;
                float width = c1355780lNw2.LIZLLL.getWidth();
                float height = c1350850lFz.LIZ.LIZLLL.getHeight();
                if (f >= 0.0f && f2 >= 0.0f) {
                    RectF rectFLJI = c1350850lFz.LIZ.LJI();
                    if (rectFLJI.isEmpty()) {
                        pair = new Pair(Float.valueOf(width / 2.0f), Float.valueOf(height / 2.0f));
                    } else {
                        pair = new Pair(Float.valueOf(C13LZ.LIZLLL(f, rectFLJI.left, rectFLJI.right)), Float.valueOf(C13LZ.LIZLLL(f2, rectFLJI.top, rectFLJI.bottom)));
                    }
                } else {
                    pair = new Pair(Float.valueOf(width / 2.0f), Float.valueOf(height / 2.0f));
                }
                float fFloatValue = ((Number) pair.getFirst()).floatValue();
                float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
                Matrix matrix = new Matrix(c1350850lFz.LIZ.LJII);
                Matrix matrix2 = new Matrix(c1350850lFz.LIZ.LJII);
                matrix2.postScale(f3, f3, fFloatValue, fFloatValue2);
                Pair<Float, Float> pairLJFF = c1350850lFz.LIZ.LJFF();
                if (pairLJFF != null) {
                    float width2 = (c1350850lFz.LIZ.LIZLLL.getWidth() - pairLJFF.getFirst().floatValue()) / 2.0f;
                    float height2 = (c1350850lFz.LIZ.LIZLLL.getHeight() - pairLJFF.getSecond().floatValue()) / 2.0f;
                    RectF rectF = new RectF(width2, height2, pairLJFF.getFirst().floatValue() + width2, pairLJFF.getSecond().floatValue() + height2);
                    matrix2.mapRect(rectF);
                    PointF pointFLIZJ = c1350850lFz.LIZ.LIZJ(r2.LJ.getWidth(), c1350850lFz.LIZ.LJ.getHeight(), rectF);
                    if (pointFLIZJ != null) {
                        matrix2.postTranslate(pointFLIZJ.x, pointFLIZJ.y);
                    }
                }
                C1355780lNw c1355780lNw3 = c1350850lFz.LIZ;
                c1355780lNw3.LJJIIJZLJL = true;
                c1355780lNw3.LIZ(matrix, matrix2, new C12DM(), null, null, new AwS422S0200000_21(c1350850lFz.LIZ, awS565S0100000_21, 139));
                return;
            }
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C1440005kM.LIZ(new C2035907yH(((C1875607Wg) obj).LL));
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws JSONException {
        up(interfaceC1587906Jp);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(java.lang.String r23, boolean r24, X.C1481290oeN r25) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem.kp(java.lang.String, boolean, X.0oeN):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0lFu, X.0ogN] */
    public static final void yp(final CommentInnerPhotoAssem commentInnerPhotoAssem, final InterfaceC1484830ok5 interfaceC1484830ok5, C1350840lFy c1350840lFy, final CommentLivePhotoInfoModel commentLivePhotoInfoModel, final FrameLayout frameLayout) {
        if (!commentInnerPhotoAssem.ip()) {
            up(frameLayout, commentInnerPhotoAssem);
            tp(commentInnerPhotoAssem, interfaceC1484830ok5);
            return;
        }
        interfaceC1484830ok5.LIZJ(c1350840lFy);
        ?? r0 = new InterfaceC1482530ogN() { // from class: X.0lFu
            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Au(Surface surface) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void VK() {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void W1(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLoopPlay(String str, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPause(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
            public final /* synthetic */ void onPreRenderReady(String str) {
                C490850JMt.LIZ(this, str);
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str, int i, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onStopPlay(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i) throws JSONException {
                CommentInnerPhotoAssem commentInnerPhotoAssem2 = this.LL;
                commentInnerPhotoAssem2.LLLII = true;
                commentInnerPhotoAssem2.kp("completed", false, null);
                CommentInnerPhotoAssem.lp(this.LL);
                CommentInnerPhotoAssem.up(frameLayout, this.LL);
                CommentInnerPhotoAssem.tp(this.LL, interfaceC1484830ok5);
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                boolean z;
                CommentInnerPhotoAssem commentInnerPhotoAssem2;
                View view;
                CommentInnerPhotoAssem commentInnerPhotoAssem3 = this.LL;
                EnumC1350830lFx enumC1350830lFx = commentInnerPhotoAssem3.LLLIILIL;
                EnumC1350830lFx enumC1350830lFx2 = EnumC1350830lFx.LLILLJJLI;
                boolean z2 = true;
                if (enumC1350830lFx == enumC1350830lFx2) {
                    z = true;
                } else {
                    z = false;
                }
                if (commentInnerPhotoAssem3.LLLIIII <= 0) {
                    commentInnerPhotoAssem3.LLLIIII = SystemClock.elapsedRealtime();
                }
                if (commentInnerPhotoAssem3.LLLIILIL == enumC1350830lFx2) {
                    commentInnerPhotoAssem3.LLLIILIL = EnumC1350830lFx.LLILLL;
                }
                this.LL.cp(true);
                if (z && (view = (commentInnerPhotoAssem2 = this.LL).LLJJL) != null) {
                    view.animate().cancel();
                    if (commentInnerPhotoAssem2.LLJJJJJIL == null || !(!r0.LL.isIdentity())) {
                        z2 = false;
                    }
                    if (z2) {
                        C786410Ut5.LJLLLLLL(4, view);
                        C786410Ut5.T4(view, 1.0f);
                    } else {
                        if (view.getVisibility() != 0) {
                            C786410Ut5.LJLLLLLL(0, view);
                        }
                        C786410Ut5.T4(view, 1.0f);
                        view.animate().alpha(0.0f).setDuration(500L).start();
                    }
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) throws JSONException {
                CommentInnerPhotoAssem commentInnerPhotoAssem2 = this.LL;
                commentInnerPhotoAssem2.LLLII = false;
                commentInnerPhotoAssem2.kp("error", true, c1481290oeN);
                this.LL.cp(false);
                CommentInnerPhotoAssem.lp(this.LL);
                CommentInnerPhotoAssem.up(frameLayout, this.LL);
                CommentInnerPhotoAssem.tp(this.LL, interfaceC1484830ok5);
                CommentInnerPhotoAssem commentInnerPhotoAssem3 = this.LL;
                commentInnerPhotoAssem3.LLLI = true;
                Fragment fragmentLJI = C724240Sb0.LJI(commentInnerPhotoAssem3);
                if (fragmentLJI != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                    c1389890mGx.LJIIIZ(2131820713);
                    c1389890mGx.LJIIJJI();
                }
            }
        };
        commentInnerPhotoAssem.LLLFFI = r0;
        interfaceC1484830ok5.LJIIZILJ(r0);
        new Object(commentLivePhotoInfoModel) { // from class: X.0lG0
        };
        String str = commentLivePhotoInfoModel.videoId;
        if (str == null && (str = commentLivePhotoInfoModel.localVideoPath) == null) {
            str = "";
        }
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = str;
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        String str2 = commentLivePhotoInfoModel.localVideoPath;
        if (str2 != null && str2.length() != 0) {
            c1058540deW.LIZIZ(str2);
            c1058540deW.LIZIZ = String.valueOf(str.hashCode());
            c1058540deW.LIZ();
        } else {
            c1058540deW.LIZLLL = commentLivePhotoInfoModel.urlList;
            c1058540deW.LIZ();
        }
        C1479570obb c1479570obb = new C1479570obb();
        c1479570obb.LJJIIZ = "mp4";
        c1479570obb.LJII = false;
        c1479570obb.LJI = false;
        c1479570obb.LIZIZ = false;
        c1479570obb.LJJ = true;
        c1482580ogS.LJ = new C1482570ogR(c1479570obb);
        interfaceC1484830ok5.LJ(new C1484680ojq(c1482580ogS).LIZ());
    }
}
