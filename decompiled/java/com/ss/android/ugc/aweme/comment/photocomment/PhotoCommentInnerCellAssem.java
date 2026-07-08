package com.ss.android.ugc.aweme.comment.photocomment;

import X.C09R3;
import X.C0HW6;
import X.C0QSJ;
import X.C1163440gNi;
import X.C1340340kz2;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1875607Wg;
import X.C2217381BqS;
import X.C673150Qan;
import X.C687700QyG;
import X.C724270Sb3;
import X.C726120Se2;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoCommentInnerCellAssem extends ReusedUISlotAssem<PhotoCommentInnerCellAssem> implements InterfaceC712990Rxx<C1875607Wg>, PhotoDetailAnimProtocol, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1340340kz2 LLJJLIIIJLLLLLLLZ;
    public final C726120Se2 LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoCommentInnerCellAssem.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/photocomment/PhotoDetailContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoCommentInnerCellAssem.class, "outContextSource", "getOutContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.a2v;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentInnerCellScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentInnerCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentInnerCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public PhotoCommentInnerCellAssem() {
        mp(C1163440gNi.LIZJ);
        this.LLJJLIIIJLLLLLLLZ = new C1340340kz2();
        this.LLJL = new C726120Se2();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), PhotoCommentInnerCellAssem.class, this);
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol
    public final void CM0(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(str, ((C1875607Wg) obj).LL.getCid())) {
            return;
        }
        View view = this.LLJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJLL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        if (!ComplianceServiceProvider.LJFF().LJFF()) {
            View view4 = this.LLJLLIL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
            View view5 = this.LLJLLIL;
            if (view5 != null) {
                C786410Ut5.T4(view5, 1.0f);
            }
        }
        View view6 = this.LLJLIL;
        if (view6 != null) {
            C786410Ut5.T4(view6, 1.0f);
        }
        View view7 = this.LLJLILLLLZIIL;
        if (view7 != null) {
            C786410Ut5.T4(view7, 1.0f);
        }
        View view8 = this.LLJLL;
        if (view8 != null) {
            C786410Ut5.T4(view8, 1.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol
    public final void bq0(String str) {
        Object obj;
        Context context;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((C1875607Wg) obj).LL.getCid()) && (context = getContext()) != null) {
            View view = this.LLJLIL;
            if (view != null) {
                C0HW6.LIZ.getClass();
                C0HW6.LIZ(context, view).LJI(true);
            }
            View view2 = this.LLJLILLLLZIIL;
            if (view2 != null) {
                C0HW6.LIZ.getClass();
                C0HW6.LIZ(context, view2).LJI(true);
            }
            View view3 = this.LLJLL;
            if (view3 != null) {
                C0HW6.LIZ.getClass();
                C0HW6.LIZ(context, view3).LJI(true);
            }
            View view4 = this.LLJLLIL;
            if (view4 != null) {
                C0HW6.LIZ.getClass();
                C0HW6.LIZ(context, view4).LJI(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.photocomment.PhotoCommentInnerCellAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1875607Wg c1875607Wg) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol
    public final void yJ(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(str, ((C1875607Wg) obj).LL.getCid())) {
            return;
        }
        View view = this.LLJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJLL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View view4 = this.LLJLLIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C1875607Wg c1875607Wg) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1875607Wg c1875607Wg) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
