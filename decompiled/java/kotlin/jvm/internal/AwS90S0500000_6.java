package kotlin.jvm.internal;

import X.C05P0;
import X.C07GL;
import X.C09AY;
import X.C0I20;
import X.C1677280tkU;
import X.C1677480tko;
import X.C19EG;
import X.C259800zU;
import X.C434630H2n;
import X.C448200Hhq;
import X.C643400PLm;
import X.C659520Ptu;
import X.C666690QDb;
import X.C680810Qn9;
import X.InterfaceC1692950u9l;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoCommentVM;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS90S0500000_6 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS90S0500000_6 awS90S0500000_6, Object obj, Object obj2) {
        boolean z;
        String strLIZIZ;
        String cid;
        final Aweme aweme;
        final Comment comment;
        View view = (View) obj;
        C643400PLm c643400PLm = (C643400PLm) obj2;
        if (Intrinsics.LJFF(view, (View) awS90S0500000_6.l0)) {
            if (((Number) C07GL.LIZ.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                SearchVideoCommentVM searchVideoCommentVMCp = ((SearchVideoCommentAssem) awS90S0500000_6.l1).cp();
                C659520Ptu c659520Ptu = searchVideoCommentVMCp.LL;
                if (c659520Ptu != null && (aweme = c659520Ptu.LL) != null && (comment = searchVideoCommentVMCp.LLILLL) != null) {
                    C680810Qn9<C448200Hhq> c680810Qn9 = new C680810Qn9<C448200Hhq>(comment, aweme) { // from class: X.0Hho
                    };
                    searchVideoCommentVMCp.vQ2(c680810Qn9, view);
                    c680810Qn9.LJIILJJIL();
                }
            } else {
                View view2 = (View) ((C259800zU) awS90S0500000_6.l2).element;
                if (view2 != null && view2.getVisibility() == 0 && ((View) ((C259800zU) awS90S0500000_6.l2).element).getAlpha() == 1.0f) {
                    SearchVideoCommentVM searchVideoCommentVMCp2 = ((SearchVideoCommentAssem) awS90S0500000_6.l1).cp();
                    TuxTextView tuxTextView = (TuxTextView) ((C259800zU) awS90S0500000_6.l3).element;
                    if (tuxTextView == null || (strLIZIZ = C434630H2n.LIZIZ(tuxTextView)) == null) {
                        strLIZIZ = "";
                    }
                    searchVideoCommentVMCp2.wQ2(view, true, strLIZIZ);
                } else {
                    ((SearchVideoCommentAssem) awS90S0500000_6.l1).cp().wQ2(view, false, (String) ((C259800zU) awS90S0500000_6.l4).element);
                }
            }
            C666690QDb.LJIIZILJ = ((SearchVideoCommentAssem) awS90S0500000_6.l1).cp().getState().LL;
            Comment comment2 = ((SearchVideoCommentAssem) awS90S0500000_6.l1).cp().getState().LL;
            if (comment2 != null) {
                cid = comment2.getCid();
            } else {
                cid = null;
            }
            return C643400PLm.LIZ(c643400PLm, cid, false, null, null, 261119);
        }
        return c643400PLm;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS90S0500000_6 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS90S0500000_6.invoke$1(kotlin.jvm.internal.AwS90S0500000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS90S0500000_6 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS90S0500000_6.invoke$2(kotlin.jvm.internal.AwS90S0500000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS90S0500000_6 r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS90S0500000_6.invoke$3(kotlin.jvm.internal.AwS90S0500000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS90S0500000_6(C05P0 c05p0, C05P0<FrameLayout> c05p02, C05P0<InterfaceC1692950u9l> c05p03, C05P0<InterfaceC1692950u9l> c05p04, InterfaceC497601wk interfaceC497601wk, C1677480tko<Float, C1677280tkU> c1677480tko) {
        super(2);
        this.$t = c1677480tko;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = c05p03;
        this.l3 = c05p04;
        this.l4 = interfaceC497601wk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0500000_6(C19EG c19eg, BaseChatInputAssem baseChatInputAssem, SessionInfo sessionInfo, IAlbumUpdateGuideViewModel iAlbumUpdateGuideViewModel, C0I20 c0i20, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = baseChatInputAssem;
        this.l2 = sessionInfo;
        this.l3 = iAlbumUpdateGuideViewModel;
        this.l4 = c0i20;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0500000_6(Activity activity, AIGCPictureHandler aIGCPictureHandler, List list, Function0 function0, Function1 function1, int i) {
        super(2);
        this.$t = i;
        this.l0 = activity;
        this.l1 = aIGCPictureHandler;
        this.l2 = list;
        this.l3 = function1;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS90S0500000_6(View view, View view2, SearchVideoCommentAssem searchVideoCommentAssem, C259800zU<View> c259800zU, C259800zU<TuxTextView> c259800zU2, C259800zU<String> c259800zU3) {
        super(2);
        this.$t = c259800zU3;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = searchVideoCommentAssem;
        this.l3 = c259800zU;
        this.l4 = c259800zU2;
    }
}
