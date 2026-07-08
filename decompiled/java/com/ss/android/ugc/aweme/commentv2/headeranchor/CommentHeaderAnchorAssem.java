package com.ss.android.ugc.aweme.commentv2.headeranchor;

import X.C01GW;
import X.C0CNZ;
import X.C1350590lFZ;
import X.C1356320lOo;
import X.C1357700lR2;
import X.C13LE;
import X.C13LP;
import X.C14TF;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1ER1;
import X.C2189821An6;
import X.C2217381BqS;
import X.C276070Art;
import X.C277990Auz;
import X.C295780Bia;
import X.C295880Bik;
import X.C295960Bis;
import X.C452501pT;
import X.C679800QlW;
import X.C724240Sb0;
import X.C726120Se2;
import X.InterfaceC1350330lF9;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public class CommentHeaderAnchorAssem extends UISlotAssem implements ICommentPageVisibilityProtocol, ICommentPageReusedProtocol {
    public static final C1350590lFZ LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public InterfaceC1350330lF9 LLJJIJI;
    public InterfaceC1350330lF9 LLJJIJIIJIL;
    public Aweme LLJJJJ;
    public boolean LLJJJJJIL;
    public final C726120Se2 LLJJI = new C726120Se2();
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(227));
    public final Set<InterfaceC1350330lF9> LLJJIJIL = new LinkedHashSet();
    public List<InterfaceC1350330lF9> LLJJJ = new ArrayList();
    public List<InterfaceC1350330lF9> LLJJJIL = new ArrayList();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentHeaderAnchorAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = new C1350590lFZ();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a1p;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
        lp(true);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
        lp(false);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
        InterfaceC1350330lF9 interfaceC1350330lF9 = this.LLJJIJI;
        if (interfaceC1350330lF9 != null) {
            CommentContextSource commentContextSourceIp = ip();
            interfaceC1350330lF9.LJIIIZ(commentContextSourceIp != null ? CommentContextSourceKt.aweme(commentContextSourceIp) : null);
        }
    }

    public final CommentContextSource ip() {
        C726120Se2 c726120Se2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return c726120Se2.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
        InterfaceC1350330lF9 interfaceC1350330lF9 = this.LLJJIJI;
        if (interfaceC1350330lF9 != null) {
            interfaceC1350330lF9.LJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        if (!C295880Bik.LIZLLL || !C295780Bia.LIZIZ) {
            C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
            if (!C1356320lOo.LIZ(Co())) {
                super.Eo(context);
                return context;
            }
        }
        return LJJIJL().getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bT(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.headeranchor.CommentHeaderAnchorAssem.bT(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final Context kp(Integer num) {
        if (num != null) {
            C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
            if (C1356320lOo.LIZ(num.intValue())) {
                return LJJIJL().getContext();
            }
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            return fragmentLJI.requireContext();
        }
        return null;
    }

    public final void lp(boolean z) {
        String strH3;
        String str;
        Aweme aweme;
        Aweme aweme2;
        String str2;
        String str3;
        boolean z2;
        Integer numValueOf;
        CommentCommonModel commonModel;
        Aweme aweme3;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentCommonModel commonModel4;
        Aweme aweme4 = null;
        if (z) {
            C14TF c14tf = C14TF.LIZIZ;
            InterfaceC1350330lF9 interfaceC1350330lF9 = this.LLJJIJI;
            if (interfaceC1350330lF9 != null) {
                strH3 = interfaceC1350330lF9.H3();
            } else {
                strH3 = null;
            }
            CommentContextSource commentContextSourceIp = ip();
            if (commentContextSourceIp != null && (commonModel4 = commentContextSourceIp.getCommonModel()) != null) {
                str = commonModel4.eventType;
            } else {
                str = null;
            }
            CommentContextSource commentContextSourceIp2 = ip();
            if (commentContextSourceIp2 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSourceIp2);
            } else {
                aweme = null;
            }
            c14tf.LJLLI(aweme, strH3, str);
            C1ER1 c1er1 = C1ER1.LIZIZ;
            CommentContextSource commentContextSourceIp3 = ip();
            if (commentContextSourceIp3 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceIp3);
            } else {
                aweme2 = null;
            }
            CommentContextSource commentContextSourceIp4 = ip();
            if (commentContextSourceIp4 != null && (commonModel3 = commentContextSourceIp4.getCommonModel()) != null) {
                str2 = commonModel3.eventType;
            } else {
                str2 = null;
            }
            String strLIZ = C679800QlW.LIZ(str2);
            CommentContextSource commentContextSourceIp5 = ip();
            if (commentContextSourceIp5 != null && (commonModel2 = commentContextSourceIp5.getCommonModel()) != null) {
                str3 = commonModel2.tabName;
            } else {
                str3 = null;
            }
            CommentContextSource commentContextSourceIp6 = ip();
            if (commentContextSourceIp6 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceIp6)) != null && AwemeExtKt.isPhotoMode(aweme3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            CommentContextSource commentContextSourceIp7 = ip();
            if (commentContextSourceIp7 != null && (commonModel = commentContextSourceIp7.getCommonModel()) != null) {
                numValueOf = Integer.valueOf(commonModel.pageType);
            } else {
                numValueOf = null;
            }
            c1er1.LJJLL(aweme2, numValueOf, strLIZ, str3, z2);
        }
        InterfaceC1350330lF9 interfaceC1350330lF92 = this.LLJJIJI;
        if (interfaceC1350330lF92 != null) {
            if (z) {
                CommentContextSource commentContextSourceIp8 = ip();
                if (commentContextSourceIp8 != null) {
                    aweme4 = CommentContextSourceKt.aweme(commentContextSourceIp8);
                }
                interfaceC1350330lF92.LIZJ(ip(), aweme4);
                return;
            }
            interfaceC1350330lF92.LIZ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        CommentCommonModel commonModel;
        boolean zLJI = MethodIDManager.LJI(71999);
        super.onViewCreated(view);
        if (!C0CNZ.LIZIZ()) {
            Set<InterfaceC1350330lF9> set = this.LLJJIJIL;
            LLJJJJLIIL.getClass();
            set.addAll(C1350590lFZ.LIZ());
        }
        CommentContextSource commentContextSourceIp = ip();
        if (commentContextSourceIp == null || (commonModel = commentContextSourceIp.getCommonModel()) == null || !commonModel.isPreCreate()) {
            bT(null);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void hp(ViewGroup viewGroup, boolean z) {
        Aweme aweme;
        String strEventType;
        C2189821An6 c2189821An6;
        CommentCommonModel commonModel;
        View viewLJIIL;
        ArrayList arrayList = new ArrayList();
        if (z) {
            if (((ArrayList) this.LLJJJIL).isEmpty()) {
                Set<InterfaceC1350330lF9> set = this.LLJJIJIL;
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC1350330lF9 interfaceC1350330lF9 : set) {
                    InterfaceC1350330lF9 interfaceC1350330lF92 = interfaceC1350330lF9;
                    if (((List) this.LLJJIII.getValue()).contains(Integer.valueOf(interfaceC1350330lF92.zg())) && interfaceC1350330lF92.zg() > 11) {
                        arrayList2.add(interfaceC1350330lF9);
                    }
                }
                this.LLJJJIL = new ArrayList(C13LP.LJLLLL(new Comparator() { // from class: X.0lFB
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((InterfaceC1350330lF9) obj).zg() - ((InterfaceC1350330lF9) obj2).zg();
                    }
                }, arrayList2));
            }
            arrayList.addAll(this.LLJJJIL);
        } else {
            if (((ArrayList) this.LLJJJ).isEmpty()) {
                Set<InterfaceC1350330lF9> set2 = this.LLJJIJIL;
                ArrayList arrayList3 = new ArrayList();
                for (InterfaceC1350330lF9 interfaceC1350330lF93 : set2) {
                    if (((List) this.LLJJIII.getValue()).contains(Integer.valueOf(interfaceC1350330lF93.zg()))) {
                        arrayList3.add(interfaceC1350330lF93);
                    }
                }
                this.LLJJJ = new ArrayList(C13LP.LJLLLL(new Comparator() { // from class: X.0lFC
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((InterfaceC1350330lF9) obj).zg() - ((InterfaceC1350330lF9) obj2).zg();
                    }
                }, arrayList3));
            }
            arrayList.addAll(this.LLJJJ);
        }
        CommentContextSource commentContextSourceIp = ip();
        if (commentContextSourceIp != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceIp);
        } else {
            aweme = null;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1350330lF9 interfaceC1350330lF94 = (InterfaceC1350330lF9) it2.next();
            if (((Number) C276070Art.LIZ.getValue()).intValue() == 1) {
                CommentContextSource commentContextSourceIp2 = ip();
                if (commentContextSourceIp2 != null) {
                    strEventType = CommentContextSourceKt.eventType(commentContextSourceIp2);
                } else {
                    strEventType = null;
                }
                CommentContextSource commentContextSourceIp3 = ip();
                if (commentContextSourceIp3 != null && (commonModel = commentContextSourceIp3.getCommonModel()) != null) {
                    c2189821An6 = commonModel.feedParam;
                } else {
                    c2189821An6 = null;
                }
                if (interfaceC1350330lF94.LIZLLL(aweme, c2189821An6, strEventType)) {
                    if (!mp(interfaceC1350330lF94, aweme)) {
                        break;
                    }
                    View viewLJIIL2 = interfaceC1350330lF94.LJIIL(kp(interfaceC1350330lF94.LJIIIIZZ(aweme)), aweme, ip());
                    if (viewLJIIL2 != null) {
                        viewGroup.addView(viewLJIIL2);
                        break;
                    }
                } else {
                    continue;
                }
            } else if (interfaceC1350330lF94.LJI(ip(), aweme) && (viewLJIIL = interfaceC1350330lF94.LJIIL(kp(interfaceC1350330lF94.LJIIIIZZ(aweme)), aweme, ip())) != null) {
                if (mp(interfaceC1350330lF94, aweme)) {
                    viewGroup.addView(viewLJIIL);
                }
            }
        }
        if (((Number) C277990Auz.LIZ.getValue()).intValue() == 1 && C295960Bis.LIZ()) {
            mp(null, aweme);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[PHI: r1
      0x009c: PHI (r1v1 com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent) = 
      (r1v0 com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent)
      (r1v3 com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent)
     binds: [B:33:0x006f, B:39:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mp(X.InterfaceC1350330lF9 r15, com.ss.android.ugc.aweme.feed.model.Aweme r16) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.headeranchor.CommentHeaderAnchorAssem.mp(X.0lF9, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
