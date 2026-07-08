package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C0OPX;
import X.C0OS2;
import X.C0OS8;
import X.C0OV5;
import X.C0OVB;
import X.C13LP;
import X.C1558420qem;
import X.C1558520qew;
import X.C214824195i;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C293310Beb;
import X.C619600ORy;
import X.C619660OSe;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC619700OSi;
import X.InterfaceC619720OSk;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinImageInfo;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPhotoCell extends BulletinBaseCell<BulletinPhotoItem> {
    public InterfaceC619720OSk LLJLLL;
    public InterfaceC619700OSi LLJZ;
    public boolean LLJZIJLIL;

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void z6() {
        super.z6();
        AssemViewModel.asyncSubscribe$default(X5(), new C2217371BqR() { // from class: X.0OSn
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OYC) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0OYC) obj).LL = (AbstractC1623806Xk) obj2;
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS588S0100000_9(this, 193), 24, null);
    }

    public final InterfaceC619720OSk b7() {
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.d0c);
        return C0OS8.LJ() ? new C0OVB(viewStub) : new C0OV5(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void C6() {
        super.C6();
        if (this.LLJLLL == null) {
            this.LLJLLL = b7();
            w6();
        }
        if (this.LLJZIJLIL) {
            return;
        }
        this.LLJZIJLIL = true;
        InterfaceC619700OSi interfaceC619700OSiA7 = a7();
        this.LLJZ = interfaceC619700OSiA7;
        if (interfaceC619700OSiA7 != null) {
            T6(this.itemView.findViewById(R.id.d09));
        }
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, BulletinCommentAbility.class, null, null);
    }

    public final InterfaceC619700OSi a7() {
        if (C0OS8.LIZIZ() && C293310Beb.LIZLLL()) {
            return null;
        }
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.d09);
        return C0OS8.LIZIZ() ? new C0OS2(viewStub, this, a6(), f6(), To(), new AwS553S0100000_9(this, 718)) : new C619600ORy(viewStub, this, f6(), a6(), C1558420qem.LIZIZ(this));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        ObjectAnimator objectAnimatorRp;
        super.onViewAttachedToWindow();
        InterfaceC619720OSk interfaceC619720OSk = this.LLJLLL;
        if (interfaceC619720OSk == null || (objectAnimatorRp = interfaceC619720OSk.Rp()) == null) {
            return;
        }
        C786410Ut5.Pd(objectAnimatorRp);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        ObjectAnimator objectAnimatorRp;
        super.onViewDetachedFromWindow();
        InterfaceC619720OSk interfaceC619720OSk = this.LLJLLL;
        if (interfaceC619720OSk == null || (objectAnimatorRp = interfaceC619720OSk.Rp()) == null) {
            return;
        }
        objectAnimatorRp.cancel();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void v6() {
        super.v6();
        if (this.LLJLLL == null) {
            this.LLJLLL = b7();
            w6();
        }
        if (this.LLJZIJLIL) {
            return;
        }
        this.LLJZIJLIL = true;
        InterfaceC619700OSi interfaceC619700OSiA7 = a7();
        this.LLJZ = interfaceC619700OSiA7;
        if (interfaceC619700OSiA7 != null) {
            T6(this.itemView.findViewById(R.id.d09));
        }
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, BulletinCommentAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    /* JADX INFO: renamed from: K6 */
    public final void onBindItemView(BulletinBaseItem bulletinBaseItem) {
        BulletinPhotoItem bulletinPhotoItem = (BulletinPhotoItem) bulletinBaseItem;
        super.onBindItemView(bulletinPhotoItem);
        InterfaceC619720OSk interfaceC619720OSk = this.LLJLLL;
        if (interfaceC619720OSk != null) {
            interfaceC619720OSk.LJIIIZ(bulletinPhotoItem);
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZLLL(bulletinPhotoItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final boolean U6(View view) {
        String strLJIIZILJ;
        Boolean boolValueOf;
        UrlModel urlModel;
        List<BulletinImage> list;
        BulletinImage bulletinImage;
        String string;
        Long l;
        String str;
        BulletinImageInfo bulletinImageInfo;
        if (super.U6(view)) {
            return true;
        }
        BulletinPhotoItem bulletinPhotoItem = (BulletinPhotoItem) getItem();
        User user = null;
        if (bulletinPhotoItem != null) {
            int i = BulletinPhotoItem.LLJLILLLLZIIL;
            if (bulletinPhotoItem.LLIIJI(null)) {
                return true;
            }
        }
        if (((BulletinPhotoItem) getItem()) != null) {
            strLJIIZILJ = C214824195i.LIZIZ.LJIIZILJ(r0.LLILZLL);
        } else {
            strLJIIZILJ = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "aweme://inbox/bulletin_board/photo/detail");
        smartRouteBuildRoute.withParam("is_creator", To());
        BulletinPhotoItem bulletinPhotoItem2 = (BulletinPhotoItem) getItem();
        if (bulletinPhotoItem2 != null) {
            boolValueOf = Boolean.valueOf(bulletinPhotoItem2.LLJ);
        } else {
            boolValueOf = null;
        }
        smartRouteBuildRoute.withParam("is_local", boolValueOf);
        smartRouteBuildRoute.withParam("view_count", strLJIIZILJ);
        BulletinPhotoItem bulletinPhotoItem3 = (BulletinPhotoItem) getItem();
        if (bulletinPhotoItem3 != null && bulletinPhotoItem3.LLJ) {
            BulletinPhotoItem bulletinPhotoItem4 = (BulletinPhotoItem) getItem();
            if (bulletinPhotoItem4 != null && (bulletinImageInfo = bulletinPhotoItem4.LLJI) != null) {
                str = bulletinImageInfo.path;
            } else {
                str = null;
            }
            smartRouteBuildRoute.withParam("image_path", str);
        } else {
            BulletinPhotoItem bulletinPhotoItem5 = (BulletinPhotoItem) getItem();
            if (bulletinPhotoItem5 != null && (list = bulletinPhotoItem5.LLJILJIL) != null && (bulletinImage = (BulletinImage) C13LP.LJJJLL(list)) != null) {
                urlModel = bulletinImage.originUrl;
            } else {
                urlModel = null;
            }
            smartRouteBuildRoute.withParam("image_url", urlModel);
        }
        smartRouteBuildRoute.open();
        BulletinListViewModel bulletinListViewModelF6 = f6();
        BulletinPhotoItem bulletinPhotoItem6 = (BulletinPhotoItem) getItem();
        if (bulletinPhotoItem6 != null && (l = bulletinPhotoItem6.LLJILJILJ) != null) {
            string = l.toString();
        } else {
            string = null;
        }
        BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) getItem();
        BulletinPhotoItem bulletinPhotoItem7 = (BulletinPhotoItem) getItem();
        if (bulletinPhotoItem7 != null) {
            user = bulletinPhotoItem7.LLJJJIL;
        }
        BulletinListViewModel.OQ2(bulletinListViewModelF6, string, "photo", bulletinBaseItem, user, null, null, null, null, 240);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        BulletinPhotoItem bulletinPhotoItem = (BulletinPhotoItem) interfaceC1891350zJl;
        super.onBindItemView(bulletinPhotoItem);
        InterfaceC619720OSk interfaceC619720OSk = this.LLJLLL;
        if (interfaceC619720OSk != null) {
            interfaceC619720OSk.LJIIIZ(bulletinPhotoItem);
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZLLL(bulletinPhotoItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(X.C0OVA r5, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem r6 = (com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem) r6
            X.19b5 r3 = r4.r6()
            if (r3 == 0) goto L5c
            X.0OV6 r0 = r5.LIZ
            if (r0 == 0) goto Lf
            r3.setRoundingParams(r0)
        Lf:
            com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview r0 = r6.LLJLIL
            if (r0 == 0) goto L80
            java.util.List<X.0ORz> r0 = r0.comments
            if (r0 == 0) goto L80
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 != r2) goto L80
        L20:
            com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview r0 = r6.LLJLIL
            if (r0 == 0) goto L2e
            java.lang.Boolean r1 = r0.enableComment
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L76
        L2e:
            if (r2 != 0) goto L76
            r0 = 0
            r3.setBackground(r0)
        L34:
            X.0OSk r1 = r4.LLJLLL
            if (r1 == 0) goto L3d
            X.0OV6 r0 = r5.LIZ
            r1.LIZ(r0)
        L3d:
            android.view.ViewGroup$MarginLayoutParams r2 = X.C1383370m6R.LJI(r3)
            boolean r1 = r4.To()
            r0 = 4
            if (r1 == 0) goto L64
            if (r2 == 0) goto L59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r2.setMarginEnd(r0)
        L59:
            X.C786410Ut5.j7(r3, r2)
        L5c:
            X.0OSi r0 = r4.LLJZ
            if (r0 == 0) goto L63
            r0.LJI(r6)
        L63:
            return
        L64:
            if (r2 == 0) goto L59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r2.setMarginStart(r0)
            goto L59
        L76:
            X.0OT1 r0 = r5.LIZJ
            if (r0 == 0) goto L34
            int r0 = r0.LIZ
            r3.setBackgroundColor(r0)
            goto L34
        L80:
            r2 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinPhotoCell.N5(X.0OVA, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem):void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: h7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(BulletinPhotoItem bulletinPhotoItem, List<? extends Object> list) {
        InterfaceC619720OSk interfaceC619720OSk;
        InterfaceC619720OSk interfaceC619720OSk2;
        super.onBindItemView(bulletinPhotoItem, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C619660OSe)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("payloads bind diff:");
        sbLIZ.append(objLJJJLZIJ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C619660OSe c619660OSe = (C619660OSe) objLJJJLZIJ;
        if ((c619660OSe.LIZ || c619660OSe.LIZLLL) && (interfaceC619720OSk = this.LLJLLL) != null) {
            interfaceC619720OSk.LIZJ(bulletinPhotoItem);
        }
        if (c619660OSe.LIZ && (interfaceC619720OSk2 = this.LLJLLL) != null) {
            interfaceC619720OSk2.LJIILIIL(bulletinPhotoItem);
        }
        if (c619660OSe.LJIIIZ) {
            InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
            if (interfaceC619700OSi != null) {
                interfaceC619700OSi.LIZLLL(bulletinPhotoItem);
            }
            InterfaceC619720OSk interfaceC619720OSk3 = this.LLJLLL;
            if (interfaceC619720OSk3 != null) {
                interfaceC619720OSk3.LJIILIIL(bulletinPhotoItem);
            }
            V6(bulletinPhotoItem);
        }
    }
}
