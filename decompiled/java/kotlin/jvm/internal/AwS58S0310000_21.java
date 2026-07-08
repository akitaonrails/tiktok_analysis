package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C128Y;
import X.C1391190mJ3;
import X.C1875607Wg;
import X.InterfaceC1349380lDc;
import X.InterfaceC427850Gq7;
import X.InterfaceC737440SwI;
import X.ViewOnClickListenerC1349290lDT;
import Y.ARunnableS13S1000000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPhotoAssem;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public class AwS58S0310000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS58S0310000_21 awS58S0310000_21) {
        InterfaceC1349380lDc interfaceC1349380lDc;
        if (awS58S0310000_21.z3 && ((C013C) awS58S0310000_21.l0).element) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILIIL(((InterfaceC737440SwI) awS58S0310000_21.l1).IC());
        }
        ((C013C) awS58S0310000_21.l0).element = false;
        C128Y fragment = ((ViewOnClickListenerC1349290lDT) awS58S0310000_21.l2).getFragment();
        if ((fragment instanceof InterfaceC1349380lDc) && (interfaceC1349380lDc = (InterfaceC1349380lDc) fragment) != null) {
            interfaceC1349380lDc.Qf(((ViewOnClickListenerC1349290lDT) awS58S0310000_21.l2).LLJJLIIIJLLLLLLLZ, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS58S0310000_21 awS58S0310000_21) {
        final ArrayList arrayList = (ArrayList) awS58S0310000_21.l0;
        final CommentInnerPhotoAssem commentInnerPhotoAssem = (CommentInnerPhotoAssem) awS58S0310000_21.l1;
        final boolean z = awS58S0310000_21.z3;
        final C1875607Wg c1875607Wg = (C1875607Wg) awS58S0310000_21.l2;
        return new InterfaceC427850Gq7() { // from class: X.0l3J
            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri, C428600GrK c428600GrK) {
                commentInnerPhotoAssem.op();
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri, View view) {
                UrlModel urlModel;
                ArrayList<UrlModel> arrayList2 = arrayList;
                boolean z2 = false;
                if (arrayList2 != null) {
                    urlModel = (UrlModel) C13LP.LJJJLZIJ(0, arrayList2);
                } else {
                    urlModel = null;
                }
                CommentInnerPhotoAssem commentInnerPhotoAssem2 = commentInnerPhotoAssem;
                if (commentInnerPhotoAssem2.LLJLLIL != null) {
                    z2 = true;
                }
                if (urlModel != null) {
                    boolean z3 = z;
                    C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                    String str = commentInnerPhotoAssem2.LLJLLL;
                    if (str != null) {
                        c2208281Bbm.getClass();
                        C2208281Bbm.LJIILIIL(str, "detail", urlModel, z2, z2, z3);
                    }
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri, Throwable th) {
                commentInnerPhotoAssem.op();
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                String message;
                commentInnerPhotoAssem.op();
                if (C294450BgR.LIZ()) {
                    ArrayList<UrlModel> arrayList2 = arrayList;
                    if (arrayList2 != null && C13LP.LJJJLZIJ(0, arrayList2) != null) {
                        CommentInnerPhotoAssem commentInnerPhotoAssem2 = commentInnerPhotoAssem;
                        C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                        String str = commentInnerPhotoAssem2.LLJLLL;
                        if (str != null) {
                            C844470XAv.LIZ.getClass();
                            String strValueOf = String.valueOf(C1498560p6E.LIZ(C844470XAv.LIZ(), th));
                            if (th != null) {
                                message = th.getMessage();
                            } else {
                                message = null;
                            }
                            c2208281Bbm.getClass();
                            C2208281Bbm.LIZJ(0, -1, str, strValueOf, message);
                        }
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1342900l3A(c1875607Wg, commentInnerPhotoAssem, th, uri, null), 3);
                }
                C2208281Bbm c2208281Bbm2 = C2208281Bbm.LIZ;
                String cid = c1875607Wg.LL.getCid();
                c2208281Bbm2.getClass();
                C2208281Bbm.LJ(cid, "inner", false);
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                C424580Gkq c424580Gkq;
                Activity activityLIZIZ;
                ViewGroup.LayoutParams layoutParams;
                commentInnerPhotoAssem.op();
                CommentInnerPhotoAssem commentInnerPhotoAssem2 = commentInnerPhotoAssem;
                if (c428600GrK != null) {
                    float f = c428600GrK.LIZ;
                    float f2 = c428600GrK.LIZIZ;
                    Context context = commentInnerPhotoAssem2.getContext();
                    Object objLJJJLZIJ = null;
                    if (context != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null) {
                        int statusBarHeight = ScreenUtils.getStatusBarHeight(activityLIZIZ);
                        float f3 = f / f2;
                        double d = f3;
                        if (d >= 0.6666666666666666d) {
                            C424580Gkq c424580Gkq2 = commentInnerPhotoAssem2.LLJJJJ;
                            if (c424580Gkq2 != null) {
                                C1351950lHl.LJIJI(-1, c424580Gkq2);
                            }
                            View viewLJJIJL = commentInnerPhotoAssem2.LJJIJL();
                            if (viewLJJIJL != null) {
                                C0H9H.LJI(0, viewLJJIJL);
                            }
                            commentInnerPhotoAssem2.zp(false);
                        } else if (d < 0.6666666666666666d && d >= 0.5555555555555556d) {
                            C424580Gkq c424580Gkq3 = commentInnerPhotoAssem2.LLJJJJ;
                            if (c424580Gkq3 != null) {
                                C1351950lHl.LJIJI((int) (((Number) C473380IhM.LIZ(C724240Sb0.LIZ(commentInnerPhotoAssem2)).getFirst()).floatValue() / f3), c424580Gkq3);
                            }
                            C424580Gkq c424580Gkq4 = commentInnerPhotoAssem2.LLJJJJ;
                            if (c424580Gkq4 != null) {
                                layoutParams = c424580Gkq4.getLayoutParams();
                            } else {
                                layoutParams = null;
                            }
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.gravity = 48;
                            C424580Gkq c424580Gkq5 = commentInnerPhotoAssem2.LLJJJJ;
                            if (c424580Gkq5 != null) {
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424580Gkq5);
                                c424580Gkq5.setLayoutParams(layoutParams2);
                            }
                            View viewLJJIJL2 = commentInnerPhotoAssem2.LJJIJL();
                            if (viewLJJIJL2 != null) {
                                C0H9H.LJI(statusBarHeight, viewLJJIJL2);
                            }
                            commentInnerPhotoAssem2.zp(true);
                        } else if (d < 0.5555555555555556d) {
                            C424580Gkq c424580Gkq6 = commentInnerPhotoAssem2.LLJJJJ;
                            if (c424580Gkq6 != null) {
                                C1351950lHl.LJIJI(-1, c424580Gkq6);
                            }
                            View viewLJJIJL3 = commentInnerPhotoAssem2.LJJIJL();
                            if (viewLJJIJL3 != null) {
                                C0H9H.LJI(0, viewLJJIJL3);
                            }
                            commentInnerPhotoAssem2.zp(false);
                        } else {
                            C424580Gkq c424580Gkq7 = commentInnerPhotoAssem2.LLJJJJ;
                            if (c424580Gkq7 != null) {
                                C1351950lHl.LJIJI(-1, c424580Gkq7);
                            }
                            View viewLJJIJL4 = commentInnerPhotoAssem2.LJJIJL();
                            if (viewLJJIJL4 != null) {
                                C0H9H.LJI(statusBarHeight, viewLJJIJL4);
                            }
                            commentInnerPhotoAssem2.zp(false);
                        }
                        C424580Gkq c424580Gkq8 = commentInnerPhotoAssem2.LLJJJJ;
                        if (c424580Gkq8 != null) {
                            C1351950lHl.LJIILLIIL(c424580Gkq8, new AwS600S0100000_21(commentInnerPhotoAssem2, 375));
                        }
                    }
                    CommentInnerPhotoAssem commentInnerPhotoAssem3 = commentInnerPhotoAssem;
                    commentInnerPhotoAssem3.LLJZ = true;
                    if (commentInnerPhotoAssem3.LLJZIJLIL && commentInnerPhotoAssem3.ip()) {
                        CommentInnerPhotoAssem commentInnerPhotoAssem4 = commentInnerPhotoAssem;
                        commentInnerPhotoAssem4.LLJZIJLIL = false;
                        commentInnerPhotoAssem4.sp();
                    }
                    if (C294450BgR.LIZ()) {
                        ArrayList<UrlModel> arrayList2 = arrayList;
                        if (arrayList2 != null) {
                            objLJJJLZIJ = C13LP.LJJJLZIJ(0, arrayList2);
                        }
                        CommentInnerPhotoAssem commentInnerPhotoAssem5 = commentInnerPhotoAssem;
                        String str = commentInnerPhotoAssem5.LLJLLL;
                        if (objLJJJLZIJ != null && str != null && (c424580Gkq = commentInnerPhotoAssem5.LLJJJJ) != null) {
                            HandlerHook.viewPost(c424580Gkq, new ARunnableS13S1000000_21(str, 2));
                        }
                    }
                    C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                    String cid = c1875607Wg.LL.getCid();
                    c2208281Bbm.getClass();
                    C2208281Bbm.LJ(cid, "inner", true);
                }
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS58S0310000_21(ArrayList arrayList, ArrayList<UrlModel> arrayList2, CommentInnerPhotoAssem commentInnerPhotoAssem, boolean z, C1875607Wg c1875607Wg) {
        super(0);
        this.$t = c1875607Wg;
        this.l0 = arrayList;
        this.l1 = arrayList2;
        this.z3 = commentInnerPhotoAssem;
        this.l2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S0310000_21(boolean z, C013C c013c, InterfaceC737440SwI interfaceC737440SwI, ViewOnClickListenerC1349290lDT viewOnClickListenerC1349290lDT, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.l0 = c013c;
        this.l1 = interfaceC737440SwI;
        this.l2 = viewOnClickListenerC1349290lDT;
    }
}
